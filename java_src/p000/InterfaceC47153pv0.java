package p000;

import co.bird.android.model.wire.configs.Config;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, m28432d2 = {"Lpv0;", "Lbr4;", "", "partnerId", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/configs/Config;", "l0", "Lio/reactivex/c;", "E", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pv0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC47153pv0 extends InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pv0$a */
    /* loaded from: classes2.dex */
    public static final class C27417a {
        /* renamed from: a */
        public static InterfaceC23497i m18434a(InterfaceC47153pv0 interfaceC47153pv0) {
            return InterfaceC38798br4.C13315a.m62290e(interfaceC47153pv0);
        }

        /* renamed from: b */
        public static <T> InterfaceC24575v<T, T> m18433b(InterfaceC47153pv0 interfaceC47153pv0) {
            return InterfaceC38798br4.C13315a.m62288g(interfaceC47153pv0);
        }

        /* renamed from: c */
        public static <T> InterfaceC23435C<T, T> m18432c(InterfaceC47153pv0 interfaceC47153pv0) {
            return InterfaceC38798br4.C13315a.m62286i(interfaceC47153pv0);
        }

        /* renamed from: d */
        public static <T> InterfaceC23448L<T, T> m18431d(InterfaceC47153pv0 interfaceC47153pv0) {
            return InterfaceC38798br4.C13315a.m62284k(interfaceC47153pv0);
        }

        /* renamed from: e */
        public static <T> Observable<T> m18430e(InterfaceC47153pv0 interfaceC47153pv0, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62280o(interfaceC47153pv0, receiver);
        }
    }

    /* renamed from: E */
    AbstractC23461c mo2288E();

    /* renamed from: l0 */
    Observable<Config> mo2277l0(String str);
}
