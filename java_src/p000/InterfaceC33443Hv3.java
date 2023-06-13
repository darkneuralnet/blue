package p000;

import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fH&J\u0012\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H&¨\u0006\u0018"}, m28432d2 = {"LHv3;", "LS74;", "LH31;", "LaM5;", "", "LH6;", "adapterSections", "", "b", "Lio/reactivex/Observable;", "", "H", "Lco/bird/android/model/wire/WireBird;", "Q0", "Lco/bird/android/model/constant/BirdAction;", "U0", "bird", "Hj", "", "visible", "Ob", "", "count", "td", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC33443Hv3 extends S74, H31, InterfaceC37910aM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hv3$a */
    /* loaded from: classes3.dex */
    public static final class C3275a {
        public static /* synthetic */ void showActionSheet$default(InterfaceC33443Hv3 interfaceC33443Hv3, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showActionSheet");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC33443Hv3.mo101477Ob(z);
        }
    }

    /* renamed from: H */
    Observable<String> mo101479H();

    /* renamed from: Hj */
    void mo101478Hj(WireBird wireBird);

    /* renamed from: Ob */
    void mo101477Ob(boolean z);

    /* renamed from: Q0 */
    Observable<WireBird> mo101476Q0();

    /* renamed from: U0 */
    Observable<BirdAction> mo101475U0();

    /* renamed from: b */
    void mo101474b(List<C3023H6> list);

    /* renamed from: td */
    void mo101473td(int i);
}
