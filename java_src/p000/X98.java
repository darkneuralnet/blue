package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: X98 */
/* loaded from: classes5.dex */
public final class X98 implements Iterator {

    /* renamed from: b */
    public int f42740b;

    /* renamed from: c */
    public Iterator f42741c;

    /* renamed from: d */
    public final /* synthetic */ C48485s98 f42742d;

    public X98(C48485s98 c48485s98) {
        List list;
        this.f42742d = c48485s98;
        list = c48485s98.f108402c;
        this.f42740b = list.size();
    }

    /* renamed from: a */
    public final Iterator m77271a() {
        Map map;
        if (this.f42741c == null) {
            map = this.f42742d.f108406g;
            this.f42741c = map.entrySet().iterator();
        }
        return this.f42741c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f42740b;
        if (i > 0) {
            list = this.f42742d.f108402c;
            if (i <= list.size()) {
                return true;
            }
        }
        return m77271a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (m77271a().hasNext()) {
            obj = m77271a().next();
        } else {
            list = this.f42742d.f108402c;
            int i = this.f42740b - 1;
            this.f42740b = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ X98(C48485s98 c48485s98, H98 h98) {
        this(c48485s98);
    }
}
