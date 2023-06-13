package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderCreateSource;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.WorkOrderStatusReason;
import co.bird.android.model.constant.QCKind;
import co.bird.api.exception.HttpException;
import co.bird.api.request.InspectionEventRequestBody;
import co.bird.api.request.IssueCreateMultipleBody;
import co.bird.api.request.IssueUpdateStatusMultipleBody;
import co.bird.api.request.IssueUpdateStatusRequestBody;
import co.bird.api.request.QCAutoCheckRequestBody;
import co.bird.api.request.QCInspectionProcessRequestBody;
import co.bird.api.request.RepairCompletedEventBody;
import co.bird.api.request.RepairStartedEventBody;
import co.bird.api.request.WorkOrderCreateBody;
import co.bird.api.request.WorkOrderRepairBody;
import co.bird.api.request.WorkOrderRepairsBody;
import co.bird.api.request.WorkOrderUpdateNotesBody;
import co.bird.api.request.WorkOrderUpdateStatusBody;
import co.bird.api.response.QCAutoCheckResponseBody;
import co.bird.api.response.WorkOrderAssetManifest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
import p000.C46769pG6;
@Metadata(m28433d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010N\u001a\u00020L¢\u0006\u0004\bO\u0010PJ6\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016J8\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0017H\u0016J.\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\t0\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180$0\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J0\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0016J:\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016JT\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\t2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\b\u0010-\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010\u0011H\u0016J2\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\t0\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JF\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u001a\u00104\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00010\u0002030\t2\u0006\u0010\u0012\u001a\u00020.H\u0016J\"\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J6\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\t0\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010;\u001a\b\u0012\u0004\u0012\u0002090\t2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\tH\u0016J\u001c\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J.\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020.H\u0016J \u0010H\u001a\u00020D2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020.H\u0016J\u001e\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00070\u00062\b\u0010I\u001a\u0004\u0018\u00010BH\u0016R\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010M¨\u0006Q"}, m28432d2 = {"LpG6;", "LaG6;", "", RequestHeadersFactory.MODEL, "Lco/bird/android/model/RepairScope;", Action.SCOPE_ATTRIBUTE, "Lio/reactivex/F;", "LHM4;", "", "", "Lco/bird/android/model/IssueType;", "j", DateTokenConverter.CONVERTER_KEY, "id", C17296a.f69688o, "workOrderId", "issueTypeIds", "Lco/bird/android/model/IssueCreateSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/Issue;", "J", "e", "birdId", "Lco/bird/android/model/WorkOrderCreateSource;", "Lco/bird/android/model/WorkOrder;", "L", "Lco/bird/android/model/WorkOrderStatus;", "status", "Lco/bird/android/model/WorkOrderStatusReason;", "reason", "t", "notes", "b0", "M", "r", "p", "Lco/bird/android/buava/Optional;", "h", "l", "issuesToUpdate", "k", "u", "Lco/bird/android/model/RepairType;", "repairs", "issues", "workOrderSource", "Lco/bird/android/model/RepairSource;", "repairSource", "issueSource", "s", "b", "Lkotlin/Pair;", "repairIssueIdPairs", "Lco/bird/android/model/LegacyRepair;", "K", "c", "Lco/bird/android/model/constant/QCKind;", "Lco/bird/android/model/QCInspection;", "f", "inspections", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "", "g", "Lco/bird/api/response/QCAutoCheckResponseBody;", "o", "Lorg/joda/time/DateTime;", "time", "Lio/reactivex/c;", "i", "n", "sessionId", "m", "updatedAt", "Lco/bird/api/response/WorkOrderAssetManifest;", "q", "LgD6;", "LgD6;", "workOrderClient", "<init>", "(LgD6;)V", "work-order_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n766#2:400\n857#2,2:401\n1549#2:403\n1620#2,3:404\n1549#2:408\n1620#2,3:409\n1#3:407\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl\n*L\n180#1:400\n180#1:401,2\n181#1:403\n181#1:404,3\n329#1:408\n329#1:409,3\n*E\n"})
/* renamed from: pG6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46769pG6 implements InterfaceC37857aG6 {

    /* renamed from: b */
    public final InterfaceC41405gD6 f103371b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/WorkOrder;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$a */
    /* loaded from: classes4.dex */
    public static final class C27209a extends Lambda implements Function1<HM4<List<? extends WorkOrder>>, List<? extends WorkOrder>> {

        /* renamed from: g */
        public static final C27209a f103372g = new C27209a();

        public C27209a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WorkOrder> invoke(HM4<List<WorkOrder>> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            List<WorkOrder> m103944a = response.m103944a();
            if (m103944a != null) {
                return m103944a;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/WorkOrder;", "workOrders", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$b */
    /* loaded from: classes4.dex */
    public static final class C27210b extends Lambda implements Function1<List<? extends WorkOrder>, InterfaceC23434B<? extends WorkOrder>> {

        /* renamed from: g */
        public static final C27210b f103373g = new C27210b();

        public C27210b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WorkOrder> invoke(List<WorkOrder> workOrders) {
            Intrinsics.checkNotNullParameter(workOrders, "workOrders");
            return Observable.fromIterable(workOrders);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$c */
    /* loaded from: classes4.dex */
    public static final class C27211c extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/Issue;", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$c$a */
        /* loaded from: classes4.dex */
        public static final class C27212a extends Lambda implements Function1<HM4<List<? extends Issue>>, List<? extends Issue>> {

            /* renamed from: g */
            public static final C27212a f103375g = new C27212a();

            public C27212a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<Issue> invoke(HM4<List<Issue>> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                List<Issue> m103944a = response.m103944a();
                if (m103944a != null) {
                    return m103944a;
                }
                throw new HttpException(response);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$c$b */
        /* loaded from: classes4.dex */
        public static final class C27213b extends Lambda implements Function1<List<? extends Issue>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f103376g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27213b(WorkOrder workOrder) {
                super(1);
                this.f103376g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(List<Issue> issues) {
                WorkOrder copy;
                Intrinsics.checkNotNullParameter(issues, "issues");
                WorkOrder workOrder = this.f103376g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : issues, (r32 & 16384) != 0 ? workOrder.repairs : null);
                return copy;
            }
        }

        public C27211c() {
            super(1);
        }

        /* renamed from: d */
        public static final List m19621d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final WorkOrder m19620e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            AbstractC23442F<HM4<List<Issue>>> mo19648e = C46769pG6.this.mo19648e(workOrder.getId());
            final C27212a c27212a = C27212a.f103375g;
            AbstractC23442F<R> m33157I = mo19648e.m33157I(new InterfaceC23492o() { // from class: qG6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m19621d;
                    m19621d = C46769pG6.C27211c.m19621d(Function1.this, obj);
                    return m19621d;
                }
            });
            final C27213b c27213b = new C27213b(workOrder);
            return m33157I.m33157I(new InterfaceC23492o() { // from class: rG6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WorkOrder m19620e;
                    m19620e = C46769pG6.C27211c.m19620e(Function1.this, obj);
                    return m19620e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$d */
    /* loaded from: classes4.dex */
    public static final class C27214d extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23447K<? extends Optional<WorkOrder>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000 \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/LegacyRepair;", "response", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$d$a */
        /* loaded from: classes4.dex */
        public static final class C27215a extends Lambda implements Function1<HM4<List<? extends LegacyRepair>>, Pair<? extends Optional<WorkOrder>, ? extends HM4<List<? extends LegacyRepair>>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f103378g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27215a(Optional<WorkOrder> optional) {
                super(1);
                this.f103378g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<WorkOrder>, HM4<List<LegacyRepair>>> invoke(HM4<List<LegacyRepair>> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f103378g, response);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012X\u0010\u0007\u001aT\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "LHM4;", "", "Lco/bird/android/model/LegacyRepair;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$d$b */
        /* loaded from: classes4.dex */
        public static final class C27216b extends Lambda implements Function1<Pair<? extends Optional<WorkOrder>, ? extends HM4<? extends List<? extends LegacyRepair>>>, Optional<WorkOrder>> {

            /* renamed from: g */
            public static final C27216b f103379g = new C27216b();

            public C27216b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WorkOrder> invoke(Pair<Optional<WorkOrder>, ? extends HM4<? extends List<LegacyRepair>>> pair) {
                WorkOrder copy;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Optional<WorkOrder> component1 = pair.component1();
                HM4<? extends List<LegacyRepair>> repairsResponse = pair.component2();
                if (component1.m59037c()) {
                    Optional.C14443a c14443a = Optional.f63040c;
                    WorkOrder m59038b = component1.m59038b();
                    List<LegacyRepair> m103944a = repairsResponse.m103944a();
                    if (m103944a != null) {
                        copy = m59038b.copy((r32 & 1) != 0 ? m59038b.f66636id : null, (r32 & 2) != 0 ? m59038b.birdId : null, (r32 & 4) != 0 ? m59038b.createdBy : null, (r32 & 8) != 0 ? m59038b.createdAt : null, (r32 & 16) != 0 ? m59038b.source : null, (r32 & 32) != 0 ? m59038b.sourceDisplay : null, (r32 & 64) != 0 ? m59038b.status : null, (r32 & 128) != 0 ? m59038b.statusDisplay : null, (r32 & 256) != 0 ? m59038b.statusReason : null, (r32 & 512) != 0 ? m59038b.notes : null, (r32 & 1024) != 0 ? m59038b.updatedAt : null, (r32 & 2048) != 0 ? m59038b.deletedAt : null, (r32 & 4096) != 0 ? m59038b.user : null, (r32 & 8192) != 0 ? m59038b.issues : null, (r32 & 16384) != 0 ? m59038b.repairs : m103944a);
                        return c14443a.m59032c(copy);
                    }
                    Intrinsics.checkNotNullExpressionValue(repairsResponse, "repairsResponse");
                    throw new HttpException(repairsResponse);
                }
                return component1;
            }
        }

        public C27214d() {
            super(1);
        }

        /* renamed from: d */
        public static final Optional m19614d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Optional<WorkOrder>> invoke(Optional<WorkOrder> workOrderOptional) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            if (workOrderOptional.m59037c()) {
                AbstractC23442F<HM4<List<LegacyRepair>>> mo19650c = C46769pG6.this.mo19650c(workOrderOptional.m59038b().getId());
                final C27215a c27215a = new C27215a(workOrderOptional);
                m33158H = mo19650c.m33157I(new InterfaceC23492o() { // from class: sG6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C46769pG6.C27214d.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            } else {
                m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(workOrderOptional, HM4.m103935j(null)));
            }
            final C27216b c27216b = C27216b.f103379g;
            return m33158H.m33157I(new InterfaceC23492o() { // from class: tG6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m19614d;
                    m19614d = C46769pG6.C27214d.m19614d(Function1.this, obj);
                    return m19614d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/WorkOrder;", "response", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$e */
    /* loaded from: classes4.dex */
    public static final class C27217e extends Lambda implements Function1<HM4<WorkOrder>, Optional<WorkOrder>> {

        /* renamed from: g */
        public static final C27217e f103380g = new C27217e();

        public C27217e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WorkOrder> invoke(HM4<WorkOrder> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f() && response.m103944a() == null) {
                return Optional.f63040c.m59033b(response.m103944a());
            }
            Optional.C14443a c14443a = Optional.f63040c;
            WorkOrder m103944a = response.m103944a();
            if (m103944a != null) {
                return c14443a.m59032c(m103944a);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a÷\u0002\u0012³\u0001\b\u0001\u0012®\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005 \b*V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004 \b*º\u0001\u0012³\u0001\b\u0001\u0012®\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005 \b*V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$f */
    /* loaded from: classes4.dex */
    public static final class C27218f extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23447K<? extends Pair<? extends Optional<WorkOrder>, ? extends HM4<? extends List<? extends Issue>>>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000 \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/Issue;", "response", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$f$a */
        /* loaded from: classes4.dex */
        public static final class C27219a extends Lambda implements Function1<HM4<List<? extends Issue>>, Pair<? extends Optional<WorkOrder>, ? extends HM4<List<? extends Issue>>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f103382g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27219a(Optional<WorkOrder> optional) {
                super(1);
                this.f103382g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<WorkOrder>, HM4<List<Issue>>> invoke(HM4<List<Issue>> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(this.f103382g, response);
            }
        }

        public C27218f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Optional<WorkOrder>, HM4<? extends List<Issue>>>> invoke(Optional<WorkOrder> workOrderOptional) {
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            if (workOrderOptional.m59037c()) {
                AbstractC23442F<HM4<List<Issue>>> mo19648e = C46769pG6.this.mo19648e(workOrderOptional.m59038b().getId());
                final C27219a c27219a = new C27219a(workOrderOptional);
                InterfaceC23447K m33157I = mo19648e.m33157I(new InterfaceC23492o() { // from class: uG6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C46769pG6.C27218f.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "workOrderOptional ->\n   …l to response }\n        }");
                return m33157I;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(workOrderOptional, HM4.m103935j(null)));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(….success(null))\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0006*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012X\u0010\u0007\u001aT\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012D\u0012B\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "LHM4;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$g */
    /* loaded from: classes4.dex */
    public static final class C27220g extends Lambda implements Function1<Pair<? extends Optional<WorkOrder>, ? extends HM4<? extends List<? extends Issue>>>, Optional<WorkOrder>> {

        /* renamed from: g */
        public static final C27220g f103383g = new C27220g();

        public C27220g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WorkOrder> invoke(Pair<Optional<WorkOrder>, ? extends HM4<? extends List<Issue>>> pair) {
            WorkOrder copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = pair.component1();
            HM4<? extends List<Issue>> issuesResponse = pair.component2();
            if (component1.m59037c()) {
                Optional.C14443a c14443a = Optional.f63040c;
                WorkOrder m59038b = component1.m59038b();
                Intrinsics.checkNotNullExpressionValue(m59038b, "workOrderOptional.get()");
                WorkOrder workOrder = m59038b;
                List<Issue> m103944a = issuesResponse.m103944a();
                if (m103944a != null) {
                    copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : m103944a, (r32 & 16384) != 0 ? workOrder.repairs : null);
                    return c14443a.m59032c(copy);
                }
                Intrinsics.checkNotNullExpressionValue(issuesResponse, "issuesResponse");
                throw new HttpException(issuesResponse);
            }
            return component1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n766#2:400\n857#2,2:401\n1549#2:403\n1620#2,2:404\n288#2,2:406\n223#2,2:408\n1622#2:410\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$2\n*L\n290#1:400\n290#1:401,2\n291#1:403\n291#1:404,2\n296#1:406,2\n297#1:408,2\n291#1:410\n*E\n"})
    /* renamed from: pG6$h */
    /* loaded from: classes4.dex */
    public static final class C27221h extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: g */
        public final /* synthetic */ List<Issue> f103384g;

        /* renamed from: h */
        public final /* synthetic */ C46769pG6 f103385h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "resolvedIssues", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n766#2:400\n857#2:401\n1549#2:402\n1620#2,3:403\n858#2:406\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$2$1\n*L\n308#1:400\n308#1:401\n309#1:402\n309#1:403,3\n308#1:406\n*E\n"})
        /* renamed from: pG6$h$a */
        /* loaded from: classes4.dex */
        public static final class C27222a extends Lambda implements Function1<List<? extends Issue>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f103386g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27222a(WorkOrder workOrder) {
                super(1);
                this.f103386g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(List<Issue> resolvedIssues) {
                WorkOrder copy;
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(resolvedIssues, "resolvedIssues");
                ArrayList arrayList = new ArrayList();
                for (Object obj : this.f103386g.getIssues()) {
                    Issue issue = (Issue) obj;
                    List<Issue> list = resolvedIssues;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    for (Issue issue2 : list) {
                        arrayList2.add(issue2.getId());
                    }
                    if (!arrayList2.contains(issue.getId())) {
                        arrayList.add(obj);
                    }
                }
                WorkOrder workOrder = this.f103386g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : arrayList, (r32 & 16384) != 0 ? workOrder.repairs : null);
                return copy;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27221h(List<Issue> list, C46769pG6 c46769pG6) {
            super(1);
            this.f103384g = list;
            this.f103385h = c46769pG6;
        }

        /* renamed from: c */
        public static final WorkOrder m19604c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            int collectionSizeOrDefault;
            boolean isBlank;
            Object obj;
            String id;
            boolean contains;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            ArrayList<Issue> arrayList = new ArrayList();
            for (Object obj2 : this.f103384g) {
                contains = CollectionsKt___CollectionsKt.contains(InterfaceC37857aG6.f50208a.m71717a(), ((Issue) obj2).getStatus());
                if (contains) {
                    arrayList.add(obj2);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : arrayList) {
                isBlank = StringsKt__StringsJVMKt.isBlank(issue.getId());
                if (isBlank) {
                    Iterator<T> it = workOrder.getRepairs().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((LegacyRepair) obj).getIssueTypeId(), issue.getIssueTypeId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    LegacyRepair legacyRepair = (LegacyRepair) obj;
                    if (legacyRepair == null || (id = legacyRepair.getIssueId()) == null) {
                        for (Issue issue2 : workOrder.getIssues()) {
                            if (Intrinsics.areEqual(issue2.getIssueTypeId(), issue.getIssueTypeId())) {
                                id = issue2.getId();
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    issue = issue.copy((r37 & 1) != 0 ? issue.f66598id : id, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : null, (r37 & 64) != 0 ? issue.statusDisplay : null, (r37 & 128) != 0 ? issue.statusColor : null, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : null, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : null);
                }
                arrayList2.add(issue);
            }
            AbstractC23442F m70883l = C38096ag5.m70883l(this.f103385h.mo19642k(workOrder.getId(), arrayList2));
            final C27222a c27222a = new C27222a(workOrder);
            return m70883l.m33157I(new InterfaceC23492o() { // from class: vG6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj3) {
                    WorkOrder m19604c;
                    m19604c = C46769pG6.C27221h.m19604c(Function1.this, obj3);
                    return m19604c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n1#2:400\n*E\n"})
    /* renamed from: pG6$i */
    /* loaded from: classes4.dex */
    public static final class C27223i extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrderCreateSource f103387g;

        /* renamed from: h */
        public final /* synthetic */ C46769pG6 f103388h;

        /* renamed from: i */
        public final /* synthetic */ String f103389i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27223i(WorkOrderCreateSource workOrderCreateSource, C46769pG6 c46769pG6, String str) {
            super(1);
            this.f103387g = workOrderCreateSource;
            this.f103388h = c46769pG6;
            this.f103389i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WorkOrder> invoke(Optional<WorkOrder> workOrderOptional) {
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            if (workOrderOptional.m59037c()) {
                AbstractC23442F m33158H = AbstractC23442F.m33158H(workOrderOptional.m59038b());
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(…Optional.get())\n        }");
                return m33158H;
            }
            WorkOrderCreateSource workOrderCreateSource = this.f103387g;
            if (workOrderCreateSource != null) {
                return C38096ag5.m70883l(this.f103388h.m19669L(this.f103389i, workOrderCreateSource));
            }
            throw new IllegalArgumentException("Cannot create a WorkOrder without a WorkOrderCreateSource".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n766#2:400\n857#2:401\n2624#2,3:402\n2624#2,3:405\n858#2:408\n1549#2:409\n1620#2,3:410\n1#3:413\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$2\n*L\n256#1:400\n256#1:401\n257#1:402,3\n258#1:405,3\n256#1:408\n259#1:409\n259#1:410,3\n*E\n"})
    /* renamed from: pG6$j */
    /* loaded from: classes4.dex */
    public static final class C27224j extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: g */
        public final /* synthetic */ List<Issue> f103390g;

        /* renamed from: h */
        public final /* synthetic */ IssueCreateSource f103391h;

        /* renamed from: i */
        public final /* synthetic */ C46769pG6 f103392i;

        /* renamed from: j */
        public final /* synthetic */ List<RepairType> f103393j;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: pG6$j$a */
        /* loaded from: classes4.dex */
        public static final class C27225a extends Lambda implements Function1<List<? extends Issue>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f103394g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27225a(WorkOrder workOrder) {
                super(1);
                this.f103394g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(List<Issue> issues) {
                WorkOrder copy;
                Intrinsics.checkNotNullParameter(issues, "issues");
                WorkOrder workOrder = this.f103394g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : issues, (r32 & 16384) != 0 ? workOrder.repairs : null);
                return copy;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27224j(List<Issue> list, IssueCreateSource issueCreateSource, C46769pG6 c46769pG6, List<RepairType> list2) {
            super(1);
            this.f103390g = list;
            this.f103391h = issueCreateSource;
            this.f103392i = c46769pG6;
            this.f103393j = list2;
        }

        /* renamed from: c */
        public static final WorkOrder m19599c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x009a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0018 A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            ArrayList arrayList;
            int collectionSizeOrDefault;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            List<Issue> list = this.f103390g;
            boolean z5 = false;
            if (list != null) {
                List<RepairType> list2 = this.f103393j;
                ArrayList<Issue> arrayList2 = new ArrayList();
                for (Object obj : list) {
                    Issue issue = (Issue) obj;
                    if (list2 != null) {
                        List<RepairType> list3 = list2;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            for (RepairType repairType : list3) {
                                if (Intrinsics.areEqual(repairType.getIssueTypeId(), issue.getIssueTypeId())) {
                                    z4 = false;
                                    break;
                                }
                            }
                        }
                        z4 = true;
                        if (z4) {
                            z = true;
                            if (z) {
                                List<Issue> issues = workOrder.getIssues();
                                if (!(issues instanceof Collection) || !issues.isEmpty()) {
                                    for (Issue issue2 : issues) {
                                        if (Intrinsics.areEqual(issue2.getIssueTypeId(), issue.getIssueTypeId())) {
                                            z3 = false;
                                            break;
                                        }
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    z2 = true;
                                    if (z2) {
                                        arrayList2.add(obj);
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                for (Issue issue3 : arrayList2) {
                    arrayList.add(issue3.getIssueTypeId());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                z5 = true;
            }
            if (z5) {
                if (this.f103391h != null) {
                    AbstractC23442F m70883l = C38096ag5.m70883l(this.f103392i.m19671J(workOrder.getId(), arrayList, this.f103391h));
                    final C27225a c27225a = new C27225a(workOrder);
                    return m70883l.m33157I(new InterfaceC23492o() { // from class: wG6
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj2) {
                            WorkOrder m19599c;
                            m19599c = C46769pG6.C27224j.m19599c(Function1.this, obj2);
                            return m19599c;
                        }
                    });
                }
                throw new IllegalArgumentException("Cannot log new issues with a null IssueSource".toString());
            }
            return AbstractC23442F.m33158H(workOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1549#2:400\n1620#2,2:401\n288#2,2:403\n1622#2:405\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3\n*L\n276#1:400\n276#1:401,2\n277#1:403,2\n276#1:405\n*E\n"})
    /* renamed from: pG6$k */
    /* loaded from: classes4.dex */
    public static final class C27226k extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: g */
        public final /* synthetic */ List<RepairType> f103395g;

        /* renamed from: h */
        public final /* synthetic */ C46769pG6 f103396h;

        /* renamed from: i */
        public final /* synthetic */ RepairSource f103397i;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/LegacyRepair;", "repairs", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,399:1\n37#2,2:400\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$logRepairs$logRepairSingle$3$2\n*L\n282#1:400,2\n*E\n"})
        /* renamed from: pG6$k$a */
        /* loaded from: classes4.dex */
        public static final class C27227a extends Lambda implements Function1<List<? extends LegacyRepair>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f103398g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27227a(WorkOrder workOrder) {
                super(1);
                this.f103398g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(List<LegacyRepair> repairs) {
                List listOf;
                WorkOrder copy;
                Intrinsics.checkNotNullParameter(repairs, "repairs");
                WorkOrder workOrder = this.f103398g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(this.f103398g.getRepairs().toArray(new LegacyRepair[0]));
                spreadBuilder.addSpread(repairs.toArray(new LegacyRepair[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new LegacyRepair[spreadBuilder.size()]));
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : null, (r32 & 16384) != 0 ? workOrder.repairs : listOf);
                return copy;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27226k(List<RepairType> list, C46769pG6 c46769pG6, RepairSource repairSource) {
            super(1);
            this.f103395g = list;
            this.f103396h = c46769pG6;
            this.f103397i = repairSource;
        }

        /* renamed from: c */
        public static final WorkOrder m19595c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            List<RepairType> list;
            int collectionSizeOrDefault;
            String str;
            Object obj;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            boolean z = false;
            if (this.f103395g != null && (!list.isEmpty())) {
                z = true;
            }
            if (z) {
                C46769pG6 c46769pG6 = this.f103396h;
                String id = workOrder.getId();
                List<RepairType> list2 = this.f103395g;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (RepairType repairType : list2) {
                    Iterator<T> it = workOrder.getIssues().iterator();
                    while (true) {
                        str = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (Intrinsics.areEqual(((Issue) obj).getIssueTypeId(), repairType.getIssueTypeId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Issue issue = (Issue) obj;
                    if (issue != null) {
                        str = issue.getId();
                    }
                    arrayList.add(TuplesKt.m28425to(repairType, str));
                }
                RepairSource repairSource = this.f103397i;
                Intrinsics.checkNotNull(repairSource);
                AbstractC23442F m70883l = C38096ag5.m70883l(c46769pG6.m19670K(id, arrayList, repairSource));
                final C27227a c27227a = new C27227a(workOrder);
                return m70883l.m33157I(new InterfaceC23492o() { // from class: xG6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj2) {
                        WorkOrder m19595c;
                        m19595c = C46769pG6.C27226k.m19595c(Function1.this, obj2);
                        return m19595c;
                    }
                });
            }
            return AbstractC23442F.m33158H(workOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$l */
    /* loaded from: classes4.dex */
    public static final class C27228l extends Lambda implements Function1<WorkOrder, String> {

        /* renamed from: g */
        public static final C27228l f103399g = new C27228l();

        public C27228l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            return workOrder.getId();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a¯\u0002\u0012\u008f\u0001\b\u0001\u0012\u008a\u0001\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004 \u0007*D\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0007*\u0096\u0001\u0012\u008f\u0001\b\u0001\u0012\u008a\u0001\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004 \u0007*D\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "workOrderId", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pG6$m */
    /* loaded from: classes4.dex */
    public static final class C27229m extends Lambda implements Function1<String, InterfaceC23447K<? extends Pair<? extends HM4<List<? extends Issue>>, ? extends HM4<WorkOrder>>>> {

        /* renamed from: g */
        public final /* synthetic */ List<String> f103400g;

        /* renamed from: h */
        public final /* synthetic */ C46769pG6 f103401h;

        /* renamed from: i */
        public final /* synthetic */ String f103402i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27229m(List<String> list, C46769pG6 c46769pG6, String str) {
            super(1);
            this.f103400g = list;
            this.f103401h = c46769pG6;
            this.f103402i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<HM4<List<Issue>>, HM4<WorkOrder>>> invoke(String workOrderId) {
            List emptyList;
            AbstractC23442F<HM4<List<Issue>>> m33158H;
            Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
            C24530g c24530g = C24530g.f91174a;
            if (!this.f103400g.isEmpty()) {
                m33158H = this.f103401h.m19671J(workOrderId, this.f103400g, IssueCreateSource.INSPECTION);
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                m33158H = AbstractC23442F.m33158H(HM4.m103935j(emptyList));
                Intrinsics.checkNotNullExpressionValue(m33158H, "{\n            // Only up…emptyList()))\n          }");
            }
            return c24530g.m31946a(m33158H, this.f103401h.m19651b0(workOrderId, this.f103402i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00050\u00052F\u0010\u0006\u001aB\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "LHM4;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$submitWorkOrder$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,399:1\n12744#2,2:400\n1109#2,2:402\n*S KotlinDebug\n*F\n+ 1 WorkOrderManagerImpl.kt\nco/bird/android/manager/workorder/WorkOrderManagerImpl$submitWorkOrder$5\n*L\n232#1:400,2\n233#1:402,2\n*E\n"})
    /* renamed from: pG6$n */
    /* loaded from: classes4.dex */
    public static final class C27230n extends Lambda implements Function1<Pair<? extends HM4<List<? extends Issue>>, ? extends HM4<WorkOrder>>, WorkOrder> {

        /* renamed from: g */
        public static final C27230n f103403g = new C27230n();

        public C27230n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WorkOrder invoke(Pair<HM4<List<Issue>>, HM4<WorkOrder>> pair) {
            boolean z;
            WorkOrder copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            HM4<List<Issue>> component1 = pair.component1();
            HM4<WorkOrder> component2 = pair.component2();
            List<Issue> m103944a = component1.m103944a();
            WorkOrder m103944a2 = component2.m103944a();
            HM4[] hm4Arr = {component1, component2};
            int i = 0;
            while (true) {
                if (i < 2) {
                    if (!hm4Arr[i].m103939f()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z && m103944a != null && m103944a2 != null) {
                copy = m103944a2.copy((r32 & 1) != 0 ? m103944a2.f66636id : null, (r32 & 2) != 0 ? m103944a2.birdId : null, (r32 & 4) != 0 ? m103944a2.createdBy : null, (r32 & 8) != 0 ? m103944a2.createdAt : null, (r32 & 16) != 0 ? m103944a2.source : null, (r32 & 32) != 0 ? m103944a2.sourceDisplay : null, (r32 & 64) != 0 ? m103944a2.status : null, (r32 & 128) != 0 ? m103944a2.statusDisplay : null, (r32 & 256) != 0 ? m103944a2.statusReason : null, (r32 & 512) != 0 ? m103944a2.notes : null, (r32 & 1024) != 0 ? m103944a2.updatedAt : null, (r32 & 2048) != 0 ? m103944a2.deletedAt : null, (r32 & 4096) != 0 ? m103944a2.user : null, (r32 & 8192) != 0 ? m103944a2.issues : m103944a, (r32 & 16384) != 0 ? m103944a2.repairs : null);
                return copy;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                HM4 hm4 = hm4Arr[i2];
                if (!hm4.m103939f()) {
                    Intrinsics.checkNotNullExpressionValue(hm4, "responses.first { respon… !response.isSuccessful }");
                    throw new HttpException(hm4);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public C46769pG6(InterfaceC41405gD6 workOrderClient) {
        Intrinsics.checkNotNullParameter(workOrderClient, "workOrderClient");
        this.f103371b = workOrderClient;
    }

    /* renamed from: N */
    public static final List m19667N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23434B m19666O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m19665P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m19664Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Optional m19663R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final InterfaceC23447K m19662S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final Optional m19661T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m19660U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23447K m19659V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m19658W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23447K m19657X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final String m19656Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m19655Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final WorkOrder m19653a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WorkOrder) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public AbstractC23442F<HM4<List<Issue>>> m19671J(String workOrderId, List<String> issueTypeIds, IssueCreateSource source) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issueTypeIds, "issueTypeIds");
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23442F<HM4<List<Issue>>> m33142Y = this.f103371b.m39855m(new IssueCreateMultipleBody(workOrderId, issueTypeIds, source)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.createIs…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: K */
    public AbstractC23442F<HM4<List<LegacyRepair>>> m19670K(String workOrderId, List<Pair<RepairType, String>> repairIssueIdPairs, RepairSource source) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(repairIssueIdPairs, "repairIssueIdPairs");
        Intrinsics.checkNotNullParameter(source, "source");
        InterfaceC41405gD6 interfaceC41405gD6 = this.f103371b;
        List<Pair<RepairType, String>> list = repairIssueIdPairs;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            RepairType repairType = (RepairType) pair.component1();
            arrayList.add(new WorkOrderRepairBody(repairType.getId(), repairType.getIssueTypeId(), (String) pair.component2()));
        }
        AbstractC23442F<HM4<List<LegacyRepair>>> m33142Y = interfaceC41405gD6.m39859i(new WorkOrderRepairsBody(workOrderId, arrayList, source)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.createRe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: L */
    public AbstractC23442F<HM4<WorkOrder>> m19669L(String birdId, WorkOrderCreateSource source) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23442F<HM4<WorkOrder>> m33142Y = this.f103371b.m39861g(new WorkOrderCreateBody(birdId, source)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.createWo…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: M */
    public AbstractC23442F<HM4<List<WorkOrder>>> m19668M(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<WorkOrder>>> m33142Y = this.f103371b.m39857k(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getClose…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: a */
    public AbstractC23442F<HM4<IssueType>> mo19654a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC23442F<HM4<IssueType>> m33142Y = this.f103371b.m39867a(id).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getIssue…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: b */
    public AbstractC23442F<HM4<List<RepairType>>> mo19652b(String birdId, String model, RepairScope scope) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scope, "scope");
        AbstractC23442F<HM4<List<RepairType>>> m33142Y = this.f103371b.m39866b(birdId, model, scope).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getAllRe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    /* renamed from: b0 */
    public AbstractC23442F<HM4<WorkOrder>> m19651b0(String workOrderId, String str) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        AbstractC23442F<HM4<WorkOrder>> m33142Y = this.f103371b.m39853o(new WorkOrderUpdateNotesBody(workOrderId, str)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.updateWo…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: c */
    public AbstractC23442F<HM4<List<LegacyRepair>>> mo19650c(String workOrderId) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        AbstractC23442F<HM4<List<LegacyRepair>>> m33142Y = this.f103371b.m39865c(workOrderId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getRepai…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: d */
    public AbstractC23442F<HM4<List<IssueType>>> mo19649d(String model, RepairScope scope) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scope, "scope");
        AbstractC23442F<HM4<List<IssueType>>> m33142Y = this.f103371b.m39864d(model, scope).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getIssue…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: e */
    public AbstractC23442F<HM4<List<Issue>>> mo19648e(String workOrderId) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        AbstractC23442F<HM4<List<Issue>>> m33142Y = this.f103371b.m39863e(workOrderId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getIssue…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: f */
    public AbstractC23442F<HM4<Map<QCKind, List<QCInspection>>>> mo19647f(String workOrderId, String model) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(model, "model");
        InterfaceC41405gD6 interfaceC41405gD6 = this.f103371b;
        String lowerCase = model.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        AbstractC23442F<HM4<Map<QCKind, List<QCInspection>>>> m33142Y = interfaceC41405gD6.m39862f(workOrderId, lowerCase).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getQcIns…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: g */
    public AbstractC23442F<HM4<Boolean>> mo19646g(String workOrderId, List<QCInspection> inspections, List<QCAutoCheck> qcAutoChecks) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(inspections, "inspections");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        AbstractC23442F<HM4<Boolean>> m33142Y = this.f103371b.m39854n(new QCInspectionProcessRequestBody(workOrderId, inspections, qcAutoChecks)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.processQ…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: h */
    public AbstractC23442F<Optional<WorkOrder>> mo19645h(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<WorkOrder>> mo19637p = mo19637p(birdId);
        final C27217e c27217e = C27217e.f103380g;
        AbstractC23442F<R> m33157I = mo19637p.m33157I(new InterfaceC23492o() { // from class: dG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m19663R;
                m19663R = C46769pG6.m19663R(Function1.this, obj);
                return m19663R;
            }
        });
        final C27218f c27218f = new C27218f();
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: eG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19662S;
                m19662S = C46769pG6.m19662S(Function1.this, obj);
                return m19662S;
            }
        });
        final C27220g c27220g = C27220g.f103383g;
        AbstractC23442F<Optional<WorkOrder>> m33157I2 = m33165A.m33157I(new InterfaceC23492o() { // from class: fG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m19661T;
                m19661T = C46769pG6.m19661T(Function1.this, obj);
                return m19661T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "override fun getOpenWork…nal\n        }\n      }\n  }");
        return m33157I2;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: i */
    public AbstractC23461c mo19644i(DateTime time, String workOrderId) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        AbstractC23461c m33063X = this.f103371b.m39852p(new InspectionEventRequestBody(time, workOrderId)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "workOrderClient.recordIn…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: j */
    public AbstractC23442F<HM4<Map<String, List<IssueType>>>> mo19643j(String model, RepairScope scope) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scope, "scope");
        AbstractC23442F<HM4<Map<String, List<IssueType>>>> m33142Y = this.f103371b.m39860h(model, scope).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getIssue…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: k */
    public AbstractC23442F<HM4<List<Issue>>> mo19642k(String workOrderId, List<Issue> issuesToUpdate) {
        int collectionSizeOrDefault;
        boolean z;
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(issuesToUpdate, "issuesToUpdate");
        ArrayList<Issue> arrayList = new ArrayList();
        for (Object obj : issuesToUpdate) {
            if (((Issue) obj).getStatus() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : arrayList) {
            String id = issue.getId();
            IssueStatus status = issue.getStatus();
            Intrinsics.checkNotNull(status);
            arrayList2.add(new IssueUpdateStatusRequestBody(id, status, issue.getStatusReason()));
        }
        AbstractC23442F<HM4<List<Issue>>> m33142Y = this.f103371b.m39849s(new IssueUpdateStatusMultipleBody(workOrderId, arrayList2)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.updateIs…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: l */
    public AbstractC23442F<Optional<WorkOrder>> mo19641l(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<Optional<WorkOrder>> mo19645h = mo19645h(birdId);
        final C27214d c27214d = new C27214d();
        AbstractC23442F m33165A = mo19645h.m33165A(new InterfaceC23492o() { // from class: bG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19664Q;
                m19664Q = C46769pG6.m19664Q(Function1.this, obj);
                return m19664Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "override fun getOpenWork…}\n          }\n      }\n  }");
        return m33165A;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: m */
    public AbstractC23461c mo19640m(String sessionId, String workOrderId, RepairSource source) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23461c m33063X = this.f103371b.m39851q(new RepairCompletedEventBody(sessionId, workOrderId, source)).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "workOrderClient.recordRe…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: n */
    public AbstractC23442F<HM4<String>> mo19639n(DateTime dateTime, String workOrderId, RepairSource source) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC23442F<HM4<String>> m33142Y = this.f103371b.m39856l(new RepairStartedEventBody(dateTime, workOrderId, source)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.recordRe…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: o */
    public AbstractC23442F<HM4<QCAutoCheckResponseBody>> mo19638o(String workOrderId) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        AbstractC23442F<HM4<QCAutoCheckResponseBody>> m33142Y = this.f103371b.m39847u(new QCAutoCheckRequestBody(workOrderId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.startQCA…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: p */
    public AbstractC23442F<HM4<WorkOrder>> mo19637p(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<WorkOrder>> m33142Y = this.f103371b.m39850r(birdId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getOpenW…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: q */
    public AbstractC23442F<HM4<WorkOrderAssetManifest>> mo19636q(DateTime dateTime) {
        Long l;
        InterfaceC41405gD6 interfaceC41405gD6 = this.f103371b;
        if (dateTime != null) {
            l = Long.valueOf(dateTime.getMillis());
        } else {
            l = null;
        }
        AbstractC23442F<HM4<WorkOrderAssetManifest>> m33142Y = interfaceC41405gD6.m39858j(l).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.getAsset…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: r */
    public AbstractC23442F<List<WorkOrder>> mo19635r(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<HM4<List<WorkOrder>>> m19668M = m19668M(birdId);
        final C27209a c27209a = C27209a.f103372g;
        AbstractC23442F<R> m33157I = m19668M.m33157I(new InterfaceC23492o() { // from class: nG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m19667N;
                m19667N = C46769pG6.m19667N(Function1.this, obj);
                return m19667N;
            }
        });
        final C27210b c27210b = C27210b.f103373g;
        Observable m33162D = m33157I.m33162D(new InterfaceC23492o() { // from class: oG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m19666O;
                m19666O = C46769pG6.m19666O(Function1.this, obj);
                return m19666O;
            }
        });
        final C27211c c27211c = new C27211c();
        AbstractC23442F<List<WorkOrder>> list = m33162D.flatMapSingle(new InterfaceC23492o() { // from class: cG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19665P;
                m19665P = C46769pG6.m19665P(Function1.this, obj);
                return m19665P;
            }
        }).toList();
        Intrinsics.checkNotNullExpressionValue(list, "override fun getClosedWo…    }\n      .toList()\n  }");
        return list;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: s */
    public AbstractC23442F<WorkOrder> mo19634s(String birdId, List<RepairType> list, List<Issue> list2, WorkOrderCreateSource workOrderCreateSource, RepairSource repairSource, IssueCreateSource issueCreateSource) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        if (list != null && (!list.isEmpty()) && repairSource == null) {
            throw new IllegalArgumentException("Cannot log repairs with a null RepairSource".toString());
        }
        AbstractC23442F<Optional<WorkOrder>> mo19645h = mo19645h(birdId);
        final C27223i c27223i = new C27223i(workOrderCreateSource, this, birdId);
        AbstractC23442F<R> m33165A = mo19645h.m33165A(new InterfaceC23492o() { // from class: gG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19660U;
                m19660U = C46769pG6.m19660U(Function1.this, obj);
                return m19660U;
            }
        });
        final C27224j c27224j = new C27224j(list2, issueCreateSource, this, list);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: hG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19659V;
                m19659V = C46769pG6.m19659V(Function1.this, obj);
                return m19659V;
            }
        });
        final C27226k c27226k = new C27226k(list, this, repairSource);
        AbstractC23442F<WorkOrder> m33165A3 = m33165A2.m33165A(new InterfaceC23492o() { // from class: iG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19658W;
                m19658W = C46769pG6.m19658W(Function1.this, obj);
                return m19658W;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A3, "override fun logRepairs(…eturn logRepairSingle\n  }");
        if (list2 != null) {
            final C27221h c27221h = new C27221h(list2, this);
            AbstractC23442F m33165A4 = m33165A3.m33165A(new InterfaceC23492o() { // from class: jG6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m19657X;
                    m19657X = C46769pG6.m19657X(Function1.this, obj);
                    return m19657X;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33165A4, "override fun logRepairs(…eturn logRepairSingle\n  }");
            return m33165A4;
        }
        return m33165A3;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: t */
    public AbstractC23442F<HM4<WorkOrder>> mo19633t(String workOrderId, WorkOrderStatus status, WorkOrderStatusReason workOrderStatusReason) {
        Intrinsics.checkNotNullParameter(workOrderId, "workOrderId");
        Intrinsics.checkNotNullParameter(status, "status");
        AbstractC23442F<HM4<WorkOrder>> m33142Y = this.f103371b.m39848t(new WorkOrderUpdateStatusBody(workOrderId, status, workOrderStatusReason)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "workOrderClient.updateWo…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC37857aG6
    /* renamed from: u */
    public AbstractC23442F<WorkOrder> mo19632u(String str, String str2, List<String> issueTypeIds, String str3) {
        AbstractC23442F m33157I;
        Intrinsics.checkNotNullParameter(issueTypeIds, "issueTypeIds");
        boolean z = true;
        if (str2 != null) {
            if (!(!issueTypeIds.isEmpty()) && str3 == null) {
                z = false;
            }
            if (z) {
                m33157I = AbstractC23442F.m33158H(str2);
            } else {
                throw new IllegalArgumentException("Cannot update a WorkOrder with no issues and no notes".toString());
            }
        } else if (str != null) {
            if (!issueTypeIds.isEmpty()) {
                AbstractC23442F m70883l = C38096ag5.m70883l(m19669L(str, WorkOrderCreateSource.SERVICE_CENTER));
                final C27228l c27228l = C27228l.f103399g;
                m33157I = m70883l.m33157I(new InterfaceC23492o() { // from class: kG6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        String m19656Y;
                        m19656Y = C46769pG6.m19656Y(Function1.this, obj);
                        return m19656Y;
                    }
                });
            } else {
                throw new IllegalArgumentException("Cannot create a WorkOrder with no issues".toString());
            }
        } else {
            throw new IllegalArgumentException("birdId and workOrderId cannot both be null!");
        }
        final C27229m c27229m = new C27229m(issueTypeIds, this, str3);
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: lG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m19655Z;
                m19655Z = C46769pG6.m19655Z(Function1.this, obj);
                return m19655Z;
            }
        });
        final C27230n c27230n = C27230n.f103403g;
        AbstractC23442F<WorkOrder> m33157I2 = m33165A.m33157I(new InterfaceC23492o() { // from class: mG6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WorkOrder m19653a0;
                m19653a0 = C46769pG6.m19653a0(Function1.this, obj);
                return m19653a0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I2, "override fun submitWorkO…ues = issues)\n      }\n  }");
        return m33157I2;
    }
}
