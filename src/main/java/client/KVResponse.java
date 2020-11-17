package client;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class KVResponse implements Serializable {

    Object response;

    String value;

    public KVResponse() {
    }

    public KVResponse(Object response) {
        this.response = response;
    }

    public static KVResponse ok() {
        return new KVResponse("ok");
    }

    public static KVResponse fail() {
        return new KVResponse("fail");
    }
}
