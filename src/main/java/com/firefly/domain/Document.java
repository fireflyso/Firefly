package com.firefly.domain;

public class Document {
    private String docId;

    private String docName;

    private String docPath;

    private Folder docParent;

    private String docCreatetime;

    private String docActive;

    private User docAuthor;

    private String docType;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId == null ? null : docId.trim();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath == null ? null : docPath.trim();
    }

    public String getDocCreatetime() {
        return docCreatetime;
    }

    public void setDocCreatetime(String docCreateTime) {
        this.docCreatetime = docCreatetime == null ? null : docCreatetime.trim();
    }

    public String getDocActive() {
        return docActive;
    }

    public void setDocActive(String docActive) {
        this.docActive = docActive == null ? null : docActive.trim();
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }

	public Folder getDocParent() {
		return docParent;
	}

	public void setDocParent(Folder docParent) {
		this.docParent = docParent;
	}

	public User getDocAuthor() {
		return docAuthor;
	}

	public void setDocAuthor(User docAuthor) {
		this.docAuthor = docAuthor;
	}

	@Override
	public String toString() {
		return "Document [docId=" + docId + ", docName=" + docName + ", docPath=" + docPath + ", docParent=" + docParent
				+ ", docCreatetime=" + docCreatetime + ", docActive=" + docActive + ", docAuthor=" + docAuthor
				+ ", docType=" + docType + "]";
	}
	
}