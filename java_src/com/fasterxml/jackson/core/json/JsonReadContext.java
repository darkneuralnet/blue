package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.p030io.ContentReference;
/* loaded from: classes5.dex */
public final class JsonReadContext extends JsonStreamContext {
    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i, int i2, int i3) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i;
        this._lineNr = i2;
        this._columnNr = i3;
        this._index = -1;
    }

    private void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        JsonParser jsonParser;
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            if (source instanceof JsonParser) {
                jsonParser = (JsonParser) source;
            } else {
                jsonParser = null;
            }
            throw new JsonParseException(jsonParser, "Duplicate field '" + str + "'");
        }
    }

    public static JsonReadContext createRootContext(int i, int i2, DupDetector dupDetector) {
        return new JsonReadContext(null, dupDetector, 0, i, i2);
    }

    public JsonReadContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonReadContext createChildArrayContext(int i, int i2) {
        DupDetector child;
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            if (dupDetector == null) {
                child = null;
            } else {
                child = dupDetector.child();
            }
            jsonReadContext = new JsonReadContext(this, child, 1, i, i2);
            this._child = jsonReadContext;
        } else {
            jsonReadContext.reset(1, i, i2);
        }
        return jsonReadContext;
    }

    public JsonReadContext createChildObjectContext(int i, int i2) {
        DupDetector child;
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            DupDetector dupDetector = this._dups;
            if (dupDetector == null) {
                child = null;
            } else {
                child = dupDetector.child();
            }
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, child, 2, i, i2);
            this._child = jsonReadContext2;
            return jsonReadContext2;
        }
        jsonReadContext.reset(2, i, i2);
        return jsonReadContext;
    }

    public boolean expectComma() {
        int i = this._index + 1;
        this._index = i;
        if (this._type != 0 && i > 0) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    @Deprecated
    public JsonLocation getStartLocation(Object obj) {
        return startLocation(ContentReference.rawReference(obj));
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    public void reset(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this._lineNr = i2;
        this._columnNr = i3;
        this._currentName = null;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
    }

    public void setCurrentName(String str) throws JsonProcessingException {
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonLocation startLocation(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this._lineNr, this._columnNr);
    }

    public JsonReadContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public static JsonReadContext createRootContext(DupDetector dupDetector) {
        return new JsonReadContext(null, dupDetector, 0, 1, 0);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonReadContext getParent() {
        return this._parent;
    }
}
