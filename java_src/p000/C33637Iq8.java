package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Iq8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33637Iq8 implements Iterator {

    /* renamed from: b */
    public int f16310b = -1;

    /* renamed from: c */
    public boolean f16311c;

    /* renamed from: d */
    public Iterator f16312d;

    /* renamed from: e */
    public final /* synthetic */ C33178Gr8 f16313e;

    /* renamed from: a */
    public final Iterator m101601a() {
        Map map;
        if (this.f16312d == null) {
            map = this.f16313e.f12558d;
            this.f16312d = map.entrySet().iterator();
        }
        return this.f16312d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f16310b + 1;
        list = this.f16313e.f12557c;
        if (i < list.size()) {
            return true;
        }
        map = this.f16313e.f12558d;
        if (!map.isEmpty() && m101601a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f16311c = true;
        int i = this.f16310b + 1;
        this.f16310b = i;
        list = this.f16313e.f12557c;
        if (i < list.size()) {
            list2 = this.f16313e.f12557c;
            return (Map.Entry) list2.get(this.f16310b);
        }
        return (Map.Entry) m101601a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f16311c) {
            this.f16311c = false;
            this.f16313e.m104656n();
            int i = this.f16310b;
            list = this.f16313e.f12557c;
            if (i < list.size()) {
                C33178Gr8 c33178Gr8 = this.f16313e;
                int i2 = this.f16310b;
                this.f16310b = i2 - 1;
                c33178Gr8.m104658l(i2);
                return;
            }
            m101601a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
