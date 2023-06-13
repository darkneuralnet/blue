package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJE\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0012H&R\u0017\u0010\f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"LKC0;", "Lhy5;", "LxB5;", "size", "Lpm2;", "layoutDirection", "Lg01;", "density", "LMz3;", C17296a.f69688o, "(JLpm2;Lg01;)LMz3;", "", "topStart", "topEnd", "bottomEnd", "bottomStart", DateTokenConverter.CONVERTER_KEY, "(JFFFFLpm2;)LMz3;", "LOC0;", "b", "LOC0;", "h", "()LOC0;", "g", "c", "e", "f", "<init>", "(LOC0;LOC0;LOC0;LOC0;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KC0 */
/* loaded from: classes.dex */
public abstract class KC0 implements InterfaceC42444hy5 {

    /* renamed from: a */
    public final OC0 f19246a;

    /* renamed from: b */
    public final OC0 f19247b;

    /* renamed from: c */
    public final OC0 f19248c;

    /* renamed from: d */
    public final OC0 f19249d;

    public KC0(OC0 topStart, OC0 topEnd, OC0 bottomEnd, OC0 bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.f19246a = topStart;
        this.f19247b = topEnd;
        this.f19248c = bottomEnd;
        this.f19249d = bottomStart;
    }

    /* renamed from: c */
    public static /* synthetic */ KC0 m99105c(KC0 kc0, OC0 oc0, OC0 oc02, OC0 oc03, OC0 oc04, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                oc0 = kc0.f19246a;
            }
            if ((i & 2) != 0) {
                oc02 = kc0.f19247b;
            }
            if ((i & 4) != 0) {
                oc03 = kc0.f19248c;
            }
            if ((i & 8) != 0) {
                oc04 = kc0.f19249d;
            }
            return kc0.mo64275b(oc0, oc02, oc03, oc04);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @Override // p000.InterfaceC42444hy5
    /* renamed from: a */
    public final AbstractC34649Mz3 mo35430a(long j, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density) {
        boolean z;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo27869a = this.f19246a.mo27869a(j, density);
        float mo27869a2 = this.f19247b.mo27869a(j, density);
        float mo27869a3 = this.f19248c.mo27869a(j, density);
        float mo27869a4 = this.f19249d.mo27869a(j, density);
        float m5731h = C51465xB5.m5731h(j);
        float f = mo27869a + mo27869a4;
        if (f > m5731h) {
            float f2 = m5731h / f;
            mo27869a *= f2;
            mo27869a4 *= f2;
        }
        float f3 = mo27869a4;
        float f4 = mo27869a2 + mo27869a3;
        if (f4 > m5731h) {
            float f5 = m5731h / f4;
            mo27869a2 *= f5;
            mo27869a3 *= f5;
        }
        if (mo27869a >= 0.0f && mo27869a2 >= 0.0f && mo27869a3 >= 0.0f && f3 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo64274d(j, mo27869a, mo27869a2, mo27869a3, f3, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo27869a + ", topEnd = " + mo27869a2 + ", bottomEnd = " + mo27869a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    /* renamed from: b */
    public abstract KC0 mo64275b(OC0 oc0, OC0 oc02, OC0 oc03, OC0 oc04);

    /* renamed from: d */
    public abstract AbstractC34649Mz3 mo64274d(long j, float f, float f2, float f3, float f4, EnumC47065pm2 enumC47065pm2);

    /* renamed from: e */
    public final OC0 m99104e() {
        return this.f19248c;
    }

    /* renamed from: f */
    public final OC0 m99103f() {
        return this.f19249d;
    }

    /* renamed from: g */
    public final OC0 m99102g() {
        return this.f19247b;
    }

    /* renamed from: h */
    public final OC0 m99101h() {
        return this.f19246a;
    }
}
