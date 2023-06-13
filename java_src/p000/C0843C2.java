package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
/* renamed from: C2 */
/* loaded from: classes.dex */
public class C0843C2 {

    /* renamed from: a */
    public Context f3317a;

    public C0843C2(Context context) {
        this.f3317a = context;
    }

    /* renamed from: b */
    public static C0843C2 m112965b(Context context) {
        return new C0843C2(context);
    }

    /* renamed from: a */
    public boolean m112966a() {
        return this.f3317a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m112964c() {
        return this.f3317a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m112963d() {
        Configuration configuration = this.f3317a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i <= 960 || i2 <= 720) {
                if (i <= 720 || i2 <= 960) {
                    if (i < 500) {
                        if (i <= 640 || i2 <= 480) {
                            if (i <= 480 || i2 <= 640) {
                                if (i >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m112962e() {
        return this.f3317a.getResources().getDimensionPixelSize(C39281cg4.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m112961f() {
        TypedArray obtainStyledAttributes = this.f3317a.obtainStyledAttributes(null, C43509jm4.ActionBar, C50553vf4.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C43509jm4.ActionBar_height, 0);
        Resources resources = this.f3317a.getResources();
        if (!m112960g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C39281cg4.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m112960g() {
        return this.f3317a.getResources().getBoolean(C52332yf4.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m112959h() {
        return true;
    }
}
