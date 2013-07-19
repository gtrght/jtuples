__author__ = 'vvlasov'

import generate_products as gp

package = "package com.othelle.jtuples;"

if __name__ == '__main__':
    template = open('generate_stuff.txt', 'rb').read()
    for arity in range(1, gp.max_products + 1):
        print template.format(arity, arity - 1).replace('[[', '{').replace(']]', '}')


