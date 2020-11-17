package Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Param implements Serializable {
    //任期号
    public long term;

    //被请求者ID(ip:selfPort)
    public String serverId;

}
