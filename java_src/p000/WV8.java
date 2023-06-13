package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: WV8 */
/* loaded from: classes6.dex */
public final class WV8 implements Iterator {

    /* renamed from: b */
    public int f41212b;

    /* renamed from: c */
    public Iterator f41213c;

    /* renamed from: d */
    public final /* synthetic */ BV8 f41214d;

    public WV8(BV8 bv8) {
        List list;
        this.f41214d = bv8;
        list = bv8.f2442c;
        this.f41212b = list.size();
    }

    /* renamed from: a */
    public final Iterator m78263a() {
        Map map;
        if (this.f41213c == null) {
            map = this.f41214d.f2446g;
            this.f41213c = map.entrySet().iterator();
        }
        return this.f41213c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f41212b;
        if (i > 0) {
            list = this.f41214d.f2442c;
            if (i <= list.size()) {
                return true;
            }
        }
        return m78263a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (m78263a().hasNext()) {
            return (Map.Entry) m78263a().next();
        }
        list = this.f41214d.f2442c;
        int i = this.f41212b - 1;
        this.f41212b = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ WV8(BV8 bv8, C47499qV8 c47499qV8) {
        this(bv8);
    }
}
