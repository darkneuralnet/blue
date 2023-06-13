package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Ly6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34409Ly6 extends AbstractC34175Ky6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f22365a;

    /* renamed from: b */
    public final AbstractC39268cf1<WarehouseFlightSheetDetails> f22366b;

    /* renamed from: c */
    public final AbstractC41861gz5 f22367c;

    /* renamed from: Ly6$a */
    /* loaded from: classes4.dex */
    public class C5136a extends AbstractC39268cf1<WarehouseFlightSheetDetails> {
        public C5136a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `warehouse_flight_sheets` (`warehouse_id`,`summary`,`status`,`warehouse_details`,`vehicle_details`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
            if (warehouseFlightSheetDetails.getWarehouseId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, warehouseFlightSheetDetails.getWarehouseId());
            }
            C33941Jy6 c33941Jy6 = C33941Jy6.f18871a;
            String m99414c = C33941Jy6.m99414c(warehouseFlightSheetDetails.getSummary());
            if (m99414c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m99414c);
            }
            String m99415b = C33941Jy6.m99415b(warehouseFlightSheetDetails.getStatus());
            if (m99415b == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m99415b);
            }
            String m99416a = C33941Jy6.m99416a(warehouseFlightSheetDetails.getWarehouseDetails());
            if (m99416a == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m99416a);
            }
            String m99413d = C33941Jy6.m99413d(warehouseFlightSheetDetails.getVehicleDetails());
            if (m99413d == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m99413d);
            }
        }
    }

    /* renamed from: Ly6$b */
    /* loaded from: classes4.dex */
    public class C5137b extends AbstractC41861gz5 {
        public C5137b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM warehouse_flight_sheets";
        }
    }

    /* renamed from: Ly6$c */
    /* loaded from: classes4.dex */
    public class CallableC5138c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ WarehouseFlightSheetDetails f22370b;

        public CallableC5138c(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
            this.f22370b = warehouseFlightSheetDetails;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C34409Ly6.this.f22365a.m108730c();
            try {
                C34409Ly6.this.f22366b.m61088k(this.f22370b);
                C34409Ly6.this.f22365a.m108734A();
                C34409Ly6.this.f22365a.m108728g();
                return null;
            } catch (Throwable th) {
                C34409Ly6.this.f22365a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Ly6$d */
    /* loaded from: classes4.dex */
    public class CallableC5139d implements Callable<Void> {
        public CallableC5139d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34409Ly6.this.f22367c.m37254b();
            C34409Ly6.this.f22365a.m108730c();
            try {
                m37254b.mo17482M();
                C34409Ly6.this.f22365a.m108734A();
                C34409Ly6.this.f22365a.m108728g();
                C34409Ly6.this.f22367c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34409Ly6.this.f22365a.m108728g();
                C34409Ly6.this.f22367c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Ly6$e */
    /* loaded from: classes4.dex */
    public class CallableC5140e implements Callable<WarehouseFlightSheetDetails> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f22373b;

        public CallableC5140e(C33265Hb5 c33265Hb5) {
            this.f22373b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public WarehouseFlightSheetDetails call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            WarehouseFlightSheetDetails warehouseFlightSheetDetails = null;
            String string5 = null;
            Cursor m102673c = IF0.m102673c(C34409Ly6.this.f22365a, this.f22373b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "warehouse_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "summary");
                int m41645e3 = C40824fF0.m41645e(m102673c, "status");
                int m41645e4 = C40824fF0.m41645e(m102673c, "warehouse_details");
                int m41645e5 = C40824fF0.m41645e(m102673c, "vehicle_details");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    if (m102673c.isNull(m41645e2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e2);
                    }
                    WarehouseSummary m99410g = C33941Jy6.m99410g(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    WarehouseStatus m99411f = C33941Jy6.m99411f(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    WarehouseDetails m99412e = C33941Jy6.m99412e(string4);
                    if (!m102673c.isNull(m41645e5)) {
                        string5 = m102673c.getString(m41645e5);
                    }
                    warehouseFlightSheetDetails = new WarehouseFlightSheetDetails(string, m99410g, m99411f, m99412e, C33941Jy6.m99409h(string5));
                }
                return warehouseFlightSheetDetails;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f22373b.release();
        }
    }

    public C34409Ly6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f22365a = abstractC32563Eb5;
        this.f22366b = new C5136a(abstractC32563Eb5);
        this.f22367c = new C5137b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m96046g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC34175Ky6
    /* renamed from: a */
    public AbstractC23461c mo96052a() {
        return AbstractC23461c.m33078H(new CallableC5139d());
    }

    @Override // p000.AbstractC34175Ky6
    /* renamed from: b */
    public AbstractC23461c mo96051b(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
        return AbstractC23461c.m33078H(new CallableC5138c(warehouseFlightSheetDetails));
    }

    @Override // p000.AbstractC34175Ky6
    /* renamed from: c */
    public Observable<WarehouseFlightSheetDetails> mo96050c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM warehouse_flight_sheets WHERE warehouse_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f22365a, false, new String[]{"warehouse_flight_sheets"}, new CallableC5140e(m103680c));
    }
}
