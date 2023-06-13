package p000;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* renamed from: hw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42420hw1 {

    /* renamed from: d */
    public final AssetManager f86210d;

    /* renamed from: e */
    public C41827gw1 f86211e;

    /* renamed from: a */
    public final C51660xX2<String> f86207a = new C51660xX2<>();

    /* renamed from: b */
    public final Map<C51660xX2<String>, Typeface> f86208b = new HashMap();

    /* renamed from: c */
    public final Map<String, Typeface> f86209c = new HashMap();

    /* renamed from: f */
    public String f86212f = ".ttf";

    public C42420hw1(Drawable.Callback callback, C41827gw1 c41827gw1) {
        this.f86211e = c41827gw1;
        if (!(callback instanceof View)) {
            C32524Dx2.m109586c("LottieDrawable must be inside of a view for images to work.");
            this.f86210d = null;
            return;
        }
        this.f86210d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public final Typeface m35463a(C41234fw1 c41234fw1) {
        Typeface typeface;
        String m40436a = c41234fw1.m40436a();
        Typeface typeface2 = this.f86209c.get(m40436a);
        if (typeface2 != null) {
            return typeface2;
        }
        String m40434c = c41234fw1.m40434c();
        String m40435b = c41234fw1.m40435b();
        C41827gw1 c41827gw1 = this.f86211e;
        if (c41827gw1 != null) {
            typeface = c41827gw1.m37312b(m40436a, m40434c, m40435b);
            if (typeface == null) {
                typeface = this.f86211e.m37313a(m40436a);
            }
        } else {
            typeface = null;
        }
        C41827gw1 c41827gw12 = this.f86211e;
        if (c41827gw12 != null && typeface == null) {
            String m37310d = c41827gw12.m37310d(m40436a, m40434c, m40435b);
            if (m37310d == null) {
                m37310d = this.f86211e.m37311c(m40436a);
            }
            if (m37310d != null) {
                typeface = Typeface.createFromAsset(this.f86210d, m37310d);
            }
        }
        if (c41234fw1.m40433d() != null) {
            return c41234fw1.m40433d();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f86210d, "fonts/" + m40436a + this.f86212f);
        }
        this.f86209c.put(m40436a, typeface);
        return typeface;
    }

    /* renamed from: b */
    public Typeface m35462b(C41234fw1 c41234fw1) {
        this.f86207a.m5065b(c41234fw1.m40436a(), c41234fw1.m40434c());
        Typeface typeface = this.f86208b.get(this.f86207a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m35459e = m35459e(m35463a(c41234fw1), c41234fw1.m40434c());
        this.f86208b.put(this.f86207a, m35459e);
        return m35459e;
    }

    /* renamed from: c */
    public void m35461c(String str) {
        this.f86212f = str;
    }

    /* renamed from: d */
    public void m35460d(C41827gw1 c41827gw1) {
        this.f86211e = c41827gw1;
    }

    /* renamed from: e */
    public final Typeface m35459e(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}
