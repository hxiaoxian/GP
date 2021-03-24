package raft;

import Entity.LogEntry;

// 状态机模块
public interface StateMachine{
    // 日志应用到状态机
    void apply(LogEntry logEntry);

    LogEntry get(String key);

    String getString(String key);

    void setString(String key, String value);

    void delString(String... key);

}
