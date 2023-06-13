package p000;

import android.database.Cursor;
import ch.qos.logback.classic.spi.CallerData;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: gp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41757gp1 extends AbstractC41164fp1 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f84308a;

    /* renamed from: b */
    public final AbstractC39268cf1<FleetListVehicle> f84309b;

    /* renamed from: c */
    public final AbstractC41861gz5 f84310c;

    /* renamed from: gp1$a */
    /* loaded from: classes4.dex */
    public class C22475a extends AbstractC39268cf1<FleetListVehicle> {
        public C22475a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `fleet_list_vehicle` (`vehicle_id`,`title`,`icon`,`icon_color`,`icon_background_color`,`caption`,`caption_color`,`caption_2`,`caption_2_color`,`notification`,`complication`,`action`,`facet_index`,`background_color`,`list`,`fleet_id`,`section`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, FleetListVehicle fleetListVehicle) {
            if (fleetListVehicle.getVehicleId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, fleetListVehicle.getVehicleId());
            }
            if (fleetListVehicle.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, fleetListVehicle.getTitle());
            }
            Converters converters = Converters.f66822a;
            String m55274j = Converters.m55274j(fleetListVehicle.getIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55274j);
            }
            String m55270n = Converters.m55270n(fleetListVehicle.getIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m55270n);
            }
            String m55270n2 = Converters.m55270n(fleetListVehicle.getIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55270n2);
            }
            if (fleetListVehicle.getCaption() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, fleetListVehicle.getCaption());
            }
            String m55270n3 = Converters.m55270n(fleetListVehicle.getCaptionColor());
            if (m55270n3 == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55270n3);
            }
            if (fleetListVehicle.getCaption2() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, fleetListVehicle.getCaption2());
            }
            String m55270n4 = Converters.m55270n(fleetListVehicle.getCaption2Color());
            if (m55270n4 == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m55270n4);
            }
            if (fleetListVehicle.getNotification() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, fleetListVehicle.getNotification());
            }
            C50660vq1 c50660vq1 = C50660vq1.f114779a;
            String m7940k = C50660vq1.m7940k(fleetListVehicle.getComplication());
            if (m7940k == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m7940k);
            }
            String m7941j = C50660vq1.m7941j(fleetListVehicle.getAction());
            if (m7941j == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, m7941j);
            }
            String m7935p = C50660vq1.m7935p(fleetListVehicle.getFacetIndex());
            if (m7935p == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20958G0(13, m7935p);
            }
            String m55270n5 = Converters.m55270n(fleetListVehicle.getBackgroundColor());
            if (m55270n5 == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, m55270n5);
            }
            if (fleetListVehicle.getList() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, fleetListVehicle.getList());
            }
            if (fleetListVehicle.getFleetId() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, fleetListVehicle.getFleetId());
            }
            if (fleetListVehicle.getSection() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, fleetListVehicle.getSection());
            }
        }
    }

    /* renamed from: gp1$b */
    /* loaded from: classes4.dex */
    public class C22476b extends AbstractC41861gz5 {
        public C22476b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM fleet_list_vehicle";
        }
    }

    /* renamed from: gp1$c */
    /* loaded from: classes4.dex */
    public class CallableC22477c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ FleetListVehicle[] f84313b;

        public CallableC22477c(FleetListVehicle[] fleetListVehicleArr) {
            this.f84313b = fleetListVehicleArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C41757gp1.this.f84308a.m108730c();
            try {
                C41757gp1.this.f84309b.m61087l(this.f84313b);
                C41757gp1.this.f84308a.m108734A();
                C41757gp1.this.f84308a.m108728g();
                return null;
            } catch (Throwable th) {
                C41757gp1.this.f84308a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: gp1$d */
    /* loaded from: classes4.dex */
    public class CallableC22478d implements Callable<Void> {
        public CallableC22478d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C41757gp1.this.f84310c.m37254b();
            C41757gp1.this.f84308a.m108730c();
            try {
                m37254b.mo17482M();
                C41757gp1.this.f84308a.m108734A();
                C41757gp1.this.f84308a.m108728g();
                C41757gp1.this.f84310c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C41757gp1.this.f84308a.m108728g();
                C41757gp1.this.f84310c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: gp1$e */
    /* loaded from: classes4.dex */
    public class CallableC22479e implements Callable<List<FleetListVehicle>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f84316b;

        public CallableC22479e(C33265Hb5 c33265Hb5) {
            this.f84316b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetListVehicle> call() throws Exception {
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
            String string12;
            String string13;
            String string14;
            String string15;
            int i;
            String string16;
            int i2;
            String string17;
            Cursor m102673c = IF0.m102673c(C41757gp1.this.f84308a, this.f84316b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "vehicle_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "title");
                int m41645e3 = C40824fF0.m41645e(m102673c, "icon");
                int m41645e4 = C40824fF0.m41645e(m102673c, "icon_color");
                int m41645e5 = C40824fF0.m41645e(m102673c, "icon_background_color");
                int m41645e6 = C40824fF0.m41645e(m102673c, "caption");
                int m41645e7 = C40824fF0.m41645e(m102673c, "caption_color");
                int m41645e8 = C40824fF0.m41645e(m102673c, "caption_2");
                int m41645e9 = C40824fF0.m41645e(m102673c, "caption_2_color");
                int m41645e10 = C40824fF0.m41645e(m102673c, TransferService.INTENT_KEY_NOTIFICATION);
                int m41645e11 = C40824fF0.m41645e(m102673c, "complication");
                int m41645e12 = C40824fF0.m41645e(m102673c, "action");
                int m41645e13 = C40824fF0.m41645e(m102673c, "facet_index");
                int m41645e14 = C40824fF0.m41645e(m102673c, "background_color");
                int m41645e15 = C40824fF0.m41645e(m102673c, "list");
                int m41645e16 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e17 = C40824fF0.m41645e(m102673c, "section");
                int i3 = m41645e14;
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    ClientIcon m55281c = Converters.m55281c(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    ThemedColors m55266r = Converters.m55266r(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    ThemedColors m55266r2 = Converters.m55266r(string5);
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
                    ThemedColors m55266r3 = Converters.m55266r(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    ThemedColors m55266r4 = Converters.m55266r(string9);
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e11);
                    }
                    FleetListComplication m7945f = C50660vq1.m7945f(string11);
                    if (m102673c.isNull(m41645e12)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(m41645e12);
                    }
                    FleetListAction m7946e = C50660vq1.m7946e(string12);
                    if (m102673c.isNull(m41645e13)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(m41645e13);
                    }
                    Map<String, Integer> m7947d = C50660vq1.m7947d(string13);
                    int i4 = i3;
                    if (m102673c.isNull(i4)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i4);
                    }
                    ThemedColors m55266r5 = Converters.m55266r(string14);
                    int i5 = m41645e;
                    int i6 = m41645e15;
                    if (m102673c.isNull(i6)) {
                        m41645e15 = i6;
                        i = m41645e16;
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i6);
                        m41645e15 = i6;
                        i = m41645e16;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e16 = i;
                        i2 = m41645e17;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i);
                        m41645e16 = i;
                        i2 = m41645e17;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e17 = i2;
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i2);
                        m41645e17 = i2;
                    }
                    arrayList.add(new FleetListVehicle(string, string2, m55281c, m55266r, m55266r2, string6, m55266r3, string8, m55266r4, string10, m7945f, m7946e, m7947d, m55266r5, string15, string16, string17));
                    m41645e = i5;
                    i3 = i4;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f84316b.release();
        }
    }

    /* renamed from: gp1$f */
    /* loaded from: classes4.dex */
    public class CallableC22480f implements Callable<List<FleetListVehicle>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f84318b;

        public CallableC22480f(C33265Hb5 c33265Hb5) {
            this.f84318b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<FleetListVehicle> call() throws Exception {
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
            String string12;
            String string13;
            String string14;
            String string15;
            int i;
            String string16;
            int i2;
            String string17;
            Cursor m102673c = IF0.m102673c(C41757gp1.this.f84308a, this.f84318b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "vehicle_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "title");
                int m41645e3 = C40824fF0.m41645e(m102673c, "icon");
                int m41645e4 = C40824fF0.m41645e(m102673c, "icon_color");
                int m41645e5 = C40824fF0.m41645e(m102673c, "icon_background_color");
                int m41645e6 = C40824fF0.m41645e(m102673c, "caption");
                int m41645e7 = C40824fF0.m41645e(m102673c, "caption_color");
                int m41645e8 = C40824fF0.m41645e(m102673c, "caption_2");
                int m41645e9 = C40824fF0.m41645e(m102673c, "caption_2_color");
                int m41645e10 = C40824fF0.m41645e(m102673c, TransferService.INTENT_KEY_NOTIFICATION);
                int m41645e11 = C40824fF0.m41645e(m102673c, "complication");
                int m41645e12 = C40824fF0.m41645e(m102673c, "action");
                int m41645e13 = C40824fF0.m41645e(m102673c, "facet_index");
                int m41645e14 = C40824fF0.m41645e(m102673c, "background_color");
                int m41645e15 = C40824fF0.m41645e(m102673c, "list");
                int m41645e16 = C40824fF0.m41645e(m102673c, "fleet_id");
                int m41645e17 = C40824fF0.m41645e(m102673c, "section");
                int i3 = m41645e14;
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    ClientIcon m55281c = Converters.m55281c(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    ThemedColors m55266r = Converters.m55266r(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    ThemedColors m55266r2 = Converters.m55266r(string5);
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
                    ThemedColors m55266r3 = Converters.m55266r(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    ThemedColors m55266r4 = Converters.m55266r(string9);
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e11);
                    }
                    FleetListComplication m7945f = C50660vq1.m7945f(string11);
                    if (m102673c.isNull(m41645e12)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(m41645e12);
                    }
                    FleetListAction m7946e = C50660vq1.m7946e(string12);
                    if (m102673c.isNull(m41645e13)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(m41645e13);
                    }
                    Map<String, Integer> m7947d = C50660vq1.m7947d(string13);
                    int i4 = i3;
                    if (m102673c.isNull(i4)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i4);
                    }
                    ThemedColors m55266r5 = Converters.m55266r(string14);
                    int i5 = m41645e;
                    int i6 = m41645e15;
                    if (m102673c.isNull(i6)) {
                        m41645e15 = i6;
                        i = m41645e16;
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i6);
                        m41645e15 = i6;
                        i = m41645e16;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e16 = i;
                        i2 = m41645e17;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i);
                        m41645e16 = i;
                        i2 = m41645e17;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e17 = i2;
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i2);
                        m41645e17 = i2;
                    }
                    arrayList.add(new FleetListVehicle(string, string2, m55281c, m55266r, m55266r2, string6, m55266r3, string8, m55266r4, string10, m7945f, m7946e, m7947d, m55266r5, string15, string16, string17));
                    m41645e = i5;
                    i3 = i4;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f84318b.release();
        }
    }

    /* renamed from: gp1$g */
    /* loaded from: classes4.dex */
    public class CallableC22481g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f84320b;

        /* renamed from: c */
        public final /* synthetic */ List f84321c;

        /* renamed from: d */
        public final /* synthetic */ String f84322d;

        /* renamed from: e */
        public final /* synthetic */ String f84323e;

        public CallableC22481g(List list, List list2, String str, String str2) {
            this.f84320b = list;
            this.f84321c = list2;
            this.f84322d = str;
            this.f84323e = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM fleet_list_vehicle WHERE list = ");
            m33905b.append(CallerData.f61059NA);
            m33905b.append(" AND fleet_id = ");
            m33905b.append(CallerData.f61059NA);
            m33905b.append(" AND (vehicle_id NOT IN (");
            int size = this.f84320b.size();
            C42725iS5.m33906a(m33905b, size);
            m33905b.append(") OR section NOT IN (");
            C42725iS5.m33906a(m33905b, this.f84321c.size());
            m33905b.append("))");
            InterfaceC47496qV5 m108729d = C41757gp1.this.f84308a.m108729d(m33905b.toString());
            String str = this.f84322d;
            if (str == null) {
                m108729d.mo20954m1(1);
            } else {
                m108729d.mo20958G0(1, str);
            }
            String str2 = this.f84323e;
            if (str2 == null) {
                m108729d.mo20954m1(2);
            } else {
                m108729d.mo20958G0(2, str2);
            }
            int i = 3;
            for (String str3 : this.f84320b) {
                if (str3 == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str3);
                }
                i++;
            }
            int i2 = size + 3;
            for (String str4 : this.f84321c) {
                if (str4 == null) {
                    m108729d.mo20954m1(i2);
                } else {
                    m108729d.mo20958G0(i2, str4);
                }
                i2++;
            }
            C41757gp1.this.f84308a.m108730c();
            try {
                m108729d.mo17482M();
                C41757gp1.this.f84308a.m108734A();
                C41757gp1.this.f84308a.m108728g();
                return null;
            } catch (Throwable th) {
                C41757gp1.this.f84308a.m108728g();
                throw th;
            }
        }
    }

    public C41757gp1(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f84308a = abstractC32563Eb5;
        this.f84309b = new C22475a(abstractC32563Eb5);
        this.f84310c = new C22476b(abstractC32563Eb5);
    }

    /* renamed from: i */
    public static List<Class<?>> m37451i() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC41164fp1
    /* renamed from: a */
    public AbstractC23461c mo37459a() {
        return AbstractC23461c.m33078H(new CallableC22478d());
    }

    @Override // p000.AbstractC41164fp1
    /* renamed from: b */
    public AbstractC23461c mo37458b(FleetListVehicle... fleetListVehicleArr) {
        return AbstractC23461c.m33078H(new CallableC22477c(fleetListVehicleArr));
    }

    @Override // p000.AbstractC41164fp1
    /* renamed from: c */
    public AbstractC23461c mo37457c(String str, String str2, List<String> list, List<String> list2) {
        return AbstractC23461c.m33078H(new CallableC22481g(list, list2, str, str2));
    }

    @Override // p000.AbstractC41164fp1
    /* renamed from: d */
    public Observable<List<FleetListVehicle>> mo37456d(List<String> list) {
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT * FROM fleet_list_vehicle WHERE vehicle_id IN (");
        int size = list.size();
        C42725iS5.m33906a(m33905b, size);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20958G0(i, str);
            }
            i++;
        }
        return C37504Ze5.m72808c(this.f84308a, false, new String[]{"fleet_list_vehicle"}, new CallableC22480f(m103680c));
    }

    @Override // p000.AbstractC41164fp1
    /* renamed from: e */
    public Observable<List<FleetListVehicle>> mo37455e(String str, String str2, String str3) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM fleet_list_vehicle WHERE list = ? AND fleet_id = ? AND section = ?", 3);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        if (str2 == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, str2);
        }
        if (str3 == null) {
            m103680c.mo20954m1(3);
        } else {
            m103680c.mo20958G0(3, str3);
        }
        return C37504Ze5.m72808c(this.f84308a, false, new String[]{"fleet_list_vehicle"}, new CallableC22479e(m103680c));
    }
}
