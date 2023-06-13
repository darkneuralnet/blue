package p000;

import java.util.NoSuchElementException;
/* renamed from: V38 */
/* loaded from: classes5.dex */
public final class V38 extends M48 {

    /* renamed from: b */
    public int f38504b = 0;

    /* renamed from: c */
    public final int f38505c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC50836w78 f38506d;

    public V38(AbstractC50836w78 abstractC50836w78) {
        this.f38506d = abstractC50836w78;
        this.f38505c = abstractC50836w78.mo7384c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38504b < this.f38505c;
    }

    @Override // p000.InterfaceC47853r58
    public final byte zza() {
        int i = this.f38504b;
        if (i < this.f38505c) {
            this.f38504b = i + 1;
            return this.f38506d.mo7385b(i);
        }
        throw new NoSuchElementException();
    }
}
