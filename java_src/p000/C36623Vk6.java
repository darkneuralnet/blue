package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ActiveWorkOrderButton;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.Detail;
import co.bird.android.model.InspectButton;
import co.bird.android.model.Issue;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.PastWorkOrderButton;
import co.bird.android.model.RepairButton;
import co.bird.android.model.ScrapCompletionButton;
import co.bird.android.model.ScrapInspectionButton;
import co.bird.android.model.UpdateServiceProgressButton;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+Jl\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00132\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002J \u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\tH\u0002J*\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0002J\u001c\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010#H\u0002R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, m28432d2 = {"LVk6;", "LsA;", "LTk6;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/CommandCenterBody;", "commandCenter", "", "Lco/bird/android/model/CommandCenterNotice;", "notices", "Lco/bird/android/model/WorkOrder;", "activeWorkOrder", "closedWorkOrders", "Lco/bird/android/model/VehicleScrapRequest;", "scrapRequests", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "F", "workOrder", "E", "z", "B", "A", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "workOrders", "", "pastWorkOrdersDisplayCount", "y", "", "serviceCenterStatus", "D", "LTq4;", "c", "LTq4;", "reactiveConfig", "<init>", "(LTq4;Landroid/content/Context;)V", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsConverter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1963#2,14:287\n1963#2,14:302\n1549#2:316\n1620#2,3:317\n1054#2:320\n1549#2:321\n1620#2,2:322\n1603#2,9:324\n1855#2:333\n1856#2:335\n1612#2:336\n1622#2:337\n1#3:301\n1#3:334\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsConverter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsConverterImpl\n*L\n141#1:283\n141#1:284,3\n170#1:287,14\n203#1:302,14\n216#1:316\n216#1:317,3\n229#1:320\n231#1:321\n231#1:322,2\n235#1:324,9\n235#1:333\n235#1:335\n235#1:336\n231#1:337\n235#1:334\n*E\n"})
/* renamed from: Vk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36623Vk6 extends AbstractC28226sA implements InterfaceC36155Tk6 {

    /* renamed from: d */
    public static final C8777a f39688d = new C8777a(null);

    /* renamed from: e */
    public static final SimpleDateFormat f39689e = new SimpleDateFormat("MMM. dd, yyyy", Locale.getDefault());

    /* renamed from: c */
    public final C36207Tq4 f39690c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LVk6$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Vk6$a */
    /* loaded from: classes3.dex */
    public static final class C8777a {
        public /* synthetic */ C8777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8777a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Vk6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8778b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceCenterStatus.values().length];
            try {
                iArr[ServiceCenterStatus.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServiceCenterStatus.ENTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServiceCenterStatus.CHECKED_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ServiceCenterStatus.AWAITING_SCRAP_INSPECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ServiceCenterStatus.AWAITING_SCRAP_APPROVAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ServiceCenterStatus.SCRAP_REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ServiceCenterStatus.AWAITING_SCRAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ServiceCenterStatus.AWAITING_SCRAP_SUBMERGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 VehicleDetailsConverter.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsConverterImpl\n*L\n1#1,328:1\n229#2:329\n*E\n"})
    /* renamed from: Vk6$c */
    /* loaded from: classes3.dex */
    public static final class C8779c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((WorkOrder) t2).getCreatedAt(), ((WorkOrder) t).getCreatedAt());
            return compareValues;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36623Vk6(C36207Tq4 reactiveConfig, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39690c = reactiveConfig;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d4  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m79474x(C36623Vk6 this$0, CommandCenterBody commandCenter, WireBird bird, BirdSummaryBody birdSummary, MobilePartner mobilePartner, List notices, List scrapRequests, WorkOrder workOrder, List list) {
        MobilePartner mobilePartner2;
        boolean z;
        C3023H6 c3023h6;
        C3023H6 c3023h62;
        C3023H6 c3023h63;
        C3023H6 c3023h64;
        C3023H6 c3023h65;
        C3023H6 c3023h66;
        List listOfNotNull;
        int i;
        C3023H6 m79481B;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(commandCenter, "$commandCenter");
        Intrinsics.checkNotNullParameter(bird, "$bird");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        Intrinsics.checkNotNullParameter(notices, "$notices");
        Intrinsics.checkNotNullParameter(scrapRequests, "$scrapRequests");
        boolean enableInspection = this$0.f39690c.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableInspection();
        boolean enableWorkOrderHistory = this$0.f39690c.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableWorkOrderHistory();
        boolean enableServiceCenterStatus = this$0.f39690c.m82623f8().getValue().getServiceCenterConfig().getEnableServiceCenterStatus();
        int pastWorkOrdersDisplayCount = this$0.f39690c.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getPastWorkOrdersDisplayCount();
        boolean enablePastRepairs = this$0.f39690c.m82623f8().getValue().getOperatorConfig().getFeatures().getCommandCenter().getEnablePastRepairs();
        boolean enabled = this$0.f39690c.m82623f8().getValue().getServiceCenterConfig().getEntryRouting().getEnabled();
        boolean enabled2 = this$0.f39690c.m82623f8().getValue().getServiceCenterConfig().getScrap().getEnabled();
        boolean enableRepair = this$0.f39690c.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getEnableRepair();
        boolean enabled3 = this$0.f39690c.m82623f8().getValue().getServiceCenterConfig().getRoutingOnRails().getEnabled();
        ServiceCenterStatus status = commandCenter.getStatus();
        if (bird.getLifecycle().getCondition() == Condition.TOTALED) {
            mobilePartner2 = mobilePartner;
            z = true;
        } else {
            mobilePartner2 = mobilePartner;
            z = false;
        }
        C3023H6 m12963l = this$0.m12963l(birdSummary, bird, mobilePartner2);
        C3023H6 m14612u = this$0.m14612u(notices);
        C3023H6 c3023h67 = null;
        if (!z && enableServiceCenterStatus) {
            c3023h6 = this$0.m79479D(bird, birdSummary.getServiceStatus());
        } else {
            c3023h6 = null;
        }
        if (enabled && !enabled3) {
            if (status == null) {
                i = -1;
            } else {
                i = C8778b.$EnumSwitchMapping$0[status.ordinal()];
            }
            switch (i) {
                case -1:
                case 1:
                case 2:
                case 3:
                    break;
                case 0:
                default:
                    if (workOrder == null && enableInspection) {
                        m79481B = this$0.m79477F(bird);
                    } else if (workOrder != null && enableRepair) {
                        m79481B = this$0.m79472z(bird);
                    }
                    c3023h62 = m79481B;
                    break;
                case 4:
                case 5:
                case 6:
                    if (enabled2) {
                        m79481B = this$0.m79481B(bird, scrapRequests);
                        c3023h62 = m79481B;
                        break;
                    }
                    break;
                case 7:
                case 8:
                    if (enabled2) {
                        m79481B = this$0.m79482A(bird, scrapRequests);
                        c3023h62 = m79481B;
                        break;
                    }
                    break;
            }
            if (enabled3 && !enabled && enableInspection && workOrder == null) {
                c3023h63 = this$0.m79477F(bird);
            } else {
                c3023h63 = null;
            }
            if (!enableInspection && workOrder != null) {
                c3023h64 = this$0.m79478E(bird, workOrder);
            } else {
                c3023h64 = null;
            }
            if (z) {
                c3023h65 = AbstractC28226sA.generateCommandSection$default(this$0, bird, false, false, false, 14, null);
            } else {
                c3023h65 = null;
            }
            C3023H6 m14613t = this$0.m14613t(commandCenter);
            C3023H6 m79480C = this$0.m79480C(this$0.m12962m(), commandCenter);
            C3023H6 m14614s = this$0.m14614s(commandCenter);
            if (!enableWorkOrderHistory) {
                c3023h66 = this$0.m79473y(bird, list, pastWorkOrdersDisplayCount);
            } else {
                c3023h66 = null;
            }
            if (enablePastRepairs) {
                c3023h67 = this$0.m14611v(commandCenter);
            }
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m12963l, m14612u, c3023h6, c3023h62, c3023h63, c3023h64, c3023h65, m14613t, m79480C, m14614s, c3023h66, c3023h67});
            return listOfNotNull;
        }
        c3023h62 = null;
        if (enabled3) {
        }
        c3023h63 = null;
        if (!enableInspection) {
        }
        c3023h64 = null;
        if (z) {
        }
        C3023H6 m14613t2 = this$0.m14613t(commandCenter);
        C3023H6 m79480C2 = this$0.m79480C(this$0.m12962m(), commandCenter);
        C3023H6 m14614s2 = this$0.m14614s(commandCenter);
        if (!enableWorkOrderHistory) {
        }
        if (enablePastRepairs) {
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m12963l, m14612u, c3023h6, c3023h62, c3023h63, c3023h64, c3023h65, m14613t2, m79480C2, m14614s2, c3023h66, c3023h67});
        return listOfNotNull;
    }

    /* renamed from: A */
    public final C3023H6 m79482A(WireBird wireBird, List<VehicleScrapRequest> list) {
        Object next;
        List mutableListOf;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                DateTime updatedAt = ((VehicleScrapRequest) next).getUpdatedAt();
                while (true) {
                    Object next2 = it.next();
                    DateTime updatedAt2 = ((VehicleScrapRequest) next2).getUpdatedAt();
                    if (updatedAt.compareTo(updatedAt2) < 0) {
                        next = next2;
                        updatedAt = updatedAt2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                }
            }
        }
        VehicleScrapRequest vehicleScrapRequest = (VehicleScrapRequest) next;
        if (vehicleScrapRequest == null) {
            return null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new ScrapCompletionButton(m12962m().getString(C45871nl4.scrap_complete), wireBird, vehicleScrapRequest), C45268mk4.item_button, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: B */
    public final C3023H6 m79481B(WireBird wireBird, List<VehicleScrapRequest> list) {
        Object next;
        ScrapRequestReviewStatus scrapRequestReviewStatus;
        String str;
        ScrapRequestReviewStatus scrapRequestReviewStatus2;
        C2637G6 c2637g6;
        ScrapRequestReviewStatus scrapRequestReviewStatus3;
        WireBird wireBird2;
        List listOfNotNull;
        List mutableList;
        DateTime reviewedAt;
        Date date;
        Iterator<T> it = list.iterator();
        VehicleScrapRequest vehicleScrapRequest = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                DateTime updatedAt = ((VehicleScrapRequest) next).getUpdatedAt();
                while (true) {
                    Object next2 = it.next();
                    DateTime updatedAt2 = ((VehicleScrapRequest) next2).getUpdatedAt();
                    if (updatedAt.compareTo(updatedAt2) < 0) {
                        next = next2;
                        updatedAt = updatedAt2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                }
            }
        }
        VehicleScrapRequest vehicleScrapRequest2 = (VehicleScrapRequest) next;
        if (vehicleScrapRequest2 != null) {
            scrapRequestReviewStatus = vehicleScrapRequest2.getReviewStatus();
        } else {
            scrapRequestReviewStatus = null;
        }
        if (scrapRequestReviewStatus == ScrapRequestReviewStatus.PENDING) {
            return null;
        }
        if (vehicleScrapRequest2 != null && (reviewedAt = vehicleScrapRequest2.getReviewedAt()) != null && (date = reviewedAt.toDate()) != null) {
            str = f39689e.format(date);
        } else {
            str = null;
        }
        if (vehicleScrapRequest2 != null) {
            scrapRequestReviewStatus2 = vehicleScrapRequest2.getReviewStatus();
        } else {
            scrapRequestReviewStatus2 = null;
        }
        ScrapRequestReviewStatus scrapRequestReviewStatus4 = ScrapRequestReviewStatus.REJECTED;
        if (scrapRequestReviewStatus2 == scrapRequestReviewStatus4) {
            c2637g6 = new C2637G6(new C33157Gp5(vehicleScrapRequest2.getRejectionReason(), vehicleScrapRequest2.getRejectionReasonMessage(), str), C45268mk4.item_scrap_rejection, false, 4, null);
        } else {
            c2637g6 = null;
        }
        String string = m12962m().getString(C45871nl4.command_center_scrap_inspection);
        if (vehicleScrapRequest2 != null) {
            scrapRequestReviewStatus3 = vehicleScrapRequest2.getReviewStatus();
        } else {
            scrapRequestReviewStatus3 = null;
        }
        if (scrapRequestReviewStatus3 == scrapRequestReviewStatus4) {
            wireBird2 = wireBird;
            vehicleScrapRequest = vehicleScrapRequest2;
        } else {
            wireBird2 = wireBird;
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C2637G6[]{c2637g6, new C2637G6(new ScrapInspectionButton(string, wireBird2, vehicleScrapRequest), C45268mk4.item_button, false, 4, null)});
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: C */
    public final C3023H6 m79480C(Context context, CommandCenterBody commandCenterBody) {
        int collectionSizeOrDefault;
        List mutableList;
        String string = context.getString(C45871nl4.command_center_service_center_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ter_service_center_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        List<Detail> serviceCenterDetails = commandCenterBody.getServiceCenterDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(serviceCenterDetails, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Detail detail : serviceCenterDetails) {
            arrayList.add(new C2637G6(detail.copyWithoutNulls(), C52372yj4.item_command_center_details, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }

    /* renamed from: D */
    public final C3023H6 m79479D(WireBird wireBird, String str) {
        String str2;
        List mutableListOf;
        String string = m12962m().getString(C45871nl4.command_center_update_service_progress);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_update_service_progress)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        if (str == null) {
            str2 = m12962m().getString(C45871nl4.service_center_status_select_status);
            Intrinsics.checkNotNullExpressionValue(str2, "context.getString(L.stri…ter_status_select_status)");
        } else {
            str2 = str;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new UpdateServiceProgressButton(str2, wireBird), C36369Ui4.item_button_drop_down_brand_outline, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* renamed from: E */
    public final C3023H6 m79478E(WireBird wireBird, WorkOrder workOrder) {
        int collectionSizeOrDefault;
        List mutableList;
        C2637G6 c2637g6 = new C2637G6(m12962m().getString(C45871nl4.work_order_issues_format, Integer.valueOf(workOrder.getIssues().size())), C52372yj4.item_work_order_header, false, 4, null);
        List<Issue> issues = workOrder.getIssues();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(issues, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : issues) {
            arrayList.add(new C2637G6(issue, C52372yj4.item_work_order_issue_header, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, new C2637G6(new ActiveWorkOrderButton(m12962m().getString(C45871nl4.command_center_work_order_details), wireBird, workOrder), C45268mk4.item_button_secondary, false, 4, null));
    }

    /* renamed from: F */
    public final C3023H6 m79477F(WireBird wireBird) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new InspectButton(m12962m().getString(C45871nl4.work_order_inspect), wireBird, null, 4, null), C45268mk4.item_button, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    @Override // p000.InterfaceC36155Tk6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo79476a(final WireBird bird, final MobilePartner mobilePartner, final BirdSummaryBody birdSummary, final CommandCenterBody commandCenter, final List<CommandCenterNotice> notices, final WorkOrder workOrder, final List<WorkOrder> list, final List<VehicleScrapRequest> scrapRequests) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        Intrinsics.checkNotNullParameter(notices, "notices");
        Intrinsics.checkNotNullParameter(scrapRequests, "scrapRequests");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Uk6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m79474x;
                m79474x = C36623Vk6.m79474x(C36623Vk6.this, commandCenter, bird, birdSummary, mobilePartner, notices, scrapRequests, workOrder, list);
                return m79474x;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: y */
    public final C3023H6 m79473y(WireBird wireBird, List<WorkOrder> list, int i) {
        boolean z;
        List sortedWith;
        List take;
        int collectionSizeOrDefault;
        List mutableList;
        String string;
        List<WorkOrder> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String string2 = m12962m().getString(C45871nl4.command_center_past_work_orders_title);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…r_past_work_orders_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string2, true, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C8779c());
        take = CollectionsKt___CollectionsKt.take(sortedWith, i);
        List<WorkOrder> list3 = take;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WorkOrder workOrder : list3) {
            String string3 = m12962m().getString(C45871nl4.work_order_issues_format, Integer.valueOf(workOrder.getIssues().size()));
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…t, workOrder.issues.size)");
            DateTime updatedAt = workOrder.getUpdatedAt();
            if (updatedAt == null || (string = C46880pT0.getElapsedTime$default(updatedAt, m12962m(), false, 2, null)) == null) {
                string = m12962m().getString(C45871nl4.time_elapsed_greater_than_a_month);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…sed_greater_than_a_month)");
            }
            ArrayList arrayList2 = new ArrayList();
            for (Issue issue : workOrder.getIssues()) {
                String display = issue.getDisplay();
                if (display != null) {
                    arrayList2.add(display);
                }
            }
            arrayList.add(new C2637G6(new C38474bJ3(string3, string, arrayList2, new PastWorkOrderButton(m12962m().getString(C45871nl4.command_center_work_order_details), wireBird, workOrder)), C36369Ui4.item_command_center_past_work_order, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }

    /* renamed from: z */
    public final C3023H6 m79472z(WireBird wireBird) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new RepairButton(m12962m().getString(C45871nl4.command_center_button_start_repair), wireBird), C45268mk4.item_button_matte_black, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
