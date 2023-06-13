package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.BinderC18362f;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ExecutorService;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes6.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: c */
    public Binder f74293c;

    /* renamed from: e */
    public int f74295e;

    /* renamed from: b */
    public final ExecutorService f74292b = C36375Uj1.m80974d();

    /* renamed from: d */
    public final Object f74294d = new Object();

    /* renamed from: f */
    public int f74296f = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* loaded from: classes6.dex */
    public class C18350a implements BinderC18362f.InterfaceC18363a {
        public C18350a() {
        }

        @Override // com.google.firebase.messaging.BinderC18362f.InterfaceC18363a
        @KeepForSdk
        /* renamed from: a */
        public Task<Void> mo47129a(Intent intent) {
            return EnhancedIntentService.this.m47241j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m47243h(Intent intent, Task task) {
        m47245d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m47242i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            mo47221f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* renamed from: d */
    public final void m47245d(Intent intent) {
        if (intent != null) {
            C37199Xw6.m76036c(intent);
        }
        synchronized (this.f74294d) {
            int i = this.f74296f - 1;
            this.f74296f = i;
            if (i == 0) {
                m47240k(this.f74295e);
            }
        }
    }

    /* renamed from: e */
    public Intent mo47222e(Intent intent) {
        return intent;
    }

    /* renamed from: f */
    public abstract void mo47221f(Intent intent);

    /* renamed from: g */
    public boolean m47244g(Intent intent) {
        return false;
    }

    /* renamed from: j */
    public final Task<Void> m47241j(final Intent intent) {
        if (m47244g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f74292b.execute(new Runnable() { // from class: Md1
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.m47242i(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: k */
    public boolean m47240k(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f74293c == null) {
            this.f74293c = new BinderC18362f(new C18350a());
        }
        return this.f74293c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f74292b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f74294d) {
            this.f74295e = i2;
            this.f74296f++;
        }
        Intent mo47222e = mo47222e(intent);
        if (mo47222e == null) {
            m47245d(intent);
            return 2;
        }
        Task<Void> m47241j = m47241j(mo47222e);
        if (m47241j.isComplete()) {
            m47245d(intent);
            return 2;
        }
        m47241j.addOnCompleteListener(new ExecutorC49647u74(), new OnCompleteListener() { // from class: Ld1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.this.m47243h(intent, task);
            }
        });
        return 3;
    }
}
