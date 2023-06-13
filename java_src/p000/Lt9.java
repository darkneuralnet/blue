package p000;

import java.util.NoSuchElementException;
/* renamed from: Lt9 */
/* loaded from: classes5.dex */
public final class Lt9 extends AbstractC48950sw9 {

    /* renamed from: b */
    public int f22220b = 0;

    /* renamed from: c */
    public final int f22221c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC43604jv9 f22222d;

    public Lt9(AbstractC43604jv9 abstractC43604jv9) {
        this.f22222d = abstractC43604jv9;
        this.f22221c = abstractC43604jv9.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22220b < this.f22221c;
    }

    @Override // p000.InterfaceC31674Ag7
    public final byte nextByte() {
        int i = this.f22220b;
        if (i < this.f22221c) {
            this.f22220b = i + 1;
            return this.f22222d.mo11134A(i);
        }
        throw new NoSuchElementException();
    }
}
