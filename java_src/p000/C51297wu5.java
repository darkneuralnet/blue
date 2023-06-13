package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0014"}, m28432d2 = {"Lwu5;", "LkE;", "Luu5;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "currentStatus", "", "statuses", "", "enableCommandCenter", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceProgressUpdateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressUpdateConverter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n*S KotlinDebug\n*F\n+ 1 ServiceProgressUpdateConverter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressUpdateConverterImpl\n*L\n41#1:52\n41#1:53,3\n*E\n"})
/* renamed from: wu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51297wu5 extends AbstractC25130kE implements InterfaceC50112uu5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51297wu5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: e */
    public static final List m6123e(WireBird bird, C51297wu5 this$0, BirdSummaryBody birdSummary, List list, boolean z, WireServiceCenterStatus wireServiceCenterStatus) {
        int i;
        ArrayList arrayList;
        List listOf;
        int collectionSizeOrDefault;
        ServiceCenterStatus serviceCenterStatus;
        boolean z2;
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        C3023H6 copy$default = C3023H6.copy$default(this$0.m29186c(birdSummary), null, null, new C2637G6(bird, C45268mk4.item_button_secondary, false, 4, null), 3, null);
        copy$default.m104406g(z);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C2637G6 c2637g6 = new C2637G6(Integer.valueOf(i), C45268mk4.view_list_header, false, 4, null);
        List list2 = null;
        if (list != null) {
            List<WireServiceCenterStatus> list3 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireServiceCenterStatus wireServiceCenterStatus2 : list3) {
                if (wireServiceCenterStatus != null) {
                    serviceCenterStatus = wireServiceCenterStatus.getStatus();
                } else {
                    serviceCenterStatus = null;
                }
                if (serviceCenterStatus == wireServiceCenterStatus2.getStatus()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.add(new C2637G6(TuplesKt.m28425to(wireServiceCenterStatus2, Boolean.valueOf(z2)), C34740Nj4.item_service_center_status, false, 4, null));
            }
            list2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        }
        if (list2 == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list2;
        }
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{copy$default, new C3023H6(arrayList, c2637g6, null, 4, null)});
        return listOf;
    }

    @Override // p000.InterfaceC50112uu5
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo6125a(final WireBird bird, final BirdSummaryBody birdSummary, final WireServiceCenterStatus wireServiceCenterStatus, final List<WireServiceCenterStatus> list, final boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: vu5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m6123e;
                m6123e = C51297wu5.m6123e(WireBird.this, this, birdSummary, list, z, wireServiceCenterStatus);
                return m6123e;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      // …Schedulers.computation())");
        return m33142Y;
    }
}
