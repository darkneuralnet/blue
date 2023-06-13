package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.FleetStatusSummary;
import co.bird.android.model.persistence.common.ConstantsKt;
import co.bird.android.model.wire.WireFleetList;
import co.bird.android.model.wire.WireFleetListSection;
import co.bird.android.model.wire.WireFleetListVehicle;
import co.bird.android.model.wire.WireFleetStatus;
import co.bird.android.model.wire.WireFleetStatusSummary;
import co.bird.api.request.BirdsByRatingBody;
import co.bird.api.response.FleetStatusListResponse;
import co.bird.api.response.FleetStatusPredictionResponse;
import co.bird.api.response.FleetStatusResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.joda.time.DateTime;
import p000.InterfaceC40591er1;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J,\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, m28432d2 = {"Lnr1;", "Ler1;", "Lio/reactivex/c;", "i1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/FleetStatusSummary;", "N0", "", "fleetId", "A1", "D1", "", "includePredictions", "Lco/bird/android/model/persistence/FleetStatus;", "k", "list", AbstractC26684u0.f100690q, "birdIds", "z", "Lco/bird/android/model/persistence/FleetListVehicle;", "c", "Lco/bird/android/model/persistence/FleetList;", "J", "Lco/bird/android/model/persistence/FleetListSection;", "q0", "section", "H", "clear", "Ltq1;", C17296a.f69688o, "Ltq1;", "fleetStatusClient", "Lwq1;", "b", "Lwq1;", "fleetStatusDao", "Lvr1;", "Lvr1;", "fleetSummaryDao", "Lwo1;", DateTokenConverter.CONVERTER_KEY, "Lwo1;", "fleetListDao", "LXo1;", "e", "LXo1;", "fleetListSectionDao", "Lfp1;", "f", "Lfp1;", "fleetListVehicleDao", "<init>", "(Ltq1;Lwq1;Lvr1;Lwo1;LXo1;Lfp1;)V", "co.bird.android.repository.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45928nr1 implements InterfaceC40591er1 {

    /* renamed from: a */
    public final InterfaceC49475tq1 f100904a;

    /* renamed from: b */
    public final AbstractC51253wq1 f100905b;

    /* renamed from: c */
    public final AbstractC50670vr1 f100906c;

    /* renamed from: d */
    public final AbstractC51233wo1 f100907d;

    /* renamed from: e */
    public final AbstractC37122Xo1 f100908e;

    /* renamed from: f */
    public final AbstractC41164fp1 f100909f;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetList;", "wireFleetList", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1360#2:161\n1446#2,5:162\n1549#2:167\n1620#2,3:168\n1549#2:171\n1620#2,3:172\n1549#2:175\n1620#2,3:176\n1360#2:179\n1446#2,2:180\n1549#2:182\n1620#2,3:183\n1448#2,3:186\n37#3,2:189\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetList$1\n*L\n89#1:161\n89#1:162,5\n90#1:167\n90#1:168,3\n91#1:171\n91#1:172,3\n92#1:175\n92#1:176,3\n93#1:179\n93#1:180,2\n94#1:182\n94#1:183,3\n93#1:186,3\n103#1:189,2\n*E\n"})
    /* renamed from: nr1$a */
    /* loaded from: classes4.dex */
    public static final class C26724a extends Lambda implements Function1<WireFleetList, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f100911h;

        /* renamed from: i */
        public final /* synthetic */ String f100912i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26724a(String str, String str2) {
            super(1);
            this.f100911h = str;
            this.f100912i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireFleetList wireFleetList) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List listOf;
            int collectionSizeOrDefault4;
            Intrinsics.checkNotNullParameter(wireFleetList, "wireFleetList");
            ArrayList<WireFleetListVehicle> arrayList = new ArrayList();
            for (WireFleetListSection wireFleetListSection : wireFleetList.getSections()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, wireFleetListSection.getVehicles());
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireFleetListVehicle wireFleetListVehicle : arrayList) {
                arrayList2.add(wireFleetListVehicle.getVehicleId());
            }
            List<WireFleetListSection> sections = wireFleetList.getSections();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (WireFleetListSection wireFleetListSection2 : sections) {
                arrayList3.add(wireFleetListSection2.getTitle());
            }
            List<WireFleetListSection> sections2 = wireFleetList.getSections();
            String str = this.f100912i;
            String str2 = this.f100911h;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections2, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
            for (WireFleetListSection wireFleetListSection3 : sections2) {
                arrayList4.add(C50068uq1.m9685b(wireFleetListSection3, str, str2));
            }
            String str3 = this.f100911h;
            String str4 = this.f100912i;
            ArrayList arrayList5 = new ArrayList();
            for (WireFleetListSection wireFleetListSection4 : wireFleetList.getSections()) {
                List<WireFleetListVehicle> vehicles = wireFleetListSection4.getVehicles();
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
                ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault4);
                for (WireFleetListVehicle wireFleetListVehicle2 : vehicles) {
                    arrayList6.add(C50068uq1.m9684c(wireFleetListVehicle2, str3, str4, wireFleetListSection4.getTitle()));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList5, arrayList6);
            }
            AbstractC41164fp1 abstractC41164fp1 = C45928nr1.this.f100909f;
            FleetListVehicle[] fleetListVehicleArr = (FleetListVehicle[]) arrayList5.toArray(new FleetListVehicle[0]);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{C45928nr1.this.f100907d.mo4649c(C50068uq1.m9686a(wireFleetList, this.f100911h, this.f100912i)), C45928nr1.this.f100909f.mo37457c(this.f100911h, this.f100912i, arrayList2, arrayList3), abstractC41164fp1.mo37458b((FleetListVehicle[]) Arrays.copyOf(fleetListVehicleArr, fleetListVehicleArr.length)), C45928nr1.this.f100908e.mo74220d(this.f100912i, this.f100911h, arrayList3), C45928nr1.this.f100908e.mo74221c(arrayList4)});
            return AbstractC23461c.m33037r(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/FleetStatusResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/FleetStatusResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nr1$b */
    /* loaded from: classes4.dex */
    public static final class C26725b extends Lambda implements Function1<FleetStatusResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f100914h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26725b(String str) {
            super(1);
            this.f100914h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(FleetStatusResponse fleetStatusResponse) {
            List listOf;
            Intrinsics.checkNotNullParameter(fleetStatusResponse, "<name for destructuring parameter 0>");
            WireFleetStatus component1 = fleetStatusResponse.component1();
            AbstractC51253wq1 abstractC51253wq1 = C45928nr1.this.f100905b;
            FleetStatus[] fleetStatusArr = {C50068uq1.m9683d(component1, this.f100914h)};
            AbstractC51253wq1 abstractC51253wq12 = C45928nr1.this.f100905b;
            String str = this.f100914h;
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{abstractC51253wq1.mo4580d(fleetStatusArr), abstractC51253wq12.mo4579e(str, now)});
            return AbstractC23461c.m33037r(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/FleetStatusPredictionResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/FleetStatusPredictionResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusPredictionsById$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1549#2:161\n1620#2,3:162\n37#3,2:165\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusPredictionsById$1\n*L\n63#1:161\n63#1:162,3\n63#1:165,2\n*E\n"})
    /* renamed from: nr1$c */
    /* loaded from: classes4.dex */
    public static final class C26726c extends Lambda implements Function1<FleetStatusPredictionResponse, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f100916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26726c(String str) {
            super(1);
            this.f100916h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(FleetStatusPredictionResponse fleetStatusPredictionResponse) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(fleetStatusPredictionResponse, "<name for destructuring parameter 0>");
            List<WireFleetStatus> component1 = fleetStatusPredictionResponse.component1();
            AbstractC51253wq1 abstractC51253wq1 = C45928nr1.this.f100905b;
            List<WireFleetStatus> list = component1;
            String str = this.f100916h;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireFleetStatus wireFleetStatus : list) {
                arrayList.add(C50068uq1.m9683d(wireFleetStatus, str));
            }
            FleetStatus[] fleetStatusArr = (FleetStatus[]) arrayList.toArray(new FleetStatus[0]);
            return abstractC51253wq1.mo4580d((FleetStatus[]) Arrays.copyOf(fleetStatusArr, fleetStatusArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/FleetStatusListResponse;", "response", "Lio/reactivex/K;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/FleetStatusListResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusSummaries$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1549#2:161\n1620#2,3:162\n1549#2:165\n1620#2,3:166\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchFleetStatusSummaries$1\n*L\n36#1:161\n36#1:162,3\n37#1:165\n37#1:166,3\n*E\n"})
    /* renamed from: nr1$d */
    /* loaded from: classes4.dex */
    public static final class C26727d extends Lambda implements Function1<FleetStatusListResponse, InterfaceC23447K<? extends List<? extends String>>> {
        public C26727d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<String>> invoke(FleetStatusListResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(response, "response");
            AbstractC50670vr1 abstractC50670vr1 = C45928nr1.this.f100906c;
            List<WireFleetStatusSummary> fleets = response.getFleets();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(fleets, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireFleetStatusSummary wireFleetStatusSummary : fleets) {
                arrayList.add(C50068uq1.m9682e(wireFleetStatusSummary));
            }
            AbstractC23461c mo6233c = abstractC50670vr1.mo6233c(arrayList);
            List<WireFleetStatusSummary> fleets2 = response.getFleets();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(fleets2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireFleetStatusSummary wireFleetStatusSummary2 : fleets2) {
                arrayList2.add(wireFleetStatusSummary2.getFleetId());
            }
            return mo6233c.m33042m(AbstractC23442F.m33158H(arrayList2));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nr1$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C26728e extends FunctionReferenceImpl implements Function1<List<? extends String>, AbstractC23461c> {
        public C26728e(Object obj) {
            super(1, obj, AbstractC50670vr1.class, "trimFleetStatusSummaries", "trimFleetStatusSummaries(Ljava/util/List;)Lio/reactivex/Completable;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23461c invoke(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((AbstractC50670vr1) this.receiver).mo6232d(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetList;", "wireFleetList", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFleetList;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchVehiclesForRating$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,160:1\n1360#2:161\n1446#2,2:162\n1549#2:164\n1620#2,3:165\n1448#2,3:168\n37#3,2:171\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$fetchVehiclesForRating$1\n*L\n114#1:161\n114#1:162,2\n124#1:164\n124#1:165,3\n114#1:168,3\n126#1:171,2\n*E\n"})
    /* renamed from: nr1$f */
    /* loaded from: classes4.dex */
    public static final class C26729f extends Lambda implements Function1<WireFleetList, InterfaceC23496h> {
        public C26729f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireFleetList wireFleetList) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(wireFleetList, "wireFleetList");
            ArrayList arrayList = new ArrayList();
            for (WireFleetListSection wireFleetListSection : wireFleetList.getSections()) {
                List<WireFleetListVehicle> vehicles = wireFleetListSection.getVehicles();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (WireFleetListVehicle wireFleetListVehicle : vehicles) {
                    arrayList2.add(C50068uq1.m9684c(wireFleetListVehicle, "", "", wireFleetListSection.getTitle()));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
            }
            AbstractC41164fp1 abstractC41164fp1 = C45928nr1.this.f100909f;
            FleetListVehicle[] fleetListVehicleArr = (FleetListVehicle[]) arrayList.toArray(new FleetListVehicle[0]);
            return abstractC41164fp1.mo37458b((FleetListVehicle[]) Arrays.copyOf(fleetListVehicleArr, fleetListVehicleArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetStatus;", "status", "predictions", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nr1$g */
    /* loaded from: classes4.dex */
    public static final class C26730g extends Lambda implements Function2<List<? extends FleetStatus>, List<? extends FleetStatus>, List<? extends FleetStatus>> {

        /* renamed from: g */
        public static final C26730g f100919g = new C26730g();

        public C26730g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<FleetStatus> invoke(List<FleetStatus> status, List<FleetStatus> predictions) {
            List<FleetStatus> plus;
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(predictions, "predictions");
            plus = CollectionsKt___CollectionsKt.plus((Collection) status, (Iterable) predictions);
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/FleetStatus;", "statuses", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$streamFleetStatusById$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n1549#2:161\n1620#2,3:162\n*S KotlinDebug\n*F\n+ 1 FleetStatusRepositoryImpl.kt\nco/bird/android/repository/fleetstatus/FleetStatusRepositoryImpl$streamFleetStatusById$2\n*L\n78#1:161\n78#1:162,3\n*E\n"})
    /* renamed from: nr1$h */
    /* loaded from: classes4.dex */
    public static final class C26731h extends Lambda implements Function1<List<? extends FleetStatus>, List<? extends FleetStatus>> {

        /* renamed from: g */
        public static final C26731h f100920g = new C26731h();

        public C26731h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<FleetStatus> invoke(List<FleetStatus> statuses) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(statuses, "statuses");
            List<FleetStatus> list = statuses;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FleetStatus fleetStatus : list) {
                if (Intrinsics.areEqual(fleetStatus.getPredictionId(), ConstantsKt.NONE)) {
                    fleetStatus = fleetStatus.copy((r22 & 1) != 0 ? fleetStatus.f66676id : 0L, (r22 & 2) != 0 ? fleetStatus.fleetId : null, (r22 & 4) != 0 ? fleetStatus.title : null, (r22 & 8) != 0 ? fleetStatus.predictionId : null, (r22 & 16) != 0 ? fleetStatus.label : null, (r22 & 32) != 0 ? fleetStatus.showBackButton : false, (r22 & 64) != 0 ? fleetStatus.backButtonLabel : null, (r22 & 128) != 0 ? fleetStatus.content : null, (r22 & 256) != 0 ? fleetStatus.createdAt : null);
                }
                arrayList.add(fleetStatus);
            }
            return arrayList;
        }
    }

    public C45928nr1(InterfaceC49475tq1 fleetStatusClient, AbstractC51253wq1 fleetStatusDao, AbstractC50670vr1 fleetSummaryDao, AbstractC51233wo1 fleetListDao, AbstractC37122Xo1 fleetListSectionDao, AbstractC41164fp1 fleetListVehicleDao) {
        Intrinsics.checkNotNullParameter(fleetStatusClient, "fleetStatusClient");
        Intrinsics.checkNotNullParameter(fleetStatusDao, "fleetStatusDao");
        Intrinsics.checkNotNullParameter(fleetSummaryDao, "fleetSummaryDao");
        Intrinsics.checkNotNullParameter(fleetListDao, "fleetListDao");
        Intrinsics.checkNotNullParameter(fleetListSectionDao, "fleetListSectionDao");
        Intrinsics.checkNotNullParameter(fleetListVehicleDao, "fleetListVehicleDao");
        this.f100904a = fleetStatusClient;
        this.f100905b = fleetStatusDao;
        this.f100906c = fleetSummaryDao;
        this.f100907d = fleetListDao;
        this.f100908e = fleetListSectionDao;
        this.f100909f = fleetListVehicleDao;
    }

    /* renamed from: S1 */
    public static final InterfaceC23496h m22313S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final InterfaceC23496h m22312T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final InterfaceC23496h m22311U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final InterfaceC23447K m22310V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final InterfaceC23496h m22309W1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: X1 */
    public static final InterfaceC23496h m22308X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: Y1 */
    public static final List m22307Y1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj, obj2);
    }

    /* renamed from: Z1 */
    public static final List m22306Z1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: A1 */
    public AbstractC23461c mo22327A1(String fleetId) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        AbstractC23442F<FleetStatusResponse> m11696a = this.f100904a.m11696a(fleetId);
        final C26725b c26725b = new C26725b(fleetId);
        AbstractC23461c m33164B = m11696a.m33164B(new InterfaceC23492o() { // from class: gr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m22312T1;
                m22312T1 = C45928nr1.m22312T1(Function1.this, obj);
                return m22312T1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFleetS…))\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: D1 */
    public AbstractC23461c mo22326D1(String fleetId) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        AbstractC23442F<FleetStatusPredictionResponse> m11693d = this.f100904a.m11693d(fleetId);
        final C26726c c26726c = new C26726c(fleetId);
        AbstractC23461c m33164B = m11693d.m33164B(new InterfaceC23492o() { // from class: mr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m22311U1;
                m22311U1 = C45928nr1.m22311U1(Function1.this, obj);
                return m22311U1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFleetS…TypedArray())\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: H */
    public Observable<List<FleetListVehicle>> mo22325H(String fleetId, String list, String section) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(section, "section");
        return this.f100909f.mo37455e(list, fleetId, section);
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: J */
    public Observable<FleetList> mo22324J(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        return m22314R1(this.f100907d.mo4650b(list, fleetId));
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: N0 */
    public Observable<List<FleetStatusSummary>> mo22319N0() {
        return m22314R1(this.f100906c.mo6234b());
    }

    /* renamed from: R1 */
    public <T> Observable<T> m22314R1(Observable<T> observable) {
        return InterfaceC40591er1.C20124a.m42483a(this, observable);
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: c */
    public Observable<List<FleetListVehicle>> mo22305c(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        return m22314R1(this.f100909f.mo37456d(birdIds));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f100905b.mo4583a(), this.f100906c.mo6235a(), this.f100907d.mo4651a(), this.f100908e.mo74223a(), this.f100909f.mo37459a()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(\n      listOf(\n  …Dao.clear()\n      )\n    )");
        return m33037r;
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: i1 */
    public AbstractC23461c mo22304i1() {
        AbstractC23442F<FleetStatusListResponse> m11694c = this.f100904a.m11694c();
        final C26727d c26727d = new C26727d();
        AbstractC23442F<R> m33165A = m11694c.m33165A(new InterfaceC23492o() { // from class: kr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m22310V1;
                m22310V1 = C45928nr1.m22310V1(Function1.this, obj);
                return m22310V1;
            }
        });
        final C26728e c26728e = new C26728e(this.f100906c);
        AbstractC23461c m33164B = m33165A.m33164B(new InterfaceC23492o() { // from class: lr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m22309W1;
                m22309W1 = C45928nr1.m22309W1(Function1.this, obj);
                return m22309W1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFleetS…FleetStatusSummaries)\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: k */
    public Observable<List<FleetStatus>> mo22303k(String fleetId, boolean z) {
        Observable<List<FleetStatus>> mo4582b;
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        if (z) {
            Observable<List<FleetStatus>> mo4582b2 = this.f100905b.mo4582b(fleetId);
            Observable<List<FleetStatus>> mo4581c = this.f100905b.mo4581c(fleetId);
            final C26730g c26730g = C26730g.f100919g;
            mo4582b = Observable.combineLatest(mo4582b2, mo4581c, new InterfaceC23480c() { // from class: hr1
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    List m22307Y1;
                    m22307Y1 = C45928nr1.m22307Y1(Function2.this, obj, obj2);
                    return m22307Y1;
                }
            });
        } else {
            mo4582b = this.f100905b.mo4582b(fleetId);
        }
        final C26731h c26731h = C26731h.f100920g;
        Object map = mo4582b.map(new InterfaceC23492o() { // from class: ir1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m22306Z1;
                m22306Z1 = C45928nr1.m22306Z1(Function1.this, obj);
                return m22306Z1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "if (includePredictions) … status\n        }\n      }");
        return m22314R1(map);
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: q0 */
    public Observable<List<FleetListSection>> mo22302q0(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        return this.f100908e.mo74222b(fleetId, list);
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: u0 */
    public AbstractC23461c mo22301u0(String fleetId, String list) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(list, "list");
        AbstractC23442F<WireFleetList> m11695b = this.f100904a.m11695b(fleetId, list);
        final C26724a c26724a = new C26724a(list, fleetId);
        AbstractC23461c m33164B = m11695b.m33164B(new InterfaceC23492o() { // from class: fr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m22313S1;
                m22313S1 = C45928nr1.m22313S1(Function1.this, obj);
                return m22313S1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFleetL…),\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC40591er1
    /* renamed from: z */
    public AbstractC23461c mo22300z(List<String> birdIds) {
        Intrinsics.checkNotNullParameter(birdIds, "birdIds");
        AbstractC23442F<WireFleetList> m11692e = this.f100904a.m11692e(new BirdsByRatingBody(birdIds));
        final C26729f c26729f = new C26729f();
        AbstractC23461c m33164B = m11692e.m33164B(new InterfaceC23492o() { // from class: jr1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m22308X1;
                m22308X1 = C45928nr1.m22308X1(Function1.this, obj);
                return m22308X1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchVehicl…TypedArray())\n      }\n  }");
        return m33164B;
    }
}
