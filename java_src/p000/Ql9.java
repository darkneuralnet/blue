package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzfs;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
@VisibleForTesting
@SuppressLint({"StaticFieldLeak"})
/* renamed from: Ql9 */
/* loaded from: classes5.dex */
public final class Ql9 {

    /* renamed from: g */
    public static volatile Ql9 f30879g;

    /* renamed from: a */
    public final Context f30880a;

    /* renamed from: b */
    public final List<Zo9> f30881b;

    /* renamed from: c */
    public final C34537Mm8 f30882c;

    /* renamed from: d */
    public final C41924h59 f30883d;

    /* renamed from: e */
    public volatile zzav f30884e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f30885f;

    @VisibleForTesting
    public Ql9(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f30880a = applicationContext;
        this.f30883d = new C41924h59(this);
        this.f30881b = new CopyOnWriteArrayList();
        this.f30882c = new C34537Mm8();
    }

    /* renamed from: b */
    public static Ql9 m88002b(Context context) {
        Preconditions.checkNotNull(context);
        if (f30879g == null) {
            synchronized (Ql9.class) {
                if (f30879g == null) {
                    f30879g = new Ql9(context);
                }
            }
        }
        return f30879g;
    }

    /* renamed from: h */
    public static void m87996h() {
        if (Thread.currentThread() instanceof Wh9) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    /* renamed from: a */
    public final Context m88003a() {
        return this.f30880a;
    }

    /* renamed from: c */
    public final zzav m88001c() {
        String str;
        if (this.f30884e == null) {
            synchronized (this) {
                if (this.f30884e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.f30880a.getPackageManager();
                    String packageName = this.f30880a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str2 = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f30880a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str2 = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str = "Error retrieving package info: appName set to ".concat(valueOf);
                        } else {
                            str = new String("Error retrieving package info: appName set to ");
                        }
                        Log.e("GAv4", str);
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str2);
                    this.f30884e = zzavVar;
                }
            }
        }
        return this.f30884e;
    }

    /* renamed from: d */
    public final zzba m88000d() {
        DisplayMetrics displayMetrics = this.f30880a.getResources().getDisplayMetrics();
        zzba zzbaVar = new zzba();
        zzbaVar.zze(zzfs.zzd(Locale.getDefault()));
        zzbaVar.zza = displayMetrics.widthPixels;
        zzbaVar.zzb = displayMetrics.heightPixels;
        return zzbaVar;
    }

    /* renamed from: g */
    public final <V> Future<V> m87997g(Callable<V> callable) {
        Preconditions.checkNotNull(callable);
        if (Thread.currentThread() instanceof Wh9) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.f30883d.submit(callable);
    }

    /* renamed from: i */
    public final void m87995i(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.f30883d.submit(runnable);
    }

    /* renamed from: j */
    public final void m87994j(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f30885f = uncaughtExceptionHandler;
    }

    /* renamed from: k */
    public final void m87993k(C34366Lt8 c34366Lt8) {
        if (!c34366Lt8.m96221l()) {
            if (!c34366Lt8.m96220m()) {
                C34366Lt8 c34366Lt82 = new C34366Lt8(c34366Lt8);
                c34366Lt82.m96224i();
                this.f30883d.execute(new UT8(this, c34366Lt82));
                return;
            }
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        throw new IllegalStateException("Measurement prototype can't be submitted");
    }
}
