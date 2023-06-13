package com.fasterxml.jackson.core.p030io;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;
/* renamed from: com.fasterxml.jackson.core.io.JsonStringEncoder */
/* loaded from: classes5.dex */
public final class JsonStringEncoder {
    static final int MAX_BYTE_BUFFER_SIZE = 32000;
    static final int MAX_CHAR_BUFFER_SIZE = 32000;
    static final int MIN_BYTE_BUFFER_SIZE = 24;
    static final int MIN_CHAR_BUFFER_SIZE = 16;
    private static final int SURR1_FIRST = 55296;
    private static final int SURR1_LAST = 56319;
    private static final int SURR2_FIRST = 56320;
    private static final int SURR2_LAST = 57343;

    /* renamed from: HC */
    private static final char[] f69948HC = CharTypes.copyHexChars();

    /* renamed from: HB */
    private static final byte[] f69947HB = CharTypes.copyHexBytes();
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    private int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                int i4 = i >> 8;
                byte[] bArr = f69947HB;
                byteArrayBuilder.append(bArr[i4 >> 4]);
                byteArrayBuilder.append(bArr[i4 & 15]);
                i &= KotlinVersion.MAX_COMPONENT_VALUE;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = f69947HB;
            byteArrayBuilder.append(bArr2[i >> 4]);
            byteArrayBuilder.append(bArr2[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f69948HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private static int _convert(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    public static int _initialByteBufSize(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }

    public static int _initialCharBufSize(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    private char[] _qbuf() {
        return new char[]{CoreConstants.ESCAPE_CHAR, 0, '0', '0'};
    }

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] encodeAsUTF8(String str) {
        int i;
        char c;
        int length = str.length();
        int _initialByteBufSize = _initialByteBufSize(length);
        byte[] bArr = new byte[_initialByteBufSize];
        ByteArrayBuilder byteArrayBuilder = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= _initialByteBufSize) {
                    if (byteArrayBuilder == null) {
                        byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i3);
                    }
                    byte[] finishCurrentSegment = byteArrayBuilder.finishCurrentSegment();
                    i3 = 0;
                    bArr = finishCurrentSegment;
                    _initialByteBufSize = finishCurrentSegment.length;
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                char charAt2 = str.charAt(i4);
                i4++;
                charAt = charAt2;
                i3 = i5;
            }
            if (byteArrayBuilder == null) {
                byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i3);
            }
            if (i3 >= _initialByteBufSize) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                _initialByteBufSize = bArr.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                i = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
            } else if (charAt >= 55296 && charAt <= 57343) {
                if (charAt > 56319) {
                    _illegal(charAt);
                }
                if (i4 >= length) {
                    _illegal(charAt);
                }
                int i6 = i4 + 1;
                int _convert = _convert(charAt, str.charAt(i4));
                if (_convert > 1114111) {
                    _illegal(_convert);
                }
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((_convert >> 18) | 240);
                if (i7 >= _initialByteBufSize) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    _initialByteBufSize = bArr.length;
                    i7 = 0;
                }
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((_convert >> 12) & 63) | 128);
                if (i8 >= _initialByteBufSize) {
                    byte[] finishCurrentSegment2 = byteArrayBuilder.finishCurrentSegment();
                    i8 = 0;
                    bArr = finishCurrentSegment2;
                    _initialByteBufSize = finishCurrentSegment2.length;
                }
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((_convert >> 6) & 63) | 128);
                c = _convert;
                i2 = i6;
                i = i9;
                if (i < _initialByteBufSize) {
                    byte[] finishCurrentSegment3 = byteArrayBuilder.finishCurrentSegment();
                    i = 0;
                    bArr = finishCurrentSegment3;
                    _initialByteBufSize = finishCurrentSegment3.length;
                }
                bArr[i] = (byte) ((c & '?') | 128);
                i3 = i + 1;
            } else {
                int i10 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> '\f') | 224);
                if (i10 >= _initialByteBufSize) {
                    byte[] finishCurrentSegment4 = byteArrayBuilder.finishCurrentSegment();
                    i10 = 0;
                    bArr = finishCurrentSegment4;
                    _initialByteBufSize = finishCurrentSegment4.length;
                }
                bArr[i10] = (byte) (((charAt >> 6) & 63) | 128);
                i = i10 + 1;
            }
            c = charAt;
            i2 = i4;
            if (i < _initialByteBufSize) {
            }
            bArr[i] = (byte) ((c & '?') | 128);
            i3 = i + 1;
        }
        if (byteArrayBuilder == null) {
            return Arrays.copyOfRange(bArr, 0, i3);
        }
        return byteArrayBuilder.completeAndCoalesce(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r10 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r10 <= r1.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r10 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r5 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        r1 = r5.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        r6 = _qbuf();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] quoteAsString(String str) {
        int i;
        int length = str.length();
        char[] cArr = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        TextBuffer textBuffer = null;
        int i2 = 0;
        int i3 = 0;
        char[] cArr2 = null;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            while (true) {
                char charAt = str.charAt(i2);
                if (charAt < length2 && iArr[charAt] != 0) {
                    break;
                }
                if (i3 >= cArr.length) {
                    if (textBuffer == null) {
                        textBuffer = TextBuffer.fromInitial(cArr);
                    }
                    cArr = textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                int i4 = i3 + 1;
                cArr[i3] = charAt;
                i2++;
                if (i2 >= length) {
                    i3 = i4;
                    break loop0;
                }
                i3 = i4;
            }
            i2 = i;
        }
        if (textBuffer == null) {
            return Arrays.copyOfRange(cArr, 0, i3);
        }
        textBuffer.setCurrentLength(i3);
        return textBuffer.contentsAsArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] quoteAsUTF8(String str) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        byte[] bArr = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilder = null;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt > 127 || iArr[charAt] != 0) {
                    break;
                }
                if (i5 >= bArr.length) {
                    if (byteArrayBuilder == null) {
                        byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i5);
                    }
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    i5 = 0;
                }
                int i6 = i5 + 1;
                bArr[i5] = (byte) charAt;
                i4++;
                if (i4 >= length) {
                    i5 = i6;
                    break loop0;
                }
                i5 = i6;
            }
            if (byteArrayBuilder == null) {
                byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i5);
            }
            if (i5 >= bArr.length) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                i5 = 0;
            }
            int i7 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 <= 127) {
                i5 = _appendByte(charAt2, iArr[charAt2], byteArrayBuilder, i5);
                bArr = byteArrayBuilder.getCurrentSegment();
                i4 = i7;
            } else {
                if (charAt2 <= 2047) {
                    i2 = i5 + 1;
                    bArr[i5] = (byte) ((charAt2 >> 6) | 192);
                    i = (charAt2 & '?') | 128;
                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                    if (charAt2 > 56319) {
                        _illegal(charAt2);
                    }
                    if (i7 >= length) {
                        _illegal(charAt2);
                    }
                    int i8 = i7 + 1;
                    int _convert = _convert(charAt2, str.charAt(i7));
                    if (_convert > 1114111) {
                        _illegal(_convert);
                    }
                    int i9 = i5 + 1;
                    bArr[i5] = (byte) ((_convert >> 18) | 240);
                    if (i9 >= bArr.length) {
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i9 = 0;
                    }
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) (((_convert >> 12) & 63) | 128);
                    if (i10 >= bArr.length) {
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i10 = 0;
                    }
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((_convert >> 6) & 63) | 128);
                    i3 = (_convert & 63) | 128;
                    i4 = i8;
                    i2 = i11;
                    if (i2 >= bArr.length) {
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i2 = 0;
                    }
                    bArr[i2] = (byte) i3;
                    i5 = i2 + 1;
                } else {
                    int i12 = i5 + 1;
                    bArr[i5] = (byte) ((charAt2 >> '\f') | 224);
                    if (i12 >= bArr.length) {
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i12 = 0;
                    }
                    bArr[i12] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i = (charAt2 & '?') | 128;
                    i2 = i12 + 1;
                }
                i3 = i;
                i4 = i7;
                if (i2 >= bArr.length) {
                }
                bArr[i2] = (byte) i3;
                i5 = i2 + 1;
            }
        }
        if (byteArrayBuilder == null) {
            return Arrays.copyOfRange(bArr, 0, i5);
        }
        return byteArrayBuilder.completeAndCoalesce(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r6 = _qbuf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r10 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r10 <= r1.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r10 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] quoteAsString(CharSequence charSequence) {
        int i;
        if (charSequence instanceof String) {
            return quoteAsString((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        TextBuffer textBuffer = null;
        char[] cArr2 = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            while (true) {
                char charAt = charSequence.charAt(i2);
                if (charAt < length2 && iArr[charAt] != 0) {
                    break;
                }
                if (i3 >= cArr.length) {
                    if (textBuffer == null) {
                        textBuffer = TextBuffer.fromInitial(cArr);
                    }
                    cArr = textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                int i4 = i3 + 1;
                cArr[i3] = charAt;
                i2++;
                if (i2 >= length) {
                    i3 = i4;
                    break loop0;
                }
                i3 = i4;
            }
            i2 = i;
        }
        if (textBuffer == null) {
            return Arrays.copyOfRange(cArr, 0, i3);
        }
        textBuffer.setCurrentLength(i3);
        return textBuffer.contentsAsArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] encodeAsUTF8(CharSequence charSequence) {
        int i;
        char c;
        int length = charSequence.length();
        int _initialByteBufSize = _initialByteBufSize(length);
        byte[] bArr = new byte[_initialByteBufSize];
        ByteArrayBuilder byteArrayBuilder = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            int i4 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            while (charAt <= 127) {
                if (i3 >= _initialByteBufSize) {
                    if (byteArrayBuilder == null) {
                        byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i3);
                    }
                    byte[] finishCurrentSegment = byteArrayBuilder.finishCurrentSegment();
                    i3 = 0;
                    bArr = finishCurrentSegment;
                    _initialByteBufSize = finishCurrentSegment.length;
                }
                int i5 = i3 + 1;
                bArr[i3] = (byte) charAt;
                if (i4 >= length) {
                    i3 = i5;
                    break loop0;
                }
                char charAt2 = charSequence.charAt(i4);
                i4++;
                charAt = charAt2;
                i3 = i5;
            }
            if (byteArrayBuilder == null) {
                byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i3);
            }
            if (i3 >= _initialByteBufSize) {
                bArr = byteArrayBuilder.finishCurrentSegment();
                _initialByteBufSize = bArr.length;
                i3 = 0;
            }
            if (charAt < 2048) {
                i = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
            } else if (charAt >= 55296 && charAt <= 57343) {
                if (charAt > 56319) {
                    _illegal(charAt);
                }
                if (i4 >= length) {
                    _illegal(charAt);
                }
                int i6 = i4 + 1;
                int _convert = _convert(charAt, charSequence.charAt(i4));
                if (_convert > 1114111) {
                    _illegal(_convert);
                }
                int i7 = i3 + 1;
                bArr[i3] = (byte) ((_convert >> 18) | 240);
                if (i7 >= _initialByteBufSize) {
                    bArr = byteArrayBuilder.finishCurrentSegment();
                    _initialByteBufSize = bArr.length;
                    i7 = 0;
                }
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((_convert >> 12) & 63) | 128);
                if (i8 >= _initialByteBufSize) {
                    byte[] finishCurrentSegment2 = byteArrayBuilder.finishCurrentSegment();
                    i8 = 0;
                    bArr = finishCurrentSegment2;
                    _initialByteBufSize = finishCurrentSegment2.length;
                }
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((_convert >> 6) & 63) | 128);
                c = _convert;
                i2 = i6;
                i = i9;
                if (i < _initialByteBufSize) {
                    byte[] finishCurrentSegment3 = byteArrayBuilder.finishCurrentSegment();
                    i = 0;
                    bArr = finishCurrentSegment3;
                    _initialByteBufSize = finishCurrentSegment3.length;
                }
                bArr[i] = (byte) ((c & '?') | 128);
                i3 = i + 1;
            } else {
                int i10 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> '\f') | 224);
                if (i10 >= _initialByteBufSize) {
                    byte[] finishCurrentSegment4 = byteArrayBuilder.finishCurrentSegment();
                    i10 = 0;
                    bArr = finishCurrentSegment4;
                    _initialByteBufSize = finishCurrentSegment4.length;
                }
                bArr[i10] = (byte) (((charAt >> 6) & 63) | 128);
                i = i10 + 1;
            }
            c = charAt;
            i2 = i4;
            if (i < _initialByteBufSize) {
            }
            bArr[i] = (byte) ((c & '?') | 128);
            i3 = i + 1;
        }
        if (byteArrayBuilder == null) {
            return Arrays.copyOfRange(bArr, 0, i3);
        }
        return byteArrayBuilder.completeAndCoalesce(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r6 = r5 + 1;
        r5 = r9.charAt(r5);
        r7 = r0[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        r5 = _appendNumeric(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r5 = _appendNamed(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        r10.append(r4, 0, r5);
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = _qbuf();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void quoteAsString(CharSequence charSequence, StringBuilder sb) {
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = charSequence.length();
        char[] cArr = null;
        int i = 0;
        while (i < length2) {
            while (true) {
                char charAt = charSequence.charAt(i);
                if (charAt < length && iArr[charAt] != 0) {
                    break;
                }
                sb.append(charAt);
                i++;
                if (i >= length2) {
                    return;
                }
            }
        }
    }
}
