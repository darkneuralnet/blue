package co.bird.android.persistence.complaintresolution.impl;

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
public final class ComplaintResolutionDatabase_Impl extends ComplaintResolutionDatabase {

    /* renamed from: q */
    public volatile AbstractC35033Oq0 f66828q;

    /* renamed from: r */
    public volatile AbstractC34565Mq0 f66829r;

    /* renamed from: co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase_Impl$a */
    /* loaded from: classes4.dex */
    public class C16285a extends C33031Gb5.AbstractC2894b {
        public C16285a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `complaint_resolution_form` (`action_taken_required_fields` TEXT NOT NULL, `no_action_taken_required_fields` TEXT NOT NULL, `issue_options` TEXT NOT NULL, `action_taken_options` TEXT NOT NULL, PRIMARY KEY(`action_taken_required_fields`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `complaint_resolution` (`complaint_hash` INTEGER NOT NULL, `complaint_ids` TEXT NOT NULL, `situation` TEXT NOT NULL, `before_photo_asset_id` TEXT, `before_photo_url` TEXT, `after_photo_asset_id` TEXT, `after_photo_url` TEXT, `issues` TEXT, `action_taken` TEXT, `vehicle_ids_involved` TEXT, `additional_notes` TEXT, `submitted` INTEGER NOT NULL, PRIMARY KEY(`complaint_hash`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '69c5eb476889230bdafff656d8552117')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `complaint_resolution_form`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `complaint_resolution`");
            if (ComplaintResolutionDatabase_Impl.this.f7778h != null) {
                int size = ComplaintResolutionDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ComplaintResolutionDatabase_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (ComplaintResolutionDatabase_Impl.this.f7778h != null) {
                int size = ComplaintResolutionDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ComplaintResolutionDatabase_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            ComplaintResolutionDatabase_Impl.this.f7771a = interfaceC45124mV5;
            ComplaintResolutionDatabase_Impl.this.m108717u(interfaceC45124mV5);
            if (ComplaintResolutionDatabase_Impl.this.f7778h != null) {
                int size = ComplaintResolutionDatabase_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) ComplaintResolutionDatabase_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(4);
            hashMap.put("action_taken_required_fields", new C49301tY5.C28782a("action_taken_required_fields", "TEXT", true, 1, null, 1));
            hashMap.put("no_action_taken_required_fields", new C49301tY5.C28782a("no_action_taken_required_fields", "TEXT", true, 0, null, 1));
            hashMap.put("issue_options", new C49301tY5.C28782a("issue_options", "TEXT", true, 0, null, 1));
            hashMap.put("action_taken_options", new C49301tY5.C28782a("action_taken_options", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("complaint_resolution_form", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "complaint_resolution_form");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "complaint_resolution_form(co.bird.android.model.persistence.ComplaintResolutionForm).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(12);
            hashMap2.put("complaint_hash", new C49301tY5.C28782a("complaint_hash", "INTEGER", true, 1, null, 1));
            hashMap2.put("complaint_ids", new C49301tY5.C28782a("complaint_ids", "TEXT", true, 0, null, 1));
            hashMap2.put("situation", new C49301tY5.C28782a("situation", "TEXT", true, 0, null, 1));
            hashMap2.put("before_photo_asset_id", new C49301tY5.C28782a("before_photo_asset_id", "TEXT", false, 0, null, 1));
            hashMap2.put("before_photo_url", new C49301tY5.C28782a("before_photo_url", "TEXT", false, 0, null, 1));
            hashMap2.put("after_photo_asset_id", new C49301tY5.C28782a("after_photo_asset_id", "TEXT", false, 0, null, 1));
            hashMap2.put("after_photo_url", new C49301tY5.C28782a("after_photo_url", "TEXT", false, 0, null, 1));
            hashMap2.put("issues", new C49301tY5.C28782a("issues", "TEXT", false, 0, null, 1));
            hashMap2.put("action_taken", new C49301tY5.C28782a("action_taken", "TEXT", false, 0, null, 1));
            hashMap2.put("vehicle_ids_involved", new C49301tY5.C28782a("vehicle_ids_involved", "TEXT", false, 0, null, 1));
            hashMap2.put("additional_notes", new C49301tY5.C28782a("additional_notes", "TEXT", false, 0, null, 1));
            hashMap2.put("submitted", new C49301tY5.C28782a("submitted", "INTEGER", true, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("complaint_resolution", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "complaint_resolution");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "complaint_resolution(co.bird.android.model.persistence.ComplaintResolution).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase
    /* renamed from: C */
    public AbstractC35033Oq0 mo55265C() {
        AbstractC35033Oq0 abstractC35033Oq0;
        if (this.f66828q != null) {
            return this.f66828q;
        }
        synchronized (this) {
            if (this.f66828q == null) {
                this.f66828q = new C35267Pq0(this);
            }
            abstractC35033Oq0 = this.f66828q;
        }
        return abstractC35033Oq0;
    }

    @Override // co.bird.android.persistence.complaintresolution.impl.ComplaintResolutionDatabase
    /* renamed from: D */
    public AbstractC34565Mq0 mo55264D() {
        AbstractC34565Mq0 abstractC34565Mq0;
        if (this.f66829r != null) {
            return this.f66829r;
        }
        synchronized (this) {
            if (this.f66829r == null) {
                this.f66829r = new C34799Nq0(this);
            }
            abstractC34565Mq0 = this.f66829r;
        }
        return abstractC34565Mq0;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "complaint_resolution_form", "complaint_resolution");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16285a(2), "69c5eb476889230bdafff656d8552117", "0f2d5388b2fc03a38ca1398460287e5e")).m23589b());
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
        hashMap.put(AbstractC35033Oq0.class, C35267Pq0.m89712g());
        hashMap.put(AbstractC34565Mq0.class, C34799Nq0.m93319u());
        return hashMap;
    }
}
