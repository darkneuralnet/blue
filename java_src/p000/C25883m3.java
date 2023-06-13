package p000;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p000.AbstractC36046Sy5;
import p000.C25883m3;
/* renamed from: m3 */
/* loaded from: classes.dex */
public class C25883m3 extends NA0 {

    /* renamed from: m3$a */
    /* loaded from: classes.dex */
    public static class C25884a {
        private C25884a() {
        }

        /* renamed from: a */
        public static void m26442a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m26441b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        public static void m26440c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: m3$b */
    /* loaded from: classes.dex */
    public static class C25885b {
        private C25885b() {
        }

        /* renamed from: a */
        public static void m26439a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        public static void m26438b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        public static void m26437c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        public static void m26436d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        public static void m26435e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: m3$c */
    /* loaded from: classes.dex */
    public static class C25886c {
        private C25886c() {
        }

        /* renamed from: a */
        public static void m26434a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m26433b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        public static boolean m26432c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: m3$d */
    /* loaded from: classes.dex */
    public interface InterfaceC25887d {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: m3$e */
    /* loaded from: classes.dex */
    public static class SharedElementCallbackC25888e extends SharedElementCallback {

        /* renamed from: a */
        public final AbstractC36046Sy5 f97218a;

        public SharedElementCallbackC25888e(AbstractC36046Sy5 abstractC36046Sy5) {
            this.f97218a = abstractC36046Sy5;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f97218a.m84519b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f97218a.m84518c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f97218a.m84517d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f97218a.m84516e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f97218a.m84515f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f97218a.m84514g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f97218a.m84513h(list, list2, new AbstractC36046Sy5.InterfaceC7624a() { // from class: n3
                @Override // p000.AbstractC36046Sy5.InterfaceC7624a
                /* renamed from: a */
                public final void mo24537a() {
                    C25883m3.C25886c.m26434a(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* renamed from: A */
    public static void m26455A(Activity activity) {
        C25885b.m26435e(activity);
    }

    /* renamed from: p */
    public static void m26453p(Activity activity) {
        C25884a.m26442a(activity);
    }

    /* renamed from: q */
    public static void m26452q(Activity activity) {
        C25885b.m26439a(activity);
    }

    /* renamed from: r */
    public static /* synthetic */ void m26451r(Activity activity) {
        if (!activity.isFinishing() && !C12286b5.m64993i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: s */
    public static void m26450s(Activity activity) {
        C25885b.m26438b(activity);
    }

    /* renamed from: t */
    public static void m26449t(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l3
                @Override // java.lang.Runnable
                public final void run() {
                    C25883m3.m26451r(activity);
                }
            });
        }
    }

    /* renamed from: u */
    public static void m26448u(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (!T30.m84398c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof InterfaceC25887d) {
            ((InterfaceC25887d) activity).validateRequestPermissionsRequestCode(i);
        }
        C25886c.m26433b(activity, strArr, i);
    }

    /* renamed from: v */
    public static void m26447v(Activity activity, AbstractC36046Sy5 abstractC36046Sy5) {
        SharedElementCallbackC25888e sharedElementCallbackC25888e;
        if (abstractC36046Sy5 != null) {
            sharedElementCallbackC25888e = new SharedElementCallbackC25888e(abstractC36046Sy5);
        } else {
            sharedElementCallbackC25888e = null;
        }
        C25885b.m26437c(activity, sharedElementCallbackC25888e);
    }

    /* renamed from: w */
    public static void m26446w(Activity activity, AbstractC36046Sy5 abstractC36046Sy5) {
        SharedElementCallbackC25888e sharedElementCallbackC25888e;
        if (abstractC36046Sy5 != null) {
            sharedElementCallbackC25888e = new SharedElementCallbackC25888e(abstractC36046Sy5);
        } else {
            sharedElementCallbackC25888e = null;
        }
        C25885b.m26436d(activity, sharedElementCallbackC25888e);
    }

    /* renamed from: x */
    public static boolean m26445x(Activity activity, String str) {
        if (!T30.m84398c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        return C25886c.m26432c(activity, str);
    }

    /* renamed from: y */
    public static void m26444y(Activity activity, Intent intent, int i, Bundle bundle) {
        C25884a.m26441b(activity, intent, i, bundle);
    }

    /* renamed from: z */
    public static void m26443z(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        C25884a.m26440c(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }
}
