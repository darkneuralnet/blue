package p000;

import co.bird.android.model.Issue;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u001c\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n0\tH&¨\u0006\u0018"}, m28432d2 = {"LkF6;", "LS74;", "LaM5;", "LH31;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "K0", "I", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "fi", "", "o5", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kF6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC43795kF6 extends S74, InterfaceC37910aM5, H31 {
    /* renamed from: I */
    Observable<Unit> mo27624I();

    /* renamed from: K0 */
    Observable<Pair<Issue, Boolean>> mo27623K0();

    /* renamed from: b */
    void mo27622b(List<C3023H6> list);

    /* renamed from: fi */
    Observable<Unit> mo27621fi(WireBird wireBird, WorkOrder workOrder, ServiceCenterRoute serviceCenterRoute);

    /* renamed from: o5 */
    Observable<Pair<Issue, String>> mo27620o5();
}
