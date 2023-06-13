package p000;

import android.os.Bundle;
/* renamed from: rF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47940rF0 {

    /* renamed from: a */
    public final Integer f106759a;

    /* renamed from: b */
    public final Integer f106760b;

    /* renamed from: c */
    public final Integer f106761c;

    /* renamed from: d */
    public final Integer f106762d;

    /* renamed from: rF0$a */
    /* loaded from: classes.dex */
    public static final class C27890a {

        /* renamed from: a */
        public Integer f106763a;

        /* renamed from: b */
        public Integer f106764b;

        /* renamed from: c */
        public Integer f106765c;

        /* renamed from: d */
        public Integer f106766d;

        /* renamed from: a */
        public C47940rF0 m16157a() {
            return new C47940rF0(this.f106763a, this.f106764b, this.f106765c, this.f106766d);
        }

        /* renamed from: b */
        public C27890a m16156b(int i) {
            this.f106763a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public C47940rF0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f106759a = num;
        this.f106760b = num2;
        this.f106761c = num3;
        this.f106762d = num4;
    }

    /* renamed from: a */
    public Bundle m16158a() {
        Bundle bundle = new Bundle();
        Integer num = this.f106759a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f106760b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f106761c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f106762d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
