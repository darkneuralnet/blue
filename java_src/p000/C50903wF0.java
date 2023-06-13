package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import p000.C47940rF0;
/* renamed from: wF0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50903wF0 {

    /* renamed from: a */
    public final Intent f115676a;

    /* renamed from: b */
    public final Bundle f115677b;

    /* renamed from: wF0$a */
    /* loaded from: classes.dex */
    public static class C29818a {
        private C29818a() {
        }

        /* renamed from: a */
        public static String m7164a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public C50903wF0(Intent intent, Bundle bundle) {
        this.f115676a = intent;
        this.f115677b = bundle;
    }

    /* renamed from: a */
    public void m7165a(Context context, Uri uri) {
        this.f115676a.setData(uri);
        NA0.m94291m(context, this.f115676a, this.f115677b);
    }

    /* renamed from: wF0$b */
    /* loaded from: classes.dex */
    public static final class C29819b {

        /* renamed from: c */
        public ArrayList<Bundle> f115680c;

        /* renamed from: d */
        public Bundle f115681d;

        /* renamed from: e */
        public ArrayList<Bundle> f115682e;

        /* renamed from: f */
        public SparseArray<Bundle> f115683f;

        /* renamed from: g */
        public Bundle f115684g;

        /* renamed from: a */
        public final Intent f115678a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C47940rF0.C27890a f115679b = new C47940rF0.C27890a();

        /* renamed from: h */
        public int f115685h = 0;

        /* renamed from: i */
        public boolean f115686i = true;

        public C29819b() {
        }

        /* renamed from: a */
        public C50903wF0 m7163a() {
            if (!this.f115678a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m7159e(null, null);
            }
            ArrayList<Bundle> arrayList = this.f115680c;
            if (arrayList != null) {
                this.f115678a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f115682e;
            if (arrayList2 != null) {
                this.f115678a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f115678a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f115686i);
            this.f115678a.putExtras(this.f115679b.m16157a().m16158a());
            Bundle bundle = this.f115684g;
            if (bundle != null) {
                this.f115678a.putExtras(bundle);
            }
            if (this.f115683f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f115683f);
                this.f115678a.putExtras(bundle2);
            }
            this.f115678a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f115685h);
            m7162b();
            return new C50903wF0(this.f115678a, this.f115681d);
        }

        /* renamed from: b */
        public final void m7162b() {
            Bundle bundle;
            String m7164a = C29818a.m7164a();
            if (!TextUtils.isEmpty(m7164a)) {
                if (this.f115678a.hasExtra("com.android.browser.headers")) {
                    bundle = this.f115678a.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", m7164a);
                    this.f115678a.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        /* renamed from: c */
        public C29819b m7161c(C47940rF0 c47940rF0) {
            this.f115684g = c47940rF0.m16158a();
            return this;
        }

        /* renamed from: d */
        public C29819b m7160d(C52682zF0 c52682zF0) {
            this.f115678a.setPackage(c52682zF0.m1597d().getPackageName());
            m7159e(c52682zF0.m1598c(), c52682zF0.m1596e());
            return this;
        }

        /* renamed from: e */
        public final void m7159e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C38360b70.m64956b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f115678a.putExtras(bundle);
        }

        /* renamed from: f */
        public C29819b m7158f(int i) {
            if (i >= 0 && i <= 2) {
                this.f115685h = i;
                if (i == 1) {
                    this.f115678a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                } else if (i == 2) {
                    this.f115678a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                } else {
                    this.f115678a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        public C29819b(C52682zF0 c52682zF0) {
            if (c52682zF0 != null) {
                m7160d(c52682zF0);
            }
        }
    }
}
