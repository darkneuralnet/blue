package p000;

import android.content.Intent;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.extension.IssueType_Kt;
import co.bird.android.model.extension.Issue_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRoute;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
import p000.InterfaceC37857aG6;
import p000.YE6;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002BI\b\u0007\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\tH\u0002J!\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007*\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0002J\"\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\rH\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R.\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b .*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R:\u00109\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r .*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006D"}, m28432d2 = {"LYE6;", "LFE;", "LyE6;", "", "error", "", "l0", "", "Lco/bird/android/model/Issue;", "", "existingIssues", "Lco/bird/android/model/IssueType;", "O", "", "originalIssue", "Lco/bird/android/model/IssueStatus;", "m0", "(Ljava/lang/Boolean;Lco/bird/android/model/Issue;)Lco/bird/android/model/IssueStatus;", "issue", "n0", "Q", "", "R", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "returnAddedIssues", "c", "LaG6;", "g", "LaG6;", "workOrderManager", "Ltc5;", "h", "Ltc5;", "routingManager", "LkF6;", "i", "LkF6;", "ui", "LgE6;", "j", "LgE6;", "converter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/a;", "issuesSubject", "", "l", "Ljava/util/Map;", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "m", "Lio/reactivex/subjects/d;", "issuesCheckSubject", "Llh6;", "userManager", "LEa;", "analyticsManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Llh6;LEa;Le13;LaG6;Ltc5;LkF6;Lcom/uber/autodispose/ScopeProvider;LgE6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,384:1\n180#2:385\n180#2:386\n180#2:387\n199#2:389\n180#2:390\n180#2:391\n1#3:388\n766#4:392\n857#4,2:393\n1549#4:395\n1620#4,3:396\n1360#4:399\n1446#4,5:400\n766#4:405\n857#4,2:406\n1549#4:408\n1620#4,3:409\n350#4,7:414\n1360#4:421\n1446#4,2:422\n1448#4,3:426\n1360#4:429\n1446#4,2:430\n1549#4:432\n1620#4,3:433\n1448#4,3:438\n2624#4,3:441\n37#5,2:412\n37#5,2:424\n37#5,2:436\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl\n*L\n67#1:385\n111#1:386\n125#1:387\n196#1:389\n203#1:390\n310#1:391\n339#1:392\n339#1:393,2\n340#1:395\n340#1:396,3\n343#1:399\n343#1:400,5\n344#1:405\n344#1:406,2\n345#1:408\n345#1:409,3\n366#1:414,7\n377#1:421\n377#1:422,2\n377#1:426,3\n381#1:429\n381#1:430,2\n381#1:432\n381#1:433,3\n381#1:438,3\n334#1:441,3\n347#1:412,2\n377#1:424,2\n381#1:436,2\n*E\n"})
/* renamed from: YE6 */
/* loaded from: classes3.dex */
public final class YE6 extends AbstractC2207FE implements InterfaceC52086yE6 {

    /* renamed from: g */
    public final InterfaceC37857aG6 f44859g;

    /* renamed from: h */
    public final InterfaceC49339tc5 f44860h;

    /* renamed from: i */
    public final InterfaceC43795kF6 f44861i;

    /* renamed from: j */
    public final InterfaceC41414gE6 f44862j;

    /* renamed from: k */
    public final C24552a<List<Issue>> f44863k;

    /* renamed from: l */
    public final Map<String, Issue> f44864l;

    /* renamed from: m */
    public final C24558d<Pair<Issue, Boolean>> f44865m;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "issues", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$a */
    /* loaded from: classes3.dex */
    public static final class C9714a extends Lambda implements Function1<List<? extends Issue>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C9714a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<Issue> issues) {
            Intrinsics.checkNotNullParameter(issues, "issues");
            return YE6.this.f44862j.mo30962a(issues, YE6.this.f44864l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9715b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C9715b(Object obj) {
            super(1, obj, InterfaceC43795kF6.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC43795kF6) this.receiver).mo27622b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9716c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9716c(Object obj) {
            super(1, obj, YE6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((YE6) this.receiver).m75350l0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012J\u0010\u0004\u001aF\u0012(\u0012&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006 \u0003*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n223#2,2:385\n1726#2,3:387\n1549#2:390\n1620#2,3:391\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$4\n*L\n83#1:385,2\n90#1:387,3\n104#1:390\n104#1:391,3\n*E\n"})
    /* renamed from: YE6$d */
    /* loaded from: classes3.dex */
    public static final class C9717d extends Lambda implements Function1<Pair<? extends Pair<? extends Issue, ? extends Boolean>, ? extends List<? extends Issue>>, List<? extends Issue>> {
        public C9717d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Issue> invoke(Pair<? extends Pair<? extends Issue, ? extends Boolean>, ? extends List<? extends Issue>> pair) {
            return invoke2((Pair<Pair<Issue, Boolean>, ? extends List<Issue>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<Issue> invoke2(Pair<Pair<Issue, Boolean>, ? extends List<Issue>> pair) {
            int collectionSizeOrDefault;
            Issue copy;
            Issue copy2;
            Issue copy3;
            Issue copy4;
            Issue copy5;
            Issue copy6;
            Issue copy7;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<Issue, Boolean> component1 = pair.component1();
            List<Issue> issues = pair.component2();
            Issue component12 = component1.component1();
            Boolean component2 = component1.component2();
            IssueStatus m75348m0 = YE6.this.m75348m0(component2, (Issue) YE6.this.f44864l.get(component12.getIssueTypeId()));
            if (component12.getParentId() != null) {
                Intrinsics.checkNotNullExpressionValue(issues, "issues");
                for (Issue issue : issues) {
                    if (Intrinsics.areEqual(issue.getIssueTypeId(), component12.getParentId())) {
                        YE6 ye6 = YE6.this;
                        List<Issue> subtypes = issue.getSubtypes();
                        copy4 = component12.copy((r37 & 1) != 0 ? component12.f66598id : null, (r37 & 2) != 0 ? component12.workOrderId : null, (r37 & 4) != 0 ? component12.issueTypeId : null, (r37 & 8) != 0 ? component12.display : null, (r37 & 16) != 0 ? component12.description : null, (r37 & 32) != 0 ? component12.status : m75348m0, (r37 & 64) != 0 ? component12.statusDisplay : null, (r37 & 128) != 0 ? component12.statusColor : null, (r37 & 256) != 0 ? component12.statusReasonDisplay : null, (r37 & 512) != 0 ? component12.source : null, (r37 & 1024) != 0 ? component12.sourceDisplay : null, (r37 & 2048) != 0 ? component12.createdBy : null, (r37 & 4096) != 0 ? component12.createdAt : null, (r37 & 8192) != 0 ? component12.updatedAt : null, (r37 & 16384) != 0 ? component12.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? component12.assetId : null, (r37 & 65536) != 0 ? component12.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? component12.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? component12.statusReason : null);
                        copy5 = issue.copy((r37 & 1) != 0 ? issue.f66598id : null, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : null, (r37 & 64) != 0 ? issue.statusDisplay : null, (r37 & 128) != 0 ? issue.statusColor : null, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : null, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : ye6.m75346n0(subtypes, copy4), (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : null);
                        List<Issue> subtypes2 = copy5.getSubtypes();
                        boolean z = true;
                        if (!(subtypes2 instanceof Collection) || !subtypes2.isEmpty()) {
                            Iterator<T> it = subtypes2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                IssueStatus status = ((Issue) it.next()).getStatus();
                                if (!(!((status == null || IssueStatus_Kt.isPassedStatus(status)) ? false : true))) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        if (z) {
                            YE6 ye62 = YE6.this;
                            copy7 = copy5.copy((r37 & 1) != 0 ? copy5.f66598id : null, (r37 & 2) != 0 ? copy5.workOrderId : null, (r37 & 4) != 0 ? copy5.issueTypeId : null, (r37 & 8) != 0 ? copy5.display : null, (r37 & 16) != 0 ? copy5.description : null, (r37 & 32) != 0 ? copy5.status : ye62.m75348m0(Boolean.FALSE, issue), (r37 & 64) != 0 ? copy5.statusDisplay : null, (r37 & 128) != 0 ? copy5.statusColor : null, (r37 & 256) != 0 ? copy5.statusReasonDisplay : null, (r37 & 512) != 0 ? copy5.source : null, (r37 & 1024) != 0 ? copy5.sourceDisplay : null, (r37 & 2048) != 0 ? copy5.createdBy : null, (r37 & 4096) != 0 ? copy5.createdAt : null, (r37 & 8192) != 0 ? copy5.updatedAt : null, (r37 & 16384) != 0 ? copy5.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? copy5.assetId : null, (r37 & 65536) != 0 ? copy5.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? copy5.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? copy5.statusReason : null);
                            return ye62.m75346n0(issues, copy7);
                        } else if (IssueStatus_Kt.isFailedStatus(m75348m0) && YE6.this.f44864l.get(issue.getIssueTypeId()) == null) {
                            YE6 ye63 = YE6.this;
                            copy6 = copy5.copy((r37 & 1) != 0 ? copy5.f66598id : null, (r37 & 2) != 0 ? copy5.workOrderId : null, (r37 & 4) != 0 ? copy5.issueTypeId : null, (r37 & 8) != 0 ? copy5.display : null, (r37 & 16) != 0 ? copy5.description : null, (r37 & 32) != 0 ? copy5.status : null, (r37 & 64) != 0 ? copy5.statusDisplay : null, (r37 & 128) != 0 ? copy5.statusColor : null, (r37 & 256) != 0 ? copy5.statusReasonDisplay : null, (r37 & 512) != 0 ? copy5.source : null, (r37 & 1024) != 0 ? copy5.sourceDisplay : null, (r37 & 2048) != 0 ? copy5.createdBy : null, (r37 & 4096) != 0 ? copy5.createdAt : null, (r37 & 8192) != 0 ? copy5.updatedAt : null, (r37 & 16384) != 0 ? copy5.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? copy5.assetId : null, (r37 & 65536) != 0 ? copy5.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? copy5.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? copy5.statusReason : null);
                            return ye63.m75346n0(issues, copy6);
                        } else {
                            return YE6.this.m75346n0(issues, copy5);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            } else if (m75348m0 != null && !IssueStatus_Kt.isPassedStatus(m75348m0)) {
                YE6 ye64 = YE6.this;
                Intrinsics.checkNotNullExpressionValue(issues, "issues");
                copy3 = component12.copy((r37 & 1) != 0 ? component12.f66598id : null, (r37 & 2) != 0 ? component12.workOrderId : null, (r37 & 4) != 0 ? component12.issueTypeId : null, (r37 & 8) != 0 ? component12.display : null, (r37 & 16) != 0 ? component12.description : null, (r37 & 32) != 0 ? component12.status : m75348m0, (r37 & 64) != 0 ? component12.statusDisplay : null, (r37 & 128) != 0 ? component12.statusColor : null, (r37 & 256) != 0 ? component12.statusReasonDisplay : null, (r37 & 512) != 0 ? component12.source : null, (r37 & 1024) != 0 ? component12.sourceDisplay : null, (r37 & 2048) != 0 ? component12.createdBy : null, (r37 & 4096) != 0 ? component12.createdAt : null, (r37 & 8192) != 0 ? component12.updatedAt : null, (r37 & 16384) != 0 ? component12.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? component12.assetId : null, (r37 & 65536) != 0 ? component12.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? component12.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? component12.statusReason : null);
                return ye64.m75346n0(issues, copy3);
            } else {
                List<Issue> subtypes3 = component12.getSubtypes();
                YE6 ye65 = YE6.this;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes3, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Issue issue2 : subtypes3) {
                    copy2 = issue2.copy((r37 & 1) != 0 ? issue2.f66598id : null, (r37 & 2) != 0 ? issue2.workOrderId : null, (r37 & 4) != 0 ? issue2.issueTypeId : null, (r37 & 8) != 0 ? issue2.display : null, (r37 & 16) != 0 ? issue2.description : null, (r37 & 32) != 0 ? issue2.status : ye65.m75348m0(component2, issue2), (r37 & 64) != 0 ? issue2.statusDisplay : null, (r37 & 128) != 0 ? issue2.statusColor : null, (r37 & 256) != 0 ? issue2.statusReasonDisplay : null, (r37 & 512) != 0 ? issue2.source : null, (r37 & 1024) != 0 ? issue2.sourceDisplay : null, (r37 & 2048) != 0 ? issue2.createdBy : null, (r37 & 4096) != 0 ? issue2.createdAt : null, (r37 & 8192) != 0 ? issue2.updatedAt : null, (r37 & 16384) != 0 ? issue2.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue2.assetId : null, (r37 & 65536) != 0 ? issue2.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue2.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue2.statusReason : null);
                    arrayList.add(copy2);
                }
                YE6 ye66 = YE6.this;
                Intrinsics.checkNotNullExpressionValue(issues, "issues");
                copy = component12.copy((r37 & 1) != 0 ? component12.f66598id : null, (r37 & 2) != 0 ? component12.workOrderId : null, (r37 & 4) != 0 ? component12.issueTypeId : null, (r37 & 8) != 0 ? component12.display : null, (r37 & 16) != 0 ? component12.description : null, (r37 & 32) != 0 ? component12.status : m75348m0, (r37 & 64) != 0 ? component12.statusDisplay : null, (r37 & 128) != 0 ? component12.statusColor : null, (r37 & 256) != 0 ? component12.statusReasonDisplay : null, (r37 & 512) != 0 ? component12.source : null, (r37 & 1024) != 0 ? component12.sourceDisplay : null, (r37 & 2048) != 0 ? component12.createdBy : null, (r37 & 4096) != 0 ? component12.createdAt : null, (r37 & 8192) != 0 ? component12.updatedAt : null, (r37 & 16384) != 0 ? component12.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? component12.assetId : null, (r37 & 65536) != 0 ? component12.subtypes : arrayList, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? component12.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? component12.statusReason : null);
                return ye66.m75346n0(issues, copy);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9718e extends FunctionReferenceImpl implements Function1<List<? extends Issue>, Unit> {
        public C9718e(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Issue> list) {
            invoke2((List<Issue>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Issue> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$f */
    /* loaded from: classes3.dex */
    public static final class C9719f extends Lambda implements Function1<Pair<? extends Issue, ? extends String>, InterfaceC23447K<? extends Pair<? extends Issue, ? extends DialogResponse>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$f$a */
        /* loaded from: classes3.dex */
        public static final class C9720a extends Lambda implements Function1<DialogResponse, Pair<? extends Issue, ? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ Issue f44869g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9720a(Issue issue) {
                super(1);
                this.f44869g = issue;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Issue, DialogResponse> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f44869g, it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: YE6$f$b */
        /* loaded from: classes3.dex */
        public static final class C9721b extends Lambda implements Function1<Pair<? extends Issue, ? extends DialogResponse>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ YE6 f44870g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9721b(YE6 ye6) {
                super(1);
                this.f44870g = ye6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends DialogResponse> pair) {
                invoke2((Pair<Issue, ? extends DialogResponse>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Issue, ? extends DialogResponse> pair) {
                Issue component1 = pair.component1();
                if (pair.component2() != DialogResponse.OK) {
                    this.f44870g.f44865m.onNext(TuplesKt.m28425to(component1, Boolean.FALSE));
                }
            }
        }

        public C9719f() {
            super(1);
        }

        /* renamed from: d */
        public static final void m75329d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<Issue, DialogResponse>> invoke(Pair<Issue, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC23442F<DialogResponse> dialog = YE6.this.f44861i.dialog(new C32645Ek6(pair.component2()), false, false);
            final C9720a c9720a = new C9720a(pair.component1());
            AbstractC23442F<R> m33157I = dialog.m33157I(new InterfaceC23492o() { // from class: ZE6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = YE6.C9719f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C9721b c9721b = new C9721b(YE6.this);
            return m33157I.m33101w(new InterfaceC23484g() { // from class: aF6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    YE6.C9719f.m75329d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "newIssueTypes", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$g */
    /* loaded from: classes3.dex */
    public static final class C9722g extends Lambda implements Function1<List<? extends IssueType>, Unit> {
        public C9722g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IssueType> list) {
            invoke2((List<IssueType>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<IssueType> list) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("issues", new ArrayList<>(list));
            YE6.this.m107430f().mo37029e4(-1, intent);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u000b\u001aÚ\u0001\u0012f\b\u0001\u0012b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\n \u0004*0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007 \u0004*l\u0012f\b\u0001\u0012b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\n \u0004*0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Pair;", "", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n1549#2:385\n1620#2,3:386\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$11\n*L\n219#1:385\n219#1:386,3\n*E\n"})
    /* renamed from: YE6$h */
    /* loaded from: classes3.dex */
    public static final class C9723h extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Issue>>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44873h;

        /* renamed from: i */
        public final /* synthetic */ WorkOrder f44874i;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\b\u001ab\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0007 \u0006*0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$h$a */
        /* loaded from: classes3.dex */
        public static final class C9724a extends Lambda implements Function1<WorkOrder, Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<Issue> f44875g;

            /* renamed from: h */
            public final /* synthetic */ List<String> f44876h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9724a(List<Issue> list, List<String> list2) {
                super(1);
                this.f44875g = list;
                this.f44876h = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<Optional<WorkOrder>, List<Issue>, Integer> invoke(WorkOrder workOrder) {
                Intrinsics.checkNotNullParameter(workOrder, "workOrder");
                return new Triple<>(Optional.f63040c.m59032c(workOrder), this.f44875g, Integer.valueOf(this.f44876h.size()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9723h(WireBird wireBird, WorkOrder workOrder) {
            super(1);
            this.f44873h = wireBird;
            this.f44874i = workOrder;
        }

        /* renamed from: c */
        public static final Triple m75325c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, List<Issue>, Integer>> invoke(Pair<Unit, ? extends List<Issue>> pair) {
            int collectionSizeOrDefault;
            String str;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Issue> issues = pair.component2();
            YE6 ye6 = YE6.this;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            List m75375Q = ye6.m75375Q(issues);
            YE6 ye62 = YE6.this;
            List<IssueType> m75377O = ye62.m75377O(m75375Q, ye62.f44864l.values());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m75377O, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IssueType issueType : m75377O) {
                arrayList.add(issueType.getId());
            }
            if (!arrayList.isEmpty()) {
                InterfaceC37857aG6 interfaceC37857aG6 = YE6.this.f44859g;
                String id = this.f44873h.getId();
                WorkOrder workOrder = this.f44874i;
                if (workOrder != null) {
                    str = workOrder.getId();
                } else {
                    str = null;
                }
                AbstractC23442F progress$default = C28237sD.progress$default(interfaceC37857aG6.mo19632u(id, str, arrayList, ""), YE6.this.f44861i, 0, 2, (Object) null);
                final C9724a c9724a = new C9724a(issues, arrayList);
                return progress$default.m33157I(new InterfaceC23492o() { // from class: bF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Triple m75325c;
                        m75325c = YE6.C9723h.m75325c(Function1.this, obj);
                        return m75325c;
                    }
                });
            }
            return AbstractC23442F.m33158H(new Triple(Optional.f63040c.m59034a(), issues, Integer.valueOf(arrayList.size())));
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u008b\u0002\u0012~\b\u0001\u0012z\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\t0\t \u0005*\u0084\u0001\u0012~\b\u0001\u0012z\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\t0\t\u0018\u00010\b0\b22\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u00060\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lwb4;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n766#2:385\n857#2,2:386\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$12\n*L\n236#1:385\n236#1:386,2\n*E\n"})
    /* renamed from: YE6$i */
    /* loaded from: classes3.dex */
    public static final class C9725i extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>, InterfaceC23447K<? extends C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer, ? extends List<? extends Issue>>>> {

        /* renamed from: h */
        public final /* synthetic */ WorkOrder f44878h;

        @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\t\u001az\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \b*<\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/Issue;", "it", "Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$i$a */
        /* loaded from: classes3.dex */
        public static final class C9726a extends Lambda implements Function1<HM4<List<? extends Issue>>, C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer, ? extends List<? extends Issue>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f44879g;

            /* renamed from: h */
            public final /* synthetic */ List<Issue> f44880h;

            /* renamed from: i */
            public final /* synthetic */ int f44881i;

            /* renamed from: j */
            public final /* synthetic */ List<Issue> f44882j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9726a(Optional<WorkOrder> optional, List<Issue> list, int i, List<Issue> list2) {
                super(1);
                this.f44879g = optional;
                this.f44880h = list;
                this.f44881i = i;
                this.f44882j = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C51106wb4<Optional<WorkOrder>, List<Issue>, Integer, List<Issue>> invoke(HM4<List<Issue>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C51106wb4<>(this.f44879g, this.f44880h, Integer.valueOf(this.f44881i), this.f44882j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9725i(WorkOrder workOrder) {
            super(1);
            this.f44878h = workOrder;
        }

        /* renamed from: c */
        public static final C51106wb4 m75321c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C51106wb4) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
            if (r8 != false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends C51106wb4<Optional<WorkOrder>, List<Issue>, Integer, List<Issue>>> invoke(Triple<Optional<WorkOrder>, ? extends List<Issue>, Integer> triple) {
            String str;
            List emptyList;
            boolean contains;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = triple.component1();
            List<Issue> issues = triple.component2();
            int intValue = triple.component3().intValue();
            YE6 ye6 = YE6.this;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            YE6 ye62 = YE6.this;
            ArrayList arrayList = new ArrayList();
            Iterator it = ye6.m75375Q(issues).iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Issue issue = (Issue) next;
                Issue issue2 = (Issue) ye62.f44864l.get(issue.getIssueTypeId());
                if (issue2 != null && issue2.getStatus() != issue.getStatus()) {
                    contains = CollectionsKt___CollectionsKt.contains(InterfaceC37857aG6.f50208a.m71717a(), issue.getStatus());
                }
                z = false;
                if (z) {
                    arrayList.add(next);
                }
            }
            WorkOrder workOrder = this.f44878h;
            if (workOrder != null) {
                str = workOrder.getId();
            } else {
                str = null;
            }
            if (str != null && (!arrayList.isEmpty())) {
                AbstractC23442F progress$default = C28237sD.progress$default(YE6.this.f44859g.mo19642k(this.f44878h.getId(), arrayList), YE6.this.f44861i, 0, 2, (Object) null);
                final C9726a c9726a = new C9726a(component1, arrayList, intValue, issues);
                return progress$default.m33157I(new InterfaceC23492o() { // from class: cF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        C51106wb4 m75321c;
                        m75321c = YE6.C9725i.m75321c(Function1.this, obj);
                        return m75321c;
                    }
                });
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return AbstractC23442F.m33158H(new C51106wb4(component1, emptyList, Integer.valueOf(intValue), issues));
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t \u0006*P\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\t\u0018\u00010\b0\b2>\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/Issue;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "b", "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$13\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n766#2:385\n857#2,2:386\n1726#2,3:388\n2624#2,3:391\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$13\n*L\n257#1:385\n257#1:386,2\n258#1:388,3\n259#1:391,3\n*E\n"})
    /* renamed from: YE6$j */
    /* loaded from: classes3.dex */
    public static final class C9727j extends Lambda implements Function1<C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer, ? extends List<? extends Issue>>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>>> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrder f44883g;

        /* renamed from: h */
        public final /* synthetic */ YE6 f44884h;

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001aF\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/Issue;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$j$a */
        /* loaded from: classes3.dex */
        public static final class C9728a extends Lambda implements Function1<WorkOrder, Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<Issue> f44885g;

            /* renamed from: h */
            public final /* synthetic */ int f44886h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9728a(List<Issue> list, int i) {
                super(1);
                this.f44885g = list;
                this.f44886h = i;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<Optional<WorkOrder>, List<Issue>, Integer> invoke(WorkOrder workOrder) {
                Intrinsics.checkNotNullParameter(workOrder, "workOrder");
                return new Triple<>(Optional.f63040c.m59032c(workOrder), this.f44885g, Integer.valueOf(this.f44886h));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9727j(WorkOrder workOrder, YE6 ye6) {
            super(1);
            this.f44883g = workOrder;
            this.f44884h = ye6;
        }

        /* renamed from: c */
        public static final Triple m75317c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, List<Issue>, Integer>> invoke(C51106wb4<Optional<WorkOrder>, ? extends List<Issue>, Integer, ? extends List<Issue>> c51106wb4) {
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Optional<WorkOrder> m6614a = c51106wb4.m6614a();
            List<Issue> m6613b = c51106wb4.m6613b();
            int intValue = c51106wb4.m6612c().intValue();
            List<Issue> issues = c51106wb4.m6611d();
            WorkOrder workOrder = this.f44883g;
            if (workOrder == null || (str = workOrder.getId()) == null) {
                WorkOrder m59035e = m6614a.m59035e();
                if (m59035e != null) {
                    str = m59035e.getId();
                } else {
                    str = null;
                }
            }
            String str2 = str;
            YE6 ye6 = this.f44884h;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            YE6 ye62 = this.f44884h;
            ArrayList<Issue> arrayList = new ArrayList();
            Iterator it = ye6.m75375Q(issues).iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (ye62.f44864l.get(((Issue) next).getIssueTypeId()) != null) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                for (Issue issue : arrayList) {
                    if (issue.getStatus() == IssueStatus.DISPUTED) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                List<Issue> m75375Q = this.f44884h.m75375Q(issues);
                YE6 ye63 = this.f44884h;
                if (!(m75375Q instanceof Collection) || !m75375Q.isEmpty()) {
                    for (Issue issue2 : m75375Q) {
                        if (issue2.getStatus() == IssueStatus.OPEN && !ye63.f44864l.keySet().contains(issue2.getIssueTypeId())) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (z5) {
                    z = true;
                }
            }
            if (str2 != null && z) {
                AbstractC23442F m70883l = C38096ag5.m70883l(InterfaceC37857aG6.C10609b.updateWorkOrderStatus$default(this.f44884h.f44859g, str2, WorkOrderStatus.QUALITY_CONTROL, null, 4, null));
                final C9728a c9728a = new C9728a(m6613b, intValue);
                return m70883l.m33157I(new InterfaceC23492o() { // from class: dF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Triple m75317c;
                        m75317c = YE6.C9727j.m75317c(Function1.this, obj);
                        return m75317c;
                    }
                });
            }
            return AbstractC23442F.m33158H(new Triple(m6614a, m6613b, Integer.valueOf(intValue)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \b*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000 \b*P\u0012J\b\u0001\u0012F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \b*\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00070\u00072$\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/Issue;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n766#2:385\n857#2,2:386\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$14\n*L\n272#1:385\n272#1:386,2\n*E\n"})
    /* renamed from: YE6$k */
    /* loaded from: classes3.dex */
    public static final class C9729k extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>, InterfaceC23447K<? extends Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>>> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrder f44887g;

        /* renamed from: h */
        public final /* synthetic */ YE6 f44888h;

        /* renamed from: i */
        public final /* synthetic */ WireBird f44889i;

        /* renamed from: j */
        public final /* synthetic */ DateTime f44890j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9729k(WorkOrder workOrder, YE6 ye6, WireBird wireBird, DateTime dateTime) {
            super(1);
            this.f44887g = workOrder;
            this.f44888h = ye6;
            this.f44889i = wireBird;
            this.f44890j = dateTime;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Triple<Optional<WorkOrder>, List<Issue>, Integer>> invoke(Triple<Optional<WorkOrder>, ? extends List<Issue>, Integer> triple) {
            String str;
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = triple.component1();
            List<Issue> component2 = triple.component2();
            int intValue = triple.component3().intValue();
            WorkOrder workOrder = this.f44887g;
            if (workOrder == null || (str = workOrder.getId()) == null) {
                WorkOrder m59035e = component1.m59035e();
                if (m59035e != null) {
                    str = m59035e.getId();
                } else {
                    str = null;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : component2) {
                if (((Issue) obj).getStatus() == IssueStatus.DISPUTED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            this.f44888h.m107427i(this.f44889i, str, intValue, arrayList);
            if (str != null) {
                InterfaceC37857aG6 interfaceC37857aG6 = this.f44888h.f44859g;
                DateTime inspectionStartTime = this.f44890j;
                Intrinsics.checkNotNullExpressionValue(inspectionStartTime, "inspectionStartTime");
                return interfaceC37857aG6.mo19644i(inspectionStartTime, str).m33042m(AbstractC23442F.m33158H(new Triple(component1, component2, Integer.valueOf(intValue))));
            }
            return AbstractC23442F.m33158H(new Triple(component1, component2, Integer.valueOf(intValue)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \b*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u00072$\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "", "Lco/bird/android/model/Issue;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$l */
    /* loaded from: classes3.dex */
    public static final class C9730l extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends Integer>, InterfaceC23447K<? extends Optional<WorkOrder>>> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrder f44891g;

        /* renamed from: h */
        public final /* synthetic */ YE6 f44892h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$l$a */
        /* loaded from: classes3.dex */
        public static final class C9731a extends Lambda implements Function1<List<? extends Issue>, Optional<WorkOrder>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f44893g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9731a(Optional<WorkOrder> optional) {
                super(1);
                this.f44893g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WorkOrder> invoke(List<Issue> issues) {
                WorkOrder workOrder;
                Intrinsics.checkNotNullParameter(issues, "issues");
                Optional.C14443a c14443a = Optional.f63040c;
                WorkOrder m59035e = this.f44893g.m59035e();
                if (m59035e != null) {
                    workOrder = m59035e.copy((r32 & 1) != 0 ? m59035e.f66636id : null, (r32 & 2) != 0 ? m59035e.birdId : null, (r32 & 4) != 0 ? m59035e.createdBy : null, (r32 & 8) != 0 ? m59035e.createdAt : null, (r32 & 16) != 0 ? m59035e.source : null, (r32 & 32) != 0 ? m59035e.sourceDisplay : null, (r32 & 64) != 0 ? m59035e.status : null, (r32 & 128) != 0 ? m59035e.statusDisplay : null, (r32 & 256) != 0 ? m59035e.statusReason : null, (r32 & 512) != 0 ? m59035e.notes : null, (r32 & 1024) != 0 ? m59035e.updatedAt : null, (r32 & 2048) != 0 ? m59035e.deletedAt : null, (r32 & 4096) != 0 ? m59035e.user : null, (r32 & 8192) != 0 ? m59035e.issues : issues, (r32 & 16384) != 0 ? m59035e.repairs : null);
                } else {
                    workOrder = null;
                }
                return c14443a.m59033b(workOrder);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9730l(WorkOrder workOrder, YE6 ye6) {
            super(1);
            this.f44891g = workOrder;
            this.f44892h = ye6;
        }

        /* renamed from: c */
        public static final Optional m75312c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Optional<WorkOrder>> invoke(Triple<Optional<WorkOrder>, ? extends List<Issue>, Integer> triple) {
            String str;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = triple.component1();
            WorkOrder workOrder = this.f44891g;
            if (workOrder == null || (str = workOrder.getId()) == null) {
                WorkOrder m59035e = component1.m59035e();
                if (m59035e != null) {
                    str = m59035e.getId();
                } else {
                    str = null;
                }
            }
            if (str != null) {
                YE6 ye6 = this.f44892h;
                AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(ye6.f44859g.mo19648e(str), ye6.f44861i, 0, 2, (Object) null));
                if (m70883l != null) {
                    final C9731a c9731a = new C9731a(component1);
                    AbstractC23442F m33157I = m70883l.m33157I(new InterfaceC23492o() { // from class: eF6
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Optional m75312c;
                            m75312c = YE6.C9730l.m75312c(Function1.this, obj);
                            return m75312c;
                        }
                    });
                    if (m33157I != null) {
                        return m33157I;
                    }
                }
            }
            return AbstractC23442F.m33158H(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001az\u00126\b\u0001\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004 \u0006*<\u00126\b\u0001\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "optional", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$m */
    /* loaded from: classes3.dex */
    public static final class C9732m extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23447K<? extends Pair<? extends Optional<WorkOrder>, ? extends ServiceCenterRoute>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44895h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireRoute;", "route", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRoute;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$m$a */
        /* loaded from: classes3.dex */
        public static final class C9733a extends Lambda implements Function1<WireRoute, Pair<? extends Optional<WorkOrder>, ? extends ServiceCenterRoute>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f44896g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9733a(Optional<WorkOrder> optional) {
                super(1);
                this.f44896g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Optional<WorkOrder>, ServiceCenterRoute> invoke(WireRoute route) {
                Intrinsics.checkNotNullParameter(route, "route");
                return TuplesKt.m28425to(this.f44896g, route.getRoute());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9732m(WireBird wireBird) {
            super(1);
            this.f44895h = wireBird;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Optional<WorkOrder>, ServiceCenterRoute>> invoke(Optional<WorkOrder> optional) {
            Intrinsics.checkNotNullParameter(optional, "optional");
            if (!optional.m59037c()) {
                AbstractC23442F m70883l = C38096ag5.m70883l(YE6.this.f44860h.mo9964d(this.f44895h.getId()));
                final C9733a c9733a = new C9733a(optional);
                AbstractC23442F m33157I = m70883l.m33157I(new InterfaceC23492o() { // from class: fF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = YE6.C9732m.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "optional ->\n          if…route.route }\n          }");
                return m33157I;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(optional, ServiceCenterRoute.REPAIR));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n            Single.jus…Route.REPAIR)\n          }");
            return m33158H;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9735o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9735o(Object obj) {
            super(1, obj, YE6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((YE6) this.receiver).m75350l0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$p */
    /* loaded from: classes3.dex */
    public static final class C9736p extends Lambda implements Function1<Unit, Unit> {
        public C9736p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            YE6.this.m107430f().close();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9737q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9737q(Object obj) {
            super(1, obj, YE6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((YE6) this.receiver).m75350l0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "existingIssues", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,384:1\n1360#2:385\n1446#2,2:386\n1549#2:388\n1620#2,3:389\n1448#2,3:394\n37#3,2:392\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$2\n*L\n135#1:385\n135#1:386,2\n138#1:388\n138#1:389,3\n135#1:394,3\n138#1:392,2\n*E\n"})
    /* renamed from: YE6$r */
    /* loaded from: classes3.dex */
    public static final class C9738r extends Lambda implements Function1<List<? extends Issue>, Map<String, ? extends Issue>> {

        /* renamed from: g */
        public static final C9738r f44900g = new C9738r();

        public C9738r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Issue> invoke(List<Issue> existingIssues) {
            Map<String, Issue> map;
            int collectionSizeOrDefault;
            List listOf;
            Intrinsics.checkNotNullParameter(existingIssues, "existingIssues");
            ArrayList arrayList = new ArrayList();
            for (Issue issue : existingIssues) {
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(TuplesKt.m28425to(issue.getIssueTypeId(), issue));
                List<Issue> subtypes = issue.getSubtypes();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (Issue issue2 : subtypes) {
                    arrayList2.add(TuplesKt.m28425to(issue2.getIssueTypeId(), issue2));
                }
                spreadBuilder.addSpread(arrayList2.toArray(new Pair[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
            }
            map = MapsKt__MapsKt.toMap(arrayList);
            return map;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u008f\u0001\u0010\u0002\u001a\u008a\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t \u0006*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007 \u0006*D\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t \u0006*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/Issue;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$s */
    /* loaded from: classes3.dex */
    public static final class C9739s extends Lambda implements Function1<Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>>, Unit> {
        public C9739s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>> pair) {
            invoke2((Pair<? extends List<IssueType>, ? extends Map<String, Issue>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<IssueType>, ? extends Map<String, Issue>> pair) {
            Map<String, Issue> existingIssues = pair.component2();
            Map map = YE6.this.f44864l;
            Intrinsics.checkNotNullExpressionValue(existingIssues, "existingIssues");
            map.putAll(existingIssues);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a¯\u0002\u0012\u008f\u0001\b\u0001\u0012\u008a\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0003*D\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000 \u0003*\u0096\u0001\u0012\u008f\u0001\b\u0001\u0012\u008a\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0003*D\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000\u0018\u00010\b0\b2F\u0010\u0007\u001aB\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006 \u0003*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "", "", "Lco/bird/android/model/Issue;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$t */
    /* loaded from: classes3.dex */
    public static final class C9740t extends Lambda implements Function1<Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>>, InterfaceC23447K<? extends Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "issueTypeId", "Lio/reactivex/K;", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$t$a */
        /* loaded from: classes3.dex */
        public static final class C9741a extends Lambda implements Function1<String, InterfaceC23447K<? extends IssueType>> {

            /* renamed from: g */
            public final /* synthetic */ YE6 f44903g;

            /* renamed from: h */
            public final /* synthetic */ List<IssueType> f44904h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/IssueType;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: YE6$t$a$a */
            /* loaded from: classes3.dex */
            public static final class C9742a extends Lambda implements Function1<IssueType, Unit> {

                /* renamed from: g */
                public final /* synthetic */ List<IssueType> f44905g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C9742a(List<IssueType> list) {
                    super(1);
                    this.f44905g = list;
                }

                /* renamed from: a */
                public final void m75301a(IssueType it) {
                    List<IssueType> list = this.f44905g;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    list.add(it);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IssueType issueType) {
                    m75301a(issueType);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9741a(YE6 ye6, List<IssueType> list) {
                super(1);
                this.f44903g = ye6;
                this.f44904h = list;
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends IssueType> invoke(String issueTypeId) {
                Intrinsics.checkNotNullParameter(issueTypeId, "issueTypeId");
                AbstractC23442F m70883l = C38096ag5.m70883l(this.f44903g.f44859g.mo19654a(issueTypeId));
                final C9742a c9742a = new C9742a(this.f44904h);
                return m70883l.m33101w(new InterfaceC23484g() { // from class: iF6
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        YE6.C9740t.C9741a.invoke$lambda$0(Function1.this, obj);
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001an\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b \u0002*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u0006 \u0002*6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b \u0002*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052(\u0010\u0004\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "", "it", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/Issue;", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: YE6$t$b */
        /* loaded from: classes3.dex */
        public static final class C9743b extends Lambda implements Function1<List<IssueType>, Pair<? extends List<IssueType>, ? extends Map<String, ? extends Issue>>> {

            /* renamed from: g */
            public final /* synthetic */ List<IssueType> f44906g;

            /* renamed from: h */
            public final /* synthetic */ Map<String, Issue> f44907h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9743b(List<IssueType> list, Map<String, Issue> map) {
                super(1);
                this.f44906g = list;
                this.f44907h = map;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<IssueType>, Map<String, Issue>> invoke(List<IssueType> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f44906g, this.f44907h);
            }
        }

        public C9740t() {
            super(1);
        }

        /* renamed from: d */
        public static final Pair m75303d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<List<IssueType>, Map<String, Issue>>> invoke(Pair<? extends List<IssueType>, ? extends Map<String, Issue>> pair) {
            Set minus;
            List mutableList;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueType> issueTypes = pair.component1();
            Map<String, Issue> component2 = pair.component2();
            Set<String> keySet = component2.keySet();
            YE6 ye6 = YE6.this;
            Intrinsics.checkNotNullExpressionValue(issueTypes, "issueTypes");
            minus = SetsKt___SetsKt.minus((Set) keySet, (Iterable) ye6.m75374R(issueTypes));
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) issueTypes);
            if (!minus.isEmpty()) {
                Observable fromIterable = Observable.fromIterable(minus);
                final C9741a c9741a = new C9741a(YE6.this, mutableList);
                AbstractC23442F list = fromIterable.concatMapSingle(new InterfaceC23492o() { // from class: gF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = YE6.C9740t.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                }).toList();
                final C9743b c9743b = new C9743b(mutableList, component2);
                AbstractC23442F m33157I = list.m33157I(new InterfaceC23492o() { // from class: hF6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m75303d;
                        m75303d = YE6.C9740t.m75303d(Function1.this, obj);
                        return m75303d;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33157I, "override fun onCreate(bi…) }, ::onError)\n    }\n  }");
                return m33157I;
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(issueTypes, component2));
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          Single.just(…existingIssues)\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012F\u0010\u0004\u001aB\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nWorkOrderInspectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n1549#2:385\n1620#2,2:386\n1726#2,3:388\n1549#2:391\n1620#2,3:392\n1622#2:395\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionPresenter.kt\nco/bird/android/feature/workorders/inspection/WorkOrderInspectionPresenterImpl$onCreate$5\n*L\n168#1:385\n168#1:386,2\n170#1:388,3\n183#1:391\n183#1:392,3\n168#1:395\n*E\n"})
    /* renamed from: YE6$u */
    /* loaded from: classes3.dex */
    public static final class C9744u extends Lambda implements Function1<Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>>, List<? extends Issue>> {

        /* renamed from: g */
        public final /* synthetic */ WorkOrder f44908g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9744u(WorkOrder workOrder) {
            super(1);
            this.f44908g = workOrder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Issue> invoke(Pair<? extends List<? extends IssueType>, ? extends Map<String, ? extends Issue>> pair) {
            return invoke2((Pair<? extends List<IssueType>, ? extends Map<String, Issue>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<Issue> invoke2(Pair<? extends List<IssueType>, ? extends Map<String, Issue>> pair) {
            int collectionSizeOrDefault;
            boolean z;
            IssueStatus status;
            IssueStatus issueStatus;
            int collectionSizeOrDefault2;
            Issue copy;
            String id;
            Issue copy2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<IssueType> issueTypes = pair.component1();
            Map<String, Issue> component2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(issueTypes, "issueTypes");
            List<IssueType> list = issueTypes;
            WorkOrder workOrder = this.f44908g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (IssueType issueType : list) {
                Issue issue = component2.get(issueType.getId());
                List<IssueType> subtypes = issueType.getSubtypes();
                boolean z2 = true;
                if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                    Iterator<T> it = subtypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Issue issue2 = component2.get(((IssueType) it.next()).getId());
                        if (issue2 == null || (status = issue2.getStatus()) == null) {
                            z = true;
                            continue;
                        } else {
                            z = IssueStatus_Kt.isPassedStatus(status);
                            continue;
                        }
                        if (!z) {
                            z2 = false;
                            break;
                        }
                    }
                }
                IssueStatus issueStatus2 = (workOrder == null || !z2) ? null : IssueStatus.RESOLVED;
                if (issue == null || (issueStatus = issue.getStatus()) == null) {
                    issueStatus = issueStatus2;
                }
                Issue issue$default = IssueType_Kt.toIssue$default(issueType, null, issueStatus, null, null, null, issue != null ? issue.getSource() : null, 29, null);
                List<Issue> subtypes2 = issue$default.getSubtypes();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes2, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (Issue issue3 : subtypes2) {
                    Issue issue4 = component2.get(issue3.getIssueTypeId());
                    if (issue4 == null || (id = issue4.getId()) == null) {
                        id = issue3.getId();
                    }
                    copy2 = issue3.copy((r37 & 1) != 0 ? issue3.f66598id : id, (r37 & 2) != 0 ? issue3.workOrderId : null, (r37 & 4) != 0 ? issue3.issueTypeId : null, (r37 & 8) != 0 ? issue3.display : null, (r37 & 16) != 0 ? issue3.description : null, (r37 & 32) != 0 ? issue3.status : issue4 != null ? issue4.getStatus() : null, (r37 & 64) != 0 ? issue3.statusDisplay : null, (r37 & 128) != 0 ? issue3.statusColor : null, (r37 & 256) != 0 ? issue3.statusReasonDisplay : null, (r37 & 512) != 0 ? issue3.source : issue4 != null ? issue4.getSource() : null, (r37 & 1024) != 0 ? issue3.sourceDisplay : null, (r37 & 2048) != 0 ? issue3.createdBy : null, (r37 & 4096) != 0 ? issue3.createdAt : null, (r37 & 8192) != 0 ? issue3.updatedAt : null, (r37 & 16384) != 0 ? issue3.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue3.assetId : null, (r37 & 65536) != 0 ? issue3.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue3.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue3.statusReason : null);
                    arrayList2.add(copy2);
                }
                copy = issue$default.copy((r37 & 1) != 0 ? issue$default.f66598id : null, (r37 & 2) != 0 ? issue$default.workOrderId : null, (r37 & 4) != 0 ? issue$default.issueTypeId : null, (r37 & 8) != 0 ? issue$default.display : null, (r37 & 16) != 0 ? issue$default.description : null, (r37 & 32) != 0 ? issue$default.status : null, (r37 & 64) != 0 ? issue$default.statusDisplay : null, (r37 & 128) != 0 ? issue$default.statusColor : null, (r37 & 256) != 0 ? issue$default.statusReasonDisplay : null, (r37 & 512) != 0 ? issue$default.source : null, (r37 & 1024) != 0 ? issue$default.sourceDisplay : null, (r37 & 2048) != 0 ? issue$default.createdBy : null, (r37 & 4096) != 0 ? issue$default.createdAt : null, (r37 & 8192) != 0 ? issue$default.updatedAt : null, (r37 & 16384) != 0 ? issue$default.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue$default.assetId : null, (r37 & 65536) != 0 ? issue$default.subtypes : arrayList2, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue$default.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue$default.statusReason : null);
                arrayList.add(copy);
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9745v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9745v(Object obj) {
            super(1, obj, YE6.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((YE6) this.receiver).m75350l0(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$w */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9746w extends FunctionReferenceImpl implements Function1<List<? extends Issue>, Unit> {
        public C9746w(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Issue> list) {
            invoke2((List<Issue>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<Issue> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$x */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9747x extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C9747x f44909b = new C9747x();

        public C9747x() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YE6$y */
    /* loaded from: classes3.dex */
    public static final class C9748y extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Issue>>, List<? extends IssueType>> {
        public C9748y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends IssueType> invoke(Pair<? extends Unit, ? extends List<? extends Issue>> pair) {
            return invoke2((Pair<Unit, ? extends List<Issue>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<IssueType> invoke2(Pair<Unit, ? extends List<Issue>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Issue> issues = pair.component2();
            YE6 ye6 = YE6.this;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            return ye6.m75377O(issues, YE6.this.f44864l.values());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YE6(InterfaceC44647lh6 userManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, InterfaceC37857aG6 workOrderManager, InterfaceC49339tc5 routingManager, InterfaceC43795kF6 ui, ScopeProvider scopeProvider, InterfaceC41414gE6 converter) {
        super(userManager, analyticsManager, scopeProvider, navigator, ui);
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(routingManager, "routingManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f44859g = workOrderManager;
        this.f44860h = routingManager;
        this.f44861i = ui;
        this.f44862j = converter;
        C24552a<List<Issue>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<Issue>>()");
        this.f44863k = m31922e;
        this.f44864l = new LinkedHashMap();
        C24558d<Pair<Issue, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Issue, Boolean>>()");
        this.f44865m = m31902e;
        final C9714a c9714a = new C9714a();
        Observable observeOn = m31922e.flatMapSingle(new InterfaceC23492o() { // from class: JE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75383I;
                m75383I = YE6.m75383I(Function1.this, obj);
                return m75383I;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "issuesSubject\n      .fla…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9715b c9715b = new C9715b(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: LE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75382J(Function1.this, obj);
            }
        };
        final C9716c c9716c = new C9716c(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: ME6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75381K(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(ui.mo27623K0(), m31902e);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.issueUpd… issuesCheckSubject\n    )");
        Observable m31950a = C24527f.m31950a(merge, m31922e);
        final C9717d c9717d = new C9717d();
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: NE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m75380L;
                m75380L = YE6.m75380L(Function1.this, obj);
                return m75380L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "merge(\n      ui.issueUpd…      }\n        }\n      }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9718e c9718e = new C9718e(m31922e);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: OE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75379M(Function1.this, obj);
            }
        });
        Observable<Pair<Issue, String>> observeOn2 = ui.mo27620o5().observeOn(C23454a.m33087a());
        final C9719f c9719f = new C9719f();
        Observable<R> flatMapSingle = observeOn2.flatMapSingle(new InterfaceC23492o() { // from class: PE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75378N;
                m75378N = YE6.m75378N(Function1.this, obj);
                return m75378N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "ui.showPriorityWarnDialo…    }\n          }\n      }");
        Object m33094as3 = flatMapSingle.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe();
    }

    /* renamed from: I */
    public static final InterfaceC23447K m75383I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m75382J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m75381K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final List m75380L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m75379M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23447K m75378N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final boolean m75376P(Collection<Issue> collection, Issue issue) {
        boolean z;
        Collection<Issue> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (Issue issue2 : collection2) {
                if (Intrinsics.areEqual(issue2.getIssueTypeId(), issue.getIssueTypeId())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z || issue.getStatus() != IssueStatus.OPEN) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public static final List m75373S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m75372T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m75371U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m75370V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final List m75369W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m75368X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m75367Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m75366Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m75365a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m75364b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m75362c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m75361d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23434B m75360e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m75359f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m75358g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m75357h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final Map m75356i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m75354j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final InterfaceC23447K m75352k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public final List<IssueType> m75377O(List<Issue> list, Collection<Issue> collection) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<IssueType> listOf;
        List<Issue> list2 = list;
        ArrayList<Issue> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (m75376P(collection, (Issue) obj)) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : arrayList) {
            arrayList2.add(Issue_Kt.toIssueType(issue));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Issue issue2 : list2) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, issue2.getSubtypes());
        }
        ArrayList<Issue> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (m75376P(collection, (Issue) obj2)) {
                arrayList4.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
        for (Issue issue3 : arrayList4) {
            arrayList5.add(Issue_Kt.toIssueType(issue3));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(arrayList2.toArray(new IssueType[0]));
        spreadBuilder.addSpread(arrayList5.toArray(new IssueType[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new IssueType[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: Q */
    public final List<Issue> m75375Q(List<Issue> list) {
        List listOf;
        ArrayList arrayList = new ArrayList();
        for (Issue issue : list) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issue);
            spreadBuilder.addSpread(issue.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    /* renamed from: R */
    public final List<String> m75374R(List<IssueType> list) {
        int collectionSizeOrDefault;
        List listOf;
        ArrayList arrayList = new ArrayList();
        for (IssueType issueType : list) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issueType.getId());
            List<IssueType> subtypes = issueType.getSubtypes();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (IssueType issueType2 : subtypes) {
                arrayList2.add(issueType2.getId());
            }
            spreadBuilder.addSpread(arrayList2.toArray(new String[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    @Override // p000.AbstractC2207FE, p000.InterfaceC1433DE
    /* renamed from: c */
    public void mo75363c(WireBird bird, WorkOrder workOrder, boolean z) {
        Map emptyMap;
        AbstractC23442F m70883l;
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo75363c(bird, workOrder, z);
        C24530g c24530g = C24530g.f91174a;
        InterfaceC37857aG6 interfaceC37857aG6 = this.f44859g;
        String model = bird.getModel();
        if (model == null) {
            model = "";
        }
        AbstractC23442F abstractC23442F = null;
        AbstractC23442F m70883l2 = C38096ag5.m70883l(InterfaceC37857aG6.C10609b.getIssueTypesByModel$default(interfaceC37857aG6, model, null, 2, null));
        if (workOrder != null && (m70883l = C38096ag5.m70883l(this.f44859g.mo19648e(workOrder.getId()))) != null) {
            final C9738r c9738r = C9738r.f44900g;
            abstractC23442F = m70883l.m33157I(new InterfaceC23492o() { // from class: zE6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Map m75356i0;
                    m75356i0 = YE6.m75356i0(Function1.this, obj);
                    return m75356i0;
                }
            });
        }
        if (abstractC23442F == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            abstractC23442F = AbstractC23442F.m33158H(emptyMap);
            Intrinsics.checkNotNullExpressionValue(abstractC23442F, "just(emptyMap())");
        }
        AbstractC23442F m31946a = c24530g.m31946a(m70883l2, abstractC23442F);
        final C9739s c9739s = new C9739s();
        AbstractC23442F m33101w = m31946a.m33101w(new InterfaceC23484g() { // from class: AE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75354j0(Function1.this, obj);
            }
        });
        final C9740t c9740t = new C9740t();
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: BE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75352k0;
                m75352k0 = YE6.m75352k0(Function1.this, obj);
                return m75352k0;
            }
        });
        final C9744u c9744u = new C9744u(workOrder);
        AbstractC23442F m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: CE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m75373S;
                m75373S = YE6.m75373S(Function1.this, obj);
                return m75373S;
            }
        });
        final C9745v c9745v = new C9745v(this);
        AbstractC23442F m33106t = m33157I.m33106t(new InterfaceC23484g() { // from class: DE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75372T(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33106t, "override fun onCreate(bi…) }, ::onError)\n    }\n  }");
        Object m33135e = m33106t.m33135e(AutoDispose.m45239a(m107429g()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9746w c9746w = new C9746w(this.f44863k);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: EE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75371U(Function1.this, obj);
            }
        };
        final C9747x c9747x = C9747x.f44909b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: FE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75370V(Function1.this, obj);
            }
        });
        if (z) {
            Observable m31950a = C24527f.m31950a(this.f44861i.mo27624I(), this.f44863k);
            final C9748y c9748y = new C9748y();
            Observable map = m31950a.map(new InterfaceC23492o() { // from class: GE6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m75369W;
                    m75369W = YE6.m75369W(Function1.this, obj);
                    return m75369W;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "override fun onCreate(bi…) }, ::onError)\n    }\n  }");
            Object m33094as = map.m33094as(AutoDispose.m45239a(m107429g()));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9722g c9722g = new C9722g();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HE6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    YE6.m75368X(Function1.this, obj);
                }
            });
            return;
        }
        DateTime now = DateTime.now();
        Observable m31950a2 = C24527f.m31950a(this.f44861i.mo27624I(), this.f44863k);
        final C9723h c9723h = new C9723h(bird, workOrder);
        Observable flatMapSingle = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: IE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75367Y;
                m75367Y = YE6.m75367Y(Function1.this, obj);
                return m75367Y;
            }
        });
        final C9725i c9725i = new C9725i(workOrder);
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: KE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75366Z;
                m75366Z = YE6.m75366Z(Function1.this, obj);
                return m75366Z;
            }
        });
        final C9727j c9727j = new C9727j(workOrder, this);
        Observable flatMapSingle3 = flatMapSingle2.flatMapSingle(new InterfaceC23492o() { // from class: QE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75365a0;
                m75365a0 = YE6.m75365a0(Function1.this, obj);
                return m75365a0;
            }
        });
        final C9729k c9729k = new C9729k(workOrder, this, bird, now);
        Observable observeOn = flatMapSingle3.flatMapSingle(new InterfaceC23492o() { // from class: RE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75364b0;
                m75364b0 = YE6.m75364b0(Function1.this, obj);
                return m75364b0;
            }
        }).observeOn(C23454a.m33087a());
        final C9730l c9730l = new C9730l(workOrder, this);
        Observable flatMapSingle4 = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: SE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75362c0;
                m75362c0 = YE6.m75362c0(Function1.this, obj);
                return m75362c0;
            }
        });
        final C9732m c9732m = new C9732m(bird);
        Observable flatMapSingle5 = flatMapSingle4.flatMapSingle(new InterfaceC23492o() { // from class: TE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m75361d0;
                m75361d0 = YE6.m75361d0(Function1.this, obj);
                return m75361d0;
            }
        });
        final C9734n c9734n = new C9734n(bird);
        Observable flatMap = flatMapSingle5.flatMap(new InterfaceC23492o() { // from class: UE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m75360e0;
                m75360e0 = YE6.m75360e0(Function1.this, obj);
                return m75360e0;
            }
        });
        final C9735o c9735o = new C9735o(this);
        Observable retry = flatMap.doOnError(new InterfaceC23484g() { // from class: VE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75359f0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(bi…) }, ::onError)\n    }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(m107429g()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9736p c9736p = new C9736p();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: WE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75358g0(Function1.this, obj);
            }
        };
        final C9737q c9737q = new C9737q(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: XE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                YE6.m75357h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: l0 */
    public final void m75350l0(Throwable th) {
        C41318g46.m40159e(th);
        if (th instanceof HttpException) {
            this.f44861i.error(th);
        } else {
            this.f44861i.error(C45871nl4.error_generic_body);
        }
    }

    /* renamed from: m0 */
    public final IssueStatus m75348m0(Boolean bool, Issue issue) {
        IssueStatus issueStatus;
        IssueStatus issueStatus2;
        IssueCreateSource issueCreateSource;
        String str;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            if (issue != null) {
                issueStatus2 = issue.getStatus();
            } else {
                issueStatus2 = null;
            }
            if (IssueStatus_Kt.isPassedStatus(issueStatus2)) {
                if (issue == null) {
                    return null;
                }
                return issue.getStatus();
            }
            if (issue != null) {
                issueCreateSource = issue.getSource();
            } else {
                issueCreateSource = null;
            }
            if (issueCreateSource != null) {
                return IssueStatus.DISPUTED;
            }
            if (issue != null) {
                str = issue.getParentId();
            } else {
                str = null;
            }
            if (str != null) {
                return null;
            }
            return IssueStatus.RESOLVED;
        } else if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return null;
        } else {
            if (issue != null) {
                issueStatus = issue.getStatus();
            } else {
                issueStatus = null;
            }
            if (IssueStatus_Kt.isFailedStatus(issueStatus)) {
                if (issue == null) {
                    return null;
                }
                return issue.getStatus();
            }
            return IssueStatus.OPEN;
        }
    }

    /* renamed from: n0 */
    public final List<Issue> m75346n0(List<Issue> list, Issue issue) {
        List<Issue> mutableList;
        Iterator<Issue> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getIssueTypeId(), issue.getIssueTypeId())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        if (i > -1) {
            mutableList.remove(i);
            mutableList.add(i, issue);
        }
        return mutableList;
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: YE6$n */
    /* loaded from: classes3.dex */
    public static final class C9734n extends Lambda implements Function1<Pair<? extends Optional<WorkOrder>, ? extends ServiceCenterRoute>, InterfaceC23434B<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f44898h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9734n(WireBird wireBird) {
            super(1);
            this.f44898h = wireBird;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Unit> invoke2(Pair<Optional<WorkOrder>, ? extends ServiceCenterRoute> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return YE6.this.f44861i.mo27621fi(this.f44898h, pair.component1().m59035e(), pair.component2());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Unit> invoke(Pair<? extends Optional<WorkOrder>, ? extends ServiceCenterRoute> pair) {
            return invoke2((Pair<Optional<WorkOrder>, ? extends ServiceCenterRoute>) pair);
        }
    }
}
