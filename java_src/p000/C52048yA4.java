package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderCreateSource;
import co.bird.android.model.extension.IssueStatus_Kt;
import co.bird.android.model.extension.Issue_Kt;
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
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.danlew.android.joda.DateUtils;
import p000.C52048yA4;
import p000.H31;
import p000.InterfaceC37857aG6;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\u0014\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fH\u0016J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f 3*\n\u0012\u0004\u0012\u00020\f\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R.\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 3*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00150\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R.\u0010:\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 3*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00150\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 3*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, m28432d2 = {"LyA4;", "LSz4;", "", "e", "", "k0", "Lio/reactivex/F;", "", "b0", "Lco/bird/android/model/wire/WireBird;", "bird", C17296a.f69688o, "Lco/bird/android/model/WorkOrder;", "workOrder", "q0", "", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/LegacyRepair;", "repairs", "c", "", "Lco/bird/android/model/RepairType;", "selectedRepairTypes", DateTokenConverter.CONVERTER_KEY, "b", "LaG6;", "LaG6;", "workOrderManager", "LCy4;", "LCy4;", "repairAnalyticsManager", "LBA4;", "LBA4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LMz4;", "f", "LMz4;", "converter", "LTq4;", "g", "LTq4;", "reactiveConfig", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "workOrderSubject", "i", "issuesSubject", "j", "repairsSubject", "k", "repairTypesSubject", "l", "Lco/bird/android/model/wire/WireBird;", "<init>", "(LaG6;LCy4;LBA4;Lcom/uber/autodispose/ScopeProvider;Le13;LMz4;LTq4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,326:1\n180#2:327\n180#2:328\n180#2:329\n180#2:330\n199#2:331\n180#2:332\n237#2:333\n199#2:372\n218#2:373\n1855#3:334\n1856#3:336\n1549#3:337\n1620#3,3:338\n1603#3,9:341\n1855#3:350\n1856#3:352\n1612#3:353\n1360#3:354\n1446#3,2:355\n1448#3,3:359\n766#3:362\n857#3:363\n1747#3,3:364\n858#3:367\n1549#3:368\n1620#3,3:369\n1#4:335\n1#4:351\n37#5,2:357\n9#6,4:374\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl\n*L\n81#1:327\n97#1:328\n108#1:329\n134#1:330\n181#1:331\n194#1:332\n219#1:333\n281#1:372\n301#1:373\n231#1:334\n231#1:336\n252#1:337\n252#1:338,3\n255#1:341,9\n255#1:350\n255#1:352\n255#1:353\n261#1:354\n261#1:355,2\n261#1:359,3\n262#1:362\n262#1:363\n263#1:364,3\n262#1:367\n265#1:368\n265#1:369,3\n255#1:351\n261#1:357,2\n307#1:374,4\n*E\n"})
/* renamed from: yA4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52048yA4 implements InterfaceC36054Sz4 {

    /* renamed from: a */
    public final InterfaceC37857aG6 f118871a;

    /* renamed from: b */
    public final InterfaceC32301Cy4 f118872b;

    /* renamed from: c */
    public final BA4 f118873c;

    /* renamed from: d */
    public final ScopeProvider f118874d;

    /* renamed from: e */
    public final InterfaceC40099e13 f118875e;

    /* renamed from: f */
    public final InterfaceC34650Mz4 f118876f;

    /* renamed from: g */
    public final C36207Tq4 f118877g;

    /* renamed from: h */
    public final C24552a<Optional<WorkOrder>> f118878h;

    /* renamed from: i */
    public final C24552a<List<Issue>> f118879i;

    /* renamed from: j */
    public final C24552a<List<LegacyRepair>> f118880j;

    /* renamed from: k */
    public final C24552a<List<RepairType>> f118881k;

    /* renamed from: l */
    public WireBird f118882l;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$A */
    /* loaded from: classes3.dex */
    public static final class C30439A extends Lambda implements Function1<WorkOrder, Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>> {

        /* renamed from: g */
        public final /* synthetic */ List<Issue> f118883g;

        /* renamed from: h */
        public final /* synthetic */ C52048yA4 f118884h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30439A(List<Issue> list, C52048yA4 c52048yA4) {
            super(1);
            this.f118883g = list;
            this.f118884h = c52048yA4;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<List<Issue>, List<LegacyRepair>> invoke(WorkOrder workOrder) {
            List minus;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            List<Issue> list = this.f118883g;
            List<LegacyRepair> repairs = workOrder.getRepairs();
            List list2 = (List) this.f118884h.f118880j.getValue();
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            minus = CollectionsKt___CollectionsKt.minus((Iterable) repairs, (Iterable) list2);
            return TuplesKt.m28425to(list, minus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$B */
    /* loaded from: classes3.dex */
    public static final class C30440B extends Lambda implements Function1<Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30440B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>> pair) {
            invoke2((Pair<? extends List<Issue>, ? extends List<LegacyRepair>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<Issue>, ? extends List<LegacyRepair>> pair) {
            List<LegacyRepair> component2 = pair.component2();
            C52048yA4.this.f118872b.mo106118c(component2, pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$C */
    /* loaded from: classes3.dex */
    public static final class C30441C extends Lambda implements Function1<Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30441C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>> pair) {
            invoke2((Pair<? extends List<Issue>, ? extends List<LegacyRepair>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<Issue>, ? extends List<LegacyRepair>> pair) {
            List<LegacyRepair> component2 = pair.component2();
            C52048yA4.this.mo3958c(pair.component1(), component2);
            C52048yA4.this.f118873c.mo112670o0(component2.size());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$D */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30442D extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30442D(Object obj) {
            super(1, obj, C52048yA4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52048yA4) this.receiver).m3941k0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00072H\u0010\u0006\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$a */
    /* loaded from: classes3.dex */
    public static final class C30443a extends Lambda implements Function1<Triple<? extends Unit, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, InterfaceC23434B<? extends DialogResponse>> {
        public C30443a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends DialogResponse> invoke(Triple<Unit, ? extends List<Issue>, ? extends List<LegacyRepair>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<Issue> issues = triple.component2();
            List<LegacyRepair> repairs = triple.component3();
            BA4 ba4 = C52048yA4.this.f118873c;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            return ba4.mo112674Y9(issues, repairs);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$b */
    /* loaded from: classes3.dex */
    public static final class C30444b extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends Boolean>> {
        public C30444b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Boolean> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52048yA4.this.m3959b0();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30445c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30445c(Object obj) {
            super(1, obj, C52048yA4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52048yA4) this.receiver).m3941k0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "navigateToInventory", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$d */
    /* loaded from: classes3.dex */
    public static final class C30446d extends Lambda implements Function1<Boolean, Unit> {
        public C30446d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean navigateToInventory) {
            Intrinsics.checkNotNullExpressionValue(navigateToInventory, "navigateToInventory");
            if (navigateToInventory.booleanValue()) {
                C52048yA4.this.f118875e.mo36921w4();
            }
            C52048yA4.this.f118875e.close();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30447e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30447e(Object obj) {
            super(1, obj, C52048yA4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52048yA4) this.receiver).m3941k0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,326:1\n1549#2:327\n1620#2,3:328\n1360#2:331\n1446#2,2:332\n1448#2,3:336\n37#3,2:334\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$1\n*L\n74#1:327\n74#1:328,3\n75#1:331\n75#1:332,2\n75#1:336,3\n75#1:334,2\n*E\n"})
    /* renamed from: yA4$f */
    /* loaded from: classes3.dex */
    public static final class C30448f extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Issue>>, List<? extends IssueType>> {

        /* renamed from: g */
        public static final C30448f f118890g = new C30448f();

        public C30448f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends IssueType> invoke(Pair<? extends Unit, ? extends List<? extends Issue>> pair) {
            return invoke2((Pair<Unit, ? extends List<Issue>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<IssueType> invoke2(Pair<Unit, ? extends List<Issue>> pair) {
            int collectionSizeOrDefault;
            List listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Issue> issues = pair.component2();
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            List<Issue> list = issues;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList<IssueType> arrayList = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : list) {
                arrayList.add(Issue_Kt.toIssueType(issue));
            }
            ArrayList arrayList2 = new ArrayList();
            for (IssueType issueType : arrayList) {
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(issueType);
                spreadBuilder.addSpread(issueType.getSubtypes().toArray(new IssueType[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new IssueType[spreadBuilder.size()]));
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listOf);
            }
            return arrayList2;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072«\u0001\u0010\u0006\u001a¦\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001 \u0003*R\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/IssueType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,326:1\n1549#2:327\n1620#2,3:328\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$2\n*L\n86#1:327\n86#1:328,3\n*E\n"})
    /* renamed from: yA4$g */
    /* loaded from: classes3.dex */
    public static final class C30449g extends Lambda implements Function1<Triple<? extends List<? extends IssueType>, ? extends List<? extends RepairType>, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30449g() {
            super(1);
        }

        /* renamed from: a */
        public final void m3916a(Triple<? extends List<IssueType>, ? extends List<RepairType>, ? extends List<LegacyRepair>> triple) {
            int collectionSizeOrDefault;
            List<IssueType> issueTypes = triple.component1();
            List<RepairType> repairTypes = triple.component2();
            List<LegacyRepair> repairs = triple.component3();
            InterfaceC40099e13 interfaceC40099e13 = C52048yA4.this.f118875e;
            Intrinsics.checkNotNullExpressionValue(issueTypes, "issueTypes");
            Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            List<LegacyRepair> list = repairs;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (LegacyRepair legacyRepair : list) {
                arrayList.add(new RepairTypeLock(JF4.m100776a(legacyRepair), true));
            }
            interfaceC40099e13.mo37114P(issueTypes, repairTypes, arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends List<? extends IssueType>, ? extends List<? extends RepairType>, ? extends List<? extends LegacyRepair>> triple) {
            m3916a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$h */
    /* loaded from: classes3.dex */
    public static final class C30450h extends Lambda implements Function1<Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C30450h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<? extends List<Issue>, ? extends List<LegacyRepair>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Issue> issues = pair.component1();
            List<LegacyRepair> repairs = pair.component2();
            InterfaceC34650Mz4 interfaceC34650Mz4 = C52048yA4.this.f118876f;
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            return interfaceC34650Mz4.mo91119a(issues, repairs);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30451i extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C30451i(Object obj) {
            super(1, obj, BA4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BA4) this.receiver).mo112673b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "issues", "", "Lco/bird/android/model/Issue;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,326:1\n1360#2:327\n1446#2,2:328\n1448#2,3:332\n1726#2,3:335\n37#3,2:330\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$5\n*L\n104#1:327\n104#1:328,2\n104#1:332,3\n105#1:335,3\n104#1:330,2\n*E\n"})
    /* renamed from: yA4$j */
    /* loaded from: classes3.dex */
    public static final class C30452j extends Lambda implements Function1<List<? extends Issue>, Boolean> {

        /* renamed from: g */
        public static final C30452j f118893g = new C30452j();

        public C30452j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Issue> list) {
            return invoke2((List<Issue>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<Issue> issues) {
            boolean z;
            List listOf;
            Intrinsics.checkNotNullParameter(issues, "issues");
            ArrayList<Issue> arrayList = new ArrayList();
            Iterator<T> it = issues.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Issue issue = (Issue) it.next();
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(issue);
                spreadBuilder.addSpread(issue.getSubtypes().toArray(new Issue[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, listOf);
            }
            if (!arrayList.isEmpty()) {
                for (Issue issue2 : arrayList) {
                    IssueStatus status = issue2.getStatus();
                    if (!(!((status == null || IssueStatus_Kt.isPassedStatus(status)) ? false : true))) {
                        break;
                    }
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30453k extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C30453k(Object obj) {
            super(1, obj, BA4.class, "enableCompleteRepairs", "enableCompleteRepairs(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((BA4) this.receiver).mo112671ja(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$l */
    /* loaded from: classes3.dex */
    public static final class C30454l extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C30454l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return H31.C3014a.dialog$default(C52048yA4.this.f118873c, C34641My4.f23897d, false, false, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$m */
    /* loaded from: classes3.dex */
    public static final class C30455m extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

        /* renamed from: g */
        public static final C30455m f118895g = new C30455m();

        public C30455m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response == DialogResponse.OK) {
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$n */
    /* loaded from: classes3.dex */
    public static final class C30456n extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Unit>> {
        public C30456n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(C52048yA4.this.f118872b.mo106120a(true), C52048yA4.this.f118873c, 0, 2, (Object) null).m33043l(Observable.just(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "isEmpty", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$o */
    /* loaded from: classes3.dex */
    public static final class C30457o extends Lambda implements Function1<Boolean, InterfaceC24574u<? extends Unit>> {
        public C30457o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Unit> invoke(Boolean isEmpty) {
            Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
            if (isEmpty.booleanValue()) {
                return AbstractC24507p.m32024u();
            }
            return C52048yA4.this.f118872b.mo106120a(false).m33045k(AbstractC24507p.m32068G(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$p */
    /* loaded from: classes3.dex */
    public static final class C30458p extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C30458p f118898g = new C30458p();

        public C30458p() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30459q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C30459q f118899b = new C30459q();

        public C30459q() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$r */
    /* loaded from: classes3.dex */
    public static final class C30460r extends Lambda implements Function1<DialogResponse, Boolean> {

        /* renamed from: g */
        public static final C30460r f118900g = new C30460r();

        public C30460r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(DialogResponse it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001an\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005 \u0004*6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u00010\u00012:\u0010\b\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0004*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00050\u00050\tH\n¢\u0006\u0002\b\u000b"}, m28432d2 = {"<anonymous>", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,326:1\n1360#2:327\n1446#2,2:328\n1549#2:330\n1620#2,3:331\n1448#2,3:336\n766#2:339\n857#2:340\n1747#2,3:341\n858#2:344\n37#3,2:334\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$onCreate$1\n*L\n153#1:327\n153#1:328,2\n156#1:330\n156#1:331,3\n153#1:336,3\n166#1:339\n166#1:340\n167#1:341,3\n166#1:344\n156#1:334,2\n*E\n"})
    /* renamed from: yA4$s */
    /* loaded from: classes3.dex */
    public static final class C30461s extends Lambda implements Function1<Pair<? extends Optional<WorkOrder>, ? extends List<? extends IssueType>>, Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>> {

        /* renamed from: g */
        public static final C30461s f118901g = new C30461s();

        public C30461s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>> invoke(Pair<? extends Optional<WorkOrder>, ? extends List<? extends IssueType>> pair) {
            return invoke2((Pair<Optional<WorkOrder>, ? extends List<IssueType>>) pair);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
            if (r3 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
            if (r1 == null) goto L55;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Triple<Optional<WorkOrder>, List<Issue>, List<LegacyRepair>> invoke2(Pair<Optional<WorkOrder>, ? extends List<IssueType>> pair) {
            Map emptyMap;
            List emptyList;
            List<LegacyRepair> repairs;
            boolean z;
            boolean z2;
            List<Issue> issues;
            int collectionSizeOrDefault;
            List listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = pair.component1();
            List<IssueType> issueSupertypes = pair.component2();
            WorkOrder m59035e = component1.m59035e();
            if (m59035e != null && (issues = m59035e.getIssues()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Issue issue : issues) {
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
                emptyMap = MapsKt__MapsKt.toMap(arrayList);
            }
            emptyMap = MapsKt__MapsKt.emptyMap();
            Intrinsics.checkNotNullExpressionValue(issueSupertypes, "issueSupertypes");
            List<Issue> m104999a = C33019Ga2.m104999a(issueSupertypes, emptyMap);
            if (m59035e != null && (repairs = m59035e.getRepairs()) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : repairs) {
                    LegacyRepair legacyRepair = (LegacyRepair) obj;
                    List<Issue> issues2 = m59035e.getIssues();
                    if (!(issues2 instanceof Collection) || !issues2.isEmpty()) {
                        for (Issue issue3 : issues2) {
                            z = true;
                            if (!Intrinsics.areEqual(legacyRepair.getIssueTypeId(), issue3.getIssueTypeId()) || issue3.getStatus() == IssueStatus.FAILED_QC) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        arrayList3.add(obj);
                    }
                }
                emptyList = CollectionsKt___CollectionsKt.toList(arrayList3);
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new Triple<>(component1, m104999a, emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a§\u0002\u0012\u008b\u0001\b\u0001\u0012\u0086\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004 \u0003*B\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\t0\t \u0003*\u0092\u0001\u0012\u008b\u0001\b\u0001\u0012\u0086\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004 \u0003*B\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b28\u0010\u0007\u001a4\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lwb4;", "Lco/bird/android/model/RepairType;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$t */
    /* loaded from: classes3.dex */
    public static final class C30462t extends Lambda implements Function1<Triple<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, InterfaceC23447K<? extends C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f118903h;

        @Metadata(m28433d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0086\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*B\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"", "Lco/bird/android/model/RepairType;", "repairTypes", "Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", C17296a.f69688o, "(Ljava/util/List;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: yA4$t$a */
        /* loaded from: classes3.dex */
        public static final class C30463a extends Lambda implements Function1<List<? extends RepairType>, C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<WorkOrder> f118904g;

            /* renamed from: h */
            public final /* synthetic */ List<Issue> f118905h;

            /* renamed from: i */
            public final /* synthetic */ List<LegacyRepair> f118906i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30463a(Optional<WorkOrder> optional, List<Issue> list, List<LegacyRepair> list2) {
                super(1);
                this.f118904g = optional;
                this.f118905h = list;
                this.f118906i = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C51106wb4<Optional<WorkOrder>, List<Issue>, List<LegacyRepair>, List<RepairType>> invoke(List<RepairType> repairTypes) {
                Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
                return new C51106wb4<>(this.f118904g, this.f118905h, this.f118906i, repairTypes);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30462t(WireBird wireBird) {
            super(1);
            this.f118903h = wireBird;
        }

        /* renamed from: c */
        public static final C51106wb4 m3909c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C51106wb4) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends C51106wb4<Optional<WorkOrder>, List<Issue>, List<LegacyRepair>, List<RepairType>>> invoke(Triple<Optional<WorkOrder>, ? extends List<Issue>, ? extends List<LegacyRepair>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<WorkOrder> component1 = triple.component1();
            List<Issue> component2 = triple.component2();
            List<LegacyRepair> component3 = triple.component3();
            InterfaceC37857aG6 interfaceC37857aG6 = C52048yA4.this.f118871a;
            String id = this.f118903h.getId();
            String model = this.f118903h.getModel();
            if (model == null) {
                model = "";
            }
            AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(interfaceC37857aG6.mo19652b(id, model, RepairScope.SERVICE_CENTER), C52048yA4.this.f118873c, 0, 2, (Object) null));
            final C30463a c30463a = new C30463a(component1, component2, component3);
            return m70883l.m33157I(new InterfaceC23492o() { // from class: zA4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C51106wb4 m3909c;
                    m3909c = C52048yA4.C30462t.m3909c(Function1.this, obj);
                    return m3909c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u008b\u0001\u0010\b\u001a\u0086\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004 \u0003*B\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/LegacyRepair;", "Lco/bird/android/model/RepairType;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$u */
    /* loaded from: classes3.dex */
    public static final class C30464u extends Lambda implements Function1<C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>>, Unit> {
        public C30464u() {
            super(1);
        }

        /* renamed from: a */
        public final void m3907a(C51106wb4<Optional<WorkOrder>, ? extends List<Issue>, ? extends List<LegacyRepair>, ? extends List<RepairType>> c51106wb4) {
            C52048yA4.this.m3929q0(c51106wb4.m6614a().m59035e());
            C52048yA4.this.f118879i.onNext(c51106wb4.m6613b());
            C52048yA4.this.f118880j.onNext(c51106wb4.m6612c());
            C52048yA4.this.f118881k.onNext(c51106wb4.m6611d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Optional<WorkOrder>, ? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>> c51106wb4) {
            m3907a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30465v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30465v(Object obj) {
            super(1, obj, C52048yA4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C52048yA4) this.receiver).m3941k0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0082\u0001\u0010\u0006\u001a~\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002 \u0004*>\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/LegacyRepair;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairType;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$w */
    /* loaded from: classes3.dex */
    public static final class C30466w extends Lambda implements Function1<Triple<? extends Issue, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f118909h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30466w(WireBird wireBird) {
            super(1);
            this.f118909h = wireBird;
        }

        /* renamed from: a */
        public final void m3906a(Triple<Issue, ? extends List<LegacyRepair>, ? extends List<RepairType>> triple) {
            List<LegacyRepair> repairs = triple.component2();
            List<RepairType> repairTypes = triple.component3();
            InterfaceC40099e13 interfaceC40099e13 = C52048yA4.this.f118875e;
            WireBird wireBird = this.f118909h;
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
            interfaceC40099e13.mo37014h1(wireBird, triple.component1(), repairs, repairTypes);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Issue, ? extends List<? extends LegacyRepair>, ? extends List<? extends RepairType>> triple) {
            m3906a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yA4$x */
    /* loaded from: classes3.dex */
    public static final class C30467x extends Lambda implements Function1<Optional<WorkOrder>, Boolean> {

        /* renamed from: g */
        public static final C30467x f118910g = new C30467x();

        public C30467x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WorkOrder> workOrderOptional) {
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            return Boolean.valueOf(workOrderOptional.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$onCreate$7\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,326:1\n37#2,2:327\n1360#3:329\n1446#3,5:330\n1774#3,4:335\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterImpl$onCreate$7\n*L\n210#1:327,2\n210#1:329\n210#1:330,5\n211#1:335,4\n*E\n"})
    /* renamed from: yA4$y */
    /* loaded from: classes3.dex */
    public static final class C30468y extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f118912h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30468y(WireBird wireBird) {
            super(1);
            this.f118912h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Optional<WorkOrder> workOrderOptional) {
            List listOf;
            boolean z;
            Intrinsics.checkNotNullParameter(workOrderOptional, "workOrderOptional");
            List<Issue> issues = workOrderOptional.m59038b().getIssues();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            int i = 0;
            spreadBuilder.addSpread(issues.toArray(new Issue[0]));
            ArrayList arrayList = new ArrayList();
            for (Issue issue : issues) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, issue.getSubtypes());
            }
            spreadBuilder.addSpread(arrayList.toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            List<Issue> list = listOf;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                int i2 = 0;
                for (Issue issue2 : list) {
                    if (issue2.getStatus() == IssueStatus.OPEN) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i = i2;
            }
            return C52048yA4.this.f118872b.mo106119b(this.f118912h.getId(), workOrderOptional.m59038b().getId(), i, RepairSource.SERVICE_CENTER);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yA4$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30469z extends FunctionReferenceImpl implements Function1<WorkOrder, Unit> {
        public C30469z(Object obj) {
            super(1, obj, C52048yA4.class, "updateWorkOrder", "updateWorkOrder(Lco/bird/android/model/WorkOrder;)V", 0);
        }

        /* renamed from: a */
        public final void m3903a(WorkOrder workOrder) {
            ((C52048yA4) this.receiver).m3929q0(workOrder);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WorkOrder workOrder) {
            m3903a(workOrder);
            return Unit.INSTANCE;
        }
    }

    public C52048yA4(InterfaceC37857aG6 workOrderManager, InterfaceC32301Cy4 repairAnalyticsManager, BA4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC34650Mz4 converter, C36207Tq4 reactiveConfig) {
        List<LegacyRepair> emptyList;
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(repairAnalyticsManager, "repairAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f118871a = workOrderManager;
        this.f118872b = repairAnalyticsManager;
        this.f118873c = ui;
        this.f118874d = scopeProvider;
        this.f118875e = navigator;
        this.f118876f = converter;
        this.f118877g = reactiveConfig;
        C24552a<Optional<WorkOrder>> m31921g = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Optional<W…rder>>(Optional.absent())");
        this.f118878h = m31921g;
        C24552a<List<Issue>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<Issue>>()");
        this.f118879i = m31922e;
        C24552a<List<LegacyRepair>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<List<LegacyRepair>>()");
        this.f118880j = m31922e2;
        C24552a<List<RepairType>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<List<RepairType>>()");
        this.f118881k = m31922e3;
        Observable m31950a = C24527f.m31950a(ui.mo112672i2(), m31922e);
        final C30448f c30448f = C30448f.f118890g;
        Observable map = m31950a.map(new InterfaceC23492o() { // from class: Tz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m3979J;
                m3979J = C52048yA4.m3979J(Function1.this, obj);
                return m3979J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.addMoreRepairsClicks(…toTypedArray()) }\n      }");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<LegacyRepair>> defaultIfEmpty = m31922e2.defaultIfEmpty(emptyList);
        Intrinsics.checkNotNullExpressionValue(defaultIfEmpty, "repairsSubject.defaultIfEmpty(emptyList())");
        Object m33094as = C24527f.m31949b(map, m31922e3, defaultIfEmpty).m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30449g c30449g = new C30449g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3978K(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(m31922e, m31922e2);
        final C30450h c30450h = new C30450h();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: uA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3973P;
                m3973P = C52048yA4.m3973P(Function1.this, obj);
                return m3973P;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30451i c30451i = new C30451i(ui);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3972Q(Function1.this, obj);
            }
        });
        final C30452j c30452j = C30452j.f118893g;
        Observable observeOn2 = m31922e.map(new InterfaceC23492o() { // from class: wA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m3971R;
                m3971R = C52048yA4.m3971R(Function1.this, obj);
                return m3971R;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "issuesSubject\n      .map…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30453k c30453k = new C30453k(ui);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: xA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3970S(Function1.this, obj);
            }
        });
        Observable<Unit> mo112676I8 = ui.mo112676I8();
        final C30454l c30454l = new C30454l();
        Observable<R> flatMapSingle = mo112676I8.flatMapSingle(new InterfaceC23492o() { // from class: Uz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3969T;
                m3969T = C52048yA4.m3969T(Function1.this, obj);
                return m3969T;
            }
        });
        final C30455m c30455m = C30455m.f118895g;
        Observable flatMapMaybe = flatMapSingle.flatMapMaybe(new InterfaceC23492o() { // from class: Vz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m3968U;
                m3968U = C52048yA4.m3968U(Function1.this, obj);
                return m3968U;
            }
        });
        final C30456n c30456n = new C30456n();
        Observable flatMap = flatMapMaybe.flatMap(new InterfaceC23492o() { // from class: Wz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m3967V;
                m3967V = C52048yA4.m3967V(Function1.this, obj);
                return m3967V;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "ui.completeRepairClicks(…vable.just(Unit))\n      }");
        Observable observeOn3 = C24527f.m31949b(flatMap, m31922e, m31922e2).observeOn(C23454a.m33087a());
        final C30443a c30443a = new C30443a();
        Observable flatMap2 = observeOn3.flatMap(new InterfaceC23492o() { // from class: Xz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m3966W;
                m3966W = C52048yA4.m3966W(Function1.this, obj);
                return m3966W;
            }
        });
        final C30444b c30444b = new C30444b();
        Observable flatMapSingle2 = flatMap2.flatMapSingle(new InterfaceC23492o() { // from class: eA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3977L;
                m3977L = C52048yA4.m3977L(Function1.this, obj);
                return m3977L;
            }
        });
        final C30445c c30445c = new C30445c(this);
        Observable retry = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: pA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3976M(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "ui.completeRepairClicks(…::onError)\n      .retry()");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30446d c30446d = new C30446d();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: rA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3975N(Function1.this, obj);
            }
        };
        final C30447e c30447e = new C30447e(this);
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: sA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3974O(Function1.this, obj);
            }
        });
    }

    /* renamed from: J */
    public static final List m3979J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m3978K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23447K m3977L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m3976M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m3975N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m3974O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m3973P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m3972Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Boolean m3971R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m3970S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m3969T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC24574u m3968U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23434B m3967V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23434B m3966W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC24574u m3965X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m3964Y(C52048yA4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f118875e.close();
    }

    /* renamed from: Z */
    public static final void m3963Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m3961a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final Boolean m3957c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Triple m3955d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m3953e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m3951f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m3949g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m3947h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final boolean m3945i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: j0 */
    public static final InterfaceC23496h m3943j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m3939l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final Pair m3937m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m3935n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m3933o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m3931p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36054Sz4
    /* renamed from: a */
    public void mo3962a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f118882l = bird;
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<Optional<WorkOrder>> mo19641l = this.f118871a.mo19641l(bird.getId());
        InterfaceC37857aG6 interfaceC37857aG6 = this.f118871a;
        String model = bird.getModel();
        if (model == null) {
            model = "";
        }
        AbstractC23442F progress$default = C28237sD.progress$default(c24530g.m31946a(mo19641l, C38096ag5.m70883l(InterfaceC37857aG6.C10609b.getIssueTypesByModel$default(interfaceC37857aG6, model, null, 2, null))), this.f118873c, 0, 2, (Object) null);
        final C30461s c30461s = C30461s.f118901g;
        AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: dA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m3955d0;
                m3955d0 = C52048yA4.m3955d0(Function1.this, obj);
                return m3955d0;
            }
        });
        final C30462t c30462t = new C30462t(bird);
        AbstractC23442F m33152N = m33157I.m33165A(new InterfaceC23492o() { // from class: fA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3953e0;
                m3953e0 = C52048yA4.m3953e0(Function1.this, obj);
                return m3953e0;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreate(bi…r)\n      .subscribe()\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f118874d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30464u c30464u = new C30464u();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3951f0(Function1.this, obj);
            }
        };
        final C30465v c30465v = new C30465v(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3949g0(Function1.this, obj);
            }
        });
        Object m33094as = C24527f.m31949b(this.f118873c.mo112669ze(), this.f118880j, this.f118881k).m33094as(AutoDispose.m45239a(this.f118874d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30466w c30466w = new C30466w(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3947h0(Function1.this, obj);
            }
        });
        C24552a<Optional<WorkOrder>> c24552a = this.f118878h;
        final C30467x c30467x = C30467x.f118910g;
        AbstractC24507p<Optional<WorkOrder>> firstElement = c24552a.filter(new InterfaceC23494q() { // from class: jA4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3945i0;
                m3945i0 = C52048yA4.m3945i0(Function1.this, obj);
                return m3945i0;
            }
        }).firstElement();
        final C30468y c30468y = new C30468y(bird);
        AbstractC23461c m32074A = firstElement.m32074A(new InterfaceC23492o() { // from class: kA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m3943j0;
                m3943j0 = C52048yA4.m3943j0(Function1.this, obj);
                return m3943j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun onCreate(bi…r)\n      .subscribe()\n  }");
        Object m33041n = m32074A.m33041n(AutoDispose.m45239a(this.f118874d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC36054Sz4
    /* renamed from: b */
    public void mo3960b() {
        AbstractC23442F<Boolean> isEmpty = this.f118878h.isEmpty();
        final C30457o c30457o = new C30457o();
        AbstractC24507p<R> m33163C = isEmpty.m33163C(new InterfaceC23492o() { // from class: mA4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m3965X;
                m3965X = C52048yA4.m3965X(Function1.this, obj);
                return m3965X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "override fun exit() {\n  …scribe({}, Timber::e)\n  }");
        AbstractC24507p m32033l = C28237sD.progress$default(m33163C, this.f118873c, 0, 2, (Object) null).m32033l(new InterfaceC23478a() { // from class: nA4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C52048yA4.m3964Y(C52048yA4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32033l, "override fun exit() {\n  …scribe({}, Timber::e)\n  }");
        Object m32048b = m32033l.m32048b(AutoDispose.m45239a(this.f118874d));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30458p c30458p = C30458p.f118898g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: oA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3963Z(Function1.this, obj);
            }
        };
        final C30459q c30459q = C30459q.f118899b;
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52048yA4.m3961a0(Function1.this, obj);
            }
        });
    }

    /* renamed from: b0 */
    public final AbstractC23442F<Boolean> m3959b0() {
        boolean enableInventory = this.f118877g.m82623f8().m73665a().getOperatorConfig().getFeatures().getMaintenance().getEnableInventory();
        if (enableInventory) {
            AbstractC23442F<DialogResponse> mo112675Si = this.f118873c.mo112675Si();
            final C30460r c30460r = C30460r.f118900g;
            AbstractC23442F m33157I = mo112675Si.m33157I(new InterfaceC23492o() { // from class: lA4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m3957c0;
                    m3957c0 = C52048yA4.m3957c0(Function1.this, obj);
                    return m3957c0;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "{\n      ui.showNavigateT…DialogResponse.OK }\n    }");
            return m33157I;
        }
        AbstractC23442F<Boolean> m33158H = AbstractC23442F.m33158H(Boolean.valueOf(enableInventory));
        Intrinsics.checkNotNullExpressionValue(m33158H, "{\n      Single.just(showInventoryDialog)\n    }");
        return m33158H;
    }

    @Override // p000.InterfaceC36054Sz4
    /* renamed from: c */
    public void mo3958c(Collection<Issue> issues, Collection<LegacyRepair> repairs) {
        List<LegacyRepair> mutableList;
        Issue m116039a;
        List<Issue> mutableList2;
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        for (Issue issue : issues) {
            List<Issue> value = this.f118879i.getValue();
            if (value == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(value, "issuesSubject.value ?: return");
            m116039a = AA4.m116039a(value, issue.getIssueTypeId());
            int indexOf = value.indexOf(m116039a);
            mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            mutableList2.remove(indexOf);
            mutableList2.add(indexOf, Issue_Kt.updateIssue(m116039a, issue));
            this.f118879i.onNext(mutableList2);
        }
        List<LegacyRepair> value2 = this.f118880j.getValue();
        if (value2 == null) {
            value2 = CollectionsKt__CollectionsKt.emptyList();
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value2);
        mutableList.addAll(repairs);
        this.f118880j.onNext(mutableList);
    }

    @Override // p000.InterfaceC36054Sz4
    /* renamed from: d */
    public void mo3956d(List<RepairType> selectedRepairTypes) {
        Collection emptyList;
        List minus;
        Set<Issue> set;
        int collectionSizeOrDefault;
        Issue copy;
        boolean z;
        List listOf;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(selectedRepairTypes, "selectedRepairTypes");
        List<LegacyRepair> value = this.f118880j.getValue();
        if (value != null) {
            List<LegacyRepair> list = value;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            emptyList = new ArrayList(collectionSizeOrDefault2);
            for (LegacyRepair legacyRepair : list) {
                emptyList.add(JF4.m100776a(legacyRepair));
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        minus = CollectionsKt___CollectionsKt.minus((Iterable) selectedRepairTypes, (Iterable) emptyList);
        List<RepairType> list2 = minus;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            Issue issue = null;
            if (!it.hasNext()) {
                break;
            }
            RepairType repairType = (RepairType) it.next();
            List<Issue> value2 = this.f118879i.getValue();
            if (value2 != null) {
                Intrinsics.checkNotNullExpressionValue(value2, "value");
                issue = AA4.m116039a(value2, repairType.getIssueTypeId());
            }
            if (issue != null) {
                arrayList.add(issue);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Issue issue2 : set) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(issue2);
            spreadBuilder.addSpread(issue2.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listOf);
        }
        ArrayList<Issue> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            Issue issue3 = (Issue) obj;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (RepairType repairType2 : list2) {
                    if (Intrinsics.areEqual(repairType2.getIssueTypeId(), issue3.getIssueTypeId())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList3.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue4 : arrayList3) {
            copy = issue4.copy((r37 & 1) != 0 ? issue4.f66598id : null, (r37 & 2) != 0 ? issue4.workOrderId : null, (r37 & 4) != 0 ? issue4.issueTypeId : null, (r37 & 8) != 0 ? issue4.display : null, (r37 & 16) != 0 ? issue4.description : null, (r37 & 32) != 0 ? issue4.status : IssueStatus.RESOLVED, (r37 & 64) != 0 ? issue4.statusDisplay : null, (r37 & 128) != 0 ? issue4.statusColor : null, (r37 & 256) != 0 ? issue4.statusReasonDisplay : null, (r37 & 512) != 0 ? issue4.source : null, (r37 & 1024) != 0 ? issue4.sourceDisplay : null, (r37 & 2048) != 0 ? issue4.createdBy : null, (r37 & 4096) != 0 ? issue4.createdAt : null, (r37 & 8192) != 0 ? issue4.updatedAt : null, (r37 & 16384) != 0 ? issue4.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue4.assetId : null, (r37 & 65536) != 0 ? issue4.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue4.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue4.statusReason : null);
            arrayList4.add(copy);
        }
        InterfaceC37857aG6 interfaceC37857aG6 = this.f118871a;
        WireBird wireBird = this.f118882l;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        AbstractC23442F progress$default = C28237sD.progress$default(InterfaceC37857aG6.C10609b.logRepairs$default(interfaceC37857aG6, wireBird.getId(), minus, arrayList4, WorkOrderCreateSource.SERVICE_CENTER, RepairSource.SERVICE_CENTER, null, 32, null), this.f118873c, 0, 2, (Object) null);
        final C30469z c30469z = new C30469z(this);
        AbstractC23442F m33101w = progress$default.m33101w(new InterfaceC23484g() { // from class: Yz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C52048yA4.m3939l0(Function1.this, obj2);
            }
        });
        final C30439A c30439a = new C30439A(arrayList4, this);
        AbstractC23442F m33157I = m33101w.m33157I(new InterfaceC23492o() { // from class: Zz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj2) {
                Pair m3937m0;
                m3937m0 = C52048yA4.m3937m0(Function1.this, obj2);
                return m3937m0;
            }
        });
        final C30440B c30440b = new C30440B();
        AbstractC23442F m33152N = m33157I.m33101w(new InterfaceC23484g() { // from class: aA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C52048yA4.m3935n0(Function1.this, obj2);
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun updateRepai…)\n      }, ::onError)\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f118874d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30441C c30441c = new C30441C();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C52048yA4.m3933o0(Function1.this, obj2);
            }
        };
        final C30442D c30442d = new C30442D(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cA4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C52048yA4.m3931p0(Function1.this, obj2);
            }
        });
    }

    /* renamed from: k0 */
    public final void m3941k0(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f118873c.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f118873c.error(C45871nl4.error_generic_body);
        }
    }

    /* renamed from: q0 */
    public void m3929q0(WorkOrder workOrder) {
        if (workOrder != null) {
            this.f118878h.onNext(Optional.f63040c.m59033b(workOrder));
        }
    }
}
