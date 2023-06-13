package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
/* renamed from: oo */
/* loaded from: classes8.dex */
public class C27063oo implements Iterator<Object> {

    /* renamed from: b */
    public final Object f102508b;

    /* renamed from: c */
    public int f102509c = 0;

    public C27063oo(Object obj) {
        if (obj.getClass().isArray()) {
            this.f102508b = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f102509c < Array.getLength(this.f102508b);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f102508b;
        int i = this.f102509c;
        this.f102509c = i + 1;
        return Array.get(obj, i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
