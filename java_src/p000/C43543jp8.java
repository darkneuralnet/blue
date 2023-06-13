package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: jp8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43543jp8 implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f93415b = -1;

    /* renamed from: c */
    public boolean f93416c;

    /* renamed from: d */
    public Iterator<Map.Entry> f93417d;

    /* renamed from: e */
    public final /* synthetic */ C33394Hp8 f93418e;

    public /* synthetic */ C43543jp8(C33394Hp8 c33394Hp8, C37588Zn8 c37588Zn8) {
        this.f93418e = c33394Hp8;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> m29864a() {
        Map map;
        if (this.f93417d == null) {
            map = this.f93418e.f13924d;
            this.f93417d = map.entrySet().iterator();
        }
        return this.f93417d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f93415b + 1;
        list = this.f93418e.f13923c;
        if (i < list.size()) {
            return true;
        }
        map = this.f93418e.f13924d;
        if (!map.isEmpty() && m29864a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f93416c = true;
        int i = this.f93415b + 1;
        this.f93415b = i;
        list = this.f93418e.f13923c;
        if (i < list.size()) {
            list2 = this.f93418e.f13923c;
            return (Map.Entry) list2.get(this.f93415b);
        }
        return m29864a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f93416c) {
            this.f93416c = false;
            this.f93418e.m103393n();
            int i = this.f93415b;
            list = this.f93418e.f13923c;
            if (i < list.size()) {
                C33394Hp8 c33394Hp8 = this.f93418e;
                int i2 = this.f93415b;
                this.f93415b = i2 - 1;
                c33394Hp8.m103395l(i2);
                return;
            }
            m29864a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
