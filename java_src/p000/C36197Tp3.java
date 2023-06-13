package p000;

import android.database.Cursor;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.nestedstructures.OperatorOrderViewDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Tp3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36197Tp3 extends AbstractC35963Sp3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f36097a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorOrderView> f36098b;

    /* renamed from: c */
    public final AbstractC41861gz5 f36099c;

    /* renamed from: Tp3$a */
    /* loaded from: classes4.dex */
    public class C7927a extends AbstractC39268cf1<OperatorOrderView> {
        public C7927a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_order` (`order_id`,`appointment_date`,`location_name`,`locationAddress`,`details`,`instructions`,`type`,`list_description`,`quantity`,`section`,`bol_status_text`,`bol_status_color`,`bol_uploaded`,`container_order_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorOrderView operatorOrderView) {
            if (operatorOrderView.getOrderId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorOrderView.getOrderId());
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(operatorOrderView.getAppointmentDate());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55279e);
            }
            if (operatorOrderView.getLocationName() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, operatorOrderView.getLocationName());
            }
            if (operatorOrderView.getLocationAddress() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, operatorOrderView.getLocationAddress());
            }
            C35729Rp3 c35729Rp3 = C35729Rp3.f32707a;
            String m86280c = C35729Rp3.m86280c(operatorOrderView.getDetails());
            if (m86280c == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m86280c);
            }
            if (operatorOrderView.getInstructions() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, operatorOrderView.getInstructions());
            }
            String m86281b = C35729Rp3.m86281b(operatorOrderView.getType());
            if (m86281b == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m86281b);
            }
            if (operatorOrderView.getListDescription() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, operatorOrderView.getListDescription());
            }
            interfaceC47496qV5.mo20956S0(9, operatorOrderView.getQuantity());
            if (operatorOrderView.getSection() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, operatorOrderView.getSection());
            }
            if (operatorOrderView.getBolStatusText() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, operatorOrderView.getBolStatusText());
            }
            String m55270n = Converters.m55270n(operatorOrderView.getBolStatusColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, m55270n);
            }
            interfaceC47496qV5.mo20956S0(13, operatorOrderView.getBolUploaded() ? 1L : 0L);
            if (operatorOrderView.getContainerOrderId() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, operatorOrderView.getContainerOrderId());
            }
        }
    }

    /* renamed from: Tp3$b */
    /* loaded from: classes4.dex */
    public class C7928b extends AbstractC41861gz5 {
        public C7928b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `operator_order`";
        }
    }

    /* renamed from: Tp3$c */
    /* loaded from: classes4.dex */
    public class CallableC7929c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f36102b;

        public CallableC7929c(List list) {
            this.f36102b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C36197Tp3.this.f36097a.m108730c();
            try {
                C36197Tp3.this.f36098b.m61089j(this.f36102b);
                C36197Tp3.this.f36097a.m108734A();
                C36197Tp3.this.f36097a.m108728g();
                return null;
            } catch (Throwable th) {
                C36197Tp3.this.f36097a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Tp3$d */
    /* loaded from: classes4.dex */
    public class CallableC7930d implements Callable<Void> {
        public CallableC7930d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C36197Tp3.this.f36099c.m37254b();
            C36197Tp3.this.f36097a.m108730c();
            try {
                m37254b.mo17482M();
                C36197Tp3.this.f36097a.m108734A();
                C36197Tp3.this.f36097a.m108728g();
                C36197Tp3.this.f36099c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C36197Tp3.this.f36097a.m108728g();
                C36197Tp3.this.f36099c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Tp3$e */
    /* loaded from: classes4.dex */
    public class CallableC7931e implements Callable<List<OperatorOrderView>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f36105b;

        public CallableC7931e(C33265Hb5 c33265Hb5) {
            this.f36105b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorOrderView> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            int i;
            boolean z;
            String string12;
            int i2;
            Cursor m102673c = IF0.m102673c(C36197Tp3.this.f36097a, this.f36105b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "order_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "appointment_date");
                int m41645e3 = C40824fF0.m41645e(m102673c, "location_name");
                int m41645e4 = C40824fF0.m41645e(m102673c, "locationAddress");
                int m41645e5 = C40824fF0.m41645e(m102673c, "details");
                int m41645e6 = C40824fF0.m41645e(m102673c, "instructions");
                int m41645e7 = C40824fF0.m41645e(m102673c, "type");
                int m41645e8 = C40824fF0.m41645e(m102673c, "list_description");
                int m41645e9 = C40824fF0.m41645e(m102673c, "quantity");
                int m41645e10 = C40824fF0.m41645e(m102673c, "section");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bol_status_text");
                int m41645e12 = C40824fF0.m41645e(m102673c, "bol_status_color");
                int m41645e13 = C40824fF0.m41645e(m102673c, "bol_uploaded");
                int m41645e14 = C40824fF0.m41645e(m102673c, "container_order_id");
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
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
                    DateTime m55278f = Converters.m55278f(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    List<OperatorOrderViewDetail> m86279d = C35729Rp3.m86279d(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    OperatorOrderViewType m86278e = C35729Rp3.m86278e(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    int i3 = m102673c.getInt(m41645e9);
                    if (m102673c.isNull(m41645e10)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e12);
                    }
                    ThemedColors m55266r = Converters.m55266r(string11);
                    if (m102673c.getInt(m41645e13) != 0) {
                        z = true;
                        i = m41645e14;
                    } else {
                        i = m41645e14;
                        z = false;
                    }
                    if (m102673c.isNull(i)) {
                        i2 = m41645e;
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i);
                        i2 = m41645e;
                    }
                    arrayList.add(new OperatorOrderView(string, m55278f, string3, string4, m86279d, string6, m86278e, string8, i3, string9, string10, m55266r, z, string12));
                    m41645e = i2;
                    m41645e14 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f36105b.release();
        }
    }

    /* renamed from: Tp3$f */
    /* loaded from: classes4.dex */
    public class CallableC7932f implements Callable<OperatorOrderView> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f36107b;

        public CallableC7932f(C33265Hb5 c33265Hb5) {
            this.f36107b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public OperatorOrderView call() throws Exception {
            OperatorOrderView operatorOrderView;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            boolean z;
            String string12;
            Cursor m102673c = IF0.m102673c(C36197Tp3.this.f36097a, this.f36107b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "order_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "appointment_date");
                int m41645e3 = C40824fF0.m41645e(m102673c, "location_name");
                int m41645e4 = C40824fF0.m41645e(m102673c, "locationAddress");
                int m41645e5 = C40824fF0.m41645e(m102673c, "details");
                int m41645e6 = C40824fF0.m41645e(m102673c, "instructions");
                int m41645e7 = C40824fF0.m41645e(m102673c, "type");
                int m41645e8 = C40824fF0.m41645e(m102673c, "list_description");
                int m41645e9 = C40824fF0.m41645e(m102673c, "quantity");
                int m41645e10 = C40824fF0.m41645e(m102673c, "section");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bol_status_text");
                int m41645e12 = C40824fF0.m41645e(m102673c, "bol_status_color");
                int m41645e13 = C40824fF0.m41645e(m102673c, "bol_uploaded");
                int m41645e14 = C40824fF0.m41645e(m102673c, "container_order_id");
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
                    DateTime m55278f = Converters.m55278f(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    List<OperatorOrderViewDetail> m86279d = C35729Rp3.m86279d(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    OperatorOrderViewType m86278e = C35729Rp3.m86278e(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    int i = m102673c.getInt(m41645e9);
                    if (m102673c.isNull(m41645e10)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e12);
                    }
                    ThemedColors m55266r = Converters.m55266r(string11);
                    if (m102673c.getInt(m41645e13) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(m41645e14)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(m41645e14);
                    }
                    operatorOrderView = new OperatorOrderView(string, m55278f, string3, string4, m86279d, string6, m86278e, string8, i, string9, string10, m55266r, z, string12);
                } else {
                    operatorOrderView = null;
                }
                return operatorOrderView;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f36107b.release();
        }
    }

    /* renamed from: Tp3$g */
    /* loaded from: classes4.dex */
    public class CallableC7933g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f36109b;

        public CallableC7933g(List list) {
            this.f36109b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM `operator_order` WHERE order_id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f36109b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C36197Tp3.this.f36097a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f36109b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C36197Tp3.this.f36097a.m108730c();
            try {
                m108729d.mo17482M();
                C36197Tp3.this.f36097a.m108734A();
                C36197Tp3.this.f36097a.m108728g();
                return null;
            } catch (Throwable th) {
                C36197Tp3.this.f36097a.m108728g();
                throw th;
            }
        }
    }

    public C36197Tp3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f36097a = abstractC32563Eb5;
        this.f36098b = new C7927a(abstractC32563Eb5);
        this.f36099c = new C7928b(abstractC32563Eb5);
    }

    /* renamed from: i */
    public static List<Class<?>> m82960i() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC35963Sp3
    /* renamed from: a */
    public AbstractC23461c mo82968a() {
        return AbstractC23461c.m33078H(new CallableC7930d());
    }

    @Override // p000.AbstractC35963Sp3
    /* renamed from: b */
    public AbstractC23461c mo82967b(List<OperatorOrderView> list) {
        return AbstractC23461c.m33078H(new CallableC7929c(list));
    }

    @Override // p000.AbstractC35963Sp3
    /* renamed from: c */
    public Observable<OperatorOrderView> mo82966c(String str, OperatorOrderViewType operatorOrderViewType) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM `operator_order` WHERE order_id = ? AND type = ?", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        String m86281b = C35729Rp3.m86281b(operatorOrderViewType);
        if (m86281b == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, m86281b);
        }
        return C37504Ze5.m72808c(this.f36097a, false, new String[]{"operator_order"}, new CallableC7932f(m103680c));
    }

    @Override // p000.AbstractC35963Sp3
    /* renamed from: d */
    public Observable<List<OperatorOrderView>> mo82965d(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM `operator_order` WHERE section = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f36097a, false, new String[]{"operator_order"}, new CallableC7931e(m103680c));
    }

    @Override // p000.AbstractC35963Sp3
    /* renamed from: e */
    public AbstractC23461c mo82964e(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC7933g(list));
    }
}
