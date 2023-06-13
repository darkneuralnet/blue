package p000;

import java.util.NoSuchElementException;
/* renamed from: vL8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50372vL8 extends TL8 {

    /* renamed from: b */
    public int f113875b = 0;

    /* renamed from: c */
    public final int f113876c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC40913fO8 f113877d;

    public C50372vL8(AbstractC40913fO8 abstractC40913fO8) {
        this.f113877d = abstractC40913fO8;
        this.f113876c = abstractC40913fO8.mo41437c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f113875b < this.f113876c;
    }

    @Override // p000.InterfaceC48011rM8
    public final byte zza() {
        int i = this.f113875b;
        if (i < this.f113876c) {
            this.f113875b = i + 1;
            return this.f113877d.mo41438b(i);
        }
        throw new NoSuchElementException();
    }
}
