package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* renamed from: W46 */
/* loaded from: classes.dex */
public class W46 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f40380c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<W46>> f40381d;

    /* renamed from: a */
    public final Resources f40382a;

    /* renamed from: b */
    public final Resources.Theme f40383b;

    public W46(Context context) {
        super(context);
        if (C38137ak6.m70803c()) {
            C38137ak6 c38137ak6 = new C38137ak6(this, context.getResources());
            this.f40382a = c38137ak6;
            Resources.Theme newTheme = c38137ak6.newTheme();
            this.f40383b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f40382a = new Y46(this, context.getResources());
        this.f40383b = null;
    }

    /* renamed from: a */
    public static boolean m78860a(Context context) {
        if ((context instanceof W46) || (context.getResources() instanceof Y46) || (context.getResources() instanceof C38137ak6) || !C38137ak6.m70803c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m78859b(Context context) {
        W46 w46;
        if (m78860a(context)) {
            synchronized (f40380c) {
                ArrayList<WeakReference<W46>> arrayList = f40381d;
                if (arrayList == null) {
                    f40381d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<W46> weakReference = f40381d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f40381d.remove(size);
                        }
                    }
                    for (int size2 = f40381d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<W46> weakReference2 = f40381d.get(size2);
                        if (weakReference2 != null) {
                            w46 = weakReference2.get();
                        } else {
                            w46 = null;
                        }
                        if (w46 != null && w46.getBaseContext() == context) {
                            return w46;
                        }
                    }
                }
                W46 w462 = new W46(context);
                f40381d.add(new WeakReference<>(w462));
                return w462;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f40382a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f40382a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f40383b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f40383b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
