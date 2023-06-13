package p000;

import java.util.NoSuchElementException;
/* renamed from: Js7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33888Js7 extends AbstractC34590Ms7 {

    /* renamed from: b */
    public int f18394b = 0;

    /* renamed from: c */
    public final int f18395c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC44175kt7 f18396d;

    public C33888Js7(AbstractC44175kt7 abstractC44175kt7) {
        this.f18396d = abstractC44175kt7;
        this.f18395c = abstractC44175kt7.mo28217e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18394b < this.f18395c;
    }

    @Override // p000.InterfaceC35058Os7
    public final byte zza() {
        int i = this.f18394b;
        if (i < this.f18395c) {
            this.f18394b = i + 1;
            return this.f18396d.mo28219b(i);
        }
        throw new NoSuchElementException();
    }
}
