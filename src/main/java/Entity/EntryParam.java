package Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
/**
 * 附加日志RPC参数. handlerAppendEntries
 */
@Getter
@Setter
public class EntryParam extends Param {

    private String leaderId;

    private long prevLogIndex;

    private long preLogTerm;

    private LogEntry[] entries;

    private long leaderCommit;

    public EntryParam() {
    }

    public EntryParam(String leaderId, long prevLogIndex, long preLogTerm, LogEntry[] entries, long leaderCommit) {
        this.leaderId = leaderId;
        this.prevLogIndex = prevLogIndex;
        this.preLogTerm = preLogTerm;
        this.entries = entries;
        this.leaderCommit = leaderCommit;
    }

    @Override
    public String toString() {
        return "EntryParam{" +
                "leaderId='" + leaderId + '\'' +
                ", prevLogIndex=" + prevLogIndex +
                ", preLogTerm=" + preLogTerm +
                ", entries=" + Arrays.toString(entries) +
                ", leaderCommit=" + leaderCommit +
                ", term=" + term +
                ", serverId='" + serverId + '\'' +
                '}';
    }

}