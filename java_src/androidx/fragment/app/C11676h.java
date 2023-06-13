package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C11676h {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C11677a> f54717a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final FragmentManager f54718b;

    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes.dex */
    public static final class C11677a {

        /* renamed from: a */
        public final FragmentManager.AbstractC11638l f54719a;

        /* renamed from: b */
        public final boolean f54720b;

        public C11677a(FragmentManager.AbstractC11638l abstractC11638l, boolean z) {
            this.f54719a = abstractC11638l;
            this.f54720b = z;
        }
    }

    public C11676h(FragmentManager fragmentManager) {
        this.f54718b = fragmentManager;
    }

    /* renamed from: a */
    public void m67204a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67204a(fragment, bundle, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67273a(this.f54718b, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    public void m67203b(Fragment fragment, boolean z) {
        Context m67214f = this.f54718b.m67420A0().m67214f();
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67203b(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67272b(this.f54718b, fragment, m67214f);
            }
        }
    }

    /* renamed from: c */
    public void m67202c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67202c(fragment, bundle, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67271c(this.f54718b, fragment, bundle);
            }
        }
    }

    /* renamed from: d */
    public void m67201d(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67201d(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67270d(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: e */
    public void m67200e(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67200e(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67269e(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: f */
    public void m67199f(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67199f(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.mo4372f(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: g */
    public void m67198g(Fragment fragment, boolean z) {
        Context m67214f = this.f54718b.m67420A0().m67214f();
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67198g(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67268g(this.f54718b, fragment, m67214f);
            }
        }
    }

    /* renamed from: h */
    public void m67197h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67197h(fragment, bundle, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67267h(this.f54718b, fragment, bundle);
            }
        }
    }

    /* renamed from: i */
    public void m67196i(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67196i(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.mo4371i(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: j */
    public void m67195j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67195j(fragment, bundle, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67266j(this.f54718b, fragment, bundle);
            }
        }
    }

    /* renamed from: k */
    public void m67194k(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67194k(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67265k(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: l */
    public void m67193l(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67193l(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67264l(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: m */
    public void m67192m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67192m(fragment, view, bundle, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.mo65712m(this.f54718b, fragment, view, bundle);
            }
        }
    }

    /* renamed from: n */
    public void m67191n(Fragment fragment, boolean z) {
        Fragment m67411D0 = this.f54718b.m67411D0();
        if (m67411D0 != null) {
            m67411D0.getParentFragmentManager().m67414C0().m67191n(fragment, true);
        }
        Iterator<C11677a> it = this.f54717a.iterator();
        while (it.hasNext()) {
            C11677a next = it.next();
            if (!z || next.f54720b) {
                next.f54719a.m67263n(this.f54718b, fragment);
            }
        }
    }

    /* renamed from: o */
    public void m67190o(FragmentManager.AbstractC11638l abstractC11638l, boolean z) {
        this.f54717a.add(new C11677a(abstractC11638l, z));
    }

    /* renamed from: p */
    public void m67189p(FragmentManager.AbstractC11638l abstractC11638l) {
        synchronized (this.f54717a) {
            int size = this.f54717a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f54717a.get(i).f54719a == abstractC11638l) {
                    this.f54717a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
