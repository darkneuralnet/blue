package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: G91 */
/* loaded from: classes8.dex */
public class G91 {

    /* renamed from: a */
    public C33801Jj1 f11053a;

    public G91(Collection collection) {
        this.f11053a = new C33801Jj1(m105695c(collection));
    }

    /* renamed from: b */
    public static void m105696b(Collection collection) {
        new G91(collection).m105697a();
    }

    /* renamed from: c */
    public static Collection m105695c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C47293q91 c47293q91 = (C47293q91) it.next();
            arrayList.add(new C7357SE(c47293q91.m18068n(), c47293q91));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m105697a() {
        this.f11053a.m99914b();
    }
}
