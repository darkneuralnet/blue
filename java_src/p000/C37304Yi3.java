package p000;

import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.persistence.SkuOrderKt;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37304Yi3;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b+\u0010,J\b\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LYi3;", "Lf1;", "Lbj3;", "Lrv1;", "Lio/reactivex/c;", "j0", "Lco/bird/android/model/persistence/SkuOrder;", "skuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "successScans", "", "failedScanQuantity", "", "n0", "renderer", "M", "LO86;", "e", "LO86;", "transferOrderManager", "LDQ3;", "f", "LDQ3;", "permissionManager", "", "g", "Ljava/lang/String;", "skuOrderId", "Lxi3;", "h", "Lxi3;", "converter", "Le13;", "i", "Le13;", "navigator", "Lma4;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "j", "Lma4;", "scannedItemsRelay", "<init>", "(LO86;LDQ3;Ljava/lang/String;Lxi3;Le13;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorAllocationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n22#2,2:175\n180#3:177\n180#3:178\n180#3:179\n180#3:180\n180#3:181\n237#3:182\n237#3:183\n1726#4,3:184\n1747#4,3:187\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter\n*L\n38#1:175,2\n60#1:177\n70#1:178\n98#1:179\n107#1:180\n121#1:181\n137#1:182\n143#1:183\n165#1:184,3\n166#1:187,3\n*E\n"})
/* renamed from: Yi3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37304Yi3 extends AbstractC20169f1<InterfaceC38717bj3, AbstractC48340rv1> {

    /* renamed from: e */
    public final O86 f46321e;

    /* renamed from: f */
    public final DQ3 f46322f;

    /* renamed from: g */
    public final String f46323g;

    /* renamed from: h */
    public final C51768xi3 f46324h;

    /* renamed from: i */
    public final InterfaceC40099e13 f46325i;

    /* renamed from: j */
    public final C45168ma4<WireSkuScannedItems> f46326j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$A */
    /* loaded from: classes3.dex */
    public static final class C9923A extends Lambda implements Function1<Throwable, Unit> {
        public C9923A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C52470yt2(false));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter\n*L\n1#1,304:1\n41#2:305\n*E\n"})
    /* renamed from: Yi3$a */
    /* loaded from: classes3.dex */
    public static final class C9924a<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            return (R) TuplesKt.m28425to((WireSkuScannedItems) t1, (SkuOrder) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "completed", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$b */
    /* loaded from: classes3.dex */
    public static final class C9925b extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends Boolean>> {
        public C9925b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Boolean> invoke(Boolean completed) {
            Intrinsics.checkNotNullParameter(completed, "completed");
            return C37304Yi3.this.m74397j0().m33042m(AbstractC23442F.m33158H(completed)).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/SkuOrder;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$c */
    /* loaded from: classes3.dex */
    public static final class C9926c extends Lambda implements Function1<Pair<? extends Boolean, ? extends SkuOrder>, Unit> {
        public C9926c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends SkuOrder> pair) {
            invoke2((Pair<Boolean, SkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, SkuOrder> pair) {
            Boolean completed = pair.component1();
            SkuOrder skuOrder = pair.component2();
            Intrinsics.checkNotNullExpressionValue(completed, "completed");
            if (completed.booleanValue()) {
                C37304Yi3 c37304Yi3 = C37304Yi3.this;
                Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
                boolean isInbound = SkuOrderKt.isInbound(skuOrder);
                String name = skuOrder.getTransferOrderLineItem().getTransferOrder().getDestinationWarehouse().getName();
                String name2 = skuOrder.getTransferOrderLineItem().getDestinationFleet().getName();
                if (name2 == null && (name2 = skuOrder.getTransferOrderLineItem().getDestinationFleet().getPartnerId()) == null) {
                    name2 = "";
                }
                c37304Yi3.m42280h(new C49678uA5(isInbound, name, name2));
                C37304Yi3.this.m42280h(KM1.f19481a);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$d */
    /* loaded from: classes3.dex */
    public static final class C9927d extends Lambda implements Function1<Throwable, Unit> {
        public C9927d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C48932sv1(th.getMessage()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/SkuOrder;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$e */
    /* loaded from: classes3.dex */
    public static final class C9928e extends Lambda implements Function1<Pair<? extends Boolean, ? extends SkuOrder>, Unit> {

        /* renamed from: g */
        public static final C9928e f46331g = new C9928e();

        public C9928e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, SkuOrder> pair) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends SkuOrder> pair) {
            invoke2((Pair<Boolean, SkuOrder>) pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9929f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C9929f f46332b = new C9929f();

        public C9929f() {
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

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$g */
    /* loaded from: classes3.dex */
    public static final class C9930g extends Lambda implements Function1<Unit, Unit> {
        public C9930g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37304Yi3.this.m42280h(C51335wy3.f116904a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$h */
    /* loaded from: classes3.dex */
    public static final class C9931h extends Lambda implements Function1<Unit, Unit> {
        public C9931h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37304Yi3.this.f46325i.mo37030e3();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/SkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$i */
    /* loaded from: classes3.dex */
    public static final class C9932i extends Lambda implements Function1<Pair<? extends Unit, ? extends SkuOrder>, InterfaceC23447K<? extends List<? extends WireTransferOrderClosedIncompleteReason>>> {
        public C9932i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireTransferOrderClosedIncompleteReason>> invoke(Pair<Unit, SkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C37304Yi3.this.f46321e.mo80282t(pair.component2().getTransferOrderLineItem().getTransferOrder().getId());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reasons", "LtI4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LtI4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$j */
    /* loaded from: classes3.dex */
    public static final class C9933j extends Lambda implements Function1<List<? extends WireTransferOrderClosedIncompleteReason>, C49156tI4> {

        /* renamed from: g */
        public static final C9933j f46336g = new C9933j();

        public C9933j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C49156tI4 invoke(List<WireTransferOrderClosedIncompleteReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            return new C49156tI4(reasons);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$k */
    /* loaded from: classes3.dex */
    public static final class C9934k extends Lambda implements Function1<Throwable, Unit> {
        public C9934k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C48932sv1(th.getMessage()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9935l extends FunctionReferenceImpl implements Function1<AbstractC48340rv1, Unit> {
        public C9935l(Object obj) {
            super(1, obj, C37304Yi3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m74375a(AbstractC48340rv1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37304Yi3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC48340rv1 abstractC48340rv1) {
            m74375a(abstractC48340rv1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/SkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireTransferOrder;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$m */
    /* loaded from: classes3.dex */
    public static final class C9936m extends Lambda implements Function1<Pair<? extends String, ? extends SkuOrder>, InterfaceC23447K<? extends WireTransferOrder>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yi3$m$a */
        /* loaded from: classes3.dex */
        public static final class C9937a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37304Yi3 f46339g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9937a(C37304Yi3 c37304Yi3) {
                super(1);
                this.f46339g = c37304Yi3;
            }

            /* renamed from: a */
            public final void m74372a(InterfaceC23465c interfaceC23465c) {
                this.f46339g.m42280h(new C52470yt2(true));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m74372a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        public C9936m() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WireTransferOrder> invoke(Pair<String, SkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            AbstractC23442F<WireTransferOrder> mo80303b = C37304Yi3.this.f46321e.mo80303b(pair.component2().getTransferOrderLineItem().getTransferOrder().getId(), pair.component1());
            final C9937a c9937a = new C9937a(C37304Yi3.this);
            return mo80303b.m33102v(new InterfaceC23484g() { // from class: Zi3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37304Yi3.C9936m.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrder;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireTransferOrder;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$n */
    /* loaded from: classes3.dex */
    public static final class C9938n extends Lambda implements Function1<WireTransferOrder, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yi3$n$a */
        /* loaded from: classes3.dex */
        public static final class C9939a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37304Yi3 f46341g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9939a(C37304Yi3 c37304Yi3) {
                super(1);
                this.f46341g = c37304Yi3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f46341g.m42280h(new C52470yt2(false));
            }
        }

        public C9938n() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(WireTransferOrder it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo80289n = C37304Yi3.this.f46321e.mo80289n(C37304Yi3.this.f46323g);
            final C9939a c9939a = new C9939a(C37304Yi3.this);
            return mo80289n.m33083C(new InterfaceC23484g() { // from class: aj3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37304Yi3.C9938n.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$o */
    /* loaded from: classes3.dex */
    public static final class C9940o extends Lambda implements Function1<Throwable, Unit> {
        public C9940o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C48932sv1(th.getMessage()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$p */
    /* loaded from: classes3.dex */
    public static final class C9941p extends Lambda implements Function1<Throwable, Unit> {
        public C9941p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C48932sv1(th.getMessage()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/SkuOrder;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorAllocationDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1774#2,4:175\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationDetailsPresenter.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/OperatorAllocationDetailsPresenter$consume$2\n*L\n52#1:175,4\n*E\n"})
    /* renamed from: Yi3$q */
    /* loaded from: classes3.dex */
    public static final class C9942q extends Lambda implements Function1<Pair<? extends WireSkuScannedItems, ? extends SkuOrder>, Unit> {
        public C9942q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireSkuScannedItems, ? extends SkuOrder> pair) {
            invoke2((Pair<WireSkuScannedItems, SkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireSkuScannedItems, SkuOrder> pair) {
            int i;
            WireSkuScannedItems component1 = pair.component1();
            SkuOrder component2 = pair.component2();
            C37304Yi3.this.m74391n0(component2, component1.getSuccessfulScannedItems(), component1.getFailedScannedItems().size());
            C37304Yi3 c37304Yi3 = C37304Yi3.this;
            boolean z = SkuOrderKt.isInbound(component2) && (component1.getSuccessfulScannedItems().isEmpty() ^ true) && !component2.getStatus().isClosed();
            List<WireSuccessfulScannedItem> successfulScannedItems = component1.getSuccessfulScannedItems();
            if ((successfulScannedItems instanceof Collection) && successfulScannedItems.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (WireSuccessfulScannedItem wireSuccessfulScannedItem : successfulScannedItems) {
                    if (wireSuccessfulScannedItem.getReceived() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            c37304Yi3.m42280h(new C45992nx5(z, i < component2.getQuantity()));
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/SkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$r */
    /* loaded from: classes3.dex */
    public static final class C9943r extends Lambda implements Function1<Pair<? extends WireSkuScannedItems, ? extends SkuOrder>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C9943r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<WireSkuScannedItems, SkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return C37304Yi3.this.f46324h.m4811b(pair.component2(), pair.component1().getSuccessfulScannedItems());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "sections", "LRv5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)LRv5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$s */
    /* loaded from: classes3.dex */
    public static final class C9944s extends Lambda implements Function1<List<? extends C3023H6>, C35785Rv5> {

        /* renamed from: g */
        public static final C9944s f46346g = new C9944s();

        public C9944s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C35785Rv5 invoke(List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            return new C35785Rv5(sections);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$t */
    /* loaded from: classes3.dex */
    public static final class C9945t extends Lambda implements Function1<Throwable, Unit> {
        public C9945t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C37304Yi3.this.m42280h(new C48932sv1(th.getMessage()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$u */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9946u extends FunctionReferenceImpl implements Function1<AbstractC48340rv1, Unit> {
        public C9946u(Object obj) {
            super(1, obj, C37304Yi3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m74367a(AbstractC48340rv1 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37304Yi3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC48340rv1 abstractC48340rv1) {
            m74367a(abstractC48340rv1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9947v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C9947v f46348b = new C9947v();

        public C9947v() {
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$w */
    /* loaded from: classes3.dex */
    public static final class C9948w extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C9948w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37304Yi3.this.f46322f.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052F\u0010\u0004\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "LFQ3;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/SkuOrder;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$x */
    /* loaded from: classes3.dex */
    public static final class C9949x extends Lambda implements Function1<Pair<? extends FQ3, ? extends SkuOrder>, Unit> {
        public C9949x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FQ3, ? extends SkuOrder> pair) {
            invoke2((Pair<FQ3, SkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<FQ3, SkuOrder> pair) {
            SkuOrder skuOrder = pair.component2();
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            if (SkuOrderKt.isInbound(skuOrder)) {
                C37304Yi3.this.f46325i.mo37000j3(skuOrder.getId(), true, 10050);
            } else {
                C37304Yi3.this.f46325i.mo37056a1(skuOrder.getId(), true, 10051);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yi3$y */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9950y extends FunctionReferenceImpl implements Function1<WireSkuScannedItems, Unit> {
        public C9950y(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m74366a(WireSkuScannedItems p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m74366a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yi3$z */
    /* loaded from: classes3.dex */
    public static final class C9951z extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C9951z() {
            super(1);
        }

        /* renamed from: a */
        public final void m74365a(InterfaceC23465c interfaceC23465c) {
            C37304Yi3.this.m42280h(new C52470yt2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m74365a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37304Yi3(O86 transferOrderManager, DQ3 permissionManager, String skuOrderId, C51768xi3 converter, InterfaceC40099e13 navigator) {
        super(C38905c22.f59910a);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f46321e = transferOrderManager;
        this.f46322f = permissionManager;
        this.f46323g = skuOrderId;
        this.f46324h = converter;
        this.f46325i = navigator;
        C45168ma4<WireSkuScannedItems> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<WireSkuScannedItems>()");
        this.f46326j = m25409g;
    }

    /* renamed from: N */
    public static final void m74420N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m74419O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m74418P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m74417Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m74416R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m74415S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m74414T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final C49156tI4 m74413U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C49156tI4) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m74412V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m74411W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23447K m74410X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m74409Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23496h m74408Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m74407a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m74406b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final C35785Rv5 m74405c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35785Rv5) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m74404d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m74403e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m74402f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m74401g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final InterfaceC23447K m74400g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m74399h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final InterfaceC23447K m74398i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m74396k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m74395l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m74393m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: M */
    public void consume(InterfaceC38717bj3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C24523e c24523e = C24523e.f91168a;
        Observable combineLatest = Observable.combineLatest(this.f46326j, this.f46321e.mo80313D0(this.f46323g), new C9924a());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        final C9942q c9942q = new C9942q();
        Observable doOnNext = combineLatest.doOnNext(new InterfaceC23484g() { // from class: Ri3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74401g(Function1.this, obj);
            }
        });
        final C9943r c9943r = new C9943r();
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Di3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74410X;
                m74410X = C37304Yi3.m74410X(Function1.this, obj);
                return m74410X;
            }
        });
        final C9944s c9944s = C9944s.f46346g;
        Observable map = flatMapSingle.map(new InterfaceC23492o() { // from class: Hi3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C35785Rv5 m74405c0;
                m74405c0 = C37304Yi3.m74405c0(Function1.this, obj);
                return m74405c0;
            }
        });
        final C9945t c9945t = new C9945t();
        Observable doOnError = map.doOnError(new InterfaceC23484g() { // from class: Ii3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74404d0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as = doOnError.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9946u c9946u = new C9946u(this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Ki3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74403e0(Function1.this, obj);
            }
        };
        final C9947v c9947v = C9947v.f46348b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Li3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74402f0(Function1.this, obj);
            }
        });
        Observable<Unit> mo56514Y5 = renderer.mo56514Y5();
        final C9948w c9948w = new C9948w();
        Observable<R> flatMapSingle2 = mo56514Y5.flatMapSingle(new InterfaceC23492o() { // from class: Mi3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74400g0;
                m74400g0 = C37304Yi3.m74400g0(Function1.this, obj);
                return m74400g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as2 = C24527f.m31950a(flatMapSingle2, this.f46321e.mo80313D0(this.f46323g)).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9949x c9949x = new C9949x();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ni3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74399h0(Function1.this, obj);
            }
        });
        Observable<Boolean> mo56512l4 = renderer.mo56512l4();
        final C9925b c9925b = new C9925b();
        Observable<R> flatMapSingle3 = mo56512l4.flatMapSingle(new InterfaceC23492o() { // from class: Oi3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74398i0;
                m74398i0 = C37304Yi3.m74398i0(Function1.this, obj);
                return m74398i0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle3, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Observable m31950a = C24527f.m31950a(flatMapSingle3, this.f46321e.mo80313D0(this.f46323g));
        final C9926c c9926c = new C9926c();
        Observable doOnNext2 = m31950a.doOnNext(new InterfaceC23484g() { // from class: Pi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74420N(Function1.this, obj);
            }
        });
        final C9927d c9927d = new C9927d();
        Observable doOnError2 = doOnNext2.doOnError(new InterfaceC23484g() { // from class: Si3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74419O(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnError2, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as3 = doOnError2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9928e c9928e = C9928e.f46331g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Ti3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74418P(Function1.this, obj);
            }
        };
        final C9929f c9929f = C9929f.f46332b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: Ui3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74417Q(Function1.this, obj);
            }
        });
        Observable<Unit> mo56513g7 = renderer.mo56513g7();
        final C9930g c9930g = new C9930g();
        Observable<Unit> delay = mo56513g7.doOnNext(new InterfaceC23484g() { // from class: Vi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74416R(Function1.this, obj);
            }
        }).delay(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(delay, "override fun consume(ren…e)\n      .subscribe()\n  }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as4 = delay.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9931h c9931h = new C9931h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Wi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74415S(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(renderer.mo56522A7(), this.f46321e.mo80313D0(this.f46323g));
        final C9932i c9932i = new C9932i();
        Observable flatMapSingle4 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: Xi3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74414T;
                m74414T = C37304Yi3.m74414T(Function1.this, obj);
                return m74414T;
            }
        });
        final C9933j c9933j = C9933j.f46336g;
        Observable map2 = flatMapSingle4.map(new InterfaceC23492o() { // from class: zi3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C49156tI4 m74413U;
                m74413U = C37304Yi3.m74413U(Function1.this, obj);
                return m74413U;
            }
        });
        final C9934k c9934k = new C9934k();
        Observable retry = map2.doOnError(new InterfaceC23484g() { // from class: Ai3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74412V(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33094as5 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9935l c9935l = new C9935l(this);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Bi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74411W(Function1.this, obj);
            }
        });
        Observable m31950a3 = C24527f.m31950a(renderer.mo56519Q5(), this.f46321e.mo80313D0(this.f46323g));
        final C9936m c9936m = new C9936m();
        Observable flatMapSingle5 = m31950a3.flatMapSingle(new InterfaceC23492o() { // from class: Ci3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74409Y;
                m74409Y = C37304Yi3.m74409Y(Function1.this, obj);
                return m74409Y;
            }
        });
        final C9938n c9938n = new C9938n();
        AbstractC23461c flatMapCompletable = flatMapSingle5.flatMapCompletable(new InterfaceC23492o() { // from class: Ei3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m74408Z;
                m74408Z = C37304Yi3.m74408Z(Function1.this, obj);
                return m74408Z;
            }
        });
        final C9940o c9940o = new C9940o();
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: Fi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74407a0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        AbstractC23461c m74397j0 = m74397j0();
        final C9941p c9941p = new C9941p();
        AbstractC23461c m33065U = m74397j0.m33084B(new InterfaceC23484g() { // from class: Gi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74406b0(Function1.this, obj);
            }
        }).m33065U(3L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n2 = m33065U.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
    }

    /* renamed from: j0 */
    public final AbstractC23461c m74397j0() {
        List listOf;
        AbstractC23442F<WireSkuScannedItems> mo80279w = this.f46321e.mo80279w(this.f46323g);
        final C9950y c9950y = new C9950y(this.f46326j);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f46321e.mo80289n(this.f46323g), mo80279w.m33101w(new InterfaceC23484g() { // from class: yi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74396k0(Function1.this, obj);
            }
        }).m33159G()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        final C9951z c9951z = new C9951z();
        AbstractC23461c m33081E = m33037r.m33081E(new InterfaceC23484g() { // from class: Ji3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74395l0(Function1.this, obj);
            }
        });
        final C9923A c9923a = new C9923A();
        AbstractC23461c m33083C = m33081E.m33083C(new InterfaceC23484g() { // from class: Qi3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37304Yi3.m74393m0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33083C, "private fun refresh(): C…mit(Loading(false)) }\n  }");
        return m33083C;
    }

    /* renamed from: n0 */
    public final void m74391n0(SkuOrder skuOrder, List<WireSuccessfulScannedItem> list, int i) {
        boolean z;
        boolean z2;
        if (skuOrder.getStatus().isClosed()) {
            m42280h(KM1.f19481a);
            return;
        }
        if (SkuOrderKt.isInbound(skuOrder) && list.size() >= skuOrder.getQuantity()) {
            List<WireSuccessfulScannedItem> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (WireSuccessfulScannedItem wireSuccessfulScannedItem : list2) {
                    if (!wireSuccessfulScannedItem.getReceived()) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                m42280h(KM1.f19481a);
                return;
            }
        }
        if (SkuOrderKt.isInbound(skuOrder)) {
            List<WireSuccessfulScannedItem> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (WireSuccessfulScannedItem wireSuccessfulScannedItem2 : list3) {
                    if (wireSuccessfulScannedItem2.getReceived()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                m42280h(new C39599dA5(true));
                return;
            }
        }
        if (SkuOrderKt.isInbound(skuOrder)) {
            m42280h(new C37225Xz5(true));
        } else if (!SkuOrderKt.isInbound(skuOrder) && skuOrder.getStatus().isClosed()) {
            m42280h(KM1.f19481a);
        } else if (!SkuOrderKt.isInbound(skuOrder) && ((!list.isEmpty()) || i > 0)) {
            m42280h(new C39599dA5(false));
        } else if (!SkuOrderKt.isInbound(skuOrder)) {
            m42280h(new C37225Xz5(false));
        }
    }
}
