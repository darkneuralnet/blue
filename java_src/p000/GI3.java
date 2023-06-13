package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PartnerUser;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R*\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0002j\u0002`\t\u0012\u0004\u0012\u00020\u00050\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LGI3;", "Lbr4;", "", "partnerId", "Lio/reactivex/F;", "Lco/bird/android/model/MobilePartner;", "u", "LZ84;", "", "Lco/bird/android/model/PartnerId;", "A", "()LZ84;", "partners", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/PartnerUser;", "o1", "primaryPartner", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GI3 */
/* loaded from: classes2.dex */
public interface GI3 extends InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GI3$a */
    /* loaded from: classes2.dex */
    public static final class C2702a {
        /* renamed from: a */
        public static InterfaceC23497i m105522a(GI3 gi3) {
            return InterfaceC38798br4.C13315a.m62290e(gi3);
        }

        /* renamed from: b */
        public static <T> InterfaceC24575v<T, T> m105521b(GI3 gi3) {
            return InterfaceC38798br4.C13315a.m62288g(gi3);
        }

        /* renamed from: c */
        public static <T> InterfaceC23435C<T, T> m105520c(GI3 gi3) {
            return InterfaceC38798br4.C13315a.m62286i(gi3);
        }

        /* renamed from: d */
        public static <T> InterfaceC23448L<T, T> m105519d(GI3 gi3) {
            return InterfaceC38798br4.C13315a.m62284k(gi3);
        }

        /* renamed from: e */
        public static <T> AbstractC23442F<T> m105518e(GI3 gi3, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62279p(gi3, receiver);
        }
    }

    /* renamed from: A */
    Z84<Map<String, MobilePartner>> mo97372A();

    /* renamed from: o1 */
    Z84<Optional<PartnerUser>> mo97364o1();

    /* renamed from: u */
    AbstractC23442F<MobilePartner> mo97362u(String str);
}
