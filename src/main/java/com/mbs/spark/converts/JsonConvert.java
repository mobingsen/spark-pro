package com.mbs.spark.converts;

import com.google.gson.reflect.TypeToken;
import com.mbs.spark.tools.JsonTool;

import javax.persistence.AttributeConverter;

public class JsonConvert<K> implements AttributeConverter<K, String> {

    @Override
    public String convertToDatabaseColumn(K attribute) {
        return JsonTool.to(attribute);
    }

    @Override
    public K convertToEntityAttribute(String dbData) {
        return JsonTool.from(dbData, new TypeToken<K>(){});
    }
}
