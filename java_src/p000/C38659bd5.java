package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: bd5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38659bd5 {

    /* renamed from: h */
    public static int f57774h;

    /* renamed from: i */
    public static PendingIntent f57775i;

    /* renamed from: j */
    public static final Executor f57776j = My9.f23911b;

    /* renamed from: k */
    public static final Pattern f57777k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f57779b;

    /* renamed from: c */
    public final Iq9 f57780c;

    /* renamed from: d */
    public final ScheduledExecutorService f57781d;

    /* renamed from: f */
    public Messenger f57783f;

    /* renamed from: g */
    public zzd f57784g;

    /* renamed from: a */
    public final NA5<String, TaskCompletionSource<Bundle>> f57778a = new NA5<>();

    /* renamed from: e */
    public Messenger f57782e = new Messenger(new HandlerC36111Tf7(this, Looper.getMainLooper()));

    public C38659bd5(Context context) {
        this.f57779b = context;
        this.f57780c = new Iq9(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f57781d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static /* synthetic */ Task m64258b(Bundle bundle) throws Exception {
        if (m64250j(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m64256d(C38659bd5 c38659bd5, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new OP7());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c38659bd5.f57784g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c38659bd5.f57783f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            str4 = "Unexpected response action: ".concat(valueOf);
                        } else {
                            str4 = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", str4);
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra2.length() != 0) {
                            str3 = "Received InstanceID error ".concat(stringExtra2);
                        } else {
                            str3 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", str3);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            c38659bd5.m64251i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            str2 = "Unexpected structured response ".concat(stringExtra2);
                        } else {
                            str2 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", str2);
                        return;
                    }
                    synchronized (c38659bd5.f57778a) {
                        for (int i = 0; i < c38659bd5.f57778a.size(); i++) {
                            c38659bd5.m64251i(c38659bd5.f57778a.m94264i(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f57777k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c38659bd5.m64251i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: g */
    public static synchronized String m64253g() {
        String num;
        synchronized (C38659bd5.class) {
            int i = f57774h;
            f57774h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    public static synchronized void m64252h(Context context, Intent intent) {
        synchronized (C38659bd5.class) {
            if (f57775i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f57775i = C43432je7.m30138a(context, 0, intent2, C43432je7.f93102a);
            }
            intent.putExtra(Stripe3ds2AuthParams.FIELD_APP, f57775i);
        }
    }

    /* renamed from: j */
    public static boolean m64250j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Task<Bundle> m64259a(final Bundle bundle) {
        if (this.f57780c.m101600a() < 12000000) {
            if (this.f57780c.m101599b() != 0) {
                return m64254f(bundle).continueWithTask(f57776j, new Continuation() { // from class: Cs9
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return C38659bd5.this.m64257c(bundle, task);
                    }
                });
            }
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return Ko9.m98269b(this.f57779b).m98267d(1, bundle).continueWith(f57776j, C42408hu9.f86167a);
    }

    /* renamed from: c */
    public final /* synthetic */ Task m64257c(Bundle bundle, Task task) throws Exception {
        if (!task.isSuccessful()) {
            return task;
        }
        if (!m64250j((Bundle) task.getResult())) {
            return task;
        }
        return m64254f(bundle).onSuccessTask(f57776j, Jw9.f18832a);
    }

    /* renamed from: e */
    public final /* synthetic */ void m64255e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f57778a) {
            this.f57778a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: f */
    public final Task<Bundle> m64254f(Bundle bundle) {
        final String m64253g = m64253g();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f57778a) {
            this.f57778a.put(m64253g, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f57780c.m101599b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m64252h(this.f57779b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(m64253g).length() + 5);
        sb.append("|ID|");
        sb.append(m64253g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f57782e);
        if (this.f57783f != null || this.f57784g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f57783f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f57784g.m51618b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f57781d.schedule(new Runnable() { // from class: Mx9
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(f57776j, new OnCompleteListener() { // from class: Fv9
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C38659bd5.this.m64255e(m64253g, schedule, task);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f57780c.m101599b() == 2) {
            this.f57779b.sendBroadcast(intent);
        } else {
            this.f57779b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f57781d.schedule(new Runnable() { // from class: Mx9
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f57776j, new OnCompleteListener() { // from class: Fv9
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C38659bd5.this.m64255e(m64253g, schedule2, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: i */
    public final void m64251i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f57778a) {
            TaskCompletionSource<Bundle> remove = this.f57778a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.setResult(bundle);
        }
    }
}
