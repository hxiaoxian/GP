package Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求投票 RPC 参数.
 */

@Getter
@Setter
public class VoteParam extends Param {

    String candidateId;

    long lastLogIndex;

    long lastLogTerm;

    public VoteParam() {
    }

    public VoteParam(String candidateId, long lastLogIndex, long lastLogTerm) {
        this.candidateId = candidateId;
        this.lastLogIndex = lastLogIndex;
        this.lastLogTerm = lastLogTerm;
    }

    @Override
    public String toString() {
        return "VoteParam{" +
                "candidateId='" + candidateId + '\'' +
                ", lastLogIndex=" + lastLogIndex +
                ", lastLogTerm=" + lastLogTerm +
                ", term=" + term +
                ", serverId='" + serverId + '\'' +
                '}';
    }

}
