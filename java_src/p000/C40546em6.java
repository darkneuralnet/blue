package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireDisplayValue;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\f"}, m28432d2 = {"Lem6;", "Lcm6;", "", "Lco/bird/android/model/wire/WireDisplayValue;", "vehicleFaults", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleIssuesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleIssuesConverter.kt\nco/bird/android/feature/healthcheck/adapter/VehicleIssuesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1603#2,9:34\n1855#2:43\n1856#2:45\n1612#2:46\n1#3:44\n*S KotlinDebug\n*F\n+ 1 VehicleIssuesConverter.kt\nco/bird/android/feature/healthcheck/adapter/VehicleIssuesConverterImpl\n*L\n27#1:34,9\n27#1:43\n27#1:45\n27#1:46\n27#1:44\n*E\n"})
/* renamed from: em6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40546em6 implements InterfaceC39343cm6 {
    /* renamed from: c */
    public static final List m42562c(C40546em6 this$0, List vehicleFaults) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vehicleFaults, "$vehicleFaults");
        return this$0.m42561d(vehicleFaults);
    }

    @Override // p000.InterfaceC39343cm6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo42564a(final List<WireDisplayValue> vehicleFaults) {
        Intrinsics.checkNotNullParameter(vehicleFaults, "vehicleFaults");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: dm6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m42562c;
                m42562c = C40546em6.m42562c(C40546em6.this, vehicleFaults);
                return m42562c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      gen…tion(vehicleFaults)\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final List<C3023H6> m42561d(List<WireDisplayValue> list) {
        List mutableList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (WireDisplayValue wireDisplayValue : list) {
            arrayList2.add(new C2637G6(wireDisplayValue, C41107fj4.view_vehicle_issue, false, 4, null));
        }
        if (!arrayList2.isEmpty()) {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            arrayList.add(new C3023H6(mutableList, null, null, 6, null));
        }
        return arrayList;
    }
}
