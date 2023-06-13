package p000;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;
/* renamed from: Yv4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37422Yv4 {

    /* renamed from: a */
    public final String f47635a;

    /* renamed from: b */
    public final CharSequence f47636b;

    /* renamed from: c */
    public final CharSequence[] f47637c;

    /* renamed from: d */
    public final boolean f47638d;

    /* renamed from: e */
    public final int f47639e;

    /* renamed from: f */
    public final Bundle f47640f;

    /* renamed from: g */
    public final Set<String> f47641g;

    /* renamed from: Yv4$a */
    /* loaded from: classes.dex */
    public static class C10080a {
        private C10080a() {
        }

        /* renamed from: a */
        public static void m73982a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m73981b(C37422Yv4 c37422Yv4) {
            Set<String> m73989d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c37422Yv4.m73984i()).setLabel(c37422Yv4.m73985h()).setChoices(c37422Yv4.m73988e()).setAllowFreeFormInput(c37422Yv4.m73990c()).addExtras(c37422Yv4.m73986g());
            if (Build.VERSION.SDK_INT >= 26 && (m73989d = c37422Yv4.m73989d()) != null) {
                for (String str : m73989d) {
                    C10081b.m73976d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C10082c.m73974b(addExtras, c37422Yv4.m73987f());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static Bundle m73980c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: Yv4$b */
    /* loaded from: classes.dex */
    public static class C10081b {
        private C10081b() {
        }

        /* renamed from: a */
        public static void m73979a(C37422Yv4 c37422Yv4, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C37422Yv4.m73992a(c37422Yv4), intent, map);
        }

        /* renamed from: b */
        public static Set<String> m73978b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        /* renamed from: c */
        public static Map<String, Uri> m73977c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        /* renamed from: d */
        public static RemoteInput.Builder m73976d(RemoteInput.Builder builder, String str, boolean z) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z);
            return allowDataType;
        }
    }

    /* renamed from: Yv4$c */
    /* loaded from: classes.dex */
    public static class C10082c {
        private C10082c() {
        }

        /* renamed from: a */
        public static int m73975a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        /* renamed from: b */
        public static RemoteInput.Builder m73974b(RemoteInput.Builder builder, int i) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i);
            return editChoicesBeforeSending;
        }
    }

    /* renamed from: a */
    public static RemoteInput m73992a(C37422Yv4 c37422Yv4) {
        return C10080a.m73981b(c37422Yv4);
    }

    /* renamed from: b */
    public static RemoteInput[] m73991b(C37422Yv4[] c37422Yv4Arr) {
        if (c37422Yv4Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c37422Yv4Arr.length];
        for (int i = 0; i < c37422Yv4Arr.length; i++) {
            remoteInputArr[i] = m73992a(c37422Yv4Arr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: c */
    public boolean m73990c() {
        return this.f47638d;
    }

    /* renamed from: d */
    public Set<String> m73989d() {
        return this.f47641g;
    }

    /* renamed from: e */
    public CharSequence[] m73988e() {
        return this.f47637c;
    }

    /* renamed from: f */
    public int m73987f() {
        return this.f47639e;
    }

    /* renamed from: g */
    public Bundle m73986g() {
        return this.f47640f;
    }

    /* renamed from: h */
    public CharSequence m73985h() {
        return this.f47636b;
    }

    /* renamed from: i */
    public String m73984i() {
        return this.f47635a;
    }

    /* renamed from: j */
    public boolean m73983j() {
        if (!m73990c() && ((m73988e() == null || m73988e().length == 0) && m73989d() != null && !m73989d().isEmpty())) {
            return true;
        }
        return false;
    }
}
