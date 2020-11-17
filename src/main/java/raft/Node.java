package raft;

import Entity.EntryParam;
import Entity.EntryResponse;
import Entity.VoteParam;
import Entity.VoteResponse;
import client.KVRequest;
import client.KVResponse;


public interface Node<T> {

    VoteResponse handleRequestVote(VoteParam param);

    EntryResponse handleAppendEntries(EntryParam param);

    KVResponse handleClientRequest(KVRequest request);

    KVResponse redirect(KVRequest request);

    void setConfig(NodeConfig config);

    void init() throws Throwable;

    void destroy() throws Throwable;
}
