package Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Response<T> implements Serializable {
    private T response;
    String value;
    public Response() {
    }

    public Response(T response) {
        this.response = response;
    }

    public static Response ok() {
        return new Response<>("ok");
    }

    public static Response fail() {
        return new Response<>("fail");
    }

    @Override
    public String toString() {
        return "Response{" +
                "response=" + response +
                '}';
    }
}
