package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: CZ7 */
/* loaded from: classes5.dex */
public final class CZ7 implements Iterator {

    /* renamed from: b */
    public int f4248b;

    /* renamed from: c */
    public Iterator f4249c;

    /* renamed from: d */
    public final /* synthetic */ ZY7 f4250d;

    public CZ7(ZY7 zy7) {
        List list;
        this.f4250d = zy7;
        list = zy7.f48758c;
        this.f4248b = list.size();
    }

    /* renamed from: a */
    public final Iterator m112108a() {
        Map map;
        if (this.f4249c == null) {
            map = this.f4250d.f48762g;
            this.f4249c = map.entrySet().iterator();
        }
        return this.f4249c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f4248b;
        if (i > 0) {
            list = this.f4250d.f48758c;
            if (i <= list.size()) {
                return true;
            }
        }
        return m112108a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (m112108a().hasNext()) {
            return (Map.Entry) m112108a().next();
        }
        list = this.f4250d.f48758c;
        int i = this.f4248b - 1;
        this.f4248b = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ CZ7(ZY7 zy7, QZ7 qz7) {
        this(zy7);
    }
}
