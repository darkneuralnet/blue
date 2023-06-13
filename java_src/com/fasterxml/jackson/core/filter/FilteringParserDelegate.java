package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
/* loaded from: classes5.dex */
public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;
    protected TokenFilter.Inclusion _inclusion;
    protected TokenFilter _itemFilter;
    protected JsonToken _lastClearedToken;
    protected int _matchCount;
    protected TokenFilter rootFilter;

    @Deprecated
    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        this(jsonParser, tokenFilter, z ? TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH : TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z2);
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) throws IOException {
        this._exposedContext = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext != null) {
                JsonToken nextTokenToRead2 = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead2 != null) {
                    return nextTokenToRead2;
                }
            } else {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() throws IOException {
        int i = this._matchCount;
        if (i != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount = i + 1;
        return true;
    }

    public JsonStreamContext _filterContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            return tokenFilterContext;
        }
        return this._headContext;
    }

    public final JsonToken _nextToken2() throws IOException {
        TokenFilter checkValue;
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                this._currToken = nextToken;
                return nextToken;
            }
            int m52076id = nextToken.m52076id();
            if (m52076id != 1) {
                if (m52076id != 2) {
                    if (m52076id != 3) {
                        if (m52076id != 4) {
                            if (m52076id != 5) {
                                TokenFilter tokenFilter = this._itemFilter;
                                TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                                if (tokenFilter == tokenFilter2) {
                                    this._currToken = nextToken;
                                    return nextToken;
                                } else if (tokenFilter != null && ((checkValue = this._headContext.checkValue(tokenFilter)) == tokenFilter2 || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                                    if (_verifyAllowedMatches()) {
                                        this._currToken = nextToken;
                                        return nextToken;
                                    }
                                }
                            } else {
                                String currentName = this.delegate.getCurrentName();
                                TokenFilter fieldName = this._headContext.setFieldName(currentName);
                                TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                                if (fieldName == tokenFilter3) {
                                    this._itemFilter = fieldName;
                                    this._currToken = nextToken;
                                    return nextToken;
                                } else if (fieldName == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                    if (includeProperty == null) {
                                        this.delegate.nextToken();
                                        this.delegate.skipChildren();
                                    } else {
                                        this._itemFilter = includeProperty;
                                        if (includeProperty == tokenFilter3) {
                                            if (_verifyAllowedMatches()) {
                                                if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                                    this._currToken = nextToken;
                                                    return nextToken;
                                                }
                                            } else {
                                                this.delegate.nextToken();
                                                this.delegate.skipChildren();
                                            }
                                        } else if (this._inclusion != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (_nextTokenWithBuffering = _nextTokenWithBuffering(this._headContext)) != null) {
                                            this._currToken = _nextTokenWithBuffering;
                                            return _nextTokenWithBuffering;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TokenFilter tokenFilter4 = this._itemFilter;
                        TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                        if (tokenFilter4 == tokenFilter5) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter4, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (tokenFilter4 == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter4);
                            if (checkValue2 == null) {
                                this.delegate.skipChildren();
                            } else {
                                if (checkValue2 != tokenFilter5) {
                                    checkValue2 = checkValue2.filterStartArray();
                                }
                                this._itemFilter = checkValue2;
                                if (checkValue2 == tokenFilter5) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                } else if (checkValue2 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                    this._currToken = nextToken;
                                    return nextToken;
                                } else {
                                    TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(checkValue2, false);
                                    this._headContext = createChildArrayContext;
                                    if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                        this._currToken = _nextTokenWithBuffering2;
                                        return _nextTokenWithBuffering2;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean isStartHandled = this._headContext.isStartHandled();
                TokenFilter filter = this._headContext.getFilter();
                if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                    filter.filterFinishArray();
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (isStartHandled) {
                    this._currToken = nextToken;
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter6 = this._itemFilter;
                TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter6 == tokenFilter7) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                    this._currToken = nextToken;
                    return nextToken;
                } else if (tokenFilter6 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter6);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != tokenFilter7) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == tokenFilter7) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else if (checkValue3 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            this._currToken = nextToken;
                            return nextToken;
                        } else {
                            TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(checkValue3, false);
                            this._headContext = createChildObjectContext;
                            if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                                this._currToken = _nextTokenWithBuffering3;
                                return _nextTokenWithBuffering3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) throws IOException {
        boolean z;
        TokenFilter checkValue;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                return nextToken;
            }
            int m52076id = nextToken.m52076id();
            boolean z2 = false;
            if (m52076id != 1) {
                if (m52076id != 2) {
                    if (m52076id != 3) {
                        if (m52076id != 4) {
                            if (m52076id != 5) {
                                TokenFilter tokenFilter = this._itemFilter;
                                TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                                if (tokenFilter == tokenFilter2) {
                                    return _nextBuffered(tokenFilterContext);
                                }
                                if (tokenFilter != null && ((checkValue = this._headContext.checkValue(tokenFilter)) == tokenFilter2 || (checkValue != null && checkValue.includeValue(this.delegate)))) {
                                    if (_verifyAllowedMatches()) {
                                        return _nextBuffered(tokenFilterContext);
                                    }
                                }
                            } else {
                                String currentName = this.delegate.getCurrentName();
                                TokenFilter fieldName = this._headContext.setFieldName(currentName);
                                TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                                if (fieldName == tokenFilter3) {
                                    this._itemFilter = fieldName;
                                    return _nextBuffered(tokenFilterContext);
                                } else if (fieldName == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                    if (includeProperty == null) {
                                        this.delegate.nextToken();
                                        this.delegate.skipChildren();
                                    } else {
                                        this._itemFilter = includeProperty;
                                        if (includeProperty != tokenFilter3) {
                                            continue;
                                        } else if (_verifyAllowedMatches()) {
                                            return _nextBuffered(tokenFilterContext);
                                        } else {
                                            this._itemFilter = this._headContext.setFieldName(currentName);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        TokenFilter checkValue2 = this._headContext.checkValue(this._itemFilter);
                        if (checkValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (checkValue2 != tokenFilter4) {
                                checkValue2 = checkValue2.filterStartArray();
                            }
                            this._itemFilter = checkValue2;
                            if (checkValue2 == tokenFilter4) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                return _nextBuffered(tokenFilterContext);
                            } else if (checkValue2 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                return _nextBuffered(tokenFilterContext);
                            } else {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, false);
                            }
                        }
                    }
                }
                TokenFilter filter = this._headContext.getFilter();
                if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                    filter.filterFinishArray();
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext2 == tokenFilterContext) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && tokenFilterContext2.isStartHandled()) {
                    z2 = true;
                }
                TokenFilterContext parent = this._headContext.getParent();
                this._headContext = parent;
                this._itemFilter = parent.getFilter();
                if (z2) {
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter5 = this._itemFilter;
                TokenFilter tokenFilter6 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter5 == tokenFilter6) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter5, true);
                    return nextToken;
                } else if (tokenFilter5 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter5);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        if (checkValue3 != tokenFilter6) {
                            checkValue3 = checkValue3.filterStartObject();
                        }
                        this._itemFilter = checkValue3;
                        if (checkValue3 == tokenFilter6) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        } else if (checkValue3 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        } else {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String currentName() throws IOException {
        JsonStreamContext _filterContext = _filterContext();
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m52076id();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        return this.delegate.getBigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        return this.delegate.getBinaryValue(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getBooleanValue() throws IOException {
        return this.delegate.getBooleanValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte getByteValue() throws IOException {
        return this.delegate.getByteValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonStreamContext _filterContext = _filterContext();
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return _filterContext.getCurrentName();
        }
        JsonStreamContext parent = _filterContext.getParent();
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int getCurrentTokenId() {
        return currentTokenId();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        return this.delegate.getDecimalValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        return this.delegate.getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        return this.delegate.getEmbeddedObject();
    }

    public TokenFilter getFilter() {
        return this.rootFilter;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return this.delegate.getFloatValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        return this.delegate.getIntValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        return this.delegate.getLongValue();
    }

    public int getMatchCount() {
        return this._matchCount;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        return this.delegate.getNumberType();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        return this.delegate.getNumberValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return _filterContext();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public short getShortValue() throws IOException {
        return this.delegate.getShortValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return this.delegate.getText();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName().toCharArray();
        }
        return this.delegate.getTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName().length();
        }
        return this.delegate.getTextLength();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.delegate.getTextOffset();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean() throws IOException {
        return this.delegate.getValueAsBoolean();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble() throws IOException {
        return this.delegate.getValueAsDouble();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        return this.delegate.getValueAsInt();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        return this.delegate.getValueAsLong();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return this.delegate.getValueAsString();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.delegate.hasTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            if (i == 0) {
                return true;
            }
            return false;
        } else if (jsonToken.m52076id() == i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        TokenFilter checkValue;
        JsonToken jsonToken;
        if (!this._allowMultipleMatches && (jsonToken = this._currToken) != null && this._exposedContext == null && jsonToken.isScalarValue() && !this._headContext.isStartHandled() && this._inclusion == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this._itemFilter == TokenFilter.INCLUDE_ALL) {
            this._currToken = null;
            return null;
        }
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext != null) {
            do {
                JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead != null) {
                    this._currToken = nextTokenToRead;
                    return nextTokenToRead;
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                if (tokenFilterContext == tokenFilterContext2) {
                    this._exposedContext = null;
                    if (tokenFilterContext.inArray()) {
                        JsonToken currentToken = this.delegate.getCurrentToken();
                        this._currToken = currentToken;
                        return currentToken;
                    }
                    JsonToken currentToken2 = this.delegate.currentToken();
                    if (currentToken2 != JsonToken.FIELD_NAME) {
                        this._currToken = currentToken2;
                        return currentToken2;
                    }
                } else {
                    tokenFilterContext = tokenFilterContext2.findChildOf(tokenFilterContext);
                    this._exposedContext = tokenFilterContext;
                }
            } while (tokenFilterContext != null);
            throw _constructError("Unexpected problem: chain of filtered context broken");
        }
        JsonToken nextToken = this.delegate.nextToken();
        if (nextToken == null) {
            this._currToken = nextToken;
            return nextToken;
        }
        int m52076id = nextToken.m52076id();
        if (m52076id != 1) {
            if (m52076id != 2) {
                if (m52076id != 3) {
                    if (m52076id != 4) {
                        if (m52076id != 5) {
                            TokenFilter tokenFilter = this._itemFilter;
                            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter == tokenFilter2) {
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (tokenFilter != null && (((checkValue = this._headContext.checkValue(tokenFilter)) == tokenFilter2 || (checkValue != null && checkValue.includeValue(this.delegate))) && _verifyAllowedMatches())) {
                                this._currToken = nextToken;
                                return nextToken;
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                            if (fieldName == tokenFilter3) {
                                this._itemFilter = fieldName;
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                TokenFilter includeProperty = fieldName.includeProperty(currentName);
                                if (includeProperty == null) {
                                    this.delegate.nextToken();
                                    this.delegate.skipChildren();
                                } else {
                                    this._itemFilter = includeProperty;
                                    if (includeProperty == tokenFilter3) {
                                        if (_verifyAllowedMatches()) {
                                            if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                                this._currToken = nextToken;
                                                return nextToken;
                                            }
                                        } else {
                                            this.delegate.nextToken();
                                            this.delegate.skipChildren();
                                        }
                                    }
                                    if (this._inclusion != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                        this._currToken = _nextTokenWithBuffering3;
                                        return _nextTokenWithBuffering3;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    TokenFilter tokenFilter4 = this._itemFilter;
                    TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                    if (tokenFilter4 == tokenFilter5) {
                        this._headContext = this._headContext.createChildArrayContext(tokenFilter4, true);
                        this._currToken = nextToken;
                        return nextToken;
                    } else if (tokenFilter4 == null) {
                        this.delegate.skipChildren();
                    } else {
                        TokenFilter checkValue2 = this._headContext.checkValue(tokenFilter4);
                        if (checkValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            if (checkValue2 != tokenFilter5) {
                                checkValue2 = checkValue2.filterStartArray();
                            }
                            this._itemFilter = checkValue2;
                            if (checkValue2 == tokenFilter5) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                this._currToken = nextToken;
                                return nextToken;
                            } else if (checkValue2 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                this._currToken = nextToken;
                                return nextToken;
                            } else {
                                TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(checkValue2, false);
                                this._headContext = createChildArrayContext;
                                if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                    }
                }
            }
            boolean isStartHandled = this._headContext.isStartHandled();
            TokenFilter filter = this._headContext.getFilter();
            if (filter != null && filter != TokenFilter.INCLUDE_ALL) {
                filter.filterFinishArray();
            }
            TokenFilterContext parent = this._headContext.getParent();
            this._headContext = parent;
            this._itemFilter = parent.getFilter();
            if (isStartHandled) {
                this._currToken = nextToken;
                return nextToken;
            }
        } else {
            TokenFilter tokenFilter6 = this._itemFilter;
            TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter6 == tokenFilter7) {
                this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                this._currToken = nextToken;
                return nextToken;
            } else if (tokenFilter6 == null) {
                this.delegate.skipChildren();
            } else {
                TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter6);
                if (checkValue3 == null) {
                    this.delegate.skipChildren();
                } else {
                    if (checkValue3 != tokenFilter7) {
                        checkValue3 = checkValue3.filterStartObject();
                    }
                    this._itemFilter = checkValue3;
                    if (checkValue3 == tokenFilter7) {
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                        this._currToken = nextToken;
                        return nextToken;
                    } else if (checkValue3 != null && this._inclusion == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                        this._currToken = nextToken;
                        return nextToken;
                    } else {
                        TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(checkValue3, false);
                        this._headContext = createChildObjectContext;
                        if (this._inclusion == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                            this._currToken = _nextTokenWithBuffering;
                            return _nextTokenWithBuffering;
                        }
                    }
                }
            }
        }
        return _nextToken2();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.FIELD_NAME) {
            return nextToken();
        }
        return nextToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        throw new UnsupportedOperationException("Can not currently override name during filtering read");
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.rootFilter = tokenFilter;
        this._itemFilter = tokenFilter;
        this._headContext = TokenFilterContext.createRootContext(tokenFilter);
        this._inclusion = inclusion;
        this._allowMultipleMatches = z;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z) throws IOException {
        return this.delegate.getValueAsBoolean(z);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d) throws IOException {
        return this.delegate.getValueAsDouble(d);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) throws IOException {
        return this.delegate.getValueAsInt(i);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j) throws IOException {
        return this.delegate.getValueAsLong(j);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return this.delegate.getValueAsString(str);
    }
}
