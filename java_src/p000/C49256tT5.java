package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: tT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49256tT5 implements PO1 {

    /* renamed from: b */
    public boolean f110528b = false;

    /* renamed from: c */
    public final Map<String, C48663sT5> f110529c = new HashMap();

    /* renamed from: d */
    public final LinkedBlockingQueue<C49849uT5> f110530d = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public void m12296a() {
        this.f110529c.clear();
        this.f110530d.clear();
    }

    /* renamed from: b */
    public LinkedBlockingQueue<C49849uT5> m12295b() {
        return this.f110530d;
    }

    /* renamed from: c */
    public List<C48663sT5> m12294c() {
        return new ArrayList(this.f110529c.values());
    }

    /* renamed from: d */
    public void m12293d() {
        this.f110528b = true;
    }

    @Override // p000.PO1
    public synchronized InterfaceC53103zx2 getLogger(String str) {
        C48663sT5 c48663sT5;
        c48663sT5 = this.f110529c.get(str);
        if (c48663sT5 == null) {
            c48663sT5 = new C48663sT5(str, this.f110530d, this.f110528b);
            this.f110529c.put(str, c48663sT5);
        }
        return c48663sT5;
    }
}
