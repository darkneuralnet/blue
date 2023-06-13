package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.V62;
/* renamed from: xN5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C51573xN5 {

    /* renamed from: a */
    public final List f117534a = new ArrayList();

    /* renamed from: b */
    public volatile V62 f117535b = null;

    /* renamed from: a */
    public final void m5327a(List list, List list2) {
        V62 v62;
        list2.clear();
        for (int i = 0; i < list.size(); i += 2) {
            V62 v622 = (V62) list.get(i);
            int i2 = i + 1;
            if (i2 < list.size()) {
                v62 = (V62) list.get(i);
            } else {
                v62 = null;
            }
            if (v62 == null) {
                list2.add(v622);
            } else {
                list2.add(new T62((V62) list.get(i), (V62) list.get(i2)));
            }
        }
    }

    /* renamed from: b */
    public final void m5326b() {
        if (this.f117535b != null) {
            return;
        }
        this.f117535b = m5325c();
    }

    /* renamed from: c */
    public final V62 m5325c() {
        Collections.sort(this.f117534a, new V62.C8558a());
        List list = this.f117534a;
        List arrayList = new ArrayList();
        while (true) {
            m5327a(list, arrayList);
            if (arrayList.size() == 1) {
                return (V62) arrayList.get(0);
            }
            List list2 = arrayList;
            arrayList = list;
            list = list2;
        }
    }

    /* renamed from: d */
    public final synchronized void m5324d() {
        if (this.f117535b != null) {
            return;
        }
        if (this.f117534a.size() == 0) {
            return;
        }
        m5326b();
    }

    /* renamed from: e */
    public void m5323e(double d, double d2, Object obj) {
        if (this.f117535b == null) {
            this.f117534a.add(new U62(d, d2, obj));
            return;
        }
        throw new IllegalStateException("Index cannot be added to once it has been queried");
    }

    /* renamed from: f */
    public void m5322f(double d, double d2, InterfaceC42261hg2 interfaceC42261hg2) {
        m5324d();
        if (this.f117535b == null) {
            return;
        }
        this.f117535b.mo80392b(d, d2, interfaceC42261hg2);
    }
}
