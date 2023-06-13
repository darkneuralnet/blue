package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: S61 */
/* loaded from: classes5.dex */
public final class S61 {

    /* renamed from: a */
    public static volatile boolean f33160a = true;

    private S61() {
    }

    /* renamed from: a */
    public static Drawable m86016a(Context context, int i, Resources.Theme theme) {
        return m86014c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m86015b(Context context, Context context2, int i) {
        return m86014c(context, context2, i, null);
    }

    /* renamed from: c */
    public static Drawable m86014c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f33160a) {
                return m86012e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return NA0.m94299e(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            f33160a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m86013d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m86013d(Context context, int i, Resources.Theme theme) {
        return C49785uM4.m10397f(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m86012e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C37806aB0(context, theme);
        }
        return C29611vi.m8248b(context, i);
    }
}
