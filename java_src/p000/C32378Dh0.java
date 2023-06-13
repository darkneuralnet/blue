package p000;
/* renamed from: Dh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32378Dh0 {

    /* renamed from: a */
    public int f6192a = 0;

    /* renamed from: a */
    public boolean m110008a(int i) {
        return (this.f6192a == i || m110006c()) ? false : true;
    }

    /* renamed from: b */
    public int m110007b() {
        return this.f6192a;
    }

    /* renamed from: c */
    public boolean m110006c() {
        return this.f6192a == 0;
    }

    /* renamed from: d */
    public void m110005d() {
        int i = this.f6192a + 1;
        this.f6192a = i;
        if (i == 0) {
            this.f6192a = i + 1;
        }
    }
}
