package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;
/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public interface InterfaceC10914a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC10915a extends Binder implements InterfaceC10914a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        /* loaded from: classes.dex */
        public static class C10916a implements InterfaceC10914a {

            /* renamed from: a */
            public IBinder f51397a;

            public C10916a(IBinder iBinder) {
                this.f51397a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f51397a;
            }
        }

        public AbstractBinderC10915a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: c5 */
        public static InterfaceC10914a m70567c5(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC10914a)) {
                return (InterfaceC10914a) queryLocalInterface;
            }
            return new C10916a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onEvent(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo70573f0();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo70574a5(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo70575T2(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo70576L(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        mo70568v4(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo70572f4(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo70578H3(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo70579F4(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo70569u4(z);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo70570q4(z);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo70571g3(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo70577I();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    /* renamed from: F4 */
    void mo70579F4(int i) throws RemoteException;

    /* renamed from: H3 */
    void mo70578H3(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: I */
    void mo70577I() throws RemoteException;

    /* renamed from: L */
    void mo70576L(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    /* renamed from: T2 */
    void mo70575T2(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: a5 */
    void mo70574a5(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: f0 */
    void mo70573f0() throws RemoteException;

    /* renamed from: f4 */
    void mo70572f4(Bundle bundle) throws RemoteException;

    /* renamed from: g3 */
    void mo70571g3(int i) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    /* renamed from: q4 */
    void mo70570q4(boolean z) throws RemoteException;

    /* renamed from: u4 */
    void mo70569u4(boolean z) throws RemoteException;

    /* renamed from: v4 */
    void mo70568v4(CharSequence charSequence) throws RemoteException;
}
