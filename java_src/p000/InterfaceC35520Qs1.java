package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.FlightSheetContext;
import co.bird.android.model.persistence.FlightSheetDetails;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, m28432d2 = {"LQs1;", "LbI4;", "", "vehicleId", "Lco/bird/android/model/constant/FlightSheetContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/c;", "n0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FlightSheetDetails;", "Y", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qs1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC35520Qs1 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qs1$a */
    /* loaded from: classes2.dex */
    public static final class C6920a {
        /* renamed from: a */
        public static <T> Observable<T> m87854a(InterfaceC35520Qs1 interfaceC35520Qs1, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC35520Qs1, receiver);
        }
    }

    /* renamed from: Y */
    Observable<FlightSheetDetails> mo84721Y(String str, FlightSheetContext flightSheetContext);

    /* renamed from: n0 */
    AbstractC23461c mo84720n0(String str, FlightSheetContext flightSheetContext);
}
