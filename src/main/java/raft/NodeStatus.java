package raft;

public interface NodeStatus {
    int FOLLOWER = 0;

    int CANDIDATE = 1;

    int LEADER = 2;

    int status = FOLLOWER;

}
