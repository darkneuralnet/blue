package p000;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Tm0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36167Tm0 extends AbstractC30353xx<YN1<? extends Entry>> {

    /* renamed from: j */
    public C44150kr2 f36052j;

    /* renamed from: k */
    public C28485sx f36053k;

    /* renamed from: l */
    public C45882nm5 f36054l;

    /* renamed from: m */
    public C41043fd0 f36055m;

    /* renamed from: n */
    public C40116e30 f36056n;

    @Override // p000.AbstractC42872ii0
    /* renamed from: a */
    public void mo33556a() {
        if (this.f87774i == null) {
            this.f87774i = new ArrayList();
        }
        this.f87774i.clear();
        this.f87766a = -3.4028235E38f;
        this.f87767b = Float.MAX_VALUE;
        this.f87768c = -3.4028235E38f;
        this.f87769d = Float.MAX_VALUE;
        this.f87770e = -3.4028235E38f;
        this.f87771f = Float.MAX_VALUE;
        this.f87772g = -3.4028235E38f;
        this.f87773h = Float.MAX_VALUE;
        for (AbstractC30353xx abstractC30353xx : m82988s()) {
            abstractC30353xx.mo33556a();
            this.f87774i.addAll(abstractC30353xx.m33552f());
            if (abstractC30353xx.m33545n() > this.f87766a) {
                this.f87766a = abstractC30353xx.m33545n();
            }
            if (abstractC30353xx.m33543p() < this.f87767b) {
                this.f87767b = abstractC30353xx.m33543p();
            }
            if (abstractC30353xx.m33547l() > this.f87768c) {
                this.f87768c = abstractC30353xx.m33547l();
            }
            if (abstractC30353xx.m33546m() < this.f87769d) {
                this.f87769d = abstractC30353xx.m33546m();
            }
            float f = abstractC30353xx.f87770e;
            if (f > this.f87770e) {
                this.f87770e = f;
            }
            float f2 = abstractC30353xx.f87771f;
            if (f2 < this.f87771f) {
                this.f87771f = f2;
            }
            float f3 = abstractC30353xx.f87772g;
            if (f3 > this.f87772g) {
                this.f87772g = f3;
            }
            float f4 = abstractC30353xx.f87773h;
            if (f4 < this.f87773h) {
                this.f87773h = f4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Type inference failed for: r0v3, types: [oO1] */
    @Override // p000.AbstractC42872ii0
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Entry mo17498h(OM1 om1) {
        if (om1.m92392c() >= m82988s().size()) {
            return null;
        }
        AbstractC30353xx m82984w = m82984w(om1.m92392c());
        if (om1.m92391d() >= m82984w.m33553e()) {
            return null;
        }
        for (Entry entry : m82984w.mo17499d(om1.m92391d()).mo21234q(om1.m92387h())) {
            if (entry.mo51938c() == om1.m92385j() || Float.isNaN(om1.m92385j())) {
                return entry;
            }
            while (r0.hasNext()) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC42872ii0
    /* renamed from: r */
    public void mo33541r() {
        C44150kr2 c44150kr2 = this.f36052j;
        if (c44150kr2 != null) {
            c44150kr2.mo33541r();
        }
        C28485sx c28485sx = this.f36053k;
        if (c28485sx != null) {
            c28485sx.mo33541r();
        }
        C41043fd0 c41043fd0 = this.f36055m;
        if (c41043fd0 != null) {
            c41043fd0.mo33541r();
        }
        C45882nm5 c45882nm5 = this.f36054l;
        if (c45882nm5 != null) {
            c45882nm5.mo33541r();
        }
        C40116e30 c40116e30 = this.f36056n;
        if (c40116e30 != null) {
            c40116e30.mo33541r();
        }
        mo33556a();
    }

    /* renamed from: s */
    public List<AbstractC30353xx> m82988s() {
        ArrayList arrayList = new ArrayList();
        C44150kr2 c44150kr2 = this.f36052j;
        if (c44150kr2 != null) {
            arrayList.add(c44150kr2);
        }
        C28485sx c28485sx = this.f36053k;
        if (c28485sx != null) {
            arrayList.add(c28485sx);
        }
        C45882nm5 c45882nm5 = this.f36054l;
        if (c45882nm5 != null) {
            arrayList.add(c45882nm5);
        }
        C41043fd0 c41043fd0 = this.f36055m;
        if (c41043fd0 != null) {
            arrayList.add(c41043fd0);
        }
        C40116e30 c40116e30 = this.f36056n;
        if (c40116e30 != null) {
            arrayList.add(c40116e30);
        }
        return arrayList;
    }

    /* renamed from: t */
    public C28485sx m82987t() {
        return this.f36053k;
    }

    /* renamed from: u */
    public C40116e30 m82986u() {
        return this.f36056n;
    }

    /* renamed from: v */
    public C41043fd0 m82985v() {
        return this.f36055m;
    }

    /* renamed from: w */
    public AbstractC30353xx m82984w(int i) {
        return m82988s().get(i);
    }

    /* renamed from: x */
    public YN1<? extends Entry> m82983x(OM1 om1) {
        if (om1.m92392c() >= m82988s().size()) {
            return null;
        }
        AbstractC30353xx m82984w = m82984w(om1.m92392c());
        if (om1.m92391d() >= m82984w.m33553e()) {
            return null;
        }
        return (YN1) m82984w.m33552f().get(om1.m92391d());
    }

    /* renamed from: y */
    public C44150kr2 m82982y() {
        return this.f36052j;
    }

    /* renamed from: z */
    public C45882nm5 m82981z() {
        return this.f36054l;
    }
}
