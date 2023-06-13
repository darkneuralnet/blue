package p000;

import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
import p000.MC5;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LMC5;", "Lf1;", "LNC5;", "LOC5;", "renderer", "", "p", "LO86;", "e", "LO86;", "transferOrderManager", "<init>", "(LO86;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderVehiclesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,47:1\n180#2:48\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter\n*L\n34#1:48\n*E\n"})
/* renamed from: MC5 */
/* loaded from: classes3.dex */
public final class MC5 extends AbstractC20169f1<NC5, OC5> {

    /* renamed from: e */
    public final O86 f22800e;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "skuOrderId", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MC5$a */
    /* loaded from: classes3.dex */
    public static final class C5219a extends Lambda implements Function1<String, InterfaceC23447K<? extends Pair<? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "Lco/bird/android/model/wire/WireSkuScannedItems;", "scannedItems", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuOrder;Lco/bird/android/model/wire/WireSkuScannedItems;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MC5$a$a */
        /* loaded from: classes3.dex */
        public static final class C5220a extends Lambda implements Function2<WireSkuOrder, WireSkuScannedItems, Pair<? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>>> {

            /* renamed from: g */
            public static final C5220a f22802g = new C5220a();

            public C5220a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Pair<WireSkuOrder, List<WireSuccessfulScannedItem>> invoke(WireSkuOrder skuOrder, WireSkuScannedItems scannedItems) {
                Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
                Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
                return TuplesKt.m28425to(skuOrder, scannedItems.getSuccessfulScannedItems());
            }
        }

        public C5219a() {
            super(1);
        }

        /* renamed from: b */
        public static final Pair m95584b(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<WireSkuOrder, List<WireSuccessfulScannedItem>>> invoke(String skuOrderId) {
            Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
            AbstractC23442F<WireSkuOrder> mo80296h = MC5.this.f22800e.mo80296h(skuOrderId);
            AbstractC23442F<WireSkuScannedItems> mo80279w = MC5.this.f22800e.mo80279w(skuOrderId);
            final C5220a c5220a = C5220a.f22802g;
            return AbstractC23442F.m33109r0(mo80296h, mo80279w, new InterfaceC23480c() { // from class: LC5
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    Pair m95584b;
                    m95584b = MC5.C5219a.m95584b(Function2.this, obj, obj2);
                    return m95584b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MC5$b */
    /* loaded from: classes3.dex */
    public static final class C5221b extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOC5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOC5;)LOC5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSkuOrderVehiclesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$2$1\n+ 2 SkuOrderVehiclesState.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesStateKt\n*L\n1#1,47:1\n27#2,8:48\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$2$1\n*L\n29#1:48,8\n*E\n"})
        /* renamed from: MC5$b$a */
        /* loaded from: classes3.dex */
        public static final class C5222a extends Lambda implements Function1<OC5, OC5> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f22804g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5222a(Throwable th) {
                super(1);
                this.f22804g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OC5 invoke(OC5 state) {
                OC5 oc5;
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C35871Sf1.class);
                if (!(state instanceof C35871Sf1)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    if (primaryConstructor != null) {
                        oc5 = (OC5) primaryConstructor.call(state.mo72802a(), state.mo72801b(), state.getError());
                    } else {
                        oc5 = null;
                    }
                    if (oc5 != null) {
                        state = (C35871Sf1) oc5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.sku.vehicles.Error");
                    }
                }
                return C35871Sf1.copy$default((C35871Sf1) state, null, null, this.f22804g, 3, null);
            }
        }

        public C5221b() {
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
            MC5.this.m42279i(new C5222a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MC5$c */
    /* loaded from: classes3.dex */
    public static final class C5223c extends Lambda implements Function1<Pair<? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOC5;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LOC5;)LOC5;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSkuOrderVehiclesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$3$1\n+ 2 SkuOrderVehiclesState.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesStateKt\n*L\n1#1,47:1\n27#2,8:48\n*S KotlinDebug\n*F\n+ 1 SkuOrderVehiclesPresenter.kt\nco/bird/android/feature/transferorder/sku/vehicles/SkuOrderVehiclesPresenter$consume$3$1\n*L\n37#1:48,8\n*E\n"})
        /* renamed from: MC5$c$a */
        /* loaded from: classes3.dex */
        public static final class C5224a extends Lambda implements Function1<OC5, OC5> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f22806g;

            /* renamed from: h */
            public final /* synthetic */ List<WireSuccessfulScannedItem> f22807h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5224a(WireSkuOrder wireSkuOrder, List<WireSuccessfulScannedItem> list) {
                super(1);
                this.f22806g = wireSkuOrder;
                this.f22807h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OC5 invoke(OC5 state) {
                OC5 oc5;
                Intrinsics.checkNotNullParameter(state, "state");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(C37505Ze6.class);
                if (!(state instanceof C37505Ze6)) {
                    KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                    if (primaryConstructor != null) {
                        oc5 = (OC5) primaryConstructor.call(state.mo72802a(), state.mo72801b(), state.getError());
                    } else {
                        oc5 = null;
                    }
                    if (oc5 != null) {
                        state = (C37505Ze6) oc5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.transferorder.sku.vehicles.UpdateUi");
                    }
                }
                return ((C37505Ze6) state).m72800c(this.f22806g, this.f22807h, null);
            }
        }

        public C5223c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>> pair) {
            invoke2((Pair<WireSkuOrder, ? extends List<WireSuccessfulScannedItem>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireSkuOrder, ? extends List<WireSuccessfulScannedItem>> pair) {
            MC5.this.m42279i(new C5224a(pair.component1(), pair.component2()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC5(O86 transferOrderManager) {
        super(new C37505Ze6(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        this.f22800e = transferOrderManager;
    }

    /* renamed from: g */
    public static final void m95592g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m95587q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m95586r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: p */
    public void consume(NC5 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<String> mo56360Q4 = renderer.mo56360Q4();
        final C5219a c5219a = new C5219a();
        Observable<R> flatMapSingle = mo56360Q4.flatMapSingle(new InterfaceC23492o() { // from class: IC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95587q;
                m95587q = MC5.m95587q(Function1.this, obj);
                return m95587q;
            }
        });
        final C5221b c5221b = new C5221b();
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: JC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MC5.m95592g(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "@Suppress(\"UNCHECKED_CAS…  )\n        }\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5223c c5223c = new C5223c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MC5.m95586r(Function1.this, obj);
            }
        });
    }
}
