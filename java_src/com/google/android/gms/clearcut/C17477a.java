package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.C17522p;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.TimeZone;
@KeepForSdk
/* renamed from: com.google.android.gms.clearcut.a */
/* loaded from: classes5.dex */
public final class C17477a {

    /* renamed from: n */
    public static final Api.ClientKey<C45001mH8> f70290n;

    /* renamed from: o */
    public static final Api.AbstractClientBuilder<C45001mH8, Api.ApiOptions.NoOptions> f70291o;
    @Deprecated

    /* renamed from: p */
    public static final Api<Api.ApiOptions.NoOptions> f70292p;

    /* renamed from: q */
    public static final ExperimentTokens[] f70293q;

    /* renamed from: r */
    public static final String[] f70294r;

    /* renamed from: s */
    public static final byte[][] f70295s;

    /* renamed from: a */
    public final Context f70296a;

    /* renamed from: b */
    public final String f70297b;

    /* renamed from: c */
    public final int f70298c;

    /* renamed from: d */
    public String f70299d;

    /* renamed from: e */
    public int f70300e;

    /* renamed from: f */
    public String f70301f;

    /* renamed from: g */
    public String f70302g;

    /* renamed from: h */
    public final boolean f70303h;

    /* renamed from: i */
    public EnumC34546Mn8 f70304i;

    /* renamed from: j */
    public final YB7 f70305j;

    /* renamed from: k */
    public final Clock f70306k;

    /* renamed from: l */
    public C17481d f70307l;

    /* renamed from: m */
    public final InterfaceC17479b f70308m;

    /* renamed from: com.google.android.gms.clearcut.a$a */
    /* loaded from: classes5.dex */
    public class C17478a {

        /* renamed from: a */
        public int f70309a;

        /* renamed from: b */
        public String f70310b;

        /* renamed from: c */
        public String f70311c;

        /* renamed from: d */
        public String f70312d;

        /* renamed from: e */
        public EnumC34546Mn8 f70313e;

        /* renamed from: f */
        public ArrayList<Integer> f70314f;

        /* renamed from: g */
        public ArrayList<String> f70315g;

        /* renamed from: h */
        public ArrayList<Integer> f70316h;

        /* renamed from: i */
        public ArrayList<ExperimentTokens> f70317i;

        /* renamed from: j */
        public ArrayList<byte[]> f70318j;

        /* renamed from: k */
        public boolean f70319k;

        /* renamed from: l */
        public final C35536Qt8 f70320l;

        /* renamed from: m */
        public boolean f70321m;

        public C17478a(C17477a c17477a, byte[] bArr) {
            this(bArr, (InterfaceC17480c) null);
        }

        @KeepForSdk
        /* renamed from: a */
        public void m51626a() {
            if (this.f70321m) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f70321m = true;
            zze zzeVar = new zze(new zzr(C17477a.this.f70297b, C17477a.this.f70298c, this.f70309a, this.f70310b, this.f70311c, this.f70312d, C17477a.this.f70303h, this.f70313e), this.f70320l, null, null, C17477a.m51639d(null), null, C17477a.m51639d(null), null, null, this.f70319k);
            if (C17477a.this.f70308m.mo51454a(zzeVar)) {
                C17477a.this.f70305j.mo75465d(zzeVar);
            } else {
                PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, (GoogleApiClient) null);
            }
        }

        @KeepForSdk
        /* renamed from: b */
        public C17478a m51625b(int i) {
            this.f70320l.f31148h = i;
            return this;
        }

        public C17478a(byte[] bArr, InterfaceC17480c interfaceC17480c) {
            this.f70309a = C17477a.this.f70300e;
            this.f70310b = C17477a.this.f70299d;
            this.f70311c = C17477a.this.f70301f;
            this.f70312d = null;
            this.f70313e = C17477a.this.f70304i;
            this.f70314f = null;
            this.f70315g = null;
            this.f70316h = null;
            this.f70317i = null;
            this.f70318j = null;
            this.f70319k = true;
            C35536Qt8 c35536Qt8 = new C35536Qt8();
            this.f70320l = c35536Qt8;
            this.f70321m = false;
            this.f70311c = C17477a.this.f70301f;
            this.f70312d = null;
            c35536Qt8.f31143B = C34473Mf7.m95078a(C17477a.this.f70296a);
            c35536Qt8.f31144d = C17477a.this.f70306k.currentTimeMillis();
            c35536Qt8.f31145e = C17477a.this.f70306k.elapsedRealtime();
            C17481d unused = C17477a.this.f70307l;
            c35536Qt8.f31160t = TimeZone.getDefault().getOffset(c35536Qt8.f31144d) / 1000;
            if (bArr != null) {
                c35536Qt8.f31155o = bArr;
            }
        }

        public /* synthetic */ C17478a(C17477a c17477a, byte[] bArr, C32124Ce7 c32124Ce7) {
            this(c17477a, bArr);
        }
    }

    /* renamed from: com.google.android.gms.clearcut.a$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC17479b {
        /* renamed from: a */
        boolean mo51454a(zze zzeVar);
    }

    /* renamed from: com.google.android.gms.clearcut.a$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC17480c {
    }

    /* renamed from: com.google.android.gms.clearcut.a$d */
    /* loaded from: classes5.dex */
    public static class C17481d {
    }

    static {
        Api.ClientKey<C45001mH8> clientKey = new Api.ClientKey<>();
        f70290n = clientKey;
        C32124Ce7 c32124Ce7 = new C32124Ce7();
        f70291o = c32124Ce7;
        f70292p = new Api<>("ClearcutLogger.API", c32124Ce7, clientKey);
        f70293q = new ExperimentTokens[0];
        f70294r = new String[0];
        f70295s = new byte[0];
    }

    @VisibleForTesting
    public C17477a(Context context, int i, String str, String str2, String str3, boolean z, YB7 yb7, Clock clock, C17481d c17481d, InterfaceC17479b interfaceC17479b) {
        this.f70300e = -1;
        EnumC34546Mn8 enumC34546Mn8 = EnumC34546Mn8.DEFAULT;
        this.f70304i = enumC34546Mn8;
        this.f70296a = context;
        this.f70297b = context.getPackageName();
        this.f70298c = m51641b(context);
        this.f70300e = -1;
        this.f70299d = str;
        this.f70301f = str2;
        this.f70302g = null;
        this.f70303h = z;
        this.f70305j = yb7;
        this.f70306k = clock;
        this.f70307l = new C17481d();
        this.f70304i = enumC34546Mn8;
        this.f70308m = interfaceC17479b;
        if (z) {
            Preconditions.checkArgument(str2 == null, "can't be anonymous with an upload account");
        }
    }

    /* renamed from: b */
    public static int m51641b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            return 0;
        }
    }

    /* renamed from: d */
    public static int[] m51639d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Integer num = arrayList.get(i);
            i++;
            iArr[i2] = num.intValue();
            i2++;
        }
        return iArr;
    }

    @KeepForSdk
    /* renamed from: a */
    public final C17478a m51642a(byte[] bArr) {
        return new C17478a(this, bArr, (C32124Ce7) null);
    }

    @KeepForSdk
    public C17477a(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, O68.m92899i(context), DefaultClock.getInstance(), null, new C17522p(context));
    }
}
