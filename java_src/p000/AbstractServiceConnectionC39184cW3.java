package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* renamed from: cW3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractServiceConnectionC39184cW3 implements ServiceConnection {

    /* renamed from: b */
    public final Context f60772b;

    /* renamed from: c */
    public final Handler f60773c;

    /* renamed from: d */
    public InterfaceC13588b f60774d;

    /* renamed from: e */
    public boolean f60775e;

    /* renamed from: f */
    public Messenger f60776f;

    /* renamed from: g */
    public int f60777g;

    /* renamed from: h */
    public int f60778h;

    /* renamed from: i */
    public final String f60779i;

    /* renamed from: j */
    public final int f60780j;

    /* renamed from: cW3$a */
    /* loaded from: classes5.dex */
    public class HandlerC13587a extends Handler {
        public HandlerC13587a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                AbstractServiceConnectionC39184cW3.this.m61258c(message);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: cW3$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC13588b {
        /* renamed from: a */
        void mo52310a(Bundle bundle);
    }

    public AbstractServiceConnectionC39184cW3(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f60772b = applicationContext != null ? applicationContext : context;
        this.f60777g = i;
        this.f60778h = i2;
        this.f60779i = str;
        this.f60780j = i3;
        this.f60773c = new HandlerC13587a();
    }

    /* renamed from: a */
    public final void m61260a(Bundle bundle) {
        if (!this.f60775e) {
            return;
        }
        this.f60775e = false;
        InterfaceC13588b interfaceC13588b = this.f60774d;
        if (interfaceC13588b != null) {
            interfaceC13588b.mo52310a(bundle);
        }
    }

    /* renamed from: b */
    public void m61259b() {
        this.f60775e = false;
    }

    /* renamed from: c */
    public void m61258c(Message message) {
        if (message.what == this.f60778h) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m61260a(null);
            } else {
                m61260a(data);
            }
            try {
                this.f60772b.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: d */
    public abstract void mo26165d(Bundle bundle);

    /* renamed from: e */
    public final void m61257e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f60779i);
        mo26165d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f60777g);
        obtain.arg1 = this.f60780j;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f60773c);
        try {
            this.f60776f.send(obtain);
        } catch (RemoteException unused) {
            m61260a(null);
        }
    }

    /* renamed from: f */
    public void m61256f(InterfaceC13588b interfaceC13588b) {
        this.f60774d = interfaceC13588b;
    }

    /* renamed from: g */
    public boolean m61255g() {
        Intent m8475m;
        if (this.f60775e || C50483vY2.m8466v(this.f60780j) == -1 || (m8475m = C50483vY2.m8475m(this.f60772b)) == null) {
            return false;
        }
        this.f60775e = true;
        this.f60772b.bindService(m8475m, this, 1);
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f60776f = new Messenger(iBinder);
        m61257e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f60776f = null;
        try {
            this.f60772b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m61260a(null);
    }
}
