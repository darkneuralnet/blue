package p000;

import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"Lq50;", "Lo50;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "selectedStatus", "", "statuses", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressUpdateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressUpdateConverter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/adapters/BulkServiceProgressUpdateConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1549#2:32\n1620#2,3:33\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressUpdateConverter.kt\nco/bird/android/feature/servicecenter/status/bulk/update/adapters/BulkServiceProgressUpdateConverterImpl\n*L\n19#1:32\n19#1:33,3\n*E\n"})
/* renamed from: q50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47252q50 implements InterfaceC46066o50 {
    /* renamed from: c */
    public static final List m18225c(List statuses, WireServiceCenterStatus wireServiceCenterStatus) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        ServiceCenterStatus serviceCenterStatus;
        boolean z;
        Intrinsics.checkNotNullParameter(statuses, "$statuses");
        List<WireServiceCenterStatus> list = statuses;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireServiceCenterStatus wireServiceCenterStatus2 : list) {
            ServiceCenterStatus status = wireServiceCenterStatus2.getStatus();
            if (wireServiceCenterStatus != null) {
                serviceCenterStatus = wireServiceCenterStatus.getStatus();
            } else {
                serviceCenterStatus = null;
            }
            if (status == serviceCenterStatus) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C2637G6(TuplesKt.m28425to(wireServiceCenterStatus2, Boolean.valueOf(z)), C34740Nj4.item_service_center_status, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    @Override // p000.InterfaceC46066o50
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo18227a(final WireServiceCenterStatus wireServiceCenterStatus, final List<WireServiceCenterStatus> statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: p50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m18225c;
                m18225c = C47252q50.m18225c(statuses, wireServiceCenterStatus);
                return m18225c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
