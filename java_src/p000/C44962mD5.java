package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.ScannerMode;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireFailedScannedItem;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScanItemKt;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C44962mD5;
import p000.InterfaceC40099e13;
import p000.O86;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0001\bBo\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010'\u001a\u00020\u0004\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010+\u001a\u00020\u001f¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00104\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u000102020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u0006;"}, m28432d2 = {"LmD5;", "", "", "p", "", "rawScan", "A", "LTC5;", C17296a.f69688o, "LTC5;", "ui", "LL92;", "b", "LL92;", "converter", "Le13;", "c", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO86;", "e", "LO86;", "transferOrderManager", "LN92;", "f", "LN92;", "inventoryScanningUiDelegate", "", "g", "Z", "itemCheckedIn", "h", "Ljava/lang/String;", "skuModel", "i", "skuOrderId", "j", "title", "k", "viewUnidentified", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "l", "Lio/reactivex/subjects/d;", "skuOrderSubject", "Lco/bird/android/model/wire/WireSkuScannedItems;", "m", "itemsScannedSubject", "n", "Lco/bird/android/model/wire/WireSkuScannedItems;", "latestScanned", "<init>", "(LTC5;LL92;Le13;Lcom/uber/autodispose/ScopeProvider;LO86;LN92;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "o", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuScannerDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannerDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannerDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,197:1\n199#2:198\n199#2:199\n180#2:200\n180#2:201\n180#2:202\n199#2:203\n*S KotlinDebug\n*F\n+ 1 SkuScannerDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannerDetailsPresenter\n*L\n70#1:198\n75#1:199\n93#1:200\n119#1:201\n131#1:202\n191#1:203\n*E\n"})
/* renamed from: mD5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44962mD5 {

    /* renamed from: o */
    public static final C25994a f97636o = new C25994a(null);

    /* renamed from: p */
    public static final Set<TransferOrderDemandSource> f97637p;

    /* renamed from: a */
    public final TC5 f97638a;

    /* renamed from: b */
    public final L92 f97639b;

    /* renamed from: c */
    public final InterfaceC40099e13 f97640c;

    /* renamed from: d */
    public final ScopeProvider f97641d;

    /* renamed from: e */
    public final O86 f97642e;

    /* renamed from: f */
    public final N92 f97643f;

    /* renamed from: g */
    public final boolean f97644g;

    /* renamed from: h */
    public final String f97645h;

    /* renamed from: i */
    public final String f97646i;

    /* renamed from: j */
    public final String f97647j;

    /* renamed from: k */
    public final boolean f97648k;

    /* renamed from: l */
    public final C24558d<WireSkuOrder> f97649l;

    /* renamed from: m */
    public final C24558d<WireSkuScannedItems> f97650m;

    /* renamed from: n */
    public WireSkuScannedItems f97651n;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LmD5$a;", "", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "FORCE_SCAN_DEMAND_SOURCES", "Ljava/util/Set;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mD5$a */
    /* loaded from: classes3.dex */
    public static final class C25994a {
        public /* synthetic */ C25994a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25994a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$b */
    /* loaded from: classes3.dex */
    public static final class C25995b extends Lambda implements Function1<String, Unit> {
        public C25995b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            InterfaceC40099e13.C19924a.goToScanCode$default(C44962mD5.this.f97640c, ScannerMode.RAW_SCAN, null, null, null, false, true, true, str, 30, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25996c extends FunctionReferenceImpl implements Function1<WireSkuScannedItems, Unit> {
        public C25996c(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m25966a(WireSkuScannedItems p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m25966a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25997d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C25997d(Object obj) {
            super(1, obj, TC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25998e extends FunctionReferenceImpl implements Function1<WireSkuOrder, Unit> {
        public C25998e(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m25965a(WireSkuOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuOrder wireSkuOrder) {
            m25965a(wireSkuOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25999f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C25999f(Object obj) {
            super(1, obj, TC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\t\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b \u0002*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00000\u0000 \u0002*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b \u0002*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", "", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSkuScannerDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannerDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannerDetailsPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n766#2:198\n857#2,2:199\n*S KotlinDebug\n*F\n+ 1 SkuScannerDetailsPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/details/SkuScannerDetailsPresenter$onResume$5\n*L\n87#1:198\n87#1:199,2\n*E\n"})
    /* renamed from: mD5$g */
    /* loaded from: classes3.dex */
    public static final class C26000g extends Lambda implements Function1<Pair<? extends WireSkuScannedItems, ? extends WireSkuOrder>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Integer>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$g$a */
        /* loaded from: classes3.dex */
        public static final class C26001a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<WireFailedScannedItem> f97654g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26001a(List<WireFailedScannedItem> list) {
                super(1);
                this.f97654g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Integer> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(it, Integer.valueOf(this.f97654g.size()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$g$b */
        /* loaded from: classes3.dex */
        public static final class C26002b extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<WireSuccessfulScannedItem> f97655g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26002b(List<WireSuccessfulScannedItem> list) {
                super(1);
                this.f97655g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Integer> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(it, Integer.valueOf(this.f97655g.size()));
            }
        }

        public C26000g() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Integer>> invoke(Pair<WireSkuScannedItems, WireSkuOrder> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScannedItems scanned = pair.component1();
            WireSkuOrder skuOrder = pair.component2();
            C44962mD5 c44962mD5 = C44962mD5.this;
            Intrinsics.checkNotNullExpressionValue(scanned, "scanned");
            c44962mD5.f97651n = scanned;
            if (C44962mD5.this.f97648k) {
                List<WireFailedScannedItem> failedScannedItems = scanned.getFailedScannedItems();
                AbstractC23442F<List<C3023H6>> m97653c = C44962mD5.this.f97639b.m97653c(failedScannedItems);
                final C26001a c26001a = new C26001a(failedScannedItems);
                return m97653c.m33157I(new InterfaceC23492o() { // from class: nD5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C44962mD5.C26000g.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            C44962mD5 c44962mD52 = C44962mD5.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj : WireSkuScannedItemsKt.filteredItems$default(scanned.getSuccessfulScannedItems(), C44962mD5.this.f97645h, false, 2, null)) {
                if (((WireSuccessfulScannedItem) obj).getReceived() == c44962mD52.f97644g) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            L92 l92 = C44962mD5.this.f97639b;
            boolean z2 = C44962mD5.this.f97644g;
            Intrinsics.checkNotNullExpressionValue(skuOrder, "skuOrder");
            AbstractC23442F<List<C3023H6>> m97651e = l92.m97651e(arrayList, z2, skuOrder);
            final C26002b c26002b = new C26002b(arrayList);
            return m97651e.m33157I(new InterfaceC23492o() { // from class: oD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    Pair invoke$lambda$2;
                    invoke$lambda$2 = C44962mD5.C26000g.invoke$lambda$2(Function1.this, obj2);
                    return invoke$lambda$2;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$h */
    /* loaded from: classes3.dex */
    public static final class C26003h extends Lambda implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Integer>, Unit> {
        public C26003h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Integer> pair) {
            invoke2((Pair<? extends List<C3023H6>, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<C3023H6>, Integer> pair) {
            List<C3023H6> sections = pair.component1();
            int intValue = pair.component2().intValue();
            TC5 tc5 = C44962mD5.this.f97638a;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            tc5.m84211b(sections);
            if (C44962mD5.this.f97648k) {
                C44962mD5.this.f97638a.m84212Ul(intValue);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "itemIdToRemove", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$i */
    /* loaded from: classes3.dex */
    public static final class C26004i extends Lambda implements Function1<String, InterfaceC23447K<? extends WireSkuScannedItems>> {
        public C26004i() {
            super(1);
        }

        /* renamed from: b */
        public static final InterfaceC23447K m25958b(C44962mD5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f97642e.mo80279w(this$0.f97646i);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireSkuScannedItems> invoke(String itemIdToRemove) {
            Intrinsics.checkNotNullParameter(itemIdToRemove, "itemIdToRemove");
            AbstractC23461c mo80292l = C44962mD5.this.f97642e.mo80292l(itemIdToRemove);
            final C44962mD5 c44962mD5 = C44962mD5.this;
            return mo80292l.m33042m(AbstractC23442F.m33124k(new Callable() { // from class: pD5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23447K m25958b;
                    m25958b = C44962mD5.C26004i.m25958b(C44962mD5.this);
                    return m25958b;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$j */
    /* loaded from: classes3.dex */
    public static final class C26005j extends Lambda implements Function1<Throwable, Unit> {
        public C26005j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            TC5 tc5 = C44962mD5.this.f97638a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            tc5.error(it);
            try {
                C24558d c24558d = C44962mD5.this.f97650m;
                WireSkuScannedItems wireSkuScannedItems = C44962mD5.this.f97651n;
                if (wireSkuScannedItems == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("latestScanned");
                    wireSkuScannedItems = null;
                }
                c24558d.onNext(wireSkuScannedItems);
            } catch (Exception e) {
                C41318g46.m40159e(e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$k */
    /* loaded from: classes3.dex */
    public static final class C26006k extends Lambda implements Function1<WireSkuScannedItems, Unit> {
        public C26006k() {
            super(1);
        }

        /* renamed from: a */
        public final void m25957a(WireSkuScannedItems wireSkuScannedItems) {
            if (!WireSkuScannedItemsKt.filteredItems(wireSkuScannedItems.getSuccessfulScannedItems(), C44962mD5.this.f97645h, false).isEmpty()) {
                C44962mD5.this.f97650m.onNext(wireSkuScannedItems);
            } else {
                C44962mD5.this.f97640c.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m25957a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$l */
    /* loaded from: classes3.dex */
    public static final class C26007l extends Lambda implements Function1<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, InterfaceC24574u<? extends WireSkuScanItem>> {

        /* renamed from: h */
        public final /* synthetic */ String f97661h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$l$a */
        /* loaded from: classes3.dex */
        public static final class C26008a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C26008a f97662g = new C26008a();

            public C26008a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$l$b */
        /* loaded from: classes3.dex */
        public static final class C26009b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends WireSkuScanItem>> {

            /* renamed from: g */
            public final /* synthetic */ C44962mD5 f97663g;

            /* renamed from: h */
            public final /* synthetic */ String f97664h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26009b(C44962mD5 c44962mD5, String str) {
                super(1);
                this.f97663g = c44962mD5;
                this.f97664h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends WireSkuScanItem> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return O86.C5908a.scanSkuForSkuOrder$default(this.f97663g.f97642e, true, this.f97663g.f97646i, this.f97664h, true, null, false, true, 48, null).m33125j0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26007l(String str) {
            super(1);
            this.f97661h = str;
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends WireSkuScanItem> invoke(Pair<WireSkuScanItem, WireSkuOrder> pair) {
            TransferOrderDemandSource transferOrderDemandSource;
            boolean contains;
            WireTransferOrder transferOrder;
            WireWarehouse destinationWarehouse;
            WireTransferOrder transferOrder2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScanItem component1 = pair.component1();
            WireSkuOrder component2 = pair.component2();
            Set set = C44962mD5.f97637p;
            WireTransferOrderLineItem transferOrderLineItem = component2.getTransferOrderLineItem();
            InventoryScanningError inventoryScanningError = null;
            if (transferOrderLineItem != null && (transferOrder2 = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder2.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(set, transferOrderDemandSource);
            if (contains) {
                String errorCode = component1.getErrorCode();
                if (errorCode != null) {
                    inventoryScanningError = WireSkuScanItemKt.toInventoryScanningError(errorCode);
                }
                if (inventoryScanningError == InventoryScanningError.ITEM_NOT_IN_SKU_ORDER) {
                    WireTransferOrderLineItem transferOrderLineItem2 = component2.getTransferOrderLineItem();
                    AbstractC23442F<DialogResponse> m94309Pl = C44962mD5.this.f97643f.m94309Pl((transferOrderLineItem2 == null || (transferOrder = transferOrderLineItem2.getTransferOrder()) == null || (destinationWarehouse = transferOrder.getDestinationWarehouse()) == null || (r5 = destinationWarehouse.getName()) == null) ? "" : "");
                    final C26008a c26008a = C26008a.f97662g;
                    AbstractC24507p<DialogResponse> m33098z = m94309Pl.m33098z(new InterfaceC23494q() { // from class: qD5
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj) {
                            boolean invoke$lambda$0;
                            invoke$lambda$0 = C44962mD5.C26007l.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                    final C26009b c26009b = new C26009b(C44962mD5.this, this.f97661h);
                    return m33098z.m32021x(new InterfaceC23492o() { // from class: rD5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u invoke$lambda$1;
                            invoke$lambda$1 = C44962mD5.C26007l.invoke$lambda$1(Function1.this, obj);
                            return invoke$lambda$1;
                        }
                    });
                }
            }
            return AbstractC24507p.m32068G(component1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "skuScanResponse", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireSkuScanItem;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$m */
    /* loaded from: classes3.dex */
    public static final class C26010m extends Lambda implements Function1<WireSkuScanItem, InterfaceC24574u<? extends WireSkuScanItem>> {

        /* renamed from: h */
        public final /* synthetic */ String f97666h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lco/bird/android/model/wire/WireSkuScanItem;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$m$a */
        /* loaded from: classes3.dex */
        public static final class C26011a extends Lambda implements Function1<DialogResponse, WireSkuScanItem> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuScanItem f97667g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26011a(WireSkuScanItem wireSkuScanItem) {
                super(1);
                this.f97667g = wireSkuScanItem;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WireSkuScanItem invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f97667g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26010m(String str) {
            super(1);
            this.f97666h = str;
        }

        /* renamed from: c */
        public static final WireSkuScanItem m25949c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WireSkuScanItem) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends WireSkuScanItem> invoke(WireSkuScanItem skuScanResponse) {
            Intrinsics.checkNotNullParameter(skuScanResponse, "skuScanResponse");
            AbstractC23442F<DialogResponse> m94307Rl = C44962mD5.this.f97643f.m94307Rl(this.f97666h, skuScanResponse.getErrorCode());
            final C26011a c26011a = new C26011a(skuScanResponse);
            return m94307Rl.m33157I(new InterfaceC23492o() { // from class: sD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WireSkuScanItem m25949c;
                    m25949c = C44962mD5.C26010m.m25949c(Function1.this, obj);
                    return m25949c;
                }
            }).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "skuScanResponse", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/wire/WireSkuScanItem;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mD5$n */
    /* loaded from: classes3.dex */
    public static final class C26012n extends Lambda implements Function1<WireSkuScanItem, InterfaceC23447K<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "scannedItems", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$n$a */
        /* loaded from: classes3.dex */
        public static final class C26013a extends Lambda implements Function1<WireSkuScannedItems, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C44962mD5 f97669g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26013a(C44962mD5 c44962mD5) {
                super(1);
                this.f97669g = c44962mD5;
            }

            /* renamed from: a */
            public final void m25943a(WireSkuScannedItems wireSkuScannedItems) {
                this.f97669g.f97650m.onNext(wireSkuScannedItems);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
                m25943a(wireSkuScannedItems);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mD5$n$b */
        /* loaded from: classes3.dex */
        public static final class C26014b extends Lambda implements Function1<WireSkuScannedItems, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuScanItem f97670g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26014b(WireSkuScanItem wireSkuScanItem) {
                super(1);
                this.f97670g = wireSkuScanItem;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(WireSkuScannedItems it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f97670g.getErrorCode() == null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C26012n() {
            super(1);
        }

        /* renamed from: d */
        public static final Boolean m25944d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Boolean> invoke(WireSkuScanItem skuScanResponse) {
            Intrinsics.checkNotNullParameter(skuScanResponse, "skuScanResponse");
            AbstractC23442F<WireSkuScannedItems> mo80279w = C44962mD5.this.f97642e.mo80279w(C44962mD5.this.f97646i);
            final C26013a c26013a = new C26013a(C44962mD5.this);
            AbstractC23442F<WireSkuScannedItems> m33101w = mo80279w.m33101w(new InterfaceC23484g() { // from class: tD5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44962mD5.C26012n.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C26014b c26014b = new C26014b(skuScanResponse);
            return m33101w.m33157I(new InterfaceC23492o() { // from class: uD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m25944d;
                    m25944d = C44962mD5.C26012n.m25944d(Function1.this, obj);
                    return m25944d;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26015o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C26015o(Object obj) {
            super(1, obj, TC5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TC5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mD5$p */
    /* loaded from: classes3.dex */
    public static final class C26016p extends Lambda implements Function1<Boolean, Unit> {
        public C26016p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean success) {
            Intrinsics.checkNotNullExpressionValue(success, "success");
            if (success.booleanValue()) {
                C44962mD5.this.f97638a.vibrate(500L);
            }
        }
    }

    static {
        Set<TransferOrderDemandSource> of;
        of = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FROM_3PL_DELIVERY, TransferOrderDemandSource.FM_LONGTAIL_RETURN});
        f97637p = of;
    }

    public C44962mD5(TC5 ui, L92 converter, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, O86 transferOrderManager, N92 inventoryScanningUiDelegate, boolean z, String str, String skuOrderId, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(inventoryScanningUiDelegate, "inventoryScanningUiDelegate");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        this.f97638a = ui;
        this.f97639b = converter;
        this.f97640c = navigator;
        this.f97641d = scopeProvider;
        this.f97642e = transferOrderManager;
        this.f97643f = inventoryScanningUiDelegate;
        this.f97644g = z;
        this.f97645h = str;
        this.f97646i = skuOrderId;
        this.f97647j = str2;
        this.f97648k = z2;
        C24558d<WireSkuOrder> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireSkuOrder>()");
        this.f97649l = m31902e;
        C24558d<WireSkuScannedItems> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireSkuScannedItems>()");
        this.f97650m = m31902e2;
    }

    /* renamed from: B */
    public static final InterfaceC24574u m25997B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC24574u m25996C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23447K m25995D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m25994E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m25993F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m25976q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m25975r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m25974s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m25973t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m25972u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m25971v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m25970w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m25969x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m25968y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m25967z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m25998A(String rawScan) {
        Intrinsics.checkNotNullParameter(rawScan, "rawScan");
        AbstractC23442F m33152N = C37279Yf5.m74531s0(O86.C5908a.scanSkuForSkuOrder$default(this.f97642e, true, this.f97646i, rawScan, true, rawScan, false, false, 96, null), this.f97649l).m33152N(C23454a.m33087a());
        final C26007l c26007l = new C26007l(rawScan);
        AbstractC24507p m33163C = m33152N.m33163C(new InterfaceC23492o() { // from class: XC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m25997B;
                m25997B = C44962mD5.m25997B(Function1.this, obj);
                return m25997B;
            }
        });
        final C26010m c26010m = new C26010m(rawScan);
        AbstractC24507p m32066I = m33163C.m32021x(new InterfaceC23492o() { // from class: dD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m25996C;
                m25996C = C44962mD5.m25996C(Function1.this, obj);
                return m25996C;
            }
        }).m32066I(C24542a.m31932c());
        final C26012n c26012n = new C26012n();
        AbstractC23442F m32072C = m32066I.m32072C(new InterfaceC23492o() { // from class: eD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m25995D;
                m25995D = C44962mD5.m25995D(Function1.this, obj);
                return m25995D;
            }
        });
        final C26015o c26015o = new C26015o(this.f97638a);
        AbstractC23442F m33152N2 = m32072C.m33106t(new InterfaceC23484g() { // from class: fD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25994E(Function1.this, obj);
            }
        }).m33147S().m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "fun onVehicleScanned(raw…TIC_DELAY_MS)\n      }\n  }");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26016p c26016p = new C26016p();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: gD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25993F(Function1.this, obj);
            }
        });
    }

    /* renamed from: p */
    public final void m25977p() {
        if (this.f97648k) {
            this.f97638a.m84212Ul(0);
        } else {
            this.f97638a.m84213Tl(this.f97647j);
        }
        AbstractC23442F<WireSkuScannedItems> m33146T = this.f97642e.mo80279w(this.f97646i).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T, "transferOrderManager.get…uOrderId)\n      .retry(3)");
        Object m33135e = m33146T.m33135e(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25996c c25996c = new C25996c(this.f97650m);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25976q(Function1.this, obj);
            }
        };
        final C25997d c25997d = new C25997d(this.f97638a);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25975r(Function1.this, obj);
            }
        });
        AbstractC23442F<WireSkuOrder> m33146T2 = this.f97642e.mo80296h(this.f97646i).m33146T(3L);
        Intrinsics.checkNotNullExpressionValue(m33146T2, "transferOrderManager.get…uOrderId)\n      .retry(3)");
        Object m33135e2 = m33146T2.m33135e(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25998e c25998e = new C25998e(this.f97649l);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: jD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25974s(Function1.this, obj);
            }
        };
        final C25999f c25999f = new C25999f(this.f97638a);
        ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: kD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25973t(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(this.f97650m, this.f97649l);
        final C26000g c26000g = new C26000g();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: lD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m25972u;
                m25972u = C44962mD5.m25972u(Function1.this, obj);
                return m25972u;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    if …it,\n        )\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26003h c26003h = new C26003h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: YC5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25971v(Function1.this, obj);
            }
        });
        Observable<String> m84216Ql = this.f97638a.m84216Ql();
        final C26004i c26004i = new C26004i();
        Observable<R> flatMapSingle = m84216Ql.flatMapSingle(new InterfaceC23492o() { // from class: ZC5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m25970w;
                m25970w = C44962mD5.m25970w(Function1.this, obj);
                return m25970w;
            }
        });
        final C26005j c26005j = new C26005j();
        Observable retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: aD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25969x(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    if …it,\n        )\n      }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C26006k c26006k = new C26006k();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: bD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25968y(Function1.this, obj);
            }
        });
        Observable<String> observeOn2 = this.f97638a.m84214Sl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.scanSerialNumberClick…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f97641d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25995b c25995b = new C25995b();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: cD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44962mD5.m25967z(Function1.this, obj);
            }
        });
    }

    public /* synthetic */ C44962mD5(TC5 tc5, L92 l92, InterfaceC40099e13 interfaceC40099e13, ScopeProvider scopeProvider, O86 o86, N92 n92, boolean z, String str, String str2, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tc5, l92, interfaceC40099e13, scopeProvider, o86, n92, z, (i & 128) != 0 ? null : str, str2, str3, z2);
    }
}
