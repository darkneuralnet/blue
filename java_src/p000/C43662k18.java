package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: k18  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43662k18 implements Iterator {

    /* renamed from: b */
    public int f93778b;

    /* renamed from: c */
    public boolean f93779c;

    /* renamed from: d */
    public Iterator f93780d;

    /* renamed from: e */
    public final /* synthetic */ ZY7 f93781e;

    public C43662k18(ZY7 zy7) {
        this.f93781e = zy7;
        this.f93778b = -1;
    }

    /* renamed from: a */
    public final Iterator m29452a() {
        Map map;
        if (this.f93780d == null) {
            map = this.f93781e.f48759d;
            this.f93780d = map.entrySet().iterator();
        }
        return this.f93780d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f93778b + 1;
        list = this.f93781e.f48758c;
        if (i >= list.size()) {
            map = this.f93781e.f48759d;
            if (map.isEmpty() || !m29452a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f93779c = true;
        int i = this.f93778b + 1;
        this.f93778b = i;
        list = this.f93781e.f48758c;
        if (i < list.size()) {
            list2 = this.f93781e.f48758c;
            return (Map.Entry) list2.get(this.f93778b);
        }
        return (Map.Entry) m29452a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f93779c) {
            this.f93779c = false;
            this.f93781e.m72942n();
            int i = this.f93778b;
            list = this.f93781e.f48758c;
            if (i < list.size()) {
                ZY7 zy7 = this.f93781e;
                int i2 = this.f93778b;
                this.f93778b = i2 - 1;
                zy7.m72951e(i2);
                return;
            }
            m29452a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ C43662k18(ZY7 zy7, QZ7 qz7) {
        this(zy7);
    }
}
