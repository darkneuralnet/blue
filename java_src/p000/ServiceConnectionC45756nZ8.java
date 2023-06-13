package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* renamed from: nZ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ServiceConnectionC45756nZ8 implements ServiceConnection {

    /* renamed from: d */
    public P49 f100131d;

    /* renamed from: g */
    public final /* synthetic */ Ko9 f100134g;

    /* renamed from: b */
    public int f100129b = 0;

    /* renamed from: c */
    public final Messenger f100130c = new Messenger(new HandlerC36805We8(Looper.getMainLooper(), new Handler.Callback() { // from class: Be8
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC45756nZ8 serviceConnectionC45756nZ8 = ServiceConnectionC45756nZ8.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (serviceConnectionC45756nZ8) {
                AbstractC46389od9<?> abstractC46389od9 = serviceConnectionC45756nZ8.f100133f.get(i);
                if (abstractC46389od9 == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                serviceConnectionC45756nZ8.f100133f.remove(i);
                serviceConnectionC45756nZ8.m23508f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC46389od9.m20761c(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC46389od9.mo450a(data);
                return true;
            }
        }
    }));

    /* renamed from: e */
    public final Queue<AbstractC46389od9<?>> f100132e = new ArrayDeque();

    /* renamed from: f */
    public final SparseArray<AbstractC46389od9<?>> f100133f = new SparseArray<>();

    public /* synthetic */ ServiceConnectionC45756nZ8(Ko9 ko9, BT8 bt8) {
        this.f100134g = ko9;
    }

    /* renamed from: a */
    public final synchronized void m23513a(int i, String str) {
        m23512b(i, str, null);
    }

    /* renamed from: b */
    public final synchronized void m23512b(int i, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f100129b;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f100129b = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f100129b = 4;
            ConnectionTracker.getInstance().unbindService(Ko9.m98270a(this.f100134g), this);
            zzq zzqVar = new zzq(i, str, th);
            for (AbstractC46389od9<?> abstractC46389od9 : this.f100132e) {
                abstractC46389od9.m20761c(zzqVar);
            }
            this.f100132e.clear();
            for (int i3 = 0; i3 < this.f100133f.size(); i3++) {
                this.f100133f.valueAt(i3).m20761c(zzqVar);
            }
            this.f100133f.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final void m23511c() {
        Ko9.m98266e(this.f100134g).execute(new Runnable() { // from class: lt8
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC46389od9<?> poll;
                final ServiceConnectionC45756nZ8 serviceConnectionC45756nZ8 = ServiceConnectionC45756nZ8.this;
                while (true) {
                    synchronized (serviceConnectionC45756nZ8) {
                        if (serviceConnectionC45756nZ8.f100129b != 2) {
                            return;
                        }
                        if (serviceConnectionC45756nZ8.f100132e.isEmpty()) {
                            serviceConnectionC45756nZ8.m23508f();
                            return;
                        }
                        poll = serviceConnectionC45756nZ8.f100132e.poll();
                        serviceConnectionC45756nZ8.f100133f.put(poll.f102231a, poll);
                        Ko9.m98266e(serviceConnectionC45756nZ8.f100134g).schedule(new Runnable() { // from class: xN8
                            @Override // java.lang.Runnable
                            public final void run() {
                                ServiceConnectionC45756nZ8.this.m23509e(poll.f102231a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context m98270a = Ko9.m98270a(serviceConnectionC45756nZ8.f100134g);
                    Messenger messenger = serviceConnectionC45756nZ8.f100130c;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f102233c;
                    obtain.arg1 = poll.f102231a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo449b());
                    bundle.putString("pkg", m98270a.getPackageName());
                    bundle.putBundle(MessageExtension.FIELD_DATA, poll.f102234d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC45756nZ8.f100131d.m90878a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC45756nZ8.m23513a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public final synchronized void m23510d() {
        if (this.f100129b == 1) {
            m23513a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void m23509e(int i) {
        AbstractC46389od9<?> abstractC46389od9 = this.f100133f.get(i);
        if (abstractC46389od9 != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f100133f.remove(i);
            abstractC46389od9.m20761c(new zzq(3, "Timed out waiting for response", null));
            m23508f();
        }
    }

    /* renamed from: f */
    public final synchronized void m23508f() {
        if (this.f100129b == 2 && this.f100132e.isEmpty() && this.f100133f.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f100129b = 3;
            ConnectionTracker.getInstance().unbindService(Ko9.m98270a(this.f100134g), this);
        }
    }

    /* renamed from: g */
    public final synchronized boolean m23507g(AbstractC46389od9<?> abstractC46389od9) {
        boolean z;
        int i = this.f100129b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.f100132e.add(abstractC46389od9);
                m23511c();
                return true;
            }
            this.f100132e.add(abstractC46389od9);
            return true;
        }
        this.f100132e.add(abstractC46389od9);
        if (this.f100129b == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f100129b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!ConnectionTracker.getInstance().bindService(Ko9.m98270a(this.f100134g), intent, this, 1)) {
                m23513a(0, "Unable to bind to service");
            } else {
                Ko9.m98266e(this.f100134g).schedule(new Runnable() { // from class: oA8
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC45756nZ8.this.m23510d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m23512b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        Ko9.m98266e(this.f100134g).execute(new Runnable() { // from class: UG8
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC45756nZ8 serviceConnectionC45756nZ8 = ServiceConnectionC45756nZ8.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC45756nZ8) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC45756nZ8.m23513a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC45756nZ8.f100131d = new P49(iBinder2);
                            serviceConnectionC45756nZ8.f100129b = 2;
                            serviceConnectionC45756nZ8.m23511c();
                        } catch (RemoteException e) {
                            serviceConnectionC45756nZ8.m23513a(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        Ko9.m98266e(this.f100134g).execute(new Runnable() { // from class: km8
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC45756nZ8.this.m23513a(2, "Service disconnected");
            }
        });
    }
}
