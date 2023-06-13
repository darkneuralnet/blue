package p000;

import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p000.M70;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\r\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\" \u0010\n\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\" \u0010\r\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"", "", C17296a.f69688o, "map", "b", "[B", "getBASE64", "()[B", "getBASE64$annotations", "()V", "BASE64", "getBASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "BASE64_URL_SAFE", "okio"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: AJ6 */
/* loaded from: classes8.dex */
public final class AJ6 {

    /* renamed from: a */
    public static final byte[] f383a;

    /* renamed from: b */
    public static final byte[] f384b;

    static {
        M70.C5195a c5195a = M70.f22644e;
        f383a = c5195a.m95794d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m95807f();
        f384b = c5195a.m95794d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m95807f();
    }

    /* renamed from: a */
    public static final byte[] m115917a(String str) {
        boolean z;
        boolean z2;
        int i;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if ('A' <= charAt2 && charAt2 < '[') {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = charAt2 - 'A';
                } else {
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = charAt2 - 'G';
                    } else {
                        if (('0' > charAt2 || charAt2 >= ':') ? false : false) {
                            i = charAt2 + 4;
                        } else if (charAt2 != '+' && charAt2 != '-') {
                            if (charAt2 != '/' && charAt2 != '_') {
                                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                                    return null;
                                }
                                i3++;
                            } else {
                                i = 63;
                            }
                        } else {
                            i = 62;
                        }
                    }
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (i5 >> 16);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (i5 >> 8);
                    bArr[i8] = (byte) i5;
                    i6 = i8 + 1;
                }
                i3++;
            } else {
                int i9 = i4 % 4;
                if (i9 == 1) {
                    return null;
                }
                if (i9 != 2) {
                    if (i9 == 3) {
                        int i10 = i5 << 6;
                        int i11 = i6 + 1;
                        bArr[i6] = (byte) (i10 >> 16);
                        i6 = i11 + 1;
                        bArr[i11] = (byte) (i10 >> 8);
                    }
                } else {
                    bArr[i6] = (byte) ((i5 << 12) >> 16);
                    i6++;
                }
                if (i6 == i2) {
                    return bArr;
                }
                byte[] copyOf = Arrays.copyOf(bArr, i6);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
        }
    }

    /* renamed from: b */
    public static final String m115916b(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr2[i2] = map[(b & UByte.MAX_VALUE) >> 2];
            int i7 = i6 + 1;
            bArr2[i6] = map[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b2 & 15) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            i2 = i8 + 1;
            bArr2[i8] = map[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = bArr[i];
                byte b5 = bArr[i9];
                int i10 = i2 + 1;
                bArr2[i2] = map[(b4 & UByte.MAX_VALUE) >> 2];
                int i11 = i10 + 1;
                bArr2[i10] = map[((b4 & 3) << 4) | ((b5 & UByte.MAX_VALUE) >> 4)];
                bArr2[i11] = map[(b5 & 15) << 2];
                bArr2[i11 + 1] = (byte) 61;
            }
        } else {
            byte b6 = bArr[i];
            int i12 = i2 + 1;
            bArr2[i2] = map[(b6 & UByte.MAX_VALUE) >> 2];
            int i13 = i12 + 1;
            bArr2[i12] = map[(b6 & 3) << 4];
            byte b7 = (byte) 61;
            bArr2[i13] = b7;
            bArr2[i13 + 1] = b7;
        }
        return DJ6.m110575b(bArr2);
    }

    /* renamed from: c */
    public static /* synthetic */ String m115915c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f383a;
        }
        return m115916b(bArr, bArr2);
    }
}
