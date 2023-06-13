package android.support.p001v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p001v4.media.MediaDescriptionCompat;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.RatingCompat;
import android.support.p001v4.media.session.InterfaceC10914a;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC10917b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC10918a extends Binder implements InterfaceC10917b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C10919a implements InterfaceC10917b {

            /* renamed from: b */
            public static InterfaceC10917b f51398b;

            /* renamed from: a */
            public IBinder f51399a;

            public C10919a(IBinder iBinder) {
                this.f51399a = iBinder;
            }

            @Override // android.support.p001v4.media.session.InterfaceC10917b
            /* renamed from: B0 */
            public void mo70521B0(InterfaceC10914a interfaceC10914a) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (interfaceC10914a != null) {
                        iBinder = interfaceC10914a.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f51399a.transact(3, obtain, obtain2, 0) && AbstractBinderC10918a.m70522d5() != null) {
                        AbstractBinderC10918a.m70522d5().mo70521B0(interfaceC10914a);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10917b
            /* renamed from: M2 */
            public boolean mo70520M2(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f51399a.transact(2, obtain, obtain2, 0) && AbstractBinderC10918a.m70522d5() != null) {
                        return AbstractBinderC10918a.m70522d5().mo70520M2(keyEvent);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f51399a;
            }
        }

        public AbstractBinderC10918a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: c5 */
        public static InterfaceC10917b m70523c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10917b)) {
                return (InterfaceC10917b) queryLocalInterface;
            }
            return new C10919a(iBinder);
        }

        /* renamed from: d5 */
        public static InterfaceC10917b m70522d5() {
            return C10919a.f51398b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            Uri uri;
            Uri uri2;
            RatingCompat ratingCompat;
            if (i != 1598968902) {
                boolean z = false;
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
                Bundle bundle2 = null;
                MediaDescriptionCompat mediaDescriptionCompat = null;
                MediaDescriptionCompat mediaDescriptionCompat2 = null;
                MediaDescriptionCompat mediaDescriptionCompat3 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                RatingCompat ratingCompat2 = null;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                Bundle bundle9 = null;
                KeyEvent keyEvent = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        if (parcel.readInt() != 0) {
                            resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                        }
                        m70536p0(readString, bundle, resultReceiverWrapper);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        boolean mo70520M2 = mo70520M2(keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(mo70520M2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        mo70521B0(InterfaceC10914a.AbstractBinderC10915a.m70567c5(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70549V0(InterfaceC10914a.AbstractBinderC10915a.m70567c5(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        boolean m70561I0 = m70561I0();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70561I0 ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String m70526x0 = m70526x0();
                        parcel2.writeNoException();
                        parcel2.writeString(m70526x0);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String m70545d = m70545d();
                        parcel2.writeNoException();
                        parcel2.writeString(m70545d);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PendingIntent m70564F = m70564F();
                        parcel2.writeNoException();
                        if (m70564F != null) {
                            parcel2.writeInt(1);
                            m70564F.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        long m70542k = m70542k();
                        parcel2.writeNoException();
                        parcel2.writeLong(m70542k);
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        ParcelableVolumeInfo m70551T1 = m70551T1();
                        parcel2.writeNoException();
                        if (m70551T1 != null) {
                            parcel2.writeInt(1);
                            m70551T1.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70527w4(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70559O3(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70565C1();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70553T(readString2, bundle9);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70566B2(readString3, bundle8);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70563G2(uri, bundle7);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70532s3(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        pause();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        stop();
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        next();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        previous();
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70537n4();
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70534r0();
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70535p4(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                        }
                        m70560N3(ratingCompat2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70533s(readString4, bundle6);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        MediaMetadataCompat metadata = getMetadata();
                        parcel2.writeNoException();
                        if (metadata != null) {
                            parcel2.writeInt(1);
                            metadata.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PlaybackStateCompat m70562G4 = m70562G4();
                        parcel2.writeNoException();
                        if (m70562G4 != null) {
                            parcel2.writeInt(1);
                            m70562G4.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        List<MediaSessionCompat.QueueItem> m70558O4 = m70558O4();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(m70558O4);
                        return true;
                    case 30:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        CharSequence m70552T0 = m70552T0();
                        parcel2.writeNoException();
                        if (m70552T0 != null) {
                            parcel2.writeInt(1);
                            TextUtils.writeToParcel(m70552T0, parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle extras = getExtras();
                        parcel2.writeNoException();
                        if (extras != null) {
                            parcel2.writeInt(1);
                            extras.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 32:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int m70540m2 = m70540m2();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70540m2);
                        return true;
                    case 33:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70543e4();
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70556R(readString5, bundle5);
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70547Z3(readString6, bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70528w(uri2, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int m70555R1 = m70555R1();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70555R1);
                        return true;
                    case 38:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        boolean m70529v = m70529v();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70529v ? 1 : 0);
                        return true;
                    case 39:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70557P4(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 40:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        m70530u0(z);
                        parcel2.writeNoException();
                        return true;
                    case 41:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        m70548V3(mediaDescriptionCompat3);
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        m70554S2(mediaDescriptionCompat2, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        m70550U3(mediaDescriptionCompat);
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70541l0(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        boolean m70539n0 = m70539n0();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70539n0 ? 1 : 0);
                        return true;
                    case 46:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        m70538n1(z);
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int m70546b3 = m70546b3();
                        parcel2.writeNoException();
                        parcel2.writeInt(m70546b3);
                        return true;
                    case 48:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70524y3(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        m70531s4(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle m70525x2 = m70525x2();
                        parcel2.writeNoException();
                        if (m70525x2 != null) {
                            parcel2.writeInt(1);
                            m70525x2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 51:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                        } else {
                            ratingCompat = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m70544e0(ratingCompat, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
    }

    /* renamed from: B0 */
    void mo70521B0(InterfaceC10914a interfaceC10914a) throws RemoteException;

    /* renamed from: B2 */
    void m70566B2(String str, Bundle bundle) throws RemoteException;

    /* renamed from: C1 */
    void m70565C1() throws RemoteException;

    /* renamed from: F */
    PendingIntent m70564F() throws RemoteException;

    /* renamed from: G2 */
    void m70563G2(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: G4 */
    PlaybackStateCompat m70562G4() throws RemoteException;

    /* renamed from: I0 */
    boolean m70561I0() throws RemoteException;

    /* renamed from: M2 */
    boolean mo70520M2(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: N3 */
    void m70560N3(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: O3 */
    void m70559O3(int i, int i2, String str) throws RemoteException;

    /* renamed from: O4 */
    List<MediaSessionCompat.QueueItem> m70558O4() throws RemoteException;

    /* renamed from: P4 */
    void m70557P4(int i) throws RemoteException;

    /* renamed from: R */
    void m70556R(String str, Bundle bundle) throws RemoteException;

    /* renamed from: R1 */
    int m70555R1() throws RemoteException;

    /* renamed from: S2 */
    void m70554S2(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* renamed from: T */
    void m70553T(String str, Bundle bundle) throws RemoteException;

    /* renamed from: T0 */
    CharSequence m70552T0() throws RemoteException;

    /* renamed from: T1 */
    ParcelableVolumeInfo m70551T1() throws RemoteException;

    /* renamed from: U3 */
    void m70550U3(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: V0 */
    void m70549V0(InterfaceC10914a interfaceC10914a) throws RemoteException;

    /* renamed from: V3 */
    void m70548V3(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: Z3 */
    void m70547Z3(String str, Bundle bundle) throws RemoteException;

    /* renamed from: b3 */
    int m70546b3() throws RemoteException;

    /* renamed from: d */
    String m70545d() throws RemoteException;

    /* renamed from: e0 */
    void m70544e0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: e4 */
    void m70543e4() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    /* renamed from: k */
    long m70542k() throws RemoteException;

    /* renamed from: l0 */
    void m70541l0(int i) throws RemoteException;

    /* renamed from: m2 */
    int m70540m2() throws RemoteException;

    /* renamed from: n0 */
    boolean m70539n0() throws RemoteException;

    /* renamed from: n1 */
    void m70538n1(boolean z) throws RemoteException;

    /* renamed from: n4 */
    void m70537n4() throws RemoteException;

    void next() throws RemoteException;

    /* renamed from: p0 */
    void m70536p0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* renamed from: p4 */
    void m70535p4(long j) throws RemoteException;

    void pause() throws RemoteException;

    void previous() throws RemoteException;

    /* renamed from: r0 */
    void m70534r0() throws RemoteException;

    /* renamed from: s */
    void m70533s(String str, Bundle bundle) throws RemoteException;

    /* renamed from: s3 */
    void m70532s3(long j) throws RemoteException;

    /* renamed from: s4 */
    void m70531s4(float f) throws RemoteException;

    void stop() throws RemoteException;

    /* renamed from: u0 */
    void m70530u0(boolean z) throws RemoteException;

    /* renamed from: v */
    boolean m70529v() throws RemoteException;

    /* renamed from: w */
    void m70528w(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: w4 */
    void m70527w4(int i, int i2, String str) throws RemoteException;

    /* renamed from: x0 */
    String m70526x0() throws RemoteException;

    /* renamed from: x2 */
    Bundle m70525x2() throws RemoteException;

    /* renamed from: y3 */
    void m70524y3(int i) throws RemoteException;
}
