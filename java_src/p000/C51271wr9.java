package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: wr9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51271wr9 implements Iterator<Map.Entry> {

    /* renamed from: b */
    public int f116659b = -1;

    /* renamed from: c */
    public boolean f116660c;

    /* renamed from: d */
    public Iterator<Map.Entry> f116661d;

    /* renamed from: e */
    public final /* synthetic */ Ar9 f116662e;

    public /* synthetic */ C51271wr9(Ar9 ar9, C44157kr9 c44157kr9) {
        this.f116662e = ar9;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> m6211a() {
        Map map;
        if (this.f116661d == null) {
            map = this.f116662e.f1277d;
            this.f116661d = map.entrySet().iterator();
        }
        return this.f116661d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f116659b + 1;
        list = this.f116662e.f1276c;
        if (i < list.size()) {
            return true;
        }
        map = this.f116662e.f1277d;
        if (!map.isEmpty() && m6211a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f116660c = true;
        int i = this.f116659b + 1;
        this.f116659b = i;
        list = this.f116662e.f1276c;
        if (i < list.size()) {
            list2 = this.f116662e.f1276c;
            return (Map.Entry) list2.get(this.f116659b);
        }
        return m6211a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f116660c) {
            this.f116660c = false;
            this.f116662e.m115009n();
            int i = this.f116659b;
            list = this.f116662e.f1276c;
            if (i < list.size()) {
                Ar9 ar9 = this.f116662e;
                int i2 = this.f116659b;
                this.f116659b = i2 - 1;
                ar9.m115011l(i2);
                return;
            }
            m6211a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
