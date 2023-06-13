package com.fasterxml.jackson.core.json;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p030io.CharTypes;
import com.fasterxml.jackson.core.p030io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.google.android.gms.location.places.Place;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* loaded from: classes5.dex */
public class UTF8StreamJsonParser extends ParserBase {
    static final byte BYTE_LF = 10;
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    @Deprecated
    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        this(iOContext, i, inputStream, objectCodec, byteQuadsCanonicalizer, bArr, i2, i3, 0, z);
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, CoreConstants.CURLY_RIGHT);
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i) throws JsonParseException {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3fast(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i8 = this._inputPtr;
        int i9 = i8 + 1;
        this._inputPtr = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & UByte.MAX_VALUE, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    private final void _finishString2(char[] cArr, int i) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 < min) {
                    int i4 = i2 + 1;
                    int i5 = bArr[i2] & UByte.MAX_VALUE;
                    int i6 = iArr[i5];
                    if (i6 != 0) {
                        this._inputPtr = i4;
                        if (i5 == 34) {
                            this._textBuffer.setCurrentLength(i);
                            return;
                        }
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        if (i5 < 32) {
                                            _throwUnquotedSpace(i5, "string value");
                                        } else {
                                            _reportInvalidChar(i5);
                                        }
                                    } else {
                                        int _decodeUtf8_4 = _decodeUtf8_4(i5);
                                        int i7 = i + 1;
                                        cArr[i] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                        if (i7 >= cArr.length) {
                                            cArr = this._textBuffer.finishCurrentSegment();
                                            i = 0;
                                        } else {
                                            i = i7;
                                        }
                                        i5 = (_decodeUtf8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1) | GeneratorBase.SURR2_FIRST;
                                    }
                                } else {
                                    i5 = this._inputEnd - i4 >= 2 ? _decodeUtf8_3fast(i5) : _decodeUtf8_3(i5);
                                }
                            } else {
                                i5 = _decodeUtf8_2(i5);
                            }
                        } else {
                            i5 = _decodeEscaped();
                        }
                        if (i >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) i5;
                    } else {
                        cArr[i] = (char) i5;
                        i2 = i4;
                        i++;
                    }
                } else {
                    this._inputPtr = i2;
                    break;
                }
            }
        }
    }

    private final boolean _isNextTokenNameMaybe(int i, SerializableString serializableString) throws IOException {
        JsonToken _parseNegNumber;
        String _parseName = _parseName(i);
        this._parsingContext.setCurrentName(_parseName);
        boolean equals = _parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return equals;
        }
        if (_skipColon != 45) {
            if (_skipColon != 46) {
                if (_skipColon != 91) {
                    if (_skipColon != 102) {
                        if (_skipColon != 110) {
                            if (_skipColon != 116) {
                                if (_skipColon != 123) {
                                    switch (_skipColon) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            _parseNegNumber = _parsePosNumber(_skipColon);
                                            break;
                                        default:
                                            _parseNegNumber = _handleUnexpectedValue(_skipColon);
                                            break;
                                    }
                                } else {
                                    _parseNegNumber = JsonToken.START_OBJECT;
                                }
                            } else {
                                _matchTrue();
                                _parseNegNumber = JsonToken.VALUE_TRUE;
                            }
                        } else {
                            _matchNull();
                            _parseNegNumber = JsonToken.VALUE_NULL;
                        }
                    } else {
                        _matchFalse();
                        _parseNegNumber = JsonToken.VALUE_FALSE;
                    }
                } else {
                    _parseNegNumber = JsonToken.START_ARRAY;
                }
            } else {
                _parseNegNumber = _parseFloatThatStartsWithPeriod();
            }
        } else {
            _parseNegNumber = _parseNegNumber();
        }
        this._nextToken = _parseNegNumber;
        return equals;
    }

    private final void _isNextTokenNameYes(int i) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i != 34) {
            if (i != 91) {
                if (i != 102) {
                    if (i != 110) {
                        if (i != 116) {
                            if (i != 123) {
                                if (i != 45) {
                                    if (i != 46) {
                                        switch (i) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                this._nextToken = _parsePosNumber(i);
                                                return;
                                            default:
                                                this._nextToken = _handleUnexpectedValue(i);
                                                return;
                                        }
                                    }
                                    this._nextToken = _parseFloatThatStartsWithPeriod();
                                    return;
                                }
                                this._nextToken = _parseNegNumber();
                                return;
                            }
                            this._nextToken = JsonToken.START_OBJECT;
                            return;
                        }
                        _matchTrue();
                        this._nextToken = JsonToken.VALUE_TRUE;
                        return;
                    }
                    _matchNull();
                    this._nextToken = JsonToken.VALUE_NULL;
                    return;
                }
                _matchFalse();
                this._nextToken = JsonToken.VALUE_FALSE;
                return;
            }
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        this._tokenIncomplete = true;
        this._nextToken = JsonToken.VALUE_STRING;
    }

    private final void _matchToken2(String str, int i) throws IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        if ((i2 < this._inputEnd || _loadMore()) && (i3 = this._inputBuffer[this._inputPtr] & UByte.MAX_VALUE) >= 48 && i3 != 93 && i3 != 125) {
            _checkMatchEnd(str, i, i3);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) throws IOException {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i != 45) {
            if (i != 46) {
                if (i != 91) {
                    if (i != 102) {
                        if (i != 110) {
                            if (i != 116) {
                                if (i != 123) {
                                    switch (i) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            JsonToken _parsePosNumber = _parsePosNumber(i);
                                            this._currToken = _parsePosNumber;
                                            return _parsePosNumber;
                                        default:
                                            JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                                            this._currToken = _handleUnexpectedValue;
                                            return _handleUnexpectedValue;
                                    }
                                }
                                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                                JsonToken jsonToken2 = JsonToken.START_OBJECT;
                                this._currToken = jsonToken2;
                                return jsonToken2;
                            }
                            _matchTrue();
                            JsonToken jsonToken3 = JsonToken.VALUE_TRUE;
                            this._currToken = jsonToken3;
                            return jsonToken3;
                        }
                        _matchNull();
                        JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                        this._currToken = jsonToken4;
                        return jsonToken4;
                    }
                    _matchFalse();
                    JsonToken jsonToken5 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken5;
                    return jsonToken5;
                }
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken6 = JsonToken.START_ARRAY;
                this._currToken = jsonToken6;
                return jsonToken6;
            }
            JsonToken _parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod();
            this._currToken = _parseFloatThatStartsWithPeriod;
            return _parseFloatThatStartsWithPeriod;
        } else {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        }
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & UByte.MAX_VALUE;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0) {
                reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr2[i8] & UByte.MAX_VALUE;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                i9 = bArr3[i11] & UByte.MAX_VALUE;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i13 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i5 = i12;
                    z2 = true;
                    i = i13;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                i2 = bArr4[i14] & UByte.MAX_VALUE;
                i7 = i13;
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r3 == 46) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r3 == 101) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r3 != 69) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        r6._inputPtr = r10 - 1;
        r6._textBuffer.setCurrentLength(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r6._parsingContext.inRoot() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        _verifyRootSpace(r6._inputBuffer[r6._inputPtr] & kotlin.UByte.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        return resetInt(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        return _parseFloat(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) throws IOException {
        char[] cArr2 = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i3);
                return resetInt(z, i4);
            }
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr[i5] & UByte.MAX_VALUE;
            if (i7 > 57 || i7 < 48) {
                break;
            }
            if (i3 >= cArr2.length) {
                i3 = 0;
                cArr2 = this._textBuffer.finishCurrentSegment();
            }
            cArr2[i3] = (char) i7;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & UByte.MAX_VALUE;
            int i4 = inputCodeComment[i3];
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 10) {
                                if (i4 != 13) {
                                    if (i4 != 42) {
                                        _reportInvalidChar(i3);
                                    } else if (i2 >= this._inputEnd && !_loadMore()) {
                                        break;
                                    } else {
                                        byte[] bArr2 = this._inputBuffer;
                                        int i5 = this._inputPtr;
                                        if (bArr2[i5] == 47) {
                                            this._inputPtr = i5 + 1;
                                            return;
                                        }
                                    }
                                } else {
                                    _skipCR();
                                }
                            } else {
                                this._currInputRow++;
                                this._currInputRowStart = i2;
                            }
                        } else {
                            _skipUtf8_4(i3);
                        }
                    } else {
                        _skipUtf8_3();
                    }
                } else {
                    _skipUtf8_2();
                }
            }
        }
    }

    private final int _skipColon() throws IOException {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this._inputPtr = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this._inputPtr = i2 + 1;
                    return b2;
                }
                return _skipColon2(true);
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i2 + 1;
                this._inputPtr = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 != 47 && b3 != 35) {
                        this._inputPtr = i3 + 1;
                        return b3;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this._inputPtr = i4;
            b = bArr[i4];
        }
        if (b == 58) {
            int i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            byte b4 = bArr[i5];
            if (b4 > 32) {
                if (b4 != 47 && b4 != 35) {
                    this._inputPtr = i5 + 1;
                    return b4;
                }
                return _skipColon2(true);
            }
            if (b4 == 32 || b4 == 9) {
                int i6 = i5 + 1;
                this._inputPtr = i6;
                byte b5 = bArr[i6];
                if (b5 > 32) {
                    if (b5 != 47 && b5 != 35) {
                        this._inputPtr = i6 + 1;
                        return b5;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        return _skipColon2(false);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & UByte.MAX_VALUE;
            if (i3 > 32) {
                if (i3 == 47) {
                    _skipComment();
                } else if (i3 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        _reportUnexpectedChar(i3, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
        }
    }

    private final int _skipColonFast(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b == 58) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this._inputPtr = i3;
                    return b2;
                }
            } else if (b2 == 32 || b2 == 9) {
                int i4 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 > 32 && b3 != 47 && b3 != 35) {
                    this._inputPtr = i4;
                    return b3;
                }
                i3 = i4;
            }
            this._inputPtr = i3 - 1;
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i5 = i2 + 1;
            byte b4 = bArr[i2];
            i2 = i5;
            b = b4;
        }
        if (b == 58) {
            int i6 = i2 + 1;
            byte b5 = bArr[i2];
            if (b5 > 32) {
                if (b5 != 47 && b5 != 35) {
                    this._inputPtr = i6;
                    return b5;
                }
            } else if (b5 == 32 || b5 == 9) {
                int i7 = i6 + 1;
                byte b6 = bArr[i6];
                if (b6 > 32 && b6 != 47 && b6 != 35) {
                    this._inputPtr = i7;
                    return b6;
                }
                i6 = i7;
            }
            this._inputPtr = i6 - 1;
            return _skipColon2(true);
        }
        this._inputPtr = i2 - 1;
        return _skipColon2(false);
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        if (i2 == 47) {
            _skipLine();
        } else if (i2 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & UByte.MAX_VALUE;
            int i4 = inputCodeComment[i3];
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 10) {
                                if (i4 != 13) {
                                    if (i4 != 42 && i4 < 0) {
                                        _reportInvalidChar(i3);
                                    }
                                } else {
                                    _skipCR();
                                    return;
                                }
                            } else {
                                this._currInputRow++;
                                this._currInputRowStart = i2;
                                return;
                            }
                        } else {
                            _skipUtf8_4(i3);
                        }
                    } else {
                        _skipUtf8_3();
                    }
                } else {
                    _skipUtf8_2();
                }
            }
        }
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i2);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i2);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i4);
        }
    }

    private final void _skipUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & UByte.MAX_VALUE, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & UByte.MAX_VALUE, i5);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & UByte.MAX_VALUE, i7);
        }
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i = this._inputPtr;
            if (i < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                int i2 = i + 1;
                this._inputPtr = i2;
                int i3 = bArr[i] & UByte.MAX_VALUE;
                if (i3 > 32) {
                    if (i3 != 47 && i3 != 35) {
                        return i3;
                    }
                    this._inputPtr = i2 - 1;
                    return _skipWS2();
                } else if (i3 != 32) {
                    if (i3 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (i3 == 13) {
                        _skipCR();
                    } else if (i3 != 9) {
                        _throwInvalidSpace(i3);
                    }
                }
            } else {
                return _skipWS2();
            }
        }
    }

    private final int _skipWS2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            i = bArr[i2] & UByte.MAX_VALUE;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this._inputPtr = i2 - 1;
            return _skipWSOrEnd2();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i2;
            } else if (i3 == 13) {
                _skipCR();
            } else if (i3 != 9) {
                _throwInvalidSpace(i3);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 < this._inputEnd) {
                byte[] bArr2 = this._inputBuffer;
                int i5 = i4 + 1;
                this._inputPtr = i5;
                int i6 = bArr2[i4] & UByte.MAX_VALUE;
                if (i6 > 32) {
                    if (i6 != 47 && i6 != 35) {
                        return i6;
                    }
                    this._inputPtr = i5 - 1;
                    return _skipWSOrEnd2();
                } else if (i6 != 32) {
                    if (i6 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i5;
                    } else if (i6 == 13) {
                        _skipCR();
                    } else if (i6 != 9) {
                        _throwInvalidSpace(i6);
                    }
                }
            } else {
                return _skipWSOrEnd2();
            }
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            i = bArr[i2] & UByte.MAX_VALUE;
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
        return i;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() throws IOException {
        int i;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i = this._inputBuffer[this._inputPtr] & UByte.MAX_VALUE) < 48 || i > 57) {
            return 48;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                i = bArr[i2] & UByte.MAX_VALUE;
                if (i < 48 || i > 57) {
                    return 48;
                }
                this._inputPtr = i2 + 1;
            } while (i == 48);
        }
        return i;
    }

    private final void _verifyRootSpace(int i) throws IOException {
        int i2 = this._inputPtr + 1;
        this._inputPtr = i2;
        if (i != 9) {
            if (i != 10) {
                if (i != 13) {
                    if (i != 32) {
                        _reportMissingRootWS(i);
                        return;
                    }
                    return;
                }
                _skipCR();
                return;
            }
            this._currInputRow++;
            this._currInputRowStart = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String addName(int[] iArr, int i, int i2) throws JsonParseException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i8 = i - 1;
            i3 = iArr[i8];
            iArr[i8] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int i11 = (iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3)) & KotlinVersion.MAX_COMPONENT_VALUE;
            i9++;
            if (i11 > 127) {
                if ((i11 & 224) == 192) {
                    i4 = i11 & 31;
                    i5 = 1;
                } else if ((i11 & 240) == 224) {
                    i4 = i11 & 15;
                    i5 = 2;
                } else if ((i11 & 248) == 240) {
                    i4 = i11 & 7;
                    i5 = 3;
                } else {
                    _reportInvalidInitial(i11);
                    i4 = 1;
                    i5 = 1;
                }
                if (i9 + i5 > i7) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                int i12 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                i9++;
                if ((i12 & 192) != 128) {
                    _reportInvalidOther(i12);
                }
                int i13 = (i12 & 63) | (i4 << 6);
                if (i5 > 1) {
                    int i14 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                    i9++;
                    if ((i14 & 192) != 128) {
                        _reportInvalidOther(i14);
                    }
                    int i15 = (i13 << 6) | (i14 & 63);
                    if (i5 > 2) {
                        int i16 = iArr[i9 >> 2] >> ((3 - (i9 & 3)) << 3);
                        i9++;
                        if ((i16 & 192) != 128) {
                            _reportInvalidOther(i16 & KotlinVersion.MAX_COMPONENT_VALUE);
                        }
                        i11 = (i15 << 6) | (i16 & 63);
                    } else {
                        i6 = 2;
                        i11 = i15;
                        if (i5 > i6) {
                            int i17 = i11 - 65536;
                            if (i10 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                            }
                            emptyAndGetCurrentSegment[i10] = (char) ((i17 >> 10) + GeneratorBase.SURR1_FIRST);
                            i11 = (i17 & Place.TYPE_SUBLOCALITY_LEVEL_1) | GeneratorBase.SURR2_FIRST;
                            i10++;
                        }
                    }
                } else {
                    i11 = i13;
                }
                i6 = 2;
                if (i5 > i6) {
                }
            }
            if (i10 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            emptyAndGetCurrentSegment[i10] = (char) i11;
            i10++;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i10);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    private final String findName(int i, int i2) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i2);
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    private final String parseName(int i, int i2, int i3) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & UByte.MAX_VALUE;
            if (i2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (decodeBase64Char < 0) {
                    if (i2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i4 = bArr2[i3] & UByte.MAX_VALUE;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i4, 1);
                }
                int i5 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & UByte.MAX_VALUE;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            _getByteArrayBuilder.append(i5 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, i7, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        int i9 = bArr4[i8] & UByte.MAX_VALUE;
                        if (!base64Variant.usesPaddingChar(i9) && _decodeBase64Escape(base64Variant, i9, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i9, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        _getByteArrayBuilder.append(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr5[i11] & UByte.MAX_VALUE;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, i12, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i10 << 6) | decodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _decodeCharForError(int i) throws IOException {
        char c;
        int nextByte;
        int i2 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 > 127) {
            if ((i2 & 224) == 192) {
                i2 &= 31;
            } else {
                if ((i2 & 240) == 224) {
                    i2 &= 15;
                    c = 2;
                } else if ((i2 & 248) == 240) {
                    i2 &= 7;
                    c = 3;
                } else {
                    _reportInvalidInitial(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                nextByte = nextByte();
                if ((nextByte & 192) != 128) {
                    _reportInvalidOther(nextByte & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                int i3 = (i2 << 6) | (nextByte & 63);
                if (c <= 1) {
                    int nextByte2 = nextByte();
                    if ((nextByte2 & 192) != 128) {
                        _reportInvalidOther(nextByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                    int i4 = (i3 << 6) | (nextByte2 & 63);
                    if (c > 2) {
                        int nextByte3 = nextByte();
                        if ((nextByte3 & 192) != 128) {
                            _reportInvalidOther(nextByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
                        }
                        return (i4 << 6) | (nextByte3 & 63);
                    }
                    return i4;
                }
                return i3;
            }
            c = 1;
            nextByte = nextByte();
            if ((nextByte & 192) != 128) {
            }
            int i32 = (i2 << 6) | (nextByte & 63);
            if (c <= 1) {
            }
        } else {
            return i2;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b != 34 && b != 47 && b != 92) {
            if (b != 98) {
                if (b != 102) {
                    if (b != 110) {
                        if (b != 114) {
                            if (b != 116) {
                                if (b != 117) {
                                    return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
                                }
                                int i2 = 0;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                                        _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
                                    }
                                    byte[] bArr2 = this._inputBuffer;
                                    int i4 = this._inputPtr;
                                    this._inputPtr = i4 + 1;
                                    byte b2 = bArr2[i4];
                                    int charToHex = CharTypes.charToHex(b2);
                                    if (charToHex < 0) {
                                        _reportUnexpectedChar(b2 & UByte.MAX_VALUE, "expected a hex-digit for character escape sequence");
                                    }
                                    i2 = (i2 << 4) | charToHex;
                                }
                                return (char) i2;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return (char) b;
    }

    public String _finishAndReturnString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & UByte.MAX_VALUE;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    this._inputPtr = i + 1;
                    return this._textBuffer.setCurrentAndReturn(i2);
                }
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & UByte.MAX_VALUE;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    this._inputPtr = i + 1;
                    this._textBuffer.setCurrentLength(i2);
                    return;
                }
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int m52076id = jsonToken.m52076id();
        if (m52076id != 5) {
            if (m52076id != 6 && m52076id != 7 && m52076id != 8) {
                return jsonToken.asString();
            }
            return this._textBuffer.contentsAsString();
        }
        return this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this._inputPtr;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    this._inputPtr = i4;
                    int i5 = bArr[i3] & UByte.MAX_VALUE;
                    if (i5 == 39) {
                        this._textBuffer.setCurrentLength(i);
                        return JsonToken.VALUE_STRING;
                    }
                    int i6 = iArr[i5];
                    if (i6 != 0 && i5 != 34) {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        if (i5 < 32) {
                                            _throwUnquotedSpace(i5, "string value");
                                        }
                                        _reportInvalidChar(i5);
                                    } else {
                                        int _decodeUtf8_4 = _decodeUtf8_4(i5);
                                        int i7 = i + 1;
                                        emptyAndGetCurrentSegment[i] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                        if (i7 >= emptyAndGetCurrentSegment.length) {
                                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                            i = 0;
                                        } else {
                                            i = i7;
                                        }
                                        i5 = 56320 | (_decodeUtf8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1);
                                    }
                                } else if (this._inputEnd - i4 >= 2) {
                                    i5 = _decodeUtf8_3fast(i5);
                                } else {
                                    i5 = _decodeUtf8_3(i5);
                                }
                            } else {
                                i5 = _decodeUtf8_2(i5);
                            }
                        } else {
                            i5 = _decodeEscaped();
                        }
                        if (i >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i = 0;
                        }
                        emptyAndGetCurrentSegment[i] = (char) i5;
                        i++;
                    } else {
                        emptyAndGetCurrentSegment[i] = (char) i5;
                        i++;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z) throws IOException {
        String str;
        double d;
        while (i == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
            if (i == 78) {
                if (z) {
                    str = "-INF";
                } else {
                    str = "+INF";
                }
            } else if (i != 110) {
                break;
            } else if (z) {
                str = "-Infinity";
            } else {
                str = "+Infinity";
            }
            _matchToken(str, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                if (z) {
                    d = Double.NEGATIVE_INFINITY;
                } else {
                    d = Double.POSITIVE_INFINITY;
                }
                return resetAsNaN(str, d);
            }
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public String _handleOddName(int i) throws IOException {
        if (i == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            i = bArr[i5] & UByte.MAX_VALUE;
            if (inputCodeUtf8JsNames[i] != 0) {
                break;
            }
            this._inputPtr = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = growArrayBy;
                iArr = growArrayBy;
            }
            iArr[i3] = i4;
            i3++;
        }
        String findName = this._symbols.findName(iArr, i3);
        if (findName == null) {
            return addName(iArr, i3, i2);
        }
        return findName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r3._parsingContext.inArray() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r3._parsingContext.inRoot() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _handleUnexpectedValue(int i) throws IOException {
        if (i != 39) {
            if (i != 73) {
                if (i != 78) {
                    if (i != 93) {
                        if (i != 125) {
                            if (i == 43) {
                                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                                    _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                                }
                                byte[] bArr = this._inputBuffer;
                                int i2 = this._inputPtr;
                                this._inputPtr = i2 + 1;
                                return _handleInvalidNumberStart(bArr[i2] & UByte.MAX_VALUE, false);
                            }
                        }
                    }
                    _reportUnexpectedChar(i, "expected a value");
                } else {
                    _matchToken("NaN", 1);
                    if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                        return resetAsNaN("NaN", Double.NaN);
                    }
                    _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                }
            } else {
                _matchToken("Infinity", 1);
                if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                    return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
            if (Character.isJavaIdentifierStart(i)) {
                _reportInvalidToken("" + ((char) i), _validJsonTokenList());
            }
            _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
            return null;
        }
        if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _handleApos();
        }
        if (Character.isJavaIdentifierStart(i)) {
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    public final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read > 0) {
            int i = this._inputEnd;
            this._currInputProcessed += i;
            this._currInputRowStart -= i;
            this._nameStartOffset -= i;
            this._inputPtr = 0;
            this._inputEnd = read;
            return true;
        }
        _closeInput();
        if (read == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
        }
        return false;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchFalse() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & UByte.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    public final void _matchNull() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & UByte.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    public final void _matchToken(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        int i3 = this._inputBuffer[i2] & UByte.MAX_VALUE;
        if (i3 >= 48 && i3 != 93 && i3 != 125) {
            _checkMatchEnd(str, i, i3);
        }
    }

    public final void _matchTrue() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & UByte.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    public String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        if (i2 == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 != 39) {
            if (iArr2[i2] != 0 && i2 != 34) {
                if (i2 != 92) {
                    _throwUnquotedSpace(i2, "name");
                } else {
                    i2 = _decodeEscaped();
                }
                if (i2 > 127) {
                    if (i3 >= 4) {
                        if (i4 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i4] = i5;
                        i5 = 0;
                        i4++;
                        i3 = 0;
                    }
                    if (i2 < 2048) {
                        i5 = (i5 << 8) | (i2 >> 6) | 192;
                        i3++;
                    } else {
                        int i6 = (i5 << 8) | (i2 >> 12) | 224;
                        int i7 = i3 + 1;
                        if (i7 >= 4) {
                            if (i4 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i4] = i6;
                            i6 = 0;
                            i4++;
                            i7 = 0;
                        }
                        i5 = (i6 << 8) | ((i2 >> 6) & 63) | 128;
                        i3 = i7 + 1;
                    }
                    i2 = (i2 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i5 = i2 | (i5 << 8);
            } else {
                if (i4 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i4] = i5;
                i5 = i2;
                i4++;
                i3 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i2 = bArr2[i8] & UByte.MAX_VALUE;
        }
        if (i3 > 0) {
            if (i4 >= iArr.length) {
                int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = growArrayBy;
                iArr = growArrayBy;
            }
            iArr[i4] = _padLastQuad(i5, i3);
            i4++;
        }
        String findName = this._symbols.findName(iArr, i4);
        if (findName == null) {
            return addName(iArr, i4, i3);
        }
        return findName;
    }

    public final JsonToken _parseFloatThatStartsWithPeriod() throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        return _parseFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46, false, 0);
    }

    public final String _parseName(int i) throws IOException {
        if (i != 34) {
            return _handleOddName(i);
        }
        int i2 = this._inputPtr;
        if (i2 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & UByte.MAX_VALUE;
        if (iArr[i4] == 0) {
            int i5 = i3 + 1;
            this._inputPtr = i5;
            int i6 = bArr[i3] & UByte.MAX_VALUE;
            if (iArr[i6] == 0) {
                int i7 = (i4 << 8) | i6;
                int i8 = i5 + 1;
                this._inputPtr = i8;
                int i9 = bArr[i5] & UByte.MAX_VALUE;
                if (iArr[i9] == 0) {
                    int i10 = (i7 << 8) | i9;
                    int i11 = i8 + 1;
                    this._inputPtr = i11;
                    int i12 = bArr[i8] & UByte.MAX_VALUE;
                    if (iArr[i12] == 0) {
                        int i13 = (i10 << 8) | i12;
                        this._inputPtr = i11 + 1;
                        int i14 = bArr[i11] & UByte.MAX_VALUE;
                        if (iArr[i14] == 0) {
                            this._quad1 = i13;
                            return parseMediumName(i14);
                        } else if (i14 == 34) {
                            return findName(i13, 4);
                        } else {
                            return parseName(i13, i14, 4);
                        }
                    } else if (i12 == 34) {
                        return findName(i10, 3);
                    } else {
                        return parseName(i10, i12, 3);
                    }
                } else if (i9 == 34) {
                    return findName(i7, 2);
                } else {
                    return parseName(i7, i9, 2);
                }
            } else if (i6 == 34) {
                return findName(i4, 1);
            } else {
                return parseName(i4, i6, 1);
            }
        } else if (i4 == 34) {
            return "";
        } else {
            return parseName(0, i4, 0);
        }
    }

    public JsonToken _parseNegNumber() throws IOException {
        int i;
        int i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = CoreConstants.DASH_CHAR;
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & UByte.MAX_VALUE;
        if (i4 <= 48) {
            if (i4 != 48) {
                return _handleInvalidNumberStart(i4, true);
            }
            i4 = _verifyNoLeadingZeroes();
        } else if (i4 > 57) {
            return _handleInvalidNumberStart(i4, true);
        }
        emptyAndGetCurrentSegment[1] = (char) i4;
        int i5 = 2;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i6 = 1;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i5, true, i6);
            }
            byte[] bArr2 = this._inputBuffer;
            i = i7 + 1;
            this._inputPtr = i;
            i2 = bArr2[i7] & UByte.MAX_VALUE;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i6++;
            emptyAndGetCurrentSegment[i5] = (char) i2;
            i5++;
        }
        if (i2 != 46 && i2 != 101 && i2 != 69) {
            this._inputPtr = i - 1;
            this._textBuffer.setCurrentLength(i5);
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
            return resetInt(true, i6);
        }
        return _parseFloat(emptyAndGetCurrentSegment, i5, i2, true, i6);
    }

    public JsonToken _parsePosNumber(int i) throws IOException {
        int i2;
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i4, false, i5);
            }
            byte[] bArr = this._inputBuffer;
            i2 = i6 + 1;
            this._inputPtr = i2;
            i3 = bArr[i6] & UByte.MAX_VALUE;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            emptyAndGetCurrentSegment[i4] = (char) i3;
            i4++;
        }
        if (i3 != 46 && i3 != 101 && i3 != 69) {
            this._inputPtr = i2 - 1;
            this._textBuffer.setCurrentLength(i4);
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i3);
            }
            return resetInt(false, i5);
        }
        return _parseFloat(emptyAndGetCurrentSegment, i4, i3, false, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
        r16._tokenIncomplete = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
        if (r7 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
        r8 = r8 + r7;
        r18.write(r19, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = 3;
        int length = bArr.length - 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr2[i5] & UByte.MAX_VALUE;
            if (i6 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i6);
                if (decodeBase64Char < 0) {
                    if (i6 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i6, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (i3 > length) {
                    i4 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & UByte.MAX_VALUE;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i8);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i8, 1);
                }
                int i9 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                int i11 = bArr4[i10] & UByte.MAX_VALUE;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i11);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i11 == 34) {
                            int i12 = i3 + 1;
                            bArr[i3] = (byte) (i9 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i3 = i12;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, i11, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        int i14 = bArr5[i13] & UByte.MAX_VALUE;
                        if (!base64Variant.usesPaddingChar(i14) && _decodeBase64Escape(base64Variant, i14, i2) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i14, i2, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i3] = (byte) (i9 >> 4);
                        i3++;
                    }
                }
                int i15 = (i9 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                int i17 = bArr6[i16] & UByte.MAX_VALUE;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i17);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i17 == 34) {
                            int i18 = i15 >> 2;
                            int i19 = i3 + 1;
                            bArr[i3] = (byte) (i18 >> 8);
                            i3 = i19 + 1;
                            bArr[i19] = (byte) i18;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            i = 3;
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, i17, 3);
                        }
                    } else {
                        i = 3;
                    }
                    if (decodeBase64Char4 == -2) {
                        int i20 = i15 >> 2;
                        int i21 = i3 + 1;
                        bArr[i3] = (byte) (i20 >> 8);
                        i3 = i21 + 1;
                        bArr[i21] = (byte) i20;
                        i2 = i;
                    }
                } else {
                    i = 3;
                }
                int i22 = (i15 << 6) | decodeBase64Char4;
                int i23 = i3 + 1;
                bArr[i3] = (byte) (i22 >> 16);
                int i24 = i23 + 1;
                bArr[i23] = (byte) (i22 >> 8);
                bArr[i24] = (byte) i22;
                i3 = i24 + 1;
                i2 = i;
            }
            i = i2;
            i2 = i;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (bArr = this._inputBuffer) != null && bArr != (bArr2 = ParserMinimalBase.NO_BYTES)) {
            this._inputBuffer = bArr2;
            this._ioContext.releaseReadIOBuffer(bArr);
        }
    }

    public void _reportInvalidChar(int i) throws JsonParseException {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    public void _reportInvalidInitial(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidToken(String str, int i) throws IOException {
        this._inputPtr = i;
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            if (bArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i] & UByte.MAX_VALUE;
                    int i5 = iArr[i4];
                    if (i5 != 0) {
                        this._inputPtr = i3;
                        if (i4 == 34) {
                            return;
                        }
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        if (i4 < 32) {
                                            _throwUnquotedSpace(i4, "string value");
                                        } else {
                                            _reportInvalidChar(i4);
                                        }
                                    } else {
                                        _skipUtf8_4(i4);
                                    }
                                } else {
                                    _skipUtf8_3();
                                }
                            } else {
                                _skipUtf8_2();
                            }
                        } else {
                            _decodeEscaped();
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    this._inputPtr = i;
                    break;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputStream;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int m52076id = jsonToken.m52076id();
            if (m52076id != 5) {
                if (m52076id != 6) {
                    if (m52076id != 7 && m52076id != 8) {
                        return this._currToken.asCharArray();
                    }
                } else if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.getTextBuffer();
            }
            if (!this._nameCopied) {
                String currentName = this._parsingContext.getCurrentName();
                int length = currentName.length();
                char[] cArr = this._nameCopyBuffer;
                if (cArr == null) {
                    this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
                } else if (cArr.length < length) {
                    this._nameCopyBuffer = new char[length];
                }
                currentName.getChars(0, length, this._nameCopyBuffer, 0);
                this._nameCopied = true;
            }
            return this._nameCopyBuffer;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int m52076id = jsonToken.m52076id();
        if (m52076id != 5) {
            if (m52076id != 6) {
                if (m52076id != 7 && m52076id != 8) {
                    return this._currToken.asCharArray().length;
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        return this._parsingContext.getCurrentName().length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 != 8) goto L15;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int m52076id = jsonToken.m52076id();
            if (m52076id != 6) {
                if (m52076id != 7) {
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if ((i & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean nextBooleanValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        JsonToken nextToken = nextToken();
        if (nextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (nextToken != JsonToken.VALUE_FALSE) {
            return null;
        }
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return false;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return false;
            }
            _updateNameLocation();
            if (_skipWSOrEnd == 34) {
                byte[] asQuotedUTF8 = serializableString.asQuotedUTF8();
                int length = asQuotedUTF8.length;
                int i2 = this._inputPtr;
                if (i2 + length + 4 < this._inputEnd) {
                    int i3 = length + i2;
                    if (this._inputBuffer[i3] == 34) {
                        while (i2 != i3) {
                            if (asQuotedUTF8[i] == this._inputBuffer[i2]) {
                                i++;
                                i2++;
                            }
                        }
                        this._parsingContext.setCurrentName(serializableString.getValue());
                        _isNextTokenNameYes(_skipColonFast(i2 + 1));
                        return true;
                    }
                }
            }
            return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int nextIntValue(int i) throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return i;
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        } else {
            return i;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j) throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return j;
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        } else {
            return j;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    return _finishAndReturnString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        } else if (nextToken() != JsonToken.VALUE_STRING) {
            return null;
        } else {
            return getText();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken _parseNegNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    return _closeScope(_skipWSOrEnd);
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            _updateNameLocation();
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon != 45) {
                if (_skipColon != 46) {
                    if (_skipColon != 91) {
                        if (_skipColon != 102) {
                            if (_skipColon != 110) {
                                if (_skipColon != 116) {
                                    if (_skipColon != 123) {
                                        switch (_skipColon) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                _parseNegNumber = _parsePosNumber(_skipColon);
                                                break;
                                            default:
                                                _parseNegNumber = _handleUnexpectedValue(_skipColon);
                                                break;
                                        }
                                    } else {
                                        _parseNegNumber = JsonToken.START_OBJECT;
                                    }
                                } else {
                                    _matchTrue();
                                    _parseNegNumber = JsonToken.VALUE_TRUE;
                                }
                            } else {
                                _matchNull();
                                _parseNegNumber = JsonToken.VALUE_NULL;
                            }
                        } else {
                            _matchFalse();
                            _parseNegNumber = JsonToken.VALUE_FALSE;
                        }
                    } else {
                        _parseNegNumber = JsonToken.START_ARRAY;
                    }
                } else {
                    _parseNegNumber = _parseFloatThatStartsWithPeriod();
                }
            } else {
                _parseNegNumber = _parseNegNumber();
            }
            this._nextToken = _parseNegNumber;
            return this._currToken;
        }
    }

    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i3 = bArr[i8] & UByte.MAX_VALUE;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i] = _padLastQuad(i2, i4);
            i++;
        }
        String findName = this._symbols.findName(iArr, i);
        if (findName == null) {
            return addName(iArr, i, i4);
        }
        return findName;
    }

    public final String parseLongName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 + 4 <= this._inputEnd) {
                int i7 = i6 + 1;
                this._inputPtr = i7;
                int i8 = bArr[i6] & UByte.MAX_VALUE;
                if (iArr2[i8] != 0) {
                    if (i8 == 34) {
                        return findName(this._quadBuffer, i5, i4, 1);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i4, i8, 1);
                }
                int i9 = (i4 << 8) | i8;
                int i10 = i7 + 1;
                this._inputPtr = i10;
                int i11 = bArr[i7] & UByte.MAX_VALUE;
                if (iArr2[i11] != 0) {
                    if (i11 == 34) {
                        return findName(this._quadBuffer, i5, i9, 2);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i9, i11, 2);
                }
                int i12 = (i9 << 8) | i11;
                int i13 = i10 + 1;
                this._inputPtr = i13;
                int i14 = bArr[i10] & UByte.MAX_VALUE;
                if (iArr2[i14] != 0) {
                    if (i14 == 34) {
                        return findName(this._quadBuffer, i5, i12, 3);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i12, i14, 3);
                }
                int i15 = (i12 << 8) | i14;
                this._inputPtr = i13 + 1;
                int i16 = bArr[i13] & UByte.MAX_VALUE;
                if (iArr2[i16] != 0) {
                    if (i16 == 34) {
                        return findName(this._quadBuffer, i5, i15, 4);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i15, i16, 4);
                }
                int[] iArr3 = this._quadBuffer;
                if (i5 >= iArr3.length) {
                    this._quadBuffer = ParserBase.growArrayBy(iArr3, i5);
                }
                this._quadBuffer[i5] = i15;
                i4 = i16;
                i5++;
            } else {
                return parseEscapedName(this._quadBuffer, i5, 0, i4, 0);
            }
        }
    }

    public final String parseMediumName(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & UByte.MAX_VALUE;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return findName(this._quad1, i, 1);
            }
            return parseName(this._quad1, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i3 + 1;
        this._inputPtr = i6;
        int i7 = bArr[i3] & UByte.MAX_VALUE;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                return findName(this._quad1, i5, 2);
            }
            return parseName(this._quad1, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i6 + 1;
        this._inputPtr = i9;
        int i10 = bArr[i6] & UByte.MAX_VALUE;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                return findName(this._quad1, i8, 3);
            }
            return parseName(this._quad1, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this._inputPtr = i9 + 1;
        int i12 = bArr[i9] & UByte.MAX_VALUE;
        if (iArr[i12] != 0) {
            if (i12 == 34) {
                return findName(this._quad1, i11, 4);
            }
            return parseName(this._quad1, i11, i12, 4);
        }
        return parseMediumName2(i12, i11);
    }

    public final String parseMediumName2(int i, int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & UByte.MAX_VALUE;
        if (iArr[i5] != 0) {
            if (i5 == 34) {
                return findName(this._quad1, i2, i, 1);
            }
            return parseName(this._quad1, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i4 + 1;
        this._inputPtr = i7;
        int i8 = bArr[i4] & UByte.MAX_VALUE;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                return findName(this._quad1, i2, i6, 2);
            }
            return parseName(this._quad1, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        this._inputPtr = i10;
        int i11 = bArr[i7] & UByte.MAX_VALUE;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                return findName(this._quad1, i2, i9, 3);
            }
            return parseName(this._quad1, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this._inputPtr = i10 + 1;
        int i13 = bArr[i10] & UByte.MAX_VALUE;
        if (iArr[i13] != 0) {
            if (i13 == 34) {
                return findName(this._quad1, i2, i12, 4);
            }
            return parseName(this._quad1, i2, i12, i13, 4);
        }
        return parseLongName(i13, i2, i12);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (this._tokenIncomplete && this._currToken == JsonToken.VALUE_STRING) {
            byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
            try {
                return _readBinary(base64Variant, outputStream, allocBase64Buffer);
            } finally {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            }
        }
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        this._inputPtr = i2 + i3;
        outputStream.write(this._inputBuffer, i2, i3);
        return i3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        if (i2 == 34) {
            return "";
        }
        return parseEscapedName(this._quadBuffer, 0, 0, i2, 0);
    }

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(iOContext, i);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2 - i4;
        this._currInputProcessed = (-i2) + i4;
        this._bufferRecyclable = z;
    }

    private final String parseName(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    public void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        } else if (jsonToken != null) {
            if (jsonToken.isNumeric()) {
                return this._textBuffer.contentsToWriter(writer);
            }
            char[] asCharArray = jsonToken.asCharArray();
            writer.write(asCharArray);
            return asCharArray.length;
        } else {
            return 0;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    private final String findName(int i, int i2, int i3, int i4) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _parseName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                _parseNegNumber = _parseNegNumber();
            } else if (_skipColon == 46) {
                _parseNegNumber = _parseFloatThatStartsWithPeriod();
            } else if (_skipColon == 91) {
                _parseNegNumber = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                _parseNegNumber = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                _parseNegNumber = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                _parseNegNumber = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        _parseNegNumber = _parsePosNumber(_skipColon);
                        break;
                    default:
                        _parseNegNumber = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                _parseNegNumber = JsonToken.START_OBJECT;
            }
            this._nextToken = _parseNegNumber;
            return _parseName;
        }
    }
}
