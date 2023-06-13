package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Vv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36723Vv7 implements Iterator {

    /* renamed from: b */
    public int f39994b = -1;

    /* renamed from: c */
    public boolean f39995c;

    /* renamed from: d */
    public Iterator f39996d;

    /* renamed from: e */
    public final /* synthetic */ C37191Xv7 f39997e;

    public /* synthetic */ C36723Vv7(C37191Xv7 c37191Xv7, C35553Qv7 c35553Qv7) {
        this.f39997e = c37191Xv7;
    }

    /* renamed from: a */
    public final Iterator m79227a() {
        Map map;
        if (this.f39996d == null) {
            map = this.f39997e.f44241d;
            this.f39996d = map.entrySet().iterator();
        }
        return this.f39996d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f39994b + 1;
        list = this.f39997e.f44240c;
        if (i < list.size()) {
            return true;
        }
        map = this.f39997e.f44241d;
        if (!map.isEmpty() && m79227a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f39995c = true;
        int i = this.f39994b + 1;
        this.f39994b = i;
        list = this.f39997e.f44240c;
        if (i < list.size()) {
            list2 = this.f39997e.f44240c;
            return (Map.Entry) list2.get(this.f39994b);
        }
        return (Map.Entry) m79227a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f39995c) {
            this.f39995c = false;
            this.f39997e.m76084n();
            int i = this.f39994b;
            list = this.f39997e.f44240c;
            if (i < list.size()) {
                C37191Xv7 c37191Xv7 = this.f39997e;
                int i2 = this.f39994b;
                this.f39994b = i2 - 1;
                c37191Xv7.m76086l(i2);
                return;
            }
            m79227a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
