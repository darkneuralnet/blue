package co.bird.android.persistence.bird.impl;

import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC32563Eb5;
import p000.C33031Gb5;
import p000.C49301tY5;
import p000.InterfaceC45717nV5;
/* loaded from: classes4.dex */
public final class BirdDatabase_Impl extends BirdDatabase {

    /* renamed from: q */
    public volatile AbstractC12358bL f66805q;

    /* renamed from: r */
    public volatile AbstractC4030JM f66806r;

    /* renamed from: s */
    public volatile AbstractC42498i40 f66807s;

    /* renamed from: co.bird.android.persistence.bird.impl.BirdDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16275a extends C33031Gb5.AbstractC2894b {
        public C16275a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bird` (`id` TEXT NOT NULL, `model` TEXT, `task_id` TEXT, `battery_level` INTEGER NOT NULL, `estimated_range` INTEGER, `distance` INTEGER NOT NULL, `location` TEXT NOT NULL, `code` TEXT NOT NULL, `sticker_id` TEXT, `serial_number` TEXT NOT NULL, `disconnected` INTEGER NOT NULL, `accident` INTEGER NOT NULL, `submerged` INTEGER NOT NULL, `lost` INTEGER NOT NULL, `locked` INTEGER NOT NULL, `ack_locked` INTEGER NOT NULL, `captive` INTEGER NOT NULL, `gps_fix` INTEGER NOT NULL, `broken` INTEGER NOT NULL, `label` TEXT NOT NULL, `actions` TEXT NOT NULL, `bounty_id` TEXT, `bounty_price` INTEGER, `bounty_currency` TEXT NOT NULL, `bounty_lost` INTEGER NOT NULL, `bounty_overdue` INTEGER NOT NULL, `bounty_kind` TEXT NOT NULL, `brand_name` TEXT, `task_kind` TEXT NOT NULL, `gps_at` TEXT, `tracked_at` TEXT, `token` TEXT, `bluetooth` INTEGER NOT NULL, `cellular` INTEGER NOT NULL, `started_at` TEXT, `due_at` TEXT, `asleep` INTEGER NOT NULL, `imei` TEXT, `board_protocol` TEXT, `physical_lock` TEXT, `physical_locks` TEXT, `priority_collect` INTEGER NOT NULL, `down` INTEGER NOT NULL, `needs_inspection` INTEGER NOT NULL, `partner_id` TEXT, `nest_id` TEXT, `last_ride_ended_at` TEXT, `partner_bird_state` TEXT, `peril` INTEGER NOT NULL, `deliverable` INTEGER NOT NULL, `lifecycle` TEXT NOT NULL, `offline` INTEGER NOT NULL, `license` TEXT, `area_key` TEXT, `nest_purpose` TEXT, `private_bird` TEXT, `scanned_at` TEXT, `badge_type` TEXT NOT NULL, `bounty_reasons` TEXT NOT NULL, `ephemeral_id` TEXT, `ble_mac_address` TEXT, `has_helmet` INTEGER, `location_updated_at` TEXT, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bird_map_markers` (`id` TEXT NOT NULL, `battery_level` INTEGER NOT NULL, `location` TEXT NOT NULL, `code` TEXT NOT NULL, `fleet_marker` TEXT NOT NULL, `filter_hash` TEXT NOT NULL, `updated_at` TEXT NOT NULL, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `bulk_scan_purpose_bird` (`bird_id` TEXT NOT NULL, `purpose` TEXT NOT NULL, PRIMARY KEY(`bird_id`, `purpose`), FOREIGN KEY(`bird_id`) REFERENCES `bird`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            interfaceC45124mV5.mo25497G1("CREATE INDEX IF NOT EXISTS `index_bulk_scan_purpose_bird_by_purpose` ON `bulk_scan_purpose_bird` (`purpose`)");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e99b26f117bbff9b672a4a1d58cce5de')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bird`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bird_map_markers`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `bulk_scan_purpose_bird`");
            if (BirdDatabase_Impl.this.f7778h != null) {
                int size = BirdDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (BirdDatabase_Impl.this.f7778h != null) {
                int size = BirdDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            BirdDatabase_Impl.this.f7771a = interfaceC45124mV5;
            interfaceC45124mV5.mo25497G1("PRAGMA foreign_keys = ON");
            BirdDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (BirdDatabase_Impl.this.f7778h != null) {
                int size = BirdDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) BirdDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: e */
        public void mo52988e(InterfaceC45124mV5 interfaceC45124mV5) {
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: f */
        public void mo52987f(InterfaceC45124mV5 interfaceC45124mV5) {
            IF0.m102674b(interfaceC45124mV5);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: g */
        public C33031Gb5.C2895c mo52986g(InterfaceC45124mV5 interfaceC45124mV5) {
            HashMap hashMap = new HashMap(63);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put(RequestHeadersFactory.MODEL, new C49301tY5.C28782a(RequestHeadersFactory.MODEL, "TEXT", false, 0, null, 1));
            hashMap.put("task_id", new C49301tY5.C28782a("task_id", "TEXT", false, 0, null, 1));
            hashMap.put("battery_level", new C49301tY5.C28782a("battery_level", "INTEGER", true, 0, null, 1));
            hashMap.put("estimated_range", new C49301tY5.C28782a("estimated_range", "INTEGER", false, 0, null, 1));
            hashMap.put("distance", new C49301tY5.C28782a("distance", "INTEGER", true, 0, null, 1));
            hashMap.put("location", new C49301tY5.C28782a("location", "TEXT", true, 0, null, 1));
            hashMap.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, new C49301tY5.C28782a(PaymentMethodOptionsParams.Blik.PARAM_CODE, "TEXT", true, 0, null, 1));
            hashMap.put("sticker_id", new C49301tY5.C28782a("sticker_id", "TEXT", false, 0, null, 1));
            hashMap.put("serial_number", new C49301tY5.C28782a("serial_number", "TEXT", true, 0, null, 1));
            hashMap.put("disconnected", new C49301tY5.C28782a("disconnected", "INTEGER", true, 0, null, 1));
            hashMap.put("accident", new C49301tY5.C28782a("accident", "INTEGER", true, 0, null, 1));
            hashMap.put("submerged", new C49301tY5.C28782a("submerged", "INTEGER", true, 0, null, 1));
            hashMap.put("lost", new C49301tY5.C28782a("lost", "INTEGER", true, 0, null, 1));
            hashMap.put("locked", new C49301tY5.C28782a("locked", "INTEGER", true, 0, null, 1));
            hashMap.put("ack_locked", new C49301tY5.C28782a("ack_locked", "INTEGER", true, 0, null, 1));
            hashMap.put("captive", new C49301tY5.C28782a("captive", "INTEGER", true, 0, null, 1));
            hashMap.put("gps_fix", new C49301tY5.C28782a("gps_fix", "INTEGER", true, 0, null, 1));
            hashMap.put("broken", new C49301tY5.C28782a("broken", "INTEGER", true, 0, null, 1));
            hashMap.put("label", new C49301tY5.C28782a("label", "TEXT", true, 0, null, 1));
            hashMap.put("actions", new C49301tY5.C28782a("actions", "TEXT", true, 0, null, 1));
            hashMap.put("bounty_id", new C49301tY5.C28782a("bounty_id", "TEXT", false, 0, null, 1));
            hashMap.put("bounty_price", new C49301tY5.C28782a("bounty_price", "INTEGER", false, 0, null, 1));
            hashMap.put("bounty_currency", new C49301tY5.C28782a("bounty_currency", "TEXT", true, 0, null, 1));
            hashMap.put("bounty_lost", new C49301tY5.C28782a("bounty_lost", "INTEGER", true, 0, null, 1));
            hashMap.put("bounty_overdue", new C49301tY5.C28782a("bounty_overdue", "INTEGER", true, 0, null, 1));
            hashMap.put("bounty_kind", new C49301tY5.C28782a("bounty_kind", "TEXT", true, 0, null, 1));
            hashMap.put("brand_name", new C49301tY5.C28782a("brand_name", "TEXT", false, 0, null, 1));
            hashMap.put("task_kind", new C49301tY5.C28782a("task_kind", "TEXT", true, 0, null, 1));
            hashMap.put("gps_at", new C49301tY5.C28782a("gps_at", "TEXT", false, 0, null, 1));
            hashMap.put("tracked_at", new C49301tY5.C28782a("tracked_at", "TEXT", false, 0, null, 1));
            hashMap.put("token", new C49301tY5.C28782a("token", "TEXT", false, 0, null, 1));
            hashMap.put("bluetooth", new C49301tY5.C28782a("bluetooth", "INTEGER", true, 0, null, 1));
            hashMap.put("cellular", new C49301tY5.C28782a("cellular", "INTEGER", true, 0, null, 1));
            hashMap.put("started_at", new C49301tY5.C28782a("started_at", "TEXT", false, 0, null, 1));
            hashMap.put("due_at", new C49301tY5.C28782a("due_at", "TEXT", false, 0, null, 1));
            hashMap.put("asleep", new C49301tY5.C28782a("asleep", "INTEGER", true, 0, null, 1));
            hashMap.put("imei", new C49301tY5.C28782a("imei", "TEXT", false, 0, null, 1));
            hashMap.put("board_protocol", new C49301tY5.C28782a("board_protocol", "TEXT", false, 0, null, 1));
            hashMap.put("physical_lock", new C49301tY5.C28782a("physical_lock", "TEXT", false, 0, null, 1));
            hashMap.put("physical_locks", new C49301tY5.C28782a("physical_locks", "TEXT", false, 0, null, 1));
            hashMap.put("priority_collect", new C49301tY5.C28782a("priority_collect", "INTEGER", true, 0, null, 1));
            hashMap.put("down", new C49301tY5.C28782a("down", "INTEGER", true, 0, null, 1));
            hashMap.put("needs_inspection", new C49301tY5.C28782a("needs_inspection", "INTEGER", true, 0, null, 1));
            hashMap.put("partner_id", new C49301tY5.C28782a("partner_id", "TEXT", false, 0, null, 1));
            hashMap.put("nest_id", new C49301tY5.C28782a("nest_id", "TEXT", false, 0, null, 1));
            hashMap.put("last_ride_ended_at", new C49301tY5.C28782a("last_ride_ended_at", "TEXT", false, 0, null, 1));
            hashMap.put("partner_bird_state", new C49301tY5.C28782a("partner_bird_state", "TEXT", false, 0, null, 1));
            hashMap.put("peril", new C49301tY5.C28782a("peril", "INTEGER", true, 0, null, 1));
            hashMap.put("deliverable", new C49301tY5.C28782a("deliverable", "INTEGER", true, 0, null, 1));
            hashMap.put("lifecycle", new C49301tY5.C28782a("lifecycle", "TEXT", true, 0, null, 1));
            hashMap.put("offline", new C49301tY5.C28782a("offline", "INTEGER", true, 0, null, 1));
            hashMap.put("license", new C49301tY5.C28782a("license", "TEXT", false, 0, null, 1));
            hashMap.put("area_key", new C49301tY5.C28782a("area_key", "TEXT", false, 0, null, 1));
            hashMap.put("nest_purpose", new C49301tY5.C28782a("nest_purpose", "TEXT", false, 0, null, 1));
            hashMap.put("private_bird", new C49301tY5.C28782a("private_bird", "TEXT", false, 0, null, 1));
            hashMap.put("scanned_at", new C49301tY5.C28782a("scanned_at", "TEXT", false, 0, null, 1));
            hashMap.put("badge_type", new C49301tY5.C28782a("badge_type", "TEXT", true, 0, null, 1));
            hashMap.put("bounty_reasons", new C49301tY5.C28782a("bounty_reasons", "TEXT", true, 0, null, 1));
            hashMap.put("ephemeral_id", new C49301tY5.C28782a("ephemeral_id", "TEXT", false, 0, null, 1));
            hashMap.put("ble_mac_address", new C49301tY5.C28782a("ble_mac_address", "TEXT", false, 0, null, 1));
            hashMap.put("has_helmet", new C49301tY5.C28782a("has_helmet", "INTEGER", false, 0, null, 1));
            hashMap.put("location_updated_at", new C49301tY5.C28782a("location_updated_at", "TEXT", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("bird", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "bird");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "bird(co.bird.android.model.persistence.Bird).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("battery_level", new C49301tY5.C28782a("battery_level", "INTEGER", true, 0, null, 1));
            hashMap2.put("location", new C49301tY5.C28782a("location", "TEXT", true, 0, null, 1));
            hashMap2.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, new C49301tY5.C28782a(PaymentMethodOptionsParams.Blik.PARAM_CODE, "TEXT", true, 0, null, 1));
            hashMap2.put("fleet_marker", new C49301tY5.C28782a("fleet_marker", "TEXT", true, 0, null, 1));
            hashMap2.put("filter_hash", new C49301tY5.C28782a("filter_hash", "TEXT", true, 0, null, 1));
            hashMap2.put("updated_at", new C49301tY5.C28782a("updated_at", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("bird_map_markers", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "bird_map_markers");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "bird_map_markers(co.bird.android.model.persistence.BirdMapMarker).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("bird_id", new C49301tY5.C28782a("bird_id", "TEXT", true, 1, null, 1));
            hashMap3.put("purpose", new C49301tY5.C28782a("purpose", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new C49301tY5.C28785c("bird", "CASCADE", "NO ACTION", Arrays.asList("bird_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C49301tY5.C28787e("index_bulk_scan_purpose_bird_by_purpose", false, Arrays.asList("purpose"), Arrays.asList("ASC")));
            C49301tY5 c49301tY53 = new C49301tY5("bulk_scan_purpose_bird", hashMap3, hashSet, hashSet2);
            C49301tY5 m12061a3 = C49301tY5.m12061a(interfaceC45124mV5, "bulk_scan_purpose_bird");
            if (!c49301tY53.equals(m12061a3)) {
                return new C33031Gb5.C2895c(false, "bulk_scan_purpose_bird(co.bird.android.model.persistence.BulkScanPurposeBird).\n Expected:\n" + c49301tY53 + "\n Found:\n" + m12061a3);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.bird.impl.BirdDatabase
    /* renamed from: C */
    public AbstractC12358bL mo55346C() {
        AbstractC12358bL abstractC12358bL;
        if (this.f66805q != null) {
            return this.f66805q;
        }
        synchronized (this) {
            if (this.f66805q == null) {
                this.f66805q = new C13499cL(this);
            }
            abstractC12358bL = this.f66805q;
        }
        return abstractC12358bL;
    }

    @Override // co.bird.android.persistence.bird.impl.BirdDatabase
    /* renamed from: D */
    public AbstractC4030JM mo55345D() {
        AbstractC4030JM abstractC4030JM;
        if (this.f66806r != null) {
            return this.f66806r;
        }
        synchronized (this) {
            if (this.f66806r == null) {
                this.f66806r = new C4398KM(this);
            }
            abstractC4030JM = this.f66806r;
        }
        return abstractC4030JM;
    }

    @Override // co.bird.android.persistence.bird.impl.BirdDatabase
    /* renamed from: E */
    public AbstractC42498i40 mo55344E() {
        AbstractC42498i40 abstractC42498i40;
        if (this.f66807s != null) {
            return this.f66807s;
        }
        synchronized (this) {
            if (this.f66807s == null) {
                this.f66807s = new C43091j40(this);
            }
            abstractC42498i40 = this.f66807s;
        }
        return abstractC42498i40;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "bird", "bird_map_markers", "bulk_scan_purpose_bird");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16275a(14), "e99b26f117bbff9b672a4a1d58cce5de", "da662aea2677732ab03a0005b410c7d4")).m23589b());
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: h */
    public List<AbstractC39165cU2> mo52995h(Map<Class<? extends InterfaceC7937Tq>, InterfaceC7937Tq> map) {
        return Arrays.asList(new AbstractC39165cU2[0]);
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: n */
    public Set<Class<? extends InterfaceC7937Tq>> mo52994n() {
        return new HashSet();
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: o */
    public Map<Class<?>, List<Class<?>>> mo52993o() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC12358bL.class, C13499cL.m61562r());
        hashMap.put(AbstractC4030JM.class, C4398KM.m98984r());
        hashMap.put(AbstractC42498i40.class, C43091j40.m31190j());
        return hashMap;
    }
}
