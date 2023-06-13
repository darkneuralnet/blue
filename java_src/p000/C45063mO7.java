package p000;

import android.content.Context;
import com.google.android.gms.internal.recaptcha.zzjx;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: mO7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45063mO7 {

    /* renamed from: a */
    public final C45875nl8<C52555z18> f97948a;

    /* renamed from: b */
    public final DV7 f97949b;

    /* renamed from: c */
    public final C39763dS7 f97950c;

    public C45063mO7(C45875nl8<C52555z18> c45875nl8, DV7 dv7, C39763dS7 c39763dS7) {
        this.f97948a = c45875nl8;
        this.f97949b = dv7;
        this.f97950c = c39763dS7;
    }

    /* renamed from: a */
    public static C45063mO7 m25667a(Context context) {
        return new C45063mO7(TQ7.m83664a(context, DQ7.m110472a(context)), RV7.m86681a(), C39763dS7.m44247a(context));
    }

    /* renamed from: b */
    public final /* synthetic */ C47230q28 m25666b(String str, String str2, C51291wt9 c51291wt9) {
        this.f97950c.m44244d(str, str2, c51291wt9.m6149B(), "RecaptchaLTManager");
        String m6150A = c51291wt9.m6150A();
        List<String> m6148C = c51291wt9.m6148C();
        List<Au9> m6147D = c51291wt9.m6147D();
        C48930su9 m6144y = c51291wt9.m6144y();
        Kr9 zza = this.f97949b.zza();
        C38318b28 m18262w = C47230q28.m18262w();
        m18262w.m65079C(m6150A);
        m18262w.m65077y(m6148C);
        m18262w.m65080B(zza);
        m18262w.m65081A(m6147D);
        m18262w.m65078D(m6144y);
        return m18262w.m64021q();
    }

    /* renamed from: c */
    public final Mb9<C47230q28> m25665c(final String str, final String str2, final OU7 ou7) {
        final AtomicReference atomicReference = new AtomicReference(null);
        return C50508va9.m8426j(this.f97948a.m91226i(KD8.m99067c(new InterfaceC43713k69() { // from class: XN7
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                return C45063mO7.this.m25664d(str, str2, ou7, atomicReference, (C52555z18) obj);
            }
        }), Hc9.m103649b()), new YH8() { // from class: IN7
            @Override // p000.YH8
            public final Object zza(Object obj) {
                C47230q28 c47230q28 = (C47230q28) atomicReference.get();
                Object[] objArr = new Object[0];
                if (c47230q28 != null) {
                    return c47230q28;
                }
                throw new zzjx(C40302eM8.m42992b("expected a non-null reference", objArr));
            }
        }, Hc9.m103649b());
    }

    /* renamed from: d */
    public final /* synthetic */ Mb9 m25664d(final String str, final String str2, final OU7 ou7, final AtomicReference atomicReference, final C52555z18 c52555z18) throws Exception {
        EJ8 m109180c;
        String str3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        final String sb2 = sb.toString();
        if (!c52555z18.m1999D(sb2)) {
            m109180c = EJ8.m109180c();
        } else {
            C47230q28 c47230q28 = c52555z18.m2000C().get(sb2);
            if (c47230q28 != null && C41805gt9.m37358a(c47230q28.m18272A(), this.f97949b.zza()).m72600x() <= 86400) {
                m109180c = EJ8.m109179d(c47230q28);
            } else {
                m109180c = EJ8.m109180c();
            }
        }
        if (!m109180c.mo21498b()) {
            CI7 ci7 = new CI7(C40328eP7.m42893b(), C40328eP7.f78379b, C51291wt9.m6145x());
            C44177kt9 m24743w = C45363mt9.m24743w();
            C52477yt9 m114974w = At9.m114974w();
            m114974w.m2318B(str);
            m114974w.m2319A(str2);
            String valueOf = String.valueOf(Eq9.m108326a());
            if (valueOf.length() != 0) {
                str3 = ";".concat(valueOf);
            } else {
                str3 = new String(";");
            }
            m114974w.m2317y(str3);
            m24743w.m28204y(m114974w.m64021q());
            m24743w.m28205A(true);
            return C50508va9.m8426j(C50508va9.m8426j(ci7.m112365a(m24743w.m64021q()), new YH8() { // from class: cN7
                @Override // p000.YH8
                public final Object zza(Object obj) {
                    return C45063mO7.this.m25666b(str, str2, (C51291wt9) obj);
                }
            }, Hc9.m103649b()), KD8.m99069a(new YH8() { // from class: tN7
                @Override // p000.YH8
                public final Object zza(Object obj) {
                    OU7 ou72 = OU7.this;
                    AtomicReference atomicReference2 = atomicReference;
                    C52555z18 c52555z182 = c52555z18;
                    String str4 = sb2;
                    C47230q28 c47230q282 = (C47230q28) obj;
                    ou72.m92167c(AT7.m115731c(ZP8.m73198y(c47230q282.m18268E()), c47230q282.m18271B()));
                    atomicReference2.set(c47230q282);
                    H08 m108369q = c52555z182.m108369q();
                    m108369q.m104504A(str4, c47230q282);
                    return m108369q.m64021q();
                }
            }), Hc9.m103649b());
        }
        ou7.m92167c(AT7.m115731c(ZP8.m73198y(((C47230q28) m109180c.mo21499a()).m18268E()), ((C47230q28) m109180c.mo21499a()).m18271B()));
        atomicReference.set((C47230q28) m109180c.mo21499a());
        return C50508va9.m8430f(c52555z18);
    }
}
