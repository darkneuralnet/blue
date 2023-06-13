package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Gb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33034Gb8 implements Iterator {

    /* renamed from: b */
    public int f12138b;

    /* renamed from: c */
    public boolean f12139c;

    /* renamed from: d */
    public Iterator f12140d;

    /* renamed from: e */
    public final /* synthetic */ C48485s98 f12141e;

    public C33034Gb8(C48485s98 c48485s98) {
        this.f12141e = c48485s98;
        this.f12138b = -1;
    }

    /* renamed from: a */
    public final Iterator m104974a() {
        Map map;
        if (this.f12140d == null) {
            map = this.f12141e.f108403d;
            this.f12140d = map.entrySet().iterator();
        }
        return this.f12140d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f12138b + 1;
        list = this.f12141e.f108402c;
        if (i >= list.size()) {
            map = this.f12141e.f108403d;
            if (map.isEmpty() || !m104974a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f12139c = true;
        int i = this.f12138b + 1;
        this.f12138b = i;
        list = this.f12141e.f108402c;
        if (i < list.size()) {
            list2 = this.f12141e.f108402c;
            next = list2.get(this.f12138b);
        } else {
            next = m104974a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f12139c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f12139c = false;
        this.f12141e.m14619o();
        int i = this.f12138b;
        list = this.f12141e.f108402c;
        if (i >= list.size()) {
            m104974a().remove();
            return;
        }
        C48485s98 c48485s98 = this.f12141e;
        int i2 = this.f12138b;
        this.f12138b = i2 - 1;
        c48485s98.m14626h(i2);
    }

    public /* synthetic */ C33034Gb8(C48485s98 c48485s98, H98 h98) {
        this(c48485s98);
    }
}
