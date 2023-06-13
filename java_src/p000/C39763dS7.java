package p000;

import android.content.Context;
/* renamed from: dS7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39763dS7 {

    /* renamed from: a */
    public final C45875nl8<C52555z18> f76625a;

    /* renamed from: b */
    public final DV7 f76626b;

    public C39763dS7(C45875nl8<C52555z18> c45875nl8, DV7 dv7) {
        this.f76625a = c45875nl8;
        this.f76626b = dv7;
    }

    /* renamed from: a */
    public static C39763dS7 m44247a(Context context) {
        return new C39763dS7(TQ7.m83664a(context, DQ7.m110472a(context)), RV7.m86681a());
    }

    /* renamed from: e */
    public static /* synthetic */ String m44243e(String str, String str2, C52555z18 c52555z18) {
        R28 r28 = c52555z18.m2001B().get(m44242f(str, str2));
        if (r28 == null) {
            return "";
        }
        return r28.m87392A();
    }

    /* renamed from: f */
    public static String m44242f(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    public final Mb9<String> m44246b(final String str, final String str2) {
        return C50508va9.m8426j(this.f76625a.m91231d(), new YH8() { // from class: jR7
            @Override // p000.YH8
            public final Object zza(Object obj) {
                return C39763dS7.m44243e(str, str2, (C52555z18) obj);
            }
        }, Hc9.m103649b());
    }

    /* renamed from: c */
    public final /* synthetic */ Mb9 m44245c(String str, String str2, String str3, C52555z18 c52555z18) throws Exception {
        H08 m108369q = c52555z18.m108369q();
        String m44242f = m44242f(str, str2);
        E28 m87389w = R28.m87389w();
        m87389w.m109477A(str3);
        m87389w.m109476y(this.f76626b.zza());
        m108369q.m104503y(m44242f, m87389w.m64021q());
        return C50508va9.m8430f(m108369q.m64021q());
    }

    /* renamed from: d */
    public final Mb9<Void> m44244d(final String str, final String str2, final String str3, String str4) {
        Mb9<Void> m91226i = this.f76625a.m91226i(new InterfaceC43713k69() { // from class: yR7
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                return C39763dS7.this.m44245c(str, str2, str3, (C52555z18) obj);
            }
        }, Hc9.m103649b());
        C50508va9.m8423m(m91226i, new NR7(this, str4, str3, str, str2), C40328eP7.f78379b);
        return m91226i;
    }
}
