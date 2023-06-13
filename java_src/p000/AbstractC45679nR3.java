package p000;

import p000.C45086mR3;
import p000.C9194Wt;
/* renamed from: nR3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45679nR3 {

    /* renamed from: a */
    public static AbstractC45679nR3 f99938a = m23780a().mo23760a();

    /* renamed from: nR3$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC26510a {
        /* renamed from: a */
        public abstract AbstractC45679nR3 mo23760a();

        /* renamed from: b */
        public abstract AbstractC26510a mo23759b(String str);

        /* renamed from: c */
        public abstract AbstractC26510a mo23758c(long j);

        /* renamed from: d */
        public abstract AbstractC26510a mo23757d(String str);

        /* renamed from: e */
        public abstract AbstractC26510a mo23756e(String str);

        /* renamed from: f */
        public abstract AbstractC26510a mo23755f(String str);

        /* renamed from: g */
        public abstract AbstractC26510a mo23754g(C45086mR3.EnumC26097a enumC26097a);

        /* renamed from: h */
        public abstract AbstractC26510a mo23753h(long j);
    }

    /* renamed from: a */
    public static AbstractC26510a m23780a() {
        return new C9194Wt.C9196b().mo23753h(0L).mo23754g(C45086mR3.EnumC26097a.ATTEMPT_MIGRATION).mo23758c(0L);
    }

    /* renamed from: b */
    public abstract String mo23779b();

    /* renamed from: c */
    public abstract long mo23778c();

    /* renamed from: d */
    public abstract String mo23777d();

    /* renamed from: e */
    public abstract String mo23776e();

    /* renamed from: f */
    public abstract String mo23775f();

    /* renamed from: g */
    public abstract C45086mR3.EnumC26097a mo23774g();

    /* renamed from: h */
    public abstract long mo23773h();

    /* renamed from: i */
    public boolean m23772i() {
        return mo23774g() == C45086mR3.EnumC26097a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m23771j() {
        if (mo23774g() != C45086mR3.EnumC26097a.NOT_GENERATED && mo23774g() != C45086mR3.EnumC26097a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m23770k() {
        return mo23774g() == C45086mR3.EnumC26097a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m23769l() {
        return mo23774g() == C45086mR3.EnumC26097a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m23768m() {
        return mo23774g() == C45086mR3.EnumC26097a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC26510a mo23767n();

    /* renamed from: o */
    public AbstractC45679nR3 m23766o(String str, long j, long j2) {
        return mo23767n().mo23759b(str).mo23758c(j).mo23753h(j2).mo23760a();
    }

    /* renamed from: p */
    public AbstractC45679nR3 m23765p() {
        return mo23767n().mo23759b(null).mo23760a();
    }

    /* renamed from: q */
    public AbstractC45679nR3 m23764q(String str) {
        return mo23767n().mo23756e(str).mo23754g(C45086mR3.EnumC26097a.REGISTER_ERROR).mo23760a();
    }

    /* renamed from: r */
    public AbstractC45679nR3 m23763r() {
        return mo23767n().mo23754g(C45086mR3.EnumC26097a.NOT_GENERATED).mo23760a();
    }

    /* renamed from: s */
    public AbstractC45679nR3 m23762s(String str, String str2, long j, String str3, long j2) {
        return mo23767n().mo23757d(str).mo23754g(C45086mR3.EnumC26097a.REGISTERED).mo23759b(str3).mo23755f(str2).mo23758c(j2).mo23753h(j).mo23760a();
    }

    /* renamed from: t */
    public AbstractC45679nR3 m23761t(String str) {
        return mo23767n().mo23757d(str).mo23754g(C45086mR3.EnumC26097a.UNREGISTERED).mo23760a();
    }
}
