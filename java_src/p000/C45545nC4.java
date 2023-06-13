package p000;

import ch.qos.logback.core.joran.action.Action;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderCreateSource;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
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
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45545nC4;
import p000.C45672nQ5;
import p000.FQ5;
import p000.H31;
import p000.InterfaceC37857aG6;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BQ\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u00063"}, m28432d2 = {"LnC4;", "LJD;", "LXB4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "", "error", "S", "", "workOrderComplete", "q0", "LsC4;", "t", "LsC4;", "ui", "LSB4;", "u", "LSB4;", "converter", "LwD4;", "v", "LwD4;", "repairSubmissionStatusConverter", "Lco/bird/android/model/RepairScope;", "w", "Lco/bird/android/model/RepairScope;", "F", "()Lco/bird/android/model/RepairScope;", Action.SCOPE_ATTRIBUTE, "Lco/bird/android/model/RepairSource;", "x", "Lco/bird/android/model/RepairSource;", "H", "()Lco/bird/android/model/RepairSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "LaM;", "birdManager", "LGI3;", "partnerManager", "LaG6;", "workOrderManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCy4;", "repairAnalyticsManager", "<init>", "(LaM;LGI3;LaG6;Le13;Lcom/uber/autodispose/ScopeProvider;LCy4;LsC4;LSB4;LwD4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,173:1\n82#2,2:174\n180#3:176\n180#3:177\n180#3:178\n180#3:179\n199#3:180\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl\n*L\n52#1:174,2\n63#1:176\n72#1:177\n108#1:178\n113#1:179\n165#1:180\n*E\n"})
/* renamed from: nC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45545nC4 extends AbstractC3922JD {

    /* renamed from: t */
    public final InterfaceC48509sC4 f99580t;

    /* renamed from: u */
    public final SB4 f99581u;

    /* renamed from: v */
    public final InterfaceC50889wD4 f99582v;

    /* renamed from: w */
    public final RepairScope f99583w;

    /* renamed from: x */
    public final RepairSource f99584x;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\r \u0002*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\r \u0002*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00070\u0007\u0018\u00010\f0\f2z\u0010\u000b\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \u0002*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0002*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/RepairTypeLock;", "Lco/bird/android/model/WorkOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$a */
    /* loaded from: classes3.dex */
    public static final class C26424a extends Lambda implements Function1<C35631Re4<? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>, ? extends Optional<WorkOrder>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C26424a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C35631Re4<BirdSummaryBody, Optional<MobilePartner>, ? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>, Optional<WorkOrder>> c35631Re4) {
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            BirdSummaryBody birdSummary = c35631Re4.m86500a();
            Map<Issue, ? extends List<RepairType>> m86498c = c35631Re4.m86498c();
            List<RepairTypeLock> repairs = c35631Re4.m86497d();
            SB4 sb4 = C45545nC4.this.f99581u;
            Intrinsics.checkNotNullExpressionValue(birdSummary, "birdSummary");
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            return sb4.mo81887f(birdSummary, c35631Re4.m86499b().m59035e(), c35631Re4.m86496e().m59035e(), m86498c, repairs);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26425b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26425b(Object obj) {
            super(1, obj, InterfaceC48509sC4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC48509sC4) this.receiver).mo12611b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26426c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26426c(Object obj) {
            super(1, obj, C45545nC4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45545nC4) this.receiver).mo24204S(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$d */
    /* loaded from: classes3.dex */
    public static final class C26427d extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99587h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26427d(WireBird wireBird) {
            super(1);
            this.f99587h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45545nC4.this.m101003B().mo37135L2(this.f99587h);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t2X\u0010\b\u001aT\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n766#2:174\n857#2:175\n1747#2,3:176\n858#2:179\n1726#2,3:180\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$onCreate$2\n*L\n83#1:174\n83#1:175\n86#1:176,3\n83#1:179\n89#1:180,3\n*E\n"})
    /* renamed from: nC4$e */
    /* loaded from: classes3.dex */
    public static final class C26428e extends Lambda implements Function1<Triple<? extends Unit, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, InterfaceC23447K<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nC4$e$a */
        /* loaded from: classes3.dex */
        public static final class C26429a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C26429a f99589g = new C26429a();

            public C26429a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C26428e() {
            super(1);
        }

        /* renamed from: c */
        public static final Boolean m24169c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
            if (r6 != false) goto L10;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends Boolean> invoke(Triple<Unit, ? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> triple) {
            boolean z;
            IssueStatus issueStatus;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<RepairTypeLock> repairs = triple.component3();
            Set<Issue> keySet = triple.component2().keySet();
            C45545nC4 c45545nC4 = C45545nC4.this;
            ArrayList<Issue> arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Issue issue = (Issue) next;
                Issue issue2 = (Issue) c45545nC4.m100967x().get(issue.getIssueTypeId());
                if (issue2 != null) {
                    issueStatus = issue2.getStatus();
                } else {
                    issueStatus = null;
                }
                if (issueStatus == null || issue.getStatus() == issueStatus) {
                    Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
                    List<RepairTypeLock> list = repairs;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (RepairTypeLock repairTypeLock : list) {
                            RepairType component1 = repairTypeLock.component1();
                            boolean component2 = repairTypeLock.component2();
                            if (Intrinsics.areEqual(component1.getIssueTypeId(), issue.getIssueTypeId()) && !component2) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                }
                z = true;
                if (z) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                for (Issue issue3 : arrayList) {
                    if (!IssueStatus_Kt.isPassedStatus(issue3.getStatus())) {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(C45545nC4.this.f99580t, C34641My4.f23897d, false, false, 4, null);
                final C26429a c26429a = C26429a.f99589g;
                return dialog$default.m33157I(new InterfaceC23492o() { // from class: oC4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Boolean m24169c;
                        m24169c = C45545nC4.C26428e.m24169c(Function1.this, obj);
                        return m24169c;
                    }
                });
            }
            return AbstractC23442F.m33158H(Boolean.FALSE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "workOrderComplete", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$f */
    /* loaded from: classes3.dex */
    public static final class C26430f extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99591h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26430f(WireBird wireBird) {
            super(1);
            this.f99591h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean workOrderComplete) {
            C45545nC4 c45545nC4 = C45545nC4.this;
            WireBird wireBird = this.f99591h;
            Intrinsics.checkNotNullExpressionValue(workOrderComplete, "workOrderComplete");
            c45545nC4.m24181q0(wireBird, workOrderComplete.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "workOrderComplete", "Lio/reactivex/B;", "LnQ5$b;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$g */
    /* loaded from: classes3.dex */
    public static final class C26431g extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends C45672nQ5.EnumC26504b>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99593h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nC4$g$a */
        /* loaded from: classes3.dex */
        public static final class C26432a extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45545nC4 f99594g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f99595h;

            /* renamed from: i */
            public final /* synthetic */ Boolean f99596i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26432a(C45545nC4 c45545nC4, WireBird wireBird, Boolean bool) {
                super(1);
                this.f99594g = c45545nC4;
                this.f99595h = wireBird;
                this.f99596i = bool;
            }

            /* renamed from: a */
            public final void m24166a(C45672nQ5.EnumC26504b enumC26504b) {
                if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                    C45545nC4 c45545nC4 = this.f99594g;
                    WireBird wireBird = this.f99595h;
                    Boolean workOrderComplete = this.f99596i;
                    Intrinsics.checkNotNullExpressionValue(workOrderComplete, "workOrderComplete");
                    c45545nC4.m24181q0(wireBird, workOrderComplete.booleanValue());
                    return;
                }
                this.f99594g.m101003B().close();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m24166a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26431g(WireBird wireBird) {
            super(1);
            this.f99593h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke(Boolean workOrderComplete) {
            Intrinsics.checkNotNullParameter(workOrderComplete, "workOrderComplete");
            Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(C45545nC4.this.f99580t, null, 1, null);
            final C26432a c26432a = new C26432a(C45545nC4.this, this.f99593h, workOrderComplete);
            return showStatusDialog$default.doOnNext(new InterfaceC23484g() { // from class: pC4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45545nC4.C26431g.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$h */
    /* loaded from: classes3.dex */
    public static final class C26433h extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99598h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26433h(WireBird wireBird) {
            super(1);
            this.f99598h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C45545nC4.this.m101003B().mo37117O2(this.f99598h, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: nC4$i */
    /* loaded from: classes3.dex */
    public static final class C26434i<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C26434i<T1, T2, T3, T4, T5, R> f99599a = new C26434i<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u00012R\u0010\u0006\u001aN\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0005*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "Lco/bird/android/model/RepairTypeLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$submitRepairs$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n766#2:174\n857#2:175\n1747#2,3:176\n858#2:179\n766#2:180\n857#2,2:181\n1549#2:183\n1620#2,3:184\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$submitRepairs$1\n*L\n133#1:174\n133#1:175\n136#1:176,3\n133#1:179\n139#1:180\n139#1:181,2\n140#1:183\n140#1:184,3\n*E\n"})
    /* renamed from: nC4$j */
    /* loaded from: classes3.dex */
    public static final class C26435j extends Lambda implements Function1<Pair<? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, Pair<? extends List<? extends Issue>, ? extends List<? extends RepairType>>> {
        public C26435j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends Issue>, ? extends List<? extends RepairType>> invoke(Pair<? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>> pair) {
            return invoke2((Pair<? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<Issue>, List<RepairType>> invoke2(Pair<? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> pair) {
            int collectionSizeOrDefault;
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<RepairTypeLock> repairs = pair.component2();
            Set<Issue> keySet = pair.component1().keySet();
            C45545nC4 c45545nC4 = C45545nC4.this;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keySet.iterator();
            while (true) {
                boolean z3 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Issue issue = (Issue) next;
                Issue issue2 = (Issue) c45545nC4.m100967x().get(issue.getIssueTypeId());
                IssueStatus status = issue2 != null ? issue2.getStatus() : null;
                if (status == null || issue.getStatus() == status) {
                    Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
                    List<RepairTypeLock> list = repairs;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (RepairTypeLock repairTypeLock : list) {
                            RepairType component1 = repairTypeLock.component1();
                            boolean component2 = repairTypeLock.component2();
                            if (!Intrinsics.areEqual(component1.getIssueTypeId(), issue.getIssueTypeId()) || component2) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        z3 = false;
                    }
                }
                if (z3) {
                    arrayList.add(next);
                }
            }
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            ArrayList<RepairTypeLock> arrayList2 = new ArrayList();
            for (Object obj : repairs) {
                if (!((RepairTypeLock) obj).getLocked()) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (RepairTypeLock repairTypeLock2 : arrayList2) {
                arrayList3.add(repairTypeLock2.component1());
            }
            return TuplesKt.m28425to(arrayList, arrayList3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/RepairType;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$k */
    /* loaded from: classes3.dex */
    public static final class C26436k extends Lambda implements Function1<Pair<? extends List<? extends Issue>, ? extends List<? extends RepairType>>, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99602h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "workOrder", "", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: nC4$k$a */
        /* loaded from: classes3.dex */
        public static final class C26437a extends Lambda implements Function1<WorkOrder, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45545nC4 f99603g;

            /* renamed from: h */
            public final /* synthetic */ List<Issue> f99604h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26437a(C45545nC4 c45545nC4, List<Issue> list) {
                super(1);
                this.f99603g = c45545nC4;
                this.f99604h = list;
            }

            /* renamed from: a */
            public final void m24162a(WorkOrder workOrder) {
                this.f99603g.m101001D().mo106118c(workOrder.getRepairs(), this.f99604h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WorkOrder workOrder) {
                m24162a(workOrder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26436k(WireBird wireBird) {
            super(1);
            this.f99602h = wireBird;
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WorkOrder> invoke(Pair<? extends List<Issue>, ? extends List<RepairType>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Issue> component1 = pair.component1();
            AbstractC23442F logRepairs$default = InterfaceC37857aG6.C10609b.logRepairs$default(C45545nC4.this.m100998I(), this.f99602h.getId(), pair.component2(), component1, WorkOrderCreateSource.SERVICE_CENTER, C45545nC4.this.mo24206H(), null, 32, null);
            S74 mo12605oc = C45545nC4.this.f99580t.mo12605oc();
            if (mo12605oc == null) {
                mo12605oc = C45545nC4.this.f99580t;
            }
            AbstractC23442F progress$default = C28237sD.progress$default(logRepairs$default, mo12605oc, 0, 2, (Object) null);
            final C26437a c26437a = new C26437a(C45545nC4.this, component1);
            return progress$default.m33101w(new InterfaceC23484g() { // from class: qC4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C45545nC4.C26436k.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$l */
    /* loaded from: classes3.dex */
    public static final class C26438l extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99606h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26438l(WireBird wireBird) {
            super(1);
            this.f99606h = wireBird;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
            if (r0.m59037c() == true) goto L5;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            boolean z;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            Optional optional = (Optional) C45545nC4.this.m100997J().getValue();
            if (optional != null) {
                z = true;
            }
            z = false;
            if (!z) {
                return C45545nC4.this.m101001D().mo106119b(this.f99606h.getId(), workOrder.getId(), 0, RepairSource.SERVICE_CENTER).m33042m(AbstractC23442F.m33158H(workOrder));
            }
            return AbstractC23442F.m33158H(workOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$m */
    /* loaded from: classes3.dex */
    public static final class C26439m extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        /* renamed from: h */
        public final /* synthetic */ boolean f99608h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26439m(boolean z) {
            super(1);
            this.f99608h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            return C45545nC4.this.m101001D().mo106120a(this.f99608h).m33042m(AbstractC23442F.m33158H(workOrder));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nC4$n */
    /* loaded from: classes3.dex */
    public static final class C26440n extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f99610h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26440n(WireBird wireBird) {
            super(1);
            this.f99610h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            return C45545nC4.this.f99582v.mo1628d(this.f99610h.getCode(), workOrder.getRepairs().size());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nC4$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26441o extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C26441o(Object obj) {
            super(1, obj, InterfaceC48509sC4.class, "onSuccess", "onSuccess(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC48509sC4) this.receiver).mo12610b1(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$submitRepairs$7\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,173:1\n9#2,4:174\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenterImpl.kt\nco/bird/android/feature/repair/v1/overview/RepairOverviewPresenterImpl$submitRepairs$7\n*L\n167#1:174,4\n*E\n"})
    /* renamed from: nC4$p */
    /* loaded from: classes3.dex */
    public static final class C26442p extends Lambda implements Function1<Throwable, Unit> {
        public C26442p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            HttpException httpException = th instanceof HttpException ? th : null;
            String message = httpException != null ? httpException.getMessage() : null;
            InterfaceC48509sC4 interfaceC48509sC4 = C45545nC4.this.f99580t;
            List<C3023H6> m33132g = C45545nC4.this.f99582v.mo1629a(message).m33132g();
            Intrinsics.checkNotNullExpressionValue(m33132g, "repairSubmissionStatusCo…ailure(msg).blockingGet()");
            interfaceC48509sC4.mo12607g1(m33132g);
            C41318g46.m40159e(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45545nC4(InterfaceC10636aM birdManager, GI3 partnerManager, InterfaceC37857aG6 workOrderManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC32301Cy4 repairAnalyticsManager, InterfaceC48509sC4 ui, SB4 converter, InterfaceC50889wD4 repairSubmissionStatusConverter) {
        super(birdManager, partnerManager, workOrderManager, navigator, scopeProvider, repairAnalyticsManager, ui);
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(repairAnalyticsManager, "repairAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(repairSubmissionStatusConverter, "repairSubmissionStatusConverter");
        this.f99580t = ui;
        this.f99581u = converter;
        this.f99582v = repairSubmissionStatusConverter;
        this.f99583w = RepairScope.SERVICE_CENTER;
        this.f99584x = RepairSource.SERVICE_CENTER;
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(m100968w(), m101002C(), m100966y(), m101000E(), m100997J(), C26434i.f99599a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
        final C26424a c26424a = new C26424a();
        Observable observeOn = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: kC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24187k0;
                m24187k0 = C45545nC4.m24187k0(Function1.this, obj);
                return m24187k0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26425b c26425b = new C26425b(ui);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: lC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24186l0(Function1.this, obj);
            }
        };
        final C26426c c26426c = new C26426c(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: mC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24179s(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public static final void m24205P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final InterfaceC23447K m24187k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m24186l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m24185m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final InterfaceC23447K m24184n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m24183o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final InterfaceC23434B m24182p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23447K m24180r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m24179s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final InterfaceC23447K m24178s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23447K m24177t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final void m24176u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m24175v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final Pair m24174w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final InterfaceC23447K m24173x0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC3922JD
    /* renamed from: F */
    public RepairScope mo24207F() {
        return this.f99583w;
    }

    @Override // p000.AbstractC3922JD
    /* renamed from: H */
    public RepairSource mo24206H() {
        return this.f99584x;
    }

    @Override // p000.AbstractC3922JD
    /* renamed from: S */
    public void mo24204S(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof HttpException) {
            this.f99580t.error(error);
            return;
        }
        C41318g46.m40159e(error);
        this.f99580t.error(C45871nl4.error_generic_body);
    }

    @Override // p000.AbstractC3922JD, p000.XB4
    /* renamed from: a */
    public void mo24198a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo24198a(bird);
        Observable<Unit> observeOn = this.f99580t.mo12613B().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.commandClicks()\n     …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m100999G()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26427d c26427d = new C26427d(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZB4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24185m0(Function1.this, obj);
            }
        });
        Observable m31949b = C24527f.m31949b(this.f99580t.mo12609c(), m101004A(), m101000E());
        final C26428e c26428e = new C26428e();
        Observable flatMapSingle = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: aC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24184n0;
                m24184n0 = C45545nC4.m24184n0(Function1.this, obj);
                return m24184n0;
            }
        });
        final C26430f c26430f = new C26430f(bird);
        Observable doAfterNext = flatMapSingle.doAfterNext(new InterfaceC23484g() { // from class: bC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24183o0(Function1.this, obj);
            }
        });
        final C26431g c26431g = new C26431g(bird);
        Observable observeOn2 = doAfterNext.switchMap(new InterfaceC23492o() { // from class: cC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m24182p0;
                m24182p0 = C45545nC4.m24182p0(Function1.this, obj);
                return m24182p0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate(bi…eturnRepair = true) }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(m100999G()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<Unit> observeOn3 = this.f99580t.mo12608c9().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.idToolsClicks()\n     …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(m100999G()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26433h c26433h = new C26433h(bird);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: dC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24205P(Function1.this, obj);
            }
        });
    }

    /* renamed from: q0 */
    public final void m24181q0(WireBird wireBird, boolean z) {
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<Map<Issue, List<RepairType>>> firstOrError = m101004A().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "issueRepairsSubject.firstOrError()");
        AbstractC23442F<List<RepairTypeLock>> firstOrError2 = m101000E().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError2, "repairsSubject.firstOrError()");
        AbstractC23442F m31946a = c24530g.m31946a(firstOrError, firstOrError2);
        final C26435j c26435j = new C26435j();
        AbstractC23442F m33157I = m31946a.m33157I(new InterfaceC23492o() { // from class: YB4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m24174w0;
                m24174w0 = C45545nC4.m24174w0(Function1.this, obj);
                return m24174w0;
            }
        });
        final C26436k c26436k = new C26436k(wireBird);
        AbstractC23442F m33165A = m33157I.m33165A(new InterfaceC23492o() { // from class: eC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24173x0;
                m24173x0 = C45545nC4.m24173x0(Function1.this, obj);
                return m24173x0;
            }
        });
        final C26438l c26438l = new C26438l(wireBird);
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: fC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24180r0;
                m24180r0 = C45545nC4.m24180r0(Function1.this, obj);
                return m24180r0;
            }
        });
        final C26439m c26439m = new C26439m(z);
        AbstractC23442F m33165A3 = m33165A2.m33165A(new InterfaceC23492o() { // from class: gC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24178s0;
                m24178s0 = C45545nC4.m24178s0(Function1.this, obj);
                return m24178s0;
            }
        });
        final C26440n c26440n = new C26440n(wireBird);
        AbstractC23442F m33152N = m33165A3.m33165A(new InterfaceC23492o() { // from class: hC4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m24177t0;
                m24177t0 = C45545nC4.m24177t0(Function1.this, obj);
                return m24177t0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "@Suppress(\"NAME_SHADOWIN…  Timber.e(e)\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(m100999G()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26441o c26441o = new C26441o(this.f99580t);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: iC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24176u0(Function1.this, obj);
            }
        };
        final C26442p c26442p = new C26442p();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: jC4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45545nC4.m24175v0(Function1.this, obj);
            }
        });
    }
}
