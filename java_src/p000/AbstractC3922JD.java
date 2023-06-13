package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdSummary;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.extension.Issue_Kt;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.H31;
import p000.InterfaceC37857aG6;
@Metadata(m28433d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 z2\u00020\u0001:\u0001\tB?\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00106\u001a\u000203¢\u0006\u0004\bx\u0010yJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H$R\u001a\u0010\u0017\u001a\u00020\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R4\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000209 :*\n\u0012\u0004\u0012\u000209\u0018\u00010808078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\f0@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER4\u0010J\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020G :*\n\u0012\u0004\u0012\u00020G\u0018\u00010808078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010>R(\u0010N\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010K0K078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bL\u0010<\u001a\u0004\bM\u0010>R\u001a\u0010T\u001a\u00020O8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\"\u0010[\u001a\u00020A8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZRL\u0010`\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u0006 :*\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u0006\u0018\u00010\\0\\078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\b_\u0010>R4\u0010c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n :*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u0006078\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010<\u001a\u0004\bb\u0010>R \u0010i\u001a\b\u0012\u0004\u0012\u00020\f0d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR2\u0010o\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00060\\0j8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8$X¤\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8$X¤\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006{"}, m28432d2 = {"LJD;", "LXB4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "", "Lco/bird/android/model/LegacyRepair;", "repairs", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/RepairTypeLock;", "c", "Lco/bird/android/model/Issue;", "issue", "b", "onBackPressed", "", "error", "S", "LaM;", "LaM;", "getBirdManager", "()LaM;", "birdManager", "LGI3;", "LGI3;", "getPartnerManager", "()LGI3;", "partnerManager", "LaG6;", "LaG6;", "I", "()LaG6;", "workOrderManager", "Le13;", "Le13;", "B", "()Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "G", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LCy4;", "f", "LCy4;", "D", "()LCy4;", "repairAnalyticsManager", "LKD;", "g", "LKD;", "ui", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "J", "()Lio/reactivex/subjects/a;", "workOrderSubject", "", "", "i", "Ljava/util/Map;", "x", "()Ljava/util/Map;", "existingIssues", "Lco/bird/android/model/MobilePartner;", "j", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "partnerSubject", "Lco/bird/android/model/BirdSummaryBody;", "k", "w", "birdSummarySubject", "Lorg/joda/time/DateTime;", "l", "Lorg/joda/time/DateTime;", "getRepairStartTime", "()Lorg/joda/time/DateTime;", "repairStartTime", "m", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "sessionId", "", "Lco/bird/android/model/RepairType;", "n", "A", "issueRepairsSubject", "o", "E", "repairsSubject", "Ljava/util/Comparator;", "p", "Ljava/util/Comparator;", "z", "()Ljava/util/Comparator;", "issueComparator", "Lio/reactivex/Observable;", "q", "Lio/reactivex/Observable;", "y", "()Lio/reactivex/Observable;", "filteredIssueRepairs", "Lco/bird/android/model/RepairScope;", "F", "()Lco/bird/android/model/RepairScope;", Action.SCOPE_ATTRIBUTE, "Lco/bird/android/model/RepairSource;", "H", "()Lco/bird/android/model/RepairSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "<init>", "(LaM;LGI3;LaG6;Le13;Lcom/uber/autodispose/ScopeProvider;LCy4;LKD;)V", "r", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,319:1\n180#2:320\n180#2:321\n180#2:322\n199#2:323\n237#2:324\n199#2:395\n199#2:396\n766#3:325\n857#3,2:326\n819#3:328\n847#3:329\n1747#3,3:330\n848#3:333\n766#3:334\n857#3:335\n2624#3,3:336\n858#3:339\n1549#3:340\n1620#3,3:341\n1549#3:348\n1620#3,3:349\n1855#3:352\n766#3:353\n857#3:354\n1549#3:355\n1620#3,3:356\n858#3:361\n1549#3:362\n1620#3,3:363\n1855#3,2:366\n1856#3:368\n1549#3:369\n1620#3,3:370\n766#3:373\n857#3:374\n2624#3,3:375\n223#3,2:378\n858#3:380\n1855#3:381\n223#3,2:382\n1856#3:385\n223#3,2:386\n37#4,2:344\n37#4,2:346\n37#4,2:359\n1#5:384\n515#6:388\n500#6,6:389\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter\n*L\n120#1:320\n132#1:321\n144#1:322\n201#1:323\n225#1:324\n302#1:395\n309#1:396\n230#1:325\n230#1:326,2\n231#1:328\n231#1:329\n231#1:330,3\n231#1:333\n233#1:334\n233#1:335\n234#1:336,3\n233#1:339\n237#1:340\n237#1:341,3\n253#1:348\n253#1:349,3\n255#1:352\n257#1:353\n257#1:354\n260#1:355\n260#1:356,3\n257#1:361\n265#1:362\n265#1:363,3\n266#1:366,2\n255#1:368\n269#1:369\n269#1:370,3\n271#1:373\n271#1:374\n272#1:375,3\n273#1:378,2\n271#1:380\n275#1:381\n277#1:382,2\n275#1:385\n284#1:386,2\n241#1:344,2\n242#1:346,2\n260#1:359,2\n288#1:388\n288#1:389,6\n*E\n"})
/* renamed from: JD */
/* loaded from: classes3.dex */
public abstract class AbstractC3922JD implements XB4 {

    /* renamed from: r */
    public static final C3926d f17022r = new C3926d(null);

    /* renamed from: s */
    public static final List<IssueStatus> f17023s;

    /* renamed from: a */
    public final InterfaceC10636aM f17024a;

    /* renamed from: b */
    public final GI3 f17025b;

    /* renamed from: c */
    public final InterfaceC37857aG6 f17026c;

    /* renamed from: d */
    public final InterfaceC40099e13 f17027d;

    /* renamed from: e */
    public final ScopeProvider f17028e;

    /* renamed from: f */
    public final InterfaceC32301Cy4 f17029f;

    /* renamed from: g */
    public final InterfaceC4380KD f17030g;

    /* renamed from: h */
    public final C24552a<Optional<WorkOrder>> f17031h;

    /* renamed from: i */
    public final Map<String, Issue> f17032i;

    /* renamed from: j */
    public final C24552a<Optional<MobilePartner>> f17033j;

    /* renamed from: k */
    public final C24552a<BirdSummaryBody> f17034k;

    /* renamed from: l */
    public final DateTime f17035l;

    /* renamed from: m */
    public String f17036m;

    /* renamed from: n */
    public final C24552a<Map<Issue, List<RepairType>>> f17037n;

    /* renamed from: o */
    public final C24552a<List<RepairTypeLock>> f17038o;

    /* renamed from: p */
    public final Comparator<Issue> f17039p;

    /* renamed from: q */
    public final Observable<Map<Issue, List<RepairType>>> f17040q;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2³\u0001\u0010\u0007\u001a®\u0001\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003 \u0005*V\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/Issue;", "", "", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JD$a */
    /* loaded from: classes3.dex */
    public static final class C3923a extends Lambda implements Function1<Triple<? extends Issue, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C3923a() {
            super(1);
        }

        /* renamed from: a */
        public final void m100964a(Triple<Issue, ? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> triple) {
            Issue component1 = triple.component1();
            List<RepairTypeLock> repairs = triple.component3();
            List<RepairType> list = triple.component2().get(component1);
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            InterfaceC40099e13 m101003B = AbstractC3922JD.this.m101003B();
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            m101003B.mo37167G0(component1, list, repairs);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Issue, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>> triple) {
            m100964a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00012³\u0001\u0010\b\u001a®\u0001\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*V\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n1549#2:320\n1620#2,3:321\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$2\n*L\n135#1:320\n135#1:321,3\n*E\n"})
    /* renamed from: JD$b */
    /* loaded from: classes3.dex */
    public static final class C3924b extends Lambda implements Function1<Triple<? extends Unit, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C3924b() {
            super(1);
        }

        /* renamed from: a */
        public final void m100963a(Triple<Unit, ? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> triple) {
            int collectionSizeOrDefault;
            List<RepairType> flatten;
            Map<Issue, ? extends List<RepairType>> component2 = triple.component2();
            List<RepairTypeLock> component3 = triple.component3();
            InterfaceC40099e13 m101003B = AbstractC3922JD.this.m101003B();
            Set<Issue> keySet = component2.keySet();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : keySet) {
                arrayList.add(Issue_Kt.toIssueType(issue));
            }
            flatten = CollectionsKt__IterablesKt.flatten(component2.values());
            m101003B.mo37114P(arrayList, flatten, component3);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>> triple) {
            m100963a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairTypeLock;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$3\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n37#2,2:320\n1549#3:322\n1620#3,3:323\n766#3:326\n857#3,2:327\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$3\n*L\n146#1:320,2\n146#1:322\n146#1:323,3\n147#1:326\n147#1:327,2\n*E\n"})
    /* renamed from: JD$c */
    /* loaded from: classes3.dex */
    public static final class C3925c extends Lambda implements Function1<Pair<? extends Issue, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C3925c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Issue, ? extends List<? extends RepairTypeLock>> pair) {
            invoke2((Pair<Issue, ? extends List<RepairTypeLock>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Issue, ? extends List<RepairTypeLock>> pair) {
            List listOf;
            int collectionSizeOrDefault;
            Issue component1 = pair.component1();
            List<RepairTypeLock> repairs = pair.component2();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(component1);
            spreadBuilder.addSpread(component1.getSubtypes().toArray(new Issue[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Issue[spreadBuilder.size()]));
            List<Issue> list = listOf;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Issue issue : list) {
                arrayList.add(issue.getIssueTypeId());
            }
            Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : repairs) {
                if (arrayList.contains(((RepairTypeLock) obj).component1().getIssueTypeId())) {
                    arrayList2.add(obj);
                }
            }
            AbstractC3922JD.this.m101003B().mo37092T0(component1, arrayList2, 10016);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LJD$d;", "", "", "Lco/bird/android/model/IssueStatus;", "OPEN_STATUSES", "Ljava/util/List;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: JD$d */
    /* loaded from: classes3.dex */
    public static final class C3926d {
        public /* synthetic */ C3926d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3926d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00012R\u0010\u0007\u001aN\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0005*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Pair;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$filteredIssueRepairs$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n515#2:320\n500#2,2:321\n502#2,4:326\n1747#3,3:323\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$filteredIssueRepairs$1\n*L\n106#1:320\n106#1:321,2\n106#1:326,4\n108#1:323,3\n*E\n"})
    /* renamed from: JD$e */
    /* loaded from: classes3.dex */
    public static final class C3927e extends Lambda implements Function1<Pair<? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, Map<Issue, ? extends List<? extends RepairType>>> {
        public C3927e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<Issue, List<RepairType>> invoke(Pair<? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> pair) {
            IssueStatus issueStatus;
            boolean z;
            boolean z2;
            boolean contains;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Map<Issue, ? extends List<RepairType>> issueRepairs = pair.component1();
            List<RepairTypeLock> repairs = pair.component2();
            Intrinsics.checkNotNullExpressionValue(issueRepairs, "issueRepairs");
            AbstractC3922JD abstractC3922JD = AbstractC3922JD.this;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Issue, ? extends List<RepairType>> entry : issueRepairs.entrySet()) {
                Issue key = entry.getKey();
                Issue issue = abstractC3922JD.m100967x().get(key.getIssueTypeId());
                if (issue != null) {
                    issueStatus = issue.getStatus();
                } else {
                    issueStatus = null;
                }
                Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
                List<RepairTypeLock> list = repairs;
                boolean z3 = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (RepairTypeLock repairTypeLock : list) {
                        RepairType component1 = repairTypeLock.component1();
                        boolean component2 = repairTypeLock.component2();
                        if (Intrinsics.areEqual(component1.getIssueTypeId(), key.getIssueTypeId()) && !component2) {
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
                contains = CollectionsKt___CollectionsKt.contains(AbstractC3922JD.f17023s, issueStatus);
                if (!contains && !z2 && (issueStatus == null || key.getStatus() == issueStatus)) {
                    z3 = false;
                }
                if (z3) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JD$f */
    /* loaded from: classes3.dex */
    public static final class C3928f extends Lambda implements Function1<DialogResponse, Unit> {
        public C3928f() {
            super(1);
        }

        /* renamed from: a */
        public final void m100961a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                AbstractC3922JD.this.m101003B().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m100961a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a²\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0006 \u0003*X\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0006\u0018\u00010\u00000\u00002|\u0010\t\u001ax\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0003*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"LRe4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/BirdSummaryBody;", "Lco/bird/android/model/MobilePartner;", "", "Lco/bird/android/model/IssueType;", "Lco/bird/android/model/RepairType;", "<name for destructuring parameter 0>", "", "Lco/bird/android/model/Issue;", "Lco/bird/android/model/RepairTypeLock;", C17296a.f69688o, "(LRe4;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,319:1\n1360#2:320\n1446#2,2:321\n1549#2:323\n1620#2,3:324\n1448#2,3:329\n1360#2:332\n1446#2,2:333\n1448#2,3:337\n1549#2:340\n1620#2,2:341\n1549#2:343\n1620#2,3:344\n766#2:349\n857#2,2:350\n1622#2:352\n1549#2:353\n1620#2,3:354\n37#3,2:327\n37#3,2:335\n37#3,2:347\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$onCreate$1\n*L\n173#1:320\n173#1:321,2\n176#1:323\n176#1:324,3\n173#1:329,3\n186#1:332\n186#1:333,2\n186#1:337,3\n189#1:340\n189#1:341,2\n190#1:343\n190#1:344,3\n191#1:349\n191#1:350,2\n189#1:352\n195#1:353\n195#1:354,3\n176#1:327,2\n186#1:335,2\n190#1:347,2\n*E\n"})
    /* renamed from: JD$g */
    /* loaded from: classes3.dex */
    public static final class C3929g extends Lambda implements Function1<C35631Re4<? extends Optional<WorkOrder>, ? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends List<? extends IssueType>, ? extends List<? extends RepairType>>, C35631Re4<? extends WorkOrder, ? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>> {
        public C3929g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
            if (r7 == null) goto L57;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C35631Re4<WorkOrder, BirdSummaryBody, Optional<MobilePartner>, Map<Issue, List<RepairType>>, List<RepairTypeLock>> invoke(C35631Re4<Optional<WorkOrder>, BirdSummaryBody, Optional<MobilePartner>, ? extends List<IssueType>, ? extends List<RepairType>> c35631Re4) {
            Map<? extends String, ? extends Issue> emptyMap;
            int collectionSizeOrDefault;
            Map map;
            List emptyList;
            ArrayList arrayList;
            List<LegacyRepair> repairs;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List listOf;
            List listOf2;
            List<Issue> issues;
            int collectionSizeOrDefault4;
            List listOf3;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            BirdSummaryBody m86499b = c35631Re4.m86499b();
            Optional<MobilePartner> m86498c = c35631Re4.m86498c();
            List<IssueType> issueSupertypes = c35631Re4.m86497d();
            List<RepairType> repairTypes = c35631Re4.m86496e();
            WorkOrder m59035e = c35631Re4.m86500a().m59035e();
            if (m59035e != null && (issues = m59035e.getIssues()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Issue issue : issues) {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.add(TuplesKt.m28425to(issue.getIssueTypeId(), issue));
                    List<Issue> subtypes = issue.getSubtypes();
                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault4);
                    for (Issue issue2 : subtypes) {
                        arrayList3.add(TuplesKt.m28425to(issue2.getIssueTypeId(), issue2));
                    }
                    spreadBuilder.addSpread(arrayList3.toArray(new Pair[0]));
                    listOf3 = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, listOf3);
                }
                emptyMap = MapsKt__MapsKt.toMap(arrayList2);
            }
            emptyMap = MapsKt__MapsKt.emptyMap();
            AbstractC3922JD.this.m100967x().putAll(emptyMap);
            Intrinsics.checkNotNullExpressionValue(issueSupertypes, "issueSupertypes");
            ArrayList<Issue> arrayList4 = new ArrayList();
            for (Issue issue3 : C33019Ga2.m104999a(issueSupertypes, emptyMap)) {
                SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                spreadBuilder2.add(issue3);
                spreadBuilder2.addSpread(issue3.getSubtypes().toArray(new Issue[0]));
                listOf2 = CollectionsKt__CollectionsKt.listOf(spreadBuilder2.toArray(new Issue[spreadBuilder2.size()]));
                CollectionsKt__MutableCollectionsKt.addAll(arrayList4, listOf2);
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault);
            for (Issue issue4 : arrayList4) {
                SpreadBuilder spreadBuilder3 = new SpreadBuilder(2);
                spreadBuilder3.add(issue4.getIssueTypeId());
                List<Issue> subtypes2 = issue4.getSubtypes();
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes2, 10);
                ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
                for (Issue issue5 : subtypes2) {
                    arrayList6.add(issue5.getIssueTypeId());
                }
                spreadBuilder3.addSpread(arrayList6.toArray(new String[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder3.toArray(new String[spreadBuilder3.size()]));
                Intrinsics.checkNotNullExpressionValue(repairTypes, "repairTypes");
                ArrayList arrayList7 = new ArrayList();
                for (Object obj : repairTypes) {
                    if (listOf.contains(((RepairType) obj).getIssueTypeId())) {
                        arrayList7.add(obj);
                    }
                }
                arrayList5.add(TuplesKt.m28425to(issue4, arrayList7));
            }
            map = MapsKt__MapsKt.toMap(arrayList5);
            if (m59035e != null && (repairs = m59035e.getRepairs()) != null) {
                List<LegacyRepair> list = repairs;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault2);
                for (LegacyRepair legacyRepair : list) {
                    arrayList8.add(new RepairTypeLock(JF4.m100776a(legacyRepair), true));
                }
                arrayList = arrayList8;
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                arrayList = emptyList;
            }
            return new C35631Re4<>(m59035e, m86499b, m86498c, map, arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\r\u001a\u00020\f2·\u0001\u0010\u000b\u001a²\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b \u0003*X\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\r\u0010\u000e"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/WorkOrder;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/MobilePartner;", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "Lco/bird/android/model/RepairTypeLock;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JD$h */
    /* loaded from: classes3.dex */
    public static final class C3930h extends Lambda implements Function1<C35631Re4<? extends WorkOrder, ? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>>, Unit> {
        public C3930h() {
            super(1);
        }

        /* renamed from: a */
        public final void m100959a(C35631Re4<WorkOrder, BirdSummaryBody, Optional<MobilePartner>, ? extends Map<Issue, ? extends List<RepairType>>, ? extends List<RepairTypeLock>> c35631Re4) {
            SortedMap sortedMap;
            AbstractC3922JD.this.m100997J().onNext(Optional.f63040c.m59033b(c35631Re4.m86500a()));
            AbstractC3922JD.this.m100968w().onNext(c35631Re4.m86499b());
            AbstractC3922JD.this.m101002C().onNext(c35631Re4.m86498c());
            C24552a<Map<Issue, List<RepairType>>> m101004A = AbstractC3922JD.this.m101004A();
            sortedMap = MapsKt__MapsJVMKt.toSortedMap(c35631Re4.m86497d(), AbstractC3922JD.this.m100965z());
            m101004A.onNext(sortedMap);
            AbstractC3922JD.this.m101000E().onNext(c35631Re4.m86496e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends WorkOrder, ? extends BirdSummaryBody, ? extends Optional<MobilePartner>, ? extends Map<Issue, ? extends List<? extends RepairType>>, ? extends List<? extends RepairTypeLock>> c35631Re4) {
            m100959a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JD$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3931i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C3931i(Object obj) {
            super(1, obj, AbstractC3922JD.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC3922JD) this.receiver).mo24204S(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/WorkOrder;", "workOrderOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JD$j */
    /* loaded from: classes3.dex */
    public static final class C3932j extends Lambda implements Function1<Optional<WorkOrder>, Boolean> {

        /* renamed from: g */
        public static final C3932j f17048g = new C3932j();

        public C3932j() {
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
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$onCreate$5\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n37#2,2:320\n1360#3:322\n1446#3,5:323\n1774#3,4:328\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$onCreate$5\n*L\n216#1:320,2\n216#1:322\n216#1:323,5\n217#1:328,4\n*E\n"})
    /* renamed from: JD$k */
    /* loaded from: classes3.dex */
    public static final class C3933k extends Lambda implements Function1<Optional<WorkOrder>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f17050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3933k(WireBird wireBird) {
            super(1);
            this.f17050h = wireBird;
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
            return AbstractC3922JD.this.m101001D().mo106119b(this.f17050h.getId(), workOrderOptional.m59038b().getId(), i, AbstractC3922JD.this.mo24206H());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/MobilePartner;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JD$l */
    /* loaded from: classes3.dex */
    public static final class C3934l extends Lambda implements Function1<MobilePartner, Optional<MobilePartner>> {

        /* renamed from: g */
        public static final C3934l f17051g = new C3934l();

        public C3934l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<MobilePartner> invoke(MobilePartner partner) {
            Intrinsics.checkNotNullParameter(partner, "partner");
            return Optional.f63040c.m59032c(partner);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/RepairTypeLock;", "repairs", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$updateIssue$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,319:1\n819#2:320\n847#2,2:321\n*S KotlinDebug\n*F\n+ 1 RepairOverviewPresenter.kt\nco/bird/android/feature/repair/v1/base/BaseRepairOverviewPresenter$updateIssue$2\n*L\n300#1:320\n300#1:321,2\n*E\n"})
    /* renamed from: JD$m */
    /* loaded from: classes3.dex */
    public static final class C3935m extends Lambda implements Function1<List<? extends RepairTypeLock>, List<? extends RepairTypeLock>> {

        /* renamed from: g */
        public final /* synthetic */ Issue f17052g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3935m(Issue issue) {
            super(1);
            this.f17052g = issue;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RepairTypeLock> invoke(List<RepairTypeLock> repairs) {
            Intrinsics.checkNotNullParameter(repairs, "repairs");
            Issue issue = this.f17052g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : repairs) {
                if (!Intrinsics.areEqual(((RepairTypeLock) obj).component1().getIssueTypeId(), issue.getIssueTypeId())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JD$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3936n extends FunctionReferenceImpl implements Function1<List<? extends RepairTypeLock>, Unit> {
        public C3936n(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RepairTypeLock> list) {
            invoke2((List<RepairTypeLock>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RepairTypeLock> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    static {
        List<IssueStatus> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new IssueStatus[]{IssueStatus.OPEN, IssueStatus.FAILED_QC});
        f17023s = listOf;
    }

    public AbstractC3922JD(InterfaceC10636aM birdManager, GI3 partnerManager, InterfaceC37857aG6 workOrderManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC32301Cy4 repairAnalyticsManager, InterfaceC4380KD ui) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(partnerManager, "partnerManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(repairAnalyticsManager, "repairAnalyticsManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f17024a = birdManager;
        this.f17025b = partnerManager;
        this.f17026c = workOrderManager;
        this.f17027d = navigator;
        this.f17028e = scopeProvider;
        this.f17029f = repairAnalyticsManager;
        this.f17030g = ui;
        C24552a<Optional<WorkOrder>> m31921g = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Optional<W…rder>>(Optional.absent())");
        this.f17031h = m31921g;
        this.f17032i = new LinkedHashMap();
        C24552a<Optional<MobilePartner>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Optional<MobilePartner>>()");
        this.f17033j = m31922e;
        C24552a<BirdSummaryBody> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<BirdSummaryBody>()");
        this.f17034k = m31922e2;
        DateTime now = DateTime.now(DateTimeZone.UTC);
        Intrinsics.checkNotNullExpressionValue(now, "now(DateTimeZone.UTC)");
        this.f17035l = now;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f17036m = uuid;
        C24552a<Map<Issue, List<RepairType>>> m31922e3 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e3, "create<Map<Issue, List<RepairType>>>()");
        this.f17037n = m31922e3;
        C24552a<List<RepairTypeLock>> m31922e4 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e4, "create<List<RepairTypeLock>>()");
        this.f17038o = m31922e4;
        this.f17039p = new Comparator() { // from class: ID
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m100996K;
                m100996K = AbstractC3922JD.m100996K((Issue) obj, (Issue) obj2);
                return m100996K;
            }
        };
        Observable m31956a = C24523e.f91168a.m31956a(m31922e3, m31922e4);
        final C3927e c3927e = new C3927e();
        Observable<Map<Issue, List<RepairType>>> map = m31956a.map(new InterfaceC23492o() { // from class: wD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Map m100969v;
                m100969v = AbstractC3922JD.m100969v(Function1.this, obj);
                return m100969v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "Observables.combineLates…Status)\n        }\n      }");
        this.f17040q = map;
        Observable observeOn = C24527f.m31949b(ui.mo12604sj(), m31922e3, m31922e4).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.issueRepairSelects()\n…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3923a c3923a = new C3923a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100972s(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31949b(ui.mo12612F1(), m31922e3, m31922e4).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.addRepairClicks()\n   …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3924b c3924b = new C3924b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100971t(Function1.this, obj);
            }
        });
        Observable observeOn3 = C24527f.m31950a(ui.mo12603t6(), m31922e4).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.issueStatusSelects()\n…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3925c c3925c = new C3925c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: zD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100970u(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public static final int m100996K(Issue issue, Issue issue2) {
        if (!Intrinsics.areEqual(issue.getDisplay(), issue2.getDisplay())) {
            String display = issue.getDisplay();
            if (display != null) {
                String display2 = issue2.getDisplay();
                if (display2 == null) {
                    display2 = "";
                }
                return display.compareTo(display2);
            }
            return 0;
        }
        return issue.getIssueTypeId().compareTo(issue2.getIssueTypeId());
    }

    /* renamed from: L */
    public static final void m100995L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23496h m100994M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final Optional m100993N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final C35631Re4 m100992O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35631Re4) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m100991P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m100990Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final boolean m100989R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T */
    public static final List m100988T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m100987U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m100972s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m100971t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m100970u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final Map m100969v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Map) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final C24552a<Map<Issue, List<RepairType>>> m101004A() {
        return this.f17037n;
    }

    /* renamed from: B */
    public final InterfaceC40099e13 m101003B() {
        return this.f17027d;
    }

    /* renamed from: C */
    public final C24552a<Optional<MobilePartner>> m101002C() {
        return this.f17033j;
    }

    /* renamed from: D */
    public final InterfaceC32301Cy4 m101001D() {
        return this.f17029f;
    }

    /* renamed from: E */
    public final C24552a<List<RepairTypeLock>> m101000E() {
        return this.f17038o;
    }

    /* renamed from: F */
    public abstract RepairScope mo24207F();

    /* renamed from: G */
    public final ScopeProvider m100999G() {
        return this.f17028e;
    }

    /* renamed from: H */
    public abstract RepairSource mo24206H();

    /* renamed from: I */
    public final InterfaceC37857aG6 m100998I() {
        return this.f17026c;
    }

    /* renamed from: J */
    public final C24552a<Optional<WorkOrder>> m100997J() {
        return this.f17031h;
    }

    /* renamed from: S */
    public abstract void mo24204S(Throwable th);

    @Override // p000.XB4
    /* renamed from: a */
    public void mo24198a(WireBird bird) {
        AbstractC23442F<Optional<MobilePartner>> m33158H;
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (!this.f17033j.m31919i() && bird.getPartnerId() != null) {
            GI3 gi3 = this.f17025b;
            String partnerId = bird.getPartnerId();
            Intrinsics.checkNotNull(partnerId);
            AbstractC23442F<MobilePartner> mo97362u = gi3.mo97362u(partnerId);
            final C3934l c3934l = C3934l.f17051g;
            m33158H = mo97362u.m33157I(new InterfaceC23492o() { // from class: CD
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m100993N;
                    m100993N = AbstractC3922JD.m100993N(Function1.this, obj);
                    return m100993N;
                }
            });
        } else if (this.f17033j.m31919i()) {
            m33158H = this.f17033j.firstOrError();
        } else {
            m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
        }
        AbstractC23442F<Optional<MobilePartner>> partnerSingle = m33158H;
        C48501sB5 c48501sB5 = C48501sB5.f108430a;
        AbstractC23442F<Optional<WorkOrder>> mo19641l = this.f17026c.mo19641l(bird.getId());
        AbstractC23442F m33151O = C38096ag5.m70883l(this.f17024a.mo71571o(bird.getId())).m33151O(AbstractC23442F.m33158H(new BirdSummaryBody(new BirdSummary(null, null, null, null, null, null, null, null, null, null, null, 2047, null), null, null, 6, null)));
        Intrinsics.checkNotNullExpressionValue(m33151O, "birdManager.getBirdSumma…maryBody(BirdSummary())))");
        Intrinsics.checkNotNullExpressionValue(partnerSingle, "partnerSingle");
        InterfaceC37857aG6 interfaceC37857aG6 = this.f17026c;
        String model = bird.getModel();
        String str = "";
        if (model == null) {
            model = "";
        }
        AbstractC23442F m70883l = C38096ag5.m70883l(InterfaceC37857aG6.C10609b.getIssueTypesByModel$default(interfaceC37857aG6, model, null, 2, null));
        InterfaceC37857aG6 interfaceC37857aG62 = this.f17026c;
        String id = bird.getId();
        String model2 = bird.getModel();
        if (model2 != null) {
            str = model2;
        }
        AbstractC23442F m33142Y = C28237sD.progress$default(c48501sB5.m14578e(mo19641l, m33151O, partnerSingle, m70883l, C38096ag5.m70883l(interfaceC37857aG62.mo19652b(id, str, mo24207F()))), this.f17030g, 0, 2, (Object) null).m33142Y(C24542a.m31932c());
        final C3929g c3929g = new C3929g();
        AbstractC23442F m33152N = m33142Y.m33157I(new InterfaceC23492o() { // from class: DD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C35631Re4 m100992O;
                m100992O = AbstractC3922JD.m100992O(Function1.this, obj);
                return m100992O;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreate(bi…r)\n      .subscribe()\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f17028e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3930h c3930h = new C3930h();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ED
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100991P(Function1.this, obj);
            }
        };
        final C3931i c3931i = new C3931i(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: FD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100990Q(Function1.this, obj);
            }
        });
        C24552a<Optional<WorkOrder>> c24552a = this.f17031h;
        final C3932j c3932j = C3932j.f17048g;
        AbstractC24507p<Optional<WorkOrder>> firstElement = c24552a.filter(new InterfaceC23494q() { // from class: GD
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m100989R;
                m100989R = AbstractC3922JD.m100989R(Function1.this, obj);
                return m100989R;
            }
        }).firstElement();
        final C3933k c3933k = new C3933k(bird);
        AbstractC23461c m32074A = firstElement.m32074A(new InterfaceC23492o() { // from class: HD
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m100994M;
                m100994M = AbstractC3922JD.m100994M(Function1.this, obj);
                return m100994M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun onCreate(bi…r)\n      .subscribe()\n  }");
        Object m33041n = m32074A.m33041n(AutoDispose.m45239a(this.f17028e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
        r0 = kotlin.collections.MapsKt__MapsJVMKt.toSortedMap(r1, r6.f17039p);
     */
    @Override // p000.XB4
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo77224b(Issue issue) {
        Set<Issue> keySet;
        Map<Issue, List<RepairType>> value;
        List<RepairType> list;
        Map map;
        SortedMap sortedMap;
        Intrinsics.checkNotNullParameter(issue, "issue");
        Map<Issue, List<RepairType>> value2 = this.f17037n.getValue();
        if (value2 != null && (keySet = value2.keySet()) != null) {
            for (Issue issue2 : keySet) {
                if (Intrinsics.areEqual(issue.getIssueTypeId(), issue2.getIssueTypeId())) {
                    if (issue2 != null && (value = this.f17037n.getValue()) != null && (list = value.get(issue2)) != null) {
                        Map<Issue, List<RepairType>> value3 = this.f17037n.getValue();
                        if (value3 != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<Issue, List<RepairType>> entry : value3.entrySet()) {
                                if (!Intrinsics.areEqual(issue.getIssueTypeId(), entry.getKey().getIssueTypeId())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            map = MapsKt__MapsKt.toMutableMap(linkedHashMap);
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            List list2 = (List) map.put(issue, list);
                        }
                        if (map != null && sortedMap != null) {
                            this.f17037n.onNext(sortedMap);
                        }
                        if (issue.getStatus() == IssueStatus.DISPUTED) {
                            AbstractC23442F<List<RepairTypeLock>> firstOrError = this.f17038o.firstOrError();
                            final C3935m c3935m = new C3935m(issue);
                            AbstractC23442F<R> m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: vD
                                @Override // io.reactivex.functions.InterfaceC23492o
                                public final Object apply(Object obj) {
                                    List m100988T;
                                    m100988T = AbstractC3922JD.m100988T(Function1.this, obj);
                                    return m100988T;
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(m33157I, "issue: Issue) {\n    val …e.issueTypeId }\n        }");
                            Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this.f17028e));
                            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                            final C3936n c3936n = new C3936n(this.f17038o);
                            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: AD
                                @Override // io.reactivex.functions.InterfaceC23484g
                                public final void accept(Object obj) {
                                    AbstractC3922JD.m100987U(Function1.this, obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fb, code lost:
        if (r7 == co.bird.android.model.IssueStatus.RESOLVED) goto L83;
     */
    @Override // p000.XB4
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo77223c(List<RepairTypeLock> repairs) {
        List minus;
        List minus2;
        int collectionSizeOrDefault;
        Set<String> set;
        int collectionSizeOrDefault2;
        Set set2;
        Set<Issue> keySet;
        IssueStatus issueStatus;
        Issue copy;
        boolean z;
        Set<Issue> keySet2;
        Set<Issue> keySet3;
        int collectionSizeOrDefault3;
        Issue copy2;
        int collectionSizeOrDefault4;
        List listOf;
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        List<RepairTypeLock> list = repairs;
        List<RepairTypeLock> value = this.f17038o.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        minus = CollectionsKt___CollectionsKt.minus((Iterable) list, (Iterable) value);
        List<RepairTypeLock> value2 = this.f17038o.getValue();
        if (value2 == null) {
            value2 = CollectionsKt__CollectionsKt.emptyList();
        }
        minus2 = CollectionsKt___CollectionsKt.minus((Iterable) value2, (Iterable) list);
        this.f17038o.onNext(repairs);
        List<RepairTypeLock> list2 = minus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (RepairTypeLock repairTypeLock : list2) {
            arrayList.add(repairTypeLock.component1().getIssueTypeId());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        for (String str : set) {
            Map<Issue, List<RepairType>> value3 = this.f17037n.getValue();
            if (value3 != null && (keySet3 = value3.keySet()) != null) {
                ArrayList<Issue> arrayList2 = new ArrayList();
                for (Object obj : keySet3) {
                    Issue issue = (Issue) obj;
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.add(issue.getIssueTypeId());
                    List<Issue> subtypes = issue.getSubtypes();
                    collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(subtypes, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault4);
                    for (Issue issue2 : subtypes) {
                        arrayList3.add(issue2.getIssueTypeId());
                    }
                    spreadBuilder.addSpread(arrayList3.toArray(new String[0]));
                    listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                    if (listOf.contains(str)) {
                        arrayList2.add(obj);
                    }
                }
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList<Issue> arrayList4 = new ArrayList(collectionSizeOrDefault3);
                for (Issue issue3 : arrayList2) {
                    copy2 = issue3.copy((r37 & 1) != 0 ? issue3.f66598id : null, (r37 & 2) != 0 ? issue3.workOrderId : null, (r37 & 4) != 0 ? issue3.issueTypeId : null, (r37 & 8) != 0 ? issue3.display : null, (r37 & 16) != 0 ? issue3.description : null, (r37 & 32) != 0 ? issue3.status : IssueStatus.RESOLVED, (r37 & 64) != 0 ? issue3.statusDisplay : null, (r37 & 128) != 0 ? issue3.statusColor : null, (r37 & 256) != 0 ? issue3.statusReasonDisplay : null, (r37 & 512) != 0 ? issue3.source : null, (r37 & 1024) != 0 ? issue3.sourceDisplay : null, (r37 & 2048) != 0 ? issue3.createdBy : null, (r37 & 4096) != 0 ? issue3.createdAt : null, (r37 & 8192) != 0 ? issue3.updatedAt : null, (r37 & 16384) != 0 ? issue3.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue3.assetId : null, (r37 & 65536) != 0 ? issue3.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue3.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue3.statusReason : null);
                    arrayList4.add(copy2);
                }
                for (Issue issue4 : arrayList4) {
                    mo77224b(issue4);
                }
            }
        }
        List<RepairTypeLock> list3 = minus2;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
        for (RepairTypeLock repairTypeLock2 : list3) {
            arrayList5.add(repairTypeLock2.component1().getIssueTypeId());
        }
        set2 = CollectionsKt___CollectionsKt.toSet(arrayList5);
        ArrayList<String> arrayList6 = new ArrayList();
        Iterator it = set2.iterator();
        while (true) {
            IssueStatus issueStatus2 = null;
            if (it.hasNext()) {
                Object next = it.next();
                String str2 = (String) next;
                boolean z2 = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (RepairTypeLock repairTypeLock3 : list) {
                        if (Intrinsics.areEqual(repairTypeLock3.component1().getIssueTypeId(), str2)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    Map<Issue, List<RepairType>> value4 = this.f17037n.getValue();
                    if (value4 != null && (keySet2 = value4.keySet()) != null) {
                        for (Issue issue5 : keySet2) {
                            if (Intrinsics.areEqual(issue5.getIssueTypeId(), str2)) {
                                if (issue5 != null) {
                                    issueStatus2 = issue5.getStatus();
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                z2 = false;
                if (z2) {
                    arrayList6.add(next);
                }
            } else {
                for (String str3 : arrayList6) {
                    Map<Issue, List<RepairType>> value5 = this.f17037n.getValue();
                    if (value5 != null && (keySet = value5.keySet()) != null) {
                        for (Issue issue6 : keySet) {
                            if (Intrinsics.areEqual(issue6.getIssueTypeId(), str3)) {
                                if (issue6 != null) {
                                    Issue issue7 = this.f17032i.get(str3);
                                    if (issue7 != null) {
                                        issueStatus = issue7.getStatus();
                                    } else {
                                        issueStatus = null;
                                    }
                                    copy = issue6.copy((r37 & 1) != 0 ? issue6.f66598id : null, (r37 & 2) != 0 ? issue6.workOrderId : null, (r37 & 4) != 0 ? issue6.issueTypeId : null, (r37 & 8) != 0 ? issue6.display : null, (r37 & 16) != 0 ? issue6.description : null, (r37 & 32) != 0 ? issue6.status : issueStatus, (r37 & 64) != 0 ? issue6.statusDisplay : null, (r37 & 128) != 0 ? issue6.statusColor : null, (r37 & 256) != 0 ? issue6.statusReasonDisplay : null, (r37 & 512) != 0 ? issue6.source : null, (r37 & 1024) != 0 ? issue6.sourceDisplay : null, (r37 & 2048) != 0 ? issue6.createdBy : null, (r37 & 4096) != 0 ? issue6.createdAt : null, (r37 & 8192) != 0 ? issue6.updatedAt : null, (r37 & 16384) != 0 ? issue6.parentId : null, (r37 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? issue6.assetId : null, (r37 & 65536) != 0 ? issue6.subtypes : null, (r37 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? issue6.wireCampaign : null, (r37 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? issue6.statusReason : null);
                                    if (copy != null) {
                                        mo77224b(copy);
                                    }
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                return;
            }
        }
    }

    @Override // p000.XB4
    /* renamed from: d */
    public void mo77222d(List<LegacyRepair> repairs) {
        int collectionSizeOrDefault;
        List<RepairTypeLock> listOf;
        boolean z;
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        List<RepairTypeLock> value = this.f17038o.getValue();
        if (value == null) {
            value = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (true ^ ((RepairTypeLock) obj).component2()) {
                arrayList.add(obj);
            }
        }
        ArrayList<RepairTypeLock> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            RepairType component1 = ((RepairTypeLock) next).component1();
            List<LegacyRepair> list = repairs;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.areEqual(((LegacyRepair) it2.next()).getRepairTypeId(), component1.getId())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z2) {
                arrayList2.add(next);
            }
        }
        ArrayList<LegacyRepair> arrayList3 = new ArrayList();
        for (Object obj2 : repairs) {
            LegacyRepair legacyRepair = (LegacyRepair) obj2;
            if (!arrayList2.isEmpty()) {
                for (RepairTypeLock repairTypeLock : arrayList2) {
                    if (Intrinsics.areEqual(repairTypeLock.getRepairType().getId(), legacyRepair.getRepairTypeId())) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                arrayList3.add(obj2);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
        for (LegacyRepair legacyRepair2 : arrayList3) {
            arrayList4.add(new RepairTypeLock(JF4.m100776a(legacyRepair2), true));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        List<RepairTypeLock> value2 = this.f17038o.getValue();
        if (value2 == null) {
            value2 = CollectionsKt__CollectionsKt.emptyList();
        }
        spreadBuilder.addSpread(value2.toArray(new RepairTypeLock[0]));
        spreadBuilder.addSpread(arrayList4.toArray(new RepairTypeLock[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new RepairTypeLock[spreadBuilder.size()]));
        mo77223c(listOf);
    }

    @Override // p000.XB4
    public void onBackPressed() {
        Object m33135e = H31.C3014a.dialog$default(this.f17030g, C35719Ro2.f32625d, false, false, 6, null).m33135e(AutoDispose.m45239a(this.f17028e));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3928f c3928f = new C3928f();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: BD
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC3922JD.m100995L(Function1.this, obj);
            }
        });
    }

    /* renamed from: w */
    public final C24552a<BirdSummaryBody> m100968w() {
        return this.f17034k;
    }

    /* renamed from: x */
    public final Map<String, Issue> m100967x() {
        return this.f17032i;
    }

    /* renamed from: y */
    public final Observable<Map<Issue, List<RepairType>>> m100966y() {
        return this.f17040q;
    }

    /* renamed from: z */
    public final Comparator<Issue> m100965z() {
        return this.f17039p;
    }
}
