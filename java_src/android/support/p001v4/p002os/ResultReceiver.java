package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p001v4.p002os.InterfaceC10923a;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C10920a();

    /* renamed from: b */
    public final boolean f51400b = false;

    /* renamed from: c */
    public final Handler f51401c = null;

    /* renamed from: d */
    public InterfaceC10923a f51402d;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    public class C10920a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    public class BinderC10921b extends InterfaceC10923a.AbstractBinderC10924a {
        public BinderC10921b() {
        }

        @Override // android.support.p001v4.p002os.InterfaceC10923a
        /* renamed from: z0 */
        public void mo70514z0(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f51401c;
            if (handler != null) {
                handler.post(new RunnableC10922c(i, bundle));
            } else {
                resultReceiver.mo70519a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    public class RunnableC10922c implements Runnable {

        /* renamed from: b */
        public final int f51404b;

        /* renamed from: c */
        public final Bundle f51405c;

        public RunnableC10922c(int i, Bundle bundle) {
            this.f51404b = i;
            this.f51405c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo70519a(this.f51404b, this.f51405c);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f51402d = InterfaceC10923a.AbstractBinderC10924a.m70515c5(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo70519a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void m70518b(int i, Bundle bundle) {
        if (this.f51400b) {
            Handler handler = this.f51401c;
            if (handler != null) {
                handler.post(new RunnableC10922c(i, bundle));
                return;
            } else {
                mo70519a(i, bundle);
                return;
            }
        }
        InterfaceC10923a interfaceC10923a = this.f51402d;
        if (interfaceC10923a != null) {
            try {
                interfaceC10923a.mo70514z0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f51402d == null) {
                this.f51402d = new BinderC10921b();
            }
            parcel.writeStrongBinder(this.f51402d.asBinder());
        }
    }
}
