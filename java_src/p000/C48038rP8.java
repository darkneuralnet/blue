package p000;
/* renamed from: rP8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48038rP8<E> extends ZM8<E> {

    /* renamed from: d */
    public final ZP8<E> f107020d;

    public C48038rP8(ZP8<E> zp8, int i) {
        super(zp8.size(), i);
        this.f107020d = zp8;
    }

    @Override // p000.ZM8
    /* renamed from: a */
    public final E mo15988a(int i) {
        return this.f107020d.get(i);
    }
}
