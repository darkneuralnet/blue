package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C11581c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes.dex */
public final class C11575a {

    /* renamed from: androidx.emoji2.text.a$a */
    /* loaded from: classes.dex */
    public static class C11576a {

        /* renamed from: a */
        public final C11577b f54406a;

        public C11576a(C11577b c11577b) {
            this.f54406a = c11577b == null ? m67539e() : c11577b;
        }

        /* renamed from: e */
        public static C11577b m67539e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C11579d();
            }
            return new C11578c();
        }

        /* renamed from: a */
        public final C11581c.AbstractC11585c m67543a(Context context, C53092zw1 c53092zw1) {
            if (c53092zw1 == null) {
                return null;
            }
            return new C11600e(context, c53092zw1);
        }

        /* renamed from: b */
        public final List<List<byte[]>> m67542b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: c */
        public C11581c.AbstractC11585c m67541c(Context context) {
            return m67543a(context, m67536h(context));
        }

        /* renamed from: d */
        public final C53092zw1 m67540d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C53092zw1(str, str2, "emojicompat-emoji-font", m67542b(this.f54406a.mo67533b(packageManager, str2)));
        }

        /* renamed from: f */
        public final boolean m67538f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        public final ProviderInfo m67537g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.f54406a.mo67534c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo mo67535a = this.f54406a.mo67535a(resolveInfo);
                if (m67538f(mo67535a)) {
                    return mo67535a;
                }
            }
            return null;
        }

        /* renamed from: h */
        public C53092zw1 m67536h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            HZ3.m103730h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m67537g = m67537g(packageManager);
            if (m67537g == null) {
                return null;
            }
            try {
                return m67540d(m67537g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.a$b */
    /* loaded from: classes.dex */
    public static class C11577b {
        /* renamed from: a */
        public ProviderInfo mo67535a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        /* renamed from: b */
        public Signature[] mo67533b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public List<ResolveInfo> mo67534c(PackageManager packageManager, Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    /* renamed from: androidx.emoji2.text.a$c */
    /* loaded from: classes.dex */
    public static class C11578c extends C11577b {
        @Override // androidx.emoji2.text.C11575a.C11577b
        /* renamed from: a */
        public ProviderInfo mo67535a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.C11575a.C11577b
        /* renamed from: c */
        public List<ResolveInfo> mo67534c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.a$d */
    /* loaded from: classes.dex */
    public static class C11579d extends C11578c {
        @Override // androidx.emoji2.text.C11575a.C11577b
        /* renamed from: b */
        public Signature[] mo67533b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    private C11575a() {
    }

    /* renamed from: a */
    public static C11600e m67544a(Context context) {
        return (C11600e) new C11576a(null).m67541c(context);
    }
}
