package p000;
/* renamed from: MC1 */
/* loaded from: classes5.dex */
public final class MC1 {

    /* renamed from: MC1$a */
    /* loaded from: classes5.dex */
    public class C5217a implements InterfaceC5218b<T> {

        /* renamed from: a */
        public volatile T f22794a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5218b f22795b;

        public C5217a(InterfaceC5218b interfaceC5218b) {
            this.f22795b = interfaceC5218b;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // p000.MC1.InterfaceC5218b
        public T get() {
            if (this.f22794a == null) {
                synchronized (this) {
                    if (this.f22794a == null) {
                        this.f22794a = C52865zZ3.m1111d(this.f22795b.get());
                    }
                }
            }
            return this.f22794a;
        }
    }

    /* renamed from: MC1$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC5218b<T> {
        T get();
    }

    private MC1() {
    }

    /* renamed from: a */
    public static <T> InterfaceC5218b<T> m95597a(InterfaceC5218b<T> interfaceC5218b) {
        return new C5217a(interfaceC5218b);
    }
}
