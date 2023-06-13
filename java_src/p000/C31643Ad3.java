package p000;
/* renamed from: Ad3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31643Ad3 {

    /* renamed from: a */
    public String f882a;

    /* renamed from: b */
    public int f883b = 0;

    public C31643Ad3(String str) {
        this.f882a = str;
    }

    /* renamed from: a */
    public boolean m115428a() {
        return this.f883b != -1;
    }

    /* renamed from: b */
    public String m115427b() {
        int i = this.f883b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f882a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f882a.substring(this.f883b);
            this.f883b = -1;
            return substring;
        }
        String substring2 = this.f882a.substring(this.f883b, indexOf);
        this.f883b = indexOf + 1;
        return substring2;
    }
}
