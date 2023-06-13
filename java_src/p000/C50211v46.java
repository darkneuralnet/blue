package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.android.model.wire.WireHydratedStation;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lv46;", "Lt46;", "Lco/bird/android/model/BirdSummaryBody;", "summary", "", "Lco/bird/android/model/wire/WireHydratedRoute;", "timeline", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimelineConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimelineConverter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n1549#2:65\n1620#2,2:66\n1549#2:68\n1620#2,3:69\n1622#2:72\n37#3,2:73\n*S KotlinDebug\n*F\n+ 1 TimelineConverter.kt\nco/bird/android/feature/commandcenter/timeline/adapters/TimelineConverterImpl\n*L\n53#1:65\n53#1:66,2\n56#1:68\n56#1:69,3\n53#1:72\n28#1:73,2\n*E\n"})
/* renamed from: v46  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50211v46 implements InterfaceC49026t46 {

    /* renamed from: a */
    public final Context f113504a;

    public C50211v46(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f113504a = context;
    }

    /* renamed from: c */
    public static final List m9212c(C50211v46 this$0, BirdSummaryBody summary, List timeline) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(summary, "$summary");
        Intrinsics.checkNotNullParameter(timeline, "$timeline");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(this$0.m9211d(summary));
        spreadBuilder.addSpread(this$0.m9210e(timeline).toArray(new C3023H6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOf;
    }

    @Override // p000.InterfaceC49026t46
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo9214a(final BirdSummaryBody summary, final List<WireHydratedRoute> timeline) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: u46
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m9212c;
                m9212c = C50211v46.m9212c(C50211v46.this, summary, timeline);
                return m9212c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m9211d(BirdSummaryBody birdSummaryBody) {
        int i;
        int i2;
        List mutableListOf;
        String serviceStatus = birdSummaryBody.getServiceStatus();
        String code = birdSummaryBody.getBirdSummary().getCode();
        BirdModel model = birdSummaryBody.getBirdSummary().getModel();
        Integer batteryLevel = birdSummaryBody.getBirdSummary().getBatteryLevel();
        if (batteryLevel != null) {
            i = batteryLevel.intValue();
        } else {
            i = 0;
        }
        Context context = this.f113504a;
        int i3 = C45871nl4.bird_status_brain_battery_format_with_tracked_at;
        Object[] objArr = new Object[2];
        Integer batteryLevel2 = birdSummaryBody.getBirdSummary().getBatteryLevel();
        if (batteryLevel2 != null) {
            i2 = batteryLevel2.intValue();
        } else {
            i2 = 0;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = C46880pT0.getElapsedTime$default(birdSummaryBody.getBirdSummary().getBatteryLastTrackedAtTime(), this.f113504a, false, 2, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C50043un6(serviceStatus, null, null, null, null, null, null, null, null, null, model, code, i, context.getString(i3, objArr), null, null, null, null, this.f113504a.getString(C45871nl4.routing_on_rails_summary_condition_format, birdSummaryBody.getBirdSummary().getCondition()), null, this.f113504a.getString(C45871nl4.routing_on_rails_summary_brain_state_format, birdSummaryBody.getBirdSummary().getBrainState()), birdSummaryBody.getBirdSummary().getBrainStateColor(), null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, -3423234, 127, null), C36369Ui4.item_timeline_vehicle_summary, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final List<C3023H6> m9210e(List<WireHydratedRoute> list) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List mutableList;
        List<WireHydratedRoute> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireHydratedRoute wireHydratedRoute : list2) {
            C2637G6 c2637g6 = new C2637G6(wireHydratedRoute, C36369Ui4.item_timeline_route, false, 4, null);
            List<WireHydratedStation> stations = wireHydratedRoute.getStations();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(stations, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireHydratedStation wireHydratedStation : stations) {
                arrayList2.add(new C2637G6(wireHydratedStation, C36369Ui4.item_timeline_station, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            arrayList.add(new C3023H6(mutableList, c2637g6, null, 4, null));
        }
        return arrayList;
    }
}
