package Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
/**
 * 附加 RPC 日志返回值.
 */
@Getter
@Setter
public class EntryResponse implements Serializable {

    long term;

    boolean success;

    public EntryResponse() {
    }

    public EntryResponse(long term, boolean success) {
        this.term = term;
        this.success = success;
    }

    public static EntryResponse fail() {
        return new EntryResponse(false);
    }

    public static EntryResponse ok() {
        return new EntryResponse(true);
    }


    public EntryResponse(boolean success) {
        this.success = success;
    }


    public EntryResponse(long term) {
        this.term = term;
    }

    public boolean isSuccess() {
        return success;
    }
}
