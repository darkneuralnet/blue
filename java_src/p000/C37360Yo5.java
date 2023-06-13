package p000;

import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.api.response.BulkScanItemResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37360Yo5;
import p000.C37791a94;
import p000.O86;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00070\u0006H\u0016R.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00070\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015 \u0016*\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00100\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\""}, m28432d2 = {"LYo5;", "LFz3;", "LKz3;", "renderer", "", "S", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "t0", "", "", "Lco/bird/api/response/BulkScanItemResponse;", "Q", "La94;", "", "m", "La94;", "scrapOrderReasonsRelay", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireItemScrapReason;", "kotlin.jvm.PlatformType", "n", "Lio/reactivex/F;", "scrapReasonSingle", "LO86;", "transferOrderManager", "Le13;", "navigator", "LTq4;", "reactiveConfig", "<init>", "(LO86;Le13;LTq4;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,100:1\n180#2:101\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter\n*L\n42#1:101\n*E\n"})
/* renamed from: Yo5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37360Yo5 extends C33011Fz3 {

    /* renamed from: m */
    public final C37791a94<List<Pair<WireSkuScanItem, String>>> f46663m;

    /* renamed from: n */
    public final AbstractC23442F<List<WireItemScrapReason>> f46664n;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\b0\b \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00072N\u0010\u0006\u001aJ\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000 \u0005*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "", "", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/BulkScanItemResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$bulkProcessVehicles$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1603#2,9:101\n1855#2:110\n1856#2:112\n1612#2:113\n1#3:111\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$bulkProcessVehicles$1\n*L\n86#1:101,9\n86#1:110\n86#1:112\n86#1:113\n86#1:111\n*E\n"})
    /* renamed from: Yo5$a */
    /* loaded from: classes3.dex */
    public static final class C10002a extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>>, InterfaceC23447K<? extends BulkScanItemResponse>> {
        public C10002a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends BulkScanItemResponse> invoke(Pair<Pair<String, Boolean>, ? extends List<Pair<WireSkuScanItem, String>>> pair) {
            Pair m28425to;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<Pair<WireSkuScanItem, String>> scrapOrderReasons = pair.component2();
            String first = pair.component1().getFirst();
            Intrinsics.checkNotNullExpressionValue(scrapOrderReasons, "scrapOrderReasons");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = scrapOrderReasons.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                String str = (String) pair2.component2();
                String scanIdentifier = ((WireSkuScanItem) pair2.component1()).getScanIdentifier();
                if (scanIdentifier == null) {
                    m28425to = null;
                } else {
                    m28425to = TuplesKt.m28425to(scanIdentifier, str);
                }
                if (m28425to != null) {
                    arrayList.add(m28425to);
                }
            }
            C37360Yo5 c37360Yo5 = C37360Yo5.this;
            return c37360Yo5.m106059v0(O86.C5908a.bulkScanSkusForScrapOrder$default(c37360Yo5.m106066r0(), true, first, arrayList, true, false, 16, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u009f\u0001\u0010\u0002\u001a\u009a\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00060\u0006 \u0007*L\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nScrapOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$consume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n819#2:101\n847#2,2:102\n1#3:104\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$consume$1\n*L\n44#1:101\n44#1:102,2\n*E\n"})
    /* renamed from: Yo5$b */
    /* loaded from: classes3.dex */
    public static final class C10003b extends Lambda implements Function1<Pair<? extends Pair<? extends WireSkuScanItem, ? extends String>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>>, Unit> {
        public C10003b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends WireSkuScanItem, ? extends String>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>> pair) {
            invoke2((Pair<Pair<WireSkuScanItem, String>, ? extends List<Pair<WireSkuScanItem, String>>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<WireSkuScanItem, String>, ? extends List<Pair<WireSkuScanItem, String>>> pair) {
            List plus;
            Pair<WireSkuScanItem, String> component1 = pair.component1();
            List<Pair<WireSkuScanItem, String>> scrapReasons = pair.component2();
            Intrinsics.checkNotNullExpressionValue(scrapReasons, "scrapReasons");
            ArrayList arrayList = new ArrayList();
            for (Object obj : scrapReasons) {
                if (!Intrinsics.areEqual(((WireSkuScanItem) ((Pair) obj).component1()).getItemId(), component1.getFirst().getItemId())) {
                    arrayList.add(obj);
                }
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Pair<WireSkuScanItem, String>>) ((Collection<? extends Object>) arrayList), component1);
            C37360Yo5.this.f46663m.accept(plus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "f", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yo5$c */
    /* loaded from: classes3.dex */
    public static final class C10004c extends Lambda implements Function1<Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, InterfaceC23447K<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a:\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireItemScrapReason;", "reasons", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yo5$c$a */
        /* loaded from: classes3.dex */
        public static final class C10005a extends Lambda implements Function1<List<? extends WireItemScrapReason>, Triple<? extends WireSkuScanItem, ? extends WireSkuOrder, ? extends List<? extends WireItemScrapReason>>> {

            /* renamed from: g */
            public final /* synthetic */ WireSkuScanItem f46668g;

            /* renamed from: h */
            public final /* synthetic */ WireSkuOrder f46669h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10005a(WireSkuScanItem wireSkuScanItem, WireSkuOrder wireSkuOrder) {
                super(1);
                this.f46668g = wireSkuScanItem;
                this.f46669h = wireSkuOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<WireSkuScanItem, WireSkuOrder, List<WireItemScrapReason>> invoke(List<WireItemScrapReason> reasons) {
                Intrinsics.checkNotNullParameter(reasons, "reasons");
                return new Triple<>(this.f46668g, this.f46669h, reasons);
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yo5$c$b */
        /* loaded from: classes3.dex */
        public static final class C10006b extends Lambda implements Function1<Triple<? extends WireSkuScanItem, ? extends WireSkuOrder, ? extends List<? extends WireItemScrapReason>>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37360Yo5 f46670g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LLz3;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LLz3;)LLz3;"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nScrapOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$postScanValidation$1$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
            /* renamed from: Yo5$c$b$a */
            /* loaded from: classes3.dex */
            public static final class C10007a extends Lambda implements Function1<C34415Lz3, C34415Lz3> {

                /* renamed from: g */
                public final /* synthetic */ WireSkuScanItem f46671g;

                /* renamed from: h */
                public final /* synthetic */ List<WireItemScrapReason> f46672h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10007a(WireSkuScanItem wireSkuScanItem, List<WireItemScrapReason> list) {
                    super(1);
                    this.f46671g = wireSkuScanItem;
                    this.f46672h = list;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C34415Lz3 invoke(C34415Lz3 state) {
                    C34415Lz3 m96039n;
                    Intrinsics.checkNotNullParameter(state, "state");
                    m96039n = state.m96039n((r26 & 1) != 0 ? state.f22383a : null, (r26 & 2) != 0 ? state.f22384b : null, (r26 & 4) != 0 ? state.f22385c : null, (r26 & 8) != 0 ? state.f22386d : 0, (r26 & 16) != 0 ? state.f22387e : null, (r26 & 32) != 0 ? state.f22388f : null, (r26 & 64) != 0 ? state.f22389g : null, (r26 & 128) != 0 ? state.f22390h : null, (r26 & 256) != 0 ? state.f22391i : null, (r26 & 512) != 0 ? state.f22392j : null, (r26 & 1024) != 0 ? state.f22393k : null, (r26 & 2048) != 0 ? state.f22394l : null);
                    WireSkuScanItem wireSkuScanItem = this.f46671g;
                    List<WireItemScrapReason> reasons = this.f46672h;
                    Intrinsics.checkNotNullExpressionValue(reasons, "reasons");
                    m96039n.m96040A(new C47307qA5(wireSkuScanItem, reasons));
                    return m96039n;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10006b(C37360Yo5 c37360Yo5) {
                super(1);
                this.f46670g = c37360Yo5;
            }

            /* renamed from: a */
            public final void m74187a(Triple<WireSkuScanItem, WireSkuOrder, ? extends List<WireItemScrapReason>> triple) {
                this.f46670g.m42279i(new C10007a(triple.component1(), triple.component3()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireSkuScanItem, ? extends WireSkuOrder, ? extends List<? extends WireItemScrapReason>> triple) {
                m74187a(triple);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0007*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "", "Lco/bird/android/model/wire/WireItemScrapReason;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yo5$c$c */
        /* loaded from: classes3.dex */
        public static final class C10008c extends Lambda implements Function1<Triple<? extends WireSkuScanItem, ? extends WireSkuOrder, ? extends List<? extends WireItemScrapReason>>, Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>> {

            /* renamed from: g */
            public static final C10008c f46673g = new C10008c();

            public C10008c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<WireSkuScanItem, WireSkuOrder> invoke(Triple<WireSkuScanItem, WireSkuOrder, ? extends List<WireItemScrapReason>> triple) {
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                return TuplesKt.m28425to(triple.component1(), triple.component2());
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012Ç\u0001\u0010\u0002\u001aÂ\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0018\u00010\u00070\u0007 \u0006*`\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nScrapOrderScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$postScanValidation$1$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n819#2:101\n847#2,2:102\n1#3:104\n*S KotlinDebug\n*F\n+ 1 ScrapOrderScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/outbound/scrap/ScrapOrderScanPresenter$postScanValidation$1$4\n*L\n69#1:101\n69#1:102,2\n*E\n"})
        /* renamed from: Yo5$c$d */
        /* loaded from: classes3.dex */
        public static final class C10009d extends Lambda implements Function1<Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37360Yo5 f46674g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10009d(C37360Yo5 c37360Yo5) {
                super(1);
                this.f46674g = c37360Yo5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>> pair) {
                invoke2((Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<Pair<WireSkuScanItem, String>>>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<Pair<WireSkuScanItem, String>>> pair) {
                List plus;
                Pair<WireSkuScanItem, WireSkuOrder> component1 = pair.component1();
                List<Pair<WireSkuScanItem, String>> scrapReasons = pair.component2();
                Intrinsics.checkNotNullExpressionValue(scrapReasons, "scrapReasons");
                ArrayList arrayList = new ArrayList();
                for (Object obj : scrapReasons) {
                    if (!Intrinsics.areEqual(((WireSkuScanItem) ((Pair) obj).component1()).getItemId(), component1.getFirst().getItemId())) {
                        arrayList.add(obj);
                    }
                }
                plus = CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) ((Collection<? extends Object>) arrayList), TuplesKt.m28425to(component1.getFirst(), null));
                this.f46674g.f46663m.accept(plus);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012b\u0010\u0005\u001a^\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001 \u0004*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireSkuScanItem;", "Lco/bird/android/model/wire/WireSkuOrder;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yo5$c$e */
        /* loaded from: classes3.dex */
        public static final class C10010e extends Lambda implements Function1<Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>>, Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>> {

            /* renamed from: g */
            public static final C10010e f46675g = new C10010e();

            public C10010e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends WireSkuScanItem, ? extends WireSkuOrder> invoke(Pair<? extends Pair<? extends WireSkuScanItem, ? extends WireSkuOrder>, ? extends List<? extends Pair<? extends WireSkuScanItem, ? extends String>>> pair) {
                return invoke2((Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<Pair<WireSkuScanItem, String>>>) pair);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Pair<WireSkuScanItem, WireSkuOrder> invoke2(Pair<Pair<WireSkuScanItem, WireSkuOrder>, ? extends List<Pair<WireSkuScanItem, String>>> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                return pair.component1();
            }
        }

        public C10004c() {
            super(1);
        }

        /* renamed from: g */
        public static final Triple m74192g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final void m74191h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m74190i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        /* renamed from: j */
        public static final Pair m74189j(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: f */
        public final InterfaceC23447K<? extends Pair<WireSkuScanItem, WireSkuOrder>> invoke(Pair<WireSkuScanItem, WireSkuOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireSkuScanItem component1 = pair.component1();
            WireSkuOrder component2 = pair.component2();
            if (C37360Yo5.this.m106068q0().m82623f8().m73665a().getOperatorConfig().getFeatures().getTransferOrder().getRequestScrapOrderReason() && component1.getErrorCode() == null) {
                AbstractC23442F abstractC23442F = C37360Yo5.this.f46664n;
                final C10005a c10005a = new C10005a(component1, component2);
                AbstractC23442F m33157I = abstractC23442F.m33157I(new InterfaceC23492o() { // from class: Zo5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Triple m74192g;
                        m74192g = C37360Yo5.C10004c.m74192g(Function1.this, obj);
                        return m74192g;
                    }
                });
                final C10006b c10006b = new C10006b(C37360Yo5.this);
                AbstractC23442F m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: ap5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C37360Yo5.C10004c.m74191h(Function1.this, obj);
                    }
                });
                final C10008c c10008c = C10008c.f46673g;
                return m33101w.m33157I(new InterfaceC23492o() { // from class: bp5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$2;
                        invoke$lambda$2 = C37360Yo5.C10004c.invoke$lambda$2(Function1.this, obj);
                        return invoke$lambda$2;
                    }
                });
            } else if (component1.getErrorCode() == null) {
                AbstractC23442F m33158H = AbstractC23442F.m33158H(TuplesKt.m28425to(component1, component2));
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(scanItem to skuOrder)");
                AbstractC23442F m74531s0 = C37279Yf5.m74531s0(m33158H, C37360Yo5.this.f46663m);
                final C10009d c10009d = new C10009d(C37360Yo5.this);
                AbstractC23442F m33101w2 = m74531s0.m33101w(new InterfaceC23484g() { // from class: cp5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C37360Yo5.C10004c.m74190i(Function1.this, obj);
                    }
                });
                final C10010e c10010e = C10010e.f46675g;
                return m33101w2.m33157I(new InterfaceC23492o() { // from class: dp5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m74189j;
                        m74189j = C37360Yo5.C10004c.m74189j(Function1.this, obj);
                        return m74189j;
                    }
                });
            } else {
                return AbstractC23442F.m33158H(TuplesKt.m28425to(component1, component2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37360Yo5(final O86 transferOrderManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(transferOrderManager, navigator, reactiveConfig);
        List emptyList;
        Intrinsics.checkNotNullParameter(transferOrderManager, "transferOrderManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f46663m = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        AbstractC23442F<List<WireItemScrapReason>> m33124k = AbstractC23442F.m33124k(new Callable() { // from class: Uo5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m74204G0;
                m74204G0 = C37360Yo5.m74204G0(O86.this);
                return m74204G0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33124k, "defer {\n    transferOrde…se the cached results\n  }");
        this.f46664n = m33124k;
    }

    /* renamed from: E0 */
    public static final InterfaceC23447K m74206E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final InterfaceC23447K m74205F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: G0 */
    public static final InterfaceC23447K m74204G0(O86 transferOrderManager) {
        Intrinsics.checkNotNullParameter(transferOrderManager, "$transferOrderManager");
        return C37279Yf5.m74551i0(transferOrderManager.mo80306O());
    }

    /* renamed from: g */
    public static final void m74201g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C33011Fz3
    /* renamed from: Q */
    public Observable<BulkScanItemResponse> mo74203Q(Observable<Pair<String, Boolean>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable m31950a = C24527f.m31950a(observable, this.f46663m);
        final C10002a c10002a = new C10002a();
        Observable<BulkScanItemResponse> flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: Wo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74206E0;
                m74206E0 = C37360Yo5.m74206E0(Function1.this, obj);
                return m74206E0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun Observable<…  .progress()\n      }\n  }");
        return flatMapSingle;
    }

    @Override // p000.C33011Fz3, p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: S */
    public void consume(InterfaceC34181Kz3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = C24527f.m31950a(renderer.mo56424r4(), this.f46663m).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10003b c10003b = new C10003b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Vo5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37360Yo5.m74201g(Function1.this, obj);
            }
        });
    }

    @Override // p000.C33011Fz3
    /* renamed from: t0 */
    public Observable<Pair<WireSkuScanItem, WireSkuOrder>> mo74200t0(Observable<Pair<WireSkuScanItem, WireSkuOrder>> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        final C10004c c10004c = new C10004c();
        Observable flatMapSingle = observable.flatMapSingle(new InterfaceC23492o() { // from class: Xo5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74205F0;
                m74205F0 = C37360Yo5.m74205F0(Function1.this, obj);
                return m74205F0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun Observable<…uOrder)\n      }\n    }\n  }");
        return flatMapSingle;
    }
}
