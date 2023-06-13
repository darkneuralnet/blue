package p000;

import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u0002H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H&¨\u0006\u0013"}, m28432d2 = {"LVp3;", "LbI4;", "Lio/reactivex/c;", "g1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "d0", "", "section", "Lco/bird/android/model/persistence/OperatorOrderView;", "p0", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "W", "m0", "", "M", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vp3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC36665Vp3 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vp3$a */
    /* loaded from: classes2.dex */
    public static final class C8799a {
        /* renamed from: a */
        public static <T> Observable<T> m79393a(InterfaceC36665Vp3 interfaceC36665Vp3, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC36665Vp3, receiver);
        }
    }

    /* renamed from: M */
    Observable<Integer> mo72442M();

    /* renamed from: W */
    Observable<OperatorOrderView> mo72437W(String str, OperatorOrderViewType operatorOrderViewType);

    /* renamed from: d0 */
    Observable<List<OperatorOrderViewSection>> mo72436d0();

    /* renamed from: g1 */
    AbstractC23461c mo72435g1();

    /* renamed from: m0 */
    AbstractC23461c mo72434m0();

    /* renamed from: p0 */
    Observable<List<OperatorOrderView>> mo72433p0(String str);
}
