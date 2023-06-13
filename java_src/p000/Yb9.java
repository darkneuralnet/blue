package p000;

import android.os.SystemClock;
/* renamed from: Yb9 */
/* loaded from: classes5.dex */
public final class Yb9 {

    /* renamed from: a */
    public long f46063a;

    /* renamed from: b */
    public long f46064b;

    /* renamed from: c */
    public final C36003St7 f46065c = new C36003St7();

    /* renamed from: d */
    public final C36003St7 f46066d = new C36003St7();

    /* renamed from: e */
    public final C36003St7 f46067e = new C36003St7();

    /* renamed from: f */
    public int f46068f;

    /* renamed from: g */
    public boolean f46069g;

    /* renamed from: a */
    public final V69 m74825a() {
        boolean z;
        boolean z2 = true;
        if (this.f46063a != 0) {
            z = true;
        } else {
            z = false;
        }
        C41211ft8.m40586d(z);
        if (this.f46064b == 0) {
            z2 = false;
        }
        C41211ft8.m40586d(z2);
        long j = this.f46064b;
        long j2 = this.f46063a;
        V69 v69 = new V69();
        v69.m80370d(Long.valueOf(j - j2));
        v69.m80366h(this.f46065c.m84667e());
        v69.m80367g(this.f46066d.m84667e());
        v69.m80369e(this.f46067e.m84667e());
        int i = this.f46068f;
        if (i != 0) {
            v69.m80368f(Integer.valueOf(i));
        }
        return v69;
    }

    /* renamed from: b */
    public final void m74824b(EnumC38962c79 enumC38962c79) {
        this.f46067e.m84668d(enumC38962c79);
    }

    /* renamed from: c */
    public final void m74823c(EnumC38962c79 enumC38962c79) {
        this.f46066d.m84668d(enumC38962c79);
    }

    /* renamed from: d */
    public final void m74822d(EnumC38962c79 enumC38962c79) {
        if (this.f46069g) {
            this.f46066d.m84668d(enumC38962c79);
        } else {
            this.f46065c.m84668d(enumC38962c79);
        }
    }

    /* renamed from: e */
    public final void m74821e() {
        this.f46064b = SystemClock.elapsedRealtime();
    }

    /* renamed from: f */
    public final void m74820f(int i) {
        this.f46068f = i;
    }

    /* renamed from: g */
    public final void m74819g() {
        this.f46063a = SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    public final void m74818h() {
        this.f46069g = true;
    }
}
