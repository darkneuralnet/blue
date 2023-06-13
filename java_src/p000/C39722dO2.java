package p000;

import android.util.Size;
import p000.DV5;
/* renamed from: dO2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39722dO2 {

    /* renamed from: a */
    public final C35664Ri1 f76551a;

    public C39722dO2() {
        this((C35664Ri1) S21.m86079a(C35664Ri1.class));
    }

    /* renamed from: a */
    public Size m44320a(Size size) {
        boolean z;
        C35664Ri1 c35664Ri1 = this.f76551a;
        if (c35664Ri1 == null) {
            return size;
        }
        Size m86431d = c35664Ri1.m86431d(DV5.EnumC1500b.PRIV);
        if (m86431d == null) {
            return size;
        }
        if (m86431d.getWidth() * m86431d.getHeight() > size.getWidth() * size.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m86431d;
        }
        return size;
    }

    public C39722dO2(C35664Ri1 c35664Ri1) {
        this.f76551a = c35664Ri1;
    }
}
