package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
/* renamed from: Iy5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33706Iy5 {

    /* renamed from: a */
    public final Context f16533a;

    /* renamed from: b */
    public final Intent f16534b;

    /* renamed from: c */
    public CharSequence f16535c;

    /* renamed from: d */
    public ArrayList<String> f16536d;

    /* renamed from: e */
    public ArrayList<String> f16537e;

    /* renamed from: f */
    public ArrayList<String> f16538f;

    /* renamed from: g */
    public ArrayList<Uri> f16539g;

    public C33706Iy5(Context context) {
        Activity activity;
        this.f16533a = (Context) HZ3.m103731g(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f16534b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f16534b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f16534b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* renamed from: a */
    public C33706Iy5 m101427a(Uri uri) {
        if (this.f16539g == null) {
            this.f16539g = new ArrayList<>();
        }
        this.f16539g.add(uri);
        return this;
    }

    /* renamed from: b */
    public final void m101426b(String str, ArrayList<String> arrayList) {
        int i;
        String[] stringArrayExtra = this.f16534b.getStringArrayExtra(str);
        if (stringArrayExtra != null) {
            i = stringArrayExtra.length;
        } else {
            i = 0;
        }
        String[] strArr = new String[arrayList.size() + i];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
        }
        this.f16534b.putExtra(str, strArr);
    }

    /* renamed from: c */
    public Intent m101425c() {
        return Intent.createChooser(m101424d(), this.f16535c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0.size() > 1) goto L14;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent m101424d() {
        boolean z;
        ArrayList<String> arrayList = this.f16536d;
        if (arrayList != null) {
            m101426b("android.intent.extra.EMAIL", arrayList);
            this.f16536d = null;
        }
        ArrayList<String> arrayList2 = this.f16537e;
        if (arrayList2 != null) {
            m101426b("android.intent.extra.CC", arrayList2);
            this.f16537e = null;
        }
        ArrayList<String> arrayList3 = this.f16538f;
        if (arrayList3 != null) {
            m101426b("android.intent.extra.BCC", arrayList3);
            this.f16538f = null;
        }
        ArrayList<Uri> arrayList4 = this.f16539g;
        if (arrayList4 != null) {
            z = true;
        }
        z = false;
        if (!z) {
            this.f16534b.setAction("android.intent.action.SEND");
            ArrayList<Uri> arrayList5 = this.f16539g;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.f16534b.putExtra("android.intent.extra.STREAM", this.f16539g.get(0));
                C33472Hy5.m103143b(this.f16534b, this.f16539g);
            } else {
                this.f16534b.removeExtra("android.intent.extra.STREAM");
                C33472Hy5.m103142c(this.f16534b);
            }
        } else {
            this.f16534b.setAction("android.intent.action.SEND_MULTIPLE");
            this.f16534b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f16539g);
            C33472Hy5.m103143b(this.f16534b, this.f16539g);
        }
        return this.f16534b;
    }

    /* renamed from: e */
    public C33706Iy5 m101423e(CharSequence charSequence) {
        this.f16535c = charSequence;
        return this;
    }

    /* renamed from: f */
    public C33706Iy5 m101422f(Uri uri) {
        this.f16539g = null;
        if (uri != null) {
            m101427a(uri);
        }
        return this;
    }

    /* renamed from: g */
    public C33706Iy5 m101421g(String str) {
        this.f16534b.putExtra("android.intent.extra.SUBJECT", str);
        return this;
    }

    /* renamed from: h */
    public C33706Iy5 m101420h(CharSequence charSequence) {
        this.f16534b.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    /* renamed from: i */
    public C33706Iy5 m101419i(String str) {
        this.f16534b.setType(str);
        return this;
    }
}
