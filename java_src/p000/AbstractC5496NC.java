package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.IssueType;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.WorkOrderStatusReason;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.constant.QCKind;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.extension.IssueType_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.InterfaceC40099e13;
import p000.InterfaceC48923su2;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\bF\u0010GJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R(\u00107\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00040\u0004018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R4\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000208 2*\n\u0012\u0004\u0012\u000208\u0018\u00010\b0\b018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R4\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020< 2*\n\u0012\u0004\u0012\u00020<\u0018\u00010\b0\b018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\"\u0010A\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00020\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00104R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m28432d2 = {"LNC;", "LSb4;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", C17296a.f69688o, "", "Lco/bird/android/model/IssueType;", "issueTypes", "b", "B", "LaG6;", "LaG6;", "z", "()LaG6;", "workOrderManager", "Lsu2;", "Lsu2;", "t", "()Lsu2;", "localAssetManager", "Le13;", "c", "Le13;", "u", "()Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "y", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "e", "LTq4;", "x", "()LTq4;", "reactiveConfig", "LAb4;", "f", "LAb4;", "qcAnalyticsManager", "LOC;", "g", "LOC;", "ui", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "A", "()Lio/reactivex/subjects/a;", "workOrderSubject", "Lco/bird/android/model/QCInspection;", "i", "w", "qcInspectionSubject", "Lco/bird/android/model/QCAutoCheck;", "j", "v", "qcAutoChecksSubject", "k", "birdSubject", "Lco/bird/android/model/constant/QualityControlFlow;", "s", "()Lco/bird/android/model/constant/QualityControlFlow;", "flow", "<init>", "(LaG6;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;LAb4;LOC;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,138:1\n199#2:139\n218#2:140\n180#2:141\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter\n*L\n84#1:139\n104#1:140\n122#1:141\n*E\n"})
/* renamed from: NC */
/* loaded from: classes4.dex */
public abstract class AbstractC5496NC implements InterfaceC35838Sb4 {

    /* renamed from: a */
    public final InterfaceC37857aG6 f24250a;

    /* renamed from: b */
    public final InterfaceC48923su2 f24251b;

    /* renamed from: c */
    public final InterfaceC40099e13 f24252c;

    /* renamed from: d */
    public final ScopeProvider f24253d;

    /* renamed from: e */
    public final C36207Tq4 f24254e;

    /* renamed from: f */
    public final InterfaceC31626Ab4 f24255f;

    /* renamed from: g */
    public final InterfaceC5925OC f24256g;

    /* renamed from: h */
    public final C24552a<WorkOrder> f24257h;

    /* renamed from: i */
    public final C24552a<List<QCInspection>> f24258i;

    /* renamed from: j */
    public final C24552a<List<QCAutoCheck>> f24259j;

    /* renamed from: k */
    public final C24552a<WireBird> f24260k;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NC$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5497a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InspectionFlow.values().length];
            try {
                iArr[InspectionFlow.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InspectionFlow.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "<name for destructuring parameter 0>", "Lco/bird/android/model/QCInspection;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/QCInspection;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$b */
    /* loaded from: classes4.dex */
    public static final class C5498b extends Lambda implements Function1<Pair<? extends IssueType, ? extends WorkOrder>, QCInspection> {

        /* renamed from: g */
        public static final C5498b f24261g = new C5498b();

        public C5498b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final QCInspection invoke(Pair<IssueType, WorkOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            IssueType issueType = pair.component1();
            Intrinsics.checkNotNullExpressionValue(issueType, "issueType");
            return IssueType_Kt.toQCInspection$default(issueType, pair.component2().getId(), null, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005 \u0003*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u00072X\u0010\u0006\u001aT\u0012(\u0012&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireBird;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$addIssueTypes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n37#3,2:143\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$addIssueTypes$2\n*L\n118#1:139\n118#1:140,3\n118#1:143,2\n*E\n"})
    /* renamed from: NC$c */
    /* loaded from: classes4.dex */
    public static final class C5499c extends Lambda implements Function1<Triple<? extends List<QCInspection>, ? extends List<? extends QCInspection>, ? extends WireBird>, Pair<? extends List<? extends QCInspection>, ? extends WireBird>> {

        /* renamed from: g */
        public static final C5499c f24262g = new C5499c();

        public C5499c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<QCInspection>, WireBird> invoke(Triple<? extends List<QCInspection>, ? extends List<QCInspection>, WireBird> triple) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            QCInspection copy;
            QCInspection copy2;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<QCInspection> newQCInspections = triple.component1();
            List<QCInspection> qcInspections = triple.component2();
            WireBird component3 = triple.component3();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Intrinsics.checkNotNullExpressionValue(qcInspections, "qcInspections");
            List<QCInspection> list = qcInspections;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (QCInspection qCInspection : list) {
                copy2 = qCInspection.copy((r20 & 1) != 0 ? qCInspection.f66615id : null, (r20 & 2) != 0 ? qCInspection.title : null, (r20 & 4) != 0 ? qCInspection.description : null, (r20 & 8) != 0 ? qCInspection.workOrderId : null, (r20 & 16) != 0 ? qCInspection.issueTypeId : null, (r20 & 32) != 0 ? qCInspection.repairTypeId : null, (r20 & 64) != 0 ? qCInspection.kind : null, (r20 & 128) != 0 ? qCInspection.status : QCStatus.SKIPPED, (r20 & 256) != 0 ? qCInspection.assetId : null);
                arrayList.add(copy2);
            }
            spreadBuilder.addSpread(arrayList.toArray(new QCInspection[0]));
            Intrinsics.checkNotNullExpressionValue(newQCInspections, "newQCInspections");
            List<QCInspection> list2 = newQCInspections;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (QCInspection it : list2) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                copy = it.copy((r20 & 1) != 0 ? it.f66615id : null, (r20 & 2) != 0 ? it.title : null, (r20 & 4) != 0 ? it.description : null, (r20 & 8) != 0 ? it.workOrderId : null, (r20 & 16) != 0 ? it.issueTypeId : null, (r20 & 32) != 0 ? it.repairTypeId : null, (r20 & 64) != 0 ? it.kind : null, (r20 & 128) != 0 ? it.status : QCStatus.FAILED, (r20 & 256) != 0 ? it.assetId : null);
                arrayList2.add(copy);
            }
            spreadBuilder.addSpread(arrayList2.toArray(new QCInspection[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new QCInspection[spreadBuilder.size()]));
            return TuplesKt.m28425to(listOf, component3);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012Ç\u0001\u0010\u0002\u001aÂ\u0001\u0012@\u0012>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004 \u0007*`\u0012@\u0012>\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0007*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/QCInspection;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/QCAutoCheck;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NC$d */
    /* loaded from: classes4.dex */
    public static final class C5500d extends Lambda implements Function1<Pair<? extends Pair<? extends List<? extends QCInspection>, ? extends WireBird>, ? extends List<? extends QCAutoCheck>>, Unit> {
        public C5500d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends List<? extends QCInspection>, ? extends WireBird>, ? extends List<? extends QCAutoCheck>> pair) {
            invoke2((Pair<? extends Pair<? extends List<QCInspection>, WireBird>, ? extends List<QCAutoCheck>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Pair<? extends List<QCInspection>, WireBird>, ? extends List<QCAutoCheck>> pair) {
            Pair<? extends List<QCInspection>, WireBird> component1 = pair.component1();
            List<QCAutoCheck> qcAutoChecks = pair.component2();
            WireBird bird = component1.component2();
            InterfaceC40099e13 m94221u = AbstractC5496NC.this.m94221u();
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            Intrinsics.checkNotNullExpressionValue(qcAutoChecks, "qcAutoChecks");
            m94221u.mo36927v4(bird, component1.component1(), qcAutoChecks);
            AbstractC5496NC.this.m94221u().close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$10\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n9#2,4:139\n1#3:143\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$10\n*L\n106#1:139,4\n*E\n"})
    /* renamed from: NC$e */
    /* loaded from: classes4.dex */
    public static final class C5501e extends Lambda implements Function1<Throwable, Unit> {
        public C5501e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Unit unit = null;
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                AbstractC5496NC.this.f24256g.error(httpException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                AbstractC5496NC.this.f24256g.errorGeneric();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$f */
    /* loaded from: classes4.dex */
    public static final class C5502f extends Lambda implements Function1<Optional<WorkOrder>, WorkOrder> {

        /* renamed from: g */
        public static final C5502f f24265g = new C5502f();

        public C5502f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WorkOrder invoke(Optional<WorkOrder> workOrderOptional) {
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            return workOrderOptional.m59038b();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NC$g */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5503g extends FunctionReferenceImpl implements Function1<WorkOrder, Unit> {
        public C5503g(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m94212a(WorkOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WorkOrder workOrder) {
            m94212a(workOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$h */
    /* loaded from: classes4.dex */
    public static final class C5504h extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {
        public C5504h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            return C38096ag5.m70883l(AbstractC5496NC.this.m94216z().mo19633t(workOrder.getId(), WorkOrderStatus.QUALITY_CONTROL, WorkOrderStatusReason.QUALITY_CONTROL));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "", "Lco/bird/android/model/constant/QCKind;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$i */
    /* loaded from: classes4.dex */
    public static final class C5505i extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends Map<QCKind, ? extends List<? extends QCInspection>>>> {

        /* renamed from: h */
        public final /* synthetic */ String f24268h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5505i(String str) {
            super(1);
            this.f24268h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Map<QCKind, List<QCInspection>>> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            return C38096ag5.m70883l(AbstractC5496NC.this.m94216z().mo19647f(workOrder.getId(), this.f24268h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/constant/QCKind;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "inspectionMap", "", C17296a.f69688o, "(Ljava/util/Map;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,138:1\n1603#2,9:139\n1855#2:148\n1856#2:150\n1612#2:151\n1#3:149\n237#4:152\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$5\n*L\n79#1:139,9\n79#1:148\n79#1:150\n79#1:151\n79#1:149\n81#1:152\n*E\n"})
    /* renamed from: NC$j */
    /* loaded from: classes4.dex */
    public static final class C5506j extends Lambda implements Function1<Map<QCKind, ? extends List<? extends QCInspection>>, Unit> {
        public C5506j() {
            super(1);
        }

        /* renamed from: a */
        public final void m94209a(Map<QCKind, ? extends List<QCInspection>> map) {
            List<QCInspection> flatten;
            flatten = CollectionsKt__IterablesKt.flatten(map.values());
            ArrayList arrayList = new ArrayList();
            for (QCInspection qCInspection : flatten) {
                String assetId = qCInspection.getAssetId();
                if (assetId != null) {
                    arrayList.add(assetId);
                }
            }
            Object m33041n = InterfaceC48923su2.C28429a.loadAssets$default(AbstractC5496NC.this.m94222t(), arrayList, AssetManagerType.REPAIR, TaskPriority.URGENT, null, 8, null).m33041n(AutoDispose.m45239a(AbstractC5496NC.this.m94217y()));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<QCKind, ? extends List<? extends QCInspection>> map) {
            m94209a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/constant/QCKind;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "inspectionMap", "", C17296a.f69688o, "(Ljava/util/Map;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$k */
    /* loaded from: classes4.dex */
    public static final class C5507k extends Lambda implements Function1<Map<QCKind, ? extends List<? extends QCInspection>>, Unit> {
        public C5507k() {
            super(1);
        }

        /* renamed from: a */
        public final void m94208a(Map<QCKind, ? extends List<QCInspection>> map) {
            List<QCInspection> flatten;
            C24552a<List<QCInspection>> m94219w = AbstractC5496NC.this.m94219w();
            flatten = CollectionsKt__IterablesKt.flatten(map.values());
            m94219w.onNext(flatten);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<QCKind, ? extends List<? extends QCInspection>> map) {
            m94208a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBaseQualityControlPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$7\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n9#2,4:139\n1#3:143\n*S KotlinDebug\n*F\n+ 1 BaseQualityControlPresenter.kt\nco/bird/android/qualitycontrol/base/BaseQualityControlPresenter$onCreate$7\n*L\n89#1:139,4\n*E\n"})
    /* renamed from: NC$l */
    /* loaded from: classes4.dex */
    public static final class C5508l extends Lambda implements Function1<Throwable, Unit> {
        public C5508l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            Unit unit = null;
            if ((e instanceof HttpException ? e : null) != null) {
                InterfaceC5925OC interfaceC5925OC = AbstractC5496NC.this.f24256g;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                interfaceC5925OC.error(e);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                AbstractC5496NC.this.f24256g.error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/u;", "", "Lco/bird/android/model/QCAutoCheck;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NC$m */
    /* loaded from: classes4.dex */
    public static final class C5509m extends Lambda implements Function1<WorkOrder, InterfaceC24574u<? extends List<? extends QCAutoCheck>>> {
        public C5509m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends List<QCAutoCheck>> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            if (AbstractC5496NC.this.m94218x().m82623f8().getValue().getServiceCenterConfig().getQualityControl().getProgrammaticQCEnabled()) {
                return AbstractC5496NC.this.f24256g.mo90598Ug(workOrder).m33125j0();
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NC$n */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5510n extends FunctionReferenceImpl implements Function1<List<? extends QCAutoCheck>, Unit> {
        public C5510n(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends QCAutoCheck> list) {
            invoke2((List<QCAutoCheck>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCAutoCheck> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    public AbstractC5496NC(InterfaceC37857aG6 workOrderManager, InterfaceC48923su2 localAssetManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC31626Ab4 qcAnalyticsManager, InterfaceC5925OC ui) {
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(qcAnalyticsManager, "qcAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f24250a = workOrderManager;
        this.f24251b = localAssetManager;
        this.f24252c = navigator;
        this.f24253d = scopeProvider;
        this.f24254e = reactiveConfig;
        this.f24255f = qcAnalyticsManager;
        this.f24256g = ui;
        C24552a<WorkOrder> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WorkOrder>()");
        this.f24257h = m31922e;
        C24552a<List<QCInspection>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<List<QCInspection>>()");
        this.f24258i = m31922e2;
        C24552a<List<QCAutoCheck>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<List<QCAutoCheck>>()");
        this.f24259j = m31922e3;
        C24552a<WireBird> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<WireBird>()");
        this.f24260k = m31922e4;
    }

    /* renamed from: C */
    public static final WorkOrder m94248C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WorkOrder) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m94247D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC23447K m94246E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23447K m94245F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m94244G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m94243H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m94242I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC24574u m94241J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m94240K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m94239L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final QCInspection m94225p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (QCInspection) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final Pair m94224q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m94223r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final C24552a<WorkOrder> m94250A() {
        return this.f24257h;
    }

    /* renamed from: B */
    public final void m94249B(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        int i = C5497a.$EnumSwitchMapping$0[this.f24254e.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getInspectionFlow().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f24252c.mo37197B0(bird, workOrder, true);
                return;
            }
            return;
        }
        InterfaceC40099e13.C19924a.goToLegacyWorkOrderInspection$default(this.f24252c, bird, workOrder, true, false, 8, null);
    }

    @Override // p000.InterfaceC35838Sb4
    /* renamed from: a */
    public void mo7892a(WireBird bird, WorkOrder workOrder) {
        AbstractC23442F m33158H;
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f24260k.onNext(bird);
        String model = bird.getModel();
        if (model == null) {
            return;
        }
        if (workOrder == null) {
            AbstractC23442F<Optional<WorkOrder>> mo19645h = this.f24250a.mo19645h(bird.getId());
            final C5502f c5502f = C5502f.f24265g;
            m33158H = mo19645h.m33157I(new InterfaceC23492o() { // from class: GC
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WorkOrder m94248C;
                    m94248C = AbstractC5496NC.m94248C(Function1.this, obj);
                    return m94248C;
                }
            });
        } else {
            m33158H = AbstractC23442F.m33158H(workOrder);
        }
        Intrinsics.checkNotNullExpressionValue(m33158H, "if (workOrder == null) {…gle.just(workOrder)\n    }");
        AbstractC23442F progress$default = C28237sD.progress$default(m33158H, this.f24256g, 0, 2, (Object) null);
        final C5503g c5503g = new C5503g(this.f24257h);
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: HC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94247D(Function1.this, obj);
            }
        });
        final C5504h c5504h = new C5504h();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: IC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94246E;
                m94246E = AbstractC5496NC.m94246E(Function1.this, obj);
                return m94246E;
            }
        });
        final C5505i c5505i = new C5505i(model);
        AbstractC23442F m33152N = m33165A.m33165A(new InterfaceC23492o() { // from class: JC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m94245F;
                m94245F = AbstractC5496NC.m94245F(Function1.this, obj);
                return m94245F;
            }
        }).m33152N(C23454a.m33087a());
        final C5506j c5506j = new C5506j();
        AbstractC23442F m33101w2 = m33152N.m33101w(new InterfaceC23484g() { // from class: KC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94244G(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w2, "override fun onCreate(bi…rrorGeneric()\n      }\n  }");
        Object m33135e = m33101w2.m33135e(AutoDispose.m45239a(this.f24253d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5507k c5507k = new C5507k();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: LC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94243H(Function1.this, obj);
            }
        };
        final C5508l c5508l = new C5508l();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: MC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94242I(Function1.this, obj);
            }
        });
        this.f24255f.mo113828b(bird, mo7891s());
        AbstractC23442F<WorkOrder> firstOrError = this.f24257h.firstOrError();
        final C5509m c5509m = new C5509m();
        AbstractC24507p<R> m33163C = firstOrError.m33163C(new InterfaceC23492o() { // from class: BC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m94241J;
                m94241J = AbstractC5496NC.m94241J(Function1.this, obj);
                return m94241J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun onCreate(bi…rrorGeneric()\n      }\n  }");
        Object m32048b = m33163C.m32048b(AutoDispose.m45239a(this.f24253d));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5510n c5510n = new C5510n(this.f24259j);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: CC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94240K(Function1.this, obj);
            }
        };
        final C5501e c5501e = new C5501e();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: DC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94239L(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC35838Sb4
    /* renamed from: b */
    public void mo85206b(List<IssueType> issueTypes) {
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Observable fromIterable = Observable.fromIterable(issueTypes);
        Intrinsics.checkNotNullExpressionValue(fromIterable, "fromIterable(issueTypes)");
        Observable m31950a = C24527f.m31950a(fromIterable, this.f24257h);
        final C5498b c5498b = C5498b.f24261g;
        Observable m33123k0 = m31950a.map(new InterfaceC23492o() { // from class: AC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                QCInspection m94225p;
                m94225p = AbstractC5496NC.m94225p(Function1.this, obj);
                return m94225p;
            }
        }).toList().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "fromIterable(issueTypes)…t()\n      .toObservable()");
        Observable m31949b = C24527f.m31949b(m33123k0, this.f24258i, this.f24260k);
        final C5499c c5499c = C5499c.f24262g;
        Observable map = m31949b.map(new InterfaceC23492o() { // from class: EC
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m94224q;
                m94224q = AbstractC5496NC.m94224q(Function1.this, obj);
                return m94224q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fromIterable(issueTypes)…dArray()) to bird\n      }");
        Observable observeOn = C24527f.m31950a(map, this.f24259j).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fromIterable(issueTypes)…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f24253d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5500d c5500d = new C5500d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: FC
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5496NC.m94223r(Function1.this, obj);
            }
        });
    }

    /* renamed from: s */
    public abstract QualityControlFlow mo7891s();

    /* renamed from: t */
    public final InterfaceC48923su2 m94222t() {
        return this.f24251b;
    }

    /* renamed from: u */
    public final InterfaceC40099e13 m94221u() {
        return this.f24252c;
    }

    /* renamed from: v */
    public final C24552a<List<QCAutoCheck>> m94220v() {
        return this.f24259j;
    }

    /* renamed from: w */
    public final C24552a<List<QCInspection>> m94219w() {
        return this.f24258i;
    }

    /* renamed from: x */
    public final C36207Tq4 m94218x() {
        return this.f24254e;
    }

    /* renamed from: y */
    public final ScopeProvider m94217y() {
        return this.f24253d;
    }

    /* renamed from: z */
    public final InterfaceC37857aG6 m94216z() {
        return this.f24250a;
    }
}
