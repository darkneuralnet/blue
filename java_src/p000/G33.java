package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.FavoriteNestButton;
import co.bird.android.model.FlagNestButton;
import co.bird.android.model.RefreshNestButton;
import co.bird.android.model.RemoveNestFavoriteButton;
import co.bird.android.model.UnflagNestButton;
import co.bird.android.model.constant.FlightSheetDetailFormat;
import co.bird.android.model.constant.NestButton;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.FormattedFlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestBirdle;
import co.bird.android.model.persistence.nestedstructures.NestBirdleIcon;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestCapacity;
import co.bird.android.model.persistence.nestedstructures.NestCapacityRecommendation;
import co.bird.android.model.persistence.nestedstructures.NestDetails;
import co.bird.android.model.persistence.nestedstructures.NestFlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicle;
import co.bird.android.model.persistence.nestedstructures.NestVehicleDetails;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%¨\u0006)"}, m28432d2 = {"LG33;", "", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/NestSummary;", "nestSummary", "i", "Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", "nestBirdle", "c", "Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "nestStatus", "h", "Lco/bird/android/model/persistence/nestedstructures/NestImages;", "nestImages", "g", "Lco/bird/android/model/persistence/nestedstructures/NestCapacity;", "nestCapacity", "e", "Lco/bird/android/model/persistence/nestedstructures/NestDetails;", "nestDetails", "f", "", "nestId", "Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;", "nestVehicles", "j", "Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "nestButtons", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;", "nestAllowedVehicleDetails", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetConverter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1045#2:221\n1603#2,9:222\n1855#2:231\n1856#2:233\n1612#2:234\n1360#2:235\n1446#2,2:236\n1549#2:238\n1620#2,3:239\n1448#2,3:242\n1559#2:245\n1590#2,4:246\n1549#2:251\n1620#2,3:252\n1549#2:255\n1620#2,3:256\n1549#2:259\n1620#2,3:260\n1603#2,9:263\n1855#2:272\n1856#2:274\n1612#2:275\n1549#2:277\n1620#2,3:278\n1#3:232\n1#3:250\n1#3:273\n1#3:276\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetConverter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetConverter\n*L\n48#1:221\n49#1:222,9\n49#1:231\n49#1:233\n49#1:234\n75#1:235\n75#1:236,2\n76#1:238\n76#1:239,3\n75#1:242,3\n78#1:245\n78#1:246,4\n109#1:251\n109#1:252,3\n127#1:255\n127#1:256,3\n141#1:259\n141#1:260,3\n165#1:263,9\n165#1:272\n165#1:274\n165#1:275\n203#1:277\n203#1:278,3\n49#1:232\n165#1:273\n*E\n"})
/* renamed from: G33 */
/* loaded from: classes3.dex */
public final class G33 {

    /* renamed from: a */
    public final Context f10850a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: G33$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2622a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FlightSheetDetailFormat.values().length];
            try {
                iArr[FlightSheetDetailFormat.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NestButton.values().length];
            try {
                iArr2[NestButton.FLAG_NEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[NestButton.REMOVE_NEST_FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NestButton.FAVORITE_NEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NestButton.REMOVE_NEST_FAVORITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 NestFlightSheetConverter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetConverter\n*L\n1#1,328:1\n48#2:329\n*E\n"})
    /* renamed from: G33$b */
    /* loaded from: classes3.dex */
    public static final class C2623b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((NestFlightSheetSection) t).getIdx()), Integer.valueOf(((NestFlightSheetSection) t2).getIdx()));
            return compareValues;
        }
    }

    public G33(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10850a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m105884a(NestFlightSheetDetails nestFlightSheetDetails) {
        List listOfNotNull;
        List<NestFlightSheetSection> sortedWith;
        C3023H6 c3023h6;
        Intrinsics.checkNotNullParameter(nestFlightSheetDetails, "nestFlightSheetDetails");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new NestFlightSheetSection[]{nestFlightSheetDetails.getNestSummary(), nestFlightSheetDetails.getNestBirdle(), nestFlightSheetDetails.getNestStatus(), nestFlightSheetDetails.getNestImages(), nestFlightSheetDetails.getNestCapacity(), nestFlightSheetDetails.getNestDetails(), nestFlightSheetDetails.getVehicleDetails(), nestFlightSheetDetails.getNestButtons(), nestFlightSheetDetails.getNestAllowedVehicles()});
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(listOfNotNull, new C2623b());
        ArrayList arrayList = new ArrayList();
        for (NestFlightSheetSection nestFlightSheetSection : sortedWith) {
            if (nestFlightSheetSection instanceof NestSummary) {
                c3023h6 = m105876i((NestSummary) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestBirdle) {
                c3023h6 = m105882c((NestBirdle) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestStatus) {
                c3023h6 = m105877h((NestStatus) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestImages) {
                c3023h6 = m105878g((NestImages) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestCapacity) {
                c3023h6 = m105880e((NestCapacity) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestDetails) {
                c3023h6 = m105879f((NestDetails) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestVehicleDetails) {
                c3023h6 = m105875j(nestFlightSheetDetails.getNestId(), (NestVehicleDetails) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestButtons) {
                c3023h6 = m105881d(nestFlightSheetDetails.getNestId(), (NestButtons) nestFlightSheetSection);
            } else if (nestFlightSheetSection instanceof NestAllowedVehicleDetails) {
                c3023h6 = m105883b((NestAllowedVehicleDetails) nestFlightSheetSection);
            } else {
                c3023h6 = null;
            }
            if (c3023h6 != null) {
                arrayList.add(c3023h6);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C3023H6 m105883b(NestAllowedVehicleDetails nestAllowedVehicleDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        List<NestVehicle> vehicles = nestAllowedVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (NestVehicle nestVehicle : vehicles) {
            arrayList.add(new C2637G6(nestVehicle, C48223rj4.item_nest_flight_sheet_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(nestAllowedVehicleDetails, C48223rj4.item_nest_flight_sheet_allowed_vehicles, false, 4, null), null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m105882c(NestBirdle nestBirdle) {
        int i;
        int collectionSizeOrDefault;
        List mutableList;
        IntRange until;
        int collectionSizeOrDefault2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = nestBirdle.getIcons().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            NestBirdleIcon nestBirdleIcon = (NestBirdleIcon) it.next();
            until = RangesKt___RangesKt.until(0, nestBirdleIcon.getCount());
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator<Integer> it2 = until.iterator();
            while (it2.hasNext()) {
                ((IntIterator) it2).nextInt();
                arrayList2.add(nestBirdleIcon.getIcon());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(new C2637G6(TuplesKt.m28425to(Integer.valueOf(i), (NestIcon) obj), C48223rj4.item_nest_flight_sheet_birdle_icon, false, 4, null));
            i = i2;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x000f A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m105881d(String str, NestButtons nestButtons) {
        List mutableList;
        Object flagNestButton;
        C2637G6 c2637g6;
        ArrayList arrayList = new ArrayList();
        for (NestButton nestButton : nestButtons.getButtons()) {
            int i = C2622a.$EnumSwitchMapping$1[nestButton.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            c2637g6 = null;
                            if (c2637g6 == null) {
                                arrayList.add(c2637g6);
                            }
                        } else {
                            String string = this.f10850a.getString(C45871nl4.unfavorite);
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.unfavorite)");
                            flagNestButton = new RemoveNestFavoriteButton(string, NA0.m94301c(this.f10850a, C32364Df4.birdRed), NA0.m94299e(this.f10850a, C48193rg4.ic_filled_heart), str);
                        }
                    } else {
                        String string2 = this.f10850a.getString(C45871nl4.favorite);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.string.favorite)");
                        flagNestButton = new FavoriteNestButton(string2, NA0.m94301c(this.f10850a, C32364Df4.primaryText), NA0.m94299e(this.f10850a, C48193rg4.ic_heart), str, nestButtons.getAvailableFavoritePartners());
                    }
                } else {
                    String string3 = this.f10850a.getString(C45871nl4.unflag_nest_label_uppercase);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…lag_nest_label_uppercase)");
                    flagNestButton = new UnflagNestButton(string3, NA0.m94301c(this.f10850a, C32364Df4.birdRed), NA0.m94299e(this.f10850a, C48193rg4.ic_issue_triangle), str);
                }
            } else {
                String string4 = this.f10850a.getString(C45871nl4.flag_nest_label_uppercase);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…lag_nest_label_uppercase)");
                flagNestButton = new FlagNestButton(string4, NA0.m94301c(this.f10850a, C32364Df4.primaryText), NA0.m94299e(this.f10850a, C48193rg4.ic_issue_triangle), str);
            }
            c2637g6 = new C2637G6(flagNestButton, C48223rj4.item_nest_flight_sheet_button, false, 4, null);
            if (c2637g6 == null) {
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m105880e(NestCapacity nestCapacity) {
        int collectionSizeOrDefault;
        List mutableList;
        List<NestCapacityRecommendation> recommendations = nestCapacity.getRecommendations();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(recommendations, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (NestCapacityRecommendation nestCapacityRecommendation : recommendations) {
            arrayList.add(new C2637G6(nestCapacityRecommendation, C48223rj4.item_nest_flight_sheet_capacity_recommendation, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(Integer.valueOf(nestCapacity.getCapacity()), C48223rj4.item_nest_flight_sheet_capacity_header, false, 4, null), null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m105879f(NestDetails nestDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        int i;
        List<FormattedFlightSheetDetail> details = nestDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FormattedFlightSheetDetail formattedFlightSheetDetail : details) {
            if (C2622a.$EnumSwitchMapping$0[formattedFlightSheetDetail.getFormat().ordinal()] == 1) {
                i = C38728bk4.item_formatted_flight_sheet_detail_short;
            } else {
                i = C38728bk4.item_formatted_flight_sheet_detail_long;
            }
            arrayList.add(new C2637G6(formattedFlightSheetDetail, i, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m105878g(NestImages nestImages) {
        if (nestImages.getImageUrls().isEmpty()) {
            return null;
        }
        return new C3023H6(new ArrayList(), new C2637G6(nestImages, C48223rj4.item_nest_flight_sheet_images, false, 4, null), null, 4, null);
    }

    /* renamed from: h */
    public final C3023H6 m105877h(NestStatus nestStatus) {
        return new C3023H6(new ArrayList(), new C2637G6(nestStatus, C48223rj4.item_nest_flight_sheet_status, false, 4, null), null, 4, null);
    }

    /* renamed from: i */
    public final C3023H6 m105876i(NestSummary nestSummary) {
        return new C3023H6(new ArrayList(), new C2637G6(nestSummary, C48223rj4.item_nest_flight_sheet_summary, false, 4, null), null, 4, null);
    }

    /* renamed from: j */
    public final C3023H6 m105875j(String str, NestVehicleDetails nestVehicleDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        List<NestVehicle> vehicles = nestVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (NestVehicle nestVehicle : vehicles) {
            arrayList.add(new C2637G6(nestVehicle, C48223rj4.item_nest_flight_sheet_vehicle, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(new RefreshNestButton(str, nestVehicleDetails.getTitle(), null, 4, null), C48223rj4.item_nest_flight_sheet_vehicle_header, false, 4, null), null, 4, null);
    }
}
