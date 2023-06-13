package p000;
/* renamed from: dd5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39863dd5 {

    /* renamed from: a */
    public int f76909a = 0;

    /* renamed from: b */
    public int f76910b = 0;

    /* renamed from: c */
    public int f76911c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f76912d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f76913e = 0;

    /* renamed from: f */
    public int f76914f = 0;

    /* renamed from: g */
    public boolean f76915g = false;

    /* renamed from: h */
    public boolean f76916h = false;

    /* renamed from: a */
    public int m44006a() {
        return this.f76915g ? this.f76909a : this.f76910b;
    }

    /* renamed from: b */
    public int m44005b() {
        return this.f76915g ? this.f76910b : this.f76909a;
    }

    /* renamed from: c */
    public void m44004c(int i, int i2) {
        this.f76916h = false;
        if (i != Integer.MIN_VALUE) {
            this.f76913e = i;
            this.f76909a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f76914f = i2;
            this.f76910b = i2;
        }
    }

    /* renamed from: d */
    public void m44003d(boolean z) {
        if (z == this.f76915g) {
            return;
        }
        this.f76915g = z;
        if (this.f76916h) {
            if (z) {
                int i = this.f76912d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f76913e;
                }
                this.f76909a = i;
                int i2 = this.f76911c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f76914f;
                }
                this.f76910b = i2;
                return;
            }
            int i3 = this.f76911c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f76913e;
            }
            this.f76909a = i3;
            int i4 = this.f76912d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f76914f;
            }
            this.f76910b = i4;
            return;
        }
        this.f76909a = this.f76913e;
        this.f76910b = this.f76914f;
    }

    /* renamed from: e */
    public void m44002e(int i, int i2) {
        this.f76911c = i;
        this.f76912d = i2;
        this.f76916h = true;
        if (this.f76915g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f76909a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f76910b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f76909a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f76910b = i2;
        }
    }
}
