package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;
/* renamed from: androidx.browser.trusted.a */
/* loaded from: classes.dex */
public final class C11141a {

    /* renamed from: androidx.browser.trusted.a$a */
    /* loaded from: classes.dex */
    public static class C11142a {

        /* renamed from: a */
        public final Parcelable[] f52413a;

        public C11142a(Parcelable[] parcelableArr) {
            this.f52413a = parcelableArr;
        }

        /* renamed from: a */
        public Bundle m69671a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f52413a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.a$b */
    /* loaded from: classes.dex */
    public static class C11143b {

        /* renamed from: a */
        public final String f52414a;

        /* renamed from: b */
        public final int f52415b;

        public C11143b(String str, int i) {
            this.f52414a = str;
            this.f52415b = i;
        }

        /* renamed from: a */
        public static C11143b m69670a(Bundle bundle) {
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new C11143b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$c */
    /* loaded from: classes.dex */
    public static class C11144c {

        /* renamed from: a */
        public final String f52416a;

        public C11144c(String str) {
            this.f52416a = str;
        }

        /* renamed from: a */
        public static C11144c m69669a(Bundle bundle) {
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C11144c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$d */
    /* loaded from: classes.dex */
    public static class C11145d {

        /* renamed from: a */
        public final String f52417a;

        /* renamed from: b */
        public final int f52418b;

        /* renamed from: c */
        public final Notification f52419c;

        /* renamed from: d */
        public final String f52420d;

        public C11145d(String str, int i, Notification notification, String str2) {
            this.f52417a = str;
            this.f52418b = i;
            this.f52419c = notification;
            this.f52420d = str2;
        }

        /* renamed from: a */
        public static C11145d m69668a(Bundle bundle) {
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            C11141a.m69672a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C11145d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.a$e */
    /* loaded from: classes.dex */
    public static class C11146e {

        /* renamed from: a */
        public final boolean f52421a;

        public C11146e(boolean z) {
            this.f52421a = z;
        }

        /* renamed from: a */
        public Bundle m69667a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f52421a);
            return bundle;
        }
    }

    /* renamed from: a */
    public static void m69672a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
