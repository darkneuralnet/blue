package p000;

import android.text.TextUtils;
/* renamed from: DP2 */
/* loaded from: classes.dex */
public class DP2 implements InterfaceC52774zP2 {

    /* renamed from: a */
    public String f5607a;

    /* renamed from: b */
    public int f5608b;

    /* renamed from: c */
    public int f5609c;

    public DP2(String str, int i, int i2) {
        this.f5607a = str;
        this.f5608b = i;
        this.f5609c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DP2)) {
            return false;
        }
        DP2 dp2 = (DP2) obj;
        if (this.f5608b >= 0 && dp2.f5608b >= 0) {
            if (TextUtils.equals(this.f5607a, dp2.f5607a) && this.f5608b == dp2.f5608b && this.f5609c == dp2.f5609c) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(this.f5607a, dp2.f5607a) && this.f5609c == dp2.f5609c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return C37259Yd3.m74779b(this.f5607a, Integer.valueOf(this.f5609c));
    }
}
