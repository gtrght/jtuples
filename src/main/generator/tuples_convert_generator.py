__author__ = 'U0139096'

import generate_products as gp

pattern = "        case [N]: \
\n            return new Product[N]([ARR]); \
"

for arity in xrange(1, gp.max_products + 1):
    code = pattern
    result = code.replace('[N]', '{0}').replace('[ARR]', '{1}'). \
        format(arity, gp.generate_join(arity - 1, "array[{0}]", ", ", start=0))
    print result