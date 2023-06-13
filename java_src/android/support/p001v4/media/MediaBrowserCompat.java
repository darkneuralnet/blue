package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p001v4.media.session.InterfaceC10917b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: android.support.v4.media.MediaBrowserCompat */
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f51286b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final InterfaceC10882f f51287a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: e */
        public final String f51288e;

        /* renamed from: f */
        public final Bundle f51289f;

        /* renamed from: g */
        public final AbstractC10879d f51290g;

        @Override // android.support.p001v4.p002os.ResultReceiver
        /* renamed from: a */
        public void mo70519a(int i, Bundle bundle) {
            if (this.f51290g == null) {
                return;
            }
            MediaSessionCompat.m70632a(bundle);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f51289f + ", resultData=" + bundle + ")");
                        return;
                    }
                    this.f51290g.m70706b(this.f51288e, this.f51289f, bundle);
                    return;
                }
                this.f51290g.m70705c(this.f51288e, this.f51289f, bundle);
                return;
            }
            this.f51290g.m70707a(this.f51288e, this.f51289f, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    /* loaded from: classes.dex */
    public static class ItemReceiver extends ResultReceiver {

        /* renamed from: e */
        public final String f51291e;

        /* renamed from: f */
        public final AbstractC10880e f51292f;

        @Override // android.support.p001v4.p002os.ResultReceiver
        /* renamed from: a */
        public void mo70519a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m70631b(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.f51292f.m70704a(this.f51291e);
                    return;
                } else {
                    this.f51292f.m70703b((MediaItem) parcelable);
                    return;
                }
            }
            this.f51292f.m70704a(this.f51291e);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: e */
        public final String f51295e;

        /* renamed from: f */
        public final Bundle f51296f;

        /* renamed from: g */
        public final AbstractC10887k f51297g;

        @Override // android.support.p001v4.p002os.ResultReceiver
        /* renamed from: a */
        public void mo70519a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m70631b(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                    this.f51297g.m70695b(this.f51295e, this.f51296f, arrayList);
                    return;
                }
                this.f51297g.m70696a(this.f51295e, this.f51296f);
                return;
            }
            this.f51297g.m70696a(this.f51295e, this.f51296f);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    /* loaded from: classes.dex */
    public static class C10874a {
        private C10874a() {
        }

        /* renamed from: a */
        public static MediaDescription m70711a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        /* renamed from: b */
        public static int m70710b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    /* loaded from: classes.dex */
    public static class HandlerC10875b extends Handler {

        /* renamed from: a */
        public final WeakReference<InterfaceC10886j> f51298a;

        /* renamed from: b */
        public WeakReference<Messenger> f51299b;

        public HandlerC10875b(InterfaceC10886j interfaceC10886j) {
            this.f51298a = new WeakReference<>(interfaceC10886j);
        }

        /* renamed from: a */
        public void m70709a(Messenger messenger) {
            this.f51299b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f51299b;
            if (weakReference != null && weakReference.get() != null && this.f51298a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m70632a(data);
                InterfaceC10886j interfaceC10886j = this.f51298a.get();
                Messenger messenger = this.f51299b.get();
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            } else {
                                Bundle bundle = data.getBundle("data_options");
                                MediaSessionCompat.m70632a(bundle);
                                Bundle bundle2 = data.getBundle("data_notify_children_changed_options");
                                MediaSessionCompat.m70632a(bundle2);
                                interfaceC10886j.mo70698c(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle, bundle2);
                            }
                        } else {
                            interfaceC10886j.mo70699b(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        MediaSessionCompat.m70632a(bundle3);
                        interfaceC10886j.mo70697f(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        interfaceC10886j.mo70699b(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    /* loaded from: classes.dex */
    public static class C10876c {

        /* renamed from: a */
        public final MediaBrowser.ConnectionCallback f51300a = new C10877a();

        /* renamed from: b */
        public InterfaceC10878b f51301b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        /* loaded from: classes.dex */
        public class C10877a extends MediaBrowser.ConnectionCallback {
            public C10877a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC10878b interfaceC10878b = C10876c.this.f51301b;
                if (interfaceC10878b != null) {
                    interfaceC10878b.mo70701d();
                }
                C10876c.this.mo66840a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC10878b interfaceC10878b = C10876c.this.f51301b;
                if (interfaceC10878b != null) {
                    interfaceC10878b.mo70700e();
                }
                C10876c.this.mo66839b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC10878b interfaceC10878b = C10876c.this.f51301b;
                if (interfaceC10878b != null) {
                    interfaceC10878b.mo70702a();
                }
                C10876c.this.mo66838c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        /* loaded from: classes.dex */
        public interface InterfaceC10878b {
            /* renamed from: a */
            void mo70702a();

            /* renamed from: d */
            void mo70701d();

            /* renamed from: e */
            void mo70700e();
        }

        /* renamed from: a */
        public void mo66840a() {
        }

        /* renamed from: b */
        public void mo66839b() {
        }

        /* renamed from: c */
        public void mo66838c() {
        }

        /* renamed from: d */
        public void m70708d(InterfaceC10878b interfaceC10878b) {
            this.f51301b = interfaceC10878b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10879d {
        /* renamed from: a */
        public void m70707a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void m70706b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void m70705c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10880e {

        /* renamed from: a */
        public final MediaBrowser.ItemCallback f51303a = new C10881a();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$e$a */
        /* loaded from: classes.dex */
        public class C10881a extends MediaBrowser.ItemCallback {
            public C10881a() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
                AbstractC10880e.this.m70704a(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                AbstractC10880e.this.m70703b(MediaItem.m70715a(mediaItem));
            }
        }

        /* renamed from: a */
        public void m70704a(String str) {
        }

        /* renamed from: b */
        public void m70703b(MediaItem mediaItem) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    /* loaded from: classes.dex */
    public interface InterfaceC10882f {
        void connect();

        void disconnect();

        MediaSessionCompat.Token getSessionToken();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    /* loaded from: classes.dex */
    public static class C10883g implements InterfaceC10882f, InterfaceC10886j, C10876c.InterfaceC10878b {

        /* renamed from: a */
        public final Context f51305a;

        /* renamed from: b */
        public final MediaBrowser f51306b;

        /* renamed from: c */
        public final Bundle f51307c;

        /* renamed from: d */
        public final HandlerC10875b f51308d = new HandlerC10875b(this);

        /* renamed from: e */
        public final C28385so<String, C10889m> f51309e = new C28385so<>();

        /* renamed from: f */
        public int f51310f;

        /* renamed from: g */
        public C10888l f51311g;

        /* renamed from: h */
        public Messenger f51312h;

        /* renamed from: i */
        public MediaSessionCompat.Token f51313i;

        /* renamed from: j */
        public Bundle f51314j;

        public C10883g(Context context, ComponentName componentName, C10876c c10876c, Bundle bundle) {
            Bundle bundle2;
            this.f51305a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f51307c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c10876c.m70708d(this);
            this.f51306b = new MediaBrowser(context, componentName, c10876c.f51300a, bundle2);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c.InterfaceC10878b
        /* renamed from: a */
        public void mo70702a() {
            this.f51311g = null;
            this.f51312h = null;
            this.f51313i = null;
            this.f51308d.m70709a(null);
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10886j
        /* renamed from: b */
        public void mo70699b(Messenger messenger) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10886j
        /* renamed from: c */
        public void mo70698c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f51312h != messenger) {
                return;
            }
            C10889m c10889m = this.f51309e.get(str);
            if (c10889m == null) {
                if (MediaBrowserCompat.f51286b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            AbstractC10890n m70691a = c10889m.m70691a(bundle);
            if (m70691a != null) {
                if (bundle == null) {
                    if (list == null) {
                        m70691a.m70686c(str);
                        return;
                    }
                    this.f51314j = bundle2;
                    m70691a.m70688a(str, list);
                    this.f51314j = null;
                } else if (list == null) {
                    m70691a.m70685d(str, bundle);
                } else {
                    this.f51314j = bundle2;
                    m70691a.m70687b(str, list, bundle);
                    this.f51314j = null;
                }
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10882f
        public void connect() {
            this.f51306b.connect();
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c.InterfaceC10878b
        /* renamed from: d */
        public void mo70701d() {
            try {
                Bundle extras = this.f51306b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f51310f = extras.getInt("extra_service_version", 0);
                IBinder m64957a = C38360b70.m64957a(extras, "extra_messenger");
                if (m64957a != null) {
                    this.f51311g = new C10888l(m64957a, this.f51307c);
                    Messenger messenger = new Messenger(this.f51308d);
                    this.f51312h = messenger;
                    this.f51308d.m70709a(messenger);
                    try {
                        this.f51311g.m70694a(this.f51305a, this.f51312h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                InterfaceC10917b m70523c5 = InterfaceC10917b.AbstractBinderC10918a.m70523c5(C38360b70.m64957a(extras, "extra_session_binder"));
                if (m70523c5 != null) {
                    this.f51313i = MediaSessionCompat.Token.m70620b(this.f51306b.getSessionToken(), m70523c5);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10882f
        public void disconnect() {
            Messenger messenger;
            C10888l c10888l = this.f51311g;
            if (c10888l != null && (messenger = this.f51312h) != null) {
                try {
                    c10888l.m70692c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f51306b.disconnect();
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.C10876c.InterfaceC10878b
        /* renamed from: e */
        public void mo70700e() {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10886j
        /* renamed from: f */
        public void mo70697f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.p001v4.media.MediaBrowserCompat.InterfaceC10882f
        public MediaSessionCompat.Token getSessionToken() {
            if (this.f51313i == null) {
                this.f51313i = MediaSessionCompat.Token.m70621a(this.f51306b.getSessionToken());
            }
            return this.f51313i;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    /* loaded from: classes.dex */
    public static class C10884h extends C10883g {
        public C10884h(Context context, ComponentName componentName, C10876c c10876c, Bundle bundle) {
            super(context, componentName, c10876c, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    /* loaded from: classes.dex */
    public static class C10885i extends C10884h {
        public C10885i(Context context, ComponentName componentName, C10876c c10876c, Bundle bundle) {
            super(context, componentName, c10876c, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    /* loaded from: classes.dex */
    public interface InterfaceC10886j {
        /* renamed from: b */
        void mo70699b(Messenger messenger);

        /* renamed from: c */
        void mo70698c(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: f */
        void mo70697f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10887k {
        /* renamed from: a */
        public void m70696a(String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void m70695b(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    /* loaded from: classes.dex */
    public static class C10888l {

        /* renamed from: a */
        public Messenger f51315a;

        /* renamed from: b */
        public Bundle f51316b;

        public C10888l(IBinder iBinder, Bundle bundle) {
            this.f51315a = new Messenger(iBinder);
            this.f51316b = bundle;
        }

        /* renamed from: a */
        public void m70694a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f51316b);
            m70693b(6, bundle, messenger);
        }

        /* renamed from: b */
        public final void m70693b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f51315a.send(obtain);
        }

        /* renamed from: c */
        public void m70692c(Messenger messenger) throws RemoteException {
            m70693b(7, null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    /* loaded from: classes.dex */
    public static class C10889m {

        /* renamed from: a */
        public final List<AbstractC10890n> f51317a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f51318b = new ArrayList();

        /* renamed from: a */
        public AbstractC10890n m70691a(Bundle bundle) {
            for (int i = 0; i < this.f51318b.size(); i++) {
                if (C46253oP2.m21217a(this.f51318b.get(i), bundle)) {
                    return this.f51317a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<AbstractC10890n> m70690b() {
            return this.f51317a;
        }

        /* renamed from: c */
        public List<Bundle> m70689c() {
            return this.f51318b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10890n {

        /* renamed from: a */
        public final MediaBrowser.SubscriptionCallback f51319a;

        /* renamed from: b */
        public final IBinder f51320b = new Binder();

        /* renamed from: c */
        public WeakReference<C10889m> f51321c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        /* loaded from: classes.dex */
        public class C10891a extends MediaBrowser.SubscriptionCallback {
            public C10891a() {
            }

            /* renamed from: a */
            public List<MediaItem> m70684a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i >= 0 && i2 >= 1 && i3 < list.size()) {
                    if (i4 > list.size()) {
                        i4 = list.size();
                    }
                    return list.subList(i3, i4);
                }
                return Collections.emptyList();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                C10889m c10889m;
                WeakReference<C10889m> weakReference = AbstractC10890n.this.f51321c;
                if (weakReference == null) {
                    c10889m = null;
                } else {
                    c10889m = weakReference.get();
                }
                if (c10889m == null) {
                    AbstractC10890n.this.m70688a(str, MediaItem.m70714b(list));
                    return;
                }
                List<MediaItem> m70714b = MediaItem.m70714b(list);
                List<AbstractC10890n> m70690b = c10889m.m70690b();
                List<Bundle> m70689c = c10889m.m70689c();
                for (int i = 0; i < m70690b.size(); i++) {
                    Bundle bundle = m70689c.get(i);
                    if (bundle == null) {
                        AbstractC10890n.this.m70688a(str, m70714b);
                    } else {
                        AbstractC10890n.this.m70687b(str, m70684a(m70714b, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                AbstractC10890n.this.m70686c(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        /* loaded from: classes.dex */
        public class C10892b extends C10891a {
            public C10892b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m70632a(bundle);
                AbstractC10890n.this.m70687b(str, MediaItem.m70714b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m70632a(bundle);
                AbstractC10890n.this.m70685d(str, bundle);
            }
        }

        public AbstractC10890n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f51319a = new C10892b();
            } else {
                this.f51319a = new C10891a();
            }
        }

        /* renamed from: a */
        public void m70688a(String str, List<MediaItem> list) {
        }

        /* renamed from: b */
        public void m70687b(String str, List<MediaItem> list, Bundle bundle) {
        }

        /* renamed from: c */
        public void m70686c(String str) {
        }

        /* renamed from: d */
        public void m70685d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C10876c c10876c, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f51287a = new C10885i(context, componentName, c10876c, bundle);
        } else {
            this.f51287a = new C10884h(context, componentName, c10876c, bundle);
        }
    }

    /* renamed from: a */
    public void m70718a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f51287a.connect();
    }

    /* renamed from: b */
    public void m70717b() {
        this.f51287a.disconnect();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token m70716c() {
        return this.f51287a.getSessionToken();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C10873a();

        /* renamed from: b */
        public final int f51293b;

        /* renamed from: c */
        public final MediaDescriptionCompat f51294c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        /* loaded from: classes.dex */
        public class C10873a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.m70681c())) {
                    this.f51293b = i;
                    this.f51294c = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        /* renamed from: a */
        public static MediaItem m70715a(Object obj) {
            if (obj != null) {
                MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                return new MediaItem(MediaDescriptionCompat.m70683a(C10874a.m70711a(mediaItem)), C10874a.m70710b(mediaItem));
            }
            return null;
        }

        /* renamed from: b */
        public static List<MediaItem> m70714b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m70715a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f51293b + ", mDescription=" + this.f51294c + CoreConstants.CURLY_RIGHT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f51293b);
            this.f51294c.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f51293b = parcel.readInt();
            this.f51294c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
