package p000;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: hS3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42130hS3 {

    /* renamed from: a */
    public CharSequence f85257a;

    /* renamed from: b */
    public IconCompat f85258b;

    /* renamed from: c */
    public String f85259c;

    /* renamed from: d */
    public String f85260d;

    /* renamed from: e */
    public boolean f85261e;

    /* renamed from: f */
    public boolean f85262f;

    /* renamed from: hS3$a */
    /* loaded from: classes.dex */
    public static class C22662a {
        private C22662a() {
        }

        /* renamed from: a */
        public static C42130hS3 m36375a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            C22663b c22663b = new C22663b();
            name = person.getName();
            C22663b m36368f = c22663b.m36368f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.m67706a(icon2);
            } else {
                iconCompat = null;
            }
            C22663b m36371c = m36368f.m36371c(iconCompat);
            uri = person.getUri();
            C22663b m36367g = m36371c.m36367g(uri);
            key = person.getKey();
            C22663b m36369e = m36367g.m36369e(key);
            isBot = person.isBot();
            C22663b m36372b = m36369e.m36372b(isBot);
            isImportant = person.isImportant();
            return m36372b.m36370d(isImportant).m36373a();
        }

        /* renamed from: b */
        public static Person m36374b(C42130hS3 c42130hS3) {
            Person.Builder name;
            Icon icon;
            Person.Builder icon2;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            Person build;
            XR3.m77011a();
            name = WR3.m78460a().setName(c42130hS3.m36382c());
            if (c42130hS3.m36384a() != null) {
                icon = c42130hS3.m36384a().m67689r();
            } else {
                icon = null;
            }
            icon2 = name.setIcon(icon);
            uri = icon2.setUri(c42130hS3.m36381d());
            key = uri.setKey(c42130hS3.m36383b());
            bot = key.setBot(c42130hS3.m36380e());
            important = bot.setImportant(c42130hS3.m36379f());
            build = important.build();
            return build;
        }
    }

    /* renamed from: hS3$b */
    /* loaded from: classes.dex */
    public static class C22663b {

        /* renamed from: a */
        public CharSequence f85263a;

        /* renamed from: b */
        public IconCompat f85264b;

        /* renamed from: c */
        public String f85265c;

        /* renamed from: d */
        public String f85266d;

        /* renamed from: e */
        public boolean f85267e;

        /* renamed from: f */
        public boolean f85268f;

        /* renamed from: a */
        public C42130hS3 m36373a() {
            return new C42130hS3(this);
        }

        /* renamed from: b */
        public C22663b m36372b(boolean z) {
            this.f85267e = z;
            return this;
        }

        /* renamed from: c */
        public C22663b m36371c(IconCompat iconCompat) {
            this.f85264b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C22663b m36370d(boolean z) {
            this.f85268f = z;
            return this;
        }

        /* renamed from: e */
        public C22663b m36369e(String str) {
            this.f85266d = str;
            return this;
        }

        /* renamed from: f */
        public C22663b m36368f(CharSequence charSequence) {
            this.f85263a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C22663b m36367g(String str) {
            this.f85265c = str;
            return this;
        }
    }

    public C42130hS3(C22663b c22663b) {
        this.f85257a = c22663b.f85263a;
        this.f85258b = c22663b.f85264b;
        this.f85259c = c22663b.f85265c;
        this.f85260d = c22663b.f85266d;
        this.f85261e = c22663b.f85267e;
        this.f85262f = c22663b.f85268f;
    }

    /* renamed from: a */
    public IconCompat m36384a() {
        return this.f85258b;
    }

    /* renamed from: b */
    public String m36383b() {
        return this.f85260d;
    }

    /* renamed from: c */
    public CharSequence m36382c() {
        return this.f85257a;
    }

    /* renamed from: d */
    public String m36381d() {
        return this.f85259c;
    }

    /* renamed from: e */
    public boolean m36380e() {
        return this.f85261e;
    }

    /* renamed from: f */
    public boolean m36379f() {
        return this.f85262f;
    }

    /* renamed from: g */
    public String m36378g() {
        String str = this.f85259c;
        if (str != null) {
            return str;
        }
        if (this.f85257a != null) {
            return "name:" + ((Object) this.f85257a);
        }
        return "";
    }

    /* renamed from: h */
    public Person m36377h() {
        return C22662a.m36374b(this);
    }

    /* renamed from: i */
    public Bundle m36376i() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.f85257a);
        IconCompat iconCompat = this.f85258b;
        if (iconCompat != null) {
            bundle = iconCompat.m67690q();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f85259c);
        bundle2.putString("key", this.f85260d);
        bundle2.putBoolean("isBot", this.f85261e);
        bundle2.putBoolean("isImportant", this.f85262f);
        return bundle2;
    }
}
