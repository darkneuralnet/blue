package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireRoute;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lqc5;", "Loc5;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "currentRoute", "", "Lco/bird/android/model/wire/WireRoute;", "routeOptions", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoutingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingConverter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,3:46\n*S KotlinDebug\n*F\n+ 1 RoutingConverter.kt\nco/bird/android/feature/commandcenter/routing/adapters/RoutingConverterImpl\n*L\n30#1:45\n30#1:46,3\n*E\n"})
/* renamed from: qc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47561qc5 implements InterfaceC46375oc5 {

    /* renamed from: a */
    public final Context f105511a;

    public C47561qc5(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f105511a = context;
    }

    /* renamed from: c */
    public static final List m17320c(C47561qc5 this$0, Collection routeOptions, ServiceCenterRoute serviceCenterRoute) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(routeOptions, "$routeOptions");
        C2637G6 c2637g6 = new C2637G6(this$0.f105511a.getString(C45871nl4.routing_on_rails_select_a_route), C36369Ui4.item_routing_header, false, 4, null);
        Collection<WireRoute> collection = routeOptions;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireRoute wireRoute : collection) {
            ServiceCenterRoute route = wireRoute.getRoute();
            String str2 = null;
            if (route != null) {
                str = route.name();
            } else {
                str = null;
            }
            if (serviceCenterRoute != null) {
                str2 = serviceCenterRoute.name();
            }
            arrayList.add(new C2637G6(new C43410jc5(wireRoute, Intrinsics.areEqual(str, str2)), C36369Ui4.item_routing_route, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, c2637g6, null, 4, null));
        return listOf;
    }

    @Override // p000.InterfaceC46375oc5
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo17322a(final ServiceCenterRoute serviceCenterRoute, final Collection<WireRoute> routeOptions) {
        Intrinsics.checkNotNullParameter(routeOptions, "routeOptions");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: pc5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m17320c;
                m17320c = C47561qc5.m17320c(C47561qc5.this, routeOptions, serviceCenterRoute);
                return m17320c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
