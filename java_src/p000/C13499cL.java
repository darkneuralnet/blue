package p000;

import android.database.Cursor;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.BirdLicenseView;
import co.bird.android.model.persistence.nestedstructures.BountyReason;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.persistence.update.BirdMapMarkerUpdate;
import co.bird.android.persistence.common.impl.Converters;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: cL */
/* loaded from: classes4.dex */
public final class C13499cL extends AbstractC12358bL {

    /* renamed from: a */
    public final AbstractC32563Eb5 f60402a;

    /* renamed from: b */
    public final AbstractC39268cf1<Bird> f60403b;

    /* renamed from: c */
    public final AbstractC39268cf1<Bird> f60404c;

    /* renamed from: d */
    public final AbstractC38675bf1<Bird> f60405d;

    /* renamed from: e */
    public final AbstractC38675bf1<BirdMapMarkerUpdate> f60406e;

    /* renamed from: f */
    public final AbstractC38675bf1<Bird> f60407f;

    /* renamed from: g */
    public final AbstractC41861gz5 f60408g;

    /* renamed from: cL$a */
    /* loaded from: classes4.dex */
    public class CallableC13500a implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ BirdMapMarkerUpdate[] f60409b;

        public CallableC13500a(BirdMapMarkerUpdate[] birdMapMarkerUpdateArr) {
            this.f60409b = birdMapMarkerUpdateArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C13499cL.this.f60402a.m108730c();
            try {
                C13499cL.this.f60406e.m64205l(this.f60409b);
                C13499cL.this.f60402a.m108734A();
                C13499cL.this.f60402a.m108728g();
                return null;
            } catch (Throwable th) {
                C13499cL.this.f60402a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: cL$b */
    /* loaded from: classes4.dex */
    public class CallableC13501b implements Callable<Void> {
        public CallableC13501b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C13499cL.this.f60408g.m37254b();
            C13499cL.this.f60402a.m108730c();
            try {
                m37254b.mo17482M();
                C13499cL.this.f60402a.m108734A();
                C13499cL.this.f60402a.m108728g();
                C13499cL.this.f60408g.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C13499cL.this.f60402a.m108728g();
                C13499cL.this.f60408g.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: cL$c */
    /* loaded from: classes4.dex */
    public class CallableC13502c implements Callable<List<Bird>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f60412b;

        public CallableC13502c(C33265Hb5 c33265Hb5) {
            this.f60412b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Bird> call() throws Exception {
            String string;
            String string2;
            String string3;
            Integer valueOf;
            String string4;
            String string5;
            String string6;
            String string7;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            String string8;
            String string9;
            String string10;
            Integer valueOf2;
            String string11;
            boolean z10;
            boolean z11;
            String string12;
            String string13;
            String string14;
            String string15;
            String string16;
            String string17;
            boolean z12;
            boolean z13;
            String string18;
            String string19;
            boolean z14;
            String string20;
            String string21;
            String string22;
            String string23;
            boolean z15;
            boolean z16;
            boolean z17;
            String string24;
            String string25;
            String string26;
            String string27;
            boolean z18;
            boolean z19;
            String string28;
            boolean z20;
            String string29;
            String string30;
            String string31;
            String string32;
            String string33;
            String string34;
            String string35;
            String string36;
            String string37;
            Integer valueOf3;
            Boolean valueOf4;
            String string38;
            Cursor m102673c = IF0.m102673c(C13499cL.this.f60402a, this.f60412b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    boolean z21 = true;
                    if (m102673c.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(1);
                    }
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    int i = m102673c.getInt(3);
                    if (m102673c.isNull(4)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(4));
                    }
                    int i2 = m102673c.getInt(5);
                    if (m102673c.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(6);
                    }
                    Geolocation m55276h = Converters.m55276h(string4);
                    if (m102673c.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(7);
                    }
                    if (m102673c.isNull(8)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(8);
                    }
                    if (m102673c.isNull(9)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(9);
                    }
                    if (m102673c.getInt(10) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.getInt(11) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m102673c.getInt(12) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (m102673c.getInt(13) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (m102673c.getInt(14) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (m102673c.getInt(15) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (m102673c.getInt(16) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (m102673c.getInt(17) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (m102673c.getInt(18) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (m102673c.isNull(19)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(19);
                    }
                    BirdLabel m71647d = C10628aL.m71647d(string8);
                    if (m102673c.isNull(20)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(20);
                    }
                    List<BirdAction> m71648c = C10628aL.m71648c(string9);
                    if (m102673c.isNull(21)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(21);
                    }
                    if (m102673c.isNull(22)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(m102673c.getInt(22));
                    }
                    if (m102673c.isNull(23)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(23);
                    }
                    if (m102673c.getInt(24) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m102673c.getInt(25) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (m102673c.isNull(26)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(26);
                    }
                    BountyKind m71644g = C10628aL.m71644g(string12);
                    if (m102673c.isNull(27)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(27);
                    }
                    if (m102673c.isNull(28)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(28);
                    }
                    BirdTaskKind m71645f = C10628aL.m71645f(string14);
                    if (m102673c.isNull(29)) {
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(29);
                    }
                    DateTime m55278f = Converters.m55278f(string15);
                    if (m102673c.isNull(30)) {
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(30);
                    }
                    DateTime m55278f2 = Converters.m55278f(string16);
                    if (m102673c.isNull(31)) {
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(31);
                    }
                    if (m102673c.getInt(32) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (m102673c.getInt(33) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (m102673c.isNull(34)) {
                        string18 = null;
                    } else {
                        string18 = m102673c.getString(34);
                    }
                    DateTime m55278f3 = Converters.m55278f(string18);
                    if (m102673c.isNull(35)) {
                        string19 = null;
                    } else {
                        string19 = m102673c.getString(35);
                    }
                    DateTime m55278f4 = Converters.m55278f(string19);
                    if (m102673c.getInt(36) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (m102673c.isNull(37)) {
                        string20 = null;
                    } else {
                        string20 = m102673c.getString(37);
                    }
                    if (m102673c.isNull(38)) {
                        string21 = null;
                    } else {
                        string21 = m102673c.getString(38);
                    }
                    if (m102673c.isNull(39)) {
                        string22 = null;
                    } else {
                        string22 = m102673c.getString(39);
                    }
                    PhysicalLock m71626y = C10628aL.m71626y(string22);
                    if (m102673c.isNull(40)) {
                        string23 = null;
                    } else {
                        string23 = m102673c.getString(40);
                    }
                    List<PhysicalLock> m71625z = C10628aL.m71625z(string23);
                    if (m102673c.getInt(41) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (m102673c.getInt(42) != 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (m102673c.getInt(43) != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (m102673c.isNull(44)) {
                        string24 = null;
                    } else {
                        string24 = m102673c.getString(44);
                    }
                    if (m102673c.isNull(45)) {
                        string25 = null;
                    } else {
                        string25 = m102673c.getString(45);
                    }
                    if (m102673c.isNull(46)) {
                        string26 = null;
                    } else {
                        string26 = m102673c.getString(46);
                    }
                    DateTime m55278f5 = Converters.m55278f(string26);
                    if (m102673c.isNull(47)) {
                        string27 = null;
                    } else {
                        string27 = m102673c.getString(47);
                    }
                    PartnerBirdState m71627x = C10628aL.m71627x(string27);
                    if (m102673c.getInt(48) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (m102673c.getInt(49) != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (m102673c.isNull(50)) {
                        string28 = null;
                    } else {
                        string28 = m102673c.getString(50);
                    }
                    Lifecycle m71630u = C10628aL.m71630u(string28);
                    if (m102673c.getInt(51) != 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (m102673c.isNull(52)) {
                        string29 = null;
                    } else {
                        string29 = m102673c.getString(52);
                    }
                    BirdLicenseView m71646e = C10628aL.m71646e(string29);
                    if (m102673c.isNull(53)) {
                        string30 = null;
                    } else {
                        string30 = m102673c.getString(53);
                    }
                    if (m102673c.isNull(54)) {
                        string31 = null;
                    } else {
                        string31 = m102673c.getString(54);
                    }
                    NestPurpose m71628w = C10628aL.m71628w(string31);
                    if (m102673c.isNull(55)) {
                        string32 = null;
                    } else {
                        string32 = m102673c.getString(55);
                    }
                    PrivateBird m71651A = C10628aL.m71651A(string32);
                    if (m102673c.isNull(56)) {
                        string33 = null;
                    } else {
                        string33 = m102673c.getString(56);
                    }
                    DateTime m55278f6 = Converters.m55278f(string33);
                    if (m102673c.isNull(57)) {
                        string34 = null;
                    } else {
                        string34 = m102673c.getString(57);
                    }
                    MapPinBadge m71629v = C10628aL.m71629v(string34);
                    if (m102673c.isNull(58)) {
                        string35 = null;
                    } else {
                        string35 = m102673c.getString(58);
                    }
                    List<BountyReason> m71642i = C10628aL.m71642i(string35);
                    if (m102673c.isNull(59)) {
                        string36 = null;
                    } else {
                        string36 = m102673c.getString(59);
                    }
                    if (m102673c.isNull(60)) {
                        string37 = null;
                    } else {
                        string37 = m102673c.getString(60);
                    }
                    if (m102673c.isNull(61)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(m102673c.getInt(61));
                    }
                    if (valueOf3 == null) {
                        valueOf4 = null;
                    } else {
                        if (valueOf3.intValue() == 0) {
                            z21 = false;
                        }
                        valueOf4 = Boolean.valueOf(z21);
                    }
                    if (m102673c.isNull(62)) {
                        string38 = null;
                    } else {
                        string38 = m102673c.getString(62);
                    }
                    arrayList.add(new Bird(string, string2, string3, i, valueOf, i2, m55276h, string5, string6, string7, z, z2, z3, z4, z5, z6, z7, z8, z9, m71647d, m71648c, string10, valueOf2, string11, z10, z11, m71644g, string13, m71645f, m55278f, m55278f2, string17, z12, z13, m55278f3, m55278f4, z14, string20, string21, m71626y, m71625z, z15, z16, z17, string24, string25, m55278f5, m71627x, z18, z19, m71630u, z20, m71646e, string30, m71628w, m71651A, m55278f6, m71629v, m71642i, string36, string37, valueOf4, Converters.m55278f(string38)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f60412b.release();
        }
    }

    /* renamed from: cL$d */
    /* loaded from: classes4.dex */
    public class CallableC13503d implements Callable<Bird> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f60414b;

        public CallableC13503d(C33265Hb5 c33265Hb5) {
            this.f60414b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bird call() throws Exception {
            Bird bird;
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
            int i6;
            boolean z6;
            String string;
            int i7;
            Integer valueOf;
            int i8;
            String string2;
            int i9;
            int i10;
            boolean z7;
            int i11;
            boolean z8;
            String string3;
            int i12;
            String string4;
            int i13;
            int i14;
            boolean z9;
            int i15;
            boolean z10;
            int i16;
            boolean z11;
            String string5;
            int i17;
            String string6;
            int i18;
            int i19;
            boolean z12;
            int i20;
            boolean z13;
            int i21;
            boolean z14;
            String string7;
            int i22;
            String string8;
            int i23;
            int i24;
            boolean z15;
            int i25;
            boolean z16;
            int i26;
            boolean z17;
            String string9;
            int i27;
            String string10;
            int i28;
            String string11;
            int i29;
            Boolean valueOf2;
            Cursor m102673c = IF0.m102673c(C13499cL.this.f60402a, this.f60414b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e3 = C40824fF0.m41645e(m102673c, "task_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "battery_level");
                int m41645e5 = C40824fF0.m41645e(m102673c, "estimated_range");
                int m41645e6 = C40824fF0.m41645e(m102673c, "distance");
                int m41645e7 = C40824fF0.m41645e(m102673c, "location");
                int m41645e8 = C40824fF0.m41645e(m102673c, PaymentMethodOptionsParams.Blik.PARAM_CODE);
                int m41645e9 = C40824fF0.m41645e(m102673c, "sticker_id");
                int m41645e10 = C40824fF0.m41645e(m102673c, "serial_number");
                int m41645e11 = C40824fF0.m41645e(m102673c, "disconnected");
                int m41645e12 = C40824fF0.m41645e(m102673c, "accident");
                int m41645e13 = C40824fF0.m41645e(m102673c, "submerged");
                int m41645e14 = C40824fF0.m41645e(m102673c, "lost");
                int m41645e15 = C40824fF0.m41645e(m102673c, "locked");
                int m41645e16 = C40824fF0.m41645e(m102673c, "ack_locked");
                int m41645e17 = C40824fF0.m41645e(m102673c, "captive");
                int m41645e18 = C40824fF0.m41645e(m102673c, "gps_fix");
                int m41645e19 = C40824fF0.m41645e(m102673c, "broken");
                int m41645e20 = C40824fF0.m41645e(m102673c, "label");
                int m41645e21 = C40824fF0.m41645e(m102673c, "actions");
                int m41645e22 = C40824fF0.m41645e(m102673c, "bounty_id");
                int m41645e23 = C40824fF0.m41645e(m102673c, "bounty_price");
                int m41645e24 = C40824fF0.m41645e(m102673c, "bounty_currency");
                int m41645e25 = C40824fF0.m41645e(m102673c, "bounty_lost");
                int m41645e26 = C40824fF0.m41645e(m102673c, "bounty_overdue");
                int m41645e27 = C40824fF0.m41645e(m102673c, "bounty_kind");
                int m41645e28 = C40824fF0.m41645e(m102673c, "brand_name");
                int m41645e29 = C40824fF0.m41645e(m102673c, "task_kind");
                int m41645e30 = C40824fF0.m41645e(m102673c, "gps_at");
                int m41645e31 = C40824fF0.m41645e(m102673c, "tracked_at");
                int m41645e32 = C40824fF0.m41645e(m102673c, "token");
                int m41645e33 = C40824fF0.m41645e(m102673c, "bluetooth");
                int m41645e34 = C40824fF0.m41645e(m102673c, "cellular");
                int m41645e35 = C40824fF0.m41645e(m102673c, "started_at");
                int m41645e36 = C40824fF0.m41645e(m102673c, "due_at");
                int m41645e37 = C40824fF0.m41645e(m102673c, "asleep");
                int m41645e38 = C40824fF0.m41645e(m102673c, "imei");
                int m41645e39 = C40824fF0.m41645e(m102673c, "board_protocol");
                int m41645e40 = C40824fF0.m41645e(m102673c, "physical_lock");
                int m41645e41 = C40824fF0.m41645e(m102673c, "physical_locks");
                int m41645e42 = C40824fF0.m41645e(m102673c, "priority_collect");
                int m41645e43 = C40824fF0.m41645e(m102673c, "down");
                int m41645e44 = C40824fF0.m41645e(m102673c, "needs_inspection");
                int m41645e45 = C40824fF0.m41645e(m102673c, "partner_id");
                int m41645e46 = C40824fF0.m41645e(m102673c, "nest_id");
                int m41645e47 = C40824fF0.m41645e(m102673c, "last_ride_ended_at");
                int m41645e48 = C40824fF0.m41645e(m102673c, "partner_bird_state");
                int m41645e49 = C40824fF0.m41645e(m102673c, "peril");
                int m41645e50 = C40824fF0.m41645e(m102673c, "deliverable");
                int m41645e51 = C40824fF0.m41645e(m102673c, "lifecycle");
                int m41645e52 = C40824fF0.m41645e(m102673c, "offline");
                int m41645e53 = C40824fF0.m41645e(m102673c, "license");
                int m41645e54 = C40824fF0.m41645e(m102673c, "area_key");
                int m41645e55 = C40824fF0.m41645e(m102673c, "nest_purpose");
                int m41645e56 = C40824fF0.m41645e(m102673c, "private_bird");
                int m41645e57 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e58 = C40824fF0.m41645e(m102673c, "badge_type");
                int m41645e59 = C40824fF0.m41645e(m102673c, "bounty_reasons");
                int m41645e60 = C40824fF0.m41645e(m102673c, "ephemeral_id");
                int m41645e61 = C40824fF0.m41645e(m102673c, "ble_mac_address");
                int m41645e62 = C40824fF0.m41645e(m102673c, "has_helmet");
                int m41645e63 = C40824fF0.m41645e(m102673c, "location_updated_at");
                if (m102673c.moveToFirst()) {
                    String string12 = m102673c.isNull(m41645e) ? null : m102673c.getString(m41645e);
                    String string13 = m102673c.isNull(m41645e2) ? null : m102673c.getString(m41645e2);
                    String string14 = m102673c.isNull(m41645e3) ? null : m102673c.getString(m41645e3);
                    int i30 = m102673c.getInt(m41645e4);
                    Integer valueOf3 = m102673c.isNull(m41645e5) ? null : Integer.valueOf(m102673c.getInt(m41645e5));
                    int i31 = m102673c.getInt(m41645e6);
                    Geolocation m55276h = Converters.m55276h(m102673c.isNull(m41645e7) ? null : m102673c.getString(m41645e7));
                    String string15 = m102673c.isNull(m41645e8) ? null : m102673c.getString(m41645e8);
                    String string16 = m102673c.isNull(m41645e9) ? null : m102673c.getString(m41645e9);
                    String string17 = m102673c.isNull(m41645e10) ? null : m102673c.getString(m41645e10);
                    boolean z18 = m102673c.getInt(m41645e11) != 0;
                    boolean z19 = m102673c.getInt(m41645e12) != 0;
                    boolean z20 = m102673c.getInt(m41645e13) != 0;
                    if (m102673c.getInt(m41645e14) != 0) {
                        z = true;
                        i = m41645e15;
                    } else {
                        i = m41645e15;
                        z = false;
                    }
                    if (m102673c.getInt(i) != 0) {
                        z2 = true;
                        i2 = m41645e16;
                    } else {
                        i2 = m41645e16;
                        z2 = false;
                    }
                    if (m102673c.getInt(i2) != 0) {
                        z3 = true;
                        i3 = m41645e17;
                    } else {
                        i3 = m41645e17;
                        z3 = false;
                    }
                    if (m102673c.getInt(i3) != 0) {
                        z4 = true;
                        i4 = m41645e18;
                    } else {
                        i4 = m41645e18;
                        z4 = false;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        z5 = true;
                        i5 = m41645e19;
                    } else {
                        i5 = m41645e19;
                        z5 = false;
                    }
                    if (m102673c.getInt(i5) != 0) {
                        z6 = true;
                        i6 = m41645e20;
                    } else {
                        i6 = m41645e20;
                        z6 = false;
                    }
                    BirdLabel m71647d = C10628aL.m71647d(m102673c.isNull(i6) ? null : m102673c.getString(i6));
                    List<BirdAction> m71648c = C10628aL.m71648c(m102673c.isNull(m41645e21) ? null : m102673c.getString(m41645e21));
                    if (m102673c.isNull(m41645e22)) {
                        i7 = m41645e23;
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e22);
                        i7 = m41645e23;
                    }
                    if (m102673c.isNull(i7)) {
                        i8 = m41645e24;
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(i7));
                        i8 = m41645e24;
                    }
                    if (m102673c.isNull(i8)) {
                        i9 = m41645e25;
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(i8);
                        i9 = m41645e25;
                    }
                    if (m102673c.getInt(i9) != 0) {
                        z7 = true;
                        i10 = m41645e26;
                    } else {
                        i10 = m41645e26;
                        z7 = false;
                    }
                    if (m102673c.getInt(i10) != 0) {
                        z8 = true;
                        i11 = m41645e27;
                    } else {
                        i11 = m41645e27;
                        z8 = false;
                    }
                    BountyKind m71644g = C10628aL.m71644g(m102673c.isNull(i11) ? null : m102673c.getString(i11));
                    if (m102673c.isNull(m41645e28)) {
                        i12 = m41645e29;
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e28);
                        i12 = m41645e29;
                    }
                    BirdTaskKind m71645f = C10628aL.m71645f(m102673c.isNull(i12) ? null : m102673c.getString(i12));
                    DateTime m55278f = Converters.m55278f(m102673c.isNull(m41645e30) ? null : m102673c.getString(m41645e30));
                    DateTime m55278f2 = Converters.m55278f(m102673c.isNull(m41645e31) ? null : m102673c.getString(m41645e31));
                    if (m102673c.isNull(m41645e32)) {
                        i13 = m41645e33;
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e32);
                        i13 = m41645e33;
                    }
                    if (m102673c.getInt(i13) != 0) {
                        z9 = true;
                        i14 = m41645e34;
                    } else {
                        i14 = m41645e34;
                        z9 = false;
                    }
                    if (m102673c.getInt(i14) != 0) {
                        z10 = true;
                        i15 = m41645e35;
                    } else {
                        i15 = m41645e35;
                        z10 = false;
                    }
                    DateTime m55278f3 = Converters.m55278f(m102673c.isNull(i15) ? null : m102673c.getString(i15));
                    DateTime m55278f4 = Converters.m55278f(m102673c.isNull(m41645e36) ? null : m102673c.getString(m41645e36));
                    if (m102673c.getInt(m41645e37) != 0) {
                        z11 = true;
                        i16 = m41645e38;
                    } else {
                        i16 = m41645e38;
                        z11 = false;
                    }
                    if (m102673c.isNull(i16)) {
                        i17 = m41645e39;
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(i16);
                        i17 = m41645e39;
                    }
                    if (m102673c.isNull(i17)) {
                        i18 = m41645e40;
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(i17);
                        i18 = m41645e40;
                    }
                    PhysicalLock m71626y = C10628aL.m71626y(m102673c.isNull(i18) ? null : m102673c.getString(i18));
                    List<PhysicalLock> m71625z = C10628aL.m71625z(m102673c.isNull(m41645e41) ? null : m102673c.getString(m41645e41));
                    if (m102673c.getInt(m41645e42) != 0) {
                        z12 = true;
                        i19 = m41645e43;
                    } else {
                        i19 = m41645e43;
                        z12 = false;
                    }
                    if (m102673c.getInt(i19) != 0) {
                        z13 = true;
                        i20 = m41645e44;
                    } else {
                        i20 = m41645e44;
                        z13 = false;
                    }
                    if (m102673c.getInt(i20) != 0) {
                        z14 = true;
                        i21 = m41645e45;
                    } else {
                        i21 = m41645e45;
                        z14 = false;
                    }
                    if (m102673c.isNull(i21)) {
                        i22 = m41645e46;
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(i21);
                        i22 = m41645e46;
                    }
                    if (m102673c.isNull(i22)) {
                        i23 = m41645e47;
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(i22);
                        i23 = m41645e47;
                    }
                    DateTime m55278f5 = Converters.m55278f(m102673c.isNull(i23) ? null : m102673c.getString(i23));
                    PartnerBirdState m71627x = C10628aL.m71627x(m102673c.isNull(m41645e48) ? null : m102673c.getString(m41645e48));
                    if (m102673c.getInt(m41645e49) != 0) {
                        z15 = true;
                        i24 = m41645e50;
                    } else {
                        i24 = m41645e50;
                        z15 = false;
                    }
                    if (m102673c.getInt(i24) != 0) {
                        z16 = true;
                        i25 = m41645e51;
                    } else {
                        i25 = m41645e51;
                        z16 = false;
                    }
                    Lifecycle m71630u = C10628aL.m71630u(m102673c.isNull(i25) ? null : m102673c.getString(i25));
                    if (m102673c.getInt(m41645e52) != 0) {
                        z17 = true;
                        i26 = m41645e53;
                    } else {
                        i26 = m41645e53;
                        z17 = false;
                    }
                    BirdLicenseView m71646e = C10628aL.m71646e(m102673c.isNull(i26) ? null : m102673c.getString(i26));
                    if (m102673c.isNull(m41645e54)) {
                        i27 = m41645e55;
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e54);
                        i27 = m41645e55;
                    }
                    NestPurpose m71628w = C10628aL.m71628w(m102673c.isNull(i27) ? null : m102673c.getString(i27));
                    PrivateBird m71651A = C10628aL.m71651A(m102673c.isNull(m41645e56) ? null : m102673c.getString(m41645e56));
                    DateTime m55278f6 = Converters.m55278f(m102673c.isNull(m41645e57) ? null : m102673c.getString(m41645e57));
                    MapPinBadge m71629v = C10628aL.m71629v(m102673c.isNull(m41645e58) ? null : m102673c.getString(m41645e58));
                    List<BountyReason> m71642i = C10628aL.m71642i(m102673c.isNull(m41645e59) ? null : m102673c.getString(m41645e59));
                    if (m102673c.isNull(m41645e60)) {
                        i28 = m41645e61;
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e60);
                        i28 = m41645e61;
                    }
                    if (m102673c.isNull(i28)) {
                        i29 = m41645e62;
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i28);
                        i29 = m41645e62;
                    }
                    Integer valueOf4 = m102673c.isNull(i29) ? null : Integer.valueOf(m102673c.getInt(i29));
                    if (valueOf4 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(valueOf4.intValue() != 0);
                    }
                    bird = new Bird(string12, string13, string14, i30, valueOf3, i31, m55276h, string15, string16, string17, z18, z19, z20, z, z2, z3, z4, z5, z6, m71647d, m71648c, string, valueOf, string2, z7, z8, m71644g, string3, m71645f, m55278f, m55278f2, string4, z9, z10, m55278f3, m55278f4, z11, string5, string6, m71626y, m71625z, z12, z13, z14, string7, string8, m55278f5, m71627x, z15, z16, m71630u, z17, m71646e, string9, m71628w, m71651A, m55278f6, m71629v, m71642i, string10, string11, valueOf2, Converters.m55278f(m102673c.isNull(m41645e63) ? null : m102673c.getString(m41645e63)));
                } else {
                    bird = null;
                }
                return bird;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f60414b.release();
        }
    }

    /* renamed from: cL$e */
    /* loaded from: classes4.dex */
    public class CallableC13504e implements Callable<List<Bird>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f60416b;

        public CallableC13504e(C33265Hb5 c33265Hb5) {
            this.f60416b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Bird> call() throws Exception {
            int i;
            boolean z;
            String string;
            int i2;
            Integer valueOf;
            int i3;
            String string2;
            int i4;
            int i5;
            boolean z2;
            int i6;
            boolean z3;
            String string3;
            int i7;
            String string4;
            int i8;
            int i9;
            boolean z4;
            int i10;
            boolean z5;
            int i11;
            boolean z6;
            String string5;
            int i12;
            String string6;
            int i13;
            int i14;
            boolean z7;
            int i15;
            boolean z8;
            int i16;
            boolean z9;
            String string7;
            int i17;
            String string8;
            int i18;
            int i19;
            boolean z10;
            int i20;
            boolean z11;
            int i21;
            boolean z12;
            String string9;
            int i22;
            String string10;
            int i23;
            String string11;
            int i24;
            Boolean valueOf2;
            int i25;
            Cursor m102673c = IF0.m102673c(C13499cL.this.f60402a, this.f60416b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, RequestHeadersFactory.MODEL);
                int m41645e3 = C40824fF0.m41645e(m102673c, "task_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "battery_level");
                int m41645e5 = C40824fF0.m41645e(m102673c, "estimated_range");
                int m41645e6 = C40824fF0.m41645e(m102673c, "distance");
                int m41645e7 = C40824fF0.m41645e(m102673c, "location");
                int m41645e8 = C40824fF0.m41645e(m102673c, PaymentMethodOptionsParams.Blik.PARAM_CODE);
                int m41645e9 = C40824fF0.m41645e(m102673c, "sticker_id");
                int m41645e10 = C40824fF0.m41645e(m102673c, "serial_number");
                int m41645e11 = C40824fF0.m41645e(m102673c, "disconnected");
                int m41645e12 = C40824fF0.m41645e(m102673c, "accident");
                int m41645e13 = C40824fF0.m41645e(m102673c, "submerged");
                int m41645e14 = C40824fF0.m41645e(m102673c, "lost");
                int m41645e15 = C40824fF0.m41645e(m102673c, "locked");
                int m41645e16 = C40824fF0.m41645e(m102673c, "ack_locked");
                int m41645e17 = C40824fF0.m41645e(m102673c, "captive");
                int m41645e18 = C40824fF0.m41645e(m102673c, "gps_fix");
                int m41645e19 = C40824fF0.m41645e(m102673c, "broken");
                int m41645e20 = C40824fF0.m41645e(m102673c, "label");
                int m41645e21 = C40824fF0.m41645e(m102673c, "actions");
                int m41645e22 = C40824fF0.m41645e(m102673c, "bounty_id");
                int m41645e23 = C40824fF0.m41645e(m102673c, "bounty_price");
                int m41645e24 = C40824fF0.m41645e(m102673c, "bounty_currency");
                int m41645e25 = C40824fF0.m41645e(m102673c, "bounty_lost");
                int m41645e26 = C40824fF0.m41645e(m102673c, "bounty_overdue");
                int m41645e27 = C40824fF0.m41645e(m102673c, "bounty_kind");
                int m41645e28 = C40824fF0.m41645e(m102673c, "brand_name");
                int m41645e29 = C40824fF0.m41645e(m102673c, "task_kind");
                int m41645e30 = C40824fF0.m41645e(m102673c, "gps_at");
                int m41645e31 = C40824fF0.m41645e(m102673c, "tracked_at");
                int m41645e32 = C40824fF0.m41645e(m102673c, "token");
                int m41645e33 = C40824fF0.m41645e(m102673c, "bluetooth");
                int m41645e34 = C40824fF0.m41645e(m102673c, "cellular");
                int m41645e35 = C40824fF0.m41645e(m102673c, "started_at");
                int m41645e36 = C40824fF0.m41645e(m102673c, "due_at");
                int m41645e37 = C40824fF0.m41645e(m102673c, "asleep");
                int m41645e38 = C40824fF0.m41645e(m102673c, "imei");
                int m41645e39 = C40824fF0.m41645e(m102673c, "board_protocol");
                int m41645e40 = C40824fF0.m41645e(m102673c, "physical_lock");
                int m41645e41 = C40824fF0.m41645e(m102673c, "physical_locks");
                int m41645e42 = C40824fF0.m41645e(m102673c, "priority_collect");
                int m41645e43 = C40824fF0.m41645e(m102673c, "down");
                int m41645e44 = C40824fF0.m41645e(m102673c, "needs_inspection");
                int m41645e45 = C40824fF0.m41645e(m102673c, "partner_id");
                int m41645e46 = C40824fF0.m41645e(m102673c, "nest_id");
                int m41645e47 = C40824fF0.m41645e(m102673c, "last_ride_ended_at");
                int m41645e48 = C40824fF0.m41645e(m102673c, "partner_bird_state");
                int m41645e49 = C40824fF0.m41645e(m102673c, "peril");
                int m41645e50 = C40824fF0.m41645e(m102673c, "deliverable");
                int m41645e51 = C40824fF0.m41645e(m102673c, "lifecycle");
                int m41645e52 = C40824fF0.m41645e(m102673c, "offline");
                int m41645e53 = C40824fF0.m41645e(m102673c, "license");
                int m41645e54 = C40824fF0.m41645e(m102673c, "area_key");
                int m41645e55 = C40824fF0.m41645e(m102673c, "nest_purpose");
                int m41645e56 = C40824fF0.m41645e(m102673c, "private_bird");
                int m41645e57 = C40824fF0.m41645e(m102673c, "scanned_at");
                int m41645e58 = C40824fF0.m41645e(m102673c, "badge_type");
                int m41645e59 = C40824fF0.m41645e(m102673c, "bounty_reasons");
                int m41645e60 = C40824fF0.m41645e(m102673c, "ephemeral_id");
                int m41645e61 = C40824fF0.m41645e(m102673c, "ble_mac_address");
                int m41645e62 = C40824fF0.m41645e(m102673c, "has_helmet");
                int m41645e63 = C40824fF0.m41645e(m102673c, "location_updated_at");
                int i26 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    String string12 = m102673c.isNull(m41645e) ? null : m102673c.getString(m41645e);
                    String string13 = m102673c.isNull(m41645e2) ? null : m102673c.getString(m41645e2);
                    String string14 = m102673c.isNull(m41645e3) ? null : m102673c.getString(m41645e3);
                    int i27 = m102673c.getInt(m41645e4);
                    Integer valueOf3 = m102673c.isNull(m41645e5) ? null : Integer.valueOf(m102673c.getInt(m41645e5));
                    int i28 = m102673c.getInt(m41645e6);
                    Geolocation m55276h = Converters.m55276h(m102673c.isNull(m41645e7) ? null : m102673c.getString(m41645e7));
                    String string15 = m102673c.isNull(m41645e8) ? null : m102673c.getString(m41645e8);
                    String string16 = m102673c.isNull(m41645e9) ? null : m102673c.getString(m41645e9);
                    String string17 = m102673c.isNull(m41645e10) ? null : m102673c.getString(m41645e10);
                    boolean z13 = true;
                    boolean z14 = m102673c.getInt(m41645e11) != 0;
                    boolean z15 = m102673c.getInt(m41645e12) != 0;
                    if (m102673c.getInt(m41645e13) != 0) {
                        i = i26;
                        z = true;
                    } else {
                        i = i26;
                        z = false;
                    }
                    boolean z16 = m102673c.getInt(i) != 0;
                    int i29 = m41645e15;
                    int i30 = m41645e;
                    boolean z17 = m102673c.getInt(i29) != 0;
                    int i31 = m41645e16;
                    boolean z18 = m102673c.getInt(i31) != 0;
                    int i32 = m41645e17;
                    boolean z19 = m102673c.getInt(i32) != 0;
                    int i33 = m41645e18;
                    boolean z20 = m102673c.getInt(i33) != 0;
                    int i34 = m41645e19;
                    boolean z21 = m102673c.getInt(i34) != 0;
                    int i35 = m41645e20;
                    BirdLabel m71647d = C10628aL.m71647d(m102673c.isNull(i35) ? null : m102673c.getString(i35));
                    int i36 = m41645e21;
                    List<BirdAction> m71648c = C10628aL.m71648c(m102673c.isNull(i36) ? null : m102673c.getString(i36));
                    m41645e21 = i36;
                    int i37 = m41645e22;
                    if (m102673c.isNull(i37)) {
                        m41645e22 = i37;
                        i2 = m41645e23;
                        string = null;
                    } else {
                        string = m102673c.getString(i37);
                        m41645e22 = i37;
                        i2 = m41645e23;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e23 = i2;
                        i3 = m41645e24;
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(i2));
                        m41645e23 = i2;
                        i3 = m41645e24;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e24 = i3;
                        i4 = m41645e25;
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(i3);
                        m41645e24 = i3;
                        i4 = m41645e25;
                    }
                    if (m102673c.getInt(i4) != 0) {
                        m41645e25 = i4;
                        i5 = m41645e26;
                        z2 = true;
                    } else {
                        m41645e25 = i4;
                        i5 = m41645e26;
                        z2 = false;
                    }
                    if (m102673c.getInt(i5) != 0) {
                        m41645e26 = i5;
                        i6 = m41645e27;
                        z3 = true;
                    } else {
                        m41645e26 = i5;
                        i6 = m41645e27;
                        z3 = false;
                    }
                    BountyKind m71644g = C10628aL.m71644g(m102673c.isNull(i6) ? null : m102673c.getString(i6));
                    m41645e27 = i6;
                    int i38 = m41645e28;
                    if (m102673c.isNull(i38)) {
                        m41645e28 = i38;
                        i7 = m41645e29;
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(i38);
                        m41645e28 = i38;
                        i7 = m41645e29;
                    }
                    BirdTaskKind m71645f = C10628aL.m71645f(m102673c.isNull(i7) ? null : m102673c.getString(i7));
                    m41645e29 = i7;
                    int i39 = m41645e30;
                    DateTime m55278f = Converters.m55278f(m102673c.isNull(i39) ? null : m102673c.getString(i39));
                    m41645e30 = i39;
                    int i40 = m41645e31;
                    DateTime m55278f2 = Converters.m55278f(m102673c.isNull(i40) ? null : m102673c.getString(i40));
                    m41645e31 = i40;
                    int i41 = m41645e32;
                    if (m102673c.isNull(i41)) {
                        m41645e32 = i41;
                        i8 = m41645e33;
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(i41);
                        m41645e32 = i41;
                        i8 = m41645e33;
                    }
                    if (m102673c.getInt(i8) != 0) {
                        m41645e33 = i8;
                        i9 = m41645e34;
                        z4 = true;
                    } else {
                        m41645e33 = i8;
                        i9 = m41645e34;
                        z4 = false;
                    }
                    if (m102673c.getInt(i9) != 0) {
                        m41645e34 = i9;
                        i10 = m41645e35;
                        z5 = true;
                    } else {
                        m41645e34 = i9;
                        i10 = m41645e35;
                        z5 = false;
                    }
                    DateTime m55278f3 = Converters.m55278f(m102673c.isNull(i10) ? null : m102673c.getString(i10));
                    m41645e35 = i10;
                    int i42 = m41645e36;
                    DateTime m55278f4 = Converters.m55278f(m102673c.isNull(i42) ? null : m102673c.getString(i42));
                    m41645e36 = i42;
                    int i43 = m41645e37;
                    if (m102673c.getInt(i43) != 0) {
                        m41645e37 = i43;
                        i11 = m41645e38;
                        z6 = true;
                    } else {
                        m41645e37 = i43;
                        i11 = m41645e38;
                        z6 = false;
                    }
                    if (m102673c.isNull(i11)) {
                        m41645e38 = i11;
                        i12 = m41645e39;
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(i11);
                        m41645e38 = i11;
                        i12 = m41645e39;
                    }
                    if (m102673c.isNull(i12)) {
                        m41645e39 = i12;
                        i13 = m41645e40;
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(i12);
                        m41645e39 = i12;
                        i13 = m41645e40;
                    }
                    PhysicalLock m71626y = C10628aL.m71626y(m102673c.isNull(i13) ? null : m102673c.getString(i13));
                    m41645e40 = i13;
                    int i44 = m41645e41;
                    List<PhysicalLock> m71625z = C10628aL.m71625z(m102673c.isNull(i44) ? null : m102673c.getString(i44));
                    m41645e41 = i44;
                    int i45 = m41645e42;
                    if (m102673c.getInt(i45) != 0) {
                        m41645e42 = i45;
                        i14 = m41645e43;
                        z7 = true;
                    } else {
                        m41645e42 = i45;
                        i14 = m41645e43;
                        z7 = false;
                    }
                    if (m102673c.getInt(i14) != 0) {
                        m41645e43 = i14;
                        i15 = m41645e44;
                        z8 = true;
                    } else {
                        m41645e43 = i14;
                        i15 = m41645e44;
                        z8 = false;
                    }
                    if (m102673c.getInt(i15) != 0) {
                        m41645e44 = i15;
                        i16 = m41645e45;
                        z9 = true;
                    } else {
                        m41645e44 = i15;
                        i16 = m41645e45;
                        z9 = false;
                    }
                    if (m102673c.isNull(i16)) {
                        m41645e45 = i16;
                        i17 = m41645e46;
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(i16);
                        m41645e45 = i16;
                        i17 = m41645e46;
                    }
                    if (m102673c.isNull(i17)) {
                        m41645e46 = i17;
                        i18 = m41645e47;
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(i17);
                        m41645e46 = i17;
                        i18 = m41645e47;
                    }
                    DateTime m55278f5 = Converters.m55278f(m102673c.isNull(i18) ? null : m102673c.getString(i18));
                    m41645e47 = i18;
                    int i46 = m41645e48;
                    PartnerBirdState m71627x = C10628aL.m71627x(m102673c.isNull(i46) ? null : m102673c.getString(i46));
                    m41645e48 = i46;
                    int i47 = m41645e49;
                    if (m102673c.getInt(i47) != 0) {
                        m41645e49 = i47;
                        i19 = m41645e50;
                        z10 = true;
                    } else {
                        m41645e49 = i47;
                        i19 = m41645e50;
                        z10 = false;
                    }
                    if (m102673c.getInt(i19) != 0) {
                        m41645e50 = i19;
                        i20 = m41645e51;
                        z11 = true;
                    } else {
                        m41645e50 = i19;
                        i20 = m41645e51;
                        z11 = false;
                    }
                    Lifecycle m71630u = C10628aL.m71630u(m102673c.isNull(i20) ? null : m102673c.getString(i20));
                    m41645e51 = i20;
                    int i48 = m41645e52;
                    if (m102673c.getInt(i48) != 0) {
                        m41645e52 = i48;
                        i21 = m41645e53;
                        z12 = true;
                    } else {
                        m41645e52 = i48;
                        i21 = m41645e53;
                        z12 = false;
                    }
                    BirdLicenseView m71646e = C10628aL.m71646e(m102673c.isNull(i21) ? null : m102673c.getString(i21));
                    m41645e53 = i21;
                    int i49 = m41645e54;
                    if (m102673c.isNull(i49)) {
                        m41645e54 = i49;
                        i22 = m41645e55;
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i49);
                        m41645e54 = i49;
                        i22 = m41645e55;
                    }
                    NestPurpose m71628w = C10628aL.m71628w(m102673c.isNull(i22) ? null : m102673c.getString(i22));
                    m41645e55 = i22;
                    int i50 = m41645e56;
                    PrivateBird m71651A = C10628aL.m71651A(m102673c.isNull(i50) ? null : m102673c.getString(i50));
                    m41645e56 = i50;
                    int i51 = m41645e57;
                    DateTime m55278f6 = Converters.m55278f(m102673c.isNull(i51) ? null : m102673c.getString(i51));
                    m41645e57 = i51;
                    int i52 = m41645e58;
                    MapPinBadge m71629v = C10628aL.m71629v(m102673c.isNull(i52) ? null : m102673c.getString(i52));
                    m41645e58 = i52;
                    int i53 = m41645e59;
                    List<BountyReason> m71642i = C10628aL.m71642i(m102673c.isNull(i53) ? null : m102673c.getString(i53));
                    m41645e59 = i53;
                    int i54 = m41645e60;
                    if (m102673c.isNull(i54)) {
                        m41645e60 = i54;
                        i23 = m41645e61;
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(i54);
                        m41645e60 = i54;
                        i23 = m41645e61;
                    }
                    if (m102673c.isNull(i23)) {
                        m41645e61 = i23;
                        i24 = m41645e62;
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(i23);
                        m41645e61 = i23;
                        i24 = m41645e62;
                    }
                    Integer valueOf4 = m102673c.isNull(i24) ? null : Integer.valueOf(m102673c.getInt(i24));
                    if (valueOf4 == null) {
                        m41645e62 = i24;
                        i25 = m41645e63;
                        valueOf2 = null;
                    } else {
                        if (valueOf4.intValue() == 0) {
                            z13 = false;
                        }
                        valueOf2 = Boolean.valueOf(z13);
                        m41645e62 = i24;
                        i25 = m41645e63;
                    }
                    m41645e63 = i25;
                    arrayList.add(new Bird(string12, string13, string14, i27, valueOf3, i28, m55276h, string15, string16, string17, z14, z15, z, z16, z17, z18, z19, z20, z21, m71647d, m71648c, string, valueOf, string2, z2, z3, m71644g, string3, m71645f, m55278f, m55278f2, string4, z4, z5, m55278f3, m55278f4, z6, string5, string6, m71626y, m71625z, z7, z8, z9, string7, string8, m55278f5, m71627x, z10, z11, m71630u, z12, m71646e, string9, m71628w, m71651A, m55278f6, m71629v, m71642i, string10, string11, valueOf2, Converters.m55278f(m102673c.isNull(i25) ? null : m102673c.getString(i25))));
                    m41645e = i30;
                    m41645e15 = i29;
                    m41645e16 = i31;
                    m41645e17 = i32;
                    m41645e18 = i33;
                    m41645e19 = i34;
                    m41645e20 = i35;
                    i26 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f60416b.release();
        }
    }

    /* renamed from: cL$f */
    /* loaded from: classes4.dex */
    public class CallableC13505f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f60418b;

        public CallableC13505f(List list) {
            this.f60418b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM bird WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f60418b.size());
            m33905b.append(") AND model IS NOT 'birdair' AND private_bird IS NOT NULL");
            InterfaceC47496qV5 m108729d = C13499cL.this.f60402a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f60418b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C13499cL.this.f60402a.m108730c();
            try {
                m108729d.mo17482M();
                C13499cL.this.f60402a.m108734A();
                C13499cL.this.f60402a.m108728g();
                return null;
            } catch (Throwable th) {
                C13499cL.this.f60402a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: cL$g */
    /* loaded from: classes4.dex */
    public class C13506g extends AbstractC39268cf1<Bird> {
        public C13506g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `bird` (`id`,`model`,`task_id`,`battery_level`,`estimated_range`,`distance`,`location`,`code`,`sticker_id`,`serial_number`,`disconnected`,`accident`,`submerged`,`lost`,`locked`,`ack_locked`,`captive`,`gps_fix`,`broken`,`label`,`actions`,`bounty_id`,`bounty_price`,`bounty_currency`,`bounty_lost`,`bounty_overdue`,`bounty_kind`,`brand_name`,`task_kind`,`gps_at`,`tracked_at`,`token`,`bluetooth`,`cellular`,`started_at`,`due_at`,`asleep`,`imei`,`board_protocol`,`physical_lock`,`physical_locks`,`priority_collect`,`down`,`needs_inspection`,`partner_id`,`nest_id`,`last_ride_ended_at`,`partner_bird_state`,`peril`,`deliverable`,`lifecycle`,`offline`,`license`,`area_key`,`nest_purpose`,`private_bird`,`scanned_at`,`badge_type`,`bounty_reasons`,`ephemeral_id`,`ble_mac_address`,`has_helmet`,`location_updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Bird bird) {
            if (bird.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bird.getId());
            }
            if (bird.getModel() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, bird.getModel());
            }
            if (bird.getTaskId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, bird.getTaskId());
            }
            interfaceC47496qV5.mo20956S0(4, bird.getBatteryLevel());
            if (bird.getEstimatedRange() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20956S0(5, bird.getEstimatedRange().intValue());
            }
            interfaceC47496qV5.mo20956S0(6, bird.getDistance());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(bird.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55271m);
            }
            if (bird.getCode() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, bird.getCode());
            }
            if (bird.getStickerId() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, bird.getStickerId());
            }
            if (bird.getSerialNumber() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, bird.getSerialNumber());
            }
            interfaceC47496qV5.mo20956S0(11, bird.getDisconnected() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, bird.getCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(13, bird.getSubmerged() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(14, bird.getLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(15, bird.getLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(16, bird.getAckLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(17, bird.getCaptive() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(18, bird.getGpsFix() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(19, bird.getBroken() ? 1L : 0L);
            C10628aL c10628aL = C10628aL.f50300a;
            String m71636o = C10628aL.m71636o(bird.getLabel());
            if (m71636o == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, m71636o);
            }
            String m71649b = C10628aL.m71649b(bird.getActions());
            if (m71649b == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, m71649b);
            }
            if (bird.getBountyId() == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20958G0(22, bird.getBountyId());
            }
            if (bird.getBountyPrice() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, bird.getBountyPrice().intValue());
            }
            if (bird.getBountyCurrency() == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, bird.getBountyCurrency());
            }
            interfaceC47496qV5.mo20956S0(25, bird.getBountyLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(26, bird.getBountyOverdue() ? 1L : 0L);
            String m71640k = C10628aL.m71640k(bird.getBountyKind());
            if (m71640k == null) {
                interfaceC47496qV5.mo20954m1(27);
            } else {
                interfaceC47496qV5.mo20958G0(27, m71640k);
            }
            if (bird.getBrandName() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20958G0(28, bird.getBrandName());
            }
            String m71641j = C10628aL.m71641j(bird.getTaskKind());
            if (m71641j == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20958G0(29, m71641j);
            }
            String m55279e = Converters.m55279e(bird.getGpsAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, m55279e);
            }
            String m55279e2 = Converters.m55279e(bird.getTrackedAt());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, m55279e2);
            }
            if (bird.getToken() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, bird.getToken());
            }
            interfaceC47496qV5.mo20956S0(33, bird.getBluetooth() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(34, bird.getCellular() ? 1L : 0L);
            String m55279e3 = Converters.m55279e(bird.getStartedAt());
            if (m55279e3 == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, m55279e3);
            }
            String m55279e4 = Converters.m55279e(bird.getDueAt());
            if (m55279e4 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m55279e4);
            }
            interfaceC47496qV5.mo20956S0(37, bird.getAsleep() ? 1L : 0L);
            if (bird.getImei() == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, bird.getImei());
            }
            if (bird.getBoardProtocol() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, bird.getBoardProtocol());
            }
            String m71633r = C10628aL.m71633r(bird.getPhysicalLock());
            if (m71633r == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m71633r);
            }
            String m71631t = C10628aL.m71631t(bird.getPhysicalLocks());
            if (m71631t == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m71631t);
            }
            interfaceC47496qV5.mo20956S0(42, bird.getPriorityCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(43, bird.getDown() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(44, bird.getNeedsInspection() ? 1L : 0L);
            if (bird.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, bird.getPartnerId());
            }
            if (bird.getNestId() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20958G0(46, bird.getNestId());
            }
            String m55279e5 = Converters.m55279e(bird.getLastRideEndedAt());
            if (m55279e5 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55279e5);
            }
            String m71637n = C10628aL.m71637n(bird.getPartnerBirdState());
            if (m71637n == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m71637n);
            }
            interfaceC47496qV5.mo20956S0(49, bird.getPeril() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(50, bird.getDeliverable() ? 1L : 0L);
            String m71634q = C10628aL.m71634q(bird.getLifecycle());
            if (m71634q == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, m71634q);
            }
            interfaceC47496qV5.mo20956S0(52, bird.getOffline() ? 1L : 0L);
            String m71635p = C10628aL.m71635p(bird.getLicense());
            if (m71635p == null) {
                interfaceC47496qV5.mo20954m1(53);
            } else {
                interfaceC47496qV5.mo20958G0(53, m71635p);
            }
            if (bird.getAreaKey() == null) {
                interfaceC47496qV5.mo20954m1(54);
            } else {
                interfaceC47496qV5.mo20958G0(54, bird.getAreaKey());
            }
            String m71638m = C10628aL.m71638m(bird.getNestPurpose());
            if (m71638m == null) {
                interfaceC47496qV5.mo20954m1(55);
            } else {
                interfaceC47496qV5.mo20958G0(55, m71638m);
            }
            String m71632s = C10628aL.m71632s(bird.getPrivateBird());
            if (m71632s == null) {
                interfaceC47496qV5.mo20954m1(56);
            } else {
                interfaceC47496qV5.mo20958G0(56, m71632s);
            }
            String m55279e6 = Converters.m55279e(bird.getScannedAt());
            if (m55279e6 == null) {
                interfaceC47496qV5.mo20954m1(57);
            } else {
                interfaceC47496qV5.mo20958G0(57, m55279e6);
            }
            String m71639l = C10628aL.m71639l(bird.getBadgeType());
            if (m71639l == null) {
                interfaceC47496qV5.mo20954m1(58);
            } else {
                interfaceC47496qV5.mo20958G0(58, m71639l);
            }
            String m71643h = C10628aL.m71643h(bird.getBountyReasons());
            if (m71643h == null) {
                interfaceC47496qV5.mo20954m1(59);
            } else {
                interfaceC47496qV5.mo20958G0(59, m71643h);
            }
            if (bird.getEphemeralId() == null) {
                interfaceC47496qV5.mo20954m1(60);
            } else {
                interfaceC47496qV5.mo20958G0(60, bird.getEphemeralId());
            }
            if (bird.getBleMacAddress() == null) {
                interfaceC47496qV5.mo20954m1(61);
            } else {
                interfaceC47496qV5.mo20958G0(61, bird.getBleMacAddress());
            }
            Integer valueOf = bird.getHasHelmet() == null ? null : Integer.valueOf(bird.getHasHelmet().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(62);
            } else {
                interfaceC47496qV5.mo20956S0(62, valueOf.intValue());
            }
            String m55279e7 = Converters.m55279e(bird.getLocationUpdatedAt());
            if (m55279e7 == null) {
                interfaceC47496qV5.mo20954m1(63);
            } else {
                interfaceC47496qV5.mo20958G0(63, m55279e7);
            }
        }
    }

    /* renamed from: cL$h */
    /* loaded from: classes4.dex */
    public class C13507h extends AbstractC39268cf1<Bird> {
        public C13507h(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `bird` (`id`,`model`,`task_id`,`battery_level`,`estimated_range`,`distance`,`location`,`code`,`sticker_id`,`serial_number`,`disconnected`,`accident`,`submerged`,`lost`,`locked`,`ack_locked`,`captive`,`gps_fix`,`broken`,`label`,`actions`,`bounty_id`,`bounty_price`,`bounty_currency`,`bounty_lost`,`bounty_overdue`,`bounty_kind`,`brand_name`,`task_kind`,`gps_at`,`tracked_at`,`token`,`bluetooth`,`cellular`,`started_at`,`due_at`,`asleep`,`imei`,`board_protocol`,`physical_lock`,`physical_locks`,`priority_collect`,`down`,`needs_inspection`,`partner_id`,`nest_id`,`last_ride_ended_at`,`partner_bird_state`,`peril`,`deliverable`,`lifecycle`,`offline`,`license`,`area_key`,`nest_purpose`,`private_bird`,`scanned_at`,`badge_type`,`bounty_reasons`,`ephemeral_id`,`ble_mac_address`,`has_helmet`,`location_updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Bird bird) {
            if (bird.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bird.getId());
            }
            if (bird.getModel() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, bird.getModel());
            }
            if (bird.getTaskId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, bird.getTaskId());
            }
            interfaceC47496qV5.mo20956S0(4, bird.getBatteryLevel());
            if (bird.getEstimatedRange() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20956S0(5, bird.getEstimatedRange().intValue());
            }
            interfaceC47496qV5.mo20956S0(6, bird.getDistance());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(bird.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55271m);
            }
            if (bird.getCode() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, bird.getCode());
            }
            if (bird.getStickerId() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, bird.getStickerId());
            }
            if (bird.getSerialNumber() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, bird.getSerialNumber());
            }
            interfaceC47496qV5.mo20956S0(11, bird.getDisconnected() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, bird.getCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(13, bird.getSubmerged() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(14, bird.getLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(15, bird.getLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(16, bird.getAckLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(17, bird.getCaptive() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(18, bird.getGpsFix() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(19, bird.getBroken() ? 1L : 0L);
            C10628aL c10628aL = C10628aL.f50300a;
            String m71636o = C10628aL.m71636o(bird.getLabel());
            if (m71636o == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, m71636o);
            }
            String m71649b = C10628aL.m71649b(bird.getActions());
            if (m71649b == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, m71649b);
            }
            if (bird.getBountyId() == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20958G0(22, bird.getBountyId());
            }
            if (bird.getBountyPrice() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, bird.getBountyPrice().intValue());
            }
            if (bird.getBountyCurrency() == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, bird.getBountyCurrency());
            }
            interfaceC47496qV5.mo20956S0(25, bird.getBountyLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(26, bird.getBountyOverdue() ? 1L : 0L);
            String m71640k = C10628aL.m71640k(bird.getBountyKind());
            if (m71640k == null) {
                interfaceC47496qV5.mo20954m1(27);
            } else {
                interfaceC47496qV5.mo20958G0(27, m71640k);
            }
            if (bird.getBrandName() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20958G0(28, bird.getBrandName());
            }
            String m71641j = C10628aL.m71641j(bird.getTaskKind());
            if (m71641j == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20958G0(29, m71641j);
            }
            String m55279e = Converters.m55279e(bird.getGpsAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, m55279e);
            }
            String m55279e2 = Converters.m55279e(bird.getTrackedAt());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, m55279e2);
            }
            if (bird.getToken() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, bird.getToken());
            }
            interfaceC47496qV5.mo20956S0(33, bird.getBluetooth() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(34, bird.getCellular() ? 1L : 0L);
            String m55279e3 = Converters.m55279e(bird.getStartedAt());
            if (m55279e3 == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, m55279e3);
            }
            String m55279e4 = Converters.m55279e(bird.getDueAt());
            if (m55279e4 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m55279e4);
            }
            interfaceC47496qV5.mo20956S0(37, bird.getAsleep() ? 1L : 0L);
            if (bird.getImei() == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, bird.getImei());
            }
            if (bird.getBoardProtocol() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, bird.getBoardProtocol());
            }
            String m71633r = C10628aL.m71633r(bird.getPhysicalLock());
            if (m71633r == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m71633r);
            }
            String m71631t = C10628aL.m71631t(bird.getPhysicalLocks());
            if (m71631t == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m71631t);
            }
            interfaceC47496qV5.mo20956S0(42, bird.getPriorityCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(43, bird.getDown() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(44, bird.getNeedsInspection() ? 1L : 0L);
            if (bird.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, bird.getPartnerId());
            }
            if (bird.getNestId() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20958G0(46, bird.getNestId());
            }
            String m55279e5 = Converters.m55279e(bird.getLastRideEndedAt());
            if (m55279e5 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55279e5);
            }
            String m71637n = C10628aL.m71637n(bird.getPartnerBirdState());
            if (m71637n == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m71637n);
            }
            interfaceC47496qV5.mo20956S0(49, bird.getPeril() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(50, bird.getDeliverable() ? 1L : 0L);
            String m71634q = C10628aL.m71634q(bird.getLifecycle());
            if (m71634q == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, m71634q);
            }
            interfaceC47496qV5.mo20956S0(52, bird.getOffline() ? 1L : 0L);
            String m71635p = C10628aL.m71635p(bird.getLicense());
            if (m71635p == null) {
                interfaceC47496qV5.mo20954m1(53);
            } else {
                interfaceC47496qV5.mo20958G0(53, m71635p);
            }
            if (bird.getAreaKey() == null) {
                interfaceC47496qV5.mo20954m1(54);
            } else {
                interfaceC47496qV5.mo20958G0(54, bird.getAreaKey());
            }
            String m71638m = C10628aL.m71638m(bird.getNestPurpose());
            if (m71638m == null) {
                interfaceC47496qV5.mo20954m1(55);
            } else {
                interfaceC47496qV5.mo20958G0(55, m71638m);
            }
            String m71632s = C10628aL.m71632s(bird.getPrivateBird());
            if (m71632s == null) {
                interfaceC47496qV5.mo20954m1(56);
            } else {
                interfaceC47496qV5.mo20958G0(56, m71632s);
            }
            String m55279e6 = Converters.m55279e(bird.getScannedAt());
            if (m55279e6 == null) {
                interfaceC47496qV5.mo20954m1(57);
            } else {
                interfaceC47496qV5.mo20958G0(57, m55279e6);
            }
            String m71639l = C10628aL.m71639l(bird.getBadgeType());
            if (m71639l == null) {
                interfaceC47496qV5.mo20954m1(58);
            } else {
                interfaceC47496qV5.mo20958G0(58, m71639l);
            }
            String m71643h = C10628aL.m71643h(bird.getBountyReasons());
            if (m71643h == null) {
                interfaceC47496qV5.mo20954m1(59);
            } else {
                interfaceC47496qV5.mo20958G0(59, m71643h);
            }
            if (bird.getEphemeralId() == null) {
                interfaceC47496qV5.mo20954m1(60);
            } else {
                interfaceC47496qV5.mo20958G0(60, bird.getEphemeralId());
            }
            if (bird.getBleMacAddress() == null) {
                interfaceC47496qV5.mo20954m1(61);
            } else {
                interfaceC47496qV5.mo20958G0(61, bird.getBleMacAddress());
            }
            Integer valueOf = bird.getHasHelmet() == null ? null : Integer.valueOf(bird.getHasHelmet().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(62);
            } else {
                interfaceC47496qV5.mo20956S0(62, valueOf.intValue());
            }
            String m55279e7 = Converters.m55279e(bird.getLocationUpdatedAt());
            if (m55279e7 == null) {
                interfaceC47496qV5.mo20954m1(63);
            } else {
                interfaceC47496qV5.mo20958G0(63, m55279e7);
            }
        }
    }

    /* renamed from: cL$i */
    /* loaded from: classes4.dex */
    public class C13508i extends AbstractC38675bf1<Bird> {
        public C13508i(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `bird` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, Bird bird) {
            if (bird.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bird.getId());
            }
        }
    }

    /* renamed from: cL$j */
    /* loaded from: classes4.dex */
    public class C13509j extends AbstractC38675bf1<BirdMapMarkerUpdate> {
        public C13509j(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR ABORT `bird` SET `id` = ?,`battery_level` = ?,`location` = ?,`code` = ?,`label` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, BirdMapMarkerUpdate birdMapMarkerUpdate) {
            if (birdMapMarkerUpdate.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, birdMapMarkerUpdate.getId());
            }
            interfaceC47496qV5.mo20956S0(2, birdMapMarkerUpdate.getBatteryLevel());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(birdMapMarkerUpdate.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55271m);
            }
            if (birdMapMarkerUpdate.getCode() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, birdMapMarkerUpdate.getCode());
            }
            C10628aL c10628aL = C10628aL.f50300a;
            String m71636o = C10628aL.m71636o(birdMapMarkerUpdate.getLabel());
            if (m71636o == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m71636o);
            }
            if (birdMapMarkerUpdate.getId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, birdMapMarkerUpdate.getId());
            }
        }
    }

    /* renamed from: cL$k */
    /* loaded from: classes4.dex */
    public class C13510k extends AbstractC38675bf1<Bird> {
        public C13510k(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `bird` SET `id` = ?,`model` = ?,`task_id` = ?,`battery_level` = ?,`estimated_range` = ?,`distance` = ?,`location` = ?,`code` = ?,`sticker_id` = ?,`serial_number` = ?,`disconnected` = ?,`accident` = ?,`submerged` = ?,`lost` = ?,`locked` = ?,`ack_locked` = ?,`captive` = ?,`gps_fix` = ?,`broken` = ?,`label` = ?,`actions` = ?,`bounty_id` = ?,`bounty_price` = ?,`bounty_currency` = ?,`bounty_lost` = ?,`bounty_overdue` = ?,`bounty_kind` = ?,`brand_name` = ?,`task_kind` = ?,`gps_at` = ?,`tracked_at` = ?,`token` = ?,`bluetooth` = ?,`cellular` = ?,`started_at` = ?,`due_at` = ?,`asleep` = ?,`imei` = ?,`board_protocol` = ?,`physical_lock` = ?,`physical_locks` = ?,`priority_collect` = ?,`down` = ?,`needs_inspection` = ?,`partner_id` = ?,`nest_id` = ?,`last_ride_ended_at` = ?,`partner_bird_state` = ?,`peril` = ?,`deliverable` = ?,`lifecycle` = ?,`offline` = ?,`license` = ?,`area_key` = ?,`nest_purpose` = ?,`private_bird` = ?,`scanned_at` = ?,`badge_type` = ?,`bounty_reasons` = ?,`ephemeral_id` = ?,`ble_mac_address` = ?,`has_helmet` = ?,`location_updated_at` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, Bird bird) {
            if (bird.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bird.getId());
            }
            if (bird.getModel() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, bird.getModel());
            }
            if (bird.getTaskId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, bird.getTaskId());
            }
            interfaceC47496qV5.mo20956S0(4, bird.getBatteryLevel());
            if (bird.getEstimatedRange() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20956S0(5, bird.getEstimatedRange().intValue());
            }
            interfaceC47496qV5.mo20956S0(6, bird.getDistance());
            Converters converters = Converters.f66822a;
            String m55271m = Converters.m55271m(bird.getLocation());
            if (m55271m == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55271m);
            }
            if (bird.getCode() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, bird.getCode());
            }
            if (bird.getStickerId() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, bird.getStickerId());
            }
            if (bird.getSerialNumber() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, bird.getSerialNumber());
            }
            interfaceC47496qV5.mo20956S0(11, bird.getDisconnected() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(12, bird.getCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(13, bird.getSubmerged() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(14, bird.getLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(15, bird.getLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(16, bird.getAckLocked() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(17, bird.getCaptive() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(18, bird.getGpsFix() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(19, bird.getBroken() ? 1L : 0L);
            C10628aL c10628aL = C10628aL.f50300a;
            String m71636o = C10628aL.m71636o(bird.getLabel());
            if (m71636o == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, m71636o);
            }
            String m71649b = C10628aL.m71649b(bird.getActions());
            if (m71649b == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, m71649b);
            }
            if (bird.getBountyId() == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20958G0(22, bird.getBountyId());
            }
            if (bird.getBountyPrice() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20956S0(23, bird.getBountyPrice().intValue());
            }
            if (bird.getBountyCurrency() == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, bird.getBountyCurrency());
            }
            interfaceC47496qV5.mo20956S0(25, bird.getBountyLost() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(26, bird.getBountyOverdue() ? 1L : 0L);
            String m71640k = C10628aL.m71640k(bird.getBountyKind());
            if (m71640k == null) {
                interfaceC47496qV5.mo20954m1(27);
            } else {
                interfaceC47496qV5.mo20958G0(27, m71640k);
            }
            if (bird.getBrandName() == null) {
                interfaceC47496qV5.mo20954m1(28);
            } else {
                interfaceC47496qV5.mo20958G0(28, bird.getBrandName());
            }
            String m71641j = C10628aL.m71641j(bird.getTaskKind());
            if (m71641j == null) {
                interfaceC47496qV5.mo20954m1(29);
            } else {
                interfaceC47496qV5.mo20958G0(29, m71641j);
            }
            String m55279e = Converters.m55279e(bird.getGpsAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(30);
            } else {
                interfaceC47496qV5.mo20958G0(30, m55279e);
            }
            String m55279e2 = Converters.m55279e(bird.getTrackedAt());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(31);
            } else {
                interfaceC47496qV5.mo20958G0(31, m55279e2);
            }
            if (bird.getToken() == null) {
                interfaceC47496qV5.mo20954m1(32);
            } else {
                interfaceC47496qV5.mo20958G0(32, bird.getToken());
            }
            interfaceC47496qV5.mo20956S0(33, bird.getBluetooth() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(34, bird.getCellular() ? 1L : 0L);
            String m55279e3 = Converters.m55279e(bird.getStartedAt());
            if (m55279e3 == null) {
                interfaceC47496qV5.mo20954m1(35);
            } else {
                interfaceC47496qV5.mo20958G0(35, m55279e3);
            }
            String m55279e4 = Converters.m55279e(bird.getDueAt());
            if (m55279e4 == null) {
                interfaceC47496qV5.mo20954m1(36);
            } else {
                interfaceC47496qV5.mo20958G0(36, m55279e4);
            }
            interfaceC47496qV5.mo20956S0(37, bird.getAsleep() ? 1L : 0L);
            if (bird.getImei() == null) {
                interfaceC47496qV5.mo20954m1(38);
            } else {
                interfaceC47496qV5.mo20958G0(38, bird.getImei());
            }
            if (bird.getBoardProtocol() == null) {
                interfaceC47496qV5.mo20954m1(39);
            } else {
                interfaceC47496qV5.mo20958G0(39, bird.getBoardProtocol());
            }
            String m71633r = C10628aL.m71633r(bird.getPhysicalLock());
            if (m71633r == null) {
                interfaceC47496qV5.mo20954m1(40);
            } else {
                interfaceC47496qV5.mo20958G0(40, m71633r);
            }
            String m71631t = C10628aL.m71631t(bird.getPhysicalLocks());
            if (m71631t == null) {
                interfaceC47496qV5.mo20954m1(41);
            } else {
                interfaceC47496qV5.mo20958G0(41, m71631t);
            }
            interfaceC47496qV5.mo20956S0(42, bird.getPriorityCollect() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(43, bird.getDown() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(44, bird.getNeedsInspection() ? 1L : 0L);
            if (bird.getPartnerId() == null) {
                interfaceC47496qV5.mo20954m1(45);
            } else {
                interfaceC47496qV5.mo20958G0(45, bird.getPartnerId());
            }
            if (bird.getNestId() == null) {
                interfaceC47496qV5.mo20954m1(46);
            } else {
                interfaceC47496qV5.mo20958G0(46, bird.getNestId());
            }
            String m55279e5 = Converters.m55279e(bird.getLastRideEndedAt());
            if (m55279e5 == null) {
                interfaceC47496qV5.mo20954m1(47);
            } else {
                interfaceC47496qV5.mo20958G0(47, m55279e5);
            }
            String m71637n = C10628aL.m71637n(bird.getPartnerBirdState());
            if (m71637n == null) {
                interfaceC47496qV5.mo20954m1(48);
            } else {
                interfaceC47496qV5.mo20958G0(48, m71637n);
            }
            interfaceC47496qV5.mo20956S0(49, bird.getPeril() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(50, bird.getDeliverable() ? 1L : 0L);
            String m71634q = C10628aL.m71634q(bird.getLifecycle());
            if (m71634q == null) {
                interfaceC47496qV5.mo20954m1(51);
            } else {
                interfaceC47496qV5.mo20958G0(51, m71634q);
            }
            interfaceC47496qV5.mo20956S0(52, bird.getOffline() ? 1L : 0L);
            String m71635p = C10628aL.m71635p(bird.getLicense());
            if (m71635p == null) {
                interfaceC47496qV5.mo20954m1(53);
            } else {
                interfaceC47496qV5.mo20958G0(53, m71635p);
            }
            if (bird.getAreaKey() == null) {
                interfaceC47496qV5.mo20954m1(54);
            } else {
                interfaceC47496qV5.mo20958G0(54, bird.getAreaKey());
            }
            String m71638m = C10628aL.m71638m(bird.getNestPurpose());
            if (m71638m == null) {
                interfaceC47496qV5.mo20954m1(55);
            } else {
                interfaceC47496qV5.mo20958G0(55, m71638m);
            }
            String m71632s = C10628aL.m71632s(bird.getPrivateBird());
            if (m71632s == null) {
                interfaceC47496qV5.mo20954m1(56);
            } else {
                interfaceC47496qV5.mo20958G0(56, m71632s);
            }
            String m55279e6 = Converters.m55279e(bird.getScannedAt());
            if (m55279e6 == null) {
                interfaceC47496qV5.mo20954m1(57);
            } else {
                interfaceC47496qV5.mo20958G0(57, m55279e6);
            }
            String m71639l = C10628aL.m71639l(bird.getBadgeType());
            if (m71639l == null) {
                interfaceC47496qV5.mo20954m1(58);
            } else {
                interfaceC47496qV5.mo20958G0(58, m71639l);
            }
            String m71643h = C10628aL.m71643h(bird.getBountyReasons());
            if (m71643h == null) {
                interfaceC47496qV5.mo20954m1(59);
            } else {
                interfaceC47496qV5.mo20958G0(59, m71643h);
            }
            if (bird.getEphemeralId() == null) {
                interfaceC47496qV5.mo20954m1(60);
            } else {
                interfaceC47496qV5.mo20958G0(60, bird.getEphemeralId());
            }
            if (bird.getBleMacAddress() == null) {
                interfaceC47496qV5.mo20954m1(61);
            } else {
                interfaceC47496qV5.mo20958G0(61, bird.getBleMacAddress());
            }
            Integer valueOf = bird.getHasHelmet() == null ? null : Integer.valueOf(bird.getHasHelmet().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(62);
            } else {
                interfaceC47496qV5.mo20956S0(62, valueOf.intValue());
            }
            String m55279e7 = Converters.m55279e(bird.getLocationUpdatedAt());
            if (m55279e7 == null) {
                interfaceC47496qV5.mo20954m1(63);
            } else {
                interfaceC47496qV5.mo20958G0(63, m55279e7);
            }
            if (bird.getId() == null) {
                interfaceC47496qV5.mo20954m1(64);
            } else {
                interfaceC47496qV5.mo20958G0(64, bird.getId());
            }
        }
    }

    /* renamed from: cL$l */
    /* loaded from: classes4.dex */
    public class C13511l extends AbstractC41861gz5 {
        public C13511l(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bird";
        }
    }

    /* renamed from: cL$m */
    /* loaded from: classes4.dex */
    public class CallableC13512m implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Bird f60426b;

        public CallableC13512m(Bird bird) {
            this.f60426b = bird;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C13499cL.this.f60402a.m108730c();
            try {
                C13499cL.this.f60403b.m61088k(this.f60426b);
                C13499cL.this.f60402a.m108734A();
                C13499cL.this.f60402a.m108728g();
                return null;
            } catch (Throwable th) {
                C13499cL.this.f60402a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: cL$n */
    /* loaded from: classes4.dex */
    public class CallableC13513n implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f60428b;

        public CallableC13513n(List list) {
            this.f60428b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C13499cL.this.f60402a.m108730c();
            try {
                C13499cL.this.f60403b.m61089j(this.f60428b);
                C13499cL.this.f60402a.m108734A();
                C13499cL.this.f60402a.m108728g();
                return null;
            } catch (Throwable th) {
                C13499cL.this.f60402a.m108728g();
                throw th;
            }
        }
    }

    public C13499cL(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f60402a = abstractC32563Eb5;
        this.f60403b = new C13506g(abstractC32563Eb5);
        this.f60404c = new C13507h(abstractC32563Eb5);
        this.f60405d = new C13508i(abstractC32563Eb5);
        this.f60406e = new C13509j(abstractC32563Eb5);
        this.f60407f = new C13510k(abstractC32563Eb5);
        this.f60408g = new C13511l(abstractC32563Eb5);
    }

    /* renamed from: r */
    public static List<Class<?>> m61562r() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: a */
    public Observable<Bird> mo61579a(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird WHERE id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f60402a, false, new String[]{"bird"}, new CallableC13503d(m103680c));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: b */
    public AbstractC24490k<List<Bird>> mo61578b(List<String> list) {
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT * FROM bird WHERE id in (");
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
        return C37504Ze5.m72810a(this.f60402a, false, new String[]{"bird"}, new CallableC13504e(m103680c));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: c */
    public AbstractC23461c mo61577c() {
        return AbstractC23461c.m33078H(new CallableC13501b());
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: d */
    public List<String> mo61576d(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` FROM bird WHERE rowid in (");
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
        this.f60402a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f60402a, m103680c, false, null);
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

    @Override // p000.AbstractC12358bL
    /* renamed from: e */
    public List<Long> mo61575e(Bird... birdArr) {
        this.f60402a.m108731b();
        this.f60402a.m108730c();
        try {
            List<Long> m61084o = this.f60404c.m61084o(birdArr);
            this.f60402a.m108734A();
            return m61084o;
        } finally {
            this.f60402a.m108728g();
        }
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: f */
    public AbstractC23461c mo61574f(Bird bird) {
        return AbstractC23461c.m33078H(new CallableC13512m(bird));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: g */
    public AbstractC23461c mo61573g(List<Bird> list) {
        return AbstractC23461c.m33078H(new CallableC13513n(list));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: h */
    public Observable<List<Bird>> mo61572h() {
        return C37504Ze5.m72808c(this.f60402a, false, new String[]{"bird"}, new CallableC13502c(C33265Hb5.m103680c("SELECT `bird`.`id` AS `id`, `bird`.`model` AS `model`, `bird`.`task_id` AS `task_id`, `bird`.`battery_level` AS `battery_level`, `bird`.`estimated_range` AS `estimated_range`, `bird`.`distance` AS `distance`, `bird`.`location` AS `location`, `bird`.`code` AS `code`, `bird`.`sticker_id` AS `sticker_id`, `bird`.`serial_number` AS `serial_number`, `bird`.`disconnected` AS `disconnected`, `bird`.`accident` AS `accident`, `bird`.`submerged` AS `submerged`, `bird`.`lost` AS `lost`, `bird`.`locked` AS `locked`, `bird`.`ack_locked` AS `ack_locked`, `bird`.`captive` AS `captive`, `bird`.`gps_fix` AS `gps_fix`, `bird`.`broken` AS `broken`, `bird`.`label` AS `label`, `bird`.`actions` AS `actions`, `bird`.`bounty_id` AS `bounty_id`, `bird`.`bounty_price` AS `bounty_price`, `bird`.`bounty_currency` AS `bounty_currency`, `bird`.`bounty_lost` AS `bounty_lost`, `bird`.`bounty_overdue` AS `bounty_overdue`, `bird`.`bounty_kind` AS `bounty_kind`, `bird`.`brand_name` AS `brand_name`, `bird`.`task_kind` AS `task_kind`, `bird`.`gps_at` AS `gps_at`, `bird`.`tracked_at` AS `tracked_at`, `bird`.`token` AS `token`, `bird`.`bluetooth` AS `bluetooth`, `bird`.`cellular` AS `cellular`, `bird`.`started_at` AS `started_at`, `bird`.`due_at` AS `due_at`, `bird`.`asleep` AS `asleep`, `bird`.`imei` AS `imei`, `bird`.`board_protocol` AS `board_protocol`, `bird`.`physical_lock` AS `physical_lock`, `bird`.`physical_locks` AS `physical_locks`, `bird`.`priority_collect` AS `priority_collect`, `bird`.`down` AS `down`, `bird`.`needs_inspection` AS `needs_inspection`, `bird`.`partner_id` AS `partner_id`, `bird`.`nest_id` AS `nest_id`, `bird`.`last_ride_ended_at` AS `last_ride_ended_at`, `bird`.`partner_bird_state` AS `partner_bird_state`, `bird`.`peril` AS `peril`, `bird`.`deliverable` AS `deliverable`, `bird`.`lifecycle` AS `lifecycle`, `bird`.`offline` AS `offline`, `bird`.`license` AS `license`, `bird`.`area_key` AS `area_key`, `bird`.`nest_purpose` AS `nest_purpose`, `bird`.`private_bird` AS `private_bird`, `bird`.`scanned_at` AS `scanned_at`, `bird`.`badge_type` AS `badge_type`, `bird`.`bounty_reasons` AS `bounty_reasons`, `bird`.`ephemeral_id` AS `ephemeral_id`, `bird`.`ble_mac_address` AS `ble_mac_address`, `bird`.`has_helmet` AS `has_helmet`, `bird`.`location_updated_at` AS `location_updated_at` FROM bird WHERE private_bird IS NOT NULL", 0)));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: i */
    public AbstractC23461c mo61571i(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC13505f(list));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: j */
    public void mo61570j(Bird... birdArr) {
        this.f60402a.m108731b();
        this.f60402a.m108730c();
        try {
            this.f60407f.m64205l(birdArr);
            this.f60402a.m108734A();
        } finally {
            this.f60402a.m108728g();
        }
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: k */
    public AbstractC23461c mo61569k(BirdMapMarkerUpdate... birdMapMarkerUpdateArr) {
        return AbstractC23461c.m33078H(new CallableC13500a(birdMapMarkerUpdateArr));
    }

    @Override // p000.AbstractC12358bL
    /* renamed from: l */
    public void mo61568l(Bird... birdArr) {
        this.f60402a.m108730c();
        try {
            super.mo61568l(birdArr);
            this.f60402a.m108734A();
        } finally {
            this.f60402a.m108728g();
        }
    }
}
