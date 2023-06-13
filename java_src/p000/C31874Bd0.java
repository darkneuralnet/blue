package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CannotAccessOption;
import co.bird.android.model.Folder;
import co.bird.android.model.InaccessibleReason;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.api.response.CannotAccessBirdReport;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C31874Bd0;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
import p000.S74;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u000e\b\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\b\b\u0001\u00103\u001a\u000200\u0012\b\b\u0001\u00107\u001a\u000204¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010R¨\u0006V"}, m28432d2 = {"LBd0;", "Lmd0;", "Lco/bird/android/model/CannotAccessOption;", "option", "", "G", "", "H", "", "r", "", "s", "q", "Landroid/content/Intent;", "intent", "b", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "LaM;", C17296a.f69688o, "LaM;", "birdManager", "LEa;", "LEa;", "analyticsManager", "LyL;", "c", "LyL;", "birdFinderManager", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LTq4;", "e", "LTq4;", "reactiveConfig", "Ldr4;", "f", "Ldr4;", "locationManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "g", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LXd0;", "h", "LXd0;", "ui", "Le13;", "i", "Le13;", "navigator", "Lco/bird/android/model/wire/WireBird;", "j", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/InaccessibleReportSource;", "k", "Lco/bird/android/model/InaccessibleReportSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/InaccessibleReason;", "l", "Lco/bird/android/model/InaccessibleReason;", "selectedIssue", "", "m", "Ljava/lang/String;", "birdDropdownValue", "n", "Z", "returnedFromBirdScan", "o", "birdFoundInBirdScan", "Lio/reactivex/subjects/d;", "p", "Lio/reactivex/subjects/d;", "programmaticSubmitSubject", "", "J", "passiveScanStartTime", "<init>", "(LaM;LEa;LyL;Lgl;LTq4;Ldr4;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LXd0;Le13;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCannotAccessPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessPresenter.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n180#2:320\n180#2:325\n180#2:332\n180#2:333\n11335#3:321\n11670#3,3:322\n22#4,2:326\n22#4,2:328\n61#4,2:330\n1#5:334\n*S KotlinDebug\n*F\n+ 1 CannotAccessPresenter.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessPresenterImpl\n*L\n81#1:320\n114#1:325\n144#1:332\n207#1:333\n107#1:321\n107#1:322,3\n120#1:326,2\n131#1:328,2\n137#1:330,2\n*E\n"})
/* renamed from: Bd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31874Bd0 implements InterfaceC45194md0 {

    /* renamed from: a */
    public final InterfaceC10636aM f2564a;

    /* renamed from: b */
    public final InterfaceC1880Ea f2565b;

    /* renamed from: c */
    public final InterfaceC30556yL f2566c;

    /* renamed from: d */
    public final C22454gl f2567d;

    /* renamed from: e */
    public final C36207Tq4 f2568e;

    /* renamed from: f */
    public final InterfaceC40001dr4 f2569f;

    /* renamed from: g */
    public final LifecycleScopeProvider<EnumC7097RE> f2570g;

    /* renamed from: h */
    public final InterfaceC37022Xd0 f2571h;

    /* renamed from: i */
    public final InterfaceC40099e13 f2572i;

    /* renamed from: j */
    public WireBird f2573j;

    /* renamed from: k */
    public InaccessibleReportSource f2574k;

    /* renamed from: l */
    public InaccessibleReason f2575l;

    /* renamed from: m */
    public String f2576m;

    /* renamed from: n */
    public boolean f2577n;

    /* renamed from: o */
    public boolean f2578o;

    /* renamed from: p */
    public final C24558d<Unit> f2579p;

    /* renamed from: q */
    public long f2580q;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$a */
    /* loaded from: classes3.dex */
    public static final class C0653a extends Lambda implements Function1<Unit, Unit> {
        public C0653a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToRetakeablePhoto$default(C31874Bd0.this.f2572i, null, null, Folder.COMPLAINT_PHOTOS, 10026, null, false, 51, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 CannotAccessPresenter.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessPresenterImpl\n*L\n1#1,304:1\n126#2:305\n*E\n"})
    /* renamed from: Bd0$b */
    /* loaded from: classes3.dex */
    public static final class C0654b<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            boolean z;
            Boolean bool = (Boolean) t1;
            if (!((Boolean) t2).booleanValue() && bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 CannotAccessPresenter.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessPresenterImpl\n*L\n1#1,304:1\n134#2:305\n*E\n"})
    /* renamed from: Bd0$c */
    /* loaded from: classes3.dex */
    public static final class C0655c<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            List list = (List) t2;
            boolean z = true;
            if (((CannotAccessOption) t1).getIssue() != InaccessibleReason.MISSING && !(!list.isEmpty())) {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T1", "T2", "T3", "T4", "R", "t1", "t2", "t3", "t4", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$5\n+ 2 CannotAccessPresenter.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessPresenterImpl\n*L\n1#1,304:1\n142#2:305\n*E\n"})
    /* renamed from: Bd0$d */
    /* loaded from: classes3.dex */
    public static final class C0656d<T1, T2, T3, T4, R> implements InterfaceC23486i<T1, T2, T3, T4, R> {
        public C0656d() {
        }

        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            boolean z;
            boolean booleanValue = ((Boolean) t4).booleanValue();
            Boolean bool = (Boolean) t3;
            boolean booleanValue2 = ((Boolean) t2).booleanValue();
            if (((Boolean) t1).booleanValue() && (C31874Bd0.this.m113788H() || (booleanValue2 && bool.booleanValue() && booleanValue))) {
                z = true;
            } else {
                z = false;
            }
            return (R) Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052B\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0003*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lio/reactivex/w;", "LHM4;", "Lco/bird/api/response/CannotAccessBirdReport;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/w;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$e */
    /* loaded from: classes3.dex */
    public static final class C0657e extends Lambda implements Function1<C24576w<HM4<CannotAccessBirdReport>>, Unit> {
        public C0657e() {
            super(1);
        }

        /* renamed from: a */
        public final void m113762a(C24576w<HM4<CannotAccessBirdReport>> c24576w) {
            S74.C7343a.showProgress$default(C31874Bd0.this.f2571h, false, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C24576w<HM4<CannotAccessBirdReport>> c24576w) {
            m113762a(c24576w);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CannotAccessBirdReport;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$f */
    /* loaded from: classes3.dex */
    public static final class C0658f extends Lambda implements Function1<HM4<CannotAccessBirdReport>, Unit> {
        public C0658f() {
            super(1);
        }

        /* renamed from: a */
        public final void m113761a(HM4<CannotAccessBirdReport> response) {
            InaccessibleReason reason;
            String str = null;
            WireBird wireBird = null;
            if (response.m103939f()) {
                InterfaceC1880Ea interfaceC1880Ea = C31874Bd0.this.f2565b;
                WireBird wireBird2 = C31874Bd0.this.f2573j;
                if (wireBird2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                    wireBird2 = null;
                }
                String id = wireBird2.getId();
                InaccessibleReportSource inaccessibleReportSource = C31874Bd0.this.f2574k;
                if (inaccessibleReportSource == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
                    inaccessibleReportSource = null;
                }
                String name = inaccessibleReportSource.name();
                CannotAccessBirdReport m103944a = response.m103944a();
                interfaceC1880Ea.mo55905y(new C36788Wd0(null, null, null, id, name, (m103944a == null || (reason = m103944a.getReason()) == null || (r2 = reason.name()) == null) ? "unknown" : "unknown", 7, null));
                InterfaceC41921h56.C22549a.topToast$default(C31874Bd0.this.f2571h, C45871nl4.cannot_access_submission_success, (EnumC40735f56) null, 2, (Object) null);
                Intent intent = new Intent();
                intent.putExtra("activity_result", response.m103944a());
                WireBird wireBird3 = C31874Bd0.this.f2573j;
                if (wireBird3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bird");
                } else {
                    wireBird = wireBird3;
                }
                intent.putExtra("bird", wireBird);
                C31874Bd0.this.f2572i.mo37029e4(-1, intent);
                return;
            }
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = "Error title '" + m94017d.m11931d() + ", code '" + m94017d.m11933b() + "', message: '" + m94017d.m11932c() + "' (thread: " + Thread.currentThread() + ")";
            }
            C41318g46.m40159e(new Exception(str));
            C31874Bd0.this.f2571h.error(C45871nl4.cannot_access_submission_error);
            C31874Bd0.this.f2571h.mo74790p(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CannotAccessBirdReport> hm4) {
            m113761a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$g */
    /* loaded from: classes3.dex */
    public static final class C0659g extends Lambda implements Function1<Throwable, Unit> {
        public C0659g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C31874Bd0.this.f2571h.error(C45871nl4.cannot_access_submission_error);
            C31874Bd0.this.f2571h.mo74790p(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/CannotAccessOption;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/CannotAccessOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$h */
    /* loaded from: classes3.dex */
    public static final class C0660h extends Lambda implements Function1<CannotAccessOption, Unit> {
        public C0660h() {
            super(1);
        }

        /* renamed from: a */
        public final void m113760a(CannotAccessOption it) {
            C31874Bd0 c31874Bd0 = C31874Bd0.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c31874Bd0.m113789G(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CannotAccessOption cannotAccessOption) {
            m113760a(cannotAccessOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/CannotAccessOption;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/CannotAccessOption;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$i */
    /* loaded from: classes3.dex */
    public static final class C0661i extends Lambda implements Function1<CannotAccessOption, Boolean> {

        /* renamed from: g */
        public static final C0661i f2587g = new C0661i();

        public C0661i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(CannotAccessOption it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getChecked());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "validated", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$j */
    /* loaded from: classes3.dex */
    public static final class C0662j extends Lambda implements Function1<Boolean, Unit> {
        public C0662j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean validated) {
            InterfaceC37022Xd0 interfaceC37022Xd0 = C31874Bd0.this.f2571h;
            Intrinsics.checkNotNullExpressionValue(validated, "validated");
            interfaceC37022Xd0.mo74790p(validated.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$k */
    /* loaded from: classes3.dex */
    public static final class C0663k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0663k f2589g = new C0663k();

        public C0663k() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0004*,\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$l */
    /* loaded from: classes3.dex */
    public static final class C0664l extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, Unit> {
        public C0664l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends Uri>> pair) {
            invoke2((Pair<Unit, ? extends List<? extends Uri>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<? extends Uri>> pair) {
            S74.C7343a.showProgress$default(C31874Bd0.this.f2571h, true, 0, 2, null);
            C31874Bd0.this.f2571h.mo74790p(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$m */
    /* loaded from: classes3.dex */
    public static final class C0665m extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, Boolean> {
        public C0665m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Unit, ? extends List<? extends Uri>> pair) {
            return invoke2((Pair<Unit, ? extends List<? extends Uri>>) pair);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
            if (co.bird.android.model.wire.WireBirdKt.isSpecialTaskDispatch(r0) != false) goto L19;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke2(Pair<Unit, ? extends List<? extends Uri>> pair) {
            boolean z;
            if (!C31874Bd0.this.f2577n) {
                InaccessibleReason inaccessibleReason = C31874Bd0.this.f2575l;
                WireBird wireBird = null;
                if (inaccessibleReason == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectedIssue");
                    inaccessibleReason = null;
                }
                if (inaccessibleReason == InaccessibleReason.MISSING) {
                    InaccessibleReportSource inaccessibleReportSource = C31874Bd0.this.f2574k;
                    if (inaccessibleReportSource == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
                        inaccessibleReportSource = null;
                    }
                    if (inaccessibleReportSource != InaccessibleReportSource.OPERATOR) {
                        WireBird wireBird2 = C31874Bd0.this.f2573j;
                        if (wireBird2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("bird");
                        } else {
                            wireBird = wireBird2;
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a`\u0012\\\u0012Z\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u00000\u00062^\u0010\u0005\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "it", "Lio/reactivex/u;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$n */
    /* loaded from: classes3.dex */
    public static final class C0666n extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, InterfaceC24574u<Pair<? extends Unit, ? extends List<? extends Uri>>>> {
        public C0666n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<Pair<Unit, List<Uri>>> invoke(Pair<Unit, ? extends List<? extends Uri>> pair) {
            WireBird wireBird;
            C31874Bd0.this.f2577n = false;
            C31874Bd0.this.f2578o = false;
            S74.C7343a.showProgress$default(C31874Bd0.this.f2571h, false, 0, 2, null);
            C31874Bd0.this.f2571h.mo74790p(true);
            InterfaceC40099e13 interfaceC40099e13 = C31874Bd0.this.f2572i;
            WireBird wireBird2 = C31874Bd0.this.f2573j;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            } else {
                wireBird = wireBird2;
            }
            InterfaceC40099e13.C19924a.goToNearbyBirds$default(interfaceC40099e13, true, wireBird, Integer.valueOf(C31874Bd0.this.m113772q()), C31874Bd0.this.f2571h.getString(C45871nl4.cannot_access_nearby_bird_submit_report_cta, new Object[0]), Boolean.TRUE, null, null, null, 224, null);
            AbstractC24507p m32024u = AbstractC24507p.m32024u();
            Intrinsics.checkNotNullExpressionValue(m32024u, "empty()");
            return m32024u;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Landroid/net/Uri;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/CannotAccessBirdReport;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$o */
    /* loaded from: classes3.dex */
    public static final class C0667o extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends Uri>>, InterfaceC23447K<? extends HM4<CannotAccessBirdReport>>> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CannotAccessBirdReport;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Bd0$o$a */
        /* loaded from: classes3.dex */
        public static final class C0668a extends Lambda implements Function1<HM4<CannotAccessBirdReport>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31874Bd0 f2594g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0668a(C31874Bd0 c31874Bd0) {
                super(1);
                this.f2594g = c31874Bd0;
            }

            /* renamed from: a */
            public final void m113753a(HM4<CannotAccessBirdReport> hm4) {
                this.f2594g.f2577n = false;
                this.f2594g.f2578o = false;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HM4<CannotAccessBirdReport> hm4) {
                m113753a(hm4);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Bd0$o$b */
        /* loaded from: classes3.dex */
        public static final class C0669b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C31874Bd0 f2595g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0669b(C31874Bd0 c31874Bd0) {
                super(1);
                this.f2595g = c31874Bd0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                this.f2595g.f2571h.error(C45871nl4.cannot_access_submission_error);
                S74.C7343a.showProgress$default(this.f2595g.f2571h, false, 0, 2, null);
                this.f2595g.f2571h.mo74790p(true);
            }
        }

        public C0667o() {
            super(1);
        }

        /* renamed from: d */
        public static final void m113754d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends HM4<CannotAccessBirdReport>> invoke(Pair<Unit, ? extends List<? extends Uri>> pair) {
            List<String> list;
            InaccessibleReason inaccessibleReason;
            InaccessibleReportSource inaccessibleReportSource;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<? extends Uri> imageUris = pair.component2();
            list = CollectionsKt___CollectionsKt.toList(C31874Bd0.this.f2566c.mo3648e());
            Intrinsics.checkNotNullExpressionValue(imageUris, "imageUris");
            List<String> m101827a = C33536If6.m101827a(imageUris);
            InterfaceC10636aM interfaceC10636aM = C31874Bd0.this.f2564a;
            WireBird wireBird = C31874Bd0.this.f2573j;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            String id = wireBird.getId();
            WireBird wireBird2 = C31874Bd0.this.f2573j;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird2 = null;
            }
            String bountyId = wireBird2.getBountyId();
            InaccessibleReason inaccessibleReason2 = C31874Bd0.this.f2575l;
            if (inaccessibleReason2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectedIssue");
                inaccessibleReason = null;
            } else {
                inaccessibleReason = inaccessibleReason2;
            }
            InaccessibleReportSource inaccessibleReportSource2 = C31874Bd0.this.f2574k;
            if (inaccessibleReportSource2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
                inaccessibleReportSource = null;
            } else {
                inaccessibleReportSource = inaccessibleReportSource2;
            }
            AbstractC23442F<HM4<CannotAccessBirdReport>> mo71581a1 = interfaceC10636aM.mo71581a1(id, bountyId, inaccessibleReason, inaccessibleReportSource, C31874Bd0.this.f2567d.m37575s0().getUserRoleCode(), list, C31874Bd0.this.f2571h.mo74797U(), m101827a, C31874Bd0.this.f2576m, Integer.valueOf(C31874Bd0.this.m113771r()));
            final C0668a c0668a = new C0668a(C31874Bd0.this);
            AbstractC23442F<HM4<CannotAccessBirdReport>> m33152N = mo71581a1.m33101w(new InterfaceC23484g() { // from class: Cd0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31874Bd0.C0667o.invoke$lambda$0(Function1.this, obj);
                }
            }).m33152N(C23454a.m33087a());
            final C0669b c0669b = new C0669b(C31874Bd0.this);
            return m33152N.m33106t(new InterfaceC23484g() { // from class: Dd0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C31874Bd0.C0667o.m113754d(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$p */
    /* loaded from: classes3.dex */
    public static final class C0670p extends Lambda implements Function1<Boolean, Unit> {
        public C0670p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C31874Bd0.this.f2576m = null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$q */
    /* loaded from: classes3.dex */
    public static final class C0671q extends Lambda implements Function1<CharSequence, Unit> {
        public C0671q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence charSequence) {
            C31874Bd0.this.f2576m = charSequence.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$r */
    /* loaded from: classes3.dex */
    public static final class C0672r extends Lambda implements Function1<CharSequence, Boolean> {

        /* renamed from: g */
        public static final C0672r f2598g = new C0672r();

        public C0672r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(CharSequence it) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            return Boolean.valueOf(!isBlank);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/CharSequence;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Bd0$s */
    /* loaded from: classes3.dex */
    public static final class C0673s extends Lambda implements Function1<CharSequence, Boolean> {

        /* renamed from: g */
        public static final C0673s f2599g = new C0673s();

        public C0673s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(CharSequence it) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            return Boolean.valueOf(!isBlank);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Bd0$t */
    /* loaded from: classes3.dex */
    public static final class C0674t extends Lambda implements Function0<Unit> {
        public C0674t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C31874Bd0.this.f2572i.close();
        }
    }

    public C31874Bd0(InterfaceC10636aM birdManager, InterfaceC1880Ea analyticsManager, InterfaceC30556yL birdFinderManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC40001dr4 locationManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC37022Xd0 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdFinderManager, "birdFinderManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f2564a = birdManager;
        this.f2565b = analyticsManager;
        this.f2566c = birdFinderManager;
        this.f2567d = preference;
        this.f2568e = reactiveConfig;
        this.f2569f = locationManager;
        this.f2570g = scopeProvider;
        this.f2571h = ui;
        this.f2572i = navigator;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create()");
        this.f2579p = m31902e;
        Object m33094as = ui.mo74792g().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0653a c0653a = new C0653a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: rd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113773p(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m113795A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m113794B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m113793C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final Boolean m113792D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final Boolean m113791E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final Boolean m113790F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m113773p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m113769t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m113768u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m113767v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m113766w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m113765x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m113764y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m113763z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m113789G(CannotAccessOption cannotAccessOption) {
        int descriptionHint;
        boolean z;
        InaccessibleReason issue = cannotAccessOption.getIssue();
        this.f2575l = issue;
        InaccessibleReportSource inaccessibleReportSource = null;
        if (issue == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedIssue");
            issue = null;
        }
        InaccessibleReason inaccessibleReason = InaccessibleReason.MISSING;
        if (issue == inaccessibleReason) {
            InaccessibleReportSource inaccessibleReportSource2 = this.f2574k;
            if (inaccessibleReportSource2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            } else {
                inaccessibleReportSource = inaccessibleReportSource2;
            }
            if (inaccessibleReportSource == InaccessibleReportSource.RIDER) {
                descriptionHint = C45871nl4.inaccessible_reason_missing_description_hint_rider;
                this.f2571h.mo74802Q6(descriptionHint);
                InterfaceC37022Xd0 interfaceC37022Xd0 = this.f2571h;
                if (cannotAccessOption.getIssue() == inaccessibleReason) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC37022Xd0.mo74800Rb(z);
            }
        }
        descriptionHint = cannotAccessOption.getIssue().getDescriptionHint();
        this.f2571h.mo74802Q6(descriptionHint);
        InterfaceC37022Xd0 interfaceC37022Xd02 = this.f2571h;
        if (cannotAccessOption.getIssue() == inaccessibleReason) {
        }
        interfaceC37022Xd02.mo74800Rb(z);
    }

    /* renamed from: H */
    public final boolean m113788H() {
        InaccessibleReportSource inaccessibleReportSource = this.f2574k;
        InaccessibleReportSource inaccessibleReportSource2 = null;
        if (inaccessibleReportSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource = null;
        }
        if (inaccessibleReportSource != InaccessibleReportSource.CHARGER) {
            InaccessibleReportSource inaccessibleReportSource3 = this.f2574k;
            if (inaccessibleReportSource3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            } else {
                inaccessibleReportSource2 = inaccessibleReportSource3;
            }
            if (inaccessibleReportSource2 != InaccessibleReportSource.RIDER) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC45194md0
    /* renamed from: b */
    public void mo25308b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f2573j = (WireBird) parcelableExtra;
        InaccessibleReportSource inaccessibleReportSource = (InaccessibleReportSource) intent.getParcelableExtra("co.bird.android.inaccessible_source");
        if (inaccessibleReportSource == null) {
            inaccessibleReportSource = InaccessibleReportSource.OPERATOR;
        }
        this.f2574k = inaccessibleReportSource;
        C37429Yw2 c37429Yw2 = C37429Yw2.f47648a;
        WireBird wireBird = this.f2573j;
        InaccessibleReportSource inaccessibleReportSource2 = null;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        if (c37429Yw2.m73968c(wireBird.getLocation().fromLocation(), this.f2569f.mo43616p().getValue()) > m113770s()) {
            C0674t c0674t = new C0674t();
            H31.C3014a.showDialog$default(this.f2571h, C50221v56.f113515d, false, false, c0674t, c0674t, c0674t, null, 70, null);
            return;
        }
        InaccessibleReportSource inaccessibleReportSource3 = this.f2574k;
        if (inaccessibleReportSource3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource3 = null;
        }
        if (inaccessibleReportSource3 != InaccessibleReportSource.CHARGER) {
            this.f2566c.mo3650c();
            this.f2566c.mo3652a(this.f2570g);
        }
        this.f2580q = System.currentTimeMillis();
        InterfaceC1880Ea interfaceC1880Ea = this.f2565b;
        WireBird wireBird2 = this.f2573j;
        if (wireBird2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird2 = null;
        }
        String id = wireBird2.getId();
        InaccessibleReportSource inaccessibleReportSource4 = this.f2574k;
        if (inaccessibleReportSource4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
        } else {
            inaccessibleReportSource2 = inaccessibleReportSource4;
        }
        interfaceC1880Ea.mo55905y(new C44008kd0(null, null, null, id, inaccessibleReportSource2.name(), 7, null));
        InaccessibleReason[] values = InaccessibleReason.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (InaccessibleReason inaccessibleReason : values) {
            arrayList.add(new CannotAccessOption(inaccessibleReason));
        }
        this.f2571h.mo74798S0(arrayList);
        Object m33094as = this.f2571h.mo74787x1().m33094as(AutoDispose.m45239a(this.f2570g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0660h c0660h = new C0660h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113795A(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<Boolean> mo74795Zf = this.f2571h.mo74795Zf();
        final C0670p c0670p = new C0670p();
        Observable<Boolean> doOnNext = mo74795Zf.doOnNext(new InterfaceC23484g() { // from class: vd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113794B(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate(in…nabled(true)\n      })\n  }");
        Observable<CharSequence> mo74789s6 = this.f2571h.mo74789s6();
        final C0671q c0671q = new C0671q();
        Observable<CharSequence> doOnNext2 = mo74789s6.doOnNext(new InterfaceC23484g() { // from class: wd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113793C(Function1.this, obj);
            }
        });
        final C0672r c0672r = C0672r.f2598g;
        InterfaceC23434B map = doOnNext2.map(new InterfaceC23492o() { // from class: xd0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113792D;
                m113792D = C31874Bd0.m113792D(Function1.this, obj);
                return m113792D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onCreate(in…nabled(true)\n      })\n  }");
        Observable combineLatest = Observable.combineLatest(doOnNext, map, new C0654b());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<CharSequence> mo74796Wg = this.f2571h.mo74796Wg();
        final C0673s c0673s = C0673s.f2599g;
        InterfaceC23434B isTextAreaValidated = mo74796Wg.map(new InterfaceC23492o() { // from class: yd0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113791E;
                m113791E = C31874Bd0.m113791E(Function1.this, obj);
                return m113791E;
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f2571h.mo74787x1(), this.f2571h.mo74788v(), new C0655c());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest2, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable<CannotAccessOption> mo74787x1 = this.f2571h.mo74787x1();
        final C0661i c0661i = C0661i.f2587g;
        InterfaceC23434B map2 = mo74787x1.map(new InterfaceC23492o() { // from class: zd0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m113790F;
                m113790F = C31874Bd0.m113790F(Function1.this, obj);
                return m113790F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "ui.issueOptionClicks().map { it.checked }");
        Intrinsics.checkNotNullExpressionValue(isTextAreaValidated, "isTextAreaValidated");
        Observable combineLatest3 = Observable.combineLatest(map2, combineLatest, isTextAreaValidated, combineLatest2, new C0656d());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest3, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        Object m33094as2 = combineLatest3.m33094as(AutoDispose.m45239a(this.f2570g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0662j c0662j = new C0662j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ad0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113769t(Function1.this, obj);
            }
        };
        final C0663k c0663k = C0663k.f2589g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: od0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113768u(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f2571h.mo74793e(), this.f2579p);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.submitBu…rogrammaticSubmitSubject)");
        Observable m31950a = C24527f.m31950a(merge, this.f2571h.mo74788v());
        final C0664l c0664l = new C0664l();
        Observable doOnNext3 = m31950a.doOnNext(new InterfaceC23484g() { // from class: pd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113767v(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "override fun onCreate(in…nabled(true)\n      })\n  }");
        Observable m74585J = C37279Yf5.m74585J(doOnNext3, new C0665m(), new C0666n());
        final C0667o c0667o = new C0667o();
        Observable observeOn = m74585J.flatMapSingle(new InterfaceC23492o() { // from class: qd0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m113766w;
                m113766w = C31874Bd0.m113766w(Function1.this, obj);
                return m113766w;
            }
        }).retry().observeOn(C23454a.m33087a());
        final C0657e c0657e = new C0657e();
        Observable doOnEach = observeOn.doOnEach(new InterfaceC23484g() { // from class: sd0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113765x(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnEach, "override fun onCreate(in…nabled(true)\n      })\n  }");
        Object m33094as3 = doOnEach.m33094as(AutoDispose.m45239a(this.f2570g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0658f c0658f = new C0658f();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: td0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113764y(Function1.this, obj);
            }
        };
        final C0659g c0659g = new C0659g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: ud0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31874Bd0.m113763z(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC45194md0
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String stringExtra;
        if (i != 10000) {
            if (i == 10026 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("photo_url")) != null) {
                this.f2571h.mo74791j(stringExtra);
                return;
            }
            return;
        }
        this.f2577n = true;
        boolean z2 = false;
        if (intent != null && intent.getBooleanExtra("co.bird.android.bird_finder_bird_found", false)) {
            z = true;
        } else {
            z = false;
        }
        this.f2571h.mo74794a6(!z);
        if (z) {
            this.f2571h.mo74790p(false);
            if (intent != null && intent.getBooleanExtra("co.bird.android.bird_capture_action", false)) {
                z2 = true;
            }
            if (z2) {
                this.f2572i.mo37029e4(-1, intent);
            }
            this.f2578o = true;
        } else if (i2 == -1) {
            this.f2579p.onNext(Unit.INSTANCE);
        }
    }

    /* renamed from: q */
    public final int m113772q() {
        InaccessibleReportSource inaccessibleReportSource = this.f2574k;
        WireBird wireBird = null;
        if (inaccessibleReportSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource = null;
        }
        if (inaccessibleReportSource == InaccessibleReportSource.OPERATOR) {
            C36207Tq4 c36207Tq4 = this.f2568e;
            WireBird wireBird2 = this.f2573j;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            return C36441Uq4.m80769c(c36207Tq4, wireBird).getInaccessibleBirdConfig().getOperatorRoleConfig().getMarkMissingBirdFinderRequiredIntervalSeconds();
        }
        WireBird wireBird3 = this.f2573j;
        if (wireBird3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird3 = null;
        }
        if (WireBirdKt.isSpecialTaskDispatch(wireBird3)) {
            C36207Tq4 c36207Tq42 = this.f2568e;
            WireBird wireBird4 = this.f2573j;
            if (wireBird4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird4;
            }
            return C36441Uq4.m80769c(c36207Tq42, wireBird).getInaccessibleBirdConfig().getSuperchargerRoleConfig().getMarkMissingBirdFinderRequiredIntervalSeconds();
        }
        InaccessibleReportSource inaccessibleReportSource2 = this.f2574k;
        if (inaccessibleReportSource2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource2 = null;
        }
        if (inaccessibleReportSource2 == InaccessibleReportSource.CHARGER) {
            C36207Tq4 c36207Tq43 = this.f2568e;
            WireBird wireBird5 = this.f2573j;
            if (wireBird5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird5;
            }
            return C36441Uq4.m80769c(c36207Tq43, wireBird).getInaccessibleBirdConfig().getChargerRoleConfig().getMarkMissingBirdFinderRequiredIntervalSeconds();
        }
        C36207Tq4 c36207Tq44 = this.f2568e;
        WireBird wireBird6 = this.f2573j;
        if (wireBird6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
        } else {
            wireBird = wireBird6;
        }
        return C36441Uq4.m80769c(c36207Tq44, wireBird).getInaccessibleBirdConfig().getRiderRoleConfig().getMarkMissingBirdFinderRequiredIntervalSeconds();
    }

    /* renamed from: r */
    public final int m113771r() {
        return ((int) (System.currentTimeMillis() - this.f2580q)) / 1000;
    }

    /* renamed from: s */
    public final float m113770s() {
        InaccessibleReportSource inaccessibleReportSource = this.f2574k;
        WireBird wireBird = null;
        if (inaccessibleReportSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource = null;
        }
        if (inaccessibleReportSource == InaccessibleReportSource.OPERATOR) {
            C36207Tq4 c36207Tq4 = this.f2568e;
            WireBird wireBird2 = this.f2573j;
            if (wireBird2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird2;
            }
            return C36441Uq4.m80769c(c36207Tq4, wireBird).getInaccessibleBirdConfig().getOperatorRoleConfig().getCannotAccessThresholdRadiusMeters();
        }
        WireBird wireBird3 = this.f2573j;
        if (wireBird3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird3 = null;
        }
        if (WireBirdKt.isSpecialTaskDispatch(wireBird3)) {
            C36207Tq4 c36207Tq42 = this.f2568e;
            WireBird wireBird4 = this.f2573j;
            if (wireBird4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird4;
            }
            return C36441Uq4.m80769c(c36207Tq42, wireBird).getInaccessibleBirdConfig().getSuperchargerRoleConfig().getCannotAccessThresholdRadiusMeters();
        }
        InaccessibleReportSource inaccessibleReportSource2 = this.f2574k;
        if (inaccessibleReportSource2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Stripe3ds2AuthParams.FIELD_SOURCE);
            inaccessibleReportSource2 = null;
        }
        if (inaccessibleReportSource2 == InaccessibleReportSource.CHARGER) {
            C36207Tq4 c36207Tq43 = this.f2568e;
            WireBird wireBird5 = this.f2573j;
            if (wireBird5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
            } else {
                wireBird = wireBird5;
            }
            return C36441Uq4.m80769c(c36207Tq43, wireBird).getInaccessibleBirdConfig().getChargerRoleConfig().getCannotAccessThresholdRadiusMeters();
        }
        C36207Tq4 c36207Tq44 = this.f2568e;
        WireBird wireBird6 = this.f2573j;
        if (wireBird6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
        } else {
            wireBird = wireBird6;
        }
        return C36441Uq4.m80769c(c36207Tq44, wireBird).getInaccessibleBirdConfig().getRiderRoleConfig().getCannotAccessThresholdRadiusMeters();
    }
}
