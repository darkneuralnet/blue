package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.InterfaceC10917b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.p002os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: i */
    public static final boolean f55016i = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    public InterfaceC11781g f55017b;

    /* renamed from: f */
    public C11779f f55021f;

    /* renamed from: h */
    public MediaSessionCompat.Token f55023h;

    /* renamed from: c */
    public final C11779f f55018c = new C11779f("android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: d */
    public final ArrayList<C11779f> f55019d = new ArrayList<>();

    /* renamed from: e */
    public final C28385so<IBinder, C11779f> f55020e = new C28385so<>();

    /* renamed from: g */
    public final HandlerC11806q f55022g = new HandlerC11806q();

    /* renamed from: androidx.media.MediaBrowserServiceCompat$a */
    /* loaded from: classes.dex */
    public class C11774a extends C11792l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        public final /* synthetic */ C11779f f55024f;

        /* renamed from: g */
        public final /* synthetic */ String f55025g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f55026h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f55027i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11774a(Object obj, C11779f c11779f, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f55024f = c11779f;
            this.f55025g = str;
            this.f55026h = bundle;
            this.f55027i = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11792l
        /* renamed from: h */
        public void mo66861d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.f55020e.get(this.f55024f.f55042f.asBinder()) != this.f55024f) {
                if (MediaBrowserServiceCompat.f55016i) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f55024f.f55037a + " id=" + this.f55025g);
                    return;
                }
                return;
            }
            if ((m66864a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.m66896b(list, this.f55026h);
            }
            try {
                this.f55024f.f55042f.mo66846a(this.f55025g, list, this.f55026h, this.f55027i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f55025g + " package=" + this.f55024f.f55037a);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$b */
    /* loaded from: classes.dex */
    public class C11775b extends C11792l<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f55029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11775b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f55029f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11792l
        /* renamed from: h */
        public void mo66861d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((m66864a() & 2) != 0) {
                this.f55029f.m70518b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f55029f.m70518b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$c */
    /* loaded from: classes.dex */
    public class C11776c extends C11792l<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f55031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11776c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f55031f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11792l
        /* renamed from: h */
        public void mo66861d(List<MediaBrowserCompat.MediaItem> list) {
            if ((m66864a() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f55031f.m70518b(0, bundle);
                return;
            }
            this.f55031f.m70518b(-1, null);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$d */
    /* loaded from: classes.dex */
    public class C11777d extends C11792l<Bundle> {

        /* renamed from: f */
        public final /* synthetic */ ResultReceiver f55033f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11777d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f55033f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11792l
        /* renamed from: c */
        public void mo66862c(Bundle bundle) {
            this.f55033f.m70518b(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11792l
        /* renamed from: h */
        public void mo66861d(Bundle bundle) {
            this.f55033f.m70518b(0, bundle);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$e */
    /* loaded from: classes.dex */
    public static final class C11778e {

        /* renamed from: a */
        public final String f55035a;

        /* renamed from: b */
        public final Bundle f55036b;

        public C11778e(String str, Bundle bundle) {
            if (str != null) {
                this.f55035a = str;
                this.f55036b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        /* renamed from: c */
        public Bundle m66875c() {
            return this.f55036b;
        }

        /* renamed from: d */
        public String m66874d() {
            return this.f55035a;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$f */
    /* loaded from: classes.dex */
    public class C11779f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f55037a;

        /* renamed from: b */
        public final int f55038b;

        /* renamed from: c */
        public final int f55039c;

        /* renamed from: d */
        public final C52181yP2 f55040d;

        /* renamed from: e */
        public final Bundle f55041e;

        /* renamed from: f */
        public final InterfaceC11804o f55042f;

        /* renamed from: g */
        public final HashMap<String, List<C48526sE3<IBinder, Bundle>>> f55043g = new HashMap<>();

        /* renamed from: h */
        public C11778e f55044h;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$f$a */
        /* loaded from: classes.dex */
        public class RunnableC11780a implements Runnable {
            public RunnableC11780a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = C11779f.this;
                MediaBrowserServiceCompat.this.f55020e.remove(c11779f.f55042f.asBinder());
            }
        }

        public C11779f(String str, int i, int i2, Bundle bundle, InterfaceC11804o interfaceC11804o) {
            this.f55037a = str;
            this.f55038b = i;
            this.f55039c = i2;
            this.f55040d = new C52181yP2(str, i, i2);
            this.f55041e = bundle;
            this.f55042f = interfaceC11804o;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f55022g.post(new RunnableC11780a());
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$g */
    /* loaded from: classes.dex */
    public interface InterfaceC11781g {
        /* renamed from: a */
        void mo66867a();

        /* renamed from: b */
        IBinder mo66873b(Intent intent);
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$h */
    /* loaded from: classes.dex */
    public class C11782h implements InterfaceC11781g {

        /* renamed from: a */
        public final List<Bundle> f55047a = new ArrayList();

        /* renamed from: b */
        public MediaBrowserService f55048b;

        /* renamed from: c */
        public Messenger f55049c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$a */
        /* loaded from: classes.dex */
        public class C11783a extends C11792l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            public final /* synthetic */ C11793m f55051f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11783a(Object obj, C11793m c11793m) {
                super(obj);
                this.f55051f = c11793m;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C11792l
            /* renamed from: h */
            public void mo66861d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f55051f.m66856b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$h$b */
        /* loaded from: classes.dex */
        public class C11784b extends MediaBrowserService {
            public C11784b(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.m70632a(bundle);
                C11782h c11782h = C11782h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                C11778e m66872c = c11782h.m66872c(str, i, bundle2);
                if (m66872c == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(m66872c.f55035a, m66872c.f55036b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C11782h.this.m66871d(str, new C11793m<>(result));
            }
        }

        public C11782h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11781g
        /* renamed from: b */
        public IBinder mo66873b(Intent intent) {
            return this.f55048b.onBind(intent);
        }

        /* renamed from: c */
        public C11778e m66872c(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder asBinder;
            int i2 = -1;
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.f55049c = new Messenger(MediaBrowserServiceCompat.this.f55022g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C38360b70.m64956b(bundle2, "extra_messenger", this.f55049c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.f55023h;
                if (token != null) {
                    InterfaceC10917b m70619c = token.m70619c();
                    if (m70619c == null) {
                        asBinder = null;
                    } else {
                        asBinder = m70619c.asBinder();
                    }
                    C38360b70.m64956b(bundle2, "extra_session_binder", asBinder);
                } else {
                    this.f55047a.add(bundle2);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            } else {
                bundle2 = null;
            }
            C11779f c11779f = new C11779f(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f55021f = c11779f;
            C11778e m66893e = mediaBrowserServiceCompat.m66893e(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.f55021f = null;
            if (m66893e == null) {
                return null;
            }
            if (this.f55049c != null) {
                mediaBrowserServiceCompat2.f55019d.add(c11779f);
            }
            if (bundle2 == null) {
                bundle2 = m66893e.m66875c();
            } else if (m66893e.m66875c() != null) {
                bundle2.putAll(m66893e.m66875c());
            }
            return new C11778e(m66893e.m66874d(), bundle2);
        }

        /* renamed from: d */
        public void m66871d(String str, C11793m<List<Parcel>> c11793m) {
            C11783a c11783a = new C11783a(str, c11793m);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f55021f = mediaBrowserServiceCompat.f55018c;
            mediaBrowserServiceCompat.m66892f(str, c11783a);
            MediaBrowserServiceCompat.this.f55021f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$i */
    /* loaded from: classes.dex */
    public class C11785i extends C11782h {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$a */
        /* loaded from: classes.dex */
        public class C11786a extends C11792l<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            public final /* synthetic */ C11793m f55055f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11786a(Object obj, C11793m c11793m) {
                super(obj);
                this.f55055f = c11793m;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C11792l
            /* renamed from: h */
            public void mo66861d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f55055f.m66856b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f55055f.m66856b(obtain);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$i$b */
        /* loaded from: classes.dex */
        public class C11787b extends C11782h.C11784b {
            public C11787b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C11785i.this.m66869e(str, new C11793m<>(result));
            }
        }

        public C11785i() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11781g
        /* renamed from: a */
        public void mo66867a() {
            C11787b c11787b = new C11787b(MediaBrowserServiceCompat.this);
            this.f55048b = c11787b;
            c11787b.onCreate();
        }

        /* renamed from: e */
        public void m66869e(String str, C11793m<Parcel> c11793m) {
            C11786a c11786a = new C11786a(str, c11793m);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f55021f = mediaBrowserServiceCompat.f55018c;
            mediaBrowserServiceCompat.m66890h(str, c11786a);
            MediaBrowserServiceCompat.this.f55021f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$j */
    /* loaded from: classes.dex */
    public class C11788j extends C11785i {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$a */
        /* loaded from: classes.dex */
        public class C11789a extends C11792l<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            public final /* synthetic */ C11793m f55059f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f55060g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11789a(Object obj, C11793m c11793m, Bundle bundle) {
                super(obj);
                this.f55059f = c11793m;
                this.f55060g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.C11792l
            /* renamed from: h */
            public void mo66861d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f55059f.m66856b(null);
                    return;
                }
                if ((m66864a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.m66896b(list, this.f55060g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f55059f.m66856b(arrayList);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$j$b */
        /* loaded from: classes.dex */
        public class C11790b extends C11785i.C11787b {
            public C11790b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m70632a(bundle);
                C11788j c11788j = C11788j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f55021f = mediaBrowserServiceCompat.f55018c;
                c11788j.m66866f(str, new C11793m<>(result), bundle);
                MediaBrowserServiceCompat.this.f55021f = null;
            }
        }

        public C11788j() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.C11785i, androidx.media.MediaBrowserServiceCompat.InterfaceC11781g
        /* renamed from: a */
        public void mo66867a() {
            C11790b c11790b = new C11790b(MediaBrowserServiceCompat.this);
            this.f55048b = c11790b;
            c11790b.onCreate();
        }

        /* renamed from: f */
        public void m66866f(String str, C11793m<List<Parcel>> c11793m, Bundle bundle) {
            C11789a c11789a = new C11789a(str, c11793m, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.f55021f = mediaBrowserServiceCompat.f55018c;
            mediaBrowserServiceCompat.m66891g(str, c11789a, bundle);
            MediaBrowserServiceCompat.this.f55021f = null;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$k */
    /* loaded from: classes.dex */
    public class C11791k extends C11788j {
        public C11791k() {
            super();
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$l */
    /* loaded from: classes.dex */
    public static class C11792l<T> {

        /* renamed from: a */
        public final Object f55064a;

        /* renamed from: b */
        public boolean f55065b;

        /* renamed from: c */
        public boolean f55066c;

        /* renamed from: d */
        public boolean f55067d;

        /* renamed from: e */
        public int f55068e;

        public C11792l(Object obj) {
            this.f55064a = obj;
        }

        /* renamed from: a */
        public int m66864a() {
            return this.f55068e;
        }

        /* renamed from: b */
        public boolean m66863b() {
            return this.f55065b || this.f55066c || this.f55067d;
        }

        /* renamed from: c */
        public void mo66862c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f55064a);
        }

        /* renamed from: d */
        public void mo66861d(T t) {
            throw null;
        }

        /* renamed from: e */
        public void m66860e(Bundle bundle) {
            if (!this.f55066c && !this.f55067d) {
                this.f55067d = true;
                mo66862c(bundle);
                return;
            }
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f55064a);
        }

        /* renamed from: f */
        public void m66859f(T t) {
            if (!this.f55066c && !this.f55067d) {
                this.f55066c = true;
                mo66861d(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f55064a);
        }

        /* renamed from: g */
        public void m66858g(int i) {
            this.f55068e = i;
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$m */
    /* loaded from: classes.dex */
    public static class C11793m<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f55069a;

        public C11793m(MediaBrowserService.Result result) {
            this.f55069a = result;
        }

        /* renamed from: a */
        public List<MediaBrowser.MediaItem> m66857a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m66856b(T t) {
            if (t instanceof List) {
                this.f55069a.sendResult(m66857a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f55069a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f55069a.sendResult(null);
            }
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$n */
    /* loaded from: classes.dex */
    public class C11794n {

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$a */
        /* loaded from: classes.dex */
        public class RunnableC11795a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55071b;

            /* renamed from: c */
            public final /* synthetic */ String f55072c;

            /* renamed from: d */
            public final /* synthetic */ int f55073d;

            /* renamed from: e */
            public final /* synthetic */ int f55074e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f55075f;

            public RunnableC11795a(InterfaceC11804o interfaceC11804o, String str, int i, int i2, Bundle bundle) {
                this.f55071b = interfaceC11804o;
                this.f55072c = str;
                this.f55073d = i;
                this.f55074e = i2;
                this.f55075f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f55071b.asBinder();
                MediaBrowserServiceCompat.this.f55020e.remove(asBinder);
                C11779f c11779f = new C11779f(this.f55072c, this.f55073d, this.f55074e, this.f55075f, this.f55071b);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.f55021f = c11779f;
                C11778e m66893e = mediaBrowserServiceCompat.m66893e(this.f55072c, this.f55074e, this.f55075f);
                c11779f.f55044h = m66893e;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.f55021f = null;
                if (m66893e == null) {
                    Log.i("MBServiceCompat", "No root for client " + this.f55072c + " from service " + getClass().getName());
                    try {
                        this.f55071b.mo66845b();
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f55072c);
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.f55020e.put(asBinder, c11779f);
                    asBinder.linkToDeath(c11779f, 0);
                    if (MediaBrowserServiceCompat.this.f55023h != null) {
                        this.f55071b.mo66844c(c11779f.f55044h.m66874d(), MediaBrowserServiceCompat.this.f55023h, c11779f.f55044h.m66875c());
                    }
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f55072c);
                    MediaBrowserServiceCompat.this.f55020e.remove(asBinder);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$b */
        /* loaded from: classes.dex */
        public class RunnableC11796b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55077b;

            public RunnableC11796b(InterfaceC11804o interfaceC11804o) {
                this.f55077b = interfaceC11804o;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f remove = MediaBrowserServiceCompat.this.f55020e.remove(this.f55077b.asBinder());
                if (remove != null) {
                    remove.f55042f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$c */
        /* loaded from: classes.dex */
        public class RunnableC11797c implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55079b;

            /* renamed from: c */
            public final /* synthetic */ String f55080c;

            /* renamed from: d */
            public final /* synthetic */ IBinder f55081d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f55082e;

            public RunnableC11797c(InterfaceC11804o interfaceC11804o, String str, IBinder iBinder, Bundle bundle) {
                this.f55079b = interfaceC11804o;
                this.f55080c = str;
                this.f55081d = iBinder;
                this.f55082e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = MediaBrowserServiceCompat.this.f55020e.get(this.f55079b.asBinder());
                if (c11779f == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f55080c);
                    return;
                }
                MediaBrowserServiceCompat.this.m66897a(this.f55080c, c11779f, this.f55081d, this.f55082e);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$d */
        /* loaded from: classes.dex */
        public class RunnableC11798d implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55084b;

            /* renamed from: c */
            public final /* synthetic */ String f55085c;

            /* renamed from: d */
            public final /* synthetic */ IBinder f55086d;

            public RunnableC11798d(InterfaceC11804o interfaceC11804o, String str, IBinder iBinder) {
                this.f55084b = interfaceC11804o;
                this.f55085c = str;
                this.f55086d = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = MediaBrowserServiceCompat.this.f55020e.get(this.f55084b.asBinder());
                if (c11779f == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f55085c);
                } else if (!MediaBrowserServiceCompat.this.m66882p(this.f55085c, c11779f, this.f55086d)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f55085c + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$e */
        /* loaded from: classes.dex */
        public class RunnableC11799e implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55088b;

            /* renamed from: c */
            public final /* synthetic */ String f55089c;

            /* renamed from: d */
            public final /* synthetic */ ResultReceiver f55090d;

            public RunnableC11799e(InterfaceC11804o interfaceC11804o, String str, ResultReceiver resultReceiver) {
                this.f55088b = interfaceC11804o;
                this.f55089c = str;
                this.f55090d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = MediaBrowserServiceCompat.this.f55020e.get(this.f55088b.asBinder());
                if (c11779f == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f55089c);
                    return;
                }
                MediaBrowserServiceCompat.this.m66884n(this.f55089c, c11779f, this.f55090d);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$f */
        /* loaded from: classes.dex */
        public class RunnableC11800f implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55092b;

            /* renamed from: c */
            public final /* synthetic */ int f55093c;

            /* renamed from: d */
            public final /* synthetic */ String f55094d;

            /* renamed from: e */
            public final /* synthetic */ int f55095e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f55096f;

            public RunnableC11800f(InterfaceC11804o interfaceC11804o, int i, String str, int i2, Bundle bundle) {
                this.f55092b = interfaceC11804o;
                this.f55093c = i;
                this.f55094d = str;
                this.f55095e = i2;
                this.f55096f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f;
                IBinder asBinder = this.f55092b.asBinder();
                MediaBrowserServiceCompat.this.f55020e.remove(asBinder);
                Iterator<C11779f> it = MediaBrowserServiceCompat.this.f55019d.iterator();
                while (true) {
                    c11779f = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C11779f next = it.next();
                    if (next.f55039c == this.f55093c) {
                        if (TextUtils.isEmpty(this.f55094d) || this.f55095e <= 0) {
                            c11779f = new C11779f(next.f55037a, next.f55038b, next.f55039c, this.f55096f, this.f55092b);
                        }
                        it.remove();
                    }
                }
                if (c11779f == null) {
                    c11779f = new C11779f(this.f55094d, this.f55095e, this.f55093c, this.f55096f, this.f55092b);
                }
                MediaBrowserServiceCompat.this.f55020e.put(asBinder, c11779f);
                try {
                    asBinder.linkToDeath(c11779f, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$g */
        /* loaded from: classes.dex */
        public class RunnableC11801g implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55098b;

            public RunnableC11801g(InterfaceC11804o interfaceC11804o) {
                this.f55098b = interfaceC11804o;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f55098b.asBinder();
                C11779f remove = MediaBrowserServiceCompat.this.f55020e.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$h */
        /* loaded from: classes.dex */
        public class RunnableC11802h implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55100b;

            /* renamed from: c */
            public final /* synthetic */ String f55101c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f55102d;

            /* renamed from: e */
            public final /* synthetic */ ResultReceiver f55103e;

            public RunnableC11802h(InterfaceC11804o interfaceC11804o, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f55100b = interfaceC11804o;
                this.f55101c = str;
                this.f55102d = bundle;
                this.f55103e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = MediaBrowserServiceCompat.this.f55020e.get(this.f55100b.asBinder());
                if (c11779f == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f55101c);
                    return;
                }
                MediaBrowserServiceCompat.this.m66883o(this.f55101c, this.f55102d, c11779f, this.f55103e);
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$n$i */
        /* loaded from: classes.dex */
        public class RunnableC11803i implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC11804o f55105b;

            /* renamed from: c */
            public final /* synthetic */ String f55106c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f55107d;

            /* renamed from: e */
            public final /* synthetic */ ResultReceiver f55108e;

            public RunnableC11803i(InterfaceC11804o interfaceC11804o, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f55105b = interfaceC11804o;
                this.f55106c = str;
                this.f55107d = bundle;
                this.f55108e = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11779f c11779f = MediaBrowserServiceCompat.this.f55020e.get(this.f55105b.asBinder());
                if (c11779f == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f55106c + ", extras=" + this.f55107d);
                    return;
                }
                MediaBrowserServiceCompat.this.m66886l(this.f55106c, this.f55107d, c11779f, this.f55108e);
            }
        }

        public C11794n() {
        }

        /* renamed from: a */
        public void m66855a(String str, IBinder iBinder, Bundle bundle, InterfaceC11804o interfaceC11804o) {
            MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11797c(interfaceC11804o, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void m66854b(String str, int i, int i2, Bundle bundle, InterfaceC11804o interfaceC11804o) {
            if (MediaBrowserServiceCompat.this.m66895c(str, i2)) {
                MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11795a(interfaceC11804o, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void m66853c(InterfaceC11804o interfaceC11804o) {
            MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11796b(interfaceC11804o));
        }

        /* renamed from: d */
        public void m66852d(String str, ResultReceiver resultReceiver, InterfaceC11804o interfaceC11804o) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11799e(interfaceC11804o, str, resultReceiver));
            }
        }

        /* renamed from: e */
        public void m66851e(InterfaceC11804o interfaceC11804o, String str, int i, int i2, Bundle bundle) {
            MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11800f(interfaceC11804o, i2, str, i, bundle));
        }

        /* renamed from: f */
        public void m66850f(String str, IBinder iBinder, InterfaceC11804o interfaceC11804o) {
            MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11798d(interfaceC11804o, str, iBinder));
        }

        /* renamed from: g */
        public void m66849g(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC11804o interfaceC11804o) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11802h(interfaceC11804o, str, bundle, resultReceiver));
            }
        }

        /* renamed from: h */
        public void m66848h(String str, Bundle bundle, ResultReceiver resultReceiver, InterfaceC11804o interfaceC11804o) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11803i(interfaceC11804o, str, bundle, resultReceiver));
            }
        }

        /* renamed from: i */
        public void m66847i(InterfaceC11804o interfaceC11804o) {
            MediaBrowserServiceCompat.this.f55022g.m66842a(new RunnableC11801g(interfaceC11804o));
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$o */
    /* loaded from: classes.dex */
    public interface InterfaceC11804o {
        /* renamed from: a */
        void mo66846a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo66845b() throws RemoteException;

        /* renamed from: c */
        void mo66844c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$p */
    /* loaded from: classes.dex */
    public static class C11805p implements InterfaceC11804o {

        /* renamed from: a */
        public final Messenger f55110a;

        public C11805p(Messenger messenger) {
            this.f55110a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11804o
        /* renamed from: a */
        public void mo66846a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            m66843d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11804o
        public IBinder asBinder() {
            return this.f55110a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11804o
        /* renamed from: b */
        public void mo66845b() throws RemoteException {
            m66843d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.InterfaceC11804o
        /* renamed from: c */
        public void mo66844c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m66843d(1, bundle2);
        }

        /* renamed from: d */
        public final void m66843d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f55110a.send(obtain);
        }
    }

    /* renamed from: androidx.media.MediaBrowserServiceCompat$q */
    /* loaded from: classes.dex */
    public final class HandlerC11806q extends Handler {

        /* renamed from: a */
        public final C11794n f55111a;

        public HandlerC11806q() {
            this.f55111a = new C11794n();
        }

        /* renamed from: a */
        public void m66842a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m70632a(bundle);
                    this.f55111a.m66854b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C11805p(message.replyTo));
                    return;
                case 2:
                    this.f55111a.m66853c(new C11805p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m70632a(bundle2);
                    this.f55111a.m66855a(data.getString("data_media_item_id"), C38360b70.m64957a(data, "data_callback_token"), bundle2, new C11805p(message.replyTo));
                    return;
                case 4:
                    this.f55111a.m66850f(data.getString("data_media_item_id"), C38360b70.m64957a(data, "data_callback_token"), new C11805p(message.replyTo));
                    return;
                case 5:
                    this.f55111a.m66852d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C11805p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m70632a(bundle3);
                    this.f55111a.m66851e(new C11805p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f55111a.m66847i(new C11805p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m70632a(bundle4);
                    this.f55111a.m66849g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new C11805p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m70632a(bundle5);
                    this.f55111a.m66848h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C11805p(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public void m66897a(String str, C11779f c11779f, IBinder iBinder, Bundle bundle) {
        List<C48526sE3<IBinder, Bundle>> list = c11779f.f55043g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C48526sE3<IBinder, Bundle> c48526sE3 : list) {
            if (iBinder == c48526sE3.f108491a && C46253oP2.m21217a(bundle, c48526sE3.f108492b)) {
                return;
            }
        }
        list.add(new C48526sE3<>(iBinder, bundle));
        c11779f.f55043g.put(str, list);
        m66885m(str, c11779f, bundle, null);
        this.f55021f = c11779f;
        m66888j(str, bundle);
        this.f55021f = null;
    }

    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> m66896b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* renamed from: c */
    public boolean m66895c(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m66894d(String str, Bundle bundle, C11792l<Bundle> c11792l) {
        c11792l.m66860e(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract C11778e m66893e(String str, int i, Bundle bundle);

    /* renamed from: f */
    public abstract void m66892f(String str, C11792l<List<MediaBrowserCompat.MediaItem>> c11792l);

    /* renamed from: g */
    public void m66891g(String str, C11792l<List<MediaBrowserCompat.MediaItem>> c11792l, Bundle bundle) {
        c11792l.m66858g(1);
        m66892f(str, c11792l);
    }

    /* renamed from: h */
    public void m66890h(String str, C11792l<MediaBrowserCompat.MediaItem> c11792l) {
        c11792l.m66858g(2);
        c11792l.m66859f(null);
    }

    /* renamed from: i */
    public void m66889i(String str, Bundle bundle, C11792l<List<MediaBrowserCompat.MediaItem>> c11792l) {
        c11792l.m66858g(4);
        c11792l.m66859f(null);
    }

    /* renamed from: j */
    public void m66888j(String str, Bundle bundle) {
    }

    /* renamed from: k */
    public void m66887k(String str) {
    }

    /* renamed from: l */
    public void m66886l(String str, Bundle bundle, C11779f c11779f, ResultReceiver resultReceiver) {
        C11777d c11777d = new C11777d(str, resultReceiver);
        this.f55021f = c11779f;
        m66894d(str, bundle, c11777d);
        this.f55021f = null;
        if (c11777d.m66863b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    /* renamed from: m */
    public void m66885m(String str, C11779f c11779f, Bundle bundle, Bundle bundle2) {
        C11774a c11774a = new C11774a(str, c11779f, str, bundle, bundle2);
        this.f55021f = c11779f;
        if (bundle == null) {
            m66892f(str, c11774a);
        } else {
            m66891g(str, c11774a, bundle);
        }
        this.f55021f = null;
        if (c11774a.m66863b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c11779f.f55037a + " id=" + str);
    }

    /* renamed from: n */
    public void m66884n(String str, C11779f c11779f, ResultReceiver resultReceiver) {
        C11775b c11775b = new C11775b(str, resultReceiver);
        this.f55021f = c11779f;
        m66890h(str, c11775b);
        this.f55021f = null;
        if (c11775b.m66863b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    /* renamed from: o */
    public void m66883o(String str, Bundle bundle, C11779f c11779f, ResultReceiver resultReceiver) {
        C11776c c11776c = new C11776c(str, resultReceiver);
        this.f55021f = c11779f;
        m66889i(str, bundle, c11776c);
        this.f55021f = null;
        if (c11776c.m66863b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f55017b.mo66873b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f55017b = new C11791k();
        } else if (i >= 26) {
            this.f55017b = new C11788j();
        } else {
            this.f55017b = new C11785i();
        }
        this.f55017b.mo66867a();
    }

    /* renamed from: p */
    public boolean m66882p(String str, C11779f c11779f, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        try {
            if (iBinder == null) {
                if (c11779f.f55043g.remove(str) == null) {
                    z = false;
                }
                return z;
            }
            List<C48526sE3<IBinder, Bundle>> list = c11779f.f55043g.get(str);
            if (list != null) {
                Iterator<C48526sE3<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f108491a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    c11779f.f55043g.remove(str);
                }
            }
            return z2;
        } finally {
            this.f55021f = c11779f;
            m66887k(str);
            this.f55021f = null;
        }
    }
}
