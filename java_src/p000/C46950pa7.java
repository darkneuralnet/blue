package p000;

import java.util.NoSuchElementException;
/* renamed from: pa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46950pa7 extends AbstractC48136ra7 {

    /* renamed from: b */
    public int f103823b = 0;

    /* renamed from: c */
    public final int f103824c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC32088Ca7 f103825d;

    public C46950pa7(AbstractC32088Ca7 abstractC32088Ca7) {
        this.f103825d = abstractC32088Ca7;
        this.f103824c = abstractC32088Ca7.mo1072c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f103823b < this.f103824c;
    }

    @Override // p000.InterfaceC51099wa7
    /* renamed from: y */
    public final byte mo6625y() {
        int i = this.f103823b;
        if (i < this.f103824c) {
            this.f103823b = i + 1;
            return this.f103825d.mo1073b(i);
        }
        throw new NoSuchElementException();
    }
}
