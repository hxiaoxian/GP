package config;

import raft.Peer;
// 成员变更
public interface NodeChange {

    Result addPeer(Peer newPeer);

    Result removePeer(Peer oldPeer);
}
