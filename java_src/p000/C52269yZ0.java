package p000;
/* renamed from: yZ0  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C52269yZ0<T> implements InterfaceC48812sj1<T> {

    /* renamed from: a */
    public Y94<T> f119740a;

    /* renamed from: a */
    public static <T> void m3261a(Y94<T> y94, Y94<T> y942) {
        C51679xZ3.m5005b(y942);
        C52269yZ0 c52269yZ0 = (C52269yZ0) y94;
        if (c52269yZ0.f119740a == null) {
            c52269yZ0.f119740a = y942;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // p000.Y94
    public T get() {
        Y94<T> y94 = this.f119740a;
        if (y94 != null) {
            return y94.get();
        }
        throw new IllegalStateException();
    }
}
