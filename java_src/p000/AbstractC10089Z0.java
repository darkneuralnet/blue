package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Z0 */
/* loaded from: classes8.dex */
public abstract class AbstractC10089Z0 implements InterfaceC48387s00, Serializable {
    private static final long serialVersionUID = 6493722185909573708L;

    /* renamed from: b */
    public ArrayList f47718b = new ArrayList();

    /* renamed from: c */
    public Object f47719c = null;

    /* renamed from: d */
    public int f47720d;

    public AbstractC10089Z0() {
    }

    /* renamed from: a */
    public void m73925a(InterfaceC48387s00 interfaceC48387s00) {
        boolean z;
        if (this.f47719c == null) {
            z = true;
        } else {
            z = false;
        }
        C4596Ko.m98282c(z);
        this.f47718b.add(interfaceC48387s00);
    }

    /* renamed from: b */
    public abstract Object mo61042b();

    /* renamed from: c */
    public List m73924c() {
        return this.f47718b;
    }

    /* renamed from: d */
    public boolean m73923d() {
        return this.f47718b.isEmpty();
    }

    @Override // p000.InterfaceC48387s00
    public Object getBounds() {
        if (this.f47719c == null) {
            this.f47719c = mo61042b();
        }
        return this.f47719c;
    }

    public AbstractC10089Z0(int i) {
        this.f47720d = i;
    }
}
