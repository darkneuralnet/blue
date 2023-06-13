package p000;

import io.reactivex.functions.InterfaceC23492o;
/* renamed from: yA1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52045yA1 {

    /* renamed from: yA1$a */
    /* loaded from: classes5.dex */
    public static class C30438a implements InterfaceC23492o<Object, T> {

        /* renamed from: b */
        public final /* synthetic */ Object f118869b;

        public C30438a(Object obj) {
            this.f118869b = obj;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        @Override // io.reactivex.functions.InterfaceC23492o
        public T apply(Object obj) throws Exception {
            return this.f118869b;
        }
    }

    private C52045yA1() {
    }

    /* renamed from: a */
    public static <T> InterfaceC23492o<Object, T> m4007a(T t) {
        return new C30438a(t);
    }
}
