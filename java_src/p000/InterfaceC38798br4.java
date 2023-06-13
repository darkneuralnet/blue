package p000;

import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24574u;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.schedulers.C24542a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Deprecated(message = "Most network streams come on the IO scheduler by default, so you only need observe on main.")
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H\u0016J\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0002H\u0016J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m28432d2 = {"Lbr4;", "", "T", "Lio/reactivex/L;", "s", "Lio/reactivex/v;", "m", "Lio/reactivex/C;", "o", "Lio/reactivex/i;", "c", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: br4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: br4$a */
    /* loaded from: classes3.dex */
    public static final class C13315a {
        /* renamed from: e */
        public static InterfaceC23497i m62290e(InterfaceC38798br4 interfaceC38798br4) {
            return new InterfaceC23497i() { // from class: Yq4
                @Override // io.reactivex.InterfaceC23497i
                /* renamed from: a */
                public final InterfaceC23496h mo33002a(AbstractC23461c abstractC23461c) {
                    InterfaceC23496h m62289f;
                    m62289f = InterfaceC38798br4.C13315a.m62289f(abstractC23461c);
                    return m62289f;
                }
            };
        }

        /* renamed from: f */
        public static InterfaceC23496h m62289f(AbstractC23461c completable) {
            Intrinsics.checkNotNullParameter(completable, "completable");
            return completable.m33063X(C24542a.m31932c()).m33070P(C23454a.m33087a());
        }

        /* renamed from: g */
        public static <T> InterfaceC24575v<T, T> m62288g(InterfaceC38798br4 interfaceC38798br4) {
            return new InterfaceC24575v() { // from class: ar4
                @Override // io.reactivex.InterfaceC24575v
                /* renamed from: b */
                public final InterfaceC24574u mo31864b(AbstractC24507p abstractC24507p) {
                    InterfaceC24574u m62287h;
                    m62287h = InterfaceC38798br4.C13315a.m62287h(abstractC24507p);
                    return m62287h;
                }
            };
        }

        /* renamed from: h */
        public static InterfaceC24574u m62287h(AbstractC24507p observable) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            return observable.m32056T(C24542a.m31932c()).m32066I(C23454a.m33087a());
        }

        /* renamed from: i */
        public static <T> InterfaceC23435C<T, T> m62286i(InterfaceC38798br4 interfaceC38798br4) {
            return new InterfaceC23435C() { // from class: Xq4
                @Override // io.reactivex.InterfaceC23435C
                public final InterfaceC23434B apply(Observable observable) {
                    InterfaceC23434B m62285j;
                    m62285j = InterfaceC38798br4.C13315a.m62285j(observable);
                    return m62285j;
                }
            };
        }

        /* renamed from: j */
        public static InterfaceC23434B m62285j(Observable observable) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            return observable.subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        }

        /* renamed from: k */
        public static <T> InterfaceC23448L<T, T> m62284k(InterfaceC38798br4 interfaceC38798br4) {
            return new InterfaceC23448L() { // from class: Zq4
                @Override // io.reactivex.InterfaceC23448L
                /* renamed from: c */
                public final InterfaceC23447K mo33095c(AbstractC23442F abstractC23442F) {
                    InterfaceC23447K m62283l;
                    m62283l = InterfaceC38798br4.C13315a.m62283l(abstractC23442F);
                    return m62283l;
                }
            };
        }

        /* renamed from: l */
        public static InterfaceC23447K m62283l(AbstractC23442F observable) {
            Intrinsics.checkNotNullParameter(observable, "observable");
            return observable.m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        }

        /* renamed from: m */
        public static AbstractC23461c m62282m(InterfaceC38798br4 interfaceC38798br4, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver.m33038q(interfaceC38798br4.mo212c());
        }

        /* renamed from: n */
        public static <T> AbstractC24507p<T> m62281n(InterfaceC38798br4 interfaceC38798br4, AbstractC24507p<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (AbstractC24507p<T>) receiver.m32041g(interfaceC38798br4.mo209m());
        }

        /* renamed from: o */
        public static <T> Observable<T> m62280o(InterfaceC38798br4 interfaceC38798br4, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (Observable<T>) receiver.compose(interfaceC38798br4.mo208o());
        }

        /* renamed from: p */
        public static <T> AbstractC23442F<T> m62279p(InterfaceC38798br4 interfaceC38798br4, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (AbstractC23442F<T>) receiver.m33128i(interfaceC38798br4.mo207s());
        }
    }

    /* renamed from: c */
    InterfaceC23497i mo212c();

    /* renamed from: m */
    <T> InterfaceC24575v<T, T> mo209m();

    /* renamed from: o */
    <T> InterfaceC23435C<T, T> mo208o();

    /* renamed from: s */
    <T> InterfaceC23448L<T, T> mo207s();
}
