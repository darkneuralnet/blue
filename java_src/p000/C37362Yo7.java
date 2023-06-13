package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: Yo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37362Yo7 implements InterfaceC48868so7 {

    /* renamed from: a */
    public final C37092Xk7 f46679a;

    /* renamed from: b */
    public C32196Cm7 f46680b = new C32196Cm7();

    public C37362Yo7(C37092Xk7 c37092Xk7, int i) {
        this.f46679a = c37092Xk7;
        C44135kp7.m28378a();
    }

    /* renamed from: d */
    public static InterfaceC48868so7 m74182d(C37092Xk7 c37092Xk7) {
        return new C37362Yo7(c37092Xk7, 0);
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: a */
    public final byte[] mo13615a(int i, boolean z) {
        boolean z2;
        C32196Cm7 c32196Cm7 = this.f46680b;
        if (1 != (i ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        c32196Cm7.m111713f(Boolean.valueOf(z2));
        this.f46680b.m111714e(Boolean.FALSE);
        this.f46679a.m76462f(this.f46680b.m111706m());
        try {
            C44135kp7.m28378a();
            if (i == 0) {
                return new C47618qi2().m17220j(C35913Sj7.f34162a).m17219k(true).m17221i().encode(this.f46679a.m76461g()).getBytes("utf-8");
            }
            C50024ul7 m76461g = this.f46679a.m76461g();
            C48426s39 c48426s39 = new C48426s39();
            C35913Sj7.f34162a.configure(c48426s39);
            return c48426s39.m14818b().m114759a(m76461g);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: b */
    public final InterfaceC48868so7 mo13614b(EnumC36858Wk7 enumC36858Wk7) {
        this.f46679a.m76464d(enumC36858Wk7);
        return this;
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: c */
    public final InterfaceC48868so7 mo13613c(C32196Cm7 c32196Cm7) {
        this.f46680b = c32196Cm7;
        return this;
    }

    @Override // p000.InterfaceC48868so7
    public final int zza() {
        return 0;
    }

    @Override // p000.InterfaceC48868so7
    public final String zzd() {
        C32664Em7 m9795d = this.f46679a.m76461g().m9795d();
        if (m9795d != null && !NR8.m93890c(m9795d.m108374k())) {
            return (String) Preconditions.checkNotNull(m9795d.m108374k());
        }
        return "NA";
    }
}
