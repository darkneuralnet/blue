package p000;

import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"LSl3;", "Lrx4;", "Lel3;", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorFilter;", "D7", "()Lio/reactivex/Observable;", "filterSelects", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "p8", "optionUpdates", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "X1", "logicOperatorClicks", "V1", "logicOperatorSelected", "", "K2", "applyClicks", "x9", "resetClicks", "f2", "closeClicks", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC35927Sl3 extends InterfaceC48362rx4<InterfaceC40533el3> {
    /* renamed from: D7 */
    Observable<OperatorFilter> mo29988D7();

    /* renamed from: K2 */
    Observable<Unit> mo29987K2();

    /* renamed from: V1 */
    Observable<FilterLogicToggleOption> mo29985V1();

    /* renamed from: X1 */
    Observable<FilterLogicToggleOption> mo29984X1();

    /* renamed from: f2 */
    Observable<Unit> mo29982f2();

    /* renamed from: p8 */
    Observable<Pair<OperatorOptionFilter, OperatorFilterOption>> mo29981p8();

    /* renamed from: x9 */
    Observable<Unit> mo29979x9();
}
