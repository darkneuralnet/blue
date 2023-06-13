package p000;

import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC24578y;
import io.reactivex.observers.AbstractC24501e;
/* renamed from: r51  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47846r51 {

    /* renamed from: r51$a */
    /* loaded from: classes6.dex */
    public class C27844a extends AbstractC24501e<T> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC23444H f106442c;

        public C27844a(InterfaceC23444H interfaceC23444H) {
            this.f106442c = interfaceC23444H;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f106442c.mo4876c(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f106442c.onSuccess(t);
        }
    }

    /* renamed from: r51$b */
    /* loaded from: classes6.dex */
    public class C27845b extends AbstractC24501e<T> {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC24578y f106443c;

        public C27845b(InterfaceC24578y interfaceC24578y) {
            this.f106443c = interfaceC24578y;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f106443c.mo11914c(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f106443c.onNext(t);
            this.f106443c.onComplete();
        }
    }

    private C47846r51() {
    }

    /* renamed from: a */
    public static <T> AbstractC24501e<T> m16507a(InterfaceC24578y<T> interfaceC24578y) {
        return new C27845b(interfaceC24578y);
    }

    /* renamed from: b */
    public static <T> AbstractC24501e<T> m16506b(InterfaceC23444H<T> interfaceC23444H) {
        return new C27844a(interfaceC23444H);
    }
}
