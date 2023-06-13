package p000;

import android.database.Cursor;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.persistence.nestedstructures.TransferOrderLineItem;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: si3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48804si3 extends AbstractC48212ri3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f109141a;

    /* renamed from: b */
    public final AbstractC39268cf1<SkuOrder> f109142b;

    /* renamed from: c */
    public final AbstractC41861gz5 f109143c;

    /* renamed from: si3$a */
    /* loaded from: classes4.dex */
    public class C28370a extends AbstractC39268cf1<SkuOrder> {
        public C28370a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `sku_order` (`id`,`packaging_quantity`,`package_type`,`quantity`,`status`,`transfer_order_line_item_id`,`transfer_order_line_item`,`updated_at`) VALUES (?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, SkuOrder skuOrder) {
            if (skuOrder.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, skuOrder.getId());
            }
            if (skuOrder.getPackagingQuantity() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20956S0(2, skuOrder.getPackagingQuantity().intValue());
            }
            if (skuOrder.getPackageType() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, skuOrder.getPackageType());
            }
            interfaceC47496qV5.mo20956S0(4, skuOrder.getQuantity());
            C47619qi3 c47619qi3 = C47619qi3.f105653a;
            String m17211a = C47619qi3.m17211a(skuOrder.getStatus());
            if (m17211a == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m17211a);
            }
            if (skuOrder.getTransferOrderLineItemId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, skuOrder.getTransferOrderLineItemId());
            }
            String m17210b = C47619qi3.m17210b(skuOrder.getTransferOrderLineItem());
            if (m17210b == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m17210b);
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(skuOrder.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55279e);
            }
        }
    }

    /* renamed from: si3$b */
    /* loaded from: classes4.dex */
    public class C28371b extends AbstractC41861gz5 {
        public C28371b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `sku_order`";
        }
    }

    /* renamed from: si3$c */
    /* loaded from: classes4.dex */
    public class CallableC28372c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ SkuOrder f109146b;

        public CallableC28372c(SkuOrder skuOrder) {
            this.f109146b = skuOrder;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C48804si3.this.f109141a.m108730c();
            try {
                C48804si3.this.f109142b.m61088k(this.f109146b);
                C48804si3.this.f109141a.m108734A();
                C48804si3.this.f109141a.m108728g();
                return null;
            } catch (Throwable th) {
                C48804si3.this.f109141a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: si3$d */
    /* loaded from: classes4.dex */
    public class CallableC28373d implements Callable<Void> {
        public CallableC28373d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C48804si3.this.f109143c.m37254b();
            C48804si3.this.f109141a.m108730c();
            try {
                m37254b.mo17482M();
                C48804si3.this.f109141a.m108734A();
                C48804si3.this.f109141a.m108728g();
                C48804si3.this.f109143c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C48804si3.this.f109141a.m108728g();
                C48804si3.this.f109143c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: si3$e */
    /* loaded from: classes4.dex */
    public class CallableC28374e implements Callable<SkuOrder> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f109149b;

        public CallableC28374e(C33265Hb5 c33265Hb5) {
            this.f109149b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public SkuOrder call() throws Exception {
            String string;
            Integer valueOf;
            String string2;
            String string3;
            String string4;
            String string5;
            SkuOrder skuOrder = null;
            String string6 = null;
            Cursor m102673c = IF0.m102673c(C48804si3.this.f109141a, this.f109149b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "packaging_quantity");
                int m41645e3 = C40824fF0.m41645e(m102673c, "package_type");
                int m41645e4 = C40824fF0.m41645e(m102673c, "quantity");
                int m41645e5 = C40824fF0.m41645e(m102673c, "status");
                int m41645e6 = C40824fF0.m41645e(m102673c, "transfer_order_line_item_id");
                int m41645e7 = C40824fF0.m41645e(m102673c, "transfer_order_line_item");
                int m41645e8 = C40824fF0.m41645e(m102673c, "updated_at");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    if (m102673c.isNull(m41645e2)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(m41645e2));
                    }
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    int i = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e5);
                    }
                    SkuOrderStatus m17209c = C47619qi3.m17209c(string3);
                    if (m102673c.isNull(m41645e6)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e7);
                    }
                    TransferOrderLineItem m17208d = C47619qi3.m17208d(string5);
                    if (!m102673c.isNull(m41645e8)) {
                        string6 = m102673c.getString(m41645e8);
                    }
                    skuOrder = new SkuOrder(string, valueOf, string2, i, m17209c, string4, m17208d, Converters.m55278f(string6));
                }
                return skuOrder;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f109149b.release();
        }
    }

    public C48804si3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f109141a = abstractC32563Eb5;
        this.f109142b = new C28370a(abstractC32563Eb5);
        this.f109143c = new C28371b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m13795g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC48212ri3
    /* renamed from: a */
    public AbstractC23461c mo13801a() {
        return AbstractC23461c.m33078H(new CallableC28373d());
    }

    @Override // p000.AbstractC48212ri3
    /* renamed from: b */
    public AbstractC23461c mo13800b(SkuOrder skuOrder) {
        return AbstractC23461c.m33078H(new CallableC28372c(skuOrder));
    }

    @Override // p000.AbstractC48212ri3
    /* renamed from: c */
    public Observable<SkuOrder> mo13799c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM `sku_order` WHERE id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f109141a, false, new String[]{"sku_order"}, new CallableC28374e(m103680c));
    }
}
