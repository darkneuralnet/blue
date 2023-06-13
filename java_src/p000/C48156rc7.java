package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: rc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48156rc7 implements Iterator {

    /* renamed from: b */
    public int f107325b = -1;

    /* renamed from: c */
    public boolean f107326c;

    /* renamed from: d */
    public Iterator f107327d;

    /* renamed from: e */
    public final /* synthetic */ C50526vc7 f107328e;

    public /* synthetic */ C48156rc7(C50526vc7 c50526vc7, C47563qc7 c47563qc7) {
        this.f107328e = c50526vc7;
    }

    /* renamed from: a */
    public final Iterator m15696a() {
        Map map;
        if (this.f107327d == null) {
            map = this.f107328e.f114410d;
            this.f107327d = map.entrySet().iterator();
        }
        return this.f107327d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f107325b + 1;
        list = this.f107328e.f114409c;
        if (i < list.size()) {
            return true;
        }
        map = this.f107328e.f114410d;
        if (!map.isEmpty() && m15696a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f107326c = true;
        int i = this.f107325b + 1;
        this.f107325b = i;
        list = this.f107328e.f114409c;
        if (i < list.size()) {
            list2 = this.f107328e.f114409c;
            return (Map.Entry) list2.get(this.f107325b);
        }
        return (Map.Entry) m15696a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f107326c) {
            this.f107326c = false;
            this.f107328e.m8351n();
            int i = this.f107325b;
            list = this.f107328e.f114409c;
            if (i < list.size()) {
                C50526vc7 c50526vc7 = this.f107328e;
                int i2 = this.f107325b;
                this.f107325b = i2 - 1;
                c50526vc7.m8353l(i2);
                return;
            }
            m15696a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
