package p000;

import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b!\u0010\"J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u001a\u0010\u0014\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006#"}, m28432d2 = {"LEt3;", "LcC;", "LjE;", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "", "showCodeInput", "", "requiredVehicleId", "", "M", "Lco/bird/android/model/wire/WireBird;", "bird", "L", "e", "LjE;", "getUi", "()LjE;", "ui", "Lio/reactivex/subjects/g;", "f", "Lio/reactivex/subjects/g;", "resultSubject", "Ldm5;", "scannerNavigator", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "reactiveConfig", "Lom3;", "operatorManager", "<init>", "(LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;LTq4;Lom3;Lio/reactivex/subjects/g;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorSingleScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSingleScanPresenter.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,54:1\n180#2:55\n*S KotlinDebug\n*F\n+ 1 OperatorSingleScanPresenter.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanPresenter\n*L\n41#1:55\n*E\n"})
/* renamed from: Et3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32723Et3 extends AbstractC13443cC<C24739jE> {

    /* renamed from: e */
    public final C24739jE f8262e;

    /* renamed from: f */
    public final C24567g<WireBird> f8263f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Et3$a */
    /* loaded from: classes4.dex */
    public static final class C2014a extends Lambda implements Function1<Bird, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f8264g;

        /* renamed from: h */
        public final /* synthetic */ C32723Et3 f8265h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2014a(String str, C32723Et3 c32723Et3) {
            super(1);
            this.f8264g = str;
            this.f8265h = c32723Et3;
        }

        /* renamed from: a */
        public final void m108255a(Bird bird) {
            if (this.f8264g != null && !Intrinsics.areEqual(bird.getId(), this.f8264g)) {
                this.f8265h.getUi().m86360xm();
                this.f8265h.getUi().m86370p3();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bird bird) {
            m108255a(bird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Et3$b */
    /* loaded from: classes4.dex */
    public static final class C2015b extends Lambda implements Function1<Bird, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f8266g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2015b(String str) {
            super(1);
            this.f8266g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Bird bird) {
            boolean z;
            Intrinsics.checkNotNullParameter(bird, "bird");
            if (this.f8266g != null && !Intrinsics.areEqual(bird.getId(), this.f8266g)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Et3$c */
    /* loaded from: classes4.dex */
    public static final class C2016c extends Lambda implements Function1<Bird, WireBird> {

        /* renamed from: g */
        public static final C2016c f8267g = new C2016c();

        public C2016c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireBird invoke(Bird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return C0613BT.m114027f(bird);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Et3$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C2017d extends FunctionReferenceImpl implements Function1<WireBird, Unit> {
        public C2017d(Object obj) {
            super(1, obj, C32723Et3.class, "onBirdIdentified", "onBirdIdentified(Lco/bird/android/model/wire/WireBird;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            invoke2(wireBird);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(WireBird p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C32723Et3) this.receiver).m108261L(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32723Et3(C24739jE ui, InterfaceC39953dm5 scannerNavigator, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC46473om3 operatorManager, C24567g<WireBird> resultSubject) {
        super(scannerNavigator, scopeProvider, reactiveConfig, operatorManager);
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scannerNavigator, "scannerNavigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(resultSubject, "resultSubject");
        this.f8262e = ui;
        this.f8263f = resultSubject;
    }

    /* renamed from: N */
    public static final boolean m108259N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: O */
    public static final WireBird m108258O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireBird) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m108257P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m108256i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public final void m108261L(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f8263f.onSuccess(bird);
        getUi().dismiss();
    }

    /* renamed from: M */
    public final void m108260M(ScanMode mode, ScanIntention scanIntention, boolean z, String str) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        getUi().m86362vm(z);
        Observable<Bird> observeOn = m61749B(mode, scanIntention, false).observeOn(C23454a.m33087a());
        final C2014a c2014a = new C2014a(str, this);
        Observable<Bird> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: At3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32723Et3.m108256i(Function1.this, obj);
            }
        });
        final C2015b c2015b = new C2015b(str);
        Observable<Bird> filter = doOnNext.filter(new InterfaceC23494q() { // from class: Bt3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m108259N;
                m108259N = C32723Et3.m108259N(Function1.this, obj);
                return m108259N;
            }
        });
        final C2016c c2016c = C2016c.f8267g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: Ct3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireBird m108258O;
                m108258O = C32723Et3.m108258O(Function1.this, obj);
                return m108258O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun onResume(mode: ScanM…e(::onBirdIdentified)\n  }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(m34312e()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2017d c2017d = new C2017d(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Dt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C32723Et3.m108257P(Function1.this, obj);
            }
        });
    }

    @Override // p000.AbstractC23170iE
    public C24739jE getUi() {
        return this.f8262e;
    }
}
