package p000;

import java.util.NoSuchElementException;
/* renamed from: s59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48446s59 extends Q59 {

    /* renamed from: b */
    public int f108245b = 0;

    /* renamed from: c */
    public final int f108246c;

    /* renamed from: d */
    public final /* synthetic */ T69 f108247d;

    public C48446s59(T69 t69) {
        this.f108247d = t69;
        this.f108246c = t69.mo7402c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108245b < this.f108246c;
    }

    @Override // p000.InterfaceC41341g69
    public final byte zza() {
        int i = this.f108245b;
        if (i < this.f108246c) {
            this.f108245b = i + 1;
            return this.f108247d.mo7403b(i);
        }
        throw new NoSuchElementException();
    }
}
