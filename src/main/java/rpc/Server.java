package rpc;

import Entity.Request;
import Entity.Response;

public interface Server {
    void start();

    void stop();

    Response handleRequestImpl(Request request);

}
