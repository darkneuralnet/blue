package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: kz7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44235kz7 extends AbstractSet {

    /* renamed from: b */
    public final /* synthetic */ C43796kF7 f95332b;

    public C44235kz7(C43796kF7 c43796kF7) {
        this.f95332b = c43796kF7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f95332b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m29119q;
        Map m29126j = this.f95332b.m29126j();
        if (m29126j != null) {
            return m29126j.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            m29119q = this.f95332b.m29119q(entry.getKey());
            if (m29119q != -1) {
                Object[] objArr = this.f95332b.f94166e;
                objArr.getClass();
                if (C42418hv9.m35483a(objArr[m29119q], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C43796kF7 c43796kF7 = this.f95332b;
        Map m29126j = c43796kF7.m29126j();
        if (m29126j != null) {
            return m29126j.entrySet().iterator();
        }
        return new C32997Fx7(c43796kF7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m29120p;
        int i;
        Map m29126j = this.f95332b.m29126j();
        if (m29126j != null) {
            return m29126j.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C43796kF7 c43796kF7 = this.f95332b;
        if (c43796kF7.m29121o()) {
            return false;
        }
        m29120p = c43796kF7.m29120p();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object m29128h = C43796kF7.m29128h(this.f95332b);
        C43796kF7 c43796kF72 = this.f95332b;
        int[] iArr = c43796kF72.f94164c;
        iArr.getClass();
        Object[] objArr = c43796kF72.f94165d;
        objArr.getClass();
        Object[] objArr2 = c43796kF72.f94166e;
        objArr2.getClass();
        int m71715b = C37858aG7.m71715b(key, value, m29120p, m29128h, iArr, objArr, objArr2);
        if (m71715b == -1) {
            return false;
        }
        this.f95332b.m29122n(m71715b, m29120p);
        C43796kF7 c43796kF73 = this.f95332b;
        i = c43796kF73.f94168g;
        c43796kF73.f94168g = i - 1;
        this.f95332b.m29124l();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f95332b.size();
    }
}
