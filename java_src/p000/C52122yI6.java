package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: yI6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52122yI6 extends AbstractC51529xI6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f119313a;

    /* renamed from: b */
    public final AbstractC39268cf1<ZoneAssignmentGroup> f119314b;

    /* renamed from: c */
    public final AbstractC41861gz5 f119315c;

    /* renamed from: yI6$a */
    /* loaded from: classes4.dex */
    public class C30545a extends AbstractC39268cf1<ZoneAssignmentGroup> {
        public C30545a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `zone_assignment_groups` (`title`,`color`,`description`,`empty_text`,`release_assignments`,`capped_zone_reservation_groups`) VALUES (?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ZoneAssignmentGroup zoneAssignmentGroup) {
            if (zoneAssignmentGroup.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneAssignmentGroup.getTitle());
            }
            Converters converters = Converters.f66822a;
            String m55270n = Converters.m55270n(zoneAssignmentGroup.getColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55270n);
            }
            if (zoneAssignmentGroup.getDescription() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, zoneAssignmentGroup.getDescription());
            }
            if (zoneAssignmentGroup.getEmptyText() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, zoneAssignmentGroup.getEmptyText());
            }
            C50936wI6 c50936wI6 = C50936wI6.f115780a;
            String m7025d = C50936wI6.m7025d(zoneAssignmentGroup.getReleaseAssignments());
            if (m7025d == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m7025d);
            }
            String m7028a = C50936wI6.m7028a(zoneAssignmentGroup.getCappedZoneReservationGroups());
            if (m7028a == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m7028a);
            }
        }
    }

    /* renamed from: yI6$b */
    /* loaded from: classes4.dex */
    public class C30546b extends AbstractC41861gz5 {
        public C30546b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM zone_assignment_groups";
        }
    }

    /* renamed from: yI6$c */
    /* loaded from: classes4.dex */
    public class CallableC30547c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f119318b;

        public CallableC30547c(List list) {
            this.f119318b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C52122yI6.this.f119313a.m108730c();
            try {
                C52122yI6.this.f119314b.m61089j(this.f119318b);
                C52122yI6.this.f119313a.m108734A();
                C52122yI6.this.f119313a.m108728g();
                return null;
            } catch (Throwable th) {
                C52122yI6.this.f119313a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: yI6$d */
    /* loaded from: classes4.dex */
    public class CallableC30548d implements Callable<Void> {
        public CallableC30548d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C52122yI6.this.f119315c.m37254b();
            C52122yI6.this.f119313a.m108730c();
            try {
                m37254b.mo17482M();
                C52122yI6.this.f119313a.m108734A();
                C52122yI6.this.f119313a.m108728g();
                C52122yI6.this.f119315c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C52122yI6.this.f119313a.m108728g();
                C52122yI6.this.f119315c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: yI6$e */
    /* loaded from: classes4.dex */
    public class CallableC30549e implements Callable<List<ZoneAssignmentGroup>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f119321b;

        public CallableC30549e(C33265Hb5 c33265Hb5) {
            this.f119321b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<ZoneAssignmentGroup> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            Cursor m102673c = IF0.m102673c(C52122yI6.this.f119313a, this.f119321b, false, null);
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
                    ThemedColors m55266r = Converters.m55266r(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    if (m102673c.isNull(3)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(3);
                    }
                    if (m102673c.isNull(4)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(4);
                    }
                    List<ZoneAssignmentReleaseAssignment> m7023f = C50936wI6.m7023f(string5);
                    if (m102673c.isNull(5)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(5);
                    }
                    arrayList.add(new ZoneAssignmentGroup(string, m55266r, string3, string4, m7023f, C50936wI6.m7024e(string6)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f119321b.release();
        }
    }

    /* renamed from: yI6$f */
    /* loaded from: classes4.dex */
    public class CallableC30550f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f119323b;

        public CallableC30550f(List list) {
            this.f119323b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM zone_assignment_groups WHERE title NOT IN (");
            C42725iS5.m33906a(m33905b, this.f119323b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C52122yI6.this.f119313a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f119323b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C52122yI6.this.f119313a.m108730c();
            try {
                m108729d.mo17482M();
                C52122yI6.this.f119313a.m108734A();
                C52122yI6.this.f119313a.m108728g();
                return null;
            } catch (Throwable th) {
                C52122yI6.this.f119313a.m108728g();
                throw th;
            }
        }
    }

    public C52122yI6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f119313a = abstractC32563Eb5;
        this.f119314b = new C30545a(abstractC32563Eb5);
        this.f119315c = new C30546b(abstractC32563Eb5);
    }

    /* renamed from: h */
    public static List<Class<?>> m3702h() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC51529xI6
    /* renamed from: a */
    public AbstractC23461c mo3709a() {
        return AbstractC23461c.m33078H(new CallableC30548d());
    }

    @Override // p000.AbstractC51529xI6
    /* renamed from: b */
    public AbstractC23461c mo3708b(List<ZoneAssignmentGroup> list) {
        return AbstractC23461c.m33078H(new CallableC30547c(list));
    }

    @Override // p000.AbstractC51529xI6
    /* renamed from: c */
    public Observable<List<ZoneAssignmentGroup>> mo3707c() {
        return C37504Ze5.m72808c(this.f119313a, false, new String[]{"zone_assignment_groups"}, new CallableC30549e(C33265Hb5.m103680c("SELECT `zone_assignment_groups`.`title` AS `title`, `zone_assignment_groups`.`color` AS `color`, `zone_assignment_groups`.`description` AS `description`, `zone_assignment_groups`.`empty_text` AS `empty_text`, `zone_assignment_groups`.`release_assignments` AS `release_assignments`, `zone_assignment_groups`.`capped_zone_reservation_groups` AS `capped_zone_reservation_groups` FROM zone_assignment_groups", 0)));
    }

    @Override // p000.AbstractC51529xI6
    /* renamed from: d */
    public AbstractC23461c mo3706d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC30550f(list));
    }
}
