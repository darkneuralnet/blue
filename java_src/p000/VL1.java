package p000;

import co.bird.android.model.persistence.HibernationSessionVehicle;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\tH&J\b\u0010\f\u001a\u00020\u0004H&¨\u0006\r"}, m28432d2 = {"LVL1;", "LbI4;", "", "birdId", "Lio/reactivex/c;", "l1", "", "birdIds", "s0", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "N", "f", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VL1 */
/* loaded from: classes2.dex */
public interface VL1 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VL1$a */
    /* loaded from: classes2.dex */
    public static final class C8604a {
        /* renamed from: a */
        public static <T> Observable<T> m79951a(VL1 vl1, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(vl1, receiver);
        }
    }

    /* renamed from: N */
    Observable<List<HibernationSessionVehicle>> mo73285N();

    /* renamed from: f */
    AbstractC23461c mo73283f();

    /* renamed from: l1 */
    AbstractC23461c mo73282l1(String str);

    /* renamed from: s0 */
    AbstractC23461c mo73281s0(List<String> list);
}
