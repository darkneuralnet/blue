package p000;

import java.security.GeneralSecurityException;
import java.util.List;
import p000.C52828zV2;
import p000.InterfaceC52235yV2;
import p000.J24;
/* renamed from: AV2 */
/* loaded from: classes6.dex */
public final class AV2 {

    /* renamed from: a */
    public static final InterfaceC52235yV2.InterfaceC30599a f637a = new C0111b(null);

    /* renamed from: AV2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C0110a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f638a;

        static {
            int[] iArr = new int[EnumC33577Ik2.values().length];
            f638a = iArr;
            try {
                iArr[EnumC33577Ik2.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f638a[EnumC33577Ik2.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f638a[EnumC33577Ik2.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: AV2$b */
    /* loaded from: classes6.dex */
    public static class C0111b implements InterfaceC52235yV2.InterfaceC30599a {
        private C0111b() {
        }

        @Override // p000.InterfaceC52235yV2.InterfaceC30599a
        /* renamed from: a */
        public void mo3444a() {
        }

        @Override // p000.InterfaceC52235yV2.InterfaceC30599a
        /* renamed from: b */
        public void mo3443b(int i, long j) {
        }

        public /* synthetic */ C0111b(C0110a c0110a) {
            this();
        }
    }

    private AV2() {
    }

    /* renamed from: a */
    public static <P> C52828zV2 m115715a(J24<P> j24) {
        C52828zV2.C31018b m1304a = C52828zV2.m1304a();
        m1304a.m1300d(j24.m101279d());
        for (List<J24.C3872c<P>> list : j24.m101280c()) {
            for (J24.C3872c<P> c3872c : list) {
                m1304a.m1303a(m115714b(c3872c.m101261g()), c3872c.m101265c(), c3872c.m101263e());
            }
        }
        if (j24.m101278e() != null) {
            m1304a.m1299e(j24.m101278e().m101265c());
        }
        try {
            return m1304a.m1302b();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static C33343Hk2 m115714b(EnumC33577Ik2 enumC33577Ik2) {
        int i = C0110a.f638a[enumC33577Ik2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C33343Hk2.f13830d;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return C33343Hk2.f13829c;
        }
        return C33343Hk2.f13828b;
    }
}
