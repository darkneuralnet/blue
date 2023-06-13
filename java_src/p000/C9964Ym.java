package p000;

import android.database.Cursor;
import ch.qos.logback.classic.spi.CallerData;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Ym */
/* loaded from: classes4.dex */
public final class C9964Ym extends AbstractC9490Xm {

    /* renamed from: a */
    public final AbstractC32563Eb5 f46553a;

    /* renamed from: b */
    public final AbstractC39268cf1<Area> f46554b;

    /* renamed from: c */
    public final AbstractC39268cf1<Area> f46555c;

    /* renamed from: d */
    public final AbstractC38675bf1<Area> f46556d;

    /* renamed from: e */
    public final AbstractC41861gz5 f46557e;

    /* renamed from: f */
    public final AbstractC41861gz5 f46558f;

    /* renamed from: g */
    public final AbstractC41861gz5 f46559g;

    /* renamed from: Ym$a */
    /* loaded from: classes4.dex */
    public class CallableC9965a implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f46560b;

        public CallableC9965a(C33265Hb5 c33265Hb5) {
            this.f46560b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            Integer num = null;
            Cursor m102673c = IF0.m102673c(C9964Ym.this.f46553a, this.f46560b, false, null);
            try {
                if (m102673c.moveToFirst() && !m102673c.isNull(0)) {
                    num = Integer.valueOf(m102673c.getInt(0));
                }
                return num;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f46560b.release();
        }
    }

    /* renamed from: Ym$b */
    /* loaded from: classes4.dex */
    public class CallableC9966b implements Callable<List<Area>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f46562b;

        public CallableC9966b(C33265Hb5 c33265Hb5) {
            this.f46562b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Area> call() throws Exception {
            Boolean valueOf;
            int i;
            Integer valueOf2;
            int i2;
            String string;
            int i3;
            Integer valueOf3;
            int i4;
            Integer valueOf4;
            int i5;
            Integer valueOf5;
            int i6;
            int i7;
            boolean z;
            Integer valueOf6;
            int i8;
            Integer valueOf7;
            int i9;
            String string2;
            int i10;
            String string3;
            int i11;
            String string4;
            int i12;
            String string5;
            int i13;
            String string6;
            int i14;
            String string7;
            int i15;
            String string8;
            int i16;
            int i17;
            boolean z2;
            String string9;
            int i18;
            String string10;
            int i19;
            String string11;
            int i20;
            Integer valueOf8;
            int i21;
            String string12;
            int i22;
            String string13;
            int i23;
            Boolean valueOf9;
            Cursor m102673c = IF0.m102673c(C9964Ym.this.f46553a, this.f46562b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "title");
                int m41645e3 = C40824fF0.m41645e(m102673c, "label");
                int m41645e4 = C40824fF0.m41645e(m102673c, "notes");
                int m41645e5 = C40824fF0.m41645e(m102673c, "hide_birds");
                int m41645e6 = C40824fF0.m41645e(m102673c, "reject_drops");
                int m41645e7 = C40824fF0.m41645e(m102673c, "no_rides");
                int m41645e8 = C40824fF0.m41645e(m102673c, "no_parking");
                int m41645e9 = C40824fF0.m41645e(m102673c, "preferred_parking");
                int m41645e10 = C40824fF0.m41645e(m102673c, "delivery");
                int m41645e11 = C40824fF0.m41645e(m102673c, "release_constrained");
                int m41645e12 = C40824fF0.m41645e(m102673c, "is_demand_area");
                int m41645e13 = C40824fF0.m41645e(m102673c, "fee_modified");
                int m41645e14 = C40824fF0.m41645e(m102673c, "demand_level");
                int m41645e15 = C40824fF0.m41645e(m102673c, "overlay_label");
                int m41645e16 = C40824fF0.m41645e(m102673c, "overlay_icon");
                int m41645e17 = C40824fF0.m41645e(m102673c, "overlay_min_zoom_level");
                int m41645e18 = C40824fF0.m41645e(m102673c, "selected_overlay_label");
                int m41645e19 = C40824fF0.m41645e(m102673c, "region");
                int m41645e20 = C40824fF0.m41645e(m102673c, "color");
                int m41645e21 = C40824fF0.m41645e(m102673c, "color_dark");
                int m41645e22 = C40824fF0.m41645e(m102673c, "border_color");
                int m41645e23 = C40824fF0.m41645e(m102673c, "border_color_dark");
                int m41645e24 = C40824fF0.m41645e(m102673c, "title_color");
                int m41645e25 = C40824fF0.m41645e(m102673c, "title_color_dark");
                int m41645e26 = C40824fF0.m41645e(m102673c, "zoom_behavior");
                int m41645e27 = C40824fF0.m41645e(m102673c, "operational");
                int m41645e28 = C40824fF0.m41645e(m102673c, "max_speed");
                int m41645e29 = C40824fF0.m41645e(m102673c, "release_capacity");
                int m41645e30 = C40824fF0.m41645e(m102673c, "no_parking_fine_alert_title");
                int m41645e31 = C40824fF0.m41645e(m102673c, "no_parking_fine_alert_message");
                int m41645e32 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_title");
                int m41645e33 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_body");
                int m41645e34 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_title");
                int m41645e35 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_body");
                int m41645e36 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_icon_type");
                int m41645e37 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_icon_type");
                int m41645e38 = C40824fF0.m41645e(m102673c, "area_release_capacity_icon_type");
                int m41645e39 = C40824fF0.m41645e(m102673c, "partner_id");
                int m41645e40 = C40824fF0.m41645e(m102673c, "fleet_ids");
                int m41645e41 = C40824fF0.m41645e(m102673c, "area_keys");
                int m41645e42 = C40824fF0.m41645e(m102673c, "universal");
                int m41645e43 = C40824fF0.m41645e(m102673c, "no_parking_fine_currency");
                int m41645e44 = C40824fF0.m41645e(m102673c, "no_parking_warning_alert_title");
                int m41645e45 = C40824fF0.m41645e(m102673c, "no_parking_warning_alert_body");
                int m41645e46 = C40824fF0.m41645e(m102673c, "no_parking_fine_amount");
                int m41645e47 = C40824fF0.m41645e(m102673c, "areas_merged");
                int m41645e48 = C40824fF0.m41645e(m102673c, "center_point");
                int m41645e49 = C40824fF0.m41645e(m102673c, "role");
                int m41645e50 = C40824fF0.m41645e(m102673c, "updatedAt");
                int m41645e51 = C40824fF0.m41645e(m102673c, "zone_id");
                int m41645e52 = C40824fF0.m41645e(m102673c, "walkway");
                int i24 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    String string14 = m102673c.isNull(m41645e) ? null : m102673c.getString(m41645e);
                    String string15 = m102673c.isNull(m41645e2) ? null : m102673c.getString(m41645e2);
                    String string16 = m102673c.isNull(m41645e3) ? null : m102673c.getString(m41645e3);
                    String string17 = m102673c.isNull(m41645e4) ? null : m102673c.getString(m41645e4);
                    boolean z3 = true;
                    boolean z4 = m102673c.getInt(m41645e5) != 0;
                    boolean z5 = m102673c.getInt(m41645e6) != 0;
                    boolean z6 = m102673c.getInt(m41645e7) != 0;
                    boolean z7 = m102673c.getInt(m41645e8) != 0;
                    boolean z8 = m102673c.getInt(m41645e9) != 0;
                    boolean z9 = m102673c.getInt(m41645e10) != 0;
                    boolean z10 = m102673c.getInt(m41645e11) != 0;
                    boolean z11 = m102673c.getInt(m41645e12) != 0;
                    Integer valueOf10 = m102673c.isNull(m41645e13) ? null : Integer.valueOf(m102673c.getInt(m41645e13));
                    if (valueOf10 == null) {
                        i = i24;
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf10.intValue() != 0);
                        i = i24;
                    }
                    Integer valueOf11 = m102673c.isNull(i) ? null : Integer.valueOf(m102673c.getInt(i));
                    int i25 = m41645e15;
                    int i26 = m41645e;
                    String string18 = m102673c.isNull(i25) ? null : m102673c.getString(i25);
                    int i27 = m41645e16;
                    AreaIconType m77845a = C9181Wm.m77845a(m102673c.isNull(i27) ? null : m102673c.getString(i27));
                    int i28 = m41645e17;
                    if (m102673c.isNull(i28)) {
                        m41645e17 = i28;
                        i2 = m41645e18;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(m102673c.getInt(i28));
                        m41645e17 = i28;
                        i2 = m41645e18;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e18 = i2;
                        i3 = m41645e19;
                        string = null;
                    } else {
                        string = m102673c.getString(i2);
                        m41645e18 = i2;
                        i3 = m41645e19;
                    }
                    Polygon m77841e = C9181Wm.m77841e(m102673c.isNull(i3) ? null : m102673c.getString(i3));
                    m41645e19 = i3;
                    int i29 = m41645e20;
                    int i30 = m102673c.getInt(i29);
                    m41645e20 = i29;
                    int i31 = m41645e21;
                    if (m102673c.isNull(i31)) {
                        m41645e21 = i31;
                        i4 = m41645e22;
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(m102673c.getInt(i31));
                        m41645e21 = i31;
                        i4 = m41645e22;
                    }
                    int i32 = m102673c.getInt(i4);
                    m41645e22 = i4;
                    int i33 = m41645e23;
                    if (m102673c.isNull(i33)) {
                        m41645e23 = i33;
                        i5 = m41645e24;
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf(m102673c.getInt(i33));
                        m41645e23 = i33;
                        i5 = m41645e24;
                    }
                    int i34 = m102673c.getInt(i5);
                    m41645e24 = i5;
                    int i35 = m41645e25;
                    if (m102673c.isNull(i35)) {
                        m41645e25 = i35;
                        i6 = m41645e26;
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf(m102673c.getInt(i35));
                        m41645e25 = i35;
                        i6 = m41645e26;
                    }
                    ZoomBehavior m77840f = C9181Wm.m77840f(m102673c.isNull(i6) ? null : m102673c.getString(i6));
                    m41645e26 = i6;
                    int i36 = m41645e27;
                    if (m102673c.getInt(i36) != 0) {
                        m41645e27 = i36;
                        i7 = m41645e28;
                        z = true;
                    } else {
                        m41645e27 = i36;
                        i7 = m41645e28;
                        z = false;
                    }
                    if (m102673c.isNull(i7)) {
                        m41645e28 = i7;
                        i8 = m41645e29;
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(m102673c.getInt(i7));
                        m41645e28 = i7;
                        i8 = m41645e29;
                    }
                    if (m102673c.isNull(i8)) {
                        m41645e29 = i8;
                        i9 = m41645e30;
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(m102673c.getInt(i8));
                        m41645e29 = i8;
                        i9 = m41645e30;
                    }
                    if (m102673c.isNull(i9)) {
                        m41645e30 = i9;
                        i10 = m41645e31;
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(i9);
                        m41645e30 = i9;
                        i10 = m41645e31;
                    }
                    if (m102673c.isNull(i10)) {
                        m41645e31 = i10;
                        i11 = m41645e32;
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(i10);
                        m41645e31 = i10;
                        i11 = m41645e32;
                    }
                    if (m102673c.isNull(i11)) {
                        m41645e32 = i11;
                        i12 = m41645e33;
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(i11);
                        m41645e32 = i11;
                        i12 = m41645e33;
                    }
                    if (m102673c.isNull(i12)) {
                        m41645e33 = i12;
                        i13 = m41645e34;
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(i12);
                        m41645e33 = i12;
                        i13 = m41645e34;
                    }
                    if (m102673c.isNull(i13)) {
                        m41645e34 = i13;
                        i14 = m41645e35;
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(i13);
                        m41645e34 = i13;
                        i14 = m41645e35;
                    }
                    if (m102673c.isNull(i14)) {
                        m41645e35 = i14;
                        i15 = m41645e36;
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(i14);
                        m41645e35 = i14;
                        i15 = m41645e36;
                    }
                    AreaIconType m77845a2 = C9181Wm.m77845a(m102673c.isNull(i15) ? null : m102673c.getString(i15));
                    m41645e36 = i15;
                    int i37 = m41645e37;
                    AreaIconType m77845a3 = C9181Wm.m77845a(m102673c.isNull(i37) ? null : m102673c.getString(i37));
                    m41645e37 = i37;
                    int i38 = m41645e38;
                    AreaIconType m77845a4 = C9181Wm.m77845a(m102673c.isNull(i38) ? null : m102673c.getString(i38));
                    m41645e38 = i38;
                    int i39 = m41645e39;
                    if (m102673c.isNull(i39)) {
                        m41645e39 = i39;
                        i16 = m41645e40;
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(i39);
                        m41645e39 = i39;
                        i16 = m41645e40;
                    }
                    List<String> m55267q = Converters.m55267q(m102673c.isNull(i16) ? null : m102673c.getString(i16));
                    m41645e40 = i16;
                    int i40 = m41645e41;
                    List<String> m55267q2 = Converters.m55267q(m102673c.isNull(i40) ? null : m102673c.getString(i40));
                    m41645e41 = i40;
                    int i41 = m41645e42;
                    if (m102673c.getInt(i41) != 0) {
                        m41645e42 = i41;
                        i17 = m41645e43;
                        z2 = true;
                    } else {
                        m41645e42 = i41;
                        i17 = m41645e43;
                        z2 = false;
                    }
                    if (m102673c.isNull(i17)) {
                        m41645e43 = i17;
                        i18 = m41645e44;
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i17);
                        m41645e43 = i17;
                        i18 = m41645e44;
                    }
                    if (m102673c.isNull(i18)) {
                        m41645e44 = i18;
                        i19 = m41645e45;
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(i18);
                        m41645e44 = i18;
                        i19 = m41645e45;
                    }
                    if (m102673c.isNull(i19)) {
                        m41645e45 = i19;
                        i20 = m41645e46;
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i19);
                        m41645e45 = i19;
                        i20 = m41645e46;
                    }
                    if (m102673c.isNull(i20)) {
                        m41645e46 = i20;
                        i21 = m41645e47;
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf(m102673c.getInt(i20));
                        m41645e46 = i20;
                        i21 = m41645e47;
                    }
                    List<String> m55267q3 = Converters.m55267q(m102673c.isNull(i21) ? null : m102673c.getString(i21));
                    m41645e47 = i21;
                    int i42 = m41645e48;
                    Geolocation m55276h = Converters.m55276h(m102673c.isNull(i42) ? null : m102673c.getString(i42));
                    m41645e48 = i42;
                    int i43 = m41645e49;
                    if (m102673c.isNull(i43)) {
                        m41645e49 = i43;
                        i22 = m41645e50;
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i43);
                        m41645e49 = i43;
                        i22 = m41645e50;
                    }
                    DateTime m55278f = Converters.m55278f(m102673c.isNull(i22) ? null : m102673c.getString(i22));
                    m41645e50 = i22;
                    int i44 = m41645e51;
                    if (m102673c.isNull(i44)) {
                        m41645e51 = i44;
                        i23 = m41645e52;
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i44);
                        m41645e51 = i44;
                        i23 = m41645e52;
                    }
                    Integer valueOf12 = m102673c.isNull(i23) ? null : Integer.valueOf(m102673c.getInt(i23));
                    if (valueOf12 == null) {
                        m41645e52 = i23;
                        valueOf9 = null;
                    } else {
                        if (valueOf12.intValue() == 0) {
                            z3 = false;
                        }
                        valueOf9 = Boolean.valueOf(z3);
                        m41645e52 = i23;
                    }
                    arrayList.add(new Area(string14, string15, string16, string17, z4, z5, z6, z7, z8, z9, z10, z11, valueOf, valueOf11, string18, m77845a, valueOf2, string, m77841e, i30, valueOf3, i32, valueOf4, i34, valueOf5, m77840f, z, valueOf6, valueOf7, string2, string3, string4, string5, string6, string7, m77845a2, m77845a3, m77845a4, string8, m55267q, m55267q2, z2, string9, string10, string11, valueOf8, m55267q3, m55276h, string12, m55278f, string13, valueOf9));
                    m41645e = i26;
                    m41645e15 = i25;
                    m41645e16 = i27;
                    i24 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f46562b.release();
        }
    }

    /* renamed from: Ym$c */
    /* loaded from: classes4.dex */
    public class CallableC9967c implements Callable<List<String>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f46564b;

        public CallableC9967c(C33265Hb5 c33265Hb5) {
            this.f46564b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<String> call() throws Exception {
            String string;
            Cursor m102673c = IF0.m102673c(C9964Ym.this.f46553a, this.f46564b, false, null);
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
            this.f46564b.release();
        }
    }

    /* renamed from: Ym$d */
    /* loaded from: classes4.dex */
    public class CallableC9968d implements Callable<List<Area>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f46566b;

        public CallableC9968d(C33265Hb5 c33265Hb5) {
            this.f46566b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Area> call() throws Exception {
            Boolean valueOf;
            int i;
            Integer valueOf2;
            int i2;
            String string;
            int i3;
            Integer valueOf3;
            int i4;
            Integer valueOf4;
            int i5;
            Integer valueOf5;
            int i6;
            int i7;
            boolean z;
            Integer valueOf6;
            int i8;
            Integer valueOf7;
            int i9;
            String string2;
            int i10;
            String string3;
            int i11;
            String string4;
            int i12;
            String string5;
            int i13;
            String string6;
            int i14;
            String string7;
            int i15;
            String string8;
            int i16;
            int i17;
            boolean z2;
            String string9;
            int i18;
            String string10;
            int i19;
            String string11;
            int i20;
            Integer valueOf8;
            int i21;
            String string12;
            int i22;
            String string13;
            int i23;
            Boolean valueOf9;
            Cursor m102673c = IF0.m102673c(C9964Ym.this.f46553a, this.f46566b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "title");
                int m41645e3 = C40824fF0.m41645e(m102673c, "label");
                int m41645e4 = C40824fF0.m41645e(m102673c, "notes");
                int m41645e5 = C40824fF0.m41645e(m102673c, "hide_birds");
                int m41645e6 = C40824fF0.m41645e(m102673c, "reject_drops");
                int m41645e7 = C40824fF0.m41645e(m102673c, "no_rides");
                int m41645e8 = C40824fF0.m41645e(m102673c, "no_parking");
                int m41645e9 = C40824fF0.m41645e(m102673c, "preferred_parking");
                int m41645e10 = C40824fF0.m41645e(m102673c, "delivery");
                int m41645e11 = C40824fF0.m41645e(m102673c, "release_constrained");
                int m41645e12 = C40824fF0.m41645e(m102673c, "is_demand_area");
                int m41645e13 = C40824fF0.m41645e(m102673c, "fee_modified");
                int m41645e14 = C40824fF0.m41645e(m102673c, "demand_level");
                int m41645e15 = C40824fF0.m41645e(m102673c, "overlay_label");
                int m41645e16 = C40824fF0.m41645e(m102673c, "overlay_icon");
                int m41645e17 = C40824fF0.m41645e(m102673c, "overlay_min_zoom_level");
                int m41645e18 = C40824fF0.m41645e(m102673c, "selected_overlay_label");
                int m41645e19 = C40824fF0.m41645e(m102673c, "region");
                int m41645e20 = C40824fF0.m41645e(m102673c, "color");
                int m41645e21 = C40824fF0.m41645e(m102673c, "color_dark");
                int m41645e22 = C40824fF0.m41645e(m102673c, "border_color");
                int m41645e23 = C40824fF0.m41645e(m102673c, "border_color_dark");
                int m41645e24 = C40824fF0.m41645e(m102673c, "title_color");
                int m41645e25 = C40824fF0.m41645e(m102673c, "title_color_dark");
                int m41645e26 = C40824fF0.m41645e(m102673c, "zoom_behavior");
                int m41645e27 = C40824fF0.m41645e(m102673c, "operational");
                int m41645e28 = C40824fF0.m41645e(m102673c, "max_speed");
                int m41645e29 = C40824fF0.m41645e(m102673c, "release_capacity");
                int m41645e30 = C40824fF0.m41645e(m102673c, "no_parking_fine_alert_title");
                int m41645e31 = C40824fF0.m41645e(m102673c, "no_parking_fine_alert_message");
                int m41645e32 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_title");
                int m41645e33 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_body");
                int m41645e34 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_title");
                int m41645e35 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_body");
                int m41645e36 = C40824fF0.m41645e(m102673c, "rider_bar_in_ride_message_icon_type");
                int m41645e37 = C40824fF0.m41645e(m102673c, "rider_bar_not_in_ride_message_icon_type");
                int m41645e38 = C40824fF0.m41645e(m102673c, "area_release_capacity_icon_type");
                int m41645e39 = C40824fF0.m41645e(m102673c, "partner_id");
                int m41645e40 = C40824fF0.m41645e(m102673c, "fleet_ids");
                int m41645e41 = C40824fF0.m41645e(m102673c, "area_keys");
                int m41645e42 = C40824fF0.m41645e(m102673c, "universal");
                int m41645e43 = C40824fF0.m41645e(m102673c, "no_parking_fine_currency");
                int m41645e44 = C40824fF0.m41645e(m102673c, "no_parking_warning_alert_title");
                int m41645e45 = C40824fF0.m41645e(m102673c, "no_parking_warning_alert_body");
                int m41645e46 = C40824fF0.m41645e(m102673c, "no_parking_fine_amount");
                int m41645e47 = C40824fF0.m41645e(m102673c, "areas_merged");
                int m41645e48 = C40824fF0.m41645e(m102673c, "center_point");
                int m41645e49 = C40824fF0.m41645e(m102673c, "role");
                int m41645e50 = C40824fF0.m41645e(m102673c, "updatedAt");
                int m41645e51 = C40824fF0.m41645e(m102673c, "zone_id");
                int m41645e52 = C40824fF0.m41645e(m102673c, "walkway");
                int i24 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    String string14 = m102673c.isNull(m41645e) ? null : m102673c.getString(m41645e);
                    String string15 = m102673c.isNull(m41645e2) ? null : m102673c.getString(m41645e2);
                    String string16 = m102673c.isNull(m41645e3) ? null : m102673c.getString(m41645e3);
                    String string17 = m102673c.isNull(m41645e4) ? null : m102673c.getString(m41645e4);
                    boolean z3 = true;
                    boolean z4 = m102673c.getInt(m41645e5) != 0;
                    boolean z5 = m102673c.getInt(m41645e6) != 0;
                    boolean z6 = m102673c.getInt(m41645e7) != 0;
                    boolean z7 = m102673c.getInt(m41645e8) != 0;
                    boolean z8 = m102673c.getInt(m41645e9) != 0;
                    boolean z9 = m102673c.getInt(m41645e10) != 0;
                    boolean z10 = m102673c.getInt(m41645e11) != 0;
                    boolean z11 = m102673c.getInt(m41645e12) != 0;
                    Integer valueOf10 = m102673c.isNull(m41645e13) ? null : Integer.valueOf(m102673c.getInt(m41645e13));
                    if (valueOf10 == null) {
                        i = i24;
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(valueOf10.intValue() != 0);
                        i = i24;
                    }
                    Integer valueOf11 = m102673c.isNull(i) ? null : Integer.valueOf(m102673c.getInt(i));
                    int i25 = m41645e15;
                    int i26 = m41645e;
                    String string18 = m102673c.isNull(i25) ? null : m102673c.getString(i25);
                    int i27 = m41645e16;
                    AreaIconType m77845a = C9181Wm.m77845a(m102673c.isNull(i27) ? null : m102673c.getString(i27));
                    int i28 = m41645e17;
                    if (m102673c.isNull(i28)) {
                        m41645e17 = i28;
                        i2 = m41645e18;
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(m102673c.getInt(i28));
                        m41645e17 = i28;
                        i2 = m41645e18;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e18 = i2;
                        i3 = m41645e19;
                        string = null;
                    } else {
                        string = m102673c.getString(i2);
                        m41645e18 = i2;
                        i3 = m41645e19;
                    }
                    Polygon m77841e = C9181Wm.m77841e(m102673c.isNull(i3) ? null : m102673c.getString(i3));
                    m41645e19 = i3;
                    int i29 = m41645e20;
                    int i30 = m102673c.getInt(i29);
                    m41645e20 = i29;
                    int i31 = m41645e21;
                    if (m102673c.isNull(i31)) {
                        m41645e21 = i31;
                        i4 = m41645e22;
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(m102673c.getInt(i31));
                        m41645e21 = i31;
                        i4 = m41645e22;
                    }
                    int i32 = m102673c.getInt(i4);
                    m41645e22 = i4;
                    int i33 = m41645e23;
                    if (m102673c.isNull(i33)) {
                        m41645e23 = i33;
                        i5 = m41645e24;
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf(m102673c.getInt(i33));
                        m41645e23 = i33;
                        i5 = m41645e24;
                    }
                    int i34 = m102673c.getInt(i5);
                    m41645e24 = i5;
                    int i35 = m41645e25;
                    if (m102673c.isNull(i35)) {
                        m41645e25 = i35;
                        i6 = m41645e26;
                        valueOf5 = null;
                    } else {
                        valueOf5 = Integer.valueOf(m102673c.getInt(i35));
                        m41645e25 = i35;
                        i6 = m41645e26;
                    }
                    ZoomBehavior m77840f = C9181Wm.m77840f(m102673c.isNull(i6) ? null : m102673c.getString(i6));
                    m41645e26 = i6;
                    int i36 = m41645e27;
                    if (m102673c.getInt(i36) != 0) {
                        m41645e27 = i36;
                        i7 = m41645e28;
                        z = true;
                    } else {
                        m41645e27 = i36;
                        i7 = m41645e28;
                        z = false;
                    }
                    if (m102673c.isNull(i7)) {
                        m41645e28 = i7;
                        i8 = m41645e29;
                        valueOf6 = null;
                    } else {
                        valueOf6 = Integer.valueOf(m102673c.getInt(i7));
                        m41645e28 = i7;
                        i8 = m41645e29;
                    }
                    if (m102673c.isNull(i8)) {
                        m41645e29 = i8;
                        i9 = m41645e30;
                        valueOf7 = null;
                    } else {
                        valueOf7 = Integer.valueOf(m102673c.getInt(i8));
                        m41645e29 = i8;
                        i9 = m41645e30;
                    }
                    if (m102673c.isNull(i9)) {
                        m41645e30 = i9;
                        i10 = m41645e31;
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(i9);
                        m41645e30 = i9;
                        i10 = m41645e31;
                    }
                    if (m102673c.isNull(i10)) {
                        m41645e31 = i10;
                        i11 = m41645e32;
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(i10);
                        m41645e31 = i10;
                        i11 = m41645e32;
                    }
                    if (m102673c.isNull(i11)) {
                        m41645e32 = i11;
                        i12 = m41645e33;
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(i11);
                        m41645e32 = i11;
                        i12 = m41645e33;
                    }
                    if (m102673c.isNull(i12)) {
                        m41645e33 = i12;
                        i13 = m41645e34;
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(i12);
                        m41645e33 = i12;
                        i13 = m41645e34;
                    }
                    if (m102673c.isNull(i13)) {
                        m41645e34 = i13;
                        i14 = m41645e35;
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(i13);
                        m41645e34 = i13;
                        i14 = m41645e35;
                    }
                    if (m102673c.isNull(i14)) {
                        m41645e35 = i14;
                        i15 = m41645e36;
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(i14);
                        m41645e35 = i14;
                        i15 = m41645e36;
                    }
                    AreaIconType m77845a2 = C9181Wm.m77845a(m102673c.isNull(i15) ? null : m102673c.getString(i15));
                    m41645e36 = i15;
                    int i37 = m41645e37;
                    AreaIconType m77845a3 = C9181Wm.m77845a(m102673c.isNull(i37) ? null : m102673c.getString(i37));
                    m41645e37 = i37;
                    int i38 = m41645e38;
                    AreaIconType m77845a4 = C9181Wm.m77845a(m102673c.isNull(i38) ? null : m102673c.getString(i38));
                    m41645e38 = i38;
                    int i39 = m41645e39;
                    if (m102673c.isNull(i39)) {
                        m41645e39 = i39;
                        i16 = m41645e40;
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(i39);
                        m41645e39 = i39;
                        i16 = m41645e40;
                    }
                    List<String> m55267q = Converters.m55267q(m102673c.isNull(i16) ? null : m102673c.getString(i16));
                    m41645e40 = i16;
                    int i40 = m41645e41;
                    List<String> m55267q2 = Converters.m55267q(m102673c.isNull(i40) ? null : m102673c.getString(i40));
                    m41645e41 = i40;
                    int i41 = m41645e42;
                    if (m102673c.getInt(i41) != 0) {
                        m41645e42 = i41;
                        i17 = m41645e43;
                        z2 = true;
                    } else {
                        m41645e42 = i41;
                        i17 = m41645e43;
                        z2 = false;
                    }
                    if (m102673c.isNull(i17)) {
                        m41645e43 = i17;
                        i18 = m41645e44;
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i17);
                        m41645e43 = i17;
                        i18 = m41645e44;
                    }
                    if (m102673c.isNull(i18)) {
                        m41645e44 = i18;
                        i19 = m41645e45;
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(i18);
                        m41645e44 = i18;
                        i19 = m41645e45;
                    }
                    if (m102673c.isNull(i19)) {
                        m41645e45 = i19;
                        i20 = m41645e46;
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i19);
                        m41645e45 = i19;
                        i20 = m41645e46;
                    }
                    if (m102673c.isNull(i20)) {
                        m41645e46 = i20;
                        i21 = m41645e47;
                        valueOf8 = null;
                    } else {
                        valueOf8 = Integer.valueOf(m102673c.getInt(i20));
                        m41645e46 = i20;
                        i21 = m41645e47;
                    }
                    List<String> m55267q3 = Converters.m55267q(m102673c.isNull(i21) ? null : m102673c.getString(i21));
                    m41645e47 = i21;
                    int i42 = m41645e48;
                    Geolocation m55276h = Converters.m55276h(m102673c.isNull(i42) ? null : m102673c.getString(i42));
                    m41645e48 = i42;
                    int i43 = m41645e49;
                    if (m102673c.isNull(i43)) {
                        m41645e49 = i43;
                        i22 = m41645e50;
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i43);
                        m41645e49 = i43;
                        i22 = m41645e50;
                    }
                    DateTime m55278f = Converters.m55278f(m102673c.isNull(i22) ? null : m102673c.getString(i22));
                    m41645e50 = i22;
                    int i44 = m41645e51;
                    if (m102673c.isNull(i44)) {
                        m41645e51 = i44;
                        i23 = m41645e52;
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i44);
                        m41645e51 = i44;
                        i23 = m41645e52;
                    }
                    Integer valueOf12 = m102673c.isNull(i23) ? null : Integer.valueOf(m102673c.getInt(i23));
                    if (valueOf12 == null) {
                        m41645e52 = i23;
                        valueOf9 = null;
                    } else {
                        if (valueOf12.intValue() == 0) {
                            z3 = false;
                        }
                        valueOf9 = Boolean.valueOf(z3);
                        m41645e52 = i23;
                    }
                    arrayList.add(new Area(string14, string15, string16, string17, z4, z5, z6, z7, z8, z9, z10, z11, valueOf, valueOf11, string18, m77845a, valueOf2, string, m77841e, i30, valueOf3, i32, valueOf4, i34, valueOf5, m77840f, z, valueOf6, valueOf7, string2, string3, string4, string5, string6, string7, m77845a2, m77845a3, m77845a4, string8, m55267q, m55267q2, z2, string9, string10, string11, valueOf8, m55267q3, m55276h, string12, m55278f, string13, valueOf9));
                    m41645e = i26;
                    m41645e15 = i25;
                    m41645e16 = i27;
                    i24 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f46566b.release();
        }
    }

    /* renamed from: Ym$e */
    /* loaded from: classes4.dex */
    public class CallableC9969e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f46568b;

        /* renamed from: c */
        public final /* synthetic */ String f46569c;

        public CallableC9969e(List list, String str) {
            this.f46568b = list;
            this.f46569c = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM area WHERE role = ");
            m33905b.append(CallerData.f61059NA);
            m33905b.append(" AND id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f46568b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C9964Ym.this.f46553a.m108729d(m33905b.toString());
            String str = this.f46569c;
            if (str == null) {
                m108729d.mo20954m1(1);
            } else {
                m108729d.mo20958G0(1, str);
            }
            int i = 2;
            for (String str2 : this.f46568b) {
                if (str2 == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str2);
                }
                i++;
            }
            C9964Ym.this.f46553a.m108730c();
            try {
                m108729d.mo17482M();
                C9964Ym.this.f46553a.m108734A();
                C9964Ym.this.f46553a.m108728g();
                return null;
            } catch (Throwable th) {
                C9964Ym.this.f46553a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Ym$f */
    /* loaded from: classes4.dex */
    public class C9970f extends AbstractC39268cf1<Area> {
        public C9970f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `area` (`id`,`title`,`label`,`notes`,`hide_birds`,`reject_drops`,`no_rides`,`no_parking`,`preferred_parking`,`delivery`,`release_constrained`,`is_demand_area`,`fee_modified`,`demand_level`,`overlay_label`,`overlay_icon`,`overlay_min_zoom_level`,`selected_overlay_label`,`region`,`color`,`color_dark`,`border_color`,`border_color_dark`,`title_color`,`title_color_dark`,`zoom_behavior`,`operational`,`max_speed`,`release_capacity`,`no_parking_fine_alert_title`,`no_parking_fine_alert_message`,`rider_bar_in_ride_message_title`,`rider_bar_in_ride_message_body`,`rider_bar_not_in_ride_message_title`,`rider_bar_not_in_ride_message_body`,`rider_bar_in_ride_message_icon_type`,`rider_bar_not_in_ride_message_icon_type`,`area_release_capacity_icon_type`,`partner_id`,`fleet_ids`,`area_keys`,`universal`,`no_parking_fine_currency`,`no_parking_warning_alert_title`,`no_parking_warning_alert_body`,`no_parking_fine_amount`,`areas_merged`,`center_point`,`role`,`updatedAt`,`zone_id`,`walkway`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Area area) {
            if (area.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, area.getId());
            }
            if (area.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, area.getTitle());
            }
            if (area.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, area.getLabel());
            }
            if (area.getNotes() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, area.getNotes());
            }
            interfaceC47496qV5.mo20956S0(5, area.getHideBirds() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(6, area.getRejectDrops() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(7, area.getNoRides() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(8, area.getNoParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(9, area.getPreferredParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(10, area.getDelivery() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(11, area.isReleaseConstrained() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, area.isDemandArea() ? 1L : 0L);
            Integer valueOf = area.getFeeModified() == null ? null : Integer.valueOf(area.getFeeModified().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, valueOf.intValue());
            }
            if (area.getDemandLevel() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20956S0(14, area.getDemandLevel().intValue());
            }
            if (area.getOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, area.getOverlayLabel());
            }
            C9181Wm c9181Wm = C9181Wm.f42090a;
            String m77843c = C9181Wm.m77843c(area.getOverlayIcon());
            if (m77843c == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, m77843c);
            }
            if (area.getOverlayMinZoomLevel() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20956S0(17, area.getOverlayMinZoomLevel().intValue());
            }
            if (area.getSelectedOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(18);
            } else {
                interfaceC47496qV5.mo20958G0(18, area.getSelectedOverlayLabel());
            }
            String m77844b = C9181Wm.m77844b(area.getRegion());
            if (m77844b == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20958G0(19, m77844b);
            }
            interfaceC47496qV5.mo20956S0(20, area.getColor());
            if (area.getColorDark() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20956S0(21, area.getColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(22, area.getBorderColor());
            if (area.getBorderColorDark() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, area.getBorderColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(24, area.getTitleColor());
            if (area.getTitleColorDark() == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20956S0(25, area.getTitleColorDark().intValue());
            }
            String m77842d = C9181Wm.m77842d(area.getZoomBehavior());
            if (m77842d == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, m77842d);
            }
            interfaceC47496qV5.mo20956S0(27, area.getOperational() ? 1L : 0L);
            if (area.getMaxSpeed() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20956S0(28, area.getMaxSpeed().intValue());
            }
            if (area.getReleaseCapacity() == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20956S0(29, area.getReleaseCapacity().intValue());
            }
            if (area.getNoParkingFineAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, area.getNoParkingFineAlertTitle());
            }
            if (area.getNoParkingFineAlertMessage() == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, area.getNoParkingFineAlertMessage());
            }
            if (area.getRiderBarInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, area.getRiderBarInRideMessageTitle());
            }
            if (area.getRiderBarInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(33);
            } else {
                interfaceC47496qV5.mo20958G0(33, area.getRiderBarInRideMessageBody());
            }
            if (area.getRiderBarNotInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(34);
            } else {
                interfaceC47496qV5.mo20958G0(34, area.getRiderBarNotInRideMessageTitle());
            }
            if (area.getRiderBarNotInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, area.getRiderBarNotInRideMessageBody());
            }
            String m77843c2 = C9181Wm.m77843c(area.getRiderBarInRideMessageIconType());
            if (m77843c2 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m77843c2);
            }
            String m77843c3 = C9181Wm.m77843c(area.getRiderBarNotInRideMessageIconType());
            if (m77843c3 == null) {
                interfaceC47496qV5.mo20954m1(37);
            } else {
                interfaceC47496qV5.mo20958G0(37, m77843c3);
            }
            String m77843c4 = C9181Wm.m77843c(area.getAreaReleaseCapacityIconType());
            if (m77843c4 == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, m77843c4);
            }
            if (area.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, area.getPartnerId());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(area.getFleetIds());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m55269o);
            }
            String m55269o2 = Converters.m55269o(area.getAreaKeys());
            if (m55269o2 == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m55269o2);
            }
            interfaceC47496qV5.mo20956S0(42, area.isUniversalArea() ? 1L : 0L);
            if (area.getNoParkingFineCurrency() == null) {
                interfaceC47496qV5.mo20954m1(43);
            } else {
                interfaceC47496qV5.mo20958G0(43, area.getNoParkingFineCurrency());
            }
            if (area.getNoParkingWarningAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(44);
            } else {
                interfaceC47496qV5.mo20958G0(44, area.getNoParkingWarningAlertTitle());
            }
            if (area.getNoParkingWarningAlertBody() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, area.getNoParkingWarningAlertBody());
            }
            if (area.getNoParkingFineAmount() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20956S0(46, area.getNoParkingFineAmount().intValue());
            }
            String m55269o3 = Converters.m55269o(area.getAreasMerged());
            if (m55269o3 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55269o3);
            }
            String m55271m = Converters.m55271m(area.getCenterPoint());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m55271m);
            }
            if (area.getRole() == null) {
                interfaceC47496qV5.mo20954m1(49);
            } else {
                interfaceC47496qV5.mo20958G0(49, area.getRole());
            }
            String m55279e = Converters.m55279e(area.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(50);
            } else {
                interfaceC47496qV5.mo20958G0(50, m55279e);
            }
            if (area.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, area.getZoneId());
            }
            Integer valueOf2 = area.getWalkway() != null ? Integer.valueOf(area.getWalkway().booleanValue() ? 1 : 0) : null;
            if (valueOf2 == null) {
                interfaceC47496qV5.mo20954m1(52);
            } else {
                interfaceC47496qV5.mo20956S0(52, valueOf2.intValue());
            }
        }
    }

    /* renamed from: Ym$g */
    /* loaded from: classes4.dex */
    public class C9971g extends AbstractC39268cf1<Area> {
        public C9971g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `area` (`id`,`title`,`label`,`notes`,`hide_birds`,`reject_drops`,`no_rides`,`no_parking`,`preferred_parking`,`delivery`,`release_constrained`,`is_demand_area`,`fee_modified`,`demand_level`,`overlay_label`,`overlay_icon`,`overlay_min_zoom_level`,`selected_overlay_label`,`region`,`color`,`color_dark`,`border_color`,`border_color_dark`,`title_color`,`title_color_dark`,`zoom_behavior`,`operational`,`max_speed`,`release_capacity`,`no_parking_fine_alert_title`,`no_parking_fine_alert_message`,`rider_bar_in_ride_message_title`,`rider_bar_in_ride_message_body`,`rider_bar_not_in_ride_message_title`,`rider_bar_not_in_ride_message_body`,`rider_bar_in_ride_message_icon_type`,`rider_bar_not_in_ride_message_icon_type`,`area_release_capacity_icon_type`,`partner_id`,`fleet_ids`,`area_keys`,`universal`,`no_parking_fine_currency`,`no_parking_warning_alert_title`,`no_parking_warning_alert_body`,`no_parking_fine_amount`,`areas_merged`,`center_point`,`role`,`updatedAt`,`zone_id`,`walkway`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Area area) {
            if (area.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, area.getId());
            }
            if (area.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, area.getTitle());
            }
            if (area.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, area.getLabel());
            }
            if (area.getNotes() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, area.getNotes());
            }
            interfaceC47496qV5.mo20956S0(5, area.getHideBirds() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(6, area.getRejectDrops() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(7, area.getNoRides() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(8, area.getNoParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(9, area.getPreferredParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(10, area.getDelivery() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(11, area.isReleaseConstrained() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, area.isDemandArea() ? 1L : 0L);
            Integer valueOf = area.getFeeModified() == null ? null : Integer.valueOf(area.getFeeModified().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, valueOf.intValue());
            }
            if (area.getDemandLevel() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20956S0(14, area.getDemandLevel().intValue());
            }
            if (area.getOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, area.getOverlayLabel());
            }
            C9181Wm c9181Wm = C9181Wm.f42090a;
            String m77843c = C9181Wm.m77843c(area.getOverlayIcon());
            if (m77843c == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, m77843c);
            }
            if (area.getOverlayMinZoomLevel() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20956S0(17, area.getOverlayMinZoomLevel().intValue());
            }
            if (area.getSelectedOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(18);
            } else {
                interfaceC47496qV5.mo20958G0(18, area.getSelectedOverlayLabel());
            }
            String m77844b = C9181Wm.m77844b(area.getRegion());
            if (m77844b == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20958G0(19, m77844b);
            }
            interfaceC47496qV5.mo20956S0(20, area.getColor());
            if (area.getColorDark() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20956S0(21, area.getColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(22, area.getBorderColor());
            if (area.getBorderColorDark() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, area.getBorderColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(24, area.getTitleColor());
            if (area.getTitleColorDark() == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20956S0(25, area.getTitleColorDark().intValue());
            }
            String m77842d = C9181Wm.m77842d(area.getZoomBehavior());
            if (m77842d == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, m77842d);
            }
            interfaceC47496qV5.mo20956S0(27, area.getOperational() ? 1L : 0L);
            if (area.getMaxSpeed() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20956S0(28, area.getMaxSpeed().intValue());
            }
            if (area.getReleaseCapacity() == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20956S0(29, area.getReleaseCapacity().intValue());
            }
            if (area.getNoParkingFineAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, area.getNoParkingFineAlertTitle());
            }
            if (area.getNoParkingFineAlertMessage() == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, area.getNoParkingFineAlertMessage());
            }
            if (area.getRiderBarInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, area.getRiderBarInRideMessageTitle());
            }
            if (area.getRiderBarInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(33);
            } else {
                interfaceC47496qV5.mo20958G0(33, area.getRiderBarInRideMessageBody());
            }
            if (area.getRiderBarNotInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(34);
            } else {
                interfaceC47496qV5.mo20958G0(34, area.getRiderBarNotInRideMessageTitle());
            }
            if (area.getRiderBarNotInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, area.getRiderBarNotInRideMessageBody());
            }
            String m77843c2 = C9181Wm.m77843c(area.getRiderBarInRideMessageIconType());
            if (m77843c2 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m77843c2);
            }
            String m77843c3 = C9181Wm.m77843c(area.getRiderBarNotInRideMessageIconType());
            if (m77843c3 == null) {
                interfaceC47496qV5.mo20954m1(37);
            } else {
                interfaceC47496qV5.mo20958G0(37, m77843c3);
            }
            String m77843c4 = C9181Wm.m77843c(area.getAreaReleaseCapacityIconType());
            if (m77843c4 == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, m77843c4);
            }
            if (area.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, area.getPartnerId());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(area.getFleetIds());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m55269o);
            }
            String m55269o2 = Converters.m55269o(area.getAreaKeys());
            if (m55269o2 == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m55269o2);
            }
            interfaceC47496qV5.mo20956S0(42, area.isUniversalArea() ? 1L : 0L);
            if (area.getNoParkingFineCurrency() == null) {
                interfaceC47496qV5.mo20954m1(43);
            } else {
                interfaceC47496qV5.mo20958G0(43, area.getNoParkingFineCurrency());
            }
            if (area.getNoParkingWarningAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(44);
            } else {
                interfaceC47496qV5.mo20958G0(44, area.getNoParkingWarningAlertTitle());
            }
            if (area.getNoParkingWarningAlertBody() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, area.getNoParkingWarningAlertBody());
            }
            if (area.getNoParkingFineAmount() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20956S0(46, area.getNoParkingFineAmount().intValue());
            }
            String m55269o3 = Converters.m55269o(area.getAreasMerged());
            if (m55269o3 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55269o3);
            }
            String m55271m = Converters.m55271m(area.getCenterPoint());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m55271m);
            }
            if (area.getRole() == null) {
                interfaceC47496qV5.mo20954m1(49);
            } else {
                interfaceC47496qV5.mo20958G0(49, area.getRole());
            }
            String m55279e = Converters.m55279e(area.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(50);
            } else {
                interfaceC47496qV5.mo20958G0(50, m55279e);
            }
            if (area.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, area.getZoneId());
            }
            Integer valueOf2 = area.getWalkway() != null ? Integer.valueOf(area.getWalkway().booleanValue() ? 1 : 0) : null;
            if (valueOf2 == null) {
                interfaceC47496qV5.mo20954m1(52);
            } else {
                interfaceC47496qV5.mo20956S0(52, valueOf2.intValue());
            }
        }
    }

    /* renamed from: Ym$h */
    /* loaded from: classes4.dex */
    public class C9972h extends AbstractC38675bf1<Area> {
        public C9972h(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `area` SET `id` = ?,`title` = ?,`label` = ?,`notes` = ?,`hide_birds` = ?,`reject_drops` = ?,`no_rides` = ?,`no_parking` = ?,`preferred_parking` = ?,`delivery` = ?,`release_constrained` = ?,`is_demand_area` = ?,`fee_modified` = ?,`demand_level` = ?,`overlay_label` = ?,`overlay_icon` = ?,`overlay_min_zoom_level` = ?,`selected_overlay_label` = ?,`region` = ?,`color` = ?,`color_dark` = ?,`border_color` = ?,`border_color_dark` = ?,`title_color` = ?,`title_color_dark` = ?,`zoom_behavior` = ?,`operational` = ?,`max_speed` = ?,`release_capacity` = ?,`no_parking_fine_alert_title` = ?,`no_parking_fine_alert_message` = ?,`rider_bar_in_ride_message_title` = ?,`rider_bar_in_ride_message_body` = ?,`rider_bar_not_in_ride_message_title` = ?,`rider_bar_not_in_ride_message_body` = ?,`rider_bar_in_ride_message_icon_type` = ?,`rider_bar_not_in_ride_message_icon_type` = ?,`area_release_capacity_icon_type` = ?,`partner_id` = ?,`fleet_ids` = ?,`area_keys` = ?,`universal` = ?,`no_parking_fine_currency` = ?,`no_parking_warning_alert_title` = ?,`no_parking_warning_alert_body` = ?,`no_parking_fine_amount` = ?,`areas_merged` = ?,`center_point` = ?,`role` = ?,`updatedAt` = ?,`zone_id` = ?,`walkway` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, Area area) {
            if (area.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, area.getId());
            }
            if (area.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, area.getTitle());
            }
            if (area.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, area.getLabel());
            }
            if (area.getNotes() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, area.getNotes());
            }
            interfaceC47496qV5.mo20956S0(5, area.getHideBirds() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(6, area.getRejectDrops() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(7, area.getNoRides() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(8, area.getNoParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(9, area.getPreferredParking() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(10, area.getDelivery() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(11, area.isReleaseConstrained() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, area.isDemandArea() ? 1L : 0L);
            Integer valueOf = area.getFeeModified() == null ? null : Integer.valueOf(area.getFeeModified().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, valueOf.intValue());
            }
            if (area.getDemandLevel() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20956S0(14, area.getDemandLevel().intValue());
            }
            if (area.getOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, area.getOverlayLabel());
            }
            C9181Wm c9181Wm = C9181Wm.f42090a;
            String m77843c = C9181Wm.m77843c(area.getOverlayIcon());
            if (m77843c == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, m77843c);
            }
            if (area.getOverlayMinZoomLevel() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20956S0(17, area.getOverlayMinZoomLevel().intValue());
            }
            if (area.getSelectedOverlayLabel() == null) {
                interfaceC47496qV5.mo20954m1(18);
            } else {
                interfaceC47496qV5.mo20958G0(18, area.getSelectedOverlayLabel());
            }
            String m77844b = C9181Wm.m77844b(area.getRegion());
            if (m77844b == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20958G0(19, m77844b);
            }
            interfaceC47496qV5.mo20956S0(20, area.getColor());
            if (area.getColorDark() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20956S0(21, area.getColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(22, area.getBorderColor());
            if (area.getBorderColorDark() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, area.getBorderColorDark().intValue());
            }
            interfaceC47496qV5.mo20956S0(24, area.getTitleColor());
            if (area.getTitleColorDark() == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20956S0(25, area.getTitleColorDark().intValue());
            }
            String m77842d = C9181Wm.m77842d(area.getZoomBehavior());
            if (m77842d == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, m77842d);
            }
            interfaceC47496qV5.mo20956S0(27, area.getOperational() ? 1L : 0L);
            if (area.getMaxSpeed() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20956S0(28, area.getMaxSpeed().intValue());
            }
            if (area.getReleaseCapacity() == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20956S0(29, area.getReleaseCapacity().intValue());
            }
            if (area.getNoParkingFineAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, area.getNoParkingFineAlertTitle());
            }
            if (area.getNoParkingFineAlertMessage() == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, area.getNoParkingFineAlertMessage());
            }
            if (area.getRiderBarInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, area.getRiderBarInRideMessageTitle());
            }
            if (area.getRiderBarInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(33);
            } else {
                interfaceC47496qV5.mo20958G0(33, area.getRiderBarInRideMessageBody());
            }
            if (area.getRiderBarNotInRideMessageTitle() == null) {
                interfaceC47496qV5.mo20954m1(34);
            } else {
                interfaceC47496qV5.mo20958G0(34, area.getRiderBarNotInRideMessageTitle());
            }
            if (area.getRiderBarNotInRideMessageBody() == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, area.getRiderBarNotInRideMessageBody());
            }
            String m77843c2 = C9181Wm.m77843c(area.getRiderBarInRideMessageIconType());
            if (m77843c2 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m77843c2);
            }
            String m77843c3 = C9181Wm.m77843c(area.getRiderBarNotInRideMessageIconType());
            if (m77843c3 == null) {
                interfaceC47496qV5.mo20954m1(37);
            } else {
                interfaceC47496qV5.mo20958G0(37, m77843c3);
            }
            String m77843c4 = C9181Wm.m77843c(area.getAreaReleaseCapacityIconType());
            if (m77843c4 == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, m77843c4);
            }
            if (area.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, area.getPartnerId());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(area.getFleetIds());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m55269o);
            }
            String m55269o2 = Converters.m55269o(area.getAreaKeys());
            if (m55269o2 == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m55269o2);
            }
            interfaceC47496qV5.mo20956S0(42, area.isUniversalArea() ? 1L : 0L);
            if (area.getNoParkingFineCurrency() == null) {
                interfaceC47496qV5.mo20954m1(43);
            } else {
                interfaceC47496qV5.mo20958G0(43, area.getNoParkingFineCurrency());
            }
            if (area.getNoParkingWarningAlertTitle() == null) {
                interfaceC47496qV5.mo20954m1(44);
            } else {
                interfaceC47496qV5.mo20958G0(44, area.getNoParkingWarningAlertTitle());
            }
            if (area.getNoParkingWarningAlertBody() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, area.getNoParkingWarningAlertBody());
            }
            if (area.getNoParkingFineAmount() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20956S0(46, area.getNoParkingFineAmount().intValue());
            }
            String m55269o3 = Converters.m55269o(area.getAreasMerged());
            if (m55269o3 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55269o3);
            }
            String m55271m = Converters.m55271m(area.getCenterPoint());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m55271m);
            }
            if (area.getRole() == null) {
                interfaceC47496qV5.mo20954m1(49);
            } else {
                interfaceC47496qV5.mo20958G0(49, area.getRole());
            }
            String m55279e = Converters.m55279e(area.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(50);
            } else {
                interfaceC47496qV5.mo20958G0(50, m55279e);
            }
            if (area.getZoneId() == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, area.getZoneId());
            }
            Integer valueOf2 = area.getWalkway() != null ? Integer.valueOf(area.getWalkway().booleanValue() ? 1 : 0) : null;
            if (valueOf2 == null) {
                interfaceC47496qV5.mo20954m1(52);
            } else {
                interfaceC47496qV5.mo20956S0(52, valueOf2.intValue());
            }
            if (area.getId() == null) {
                interfaceC47496qV5.mo20954m1(53);
            } else {
                interfaceC47496qV5.mo20958G0(53, area.getId());
            }
        }
    }

    /* renamed from: Ym$i */
    /* loaded from: classes4.dex */
    public class C9973i extends AbstractC41861gz5 {
        public C9973i(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM area WHERE role = ? AND updatedAt < ?";
        }
    }

    /* renamed from: Ym$j */
    /* loaded from: classes4.dex */
    public class C9974j extends AbstractC41861gz5 {
        public C9974j(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM area WHERE role = ?";
        }
    }

    /* renamed from: Ym$k */
    /* loaded from: classes4.dex */
    public class C9975k extends AbstractC41861gz5 {
        public C9975k(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM area";
        }
    }

    /* renamed from: Ym$l */
    /* loaded from: classes4.dex */
    public class CallableC9976l implements Callable<Integer> {

        /* renamed from: b */
        public final /* synthetic */ String f46577b;

        /* renamed from: c */
        public final /* synthetic */ DateTime f46578c;

        public CallableC9976l(String str, DateTime dateTime) {
            this.f46577b = str;
            this.f46578c = dateTime;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Integer call() throws Exception {
            InterfaceC47496qV5 m37254b = C9964Ym.this.f46557e.m37254b();
            String str = this.f46577b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(this.f46578c);
            if (m55279e == null) {
                m37254b.mo20954m1(2);
            } else {
                m37254b.mo20958G0(2, m55279e);
            }
            C9964Ym.this.f46553a.m108730c();
            try {
                Integer valueOf = Integer.valueOf(m37254b.mo17482M());
                C9964Ym.this.f46553a.m108734A();
                return valueOf;
            } finally {
                C9964Ym.this.f46553a.m108728g();
                C9964Ym.this.f46557e.m37249h(m37254b);
            }
        }
    }

    /* renamed from: Ym$m */
    /* loaded from: classes4.dex */
    public class CallableC9977m implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f46580b;

        public CallableC9977m(String str) {
            this.f46580b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C9964Ym.this.f46558f.m37254b();
            String str = this.f46580b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C9964Ym.this.f46553a.m108730c();
            try {
                m37254b.mo17482M();
                C9964Ym.this.f46553a.m108734A();
                C9964Ym.this.f46553a.m108728g();
                C9964Ym.this.f46558f.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C9964Ym.this.f46553a.m108728g();
                C9964Ym.this.f46558f.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Ym$n */
    /* loaded from: classes4.dex */
    public class CallableC9978n implements Callable<Void> {
        public CallableC9978n() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C9964Ym.this.f46559g.m37254b();
            C9964Ym.this.f46553a.m108730c();
            try {
                m37254b.mo17482M();
                C9964Ym.this.f46553a.m108734A();
                C9964Ym.this.f46553a.m108728g();
                C9964Ym.this.f46559g.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C9964Ym.this.f46553a.m108728g();
                C9964Ym.this.f46559g.m37249h(m37254b);
                throw th;
            }
        }
    }

    public C9964Ym(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f46553a = abstractC32563Eb5;
        this.f46554b = new C9970f(abstractC32563Eb5);
        this.f46555c = new C9971g(abstractC32563Eb5);
        this.f46556d = new C9972h(abstractC32563Eb5);
        this.f46557e = new C9973i(abstractC32563Eb5);
        this.f46558f = new C9974j(abstractC32563Eb5);
        this.f46559g = new C9975k(abstractC32563Eb5);
    }

    /* renamed from: r */
    public static List<Class<?>> m74295r() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: a */
    public AbstractC24490k<List<Area>> mo74312a(String str, int i) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM area WHERE role = ? LIMIT 100 OFFSET ?", 2);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        m103680c.mo20956S0(2, i);
        return C37504Ze5.m72810a(this.f46553a, false, new String[]{"area"}, new CallableC9966b(m103680c));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: b */
    public AbstractC23442F<List<Area>> mo74311b(List<String> list) {
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT * FROM area WHERE id in (");
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
        return C37504Ze5.m72806e(new CallableC9968d(m103680c));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: c */
    public AbstractC23461c mo74310c() {
        return AbstractC23461c.m33078H(new CallableC9978n());
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: d */
    public AbstractC23461c mo74309d(String str) {
        return AbstractC23461c.m33078H(new CallableC9977m(str));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: e */
    public AbstractC24490k<Integer> mo74308e(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT COUNT(*) from area where role = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72810a(this.f46553a, false, new String[]{"area"}, new CallableC9965a(m103680c));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: f */
    public AbstractC23442F<List<String>> mo74307f(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT `id` FROM area WHERE role = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC9967c(m103680c));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: g */
    public List<String> mo74306g(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` FROM area WHERE rowid in (");
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
        this.f46553a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f46553a, m103680c, false, null);
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

    @Override // p000.AbstractC9490Xm
    /* renamed from: h */
    public List<Long> mo74305h(Area... areaArr) {
        this.f46553a.m108731b();
        this.f46553a.m108730c();
        try {
            List<Long> m61084o = this.f46555c.m61084o(areaArr);
            this.f46553a.m108734A();
            return m61084o;
        } finally {
            this.f46553a.m108728g();
        }
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: i */
    public AbstractC23461c mo74304i(String str, List<String> list) {
        return AbstractC23461c.m33078H(new CallableC9969e(list, str));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: j */
    public AbstractC23442F<Integer> mo74303j(String str, DateTime dateTime) {
        return AbstractC23442F.m33161E(new CallableC9976l(str, dateTime));
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: k */
    public void mo74302k(Area... areaArr) {
        this.f46553a.m108731b();
        this.f46553a.m108730c();
        try {
            this.f46556d.m64205l(areaArr);
            this.f46553a.m108734A();
        } finally {
            this.f46553a.m108728g();
        }
    }

    @Override // p000.AbstractC9490Xm
    /* renamed from: l */
    public void mo74301l(Area... areaArr) {
        this.f46553a.m108730c();
        try {
            super.mo74301l(areaArr);
            this.f46553a.m108734A();
        } finally {
            this.f46553a.m108728g();
        }
    }
}
