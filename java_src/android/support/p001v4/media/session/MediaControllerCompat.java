package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.InterfaceC10914a;
import android.support.p001v4.media.session.InterfaceC10917b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: android.support.v4.media.session.MediaControllerCompat */
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final InterfaceC10903b f51349a;

    /* renamed from: b */
    public final MediaSessionCompat.Token f51350b;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: c */
    public final ConcurrentHashMap<AbstractC10900a, Boolean> f51351c = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements InterfaceC10903b {

        /* renamed from: a */
        public final MediaController f51352a;

        /* renamed from: b */
        public final Object f51353b = new Object();

        /* renamed from: c */
        public final List<AbstractC10900a> f51354c = new ArrayList();

        /* renamed from: d */
        public HashMap<AbstractC10900a, BinderC10899a> f51355d = new HashMap<>();

        /* renamed from: e */
        public final MediaSessionCompat.Token f51356e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: b */
            public WeakReference<MediaControllerImplApi21> f51357b;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f51357b = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f51357b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f51353b) {
                        mediaControllerImplApi21.f51356e.m70617e(InterfaceC10917b.AbstractBinderC10918a.m70523c5(C38360b70.m64957a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f51356e.m70616g(QE3.m88708b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.m70645b();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        /* loaded from: classes.dex */
        public static class BinderC10899a extends AbstractC10900a.BinderC10902b {
            public BinderC10899a(AbstractC10900a abstractC10900a) {
                super(abstractC10900a);
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: H3 */
            public void mo70578H3(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: L */
            public void mo70576L(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: T2 */
            public void mo70575T2(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: f0 */
            public void mo70573f0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: f4 */
            public void mo70572f4(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.p001v4.media.session.MediaControllerCompat.AbstractC10900a.BinderC10902b, android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: v4 */
            public void mo70568v4(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f51356e = token;
            this.f51352a = new MediaController(context, (MediaSession.Token) token.m70618d());
            if (token.m70619c() == null) {
                m70644c();
            }
        }

        @Override // android.support.p001v4.media.session.MediaControllerCompat.InterfaceC10903b
        /* renamed from: a */
        public boolean mo70633a(KeyEvent keyEvent) {
            return this.f51352a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: b */
        public void m70645b() {
            if (this.f51356e.m70619c() == null) {
                return;
            }
            for (AbstractC10900a abstractC10900a : this.f51354c) {
                BinderC10899a binderC10899a = new BinderC10899a(abstractC10900a);
                this.f51355d.put(abstractC10900a, binderC10899a);
                abstractC10900a.f51359b = binderC10899a;
                try {
                    this.f51356e.m70619c().mo70521B0(binderC10899a);
                    abstractC10900a.m70634i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f51354c.clear();
        }

        /* renamed from: c */
        public final void m70644c() {
            m70643d("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: d */
        public void m70643d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f51352a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10900a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final MediaController.Callback f51358a = new C10901a(this);

        /* renamed from: b */
        public InterfaceC10914a f51359b;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        /* loaded from: classes.dex */
        public static class C10901a extends MediaController.Callback {

            /* renamed from: a */
            public final WeakReference<AbstractC10900a> f51360a;

            public C10901a(AbstractC10900a abstractC10900a) {
                this.f51360a = new WeakReference<>(abstractC10900a);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70642a(new C10904c(playbackInfo.getPlaybackType(), AudioAttributesCompat.m66909c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m70632a(bundle);
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70641b(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70640c(MediaMetadataCompat.m70651a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null && abstractC10900a.f51359b == null) {
                    abstractC10900a.m70639d(PlaybackStateCompat.m70611a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70638e(MediaSessionCompat.QueueItem.m70629b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70637f(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70636g();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m70632a(bundle);
                AbstractC10900a abstractC10900a = this.f51360a.get();
                if (abstractC10900a != null) {
                    InterfaceC10914a interfaceC10914a = abstractC10900a.f51359b;
                    abstractC10900a.m70635h(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        /* loaded from: classes.dex */
        public static class BinderC10902b extends InterfaceC10914a.AbstractBinderC10915a {

            /* renamed from: a */
            public final WeakReference<AbstractC10900a> f51361a;

            public BinderC10902b(AbstractC10900a abstractC10900a) {
                this.f51361a = new WeakReference<>(abstractC10900a);
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: F4 */
            public void mo70579F4(int i) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: H3 */
            public void mo70578H3(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C10904c c10904c;
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    if (parcelableVolumeInfo != null) {
                        c10904c = new C10904c(parcelableVolumeInfo.f51375b, parcelableVolumeInfo.f51376c, parcelableVolumeInfo.f51377d, parcelableVolumeInfo.f51378e, parcelableVolumeInfo.f51379f);
                    } else {
                        c10904c = null;
                    }
                    abstractC10900a.m70634i(4, c10904c, null);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: I */
            public void mo70577I() throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(13, null, null);
                }
            }

            /* renamed from: L */
            public void mo70576L(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(5, list, null);
                }
            }

            /* renamed from: T2 */
            public void mo70575T2(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: a5 */
            public void mo70574a5(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(2, playbackStateCompat, null);
                }
            }

            /* renamed from: f0 */
            public void mo70573f0() throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(8, null, null);
                }
            }

            /* renamed from: f4 */
            public void mo70572f4(Bundle bundle) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(7, bundle, null);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: g3 */
            public void mo70571g3(int i) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(1, str, bundle);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: q4 */
            public void mo70570q4(boolean z) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.p001v4.media.session.InterfaceC10914a
            /* renamed from: u4 */
            public void mo70569u4(boolean z) throws RemoteException {
            }

            /* renamed from: v4 */
            public void mo70568v4(CharSequence charSequence) throws RemoteException {
                AbstractC10900a abstractC10900a = this.f51361a.get();
                if (abstractC10900a != null) {
                    abstractC10900a.m70634i(6, charSequence, null);
                }
            }
        }

        /* renamed from: a */
        public void m70642a(C10904c c10904c) {
        }

        /* renamed from: b */
        public void m70641b(Bundle bundle) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m70634i(8, null, null);
        }

        /* renamed from: c */
        public void m70640c(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: d */
        public void m70639d(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: e */
        public void m70638e(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: f */
        public void m70637f(CharSequence charSequence) {
        }

        /* renamed from: g */
        public void m70636g() {
        }

        /* renamed from: h */
        public void m70635h(String str, Bundle bundle) {
        }

        /* renamed from: i */
        public void m70634i(int i, Object obj, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    /* loaded from: classes.dex */
    public interface InterfaceC10903b {
        /* renamed from: a */
        boolean mo70633a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    /* loaded from: classes.dex */
    public static final class C10904c {

        /* renamed from: a */
        public final int f51362a;

        /* renamed from: b */
        public final AudioAttributesCompat f51363b;

        /* renamed from: c */
        public final int f51364c;

        /* renamed from: d */
        public final int f51365d;

        /* renamed from: e */
        public final int f51366e;

        public C10904c(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.C11769a().m66907b(i2).m66908a(), i3, i4, i5);
        }

        public C10904c(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f51362a = i;
            this.f51363b = audioAttributesCompat;
            this.f51364c = i2;
            this.f51365d = i3;
            this.f51366e = i4;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f51350b = token;
            this.f51349a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* renamed from: a */
    public boolean m70646a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f51349a.mo70633a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
