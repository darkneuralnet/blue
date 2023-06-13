package com.fasterxml.jackson.core.json;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.p030io.CharTypes;
import com.fasterxml.jackson.core.p030io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.google.android.gms.location.places.Place;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import kotlin.KotlinVersion;
/* loaded from: classes5.dex */
public class UTF8DataInputJsonParser extends ParserBase {
    static final byte BYTE_LF = 10;
    protected DataInput _inputData;
    protected int _nextByte;
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

    public UTF8DataInputJsonParser(IOContext iOContext, int i, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i2) {
        super(iOContext, i);
        this._quadBuffer = new int[16];
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i2;
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        char _decodeCharForError = (char) _decodeCharForError(i2);
        if (Character.isJavaIdentifierPart(_decodeCharForError)) {
            _reportInvalidToken(_decodeCharForError, str.substring(0, i));
        }
    }

    private void _closeScope(int i) throws JsonParseException {
        if (i == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i, CoreConstants.CURLY_RIGHT);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return ((i & 31) << 6) | (readUnsignedByte & 63);
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        int i2 = i & 15;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i3 = (i2 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return (i3 << 6) | (readUnsignedByte2 & 63);
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i2 = ((i & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i3 = (i2 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return ((i3 << 6) | (readUnsignedByte3 & 63)) - 65536;
    }

    private String _finishAndReturnString() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return this._textBuffer.setCurrentAndReturn(i);
                }
                _finishString2(emptyAndGetCurrentSegment, i, readUnsignedByte);
                return this._textBuffer.contentsAsString();
            }
            int i2 = i + 1;
            emptyAndGetCurrentSegment[i] = (char) readUnsignedByte;
            if (i2 >= length) {
                _finishString2(emptyAndGetCurrentSegment, i2, this._inputData.readUnsignedByte());
                return this._textBuffer.contentsAsString();
            }
            i = i2;
        }
    }

    private final void _finishString2(char[] cArr, int i, int i2) throws IOException {
        int[] iArr = _icUTF8;
        int length = cArr.length;
        while (true) {
            int i3 = iArr[i2];
            int i4 = 0;
            if (i3 == 0) {
                if (i >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
                i++;
            } else if (i2 == 34) {
                this._textBuffer.setCurrentLength(i);
                return;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i2 < 32) {
                                    _throwUnquotedSpace(i2, "string value");
                                } else {
                                    _reportInvalidChar(i2);
                                }
                            } else {
                                int _decodeUtf8_4 = _decodeUtf8_4(i2);
                                if (i >= cArr.length) {
                                    cArr = this._textBuffer.finishCurrentSegment();
                                    length = cArr.length;
                                    i = 0;
                                }
                                cArr[i] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                i2 = 56320 | (_decodeUtf8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1);
                                i++;
                            }
                        } else {
                            i2 = _decodeUtf8_3(i2);
                        }
                    } else {
                        i2 = _decodeUtf8_2(i2);
                    }
                } else {
                    i2 = _decodeEscaped();
                }
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                cArr[i4] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
            }
        }
    }

    private static int[] _growArrayBy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    private final int _handleLeadingZeroes() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this._inputData.readUnsignedByte();
            }
        }
        return readUnsignedByte;
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
                            _matchToken("true", 1);
                            JsonToken jsonToken3 = JsonToken.VALUE_TRUE;
                            this._currToken = jsonToken3;
                            return jsonToken3;
                        }
                        _matchToken("null", 1);
                        JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                        this._currToken = jsonToken4;
                        return jsonToken4;
                    }
                    _matchToken("false", 1);
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

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        int i5;
        int readUnsignedByte;
        int i6 = 0;
        if (i2 == 46) {
            cArr[i] = (char) i2;
            i++;
            int i7 = 0;
            while (true) {
                readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte < 48 || readUnsignedByte > 57) {
                    break;
                }
                i7++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) readUnsignedByte;
                i++;
            }
            if (i7 == 0) {
                reportUnexpectedNumberChar(readUnsignedByte, "Decimal point not followed by a digit");
            }
            i4 = i7;
            i2 = readUnsignedByte;
        } else {
            i4 = 0;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i8 = i + 1;
            cArr[i] = (char) i2;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 != 45 && readUnsignedByte2 != 43) {
                i2 = readUnsignedByte2;
                i = i8;
                i5 = 0;
            } else {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i9 = i8 + 1;
                cArr[i8] = (char) readUnsignedByte2;
                i5 = 0;
                i2 = this._inputData.readUnsignedByte();
                i = i9;
            }
            while (i2 <= 57 && i2 >= 48) {
                i5++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this._inputData.readUnsignedByte();
                i++;
            }
            if (i5 == 0) {
                reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
            i6 = i5;
        }
        this._nextByte = i2;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i6);
    }

    private final String _parseLongName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = _icLatin1;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return findName(this._quadBuffer, i5, i4, 1);
                }
                return parseEscapedName(this._quadBuffer, i5, i4, readUnsignedByte, 1);
            }
            int i6 = (i4 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte2] != 0) {
                if (readUnsignedByte2 == 34) {
                    return findName(this._quadBuffer, i5, i6, 2);
                }
                return parseEscapedName(this._quadBuffer, i5, i6, readUnsignedByte2, 2);
            }
            int i7 = (i6 << 8) | readUnsignedByte2;
            int readUnsignedByte3 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte3] != 0) {
                if (readUnsignedByte3 == 34) {
                    return findName(this._quadBuffer, i5, i7, 3);
                }
                return parseEscapedName(this._quadBuffer, i5, i7, readUnsignedByte3, 3);
            }
            int i8 = (i7 << 8) | readUnsignedByte3;
            int readUnsignedByte4 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte4] != 0) {
                if (readUnsignedByte4 == 34) {
                    return findName(this._quadBuffer, i5, i8, 4);
                }
                return parseEscapedName(this._quadBuffer, i5, i8, readUnsignedByte4, 4);
            }
            int[] iArr3 = this._quadBuffer;
            if (i5 >= iArr3.length) {
                this._quadBuffer = _growArrayBy(iArr3, i5);
            }
            this._quadBuffer[i5] = i8;
            i5++;
            i4 = readUnsignedByte4;
        }
    }

    private final String _parseMediumName(int i) throws IOException {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            if (readUnsignedByte == 34) {
                return findName(this._quad1, i, 1);
            }
            return parseName(this._quad1, i, readUnsignedByte, 1);
        }
        int i2 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i2, 2);
            }
            return parseName(this._quad1, i2, readUnsignedByte2, 2);
        }
        int i3 = (i2 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            if (readUnsignedByte3 == 34) {
                return findName(this._quad1, i3, 3);
            }
            return parseName(this._quad1, i3, readUnsignedByte3, 3);
        }
        int i4 = (i3 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            if (readUnsignedByte4 == 34) {
                return findName(this._quad1, i4, 4);
            }
            return parseName(this._quad1, i4, readUnsignedByte4, 4);
        }
        return _parseMediumName2(readUnsignedByte4, i4);
    }

    private final String _parseMediumName2(int i, int i2) throws IOException {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            if (readUnsignedByte == 34) {
                return findName(this._quad1, i2, i, 1);
            }
            return parseName(this._quad1, i2, i, readUnsignedByte, 1);
        }
        int i3 = (i << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            if (readUnsignedByte2 == 34) {
                return findName(this._quad1, i2, i3, 2);
            }
            return parseName(this._quad1, i2, i3, readUnsignedByte2, 2);
        }
        int i4 = (i3 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            if (readUnsignedByte3 == 34) {
                return findName(this._quad1, i2, i4, 3);
            }
            return parseName(this._quad1, i2, i4, readUnsignedByte3, 3);
        }
        int i5 = (i4 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            if (readUnsignedByte4 == 34) {
                return findName(this._quad1, i2, i5, 4);
            }
            return parseName(this._quad1, i2, i5, readUnsignedByte4, 4);
        }
        return _parseLongName(readUnsignedByte4, i2, i5);
    }

    private void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int readUnsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i = inputCodeComment[readUnsignedByte];
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 10 && i != 13) {
                                if (i != 42) {
                                    _reportInvalidChar(readUnsignedByte);
                                } else {
                                    readUnsignedByte = this._inputData.readUnsignedByte();
                                    if (readUnsignedByte == 47) {
                                        return;
                                    }
                                }
                            } else {
                                this._currInputRow++;
                            }
                        } else {
                            _skipUtf8_4();
                        }
                    } else {
                        _skipUtf8_3();
                    }
                } else {
                    _skipUtf8_2();
                }
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            i = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (i == 58) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte > 32) {
                if (readUnsignedByte != 47 && readUnsignedByte != 35) {
                    return readUnsignedByte;
                }
                return _skipColon2(readUnsignedByte, true);
            } else if ((readUnsignedByte == 32 || readUnsignedByte == 9) && (readUnsignedByte = this._inputData.readUnsignedByte()) > 32) {
                if (readUnsignedByte != 47 && readUnsignedByte != 35) {
                    return readUnsignedByte;
                }
                return _skipColon2(readUnsignedByte, true);
            } else {
                return _skipColon2(readUnsignedByte, true);
            }
        }
        if (i == 32 || i == 9) {
            i = this._inputData.readUnsignedByte();
        }
        if (i == 58) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                if (readUnsignedByte2 != 47 && readUnsignedByte2 != 35) {
                    return readUnsignedByte2;
                }
                return _skipColon2(readUnsignedByte2, true);
            } else if ((readUnsignedByte2 == 32 || readUnsignedByte2 == 9) && (readUnsignedByte2 = this._inputData.readUnsignedByte()) > 32) {
                if (readUnsignedByte2 != 47 && readUnsignedByte2 != 35) {
                    return readUnsignedByte2;
                }
                return _skipColon2(readUnsignedByte2, true);
            } else {
                return _skipColon2(readUnsignedByte2, true);
            }
        }
        return _skipColon2(i, false);
    }

    private final int _skipColon2(int i, boolean z) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 47) {
            _skipLine();
        } else if (readUnsignedByte == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i = inputCodeComment[readUnsignedByte];
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 10 || i == 13) {
                                break;
                            } else if (i != 42 && i < 0) {
                                _reportInvalidChar(readUnsignedByte);
                            }
                        } else {
                            _skipUtf8_4();
                        }
                    } else {
                        _skipUtf8_3();
                    }
                } else {
                    _skipUtf8_2();
                }
            }
        }
        this._currInputRow++;
    }

    private final void _skipUtf8_2() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final void _skipUtf8_4() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final int _skipWS() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            i = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
        if (i != 47 && i != 35) {
            return i;
        }
        return _skipWSComment(i);
    }

    private final int _skipWSComment(int i) throws IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    _skipComment();
                } else if (i != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            i = this._inputData.readUnsignedByte();
        }
        return i;
    }

    private final int _skipWSOrEnd() throws IOException {
        int i = this._nextByte;
        if (i < 0) {
            try {
                i = this._inputData.readUnsignedByte();
            } catch (EOFException unused) {
                return _eofAsNextChar();
            }
        } else {
            this._nextByte = -1;
        }
        while (i <= 32) {
            if (i == 13 || i == 10) {
                this._currInputRow++;
            }
            try {
                i = this._inputData.readUnsignedByte();
            } catch (EOFException unused2) {
                return _eofAsNextChar();
            }
        }
        if (i != 47 && i != 35) {
            return i;
        }
        return _skipWSComment(i);
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _verifyRootSpace() throws IOException {
        int i = this._nextByte;
        if (i <= 32) {
            this._nextByte = -1;
            if (i == 13 || i == 10) {
                this._currInputRow++;
                return;
            }
            return;
        }
        _reportMissingRootWS(i);
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
        int pad = pad(i, i2);
        String findName = this._symbols.findName(pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = pad;
        return addName(iArr, 1, i2);
    }

    private static final int pad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    private final String parseName(int i, int i2, int i3) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        int readUnsignedByte;
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 1);
                }
                int i = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            _getByteArrayBuilder.append(i >> 4);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && _decodeBase64Escape(base64Variant, readUnsignedByte, 3) == -2)) {
                            _getByteArrayBuilder.append(i >> 4);
                        }
                    }
                }
                int i2 = (i << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i2 >> 2);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i2 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i2 << 6) | decodeBase64Char4);
            }
        }
        throw reportInvalidBase64Char(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _decodeCharForError(int i) throws IOException {
        char c;
        int readUnsignedByte;
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
                readUnsignedByte = this._inputData.readUnsignedByte();
                if ((readUnsignedByte & 192) != 128) {
                    _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
                }
                int i3 = (i2 << 6) | (readUnsignedByte & 63);
                if (c <= 1) {
                    int readUnsignedByte2 = this._inputData.readUnsignedByte();
                    if ((readUnsignedByte2 & 192) != 128) {
                        _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                    int i4 = (i3 << 6) | (readUnsignedByte2 & 63);
                    if (c > 2) {
                        int readUnsignedByte3 = this._inputData.readUnsignedByte();
                        if ((readUnsignedByte3 & 192) != 128) {
                            _reportInvalidOther(readUnsignedByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
                        }
                        return (i4 << 6) | (readUnsignedByte3 & 63);
                    }
                    return i4;
                }
                return i3;
            }
            c = 1;
            readUnsignedByte = this._inputData.readUnsignedByte();
            if ((readUnsignedByte & 192) != 128) {
            }
            int i32 = (i2 << 6) | (readUnsignedByte & 63);
            if (c <= 1) {
            }
        } else {
            return i2;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte != 34 && readUnsignedByte != 47 && readUnsignedByte != 92) {
            if (readUnsignedByte != 98) {
                if (readUnsignedByte != 102) {
                    if (readUnsignedByte != 110) {
                        if (readUnsignedByte != 114) {
                            if (readUnsignedByte != 116) {
                                if (readUnsignedByte != 117) {
                                    return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(readUnsignedByte));
                                }
                                int i = 0;
                                for (int i2 = 0; i2 < 4; i2++) {
                                    int readUnsignedByte2 = this._inputData.readUnsignedByte();
                                    int charToHex = CharTypes.charToHex(readUnsignedByte2);
                                    if (charToHex < 0) {
                                        _reportUnexpectedChar(readUnsignedByte2, "expected a hex-digit for character escape sequence");
                                    }
                                    i = (i << 4) | charToHex;
                                }
                                return (char) i;
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
        return (char) readUnsignedByte;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    this._textBuffer.setCurrentLength(i);
                    return;
                } else {
                    _finishString2(emptyAndGetCurrentSegment, i, readUnsignedByte);
                    return;
                }
            }
            int i2 = i + 1;
            emptyAndGetCurrentSegment[i] = (char) readUnsignedByte;
            if (i2 >= length) {
                _finishString2(emptyAndGetCurrentSegment, i2, this._inputData.readUnsignedByte());
                return;
            }
            i = i2;
        }
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
        int i = 0;
        while (true) {
            int length = emptyAndGetCurrentSegment.length;
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = emptyAndGetCurrentSegment.length;
                i = 0;
            }
            while (true) {
                int readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte == 39) {
                    this._textBuffer.setCurrentLength(i);
                    return JsonToken.VALUE_STRING;
                }
                int i2 = iArr[readUnsignedByte];
                if (i2 != 0 && readUnsignedByte != 34) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (readUnsignedByte < 32) {
                                        _throwUnquotedSpace(readUnsignedByte, "string value");
                                    }
                                    _reportInvalidChar(readUnsignedByte);
                                } else {
                                    int _decodeUtf8_4 = _decodeUtf8_4(readUnsignedByte);
                                    int i3 = i + 1;
                                    emptyAndGetCurrentSegment[i] = (char) ((_decodeUtf8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                    if (i3 >= emptyAndGetCurrentSegment.length) {
                                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                        i = 0;
                                    } else {
                                        i = i3;
                                    }
                                    readUnsignedByte = 56320 | (_decodeUtf8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1);
                                }
                            } else {
                                readUnsignedByte = _decodeUtf8_3(readUnsignedByte);
                            }
                        } else {
                            readUnsignedByte = _decodeUtf8_2(readUnsignedByte);
                        }
                    } else {
                        readUnsignedByte = _decodeEscaped();
                    }
                    if (i >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    emptyAndGetCurrentSegment[i] = (char) readUnsignedByte;
                    i++;
                } else {
                    int i4 = i + 1;
                    emptyAndGetCurrentSegment[i] = (char) readUnsignedByte;
                    i = i4;
                    if (i4 >= length) {
                        break;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z) throws IOException {
        String str;
        double d;
        while (i == 73) {
            i = this._inputData.readUnsignedByte();
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
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
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
        do {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            i = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i] == 0);
        this._nextByte = i;
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = _growArrayBy;
                iArr = _growArrayBy;
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
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r3._parsingContext.inArray() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r3._parsingContext.inRoot() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        r3._nextByte = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
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
                                return _handleInvalidNumberStart(this._inputData.readUnsignedByte(), false);
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
                _reportInvalidToken(i, "" + ((char) i), _validJsonTokenList());
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

    public final void _matchToken(String str, int i) throws IOException {
        int length = str.length();
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i)) {
                _reportInvalidToken(readUnsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (readUnsignedByte2 >= 48 && readUnsignedByte2 != 93 && readUnsignedByte2 != 125) {
            _checkMatchEnd(str, i, readUnsignedByte2);
        }
        this._nextByte = readUnsignedByte2;
    }

    public String _parseAposName() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (readUnsignedByte != 39) {
            if (readUnsignedByte != 34 && iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte != 92) {
                    _throwUnquotedSpace(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = _decodeEscaped();
                }
                if (readUnsignedByte > 127) {
                    if (i >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = _growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = i3;
                        i3 = 0;
                        i2++;
                        i = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i3 = (i3 << 8) | (readUnsignedByte >> 6) | 192;
                        i++;
                    } else {
                        int i4 = (i3 << 8) | (readUnsignedByte >> 12) | 224;
                        int i5 = i + 1;
                        if (i5 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = _growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i2] = i4;
                            i4 = 0;
                            i2++;
                            i5 = 0;
                        }
                        i3 = (i4 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i = i5 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i < 4) {
                i++;
                i3 = readUnsignedByte | (i3 << 8);
            } else {
                if (i2 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = readUnsignedByte;
                i2++;
                i = 1;
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (i > 0) {
            if (i2 >= iArr.length) {
                int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = _growArrayBy;
                iArr = _growArrayBy;
            }
            iArr[i2] = pad(i3, i);
            i2++;
        }
        String findName = this._symbols.findName(iArr, i2);
        if (findName == null) {
            return addName(iArr, i2, i);
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
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] == 0) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte2] == 0) {
                int i2 = (readUnsignedByte << 8) | readUnsignedByte2;
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                if (iArr[readUnsignedByte3] == 0) {
                    int i3 = (i2 << 8) | readUnsignedByte3;
                    int readUnsignedByte4 = this._inputData.readUnsignedByte();
                    if (iArr[readUnsignedByte4] == 0) {
                        int i4 = (i3 << 8) | readUnsignedByte4;
                        int readUnsignedByte5 = this._inputData.readUnsignedByte();
                        if (iArr[readUnsignedByte5] == 0) {
                            this._quad1 = i4;
                            return _parseMediumName(readUnsignedByte5);
                        } else if (readUnsignedByte5 == 34) {
                            return findName(i4, 4);
                        } else {
                            return parseName(i4, readUnsignedByte5, 4);
                        }
                    } else if (readUnsignedByte4 == 34) {
                        return findName(i3, 3);
                    } else {
                        return parseName(i3, readUnsignedByte4, 3);
                    }
                } else if (readUnsignedByte3 == 34) {
                    return findName(i2, 2);
                } else {
                    return parseName(i2, readUnsignedByte3, 2);
                }
            } else if (readUnsignedByte2 == 34) {
                return findName(readUnsignedByte, 1);
            } else {
                return parseName(readUnsignedByte, readUnsignedByte2, 1);
            }
        } else if (readUnsignedByte == 34) {
            return "";
        } else {
            return parseName(0, readUnsignedByte, 0);
        }
    }

    public JsonToken _parseNegNumber() throws IOException {
        int readUnsignedByte;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = CoreConstants.DASH_CHAR;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        emptyAndGetCurrentSegment[1] = (char) readUnsignedByte2;
        if (readUnsignedByte2 <= 48) {
            if (readUnsignedByte2 == 48) {
                readUnsignedByte = _handleLeadingZeroes();
            } else {
                return _handleInvalidNumberStart(readUnsignedByte2, true);
            }
        } else if (readUnsignedByte2 > 57) {
            return _handleInvalidNumberStart(readUnsignedByte2, true);
        } else {
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        int i = 2;
        int i2 = 1;
        while (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
            i2++;
            emptyAndGetCurrentSegment[i] = (char) readUnsignedByte;
            readUnsignedByte = this._inputData.readUnsignedByte();
            i++;
        }
        if (readUnsignedByte != 46 && readUnsignedByte != 101 && readUnsignedByte != 69) {
            this._textBuffer.setCurrentLength(i);
            this._nextByte = readUnsignedByte;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace();
            }
            return resetInt(true, i2);
        }
        return _parseFloat(emptyAndGetCurrentSegment, i, readUnsignedByte, true, i2);
    }

    public JsonToken _parsePosNumber(int i) throws IOException {
        int readUnsignedByte;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i2 = 1;
        if (i == 48) {
            readUnsignedByte = _handleLeadingZeroes();
            if (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
                i2 = 0;
            } else {
                emptyAndGetCurrentSegment[0] = '0';
            }
        } else {
            emptyAndGetCurrentSegment[0] = (char) i;
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        int i3 = readUnsignedByte;
        char[] cArr = emptyAndGetCurrentSegment;
        int i4 = i2;
        int i5 = i4;
        while (i3 <= 57 && i3 >= 48) {
            i5++;
            if (i4 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i4 = 0;
            }
            cArr[i4] = (char) i3;
            i3 = this._inputData.readUnsignedByte();
            i4++;
        }
        if (i3 != 46 && i3 != 101 && i3 != 69) {
            this._textBuffer.setCurrentLength(i4);
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace();
            } else {
                this._nextByte = i3;
            }
            return resetInt(false, i5);
        }
        return _parseFloat(cArr, i4, i3, false, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r11._tokenIncomplete = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r3 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
        r4 = r4 + r3;
        r13.write(r14, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        int readUnsignedByte;
        int length = bArr.length - 3;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i2 > length) {
                    i3 += i2;
                    outputStream.write(bArr, 0, i2);
                    i2 = 0;
                }
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 1);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            int i5 = i2 + 1;
                            bArr[i2] = (byte) (i4 >> 4);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i5;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte4, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && _decodeBase64Escape(base64Variant, readUnsignedByte, 3) == -2)) {
                            i = i2 + 1;
                            bArr[i2] = (byte) (i4 >> 4);
                            i2 = i;
                        }
                    }
                }
                int i6 = (i4 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            int i7 = i6 >> 2;
                            int i8 = i2 + 1;
                            bArr[i2] = (byte) (i7 >> 8);
                            i2 = i8 + 1;
                            bArr[i8] = (byte) i7;
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i9 = i6 >> 2;
                        int i10 = i2 + 1;
                        bArr[i2] = (byte) (i9 >> 8);
                        i2 = i10 + 1;
                        bArr[i10] = (byte) i9;
                    }
                }
                int i11 = (i6 << 6) | decodeBase64Char4;
                int i12 = i2 + 1;
                bArr[i2] = (byte) (i11 >> 16);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i11 >> 8);
                i = i13 + 1;
                bArr[i13] = (byte) i11;
                i2 = i;
            }
        }
        throw reportInvalidBase64Char(base64Variant, readUnsignedByte, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
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

    public void _reportInvalidToken(int i, String str) throws IOException {
        _reportInvalidToken(i, str, _validJsonTokenList());
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i = iArr[readUnsignedByte];
            if (i != 0) {
                if (readUnsignedByte == 34) {
                    return;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (readUnsignedByte < 32) {
                                    _throwUnquotedSpace(readUnsignedByte, "string value");
                                } else {
                                    _reportInvalidChar(readUnsignedByte);
                                }
                            } else {
                                _skipUtf8_4();
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
        return new JsonLocation(_contentReference(), -1L, -1L, this._currInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputData;
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        } else {
            if (jsonToken == null) {
                return 0;
            }
            if (jsonToken.isNumeric()) {
                return this._textBuffer.size();
            }
            return this._currToken.asCharArray().length;
        }
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
        return new JsonLocation(_contentReference(), -1L, -1L, this._tokenInputRow, -1);
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
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (_skipWS != 93 && _skipWS != 125) {
            if (this._parsingContext.expectComma()) {
                if (_skipWS != 44) {
                    _reportUnexpectedChar(_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWS = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWS == 93 || _skipWS == 125)) {
                    _closeScope(_skipWS);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _nextTokenNotInObject(_skipWS);
                return null;
            }
            String _parseName = _parseName(_skipWS);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
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
                                                break;
                                            default:
                                                _parseNegNumber = _handleUnexpectedValue(_skipColon);
                                                break;
                                        }
                                    } else {
                                        _parseNegNumber = JsonToken.START_OBJECT;
                                    }
                                } else {
                                    _matchToken("true", 1);
                                    _parseNegNumber = JsonToken.VALUE_TRUE;
                                }
                            } else {
                                _matchToken("null", 1);
                                _parseNegNumber = JsonToken.VALUE_NULL;
                            }
                        } else {
                            _matchToken("false", 1);
                            _parseNegNumber = JsonToken.VALUE_FALSE;
                        }
                    } else {
                        _parseNegNumber = JsonToken.START_ARRAY;
                    }
                } else {
                    _parseFloatThatStartsWithPeriod();
                }
                _parseNegNumber = _parsePosNumber(_skipColon);
            } else {
                _parseNegNumber = _parseNegNumber();
            }
            this._nextToken = _parseNegNumber;
            return _parseName;
        }
        _closeScope(_skipWS);
        return null;
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
        if (this._closed) {
            return null;
        }
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
        this._tokenInputRow = this._currInputRow;
        if (_skipWSOrEnd != 93 && _skipWSOrEnd != 125) {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
                }
                _skipWSOrEnd = _skipWS();
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                    _closeScope(_skipWSOrEnd);
                    return this._currToken;
                }
            }
            if (!this._parsingContext.inObject()) {
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = jsonToken2;
            int _skipColon = _skipColon();
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
                                    _matchToken("true", 1);
                                    _parseNegNumber = JsonToken.VALUE_TRUE;
                                }
                            } else {
                                _matchToken("null", 1);
                                _parseNegNumber = JsonToken.VALUE_NULL;
                            }
                        } else {
                            _matchToken("false", 1);
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
        _closeScope(_skipWSOrEnd);
        return this._currToken;
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
                            iArr = _growArrayBy(iArr, iArr.length);
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
                                iArr = _growArrayBy(iArr, iArr.length);
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
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            i3 = this._inputData.readUnsignedByte();
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i] = pad(i2, i4);
            i++;
        }
        String findName = this._symbols.findName(iArr, i);
        if (findName == null) {
            return addName(iArr, i, i4);
        }
        return findName;
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
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    private final String parseName(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    public void _reportInvalidToken(int i, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char _decodeCharForError = (char) _decodeCharForError(i);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
            sb.append(_decodeCharForError);
            i = this._inputData.readUnsignedByte();
        }
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException {
        int pad = pad(i2, i3);
        String findName = this._symbols.findName(i, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = pad;
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
        int pad = pad(i3, i4);
        String findName = this._symbols.findName(i, i2, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = pad(pad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = _growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = pad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }
}
