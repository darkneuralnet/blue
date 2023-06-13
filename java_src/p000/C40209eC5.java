package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24558d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C40209eC5;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\"j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"LeC5;", "", "", "i", "LgC5;", C17296a.f69688o, "LgC5;", "ui", "LVB5;", "b", "LVB5;", "converter", "Le13;", "c", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "e", "LO86;", "transferOrderManager", "", "f", "Ljava/lang/String;", "skuOrderId", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "itemsScannedSubject", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "missingSkuAndReason", "<init>", "(LgC5;LVB5;Le13;Lcom/uber/autodispose/ScopeProvider;LO86;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuInvestigationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationPresenter.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,73:1\n199#2:74\n180#2:75\n180#2:76\n180#2:77\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationPresenter.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationPresenter\n*L\n33#1:74\n41#1:75\n46#1:76\n67#1:77\n*E\n"})
/* renamed from: eC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40209eC5 {

    /* renamed from: a */
    public final C41395gC5 f78102a;

    /* renamed from: b */
    public final VB5 f78103b;

    /* renamed from: c */
    public final InterfaceC40099e13 f78104c;

    /* renamed from: d */
    public final ScopeProvider f78105d;

    /* renamed from: e */
    public final O86 f78106e;

    /* renamed from: f */
    public final String f78107f;

    /* renamed from: g */
    public final C24558d<WireSkuScannedItems> f78108g;

    /* renamed from: h */
    public final HashMap<String, String> f78109h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eC5$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19984a extends FunctionReferenceImpl implements Function1<WireSkuScannedItems, Unit> {
        public C19984a(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m43107a(WireSkuScannedItems p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m43107a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eC5$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19985b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C19985b(Object obj) {
            super(1, obj, C41395gC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41395gC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "scans", "Lio/reactivex/K;", "", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eC5$c */
    /* loaded from: classes3.dex */
    public static final class C19986c extends Lambda implements Function1<WireSkuScannedItems, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C19986c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(WireSkuScannedItems scans) {
            Intrinsics.checkNotNullParameter(scans, "scans");
            return C40209eC5.this.f78103b.m80240b(WireSkuScannedItemsKt.inboundMissingItems(scans.getSuccessfulScannedItems()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eC5$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19987d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C19987d(Object obj) {
            super(1, obj, C41395gC5.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41395gC5) this.receiver).m39871b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSkuInvestigationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationPresenter.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationPresenter$onResume$5\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n167#2,3:74\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationPresenter.kt\nco/bird/android/feature/transferorder/sku/investigation/SkuInvestigationPresenter$onResume$5\n*L\n51#1:74,3\n*E\n"})
    /* renamed from: eC5$e */
    /* loaded from: classes3.dex */
    public static final class C19988e extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends String>, ? extends WireSkuScannedItems>, Unit> {
        public C19988e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends String, ? extends String>, ? extends WireSkuScannedItems> pair) {
            invoke2((Pair<Pair<String, String>, WireSkuScannedItems>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<String, String>, WireSkuScannedItems> pair) {
            boolean z;
            boolean z2;
            Pair<String, String> component1 = pair.component1();
            C40209eC5.this.f78109h.put(component1.component1(), component1.component2());
            boolean z3 = false;
            if (C40209eC5.this.f78109h.size() == WireSkuScannedItemsKt.inboundMissingItems(pair.component2().getSuccessfulScannedItems()).size()) {
                HashMap hashMap = C40209eC5.this.f78109h;
                if (!hashMap.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getValue()).length() > 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
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
            C40209eC5.this.f78102a.m39873L0(z3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eC5$f */
    /* loaded from: classes3.dex */
    public static final class C19989f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends WireSkuOrder>> {
        public C19989f() {
            super(1);
        }

        /* renamed from: b */
        public static final InterfaceC23447K m43104b(C40209eC5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f78106e.mo80296h(this$0.f78107f);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireSkuOrder> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo80295i = C40209eC5.this.f78106e.mo80295i(C40209eC5.this.f78107f, C40209eC5.this.f78109h);
            final C40209eC5 c40209eC5 = C40209eC5.this;
            return mo80295i.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: fC5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m43104b;
                    m43104b = C40209eC5.C19989f.m43104b(C40209eC5.this);
                    return m43104b;
                }
            }));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eC5$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C19990g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C19990g(Object obj) {
            super(1, obj, C41395gC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41395gC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "skuOrder", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuOrder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: eC5$h */
    /* loaded from: classes3.dex */
    public static final class C19991h extends Lambda implements Function1<WireSkuOrder, Unit> {
        public C19991h() {
            super(1);
        }

        /* renamed from: a */
        public final void m43103a(WireSkuOrder wireSkuOrder) {
            C40209eC5.this.f78104c.mo36919x0(wireSkuOrder.getContainerOrderId());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuOrder wireSkuOrder) {
            m43103a(wireSkuOrder);
            return Unit.INSTANCE;
        }
    }

    public C40209eC5(C41395gC5 ui, VB5 converter, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, O86 transferOrderManager, String skuOrderId) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        this.f78102a = ui;
        this.f78103b = converter;
        this.f78104c = navigator;
        this.f78105d = scopeProvider;
        this.f78106e = transferOrderManager;
        this.f78107f = skuOrderId;
        C24558d<WireSkuScannedItems> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireSkuScannedItems>()");
        this.f78108g = m31902e;
        this.f78109h = new HashMap<>();
    }

    /* renamed from: j */
    public static final void m43115j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m43114k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final InterfaceC23447K m43113l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m43112m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m43111n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final InterfaceC23447K m43110o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m43109p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m43108q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public final void m43116i() {
        AbstractC23442F<WireSkuScannedItems> m33146T = this.f78106e.mo80279w(this.f78107f).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "transferOrderManager.get…uOrderId)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f78105d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19984a c19984a = new C19984a(this.f78108g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: WB5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43115j(Function1.this, obj);
            }
        };
        final C19985b c19985b = new C19985b(this.f78102a);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: XB5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43114k(Function1.this, obj);
            }
        });
        C24558d<WireSkuScannedItems> c24558d = this.f78108g;
        final C19986c c19986c = new C19986c();
        Observable observeOn = c24558d.flatMapSingle(new InterfaceC23492o() { // from class: YB5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m43113l;
                m43113l = C40209eC5.m43113l(Function1.this, obj);
                return m43113l;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    tra…ainerOrderId)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f78105d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19987d c19987d = new C19987d(this.f78102a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ZB5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43112m(Function1.this, obj);
            }
        });
        Object m33094as2 = C24527f.m31950a(this.f78102a.m39872Pl(), this.f78108g).m33094as(AutoDispose.m45239a(this.f78105d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19988e c19988e = new C19988e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: aC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43111n(Function1.this, obj);
            }
        });
        Observable<Unit> m39870c = this.f78102a.m39870c();
        final C19989f c19989f = new C19989f();
        Observable observeOn2 = m39870c.flatMapSingle(new InterfaceC23492o() { // from class: bC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m43110o;
                m43110o = C40209eC5.m43110o(Function1.this, obj);
                return m43110o;
            }
        }).observeOn(C23454a.m33087a());
        final C19990g c19990g = new C19990g(this.f78102a);
        Observable retry = observeOn2.doOnError(new InterfaceC23484g() { // from class: cC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43109p(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    tra…ainerOrderId)\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f78105d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C19991h c19991h = new C19991h();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: dC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40209eC5.m43108q(Function1.this, obj);
            }
        });
    }
}
