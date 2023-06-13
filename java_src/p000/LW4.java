package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000e"}, m28432d2 = {"LLW4;", "", "LsX4;", "ridePassState", "", "LH6;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/RidePassView;", "ridePass", "b", "c", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV4DetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4DetailsConverter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 RidePassV4DetailsConverter.kt\nco/bird/android/feature/ridepass/v4/details/adapter/RidePassV4DetailsConverter\n*L\n36#1:63\n36#1:64,3\n*E\n"})
/* renamed from: LW4 */
/* loaded from: classes3.dex */
public final class LW4 {
    /* renamed from: a */
    public final List<C3023H6> m96715a(C48698sX4 ridePassState) {
        List<C3023H6> listOfNotNull;
        List<C3023H6> emptyList;
        Intrinsics.checkNotNullParameter(ridePassState, "ridePassState");
        if (ridePassState.m14081d() != null) {
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m96712d(ridePassState), m96714b(ridePassState.m14081d()), m96713c(ridePassState.m14081d())});
            return listOfNotNull;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: b */
    public final C3023H6 m96714b(RidePassView ridePassView) {
        int collectionSizeOrDefault;
        List mutableList;
        List<String> detailBodyList = ridePassView.getDetailBodyList();
        if (detailBodyList != null) {
            List<String> list = detailBodyList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str : list) {
                arrayList.add(new C2637G6(str, C33102Gj4.item_ride_pass_v4_details_benefit, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList != null) {
                return new C3023H6(mutableList, new C2637G6(null, C33102Gj4.item_ride_pass_v4_details_benefits_header, false, 4, null), null, 4, null);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C3023H6 m96713c(RidePassView ridePassView) {
        List mutableListOf;
        String detailFooter = ridePassView.getDetailFooter();
        if (detailFooter == null) {
            return null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(detailFooter, C33102Gj4.item_ride_pass_v4_details_footer, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: d */
    public final C3023H6 m96712d(C48698sX4 c48698sX4) {
        List mutableListOf;
        RidePassView m14081d = c48698sX4.m14081d();
        Intrinsics.checkNotNull(m14081d);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new TU4(m14081d, c48698sX4.m14079f()), C33102Gj4.item_ride_pass_v4_details_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
