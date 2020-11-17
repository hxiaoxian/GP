package client;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class KVRequest implements Serializable {
    public static int PUT = 0;

    public static int GET = 1;

    public static int DEL = 2;

    //request的类型，PUT or GET or DEL
    private int type;

    private String key;

    private String value;

    public KVRequest() {
    }

    public KVRequest(int type, String key, String value) {
        this.type = type;
        this.key = key;
        this.value = value;
    }

}
