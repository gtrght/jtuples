__author__ = 'vvlasov'

import generate_products as gp

package = "package com.othelle.jtuples;"

if __name__ == '__main__':
    template = open('ZipUtils1.java', 'rb').read()
    for arity in xrange(2, gp.max_products): #gp.max_products + 1):
        code = template
        # writer = open('../java/org/jtuples/IValue{0}.java'.format(arity), "wb")

        result = code.replace('[N]', '{0}').replace('[N-1]', '{1}').replace('[TN]', '{2}').replace('[TN-1]', '{3}') \
            .replace('[T2:N]', '{4}').replace('[kv2:N]', '{5}').replace('[CTN]', '{6}')\
            .replace('[CSN]', '{7}') \
            .replace('[CIN]', '{8}') \
            .replace('[NTN]', '{9}') \
            .replace('[ATN]', '{10}') \
            .replace('[ALN]', '{11}') \
            .replace('[NAI]', '{12}') \
            .format(arity, arity - 1, gp.generate_types(arity), gp.generate_types(arity - 1), gp.generate_types(arity, 2),
                    gp.generate_join(arity, "keyValue._{0}()", ", ", 2),
                    gp.generate_join(arity, "Collection<T{0}> col{0}", ", "),
                    gp.generate_join(arity, "col{0}.size()", ", "),
                    gp.generate_join(arity, "Iterator<T{0}> it{0} = col{0}.iterator();", "\n        "),
                    gp.generate_join(arity, "next(it{0})", ", "),
                    gp.generate_join(arity, "T{0}[] arr{0}", ", "),
                    gp.generate_join(arity, "arr{0}.length", ", "),
                    gp.generate_join(arity, "next(arr{0}, i)", ", "),
                    ) \
            .replace('[[', '{').replace(']]', '}')

        print result
        # writer.write(result)
        # writer.close()



