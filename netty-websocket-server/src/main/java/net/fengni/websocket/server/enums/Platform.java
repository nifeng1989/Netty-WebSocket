package net.fengni.websocket.server.enums;

import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2016/12/18.
 */
public enum  Platform {
    Android(AttributeKey.newInstance("android")),
    Ios(AttributeKey.newInstance("Ios"));
    private AttributeKey<Long> key;
    Platform(AttributeKey attributeKey){
        this.key = attributeKey;
    }

    public AttributeKey<Long> getKey() {
        return key;
    }

    public void setKey(AttributeKey<Long> key) {
        this.key = key;
    }
}
