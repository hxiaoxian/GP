package raft;

import Entity.EntryParam;
import Entity.EntryResponse;
import Entity.VoteParam;
import Entity.VoteResponse;

public interface RequestAction {

    VoteResponse requestVote(VoteParam param);

    EntryResponse appendEntries(EntryParam param);
}
