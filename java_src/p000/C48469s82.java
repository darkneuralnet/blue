package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.InventorySku;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.api.response.WarehouseInventory;
import co.bird.api.response.WireBinDefinition;
import co.bird.api.response.WireInventoryCount;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C45672nQ5;
import p000.C48469s82;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001\u0016BQ\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00109\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010707018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\"\u0010;\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00020\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, m28432d2 = {"Ls82;", "LV72;", "", "newBinCount", "", "O", "", "sku", "failureReason", "N", "scanResult", C17296a.f69688o, "Lco/bird/api/response/WireInventoryCount;", "count", "b", "Llh6;", "Llh6;", "userManager", "LA82;", "LA82;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LI82;", DateTokenConverter.CONVERTER_KEY, "LI82;", "inventoryManager", "LGt5;", "e", "LGt5;", "serviceCenterManager", "LEa;", "f", "LEa;", "analyticsManager", "Le13;", "g", "Le13;", "navigator", "Lwi2;", "h", "Lwi2;", "deserializer", "LD82;", "i", "LD82;", "statusConverter", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "j", "Lio/reactivex/subjects/a;", "warehouseSubject", "Lco/bird/api/response/WarehouseInventory;", "k", "warehouseInventorySubject", "l", "countSubject", "m", "Ljava/lang/String;", "sessionId", "<init>", "(Llh6;LA82;Lcom/uber/autodispose/ScopeProvider;LI82;LGt5;LEa;Le13;Lwi2;LD82;)V", "n", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryCountPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryCountPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n180#2:288\n180#2:289\n199#2:290\n180#2:291\n180#2:292\n180#2:293\n180#2:294\n199#2:296\n1#3:295\n*S KotlinDebug\n*F\n+ 1 InventoryCountPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryCountPresenterImpl\n*L\n77#1:288\n91#1:289\n138#1:290\n165#1:291\n173#1:292\n192#1:293\n205#1:294\n270#1:296\n*E\n"})
/* renamed from: s82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48469s82 implements V72 {

    /* renamed from: n */
    public static final C28187c f108326n = new C28187c(null);

    /* renamed from: a */
    public final InterfaceC44647lh6 f108327a;

    /* renamed from: b */
    public final A82 f108328b;

    /* renamed from: c */
    public final ScopeProvider f108329c;

    /* renamed from: d */
    public final I82 f108330d;

    /* renamed from: e */
    public final InterfaceC33193Gt5 f108331e;

    /* renamed from: f */
    public final InterfaceC1880Ea f108332f;

    /* renamed from: g */
    public final InterfaceC40099e13 f108333g;

    /* renamed from: h */
    public final C51174wi2 f108334h;

    /* renamed from: i */
    public final D82 f108335i;

    /* renamed from: j */
    public final C24552a<Warehouse> f108336j;

    /* renamed from: k */
    public final C24552a<WarehouseInventory> f108337k;

    /* renamed from: l */
    public final C24552a<Integer> f108338l;

    /* renamed from: m */
    public final String f108339m;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/api/response/WarehouseInventory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$a */
    /* loaded from: classes3.dex */
    public static final class C28185a extends Lambda implements Function1<Pair<? extends Integer, ? extends WarehouseInventory>, Unit> {
        public C28185a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends WarehouseInventory> pair) {
            invoke2((Pair<Integer, WarehouseInventory>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, WarehouseInventory> pair) {
            Integer count = pair.component1();
            pair.component2();
            A82 a82 = C48469s82.this.f108328b;
            Intrinsics.checkNotNullExpressionValue(count, "count");
            a82.mo114330q7(count.intValue(), count.intValue() < 2, count.intValue() > 0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "Lco/bird/api/response/WarehouseInventory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$b */
    /* loaded from: classes3.dex */
    public static final class C28186b extends Lambda implements Function1<Pair<? extends Warehouse, ? extends WarehouseInventory>, Unit> {
        public C28186b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Warehouse, ? extends WarehouseInventory> pair) {
            invoke2((Pair<Warehouse, WarehouseInventory>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Warehouse, WarehouseInventory> pair) {
            Warehouse component1 = pair.component1();
            WarehouseInventory component2 = pair.component2();
            WireBinDefinition binDefinition = component2.getBinDefinition();
            if (binDefinition != null) {
                C48469s82 c48469s82 = C48469s82.this;
                A82 a82 = c48469s82.f108328b;
                String name = component1.getName();
                if (name == null) {
                    name = "";
                }
                String name2 = component2.getName();
                if (name2 == null) {
                    name2 = "";
                }
                String sku = binDefinition.getSku();
                String size = binDefinition.getSize();
                int maxQuantity = binDefinition.getMaxQuantity();
                Integer num = (Integer) c48469s82.f108338l.getValue();
                if (num == null) {
                    num = 0;
                }
                Intrinsics.checkNotNullExpressionValue(num, "countSubject.value ?: 0");
                int intValue = num.intValue();
                int excessInventoryQuantity = component2.getExcessInventoryQuantity();
                Float binWeight = component2.getBinWeight();
                a82.mo114334U9(name, name2, sku, size, maxQuantity, intValue, excessInventoryQuantity, binWeight != null ? binWeight.floatValue() : 0.0f);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, m28432d2 = {"Ls82$c;", "", "", "BIN_MAX_QUANTITY", "I", "BIN_MIN_QUANTITY", "", "SCAN_FAILURE_NO_BIN_DEFINITION", "Ljava/lang/String;", "SCAN_FAILURE_OTHER", "SCAN_FAILURE_QR_INVALID", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: s82$c */
    /* loaded from: classes3.dex */
    public static final class C28187c {
        public /* synthetic */ C28187c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28187c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$e */
    /* loaded from: classes3.dex */
    public static final class C28190e extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {
        public C28190e() {
            super(1);
        }

        /* renamed from: a */
        public final void m14689a(C45672nQ5.EnumC26504b enumC26504b) {
            C48469s82.this.f108333g.mo37050b1(-1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
            m14689a(enumC26504b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/api/response/WarehouseInventory;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$f */
    /* loaded from: classes3.dex */
    public static final class C28191f extends Lambda implements Function1<Pair<? extends Unit, ? extends WarehouseInventory>, InterfaceC24574u<? extends WarehouseInventory>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "Lco/bird/api/response/WarehouseInventory;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: s82$f$a */
        /* loaded from: classes3.dex */
        public static final class C28192a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends WarehouseInventory>> {

            /* renamed from: g */
            public static final C28192a f108347g = new C28192a();

            public C28192a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends WarehouseInventory> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        public C28191f() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m14686c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends WarehouseInventory> invoke(Pair<Unit, WarehouseInventory> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WarehouseInventory component2 = pair.component2();
            if (component2.getBinCount() != null) {
                Integer binCount = component2.getBinCount();
                Intrinsics.checkNotNull(binCount);
                if (binCount.intValue() < 2) {
                    AbstractC23442F<DialogResponse> dialog = C48469s82.this.f108328b.dialog(C31947Bl1.f2821d, false, true);
                    final C28192a c28192a = C28192a.f108347g;
                    return dialog.m33163C(new InterfaceC23492o() { // from class: u82
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m14686c;
                            m14686c = C48469s82.C28191f.m14686c(Function1.this, obj);
                            return m14686c;
                        }
                    });
                }
            }
            return AbstractC24507p.m32068G(component2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28193g extends FunctionReferenceImpl implements Function1<WarehouseInventory, Unit> {
        public C28193g(Object obj) {
            super(1, obj, InterfaceC40099e13.class, "goToExcessInventory", "goToExcessInventory(Lco/bird/api/response/WarehouseInventory;)V", 0);
        }

        /* renamed from: a */
        public final void m14684a(WarehouseInventory p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC40099e13) this.receiver).mo36951r4(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseInventory warehouseInventory) {
            m14684a(warehouseInventory);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$h */
    /* loaded from: classes3.dex */
    public static final class C28194h extends Lambda implements Function1<User, Boolean> {

        /* renamed from: g */
        public static final C28194h f108348g = new C28194h();

        public C28194h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(User user) {
            boolean z;
            Intrinsics.checkNotNullParameter(user, "user");
            if (user.getWarehouseId() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u009a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003 \u0005*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "Lco/bird/api/response/WarehouseInventory;", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$i */
    /* loaded from: classes3.dex */
    public static final class C28195i extends Lambda implements Function1<User, InterfaceC23447K<? extends Pair<? extends Warehouse, ? extends WarehouseInventory>>> {

        /* renamed from: h */
        public final /* synthetic */ InventorySku f108350h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28195i(InventorySku inventorySku) {
            super(1);
            this.f108350h = inventorySku;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Pair<Warehouse, WarehouseInventory>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            C24530g c24530g = C24530g.f91174a;
            InterfaceC33193Gt5 interfaceC33193Gt5 = C48469s82.this.f108331e;
            String warehouseId = user.getWarehouseId();
            Intrinsics.checkNotNull(warehouseId);
            AbstractC23442F m70883l = C38096ag5.m70883l(interfaceC33193Gt5.mo94633a(warehouseId));
            I82 i82 = C48469s82.this.f108330d;
            String warehouseId2 = user.getWarehouseId();
            Intrinsics.checkNotNull(warehouseId2);
            return c24530g.m31946a(m70883l, i82.mo101099a(warehouseId2, this.f108350h.getSku()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "Lco/bird/api/response/WarehouseInventory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInventoryCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryCountPresenter.kt\nco/bird/android/feature/servicecenter/inventorycount/InventoryCountPresenterImpl$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"})
    /* renamed from: s82$j */
    /* loaded from: classes3.dex */
    public static final class C28196j extends Lambda implements Function1<Pair<? extends Warehouse, ? extends WarehouseInventory>, Unit> {
        public C28196j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Warehouse, ? extends WarehouseInventory> pair) {
            invoke2((Pair<Warehouse, WarehouseInventory>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Warehouse, WarehouseInventory> pair) {
            Integer binCount = pair.component2().getBinCount();
            if (binCount != null) {
                C48469s82.this.f108338l.onNext(binCount);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28197k extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C28197k(Object obj) {
            super(1, obj, A82.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((A82) this.receiver).error(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "Lco/bird/api/response/WarehouseInventory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$l */
    /* loaded from: classes3.dex */
    public static final class C28198l extends Lambda implements Function1<Pair<? extends Warehouse, ? extends WarehouseInventory>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InventorySku f108353h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28198l(InventorySku inventorySku) {
            super(1);
            this.f108353h = inventorySku;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Warehouse, ? extends WarehouseInventory> pair) {
            invoke2((Pair<Warehouse, WarehouseInventory>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Warehouse, WarehouseInventory> pair) {
            WireBinDefinition binDefinition;
            Warehouse component1 = pair.component1();
            WarehouseInventory component2 = pair.component2();
            String sku = (component2 == null || (binDefinition = component2.getBinDefinition()) == null) ? null : binDefinition.getSku();
            if (sku == null) {
                C48469s82.this.m14726N(this.f108353h.getSku(), "no_bin_definition");
                C48469s82.this.f108333g.mo37029e4(0, new Intent());
                C48469s82.this.f108328b.topToast(C45871nl4.inventory_bins_not_found, EnumC40735f56.SHORT);
                return;
            }
            C48469s82.this.f108337k.onNext(component2);
            C48469s82.this.f108336j.onNext(component1);
            InterfaceC1880Ea interfaceC1880Ea = C48469s82.this.f108332f;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            interfaceC1880Ea.mo55905y(new C35440Qj2(uuid, C48469s82.this.f108339m, null, null, sku, 12, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$m */
    /* loaded from: classes3.dex */
    public static final class C28199m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InventorySku f108355h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28199m(InventorySku inventorySku) {
            super(1);
            this.f108355h = inventorySku;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C48469s82.this.m14726N(this.f108355h.getSku(), LegacyRepairType.OTHER_KEY);
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$n */
    /* loaded from: classes3.dex */
    public static final class C28200n extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, Unit> {
        public C28200n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Integer> pair) {
            invoke2((Pair<Unit, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Integer> pair) {
            int coerceIn;
            C24552a c24552a = C48469s82.this.f108338l;
            coerceIn = RangesKt___RangesKt.coerceIn(pair.component2().intValue() + 1, (ClosedRange<Integer>) new IntRange(0, 2));
            c24552a.onNext(Integer.valueOf(coerceIn));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$o */
    /* loaded from: classes3.dex */
    public static final class C28201o extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, Unit> {
        public C28201o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Integer> pair) {
            invoke2((Pair<Unit, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Integer> pair) {
            int coerceIn;
            C24552a c24552a = C48469s82.this.f108338l;
            coerceIn = RangesKt___RangesKt.coerceIn(pair.component2().intValue() - 1, (ClosedRange<Integer>) new IntRange(0, 2));
            c24552a.onNext(Integer.valueOf(coerceIn));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$p */
    /* loaded from: classes3.dex */
    public static final class C28202p extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, Unit> {
        public C28202p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Integer> pair) {
            invoke2((Pair<Unit, Integer>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Integer> pair) {
            Integer count = pair.component2();
            C48469s82 c48469s82 = C48469s82.this;
            Intrinsics.checkNotNullExpressionValue(count, "count");
            c48469s82.m14725O(count.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "Lco/bird/api/response/WarehouseInventory;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$q */
    /* loaded from: classes3.dex */
    public static final class C28203q extends Lambda implements Function1<Pair<? extends User, ? extends WarehouseInventory>, InterfaceC23447K<? extends WarehouseInventory>> {

        /* renamed from: h */
        public final /* synthetic */ int f108360h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireInventoryCount;", "it", "Lco/bird/api/response/WarehouseInventory;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireInventoryCount;)Lco/bird/api/response/WarehouseInventory;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: s82$q$a */
        /* loaded from: classes3.dex */
        public static final class C28204a extends Lambda implements Function1<WireInventoryCount, WarehouseInventory> {

            /* renamed from: g */
            public final /* synthetic */ WarehouseInventory f108361g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28204a(WarehouseInventory warehouseInventory) {
                super(1);
                this.f108361g = warehouseInventory;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WarehouseInventory invoke(WireInventoryCount it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f108361g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28203q(int i) {
            super(1);
            this.f108360h = i;
        }

        /* renamed from: c */
        public static final WarehouseInventory m14679c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WarehouseInventory) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WarehouseInventory> invoke(Pair<User, WarehouseInventory> pair) {
            int i;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            User component1 = pair.component1();
            WarehouseInventory component2 = pair.component2();
            I82 i82 = C48469s82.this.f108330d;
            String warehouseId = component1.getWarehouseId();
            if (warehouseId == null) {
                warehouseId = "";
            }
            WireBinDefinition binDefinition = component2.getBinDefinition();
            Intrinsics.checkNotNull(binDefinition);
            String sku = binDefinition.getSku();
            int i2 = this.f108360h;
            Integer binCount = component2.getBinCount();
            if (binCount != null) {
                i = binCount.intValue();
            } else {
                i = 0;
            }
            AbstractC23442F m70883l = C38096ag5.m70883l(i82.mo101097c(warehouseId, sku, i2 - i, component1.getId()));
            final C28204a c28204a = new C28204a(component2);
            return m70883l.m33157I(new InterfaceC23492o() { // from class: v82
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WarehouseInventory m14679c;
                    m14679c = C48469s82.C28203q.m14679c(Function1.this, obj);
                    return m14679c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WarehouseInventory;", "kotlin.jvm.PlatformType", "warehouseInventory", "", C17296a.f69688o, "(Lco/bird/api/response/WarehouseInventory;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$r */
    /* loaded from: classes3.dex */
    public static final class C28205r extends Lambda implements Function1<WarehouseInventory, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f108362g;

        /* renamed from: h */
        public final /* synthetic */ C48469s82 f108363h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28205r(int i, C48469s82 c48469s82) {
            super(1);
            this.f108362g = i;
            this.f108363h = c48469s82;
        }

        /* renamed from: a */
        public final void m14677a(WarehouseInventory warehouseInventory) {
            int i;
            int i2 = this.f108362g;
            Integer binCount = warehouseInventory.getBinCount();
            int i3 = 0;
            if (binCount != null) {
                i = binCount.intValue();
            } else {
                i = 0;
            }
            if (i2 < i && warehouseInventory.getExcessInventoryQuantity() > 0) {
                this.f108363h.f108328b.dialog(new C42863ih1(warehouseInventory.getExcessInventoryQuantity()), false, true).subscribe();
            }
            InterfaceC1880Ea interfaceC1880Ea = this.f108363h.f108332f;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            String str = this.f108363h.f108339m;
            WireBinDefinition binDefinition = warehouseInventory.getBinDefinition();
            Intrinsics.checkNotNull(binDefinition);
            String sku = binDefinition.getSku();
            int i4 = this.f108362g;
            Integer binCount2 = warehouseInventory.getBinCount();
            if (binCount2 != null) {
                i3 = binCount2.intValue();
            }
            interfaceC1880Ea.mo55905y(new C35206Pj2(uuid, str, null, null, sku, i4, i4 - i3, 12, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseInventory warehouseInventory) {
            m14677a(warehouseInventory);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/api/response/WarehouseInventory;", "warehouseInventory", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/WarehouseInventory;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$s */
    /* loaded from: classes3.dex */
    public static final class C28206s extends Lambda implements Function1<WarehouseInventory, InterfaceC23447K<? extends Pair<? extends Boolean, ? extends List<? extends C3023H6>>>> {

        /* renamed from: h */
        public final /* synthetic */ int f108365h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: s82$s$a */
        /* loaded from: classes3.dex */
        public static final class C28207a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends Boolean, ? extends List<? extends C3023H6>>> {

            /* renamed from: g */
            public static final C28207a f108366g = new C28207a();

            public C28207a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Boolean, List<C3023H6>> invoke(List<C3023H6> sections) {
                Intrinsics.checkNotNullParameter(sections, "sections");
                return TuplesKt.m28425to(Boolean.TRUE, sections);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28206s(int i) {
            super(1);
            this.f108365h = i;
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<Boolean, List<C3023H6>>> invoke(WarehouseInventory warehouseInventory) {
            Intrinsics.checkNotNullParameter(warehouseInventory, "warehouseInventory");
            D82 d82 = C48469s82.this.f108335i;
            String name = warehouseInventory.getName();
            if (name == null) {
                name = "";
            }
            AbstractC23442F<List<C3023H6>> mo105716d = d82.mo105716d(name, this.f108365h);
            final C28207a c28207a = C28207a.f108366g;
            return mo105716d.m33157I(new InterfaceC23492o() { // from class: w82
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C48469s82.C28206s.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$t */
    /* loaded from: classes3.dex */
    public static final class C28208t extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f108368h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28208t(int i) {
            super(1);
            this.f108368h = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Integer binCount;
            WireBinDefinition binDefinition;
            InterfaceC1880Ea interfaceC1880Ea = C48469s82.this.f108332f;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            String str = C48469s82.this.f108339m;
            WarehouseInventory warehouseInventory = (WarehouseInventory) C48469s82.this.f108337k.getValue();
            String sku = (warehouseInventory == null || (binDefinition = warehouseInventory.getBinDefinition()) == null) ? null : binDefinition.getSku();
            Intrinsics.checkNotNull(sku);
            int i = this.f108368h;
            WarehouseInventory warehouseInventory2 = (WarehouseInventory) C48469s82.this.f108337k.getValue();
            interfaceC1880Ea.mo55905y(new C34972Oj2(uuid, str, null, null, sku, i, i - ((warehouseInventory2 == null || (binCount = warehouseInventory2.getBinCount()) == null) ? 0 : binCount.intValue()), 12, null));
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$u */
    /* loaded from: classes3.dex */
    public static final class C28209u extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Pair<? extends Boolean, ? extends List<? extends C3023H6>>>> {

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/api/response/WarehouseInventory;", "warehouseInventory", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/WarehouseInventory;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: s82$u$a */
        /* loaded from: classes3.dex */
        public static final class C28210a extends Lambda implements Function1<WarehouseInventory, InterfaceC23447K<? extends Pair<? extends Boolean, ? extends List<? extends C3023H6>>>> {

            /* renamed from: g */
            public final /* synthetic */ C48469s82 f108370g;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "LH6;", "sections", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: s82$u$a$a */
            /* loaded from: classes3.dex */
            public static final class C28211a extends Lambda implements Function1<List<? extends C3023H6>, Pair<? extends Boolean, ? extends List<? extends C3023H6>>> {

                /* renamed from: g */
                public static final C28211a f108371g = new C28211a();

                public C28211a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<Boolean, List<C3023H6>> invoke(List<C3023H6> sections) {
                    Intrinsics.checkNotNullParameter(sections, "sections");
                    return TuplesKt.m28425to(Boolean.FALSE, sections);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28210a(C48469s82 c48469s82) {
                super(1);
                this.f108370g = c48469s82;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends Pair<Boolean, List<C3023H6>>> invoke(WarehouseInventory warehouseInventory) {
                Intrinsics.checkNotNullParameter(warehouseInventory, "warehouseInventory");
                D82 d82 = this.f108370g.f108335i;
                String name = warehouseInventory.getName();
                if (name == null) {
                    name = "";
                }
                AbstractC23442F<List<C3023H6>> mo105717a = d82.mo105717a(name);
                final C28211a c28211a = C28211a.f108371g;
                return mo105717a.m33157I(new InterfaceC23492o() { // from class: y82
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C48469s82.C28209u.C28210a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        public C28209u() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Pair<Boolean, List<C3023H6>>> invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C24552a c24552a = C48469s82.this.f108337k;
            final C28210a c28210a = new C28210a(C48469s82.this);
            return c24552a.flatMapSingle(new InterfaceC23492o() { // from class: x82
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = C48469s82.C28209u.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).firstOrError();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "LH6;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$v */
    /* loaded from: classes3.dex */
    public static final class C28212v extends Lambda implements Function1<Pair<? extends Boolean, ? extends List<? extends C3023H6>>, Unit> {
        public C28212v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends List<? extends C3023H6>> pair) {
            invoke2((Pair<Boolean, ? extends List<C3023H6>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, ? extends List<C3023H6>> pair) {
            boolean booleanValue = pair.component1().booleanValue();
            List<C3023H6> sections = pair.component2();
            if (booleanValue) {
                A82 a82 = C48469s82.this.f108328b;
                Intrinsics.checkNotNullExpressionValue(sections, "sections");
                a82.mo12610b1(sections);
                return;
            }
            A82 a822 = C48469s82.this.f108328b;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            a822.mo12607g1(sections);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: s82$w */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28213w extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28213w f108373b = new C28213w();

        public C28213w() {
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

    public C48469s82(InterfaceC44647lh6 userManager, A82 ui, ScopeProvider scopeProvider, I82 inventoryManager, InterfaceC33193Gt5 serviceCenterManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, C51174wi2 deserializer, D82 statusConverter) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(inventoryManager, "inventoryManager");
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(statusConverter, "statusConverter");
        this.f108327a = userManager;
        this.f108328b = ui;
        this.f108329c = scopeProvider;
        this.f108330d = inventoryManager;
        this.f108331e = serviceCenterManager;
        this.f108332f = analyticsManager;
        this.f108333g = navigator;
        this.f108334h = deserializer;
        this.f108335i = statusConverter;
        C24552a<Warehouse> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Warehouse>()");
        this.f108336j = m31922e;
        C24552a<WarehouseInventory> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<WarehouseInventory>()");
        this.f108337k = m31922e2;
        C24552a<Integer> m31921g = C24552a.m31921g(0);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(0)");
        this.f108338l = m31921g;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f108339m = uuid;
        Observable observeOn = C24527f.m31950a(m31921g, m31922e2).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "countSubject\n      .with…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28185a c28185a = new C28185a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: p82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14693y(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24523e.f91168a.m31956a(m31922e, m31922e2).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28186b c28186b = new C28186b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: q82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14692z(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m14739A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m14738B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m14737C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m14736D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final InterfaceC24574u m14735E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m14734F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final boolean m14733G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: H */
    public static final InterfaceC23447K m14732H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m14731I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m14730J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m14729K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m14728L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m14727M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23447K m14724P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m14723Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC23447K m14722R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m14721S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m14720T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m14719U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m14718V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m14693y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m14692z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final void m14726N(String str, String str2) {
        InterfaceC1880Ea interfaceC1880Ea = this.f108332f;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        interfaceC1880Ea.mo55905y(new C34738Nj2(uuid, this.f108339m, null, null, str, str2, 12, null));
    }

    /* renamed from: O */
    public final void m14725O(int i) {
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(this.f108327a.getUser(), this.f108337k);
        final C28203q c28203q = new C28203q(i);
        AbstractC23442F m33152N = m74531s0.m33165A(new InterfaceC23492o() { // from class: W72
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m14724P;
                m14724P = C48469s82.m14724P(Function1.this, obj);
                return m14724P;
            }
        }).m33152N(C23454a.m33087a());
        final C28205r c28205r = new C28205r(i, this);
        AbstractC23442F m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: h82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14723Q(Function1.this, obj);
            }
        });
        final C28206s c28206s = new C28206s(i);
        AbstractC23442F m33165A = m33101w.m33165A(new InterfaceC23492o() { // from class: k82
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m14722R;
                m14722R = C48469s82.m14722R(Function1.this, obj);
                return m14722R;
            }
        });
        final C28208t c28208t = new C28208t(i);
        AbstractC23442F m33106t = m33165A.m33106t(new InterfaceC23484g() { // from class: l82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14721S(Function1.this, obj);
            }
        });
        final C28209u c28209u = new C28209u();
        AbstractC23442F m33150P = m33106t.m33150P(new InterfaceC23492o() { // from class: m82
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m14720T;
                m14720T = C48469s82.m14720T(Function1.this, obj);
                return m14720T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "private fun updateInvent…)\n      }, Timber::e)\n  }");
        S74 mo12605oc = this.f108328b.mo12605oc();
        if (mo12605oc == null) {
            mo12605oc = this.f108328b;
        }
        AbstractC23442F m33152N2 = C28237sD.progress$default(m33150P, mo12605oc, 0, 2, (Object) null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N2, "private fun updateInvent…)\n      }, Timber::e)\n  }");
        Object m33135e = m33152N2.m33135e(AutoDispose.m45239a(this.f108329c));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28212v c28212v = new C28212v();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: n82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14719U(Function1.this, obj);
            }
        };
        final C28213w c28213w = C28213w.f108373b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: o82
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48469s82.m14718V(Function1.this, obj);
            }
        });
    }

    @Override // p000.V72
    /* renamed from: a */
    public void mo14717a(String scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        try {
            InventorySku inventorySku = (InventorySku) this.f108334h.m6459c(scanResult, Reflection.getOrCreateKotlinClass(InventorySku.class));
            AbstractC23442F<User> user = this.f108327a.getUser();
            final C28194h c28194h = C28194h.f108348g;
            AbstractC24507p<User> m33098z = user.m33098z(new InterfaceC23494q() { // from class: r82
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m14733G;
                    m14733G = C48469s82.m14733G(Function1.this, obj);
                    return m14733G;
                }
            });
            final C28195i c28195i = new C28195i(inventorySku);
            AbstractC23442F<R> m32072C = m33098z.m32072C(new InterfaceC23492o() { // from class: a82
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m14732H;
                    m14732H = C48469s82.m14732H(Function1.this, obj);
                    return m14732H;
                }
            });
            final C28196j c28196j = new C28196j();
            AbstractC23442F m33152N = m32072C.m33101w(new InterfaceC23484g() { // from class: b82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14731I(Function1.this, obj);
                }
            }).m33152N(C23454a.m33087a());
            final C28197k c28197k = new C28197k(this.f108328b);
            AbstractC23442F m33106t = m33152N.m33106t(new InterfaceC23484g() { // from class: c82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14730J(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33106t, "override fun onCreate(sc…:goToExcessInventory)\n  }");
            Object m33135e = C28237sD.progress$default(m33106t, this.f108328b, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f108329c));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28198l c28198l = new C28198l(inventorySku);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: d82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14729K(Function1.this, obj);
                }
            };
            final C28199m c28199m = new C28199m(inventorySku);
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: e82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14728L(Function1.this, obj);
                }
            });
            Observable observeOn = C24527f.m31950a(this.f108328b.mo114332l(), this.f108338l).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "ui.addClicks()\n      .wi…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f108329c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28200n c28200n = new C28200n();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: f82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14727M(Function1.this, obj);
                }
            });
            Observable observeOn2 = C24527f.m31950a(this.f108328b.mo114333ee(), this.f108338l).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.subtractClicks()\n    …dSchedulers.mainThread())");
            Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f108329c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28201o c28201o = new C28201o();
            ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: g82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14739A(Function1.this, obj);
                }
            });
            Observable m31950a = C24527f.m31950a(this.f108328b.mo114331m0(), this.f108338l);
            final C28202p c28202p = new C28202p();
            Observable observeOn3 = m31950a.doAfterNext(new InterfaceC23484g() { // from class: i82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14738B(Function1.this, obj);
                }
            }).observeOn(C23454a.m33087a());
            final C28188d c28188d = new C28188d();
            Observable switchMap = observeOn3.switchMap(new InterfaceC23492o() { // from class: j82
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m14737C;
                    m14737C = C48469s82.m14737C(Function1.this, obj);
                    return m14737C;
                }
            });
            Intrinsics.checkNotNullExpressionValue(switchMap, "override fun onCreate(sc…:goToExcessInventory)\n  }");
            Object m33094as3 = switchMap.m33094as(AutoDispose.m45239a(this.f108329c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28190e c28190e = new C28190e();
            ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: X72
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14736D(Function1.this, obj);
                }
            });
            Observable m31950a2 = C24527f.m31950a(this.f108328b.mo114329w2(), this.f108337k);
            final C28191f c28191f = new C28191f();
            Observable flatMapMaybe = m31950a2.flatMapMaybe(new InterfaceC23492o() { // from class: Y72
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m14735E;
                    m14735E = C48469s82.m14735E(Function1.this, obj);
                    return m14735E;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun onCreate(sc…:goToExcessInventory)\n  }");
            Object m33094as4 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f108329c));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C28193g c28193g = new C28193g(this.f108333g);
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Z72
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.m14734F(Function1.this, obj);
                }
            });
        } catch (Exception unused) {
            m14726N(null, "qr_invalid");
            Intent intent = new Intent();
            intent.putExtra("raw_scan_result_unexpected", 1);
            this.f108333g.mo37190C1(-1, intent);
            this.f108328b.topToast(C45871nl4.inventory_invalid_qr_scanned, EnumC40735f56.SHORT);
        }
    }

    @Override // p000.V72
    /* renamed from: b */
    public void mo14716b(WireInventoryCount count) {
        Intrinsics.checkNotNullParameter(count, "count");
        WarehouseInventory value = this.f108337k.getValue();
        if (value != null) {
            WarehouseInventory copy$default = WarehouseInventory.copy$default(value, null, null, null, null, count.getQuantity(), count.getExcessInventoryQuantity(), 15, null);
            if (copy$default != null) {
                this.f108337k.onNext(copy$default);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "LnQ5$b;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s82$d */
    /* loaded from: classes3.dex */
    public static final class C28188d extends Lambda implements Function1<Pair<? extends Unit, ? extends Integer>, InterfaceC23434B<? extends C45672nQ5.EnumC26504b>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnQ5$b;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LnQ5$b;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: s82$d$a */
        /* loaded from: classes3.dex */
        public static final class C28189a extends Lambda implements Function1<C45672nQ5.EnumC26504b, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48469s82 f108343g;

            /* renamed from: h */
            public final /* synthetic */ Integer f108344h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28189a(C48469s82 c48469s82, Integer num) {
                super(1);
                this.f108343g = c48469s82;
                this.f108344h = num;
            }

            /* renamed from: a */
            public final void m14690a(C45672nQ5.EnumC26504b enumC26504b) {
                if (enumC26504b == C45672nQ5.EnumC26504b.TRY_AGAIN) {
                    C48469s82 c48469s82 = this.f108343g;
                    Integer count = this.f108344h;
                    Intrinsics.checkNotNullExpressionValue(count, "count");
                    c48469s82.m14725O(count.intValue());
                    return;
                }
                this.f108343g.f108333g.close();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45672nQ5.EnumC26504b enumC26504b) {
                m14690a(enumC26504b);
                return Unit.INSTANCE;
            }
        }

        public C28188d() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke2(Pair<Unit, Integer> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable showStatusDialog$default = FQ5.C2274a.showStatusDialog$default(C48469s82.this.f108328b, null, 1, null);
            final C28189a c28189a = new C28189a(C48469s82.this, pair.component2());
            return showStatusDialog$default.doOnNext(new InterfaceC23484g() { // from class: t82
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C48469s82.C28188d.invoke$lambda$0(Function1.this, obj);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends C45672nQ5.EnumC26504b> invoke(Pair<? extends Unit, ? extends Integer> pair) {
            return invoke2((Pair<Unit, Integer>) pair);
        }
    }
}
