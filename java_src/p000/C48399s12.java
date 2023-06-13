package p000;

import java.util.Collection;
/* renamed from: s12  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48399s12 extends AbstractC33806Jj6 {

    /* renamed from: a */
    public String[] f108136a;

    /* renamed from: b */
    public int f108137b;

    public C48399s12() {
        this.f108136a = new String[0];
        this.f108137b = 0;
    }

    @Override // p000.AbstractC33806Jj6
    /* renamed from: f */
    public String mo14123f(float f) {
        int round = Math.round(f);
        if (round >= 0 && round < this.f108137b && round == ((int) f)) {
            return this.f108136a[round];
        }
        return "";
    }

    /* renamed from: j */
    public void m14881j(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.f108136a = strArr;
        this.f108137b = strArr.length;
    }

    public C48399s12(Collection<String> collection) {
        this.f108136a = new String[0];
        this.f108137b = 0;
        if (collection != null) {
            m14881j((String[]) collection.toArray(new String[collection.size()]));
        }
    }
}
