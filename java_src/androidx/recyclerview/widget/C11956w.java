package androidx.recyclerview.widget;

import android.view.View;
/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public class C11956w {

    /* renamed from: a */
    public final InterfaceC11958b f55594a;

    /* renamed from: b */
    public C11957a f55595b = new C11957a();

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* loaded from: classes.dex */
    public static class C11957a {

        /* renamed from: a */
        public int f55596a = 0;

        /* renamed from: b */
        public int f55597b;

        /* renamed from: c */
        public int f55598c;

        /* renamed from: d */
        public int f55599d;

        /* renamed from: e */
        public int f55600e;

        /* renamed from: a */
        public void m66121a(int i) {
            this.f55596a = i | this.f55596a;
        }

        /* renamed from: b */
        public boolean m66120b() {
            int i = this.f55596a;
            if ((i & 7) != 0 && (i & (m66119c(this.f55599d, this.f55597b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f55596a;
            if ((i2 & 112) != 0 && (i2 & (m66119c(this.f55599d, this.f55598c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f55596a;
            if ((i3 & 1792) != 0 && (i3 & (m66119c(this.f55600e, this.f55597b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f55596a;
            if ((i4 & 28672) != 0 && (i4 & (m66119c(this.f55600e, this.f55598c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public int m66119c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* renamed from: d */
        public void m66118d() {
            this.f55596a = 0;
        }

        /* renamed from: e */
        public void m66117e(int i, int i2, int i3, int i4) {
            this.f55597b = i;
            this.f55598c = i2;
            this.f55599d = i3;
            this.f55600e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11958b {
        /* renamed from: a */
        View mo66116a(int i);

        /* renamed from: b */
        int mo66115b();

        /* renamed from: c */
        int mo66114c();

        /* renamed from: d */
        int mo66113d(View view);

        /* renamed from: e */
        int mo66112e(View view);
    }

    public C11956w(InterfaceC11958b interfaceC11958b) {
        this.f55594a = interfaceC11958b;
    }

    /* renamed from: a */
    public View m66123a(int i, int i2, int i3, int i4) {
        int i5;
        int mo66115b = this.f55594a.mo66115b();
        int mo66114c = this.f55594a.mo66114c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View mo66116a = this.f55594a.mo66116a(i);
            this.f55595b.m66117e(mo66115b, mo66114c, this.f55594a.mo66113d(mo66116a), this.f55594a.mo66112e(mo66116a));
            if (i3 != 0) {
                this.f55595b.m66118d();
                this.f55595b.m66121a(i3);
                if (this.f55595b.m66120b()) {
                    return mo66116a;
                }
            }
            if (i4 != 0) {
                this.f55595b.m66118d();
                this.f55595b.m66121a(i4);
                if (this.f55595b.m66120b()) {
                    view = mo66116a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean m66122b(View view, int i) {
        this.f55595b.m66117e(this.f55594a.mo66115b(), this.f55594a.mo66114c(), this.f55594a.mo66113d(view), this.f55594a.mo66112e(view));
        if (i != 0) {
            this.f55595b.m66118d();
            this.f55595b.m66121a(i);
            return this.f55595b.m66120b();
        }
        return false;
    }
}
