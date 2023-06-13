package p000;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: qC7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47327qC7 {

    /* renamed from: a */
    public final LongSparseArray f104914a;

    public C47327qC7() {
        this(10L);
    }

    /* renamed from: a */
    public final List m17899a(List list) {
        C35868Se7 c35868Se7;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53128zz7 c53128zz7 = (C53128zz7) it.next();
            synchronized (this.f104914a) {
                if (this.f104914a.get(c53128zz7.m4D()) == null) {
                    this.f104914a.put(c53128zz7.m4D(), new C35868Se7(10L));
                }
                c35868Se7 = (C35868Se7) this.f104914a.get(c53128zz7.m4D());
            }
            if (c35868Se7.m85161a()) {
                arrayList.add(c53128zz7);
            }
        }
        return arrayList;
    }

    public C47327qC7(long j) {
        this.f104914a = new LongSparseArray();
    }
}
