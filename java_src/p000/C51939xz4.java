package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderCreateSource;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.IssueStatusReason;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.model.extension.Issue_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
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
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.danlew.android.joda.DateUtils;
import p000.C51939xz4;
import p000.InterfaceC37857aG6;
import p000.InterfaceC40099e13;
import p000.InterfaceC45686nS1;
@Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\bK\u0010LJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\f*\u00020\u000bH\u0002J4\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u000e0\u000e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u00109\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u000b0\u000b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020: 4*\n\u0012\u0004\u0012\u00020:\u0018\u00010\f0\f038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020A\u0012\u0006\u0012\u0004\u0018\u00010\u000b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR:\u0010J\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020G 4*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020G\u0018\u00010F0F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, m28432d2 = {"Lxz4;", "LYy4;", "Lco/bird/android/model/RepairType;", "repairType", "Lco/bird/android/model/wire/WirePart;", "part", "", "N", "", "e", "a0", "Lco/bird/android/model/Issue;", "", "U", "Lco/bird/android/model/wire/WireBird;", "bird", "supertype", "Lco/bird/android/model/LegacyRepair;", "selectedRepairs", "repairTypes", C17296a.f69688o, "b", "LaG6;", "LaG6;", "workOrderManager", "Lsu2;", "Lsu2;", "localAssetManager", "LnS1;", "c", "LnS1;", "idToolsManager", "LCy4;", DateTokenConverter.CONVERTER_KEY, "LCy4;", "repairAnalyticsManager", "LFz4;", "LFz4;", "ui", "Le13;", "f", "Le13;", "navigator", "LUy4;", "g", "LUy4;", "converter", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "birdSubject", "j", "supertypeSubject", "Lco/bird/android/model/RepairTypeLock;", "k", "selectedRepairsSubject", "", "l", "Ljava/util/List;", "", "", "m", "Ljava/util/Map;", "originalIssues", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "", "n", "Lio/reactivex/subjects/d;", "repairTypeChecksSubject", "<init>", "(LaG6;Lsu2;LnS1;LCy4;LFz4;Le13;LUy4;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n180#2:404\n180#2:405\n180#2:406\n180#2:407\n180#2:408\n180#2:417\n180#2:418\n199#2:419\n1549#3:409\n1620#3,3:410\n1549#3:413\n1620#3,3:414\n766#3:425\n857#3,2:426\n9#4,4:420\n1#5:424\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl\n*L\n92#1:404\n108#1:405\n186#1:406\n209#1:407\n228#1:408\n279#1:417\n302#1:418\n356#1:419\n234#1:409\n234#1:410,3\n237#1:413\n237#1:414,3\n379#1:425\n379#1:426,2\n369#1:420,4\n*E\n"})
/* renamed from: xz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51939xz4 implements InterfaceC37449Yy4 {

    /* renamed from: a */
    public final InterfaceC37857aG6 f118500a;

    /* renamed from: b */
    public final InterfaceC48923su2 f118501b;

    /* renamed from: c */
    public final InterfaceC45686nS1 f118502c;

    /* renamed from: d */
    public final InterfaceC32301Cy4 f118503d;

    /* renamed from: e */
    public final InterfaceC33012Fz4 f118504e;

    /* renamed from: f */
    public final InterfaceC40099e13 f118505f;

    /* renamed from: g */
    public final InterfaceC36513Uy4 f118506g;

    /* renamed from: h */
    public final ScopeProvider f118507h;

    /* renamed from: i */
    public final C24552a<WireBird> f118508i;

    /* renamed from: j */
    public final C24552a<Issue> f118509j;

    /* renamed from: k */
    public final C24552a<List<RepairTypeLock>> f118510k;

    /* renamed from: l */
    public final List<RepairType> f118511l;

    /* renamed from: m */
    public final Map<String, Issue> f118512m;

    /* renamed from: n */
    public final C24558d<Pair<RepairType, Boolean>> f118513n;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$a */
    /* loaded from: classes3.dex */
    public static final class C30359a extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C30359a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            C51939xz4.this.f118509j.onNext(pair.component1());
            C51939xz4.this.f118510k.onNext(pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Issue;", "updatedIssue", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/Issue;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz4$b */
    /* loaded from: classes3.dex */
    public static final class C30360b extends Lambda implements Function1<Issue, InterfaceC23447K<? extends Issue>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "<name for destructuring parameter 0>", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Issue;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xz4$b$a */
        /* loaded from: classes3.dex */
        public static final class C30361a extends Lambda implements Function1<Pair<? extends IssueStatus, ? extends IssueStatusReason>, Issue> {

            /* renamed from: g */
            public final /* synthetic */ Issue f118516g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30361a(Issue issue) {
                super(1);
                this.f118516g = issue;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Issue invoke(Pair<? extends IssueStatus, ? extends IssueStatusReason> pair) {
                Issue copy;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Issue updatedIssue = this.f118516g;
                Intrinsics.checkNotNullExpressionValue(updatedIssue, "updatedIssue");
                copy = updatedIssue.copy((r37 & 1) != 0 ? updatedIssue.f66598id : null, (r37 & 2) != 0 ? updatedIssue.workOrderId : null, (r37 & 4) != 0 ? updatedIssue.issueTypeId : null, (r37 & 8) != 0 ? updatedIssue.display : null, (r37 & 16) != 0 ? updatedIssue.description : null, (r37 & 32) != 0 ? updatedIssue.status : pair.component1(), (r37 & 64) != 0 ? updatedIssue.statusDisplay : null, (r37 & 128) != 0 ? updatedIssue.statusColor : null, (r37 & 256) != 0 ? updatedIssue.statusReasonDisplay : null, (r37 & 512) != 0 ? updatedIssue.source : null, (r37 & 1024) != 0 ? updatedIssue.sourceDisplay : null, (r37 & 2048) != 0 ? updatedIssue.createdBy : null, (r37 & 4096) != 0 ? updatedIssue.createdAt : null, (r37 & 8192) != 0 ? updatedIssue.updatedAt : null, (r37 & 16384) != 0 ? updatedIssue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? updatedIssue.assetId : null, (r37 & 65536) != 0 ? updatedIssue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? updatedIssue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? updatedIssue.statusReason : pair.component2());
                return copy;
            }
        }

        public C30360b() {
            super(1);
        }

        /* renamed from: c */
        public static final Issue m4300c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Issue) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Issue> invoke(Issue updatedIssue) {
            Intrinsics.checkNotNullParameter(updatedIssue, "updatedIssue");
            if (updatedIssue.getStatus() == IssueStatus.CANT_REPAIR && updatedIssue.getStatusReason() == null) {
                Observable<Pair<IssueStatus, IssueStatusReason>> mo104526je = C51939xz4.this.f118504e.mo104526je(updatedIssue);
                final C30361a c30361a = new C30361a(updatedIssue);
                return mo104526je.map(new InterfaceC23492o() { // from class: yz4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Issue m4300c;
                        m4300c = C51939xz4.C30360b.m4300c(Function1.this, obj);
                        return m4300c;
                    }
                }).firstOrError();
            }
            return AbstractC23442F.m33158H(updatedIssue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/Issue;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz4$c */
    /* loaded from: classes3.dex */
    public static final class C30362c extends Lambda implements Function1<Pair<? extends Issue, ? extends Issue>, Issue> {

        /* renamed from: g */
        public static final C30362c f118517g = new C30362c();

        public C30362c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Issue invoke(Pair<Issue, Issue> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Issue updatedSubtype = pair.component1();
            Issue supertype = pair.component2();
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            Intrinsics.checkNotNullExpressionValue(updatedSubtype, "updatedSubtype");
            return Issue_Kt.updateIssue(supertype, updatedSubtype);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30363d extends FunctionReferenceImpl implements Function1<Issue, Unit> {
        public C30363d(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m4297a(Issue p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Issue issue) {
            m4297a(issue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,403:1\n1549#2:404\n1620#2,3:405\n1774#2,4:410\n37#3,2:408\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$1\n*L\n78#1:404\n78#1:405,3\n81#1:410,4\n78#1:408,2\n*E\n"})
    /* renamed from: xz4$e */
    /* loaded from: classes3.dex */
    public static final class C30364e extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C30364e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            int collectionSizeOrDefault;
            Set of;
            Issue supertype = pair.component1();
            List<RepairTypeLock> selectedRepairs = pair.component2();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(supertype.getIssueTypeId());
            List<Issue> subtypes = supertype.getSubtypes();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : subtypes) {
                arrayList.add(issue.getIssueTypeId());
            }
            int i = 0;
            spreadBuilder.addSpread(arrayList.toArray(new String[0]));
            of = SetsKt__SetsKt.setOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            List<RepairTypeLock> list = selectedRepairs;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                int i2 = 0;
                for (RepairTypeLock repairTypeLock : list) {
                    if ((of.contains(repairTypeLock.component1().getIssueTypeId()) && !repairTypeLock.component2()) && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i = i2;
            }
            C51939xz4.this.f118504e.mo104531W6(i);
            InterfaceC33012Fz4 interfaceC33012Fz4 = C51939xz4.this.f118504e;
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            interfaceC33012Fz4.mo104523p6(supertype, selectedRepairs);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz4$f */
    /* loaded from: classes3.dex */
    public static final class C30365f extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C30365f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Issue supertype = pair.component1();
            List<RepairTypeLock> selectedRepairs = pair.component2();
            InterfaceC36513Uy4 interfaceC36513Uy4 = C51939xz4.this.f118506g;
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            return interfaceC36513Uy4.mo77595a(supertype, selectedRepairs, C51939xz4.this.f118511l, C51939xz4.this.f118512m);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30366g extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C30366g(Object obj) {
            super(1, obj, InterfaceC33012Fz4.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC33012Fz4) this.receiver).mo104530b(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30368i extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C30368i(Object obj) {
            super(1, obj, InterfaceC33012Fz4.class, "enableLogRepairs", "enableLogRepairs(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC33012Fz4) this.receiver).mo104528ge(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz4$j */
    /* loaded from: classes3.dex */
    public static final class C30369j extends Lambda implements Function1<Pair<? extends RepairType, ? extends Boolean>, InterfaceC23447K<? extends Pair<? extends RepairType, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xz4$j$a */
        /* loaded from: classes3.dex */
        public static final class C30370a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C51939xz4 f118522g;

            /* renamed from: h */
            public final /* synthetic */ PartKind f118523h;

            /* renamed from: i */
            public final /* synthetic */ RepairType f118524i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30370a(C51939xz4 c51939xz4, PartKind partKind, RepairType repairType) {
                super(1);
                this.f118522g = c51939xz4;
                this.f118523h = partKind;
                this.f118524i = repairType;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                InterfaceC40099e13.C19924a.goToScanCode$default(this.f118522g.f118505f, null, null, this.f118523h, this.f118524i, false, false, false, null, 243, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xz4$j$b */
        /* loaded from: classes3.dex */
        public static final class C30371b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Pair<? extends RepairType, ? extends Boolean>>> {

            /* renamed from: g */
            public final /* synthetic */ RepairType f118525g;

            /* renamed from: h */
            public final /* synthetic */ boolean f118526h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30371b(RepairType repairType, boolean z) {
                super(1);
                this.f118525g = repairType;
                this.f118526h = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends Pair<RepairType, Boolean>> invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23442F.m33158H(TuplesKt.m28425to(this.f118525g, Boolean.valueOf(this.f118526h)));
            }
        }

        public C30369j() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23447K m4292d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<RepairType, Boolean>> invoke(Pair<RepairType, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            RepairType component1 = pair.component1();
            boolean booleanValue = pair.component2().booleanValue();
            PartKind partKind = component1.getPartKind();
            String idToolDisplay = component1.getIdToolDisplay();
            if (booleanValue && partKind != null && idToolDisplay != null) {
                AbstractC23442F<Unit> firstOrError = C51939xz4.this.f118504e.mo104529g2(idToolDisplay).firstOrError();
                final C30370a c30370a = new C30370a(C51939xz4.this, partKind, component1);
                AbstractC23442F<Unit> m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: zz4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C51939xz4.C30369j.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C30371b c30371b = new C30371b(component1, booleanValue);
                return m33101w.m33165A(new InterfaceC23492o() { // from class: Az4
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K m4292d;
                        m4292d = C51939xz4.C30369j.m4292d(Function1.this, obj);
                        return m4292d;
                    }
                });
            }
            return AbstractC23442F.m33158H(TuplesKt.m28425to(component1, Boolean.valueOf(booleanValue)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0004*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00010\u00012T\u0010\b\u001aP\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0004*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,403:1\n223#2,2:404\n819#2:408\n847#2,2:409\n1747#2,3:411\n2624#2,3:414\n37#3,2:406\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$7\n*L\n138#1:404,2\n161#1:408\n161#1:409,2\n162#1:411,3\n174#1:414,3\n156#1:406,2\n*E\n"})
    /* renamed from: xz4$k */
    /* loaded from: classes3.dex */
    public static final class C30372k extends Lambda implements Function1<Triple<? extends Pair<? extends RepairType, ? extends Boolean>, ? extends Issue, ? extends List<? extends RepairTypeLock>>, Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>> {
        public C30372k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Issue, List<RepairTypeLock>> invoke(Triple<Pair<RepairType, Boolean>, Issue, ? extends List<RepairTypeLock>> triple) {
            Set<Issue> m108157a;
            boolean z;
            boolean z2;
            IssueStatus issueStatus;
            IssueStatusReason issueStatusReason;
            Issue copy;
            Issue m108155c;
            List listOf;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Pair<RepairType, Boolean> component1 = triple.component1();
            Issue supertype = triple.component2();
            List<RepairTypeLock> selectedRepairs = triple.component3();
            RepairType component12 = component1.component1();
            boolean booleanValue = component1.component2().booleanValue();
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            m108157a = C32778Ez4.m108157a(supertype);
            for (Issue issue : m108157a) {
                if (Intrinsics.areEqual(issue.getIssueTypeId(), component12.getIssueTypeId())) {
                    boolean z3 = false;
                    if (booleanValue) {
                        m108155c = C32778Ez4.m108155c(supertype, issue);
                        if (supertype.getStatus() != null) {
                            m108155c = m108155c.copy((r37 & 1) != 0 ? m108155c.f66598id : null, (r37 & 2) != 0 ? m108155c.workOrderId : null, (r37 & 4) != 0 ? m108155c.issueTypeId : null, (r37 & 8) != 0 ? m108155c.display : null, (r37 & 16) != 0 ? m108155c.description : null, (r37 & 32) != 0 ? m108155c.status : IssueStatus.RESOLVED, (r37 & 64) != 0 ? m108155c.statusDisplay : null, (r37 & 128) != 0 ? m108155c.statusColor : null, (r37 & 256) != 0 ? m108155c.statusReasonDisplay : null, (r37 & 512) != 0 ? m108155c.source : null, (r37 & 1024) != 0 ? m108155c.sourceDisplay : null, (r37 & 2048) != 0 ? m108155c.createdBy : null, (r37 & 4096) != 0 ? m108155c.createdAt : null, (r37 & 8192) != 0 ? m108155c.updatedAt : null, (r37 & 16384) != 0 ? m108155c.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m108155c.assetId : null, (r37 & 65536) != 0 ? m108155c.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m108155c.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m108155c.statusReason : null);
                        }
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                        spreadBuilder.addSpread(selectedRepairs.toArray(new RepairTypeLock[0]));
                        spreadBuilder.add(new RepairTypeLock(component12, false));
                        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new RepairTypeLock[spreadBuilder.size()]));
                        return new Pair<>(m108155c, listOf);
                    }
                    Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                    ArrayList<RepairTypeLock> arrayList = new ArrayList();
                    for (Object obj : selectedRepairs) {
                        if (!Intrinsics.areEqual(((RepairTypeLock) obj).component1().getId(), component12.getId())) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (RepairTypeLock repairTypeLock : arrayList) {
                            RepairType component13 = repairTypeLock.component1();
                            boolean component2 = repairTypeLock.component2();
                            if (Intrinsics.areEqual(component13.getIssueTypeId(), component12.getIssueTypeId()) && !component2) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (!z2 && issue.getStatus() != IssueStatus.CANT_REPAIR) {
                        Issue issue2 = (Issue) C51939xz4.this.f118512m.get(issue.getIssueTypeId());
                        IssueStatus issueStatus2 = null;
                        if (issue2 != null) {
                            issueStatus = issue2.getStatus();
                        } else {
                            issueStatus = null;
                        }
                        if (issue2 != null) {
                            issueStatusReason = issue2.getStatusReason();
                        } else {
                            issueStatusReason = null;
                        }
                        copy = issue.copy((r37 & 1) != 0 ? issue.f66598id : null, (r37 & 2) != 0 ? issue.workOrderId : null, (r37 & 4) != 0 ? issue.issueTypeId : null, (r37 & 8) != 0 ? issue.display : null, (r37 & 16) != 0 ? issue.description : null, (r37 & 32) != 0 ? issue.status : issueStatus, (r37 & 64) != 0 ? issue.statusDisplay : null, (r37 & 128) != 0 ? issue.statusColor : null, (r37 & 256) != 0 ? issue.statusReasonDisplay : null, (r37 & 512) != 0 ? issue.source : null, (r37 & 1024) != 0 ? issue.sourceDisplay : null, (r37 & 2048) != 0 ? issue.createdBy : null, (r37 & 4096) != 0 ? issue.createdAt : null, (r37 & 8192) != 0 ? issue.updatedAt : null, (r37 & 16384) != 0 ? issue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue.assetId : null, (r37 & 65536) != 0 ? issue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue.statusReason : issueStatusReason);
                        Issue updateIssue = Issue_Kt.updateIssue(supertype, copy);
                        if (!arrayList.isEmpty()) {
                            for (RepairTypeLock repairTypeLock2 : arrayList) {
                                if (!repairTypeLock2.component2()) {
                                    break;
                                }
                            }
                        }
                        z3 = true;
                        if (z3) {
                            Issue issue3 = (Issue) C51939xz4.this.f118512m.get(supertype.getIssueTypeId());
                            if (issue3 != null) {
                                issueStatus2 = issue3.getStatus();
                            }
                            supertype = updateIssue.copy((r37 & 1) != 0 ? updateIssue.f66598id : null, (r37 & 2) != 0 ? updateIssue.workOrderId : null, (r37 & 4) != 0 ? updateIssue.issueTypeId : null, (r37 & 8) != 0 ? updateIssue.display : null, (r37 & 16) != 0 ? updateIssue.description : null, (r37 & 32) != 0 ? updateIssue.status : issueStatus2, (r37 & 64) != 0 ? updateIssue.statusDisplay : null, (r37 & 128) != 0 ? updateIssue.statusColor : null, (r37 & 256) != 0 ? updateIssue.statusReasonDisplay : null, (r37 & 512) != 0 ? updateIssue.source : null, (r37 & 1024) != 0 ? updateIssue.sourceDisplay : null, (r37 & 2048) != 0 ? updateIssue.createdBy : null, (r37 & 4096) != 0 ? updateIssue.createdAt : null, (r37 & 8192) != 0 ? updateIssue.updatedAt : null, (r37 & 16384) != 0 ? updateIssue.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? updateIssue.assetId : null, (r37 & 65536) != 0 ? updateIssue.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? updateIssue.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? updateIssue.statusReason : null);
                        } else {
                            supertype = updateIssue;
                        }
                    }
                    return TuplesKt.m28425to(supertype, arrayList);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$l */
    /* loaded from: classes3.dex */
    public static final class C30373l extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C30373l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            C51939xz4.this.f118509j.onNext(pair.component1());
            C51939xz4.this.f118510k.onNext(pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u000624\u0010\u0005\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n819#2:404\n847#2,2:405\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$9\n*L\n202#1:404\n202#1:405,2\n*E\n"})
    /* renamed from: xz4$m */
    /* loaded from: classes3.dex */
    public static final class C30374m extends Lambda implements Function1<Triple<? extends Issue, ? extends Issue, ? extends List<? extends RepairTypeLock>>, Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>> {

        /* renamed from: g */
        public static final C30374m f118529g = new C30374m();

        public C30374m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<Issue, List<RepairTypeLock>> invoke(Triple<Issue, Issue, ? extends List<RepairTypeLock>> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Issue component1 = triple.component1();
            Issue supertype = triple.component2();
            List<RepairTypeLock> selectedRepairs = triple.component3();
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            Issue updateIssue = Issue_Kt.updateIssue(supertype, component1);
            if (component1.getStatus() == IssueStatus.DISPUTED) {
                Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                ArrayList arrayList = new ArrayList();
                for (Object obj : selectedRepairs) {
                    RepairTypeLock repairTypeLock = (RepairTypeLock) obj;
                    RepairType component12 = repairTypeLock.component1();
                    boolean component2 = repairTypeLock.component2();
                    if (Intrinsics.areEqual(component12.getIssueTypeId(), component1.getIssueTypeId()) && !component2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(obj);
                    }
                }
                selectedRepairs = arrayList;
            }
            return TuplesKt.m28425to(updateIssue, selectedRepairs);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xz4$n */
    /* loaded from: classes3.dex */
    public static final class C30375n extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends WireBird>> {

        /* renamed from: h */
        public final /* synthetic */ WirePart f118531h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePart;", "it", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xz4$n$a */
        /* loaded from: classes3.dex */
        public static final class C30376a extends Lambda implements Function1<List<? extends WirePart>, WireBird> {

            /* renamed from: g */
            public final /* synthetic */ WireBird f118532g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30376a(WireBird wireBird) {
                super(1);
                this.f118532g = wireBird;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireBird invoke(List<WirePart> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f118532g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30375n(WirePart wirePart) {
            super(1);
            this.f118531h = wirePart;
        }

        /* renamed from: c */
        public static final WireBird m4287c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireBird) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WireBird> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            AbstractC23442F attachParts$default = InterfaceC45686nS1.C26513a.attachParts$default(C51939xz4.this.f118502c, bird, new WirePart[]{this.f118531h}, null, null, 12, null);
            final C30376a c30376a = new C30376a(bird);
            return attachParts$default.m33157I(new InterfaceC23492o() { // from class: Bz4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireBird m4287c;
                    m4287c = C51939xz4.C30375n.m4287c(Function1.this, obj);
                    return m4287c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0092\u0001\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0002*\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000 \u0002*H\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0002*\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Issue;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/android/model/LegacyRepair;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n223#2,2:404\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$2\n*L\n324#1:404,2\n*E\n"})
    /* renamed from: xz4$o */
    /* loaded from: classes3.dex */
    public static final class C30377o extends Lambda implements Function1<Pair<? extends WireBird, ? extends Issue>, InterfaceC23447K<? extends Pair<? extends Issue, ? extends List<? extends LegacyRepair>>>> {

        /* renamed from: h */
        public final /* synthetic */ RepairType f118534h;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a>\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0004*\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepair;", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
        /* renamed from: xz4$o$a */
        /* loaded from: classes3.dex */
        public static final class C30378a extends Lambda implements Function1<WorkOrder, Pair<? extends Issue, ? extends List<? extends LegacyRepair>>> {

            /* renamed from: g */
            public final /* synthetic */ Issue f118535g;

            /* renamed from: h */
            public final /* synthetic */ Issue f118536h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30378a(Issue issue, Issue issue2) {
                super(1);
                this.f118535g = issue;
                this.f118536h = issue2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
                if (r0 == null) goto L8;
             */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Pair<Issue, List<LegacyRepair>> invoke(WorkOrder workOrder) {
                Issue issue;
                Intrinsics.checkNotNullParameter(workOrder, "workOrder");
                Issue issue2 = this.f118535g;
                if (issue2 != null) {
                    Issue supertype = this.f118536h;
                    Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
                    issue = C32778Ez4.m108155c(supertype, issue2);
                }
                issue = this.f118536h;
                return TuplesKt.m28425to(issue, workOrder.getRepairs());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30377o(RepairType repairType) {
            super(1);
            this.f118534h = repairType;
        }

        /* renamed from: c */
        public static final Pair m4283c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Issue, List<LegacyRepair>>> invoke(Pair<WireBird, Issue> pair) {
            Set<Issue> m108157a;
            Issue issue;
            List listOf;
            List listOfNotNull;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireBird component1 = pair.component1();
            Issue supertype = pair.component2();
            Intrinsics.checkNotNullExpressionValue(supertype, "supertype");
            m108157a = C32778Ez4.m108157a(supertype);
            RepairType repairType = this.f118534h;
            for (Issue issue2 : m108157a) {
                if (Intrinsics.areEqual(issue2.getIssueTypeId(), repairType.getIssueTypeId())) {
                    if (issue2.getStatus() != IssueStatus.CANT_REPAIR) {
                        issue = issue2.copy((r37 & 1) != 0 ? issue2.f66598id : null, (r37 & 2) != 0 ? issue2.workOrderId : null, (r37 & 4) != 0 ? issue2.issueTypeId : null, (r37 & 8) != 0 ? issue2.display : null, (r37 & 16) != 0 ? issue2.description : null, (r37 & 32) != 0 ? issue2.status : IssueStatus.RESOLVED, (r37 & 64) != 0 ? issue2.statusDisplay : null, (r37 & 128) != 0 ? issue2.statusColor : null, (r37 & 256) != 0 ? issue2.statusReasonDisplay : null, (r37 & 512) != 0 ? issue2.source : null, (r37 & 1024) != 0 ? issue2.sourceDisplay : null, (r37 & 2048) != 0 ? issue2.createdBy : null, (r37 & 4096) != 0 ? issue2.createdAt : null, (r37 & 8192) != 0 ? issue2.updatedAt : null, (r37 & 16384) != 0 ? issue2.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue2.assetId : null, (r37 & 65536) != 0 ? issue2.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue2.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue2.statusReason : null);
                    } else {
                        issue = null;
                    }
                    InterfaceC37857aG6 interfaceC37857aG6 = C51939xz4.this.f118500a;
                    String id = component1.getId();
                    listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f118534h);
                    listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(issue);
                    AbstractC23442F logRepairs$default = InterfaceC37857aG6.C10609b.logRepairs$default(interfaceC37857aG6, id, listOf, listOfNotNull, null, RepairSource.SERVICE_CENTER, null, 40, null);
                    final C30378a c30378a = new C30378a(issue, supertype);
                    return logRepairs$default.m33157I(new InterfaceC23492o() { // from class: Cz4
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m4283c;
                            m4283c = C51939xz4.C30377o.m4283c(Function1.this, obj);
                            return m4283c;
                        }
                    });
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$p */
    /* loaded from: classes3.dex */
    public static final class C30379p extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30379p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends LegacyRepair>> pair) {
            invoke2((Pair<Issue, ? extends List<LegacyRepair>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<LegacyRepair>> pair) {
            Issue updatedSupertype = pair.component1();
            C51939xz4 c51939xz4 = C51939xz4.this;
            Intrinsics.checkNotNullExpressionValue(updatedSupertype, "updatedSupertype");
            List<Issue> m4335U = c51939xz4.m4335U(updatedSupertype);
            C51939xz4.this.f118503d.mo106118c(pair.component2(), m4335U);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00010\u00012b\u0010\u0006\u001a^\u0012@\u0012>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0001H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "Lco/bird/android/model/LegacyRepair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$4\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,403:1\n37#2,2:404\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$4\n*L\n352#1:404,2\n*E\n"})
    /* renamed from: xz4$q */
    /* loaded from: classes3.dex */
    public static final class C30380q extends Lambda implements Function1<Pair<? extends Pair<? extends Issue, ? extends List<? extends LegacyRepair>>, ? extends List<? extends RepairTypeLock>>, Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>> {

        /* renamed from: g */
        public final /* synthetic */ RepairType f118538g;

        /* renamed from: h */
        public final /* synthetic */ WirePart f118539h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30380q(RepairType repairType, WirePart wirePart) {
            super(1);
            this.f118538g = repairType;
            this.f118539h = wirePart;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> invoke(Pair<? extends Pair<? extends Issue, ? extends List<? extends LegacyRepair>>, ? extends List<? extends RepairTypeLock>> pair) {
            return invoke2((Pair<? extends Pair<Issue, ? extends List<LegacyRepair>>, ? extends List<RepairTypeLock>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<Issue, List<RepairTypeLock>> invoke2(Pair<? extends Pair<Issue, ? extends List<LegacyRepair>>, ? extends List<RepairTypeLock>> pair) {
            RepairType copy;
            List listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<RepairTypeLock> selectedRepairs = pair.component2();
            Issue first = pair.component1().getFirst();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            spreadBuilder.addSpread(selectedRepairs.toArray(new RepairTypeLock[0]));
            copy = r5.copy((r22 & 1) != 0 ? r5.f66624id : null, (r22 & 2) != 0 ? r5.issueTypeId : null, (r22 & 4) != 0 ? r5.display : null, (r22 & 8) != 0 ? r5.description : null, (r22 & 16) != 0 ? r5.requireNotes : false, (r22 & 32) != 0 ? r5.repairScopes : null, (r22 & 64) != 0 ? r5.assetId : null, (r22 & 128) != 0 ? r5.partKind : null, (r22 & 256) != 0 ? r5.idToolDisplay : null, (r22 & 512) != 0 ? this.f118538g.notes : this.f118539h.getKey());
            spreadBuilder.add(new RepairTypeLock(copy, true));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new RepairTypeLock[spreadBuilder.size()]));
            return new Pair<>(first, listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$addPart$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
    /* renamed from: xz4$r */
    /* loaded from: classes3.dex */
    public static final class C30381r extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ RepairType f118541h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30381r(RepairType repairType) {
            super(1);
            this.f118541h = repairType;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            C51939xz4.this.f118509j.onNext(pair.component1());
            C51939xz4.this.f118510k.onNext(pair.component2());
            String idToolDisplay = this.f118541h.getIdToolDisplay();
            if (idToolDisplay != null) {
                C51939xz4.this.f118504e.mo104527h7(idToolDisplay);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$s */
    /* loaded from: classes3.dex */
    public static final class C30382s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ RepairType f118543h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30382s(RepairType repairType) {
            super(1);
            this.f118543h = repairType;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C51939xz4 c51939xz4 = C51939xz4.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c51939xz4.m4328a0(e);
            C51939xz4.this.f118513n.onNext(TuplesKt.m28425to(this.f118543h, Boolean.FALSE));
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0092\u0001\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\b0\b \u0003*H\u0012B\b\u0001\u0012>\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/LegacyRepair;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$onCreate$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n766#2:404\n857#2,2:405\n1549#2:407\n1620#2,3:408\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$onCreate$4\n*L\n253#1:404\n253#1:405,2\n254#1:407\n254#1:408,3\n*E\n"})
    /* renamed from: xz4$t */
    /* loaded from: classes3.dex */
    public static final class C30383t extends Lambda implements Function1<Triple<? extends Unit, ? extends Issue, ? extends List<? extends RepairTypeLock>>, InterfaceC23447K<? extends Pair<? extends Issue, ? extends List<? extends LegacyRepair>>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f118545h;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a>\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0004*\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepair;", C17296a.f69688o, "(Lco/bird/android/model/WorkOrder;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xz4$t$a */
        /* loaded from: classes3.dex */
        public static final class C30384a extends Lambda implements Function1<WorkOrder, Pair<? extends Issue, ? extends List<? extends LegacyRepair>>> {

            /* renamed from: g */
            public final /* synthetic */ Issue f118546g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30384a(Issue issue) {
                super(1);
                this.f118546g = issue;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Issue, List<LegacyRepair>> invoke(WorkOrder workOrder) {
                Intrinsics.checkNotNullParameter(workOrder, "workOrder");
                return TuplesKt.m28425to(this.f118546g, workOrder.getRepairs());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30383t(WireBird wireBird) {
            super(1);
            this.f118545h = wireBird;
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Issue, List<LegacyRepair>>> invoke(Triple<Unit, Issue, ? extends List<RepairTypeLock>> triple) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Issue updatedSupertype = triple.component2();
            List<RepairTypeLock> selectedRepairs = triple.component3();
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            ArrayList<RepairTypeLock> arrayList = new ArrayList();
            for (Object obj : selectedRepairs) {
                if (!((RepairTypeLock) obj).component2()) {
                    arrayList.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (RepairTypeLock repairTypeLock : arrayList) {
                arrayList2.add(repairTypeLock.component1());
            }
            C51939xz4 c51939xz4 = C51939xz4.this;
            Intrinsics.checkNotNullExpressionValue(updatedSupertype, "updatedSupertype");
            AbstractC23442F progress$default = C28237sD.progress$default(C51939xz4.this.f118500a.mo19634s(this.f118545h.getId(), arrayList2, c51939xz4.m4335U(updatedSupertype), WorkOrderCreateSource.SERVICE_CENTER, RepairSource.SERVICE_CENTER, IssueCreateSource.REPAIR), C51939xz4.this.f118504e, 0, 2, (Object) null);
            final C30384a c30384a = new C30384a(updatedSupertype);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: Dz4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Pair invoke$lambda$2;
                    invoke$lambda$2 = C51939xz4.C30383t.invoke$lambda$2(Function1.this, obj2);
                    return invoke$lambda$2;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$u */
    /* loaded from: classes3.dex */
    public static final class C30385u extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30385u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends LegacyRepair>> pair) {
            invoke2((Pair<Issue, ? extends List<LegacyRepair>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<LegacyRepair>> pair) {
            Issue updatedSupertype = pair.component1();
            C51939xz4 c51939xz4 = C51939xz4.this;
            Intrinsics.checkNotNullExpressionValue(updatedSupertype, "updatedSupertype");
            List<Issue> m4335U = c51939xz4.m4335U(updatedSupertype);
            C51939xz4.this.f118503d.mo106118c(pair.component2(), m4335U);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30386v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30386v(Object obj) {
            super(1, obj, C51939xz4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C51939xz4) this.receiver).m4328a0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/LegacyRepair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$onCreate$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n1747#2,3:404\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$onCreate$7\n*L\n284#1:404,3\n*E\n"})
    /* renamed from: xz4$w */
    /* loaded from: classes3.dex */
    public static final class C30387w extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends LegacyRepair>>, Unit> {
        public C30387w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends LegacyRepair>> pair) {
            invoke2((Pair<Issue, ? extends List<LegacyRepair>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<LegacyRepair>> pair) {
            boolean m108156b;
            Issue updatedSupertype = pair.component1();
            List<LegacyRepair> component2 = pair.component2();
            C51939xz4 c51939xz4 = C51939xz4.this;
            Intrinsics.checkNotNullExpressionValue(updatedSupertype, "updatedSupertype");
            List m4335U = c51939xz4.m4335U(updatedSupertype);
            boolean z = false;
            if (!(m4335U instanceof Collection) || !m4335U.isEmpty()) {
                Iterator it = m4335U.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    m108156b = C32778Ez4.m108156b(((Issue) it.next()).getStatus());
                    if (m108156b) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("issue", updatedSupertype);
                intent.putParcelableArrayListExtra("repairs", new ArrayList<>(component2));
                C51939xz4.this.f118505f.mo37029e4(-1, intent);
            } else {
                C51939xz4.this.f118505f.mo37050b1(-1);
            }
            C51939xz4.this.f118504e.mo104524o0(component2.size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xz4$x */
    /* loaded from: classes3.dex */
    public static final class C30388x extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f118550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30388x(WireBird wireBird) {
            super(1);
            this.f118550h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C51939xz4.this.f118505f.mo36946s3(this.f118550h);
        }
    }

    public C51939xz4(InterfaceC37857aG6 workOrderManager, InterfaceC48923su2 localAssetManager, InterfaceC45686nS1 idToolsManager, InterfaceC32301Cy4 repairAnalyticsManager, InterfaceC33012Fz4 ui, InterfaceC40099e13 navigator, InterfaceC36513Uy4 converter, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(idToolsManager, "idToolsManager");
        Intrinsics.checkNotNullParameter(repairAnalyticsManager, "repairAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f118500a = workOrderManager;
        this.f118501b = localAssetManager;
        this.f118502c = idToolsManager;
        this.f118503d = repairAnalyticsManager;
        this.f118504e = ui;
        this.f118505f = navigator;
        this.f118506g = converter;
        this.f118507h = scopeProvider;
        C24552a<WireBird> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f118508i = m31922e;
        C24552a<Issue> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Issue>()");
        this.f118509j = m31922e2;
        C24552a<List<RepairTypeLock>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<List<RepairTypeLock>>()");
        this.f118510k = m31922e3;
        this.f118511l = new ArrayList();
        this.f118512m = new LinkedHashMap();
        C24558d<Pair<RepairType, Boolean>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<RepairType, Boolean>>()");
        this.f118513n = m31902e;
        C24523e c24523e = C24523e.f91168a;
        Observable observeOn = c24523e.m31956a(m31922e2, m31922e3).sample(10L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        final C30364e c30364e = new C30364e();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: sz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4355A(Function1.this, obj);
            }
        });
        final C30365f c30365f = new C30365f();
        Observable observeOn2 = doOnNext.switchMapSingle(new InterfaceC23492o() { // from class: wz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4354B;
                m4354B = C51939xz4.m4354B(Function1.this, obj);
                return m4354B;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30366g c30366g = new C30366g(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: az4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4350F(Function1.this, obj);
            }
        });
        Observable m31956a = c24523e.m31956a(m31922e2, m31922e3);
        final C30367h c30367h = new C30367h();
        Observable observeOn3 = m31956a.map(new InterfaceC23492o() { // from class: bz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m4349G;
                m4349G = C51939xz4.m4349G(Function1.this, obj);
                return m4349G;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30368i c30368i = new C30368i(ui);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: cz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4348H(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(ui.mo104533T1(), m31902e);
        final C30369j c30369j = new C30369j();
        Observable flatMapSingle = merge.flatMapSingle(new InterfaceC23492o() { // from class: dz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4347I;
                m4347I = C51939xz4.m4347I(Function1.this, obj);
                return m4347I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "merge(\n      ui.repairCh…lected)\n        }\n      }");
        Observable m31949b = C24527f.m31949b(flatMapSingle, m31922e2, m31922e3);
        final C30372k c30372k = new C30372k();
        Observable map = m31949b.map(new InterfaceC23492o() { // from class: ez4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m4346J;
                m4346J = C51939xz4.m4346J(Function1.this, obj);
                return m4346J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "merge(\n      ui.repairCh…Repairs\n        }\n      }");
        Object m33094as3 = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30373l c30373l = new C30373l();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: fz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4345K(Function1.this, obj);
            }
        });
        Observable m31949b2 = C24527f.m31949b(ui.mo104534K0(), m31922e2, m31922e3);
        final C30374m c30374m = C30374m.f118529g;
        Observable map2 = m31949b2.map(new InterfaceC23492o() { // from class: gz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m4344L;
                m4344L = C51939xz4.m4344L(Function1.this, obj);
                return m4344L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "ui.issueUpdates()\n      …o filteredRepairs\n      }");
        Object m33094as4 = map2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30359a c30359a = new C30359a();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: hz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4343M(Function1.this, obj);
            }
        });
        Observable<Issue> mo104534K0 = ui.mo104534K0();
        final C30360b c30360b = new C30360b();
        Observable<R> flatMapSingle2 = mo104534K0.flatMapSingle(new InterfaceC23492o() { // from class: tz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4353C;
                m4353C = C51939xz4.m4353C(Function1.this, obj);
                return m4353C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "ui.issueUpdates()\n      …dIssue)\n        }\n      }");
        Observable m31950a = C24527f.m31950a(flatMapSingle2, m31922e2);
        final C30362c c30362c = C30362c.f118517g;
        Observable map3 = m31950a.map(new InterfaceC23492o() { // from class: uz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Issue m4352D;
                m4352D = C51939xz4.m4352D(Function1.this, obj);
                return m4352D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "ui.issueUpdates()\n      …teIssue(updatedSubtype) }");
        Object m33094as5 = map3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30363d c30363d = new C30363d(m31922e2);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: vz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4351E(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m4355A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23447K m4354B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m4353C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final Issue m4352D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Issue) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m4351E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m4350F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final Boolean m4349G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m4348H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23447K m4347I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final Pair m4346J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m4345K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final Pair m4344L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m4343M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m4341O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m4340P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m4339Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Pair m4338R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m4337S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m4336T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23447K m4334V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m4333W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m4332X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m4331Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m4330Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final void m4342N(RepairType repairType, WirePart wirePart) {
        AbstractC23442F<WireBird> firstOrError = this.f118508i.firstOrError();
        final C30375n c30375n = new C30375n(wirePart);
        AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: iz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4341O;
                m4341O = C51939xz4.m4341O(Function1.this, obj);
                return m4341O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun addPart(repa…ype to false)\n      }\n  }");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(m33165A, this.f118509j);
        final C30377o c30377o = new C30377o(repairType);
        AbstractC23442F m33165A2 = m74531s0.m33165A(new InterfaceC23492o() { // from class: jz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4340P;
                m4340P = C51939xz4.m4340P(Function1.this, obj);
                return m4340P;
            }
        });
        final C30379p c30379p = new C30379p();
        AbstractC23442F m33101w = m33165A2.m33101w(new InterfaceC23484g() { // from class: lz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4339Q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun addPart(repa…ype to false)\n      }\n  }");
        AbstractC23442F m74531s02 = C37279Yf5.m74531s0(m33101w, this.f118510k);
        final C30380q c30380q = new C30380q(repairType, wirePart);
        AbstractC23442F m33152N = m74531s02.m33157I(new InterfaceC23492o() { // from class: mz4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m4338R;
                m4338R = C51939xz4.m4338R(Function1.this, obj);
                return m4338R;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "private fun addPart(repa…ype to false)\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f118507h));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30381r c30381r = new C30381r(repairType);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: nz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4337S(Function1.this, obj);
            }
        };
        final C30382s c30382s = new C30382s(repairType);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: oz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4336T(Function1.this, obj);
            }
        });
    }

    /* renamed from: U */
    public final List<Issue> m4335U(Issue issue) {
        Set m108157a;
        IssueStatus issueStatus;
        boolean z;
        m108157a = C32778Ez4.m108157a(issue);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m108157a) {
            Issue issue2 = (Issue) obj;
            IssueStatus status = issue2.getStatus();
            Issue issue3 = this.f118512m.get(issue2.getIssueTypeId());
            if (issue3 != null) {
                issueStatus = issue3.getStatus();
            } else {
                issueStatus = null;
            }
            if (status != issueStatus) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC37449Yy4
    /* renamed from: a */
    public void mo4329a(WireBird bird, Issue supertype, List<LegacyRepair> selectedRepairs, List<RepairType> repairTypes) {
        Set<Issue> m108157a;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        this.f118511l.addAll(repairTypes);
        Map<String, Issue> map = this.f118512m;
        m108157a = C32778Ez4.m108157a(supertype);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m108157a, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : m108157a) {
            arrayList.add(TuplesKt.m28425to(issue.getIssueTypeId(), issue));
        }
        MapsKt__MapsKt.putAll(map, arrayList);
        this.f118508i.onNext(bird);
        this.f118509j.onNext(supertype);
        C24552a<List<RepairTypeLock>> c24552a = this.f118510k;
        List<LegacyRepair> list = selectedRepairs;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (LegacyRepair legacyRepair : list) {
            arrayList2.add(new RepairTypeLock(JF4.m100776a(legacyRepair), true));
        }
        c24552a.onNext(arrayList2);
        String assetId = supertype.getAssetId();
        if (assetId != null) {
            this.f118501b.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.URGENT);
        }
        Observable m31949b = C24527f.m31949b(this.f118504e.mo104532Tj(), this.f118509j, this.f118510k);
        final C30383t c30383t = new C30383t(bird);
        Observable flatMapSingle = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: Zy4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m4334V;
                m4334V = C51939xz4.m4334V(Function1.this, obj);
                return m4334V;
            }
        });
        final C30385u c30385u = new C30385u();
        Observable observeOn = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: kz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4333W(Function1.this, obj);
            }
        }).delay(500L, TimeUnit.MILLISECONDS, false).observeOn(C23454a.m33087a());
        final C30386v c30386v = new C30386v(this);
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: pz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4332X(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(bi…r.goToRouting(bird) }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f118507h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30387w c30387w = new C30387w();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4331Y(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f118504e.mo104535C0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.rerouteClicks()\n     …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f118507h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30388x c30388x = new C30388x(bird);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: rz4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51939xz4.m4330Z(Function1.this, obj);
            }
        });
    }

    /* renamed from: a0 */
    public final void m4328a0(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f118504e.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f118504e.error(C45871nl4.error_generic_body);
        }
    }

    @Override // p000.InterfaceC37449Yy4
    /* renamed from: b */
    public void mo4327b(RepairType repairType, WirePart part) {
        Intrinsics.checkNotNullParameter(repairType, "repairType");
        Intrinsics.checkNotNullParameter(part, "part");
        if (repairType.getPartKind() == part.getKind()) {
            m4342N(repairType, part);
            return;
        }
        this.f118513n.onNext(TuplesKt.m28425to(repairType, Boolean.FALSE));
        this.f118504e.mo104525li();
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012.\u0010\u0003\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairTypeLock;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairIssueSubtypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$4\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n37#2,2:404\n1747#3,3:406\n1747#3,3:409\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesPresenterImpl$4\n*L\n102#1:404,2\n102#1:406,3\n105#1:409,3\n*E\n"})
    /* renamed from: xz4$h */
    /* loaded from: classes3.dex */
    public static final class C30367h extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Boolean> {
        public C30367h() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
            if (r10 != false) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008b A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            List listOf;
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Issue component1 = pair.component1();
            List<RepairTypeLock> selectedRepairs = pair.component2();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(component1);
            boolean z4 = false;
            spreadBuilder.addSpread(component1.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            List<Issue> list = listOf;
            C51939xz4 c51939xz4 = C51939xz4.this;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Issue issue : list) {
                    Issue issue2 = (Issue) c51939xz4.f118512m.get(issue.getIssueTypeId());
                    if (issue.getStatus() == (issue2 != null ? issue2.getStatus() : null)) {
                        if (issue.getStatusReason() == (issue2 != null ? issue2.getStatusReason() : null)) {
                            z = false;
                            continue;
                            if (z) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    continue;
                    if (z) {
                    }
                }
            }
            z2 = false;
            if (!z2) {
                Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                List<RepairTypeLock> list2 = selectedRepairs;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (RepairTypeLock repairTypeLock : list2) {
                        if (!repairTypeLock.component2()) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
            }
            z4 = true;
            return Boolean.valueOf(z4);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            return invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
        }
    }
}
