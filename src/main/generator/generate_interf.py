__author__ = 'vvlasov'

import generate_products as gp

package = "package com.othelle.jtuples;"

if __name__ == '__main__':
    template = open('IValueN.java', 'rb').read()
    for arity in xrange(2, gp.max_products + 1):
        code = template
        writer = open('../java/org/jtuples/Tuple{0}.java'.format(arity), "wb")

        result = code.replace('[N]', '{0}').replace('[N-1]', '{1}').replace('[TN]', '{2}').replace('[TN-1]', '{3}'). \
            format(arity, arity - 1, gp.generate_types(arity), gp.generate_types(arity - 1)).replace('[', '{').replace(']', '}')
        writer.write(result)
        writer.close()



