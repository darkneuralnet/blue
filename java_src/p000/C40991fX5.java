package p000;

import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00011BI\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J>\u0010\u0010\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\r0\u000b0\b*\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\n\u001a\u00020\tH\u0002JD\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b*&\u0012\"\u0012 \u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\r0\u000b0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u00062"}, m28432d2 = {"LfX5;", "LNC;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", C17296a.f69688o, "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/QCStatus;", "status", "Lkotlin/Triple;", "", "", "Lco/bird/android/model/QCInspection;", "Lco/bird/android/model/QCAutoCheck;", "e0", "k0", "n0", "(Lco/bird/android/model/constant/QCStatus;)Ljava/lang/Boolean;", "LiX5;", "l", "LiX5;", "ui", "LLW5;", "m", "LLW5;", "converter", "Lco/bird/android/model/constant/QualityControlFlow;", "n", "Lco/bird/android/model/constant/QualityControlFlow;", "s", "()Lco/bird/android/model/constant/QualityControlFlow;", "flow", "LaG6;", "workOrderManager", "LAb4;", "qcAnalyticsManager", "Lsu2;", "localAssetManager", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "reactiveConfig", "<init>", "(LaG6;LAb4;Lsu2;Le13;Lcom/uber/autodispose/ScopeProvider;LTq4;LiX5;LLW5;)V", "o", "e", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n*L\n1#1,153:1\n180#2:154\n180#2:155\n180#2:158\n180#2:159\n180#2:160\n180#2:161\n52#3,2:156\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlPresenterImpl\n*L\n49#1:154\n54#1:155\n64#1:158\n75#1:159\n81#1:160\n87#1:161\n59#1:156,2\n*E\n"})
/* renamed from: fX5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40991fX5 extends AbstractC5496NC {

    /* renamed from: o */
    public static final C20450e f80278o = new C20450e(null);

    /* renamed from: l */
    public final InterfaceC42770iX5 f80279l;

    /* renamed from: m */
    public final LW5 f80280m;

    /* renamed from: n */
    public final QualityControlFlow f80281n;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20446a extends FunctionReferenceImpl implements Function1<List<? extends QCInspection>, AbstractC23442F<List<? extends C3023H6>>> {
        public C20446a(Object obj) {
            super(1, obj, LW5.class, "convert", "convert(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<List<C3023H6>> invoke(List<QCInspection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((LW5) this.receiver).mo93813a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20447b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C20447b(Object obj) {
            super(1, obj, InterfaceC42770iX5.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC42770iX5) this.receiver).mo28855b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "qcInspection", "", C17296a.f69688o, "(Lco/bird/android/model/QCInspection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fX5$c */
    /* loaded from: classes4.dex */
    public static final class C20448c extends Lambda implements Function1<QCInspection, Unit> {
        public C20448c() {
            super(1);
        }

        /* renamed from: a */
        public final void m41216a(QCInspection qCInspection) {
            C40991fX5.this.f80279l.mo28851vj(C40991fX5.this.m41218n0(qCInspection.getStatus()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QCInspection qCInspection) {
            m41216a(qCInspection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/QCInspection;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$d */
    /* loaded from: classes4.dex */
    public static final class C20449d extends Lambda implements Function1<Pair<? extends QCInspection, ? extends List<? extends QCInspection>>, Unit> {
        public C20449d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends QCInspection, ? extends List<? extends QCInspection>> pair) {
            invoke2((Pair<QCInspection, ? extends List<QCInspection>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<QCInspection, ? extends List<QCInspection>> pair) {
            List<QCInspection> component2 = pair.component2();
            C40991fX5.this.f80279l.mo28862O2(component2.indexOf(pair.component1()), component2.size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LfX5$e;", "", "", "SCROLL_DELAY_MILLIS", "J", "TOAST_DELAY_MILLIS", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: fX5$e */
    /* loaded from: classes4.dex */
    public static final class C20450e {
        public /* synthetic */ C20450e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20450e() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$f */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20451f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QCStatus.values().length];
            try {
                iArr[QCStatus.PASSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QCStatus.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QCStatus.SKIPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QCStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fX5$g */
    /* loaded from: classes4.dex */
    public static final class C20452g extends Lambda implements Function1<Unit, InterfaceC23447K<? extends List<? extends QCInspection>>> {
        public C20452g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<QCInspection>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C40991fX5.this.m94219w().firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0004\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$h */
    /* loaded from: classes4.dex */
    public static final class C20453h extends Lambda implements Function1<Pair<? extends List<? extends QCInspection>, ? extends QCInspection>, List<QCInspection>> {

        /* renamed from: g */
        public final /* synthetic */ QCStatus f80285g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20453h(QCStatus qCStatus) {
            super(1);
            this.f80285g = qCStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<QCInspection> invoke(Pair<? extends List<? extends QCInspection>, ? extends QCInspection> pair) {
            return invoke2((Pair<? extends List<QCInspection>, QCInspection>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<QCInspection> invoke2(Pair<? extends List<QCInspection>, QCInspection> pair) {
            List<QCInspection> mutableList;
            QCInspection copy;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<QCInspection> qcInspections = pair.component1();
            QCInspection passedInspection = pair.component2();
            int indexOf = qcInspections.indexOf(passedInspection);
            Intrinsics.checkNotNullExpressionValue(qcInspections, "qcInspections");
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) qcInspections);
            QCStatus qCStatus = this.f80285g;
            if (indexOf != -1) {
                mutableList.remove(indexOf);
                Intrinsics.checkNotNullExpressionValue(passedInspection, "passedInspection");
                copy = passedInspection.copy((r20 & 1) != 0 ? passedInspection.f66615id : null, (r20 & 2) != 0 ? passedInspection.title : null, (r20 & 4) != 0 ? passedInspection.description : null, (r20 & 8) != 0 ? passedInspection.workOrderId : null, (r20 & 16) != 0 ? passedInspection.issueTypeId : null, (r20 & 32) != 0 ? passedInspection.repairTypeId : null, (r20 & 64) != 0 ? passedInspection.kind : null, (r20 & 128) != 0 ? passedInspection.status : qCStatus, (r20 & 256) != 0 ? passedInspection.assetId : null);
                mutableList.add(indexOf, copy);
            }
            return mutableList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$i */
    /* loaded from: classes4.dex */
    public static final class C20454i extends Lambda implements Function1<List<QCInspection>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ QCStatus f80287h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20454i(QCStatus qCStatus) {
            super(1);
            this.f80287h = qCStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<QCInspection> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCInspection> list) {
            C40991fX5.this.f80279l.mo28856Xd(C40991fX5.this.m41218n0(this.f80287h));
            C40991fX5.this.f80279l.mo28851vj(C40991fX5.this.m41218n0(this.f80287h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/QCInspection;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$j */
    /* loaded from: classes4.dex */
    public static final class C20455j extends Lambda implements Function1<List<QCInspection>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ QCStatus f80289h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20455j(QCStatus qCStatus) {
            super(1);
            this.f80289h = qCStatus;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<QCInspection> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCInspection> list) {
            C40991fX5.this.f80279l.mo28857V8(C40991fX5.this.m41218n0(this.f80289h));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001aF\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0006*\"\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00010\u00012:\u0010\u0007\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t0\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\bH\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "Lco/bird/android/model/QCInspection;", "Lco/bird/android/model/QCAutoCheck;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSwipeQualityControlPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlPresenterImpl$markStatus$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n2624#2,3:154\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlPresenterImpl.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlPresenterImpl$markStatus$5\n*L\n126#1:154,3\n*E\n"})
    /* renamed from: fX5$k */
    /* loaded from: classes4.dex */
    public static final class C20456k extends Lambda implements Function1<Pair<? extends List<QCInspection>, ? extends List<? extends QCAutoCheck>>, Triple<? extends Boolean, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>>> {
        public C20456k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Triple<? extends Boolean, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>> invoke(Pair<? extends List<QCInspection>, ? extends List<? extends QCAutoCheck>> pair) {
            return invoke2((Pair<? extends List<QCInspection>, ? extends List<QCAutoCheck>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Triple<Boolean, List<QCInspection>, List<QCAutoCheck>> invoke2(Pair<? extends List<QCInspection>, ? extends List<QCAutoCheck>> pair) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<QCInspection> qcInspections = pair.component1();
            List<QCAutoCheck> component2 = pair.component2();
            boolean z3 = false;
            if (!C40991fX5.this.f80279l.mo28858S8()) {
                Intrinsics.checkNotNullExpressionValue(qcInspections, "qcInspections");
                List<QCInspection> list = qcInspections;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (QCInspection qCInspection : list) {
                        if (qCInspection.getStatus() == QCStatus.OPEN) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    z3 = true;
                }
            }
            return new Triple<>(Boolean.valueOf(z3), qcInspections, component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072J\u0010\u0006\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\"\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lco/bird/android/model/QCInspection;", "Lco/bird/android/model/QCAutoCheck;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fX5$l */
    /* loaded from: classes4.dex */
    public static final class C20457l extends Lambda implements Function1<Triple<? extends Boolean, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f80292h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20457l(WireBird wireBird) {
            super(1);
            this.f80292h = wireBird;
        }

        /* renamed from: a */
        public final void m41215a(Triple<Boolean, ? extends List<QCInspection>, ? extends List<QCAutoCheck>> triple) {
            boolean booleanValue = triple.component1().booleanValue();
            List<QCInspection> component2 = triple.component2();
            List<QCAutoCheck> component3 = triple.component3();
            if (booleanValue) {
                C40991fX5.this.m94221u().mo36927v4(this.f80292h, component2, component3);
                C40991fX5.this.m94221u().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>> triple) {
            m41215a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0006*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022$\u0010\u0005\u001a \u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lco/bird/android/model/QCInspection;", "Lco/bird/android/model/QCAutoCheck;", "<name for destructuring parameter 0>", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fX5$m */
    /* loaded from: classes4.dex */
    public static final class C20458m extends Lambda implements Function1<Triple<? extends Boolean, ? extends List<? extends QCInspection>, ? extends List<? extends QCAutoCheck>>, List<? extends QCInspection>> {

        /* renamed from: g */
        public static final C20458m f80293g = new C20458m();

        public C20458m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<QCInspection> invoke(Triple<Boolean, ? extends List<QCInspection>, ? extends List<QCAutoCheck>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            return triple.component2();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$n */
    /* loaded from: classes4.dex */
    public static final class C20459n extends Lambda implements Function1<Pair<? extends Unit, ? extends WorkOrder>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f80295h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20459n(WireBird wireBird) {
            super(1);
            this.f80295h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WorkOrder> pair) {
            invoke2((Pair<Unit, WorkOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WorkOrder> pair) {
            WorkOrder workOrder = pair.component2();
            C40991fX5 c40991fX5 = C40991fX5.this;
            WireBird wireBird = this.f80295h;
            Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
            c40991fX5.m94249B(wireBird, workOrder);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$o */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20460o extends FunctionReferenceImpl implements Function1<List<? extends QCInspection>, Unit> {
        public C20460o(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends QCInspection> list) {
            invoke2((List<QCInspection>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCInspection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fX5$p */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20461p extends FunctionReferenceImpl implements Function1<List<? extends QCInspection>, Unit> {
        public C20461p(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends QCInspection> list) {
            invoke2((List<QCInspection>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<QCInspection> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: fX5$q */
    /* loaded from: classes4.dex */
    public static final class C20462q<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C20462q<T1, T2, R> f80296a = new C20462q<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40991fX5(InterfaceC37857aG6 workOrderManager, InterfaceC31626Ab4 qcAnalyticsManager, InterfaceC48923su2 localAssetManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC42770iX5 ui, LW5 converter) {
        super(workOrderManager, localAssetManager, navigator, scopeProvider, reactiveConfig, qcAnalyticsManager, ui);
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(qcAnalyticsManager, "qcAnalyticsManager");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f80279l = ui;
        this.f80280m = converter;
        this.f80281n = QualityControlFlow.SWIPE;
        C24552a<List<QCInspection>> m94219w = m94219w();
        final C20446a c20446a = new C20446a(converter);
        Observable observeOn = m94219w.flatMapSingle(new InterfaceC23492o() { // from class: YW5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41231a0;
                m41231a0 = C40991fX5.m41231a0(Function1.this, obj);
                return m41231a0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "qcInspectionSubject\n    …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20447b c20447b = new C20447b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41230b0(Function1.this, obj);
            }
        });
        Observable<QCInspection> observeOn2 = ui.mo28852vf().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.qcInspectionScrolls()…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20448c c20448c = new C20448c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aX5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41229c0(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(ui.mo28852vf(), m94219w(), C20462q.f80296a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn3 = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20449d c20449d = new C20449d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: bX5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41228d0(Function1.this, obj);
            }
        });
    }

    /* renamed from: G */
    public static final void m41248G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m41247H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m41246I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m41231a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m41230b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m41229c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m41228d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m41226f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final Triple m41225g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final InterfaceC23447K m41224h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final List m41223i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m41222j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m41220l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final List m41219m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC5496NC, p000.InterfaceC35838Sb4
    /* renamed from: a */
    public void mo7892a(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        super.mo7892a(bird, workOrder);
        Observable observeOn = C24527f.m31950a(this.f80279l.mo28854dj(), m94250A()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.editClicks()\n      .w…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m94217y()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20459n c20459n = new C20459n(bird);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41248G(Function1.this, obj);
            }
        });
        Object m33094as2 = m41221k0(m41227e0(this.f80279l.mo28853o6(), QCStatus.PASSED), bird).m33094as(AutoDispose.m45239a(m94217y()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20460o c20460o = new C20460o(m94219w());
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: WW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41247H(Function1.this, obj);
            }
        });
        Object m33094as3 = m41221k0(m41227e0(this.f80279l.mo28863K3(), QCStatus.FAILED), bird).m33094as(AutoDispose.m45239a(m94217y()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20461p c20461p = new C20461p(m94219w());
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: XW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41246I(Function1.this, obj);
            }
        });
    }

    /* renamed from: e0 */
    public final Observable<Triple<Boolean, List<QCInspection>, List<QCAutoCheck>>> m41227e0(Observable<Unit> observable, QCStatus qCStatus) {
        final C20452g c20452g = new C20452g();
        Observable<R> flatMapSingle = observable.flatMapSingle(new InterfaceC23492o() { // from class: cX5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m41224h0;
                m41224h0 = C40991fX5.m41224h0(Function1.this, obj);
                return m41224h0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun Observable<U…qcAutoChecks)\n      }\n  }");
        Observable m31950a = C24527f.m31950a(flatMapSingle, this.f80279l.mo28852vf());
        final C20453h c20453h = new C20453h(qCStatus);
        Observable observeOn = m31950a.map(new InterfaceC23492o() { // from class: dX5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m41223i0;
                m41223i0 = C40991fX5.m41223i0(Function1.this, obj);
                return m41223i0;
            }
        }).observeOn(C23454a.m33087a());
        final C20454i c20454i = new C20454i(qCStatus);
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: eX5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41222j0(Function1.this, obj);
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable observeOn2 = doOnNext.delay(100L, timeUnit).observeOn(C23454a.m33087a());
        final C20455j c20455j = new C20455j(qCStatus);
        Observable delay = observeOn2.doOnNext(new InterfaceC23484g() { // from class: SW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41226f0(Function1.this, obj);
            }
        }).delay(300L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(delay, "private fun Observable<U…qcAutoChecks)\n      }\n  }");
        Observable m31950a2 = C24527f.m31950a(delay, m94220v());
        final C20456k c20456k = new C20456k();
        Observable<Triple<Boolean, List<QCInspection>, List<QCAutoCheck>>> map = m31950a2.map(new InterfaceC23492o() { // from class: TW5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m41225g0;
                m41225g0 = C40991fX5.m41225g0(Function1.this, obj);
                return m41225g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun Observable<U…qcAutoChecks)\n      }\n  }");
        return map;
    }

    /* renamed from: k0 */
    public final Observable<List<QCInspection>> m41221k0(Observable<Triple<Boolean, List<QCInspection>, List<QCAutoCheck>>> observable, WireBird wireBird) {
        final C20457l c20457l = new C20457l(wireBird);
        Observable<Triple<Boolean, List<QCInspection>, List<QCAutoCheck>>> doOnNext = observable.doOnNext(new InterfaceC23484g() { // from class: UW5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40991fX5.m41220l0(Function1.this, obj);
            }
        });
        final C20458m c20458m = C20458m.f80293g;
        Observable map = doOnNext.map(new InterfaceC23492o() { // from class: VW5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m41219m0;
                m41219m0 = C40991fX5.m41219m0(Function1.this, obj);
                return m41219m0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun Observable<T…s) -> qcInspections }\n  }");
        return map;
    }

    /* renamed from: n0 */
    public final Boolean m41218n0(QCStatus qCStatus) {
        int i = C20451f.$EnumSwitchMapping$0[qCStatus.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // p000.AbstractC5496NC
    /* renamed from: s */
    public QualityControlFlow mo7891s() {
        return this.f80281n;
    }
}
