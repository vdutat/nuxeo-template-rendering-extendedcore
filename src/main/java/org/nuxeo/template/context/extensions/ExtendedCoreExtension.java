package org.nuxeo.template.context.extensions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.template.api.context.DocumentWrapper;

public class ExtendedCoreExtension {

    protected final DocumentModel doc;

    protected final DocumentWrapper nuxeoWrapper;

    public ExtendedCoreExtension(DocumentModel doc, DocumentWrapper nuxeoWrapper) {
        this.doc = doc;
        this.nuxeoWrapper = nuxeoWrapper;
    }

    public List<Object> getParents() throws Exception {
    	List<DocumentModel> parentDocuments = doc.getCoreSession().getParentDocuments(doc.getParentRef());
        List<Object> docs = new ArrayList<Object>();
        Collections.reverse(parentDocuments);
        for (DocumentModel parent : parentDocuments) {
            docs.add(nuxeoWrapper.wrap(parent));
        }
        return docs;
    }
}
