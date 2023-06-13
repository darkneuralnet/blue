package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: WK6 */
/* loaded from: classes6.dex */
public final class WK6 implements InterfaceC50447vU2 {

    /* renamed from: e */
    public static final C42061hK6 f40769e = new C42061hK6("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f40770a;

    /* renamed from: b */
    public final Runtime f40771b;

    /* renamed from: c */
    public final SJ6 f40772c;

    /* renamed from: d */
    public final AtomicReference<Boolean> f40773d;

    public WK6(Context context, Runtime runtime, SJ6 sj6, AtomicReference<Boolean> atomicReference) {
        this.f40770a = context;
        this.f40771b = runtime;
        this.f40772c = sj6;
        this.f40773d = atomicReference;
    }

    @Override // p000.InterfaceC50447vU2
    /* renamed from: a */
    public final boolean mo8610a() {
        boolean booleanValue;
        boolean z;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Class<?> cls;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        boolean z2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Set emptySet;
        String[] strArr;
        synchronized (this.f40773d) {
            if (this.f40773d.get() == null) {
                AtomicReference<Boolean> atomicReference = this.f40773d;
                try {
                    applicationInfo = this.f40770a.getPackageManager().getApplicationInfo(this.f40770a.getPackageName(), 128);
                } catch (PackageManager.NameNotFoundException unused) {
                    f40769e.m36534e("App '%s' is not found in the PackageManager", this.f40770a.getPackageName());
                }
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    if (Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) {
                        try {
                            PackageInfo packageInfo = this.f40770a.getPackageManager().getPackageInfo(this.f40770a.getPackageName(), 0);
                            emptySet = new HashSet();
                            if (packageInfo != null && (strArr = packageInfo.splitNames) != null) {
                                Collections.addAll(emptySet, strArr);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            f40769e.m36534e("App '%s' is not found in PackageManager", this.f40770a.getPackageName());
                            emptySet = Collections.emptySet();
                        }
                        if (emptySet.isEmpty() || (emptySet.size() == 1 && emptySet.contains(""))) {
                            z2 = true;
                            atomicReference.set(Boolean.valueOf(z2));
                        }
                    }
                }
                z2 = false;
                atomicReference.set(Boolean.valueOf(z2));
            }
            booleanValue = this.f40773d.get().booleanValue();
        }
        if (!booleanValue) {
            if (this.f40772c.m85738a()) {
                this.f40772c.m85736c();
                this.f40771b.exit(0);
            }
            return false;
        }
        Iterator<ActivityManager.AppTask> it = m78585b().iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.AppTask next = it.next();
                if (next.getTaskInfo() != null) {
                    intent4 = next.getTaskInfo().baseIntent;
                    if (intent4 != null) {
                        intent5 = next.getTaskInfo().baseIntent;
                        if (intent5.getComponent() != null) {
                            intent6 = next.getTaskInfo().baseIntent;
                            if (PlayCoreMissingSplitsActivity.class.getName().equals(intent6.getComponent().getClassName())) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                loop1: for (ActivityManager.AppTask appTask : m78585b()) {
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (taskInfo != null) {
                        intent = taskInfo.baseIntent;
                        if (intent != null) {
                            intent2 = taskInfo.baseIntent;
                            if (intent2.getComponent() != null) {
                                intent3 = taskInfo.baseIntent;
                                ComponentName component = intent3.getComponent();
                                String className = component.getClassName();
                                try {
                                    cls = Class.forName(className);
                                } catch (ClassNotFoundException unused3) {
                                    f40769e.m36534e("ClassNotFoundException when scanning class hierarchy of '%s'", className);
                                    try {
                                        if (this.f40770a.getPackageManager().getActivityInfo(component, 0) != null) {
                                        }
                                    } catch (PackageManager.NameNotFoundException unused4) {
                                        continue;
                                    }
                                }
                                while (cls != null) {
                                    if (cls.equals(Activity.class)) {
                                        z = true;
                                        break;
                                    }
                                    Class<? super Object> superclass = cls.getSuperclass();
                                    cls = superclass != cls ? superclass : null;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z = false;
                this.f40772c.m85737b();
                for (ActivityManager.AppTask appTask2 : m78585b()) {
                    appTask2.finishAndRemoveTask();
                }
                if (z) {
                    this.f40770a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f40770a, PlayCoreMissingSplitsActivity.class), 1, 1);
                    this.f40770a.startActivity(new Intent(this.f40770a, PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                }
                this.f40771b.exit(0);
            }
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: b */
    public final List<ActivityManager.AppTask> m78585b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f40770a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }
}
