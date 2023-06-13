package p000;

import co.bird.android.model.constant.BountyFlightSheetSectionType;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionPhotos;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionVehicleList;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetVehicle;
import io.reactivex.AbstractC23442F;
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
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, m28432d2 = {"LH00;", "", "Lco/bird/android/model/persistence/BountyFlightSheetDetails;", "bountyFlightSheetDetails", "Lio/reactivex/F;", "", "LH6;", "b", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetConverter.kt\nco/bird/android/flightsheet/BountyFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,2:71\n1549#2:73\n1620#2,3:74\n1549#2:77\n1620#2,3:78\n1622#2:81\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetConverter.kt\nco/bird/android/flightsheet/BountyFlightSheetConverter\n*L\n22#1:70\n22#1:71,2\n38#1:73\n38#1:74,3\n54#1:77\n54#1:78,3\n22#1:81\n*E\n"})
/* renamed from: H00 */
/* loaded from: classes3.dex */
public final class H00 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: H00$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2998a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BountyFlightSheetSectionType.values().length];
            try {
                iArr[BountyFlightSheetSectionType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BountyFlightSheetSectionType.VEHICLE_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BountyFlightSheetSectionType.PHOTOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: c */
    public static final List m104509c(List adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "$adapterSections");
        return adapterSections;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d5, code lost:
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
        if (r5 == null) goto L46;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC23442F<List<C3023H6>> m104510b(BountyFlightSheetDetails bountyFlightSheetDetails) {
        List mutableListOf;
        final List mutableListOf2;
        int collectionSizeOrDefault;
        List mutableListOf3;
        C3023H6 c3023h6;
        List arrayList;
        List<BountyFlightSheetVehicle> vehicles;
        int collectionSizeOrDefault2;
        C2637G6 c2637g6;
        List arrayList2;
        List<String> photoUrls;
        int collectionSizeOrDefault3;
        String title;
        Intrinsics.checkNotNullParameter(bountyFlightSheetDetails, "bountyFlightSheetDetails");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(bountyFlightSheetDetails, C37548Zj4.item_bounty_flight_sheet_header, false, 4, null));
        mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(new C3023H6(mutableListOf, null, null, 6, null));
        List<BountyFlightSheetSection> sections = bountyFlightSheetDetails.getSections();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (BountyFlightSheetSection bountyFlightSheetSection : sections) {
            int i = C2998a.$EnumSwitchMapping$0[bountyFlightSheetSection.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c3023h6 = new C3023H6(new ArrayList(), null, null, 6, null);
                    } else {
                        BountyFlightSheetSectionPhotos photos = bountyFlightSheetSection.getPhotos();
                        if (photos != null && (title = photos.getTitle()) != null) {
                            c2637g6 = new C2637G6(title, C37548Zj4.item_bounty_flight_sheet_section_photo_header, false, 4, null);
                        } else {
                            c2637g6 = null;
                        }
                        C2637G6 c2637g62 = c2637g6;
                        BountyFlightSheetSectionPhotos photos2 = bountyFlightSheetSection.getPhotos();
                        if (photos2 != null && (photoUrls = photos2.getPhotoUrls()) != null) {
                            List<String> list = photoUrls;
                            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                            for (String str : list) {
                                arrayList4.add(new C2637G6(str, C37548Zj4.item_bounty_flight_sheet_photo, false, 4, null));
                            }
                            arrayList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
                        }
                        arrayList2 = new ArrayList();
                        c3023h6 = new C3023H6(arrayList2, c2637g62, null, 4, null);
                    }
                } else {
                    C2637G6 c2637g63 = new C2637G6(bountyFlightSheetSection.getVehicleList(), C37548Zj4.item_bounty_flight_sheet_section_vehicle_list, false, 4, null);
                    BountyFlightSheetSectionVehicleList vehicleList = bountyFlightSheetSection.getVehicleList();
                    if (vehicleList != null && (vehicles = vehicleList.getVehicles()) != null) {
                        List<BountyFlightSheetVehicle> list2 = vehicles;
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
                        for (BountyFlightSheetVehicle bountyFlightSheetVehicle : list2) {
                            arrayList5.add(new C2637G6(bountyFlightSheetVehicle, C37548Zj4.item_vehicle_involved, false, 4, null));
                        }
                        arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5);
                    }
                    arrayList = new ArrayList();
                    c3023h6 = new C3023H6(arrayList, c2637g63, null, 4, null);
                }
            } else {
                mutableListOf3 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(bountyFlightSheetSection.getText(), C37548Zj4.item_bounty_flight_sheet_section_text, false, 4, null));
                c3023h6 = new C3023H6(mutableListOf3, null, null, 6, null);
            }
            arrayList3.add(c3023h6);
        }
        mutableListOf2.addAll(arrayList3);
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: G00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m104509c;
                m104509c = H00.m104509c(mutableListOf2);
                return m104509c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable { adapterSections }");
        return m33161E;
    }
}
