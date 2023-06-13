package p000;

import java.util.NoSuchElementException;
/* renamed from: IV7 */
/* loaded from: classes5.dex */
public final class IV7 extends AbstractC43949kW7 {

    /* renamed from: b */
    public int f15828b = 0;

    /* renamed from: c */
    public final int f15829c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC41604gZ7 f15830d;

    public IV7(AbstractC41604gZ7 abstractC41604gZ7) {
        this.f15830d = abstractC41604gZ7;
        this.f15829c = abstractC41604gZ7.mo5074e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15828b < this.f15829c;
    }

    @Override // p000.KW7
    public final byte zza() {
        int i = this.f15828b;
        if (i < this.f15829c) {
            this.f15828b = i + 1;
            return this.f15830d.mo5075b(i);
        }
        throw new NoSuchElementException();
    }
}
