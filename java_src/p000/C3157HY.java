package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u001a\u0017\u0010\b\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u001a\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000\u001a2\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0000\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"", "ms", "", "b", "", "", "e", "rhs", C17296a.f69688o, "i", "c", "K", "V", "", "Ljava/util/concurrent/ConcurrentHashMap;", DateTokenConverter.CONVERTER_KEY, "", "[C", "HEX", "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: HY */
/* loaded from: classes4.dex */
public final class C3157HY {

    /* renamed from: a */
    public static final char[] f13502a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        f13502a = charArray;
    }

    /* renamed from: a */
    public static final byte[] m103789a(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr2 == null) {
            return bArr;
        }
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        int i = 0;
        while (i < bArr.length) {
            bArr3[i] = bArr[i];
            i++;
        }
        while (i < length) {
            bArr3[i] = bArr2[i - bArr.length];
            i++;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static final void m103788b(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            C41318g46.m40160d("Error while trying to Thread.sleep(" + i + "): " + e, new Object[0]);
        }
    }

    /* renamed from: c */
    public static final int m103787c(int i) {
        return (i << 24) | (i >>> 24) | ((i >> 8) & 65280) | ((i << 8) & 16711680);
    }

    /* renamed from: d */
    public static final <K, V> ConcurrentHashMap<K, V> m103786d(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new ConcurrentHashMap<>(map);
    }

    /* renamed from: e */
    public static final String m103785e(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i] & UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = f13502a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }
}
