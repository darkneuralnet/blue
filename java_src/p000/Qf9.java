package p000;

import java.util.NoSuchElementException;
/* renamed from: Qf9 */
/* loaded from: classes6.dex */
public final class Qf9 extends AbstractC45233mg9 {

    /* renamed from: b */
    public int f30739b = 0;

    /* renamed from: c */
    public final int f30740c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC45836nh9 f30741d;

    public Qf9(AbstractC45836nh9 abstractC45836nh9) {
        this.f30741d = abstractC45836nh9;
        this.f30740c = abstractC45836nh9.mo11924c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30739b < this.f30740c;
    }

    @Override // p000.Ag9
    public final byte zza() {
        int i = this.f30739b;
        if (i < this.f30740c) {
            this.f30739b = i + 1;
            return this.f30741d.mo11925b(i);
        }
        throw new NoSuchElementException();
    }
}
