package p000;

import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBatch;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B{\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006("}, m28432d2 = {"Lu40;", "LfA;", "LvW0;", "x", "LvW0;", "converter", "Lco/bird/android/model/constant/ScanIntention;", "y", "Lco/bird/android/model/constant/ScanIntention;", "j0", "()Lco/bird/android/model/constant/ScanIntention;", "scanIntention", "LXl3;", "operatorInventoryManager", "Lom3;", "operatorManager", "LpJ;", "bluetoothManager", "Lbn;", "areaManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lv40;", "ui", "Le13;", "navigator", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "Let3;", "delegate", "LEa;", "analyticsManager", "Lco/bird/android/model/wire/WireBatch;", "batch", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LTq4;", "reactiveConfig", "<init>", "(LXl3;Lom3;LpJ;Lbn;Lcom/uber/autodispose/ScopeProvider;Lv40;Le13;Lco/bird/android/model/constant/BulkScanPurpose;Let3;LEa;Lco/bird/android/model/wire/WireBatch;Lco/bird/android/core/mvp/BaseActivity;LTq4;LvW0;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkScannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/regular/BulkScannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,87:1\n180#2:88\n180#2:89\n199#2:90\n*S KotlinDebug\n*F\n+ 1 BulkScannerPresenterImpl.kt\nco/bird/android/feature/bulkscanner/scan/regular/BulkScannerPresenterImpl\n*L\n58#1:88\n64#1:89\n74#1:90\n*E\n"})
/* renamed from: u40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49613u40 extends AbstractC20252fA {

    /* renamed from: x */
    public final C50463vW0 f111670x;

    /* renamed from: y */
    public final ScanIntention f111671y;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u00012,\u0010\u0005\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/Bird;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "LH6;", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u40$a */
    /* loaded from: classes3.dex */
    public static final class C29041a extends Lambda implements Function1<Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>>, List<? extends C3023H6>> {
        public C29041a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends C3023H6> invoke(Pair<? extends List<? extends Bird>, ? extends List<? extends WireBird>> pair) {
            return invoke2((Pair<? extends List<Bird>, ? extends List<WireBird>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<C3023H6> invoke2(Pair<? extends List<Bird>, ? extends List<WireBird>> pair) {
            List<Bird> reversed;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<WireBird> tasks = pair.component2();
            C50463vW0 c50463vW0 = C49613u40.this.f111670x;
            reversed = CollectionsKt___CollectionsKt.reversed(pair.component1());
            Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
            return c50463vW0.m8572a(reversed, tasks);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u40$b */
    /* loaded from: classes3.dex */
    public static final class C29042b extends Lambda implements Function1<List<? extends C3023H6>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50205v40 f111673g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29042b(InterfaceC50205v40 interfaceC50205v40) {
            super(1);
            this.f111673g = interfaceC50205v40;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            InterfaceC50205v40 interfaceC50205v40 = this.f111673g;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            interfaceC50205v40.mo7500Ve(!sections.isEmpty());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u40$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29043c extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C29043c(Object obj) {
            super(1, obj, InterfaceC50205v40.class, "populateBirds", "populateBirds(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC50205v40) this.receiver).mo7473xb(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LDI3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LDI3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u40$d */
    /* loaded from: classes3.dex */
    public static final class C29044d extends Lambda implements Function1<DI3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC50205v40 f111674g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29044d(InterfaceC50205v40 interfaceC50205v40) {
            super(1);
            this.f111674g = interfaceC50205v40;
        }

        /* renamed from: a */
        public final void m10903a(DI3 di3) {
            this.f111674g.mo7500Ve(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DI3 di3) {
            m10903a(di3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u40$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29045e extends FunctionReferenceImpl implements Function1<DI3, Unit> {
        public C29045e(Object obj) {
            super(1, obj, InterfaceC50205v40.class, "addPartToBulk", "addPartToBulk(Lco/bird/android/feature/bulkscanner/scan/viewmodels/PartViewModel;)V", 0);
        }

        /* renamed from: a */
        public final void m10902a(DI3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC50205v40) this.receiver).mo7487f6(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DI3 di3) {
            m10902a(di3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "demandLevel", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u40$f */
    /* loaded from: classes3.dex */
    public static final class C29046f extends Lambda implements Function1<Optional<Integer>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC1880Ea f111675g;

        /* renamed from: h */
        public final /* synthetic */ C49613u40 f111676h;

        /* renamed from: i */
        public final /* synthetic */ String f111677i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29046f(InterfaceC1880Ea interfaceC1880Ea, C49613u40 c49613u40, String str) {
            super(1);
            this.f111675g = interfaceC1880Ea;
            this.f111676h = c49613u40;
            this.f111677i = str;
        }

        /* renamed from: a */
        public final void m10901a(Optional<Integer> optional) {
            this.f111675g.mo55905y(new C52577z40(null, this.f111676h.m41858k0(), null, null, this.f111677i, optional.m59035e(), 13, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Integer> optional) {
            m10901a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u40$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29047g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C29047g f111678b = new C29047g();

        public C29047g() {
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

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u40$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29048h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BulkScanPurpose.values().length];
            try {
                iArr[BulkScanPurpose.ADD_TO_BATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BulkScanPurpose.WAKE_VEHICLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49613u40(InterfaceC37097Xl3 operatorInventoryManager, InterfaceC46473om3 operatorManager, InterfaceC27246pJ bluetoothManager, InterfaceC12495bn areaManager, ScopeProvider scopeProvider, InterfaceC50205v40 ui, InterfaceC40099e13 navigator, BulkScanPurpose purpose, InterfaceC40613et3 delegate, InterfaceC1880Ea analyticsManager, WireBatch wireBatch, BaseActivity activity, C36207Tq4 reactiveConfig, C50463vW0 converter) {
        super(activity, operatorInventoryManager, operatorManager, bluetoothManager, scopeProvider, ui, navigator, purpose, delegate, analyticsManager, wireBatch, reactiveConfig);
        List<WireBird> emptyList;
        String name;
        Intrinsics.checkNotNullParameter(operatorInventoryManager, "operatorInventoryManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f111670x = converter;
        this.f111671y = ScanIntention.BULK_SCAN;
        C24523e c24523e = C24523e.f91168a;
        Observable<List<Bird>> mo8093l1 = operatorManager.mo8093l1(purpose);
        C24552a<List<WireBird>> m41856l0 = m41856l0();
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<WireBird>> startWith = m41856l0.startWith((C24552a<List<WireBird>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "tasksSubject.startWith(emptyList<WireBird>())");
        Observable m31956a = c24523e.m31956a(mo8093l1, startWith);
        final C29041a c29041a = new C29041a();
        Observable observeOn = m31956a.map(new InterfaceC23492o() { // from class: n40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m10910r1;
                m10910r1 = C49613u40.m10910r1(Function1.this, obj);
                return m10910r1;
            }
        }).observeOn(C23454a.m33087a());
        final C29042b c29042b = new C29042b(ui);
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: o40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10909s1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "Observables.combineLates…(sections.isNotEmpty()) }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29043c c29043c = new C29043c(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: p40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10908t1(Function1.this, obj);
            }
        });
        Observable<DI3> observeOn2 = m41863i0().observeOn(C23454a.m33087a());
        final C29044d c29044d = new C29044d(ui);
        Observable<DI3> doOnNext2 = observeOn2.doOnNext(new InterfaceC23484g() { // from class: q40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10907u1(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "partsSubject\n      .obse….enableBulkUpdate(true) }");
        Object m33094as2 = doOnNext2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29045e c29045e = new C29045e(ui);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: r40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10906v1(Function1.this, obj);
            }
        });
        int i = C29048h.$EnumSwitchMapping$0[purpose.ordinal()];
        if (i == 1) {
            name = purpose.name();
        } else if (i != 2) {
            ScanIntention mo10918j0 = mo10918j0();
            name = mo10918j0 != null ? mo10918j0.name() : null;
            Intrinsics.checkNotNull(name);
        } else {
            name = "bulk_scan_to_wake";
        }
        Object m33135e = areaManager.mo64012N().m33135e(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29046f c29046f = new C29046f(analyticsManager, this, name);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: s40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10905w1(Function1.this, obj);
            }
        };
        final C29047g c29047g = C29047g.f111678b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: t40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49613u40.m10904x1(Function1.this, obj);
            }
        });
    }

    /* renamed from: r1 */
    public static final List m10910r1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: s1 */
    public static final void m10909s1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t1 */
    public static final void m10908t1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u1 */
    public static final void m10907u1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v1 */
    public static final void m10906v1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w1 */
    public static final void m10905w1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x1 */
    public static final void m10904x1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20252fA
    /* renamed from: j0 */
    public ScanIntention mo10918j0() {
        return this.f111671y;
    }
}
