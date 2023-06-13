package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.RidePassView;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000eH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0013"}, m28432d2 = {"LGX4;", "LbI4;", "Lio/reactivex/c;", "L0", "", "linkCode", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/RidePassView;", "P0", "y0", "ridePassView", DateTokenConverter.CONVERTER_KEY, "userSubscriptionId", "C0", "Lio/reactivex/Observable;", "", "t1", "O", "O0", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GX4 */
/* loaded from: classes2.dex */
public interface GX4 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GX4$a */
    /* loaded from: classes2.dex */
    public static final class C2884a {
        /* renamed from: a */
        public static <T> Observable<T> m105027a(GX4 gx4, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(gx4, receiver);
        }

        /* renamed from: b */
        public static <T> AbstractC23442F<T> m105026b(GX4 gx4, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64702j(gx4, receiver);
        }
    }

    /* renamed from: C0 */
    AbstractC23461c mo96680C0(String str);

    /* renamed from: L0 */
    AbstractC23461c mo96677L0();

    /* renamed from: O */
    Observable<RidePassView> mo96673O(String str);

    /* renamed from: O0 */
    AbstractC23461c mo96672O0();

    /* renamed from: P0 */
    AbstractC23442F<RidePassView> mo96670P0(String str);

    /* renamed from: d */
    AbstractC23461c mo96667d(RidePassView ridePassView);

    /* renamed from: t1 */
    Observable<List<RidePassView>> mo96666t1();

    /* renamed from: y0 */
    AbstractC23461c mo96665y0(String str);
}
