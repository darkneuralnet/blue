package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ContainerOrderStatus;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52660zC5;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LzC5;", "", "", "n", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "LCC5;", C17296a.f69688o, "LCC5;", "ui", "LlC5;", "b", "LlC5;", "converter", "Le13;", "c", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "e", "LO86;", "transferOrderManager", "", "f", "Ljava/lang/String;", "skuId", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/a;", "skuOrderSubject", "<init>", "(LCC5;LlC5;Le13;Lcom/uber/autodispose/ScopeProvider;LO86;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/SkuOrderDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,144:1\n199#2:145\n180#2:146\n180#2:147\n180#2:148\n180#2:149\n180#2:150\n*S KotlinDebug\n*F\n+ 1 SkuOrderDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/SkuOrderDetailsPresenter\n*L\n38#1:145\n57#1:146\n83#1:147\n118#1:148\n122#1:149\n127#1:150\n*E\n"})
/* renamed from: zC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52660zC5 {

    /* renamed from: a */
    public final CC5 f120954a;

    /* renamed from: b */
    public final C44360lC5 f120955b;

    /* renamed from: c */
    public final InterfaceC40099e13 f120956c;

    /* renamed from: d */
    public final ScopeProvider f120957d;

    /* renamed from: e */
    public final O86 f120958e;

    /* renamed from: f */
    public final String f120959f;

    /* renamed from: g */
    public final C24552a<WireSkuOrder> f120960g;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireTransferOrder;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$a */
    /* loaded from: classes3.dex */
    public static final class C30931a extends Lambda implements Function1<Pair<? extends String, ? extends WireSkuOrder>, InterfaceC23447K<? extends WireTransferOrder>> {
        public C30931a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireTransferOrder> invoke(Pair<String, WireSkuOrder> pair) {
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String code = pair.component1();
            O86 o86 = C52660zC5.this.f120958e;
            WireTransferOrderLineItem transferOrderLineItem = pair.component2().getTransferOrderLineItem();
            String str = (transferOrderLineItem == null || (transferOrder = transferOrderLineItem.getTransferOrder()) == null || (str = transferOrder.getId()) == null) ? "" : "";
            Intrinsics.checkNotNullExpressionValue(code, "code");
            return C28237sD.progress$default(o86.mo80303b(str, code), C52660zC5.this.f120954a, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrder;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTransferOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$b */
    /* loaded from: classes3.dex */
    public static final class C30932b extends Lambda implements Function1<WireTransferOrder, InterfaceC23447K<? extends WireSkuOrder>> {
        public C30932b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireSkuOrder> invoke(WireTransferOrder it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52660zC5.this.f120958e.mo80296h(C52660zC5.this.f120959f);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zC5$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30933c extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C30933c(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToSkuOrderVehicles", "goToSkuOrderVehicles(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo37203A0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zC5$d */
    /* loaded from: classes3.dex */
    public static final class C30934d extends Lambda implements Function1<Pair<? extends Unit, ? extends WireSkuOrder>, Unit> {
        public C30934d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends WireSkuOrder> pair) {
            invoke2((Pair<Unit, WireSkuOrder>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, WireSkuOrder> pair) {
            C52660zC5.this.f120956c.mo36958q3(pair.component2().getContainerOrderId(), 10060);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zC5$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30935e extends FunctionReferenceImpl implements Function1<WireSkuOrder, Unit> {
        public C30935e(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m1640a(WireSkuOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuOrder wireSkuOrder) {
            m1640a(wireSkuOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zC5$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30936f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30936f(Object obj) {
            super(1, obj, CC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u000b\u001aò\u0001\u0012r\b\u0001\u0012n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n \u0002*6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u0006 \u0002*x\u0012r\b\u0001\u0012n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n \u0002*6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LRe4;", "", "LH6;", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$g */
    /* loaded from: classes3.dex */
    public static final class C30937g extends Lambda implements Function1<Pair<? extends WireSkuScannedItems, ? extends WireSkuOrder>, InterfaceC23447K<? extends C35631Re4<? extends List<? extends C3023H6>, ? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>, ? extends Boolean, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001an\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007 \u0005*6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "LH6;", "it", "LRe4;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "", C17296a.f69688o, "(Ljava/util/List;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: zC5$g$a */
        /* loaded from: classes3.dex */
        public static final class C30938a extends Lambda implements Function1<List<? extends C3023H6>, C35631Re4<? extends List<? extends C3023H6>, ? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>, ? extends Boolean, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f120965g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuScannedItems f120966h;

            /* renamed from: i */
            public final /* synthetic */ boolean f120967i;

            /* renamed from: j */
            public final /* synthetic */ boolean f120968j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30938a(WireSkuOrder wireSkuOrder, WireSkuScannedItems wireSkuScannedItems, boolean z, boolean z2) {
                super(1);
                this.f120965g = wireSkuOrder;
                this.f120966h = wireSkuScannedItems;
                this.f120967i = z;
                this.f120968j = z2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C35631Re4<List<C3023H6>, WireSkuOrder, List<WireSuccessfulScannedItem>, Boolean, Boolean> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C35631Re4<>(it, this.f120965g, this.f120966h.getSuccessfulScannedItems(), Boolean.valueOf(this.f120967i), Boolean.valueOf(this.f120968j));
            }
        }

        public C30937g() {
            super(1);
        }

        /* renamed from: c */
        public static final C35631Re4 m1637c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C35631Re4) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
            if (r7.getStatus().isClosed() == false) goto L7;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends C35631Re4<List<C3023H6>, WireSkuOrder, List<WireSuccessfulScannedItem>, Boolean, Boolean>> invoke(Pair<WireSkuScannedItems, WireSkuOrder> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScannedItems component1 = pair.component1();
            WireSkuOrder wireSkuOrder = pair.component2();
            O86 o86 = C52660zC5.this.f120958e;
            Intrinsics.checkNotNullExpressionValue(wireSkuOrder, "wireSkuOrder");
            boolean mo80301d = o86.mo80301d(wireSkuOrder);
            boolean mo80285q = C52660zC5.this.f120958e.mo80285q(wireSkuOrder);
            if (!mo80285q) {
                z = true;
                if (!component1.getSuccessfulScannedItems().isEmpty()) {
                }
            }
            z = false;
            AbstractC23442F<List<C3023H6>> m27679b = C52660zC5.this.f120955b.m27679b(wireSkuOrder, component1.getSuccessfulScannedItems(), mo80285q, mo80301d);
            final C30938a c30938a = new C30938a(wireSkuOrder, component1, mo80301d, z);
            return m27679b.m33157I(new InterfaceC23492o() { // from class: AC5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C35631Re4 m1637c;
                    m1637c = C52660zC5.C30937g.m1637c(Function1.this, obj);
                    return m1637c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2r\u0010\u0007\u001an\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006 \u0004*6\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"LRe4;", "", "LH6;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LRe4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$h */
    /* loaded from: classes3.dex */
    public static final class C30939h extends Lambda implements Function1<C35631Re4<? extends List<? extends C3023H6>, ? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>, ? extends Boolean, ? extends Boolean>, Unit> {
        public C30939h() {
            super(1);
        }

        /* renamed from: a */
        public final void m1635a(C35631Re4<? extends List<C3023H6>, WireSkuOrder, ? extends List<WireSuccessfulScannedItem>, Boolean, Boolean> c35631Re4) {
            TransferOrderDemandSource transferOrderDemandSource;
            boolean z;
            WireTransferOrder transferOrder;
            List<C3023H6> sections = c35631Re4.m86500a();
            WireSkuOrder skuOrder = c35631Re4.m86499b();
            List<WireSuccessfulScannedItem> m86498c = c35631Re4.m86498c();
            boolean booleanValue = c35631Re4.m86497d().booleanValue();
            boolean booleanValue2 = c35631Re4.m86496e().booleanValue();
            CC5 cc5 = C52660zC5.this.f120954a;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            cc5.m112637b(sections);
            C52660zC5.this.f120954a.m112642Wl(booleanValue);
            C52660zC5.this.f120954a.m112641Xl(booleanValue2);
            O86 o86 = C52660zC5.this.f120958e;
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            boolean mo80285q = o86.mo80285q(skuOrder);
            WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
            ContainerOrderStatus containerOrderStatus = null;
            if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            if (transferOrderDemandSource == TransferOrderDemandSource.SCRAP_REMOVAL) {
                CC5 cc52 = C52660zC5.this.f120954a;
                boolean isEmpty = m86498c.isEmpty();
                boolean z2 = true;
                boolean z3 = !isEmpty;
                WireContainerOrder containerOrder = skuOrder.getContainerOrder();
                if (containerOrder != null && containerOrder.getBooked()) {
                    z = true;
                } else {
                    z = false;
                }
                WireContainerOrder containerOrder2 = skuOrder.getContainerOrder();
                if (containerOrder2 != null) {
                    containerOrderStatus = containerOrder2.getStatus();
                }
                if (containerOrderStatus == ContainerOrderStatus.RECEIVED) {
                    z2 = false;
                }
                cc52.m112643Vl(z3, z, z2);
            } else if (mo80285q) {
                C52660zC5.this.f120954a.m112644Ul();
            } else {
                C52660zC5.this.f120954a.m112645Tl();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35631Re4<? extends List<? extends C3023H6>, ? extends WireSkuOrder, ? extends List<? extends WireSuccessfulScannedItem>, ? extends Boolean, ? extends Boolean> c35631Re4) {
            m1635a(c35631Re4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zC5$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30940i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C30940i(Object obj) {
            super(1, obj, CC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$j */
    /* loaded from: classes3.dex */
    public static final class C30941j extends Lambda implements Function1<Unit, InterfaceC23434B<? extends WireSkuOrder>> {
        public C30941j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireSkuOrder> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52660zC5.this.f120960g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "skuOrder", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuOrder;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$k */
    /* loaded from: classes3.dex */
    public static final class C30942k extends Lambda implements Function1<WireSkuOrder, Unit> {
        public C30942k() {
            super(1);
        }

        /* renamed from: a */
        public final void m1634a(WireSkuOrder skuOrder) {
            TransferOrderDemandSource transferOrderDemandSource;
            WireTransferOrder transferOrder;
            WireTransferOrderLineItem transferOrderLineItem = skuOrder.getTransferOrderLineItem();
            if (transferOrderLineItem != null && (transferOrder = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            if (transferOrderDemandSource == TransferOrderDemandSource.SCRAP_REMOVAL) {
                C52660zC5.this.f120956c.mo36950s(C52660zC5.this.f120959f, 10058);
                return;
            }
            InterfaceC40099e13 interfaceC40099e13 = C52660zC5.this.f120956c;
            String str = C52660zC5.this.f120959f;
            O86 o86 = C52660zC5.this.f120958e;
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            interfaceC40099e13.mo37131M0(str, o86.mo80285q(skuOrder));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuOrder wireSkuOrder) {
            m1634a(wireSkuOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$l */
    /* loaded from: classes3.dex */
    public static final class C30943l extends Lambda implements Function1<Pair<? extends Unit, ? extends WireSkuOrder>, InterfaceC23447K<? extends List<? extends WireTransferOrderClosedIncompleteReason>>> {
        public C30943l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireTransferOrderClosedIncompleteReason>> invoke(Pair<Unit, WireSkuOrder> pair) {
            WireTransferOrder transferOrder;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            O86 o86 = C52660zC5.this.f120958e;
            WireTransferOrderLineItem transferOrderLineItem = pair.component2().getTransferOrderLineItem();
            return C28237sD.progress$default(o86.mo80282t((transferOrderLineItem == null || (transferOrder = transferOrderLineItem.getTransferOrder()) == null || (r5 = transferOrder.getId()) == null) ? "" : ""), C52660zC5.this.f120954a, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reasons", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zC5$m */
    /* loaded from: classes3.dex */
    public static final class C30944m extends Lambda implements Function1<List<? extends WireTransferOrderClosedIncompleteReason>, InterfaceC23447K<? extends String>> {
        public C30944m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends String> invoke(List<WireTransferOrderClosedIncompleteReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            return C52660zC5.this.f120954a.m112640Yl(reasons);
        }
    }

    public C52660zC5(CC5 ui, C44360lC5 converter, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, O86 transferOrderManager, String skuId) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        this.f120954a = ui;
        this.f120955b = converter;
        this.f120956c = navigator;
        this.f120957d = scopeProvider;
        this.f120958e = transferOrderManager;
        this.f120959f = skuId;
        C24552a<WireSkuOrder> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireSkuOrder>()");
        this.f120960g = m31922e;
    }

    /* renamed from: A */
    public static final InterfaceC23447K m1671A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m1654o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m1653p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m1652q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m1651r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m1650s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m1649t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m1648u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m1647v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23434B m1646w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m1645x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m1644y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23447K m1643z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final void m1670B() {
        this.f120956c.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, new Pair[0]);
    }

    /* renamed from: C */
    public final void m1669C() {
        this.f120956c.close();
    }

    /* renamed from: n */
    public final void m1655n() {
        AbstractC23442F<WireSkuOrder> m33146T = this.f120958e.mo80296h(this.f120959f).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "transferOrderManager.get…Id(skuId)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30935e c30935e = new C30935e(this.f120960g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: mC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1654o(Function1.this, obj);
            }
        };
        final C30936f c30936f = new C30936f(this.f120954a);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: tC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1653p(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Observable<WireSkuScannedItems> m33123k0 = this.f120958e.mo80279w(this.f120959f).m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "transferOrderManager.get…ems(skuId).toObservable()");
        Observable m31956a = c24523e.m31956a(m33123k0, this.f120960g);
        final C30937g c30937g = new C30937g();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: uC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1649t;
                m1649t = C52660zC5.m1649t(Function1.this, obj);
                return m1649t;
            }
        }).retry(3L).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    tra…DER\n        )\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30939h c30939h = new C30939h();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: vC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1648u(Function1.this, obj);
            }
        };
        final C30940i c30940i = new C30940i(this.f120954a);
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: wC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1647v(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f120954a.m112638am(), this.f120954a.m112647Rl());
        final C30941j c30941j = new C30941j();
        Observable observeOn2 = merge.flatMap(new InterfaceC23492o() { // from class: xC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m1646w;
                m1646w = C52660zC5.m1646w(Function1.this, obj);
                return m1646w;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    tra…DER\n        )\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30942k c30942k = new C30942k();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1645x(Function1.this, obj);
            }
        });
        Observable m31950a = C24527f.m31950a(this.f120954a.m112646Sl(), this.f120960g);
        final C30943l c30943l = new C30943l();
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: nC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1644y;
                m1644y = C52660zC5.m1644y(Function1.this, obj);
                return m1644y;
            }
        });
        final C30944m c30944m = new C30944m();
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: oC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1643z;
                m1643z = C52660zC5.m1643z(Function1.this, obj);
                return m1643z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "fun onResume() {\n    tra…DER\n        )\n      }\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle2, this.f120960g);
        final C30931a c30931a = new C30931a();
        Observable flatMapSingle3 = m31950a2.flatMapSingle(new InterfaceC23492o() { // from class: pC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1671A;
                m1671A = C52660zC5.m1671A(Function1.this, obj);
                return m1671A;
            }
        });
        final C30932b c30932b = new C30932b();
        Observable flatMapSingle4 = flatMapSingle3.flatMapSingle(new InterfaceC23492o() { // from class: qC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m1652q;
                m1652q = C52660zC5.m1652q(Function1.this, obj);
                return m1652q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle4, "fun onResume() {\n    tra…DER\n        )\n      }\n  }");
        Observable retry = C38689bg5.m64176e(flatMapSingle4, this.f120954a).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    tra…DER\n        )\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe(this.f120960g);
        Object m33094as4 = this.f120954a.m112636bm().m33094as(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30933c c30933c = new C30933c(this.f120956c);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: rC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1651r(Function1.this, obj);
            }
        });
        Object m33094as5 = C24527f.m31950a(this.f120954a.m112648Ql(), this.f120960g).m33094as(AutoDispose.m45239a(this.f120957d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30934d c30934d = new C30934d();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: sC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52660zC5.m1650s(Function1.this, obj);
            }
        });
    }
}
