package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.constant.ScannerMode;
import co.bird.android.model.persistence.HardCountEntity;
import co.bird.android.model.persistence.HardCountScan;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23447K;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.BF1;
import p000.InterfaceC40099e13;
import p000.XF1;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LBF1;", "LrF1;", "", "scanIds", "", "c", "", "", "identifiers", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "category", C17296a.f69688o, "vehicleSerial", "b", "LDF1;", "LDF1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LmF1;", "LmF1;", "converter", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LXF1;", "e", "LXF1;", "hardCountManager", "f", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "g", "Ljava/lang/String;", "vehicleIdentifierScanRetry", "<init>", "(LDF1;Lcom/uber/autodispose/ScopeProvider;LmF1;Le13;LXF1;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsPresenter.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,95:1\n161#2:96\n199#2:97\n180#2:98\n199#2:99\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsPresenter.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsPresenterImpl\n*L\n48#1:96\n60#1:97\n64#1:98\n87#1:99\n*E\n"})
/* renamed from: BF1 */
/* loaded from: classes3.dex */
public final class BF1 implements InterfaceC47941rF1 {

    /* renamed from: a */
    public final DF1 f2128a;

    /* renamed from: b */
    public final ScopeProvider f2129b;

    /* renamed from: c */
    public final InterfaceC44976mF1 f2130c;

    /* renamed from: d */
    public final InterfaceC40099e13 f2131d;

    /* renamed from: e */
    public final XF1 f2132e;

    /* renamed from: f */
    public InventoryScanningIdentifierCategory f2133f;

    /* renamed from: g */
    public String f2134g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HardCountEntity;", "it", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BF1$a */
    /* loaded from: classes3.dex */
    public static final class C0577a extends Lambda implements Function1<List<? extends HardCountEntity>, InterfaceC23447K<? extends List<? extends C3023H6>>> {

        /* renamed from: h */
        public final /* synthetic */ InventoryScanningIdentifierCategory f2136h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0577a(InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory) {
            super(1);
            this.f2136h = inventoryScanningIdentifierCategory;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<HardCountEntity> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BF1.this.f2130c.mo19736b(it, this.f2136h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BF1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0578b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C0578b(Object obj) {
            super(1, obj, DF1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DF1) this.receiver).mo109273b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BF1$c */
    /* loaded from: classes3.dex */
    public static final class C0579c extends Lambda implements Function1<String, Unit> {
        public C0579c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            BF1.this.f2134g = str;
            InterfaceC40099e13.C19924a.goToScanCode$default(BF1.this.f2131d, ScannerMode.HARD_COUNT, null, null, null, false, true, true, str, 30, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HardCountScan;", "cachedScans", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsPresenter.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsPresenterImpl$onCreateScanIds$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n766#2:96\n857#2,2:97\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsPresenter.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsPresenterImpl$onCreateScanIds$1\n*L\n36#1:96\n36#1:97,2\n*E\n"})
    /* renamed from: BF1$d */
    /* loaded from: classes3.dex */
    public static final class C0580d extends Lambda implements Function1<List<? extends HardCountScan>, List<? extends HardCountScan>> {

        /* renamed from: g */
        public final /* synthetic */ int[] f2138g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0580d(int[] iArr) {
            super(1);
            this.f2138g = iArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<HardCountScan> invoke(List<HardCountScan> cachedScans) {
            boolean contains;
            Intrinsics.checkNotNullParameter(cachedScans, "cachedScans");
            int[] iArr = this.f2138g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : cachedScans) {
                contains = ArraysKt___ArraysKt.contains(iArr, ((HardCountScan) obj).getId());
                if (contains) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scans", "", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHardCountDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsPresenter.kt\nco/bird/android/feature/hardcount/details/HardCountDetailsPresenterImpl$onCreateScanIds$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
    /* renamed from: BF1$e */
    /* loaded from: classes3.dex */
    public static final class C0581e extends Lambda implements Function1<List<? extends HardCountScan>, Unit> {
        public C0581e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends HardCountScan> list) {
            invoke2((List<HardCountScan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<HardCountScan> scans) {
            Object first;
            BirdModel fromString;
            Intrinsics.checkNotNullExpressionValue(scans, "scans");
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) scans);
            HardCountScan hardCountScan = (HardCountScan) first;
            String modelVersionTitle = hardCountScan.getModelVersionTitle();
            if (modelVersionTitle == null) {
                String model = hardCountScan.getModel();
                modelVersionTitle = (model == null || (fromString = BirdModel.Companion.fromString(model)) == null) ? null : fromString.name();
            }
            BF1.this.f2128a.mo109274Oi(modelVersionTitle);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HardCountScan;", "it", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BF1$f */
    /* loaded from: classes3.dex */
    public static final class C0582f extends Lambda implements Function1<List<? extends HardCountScan>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C0582f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<HardCountScan> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BF1.this.f2130c.mo19737a(it);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: BF1$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0583g extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C0583g(Object obj) {
            super(1, obj, DF1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DF1) this.receiver).mo109273b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HardCountEntity;", "hardCounts", "Lio/reactivex/K;", "Lkotlin/Pair;", "LH6;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BF1$h */
    /* loaded from: classes3.dex */
    public static final class C0584h extends Lambda implements Function1<List<? extends HardCountEntity>, InterfaceC23447K<? extends Pair<? extends List<? extends C3023H6>, ? extends Integer>>> {

        /* renamed from: h */
        public final /* synthetic */ InventoryScanningIdentifierCategory f2142h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: BF1$h$a */
        /* loaded from: classes3.dex */
        public static final class C0585a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends List<? extends C3023H6>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<HardCountEntity> f2143g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0585a(List<HardCountEntity> list) {
                super(1);
                this.f2143g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<C3023H6>, Integer> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, Integer.valueOf(this.f2143g.size()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0584h(InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory) {
            super(1);
            this.f2142h = inventoryScanningIdentifierCategory;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<C3023H6>, Integer>> invoke(List<HardCountEntity> hardCounts) {
            Intrinsics.checkNotNullParameter(hardCounts, "hardCounts");
            AbstractC23442F<List<C3023H6>> mo19736b = BF1.this.f2130c.mo19736b(hardCounts, this.f2142h);
            final C0585a c0585a = new C0585a(hardCounts);
            return mo19736b.m33157I(new InterfaceC23492o() { // from class: CF1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = BF1.C0584h.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BF1$i */
    /* loaded from: classes3.dex */
    public static final class C0586i extends Lambda implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Integer>, Unit> {
        public C0586i() {
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
            BF1.this.f2128a.mo109272y8(pair.component2().intValue());
            DF1 df1 = BF1.this.f2128a;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            df1.mo109273b(sections);
        }
    }

    public BF1(DF1 ui, ScopeProvider scopeProvider, InterfaceC44976mF1 converter, InterfaceC40099e13 navigator, XF1 hardCountManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(hardCountManager, "hardCountManager");
        this.f2128a = ui;
        this.f2129b = scopeProvider;
        this.f2130c = converter;
        this.f2131d = navigator;
        this.f2132e = hardCountManager;
    }

    /* renamed from: m */
    public static final InterfaceC23447K m114180m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m114179n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m114178o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final List m114177p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m114176q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m114175r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m114174s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m114173t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m114172u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47941rF1
    /* renamed from: a */
    public void mo16155a(Collection<String> identifiers, InventoryScanningIdentifierCategory category) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f2133f = category;
        this.f2128a.mo109272y8(identifiers.size());
        this.f2128a.mo109277Da(true);
        AbstractC23442F<List<HardCountEntity>> mo21446q = this.f2132e.mo21446q(category);
        final C0577a c0577a = new C0577a(category);
        AbstractC23442F m33152N = mo21446q.m33165A(new InterfaceC23492o() { // from class: yF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114180m;
                m114180m = BF1.m114180m(Function1.this, obj);
                return m114180m;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreateIde… it\n        )\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f2129b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0578b c0578b = new C0578b(this.f2128a);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: zF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BF1.m114179n(Function1.this, obj);
            }
        });
        Object m33094as = this.f2128a.mo109276K7().m33094as(AutoDispose.m45239a(this.f2129b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0579c c0579c = new C0579c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: AF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BF1.m114178o(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC47941rF1
    /* renamed from: b */
    public void mo16154b(String vehicleSerial) {
        Intrinsics.checkNotNullParameter(vehicleSerial, "vehicleSerial");
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = this.f2133f;
        String str = this.f2134g;
        if (inventoryScanningIdentifierCategory != null && str != null) {
            AbstractC23442F m33042m = this.f2132e.mo21447p(str).m33042m(this.f2132e.mo21446q(inventoryScanningIdentifierCategory));
            final C0584h c0584h = new C0584h(inventoryScanningIdentifierCategory);
            AbstractC23442F m33152N = m33042m.m33165A(new InterfaceC23492o() { // from class: wF1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m114173t;
                    m114173t = BF1.m114173t(Function1.this, obj);
                    return m114173t;
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onSuccessfu…ions)\n        }\n    }\n  }");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f2129b));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0586i c0586i = new C0586i();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: xF1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    BF1.m114172u(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC47941rF1
    /* renamed from: c */
    public void mo16153c(int[] scanIds) {
        Intrinsics.checkNotNullParameter(scanIds, "scanIds");
        this.f2128a.mo109275Of(scanIds.length);
        AbstractC24490k cachedHardCountSuccessfulScans$default = XF1.C9394a.cachedHardCountSuccessfulScans$default(this.f2132e, null, 1, null);
        final C0580d c0580d = new C0580d(scanIds);
        AbstractC24490k m32117q0 = cachedHardCountSuccessfulScans$default.m32117q0(new InterfaceC23492o() { // from class: sF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m114177p;
                m114177p = BF1.m114177p(Function1.this, obj);
                return m114177p;
            }
        });
        final C0581e c0581e = new C0581e();
        AbstractC24490k m32111s0 = m32117q0.m32191K(new InterfaceC23484g() { // from class: tF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BF1.m114176q(Function1.this, obj);
            }
        }).m32111s0(C23454a.m33087a());
        final C0582f c0582f = new C0582f();
        AbstractC24490k m32111s02 = m32111s0.m32149f0(new InterfaceC23492o() { // from class: uF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m114175r;
                m114175r = BF1.m114175r(Function1.this, obj);
                return m114175r;
            }
        }).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "override fun onCreateSca…(ui::populateAdapter)\n  }");
        Object m32150f = m32111s02.m32150f(AutoDispose.m45239a(this.f2129b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0583g c0583g = new C0583g(this.f2128a);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: vF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BF1.m114174s(Function1.this, obj);
            }
        });
    }
}
