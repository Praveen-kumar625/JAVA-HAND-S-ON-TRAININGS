// INSTAGRAM 

// KYA KYA BANANA HAI
// 1. Create a class InstagramProfile
// 2. Create the following private properties
//    a. String username
//    b. int followersCount
//    c. int followingCount
// 3. Create the following public methods
//    a. Constructor to initialize the username of the profile
//    b. getUsername() - returns the username of the profile
//    c. getFollowersCount() - returns the followers count
//    d. getFollowingCount() - returns the following count
//    e. follow() - increments the followingCount by 1
//    f. addFollower() - increments the followersCount by 1


// KYA NAHI KARNA
// 1. Directly access or modify the private properties from outside the class


class InstagramProfile {
    private String username;
    private int followersCount;
    private int followingCount;

    public InstagramProfile(String username) {
        this.username = username;
        this.followersCount = 0;
        this.followingCount = 0;
        System.out.println("Profile created: " + username);
    }

    public String getUsername() {
        return username;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void follow() {
        followingCount++;
        System.out.println("Following count: " + followingCount);
    }

    public void addFollower() {
        followersCount++;
        System.out.println("Followers count: " + followersCount);
    }
}

// KYA MISS KYA HO SAKTA HAI
// 1. Ensure that the followersCount and followingCount cannot be negative
// 2. Add a method unfollow() - decrements the followingCount by 1 (ensure it doesn't go below 0)
// 3. Add a method removeFollower() - decrements the followersCount by 1 (ensure it doesn't go below 0)
