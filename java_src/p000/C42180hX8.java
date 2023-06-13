package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: hX8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42180hX8 implements Iterator {

    /* renamed from: b */
    public int f85369b;

    /* renamed from: c */
    public boolean f85370c;

    /* renamed from: d */
    public Iterator f85371d;

    /* renamed from: e */
    public final /* synthetic */ BV8 f85372e;

    public C42180hX8(BV8 bv8) {
        this.f85372e = bv8;
        this.f85369b = -1;
    }

    /* renamed from: a */
    public final Iterator m36223a() {
        Map map;
        if (this.f85371d == null) {
            map = this.f85372e.f2443d;
            this.f85371d = map.entrySet().iterator();
        }
        return this.f85371d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f85369b + 1;
        list = this.f85372e.f2442c;
        if (i >= list.size()) {
            map = this.f85372e.f2443d;
            if (map.isEmpty() || !m36223a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f85370c = true;
        int i = this.f85369b + 1;
        this.f85369b = i;
        list = this.f85372e.f2442c;
        if (i < list.size()) {
            list2 = this.f85372e.f2442c;
            return (Map.Entry) list2.get(this.f85369b);
        }
        return (Map.Entry) m36223a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f85370c) {
            this.f85370c = false;
            this.f85372e.m113927p();
            int i = this.f85369b;
            list = this.f85372e.f2442c;
            if (i < list.size()) {
                BV8 bv8 = this.f85372e;
                int i2 = this.f85369b;
                this.f85369b = i2 - 1;
                bv8.m113932k(i2);
                return;
            }
            m36223a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ C42180hX8(BV8 bv8, C47499qV8 c47499qV8) {
        this(bv8);
    }
}
