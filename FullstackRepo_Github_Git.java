package FullStackRepo;

public class FullstackRepo_Github_Git {
    
    private String repoName;
    private String repoUrl;
    private String branch;

    // Constructor
    public FullstackRepo_Github_Git(String repoName, String repoUrl, String branch) {
        this.repoName = repoName;
        this.repoUrl = repoUrl;
        this.branch = branch;
    }

    // Getters and Setters
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Method to clone the repository (example method)
    public void cloneRepo() {
        System.out.println("Cloning the repository from " + repoUrl);
        // Here you would include logic to actually clone a repo using Git commands or an API
    }

    // Method to create a branch (example method)
    public void createBranch(String newBranch) {
        System.out.println("Creating new branch: " + newBranch);
        // Logic to create a new branch
    }

    // Method to commit changes (example method)
    public void commitChanges(String message) {
        System.out.println("Committing changes with message: " + message);
        // Logic to commit changes
    }

    // Method to push changes to GitHub (example method)
    public void pushChanges() {
        System.out.println("Pushing changes to the repository at " + repoUrl);
        // Logic to push changes to the remote repository
    }

    public static void main(String[] args) {
        // Example usage
        FullstackRepo_Github_Git repo = new FullstackRepo_Github_Git("MyRepo", "https://github.com/username/MyRepo.git", "main");
        repo.cloneRepo();
        repo.createBranch("feature-branch");
        repo.commitChanges("Initial commit");
        repo.pushChanges();
    }
}
