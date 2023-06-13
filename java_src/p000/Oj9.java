package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Oj9 */
/* loaded from: classes5.dex */
public final class Oj9 implements Iterator {

    /* renamed from: b */
    public int f27154b = -1;

    /* renamed from: c */
    public boolean f27155c;

    /* renamed from: d */
    public Iterator f27156d;

    /* renamed from: e */
    public final /* synthetic */ C47052pk9 f27157e;

    public /* synthetic */ Oj9(C47052pk9 c47052pk9, Ij9 ij9) {
        this.f27157e = c47052pk9;
    }

    /* renamed from: a */
    public final Iterator m91602a() {
        Map map;
        if (this.f27156d == null) {
            map = this.f27157e.f104006d;
            this.f27156d = map.entrySet().iterator();
        }
        return this.f27156d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f27154b + 1;
        list = this.f27157e.f104005c;
        if (i < list.size()) {
            return true;
        }
        map = this.f27157e.f104006d;
        if (!map.isEmpty() && m91602a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f27155c = true;
        int i = this.f27154b + 1;
        this.f27154b = i;
        list = this.f27157e.f104005c;
        if (i < list.size()) {
            list2 = this.f27157e.f104005c;
            return (Map.Entry) list2.get(this.f27154b);
        }
        return (Map.Entry) m91602a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f27155c) {
            this.f27155c = false;
            this.f27157e.m18831n();
            int i = this.f27154b;
            list = this.f27157e.f104005c;
            if (i < list.size()) {
                C47052pk9 c47052pk9 = this.f27157e;
                int i2 = this.f27154b;
                this.f27154b = i2 - 1;
                c47052pk9.m18833l(i2);
                return;
            }
            m91602a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
