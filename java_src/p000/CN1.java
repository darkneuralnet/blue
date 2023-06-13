package p000;

import java.io.InputStream;
import p000.WU2;
/* renamed from: CN1 */
/* loaded from: classes5.dex */
public class CN1 implements WU2<OC1, InputStream> {

    /* renamed from: b */
    public static final C43035iy3<Integer> f4008b = C43035iy3.m31548f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final SU2<OC1, OC1> f4009a;

    /* renamed from: CN1$a */
    /* loaded from: classes5.dex */
    public static class C1019a implements XU2<OC1, InputStream> {

        /* renamed from: a */
        public final SU2<OC1, OC1> f4010a = new SU2<>(500);

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<OC1, InputStream> mo19945b(QW2 qw2) {
            return new CN1(this.f4010a);
        }
    }

    public CN1() {
        this(null);
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<InputStream> mo19951b(OC1 oc1, int i, int i2, C48964sy3 c48964sy3) {
        SU2<OC1, OC1> su2 = this.f4009a;
        if (su2 != null) {
            OC1 m85372a = su2.m85372a(oc1, 0, 0);
            if (m85372a == null) {
                this.f4009a.m85371b(oc1, 0, 0, oc1);
            } else {
                oc1 = m85372a;
            }
        }
        return new WU2.C9060a<>(oc1, new PN1(oc1, ((Integer) c48964sy3.m13300c(f4008b)).intValue()));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(OC1 oc1) {
        return true;
    }

    public CN1(SU2<OC1, OC1> su2) {
        this.f4009a = su2;
    }
}
