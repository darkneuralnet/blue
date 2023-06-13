package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.ScannerMode;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuOrderKt;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScanItemKt;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireSkuScannedItemsKt;
import co.bird.android.model.wire.WireSkuVehicle;
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
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.MD5;
import p000.O86;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001\u0010BU\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\b\b\u0001\u0010.\u001a\u00020+\u0012\b\b\u0001\u00101\u001a\u00020\f¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00040\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010:\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00020\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\"\u0010>\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\f0\f0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, m28432d2 = {"LMD5;", "", "Lco/bird/android/model/wire/WireSkuOrder;", "wireSkuOrder", "Lco/bird/android/model/wire/WireSkuScannedItems;", "scannedItems", "", "M", "N", "K", "L", "r", "", "rawScan", "J", "LO86;", C17296a.f69688o, "LO86;", "transferOrderManager", "LWC5;", "b", "LWC5;", "converter", "Le13;", "c", "Le13;", "navigator", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LVD5;", "e", "LVD5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LN92;", "g", "LN92;", "inventoryScanningUiDelegate", "", "h", "Z", "outbound", "i", "Ljava/lang/String;", "skuOrderId", "j", "prevScanIdentifier", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/a;", "scannedItemsSubject", "l", "skuOrderSubject", "Lio/reactivex/subjects/d;", "m", "Lio/reactivex/subjects/d;", "externalScanSubject", "<init>", "(LO86;LWC5;Le13;LTq4;LVD5;Lcom/uber/autodispose/ScopeProvider;LN92;ZLjava/lang/String;)V", "n", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSkuScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuScannerPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/SkuScannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,279:1\n199#2:280\n199#2:281\n180#2:282\n180#2:283\n180#2:284\n180#2:285\n180#2:286\n180#2:287\n180#2:288\n*S KotlinDebug\n*F\n+ 1 SkuScannerPresenter.kt\nco/bird/android/feature/transferorder/sku/scanner/SkuScannerPresenter\n*L\n75#1:280\n80#1:281\n93#1:282\n105#1:283\n110#1:284\n115#1:285\n121#1:286\n134#1:287\n211#1:288\n*E\n"})
/* renamed from: MD5 */
/* loaded from: classes3.dex */
public final class MD5 {

    /* renamed from: n */
    public static final C5231a f22846n = new C5231a(null);

    /* renamed from: o */
    public static final Set<TransferOrderDemandSource> f22847o;

    /* renamed from: a */
    public final O86 f22848a;

    /* renamed from: b */
    public final WC5 f22849b;

    /* renamed from: c */
    public final InterfaceC40099e13 f22850c;

    /* renamed from: d */
    public final C36207Tq4 f22851d;

    /* renamed from: e */
    public final VD5 f22852e;

    /* renamed from: f */
    public final ScopeProvider f22853f;

    /* renamed from: g */
    public final N92 f22854g;

    /* renamed from: h */
    public final boolean f22855h;

    /* renamed from: i */
    public final String f22856i;

    /* renamed from: j */
    public String f22857j;

    /* renamed from: k */
    public final C24552a<WireSkuScannedItems> f22858k;

    /* renamed from: l */
    public final C24552a<WireSkuOrder> f22859l;

    /* renamed from: m */
    public final C24558d<String> f22860m;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LMD5$a;", "", "", "Lco/bird/android/model/constant/TransferOrderDemandSource;", "FORCE_SCAN_DEMAND_SOURCES", "Ljava/util/Set;", "", "HAPTIC_DELAY_MS", "J", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: MD5$a */
    /* loaded from: classes3.dex */
    public static final class C5231a {
        public /* synthetic */ C5231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5231a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$b */
    /* loaded from: classes3.dex */
    public static final class C5232b extends Lambda implements Function1<Pair<? extends Collection<? extends String>, ? extends String>, Unit> {
        public C5232b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Collection<? extends String>, ? extends String> pair) {
            invoke2((Pair<? extends Collection<String>, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Collection<String>, String> pair) {
            InterfaceC40099e13.C19924a.goToSkuScannerDetails$default(MD5.this.f22850c, MD5.this.f22856i, false, MD5.this.f22855h, true, null, null, 48, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$c */
    /* loaded from: classes3.dex */
    public static final class C5233c extends Lambda implements Function1<Pair<? extends String, ? extends Collection<? extends WireSuccessfulScannedItem>>, Unit> {
        public C5233c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends Collection<? extends WireSuccessfulScannedItem>> pair) {
            invoke2((Pair<String, ? extends Collection<WireSuccessfulScannedItem>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends Collection<WireSuccessfulScannedItem>> pair) {
            Object firstOrNull;
            Object firstOrNull2;
            WireSkuVehicle bird;
            String component1 = pair.component1();
            Collection<WireSuccessfulScannedItem> component2 = pair.component2();
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(component2);
            WireSuccessfulScannedItem wireSuccessfulScannedItem = (WireSuccessfulScannedItem) firstOrNull;
            boolean received = wireSuccessfulScannedItem != null ? wireSuccessfulScannedItem.getReceived() : false;
            InterfaceC40099e13 interfaceC40099e13 = MD5.this.f22850c;
            boolean z = MD5.this.f22855h;
            String str = MD5.this.f22856i;
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull(component2);
            WireSuccessfulScannedItem wireSuccessfulScannedItem2 = (WireSuccessfulScannedItem) firstOrNull2;
            InterfaceC40099e13.C19924a.goToSkuScannerDetails$default(interfaceC40099e13, str, received, z, false, (wireSuccessfulScannedItem2 == null || (bird = wireSuccessfulScannedItem2.getBird()) == null) ? null : bird.getModelVersionTitle(), component1, 8, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "rawScan", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$d */
    /* loaded from: classes3.dex */
    public static final class C5234d extends Lambda implements Function1<String, InterfaceC23447K<? extends Pair<? extends String, ? extends WireSkuScanItem>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$d$a */
        /* loaded from: classes3.dex */
        public static final class C5235a extends Lambda implements Function1<WireSkuScanItem, Pair<? extends String, ? extends WireSkuScanItem>> {

            /* renamed from: g */
            public final /* synthetic */ String f22864g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5235a(String str) {
                super(1);
                this.f22864g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, WireSkuScanItem> invoke(WireSkuScanItem it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f22864g, it);
            }
        }

        public C5234d() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<String, WireSkuScanItem>> invoke(String rawScan) {
            Intrinsics.checkNotNullParameter(rawScan, "rawScan");
            AbstractC23442F scanSkuForSkuOrder$default = O86.C5908a.scanSkuForSkuOrder$default(MD5.this.f22848a, MD5.this.f22855h, MD5.this.f22856i, rawScan, true, MD5.this.f22857j, false, false, 96, null);
            final C5235a c5235a = new C5235a(rawScan);
            return scanSkuForSkuOrder$default.m33157I(new InterfaceC23492o() { // from class: ND5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = MD5.C5234d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0003*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$e */
    /* loaded from: classes3.dex */
    public static final class C5236e extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends WireSkuScanItem>, ? extends WireSkuOrder>, InterfaceC24574u<? extends Pair<? extends String, ? extends WireSkuScanItem>>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$e$a */
        /* loaded from: classes3.dex */
        public static final class C5237a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C5237a f22866g = new C5237a();

            public C5237a() {
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

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$e$b */
        /* loaded from: classes3.dex */
        public static final class C5238b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Pair<? extends String, ? extends WireSkuScanItem>>> {

            /* renamed from: g */
            public final /* synthetic */ MD5 f22867g;

            /* renamed from: h */
            public final /* synthetic */ String f22868h;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScanItem;", "response", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScanItem;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: MD5$e$b$a */
            /* loaded from: classes3.dex */
            public static final class C5239a extends Lambda implements Function1<WireSkuScanItem, Pair<? extends String, ? extends WireSkuScanItem>> {

                /* renamed from: g */
                public final /* synthetic */ String f22869g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5239a(String str) {
                    super(1);
                    this.f22869g = str;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<String, WireSkuScanItem> invoke(WireSkuScanItem response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    return TuplesKt.m28425to(this.f22869g, response);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5238b(MD5 md5, String str) {
                super(1);
                this.f22867g = md5;
                this.f22868h = str;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends Pair<String, WireSkuScanItem>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                O86 o86 = this.f22867g.f22848a;
                boolean z = this.f22867g.f22855h;
                String str = this.f22867g.f22856i;
                String rawScan = this.f22868h;
                Intrinsics.checkNotNullExpressionValue(rawScan, "rawScan");
                AbstractC24507p m33125j0 = O86.C5908a.scanSkuForSkuOrder$default(o86, z, str, rawScan, true, this.f22867g.f22857j, false, true, 32, null).m33125j0();
                final C5239a c5239a = new C5239a(this.f22868h);
                return m33125j0.m32067H(new InterfaceC23492o() { // from class: QD5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = MD5.C5236e.C5238b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        public C5236e() {
            super(1);
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
        public final InterfaceC24574u<? extends Pair<String, WireSkuScanItem>> invoke(Pair<Pair<String, WireSkuScanItem>, WireSkuOrder> pair) {
            TransferOrderDemandSource transferOrderDemandSource;
            boolean contains;
            WireTransferOrder transferOrder;
            WireWarehouse destinationWarehouse;
            WireTransferOrder transferOrder2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<String, WireSkuScanItem> component1 = pair.component1();
            WireSkuOrder component2 = pair.component2();
            String component12 = component1.component1();
            WireSkuScanItem component22 = component1.component2();
            Set set = MD5.f22847o;
            WireTransferOrderLineItem transferOrderLineItem = component2.getTransferOrderLineItem();
            InventoryScanningError inventoryScanningError = null;
            if (transferOrderLineItem != null && (transferOrder2 = transferOrderLineItem.getTransferOrder()) != null) {
                transferOrderDemandSource = transferOrder2.getDemandSource();
            } else {
                transferOrderDemandSource = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(set, transferOrderDemandSource);
            if (contains) {
                String errorCode = component22.getErrorCode();
                if (errorCode != null) {
                    inventoryScanningError = WireSkuScanItemKt.toInventoryScanningError(errorCode);
                }
                if (inventoryScanningError == InventoryScanningError.ITEM_NOT_IN_SKU_ORDER) {
                    WireTransferOrderLineItem transferOrderLineItem2 = component2.getTransferOrderLineItem();
                    AbstractC23442F<DialogResponse> m94309Pl = MD5.this.f22854g.m94309Pl((transferOrderLineItem2 == null || (transferOrder = transferOrderLineItem2.getTransferOrder()) == null || (destinationWarehouse = transferOrder.getDestinationWarehouse()) == null || (r6 = destinationWarehouse.getName()) == null) ? "" : "");
                    final C5237a c5237a = C5237a.f22866g;
                    AbstractC24507p<DialogResponse> m33098z = m94309Pl.m33098z(new InterfaceC23494q() { // from class: OD5
                        @Override // io.reactivex.functions.InterfaceC23494q
                        public final boolean test(Object obj) {
                            boolean invoke$lambda$0;
                            invoke$lambda$0 = MD5.C5236e.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    });
                    final C5238b c5238b = new C5238b(MD5.this, component12);
                    return m33098z.m32021x(new InterfaceC23492o() { // from class: PD5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u invoke$lambda$1;
                            invoke$lambda$1 = MD5.C5236e.invoke$lambda$1(Function1.this, obj);
                            return invoke$lambda$1;
                        }
                    });
                }
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component12, component22));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$f */
    /* loaded from: classes3.dex */
    public static final class C5240f extends Lambda implements Function1<Pair<? extends String, ? extends WireSkuScanItem>, InterfaceC24574u<? extends Pair<? extends String, ? extends WireSkuScanItem>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$f$a */
        /* loaded from: classes3.dex */
        public static final class C5241a extends Lambda implements Function1<DialogResponse, Pair<? extends String, ? extends WireSkuScanItem>> {

            /* renamed from: g */
            public final /* synthetic */ String f22871g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuScanItem f22872h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5241a(String str, WireSkuScanItem wireSkuScanItem) {
                super(1);
                this.f22871g = str;
                this.f22872h = wireSkuScanItem;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, WireSkuScanItem> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f22871g, this.f22872h);
            }
        }

        public C5240f() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<String, WireSkuScanItem>> invoke(Pair<String, WireSkuScanItem> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String rawScan = pair.component1();
            WireSkuScanItem component2 = pair.component2();
            N92 n92 = MD5.this.f22854g;
            Intrinsics.checkNotNullExpressionValue(rawScan, "rawScan");
            AbstractC23442F<DialogResponse> m94307Rl = n92.m94307Rl(rawScan, component2.getErrorCode());
            final C5241a c5241a = new C5241a(rawScan, component2);
            return m94307Rl.m33157I(new InterfaceC23492o() { // from class: RD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = MD5.C5240f.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$g */
    /* loaded from: classes3.dex */
    public static final class C5242g extends Lambda implements Function1<Pair<? extends String, ? extends WireSkuScanItem>, InterfaceC23447K<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "kotlin.jvm.PlatformType", "scannedItems", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$g$a */
        /* loaded from: classes3.dex */
        public static final class C5243a extends Lambda implements Function1<WireSkuScannedItems, Unit> {

            /* renamed from: g */
            public final /* synthetic */ MD5 f22874g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuScanItem f22875h;

            /* renamed from: i */
            public final /* synthetic */ String f22876i;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: MD5$g$a$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C5244a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InventoryScanningError.values().length];
                    try {
                        iArr[InventoryScanningError.VALID_QR_NOT_IN_DB.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5243a(MD5 md5, WireSkuScanItem wireSkuScanItem, String str) {
                super(1);
                this.f22874g = md5;
                this.f22875h = wireSkuScanItem;
                this.f22876i = str;
            }

            /* renamed from: a */
            public final void m95497a(WireSkuScannedItems wireSkuScannedItems) {
                InventoryScanningError inventoryScanningError;
                int i;
                this.f22874g.f22858k.onNext(wireSkuScannedItems);
                String errorCode = this.f22875h.getErrorCode();
                MD5 md5 = this.f22874g;
                String str = null;
                if (errorCode != null) {
                    inventoryScanningError = WireSkuScanItemKt.toInventoryScanningError(errorCode);
                } else {
                    inventoryScanningError = null;
                }
                if (inventoryScanningError == null) {
                    i = -1;
                } else {
                    i = C5244a.$EnumSwitchMapping$0[inventoryScanningError.ordinal()];
                }
                if (i == 1) {
                    str = this.f22876i;
                }
                md5.f22857j = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
                m95497a(wireSkuScannedItems);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuScannedItems;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireSkuScannedItems;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$g$b */
        /* loaded from: classes3.dex */
        public static final class C5245b extends Lambda implements Function1<WireSkuScannedItems, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuScanItem f22877g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5245b(WireSkuScanItem wireSkuScanItem) {
                super(1);
                this.f22877g = wireSkuScanItem;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(WireSkuScannedItems it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f22877g.getErrorCode() == null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C5242g() {
            super(1);
        }

        /* renamed from: d */
        public static final Boolean m95498d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Boolean> invoke(Pair<String, WireSkuScanItem> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScanItem component2 = pair.component2();
            AbstractC23442F<WireSkuScannedItems> mo80279w = MD5.this.f22848a.mo80279w(MD5.this.f22856i);
            final C5243a c5243a = new C5243a(MD5.this, component2, pair.component1());
            AbstractC23442F<WireSkuScannedItems> m33101w = mo80279w.m33101w(new InterfaceC23484g() { // from class: SD5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MD5.C5242g.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C5245b c5245b = new C5245b(component2);
            return m33101w.m33157I(new InterfaceC23492o() { // from class: TD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m95498d;
                    m95498d = MD5.C5242g.m95498d(Function1.this, obj);
                    return m95498d;
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5246h extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5246h(Object obj) {
            super(1, obj, VD5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VD5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "success", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$i */
    /* loaded from: classes3.dex */
    public static final class C5247i extends Lambda implements Function1<Boolean, Unit> {
        public C5247i() {
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
                MD5.this.f22852e.vibrate(500L);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5248j extends FunctionReferenceImpl implements Function1<WireSkuOrder, Unit> {
        public C5248j(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m95495a(WireSkuOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuOrder wireSkuOrder) {
            m95495a(wireSkuOrder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5249k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5249k(Object obj) {
            super(1, obj, VD5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VD5) this.receiver).error(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5250l extends FunctionReferenceImpl implements Function1<WireSkuScannedItems, Unit> {
        public C5250l(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m95494a(WireSkuScannedItems p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireSkuScannedItems wireSkuScannedItems) {
            m95494a(wireSkuScannedItems);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5251m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5251m(Object obj) {
            super(1, obj, VD5.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VD5) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aÊ\u0001\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00060\u0006 \u0002*d\u0012^\b\u0001\u0012Z\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuScannedItems;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "", "LH6;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$n */
    /* loaded from: classes3.dex */
    public static final class C5252n extends Lambda implements Function1<Pair<? extends WireSkuOrder, ? extends WireSkuScannedItems>, InterfaceC23447K<? extends Triple<? extends WireSkuOrder, ? extends WireSkuScannedItems, ? extends List<? extends C3023H6>>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuScannedItems;", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: MD5$n$a */
        /* loaded from: classes3.dex */
        public static final class C5253a extends Lambda implements Function1<List<? extends C3023H6>, Triple<? extends WireSkuOrder, ? extends WireSkuScannedItems, ? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuOrder f22880g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuScannedItems f22881h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5253a(WireSkuOrder wireSkuOrder, WireSkuScannedItems wireSkuScannedItems) {
                super(1);
                this.f22880g = wireSkuOrder;
                this.f22881h = wireSkuScannedItems;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<WireSkuOrder, WireSkuScannedItems, List<C3023H6>> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f22880g, this.f22881h, it);
            }
        }

        public C5252n() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m95491c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<WireSkuOrder, WireSkuScannedItems, List<C3023H6>>> invoke(Pair<WireSkuOrder, WireSkuScannedItems> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuOrder component1 = pair.component1();
            WireSkuScannedItems scannedItems = pair.component2();
            WC5 wc5 = MD5.this.f22849b;
            Intrinsics.checkNotNullExpressionValue(scannedItems, "scannedItems");
            boolean z = MD5.this.f22855h;
            WireTransferOrderLineItem transferOrderLineItem = component1.getTransferOrderLineItem();
            boolean z2 = false;
            if (transferOrderLineItem != null && transferOrderLineItem.getUsedCondition()) {
                z2 = true;
            }
            AbstractC23442F<List<C3023H6>> m78713b = wc5.m78713b(scannedItems, z, z2);
            final C5253a c5253a = new C5253a(component1, scannedItems);
            return m78713b.m33157I(new InterfaceC23492o() { // from class: UD5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m95491c;
                    m95491c = MD5.C5252n.m95491c(Function1.this, obj);
                    return m95491c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072^\u0010\u0006\u001aZ\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0002*,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/wire/WireSkuScannedItems;", "", "LH6;", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: MD5$o */
    /* loaded from: classes3.dex */
    public static final class C5254o extends Lambda implements Function1<Triple<? extends WireSkuOrder, ? extends WireSkuScannedItems, ? extends List<? extends C3023H6>>, Unit> {
        public C5254o() {
            super(1);
        }

        /* renamed from: a */
        public final void m95489a(Triple<WireSkuOrder, WireSkuScannedItems, ? extends List<C3023H6>> triple) {
            WireSkuOrder wireSkuOrder = triple.component1();
            WireSkuScannedItems wireSkuScannedItems = triple.component2();
            List<C3023H6> adapterSections = triple.component3();
            if (MD5.this.f22855h) {
                MD5 md5 = MD5.this;
                Intrinsics.checkNotNullExpressionValue(wireSkuOrder, "wireSkuOrder");
                Intrinsics.checkNotNullExpressionValue(wireSkuScannedItems, "wireSkuScannedItems");
                md5.m95540N(wireSkuOrder, wireSkuScannedItems);
            } else {
                MD5 md52 = MD5.this;
                Intrinsics.checkNotNullExpressionValue(wireSkuOrder, "wireSkuOrder");
                Intrinsics.checkNotNullExpressionValue(wireSkuScannedItems, "wireSkuScannedItems");
                md52.m95541M(wireSkuOrder, wireSkuScannedItems);
            }
            VD5 vd5 = MD5.this.f22852e;
            Intrinsics.checkNotNullExpressionValue(adapterSections, "adapterSections");
            vd5.m80196b(adapterSections);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireSkuOrder, ? extends WireSkuScannedItems, ? extends List<? extends C3023H6>> triple) {
            m95489a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$p */
    /* loaded from: classes3.dex */
    public static final class C5255p extends Lambda implements Function1<Unit, Unit> {
        public C5255p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToScanCode$default(MD5.this.f22850c, ScannerMode.RAW_SCAN, null, null, null, true, true, false, null, 206, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$q */
    /* loaded from: classes3.dex */
    public static final class C5256q extends Lambda implements Function1<Unit, Unit> {
        public C5256q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToScanCode$default(MD5.this.f22850c, ScannerMode.RAW_SCAN, null, null, null, true, true, true, null, 142, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MD5$r */
    /* loaded from: classes3.dex */
    public static final class C5257r extends Lambda implements Function1<Unit, Unit> {
        public C5257r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            MD5.this.f22850c.close();
        }
    }

    static {
        Set<TransferOrderDemandSource> of;
        of = SetsKt__SetsKt.setOf((Object[]) new TransferOrderDemandSource[]{TransferOrderDemandSource.FROM_3PL_DELIVERY, TransferOrderDemandSource.FM_LONGTAIL_RETURN});
        f22847o = of;
    }

    public MD5(O86 transferOrderManager, WC5 converter, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, VD5 ui, ScopeProvider scopeProvider, N92 inventoryScanningUiDelegate, boolean z, String skuOrderId) {
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(inventoryScanningUiDelegate, "inventoryScanningUiDelegate");
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        this.f22848a = transferOrderManager;
        this.f22849b = converter;
        this.f22850c = navigator;
        this.f22851d = reactiveConfig;
        this.f22852e = ui;
        this.f22853f = scopeProvider;
        this.f22854g = inventoryScanningUiDelegate;
        this.f22855h = z;
        this.f22856i = skuOrderId;
        C24552a<WireSkuScannedItems> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireSkuScannedItems>()");
        this.f22858k = m31922e;
        C24552a<WireSkuOrder> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<WireSkuOrder>()");
        this.f22859l = m31922e2;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f22860m = m31902e;
        ui.m80206H4(z);
    }

    /* renamed from: A */
    public static final void m95553A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m95552B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m95551C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23447K m95550D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m95549E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m95548F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m95547G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m95546H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m95545I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m95521s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m95520t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m95519u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC23447K m95518v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC24574u m95517w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC24574u m95516x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m95515y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m95514z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public final void m95544J(String rawScan) {
        Intrinsics.checkNotNullParameter(rawScan, "rawScan");
        this.f22860m.onNext(rawScan);
    }

    /* renamed from: K */
    public final void m95543K() {
        this.f22852e.onPause();
    }

    /* renamed from: L */
    public final void m95542L() {
        this.f22852e.onResume();
    }

    /* renamed from: M */
    public final void m95541M(WireSkuOrder wireSkuOrder, WireSkuScannedItems wireSkuScannedItems) {
        boolean z;
        int size = WireSkuScannedItemsKt.inboundScans(wireSkuScannedItems.getSuccessfulScannedItems()).size();
        if (size >= Math.min(wireSkuOrder.getQuantity(), this.f22851d.m82623f8().m73665a().getOperatorConfig().getFeatures().getTransferOrder().getMinSkuInboundScanBeforeProcessAllowed())) {
            z = true;
        } else {
            z = false;
        }
        this.f22852e.enableDoneButton(z);
        this.f22852e.m80203Rl(wireSkuOrder.getQuantity());
        this.f22852e.m80201Tl(size);
        if (WireSkuScannedItemsKt.inboundScans(wireSkuScannedItems.getSuccessfulScannedItems()).isEmpty()) {
            this.f22852e.m80200Ul(C45871nl4.sku_scan_details_inbound_label, wireSkuOrder.getId());
        } else {
            this.f22852e.m80205Pl();
        }
    }

    /* renamed from: N */
    public final void m95540N(WireSkuOrder wireSkuOrder, WireSkuScannedItems wireSkuScannedItems) {
        boolean z;
        boolean z2;
        int i;
        String commodityType;
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        boolean z3 = false;
        if (transferOrderLineItem != null && WireSkuOrderKt.vehicleType(transferOrderLineItem)) {
            z = true;
        } else {
            z = false;
        }
        WireTransferOrderLineItem transferOrderLineItem2 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem2 != null && transferOrderLineItem2.getUsedCondition()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int size = wireSkuScannedItems.getSuccessfulScannedItems().size();
        if (z && z2) {
            i = C45871nl4.sku_scan_details_used_vehicles_label;
        } else if (z && !z2) {
            i = C45871nl4.sku_scan_details_new_vehicles_label;
        } else if (!z && !z2) {
            i = C45871nl4.sku_scan_details_new_parts_label;
        } else {
            i = C45871nl4.sku_scan_details_used_parts_label;
        }
        VD5 vd5 = this.f22852e;
        if (size == wireSkuOrder.getQuantity()) {
            z3 = true;
        }
        vd5.enableDoneButton(z3);
        this.f22852e.m80203Rl(wireSkuOrder.getQuantity());
        this.f22852e.m80201Tl(size);
        this.f22852e.m80202Sl(wireSkuScannedItems.getFailedScannedItems().size());
        this.f22852e.m80198Wl(true ^ wireSkuScannedItems.getFailedScannedItems().isEmpty());
        if (!WireSkuScannedItemsKt.hasScanItems(wireSkuScannedItems)) {
            VD5 vd52 = this.f22852e;
            int quantity = wireSkuOrder.getQuantity();
            WireTransferOrderLineItem transferOrderLineItem3 = wireSkuOrder.getTransferOrderLineItem();
            vd52.m80199Vl(i, quantity, (transferOrderLineItem3 == null || (commodityType = transferOrderLineItem3.getCommodityType()) == null || (r2 = C45097mS5.m25601e(commodityType)) == null) ? "" : "", wireSkuOrder.getId());
            return;
        }
        this.f22852e.m80205Pl();
    }

    /* renamed from: r */
    public final void m95522r() {
        AbstractC23442F<WireSkuOrder> m33147S = this.f22848a.mo80296h(this.f22856i).m33147S();
        Intrinsics.checkNotNullExpressionValue(m33147S, "transferOrderManager.get…kuOrderId)\n      .retry()");
        Object m33135e = m33147S.m33135e(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5248j c5248j = new C5248j(this.f22859l);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95521s(Function1.this, obj);
            }
        };
        final C5249k c5249k = new C5249k(this.f22852e);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: KD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95520t(Function1.this, obj);
            }
        });
        AbstractC23442F<WireSkuScannedItems> m33147S2 = this.f22848a.mo80279w(this.f22856i).m33147S();
        Intrinsics.checkNotNullExpressionValue(m33147S2, "transferOrderManager.get…kuOrderId)\n      .retry()");
        Object m33135e2 = m33147S2.m33135e(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5250l c5250l = new C5250l(this.f22858k);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: LD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95552B(Function1.this, obj);
            }
        };
        final C5251m c5251m = new C5251m(this.f22852e);
        ((SingleSubscribeProxy) m33135e2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: wD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95551C(Function1.this, obj);
            }
        });
        Observable m31956a = C24523e.f91168a.m31956a(this.f22859l, this.f22858k);
        final C5252n c5252n = new C5252n();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: xD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95550D;
                m95550D = MD5.m95550D(Function1.this, obj);
                return m95550D;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onCreate() {\n    tra…TIC_DELAY_MS)\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5254o c5254o = new C5254o();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95549E(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = this.f22852e.m80207B2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.cameraClicks()\n      …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5255p c5255p = new C5255p();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95548F(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = this.f22852e.m80194v0().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.codeClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5256q c5256q = new C5256q();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: AD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95547G(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f22852e.doneClicks().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.doneClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5257r c5257r = new C5257r();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: BD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95546H(Function1.this, obj);
            }
        });
        if (this.f22855h) {
            Observable<Pair<Collection<String>, String>> observeOn5 = this.f22852e.m80195n2().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.categoryClicks()\n    …dSchedulers.mainThread())");
            Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f22853f));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C5232b c5232b = new C5232b();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: CD5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    MD5.m95545I(Function1.this, obj);
                }
            });
        }
        Observable<Pair<String, Collection<WireSuccessfulScannedItem>>> observeOn6 = this.f22852e.m80197Xl().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "ui.skuScannedClicks()\n  …dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5233c c5233c = new C5233c();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: DD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95519u(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f22852e.m80204Ql(), this.f22860m);
        final C5234d c5234d = new C5234d();
        Observable flatMapSingle = merge.flatMapSingle(new InterfaceC23492o() { // from class: ED5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95518v;
                m95518v = MD5.m95518v(Function1.this, obj);
                return m95518v;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    tra…TIC_DELAY_MS)\n      }\n  }");
        Observable observeOn7 = C24527f.m31950a(flatMapSingle, this.f22859l).observeOn(C23454a.m33087a());
        final C5236e c5236e = new C5236e();
        Observable flatMapMaybe = observeOn7.flatMapMaybe(new InterfaceC23492o() { // from class: FD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m95517w;
                m95517w = MD5.m95517w(Function1.this, obj);
                return m95517w;
            }
        });
        final C5240f c5240f = new C5240f();
        Observable observeOn8 = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: GD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m95516x;
                m95516x = MD5.m95516x(Function1.this, obj);
                return m95516x;
            }
        }).observeOn(C24542a.m31932c());
        final C5242g c5242g = new C5242g();
        Observable flatMapSingle2 = observeOn8.flatMapSingle(new InterfaceC23492o() { // from class: HD5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95515y;
                m95515y = MD5.m95515y(Function1.this, obj);
                return m95515y;
            }
        });
        final C5246h c5246h = new C5246h(this.f22852e);
        Observable observeOn9 = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: ID5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95514z(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn9, "fun onCreate() {\n    tra…TIC_DELAY_MS)\n      }\n  }");
        Object m33094as7 = observeOn9.m33094as(AutoDispose.m45239a(this.f22853f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5247i c5247i = new C5247i();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: JD5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MD5.m95553A(Function1.this, obj);
            }
        });
    }
}
