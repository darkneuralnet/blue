package p000;

import android.database.Cursor;
import androidx.work.C12124b;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.HG6;
import p000.UC6;
/* renamed from: JG6 */
/* loaded from: classes.dex */
public final class JG6 implements IG6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f17244a;

    /* renamed from: b */
    public final AbstractC39268cf1<HG6> f17245b;

    /* renamed from: c */
    public final AbstractC38675bf1<HG6> f17246c;

    /* renamed from: d */
    public final AbstractC41861gz5 f17247d;

    /* renamed from: e */
    public final AbstractC41861gz5 f17248e;

    /* renamed from: f */
    public final AbstractC41861gz5 f17249f;

    /* renamed from: g */
    public final AbstractC41861gz5 f17250g;

    /* renamed from: h */
    public final AbstractC41861gz5 f17251h;

    /* renamed from: i */
    public final AbstractC41861gz5 f17252i;

    /* renamed from: j */
    public final AbstractC41861gz5 f17253j;

    /* renamed from: k */
    public final AbstractC41861gz5 f17254k;

    /* renamed from: l */
    public final AbstractC41861gz5 f17255l;

    /* renamed from: m */
    public final AbstractC41861gz5 f17256m;

    /* renamed from: n */
    public final AbstractC41861gz5 f17257n;

    /* renamed from: JG6$a */
    /* loaded from: classes.dex */
    public class C3993a extends AbstractC41861gz5 {
        public C3993a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: JG6$b */
    /* loaded from: classes.dex */
    public class C3994b extends AbstractC41861gz5 {
        public C3994b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: JG6$c */
    /* loaded from: classes.dex */
    public class C3995c extends AbstractC41861gz5 {
        public C3995c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: JG6$d */
    /* loaded from: classes.dex */
    public class C3996d extends AbstractC41861gz5 {
        public C3996d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: JG6$e */
    /* loaded from: classes.dex */
    public class C3997e extends AbstractC39268cf1<HG6> {
        public C3997e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, HG6 hg6) {
            String str = hg6.f13191a;
            if (str == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, str);
            }
            PG6 pg6 = PG6.f28178a;
            interfaceC47496qV5.mo20956S0(2, PG6.m90526j(hg6.f13192b));
            String str2 = hg6.f13193c;
            if (str2 == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, str2);
            }
            String str3 = hg6.f13194d;
            if (str3 == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, str3);
            }
            byte[] m65582l = C12124b.m65582l(hg6.f13195e);
            if (m65582l == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20955X0(5, m65582l);
            }
            byte[] m65582l2 = C12124b.m65582l(hg6.f13196f);
            if (m65582l2 == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20955X0(6, m65582l2);
            }
            interfaceC47496qV5.mo20956S0(7, hg6.f13197g);
            interfaceC47496qV5.mo20956S0(8, hg6.f13198h);
            interfaceC47496qV5.mo20956S0(9, hg6.f13199i);
            interfaceC47496qV5.mo20956S0(10, hg6.f13201k);
            interfaceC47496qV5.mo20956S0(11, PG6.m90535a(hg6.f13202l));
            interfaceC47496qV5.mo20956S0(12, hg6.f13203m);
            interfaceC47496qV5.mo20956S0(13, hg6.f13204n);
            interfaceC47496qV5.mo20956S0(14, hg6.f13205o);
            interfaceC47496qV5.mo20956S0(15, hg6.f13206p);
            interfaceC47496qV5.mo20956S0(16, hg6.f13207q ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(17, PG6.m90528h(hg6.f13208r));
            interfaceC47496qV5.mo20956S0(18, hg6.m104072g());
            interfaceC47496qV5.mo20956S0(19, hg6.m104073f());
            C44821lz0 c44821lz0 = hg6.f13200j;
            if (c44821lz0 != null) {
                interfaceC47496qV5.mo20956S0(20, PG6.m90529g(c44821lz0.m26580d()));
                interfaceC47496qV5.mo20956S0(21, c44821lz0.m26577g() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(22, c44821lz0.m26576h() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(23, c44821lz0.m26578f() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(24, c44821lz0.m26575i() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(25, c44821lz0.m26582b());
                interfaceC47496qV5.mo20956S0(26, c44821lz0.m26583a());
                byte[] m90527i = PG6.m90527i(c44821lz0.m26581c());
                if (m90527i == null) {
                    interfaceC47496qV5.mo20954m1(27);
                    return;
                } else {
                    interfaceC47496qV5.mo20955X0(27, m90527i);
                    return;
                }
            }
            interfaceC47496qV5.mo20954m1(20);
            interfaceC47496qV5.mo20954m1(21);
            interfaceC47496qV5.mo20954m1(22);
            interfaceC47496qV5.mo20954m1(23);
            interfaceC47496qV5.mo20954m1(24);
            interfaceC47496qV5.mo20954m1(25);
            interfaceC47496qV5.mo20954m1(26);
            interfaceC47496qV5.mo20954m1(27);
        }
    }

    /* renamed from: JG6$f */
    /* loaded from: classes.dex */
    public class C3998f extends AbstractC38675bf1<HG6> {
        public C3998f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, HG6 hg6) {
            String str = hg6.f13191a;
            if (str == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, str);
            }
            PG6 pg6 = PG6.f28178a;
            interfaceC47496qV5.mo20956S0(2, PG6.m90526j(hg6.f13192b));
            String str2 = hg6.f13193c;
            if (str2 == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, str2);
            }
            String str3 = hg6.f13194d;
            if (str3 == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, str3);
            }
            byte[] m65582l = C12124b.m65582l(hg6.f13195e);
            if (m65582l == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20955X0(5, m65582l);
            }
            byte[] m65582l2 = C12124b.m65582l(hg6.f13196f);
            if (m65582l2 == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20955X0(6, m65582l2);
            }
            interfaceC47496qV5.mo20956S0(7, hg6.f13197g);
            interfaceC47496qV5.mo20956S0(8, hg6.f13198h);
            interfaceC47496qV5.mo20956S0(9, hg6.f13199i);
            interfaceC47496qV5.mo20956S0(10, hg6.f13201k);
            interfaceC47496qV5.mo20956S0(11, PG6.m90535a(hg6.f13202l));
            interfaceC47496qV5.mo20956S0(12, hg6.f13203m);
            interfaceC47496qV5.mo20956S0(13, hg6.f13204n);
            interfaceC47496qV5.mo20956S0(14, hg6.f13205o);
            interfaceC47496qV5.mo20956S0(15, hg6.f13206p);
            interfaceC47496qV5.mo20956S0(16, hg6.f13207q ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(17, PG6.m90528h(hg6.f13208r));
            interfaceC47496qV5.mo20956S0(18, hg6.m104072g());
            interfaceC47496qV5.mo20956S0(19, hg6.m104073f());
            C44821lz0 c44821lz0 = hg6.f13200j;
            if (c44821lz0 != null) {
                interfaceC47496qV5.mo20956S0(20, PG6.m90529g(c44821lz0.m26580d()));
                interfaceC47496qV5.mo20956S0(21, c44821lz0.m26577g() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(22, c44821lz0.m26576h() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(23, c44821lz0.m26578f() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(24, c44821lz0.m26575i() ? 1L : 0L);
                interfaceC47496qV5.mo20956S0(25, c44821lz0.m26582b());
                interfaceC47496qV5.mo20956S0(26, c44821lz0.m26583a());
                byte[] m90527i = PG6.m90527i(c44821lz0.m26581c());
                if (m90527i == null) {
                    interfaceC47496qV5.mo20954m1(27);
                } else {
                    interfaceC47496qV5.mo20955X0(27, m90527i);
                }
            } else {
                interfaceC47496qV5.mo20954m1(20);
                interfaceC47496qV5.mo20954m1(21);
                interfaceC47496qV5.mo20954m1(22);
                interfaceC47496qV5.mo20954m1(23);
                interfaceC47496qV5.mo20954m1(24);
                interfaceC47496qV5.mo20954m1(25);
                interfaceC47496qV5.mo20954m1(26);
                interfaceC47496qV5.mo20954m1(27);
            }
            String str4 = hg6.f13191a;
            if (str4 == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20958G0(28, str4);
            }
        }
    }

    /* renamed from: JG6$g */
    /* loaded from: classes.dex */
    public class C3999g extends AbstractC41861gz5 {
        public C3999g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: JG6$h */
    /* loaded from: classes.dex */
    public class C4000h extends AbstractC41861gz5 {
        public C4000h(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: JG6$i */
    /* loaded from: classes.dex */
    public class C4001i extends AbstractC41861gz5 {
        public C4001i(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: JG6$j */
    /* loaded from: classes.dex */
    public class C4002j extends AbstractC41861gz5 {
        public C4002j(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: JG6$k */
    /* loaded from: classes.dex */
    public class C4003k extends AbstractC41861gz5 {
        public C4003k(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: JG6$l */
    /* loaded from: classes.dex */
    public class C4004l extends AbstractC41861gz5 {
        public C4004l(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: JG6$m */
    /* loaded from: classes.dex */
    public class C4005m extends AbstractC41861gz5 {
        public C4005m(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public JG6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f17244a = abstractC32563Eb5;
        this.f17245b = new C3997e(abstractC32563Eb5);
        this.f17246c = new C3998f(abstractC32563Eb5);
        this.f17247d = new C3999g(abstractC32563Eb5);
        this.f17248e = new C4000h(abstractC32563Eb5);
        this.f17249f = new C4001i(abstractC32563Eb5);
        this.f17250g = new C4002j(abstractC32563Eb5);
        this.f17251h = new C4003k(abstractC32563Eb5);
        this.f17252i = new C4004l(abstractC32563Eb5);
        this.f17253j = new C4005m(abstractC32563Eb5);
        this.f17254k = new C3993a(abstractC32563Eb5);
        this.f17255l = new C3994b(abstractC32563Eb5);
        this.f17256m = new C3995c(abstractC32563Eb5);
        this.f17257n = new C3996d(abstractC32563Eb5);
    }

    /* renamed from: v */
    public static List<Class<?>> m100746v() {
        return Collections.emptyList();
    }

    @Override // p000.IG6
    /* renamed from: a */
    public List<String> mo100767a(String str) {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
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

    @Override // p000.IG6
    /* renamed from: b */
    public UC6.EnumC8214a mo100766b(String str) {
        Integer valueOf;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f17244a.m108731b();
        UC6.EnumC8214a enumC8214a = null;
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            if (m102673c.moveToFirst()) {
                if (m102673c.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(m102673c.getInt(0));
                }
                if (valueOf != null) {
                    PG6 pg6 = PG6.f28178a;
                    enumC8214a = PG6.m90530f(valueOf.intValue());
                }
            }
            return enumC8214a;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.IG6
    /* renamed from: c */
    public void mo100765c(String str, long j) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17251h.m37254b();
        m37254b.mo20956S0(1, j);
        if (str == null) {
            m37254b.mo20954m1(2);
        } else {
            m37254b.mo20958G0(2, str);
        }
        this.f17244a.m108730c();
        try {
            m37254b.mo17482M();
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
            this.f17251h.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: d */
    public List<C12124b> mo100764d(String str) {
        byte[] blob;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    blob = null;
                } else {
                    blob = m102673c.getBlob(0);
                }
                arrayList.add(C12124b.m65587g(blob));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.IG6
    public void delete(String str) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17247d.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f17244a.m108730c();
        try {
            m37254b.mo17482M();
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
            this.f17247d.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: e */
    public List<HG6> mo100763e(int i) {
        C33265Hb5 c33265Hb5;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        m103680c.mo20956S0(1, i);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                int i7 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j = m102673c.getLong(m41645e7);
                    long j2 = m102673c.getLong(m41645e8);
                    long j3 = m102673c.getLong(m41645e9);
                    int i8 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j4 = m102673c.getLong(m41645e12);
                    long j5 = m102673c.getLong(m41645e13);
                    int i9 = i7;
                    long j6 = m102673c.getLong(i9);
                    int i10 = m41645e;
                    int i11 = m41645e15;
                    long j7 = m102673c.getLong(i11);
                    m41645e15 = i11;
                    int i12 = m41645e16;
                    if (m102673c.getInt(i12) != 0) {
                        m41645e16 = i12;
                        i2 = m41645e17;
                        z = true;
                    } else {
                        m41645e16 = i12;
                        i2 = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i2));
                    m41645e17 = i2;
                    int i13 = m41645e18;
                    int i14 = m102673c.getInt(i13);
                    m41645e18 = i13;
                    int i15 = m41645e19;
                    int i16 = m102673c.getInt(i15);
                    m41645e19 = i15;
                    int i17 = m41645e20;
                    S73 m90532d = PG6.m90532d(m102673c.getInt(i17));
                    m41645e20 = i17;
                    int i18 = m41645e21;
                    if (m102673c.getInt(i18) != 0) {
                        m41645e21 = i18;
                        i3 = m41645e22;
                        z2 = true;
                    } else {
                        m41645e21 = i18;
                        i3 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        m41645e22 = i3;
                        i4 = m41645e23;
                        z3 = true;
                    } else {
                        m41645e22 = i3;
                        i4 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e23 = i4;
                        i5 = m41645e24;
                        z4 = true;
                    } else {
                        m41645e23 = i4;
                        i5 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i5) != 0) {
                        m41645e24 = i5;
                        i6 = m41645e25;
                        z5 = true;
                    } else {
                        m41645e24 = i5;
                        i6 = m41645e25;
                        z5 = false;
                    }
                    long j8 = m102673c.getLong(i6);
                    m41645e25 = i6;
                    int i19 = m41645e26;
                    long j9 = m102673c.getLong(i19);
                    m41645e26 = i19;
                    int i20 = m41645e27;
                    if (m102673c.isNull(i20)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(i20);
                    }
                    m41645e27 = i20;
                    arrayList.add(new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j, j2, j3, new C44821lz0(m90532d, z2, z3, z4, z5, j8, j9, PG6.m90534b(blob3)), i8, m90533c, j4, j5, j6, j7, z, m90531e, i14, i16));
                    m41645e = i10;
                    i7 = i9;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: f */
    public boolean mo100762f() {
        boolean z = false;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            if (m102673c.moveToFirst()) {
                if (m102673c.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.IG6
    /* renamed from: g */
    public int mo100761g(String str) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17253j.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f17244a.m108730c();
        try {
            int mo17482M = m37254b.mo17482M();
            this.f17244a.m108734A();
            return mo17482M;
        } finally {
            this.f17244a.m108728g();
            this.f17253j.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: h */
    public void mo100760h(String str) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17249f.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f17244a.m108730c();
        try {
            m37254b.mo17482M();
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
            this.f17249f.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: i */
    public List<HG6> mo100759i(long j) {
        C33265Hb5 c33265Hb5;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        m103680c.mo20956S0(1, j);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                int i6 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j2 = m102673c.getLong(m41645e7);
                    long j3 = m102673c.getLong(m41645e8);
                    long j4 = m102673c.getLong(m41645e9);
                    int i7 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j5 = m102673c.getLong(m41645e12);
                    long j6 = m102673c.getLong(m41645e13);
                    int i8 = i6;
                    long j7 = m102673c.getLong(i8);
                    int i9 = m41645e;
                    int i10 = m41645e15;
                    long j8 = m102673c.getLong(i10);
                    m41645e15 = i10;
                    int i11 = m41645e16;
                    if (m102673c.getInt(i11) != 0) {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = true;
                    } else {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i));
                    m41645e17 = i;
                    int i12 = m41645e18;
                    int i13 = m102673c.getInt(i12);
                    m41645e18 = i12;
                    int i14 = m41645e19;
                    int i15 = m102673c.getInt(i14);
                    m41645e19 = i14;
                    int i16 = m41645e20;
                    S73 m90532d = PG6.m90532d(m102673c.getInt(i16));
                    m41645e20 = i16;
                    int i17 = m41645e21;
                    if (m102673c.getInt(i17) != 0) {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = true;
                    } else {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i2) != 0) {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = true;
                    } else {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = true;
                    } else {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = true;
                    } else {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = false;
                    }
                    long j9 = m102673c.getLong(i5);
                    m41645e25 = i5;
                    int i18 = m41645e26;
                    long j10 = m102673c.getLong(i18);
                    m41645e26 = i18;
                    int i19 = m41645e27;
                    if (m102673c.isNull(i19)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(i19);
                    }
                    m41645e27 = i19;
                    arrayList.add(new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j2, j3, j4, new C44821lz0(m90532d, z2, z3, z4, z5, j9, j10, PG6.m90534b(blob3)), i7, m90533c, j5, j6, j7, j8, z, m90531e, i13, i15));
                    m41645e = i9;
                    i6 = i8;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: j */
    public int mo100758j(UC6.EnumC8214a enumC8214a, String str) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17248e.m37254b();
        m37254b.mo20956S0(1, PG6.m90526j(enumC8214a));
        if (str == null) {
            m37254b.mo20954m1(2);
        } else {
            m37254b.mo20958G0(2, str);
        }
        this.f17244a.m108730c();
        try {
            int mo17482M = m37254b.mo17482M();
            this.f17244a.m108734A();
            return mo17482M;
        } finally {
            this.f17244a.m108728g();
            this.f17248e.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: k */
    public List<HG6> mo100757k() {
        C33265Hb5 c33265Hb5;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                int i6 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j = m102673c.getLong(m41645e7);
                    long j2 = m102673c.getLong(m41645e8);
                    long j3 = m102673c.getLong(m41645e9);
                    int i7 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j4 = m102673c.getLong(m41645e12);
                    long j5 = m102673c.getLong(m41645e13);
                    int i8 = i6;
                    long j6 = m102673c.getLong(i8);
                    int i9 = m41645e;
                    int i10 = m41645e15;
                    long j7 = m102673c.getLong(i10);
                    m41645e15 = i10;
                    int i11 = m41645e16;
                    if (m102673c.getInt(i11) != 0) {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = true;
                    } else {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i));
                    m41645e17 = i;
                    int i12 = m41645e18;
                    int i13 = m102673c.getInt(i12);
                    m41645e18 = i12;
                    int i14 = m41645e19;
                    int i15 = m102673c.getInt(i14);
                    m41645e19 = i14;
                    int i16 = m41645e20;
                    S73 m90532d = PG6.m90532d(m102673c.getInt(i16));
                    m41645e20 = i16;
                    int i17 = m41645e21;
                    if (m102673c.getInt(i17) != 0) {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = true;
                    } else {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i2) != 0) {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = true;
                    } else {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = true;
                    } else {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = true;
                    } else {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = false;
                    }
                    long j8 = m102673c.getLong(i5);
                    m41645e25 = i5;
                    int i18 = m41645e26;
                    long j9 = m102673c.getLong(i18);
                    m41645e26 = i18;
                    int i19 = m41645e27;
                    if (m102673c.isNull(i19)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(i19);
                    }
                    m41645e27 = i19;
                    arrayList.add(new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j, j2, j3, new C44821lz0(m90532d, z2, z3, z4, z5, j8, j9, PG6.m90534b(blob3)), i7, m90533c, j4, j5, j6, j7, z, m90531e, i13, i15));
                    m41645e = i9;
                    i6 = i8;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: l */
    public HG6 mo100756l(String str) {
        C33265Hb5 c33265Hb5;
        HG6 hg6;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j = m102673c.getLong(m41645e7);
                    long j2 = m102673c.getLong(m41645e8);
                    long j3 = m102673c.getLong(m41645e9);
                    int i6 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j4 = m102673c.getLong(m41645e12);
                    long j5 = m102673c.getLong(m41645e13);
                    long j6 = m102673c.getLong(m41645e14);
                    long j7 = m102673c.getLong(m41645e15);
                    if (m102673c.getInt(m41645e16) != 0) {
                        i = m41645e17;
                        z = true;
                    } else {
                        i = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i));
                    int i7 = m102673c.getInt(m41645e18);
                    int i8 = m102673c.getInt(m41645e19);
                    S73 m90532d = PG6.m90532d(m102673c.getInt(m41645e20));
                    if (m102673c.getInt(m41645e21) != 0) {
                        i2 = m41645e22;
                        z2 = true;
                    } else {
                        i2 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i2) != 0) {
                        i3 = m41645e23;
                        z3 = true;
                    } else {
                        i3 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        i4 = m41645e24;
                        z4 = true;
                    } else {
                        i4 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        i5 = m41645e25;
                        z5 = true;
                    } else {
                        i5 = m41645e25;
                        z5 = false;
                    }
                    long j8 = m102673c.getLong(i5);
                    long j9 = m102673c.getLong(m41645e26);
                    if (m102673c.isNull(m41645e27)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(m41645e27);
                    }
                    hg6 = new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j, j2, j3, new C44821lz0(m90532d, z2, z3, z4, z5, j8, j9, PG6.m90534b(blob3)), i6, m90533c, j4, j5, j6, j7, z, m90531e, i7, i8);
                } else {
                    hg6 = null;
                }
                m102673c.close();
                c33265Hb5.release();
                return hg6;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: m */
    public void mo100755m(HG6 hg6) {
        this.f17244a.m108731b();
        this.f17244a.m108730c();
        try {
            this.f17245b.m61088k(hg6);
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
        }
    }

    @Override // p000.IG6
    /* renamed from: n */
    public int mo100754n() {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17255l.m37254b();
        this.f17244a.m108730c();
        try {
            int mo17482M = m37254b.mo17482M();
            this.f17244a.m108734A();
            return mo17482M;
        } finally {
            this.f17244a.m108728g();
            this.f17255l.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: o */
    public int mo100753o(String str, long j) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17254k.m37254b();
        m37254b.mo20956S0(1, j);
        if (str == null) {
            m37254b.mo20954m1(2);
        } else {
            m37254b.mo20958G0(2, str);
        }
        this.f17244a.m108730c();
        try {
            int mo17482M = m37254b.mo17482M();
            this.f17244a.m108734A();
            return mo17482M;
        } finally {
            this.f17244a.m108728g();
            this.f17254k.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: p */
    public List<HG6.C3120b> mo100752p(String str) {
        String string;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                arrayList.add(new HG6.C3120b(string, PG6.m90530f(m102673c.getInt(1))));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.IG6
    /* renamed from: q */
    public List<HG6> mo100751q(int i) {
        C33265Hb5 c33265Hb5;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m103680c.mo20956S0(1, i);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                int i7 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j = m102673c.getLong(m41645e7);
                    long j2 = m102673c.getLong(m41645e8);
                    long j3 = m102673c.getLong(m41645e9);
                    int i8 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j4 = m102673c.getLong(m41645e12);
                    long j5 = m102673c.getLong(m41645e13);
                    int i9 = i7;
                    long j6 = m102673c.getLong(i9);
                    int i10 = m41645e;
                    int i11 = m41645e15;
                    long j7 = m102673c.getLong(i11);
                    m41645e15 = i11;
                    int i12 = m41645e16;
                    if (m102673c.getInt(i12) != 0) {
                        m41645e16 = i12;
                        i2 = m41645e17;
                        z = true;
                    } else {
                        m41645e16 = i12;
                        i2 = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i2));
                    m41645e17 = i2;
                    int i13 = m41645e18;
                    int i14 = m102673c.getInt(i13);
                    m41645e18 = i13;
                    int i15 = m41645e19;
                    int i16 = m102673c.getInt(i15);
                    m41645e19 = i15;
                    int i17 = m41645e20;
                    S73 m90532d = PG6.m90532d(m102673c.getInt(i17));
                    m41645e20 = i17;
                    int i18 = m41645e21;
                    if (m102673c.getInt(i18) != 0) {
                        m41645e21 = i18;
                        i3 = m41645e22;
                        z2 = true;
                    } else {
                        m41645e21 = i18;
                        i3 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        m41645e22 = i3;
                        i4 = m41645e23;
                        z3 = true;
                    } else {
                        m41645e22 = i3;
                        i4 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e23 = i4;
                        i5 = m41645e24;
                        z4 = true;
                    } else {
                        m41645e23 = i4;
                        i5 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i5) != 0) {
                        m41645e24 = i5;
                        i6 = m41645e25;
                        z5 = true;
                    } else {
                        m41645e24 = i5;
                        i6 = m41645e25;
                        z5 = false;
                    }
                    long j8 = m102673c.getLong(i6);
                    m41645e25 = i6;
                    int i19 = m41645e26;
                    long j9 = m102673c.getLong(i19);
                    m41645e26 = i19;
                    int i20 = m41645e27;
                    if (m102673c.isNull(i20)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(i20);
                    }
                    m41645e27 = i20;
                    arrayList.add(new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j, j2, j3, new C44821lz0(m90532d, z2, z3, z4, z5, j8, j9, PG6.m90534b(blob3)), i8, m90533c, j4, j5, j6, j7, z, m90531e, i14, i16));
                    m41645e = i10;
                    i7 = i9;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: r */
    public void mo100750r(HG6 hg6) {
        this.f17244a.m108731b();
        this.f17244a.m108730c();
        try {
            this.f17246c.m64207j(hg6);
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
        }
    }

    @Override // p000.IG6
    /* renamed from: s */
    public void mo100749s(String str, C12124b c12124b) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17250g.m37254b();
        byte[] m65582l = C12124b.m65582l(c12124b);
        if (m65582l == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20955X0(1, m65582l);
        }
        if (str == null) {
            m37254b.mo20954m1(2);
        } else {
            m37254b.mo20958G0(2, str);
        }
        this.f17244a.m108730c();
        try {
            m37254b.mo17482M();
            this.f17244a.m108734A();
        } finally {
            this.f17244a.m108728g();
            this.f17250g.m37249h(m37254b);
        }
    }

    @Override // p000.IG6
    /* renamed from: t */
    public List<HG6> mo100748t() {
        C33265Hb5 c33265Hb5;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM workspec WHERE state=1", 0);
        this.f17244a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f17244a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "id");
            int m41645e2 = C40824fF0.m41645e(m102673c, TransferTable.COLUMN_STATE);
            int m41645e3 = C40824fF0.m41645e(m102673c, "worker_class_name");
            int m41645e4 = C40824fF0.m41645e(m102673c, "input_merger_class_name");
            int m41645e5 = C40824fF0.m41645e(m102673c, "input");
            int m41645e6 = C40824fF0.m41645e(m102673c, "output");
            int m41645e7 = C40824fF0.m41645e(m102673c, "initial_delay");
            int m41645e8 = C40824fF0.m41645e(m102673c, "interval_duration");
            int m41645e9 = C40824fF0.m41645e(m102673c, "flex_duration");
            int m41645e10 = C40824fF0.m41645e(m102673c, "run_attempt_count");
            int m41645e11 = C40824fF0.m41645e(m102673c, "backoff_policy");
            int m41645e12 = C40824fF0.m41645e(m102673c, "backoff_delay_duration");
            int m41645e13 = C40824fF0.m41645e(m102673c, "last_enqueue_time");
            int m41645e14 = C40824fF0.m41645e(m102673c, "minimum_retention_duration");
            c33265Hb5 = m103680c;
            try {
                int m41645e15 = C40824fF0.m41645e(m102673c, "schedule_requested_at");
                int m41645e16 = C40824fF0.m41645e(m102673c, "run_in_foreground");
                int m41645e17 = C40824fF0.m41645e(m102673c, "out_of_quota_policy");
                int m41645e18 = C40824fF0.m41645e(m102673c, "period_count");
                int m41645e19 = C40824fF0.m41645e(m102673c, "generation");
                int m41645e20 = C40824fF0.m41645e(m102673c, "required_network_type");
                int m41645e21 = C40824fF0.m41645e(m102673c, "requires_charging");
                int m41645e22 = C40824fF0.m41645e(m102673c, "requires_device_idle");
                int m41645e23 = C40824fF0.m41645e(m102673c, "requires_battery_not_low");
                int m41645e24 = C40824fF0.m41645e(m102673c, "requires_storage_not_low");
                int m41645e25 = C40824fF0.m41645e(m102673c, "trigger_content_update_delay");
                int m41645e26 = C40824fF0.m41645e(m102673c, "trigger_max_content_delay");
                int m41645e27 = C40824fF0.m41645e(m102673c, "content_uri_triggers");
                int i6 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    UC6.EnumC8214a m90530f = PG6.m90530f(m102673c.getInt(m41645e2));
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        blob = null;
                    } else {
                        blob = m102673c.getBlob(m41645e5);
                    }
                    C12124b m65587g = C12124b.m65587g(blob);
                    if (m102673c.isNull(m41645e6)) {
                        blob2 = null;
                    } else {
                        blob2 = m102673c.getBlob(m41645e6);
                    }
                    C12124b m65587g2 = C12124b.m65587g(blob2);
                    long j = m102673c.getLong(m41645e7);
                    long j2 = m102673c.getLong(m41645e8);
                    long j3 = m102673c.getLong(m41645e9);
                    int i7 = m102673c.getInt(m41645e10);
                    EnumC22516gw m90533c = PG6.m90533c(m102673c.getInt(m41645e11));
                    long j4 = m102673c.getLong(m41645e12);
                    long j5 = m102673c.getLong(m41645e13);
                    int i8 = i6;
                    long j6 = m102673c.getLong(i8);
                    int i9 = m41645e;
                    int i10 = m41645e15;
                    long j7 = m102673c.getLong(i10);
                    m41645e15 = i10;
                    int i11 = m41645e16;
                    if (m102673c.getInt(i11) != 0) {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = true;
                    } else {
                        m41645e16 = i11;
                        i = m41645e17;
                        z = false;
                    }
                    EnumC37214Xy3 m90531e = PG6.m90531e(m102673c.getInt(i));
                    m41645e17 = i;
                    int i12 = m41645e18;
                    int i13 = m102673c.getInt(i12);
                    m41645e18 = i12;
                    int i14 = m41645e19;
                    int i15 = m102673c.getInt(i14);
                    m41645e19 = i14;
                    int i16 = m41645e20;
                    S73 m90532d = PG6.m90532d(m102673c.getInt(i16));
                    m41645e20 = i16;
                    int i17 = m41645e21;
                    if (m102673c.getInt(i17) != 0) {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = true;
                    } else {
                        m41645e21 = i17;
                        i2 = m41645e22;
                        z2 = false;
                    }
                    if (m102673c.getInt(i2) != 0) {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = true;
                    } else {
                        m41645e22 = i2;
                        i3 = m41645e23;
                        z3 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = true;
                    } else {
                        m41645e23 = i3;
                        i4 = m41645e24;
                        z4 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = true;
                    } else {
                        m41645e24 = i4;
                        i5 = m41645e25;
                        z5 = false;
                    }
                    long j8 = m102673c.getLong(i5);
                    m41645e25 = i5;
                    int i18 = m41645e26;
                    long j9 = m102673c.getLong(i18);
                    m41645e26 = i18;
                    int i19 = m41645e27;
                    if (m102673c.isNull(i19)) {
                        blob3 = null;
                    } else {
                        blob3 = m102673c.getBlob(i19);
                    }
                    m41645e27 = i19;
                    arrayList.add(new HG6(string, m90530f, string2, string3, m65587g, m65587g2, j, j2, j3, new C44821lz0(m90532d, z2, z3, z4, z5, j8, j9, PG6.m90534b(blob3)), i7, m90533c, j4, j5, j6, j7, z, m90531e, i13, i15));
                    m41645e = i9;
                    i6 = i8;
                }
                m102673c.close();
                c33265Hb5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m102673c.close();
                c33265Hb5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c33265Hb5 = m103680c;
        }
    }

    @Override // p000.IG6
    /* renamed from: u */
    public int mo100747u(String str) {
        this.f17244a.m108731b();
        InterfaceC47496qV5 m37254b = this.f17252i.m37254b();
        if (str == null) {
            m37254b.mo20954m1(1);
        } else {
            m37254b.mo20958G0(1, str);
        }
        this.f17244a.m108730c();
        try {
            int mo17482M = m37254b.mo17482M();
            this.f17244a.m108734A();
            return mo17482M;
        } finally {
            this.f17244a.m108728g();
            this.f17252i.m37249h(m37254b);
        }
    }
}
