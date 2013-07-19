package com.othelle.jtuples.serialize;

import com.othelle.jtuples.*;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.module.SimpleAbstractTypeResolver;
import org.codehaus.jackson.map.module.SimpleKeyDeserializers;
import org.codehaus.jackson.map.module.SimpleModule;

import java.io.IOException;

/**
 * author: v.vlasov
 */
public class JacksonConverter implements Converter {
    private ObjectMapper mapper;

    public JacksonConverter() {
        mapper = new ObjectMapper();
        mapper.registerModule(getTupleMapperModule());
    }

    /**
     * Returns the default mapping for all the possible TupleN
     *
     * @return
     */
    public static SimpleModule getTupleMapperModule() {
        SimpleModule module = new SimpleModule("1", Version.unknownVersion());
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(Tuple16.class, Product16.class);
        resolver.addMapping(Tuple15.class, Product15.class);
        resolver.addMapping(Tuple14.class, Product14.class);
        resolver.addMapping(Tuple13.class, Product13.class);
        resolver.addMapping(Tuple12.class, Product12.class);
        resolver.addMapping(Tuple11.class, Product11.class);
        resolver.addMapping(Tuple10.class, Product10.class);
        resolver.addMapping(Tuple9.class, Product9.class);
        resolver.addMapping(Tuple8.class, Product8.class);
        resolver.addMapping(Tuple7.class, Product7.class);
        resolver.addMapping(Tuple6.class, Product6.class);
        resolver.addMapping(Tuple5.class, Product5.class);
        resolver.addMapping(Tuple4.class, Product4.class);
        resolver.addMapping(Tuple3.class, Product3.class);
        resolver.addMapping(Tuple2.class, Product2.class);
        resolver.addMapping(Tuple1.class, Product1.class);
        module.setAbstractTypes(resolver);

        module.setKeyDeserializers(new SimpleKeyDeserializers());
        return module;
    }

    public String writeValueAsString(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            throw new ConvertException(e);
        }
    }

    public byte[] writeValueAsBytes(Object object) {
        try {
            return mapper.writeValueAsBytes(object);
        } catch (IOException e) {
            throw new ConvertException(e);
        }
    }

    public <T> T readValue(byte[] data, Class<T> clazz) {
        try {
            return mapper.readValue(data, clazz);
        } catch (Exception e) {
            throw new ConvertException(e);
        }
    }
}
