package org.weisenz.mediabrowser.common;

/**
 * 定义媒体类型。
 * @author weisenz
 */
public enum MediaType {
    Audio(0),

    Video(1),

    Photo(2);

    private int intValue;
    private static java.util.HashMap<Integer, MediaType> mappings;

    private static java.util.HashMap<Integer, MediaType> getMappings() {
        if (mappings == null) {
            synchronized (MediaType.class) {
                if (mappings == null) {
                    mappings = new java.util.HashMap<Integer, MediaType>();
                }
            }
        }
        return mappings;
    }

    private MediaType(int value) {
        intValue = value;
        getMappings().put(value, this);
    }

    public int getValue() {
        return intValue;
    }

    public static MediaType forValue(int value) {
        return getMappings().get(value);
    }
}