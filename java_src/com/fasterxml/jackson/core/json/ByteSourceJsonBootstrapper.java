package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p030io.IOContext;
import com.fasterxml.jackson.core.p030io.MergedStream;
import com.fasterxml.jackson.core.p030io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* loaded from: classes5.dex */
public final class ByteSourceJsonBootstrapper {
    public static final byte UTF8_BOM_1 = -17;
    public static final byte UTF8_BOM_2 = -69;
    public static final byte UTF8_BOM_3 = -65;
    private boolean _bigEndian;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else if ((i & KotlinVersion.MAX_COMPONENT_VALUE) != 0) {
            return false;
        } else {
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i) throws IOException {
        if ((i >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i) == 0) {
            reportWeirdUCS4("3412");
        } else if ((i & (-65281)) != 0) {
            return false;
        } else {
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i) throws IOException {
        if (i != -16842752) {
            if (i != -131072) {
                if (i != 65279) {
                    if (i == 65534) {
                        reportWeirdUCS4("2143");
                    }
                } else {
                    this._bigEndian = true;
                    this._inputPtr += 4;
                    this._bytesPerChar = 4;
                    return true;
                }
            } else {
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                this._bigEndian = false;
                return true;
            }
        } else {
            reportWeirdUCS4("3412");
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        } else if (i2 == 65534) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = false;
            return true;
        } else if ((i >>> 8) != 15711167) {
            return false;
        } else {
            this._inputPtr += 3;
            this._bytesPerChar = 1;
            this._bigEndian = true;
            return true;
        }
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte = inputAccessor.nextByte();
        if (nextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            nextByte = inputAccessor.nextByte();
        }
        int skipSpace = skipSpace(inputAccessor, nextByte);
        if (skipSpace < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (skipSpace == 123) {
            int skipSpace2 = skipSpace(inputAccessor);
            if (skipSpace2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (skipSpace2 != 34 && skipSpace2 != 125) {
                return MatchStrength.NO_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else if (skipSpace == 91) {
            int skipSpace3 = skipSpace(inputAccessor);
            if (skipSpace3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (skipSpace3 != 93 && skipSpace3 != 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (skipSpace == 34) {
                return matchStrength;
            }
            if (skipSpace <= 57 && skipSpace >= 48) {
                return matchStrength;
            }
            if (skipSpace == 45) {
                int skipSpace4 = skipSpace(inputAccessor);
                if (skipSpace4 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                if (skipSpace4 > 57 || skipSpace4 < 48) {
                    return MatchStrength.NO_MATCH;
                }
                return matchStrength;
            } else if (skipSpace == 110) {
                return tryMatch(inputAccessor, "ull", matchStrength);
            } else {
                if (skipSpace == 116) {
                    return tryMatch(inputAccessor, "rue", matchStrength);
                }
                if (skipSpace == 102) {
                    return tryMatch(inputAccessor, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
    }

    private void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    private static int skipSpace(InputAccessor inputAccessor) throws IOException {
        if (inputAccessor.hasMoreBytes()) {
            return skipSpace(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 == 187) {
            int readUnsignedByte3 = dataInput.readUnsignedByte();
            if (readUnsignedByte3 == 191) {
                return dataInput.readUnsignedByte();
            }
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(readUnsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
    }

    private static MatchStrength tryMatch(InputAccessor inputAccessor, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public JsonParser constructParser(int i, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i2) throws IOException {
        int i3 = this._inputPtr;
        JsonEncoding detectEncoding = detectEncoding();
        int i4 = this._inputPtr - i3;
        if (detectEncoding == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new UTF8StreamJsonParser(this._context, i, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i2), this._inputBuffer, this._inputPtr, this._inputEnd, i4, this._bufferRecyclable);
        }
        return new ReaderBasedJsonParser(this._context, i, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i2));
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int bits = encoding.bits();
        if (bits != 8 && bits != 16) {
            if (bits == 32) {
                IOContext iOContext = this._context;
                return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream inputStream = this._in;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
        } else if (this._inputPtr < this._inputEnd) {
            inputStream = new MergedStream(this._context, inputStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(inputStream, encoding.getJavaName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (checkUTF16(r1 >>> 16) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (checkUTF16((r1[r5 + 1] & kotlin.UByte.MAX_VALUE) | ((r1[r5] & kotlin.UByte.MAX_VALUE) << 8)) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonEncoding detectEncoding() throws IOException {
        JsonEncoding jsonEncoding;
        boolean z = false;
        if (ensureLoaded(4)) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = (bArr[i + 3] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
            if (!handleBOM(i2)) {
                if (!checkUTF32(i2)) {
                }
            }
            z = true;
        } else if (ensureLoaded(2)) {
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
        }
        if (!z) {
            jsonEncoding = JsonEncoding.UTF8;
        } else {
            int i4 = this._bytesPerChar;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 4) {
                        if (this._bigEndian) {
                            jsonEncoding = JsonEncoding.UTF32_BE;
                        } else {
                            jsonEncoding = JsonEncoding.UTF32_LE;
                        }
                    } else {
                        throw new RuntimeException("Internal error");
                    }
                } else if (this._bigEndian) {
                    jsonEncoding = JsonEncoding.UTF16_BE;
                } else {
                    jsonEncoding = JsonEncoding.UTF16_LE;
                }
            } else {
                jsonEncoding = JsonEncoding.UTF8;
            }
        }
        this._context.setEncoding(jsonEncoding);
        return jsonEncoding;
    }

    public boolean ensureLoaded(int i) throws IOException {
        int read;
        int i2 = this._inputEnd - this._inputPtr;
        while (i2 < i) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i3 = this._inputEnd;
                read = inputStream.read(bArr, i3, bArr.length - i3);
            }
            if (read < 1) {
                return false;
            }
            this._inputEnd += read;
            i2 += read;
        }
        return true;
    }

    private static int skipSpace(InputAccessor inputAccessor, byte b) throws IOException {
        while (true) {
            int i = b & UByte.MAX_VALUE;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b = inputAccessor.nextByte();
        }
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i + i2;
        this._bufferRecyclable = false;
    }
}
