__author__ = 'vvlasov'

import generate_products as gp

package = "package org.jtuples;"

if __name__ == '__main__':
    template = open('TupleN.java', 'rb').read()
    for arity in xrange(1, gp.max_products + 1):
        code = template
        writer = open('../java/org/jtuples/Tuple{0}.java'.format(arity), "wb")

        result = code.replace('[N]', '{0}').replace('[TVN]', '{1}').replace('[TN]', '{2}').replace('[VN]', '{3}'). \
            format(arity, gp.generate_join(arity, "T{0} v{0}", ", "),
                   gp.generate_types(arity), gp.generate_join(arity, "v{0}", ", ")).replace('[', '{').replace(']', '}')
        writer.write(result)
        writer.close()



