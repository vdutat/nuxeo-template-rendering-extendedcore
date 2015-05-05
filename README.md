# nuxeo-template-rendering-extendedcore
===

## About this module

This module provides a a new `template rendering` function extension called `extendedcore`. It provide function `extendedcore.getParents()` which returns the list of `Folderish` parent documents starting with the direct parent document.

## Why this module

The `core` extension only supplies a function to retrieve the direct parent of a document. With `extendedcore` you are able to retrieve parent documents up to the root document:
- `${extendedcore.parents[0]}` returns the direct parent document
- `${extendedcore.parents[1]}` returns the grandparent document
- ...

e.g. `${extendedcore.parents[1].dublincore.title}` returns the title of the grandparent document.

## Building 

        mvn clean install

## Using

All you have to do is:

 - to copy the bundle in `nxserver/plugins` or `nxserver/bundles`
 - restart the server

After restart, the `extendedcore` extension will be available in templates.
