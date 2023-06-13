package p000;

import android.net.Uri;
/* renamed from: fs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41200fs7 {

    /* renamed from: a */
    public final String f80985a;

    /* renamed from: b */
    public final Uri f80986b;

    /* renamed from: c */
    public final String f80987c;

    /* renamed from: d */
    public final String f80988d;

    /* renamed from: e */
    public final boolean f80989e;

    /* renamed from: f */
    public final boolean f80990f;

    public C41200fs7(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    /* renamed from: b */
    public final <T> AbstractC48818sj7<T> m40613b(String str, T t, InterfaceC46527or7<T> interfaceC46527or7) {
        return AbstractC48818sj7.m13752k(this, str, t, interfaceC46527or7);
    }

    /* renamed from: c */
    public final AbstractC48818sj7<String> m40612c(String str, String str2) {
        return AbstractC48818sj7.m13751l(this, str, null);
    }

    /* renamed from: f */
    public final AbstractC48818sj7<Boolean> m40609f(String str, boolean z) {
        return AbstractC48818sj7.m13750m(this, str, false);
    }

    /* renamed from: g */
    public final C41200fs7 m40608g(String str) {
        boolean z = this.f80989e;
        if (z) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new C41200fs7(this.f80985a, this.f80986b, str, this.f80988d, z, this.f80990f);
    }

    /* renamed from: i */
    public final C41200fs7 m40606i(String str) {
        return new C41200fs7(this.f80985a, this.f80986b, this.f80987c, str, this.f80989e, this.f80990f);
    }

    public C41200fs7(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f80985a = str;
        this.f80986b = uri;
        this.f80987c = str2;
        this.f80988d = str3;
        this.f80989e = z;
        this.f80990f = z2;
    }
}
