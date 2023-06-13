package co.bird.android.persistence.area.impl;

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
public final class AreaDatabase_Impl extends AreaDatabase {

    /* renamed from: q */
    public volatile AbstractC9490Xm f66802q;

    /* renamed from: co.bird.android.persistence.area.impl.AreaDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16273a extends C33031Gb5.AbstractC2894b {
        public C16273a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `area` (`id` TEXT NOT NULL, `title` TEXT, `label` TEXT, `notes` TEXT, `hide_birds` INTEGER NOT NULL, `reject_drops` INTEGER NOT NULL, `no_rides` INTEGER NOT NULL, `no_parking` INTEGER NOT NULL, `preferred_parking` INTEGER NOT NULL, `delivery` INTEGER NOT NULL, `release_constrained` INTEGER NOT NULL, `is_demand_area` INTEGER NOT NULL, `fee_modified` INTEGER, `demand_level` INTEGER, `overlay_label` TEXT, `overlay_icon` TEXT, `overlay_min_zoom_level` INTEGER, `selected_overlay_label` TEXT, `region` TEXT NOT NULL, `color` INTEGER NOT NULL, `color_dark` INTEGER, `border_color` INTEGER NOT NULL, `border_color_dark` INTEGER, `title_color` INTEGER NOT NULL, `title_color_dark` INTEGER, `zoom_behavior` TEXT NOT NULL, `operational` INTEGER NOT NULL, `max_speed` INTEGER, `release_capacity` INTEGER, `no_parking_fine_alert_title` TEXT, `no_parking_fine_alert_message` TEXT, `rider_bar_in_ride_message_title` TEXT, `rider_bar_in_ride_message_body` TEXT, `rider_bar_not_in_ride_message_title` TEXT, `rider_bar_not_in_ride_message_body` TEXT, `rider_bar_in_ride_message_icon_type` TEXT NOT NULL, `rider_bar_not_in_ride_message_icon_type` TEXT NOT NULL, `area_release_capacity_icon_type` TEXT NOT NULL, `partner_id` TEXT, `fleet_ids` TEXT, `area_keys` TEXT, `universal` INTEGER NOT NULL, `no_parking_fine_currency` TEXT, `no_parking_warning_alert_title` TEXT, `no_parking_warning_alert_body` TEXT, `no_parking_fine_amount` INTEGER, `areas_merged` TEXT, `center_point` TEXT, `role` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `zone_id` TEXT, `walkway` INTEGER, PRIMARY KEY(`id`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3ff962d986233e40c6d03620266af9c1')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `area`");
            if (AreaDatabase_Impl.this.f7778h != null) {
                int size = AreaDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AreaDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (AreaDatabase_Impl.this.f7778h != null) {
                int size = AreaDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AreaDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            AreaDatabase_Impl.this.f7771a = interfaceC45124mV5;
            AreaDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (AreaDatabase_Impl.this.f7778h != null) {
                int size = AreaDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) AreaDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(52);
            hashMap.put("id", new C49301tY5.C28782a("id", "TEXT", true, 1, null, 1));
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", false, 0, null, 1));
            hashMap.put("label", new C49301tY5.C28782a("label", "TEXT", false, 0, null, 1));
            hashMap.put("notes", new C49301tY5.C28782a("notes", "TEXT", false, 0, null, 1));
            hashMap.put("hide_birds", new C49301tY5.C28782a("hide_birds", "INTEGER", true, 0, null, 1));
            hashMap.put("reject_drops", new C49301tY5.C28782a("reject_drops", "INTEGER", true, 0, null, 1));
            hashMap.put("no_rides", new C49301tY5.C28782a("no_rides", "INTEGER", true, 0, null, 1));
            hashMap.put("no_parking", new C49301tY5.C28782a("no_parking", "INTEGER", true, 0, null, 1));
            hashMap.put("preferred_parking", new C49301tY5.C28782a("preferred_parking", "INTEGER", true, 0, null, 1));
            hashMap.put("delivery", new C49301tY5.C28782a("delivery", "INTEGER", true, 0, null, 1));
            hashMap.put("release_constrained", new C49301tY5.C28782a("release_constrained", "INTEGER", true, 0, null, 1));
            hashMap.put("is_demand_area", new C49301tY5.C28782a("is_demand_area", "INTEGER", true, 0, null, 1));
            hashMap.put("fee_modified", new C49301tY5.C28782a("fee_modified", "INTEGER", false, 0, null, 1));
            hashMap.put("demand_level", new C49301tY5.C28782a("demand_level", "INTEGER", false, 0, null, 1));
            hashMap.put("overlay_label", new C49301tY5.C28782a("overlay_label", "TEXT", false, 0, null, 1));
            hashMap.put("overlay_icon", new C49301tY5.C28782a("overlay_icon", "TEXT", false, 0, null, 1));
            hashMap.put("overlay_min_zoom_level", new C49301tY5.C28782a("overlay_min_zoom_level", "INTEGER", false, 0, null, 1));
            hashMap.put("selected_overlay_label", new C49301tY5.C28782a("selected_overlay_label", "TEXT", false, 0, null, 1));
            hashMap.put("region", new C49301tY5.C28782a("region", "TEXT", true, 0, null, 1));
            hashMap.put("color", new C49301tY5.C28782a("color", "INTEGER", true, 0, null, 1));
            hashMap.put("color_dark", new C49301tY5.C28782a("color_dark", "INTEGER", false, 0, null, 1));
            hashMap.put("border_color", new C49301tY5.C28782a("border_color", "INTEGER", true, 0, null, 1));
            hashMap.put("border_color_dark", new C49301tY5.C28782a("border_color_dark", "INTEGER", false, 0, null, 1));
            hashMap.put("title_color", new C49301tY5.C28782a("title_color", "INTEGER", true, 0, null, 1));
            hashMap.put("title_color_dark", new C49301tY5.C28782a("title_color_dark", "INTEGER", false, 0, null, 1));
            hashMap.put("zoom_behavior", new C49301tY5.C28782a("zoom_behavior", "TEXT", true, 0, null, 1));
            hashMap.put("operational", new C49301tY5.C28782a("operational", "INTEGER", true, 0, null, 1));
            hashMap.put("max_speed", new C49301tY5.C28782a("max_speed", "INTEGER", false, 0, null, 1));
            hashMap.put("release_capacity", new C49301tY5.C28782a("release_capacity", "INTEGER", false, 0, null, 1));
            hashMap.put("no_parking_fine_alert_title", new C49301tY5.C28782a("no_parking_fine_alert_title", "TEXT", false, 0, null, 1));
            hashMap.put("no_parking_fine_alert_message", new C49301tY5.C28782a("no_parking_fine_alert_message", "TEXT", false, 0, null, 1));
            hashMap.put("rider_bar_in_ride_message_title", new C49301tY5.C28782a("rider_bar_in_ride_message_title", "TEXT", false, 0, null, 1));
            hashMap.put("rider_bar_in_ride_message_body", new C49301tY5.C28782a("rider_bar_in_ride_message_body", "TEXT", false, 0, null, 1));
            hashMap.put("rider_bar_not_in_ride_message_title", new C49301tY5.C28782a("rider_bar_not_in_ride_message_title", "TEXT", false, 0, null, 1));
            hashMap.put("rider_bar_not_in_ride_message_body", new C49301tY5.C28782a("rider_bar_not_in_ride_message_body", "TEXT", false, 0, null, 1));
            hashMap.put("rider_bar_in_ride_message_icon_type", new C49301tY5.C28782a("rider_bar_in_ride_message_icon_type", "TEXT", true, 0, null, 1));
            hashMap.put("rider_bar_not_in_ride_message_icon_type", new C49301tY5.C28782a("rider_bar_not_in_ride_message_icon_type", "TEXT", true, 0, null, 1));
            hashMap.put("area_release_capacity_icon_type", new C49301tY5.C28782a("area_release_capacity_icon_type", "TEXT", true, 0, null, 1));
            hashMap.put("partner_id", new C49301tY5.C28782a("partner_id", "TEXT", false, 0, null, 1));
            hashMap.put("fleet_ids", new C49301tY5.C28782a("fleet_ids", "TEXT", false, 0, null, 1));
            hashMap.put("area_keys", new C49301tY5.C28782a("area_keys", "TEXT", false, 0, null, 1));
            hashMap.put("universal", new C49301tY5.C28782a("universal", "INTEGER", true, 0, null, 1));
            hashMap.put("no_parking_fine_currency", new C49301tY5.C28782a("no_parking_fine_currency", "TEXT", false, 0, null, 1));
            hashMap.put("no_parking_warning_alert_title", new C49301tY5.C28782a("no_parking_warning_alert_title", "TEXT", false, 0, null, 1));
            hashMap.put("no_parking_warning_alert_body", new C49301tY5.C28782a("no_parking_warning_alert_body", "TEXT", false, 0, null, 1));
            hashMap.put("no_parking_fine_amount", new C49301tY5.C28782a("no_parking_fine_amount", "INTEGER", false, 0, null, 1));
            hashMap.put("areas_merged", new C49301tY5.C28782a("areas_merged", "TEXT", false, 0, null, 1));
            hashMap.put("center_point", new C49301tY5.C28782a("center_point", "TEXT", false, 0, null, 1));
            hashMap.put("role", new C49301tY5.C28782a("role", "TEXT", true, 0, null, 1));
            hashMap.put("updatedAt", new C49301tY5.C28782a("updatedAt", "TEXT", true, 0, null, 1));
            hashMap.put("zone_id", new C49301tY5.C28782a("zone_id", "TEXT", false, 0, null, 1));
            hashMap.put("walkway", new C49301tY5.C28782a("walkway", "INTEGER", false, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("area", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "area");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "area(co.bird.android.model.persistence.Area).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.area.impl.AreaDatabase
    /* renamed from: C */
    public AbstractC9490Xm mo55358C() {
        AbstractC9490Xm abstractC9490Xm;
        if (this.f66802q != null) {
            return this.f66802q;
        }
        synchronized (this) {
            if (this.f66802q == null) {
                this.f66802q = new C9964Ym(this);
            }
            abstractC9490Xm = this.f66802q;
        }
        return abstractC9490Xm;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "area");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16273a(4), "3ff962d986233e40c6d03620266af9c1", "32c4e9edcd83688427f576010fcb3351")).m23589b());
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
        hashMap.put(AbstractC9490Xm.class, C9964Ym.m74295r());
        return hashMap;
    }
}
