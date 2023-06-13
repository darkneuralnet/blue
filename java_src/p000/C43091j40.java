package p000;

import android.database.Cursor;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.NestPurpose;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.BulkScanPurposeBird;
import co.bird.android.model.persistence.nestedstructures.BirdLabel;
import co.bird.android.model.persistence.nestedstructures.BirdLicenseView;
import co.bird.android.model.persistence.nestedstructures.BountyReason;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.Lifecycle;
import co.bird.android.model.persistence.nestedstructures.PhysicalLock;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.persistence.common.impl.Converters;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: j40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43091j40 extends AbstractC42498i40 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f92083a;

    /* renamed from: b */
    public final AbstractC39268cf1<BulkScanPurposeBird> f92084b;

    /* renamed from: c */
    public final AbstractC41861gz5 f92085c;

    /* renamed from: d */
    public final AbstractC41861gz5 f92086d;

    /* renamed from: j40$a */
    /* loaded from: classes4.dex */
    public class C24696a extends AbstractC39268cf1<BulkScanPurposeBird> {
        public C24696a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `bulk_scan_purpose_bird` (`bird_id`,`purpose`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BulkScanPurposeBird bulkScanPurposeBird) {
            if (bulkScanPurposeBird.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bulkScanPurposeBird.getBirdId());
            }
            if (bulkScanPurposeBird.getPurpose() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, C43091j40.this.m31191i(bulkScanPurposeBird.getPurpose()));
            }
        }
    }

    /* renamed from: j40$b */
    /* loaded from: classes4.dex */
    public class C24697b extends AbstractC41861gz5 {
        public C24697b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bulk_scan_purpose_bird WHERE purpose = ?";
        }
    }

    /* renamed from: j40$c */
    /* loaded from: classes4.dex */
    public class C24698c extends AbstractC41861gz5 {
        public C24698c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bulk_scan_purpose_bird";
        }
    }

    /* renamed from: j40$d */
    /* loaded from: classes4.dex */
    public class CallableC24699d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ BulkScanPurposeBird f92090b;

        public CallableC24699d(BulkScanPurposeBird bulkScanPurposeBird) {
            this.f92090b = bulkScanPurposeBird;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C43091j40.this.f92083a.m108730c();
            try {
                C43091j40.this.f92084b.m61088k(this.f92090b);
                C43091j40.this.f92083a.m108734A();
                C43091j40.this.f92083a.m108728g();
                return null;
            } catch (Throwable th) {
                C43091j40.this.f92083a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: j40$e */
    /* loaded from: classes4.dex */
    public class CallableC24700e implements Callable<Void> {
        public CallableC24700e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C43091j40.this.f92086d.m37254b();
            C43091j40.this.f92083a.m108730c();
            try {
                m37254b.mo17482M();
                C43091j40.this.f92083a.m108734A();
                C43091j40.this.f92083a.m108728g();
                C43091j40.this.f92086d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C43091j40.this.f92083a.m108728g();
                C43091j40.this.f92086d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: j40$f */
    /* loaded from: classes4.dex */
    public class CallableC24701f implements Callable<List<Bird>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f92093b;

        public CallableC24701f(C33265Hb5 c33265Hb5) {
            this.f92093b = c33265Hb5;
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
            Cursor m102673c = IF0.m102673c(C43091j40.this.f92083a, this.f92093b, false, null);
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
            this.f92093b.release();
        }
    }

    /* renamed from: j40$g */
    /* loaded from: classes4.dex */
    public class CallableC24702g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String[] f92095b;

        public CallableC24702g(String[] strArr) {
            this.f92095b = strArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            String[] strArr;
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM bulk_scan_purpose_bird WHERE bird_id IN (");
            C42725iS5.m33906a(m33905b, this.f92095b.length);
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C43091j40.this.f92083a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f92095b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C43091j40.this.f92083a.m108730c();
            try {
                m108729d.mo17482M();
                C43091j40.this.f92083a.m108734A();
                C43091j40.this.f92083a.m108728g();
                return null;
            } catch (Throwable th) {
                C43091j40.this.f92083a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: j40$h */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C24703h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f92097a;

        static {
            int[] iArr = new int[BulkScanPurpose.values().length];
            f92097a = iArr;
            try {
                iArr[BulkScanPurpose.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92097a[BulkScanPurpose.SERVICE_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92097a[BulkScanPurpose.WAKE_VEHICLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92097a[BulkScanPurpose.ADD_TO_BATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92097a[BulkScanPurpose.PART_SCAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C43091j40(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f92083a = abstractC32563Eb5;
        this.f92084b = new C24696a(abstractC32563Eb5);
        this.f92085c = new C24697b(abstractC32563Eb5);
        this.f92086d = new C24698c(abstractC32563Eb5);
    }

    /* renamed from: j */
    public static List<Class<?>> m31190j() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC42498i40
    /* renamed from: a */
    public AbstractC23461c mo31199a() {
        return AbstractC23461c.m33078H(new CallableC24700e());
    }

    @Override // p000.AbstractC42498i40
    /* renamed from: b */
    public AbstractC23461c mo31198b(String... strArr) {
        return AbstractC23461c.m33078H(new CallableC24702g(strArr));
    }

    @Override // p000.AbstractC42498i40
    /* renamed from: c */
    public AbstractC23461c mo31197c(BulkScanPurposeBird bulkScanPurposeBird) {
        return AbstractC23461c.m33078H(new CallableC24699d(bulkScanPurposeBird));
    }

    @Override // p000.AbstractC42498i40
    /* renamed from: d */
    public Observable<List<Bird>> mo31196d(BulkScanPurpose bulkScanPurpose) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("\n    SELECT * \n    FROM bird \n    INNER JOIN bulk_scan_purpose_bird \n    ON bird.id=bulk_scan_purpose_bird.bird_id \n    AND bulk_scan_purpose_bird.purpose = ?\n  ", 1);
        if (bulkScanPurpose == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m31191i(bulkScanPurpose));
        }
        return C37504Ze5.m72808c(this.f92083a, false, new String[]{"bird", "bulk_scan_purpose_bird"}, new CallableC24701f(m103680c));
    }

    /* renamed from: i */
    public final String m31191i(BulkScanPurpose bulkScanPurpose) {
        if (bulkScanPurpose == null) {
            return null;
        }
        int i = C24703h.f92097a[bulkScanPurpose.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "PART_SCAN";
                        }
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + bulkScanPurpose);
                    }
                    return "ADD_TO_BATCH";
                }
                return "WAKE_VEHICLES";
            }
            return "SERVICE_CENTER";
        }
        return "MAP";
    }
}
