package p000;

import p000.AbstractC50204v39;
/* renamed from: i39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42497i39 extends AbstractC38922c39 {
    public /* synthetic */ C42497i39(AbstractC50204v39.C29405a c29405a) {
        super(null);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: a */
    public final void mo26406a(C45462n39 c45462n39, C45462n39 c45462n392) {
        c45462n39.f99280b = c45462n392;
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: b */
    public final void mo26405b(C45462n39 c45462n39, Thread thread) {
        c45462n39.f99279a = thread;
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: c */
    public final boolean mo26404c(AbstractC50204v39<?> abstractC50204v39, C40718f39 c40718f39, C40718f39 c40718f392) {
        C40718f39 c40718f393;
        synchronized (abstractC50204v39) {
            c40718f393 = abstractC50204v39.f113459c;
            if (c40718f393 == c40718f39) {
                abstractC50204v39.f113459c = c40718f392;
                return true;
            }
            return false;
        }
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: d */
    public final boolean mo26403d(AbstractC50204v39<?> abstractC50204v39, Object obj, Object obj2) {
        Object obj3;
        synchronized (abstractC50204v39) {
            obj3 = abstractC50204v39.f113458b;
            if (obj3 == obj) {
                abstractC50204v39.f113458b = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: e */
    public final boolean mo26402e(AbstractC50204v39<?> abstractC50204v39, C45462n39 c45462n39, C45462n39 c45462n392) {
        C45462n39 c45462n393;
        synchronized (abstractC50204v39) {
            c45462n393 = abstractC50204v39.f113460d;
            if (c45462n393 == c45462n39) {
                abstractC50204v39.f113460d = c45462n392;
                return true;
            }
            return false;
        }
    }

    private C42497i39() {
        super(null);
    }
}
