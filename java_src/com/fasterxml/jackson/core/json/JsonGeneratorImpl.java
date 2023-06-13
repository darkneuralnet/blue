package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.p030io.CharTypes;
import com.fasterxml.jackson.core.p030io.CharacterEscapes;
import com.fasterxml.jackson.core.p030io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
/* loaded from: classes5.dex */
public abstract class JsonGeneratorImpl extends GeneratorBase {
    protected boolean _cfgUnqNames;
    protected CharacterEscapes _characterEscapes;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int[] _outputEscapes;
    protected SerializableString _rootValueSeparator;
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected static final JacksonFeatureSet<StreamWriteCapability> JSON_WRITE_CAPABILITIES = JsonGenerator.DEFAULT_TEXTUAL_WRITE_CAPABILITIES;

    public JsonGeneratorImpl(IOContext iOContext, int i, ObjectCodec objectCodec) {
        super(i, objectCodec);
        this._outputEscapes = sOutputEscapes;
        this._rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this._ioContext = iOContext;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this._maximumNonEscapedChar = 127;
        }
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _checkStdFeatureChanges(int i, int i2) {
        super._checkStdFeatureChanges(i, i2);
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public void _reportCantWriteValueExpectName(String str) throws IOException {
        _reportError(String.format("Can not %s, expecting field name (context: %s)", str, this._writeContext.typeDesc()));
    }

    public void _verifyPrettyValueWrite(String str, int i) throws IOException {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            _throwInternal();
                            return;
                        } else {
                            _reportCantWriteValueExpectName(str);
                            return;
                        }
                    }
                    this._cfgPrettyPrinter.writeRootValueSeparator(this);
                    return;
                }
                this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
                return;
            }
            this._cfgPrettyPrinter.writeArrayValueSeparator(this);
        } else if (this._writeContext.inArray()) {
            this._cfgPrettyPrinter.beforeArrayValues(this);
        } else if (this._writeContext.inObject()) {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        super.disable(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        super.enable(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = false;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getHighestEscapedChar() {
        return this._maximumNonEscapedChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return JSON_WRITE_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        if (characterEscapes == null) {
            this._outputEscapes = sOutputEscapes;
        } else {
            this._outputEscapes = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setHighestNonEscapedChar(int i) {
        if (i < 0) {
            i = 0;
        }
        this._maximumNonEscapedChar = i;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return VersionUtil.versionFor(getClass());
    }
}
