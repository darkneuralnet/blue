package com.fasterxml.jackson.core.json.async;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.p030io.CharTypes;
import com.fasterxml.jackson.core.p030io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.google.android.gms.location.places.Place;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* loaded from: classes5.dex */
public class NonBlockingJsonParser extends NonBlockingJsonParserBase implements ByteArrayFeeder {
    protected byte[] _inputBuffer;
    protected int _origBufferLen;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public NonBlockingJsonParser(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i, byteQuadsCanonicalizer);
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
    }

    private final int _decodeCharEscape() throws IOException {
        if (this._inputEnd - this._inputPtr < 5) {
            return _decodeSplitEscaped(0, -1);
        }
        return _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() throws IOException {
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if (b != 34 && b != 47 && b != 92) {
            if (b != 98) {
                if (b != 102) {
                    if (b != 110) {
                        if (b != 114) {
                            if (b != 116) {
                                if (b != 117) {
                                    return _handleUnrecognizedCharacterEscape((char) b);
                                }
                                this._inputPtr = i2 + 1;
                                byte b2 = bArr[i2];
                                int charToHex = CharTypes.charToHex(b2);
                                if (charToHex >= 0) {
                                    byte[] bArr2 = this._inputBuffer;
                                    int i3 = this._inputPtr;
                                    this._inputPtr = i3 + 1;
                                    b2 = bArr2[i3];
                                    int charToHex2 = CharTypes.charToHex(b2);
                                    if (charToHex2 >= 0) {
                                        int i4 = (charToHex << 4) | charToHex2;
                                        byte[] bArr3 = this._inputBuffer;
                                        int i5 = this._inputPtr;
                                        this._inputPtr = i5 + 1;
                                        byte b3 = bArr3[i5];
                                        int charToHex3 = CharTypes.charToHex(b3);
                                        if (charToHex3 >= 0) {
                                            int i6 = (i4 << 4) | charToHex3;
                                            byte[] bArr4 = this._inputBuffer;
                                            int i7 = this._inputPtr;
                                            this._inputPtr = i7 + 1;
                                            b3 = bArr4[i7];
                                            int charToHex4 = CharTypes.charToHex(b3);
                                            if (charToHex4 >= 0) {
                                                return (i6 << 4) | charToHex4;
                                            }
                                        }
                                        b2 = b3;
                                    }
                                }
                                _reportUnexpectedChar(b2 & UByte.MAX_VALUE, "expected a hex-digit for character escape sequence");
                                return -1;
                            }
                            return 9;
                        }
                        return 13;
                    }
                    return 10;
                }
                return 12;
            }
            return 8;
        }
        return (char) b;
    }

    private int _decodeSplitEscaped(int i, int i2) throws IOException {
        int i3 = this._inputPtr;
        int i4 = this._inputEnd;
        if (i3 >= i4) {
            this._quoted32 = i;
            this._quotedDigits = i2;
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i5 = i3 + 1;
        this._inputPtr = i5;
        byte b = bArr[i3];
        if (i2 == -1) {
            if (b != 34 && b != 47 && b != 92) {
                if (b != 98) {
                    if (b != 102) {
                        if (b != 110) {
                            if (b != 114) {
                                if (b != 116) {
                                    if (b != 117) {
                                        return _handleUnrecognizedCharacterEscape((char) b);
                                    }
                                    i2 = 0;
                                    if (i5 >= i4) {
                                        this._quotedDigits = 0;
                                        this._quoted32 = 0;
                                        return -1;
                                    }
                                    this._inputPtr = i5 + 1;
                                    b = bArr[i5];
                                } else {
                                    return 9;
                                }
                            } else {
                                return 13;
                            }
                        } else {
                            return 10;
                        }
                    } else {
                        return 12;
                    }
                } else {
                    return 8;
                }
            } else {
                return b;
            }
        }
        while (true) {
            int i6 = b & UByte.MAX_VALUE;
            int charToHex = CharTypes.charToHex(i6);
            if (charToHex < 0) {
                _reportUnexpectedChar(i6 & KotlinVersion.MAX_COMPONENT_VALUE, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | charToHex;
            i2++;
            if (i2 == 4) {
                return i;
            }
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._quotedDigits = i2;
                this._quoted32 = i;
                return -1;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i7 + 1;
            b = bArr2[i7];
        }
    }

    private final boolean _decodeSplitMultiByte(int i, int i2, boolean z) throws IOException {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i < 32) {
                            _throwUnquotedSpace(i, "string value");
                        } else {
                            _reportInvalidChar(i);
                        }
                        this._textBuffer.append((char) i);
                        return true;
                    }
                    int i3 = i & 7;
                    if (z) {
                        byte[] bArr = this._inputBuffer;
                        int i4 = this._inputPtr;
                        this._inputPtr = i4 + 1;
                        return _decodeSplitUTF8_4(i3, 1, bArr[i4]);
                    }
                    this._pending32 = i3;
                    this._pendingBytes = 1;
                    this._minorState = 44;
                    return false;
                }
                int i5 = i & 15;
                if (z) {
                    byte[] bArr2 = this._inputBuffer;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    return _decodeSplitUTF8_3(i5, 1, bArr2[i6]);
                }
                this._minorState = 43;
                this._pending32 = i5;
                this._pendingBytes = 1;
                return false;
            } else if (z) {
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                this._textBuffer.append((char) _decodeUTF8_2(i, bArr3[i7]));
                return true;
            } else {
                this._minorState = 42;
                this._pending32 = i;
                return false;
            }
        }
        int _decodeSplitEscaped = _decodeSplitEscaped(0, -1);
        if (_decodeSplitEscaped < 0) {
            this._minorState = 41;
            return false;
        }
        this._textBuffer.append((char) _decodeSplitEscaped);
        return true;
    }

    private final boolean _decodeSplitUTF8_3(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4];
        }
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        this._textBuffer.append((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    private final boolean _decodeSplitUTF8_4(int i, int i2, int i3) throws IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4];
            i2 = 2;
        }
        if (i2 == 2) {
            if ((i3 & 192) != 128) {
                _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i3 = bArr2[i5];
        }
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i6 = ((i << 6) | (i3 & 63)) - 65536;
        this._textBuffer.append((char) ((i6 >> 10) | GeneratorBase.SURR1_FIRST));
        this._textBuffer.append((char) ((i6 & Place.TYPE_SUBLOCALITY_LEVEL_1) | GeneratorBase.SURR2_FIRST));
        return true;
    }

    private final int _decodeUTF8_2(int i, int i2) throws IOException {
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    private final int _decodeUTF8_3(int i, int i2, int i3) throws IOException {
        int i4 = i & 15;
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i5 = (i4 << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return (i5 << 6) | (i3 & 63);
    }

    private final int _decodeUTF8_4(int i, int i2, int i3, int i4) throws IOException {
        if ((i2 & 192) != 128) {
            _reportInvalidOther(i2 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i5 = ((i & 7) << 6) | (i2 & 63);
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return ((i6 << 6) | (i4 & 63)) - 65536;
    }

    private final String _fastParseName() throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i = this._inputPtr;
        int i2 = i + 1;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        if (iArr[i3] == 0) {
            int i4 = i2 + 1;
            int i5 = bArr[i2] & UByte.MAX_VALUE;
            if (iArr[i5] == 0) {
                int i6 = (i3 << 8) | i5;
                int i7 = i4 + 1;
                int i8 = bArr[i4] & UByte.MAX_VALUE;
                if (iArr[i8] == 0) {
                    int i9 = (i6 << 8) | i8;
                    int i10 = i7 + 1;
                    int i11 = bArr[i7] & UByte.MAX_VALUE;
                    if (iArr[i11] == 0) {
                        int i12 = (i9 << 8) | i11;
                        int i13 = i10 + 1;
                        int i14 = bArr[i10] & UByte.MAX_VALUE;
                        if (iArr[i14] == 0) {
                            this._quad1 = i12;
                            return _parseMediumName(i13, i14);
                        } else if (i14 != 34) {
                            return null;
                        } else {
                            this._inputPtr = i13;
                            return _findName(i12, 4);
                        }
                    } else if (i11 != 34) {
                        return null;
                    } else {
                        this._inputPtr = i10;
                        return _findName(i9, 3);
                    }
                } else if (i8 != 34) {
                    return null;
                } else {
                    this._inputPtr = i7;
                    return _findName(i6, 2);
                }
            } else if (i5 != 34) {
                return null;
            } else {
                this._inputPtr = i4;
                return _findName(i3, 1);
            }
        } else if (i3 != 34) {
            return null;
        } else {
            this._inputPtr = i2;
            return "";
        }
    }

    private JsonToken _finishAposName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            int i5 = bArr[i4] & UByte.MAX_VALUE;
            if (i5 == 39) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = NonBlockingJsonParserBase._padLastQuad(i2, i3);
                    i++;
                } else if (i == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            if (i5 != 34 && iArr2[i5] != 0) {
                if (i5 != 92) {
                    _throwUnquotedSpace(i5, "name");
                } else {
                    i5 = _decodeCharEscape();
                    if (i5 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i5 > 127) {
                    int i6 = 0;
                    if (i3 >= 4) {
                        if (i >= iArr.length) {
                            int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = growArrayBy;
                            iArr = growArrayBy;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (i5 < 2048) {
                        i2 = (i2 << 8) | (i5 >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = (i2 << 8) | (i5 >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                int[] growArrayBy2 = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = growArrayBy2;
                                iArr = growArrayBy2;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        i2 = (i6 << 8) | ((i5 >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    i5 = (i5 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | i5;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i5;
                i3 = 1;
            }
        }
    }

    private final JsonToken _finishAposString() throws IOException {
        int i;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd - 5;
        while (i2 < this._inputEnd) {
            boolean z = false;
            int i4 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i2);
            while (true) {
                if (i2 < min) {
                    int i5 = i2 + 1;
                    int i6 = bArr[i2] & UByte.MAX_VALUE;
                    int i7 = iArr[i6];
                    if (i7 != 0 && i6 != 34) {
                        if (i5 >= i3) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            int i8 = iArr[i6];
                            if (i5 < this._inputEnd) {
                                z = true;
                            }
                            if (!_decodeSplitMultiByte(i6, i8, z)) {
                                this._minorStateAfterSplit = 45;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i2 = this._inputPtr;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        if (i7 != 4) {
                                            if (i6 < 32) {
                                                _throwUnquotedSpace(i6, "string value");
                                            } else {
                                                _reportInvalidChar(i6);
                                            }
                                            i = i5;
                                        } else {
                                            byte[] bArr2 = this._inputBuffer;
                                            int i9 = i5 + 1;
                                            int i10 = i9 + 1;
                                            int i11 = i10 + 1;
                                            int _decodeUTF8_4 = _decodeUTF8_4(i6, bArr2[i5], bArr2[i9], bArr2[i10]);
                                            int i12 = currentSegmentSize + 1;
                                            bufferWithoutReset[currentSegmentSize] = (char) ((_decodeUTF8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                            if (i12 >= bufferWithoutReset.length) {
                                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                                currentSegmentSize = 0;
                                            } else {
                                                currentSegmentSize = i12;
                                            }
                                            i6 = (_decodeUTF8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1) | GeneratorBase.SURR2_FIRST;
                                            i = i11;
                                        }
                                    } else {
                                        byte[] bArr3 = this._inputBuffer;
                                        int i13 = i5 + 1;
                                        i6 = _decodeUTF8_3(i6, bArr3[i5], bArr3[i13]);
                                        i = i13 + 1;
                                    }
                                } else {
                                    i6 = _decodeUTF8_2(i6, this._inputBuffer[i5]);
                                    i = i5 + 1;
                                }
                            } else {
                                this._inputPtr = i5;
                                i6 = _decodeFastCharEscape();
                                i = this._inputPtr;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i4 = currentSegmentSize;
                            }
                            currentSegmentSize = i4 + 1;
                            bufferWithoutReset[i4] = (char) i6;
                            i2 = i;
                        }
                    } else if (i6 == 39) {
                        this._inputPtr = i5;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return _valueComplete(JsonToken.VALUE_STRING);
                    } else {
                        bufferWithoutReset[currentSegmentSize] = (char) i6;
                        i2 = i5;
                        currentSegmentSize++;
                    }
                }
            }
        }
        this._inputPtr = i2;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final JsonToken _finishBOM(int i) throws IOException {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i2 + 1;
                int i3 = bArr[i2] & UByte.MAX_VALUE;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this._currInputProcessed -= 3;
                            return _startDocument(i3);
                        }
                    } else if (i3 != 191) {
                        _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i3));
                    }
                } else if (i3 != 187) {
                    _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i3));
                }
                i++;
            } else {
                this._pending32 = i;
                this._minorState = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        }
    }

    private final JsonToken _finishCComment(int i, boolean z) throws IOException {
        int i2;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                if (z) {
                    i2 = 52;
                } else {
                    i2 = 53;
                }
                this._minorState = i2;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            int i5 = bArr[i3] & UByte.MAX_VALUE;
            if (i5 < 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i4;
                } else if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            } else if (i5 == 42) {
                z = true;
            } else if (i5 == 47 && z) {
                return _startAfterComment(i);
            }
            z = false;
        }
    }

    private final JsonToken _finishCppComment(int i) throws IOException {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 54;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & UByte.MAX_VALUE;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return _startAfterComment(i);
    }

    private final JsonToken _finishHashComment(int i) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 55;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & UByte.MAX_VALUE;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return _startAfterComment(i);
    }

    private final JsonToken _finishRegularString() throws IOException {
        int i;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd - 5;
        while (i2 < this._inputEnd) {
            boolean z = false;
            int i4 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i2);
            while (true) {
                if (i2 < min) {
                    int i5 = i2 + 1;
                    int i6 = bArr[i2] & UByte.MAX_VALUE;
                    int i7 = iArr[i6];
                    if (i7 != 0) {
                        if (i6 == 34) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        } else if (i5 >= i3) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            int i8 = iArr[i6];
                            if (i5 < this._inputEnd) {
                                z = true;
                            }
                            if (!_decodeSplitMultiByte(i6, i8, z)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i2 = this._inputPtr;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        if (i7 != 4) {
                                            if (i6 < 32) {
                                                _throwUnquotedSpace(i6, "string value");
                                            } else {
                                                _reportInvalidChar(i6);
                                            }
                                            i = i5;
                                        } else {
                                            byte[] bArr2 = this._inputBuffer;
                                            int i9 = i5 + 1;
                                            int i10 = i9 + 1;
                                            int i11 = i10 + 1;
                                            int _decodeUTF8_4 = _decodeUTF8_4(i6, bArr2[i5], bArr2[i9], bArr2[i10]);
                                            int i12 = currentSegmentSize + 1;
                                            bufferWithoutReset[currentSegmentSize] = (char) ((_decodeUTF8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                            if (i12 >= bufferWithoutReset.length) {
                                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                                currentSegmentSize = 0;
                                            } else {
                                                currentSegmentSize = i12;
                                            }
                                            i6 = (_decodeUTF8_4 & Place.TYPE_SUBLOCALITY_LEVEL_1) | GeneratorBase.SURR2_FIRST;
                                            i = i11;
                                        }
                                    } else {
                                        byte[] bArr3 = this._inputBuffer;
                                        int i13 = i5 + 1;
                                        i6 = _decodeUTF8_3(i6, bArr3[i5], bArr3[i13]);
                                        i = i13 + 1;
                                    }
                                } else {
                                    i6 = _decodeUTF8_2(i6, this._inputBuffer[i5]);
                                    i = i5 + 1;
                                }
                            } else {
                                this._inputPtr = i5;
                                i6 = _decodeFastCharEscape();
                                i = this._inputPtr;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i4 = currentSegmentSize;
                            }
                            currentSegmentSize = i4 + 1;
                            bufferWithoutReset[i4] = (char) i6;
                            i2 = i;
                        }
                    } else {
                        bufferWithoutReset[currentSegmentSize] = (char) i6;
                        i2 = i5;
                        currentSegmentSize++;
                    }
                }
            }
        }
        this._inputPtr = i2;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken _finishUnquotedName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i5 = this._inputBuffer[i4] & UByte.MAX_VALUE;
            if (inputCodeUtf8JsNames[i5] != 0) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = i2;
                    i++;
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            this._inputPtr = i4 + 1;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | i5;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i5;
                i3 = 1;
                i++;
            }
        }
    }

    private JsonToken _handleOddName(int i) throws IOException {
        if (i != 35) {
            if (i != 39) {
                if (i != 47) {
                    if (i == 93) {
                        return _closeArrayScope();
                    }
                } else {
                    return _startSlashComment(4);
                }
            } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _finishAposName(0, 0, 0);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
            return _finishHashComment(4);
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) i, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i, 1);
    }

    private final JsonToken _parseEscapedName(int i, int i2, int i3) throws IOException {
        int i4;
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & UByte.MAX_VALUE;
            if (iArr2[i6] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | i6;
                } else {
                    if (i >= iArr.length) {
                        int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = growArrayBy;
                        iArr = growArrayBy;
                    }
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = i6;
                    i3 = 1;
                }
            } else if (i6 == 34) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = NonBlockingJsonParserBase._padLastQuad(i2, i3);
                    i++;
                } else if (i == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            } else {
                if (i6 != 92) {
                    _throwUnquotedSpace(i6, "name");
                } else {
                    i6 = _decodeCharEscape();
                    if (i6 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                if (i6 > 127) {
                    int i7 = 0;
                    if (i3 >= 4) {
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (i6 < 2048) {
                        i2 = (i2 << 8) | (i6 >> 6) | 192;
                        i3++;
                    } else {
                        int i8 = (i2 << 8) | (i6 >> 12) | 224;
                        int i9 = i3 + 1;
                        if (i9 >= 4) {
                            iArr[i] = i8;
                            i++;
                            i9 = 0;
                        } else {
                            i7 = i8;
                        }
                        i2 = (i7 << 8) | ((i6 >> 6) & 63) | 128;
                        i3 = i9 + 1;
                    }
                    i6 = (i6 & 63) | 128;
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | i6;
                } else {
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = i6;
                    i3 = 1;
                }
            }
        }
    }

    private final String _parseMediumName(int i, int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = i + 1;
        int i4 = bArr[i] & UByte.MAX_VALUE;
        if (iArr[i4] == 0) {
            int i5 = i4 | (i2 << 8);
            int i6 = i3 + 1;
            int i7 = bArr[i3] & UByte.MAX_VALUE;
            if (iArr[i7] == 0) {
                int i8 = (i5 << 8) | i7;
                int i9 = i6 + 1;
                int i10 = bArr[i6] & UByte.MAX_VALUE;
                if (iArr[i10] == 0) {
                    int i11 = (i8 << 8) | i10;
                    int i12 = i9 + 1;
                    int i13 = bArr[i9] & UByte.MAX_VALUE;
                    if (iArr[i13] == 0) {
                        return _parseMediumName2(i12, i13, i11);
                    }
                    if (i13 != 34) {
                        return null;
                    }
                    this._inputPtr = i12;
                    return _findName(this._quad1, i11, 4);
                } else if (i10 != 34) {
                    return null;
                } else {
                    this._inputPtr = i9;
                    return _findName(this._quad1, i8, 3);
                }
            } else if (i7 != 34) {
                return null;
            } else {
                this._inputPtr = i6;
                return _findName(this._quad1, i5, 2);
            }
        } else if (i4 != 34) {
            return null;
        } else {
            this._inputPtr = i3;
            return _findName(this._quad1, i2, 1);
        }
    }

    private final String _parseMediumName2(int i, int i2, int i3) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i + 1;
        int i5 = bArr[i] & UByte.MAX_VALUE;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, i2, 1);
        }
        int i6 = i5 | (i2 << 8);
        int i7 = i4 + 1;
        int i8 = bArr[i4] & UByte.MAX_VALUE;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i3, i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        int i11 = bArr[i7] & UByte.MAX_VALUE;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this._inputPtr = i10;
            return _findName(this._quad1, i3, i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i10 + 1;
        if ((bArr[i10] & UByte.MAX_VALUE) != 34) {
            return null;
        }
        this._inputPtr = i13;
        return _findName(this._quad1, i3, i12, 4);
    }

    private final int _skipWS(int i) throws IOException {
        do {
            if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & UByte.MAX_VALUE;
        } while (i <= 32);
        return i;
    }

    private final JsonToken _startAfterComment(int i) throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        if (i != 4) {
            if (i != 5) {
                switch (i) {
                    case 12:
                        return _startValue(i3);
                    case 13:
                        return _startValueExpectComma(i3);
                    case 14:
                        return _startValueExpectColon(i3);
                    case 15:
                        return _startValueAfterComma(i3);
                    default:
                        VersionUtil.throwInternal();
                        return null;
                }
            }
            return _startFieldNameAfterComma(i3);
        }
        return _startFieldName(i3);
    }

    private final JsonToken _startDocument(int i) throws IOException {
        int i2 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i2 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                if (this._endOfInput) {
                    return _eofAsNextToken();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & UByte.MAX_VALUE;
        }
        return _startValue(i2);
    }

    private final JsonToken _startFieldName(int i) throws IOException {
        String _fastParseName;
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i != 34) {
            if (i == 125) {
                return _closeObjectScope();
            }
            return _handleOddName(i);
        } else if (this._inputPtr + 13 <= this._inputEnd && (_fastParseName = _fastParseName()) != null) {
            return _fieldComplete(_fastParseName);
        } else {
            return _parseEscapedName(0, 0, 0);
        }
    }

    private final JsonToken _startFieldNameAfterComma(int i) throws IOException {
        String _fastParseName;
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i != 44) {
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 35) {
                return _finishHashComment(5);
            }
            if (i == 47) {
                return _startSlashComment(5);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = _skipWS(i3)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 != 34) {
            if (i3 == 125 && (this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
            return _handleOddName(i3);
        } else if (this._inputPtr + 13 <= this._inputEnd && (_fastParseName = _fastParseName()) != null) {
            return _fieldComplete(_fastParseName);
        } else {
            return _parseEscapedName(0, 0, 0);
        }
    }

    private final JsonToken _startSlashComment(int i) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._pending32 = i;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if (b == 42) {
            return _finishCComment(i, false);
        }
        if (b == 47) {
            return _finishCppComment(i);
        }
        _reportUnexpectedChar(b & UByte.MAX_VALUE, "was expecting either '*' or '/' for a comment");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final JsonToken _startValue(int i) throws IOException {
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i == 34) {
            return _startString();
        }
        if (i != 35) {
            if (i != 91) {
                if (i != 93) {
                    if (i != 102) {
                        if (i != 110) {
                            if (i != 116) {
                                if (i != 123) {
                                    if (i != 125) {
                                        switch (i) {
                                            case 45:
                                                return _startNegativeNumber();
                                            case 46:
                                                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                                                    return _startFloatThatStartsWithPeriod();
                                                }
                                                break;
                                            case 47:
                                                return _startSlashComment(12);
                                            case 48:
                                                return _startNumberLeadingZero();
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return _startPositiveNumber(i);
                                        }
                                        return _startUnexpectedValue(false, i);
                                    }
                                    return _closeObjectScope();
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _closeArrayScope();
            }
            return _startArrayScope();
        }
        return _finishHashComment(12);
    }

    private final JsonToken _startValueAfterComma(int i) throws IOException {
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i == 34) {
            return _startString();
        }
        if (i != 35) {
            if (i != 45) {
                if (i != 91) {
                    if (i != 93) {
                        if (i != 102) {
                            if (i != 110) {
                                if (i != 116) {
                                    if (i != 123) {
                                        if (i != 125) {
                                            switch (i) {
                                                case 47:
                                                    return _startSlashComment(15);
                                                case 48:
                                                    return _startNumberLeadingZero();
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    return _startPositiveNumber(i);
                                            }
                                        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                                            return _closeObjectScope();
                                        }
                                    } else {
                                        return _startObjectScope();
                                    }
                                } else {
                                    return _startTrueToken();
                                }
                            } else {
                                return _startNullToken();
                            }
                        } else {
                            return _startFalseToken();
                        }
                    } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(15);
    }

    private final JsonToken _startValueExpectColon(int i) throws IOException {
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i != 58) {
            if (i == 47) {
                return _startSlashComment(14);
            }
            if (i == 35) {
                return _finishHashComment(14);
            }
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = _skipWS(i3)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 == 34) {
            return _startString();
        }
        if (i3 != 35) {
            if (i3 != 45) {
                if (i3 != 91) {
                    if (i3 != 102) {
                        if (i3 != 110) {
                            if (i3 != 116) {
                                if (i3 != 123) {
                                    switch (i3) {
                                        case 47:
                                            return _startSlashComment(12);
                                        case 48:
                                            return _startNumberLeadingZero();
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return _startPositiveNumber(i3);
                                        default:
                                            return _startUnexpectedValue(false, i3);
                                    }
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(12);
    }

    private final JsonToken _startValueExpectComma(int i) throws IOException {
        if (i <= 32 && (i = _skipWS(i)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i != 44) {
            if (i == 93) {
                return _closeArrayScope();
            }
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 47) {
                return _startSlashComment(13);
            }
            if (i == 35) {
                return _finishHashComment(13);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.expectComma();
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = _skipWS(i3)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 == 34) {
            return _startString();
        }
        if (i3 != 35) {
            if (i3 != 45) {
                if (i3 != 91) {
                    if (i3 != 93) {
                        if (i3 != 102) {
                            if (i3 != 110) {
                                if (i3 != 116) {
                                    if (i3 != 123) {
                                        if (i3 != 125) {
                                            switch (i3) {
                                                case 47:
                                                    return _startSlashComment(15);
                                                case 48:
                                                    return _startNumberLeadingZero();
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    return _startPositiveNumber(i3);
                                            }
                                        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                                            return _closeObjectScope();
                                        }
                                    } else {
                                        return _startObjectScope();
                                    }
                                } else {
                                    return _startTrueToken();
                                }
                            } else {
                                return _startNullToken();
                            }
                        } else {
                            return _startFalseToken();
                        }
                    } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i3);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return _finishHashComment(15);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        VersionUtil.throwInternal();
        return ' ';
    }

    public JsonToken _finishErrorToken() throws IOException {
        do {
            int i = this._inputPtr;
            if (i < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i + 1;
                char c = (char) bArr[i];
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this._textBuffer.append(c);
            } else {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        } while (this._textBuffer.size() < 256);
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public JsonToken _finishErrorTokenWithEOF() throws IOException {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public final JsonToken _finishFieldWithEscape() throws IOException {
        int i;
        int i2;
        int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i3 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i3 >= iArr.length) {
            this._quadBuffer = ParserBase.growArrayBy(iArr, 32);
        }
        int i4 = this._pending32;
        int i5 = this._pendingBytes;
        int i6 = 1;
        if (_decodeSplitEscaped > 127) {
            int i7 = 0;
            if (i5 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i8 = this._quadLength;
                this._quadLength = i8 + 1;
                iArr2[i8] = i4;
                i4 = 0;
                i5 = 0;
            }
            if (_decodeSplitEscaped < 2048) {
                i = i4 << 8;
                i2 = (_decodeSplitEscaped >> 6) | 192;
            } else {
                int i9 = (i4 << 8) | (_decodeSplitEscaped >> 12) | 224;
                i5++;
                if (i5 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i10 = this._quadLength;
                    this._quadLength = i10 + 1;
                    iArr3[i10] = i9;
                    i5 = 0;
                } else {
                    i7 = i9;
                }
                i = i7 << 8;
                i2 = ((_decodeSplitEscaped >> 6) & 63) | 128;
            }
            i4 = i | i2;
            i5++;
            _decodeSplitEscaped = (_decodeSplitEscaped & 63) | 128;
        }
        if (i5 < 4) {
            i6 = 1 + i5;
            _decodeSplitEscaped |= i4 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i11 = this._quadLength;
            this._quadLength = i11 + 1;
            iArr4[i11] = i4;
        }
        if (this._minorStateAfterSplit == 9) {
            return _finishAposName(this._quadLength, _decodeSplitEscaped, i6);
        }
        return _parseEscapedName(this._quadLength, _decodeSplitEscaped, i6);
    }

    public JsonToken _finishFloatExponent(boolean z, int i) throws IOException {
        if (z) {
            this._minorState = 32;
            if (i == 45 || i == 43) {
                this._textBuffer.append((char) i);
                int i2 = this._inputPtr;
                if (i2 >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i2 + 1;
                i = bArr[i2];
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i3 = this._expLength;
        while (i >= 48 && i <= 57) {
            i3++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i4 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i;
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i4);
                this._expLength = i3;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i = bArr2[i5];
            currentSegmentSize = i4;
        }
        int i6 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i3 == 0) {
            reportUnexpectedNumberChar(i6, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i3;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken _finishFloatFraction() throws IOException {
        byte b;
        int i = this._fractLength;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            b = bArr[i2];
            if (b < 48 || b > 57) {
                break;
            }
            i++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i3 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) b;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i3);
                this._fractLength = i;
                return JsonToken.NOT_AVAILABLE;
            }
            currentSegmentSize = i3;
        }
        if (i == 0) {
            reportUnexpectedNumberChar(b, "Decimal point not followed by a digit");
        }
        this._fractLength = i;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if (b != 101 && b != 69) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this._textBuffer.append((char) b);
        this._expLength = 0;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        byte[] bArr2 = this._inputBuffer;
        this._inputPtr = i4 + 1;
        return _finishFloatExponent(true, bArr2[i4] & UByte.MAX_VALUE);
    }

    public JsonToken _finishKeywordToken(String str, int i, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._pending32 = i;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte b = this._inputBuffer[i2];
            if (i == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return _valueComplete(jsonToken);
                }
            } else if (b != str.charAt(i)) {
                break;
            } else {
                i++;
                this._inputPtr++;
            }
        }
        this._minorState = 50;
        this._textBuffer.resetWithCopy(str, 0, i);
        return _finishErrorToken();
    }

    public JsonToken _finishKeywordTokenWithEOF(String str, int i, JsonToken jsonToken) throws IOException {
        if (i == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _finishNonStdToken(int i, int i2) throws IOException {
        String _nonStdToken = _nonStdToken(i);
        int length = _nonStdToken.length();
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._nonStdTokenType = i;
                this._pending32 = i2;
                this._minorState = 19;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte b = this._inputBuffer[i3];
            if (i2 == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return _valueNonStdNumberComplete(i);
                }
            } else if (b != _nonStdToken.charAt(i2)) {
                break;
            } else {
                i2++;
                this._inputPtr++;
            }
        }
    }

    public JsonToken _finishNonStdTokenWithEOF(int i, int i2) throws IOException {
        String _nonStdToken = _nonStdToken(i);
        if (i2 == _nonStdToken.length()) {
            return _valueNonStdNumberComplete(i);
        }
        this._textBuffer.resetWithCopy(_nonStdToken, 0, i2);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4._intLength = r0 + r6;
        r4._textBuffer.setCurrentLength(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _finishNumberIntegralPart(char[] cArr, int i) throws IOException {
        int i2;
        if (this._numberNegative) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 26;
                this._textBuffer.setCurrentLength(i);
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i4 = this._inputBuffer[i3] & UByte.MAX_VALUE;
            if (i4 < 48) {
                if (i4 == 46) {
                    this._intLength = i2 + i;
                    this._inputPtr = i3 + 1;
                    return _startFloat(cArr, i, i4);
                }
            } else if (i4 > 57) {
                if (i4 == 101 || i4 == 69) {
                    this._intLength = i2 + i;
                    this._inputPtr = i3 + 1;
                    return _startFloat(cArr, i, i4);
                }
            } else {
                this._inputPtr = i3 + 1;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                cArr[i] = (char) i4;
                i++;
            }
        }
    }

    public JsonToken _finishNumberLeadingNegZeroes() throws IOException {
        int i;
        do {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & UByte.MAX_VALUE;
            if (i < 48) {
                if (i == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = CoreConstants.DASH_CHAR;
                    emptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 2, i);
                }
            } else if (i > 57) {
                if (i != 101 && i != 69) {
                    if (i != 93 && i != 125) {
                        reportUnexpectedNumberChar(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    }
                } else {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = CoreConstants.DASH_CHAR;
                    emptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 2, i);
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = CoreConstants.DASH_CHAR;
        emptyAndGetCurrentSegment3[1] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 2);
    }

    public JsonToken _finishNumberLeadingZeroes() throws IOException {
        int i;
        do {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & UByte.MAX_VALUE;
            if (i < 48) {
                if (i == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 1, i);
                }
            } else if (i > 57) {
                if (i != 101 && i != 69) {
                    if (i != 93 && i != 125) {
                        reportUnexpectedNumberChar(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    }
                } else {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 1, i);
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 1);
    }

    public JsonToken _finishNumberMinus(int i) throws IOException {
        if (i <= 48) {
            if (i == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = CoreConstants.DASH_CHAR;
        emptyAndGetCurrentSegment[1] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment, 2);
    }

    public final JsonToken _finishToken() throws IOException {
        int i = this._minorState;
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    switch (i) {
                        case 7:
                            return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
                        case 8:
                            return _finishFieldWithEscape();
                        case 9:
                            return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
                        case 10:
                            return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
                        default:
                            switch (i) {
                                case 12:
                                    byte[] bArr = this._inputBuffer;
                                    int i2 = this._inputPtr;
                                    this._inputPtr = i2 + 1;
                                    return _startValue(bArr[i2] & UByte.MAX_VALUE);
                                case 13:
                                    byte[] bArr2 = this._inputBuffer;
                                    int i3 = this._inputPtr;
                                    this._inputPtr = i3 + 1;
                                    return _startValueExpectComma(bArr2[i3] & UByte.MAX_VALUE);
                                case 14:
                                    byte[] bArr3 = this._inputBuffer;
                                    int i4 = this._inputPtr;
                                    this._inputPtr = i4 + 1;
                                    return _startValueExpectColon(bArr3[i4] & UByte.MAX_VALUE);
                                case 15:
                                    byte[] bArr4 = this._inputBuffer;
                                    int i5 = this._inputPtr;
                                    this._inputPtr = i5 + 1;
                                    return _startValueAfterComma(bArr4[i5] & UByte.MAX_VALUE);
                                case 16:
                                    return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
                                case 17:
                                    return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
                                case 18:
                                    return _finishKeywordToken("false", this._pending32, JsonToken.VALUE_FALSE);
                                case 19:
                                    return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                                default:
                                    switch (i) {
                                        case 23:
                                            byte[] bArr5 = this._inputBuffer;
                                            int i6 = this._inputPtr;
                                            this._inputPtr = i6 + 1;
                                            return _finishNumberMinus(bArr5[i6] & UByte.MAX_VALUE);
                                        case 24:
                                            return _finishNumberLeadingZeroes();
                                        case 25:
                                            return _finishNumberLeadingNegZeroes();
                                        case 26:
                                            return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
                                        default:
                                            switch (i) {
                                                case 30:
                                                    return _finishFloatFraction();
                                                case 31:
                                                    byte[] bArr6 = this._inputBuffer;
                                                    int i7 = this._inputPtr;
                                                    this._inputPtr = i7 + 1;
                                                    return _finishFloatExponent(true, bArr6[i7] & UByte.MAX_VALUE);
                                                case 32:
                                                    byte[] bArr7 = this._inputBuffer;
                                                    int i8 = this._inputPtr;
                                                    this._inputPtr = i8 + 1;
                                                    return _finishFloatExponent(false, bArr7[i8] & UByte.MAX_VALUE);
                                                default:
                                                    switch (i) {
                                                        case 40:
                                                            return _finishRegularString();
                                                        case 41:
                                                            int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                                                            if (_decodeSplitEscaped < 0) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            this._textBuffer.append((char) _decodeSplitEscaped);
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return _finishAposString();
                                                            }
                                                            return _finishRegularString();
                                                        case 42:
                                                            TextBuffer textBuffer = this._textBuffer;
                                                            int i9 = this._pending32;
                                                            byte[] bArr8 = this._inputBuffer;
                                                            int i10 = this._inputPtr;
                                                            this._inputPtr = i10 + 1;
                                                            textBuffer.append((char) _decodeUTF8_2(i9, bArr8[i10]));
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return _finishAposString();
                                                            }
                                                            return _finishRegularString();
                                                        case 43:
                                                            int i11 = this._pending32;
                                                            int i12 = this._pendingBytes;
                                                            byte[] bArr9 = this._inputBuffer;
                                                            int i13 = this._inputPtr;
                                                            this._inputPtr = i13 + 1;
                                                            if (!_decodeSplitUTF8_3(i11, i12, bArr9[i13])) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return _finishAposString();
                                                            }
                                                            return _finishRegularString();
                                                        case 44:
                                                            int i14 = this._pending32;
                                                            int i15 = this._pendingBytes;
                                                            byte[] bArr10 = this._inputBuffer;
                                                            int i16 = this._inputPtr;
                                                            this._inputPtr = i16 + 1;
                                                            if (!_decodeSplitUTF8_4(i14, i15, bArr10[i16])) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return _finishAposString();
                                                            }
                                                            return _finishRegularString();
                                                        case 45:
                                                            return _finishAposString();
                                                        default:
                                                            switch (i) {
                                                                case 50:
                                                                    return _finishErrorToken();
                                                                case 51:
                                                                    return _startSlashComment(this._pending32);
                                                                case 52:
                                                                    return _finishCComment(this._pending32, true);
                                                                case 53:
                                                                    return _finishCComment(this._pending32, false);
                                                                case 54:
                                                                    return _finishCppComment(this._pending32);
                                                                case 55:
                                                                    return _finishHashComment(this._pending32);
                                                                default:
                                                                    VersionUtil.throwInternal();
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                byte[] bArr11 = this._inputBuffer;
                int i17 = this._inputPtr;
                this._inputPtr = i17 + 1;
                return _startFieldNameAfterComma(bArr11[i17] & UByte.MAX_VALUE);
            }
            byte[] bArr12 = this._inputBuffer;
            int i18 = this._inputPtr;
            this._inputPtr = i18 + 1;
            return _startFieldName(bArr12[i18] & UByte.MAX_VALUE);
        }
        return _finishBOM(this._pending32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final JsonToken _finishTokenWithEOF() throws IOException {
        JsonToken jsonToken = this._currToken;
        int i = this._minorState;
        if (i != 3) {
            if (i != 12) {
                if (i != 50) {
                    switch (i) {
                        case 16:
                            return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
                        case 17:
                            return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
                        case 18:
                            return _finishKeywordTokenWithEOF("false", this._pending32, JsonToken.VALUE_FALSE);
                        case 19:
                            return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                    return _valueCompleteInt(0, "0");
                                case 26:
                                    int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                                    if (this._numberNegative) {
                                        currentSegmentSize--;
                                    }
                                    this._intLength = currentSegmentSize;
                                    return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                                default:
                                    switch (i) {
                                        case 30:
                                            this._expLength = 0;
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        case 31:
                                            _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                            _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            return _eofAsNextToken();
                                        case 32:
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        default:
                                            switch (i) {
                                                case 52:
                                                case 53:
                                                    _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                                    break;
                                                case 54:
                                                case 55:
                                                    break;
                                                default:
                                                    _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + ")", this._currToken);
                                                    return jsonToken;
                                            }
                                            return _eofAsNextToken();
                                    }
                            }
                    }
                }
                return _finishErrorTokenWithEOF();
            }
            return _eofAsNextToken();
        }
        return _eofAsNextToken();
    }

    public JsonToken _reportErrorToken(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    public JsonToken _startAposString() throws IOException {
        int i = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (i < min) {
            int i3 = bArr[i] & UByte.MAX_VALUE;
            if (i3 == 39) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return _valueComplete(JsonToken.VALUE_STRING);
            } else if (iArr[i3] != 0) {
                break;
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return _finishAposString();
    }

    public JsonToken _startFalseToken() throws IOException {
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
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken("false", 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        r3 = r3 & kotlin.UByte.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r9 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        reportUnexpectedNumberChar(r3, "Decimal point not followed by a digit");
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ec -> B:47:0x00c3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _startFloat(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.expandCurrentSegment();
            }
            cArr[i] = CoreConstants.DOT;
            i++;
            i4 = 0;
            while (true) {
                int i7 = this._inputPtr;
                if (i7 >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i);
                    this._minorState = 30;
                    this._fractLength = i4;
                    JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken;
                    return jsonToken;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i7 + 1;
                byte b = bArr[i7];
                if (b < 48 || b > 57) {
                    break;
                }
                if (i >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                cArr[i] = (char) b;
                i4++;
                i++;
            }
        } else {
            i3 = i2;
            i4 = 0;
        }
        this._fractLength = i4;
        if (i3 == 101 || i3 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.expandCurrentSegment();
            }
            int i8 = i + 1;
            cArr[i] = (char) i3;
            int i9 = this._inputPtr;
            if (i9 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i8);
                this._minorState = 31;
                this._expLength = 0;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i9 + 1;
            byte b2 = bArr2[i9];
            if (b2 == 45 || b2 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                i5 = i8 + 1;
                cArr[i8] = (char) b2;
                int i10 = this._inputPtr;
                if (i10 >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i5);
                    this._minorState = 32;
                    this._expLength = 0;
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                byte[] bArr3 = this._inputBuffer;
                this._inputPtr = i10 + 1;
                b2 = bArr3[i10];
                i8 = i5;
            }
            if (b2 < 48 && b2 <= 57) {
                i6++;
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.expandCurrentSegment();
                }
                i5 = i8 + 1;
                cArr[i8] = (char) b2;
                int i11 = this._inputPtr;
                if (i11 >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i5);
                    this._minorState = 32;
                    this._expLength = i6;
                    JsonToken jsonToken4 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                }
                byte[] bArr4 = this._inputBuffer;
                this._inputPtr = i11 + 1;
                b2 = bArr4[i11];
                i8 = i5;
                if (b2 < 48) {
                }
                int i12 = b2 & UByte.MAX_VALUE;
                if (i6 == 0) {
                }
                i = i8;
            } else {
                int i122 = b2 & UByte.MAX_VALUE;
                if (i6 == 0) {
                    reportUnexpectedNumberChar(i122, "Exponent indicator not followed by a digit");
                }
                i = i8;
            }
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i);
        this._expLength = i6;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken _startFloatThatStartsWithPeriod() throws IOException {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    public JsonToken _startNegativeNumber() throws IOException {
        this._numberNegative = true;
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = 2;
        if (i2 <= 48) {
            if (i2 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = CoreConstants.DASH_CHAR;
        emptyAndGetCurrentSegment[1] = (char) i2;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i5 = this._inputBuffer[i4];
        while (true) {
            if (i5 < 48) {
                if (i5 == 46) {
                    this._intLength = i3 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i3, i5);
                }
            } else if (i5 > 57) {
                if (i5 == 101 || i5 == 69) {
                    this._intLength = i3 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i3, i5);
                }
            } else {
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i6 = i3 + 1;
                emptyAndGetCurrentSegment[i3] = (char) i5;
                int i7 = this._inputPtr + 1;
                this._inputPtr = i7;
                if (i7 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i6);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i5 = this._inputBuffer[i7] & UByte.MAX_VALUE;
                i3 = i6;
            }
        }
        this._intLength = i3 - 1;
        this._textBuffer.setCurrentLength(i3);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startNullToken() throws IOException {
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
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    public JsonToken _startNumberLeadingZero() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int i3 = this._inputBuffer[i] & UByte.MAX_VALUE;
        if (i3 < 48) {
            if (i3 == 46) {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment, 1, i3);
            }
        } else if (i3 > 57) {
            if (i3 != 101 && i3 != 69) {
                if (i3 != 93 && i3 != 125) {
                    reportUnexpectedNumberChar(i3, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment2, 1, i3);
            }
        } else {
            return _finishNumberLeadingZeroes();
        }
        return _valueCompleteInt(0, "0");
    }

    public JsonToken _startPositiveNumber(int i) throws IOException {
        this._numberNegative = false;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = (char) i;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2] & UByte.MAX_VALUE;
        int i4 = 1;
        while (true) {
            if (i3 < 48) {
                if (i3 == 46) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i4, i3);
                }
            } else if (i3 > 57) {
                if (i3 == 101 || i3 == 69) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i4, i3);
                }
            } else {
                if (i4 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i5 = i4 + 1;
                emptyAndGetCurrentSegment[i4] = (char) i3;
                int i6 = this._inputPtr + 1;
                this._inputPtr = i6;
                if (i6 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i5);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i3 = this._inputBuffer[i6] & UByte.MAX_VALUE;
                i4 = i5;
            }
        }
        this._intLength = i4;
        this._textBuffer.setCurrentLength(i4);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startString() throws IOException {
        int i = this._inputPtr;
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
                    return _valueComplete(JsonToken.VALUE_STRING);
                }
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return _finishRegularString();
    }

    public JsonToken _startTrueToken() throws IOException {
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
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r2._parsingContext.inArray() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        if (r2._parsingContext.inRoot() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        if ((r2._features & com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        r2._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _startUnexpectedValue(boolean z, int i) throws IOException {
        if (i != 39) {
            if (i != 73) {
                if (i != 78) {
                    if (i != 93) {
                        if (i != 125) {
                            if (i == 43) {
                                return _finishNonStdToken(2, 1);
                            }
                        }
                    }
                } else {
                    return _finishNonStdToken(0, 1);
                }
            } else {
                return _finishNonStdToken(1, 1);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _startAposString();
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this._inputPtr;
        int i4 = this._inputEnd;
        if (i3 < i4) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i4 - i3));
        }
        if (i2 < i) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += this._origBufferLen;
        this._currInputRowStart = i - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i2;
        this._origBufferLen = i2 - i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            if (this._endOfInput) {
                if (this._currToken == JsonToken.NOT_AVAILABLE) {
                    return _finishTokenWithEOF();
                }
                return _eofAsNextToken();
            }
            return JsonToken.NOT_AVAILABLE;
        } else if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        } else {
            this._numTypesValid = 0;
            this._tokenInputTotal = this._currInputProcessed + i;
            this._binaryValue = null;
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & UByte.MAX_VALUE;
            switch (this._majorState) {
                case 0:
                    return _startDocument(i2);
                case 1:
                    return _startValue(i2);
                case 2:
                    return _startFieldName(i2);
                case 3:
                    return _startFieldNameAfterComma(i2);
                case 4:
                    return _startValueExpectColon(i2);
                case 5:
                    return _startValue(i2);
                case 6:
                    return _startValueExpectComma(i2);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 > 0) {
            outputStream.write(this._inputBuffer, i2, i3);
        }
        return i3;
    }
}
