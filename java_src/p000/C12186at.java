package p000;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
/* renamed from: at */
/* loaded from: classes6.dex */
public class C12186at {

    /* renamed from: a */
    public static final long f56480a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b */
    public static final long f56481b = SystemClock.elapsedRealtime();

    private C12186at() {
    }

    /* renamed from: a */
    public static Status m65337a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    /* renamed from: b */
    public static void m65336b(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    /* renamed from: c */
    public static <TResult extends InterfaceC10421Zs> void m65335c(Task<TResult> task, Activity activity, int i) {
        RunnableC38541bQ7 m64539a = RunnableC38541bQ7.m64539a(task);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i2 = m64539a.f57482b;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", i);
        bundle.putLong("initializationElapsedRealtime", f56481b);
        FragmentC42781iY7 fragmentC42781iY7 = new FragmentC42781iY7();
        fragmentC42781iY7.setArguments(bundle);
        int i3 = m64539a.f57482b;
        beginTransaction.add(fragmentC42781iY7, "com.google.android.gms.wallet.AutoResolveHelper" + i3).commit();
    }

    /* renamed from: g */
    public static void m65331g(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    /* renamed from: h */
    public static void m65330h(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
                return;
            }
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException e) {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Exception sending pending result", e);
            }
        }
    }

    /* renamed from: i */
    public static void m65329i(Activity activity, int i, Task task) {
        int i2;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).startResolutionForResult(activity, i);
                return;
            } catch (IntentSender.SendIntentException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            ((InterfaceC10421Zs) task.getResult()).mo50526a(intent);
            i2 = -1;
        } else {
            if (exception instanceof ApiException) {
                ApiException apiException = (ApiException) exception;
                m65336b(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
                }
                m65336b(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i2 = 1;
        }
        m65330h(activity, i, i2, intent);
    }
}
