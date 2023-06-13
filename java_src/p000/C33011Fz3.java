package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.api.response.BulkScanItemResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.C33011Fz3;
import p000.InterfaceC40099e13;
import p000.O86;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007H\u0016J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\b0\u0007H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0004J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0004J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0004R\u001a\u0010\u001d\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020, -*\n\u0012\u0004\u0012\u00020,\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R.\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f -*\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R.\u00104\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t -*\n\u0012\u0004\u0012\u00020\t\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\"\u00106\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\n0\n0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/¨\u00069"}, m28432d2 = {"LFz3;", "LhE;", "LKz3;", "LLz3;", "renderer", "", "S", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "t0", "", "", "Lco/bird/api/response/BulkScanItemResponse;", "Q", "T", "Lio/reactivex/F;", "v0", "Lio/reactivex/c;", AbstractC26684u0.f100690q, "", "e", "s0", "LO86;", "f", "LO86;", "r0", "()LO86;", "transferOrderManager", "Le13;", "g", "Le13;", "p0", "()Le13;", "navigator", "LTq4;", "h", "LTq4;", "q0", "()LTq4;", "reactiveConfig", "LAG;", "", "LPC5;", "kotlin.jvm.PlatformType", "i", "LAG;", "scannedItems", "j", "successIds", "k", "failedIds", "l", "skuOrderRelay", "<init>", "(LO86;Le13;LTq4;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,334:1\n52#2,2:335\n52#2,2:338\n61#2,2:341\n180#3:337\n180#3:340\n180#3:343\n180#3:344\n180#3:345\n180#3:346\n180#3:347\n180#3:348\n180#3:349\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter\n*L\n45#1:335,2\n60#1:338,2\n102#1:341,2\n49#1:337\n92#1:340\n107#1:343\n165#1:344\n203#1:345\n239#1:346\n249#1:347\n264#1:348\n278#1:349\n*E\n"})
/* renamed from: Fz3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C33011Fz3 extends C22600hE<InterfaceC34181Kz3, C34415Lz3> {

    /* renamed from: f */
    public final O86 f10662f;

    /* renamed from: g */
    public final InterfaceC40099e13 f10663g;

    /* renamed from: h */
    public final C36207Tq4 f10664h;

    /* renamed from: i */
    public final C0058AG<List<PC5>> f10665i;

    /* renamed from: j */
    public final C0058AG<List<String>> f10666j;

    /* renamed from: k */
    public final C0058AG<List<WireSkuScanItem>> f10667k;

    /* renamed from: l */
    public final C0058AG<WireSkuOrder> f10668l;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000 \u0003*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062J\u0010\u0005\u001aF\u00124\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuScanItem;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$A */
    /* loaded from: classes3.dex */
    public static final class C2548A extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends WireSkuOrder>, ? extends Boolean>, InterfaceC23447K<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a2\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$A$a */
        /* loaded from: classes3.dex */
        public static final class C2549a extends Lambda implements Function1<WireSkuScanItem, Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>> {

            /* renamed from: g */
            public final /* synthetic */ String f10670g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuOrder f10671h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2549a(String str, WireSkuOrder wireSkuOrder) {
                super(1);
                this.f10670g = str;
                this.f10671h = wireSkuOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireSkuScanItem, WireSkuOrder> invoke(WireSkuScanItem scanItem) {
                WireSkuScanItem copy;
                Intrinsics.checkNotNullParameter(scanItem, "scanItem");
                copy = scanItem.copy((r18 & 1) != 0 ? scanItem.itemId : null, (r18 & 2) != 0 ? scanItem.itemDisplayName : null, (r18 & 4) != 0 ? scanItem.itemDisplayCaption : null, (r18 & 8) != 0 ? scanItem.failureCount : 0, (r18 & 16) != 0 ? scanItem.successCount : 0, (r18 & 32) != 0 ? scanItem.bird : null, (r18 & 64) != 0 ? scanItem.errorCode : null, (r18 & 128) != 0 ? scanItem.scanIdentifier : this.f10670g);
                return TuplesKt.m28425to(copy, this.f10671h);
            }
        }

        public C2548A() {
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
            C33011Fz3 c33011Fz3 = C33011Fz3.this;
            O86 m106066r0 = c33011Fz3.m106066r0();
            String id = component2.getId();
            Intrinsics.checkNotNullExpressionValue(serviceCenterScan, "serviceCenterScan");
            AbstractC23442F m106059v0 = c33011Fz3.m106059v0(O86.C5908a.scanSkuForSkuOrder$default(m106066r0, true, id, component12, serviceCenterScan.booleanValue(), null, true, false, 80, null));
            final C2549a c2549a = new C2549a(component12, component2);
            return m106059v0.m33157I(new InterfaceC23492o() { // from class: Jz3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C33011Fz3.C2548A.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$B */
    /* loaded from: classes3.dex */
    public static final class C2550B extends Lambda implements Function1<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$9$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
        /* renamed from: Fz3$B$a */
        /* loaded from: classes3.dex */
        public static final class C2551a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public final /* synthetic */ String f10673g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuOrder f10674h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2551a(String str, WireSkuOrder wireSkuOrder) {
                super(1);
                this.f10673g = str;
                this.f10674h = wireSkuOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                TransferOrderDemandSource transferOrderDemandSource;
                WireTransferOrder transferOrder;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                String str = this.f10673g;
                WireTransferOrderLineItem transferOrderLineItem = this.f10674h.getTransferOrderLineItem();
                if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                    transferOrderDemandSource = transferOrder.getDemandSource();
                } else {
                    transferOrderDemandSource = null;
                }
                m96039n.m96029x(new C38729bk5(str, transferOrderDemandSource));
                return m96039n;
            }
        }

        public C2550B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireSkuScanItem, ? extends WireSkuOrder> pair) {
            invoke2((Pair<WireSkuScanItem, WireSkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireSkuScanItem, WireSkuOrder> pair) {
            WireSkuOrder component2 = pair.component2();
            String errorCode = pair.component1().getErrorCode();
            if (errorCode != null) {
                C33011Fz3.this.m42279i(new C2551a(errorCode, component2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
    /* renamed from: Fz3$C */
    /* loaded from: classes3.dex */
    public static final class C2552C extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f10675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2552C(Throwable th) {
            super(1);
            this.f10675g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C34415Lz3 invoke(C34415Lz3 state) {
            C34415Lz3 m96039n;
            Intrinsics.checkNotNullParameter(state, "state");
            m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
            m96039n.m96030w(this.f10675g);
            return m96039n;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$D */
    /* loaded from: classes3.dex */
    public static final class C2553D extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$D$a */
        /* loaded from: classes3.dex */
        public static final class C2554a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public static final C2554a f10677g = new C2554a();

            public C2554a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : state.m96038o() + 1, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2553D() {
            super(1);
        }

        /* renamed from: a */
        public final void m106045a(InterfaceC23465c interfaceC23465c) {
            C33011Fz3.this.m42279i(C2554a.f10677g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106045a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$E */
    /* loaded from: classes3.dex */
    public static final class C2555E extends Lambda implements Function2<T, Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$E$a */
        /* loaded from: classes3.dex */
        public static final class C2556a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public static final C2556a f10679g = new C2556a();

            public C2556a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : state.m96038o() - 1, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2555E() {
            super(2);
        }

        /* renamed from: a */
        public final void m106043a(T t, Throwable th) {
            C33011Fz3.this.m42279i(C2556a.f10679g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            m106043a(obj, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$F */
    /* loaded from: classes3.dex */
    public static final class C2557F extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$F$a */
        /* loaded from: classes3.dex */
        public static final class C2558a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public static final C2558a f10681g = new C2558a();

            public C2558a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : state.m96038o() + 1, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2557F() {
            super(1);
        }

        /* renamed from: a */
        public final void m106041a(InterfaceC23465c interfaceC23465c) {
            C33011Fz3.this.m42279i(C2558a.f10681g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m106041a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$G */
    /* loaded from: classes3.dex */
    public static final class C2559G extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$G$a */
        /* loaded from: classes3.dex */
        public static final class C2560a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public static final C2560a f10683g = new C2560a();

            public C2560a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : state.m96038o() - 1, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2559G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C33011Fz3.this.m42279i(C2560a.f10683g);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\b0\b \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u000722\u0010\u0006\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "", "", "LPC5;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/BulkScanItemResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$bulkProcessVehicles$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1603#2,9:335\n1855#2:344\n1856#2:346\n1612#2:347\n1#3:345\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$bulkProcessVehicles$1\n*L\n297#1:335,9\n297#1:344\n297#1:346\n297#1:347\n297#1:345\n*E\n"})
    /* renamed from: Fz3$a */
    /* loaded from: classes3.dex */
    public static final class C2561a extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends PC5>>, InterfaceC23447K<? extends BulkScanItemResponse>> {
        public C2561a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends BulkScanItemResponse> invoke(Pair<Pair<String, Boolean>, ? extends List<PC5>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<String, Boolean> component1 = pair.component1();
            List<PC5> scannedItems = pair.component2();
            String component12 = component1.component1();
            boolean booleanValue = component1.component2().booleanValue();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            ArrayList arrayList = new ArrayList();
            for (PC5 pc5 : scannedItems) {
                String m90584f = pc5.m90584f();
                if (m90584f != null) {
                    arrayList.add(m90584f);
                }
            }
            C33011Fz3 c33011Fz3 = C33011Fz3.this;
            return c33011Fz3.m106059v0(O86.C5908a.bulkScanSkusForSkuOrder$default(c33011Fz3.m106066r0(), true, component12, arrayList, booleanValue, false, 16, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Fz3$b */
    /* loaded from: classes3.dex */
    public static final class C2562b<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C2562b<T1, T2, R> f10685a = new C2562b<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Fz3$c */
    /* loaded from: classes3.dex */
    public static final class C2563c<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C2563c<T1, T2, R> f10686a = new C2563c<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/Triple;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: Fz3$d */
    /* loaded from: classes3.dex */
    public static final class C2564d<T1, T2, T3, R> implements InterfaceC23485h {

        /* renamed from: a */
        public static final C2564d<T1, T2, T3, R> f10687a = new C2564d<>();

        @Override // io.reactivex.functions.InterfaceC23485h
        /* renamed from: a */
        public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
            return new Triple<>(t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$e */
    /* loaded from: classes3.dex */
    public static final class C2565e extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$e$a */
        /* loaded from: classes3.dex */
        public static final class C2566a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public final /* synthetic */ boolean f10689g;

            /* renamed from: h */
            public final /* synthetic */ boolean f10690h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2566a(boolean z, boolean z2) {
                super(1);
                this.f10689g = z;
                this.f10690h = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : Boolean.valueOf(this.f10689g), (r26 & 64) != 0 ? state.f22389g : Boolean.valueOf(this.f10690h), (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2565e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            C33011Fz3.this.m42279i(new C2566a(pair.component1().booleanValue(), pair.component2().booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$f */
    /* loaded from: classes3.dex */
    public static final class C2567f extends Lambda implements Function1<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, Boolean> {

        /* renamed from: g */
        public static final C2567f f10691g = new C2567f();

        public C2567f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<WireSkuScanItem, WireSkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1().getErrorCode() == null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends WireSkuScanItem, ? extends WireSkuOrder> pair) {
            return invoke2((Pair<WireSkuScanItem, WireSkuOrder>) pair);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2568g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2568g(Object obj) {
            super(1, obj, C33011Fz3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33011Fz3) this.receiver).m106064s0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u008f\u0001\u0010\u0006\u001a\u008a\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0003*D\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "LPC5;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,334:1\n2624#2,3:335\n1054#2:340\n37#3,2:338\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$12\n*L\n169#1:335,3\n177#1:340\n173#1:338,2\n*E\n"})
    /* renamed from: Fz3$h */
    /* loaded from: classes3.dex */
    public static final class C2569h extends Lambda implements Function1<Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends PC5>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$12\n*L\n1#1,328:1\n178#2:329\n*E\n"})
        /* renamed from: Fz3$h$a */
        /* loaded from: classes3.dex */
        public static final class C2570a<T> implements Comparator {

            /* renamed from: b */
            public final /* synthetic */ WireSkuScanItem f10693b;

            public C2570a(WireSkuScanItem wireSkuScanItem) {
                this.f10693b = wireSkuScanItem;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((PC5) t2).m90585e(), this.f10693b.getItemId())), Boolean.valueOf(Intrinsics.areEqual(((PC5) t).m90585e(), this.f10693b.getItemId())));
                return compareValues;
            }
        }

        public C2569h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends PC5>> pair) {
            invoke2((Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<PC5>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<PC5>> pair) {
            boolean z;
            List sortedWith;
            List listOf;
            List<PC5> scannedItems = pair.component2();
            WireSkuScanItem first = pair.component1().getFirst();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            List<PC5> list = scannedItems;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (PC5 pc5 : list) {
                    if (Intrinsics.areEqual(pc5.m90585e(), first.getItemId())) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                C0058AG c0058ag = C33011Fz3.this.f10665i;
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(QC5.toSkuScanItem$default(first, (EnumC43500jl5) null, 1, (Object) null));
                spreadBuilder.addSpread(scannedItems.toArray(new PC5[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new PC5[spreadBuilder.size()]));
                c0058ag.accept(listOf);
                return;
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C2570a(first));
            C33011Fz3.this.f10665i.accept(sortedWith);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "<anonymous parameter 0>", "", "skuOrderId", "", "serviceCenterScan", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Unit;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$i */
    /* loaded from: classes3.dex */
    public static final class C2571i extends Lambda implements Function3<Unit, String, Boolean, Pair<? extends String, ? extends Boolean>> {

        /* renamed from: g */
        public static final C2571i f10694g = new C2571i();

        public C2571i() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a */
        public final Pair<String, Boolean> invoke(Unit unit, String skuOrderId, Boolean serviceCenterScan) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
            Intrinsics.checkNotNullParameter(serviceCenterScan, "serviceCenterScan");
            return TuplesKt.m28425to(skuOrderId, serviceCenterScan);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00010\u00012&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0005*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/api/response/BulkScanItemResponse;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n766#2:335\n857#2,2:336\n1603#2,9:338\n1855#2:347\n1856#2:349\n1612#2:350\n766#2:351\n857#2,2:352\n1#3:348\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$14\n*L\n195#1:335\n195#1:336,2\n196#1:338,9\n196#1:347\n196#1:349\n196#1:350\n199#1:351\n199#1:352,2\n196#1:348\n*E\n"})
    /* renamed from: Fz3$j */
    /* loaded from: classes3.dex */
    public static final class C2572j extends Lambda implements Function1<Pair<? extends BulkScanItemResponse, ? extends List<? extends String>>, Pair<? extends List<? extends String>, ? extends List<? extends WireSkuScanItem>>> {

        /* renamed from: g */
        public static final C2572j f10695g = new C2572j();

        public C2572j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends String>, ? extends List<? extends WireSkuScanItem>> invoke(Pair<? extends BulkScanItemResponse, ? extends List<? extends String>> pair) {
            return invoke2((Pair<BulkScanItemResponse, ? extends List<String>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<String>, List<WireSkuScanItem>> invoke2(Pair<BulkScanItemResponse, ? extends List<String>> pair) {
            List plus;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BulkScanItemResponse component1 = pair.component1();
            List<String> successIds = pair.component2();
            ArrayList<WireSkuScanItem> arrayList = new ArrayList();
            Iterator<T> it = component1.getScanResults().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WireSkuScanItem) next).getErrorCode() == null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (WireSkuScanItem wireSkuScanItem : arrayList) {
                String itemId = wireSkuScanItem.getItemId();
                if (itemId != null) {
                    arrayList2.add(itemId);
                }
            }
            Intrinsics.checkNotNullExpressionValue(successIds, "successIds");
            plus = CollectionsKt___CollectionsKt.plus((Collection) successIds, (Iterable) arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : component1.getScanResults()) {
                if (((WireSkuScanItem) obj).getErrorCode() != null) {
                    arrayList3.add(obj);
                }
            }
            return TuplesKt.m28425to(plus, arrayList3);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2573k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2573k(Object obj) {
            super(1, obj, C33011Fz3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33011Fz3) this.receiver).m106064s0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$l */
    /* loaded from: classes3.dex */
    public static final class C2574l extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends List<? extends WireSkuScanItem>>, Unit> {
        public C2574l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends String>, ? extends List<? extends WireSkuScanItem>> pair) {
            invoke2((Pair<? extends List<String>, ? extends List<WireSkuScanItem>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<String>, ? extends List<WireSkuScanItem>> pair) {
            List<String> component1 = pair.component1();
            if (pair.component2().isEmpty()) {
                C33011Fz3.this.m106070p0().mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
            } else {
                C33011Fz3.this.f10666j.accept(component1);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0004*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\b0\b \u0004*|\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0004*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\b0\b\u0018\u00010\u00070\u00072F\u0010\u0006\u001aB\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "LPC5;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$17\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n766#2:335\n857#2,2:336\n766#2:338\n857#2,2:339\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$17\n*L\n220#1:335\n220#1:336,2\n223#1:338\n223#1:339,2\n*E\n"})
    /* renamed from: Fz3$m */
    /* loaded from: classes3.dex */
    public static final class C2575m extends Lambda implements Function1<Triple<? extends Optional<PC5>, ? extends List<? extends PC5>, ? extends List<? extends String>>, InterfaceC23447K<? extends Pair<? extends List<? extends PC5>, ? extends List<? extends String>>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Fz3$m$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C2576a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C2576a(Object obj) {
                super(1, obj, C33011Fz3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C33011Fz3) this.receiver).m106064s0(p0);
            }
        }

        public C2575m() {
            super(1);
        }

        /* renamed from: c */
        public static final void m106030c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<PC5>, List<String>>> invoke(Triple<Optional<PC5>, ? extends List<PC5>, ? extends List<String>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<PC5> scannedItems = triple.component2();
            List<String> successIds = triple.component3();
            PC5 m59035e = triple.component1().m59035e();
            if (m59035e == null) {
                return AbstractC23442F.m33158H(TuplesKt.m28425to(scannedItems, successIds));
            }
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = scannedItems.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                PC5 pc5 = (PC5) next;
                if ((Intrinsics.areEqual(pc5.m90588b(), m59035e.m90588b()) || Intrinsics.areEqual(pc5.m90585e(), m59035e.m90585e())) ? false : false) {
                    arrayList.add(next);
                }
            }
            Intrinsics.checkNotNullExpressionValue(successIds, "successIds");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : successIds) {
                if (!Intrinsics.areEqual((String) obj, m59035e.m90585e())) {
                    arrayList2.add(obj);
                }
            }
            if (m59035e.m90588b() != null) {
                C33011Fz3 c33011Fz3 = C33011Fz3.this;
                AbstractC23442F m33042m = c33011Fz3.m106061u0(c33011Fz3.m106066r0().mo80292l(m59035e.m90588b())).m33042m(AbstractC23442F.m33158H(TuplesKt.m28425to(arrayList, arrayList2)));
                final C2576a c2576a = new C2576a(c33011Fz3);
                AbstractC23442F m33151O = m33042m.m33106t(new InterfaceC23484g() { // from class: Gz3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj2) {
                        C33011Fz3.C2575m.m106030c(Function1.this, obj2);
                    }
                }).m33151O(AbstractC23442F.m33158H(TuplesKt.m28425to(scannedItems, successIds)));
                if (m33151O != null) {
                    return m33151O;
                }
            }
            return AbstractC23442F.m33158H(TuplesKt.m28425to(arrayList, arrayList2));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2577n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2577n(Object obj) {
            super(1, obj, C33011Fz3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33011Fz3) this.receiver).m106064s0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062v\u0010\u0005\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001 \u0003*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$o */
    /* loaded from: classes3.dex */
    public static final class C2578o extends Lambda implements Function1<Pair<? extends List<? extends PC5>, ? extends List<? extends String>>, Unit> {
        public C2578o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends PC5>, ? extends List<? extends String>> pair) {
            invoke2((Pair<? extends List<PC5>, ? extends List<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<PC5>, ? extends List<String>> pair) {
            C33011Fz3.this.f10665i.accept(pair.component1());
            C33011Fz3.this.f10666j.accept(pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a¢\u0001\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007 \t*\"\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u00050\u0005 \t*P\u0012J\b\u0001\u0012F\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007 \t*\"\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "LLz3;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "LPC5;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$p */
    /* loaded from: classes3.dex */
    public static final class C2579p extends Lambda implements Function1<Pair<? extends C34415Lz3, ? extends String>, InterfaceC23447K<? extends Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "items", "Lkotlin/Pair;", "", "LPC5;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1603#2,9:339\n1855#2:348\n1856#2:350\n1612#2:351\n1#3:349\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$2$1\n*L\n75#1:335\n75#1:336,3\n81#1:339,9\n81#1:348\n81#1:350\n81#1:351\n81#1:349\n*E\n"})
        /* renamed from: Fz3$p$a */
        /* loaded from: classes3.dex */
        public static final class C2580a extends Lambda implements Function1<WireSkuScannedItems, Pair<? extends List<? extends PC5>, ? extends List<? extends String>>> {

            /* renamed from: g */
            public static final C2580a f10700g = new C2580a();

            public C2580a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<PC5>, List<String>> invoke(WireSkuScannedItems items) {
                int collectionSizeOrDefault;
                Intrinsics.checkNotNullParameter(items, "items");
                List<WireSuccessfulScannedItem> successfulScannedItems = items.getSuccessfulScannedItems();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(successfulScannedItems, 10);
                ArrayList<PC5> arrayList = new ArrayList(collectionSizeOrDefault);
                for (WireSuccessfulScannedItem wireSuccessfulScannedItem : successfulScannedItems) {
                    arrayList.add(QC5.toSkuScanItem$default(wireSuccessfulScannedItem, (EnumC43500jl5) null, 1, (Object) null));
                }
                ArrayList arrayList2 = new ArrayList();
                for (PC5 pc5 : arrayList) {
                    String m90585e = pc5.m90585e();
                    if (m90585e != null) {
                        arrayList2.add(m90585e);
                    }
                }
                return TuplesKt.m28425to(arrayList, arrayList2);
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a \u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "Lkotlin/Pair;", "", "LPC5;", "", "pair", "Lkotlin/Triple;", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuOrder;Lkotlin/Pair;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$p$b */
        /* loaded from: classes3.dex */
        public static final class C2581b extends Lambda implements Function2<WireSkuOrder, Pair<? extends List<? extends PC5>, ? extends List<? extends String>>, Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>>> {

            /* renamed from: g */
            public static final C2581b f10701g = new C2581b();

            public C2581b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Triple<WireSkuOrder, List<PC5>, List<String>> invoke(WireSkuOrder skuOrder, Pair<? extends List<PC5>, ? extends List<String>> pair) {
                Intrinsics.checkNotNullParameter(skuOrder, "skuOrder");
                Intrinsics.checkNotNullParameter(pair, "pair");
                return new Triple<>(skuOrder, pair.getFirst(), pair.getSecond());
            }
        }

        public C2579p() {
            super(1);
        }

        /* renamed from: d */
        public static final Triple m106026d(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj, obj2);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Triple<WireSkuOrder, List<PC5>, List<String>>> invoke(Pair<C34415Lz3, String> pair) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            C34415Lz3 component1 = pair.component1();
            String component2 = pair.component2();
            List<PC5> m96035r = component1.m96035r();
            List<String> m96031v = component1.m96031v();
            C33011Fz3 c33011Fz3 = C33011Fz3.this;
            AbstractC23442F<WireSkuOrder> mo80296h = c33011Fz3.m106066r0().mo80296h(component2);
            if (m96035r.isEmpty()) {
                AbstractC23442F<WireSkuScannedItems> mo80279w = C33011Fz3.this.m106066r0().mo80279w(component2);
                final C2580a c2580a = C2580a.f10700g;
                m33158H = mo80279w.m33157I(new InterfaceC23492o() { // from class: Hz3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C33011Fz3.C2579p.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            } else {
                m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(m96035r, m96031v));
            }
            final C2581b c2581b = C2581b.f10701g;
            AbstractC23442F m33109r0 = AbstractC23442F.m33109r0(mo80296h, m33158H, new InterfaceC23480c() { // from class: Iz3
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    Triple m106026d;
                    m106026d = C33011Fz3.C2579p.m106026d(Function2.this, obj, obj2);
                    return m106026d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33109r0, "zip(\n          transferO…air.first, pair.second) }");
            return c33011Fz3.m106059v0(m33109r0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u00022&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "LPC5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/util/List;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$q */
    /* loaded from: classes3.dex */
    public static final class C2582q extends Lambda implements Function1<Pair<? extends PC5, ? extends List<? extends PC5>>, List<? extends PC5>> {

        /* renamed from: g */
        public static final C2582q f10702g = new C2582q();

        public C2582q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends PC5> invoke(Pair<? extends PC5, ? extends List<? extends PC5>> pair) {
            return invoke2((Pair<PC5, ? extends List<PC5>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<PC5> invoke2(Pair<PC5, ? extends List<PC5>> pair) {
            List<PC5> plus;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<PC5> scannedItems = pair.component2();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends PC5>) ((Collection<? extends Object>) scannedItems), pair.component1());
            return plus;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Pair;", "", "LPC5;", "", "b", "()Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$r */
    /* loaded from: classes3.dex */
    public static final class C2583r extends Lambda implements Function0<Pair<? extends List<? extends PC5>, ? extends List<? extends String>>> {
        public C2583r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Pair<List<PC5>, List<String>> invoke() {
            List list = (List) C33011Fz3.this.f10665i.getValue();
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            List list2 = (List) C33011Fz3.this.f10666j.getValue();
            if (list2 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            return TuplesKt.m28425to(list, list2);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\u00070\u00072@\u0010\u0006\u001a<\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0004*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "", "LPC5;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$22\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n*S KotlinDebug\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$22\n*L\n262#1:335\n262#1:336,3\n*E\n"})
    /* renamed from: Fz3$s */
    /* loaded from: classes3.dex */
    public static final class C2584s extends Lambda implements Function1<Triple<? extends Unit, ? extends List<? extends PC5>, ? extends List<? extends String>>, Integer> {

        /* renamed from: g */
        public static final C2584s f10704g = new C2584s();

        public C2584s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(Triple<Unit, ? extends List<PC5>, ? extends List<String>> triple) {
            int collectionSizeOrDefault;
            List minus;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            List<PC5> scannedItems = triple.component2();
            List<String> successIds = triple.component3();
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            List<PC5> list = scannedItems;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PC5 pc5 : list) {
                arrayList.add(pc5.m90585e());
            }
            Intrinsics.checkNotNullExpressionValue(successIds, "successIds");
            minus = CollectionsKt___CollectionsKt.minus((Iterable) arrayList, (Iterable) successIds);
            return Integer.valueOf(minus.size());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "unprocessedCount", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$t */
    /* loaded from: classes3.dex */
    public static final class C2585t extends Lambda implements Function1<Integer, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$23$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
        /* renamed from: Fz3$t$a */
        /* loaded from: classes3.dex */
        public static final class C2586a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public final /* synthetic */ Integer f10706g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2586a(Integer num) {
                super(1);
                this.f10706g = num;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                Integer unprocessedCount = this.f10706g;
                Intrinsics.checkNotNullExpressionValue(unprocessedCount, "unprocessedCount");
                m96039n.m96027z(new C41970hA5(unprocessedCount.intValue()));
                return m96039n;
            }
        }

        public C2585t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer unprocessedCount) {
            Intrinsics.checkNotNullExpressionValue(unprocessedCount, "unprocessedCount");
            if (unprocessedCount.intValue() > 0) {
                C33011Fz3.this.m42279i(new C2586a(unprocessedCount));
            } else {
                C33011Fz3.this.m106070p0().close();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$u */
    /* loaded from: classes3.dex */
    public static final class C2587u extends Lambda implements Function1<Unit, Unit> {
        public C2587u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C33011Fz3.this.m106070p0().close();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2588v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C2588v(Object obj) {
            super(1, obj, C33011Fz3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C33011Fz3) this.receiver).m106064s0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072J\u0010\u0006\u001aF\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\"\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "LPC5;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$w */
    /* loaded from: classes3.dex */
    public static final class C2589w extends Lambda implements Function1<Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>>, Unit> {
        public C2589w() {
            super(1);
        }

        /* renamed from: a */
        public final void m106020a(Triple<WireSkuOrder, ? extends List<PC5>, ? extends List<String>> triple) {
            C33011Fz3.this.f10668l.accept(triple.component1());
            C33011Fz3.this.f10665i.accept(triple.component2());
            C33011Fz3.this.f10666j.accept(triple.component3());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>> triple) {
            m106020a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0093\u0001\u0010\u0006\u001a\u008e\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0002*F\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "LPC5;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$x */
    /* loaded from: classes3.dex */
    public static final class C2590x extends Lambda implements Function1<Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Fz3$x$a */
        /* loaded from: classes3.dex */
        public static final class C2591a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f10710g;

            /* renamed from: h */
            public final /* synthetic */ List<PC5> f10711h;

            /* renamed from: i */
            public final /* synthetic */ List<String> f10712i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2591a(WireSkuOrder wireSkuOrder, List<PC5> list, List<String> list2) {
                super(1);
                this.f10710g = wireSkuOrder;
                this.f10711h = list;
                this.f10712i = list2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                WireSkuOrder wireSkuOrder = this.f10710g;
                List<PC5> scannedItems = this.f10711h;
                Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
                List<String> successIds = this.f10712i;
                Intrinsics.checkNotNullExpressionValue(successIds, "successIds");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : wireSkuOrder, (r26 & 2) != 0 ? state.f22384b : scannedItems, (r26 & 4) != 0 ? state.f22385c : successIds, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                return m96039n;
            }
        }

        public C2590x() {
            super(1);
        }

        /* renamed from: a */
        public final void m106019a(Triple<WireSkuOrder, ? extends List<PC5>, ? extends List<String>> triple) {
            C33011Fz3.this.m42279i(new C2591a(triple.component1(), triple.component2(), triple.component3()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireSkuOrder, ? extends List<? extends PC5>, ? extends List<? extends String>> triple) {
            m106019a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001az\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b \u0003*<\u00126\b\u0001\u00122\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b\u0018\u00010\u00070\u000724\u0010\u0006\u001a0\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "LPC5;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Pair;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Fz3$y */
    /* loaded from: classes3.dex */
    public static final class C2592y extends Lambda implements Function1<Triple<? extends String, ? extends WireSkuOrder, ? extends List<? extends PC5>>, InterfaceC24574u<? extends Pair<? extends String, ? extends WireSkuOrder>>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOutboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/OutboundScanPresenter$consume$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
        /* renamed from: Fz3$y$a */
        /* loaded from: classes3.dex */
        public static final class C2593a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

            /* renamed from: g */
            public static final C2593a f10714g = new C2593a();

            public C2593a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C34415Lz3 invoke(C34415Lz3 state) {
                C34415Lz3 m96039n;
                Intrinsics.checkNotNullParameter(state, "state");
                m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                m96039n.m96028y(true);
                return m96039n;
            }
        }

        public C2592y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<String, WireSkuOrder>> invoke(Triple<String, WireSkuOrder, ? extends List<PC5>> triple) {
            TransferOrderDemandSource transferOrderDemandSource;
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component1 = triple.component1();
            WireSkuOrder component2 = triple.component2();
            List<PC5> component3 = triple.component3();
            WireTransferOrderLineItem transferOrderLineItem = component2.getTransferOrderLineItem();
            if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            if (transferOrderDemandSource != TransferOrderDemandSource.SCRAP_REMOVAL && component3.size() >= component2.getQuantity()) {
                C33011Fz3.this.m42279i(C2593a.f10714g);
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component1, component2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a2\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00010\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fz3$z */
    /* loaded from: classes3.dex */
    public static final class C2594z extends Lambda implements Function1<Pair<? extends String, ? extends WireSkuOrder>, Pair<? extends String, ? extends WireSkuOrder>> {

        /* renamed from: g */
        public static final C2594z f10715g = new C2594z();

        public C2594z() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33011Fz3(O86 transferOrderManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(new C34415Lz3(null, null, null, 0, null, null, null, null, null, null, null, null, 4095, null), null, 2, null);
        List emptyList;
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f10662f = transferOrderManager;
        this.f10663g = navigator;
        this.f10664h = reactiveConfig;
        C0058AG<List<PC5>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<SkuScanItem>>()");
        this.f10665i = m115951g;
        C0058AG<List<String>> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<List<String>>()");
        this.f10666j = m115951g2;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C0058AG<List<WireSkuScanItem>> m115950h = C0058AG.m115950h(emptyList);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault<List<WireSkuScanItem>>(emptyList())");
        this.f10667k = m115950h;
        C0058AG<WireSkuOrder> m115951g3 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g3, "create<WireSkuOrder>()");
        this.f10668l = m115951g3;
    }

    /* renamed from: R */
    public static final InterfaceC23447K m106096R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m106095T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m106094U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m106093V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final Pair m106092W(Function3 tmp0, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2, obj3);
    }

    /* renamed from: X */
    public static final Pair m106091X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m106090Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m106089Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m106088a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m106087b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m106086c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final List m106085d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m106084e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m106083f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final Integer m106082f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Integer) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m106081g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m106080h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m106079i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final void m106078j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final InterfaceC24574u m106077k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final Pair m106076l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final InterfaceC23447K m106075m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m106074n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final boolean m106072o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w0 */
    public static final void m106057w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m106055x0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* renamed from: y0 */
    public static final void m106053y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m106051z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public Observable<BulkScanItemResponse> mo74203Q(Observable<Pair<String, Boolean>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable m31950a = C24527f.m31950a(observable, this.f10665i);
        final C2561a c2561a = new C2561a();
        Observable<BulkScanItemResponse> flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: uz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106096R;
                m106096R = C33011Fz3.m106096R(Function1.this, obj);
                return m106096R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "open fun Observable<Pair…  .progress()\n      }\n  }");
        return flatMapSingle;
    }

    @Override // p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: S */
    public void consume(InterfaceC34181Kz3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C33011Fz3) renderer);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f10664h.m82627f4(), this.f10664h.m82691Z5(), C2562b.f10685a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2565e c2565e = new C2565e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106083f(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(renderer.mo56462o3(), renderer.mo56460s0(), C2563c.f10686a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        final C2579p c2579p = new C2579p();
        Observable flatMapSingle = combineLatest2.flatMapSingle(new InterfaceC23492o() { // from class: hz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106095T;
                m106095T = C33011Fz3.m106095T(Function1.this, obj);
                return m106095T;
            }
        });
        final C2588v c2588v = new C2588v(this);
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: lz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106084e0(Function1.this, obj);
            }
        }).retry(3L);
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2589w c2589w = new C2589w();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: mz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106079i0(Function1.this, obj);
            }
        });
        Observable combineLatest3 = Observable.combineLatest(this.f10668l, this.f10665i, this.f10666j, C2564d.f10687a);
        Intrinsics.checkNotNullExpressionValue(combineLatest3, "combineLatest(source1, s… -> Triple(t1, t2, t3) })");
        Object m33094as3 = combineLatest3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2590x c2590x = new C2590x();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: nz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106078j0(Function1.this, obj);
            }
        });
        Observable m31949b = C24527f.m31949b(renderer.mo54815T(), this.f10668l, this.f10665i);
        final C2592y c2592y = new C2592y();
        Observable flatMapMaybe = m31949b.flatMapMaybe(new InterfaceC23492o() { // from class: pz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m106077k0;
                m106077k0 = C33011Fz3.m106077k0(Function1.this, obj);
                return m106077k0;
            }
        });
        final C2594z c2594z = C2594z.f10715g;
        Observable map = flatMapMaybe.map(new InterfaceC23492o() { // from class: qz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m106076l0;
                m106076l0 = C33011Fz3.m106076l0(Function1.this, obj);
                return m106076l0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun consume(ren…{ navigator.close() }\n  }");
        Observable m31950a = C24527f.m31950a(map, renderer.mo56472a0());
        final C2548A c2548a = new C2548A();
        Observable flatMapSingle2 = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: rz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106075m0;
                m106075m0 = C33011Fz3.m106075m0(Function1.this, obj);
                return m106075m0;
            }
        });
        final C2550B c2550b = new C2550B();
        Observable<Pair<WireSkuScanItem, WireSkuOrder>> doOnNext = flatMapSingle2.doOnNext(new InterfaceC23484g() { // from class: sz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106074n0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…{ navigator.close() }\n  }");
        Observable<Pair<WireSkuScanItem, WireSkuOrder>> mo74200t0 = mo74200t0(doOnNext);
        final C2567f c2567f = C2567f.f10691g;
        Observable<Pair<WireSkuScanItem, WireSkuOrder>> filter = mo74200t0.filter(new InterfaceC23494q() { // from class: tz3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m106072o0;
                m106072o0 = C33011Fz3.m106072o0(Function1.this, obj);
                return m106072o0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "override fun consume(ren…{ navigator.close() }\n  }");
        Observable m31950a2 = C24527f.m31950a(filter, this.f10665i);
        final C2568g c2568g = new C2568g(this);
        Observable retry2 = m31950a2.doOnError(new InterfaceC23484g() { // from class: yz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106094U(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2569h c2569h = new C2569h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: zz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106093V(Function1.this, obj);
            }
        });
        Observable<Unit> mo56429I = renderer.mo56429I();
        Observable<String> mo56460s0 = renderer.mo56460s0();
        Observable<Boolean> mo56472a0 = renderer.mo56472a0();
        final C2571i c2571i = C2571i.f10694g;
        Observable<Pair<String, Boolean>> combineLatest4 = Observable.combineLatest(mo56429I, mo56460s0, mo56472a0, new InterfaceC23485h() { // from class: Az3
            @Override // io.reactivex.functions.InterfaceC23485h
            public final Object apply(Object obj, Object obj2, Object obj3) {
                Pair m106092W;
                m106092W = C33011Fz3.m106092W(Function3.this, obj, obj2, obj3);
                return m106092W;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest4, "combineLatest(\n      ren…Id to serviceCenterScan }");
        Observable m31950a3 = C24527f.m31950a(mo74203Q(combineLatest4), this.f10666j);
        final C2572j c2572j = C2572j.f10695g;
        Observable map2 = m31950a3.map(new InterfaceC23492o() { // from class: Bz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m106091X;
                m106091X = C33011Fz3.m106091X(Function1.this, obj);
                return m106091X;
            }
        });
        final C2573k c2573k = new C2573k(this);
        Observable retry3 = map2.doOnError(new InterfaceC23484g() { // from class: Cz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106090Y(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "combineLatest(\n      ren…::onError)\n      .retry()");
        Object m33094as5 = retry3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2574l c2574l = new C2574l();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Dz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106089Z(Function1.this, obj);
            }
        });
        Observable m31949b2 = C24527f.m31949b(renderer.mo56476A1(), this.f10665i, this.f10666j);
        final C2575m c2575m = new C2575m();
        Observable flatMapSingle3 = m31949b2.flatMapSingle(new InterfaceC23492o() { // from class: Ez3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m106088a0;
                m106088a0 = C33011Fz3.m106088a0(Function1.this, obj);
                return m106088a0;
            }
        });
        final C2577n c2577n = new C2577n(this);
        Observable retry4 = flatMapSingle3.doOnError(new InterfaceC23484g() { // from class: ez3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106087b0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry4, "override fun consume(ren…{ navigator.close() }\n  }");
        Object m33094as6 = retry4.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2578o c2578o = new C2578o();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: fz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106086c0(Function1.this, obj);
            }
        });
        Observable m31950a4 = C24527f.m31950a(renderer.mo56475V(), this.f10665i);
        final C2582q c2582q = C2582q.f10702g;
        Observable map3 = m31950a4.map(new InterfaceC23492o() { // from class: gz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m106085d0;
                m106085d0 = C33011Fz3.m106085d0(Function1.this, obj);
                return m106085d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "renderer.undoDeleteClick…scannedItems + undoItem }");
        Object m33094as7 = map3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as7).subscribe(this.f10665i);
        renderer.mo56457y2(new C2583r());
        Observable m31949b3 = C24527f.m31949b(renderer.mo56456z1(), this.f10665i, this.f10666j);
        final C2584s c2584s = C2584s.f10704g;
        Observable map4 = m31949b3.map(new InterfaceC23492o() { // from class: iz3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Integer m106082f0;
                m106082f0 = C33011Fz3.m106082f0(Function1.this, obj);
                return m106082f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "renderer.backPresses()\n … successIds).size\n      }");
        Object m33094as8 = map4.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2585t c2585t = new C2585t();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: jz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106081g0(Function1.this, obj);
            }
        });
        Object m33094as9 = renderer.mo56474W().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2587u c2587u = new C2587u();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: kz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106080h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: p0 */
    public final InterfaceC40099e13 m106070p0() {
        return this.f10663g;
    }

    /* renamed from: q0 */
    public final C36207Tq4 m106068q0() {
        return this.f10664h;
    }

    /* renamed from: r0 */
    public final O86 m106066r0() {
        return this.f10662f;
    }

    /* renamed from: s0 */
    public final void m106064s0(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        C41318g46.m40159e(e);
        m42279i(new C2552C(e));
    }

    /* renamed from: t0 */
    public Observable<Pair<WireSkuScanItem, WireSkuOrder>> mo74200t0(Observable<Pair<WireSkuScanItem, WireSkuOrder>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return observable;
    }

    /* renamed from: u0 */
    public final AbstractC23461c m106061u0(AbstractC23461c abstractC23461c) {
        Intrinsics.checkNotNullParameter(abstractC23461c, "<this>");
        final C2557F c2557f = new C2557F();
        AbstractC23461c m33081E = abstractC23461c.m33081E(new InterfaceC23484g() { // from class: vz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106053y0(Function1.this, obj);
            }
        });
        final C2559G c2559g = new C2559G();
        AbstractC23461c m33083C = m33081E.m33083C(new InterfaceC23484g() { // from class: wz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106051z0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33083C, "protected fun Completabl…oading - 1) }\n      }\n  }");
        return m33083C;
    }

    /* renamed from: v0 */
    public final <T> AbstractC23442F<T> m106059v0(AbstractC23442F<T> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C2553D c2553d = new C2553D();
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: dz3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33011Fz3.m106057w0(Function1.this, obj);
            }
        });
        final C2555E c2555e = new C2555E();
        AbstractC23442F<T> m33104u = m33102v.m33104u(new InterfaceC23479b() { // from class: oz3
            @Override // io.reactivex.functions.InterfaceC23479b
            public final void accept(Object obj, Object obj2) {
                C33011Fz3.m106055x0(Function2.this, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33104u, "protected fun <T>Single<…oading - 1) }\n      }\n  }");
        return m33104u;
    }
}
