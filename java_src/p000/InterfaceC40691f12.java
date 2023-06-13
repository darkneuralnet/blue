package p000;

import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b0\u0003H&J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&¨\u0006\u000f"}, m28432d2 = {"Lf12;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "Lg12;", "Lio/reactivex/Observable;", "", "s0", "", "a0", "Lkotlin/Pair;", "j6", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "N2", "", "k6", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40691f12 extends InterfaceC16428a<C41284g12> {
    /* renamed from: N2 */
    Observable<Pair<WireSkuScanItem, WireSkuOrder>> mo42272N2();

    /* renamed from: a0 */
    Observable<Boolean> mo42271a0();

    /* renamed from: j6 */
    Observable<Pair<String, Boolean>> mo42270j6();

    /* renamed from: k6 */
    Observable<Unit> mo42269k6();

    /* renamed from: s0 */
    Observable<String> mo42268s0();
}
