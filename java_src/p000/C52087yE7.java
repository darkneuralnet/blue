package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: yE7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52087yE7 implements Iterator {

    /* renamed from: b */
    public int f119172b = 0;

    /* renamed from: c */
    public final int f119173c;

    /* renamed from: d */
    public final /* synthetic */ TD7 f119174d;

    public C52087yE7(TD7 td7) {
        this.f119174d = td7;
        this.f119173c = td7.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f119172b < this.f119173c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final byte nextByte() {
        try {
            TD7 td7 = this.f119174d;
            int i = this.f119172b;
            this.f119172b = i + 1;
            return td7.mo8901s(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
