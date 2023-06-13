package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Bu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32034Bu7 implements Iterator {

    /* renamed from: b */
    public int f3029b = 0;

    /* renamed from: c */
    public final /* synthetic */ C43019iw7 f3030c;

    public C32034Bu7(C43019iw7 c43019iw7) {
        this.f3030c = c43019iw7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f3029b;
        str = this.f3030c.f91746b;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i = this.f3029b;
        str = this.f3030c.f91746b;
        if (i < str.length()) {
            this.f3029b = i + 1;
            return new C43019iw7(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
