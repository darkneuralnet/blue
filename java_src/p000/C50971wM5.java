package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.p056ws.WebSocketProtocol;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¨\u0006\u0007"}, m28432d2 = {"", "bits", "", "c", "", "value", "b", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50971wM5 {
    /* renamed from: b */
    public static final int m6969b(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i < i4) {
                length = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m6968c(long j) {
        int i;
        if ((4294967295L & j) == 0) {
            i = 32;
            j >>= 32;
        } else {
            i = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }
}
