package io.reactivex.internal.disposables;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24475k;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* renamed from: io.reactivex.internal.disposables.f */
/* loaded from: classes7.dex */
public final class C23503f implements InterfaceC23465c, InterfaceC23500c {

    /* renamed from: b */
    public List<InterfaceC23465c> f88243b;

    /* renamed from: c */
    public volatile boolean f88244c;

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
        C23544b.m32923e(interfaceC23465c, "Disposable item is null");
        if (this.f88244c) {
            return false;
        }
        synchronized (this) {
            if (this.f88244c) {
                return false;
            }
            List<InterfaceC23465c> list = this.f88243b;
            if (list != null && list.remove(interfaceC23465c)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.internal.disposables.InterfaceC23500c
    /* renamed from: c */
    public boolean mo32983c(InterfaceC23465c interfaceC23465c) {
        C23544b.m32923e(interfaceC23465c, "d is null");
        if (!this.f88244c) {
            synchronized (this) {
                if (!this.f88244c) {
                    List list = this.f88243b;
                    if (list == null) {
                        list = new LinkedList();
                        this.f88243b = list;
                    }
                    list.add(interfaceC23465c);
                    return true;
                }
            }
        }
        interfaceC23465c.dispose();
        return false;
    }

    /* renamed from: d */
    public void m32982d(List<InterfaceC23465c> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (InterfaceC23465c interfaceC23465c : list) {
            try {
                interfaceC23465c.dispose();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C24475k.m32256e((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        if (this.f88244c) {
            return;
        }
        synchronized (this) {
            if (this.f88244c) {
                return;
            }
            this.f88244c = true;
            List<InterfaceC23465c> list = this.f88243b;
            this.f88243b = null;
            m32982d(list);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f88244c;
    }
}
