package Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 请求投票RPC返回值.
 */
@Getter
@Setter
public class VoteResponse implements Serializable {

    long term;

    boolean voteGranted;

    public VoteResponse() {
    }

    public VoteResponse(long term) {
        this.term = term;
    }

    public VoteResponse(boolean voteGranted) {
        this.voteGranted = voteGranted;
    }

    public VoteResponse(long term, boolean voteGranted) {
        this.term = term;
        this.voteGranted = voteGranted;
    }

    public static VoteResponse fail() {
        return new VoteResponse(false);
    }

    public static VoteResponse ok() {
        return new VoteResponse(true);
    }

    public boolean isVoteGranted() {
        return voteGranted;
    }

}
