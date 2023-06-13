package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;
/* loaded from: classes5.dex */
public class UnresolvedId {
    private final Object _id;
    private final JsonLocation _location;
    private final Class<?> _type;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._id = obj;
        this._type = cls;
        this._location = jsonLocation;
    }

    public Object getId() {
        return this._id;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    public Class<?> getType() {
        return this._type;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this._id, ClassUtil.nameOf(this._type), this._location);
    }
}