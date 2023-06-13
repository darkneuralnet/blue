package com.fasterxml.jackson.core;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.p030io.CharTypes;
import com.fasterxml.jackson.core.p030io.ContentReference;
/* loaded from: classes5.dex */
public abstract class JsonStreamContext {
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_OBJECT = 2;
    public static final int TYPE_ROOT = 0;
    protected int _index;
    protected int _type;

    public JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i = this._index;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    @Deprecated
    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.f69944NA;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i = this._type;
        return i != 0 ? i != 1 ? i != 2 ? CallerData.f61059NA : "OBJECT" : "ARRAY" : "ROOT";
    }

    public boolean hasCurrentIndex() {
        return this._index >= 0;
    }

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public boolean hasPathSegment() {
        int i = this._type;
        if (i == 2) {
            return hasCurrentName();
        }
        if (i == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public JsonPointer pathAsPointer() {
        return JsonPointer.forPath(this, false);
    }

    public void setCurrentValue(Object obj) {
    }

    public JsonLocation startLocation(ContentReference contentReference) {
        return JsonLocation.f69944NA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i != 0) {
            if (i != 1) {
                sb.append(CoreConstants.CURLY_LEFT);
                String currentName = getCurrentName();
                if (currentName != null) {
                    sb.append('\"');
                    CharTypes.appendQuoted(sb, currentName);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append(CoreConstants.CURLY_RIGHT);
            } else {
                sb.append('[');
                sb.append(getCurrentIndex());
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }

    public String typeDesc() {
        int i = this._type;
        return i != 0 ? i != 1 ? i != 2 ? CallerData.f61059NA : "Object" : "Array" : "root";
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonPointer pathAsPointer(boolean z) {
        return JsonPointer.forPath(this, z);
    }

    public JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }
}
