package p000;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import ch.qos.logback.classic.spi.CallerData;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.ZoneData;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.ZoneRegion;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: EI6 */
/* loaded from: classes4.dex */
public final class EI6 extends CI6 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f7220a;

    /* renamed from: b */
    public final AbstractC39268cf1<ZoneData> f7221b;

    /* renamed from: c */
    public final AbstractC39268cf1<ZoneRegion> f7222c;

    /* renamed from: d */
    public final AbstractC38675bf1<ZoneData> f7223d;

    /* renamed from: e */
    public final AbstractC38675bf1<ZoneRegion> f7224e;

    /* renamed from: f */
    public final AbstractC41861gz5 f7225f;

    /* renamed from: g */
    public final AbstractC41861gz5 f7226g;

    /* renamed from: h */
    public final AbstractC41861gz5 f7227h;

    /* renamed from: EI6$a */
    /* loaded from: classes4.dex */
    public class CallableC1778a implements Callable<Void> {
        public CallableC1778a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = EI6.this.f7227h.m37254b();
            EI6.this.f7220a.m108730c();
            try {
                m37254b.mo17482M();
                EI6.this.f7220a.m108734A();
                EI6.this.f7220a.m108728g();
                EI6.this.f7227h.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                EI6.this.f7220a.m108728g();
                EI6.this.f7227h.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: EI6$b */
    /* loaded from: classes4.dex */
    public class CallableC1779b implements Callable<List<String>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f7229b;

        public CallableC1779b(C33265Hb5 c33265Hb5) {
            this.f7229b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<String> call() throws Exception {
            String string;
            Cursor m102673c = IF0.m102673c(EI6.this.f7220a, this.f7229b, false, null);
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
            }
        }

        public void finalize() {
            this.f7229b.release();
        }
    }

    /* renamed from: EI6$c */
    /* loaded from: classes4.dex */
    public class CallableC1780c implements Callable<List<ZonePolygonable>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f7231b;

        public CallableC1780c(C33265Hb5 c33265Hb5) {
            this.f7231b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<ZonePolygonable> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(EI6.this.f7220a, this.f7231b, false, null);
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
                    Polygon m114113d = BI6.m114113d(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    arrayList.add(new ZonePolygonable(string, m114113d, BI6.m114111f(string3), EI6.this.m109231A(m102673c.getString(3))));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f7231b.release();
        }
    }

    /* renamed from: EI6$d */
    /* loaded from: classes4.dex */
    public class CallableC1781d implements Callable<List<ZoneMarker>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f7233b;

        public CallableC1781d(C33265Hb5 c33265Hb5) {
            this.f7233b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<ZoneMarker> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(EI6.this.f7220a, this.f7233b, false, null);
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
                    Point m55268p = Converters.m55268p(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    arrayList.add(new ZoneMarker(string, m55268p, BI6.m114112e(string3), EI6.this.m109231A(m102673c.getString(3))));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f7233b.release();
        }
    }

    /* renamed from: EI6$e */
    /* loaded from: classes4.dex */
    public class CallableC1782e implements Callable<ZoneOverlayAnalytics> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f7235b;

        public CallableC1782e(C33265Hb5 c33265Hb5) {
            this.f7235b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ZoneOverlayAnalytics call() throws Exception {
            String string;
            ZoneOverlayAnalytics zoneOverlayAnalytics = null;
            String string2 = null;
            Cursor m102673c = IF0.m102673c(EI6.this.f7220a, this.f7235b, false, null);
            try {
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    if (!m102673c.isNull(2)) {
                        string2 = m102673c.getString(2);
                    }
                    zoneOverlayAnalytics = new ZoneOverlayAnalytics(string, BI6.m114111f(string2));
                }
                if (zoneOverlayAnalytics != null) {
                    return zoneOverlayAnalytics;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.f7235b.mo19174a());
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f7235b.release();
        }
    }

    /* renamed from: EI6$f */
    /* loaded from: classes4.dex */
    public class CallableC1783f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f7237b;

        /* renamed from: c */
        public final /* synthetic */ DateTime f7238c;

        public CallableC1783f(List list, DateTime dateTime) {
            this.f7237b = list;
            this.f7238c = dateTime;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM zone_data WHERE zone_id NOT IN (");
            int size = this.f7237b.size();
            C42725iS5.m33906a(m33905b, size);
            m33905b.append(") AND data_updated_at < ");
            m33905b.append(CallerData.f61059NA);
            InterfaceC47496qV5 m108729d = EI6.this.f7220a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f7237b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            int i2 = size + 1;
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(this.f7238c);
            if (m55279e == null) {
                m108729d.mo20954m1(i2);
            } else {
                m108729d.mo20958G0(i2, m55279e);
            }
            EI6.this.f7220a.m108730c();
            try {
                m108729d.mo17482M();
                EI6.this.f7220a.m108734A();
                EI6.this.f7220a.m108728g();
                return null;
            } catch (Throwable th) {
                EI6.this.f7220a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: EI6$g */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C1784g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7240a;

        static {
            int[] iArr = new int[OperatorMapZoneSelectability.values().length];
            f7240a = iArr;
            try {
                iArr[OperatorMapZoneSelectability.NOT_SELECTABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7240a[OperatorMapZoneSelectability.SELECTABLE_ANNOTATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7240a[OperatorMapZoneSelectability.SELECTABLE_OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7240a[OperatorMapZoneSelectability.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: EI6$h */
    /* loaded from: classes4.dex */
    public class C1785h extends AbstractC39268cf1<ZoneData> {
        public C1785h(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `zone_data` (`zone_id`,`overlay`,`annotation`,`selectability`,`data_updated_at`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ZoneData zoneData) {
            if (zoneData.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneData.getZoneId());
            }
            BI6 bi6 = BI6.f2187a;
            String m114114c = BI6.m114114c(zoneData.getOverlay());
            if (m114114c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m114114c);
            }
            String m114115b = BI6.m114115b(zoneData.getAnnotation());
            if (m114115b == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m114115b);
            }
            if (zoneData.getSelectability() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, EI6.this.m109201z(zoneData.getSelectability()));
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(zoneData.getDataUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55279e);
            }
        }
    }

    /* renamed from: EI6$i */
    /* loaded from: classes4.dex */
    public class C1786i extends AbstractC39268cf1<ZoneRegion> {
        public C1786i(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `zone_regions` (`zone_id`,`region`,`center_point`,`region_updated_at`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ZoneRegion zoneRegion) {
            if (zoneRegion.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneRegion.getZoneId());
            }
            BI6 bi6 = BI6.f2187a;
            String m114116a = BI6.m114116a(zoneRegion.getRegion());
            if (m114116a == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m114116a);
            }
            Converters converters = Converters.f66822a;
            String m55275i = Converters.m55275i(zoneRegion.getCenterPoint());
            if (m55275i == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55275i);
            }
            String m55279e = Converters.m55279e(zoneRegion.getRegionUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m55279e);
            }
        }
    }

    /* renamed from: EI6$j */
    /* loaded from: classes4.dex */
    public class C1787j extends AbstractC38675bf1<ZoneData> {
        public C1787j(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `zone_data` SET `zone_id` = ?,`overlay` = ?,`annotation` = ?,`selectability` = ?,`data_updated_at` = ? WHERE `zone_id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, ZoneData zoneData) {
            if (zoneData.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneData.getZoneId());
            }
            BI6 bi6 = BI6.f2187a;
            String m114114c = BI6.m114114c(zoneData.getOverlay());
            if (m114114c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m114114c);
            }
            String m114115b = BI6.m114115b(zoneData.getAnnotation());
            if (m114115b == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m114115b);
            }
            if (zoneData.getSelectability() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, EI6.this.m109201z(zoneData.getSelectability()));
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(zoneData.getDataUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55279e);
            }
            if (zoneData.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, zoneData.getZoneId());
            }
        }
    }

    /* renamed from: EI6$k */
    /* loaded from: classes4.dex */
    public class C1788k extends AbstractC38675bf1<ZoneRegion> {
        public C1788k(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `zone_regions` SET `zone_id` = ?,`region` = ?,`center_point` = ?,`region_updated_at` = ? WHERE `zone_id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, ZoneRegion zoneRegion) {
            if (zoneRegion.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, zoneRegion.getZoneId());
            }
            BI6 bi6 = BI6.f2187a;
            String m114116a = BI6.m114116a(zoneRegion.getRegion());
            if (m114116a == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m114116a);
            }
            Converters converters = Converters.f66822a;
            String m55275i = Converters.m55275i(zoneRegion.getCenterPoint());
            if (m55275i == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55275i);
            }
            String m55279e = Converters.m55279e(zoneRegion.getRegionUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m55279e);
            }
            if (zoneRegion.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, zoneRegion.getZoneId());
            }
        }
    }

    /* renamed from: EI6$l */
    /* loaded from: classes4.dex */
    public class C1789l extends AbstractC41861gz5 {
        public C1789l(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM zone_regions WHERE region_updated_at < ?";
        }
    }

    /* renamed from: EI6$m */
    /* loaded from: classes4.dex */
    public class C1790m extends AbstractC41861gz5 {
        public C1790m(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM zone_data";
        }
    }

    /* renamed from: EI6$n */
    /* loaded from: classes4.dex */
    public class C1791n extends AbstractC41861gz5 {
        public C1791n(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM zone_regions";
        }
    }

    /* renamed from: EI6$o */
    /* loaded from: classes4.dex */
    public class CallableC1792o implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ DateTime f7248b;

        public CallableC1792o(DateTime dateTime) {
            this.f7248b = dateTime;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = EI6.this.f7225f.m37254b();
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(this.f7248b);
            if (m55279e == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, m55279e);
            }
            EI6.this.f7220a.m108730c();
            try {
                m37254b.mo17482M();
                EI6.this.f7220a.m108734A();
                EI6.this.f7220a.m108728g();
                EI6.this.f7225f.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                EI6.this.f7220a.m108728g();
                EI6.this.f7225f.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: EI6$p */
    /* loaded from: classes4.dex */
    public class CallableC1793p implements Callable<Void> {
        public CallableC1793p() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = EI6.this.f7226g.m37254b();
            EI6.this.f7220a.m108730c();
            try {
                m37254b.mo17482M();
                EI6.this.f7220a.m108734A();
                EI6.this.f7220a.m108728g();
                EI6.this.f7226g.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                EI6.this.f7220a.m108728g();
                EI6.this.f7226g.m37249h(m37254b);
                throw th;
            }
        }
    }

    public EI6(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f7220a = abstractC32563Eb5;
        this.f7221b = new C1785h(abstractC32563Eb5);
        this.f7222c = new C1786i(abstractC32563Eb5);
        this.f7223d = new C1787j(abstractC32563Eb5);
        this.f7224e = new C1788k(abstractC32563Eb5);
        this.f7225f = new C1789l(abstractC32563Eb5);
        this.f7226g = new C1790m(abstractC32563Eb5);
        this.f7227h = new C1791n(abstractC32563Eb5);
    }

    /* renamed from: E */
    public static List<Class<?>> m109227E() {
        return Collections.emptyList();
    }

    /* renamed from: A */
    public final OperatorMapZoneSelectability m109231A(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1657609544:
                if (str.equals("SELECTABLE_ANNOTATION")) {
                    c = 0;
                    break;
                }
                break;
            case -312024734:
                if (str.equals("NOT_SELECTABLE")) {
                    c = 1;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 2;
                    break;
                }
                break;
            case 1378916679:
                if (str.equals("SELECTABLE_OVERLAY")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return OperatorMapZoneSelectability.SELECTABLE_ANNOTATION;
            case 1:
                return OperatorMapZoneSelectability.NOT_SELECTABLE;
            case 2:
                return OperatorMapZoneSelectability.UNKNOWN;
            case 3:
                return OperatorMapZoneSelectability.SELECTABLE_OVERLAY;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    @Override // p000.CI6
    /* renamed from: a */
    public AbstractC23461c mo109226a() {
        return AbstractC23461c.m33078H(new CallableC1793p());
    }

    @Override // p000.CI6
    /* renamed from: b */
    public AbstractC23461c mo109225b() {
        return AbstractC23461c.m33078H(new CallableC1778a());
    }

    @Override // p000.CI6
    /* renamed from: c */
    public AbstractC23442F<ZoneOverlayAnalytics> mo109224c(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("\n    SELECT regions.zone_id, regions.region, data.overlay, data.selectability \n    FROM zone_regions regions \n    INNER JOIN zone_data data ON regions.zone_id = data.zone_id \n    WHERE data.overlay IS NOT NULL \n        AND data.selectability IS NOT NULL\n        AND data.zone_id = ?\n  ", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC1782e(m103680c));
    }

    @Override // p000.CI6
    /* renamed from: d */
    public List<Long> mo109223d(ZoneData... zoneDataArr) {
        this.f7220a.m108731b();
        this.f7220a.m108730c();
        try {
            List<Long> m61084o = this.f7221b.m61084o(zoneDataArr);
            this.f7220a.m108734A();
            return m61084o;
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: e */
    public List<Long> mo109222e(ZoneRegion... zoneRegionArr) {
        this.f7220a.m108731b();
        this.f7220a.m108730c();
        try {
            List<Long> m61084o = this.f7222c.m61084o(zoneRegionArr);
            this.f7220a.m108734A();
            return m61084o;
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: f */
    public List<ZoneRegion> mo109221f(String... strArr) {
        String string;
        String string2;
        String string3;
        String string4;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT * FROM zone_regions WHERE zone_id NOT IN (");
        int length = strArr.length;
        C42725iS5.m33906a(m33905b, length);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), length + 0);
        int i = 1;
        for (String str : strArr) {
            if (str == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20958G0(i, str);
            }
            i++;
        }
        this.f7220a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f7220a, m103680c, false, null);
        try {
            int m41645e = C40824fF0.m41645e(m102673c, "zone_id");
            int m41645e2 = C40824fF0.m41645e(m102673c, "region");
            int m41645e3 = C40824fF0.m41645e(m102673c, "center_point");
            int m41645e4 = C40824fF0.m41645e(m102673c, "region_updated_at");
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
                Polygon m114113d = BI6.m114113d(string2);
                if (m102673c.isNull(m41645e3)) {
                    string3 = null;
                } else {
                    string3 = m102673c.getString(m41645e3);
                }
                Point m55268p = Converters.m55268p(string3);
                if (m102673c.isNull(m41645e4)) {
                    string4 = null;
                } else {
                    string4 = m102673c.getString(m41645e4);
                }
                arrayList.add(new ZoneRegion(string, m114113d, m55268p, Converters.m55278f(string4)));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.CI6
    /* renamed from: g */
    public void mo109220g(List<String> list) {
        this.f7220a.m108731b();
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("DELETE FROM zone_data WHERE zone_id IN (");
        C42725iS5.m33906a(m33905b, list.size());
        m33905b.append(")");
        InterfaceC47496qV5 m108729d = this.f7220a.m108729d(m33905b.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                m108729d.mo20954m1(i);
            } else {
                m108729d.mo20958G0(i, str);
            }
            i++;
        }
        this.f7220a.m108730c();
        try {
            m108729d.mo17482M();
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: h */
    public AbstractC23461c mo109219h(List<String> list, DateTime dateTime) {
        return AbstractC23461c.m33078H(new CallableC1783f(list, dateTime));
    }

    @Override // p000.CI6
    /* renamed from: i */
    public AbstractC23461c mo109218i(DateTime dateTime) {
        return AbstractC23461c.m33078H(new CallableC1792o(dateTime));
    }

    @Override // p000.CI6
    /* renamed from: j */
    public void mo109217j(List<String> list, List<Geolocation> list2) {
        this.f7220a.m108730c();
        try {
            super.mo109217j(list, list2);
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: k */
    public void mo109216k(ZoneData... zoneDataArr) {
        this.f7220a.m108731b();
        this.f7220a.m108730c();
        try {
            this.f7223d.m64205l(zoneDataArr);
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: l */
    public void mo109215l(ZoneRegion... zoneRegionArr) {
        this.f7220a.m108731b();
        this.f7220a.m108730c();
        try {
            this.f7224e.m64205l(zoneRegionArr);
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: m */
    public void mo109214m(ZoneData... zoneDataArr) {
        this.f7220a.m108730c();
        try {
            super.mo109214m(zoneDataArr);
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: n */
    public void mo109213n(ZoneRegion... zoneRegionArr) {
        this.f7220a.m108730c();
        try {
            super.mo109213n(zoneRegionArr);
            this.f7220a.m108734A();
        } finally {
            this.f7220a.m108728g();
        }
    }

    @Override // p000.CI6
    /* renamed from: o */
    public List<String> mo109212o(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT zone_id FROM zone_data WHERE rowid in (");
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
        this.f7220a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f7220a, m103680c, false, null);
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

    @Override // p000.CI6
    /* renamed from: p */
    public List<String> mo109211p(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT zone_id FROM zone_regions WHERE rowid in (");
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
        this.f7220a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f7220a, m103680c, false, null);
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

    @Override // p000.CI6
    /* renamed from: q */
    public AbstractC23442F<List<String>> mo109210q() {
        return C37504Ze5.m72806e(new CallableC1779b(C33265Hb5.m103680c("\n    SELECT data.zone_id \n    FROM zone_data data \n    LEFT JOIN zone_regions regions ON data.zone_id = regions.zone_id \n    WHERE regions.zone_id IS NULL\n  ", 0)));
    }

    @Override // p000.CI6
    /* renamed from: r */
    public Observable<List<ZoneMarker>> mo109209r() {
        return C37504Ze5.m72808c(this.f7220a, false, new String[]{"zone_data", "zone_regions"}, new CallableC1781d(C33265Hb5.m103680c("\n    SELECT data.zone_id, regions.center_point, data.annotation, data.selectability \n    FROM zone_data data \n    INNER JOIN zone_regions regions ON data.zone_id = regions.zone_id \n    WHERE regions.center_point IS NOT NULL\n        AND data.annotation IS NOT NULL\n        AND data.selectability IS NOT NULL\n  ", 0)));
    }

    @Override // p000.CI6
    /* renamed from: s */
    public Observable<List<ZonePolygonable>> mo109208s() {
        return C37504Ze5.m72808c(this.f7220a, false, new String[]{"zone_regions", "zone_data"}, new CallableC1780c(C33265Hb5.m103680c("\n    SELECT regions.zone_id, regions.region, data.overlay, data.selectability \n    FROM zone_regions regions \n    INNER JOIN zone_data data ON regions.zone_id = data.zone_id \n    WHERE data.overlay IS NOT NULL \n        AND data.selectability IS NOT NULL\n  ", 0)));
    }

    /* renamed from: z */
    public final String m109201z(OperatorMapZoneSelectability operatorMapZoneSelectability) {
        if (operatorMapZoneSelectability == null) {
            return null;
        }
        int i = C1784g.f7240a[operatorMapZoneSelectability.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "UNKNOWN";
                    }
                    throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + operatorMapZoneSelectability);
                }
                return "SELECTABLE_OVERLAY";
            }
            return "SELECTABLE_ANNOTATION";
        }
        return "NOT_SELECTABLE";
    }
}
