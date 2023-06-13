package io.reactivex.disposables;

import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.InterfaceC23500c;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.C24484p;
import java.util.ArrayList;
/* renamed from: io.reactivex.disposables.b */
/* loaded from: classes6.dex */
public final class C23464b implements InterfaceC23465c, InterfaceC23500c {

    /* renamed from: b */
    public C24484p<InterfaceC23465c> f88230b;

    /* renamed from: c */
    public volatile boolean f88231c;

    @Override // io.reactivex.internal.disposables.InterfaceC23500c
    /* renamed from: a */
    public boolean mo32985a(InterfaceC23465c interfaceC23465c) {
        if (mo32984b(interfaceC23465c)) {
            interfaceC23465c.dispose();
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23500c
    /* renamed from: b */
    public boolean mo32984b(InterfaceC23465c interfaceC23465c) {
        C23544b.m32923e(interfaceC23465c, "disposables is null");
        if (this.f88231c) {
            return false;
        }
        synchronized (this) {
            if (this.f88231c) {
                return false;
            }
            C24484p<InterfaceC23465c> c24484p = this.f88230b;
            if (c24484p != null && c24484p.m32226e(interfaceC23465c)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23500c
    /* renamed from: c */
    public boolean mo32983c(InterfaceC23465c interfaceC23465c) {
        C23544b.m32923e(interfaceC23465c, "disposable is null");
        if (!this.f88231c) {
            synchronized (this) {
                if (!this.f88231c) {
                    C24484p<InterfaceC23465c> c24484p = this.f88230b;
                    if (c24484p == null) {
                        c24484p = new C24484p<>();
                        this.f88230b = c24484p;
                    }
                    c24484p.m32230a(interfaceC23465c);
                    return true;
                }
            }
        }
        interfaceC23465c.dispose();
        return false;
    }

    /* renamed from: d */
    public void m33026d() {
        if (this.f88231c) {
            return;
        }
        synchronized (this) {
            if (this.f88231c) {
                return;
            }
            C24484p<InterfaceC23465c> c24484p = this.f88230b;
            this.f88230b = null;
            m33025g(c24484p);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        if (this.f88231c) {
            return;
        }
        synchronized (this) {
            if (this.f88231c) {
                return;
            }
            this.f88231c = true;
            C24484p<InterfaceC23465c> c24484p = this.f88230b;
            this.f88230b = null;
            m33025g(c24484p);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f88231c;
    }

    /* renamed from: g */
    public void m33025g(C24484p<InterfaceC23465c> c24484p) {
        Object[] m32229b;
        if (c24484p == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c24484p.m32229b()) {
            if (obj instanceof InterfaceC23465c) {
                try {
                    ((InterfaceC23465c) obj).dispose();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C24475k.m32256e((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    /* renamed from: h */
    public int m33024h() {
        int i = 0;
        if (this.f88231c) {
            return 0;
        }
        synchronized (this) {
            if (this.f88231c) {
                return 0;
            }
            C24484p<InterfaceC23465c> c24484p = this.f88230b;
            if (c24484p != null) {
                i = c24484p.m32224g();
            }
            return i;
        }
    }
}
