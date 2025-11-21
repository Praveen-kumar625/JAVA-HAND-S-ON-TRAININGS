// TASK CREATE A YOUTUBE

// KYA KARNA HAI
// 1. Create a class YoutubeChannel
// 2. Create the following private properties
//    a. String name
//    b. int subscribersCount
//    c. int publishedVideosCount
// 3. Create the following public methods
//    a. Constructor to initialize the name of the channel
//    b. getName() - returns the name of the channel
//    c. getSubscribersCount() - returns the subscribers count
//    d. getPublishedVideosCount() - returns the published videos count
//    e. publishVideo() - increments the publishedVideosCount by 1
//    f. subscribe() - increments the subscribersCount by 1
//    g. unsubscribe() - decrements the subscribersCount by 1 (ensure it doesn't go below 0)


// KYA NAHI KARNA
// 1. Directly access or modify the private properties from outside the class  


class YoutubeChannel {
    private String name;
    private int subscribersCount;
    private int publishedVideosCount;

    public YoutubeChannel(String name) {
        this.name = name;
        this.subscribersCount = 0;
        this.publishedVideosCount = 0;
        System.out.println("Channel created: " + name);
    }

    public String getName() {
        return name;
        System.out.println("Channel name: " + name);
        return name;
    }

    public int getSubscribersCount() {
        return subscribersCount;
        System.out.println("Subscribers count: " + subscribersCount);
        return subscribersCount;
    }

    public int getPublishedVideosCount() {
        return publishedVideosCount;
        System.out.println("Published videos count: " + publishedVideosCount);
        return publishedVideosCount;
    }

    public void publishVideo() {
        publishedVideosCount++;
        System.out.println("Published videos count: " + publishedVideosCount);
    }

    public void subscribe() {
        subscribersCount++;
        System.out.println("Subscribers count: " + subscribersCount);

    }

    public void unsubscribe() {
        if (subscribersCount > 0) {
            subscribersCount--;
            System.out.println("Subscribers count: " + subscribersCount);

        }
    }
}


// GALTI SE BHI GALTI NAHI KARNI
// 1. Directly access or modify the private properties from outside the class


// CODE MAIN ERROR KYA KYA HOGA

