package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairCategory;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&¨\u0006\u0010"}, m28432d2 = {"LE93;", "Lrx4;", "LF93;", "Lio/reactivex/Observable;", "", "d9", "Lco/bird/android/model/RepairCategory;", "f5", "Lco/bird/android/model/NonRepair;", "h2", "Lco/bird/android/model/NonRepairReason;", "s", "Lco/bird/android/buava/Optional;", "d3", "", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E93 */
/* loaded from: classes3.dex */
public interface E93 extends InterfaceC48362rx4<F93> {
    /* renamed from: c */
    Observable<Unit> mo57508c();

    /* renamed from: d3 */
    Observable<Optional<NonRepairReason>> mo57507d3();

    /* renamed from: d9 */
    Observable<String> mo57506d9();

    /* renamed from: f5 */
    Observable<RepairCategory> mo57505f5();

    /* renamed from: h2 */
    Observable<NonRepair> mo57504h2();

    /* renamed from: s */
    Observable<NonRepairReason> mo57503s();
}
