package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: F59 */
/* loaded from: classes5.dex */
public final class F59 implements Iterator {

    /* renamed from: b */
    public int f8740b = -1;

    /* renamed from: c */
    public boolean f8741c;

    /* renamed from: d */
    public Iterator f8742d;

    /* renamed from: e */
    public final /* synthetic */ C44306l69 f8743e;

    public /* synthetic */ F59(C44306l69 c44306l69, C51410x59 c51410x59) {
        this.f8743e = c44306l69;
    }

    /* renamed from: a */
    public final Iterator m107746a() {
        Map map;
        if (this.f8742d == null) {
            map = this.f8743e.f95504d;
            this.f8742d = map.entrySet().iterator();
        }
        return this.f8742d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f8740b + 1;
        list = this.f8743e.f95503c;
        if (i < list.size()) {
            return true;
        }
        map = this.f8743e.f95504d;
        if (!map.isEmpty() && m107746a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f8741c = true;
        int i = this.f8740b + 1;
        this.f8740b = i;
        list = this.f8743e.f95503c;
        if (i < list.size()) {
            list2 = this.f8743e.f95503c;
            return (Map.Entry) list2.get(this.f8740b);
        }
        return (Map.Entry) m107746a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f8741c) {
            this.f8741c = false;
            this.f8743e.m27841n();
            int i = this.f8740b;
            list = this.f8743e.f95503c;
            if (i < list.size()) {
                C44306l69 c44306l69 = this.f8743e;
                int i2 = this.f8740b;
                this.f8740b = i2 - 1;
                c44306l69.m27843l(i2);
                return;
            }
            m107746a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
