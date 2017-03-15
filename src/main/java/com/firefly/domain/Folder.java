package com.firefly.domain;

public class Folder {
    private String folderId;

    private String folderName;

    private String folderParent;

    private String folderCreatetime;

    private String folderActive;

    private String folderAuthor;

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

    public String getFolderParent() {
        return folderParent;
    }

    public void setFolderParent(String folderParent) {
        this.folderParent = folderParent == null ? null : folderParent.trim();
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

    public String getFolderAuthor() {
        return folderAuthor;
    }

    public void setFolderAuthor(String folderAuthor) {
        this.folderAuthor = folderAuthor == null ? null : folderAuthor.trim();
    }

	@Override
	public String toString() {
		return "Folder [folderId=" + folderId + ", folderName=" + folderName + ", folderParent=" + folderParent
				+ ", folderCreatetime=" + folderCreatetime + ", folderActive=" + folderActive + ", folderAuthor="
				+ folderAuthor + "]";
	}
    
    
}