package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Xy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37217Xy6 extends AbstractC36983Wy6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f44344a;

    /* renamed from: b */
    public final AbstractC39268cf1<WarehouseMarker> f44345b;

    /* renamed from: c */
    public final AbstractC38675bf1<WarehouseMarker> f44346c;

    /* renamed from: d */
    public final AbstractC38675bf1<WarehouseMarker> f44347d;

    /* renamed from: e */
    public final AbstractC41861gz5 f44348e;

    /* renamed from: Xy6$a */
    /* loaded from: classes4.dex */
    public class C9568a extends AbstractC39268cf1<WarehouseMarker> {
        public C9568a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `warehouse_markers` (`id`,`location`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, WarehouseMarker warehouseMarker) {
            if (warehouseMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, warehouseMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55275i = Converters.m55275i(warehouseMarker.getLocation());
            if (m55275i == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55275i);
            }
        }
    }

    /* renamed from: Xy6$b */
    /* loaded from: classes4.dex */
    public class C9569b extends AbstractC38675bf1<WarehouseMarker> {
        public C9569b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `warehouse_markers` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, WarehouseMarker warehouseMarker) {
            if (warehouseMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, warehouseMarker.getId());
            }
        }
    }

    /* renamed from: Xy6$c */
    /* loaded from: classes4.dex */
    public class C9570c extends AbstractC38675bf1<WarehouseMarker> {
        public C9570c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `warehouse_markers` SET `id` = ?,`location` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, WarehouseMarker warehouseMarker) {
            if (warehouseMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, warehouseMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55275i = Converters.m55275i(warehouseMarker.getLocation());
            if (m55275i == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55275i);
            }
            if (warehouseMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, warehouseMarker.getId());
            }
        }
    }

    /* renamed from: Xy6$d */
    /* loaded from: classes4.dex */
    public class C9571d extends AbstractC41861gz5 {
        public C9571d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM warehouse_markers";
        }
    }

    /* renamed from: Xy6$e */
    /* loaded from: classes4.dex */
    public class CallableC9572e implements Callable<Void> {
        public CallableC9572e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C37217Xy6.this.f44348e.m37254b();
            C37217Xy6.this.f44344a.m108730c();
            try {
                m37254b.mo17482M();
                C37217Xy6.this.f44344a.m108734A();
                C37217Xy6.this.f44344a.m108728g();
                C37217Xy6.this.f44348e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C37217Xy6.this.f44344a.m108728g();
                C37217Xy6.this.f44348e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Xy6$f */
    /* loaded from: classes4.dex */
    public class CallableC9573f implements Callable<List<WarehouseMarker>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f44354b;

        public CallableC9573f(C33265Hb5 c33265Hb5) {
            this.f44354b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<WarehouseMarker> call() throws Exception {
            String string;
            String string2;
            Cursor m102673c = IF0.m102673c(C37217Xy6.this.f44344a, this.f44354b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    if (m102673c.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(1);
                    }
                    arrayList.add(new WarehouseMarker(string, Converters.m55268p(string2)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f44354b.release();
        }
    }

    public C37217Xy6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f44344a = abstractC32563Eb5;
        this.f44345b = new C9568a(abstractC32563Eb5);
        this.f44346c = new C9569b(abstractC32563Eb5);
        this.f44347d = new C9570c(abstractC32563Eb5);
        this.f44348e = new C9571d(abstractC32563Eb5);
    }

    /* renamed from: o */
    public static List<Class<?>> m75941o() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: a */
    public AbstractC23461c mo75955a() {
        return AbstractC23461c.m33078H(new CallableC9572e());
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: b */
    public List<String> mo75954b(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` FROM warehouse_markers WHERE rowid in (");
        int size = list.size();
        C42725iS5.m33906a(m33905b, size);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20956S0(i, l.longValue());
            }
            i++;
        }
        this.f44344a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f44344a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: c */
    public List<Long> mo75953c(WarehouseMarker... warehouseMarkerArr) {
        this.f44344a.m108731b();
        this.f44344a.m108730c();
        try {
            List<Long> m61084o = this.f44345b.m61084o(warehouseMarkerArr);
            this.f44344a.m108734A();
            return m61084o;
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: d */
    public List<WarehouseMarker> mo75952d() {
        String string;
        String string2;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT `warehouse_markers`.`id` AS `id`, `warehouse_markers`.`location` AS `location` FROM warehouse_markers", 0);
        this.f44344a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f44344a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                if (m102673c.isNull(1)) {
                    string2 = null;
                } else {
                    string2 = m102673c.getString(1);
                }
                arrayList.add(new WarehouseMarker(string, Converters.m55268p(string2)));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: e */
    public void mo75951e(List<WarehouseMarker> list) {
        this.f44344a.m108731b();
        this.f44344a.m108730c();
        try {
            this.f44346c.m64206k(list);
            this.f44344a.m108734A();
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: f */
    public void mo75950f(List<String> list) {
        this.f44344a.m108731b();
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("DELETE FROM warehouse_markers WHERE id NOT in (");
        C42725iS5.m33906a(m33905b, list.size());
        m33905b.append(")");
        InterfaceC47496qV5 m108729d = this.f44344a.m108729d(m33905b.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                m108729d.mo20954m1(i);
            } else {
                m108729d.mo20958G0(i, str);
            }
            i++;
        }
        this.f44344a.m108730c();
        try {
            m108729d.mo17482M();
            this.f44344a.m108734A();
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: g */
    public void mo75949g(List<String> list) {
        this.f44344a.m108730c();
        try {
            super.mo75949g(list);
            this.f44344a.m108734A();
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: h */
    public void mo75948h(WarehouseMarker... warehouseMarkerArr) {
        this.f44344a.m108731b();
        this.f44344a.m108730c();
        try {
            this.f44347d.m64205l(warehouseMarkerArr);
            this.f44344a.m108734A();
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: i */
    public void mo75947i(List<WarehouseMarker> list) {
        this.f44344a.m108730c();
        try {
            super.mo75947i(list);
            this.f44344a.m108734A();
        } finally {
            this.f44344a.m108728g();
        }
    }

    @Override // p000.AbstractC36983Wy6
    /* renamed from: j */
    public Observable<List<WarehouseMarker>> mo75946j() {
        return C37504Ze5.m72808c(this.f44344a, false, new String[]{"warehouse_markers"}, new CallableC9573f(C33265Hb5.m103680c("SELECT `warehouse_markers`.`id` AS `id`, `warehouse_markers`.`location` AS `location` FROM warehouse_markers", 0)));
    }
}
