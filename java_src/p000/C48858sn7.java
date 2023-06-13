package p000;

import android.util.Log;
/* renamed from: sn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48858sn7 implements InterfaceC42949ip7 {

    /* renamed from: a */
    public C41250fx7 f109251a;

    /* renamed from: b */
    public final C33141Gn7 f109252b;

    /* renamed from: c */
    public final String f109253c;

    /* renamed from: d */
    public final String f109254d;

    /* renamed from: e */
    public final String f109255e = "com.google.perception";

    /* renamed from: f */
    public final AbstractC52415yn7 f109256f;

    /* renamed from: g */
    public final C39974do7 f109257g;

    /* renamed from: h */
    public final InterfaceC33375Hn7 f109258h;

    /* renamed from: i */
    public final C50044un7 f109259i;

    public C48858sn7(C33141Gn7 c33141Gn7, String str, String str2, String str3, int i, AbstractC52415yn7 abstractC52415yn7, C39974do7 c39974do7, InterfaceC33375Hn7 interfaceC33375Hn7, C50044un7 c50044un7) {
        this.f109252b = c33141Gn7;
        this.f109253c = str;
        this.f109254d = str2;
        this.f109256f = abstractC52415yn7;
        this.f109257g = c39974do7;
        this.f109258h = interfaceC33375Hn7;
        this.f109259i = c50044un7;
    }

    /* renamed from: a */
    public final C41250fx7 m13665a() {
        return this.f109251a;
    }

    @Override // p000.InterfaceC42949ip7
    public final boolean zzb() {
        C33141Gn7 c33141Gn7 = new C33141Gn7(this.f109255e, 2);
        c33141Gn7.m104714f();
        try {
            try {
                Log.d("AccelerationAllowlist", "Calling goldblum client");
                this.f109251a = this.f109258h.mo53718a(this.f109256f, this.f109257g, this.f109253c, this.f109254d, this.f109255e, 2);
                c33141Gn7.m104715e();
                this.f109259i.m9736a(c33141Gn7);
                return true;
            } catch (C33609In7 e) {
                Log.d("AccelerationAllowlist", "Exception calling goldblum", e);
                this.f109252b.m104718b(e.m101710a());
                c33141Gn7.m104716d(e.m101710a());
                c33141Gn7.m104715e();
                this.f109259i.m9736a(c33141Gn7);
                return false;
            }
        } catch (Throwable th) {
            c33141Gn7.m104715e();
            this.f109259i.m9736a(c33141Gn7);
            throw th;
        }
    }
}
