"""Minecraft Model JSON Generator for Items.
Usage: python makejson.py <itemName>

Examples:
python makeitemjson.py bun
python makeitemjson.py ketchup
python makeitemjson.py burger
"""

import sys
import re
import os

MOD_ID = 'actua_mods'
DIR_OUTPUT_ITEMS = 'output/models/item/'

def createDirIfNeeded(name):
    """Create directory if it does not exist."""
    if not os.path.exists(name):
        os.makedirs(name)

def createAllDirs():
    """Create all directories we may need."""
    createDirIfNeeded(DIR_OUTPUT_ITEMS)

def writeItemJSON(name, item_type='generated'):
    """Creates the JSON file needed for an item."""
    print('Writing item %s' % (name))

    f = open(DIR_OUTPUT_ITEMS + name + '_item.json', 'w')
    f.write('{\n')
    f.write('  "parent": "item/%s",\n' % item_type)
    f.write('  "textures": {\n')
    f.write('    "layer0": "%s:items/%s_item"\n' % (MOD_ID, name))
    f.write('  }\n')
    f.write('}\n')
    f.write('\n')
    f.close()

# Name for the file(s) being created
name = ''
# The "parent" for items. Typically you want "generated".
type = 'generated'

# read command line arguments
for arg in sys.argv:
    # lowercase argument for matching purposes
    argl = str.lower(arg)
    if arg != 'makeitemjson.py':
        name = arg

if name == '': # name must be provided in command line!
    print('No item name specified!')
    exit(1)

# create the output directories...
createAllDirs()

writeItemJSON(name, type)


