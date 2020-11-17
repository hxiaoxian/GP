package raft;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class PeerSet implements Serializable {

    private volatile List<Peer> list = new ArrayList<>();

    private volatile Peer leader;

    private volatile Peer self;

    public PeerSet() {
    }

    public List<Peer> getPeers() {
        return list;
    }

    public List<Peer> getPeersWithOutSelf() {
        List<Peer> list2 = new ArrayList<>(list);
        list2.remove(self);
        return list2;
    }

    public void addPeer(Peer peer) {
        list.add(peer);
    }

    public void removePeer(Peer peer) {
        list.remove(peer);
    }

    @Override
    public String toString() {
        return "PeerSet{" +
                "list=" + list +
                ", leader=" + leader +
                ", self=" + self +
                '}';
    }
}
