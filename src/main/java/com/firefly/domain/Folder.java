package com.firefly.domain;

public class Folder {
    private String folderId;

    private String folderName;

    private Folder folderParent;

    private String folderCreatetime;

    private String folderActive;

    private User folderAuthor;
    
    private String folderIsRoot;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId == null ? null : folderId.trim();
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    public Folder getFolderParent() {
		return folderParent;
	}

	public void setFolderParent(Folder folderParent) {
		this.folderParent = folderParent;
	}

	public String getFolderCreatetime() {
        return folderCreatetime;
    }

    public void setFolderCreatetime(String folderCreatetime) {
        this.folderCreatetime = folderCreatetime == null ? null : folderCreatetime.trim();
    }

    public String getFolderActive() {
        return folderActive;
    }

    public void setFolderActive(String folderActive) {
        this.folderActive = folderActive == null ? null : folderActive.trim();
    }

   
	public User getFolderAuthor() {
		return folderAuthor;
	}

	public void setFolderAuthor(User folderAuthor) {
		this.folderAuthor = folderAuthor;
	}

	@Override
	public String toString() {
		return "Folder [folderId=" + folderId + ", folderName=" + folderName + ", folderParent=" + folderParent
				+ ", folderCreatetime=" + folderCreatetime + ", folderActive=" + folderActive + ", folderAuthor="
				+ folderAuthor + "]";
	}

	public String getFolderIsRoot() {
		return folderIsRoot;
	}

	public void setFolderIsRoot(String folderIsRoot) {
		this.folderIsRoot = folderIsRoot;
	}
    
    
}