package p000;

import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.wire.WireFleet;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C41106fj3;
import p000.InterfaceC39310cj3;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lfj3;", "Lcj3;", "", "skuOrderId", "Lio/reactivex/c;", "n", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/SkuOrder;", "D0", "clear", "Lco/bird/android/model/wire/WireSkuOrder;", "", "M1", "Lh86;", C17296a.f69688o, "Lh86;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lri3;", "b", "Lri3;", "operatorAllocationDao", "<init>", "(Lh86;Lri3;)V", "co.bird.android.repository.operator-order-view"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorAllocationRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorAllocationRepositoryImpl.kt\nco/bird/android/repository/operatorallocation/OperatorAllocationRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1726#2,3:56\n*S KotlinDebug\n*F\n+ 1 OperatorAllocationRepositoryImpl.kt\nco/bird/android/repository/operatorallocation/OperatorAllocationRepositoryImpl\n*L\n50#1:56,3\n*E\n"})
/* renamed from: fj3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41106fj3 implements InterfaceC39310cj3 {

    /* renamed from: a */
    public final InterfaceC41951h86 f80495a;

    /* renamed from: b */
    public final AbstractC48212ri3 f80496b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "wireSkuOrder", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireSkuOrder;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fj3$a */
    /* loaded from: classes4.dex */
    public static final class C20495a extends Lambda implements Function1<WireSkuOrder, InterfaceC23496h> {
        public C20495a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m40983c(C41106fj3 this$0, WireSkuOrder wireSkuOrder) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(wireSkuOrder, "$wireSkuOrder");
            return this$0.f80496b.mo13800b(C47026pi3.m18930a(wireSkuOrder));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireSkuOrder wireSkuOrder) {
            Intrinsics.checkNotNullParameter(wireSkuOrder, "wireSkuOrder");
            if (C41106fj3.this.m40987M1(wireSkuOrder)) {
                AbstractC23461c mo13801a = C41106fj3.this.f80496b.mo13801a();
                final C41106fj3 c41106fj3 = C41106fj3.this;
                return mo13801a.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: ej3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m40983c;
                        m40983c = C41106fj3.C20495a.m40983c(C41106fj3.this, wireSkuOrder);
                        return m40983c;
                    }
                }));
            }
            return AbstractC23461c.m33080F(C42530i72.f86773b);
        }
    }

    public C41106fj3(InterfaceC41951h86 client, AbstractC48212ri3 operatorAllocationDao) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(operatorAllocationDao, "operatorAllocationDao");
        this.f80495a = client;
        this.f80496b = operatorAllocationDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m40988L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39310cj3
    /* renamed from: D0 */
    public Observable<SkuOrder> mo40991D0(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        return m40989K1(this.f80496b.mo13799c(skuOrderId));
    }

    /* renamed from: K1 */
    public <T> Observable<T> m40989K1(Observable<T> observable) {
        return InterfaceC39310cj3.C13653a.m61020a(this, observable);
    }

    /* renamed from: M1 */
    public final boolean m40987M1(WireSkuOrder wireSkuOrder) {
        WireFleet wireFleet;
        WireFleet wireFleet2;
        WireTransferOrder wireTransferOrder;
        WireWarehouse wireWarehouse;
        WireWarehouse wireWarehouse2;
        List listOf;
        boolean z;
        WireTransferOrder transferOrder;
        WireTransferOrder transferOrder2;
        WireTransferOrder transferOrder3;
        Object[] objArr = new Object[7];
        objArr[0] = wireSkuOrder.getTransferOrderLineItem();
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        DateTime dateTime = null;
        if (transferOrderLineItem != null) {
            wireFleet = transferOrderLineItem.getOriginFleet();
        } else {
            wireFleet = null;
        }
        objArr[1] = wireFleet;
        WireTransferOrderLineItem transferOrderLineItem2 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem2 != null) {
            wireFleet2 = transferOrderLineItem2.getDestinationFleet();
        } else {
            wireFleet2 = null;
        }
        objArr[2] = wireFleet2;
        WireTransferOrderLineItem transferOrderLineItem3 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem3 != null) {
            wireTransferOrder = transferOrderLineItem3.getTransferOrder();
        } else {
            wireTransferOrder = null;
        }
        objArr[3] = wireTransferOrder;
        WireTransferOrderLineItem transferOrderLineItem4 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem4 != null && (transferOrder3 = transferOrderLineItem4.getTransferOrder()) != null) {
            wireWarehouse = transferOrder3.getOriginWarehouse();
        } else {
            wireWarehouse = null;
        }
        objArr[4] = wireWarehouse;
        WireTransferOrderLineItem transferOrderLineItem5 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem5 != null && (transferOrder2 = transferOrderLineItem5.getTransferOrder()) != null) {
            wireWarehouse2 = transferOrder2.getDestinationWarehouse();
        } else {
            wireWarehouse2 = null;
        }
        objArr[5] = wireWarehouse2;
        WireTransferOrderLineItem transferOrderLineItem6 = wireSkuOrder.getTransferOrderLineItem();
        if (transferOrderLineItem6 != null && (transferOrder = transferOrderLineItem6.getTransferOrder()) != null) {
            dateTime = transferOrder.getTargetDeliveryDate();
        }
        objArr[6] = dateTime;
        listOf = CollectionsKt__CollectionsKt.listOf(objArr);
        List<Object> list = listOf;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if (obj != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f80496b.mo13801a();
    }

    @Override // p000.InterfaceC39310cj3
    /* renamed from: n */
    public AbstractC23461c mo40986n(String skuOrderId) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        AbstractC23442F<WireSkuOrder> m33142Y = this.f80495a.m36814m(skuOrderId).m33142Y(C24542a.m31932c());
        final C20495a c20495a = new C20495a();
        AbstractC23461c m33164B = m33142Y.m33164B(new InterfaceC23492o() { // from class: dj3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m40988L1;
                m40988L1 = C41106fj3.m40988L1(Function1.this, obj);
                return m40988L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…er)\n        }\n      }\n  }");
        return m33164B;
    }
}
