package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p000.AbstractC45348ms4;
/* renamed from: ms4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45348ms4<T extends AbstractC45348ms4<T>> {

    /* renamed from: b */
    public EnumC43236jJ4 f98926b;

    /* renamed from: c */
    public S94 f98927c;

    /* renamed from: d */
    public String f98928d;

    /* renamed from: a */
    public List<String> f98925a = new ArrayList();

    /* renamed from: e */
    public Collection<String> f98929e = new HashSet();

    /* renamed from: a */
    public static Intent m24834a(Context context, String str, String str2) {
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
        if (!"*".equals(str2)) {
            addFlags.setPackage(str2);
        }
        return C36833Wi0.m77972a(context, addFlags);
    }

    /* renamed from: i */
    public static boolean m24827i(Context context, String str, String str2) {
        if (m24834a(context, str, str2).resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public S94 m24833b() {
        return this.f98927c;
    }

    /* renamed from: c */
    public EnumC43236jJ4 m24832c() {
        return this.f98926b;
    }

    /* renamed from: d */
    public String m24831d() {
        return this.f98928d;
    }

    /* renamed from: e */
    public List<String> m24830e() {
        return new ArrayList(this.f98925a);
    }

    /* renamed from: f */
    public abstract T mo9942f();

    /* renamed from: g */
    public boolean m24829g(Context context) {
        boolean z;
        String packageName = context.getApplicationContext().getPackageName();
        if (!packageName.equals(packageName.toLowerCase(Locale.ROOT).replace("_", ""))) {
            return false;
        }
        for (String str : m24830e()) {
            boolean m61026a = C13650cj.m61026a(context, C27348pl.m18830a(m24831d(), str));
            String locale = Locale.getDefault().toString();
            if (!this.f98929e.isEmpty() && !this.f98929e.contains(locale)) {
                z = false;
            } else {
                z = true;
            }
            boolean m18828c = C27348pl.m18828c(context, str);
            if (m61026a && z && m18828c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m24828h(Context context, String str) {
        for (String str2 : m24830e()) {
            if (m24827i(context, str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public T m24826j(String str) {
        this.f98927c = S94.m85877a(str);
        return mo9942f();
    }

    /* renamed from: k */
    public T m24825k(String str) {
        this.f98929e.add(str);
        return mo9942f();
    }

    /* renamed from: l */
    public T m24824l(EnumC43236jJ4 enumC43236jJ4) {
        this.f98926b = enumC43236jJ4;
        return mo9942f();
    }

    /* renamed from: m */
    public T m24823m(String str) {
        this.f98928d = str;
        return mo9942f();
    }

    /* renamed from: n */
    public T m24822n(String str) {
        this.f98925a.add(str);
        return mo9942f();
    }
}
