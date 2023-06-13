package p000;

import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.constant.TransferOrderReason;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScanItemKt;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.api.response.BulkScanItemResponse;
import co.bird.api.response.TransferOrderVehicleViewResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.observables.AbstractC24495a;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C37709a12;
import p000.InterfaceC40099e13;
import p000.O86;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001;B!\b\u0007\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016JX\u0010\u0014\u001a\u00020\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00072\u0006\u0010\f\u001a\u00020\u000b20\u0010\u0012\u001a,\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\rH\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002J:\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R.\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 1*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00107\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u00110\u0011048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, m28432d2 = {"La12;", "LhE;", "Lf12;", "Lg12;", "renderer", "", "Q", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "force", "Lkotlin/Function5;", "", "", "LPC5;", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "onErrorCode", "Lio/reactivex/disposables/c;", "q0", "m0", "itemId", "Ljl5;", "scanState", "scanIdentifier", "x0", "scannedItems", "skuOrder", "o0", "T", "Lio/reactivex/F;", AbstractC26684u0.f100690q, "", "e", "p0", "LO86;", "f", "LO86;", "transferOrderManager", "Le13;", "g", "Le13;", "navigator", "LTq4;", "h", "LTq4;", "reactiveConfig", "Lma4;", "kotlin.jvm.PlatformType", "i", "Lma4;", "LAG;", "j", "LAG;", "vehicleAcceptanceOptionRelay", "<init>", "(LO86;Le13;LTq4;)V", "k", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Observables.kt\nco/bird/android/library/rx/ObservablesKt\n+ 5 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,396:1\n52#2,2:397\n52#2,2:400\n180#3:399\n180#3:402\n180#3:403\n180#3:405\n180#3:406\n180#3:407\n180#3:409\n128#4:404\n252#5:408\n288#6,2:410\n1726#6,3:414\n37#7,2:412\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter\n*L\n56#1:397,2\n80#1:400,2\n60#1:399\n84#1:402\n191#1:403\n241#1:405\n254#1:406\n265#1:407\n291#1:409\n206#1:404\n275#1:408\n351#1:410,2\n374#1:414,3\n361#1:412,2\n*E\n"})
/* renamed from: a12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37709a12 extends C22600hE<InterfaceC40691f12, C41284g12> {

    /* renamed from: k */
    public static final C10520a f49682k = new C10520a(null);

    /* renamed from: l */
    public static final Set<TransferOrderDemandSource> f49683l;

    /* renamed from: m */
    public static final Set<TransferOrderDemandSource> f49684m;

    /* renamed from: f */
    public final O86 f49685f;

    /* renamed from: g */
    public final InterfaceC40099e13 f49686g;

    /* renamed from: h */
    public final C36207Tq4 f49687h;

    /* renamed from: i */
    public final C45168ma4<List<PC5>> f49688i;

    /* renamed from: j */
    public final C0058AG<TransferOrderVehicleViewResponse> f49689j;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "", "LPC5;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,396:1\n2624#2,3:397\n37#3,2:400\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$9\n*L\n169#1:397,3\n173#1:400,2\n*E\n"})
    /* renamed from: a12$A */
    /* loaded from: classes3.dex */
    public static final class C10507A extends Lambda implements Function1<Pair<? extends WireSkuScanItem, ? extends List<? extends PC5>>, List<? extends PC5>> {
        public C10507A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends PC5> invoke(Pair<? extends WireSkuScanItem, ? extends List<? extends PC5>> pair) {
            return invoke2((Pair<WireSkuScanItem, ? extends List<PC5>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<PC5> invoke2(Pair<WireSkuScanItem, ? extends List<PC5>> pair) {
            List<PC5> listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScanItem scannedItem = pair.component1();
            List<PC5> scannedItems = pair.component2();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            List<PC5> list = scannedItems;
            boolean z = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((PC5) it.next()).m90585e(), scannedItem.getItemId())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                Intrinsics.checkNotNullExpressionValue(scannedItem, "scannedItem");
                spreadBuilder.add(QC5.m88752a(scannedItem, EnumC43500jl5.RECEIVED));
                spreadBuilder.addSpread(scannedItems.toArray(new PC5[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new PC5[spreadBuilder.size()]));
                return listOf;
            }
            return C37709a12.this.m72009x0(scannedItems, scannedItem.getItemId(), EnumC43500jl5.RECEIVED, scannedItem.getScanIdentifier());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "skuOrderId", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$B */
    /* loaded from: classes3.dex */
    public static final class C10508B extends Lambda implements Function1<String, InterfaceC23447K<? extends WireSkuOrder>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: a12$B$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10509a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C10509a(Object obj) {
                super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C37709a12) this.receiver).m72025p0(p0);
            }
        }

        public C10508B() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireSkuOrder> invoke(String skuOrderId) {
            Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
            C37709a12 c37709a12 = C37709a12.this;
            AbstractC23442F m33146T = c37709a12.m72015u0(c37709a12.f49685f.mo80296h(skuOrderId)).m33146T(3L);
            final C10509a c10509a = new C10509a(C37709a12.this);
            return m33146T.m33106t(new InterfaceC23484g() { // from class: e12
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37709a12.C10508B.invoke$lambda$0(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lg12;", "", "LPC5;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$maybeBypassVehicleAcceptance$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,396:1\n1747#2,3:397\n37#3,2:400\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$maybeBypassVehicleAcceptance$1\n*L\n306#1:397,3\n322#1:400,2\n*E\n"})
    /* renamed from: a12$C */
    /* loaded from: classes3.dex */
    public static final class C10510C extends Lambda implements Function1<Pair<? extends C41284g12, ? extends List<? extends PC5>>, InterfaceC24574u<? extends C41284g12>> {
        public C10510C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C41284g12> invoke(Pair<C41284g12, ? extends List<PC5>> pair) {
            TransferOrderDemandSource transferOrderDemandSource;
            boolean contains;
            AbstractC24507p m32068G;
            boolean z;
            List listOf;
            WireTransferOrderLineItem transferOrderLineItem;
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C41284g12 component1 = pair.component1();
            List<PC5> scannedItems = pair.component2();
            C38156am5 m40306t = component1.m40306t();
            if (m40306t != null) {
                C37709a12 c37709a12 = C37709a12.this;
                Set set = C37709a12.f49684m;
                WireSkuOrder m40304v = component1.m40304v();
                if (m40304v != null && (transferOrderLineItem = m40304v.getTransferOrderLineItem()) != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                    transferOrderDemandSource = transferOrder.getDemandSource();
                } else {
                    transferOrderDemandSource = null;
                }
                contains = CollectionsKt___CollectionsKt.contains(set, transferOrderDemandSource);
                if (contains) {
                    Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
                    List<PC5> list = scannedItems;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (PC5 pc5 : list) {
                            if (Intrinsics.areEqual(pc5.m90585e(), m40306t.m70764c().getItemId())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        c37709a12.f49688i.accept(c37709a12.m72009x0(scannedItems, m40306t.m70764c().getItemId(), EnumC43500jl5.PENDING_CONFIRMATION, m40306t.m70764c().getScanIdentifier()));
                    } else {
                        C45168ma4 c45168ma4 = c37709a12.f49688i;
                        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                        spreadBuilder.add(QC5.m88752a(m40306t.m70764c(), EnumC43500jl5.PENDING_CONFIRMATION));
                        spreadBuilder.addSpread(scannedItems.toArray(new PC5[0]));
                        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new PC5[spreadBuilder.size()]));
                        c45168ma4.accept(listOf);
                    }
                    m32068G = AbstractC24507p.m32024u();
                } else {
                    m32068G = AbstractC24507p.m32068G(component1);
                }
                if (m32068G != null) {
                    return m32068G;
                }
            }
            return AbstractC24507p.m32068G(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
    /* renamed from: a12$D */
    /* loaded from: classes3.dex */
    public static final class C10511D extends Lambda implements Function1<C41284g12, C41284g12> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f49693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10511D(Throwable th) {
            super(1);
            this.f49693g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C41284g12 invoke(C41284g12 state) {
            C41284g12 m40312n;
            Intrinsics.checkNotNullParameter(state, "state");
            m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : null, (r24 & 2) != 0 ? state.f81330b : null, (r24 & 4) != 0 ? state.f81331c : 0, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : null, (r24 & 32) != 0 ? state.f81334f : null, (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
            m40312n.m40302x(this.f49693g);
            return m40312n;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter\n*L\n1#1,304:1\n278#2:305\n*E\n"})
    /* renamed from: a12$E */
    /* loaded from: classes3.dex */
    public static final class C10512E<T1, T2, T3, R> implements InterfaceC23485h<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Pair<? extends WireSkuScanItem, ? extends WireSkuOrder> pair, T1 t1, T2 t2) {
            return (R) new Triple(pair, (List) t1, (TransferOrderVehicleViewResponse) t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\t0\t2@\u0010\b\u001a<\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "<name for destructuring parameter 0>", "Lg12;", C17296a.f69688o, "(Lkotlin/Triple;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$processScanItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
    /* renamed from: a12$F */
    /* loaded from: classes3.dex */
    public static final class C10513F extends Lambda implements Function1<Triple<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends PC5>, ? extends TransferOrderVehicleViewResponse>, C41284g12> {

        /* renamed from: g */
        public final /* synthetic */ Function5<WireSkuScanItem, WireSkuOrder, String, List<PC5>, TransferOrderVehicleViewResponse, C41284g12> f49694g;

        /* renamed from: h */
        public final /* synthetic */ C37709a12 f49695h;

        /* renamed from: i */
        public final /* synthetic */ boolean f49696i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10513F(Function5<? super WireSkuScanItem, ? super WireSkuOrder, ? super String, ? super List<PC5>, ? super TransferOrderVehicleViewResponse, C41284g12> function5, C37709a12 c37709a12, boolean z) {
            super(1);
            this.f49694g = function5;
            this.f49695h = c37709a12;
            this.f49696i = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C41284g12 invoke(Triple<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<PC5>, TransferOrderVehicleViewResponse> triple) {
            C41284g12 m40312n;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Pair<WireSkuScanItem, WireSkuOrder> component1 = triple.component1();
            List<PC5> scannedItems = triple.component2();
            TransferOrderVehicleViewResponse acceptanceOptions = triple.component3();
            WireSkuScanItem component12 = component1.component1();
            WireSkuOrder component2 = component1.component2();
            String errorCode = component12.getErrorCode();
            if (errorCode != null) {
                Function5<WireSkuScanItem, WireSkuOrder, String, List<PC5>, TransferOrderVehicleViewResponse, C41284g12> function5 = this.f49694g;
                Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
                Intrinsics.checkNotNullExpressionValue(acceptanceOptions, "acceptanceOptions");
                return function5.invoke(component12, component2, errorCode, scannedItems, acceptanceOptions);
            }
            m40312n = r10.m40312n((r24 & 1) != 0 ? r10.f81329a : null, (r24 & 2) != 0 ? r10.f81330b : null, (r24 & 4) != 0 ? r10.f81331c : 0, (r24 & 8) != 0 ? r10.f81332d : null, (r24 & 16) != 0 ? r10.f81333e : null, (r24 & 32) != 0 ? r10.f81334f : null, (r24 & 64) != 0 ? r10.f81335g : null, (r24 & 128) != 0 ? r10.f81336h : null, (r24 & 256) != 0 ? r10.f81337i : null, (r24 & 512) != 0 ? r10.f81338j : null, (r24 & 1024) != 0 ? this.f49695h.m42277k().f81339k : null);
            boolean z = this.f49696i;
            Intrinsics.checkNotNullExpressionValue(acceptanceOptions, "acceptanceOptions");
            m40312n.m40321B(new C38156am5(component12, z, acceptanceOptions));
            return m40312n;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$G */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10514G extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10514G(Object obj) {
            super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m72025p0(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$H */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10515H extends FunctionReferenceImpl implements Function1<C41284g12, Unit> {
        public C10515H(Object obj) {
            super(1, obj, C37709a12.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m72002a(C41284g12 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C41284g12 c41284g12) {
            m72002a(c41284g12);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$I */
    /* loaded from: classes3.dex */
    public static final class C10516I extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: a12$I$a */
        /* loaded from: classes3.dex */
        public static final class C10517a extends Lambda implements Function1<C41284g12, C41284g12> {

            /* renamed from: g */
            public static final C10517a f49698g = new C10517a();

            public C10517a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C41284g12 invoke(C41284g12 state) {
                C41284g12 m40312n;
                Intrinsics.checkNotNullParameter(state, "state");
                m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : null, (r24 & 2) != 0 ? state.f81330b : null, (r24 & 4) != 0 ? state.f81331c : state.m40309q() + 1, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : null, (r24 & 32) != 0 ? state.f81334f : null, (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
                return m40312n;
            }
        }

        public C10516I() {
            super(1);
        }

        /* renamed from: a */
        public final void m72001a(InterfaceC23465c interfaceC23465c) {
            C37709a12.this.m42279i(C10517a.f49698g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m72001a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$J */
    /* loaded from: classes3.dex */
    public static final class C10518J extends Lambda implements Function2<T, Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: a12$J$a */
        /* loaded from: classes3.dex */
        public static final class C10519a extends Lambda implements Function1<C41284g12, C41284g12> {

            /* renamed from: g */
            public static final C10519a f49700g = new C10519a();

            public C10519a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C41284g12 invoke(C41284g12 state) {
                C41284g12 m40312n;
                Intrinsics.checkNotNullParameter(state, "state");
                m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : null, (r24 & 2) != 0 ? state.f81330b : null, (r24 & 4) != 0 ? state.f81331c : state.m40309q() - 1, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : null, (r24 & 32) != 0 ? state.f81334f : null, (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
                return m40312n;
            }
        }

        public C10518J() {
            super(2);
        }

        /* renamed from: a */
        public final void m71999a(T t, Throwable th) {
            C37709a12.this.m42279i(C10519a.f49700g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            m71999a(obj, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"La12$a;", "", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "BYPASS_VEHICLE_ACCEPTANCE_SOURCES", "Ljava/util/Set;", "FORCE_SCAN_DEMAND_SOURCES", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a12$a */
    /* loaded from: classes3.dex */
    public static final class C10520a {
        public /* synthetic */ C10520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10520a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: a12$b */
    /* loaded from: classes3.dex */
    public static final class C10521b<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C10521b<T1, T2, R> f49701a = new C10521b<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: a12$c */
    /* loaded from: classes3.dex */
    public static final class C10522c<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C10522c<T1, T2, R> f49702a = new C10522c<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T", "T1", "T2", "T3", "t", "t1", "t2", "t3", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: a12$d */
    /* loaded from: classes3.dex */
    public static final class C10523d<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C10523d<T1, T2, T3, T4, R> f49703a = new C10523d<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<Unit, T1, T2, T3> apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return new C51106wb4<>(unit, t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$e */
    /* loaded from: classes3.dex */
    public static final class C10524e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: a12$e$a */
        /* loaded from: classes3.dex */
        public static final class C10525a extends Lambda implements Function1<C41284g12, C41284g12> {

            /* renamed from: g */
            public final /* synthetic */ boolean f49705g;

            /* renamed from: h */
            public final /* synthetic */ boolean f49706h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10525a(boolean z, boolean z2) {
                super(1);
                this.f49705g = z;
                this.f49706h = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C41284g12 invoke(C41284g12 state) {
                C41284g12 m40312n;
                Intrinsics.checkNotNullParameter(state, "state");
                m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : null, (r24 & 2) != 0 ? state.f81330b : null, (r24 & 4) != 0 ? state.f81331c : 0, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : Boolean.valueOf(this.f49705g), (r24 & 32) != 0 ? state.f81334f : Boolean.valueOf(this.f49706h), (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
                return m40312n;
            }
        }

        public C10524e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            C37709a12.this.m42279i(new C10525a(pair.component1().booleanValue(), pair.component2().booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$f */
    /* loaded from: classes3.dex */
    public static final class C10526f extends Lambda implements Function1<Pair<? extends List<? extends PC5>, ? extends WireSkuOrder>, Unit> {
        public C10526f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends PC5>, ? extends WireSkuOrder> pair) {
            invoke2((Pair<? extends List<PC5>, WireSkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<PC5>, WireSkuOrder> pair) {
            List<PC5> scannedItems = pair.component1();
            WireSkuOrder skuOrder = pair.component2();
            C37709a12 c37709a12 = C37709a12.this;
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            c37709a12.m72027o0(scannedItems, skuOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0005\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$g */
    /* loaded from: classes3.dex */
    public static final class C10527g extends Lambda implements Function1<Pair<? extends List<? extends PC5>, ? extends WireSkuOrder>, List<? extends PC5>> {

        /* renamed from: g */
        public static final C10527g f49708g = new C10527g();

        public C10527g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends PC5> invoke(Pair<? extends List<? extends PC5>, ? extends WireSkuOrder> pair) {
            return invoke2((Pair<? extends List<PC5>, WireSkuOrder>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<PC5> invoke2(Pair<? extends List<PC5>, WireSkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10528h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10528h(Object obj) {
            super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m72025p0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "errorCode", "", "LPC5;", "<anonymous parameter 3>", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "acceptanceOptions", "Lg12;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$13\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
    /* renamed from: a12$i */
    /* loaded from: classes3.dex */
    public static final class C10529i extends Lambda implements Function5<WireSkuScanItem, WireSkuOrder, String, List<? extends PC5>, TransferOrderVehicleViewResponse, C41284g12> {
        public C10529i() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a */
        public final C41284g12 invoke(WireSkuScanItem scanItem, WireSkuOrder skuOrder, String errorCode, List<PC5> list, TransferOrderVehicleViewResponse acceptanceOptions) {
            C41284g12 m40312n;
            C41284g12 m40312n2;
            TransferOrderDemandSource transferOrderDemandSource;
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(scanItem, "scanItem");
            Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 3>");
            Intrinsics.checkNotNullParameter(acceptanceOptions, "acceptanceOptions");
            if (WireSkuScanItemKt.toInventoryScanningError(errorCode) != InventoryScanningError.ITEM_NOT_IN_SKU_ORDER) {
                m40312n2 = r6.m40312n((r24 & 1) != 0 ? r6.f81329a : null, (r24 & 2) != 0 ? r6.f81330b : null, (r24 & 4) != 0 ? r6.f81331c : 0, (r24 & 8) != 0 ? r6.f81332d : null, (r24 & 16) != 0 ? r6.f81333e : null, (r24 & 32) != 0 ? r6.f81334f : null, (r24 & 64) != 0 ? r6.f81335g : null, (r24 & 128) != 0 ? r6.f81336h : null, (r24 & 256) != 0 ? r6.f81337i : null, (r24 & 512) != 0 ? r6.f81338j : null, (r24 & 1024) != 0 ? C37709a12.this.m42277k().f81339k : null);
                WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
                if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                    transferOrderDemandSource = transferOrder.getDemandSource();
                } else {
                    transferOrderDemandSource = null;
                }
                m40312n2.m40322A(new C39322ck5(transferOrderDemandSource, errorCode));
                return m40312n2;
            }
            m40312n = r4.m40312n((r24 & 1) != 0 ? r4.f81329a : null, (r24 & 2) != 0 ? r4.f81330b : null, (r24 & 4) != 0 ? r4.f81331c : 0, (r24 & 8) != 0 ? r4.f81332d : null, (r24 & 16) != 0 ? r4.f81333e : null, (r24 & 32) != 0 ? r4.f81334f : null, (r24 & 64) != 0 ? r4.f81335g : null, (r24 & 128) != 0 ? r4.f81336h : null, (r24 & 256) != 0 ? r4.f81337i : null, (r24 & 512) != 0 ? r4.f81338j : null, (r24 & 1024) != 0 ? C37709a12.this.m42277k().f81339k : null);
            m40312n.m40321B(new C38156am5(scanItem, true, acceptanceOptions));
            return m40312n;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\t0\t \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\b2B\u0010\u0007\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0003*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "", "", "kotlin.jvm.PlatformType", "", "", "LPC5;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/BulkScanItemResponse;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n766#2:397\n857#2,2:398\n1603#2,9:400\n1855#2:409\n1856#2:411\n1612#2:412\n1#3:410\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$14\n*L\n212#1:397\n212#1:398,2\n215#1:400,9\n215#1:409\n215#1:411\n215#1:412\n215#1:410\n*E\n"})
    /* renamed from: a12$j */
    /* loaded from: classes3.dex */
    public static final class C10530j extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends String, ? extends Boolean, ? extends List<? extends PC5>>, InterfaceC23447K<? extends BulkScanItemResponse>> {
        public C10530j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends BulkScanItemResponse> invoke(C51106wb4<Unit, String, Boolean, ? extends List<PC5>> c51106wb4) {
            boolean z;
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            String skuOrderId = c51106wb4.m6613b();
            Boolean serviceCenterScan = c51106wb4.m6612c();
            List<PC5> scannedItems = c51106wb4.m6611d();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            ArrayList<PC5> arrayList = new ArrayList();
            for (Object obj : scannedItems) {
                if (((PC5) obj).m90583g() == EnumC43500jl5.PENDING_CONFIRMATION) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            C37709a12 c37709a12 = C37709a12.this;
            O86 o86 = c37709a12.f49685f;
            ArrayList arrayList2 = new ArrayList();
            for (PC5 pc5 : arrayList) {
                String m90584f = pc5.m90584f();
                if (m90584f != null) {
                    arrayList2.add(m90584f);
                }
            }
            Intrinsics.checkNotNullExpressionValue(skuOrderId, "skuOrderId");
            Intrinsics.checkNotNullExpressionValue(serviceCenterScan, "serviceCenterScan");
            return c37709a12.m72015u0(O86.C5908a.bulkScanSkusForSkuOrder$default(o86, false, skuOrderId, arrayList2, serviceCenterScan.booleanValue(), false, 16, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/api/response/BulkScanItemResponse;", "kotlin.jvm.PlatformType", "", "LPC5;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$15\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,396:1\n766#2:397\n857#2,2:398\n1549#2:400\n1620#2,3:401\n766#2:404\n857#2,2:405\n1549#2:407\n1620#2,3:408\n37#3,2:411\n37#3,2:413\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$15\n*L\n225#1:397\n225#1:398,2\n226#1:400\n226#1:401,3\n228#1:404\n228#1:405,2\n232#1:407\n232#1:408,3\n232#1:411,2\n233#1:413,2\n*E\n"})
    /* renamed from: a12$k */
    /* loaded from: classes3.dex */
    public static final class C10531k extends Lambda implements Function1<Pair<? extends BulkScanItemResponse, ? extends List<? extends PC5>>, List<? extends PC5>> {

        /* renamed from: g */
        public static final C10531k f49711g = new C10531k();

        public C10531k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends PC5> invoke(Pair<? extends BulkScanItemResponse, ? extends List<? extends PC5>> pair) {
            return invoke2((Pair<BulkScanItemResponse, ? extends List<PC5>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<PC5> invoke2(Pair<BulkScanItemResponse, ? extends List<PC5>> pair) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List minus;
            List<PC5> listOf;
            PC5 m90589a;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<PC5> scannedItems = pair.component2();
            ArrayList<WireSkuScanItem> arrayList = new ArrayList();
            Iterator<T> it = pair.component1().getScanResults().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WireSkuScanItem) next).getErrorCode() == null) {
                    arrayList.add(next);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (WireSkuScanItem wireSkuScanItem : arrayList) {
                arrayList2.add(wireSkuScanItem.getItemId());
            }
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            List<PC5> list = scannedItems;
            ArrayList<PC5> arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (arrayList2.contains(((PC5) obj).m90585e())) {
                    arrayList3.add(obj);
                }
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (PC5 pc5 : arrayList3) {
                m90589a = pc5.m90589a((r18 & 1) != 0 ? pc5.f28106a : null, (r18 & 2) != 0 ? pc5.f28107b : null, (r18 & 4) != 0 ? pc5.f28108c : null, (r18 & 8) != 0 ? pc5.f28109d : null, (r18 & 16) != 0 ? pc5.f28110e : null, (r18 & 32) != 0 ? pc5.f28111f : null, (r18 & 64) != 0 ? pc5.f28112g : null, (r18 & 128) != 0 ? pc5.f28113h : EnumC43500jl5.RECEIVED);
                arrayList4.add(m90589a);
            }
            spreadBuilder.addSpread(arrayList4.toArray(new PC5[0]));
            minus = CollectionsKt___CollectionsKt.minus((Iterable) list, (Iterable) arrayList3);
            spreadBuilder.addSpread(minus.toArray(new PC5[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new PC5[spreadBuilder.size()]));
            return listOf;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10532l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10532l(Object obj) {
            super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m72025p0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*,\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$m */
    /* loaded from: classes3.dex */
    public static final class C10533m extends Lambda implements Function1<Pair<? extends List<? extends PC5>, ? extends WireSkuOrder>, Unit> {
        public C10533m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends PC5>, ? extends WireSkuOrder> pair) {
            invoke2((Pair<? extends List<PC5>, WireSkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<PC5>, WireSkuOrder> pair) {
            List<PC5> scannedItems = pair.component1();
            WireSkuOrder skuOrder = pair.component2();
            C37709a12 c37709a12 = C37709a12.this;
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            c37709a12.m72027o0(scannedItems, skuOrder);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012.\u0010\u0005\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$n */
    /* loaded from: classes3.dex */
    public static final class C10534n extends Lambda implements Function1<Pair<? extends List<? extends PC5>, ? extends WireSkuOrder>, List<? extends PC5>> {

        /* renamed from: g */
        public static final C10534n f49713g = new C10534n();

        public C10534n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends PC5> invoke(Pair<? extends List<? extends PC5>, ? extends WireSkuOrder> pair) {
            return invoke2((Pair<? extends List<PC5>, WireSkuOrder>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<PC5> invoke2(Pair<? extends List<PC5>, WireSkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component1();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10535o extends FunctionReferenceImpl implements Function1<String, AbstractC23442F<WireSkuScannedItems>> {
        public C10535o(Object obj) {
            super(1, obj, O86.class, "getSkuOrderScannedItems", "getSkuOrderScannedItems(Ljava/lang/String;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<WireSkuScannedItems> invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((O86) this.receiver).mo80279w(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "LPC5;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$p */
    /* loaded from: classes3.dex */
    public static final class C10536p extends Lambda implements Function1<Pair<? extends WireSkuOrder, ? extends List<? extends PC5>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: a12$p$a */
        /* loaded from: classes3.dex */
        public static final class C10537a extends Lambda implements Function1<C41284g12, C41284g12> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f49715g;

            /* renamed from: h */
            public final /* synthetic */ List<PC5> f49716h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10537a(WireSkuOrder wireSkuOrder, List<PC5> list) {
                super(1);
                this.f49715g = wireSkuOrder;
                this.f49716h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C41284g12 invoke(C41284g12 state) {
                C41284g12 m40312n;
                Intrinsics.checkNotNullParameter(state, "state");
                WireSkuOrder wireSkuOrder = this.f49715g;
                List<PC5> scannedItems = this.f49716h;
                Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
                m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : wireSkuOrder, (r24 & 2) != 0 ? state.f81330b : scannedItems, (r24 & 4) != 0 ? state.f81331c : 0, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : null, (r24 & 32) != 0 ? state.f81334f : null, (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
                return m40312n;
            }
        }

        public C10536p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireSkuOrder, ? extends List<? extends PC5>> pair) {
            invoke2((Pair<WireSkuOrder, ? extends List<PC5>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireSkuOrder, ? extends List<PC5>> pair) {
            C37709a12.this.m42279i(new C10537a(pair.component1(), pair.component2()));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$q */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10538q extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10538q(Object obj) {
            super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m72025p0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "wireSkuScannedItems", "", "LPC5;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1549#2:397\n1620#2,3:398\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$21\n*L\n250#1:397\n250#1:398,3\n*E\n"})
    /* renamed from: a12$r */
    /* loaded from: classes3.dex */
    public static final class C10539r extends Lambda implements Function1<WireSkuScannedItems, List<? extends PC5>> {

        /* renamed from: g */
        public static final C10539r f49717g = new C10539r();

        public C10539r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PC5> invoke(WireSkuScannedItems wireSkuScannedItems) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(wireSkuScannedItems, "wireSkuScannedItems");
            List<WireSuccessfulScannedItem> successfulScannedItems = wireSkuScannedItems.getSuccessfulScannedItems();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(successfulScannedItems, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireSuccessfulScannedItem wireSuccessfulScannedItem : successfulScannedItems) {
                arrayList.add(QC5.toSkuScanItem$default(wireSuccessfulScannedItem, (EnumC43500jl5) null, 1, (Object) null));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "Lio/reactivex/K;", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/wire/WireSkuOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$22\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
    /* renamed from: a12$s */
    /* loaded from: classes3.dex */
    public static final class C10540s extends Lambda implements Function1<WireSkuOrder, InterfaceC23447K<? extends TransferOrderVehicleViewResponse>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: a12$s$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10541a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C10541a(Object obj) {
                super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C37709a12) this.receiver).m72025p0(p0);
            }
        }

        public C10540s() {
            super(1);
        }

        /* renamed from: d */
        public static final TransferOrderVehicleViewResponse m71985d(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TransferOrderVehicleViewResponse(null, null, null, 7, null);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends TransferOrderVehicleViewResponse> invoke(WireSkuOrder skuOrder) {
            WireTransferOrder transferOrder;
            String id;
            AbstractC23442F<TransferOrderVehicleViewResponse> mo80304a;
            AbstractC23442F<TransferOrderVehicleViewResponse> m33149Q;
            Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
            WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
            if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null && (id = transferOrder.getId()) != null && (mo80304a = C37709a12.this.f49685f.mo80304a(id)) != null) {
                final C10541a c10541a = new C10541a(C37709a12.this);
                AbstractC23442F<TransferOrderVehicleViewResponse> m33106t = mo80304a.m33106t(new InterfaceC23484g() { // from class: b12
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C37709a12.C10540s.invoke$lambda$0(Function1.this, obj);
                    }
                });
                if (m33106t != null && (m33149Q = m33106t.m33149Q(new InterfaceC23492o() { // from class: c12
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        TransferOrderVehicleViewResponse m71985d;
                        m71985d = C37709a12.C10540s.m71985d((Throwable) obj);
                        return m71985d;
                    }
                })) != null) {
                    return m33149Q;
                }
            }
            return AbstractC23442F.m33158H(new TransferOrderVehicleViewResponse(null, null, null, 7, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$t */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10542t extends FunctionReferenceImpl implements Function1<TransferOrderVehicleViewResponse, Unit> {
        public C10542t(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m71984a(TransferOrderVehicleViewResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TransferOrderVehicleViewResponse transferOrderVehicleViewResponse) {
            m71984a(transferOrderVehicleViewResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\b0\b \u0004*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\b0\b\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "", "LPC5;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1774#2,4:397\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$3\n*L\n101#1:397,4\n*E\n"})
    /* renamed from: a12$u */
    /* loaded from: classes3.dex */
    public static final class C10543u extends Lambda implements Function1<Triple<? extends String, ? extends List<? extends PC5>, ? extends WireSkuOrder>, InterfaceC24574u<? extends Pair<? extends String, ? extends WireSkuOrder>>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lg12;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lg12;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$3$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
        /* renamed from: a12$u$a */
        /* loaded from: classes3.dex */
        public static final class C10544a extends Lambda implements Function1<C41284g12, C41284g12> {

            /* renamed from: g */
            public static final C10544a f49720g = new C10544a();

            public C10544a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C41284g12 invoke(C41284g12 state) {
                C41284g12 m40312n;
                Intrinsics.checkNotNullParameter(state, "state");
                m40312n = state.m40312n((r24 & 1) != 0 ? state.f81329a : null, (r24 & 2) != 0 ? state.f81330b : null, (r24 & 4) != 0 ? state.f81331c : 0, (r24 & 8) != 0 ? state.f81332d : null, (r24 & 16) != 0 ? state.f81333e : null, (r24 & 32) != 0 ? state.f81334f : null, (r24 & 64) != 0 ? state.f81335g : null, (r24 & 128) != 0 ? state.f81336h : null, (r24 & 256) != 0 ? state.f81337i : null, (r24 & 512) != 0 ? state.f81338j : null, (r24 & 1024) != 0 ? state.f81339k : null);
                m40312n.m40300z(true);
                return m40312n;
            }
        }

        public C10543u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<String, WireSkuOrder>> invoke(Triple<String, ? extends List<PC5>, WireSkuOrder> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component1 = triple.component1();
            List<PC5> scannedItems = triple.component2();
            WireSkuOrder component3 = triple.component3();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            List<PC5> list = scannedItems;
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                int i2 = 0;
                for (PC5 pc5 : list) {
                    if (pc5.m90583g() == EnumC43500jl5.RECEIVED) {
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
            if (i >= component3.getQuantity()) {
                C37709a12.this.m42279i(C10544a.f49720g);
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, component3));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a2\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00010\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$v */
    /* loaded from: classes3.dex */
    public static final class C10545v extends Lambda implements Function1<Pair<? extends String, ? extends WireSkuOrder>, Pair<? extends String, ? extends WireSkuOrder>> {

        /* renamed from: g */
        public static final C10545v f49721g = new C10545v();

        public C10545v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends String, ? extends WireSkuOrder> invoke(Pair<? extends String, ? extends WireSkuOrder> pair) {
            return invoke2((Pair<String, WireSkuOrder>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<String, WireSkuOrder> invoke2(Pair<String, WireSkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            WireSkuOrder component2 = pair.component2();
            String m99597e = C33894Jt4.f18402a.m99597e(component1);
            if (m99597e != null) {
                component1 = m99597e;
            }
            return TuplesKt.m28425to(component1, component2);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000 \u0003*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062J\u0010\u0005\u001aF\u00124\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuScanItem;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$w */
    /* loaded from: classes3.dex */
    public static final class C10546w extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends WireSkuOrder>, ? extends Boolean>, InterfaceC23447K<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: a12$w$a */
        /* loaded from: classes3.dex */
        public static final class C10547a extends Lambda implements Function1<WireSkuScanItem, Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f49723g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10547a(WireSkuOrder wireSkuOrder) {
                super(1);
                this.f49723g = wireSkuOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireSkuScanItem, WireSkuOrder> invoke(WireSkuScanItem scanItem) {
                Intrinsics.checkNotNullParameter(scanItem, "scanItem");
                return TuplesKt.m28425to(scanItem, this.f49723g);
            }
        }

        public C10546w() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<WireSkuScanItem, WireSkuOrder>> invoke(Pair<Pair<String, WireSkuOrder>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<String, WireSkuOrder> component1 = pair.component1();
            Boolean serviceCenterScan = pair.component2();
            String component12 = component1.component1();
            WireSkuOrder component2 = component1.component2();
            C37709a12 c37709a12 = C37709a12.this;
            O86 o86 = c37709a12.f49685f;
            String id = component2.getId();
            Intrinsics.checkNotNullExpressionValue(serviceCenterScan, "serviceCenterScan");
            AbstractC23442F m72015u0 = c37709a12.m72015u0(O86.C5908a.scanSkuForSkuOrder$default(o86, false, id, component12, serviceCenterScan.booleanValue(), null, true, false, 80, null));
            final C10547a c10547a = new C10547a(component2);
            return m72015u0.m33157I(new InterfaceC23492o() { // from class: d12
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C37709a12.C10546w.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a12$x */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10548x extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10548x(Object obj) {
            super(1, obj, C37709a12.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37709a12) this.receiver).m72025p0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\n¢\u0006\u0004\b\f\u0010\r"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "errorCode", "", "LPC5;", "scannedItems", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "<anonymous parameter 4>", "Lg12;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;Lco/bird/android/model/wire/WireSkuOrder;Ljava/lang/String;Ljava/util/List;Lco/bird/api/response/TransferOrderVehicleViewResponse;)Lg12;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$7\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n288#2,2:397\n1#3:399\n*S KotlinDebug\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$consume$7\n*L\n131#1:397,2\n*E\n"})
    /* renamed from: a12$y */
    /* loaded from: classes3.dex */
    public static final class C10549y extends Lambda implements Function5<WireSkuScanItem, WireSkuOrder, String, List<? extends PC5>, TransferOrderVehicleViewResponse, C41284g12> {
        public C10549y() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* renamed from: a */
        public final C41284g12 invoke(WireSkuScanItem scanItem, WireSkuOrder skuOrder, String errorCode, List<PC5> scannedItems, TransferOrderVehicleViewResponse transferOrderVehicleViewResponse) {
            WireTransferOrder wireTransferOrder;
            Object obj;
            TransferOrderDemandSource transferOrderDemandSource;
            boolean contains;
            C41284g12 m40312n;
            WireTransferOrder transferOrder;
            C41284g12 m40312n2;
            TransferOrderReason transferOrderReason;
            C41284g12 m40312n3;
            boolean z;
            Intrinsics.checkNotNullParameter(scanItem, "scanItem");
            Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
            Intrinsics.checkNotNullParameter(transferOrderVehicleViewResponse, "<anonymous parameter 4>");
            WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
            TransferOrderDemandSource transferOrderDemandSource2 = null;
            if (transferOrderLineItem != null) {
                wireTransferOrder = transferOrderLineItem.getTransferOrder();
            } else {
                wireTransferOrder = null;
            }
            Iterator<T> it = scannedItems.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    PC5 pc5 = (PC5) obj;
                    if (Intrinsics.areEqual(pc5.m90585e(), scanItem.getItemId()) && pc5.m90583g() == EnumC43500jl5.RECEIVED) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PC5 pc52 = (PC5) obj;
            Set set = C37709a12.f49683l;
            if (wireTransferOrder != null) {
                transferOrderDemandSource = wireTransferOrder.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(set, transferOrderDemandSource);
            if (contains) {
                if (wireTransferOrder != null) {
                    transferOrderReason = wireTransferOrder.getReason();
                } else {
                    transferOrderReason = null;
                }
                if (transferOrderReason == TransferOrderReason.TERMINATION && WireSkuScanItemKt.toInventoryScanningError(errorCode) == InventoryScanningError.ITEM_NOT_IN_SKU_ORDER) {
                    m40312n3 = r4.m40312n((r24 & 1) != 0 ? r4.f81329a : null, (r24 & 2) != 0 ? r4.f81330b : null, (r24 & 4) != 0 ? r4.f81331c : 0, (r24 & 8) != 0 ? r4.f81332d : null, (r24 & 16) != 0 ? r4.f81333e : null, (r24 & 32) != 0 ? r4.f81334f : null, (r24 & 64) != 0 ? r4.f81335g : null, (r24 & 128) != 0 ? r4.f81336h : null, (r24 & 256) != 0 ? r4.f81337i : null, (r24 & 512) != 0 ? r4.f81338j : null, (r24 & 1024) != 0 ? C37709a12.this.m42277k().f81339k : null);
                    m40312n3.m40301y(new C36024Sw1(scanItem, skuOrder));
                    return m40312n3;
                }
            }
            if (WireSkuScanItemKt.toInventoryScanningError(errorCode) == InventoryScanningError.INCORRECT_FLEET && pc52 != null) {
                m40312n2 = r8.m40312n((r24 & 1) != 0 ? r8.f81329a : null, (r24 & 2) != 0 ? r8.f81330b : null, (r24 & 4) != 0 ? r8.f81331c : 0, (r24 & 8) != 0 ? r8.f81332d : null, (r24 & 16) != 0 ? r8.f81333e : null, (r24 & 32) != 0 ? r8.f81334f : null, (r24 & 64) != 0 ? r8.f81335g : null, (r24 & 128) != 0 ? r8.f81336h : null, (r24 & 256) != 0 ? r8.f81337i : null, (r24 & 512) != 0 ? r8.f81338j : null, (r24 & 1024) != 0 ? C37709a12.this.m42277k().f81339k : null);
                String m90586d = pc52.m90586d();
                if (m90586d == null) {
                    m90586d = "";
                }
                m40312n2.m40303w(m90586d);
                return m40312n2;
            }
            m40312n = r7.m40312n((r24 & 1) != 0 ? r7.f81329a : null, (r24 & 2) != 0 ? r7.f81330b : null, (r24 & 4) != 0 ? r7.f81331c : 0, (r24 & 8) != 0 ? r7.f81332d : null, (r24 & 16) != 0 ? r7.f81333e : null, (r24 & 32) != 0 ? r7.f81334f : null, (r24 & 64) != 0 ? r7.f81335g : null, (r24 & 128) != 0 ? r7.f81336h : null, (r24 & 256) != 0 ? r7.f81337i : null, (r24 & 512) != 0 ? r7.f81338j : null, (r24 & 1024) != 0 ? C37709a12.this.m42277k().f81339k : null);
            WireTransferOrderLineItem transferOrderLineItem2 = skuOrder.getTransferOrderLineItem();
            if (transferOrderLineItem2 != null && (transferOrder = transferOrderLineItem2.getTransferOrder()) != null) {
                transferOrderDemandSource2 = transferOrder.getDemandSource();
            }
            m40312n.m40322A(new C39322ck5(transferOrderDemandSource2, errorCode));
            return m40312n;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000624\u0010\u0005\u001a0\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuScanItem;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a12$z */
    /* loaded from: classes3.dex */
    public static final class C10550z extends Lambda implements Function1<Triple<? extends Pair<? extends String, ? extends Boolean>, ? extends String, ? extends Boolean>, InterfaceC23447K<? extends WireSkuScanItem>> {
        public C10550z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireSkuScanItem> invoke(Triple<Pair<String, Boolean>, String, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Pair<String, Boolean> component1 = triple.component1();
            String skuOrderId = triple.component2();
            Boolean serviceCenterScan = triple.component3();
            boolean booleanValue = component1.component2().booleanValue();
            C37709a12 c37709a12 = C37709a12.this;
            O86 o86 = c37709a12.f49685f;
            Intrinsics.checkNotNullExpressionValue(skuOrderId, "skuOrderId");
            Intrinsics.checkNotNullExpressionValue(serviceCenterScan, "serviceCenterScan");
            return c37709a12.m72015u0(O86.C5908a.scanSkuForSkuOrder$default(o86, false, skuOrderId, component1.component1(), serviceCenterScan.booleanValue(), null, false, booleanValue, 16, null));
        }
    }

    static {
        Set<TransferOrderDemandSource> of;
        Set<TransferOrderDemandSource> of2;
        of = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FM_DROP_OFF, TransferOrderDemandSource.FM_LONGTAIL_RETURN});
        f49683l = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FM_LONGTAIL_DELIVERY, TransferOrderDemandSource.FM_LONGTAIL_DELIVERY_3PL});
        f49684m = of2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37709a12(O86 transferOrderManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(new C41284g12(null, null, 0, null, null, null, null, null, null, null, null, 2047, null), null, 2, null);
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f49685f = transferOrderManager;
        this.f49686g = navigator;
        this.f49687h = reactiveConfig;
        C45168ma4<List<PC5>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<SkuScanItem>>()");
        this.f49688i = m25409g;
        C0058AG<TransferOrderVehicleViewResponse> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<TransferOrderVehicleViewResponse>()");
        this.f49689j = m115951g;
    }

    /* renamed from: R */
    public static final InterfaceC23447K m72052R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final List m72051S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m72050T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m72049U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final List m72048V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m72047W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m72046X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final List m72045Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC23447K m72044Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m72043a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final List m72042b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m72041c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m72040d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m72039e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m72038f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC24574u m72037f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final Pair m72036g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final InterfaceC23447K m72035h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m72034i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23447K m72033j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final List m72032k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m72031l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final InterfaceC24574u m72029n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final C41284g12 m72021r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C41284g12) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m72019s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final void m72017t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m72013v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m72011w0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    @Override // p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: Q */
    public void consume(InterfaceC40691f12 renderer) {
        List<PC5> emptyList;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C37709a12) renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f49687h.m82627f4(), this.f49687h.m82691Z5(), C10521b.f49701a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10524e c10524e = new C10524e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: y02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72038f(Function1.this, obj);
            }
        });
        Observable<String> mo42268s0 = renderer.mo42268s0();
        final C10508B c10508b = new C10508B();
        AbstractC24495a skuOrderObservable = mo42268s0.flatMapSingle(new InterfaceC23492o() { // from class: A02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72052R;
                m72052R = C37709a12.m72052R(Function1.this, obj);
                return m72052R;
            }
        }).publish();
        Intrinsics.checkNotNullExpressionValue(skuOrderObservable, "skuOrderObservable");
        Observable combineLatest2 = Observable.combineLatest(skuOrderObservable, this.f49688i, C10522c.f49702a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Object m33094as2 = combineLatest2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10536p c10536p = new C10536p();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: D02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72041c0(Function1.this, obj);
            }
        });
        Observable<String> mo54815T = renderer.mo54815T();
        C45168ma4<List<PC5>> c45168ma4 = this.f49688i;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<PC5>> startWith = c45168ma4.startWith((C45168ma4<List<PC5>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "scannedItems.startWith(emptyList<SkuScanItem>())");
        Observable m31949b = C24527f.m31949b(mo54815T, startWith, skuOrderObservable);
        final C10543u c10543u = new C10543u();
        Observable flatMapMaybe = m31949b.flatMapMaybe(new InterfaceC23492o() { // from class: E02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m72037f0;
                m72037f0 = C37709a12.m72037f0(Function1.this, obj);
                return m72037f0;
            }
        });
        final C10545v c10545v = C10545v.f49721g;
        Observable map = flatMapMaybe.map(new InterfaceC23492o() { // from class: F02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m72036g0;
                m72036g0 = C37709a12.m72036g0(Function1.this, obj);
                return m72036g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun consume(ren…rObservable.connect()\n  }");
        Observable m31950a = C24527f.m31950a(map, renderer.mo42271a0());
        final C10546w c10546w = new C10546w();
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: G02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72035h0;
                m72035h0 = C37709a12.m72035h0(Function1.this, obj);
                return m72035h0;
            }
        });
        final C10548x c10548x = new C10548x(this);
        Observable<Pair<WireSkuScanItem, WireSkuOrder>> retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: H02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72034i0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…rObservable.connect()\n  }");
        m72023q0(retry, false, new C10549y());
        Observable m31949b2 = C24527f.m31949b(renderer.mo42270j6(), renderer.mo42268s0(), renderer.mo42271a0());
        final C10550z c10550z = new C10550z();
        Observable flatMapSingle2 = m31949b2.flatMapSingle(new InterfaceC23492o() { // from class: I02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72033j0;
                m72033j0 = C37709a12.m72033j0(Function1.this, obj);
                return m72033j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun consume(ren…rObservable.connect()\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle2, this.f49688i);
        final C10507A c10507a = new C10507A();
        Observable map2 = m31950a2.map(new InterfaceC23492o() { // from class: K02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72032k0;
                m72032k0 = C37709a12.m72032k0(Function1.this, obj);
                return m72032k0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "override fun consume(ren…rObservable.connect()\n  }");
        Observable observeOn = C24527f.m31950a(map2, skuOrderObservable).observeOn(C23454a.m33087a());
        final C10526f c10526f = new C10526f();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: L02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72031l0(Function1.this, obj);
            }
        });
        final C10527g c10527g = C10527g.f49708g;
        Observable map3 = doOnNext.map(new InterfaceC23492o() { // from class: J02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72051S;
                m72051S = C37709a12.m72051S(Function1.this, obj);
                return m72051S;
            }
        });
        final C10528h c10528h = new C10528h(this);
        Observable retry2 = map3.doOnError(new InterfaceC23484g() { // from class: S02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72050T(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "override fun consume(ren…rObservable.connect()\n  }");
        Object m33094as3 = retry2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe(this.f49688i);
        m72023q0(renderer.mo42272N2(), true, new C10529i());
        Observable<R> withLatestFrom = renderer.mo42269k6().withLatestFrom(renderer.mo42268s0(), renderer.mo42271a0(), this.f49688i, C10523d.f49703a);
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "withLatestFrom(o1, o2, o…-> Quad(t, t1, t2, t3) })");
        final C10530j c10530j = new C10530j();
        Observable flatMapSingle3 = withLatestFrom.flatMapSingle(new InterfaceC23492o() { // from class: T02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72049U;
                m72049U = C37709a12.m72049U(Function1.this, obj);
                return m72049U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle3, "override fun consume(ren…rObservable.connect()\n  }");
        Observable m31950a3 = C24527f.m31950a(flatMapSingle3, this.f49688i);
        final C10531k c10531k = C10531k.f49711g;
        Observable map4 = m31950a3.map(new InterfaceC23492o() { // from class: U02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72048V;
                m72048V = C37709a12.m72048V(Function1.this, obj);
                return m72048V;
            }
        });
        final C10532l c10532l = new C10532l(this);
        Observable retry3 = map4.doOnError(new InterfaceC23484g() { // from class: V02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72047W(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "override fun consume(ren…rObservable.connect()\n  }");
        Observable m31950a4 = C24527f.m31950a(retry3, skuOrderObservable);
        final C10533m c10533m = new C10533m();
        Observable doOnNext2 = m31950a4.doOnNext(new InterfaceC23484g() { // from class: W02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72046X(Function1.this, obj);
            }
        });
        final C10534n c10534n = C10534n.f49713g;
        Observable map5 = doOnNext2.map(new InterfaceC23492o() { // from class: X02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72045Y;
                m72045Y = C37709a12.m72045Y(Function1.this, obj);
                return m72045Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "override fun consume(ren…rObservable.connect()\n  }");
        Object m33094as4 = map5.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe(this.f49688i);
        Observable<String> mo42268s02 = renderer.mo42268s0();
        final C10535o c10535o = new C10535o(this.f49685f);
        Observable<R> flatMapSingle4 = mo42268s02.flatMapSingle(new InterfaceC23492o() { // from class: Y02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72044Z;
                m72044Z = C37709a12.m72044Z(Function1.this, obj);
                return m72044Z;
            }
        });
        final C10538q c10538q = new C10538q(this);
        Observable retry4 = flatMapSingle4.doOnError(new InterfaceC23484g() { // from class: Z02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72043a0(Function1.this, obj);
            }
        }).retry(3L);
        final C10539r c10539r = C10539r.f49717g;
        Observable map6 = retry4.map(new InterfaceC23492o() { // from class: z02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m72042b0;
                m72042b0 = C37709a12.m72042b0(Function1.this, obj);
                return m72042b0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "renderer.skuOrderId()\n  …nItem()\n        }\n      }");
        Object m33094as5 = map6.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe(this.f49688i);
        final C10540s c10540s = new C10540s();
        Observable<R> flatMapSingle5 = skuOrderObservable.flatMapSingle(new InterfaceC23492o() { // from class: B02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72040d0;
                m72040d0 = C37709a12.m72040d0(Function1.this, obj);
                return m72040d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle5, "override fun consume(ren…rObservable.connect()\n  }");
        Object m33094as6 = flatMapSingle5.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10542t c10542t = new C10542t(this.f49689j);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: C02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72039e0(Function1.this, obj);
            }
        });
        skuOrderObservable.m32087e();
    }

    /* renamed from: m0 */
    public final Observable<C41284g12> m72030m0(Observable<C41284g12> observable) {
        Observable m31950a = C24527f.m31950a(observable, this.f49688i);
        final C10510C c10510c = new C10510C();
        Observable<C41284g12> flatMapMaybe = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: R02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m72029n0;
                m72029n0 = C37709a12.m72029n0(Function1.this, obj);
                return m72029n0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<I…e.just(state)\n      }\n  }");
        return flatMapMaybe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r4 != false) goto L9;
     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m72027o0(List<PC5> list, WireSkuOrder wireSkuOrder) {
        boolean z;
        boolean z2;
        boolean z3;
        if (list.size() == wireSkuOrder.getQuantity()) {
            List<PC5> list2 = list;
            z = true;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (PC5 pc5 : list2) {
                    if (pc5.m90583g() == EnumC43500jl5.RECEIVED) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
        }
        z = false;
        if (z) {
            this.f49686g.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
        }
    }

    /* renamed from: p0 */
    public final void m72025p0(Throwable th) {
        C41318g46.m40159e(th);
        m42279i(new C10511D(th));
    }

    /* renamed from: q0 */
    public final InterfaceC23465c m72023q0(Observable<Pair<WireSkuScanItem, WireSkuOrder>> observable, boolean z, Function5<? super WireSkuScanItem, ? super WireSkuOrder, ? super String, ? super List<PC5>, ? super TransferOrderVehicleViewResponse, C41284g12> function5) {
        Observable<R> withLatestFrom = observable.withLatestFrom(this.f49688i, this.f49689j, new C10512E());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        final C10513F c10513f = new C10513F(function5, this, z);
        Observable<C41284g12> map = withLatestFrom.map(new InterfaceC23492o() { // from class: O02
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C41284g12 m72021r0;
                m72021r0 = C37709a12.m72021r0(Function1.this, obj);
                return m72021r0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun Observable<P…   .subscribe(::emit)\n  }");
        Observable<C41284g12> m72030m0 = m72030m0(map);
        final C10514G c10514g = new C10514G(this);
        Observable<C41284g12> retry = m72030m0.doOnError(new InterfaceC23484g() { // from class: P02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72019s0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun Observable<P…   .subscribe(::emit)\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10515H c10515h = new C10515H(this);
        InterfaceC23465c subscribe = ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Q02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72017t0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun Observable<P…   .subscribe(::emit)\n  }");
        return subscribe;
    }

    /* renamed from: u0 */
    public final <T> AbstractC23442F<T> m72015u0(AbstractC23442F<T> abstractC23442F) {
        final C10516I c10516i = new C10516I();
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: M02
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37709a12.m72013v0(Function1.this, obj);
            }
        });
        final C10518J c10518j = new C10518J();
        AbstractC23442F<T> m33104u = m33102v.m33104u(new InterfaceC23479b() { // from class: N02
            @Override // io.reactivex.functions.InterfaceC23479b
            public final void accept(Object obj, Object obj2) {
                C37709a12.m72011w0(Function2.this, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33104u, "private fun <T>Single<T>…oading - 1) }\n      }\n  }");
        return m33104u;
    }

    /* renamed from: x0 */
    public final List<PC5> m72009x0(List<PC5> list, String str, EnumC43500jl5 enumC43500jl5, String str2) {
        Object obj;
        EnumC43500jl5 enumC43500jl52;
        String str3;
        PC5 m90589a;
        List minus;
        List<PC5> listOf;
        if (str == null) {
            return list;
        }
        List<PC5> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((PC5) obj).m90585e(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PC5 pc5 = (PC5) obj;
        if (pc5 == null) {
            return list;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        if (enumC43500jl5 == null && str2 == null) {
            m90589a = pc5;
        } else {
            if (enumC43500jl5 == null) {
                enumC43500jl52 = pc5.m90583g();
            } else {
                enumC43500jl52 = enumC43500jl5;
            }
            if (str2 == null) {
                str3 = pc5.m90584f();
            } else {
                str3 = str2;
            }
            m90589a = pc5.m90589a((r18 & 1) != 0 ? pc5.f28106a : null, (r18 & 2) != 0 ? pc5.f28107b : null, (r18 & 4) != 0 ? pc5.f28108c : null, (r18 & 8) != 0 ? pc5.f28109d : null, (r18 & 16) != 0 ? pc5.f28110e : null, (r18 & 32) != 0 ? pc5.f28111f : null, (r18 & 64) != 0 ? pc5.f28112g : str3, (r18 & 128) != 0 ? pc5.f28113h : enumC43500jl52);
        }
        spreadBuilder.add(m90589a);
        minus = CollectionsKt___CollectionsKt.minus(list2, pc5);
        spreadBuilder.addSpread(minus.toArray(new PC5[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new PC5[spreadBuilder.size()]));
        return listOf;
    }
}
