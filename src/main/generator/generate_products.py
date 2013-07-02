__author__ = 'vvlasov'

max_products = 16

package = "package org.jtuples;"
class_begin = "public class Product{0}<{1}> extends Product"
o_bracket = "{"
c_bracket = "}"
iob_exception_block = "\n            default:\n                throw new IndexOutOfBoundsException(\"Index is out of range: \" + index);"
case_block = "\n            case {0}:\n                return v{1};"
method_block = "\n    public T{0} _{0}() [\n        return v{0};\n    ]"


def generate_join(number, join_pattern, join_symbol):
    return join_symbol.join(map(lambda x: join_pattern.format(x), range(1, number + 1)))


def generate_types(number):
    return generate_join(number, "T{0}", ", ")


def generate_fields(number):
    return generate_join(number, "    private T{0} v{0};", "\n")


def generate_constructor(number):
    return "    public Product{0}({1}){2}".format(number, generate_join(number, "T{0} v{0}", ", "),
                                                        "{\n" + generate_join(number, "        this.v{0} = v{0};", "\n") +
                                                        "\n        " + "this.arity = {0};".format(number)) + "\n    }"


def generate_get_element(number):
    def generate_cases(number):
        return "".join(map(lambda x: case_block.format(x - 1, x), range(1, number + 1)))

    return "    public Object getElement(int index){" \
           "\n        switch(index){" + generate_cases(number) + iob_exception_block + "\n        }\n    }"


def generate_methods(number):
    return "\n".join(map(lambda x: method_block.format(x).replace("[", "{").replace("]", "}"), range(1, number + 1)))


if __name__ == '__main__':
    license_header = open('license_header.txt', 'rb').read()
    for arity in xrange(1, max_products + 1):
        writer = open('../java/org/jtuples/Product{0}.java'.format(arity), "wb")

        writer.write(package)
        writer.write("\n\n")
        writer.write(license_header)

        writer.write(class_begin.format(arity, generate_types(arity)) + o_bracket)
        writer.write("\n")
        writer.write(generate_fields(arity))

        writer.write("\n\n")
        writer.write(generate_constructor(arity))

        writer.write("\n\n")
        writer.write(generate_get_element(arity))

        writer.write(generate_methods(arity))

        writer.write(c_bracket)
        writer.close()


