package co.bird.android.persistence.operatortaskv2.impl;

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
public final class OperatorTaskV2Database_Impl extends OperatorTaskV2Database {

    /* renamed from: q */
    public volatile AbstractC51315ww3 f66878q;

    /* renamed from: co.bird.android.persistence.operatortaskv2.impl.OperatorTaskV2Database_Impl$a */
    /* loaded from: classes4.dex */
    public class C16313a extends C33031Gb5.AbstractC2894b {
        public C16313a(int i) {
            super(i);
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: a */
        public void mo52992a(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_task_group` (`title` TEXT NOT NULL, `tasks` TEXT NOT NULL, PRIMARY KEY(`title`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS `operator_task_banners` (`title` TEXT NOT NULL, `title_color` TEXT NOT NULL, `background_color` TEXT NOT NULL, PRIMARY KEY(`title`))");
            interfaceC45124mV5.mo25497G1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC45124mV5.mo25497G1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1abceae7bb6215f43a505d3cdb9b6457')");
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: b */
        public void mo52991b(InterfaceC45124mV5 interfaceC45124mV5) {
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_task_group`");
            interfaceC45124mV5.mo25497G1("DROP TABLE IF EXISTS `operator_task_banners`");
            if (OperatorTaskV2Database_Impl.this.f7778h != null) {
                int size = OperatorTaskV2Database_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorTaskV2Database_Impl.this.f7778h.get(i)).m108703b(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: c */
        public void mo52990c(InterfaceC45124mV5 interfaceC45124mV5) {
            if (OperatorTaskV2Database_Impl.this.f7778h != null) {
                int size = OperatorTaskV2Database_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorTaskV2Database_Impl.this.f7778h.get(i)).m108704a(interfaceC45124mV5);
                }
            }
        }

        @Override // p000.C33031Gb5.AbstractC2894b
        /* renamed from: d */
        public void mo52989d(InterfaceC45124mV5 interfaceC45124mV5) {
            OperatorTaskV2Database_Impl.this.f7771a = interfaceC45124mV5;
            OperatorTaskV2Database_Impl.this.m108717u(interfaceC45124mV5);
            if (OperatorTaskV2Database_Impl.this.f7778h != null) {
                int size = OperatorTaskV2Database_Impl.this.f7778h.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC32563Eb5.AbstractC1899b) OperatorTaskV2Database_Impl.this.f7778h.get(i)).mo88145c(interfaceC45124mV5);
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
            HashMap hashMap = new HashMap(2);
            hashMap.put("title", new C49301tY5.C28782a("title", "TEXT", true, 1, null, 1));
            hashMap.put("tasks", new C49301tY5.C28782a("tasks", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY5 = new C49301tY5("operator_task_group", hashMap, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a = C49301tY5.m12061a(interfaceC45124mV5, "operator_task_group");
            if (!c49301tY5.equals(m12061a)) {
                return new C33031Gb5.C2895c(false, "operator_task_group(co.bird.android.model.persistence.OperatorTaskGroup).\n Expected:\n" + c49301tY5 + "\n Found:\n" + m12061a);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("title", new C49301tY5.C28782a("title", "TEXT", true, 1, null, 1));
            hashMap2.put("title_color", new C49301tY5.C28782a("title_color", "TEXT", true, 0, null, 1));
            hashMap2.put("background_color", new C49301tY5.C28782a("background_color", "TEXT", true, 0, null, 1));
            C49301tY5 c49301tY52 = new C49301tY5("operator_task_banners", hashMap2, new HashSet(0), new HashSet(0));
            C49301tY5 m12061a2 = C49301tY5.m12061a(interfaceC45124mV5, "operator_task_banners");
            if (!c49301tY52.equals(m12061a2)) {
                return new C33031Gb5.C2895c(false, "operator_task_banners(co.bird.android.model.persistence.OperatorTaskBanner).\n Expected:\n" + c49301tY52 + "\n Found:\n" + m12061a2);
            }
            return new C33031Gb5.C2895c(true, null);
        }
    }

    @Override // co.bird.android.persistence.operatortaskv2.impl.OperatorTaskV2Database
    /* renamed from: C */
    public AbstractC51315ww3 mo55107C() {
        AbstractC51315ww3 abstractC51315ww3;
        if (this.f66878q != null) {
            return this.f66878q;
        }
        synchronized (this) {
            if (this.f66878q == null) {
                this.f66878q = new C51908xw3(this);
            }
            abstractC51315ww3 = this.f66878q;
        }
        return abstractC51315ww3;
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: e */
    public C47274q72 mo52997e() {
        return new C47274q72(this, new HashMap(0), new HashMap(0), "operator_task_group", "operator_task_banners");
    }

    @Override // p000.AbstractC32563Eb5
    /* renamed from: f */
    public InterfaceC45717nV5 mo52996f(C40950fT0 c40950fT0) {
        return c40950fT0.f80172c.mo4888a(InterfaceC45717nV5.C26533b.m23591a(c40950fT0.f80170a).m23587d(c40950fT0.f80171b).m23588c(new C33031Gb5(c40950fT0, new C16313a(2), "1abceae7bb6215f43a505d3cdb9b6457", "def2fe17a382f2ec2ab1ffee01f8b76f")).m23589b());
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
        hashMap.put(AbstractC51315ww3.class, C51908xw3.m4427m());
        return hashMap;
    }
}
