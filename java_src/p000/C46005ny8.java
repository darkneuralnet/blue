package p000;

import java.util.NoSuchElementException;
/* renamed from: ny8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46005ny8 extends AbstractC36517Uy8 {

    /* renamed from: b */
    public int f101168b = 0;

    /* renamed from: c */
    public final int f101169c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC53119zy8 f101170d;

    public C46005ny8(AbstractC53119zy8 abstractC53119zy8) {
        this.f101170d = abstractC53119zy8;
        this.f101169c = abstractC53119zy8.mo44b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f101168b < this.f101169c;
    }

    @Override // p000.InterfaceC33250Gz8
    public final byte zza() {
        int i = this.f101168b;
        if (i < this.f101169c) {
            this.f101168b = i + 1;
            return this.f101170d.mo34w(i);
        }
        throw new NoSuchElementException();
    }
}
