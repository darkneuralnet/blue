package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
/* renamed from: dd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39864dd6 {

    /* renamed from: c */
    public static final int[] f76917c = {1, 1, 2};

    /* renamed from: a */
    public final C38660bd6 f76918a = new C38660bd6();

    /* renamed from: b */
    public final C39253cd6 f76919b = new C39253cd6();

    /* renamed from: a */
    public C38511bN4 m44001a(int i, C1027CT c1027ct, int i2) throws NotFoundException {
        int[] m42687m = AbstractC40456ed6.m42687m(c1027ct, i2, false, f76917c);
        try {
            return this.f76919b.m61150b(i, c1027ct, m42687m);
        } catch (ReaderException unused) {
            return this.f76918a.m64248b(i, c1027ct, m42687m);
        }
    }
}
