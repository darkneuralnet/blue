package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.VO1;
/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static ServiceConnectionC11545c sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    /* loaded from: classes.dex */
    public static class C11543a implements InterfaceC11547d {

        /* renamed from: a */
        public final String f54259a;

        /* renamed from: b */
        public final int f54260b;

        /* renamed from: c */
        public final String f54261c;

        /* renamed from: d */
        public final Notification f54262d;

        public C11543a(String str, int i, String str2, Notification notification) {
            this.f54259a = str;
            this.f54260b = i;
            this.f54261c = str2;
            this.f54262d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.InterfaceC11547d
        /* renamed from: a */
        public void mo67720a(VO1 vo1) throws RemoteException {
            vo1.mo79897Y1(this.f54259a, this.f54260b, this.f54261c, this.f54262d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f54259a + ", id:" + this.f54260b + ", tag:" + this.f54261c + "]";
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    /* loaded from: classes.dex */
    public static class C11544b {

        /* renamed from: a */
        public final ComponentName f54263a;

        /* renamed from: b */
        public final IBinder f54264b;

        public C11544b(ComponentName componentName, IBinder iBinder) {
            this.f54263a = componentName;
            this.f54264b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    /* loaded from: classes.dex */
    public static class ServiceConnectionC11545c implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        public final Context f54265b;

        /* renamed from: c */
        public final HandlerThread f54266c;

        /* renamed from: d */
        public final Handler f54267d;

        /* renamed from: e */
        public final Map<ComponentName, C11546a> f54268e = new HashMap();

        /* renamed from: f */
        public Set<String> f54269f = new HashSet();

        /* renamed from: androidx.core.app.NotificationManagerCompat$c$a */
        /* loaded from: classes.dex */
        public static class C11546a {

            /* renamed from: a */
            public final ComponentName f54270a;

            /* renamed from: c */
            public VO1 f54272c;

            /* renamed from: b */
            public boolean f54271b = false;

            /* renamed from: d */
            public ArrayDeque<InterfaceC11547d> f54273d = new ArrayDeque<>();

            /* renamed from: e */
            public int f54274e = 0;

            public C11546a(ComponentName componentName) {
                this.f54270a = componentName;
            }
        }

        public ServiceConnectionC11545c(Context context) {
            this.f54265b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f54266c = handlerThread;
            handlerThread.start();
            this.f54267d = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean m67730a(C11546a c11546a) {
            if (c11546a.f54271b) {
                return true;
            }
            boolean bindService = this.f54265b.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(c11546a.f54270a), this, 33);
            c11546a.f54271b = bindService;
            if (bindService) {
                c11546a.f54274e = 0;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + c11546a.f54270a);
                this.f54265b.unbindService(this);
            }
            return c11546a.f54271b;
        }

        /* renamed from: b */
        public final void m67729b(C11546a c11546a) {
            if (c11546a.f54271b) {
                this.f54265b.unbindService(this);
                c11546a.f54271b = false;
            }
            c11546a.f54272c = null;
        }

        /* renamed from: c */
        public final void m67728c(InterfaceC11547d interfaceC11547d) {
            m67721j();
            for (C11546a c11546a : this.f54268e.values()) {
                c11546a.f54273d.add(interfaceC11547d);
                m67724g(c11546a);
            }
        }

        /* renamed from: d */
        public final void m67727d(ComponentName componentName) {
            C11546a c11546a = this.f54268e.get(componentName);
            if (c11546a != null) {
                m67724g(c11546a);
            }
        }

        /* renamed from: e */
        public final void m67726e(ComponentName componentName, IBinder iBinder) {
            C11546a c11546a = this.f54268e.get(componentName);
            if (c11546a != null) {
                c11546a.f54272c = VO1.AbstractBinderC8645a.m79898c5(iBinder);
                c11546a.f54274e = 0;
                m67724g(c11546a);
            }
        }

        /* renamed from: f */
        public final void m67725f(ComponentName componentName) {
            C11546a c11546a = this.f54268e.get(componentName);
            if (c11546a != null) {
                m67729b(c11546a);
            }
        }

        /* renamed from: g */
        public final void m67724g(C11546a c11546a) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Processing component " + c11546a.f54270a + ", " + c11546a.f54273d.size() + " queued tasks");
            }
            if (c11546a.f54273d.isEmpty()) {
                return;
            }
            if (m67730a(c11546a) && c11546a.f54272c != null) {
                while (true) {
                    InterfaceC11547d peek = c11546a.f54273d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Log.d(NotificationManagerCompat.TAG, "Sending task " + peek);
                        }
                        peek.mo67720a(c11546a.f54272c);
                        c11546a.f54273d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + c11546a.f54270a);
                        }
                    } catch (RemoteException e) {
                        Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + c11546a.f54270a, e);
                    }
                }
                if (!c11546a.f54273d.isEmpty()) {
                    m67722i(c11546a);
                    return;
                }
                return;
            }
            m67722i(c11546a);
        }

        /* renamed from: h */
        public void m67723h(InterfaceC11547d interfaceC11547d) {
            this.f54267d.obtainMessage(0, interfaceC11547d).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        m67727d((ComponentName) message.obj);
                        return true;
                    }
                    m67725f((ComponentName) message.obj);
                    return true;
                }
                C11544b c11544b = (C11544b) message.obj;
                m67726e(c11544b.f54263a, c11544b.f54264b);
                return true;
            }
            m67728c((InterfaceC11547d) message.obj);
            return true;
        }

        /* renamed from: i */
        public final void m67722i(C11546a c11546a) {
            if (this.f54267d.hasMessages(3, c11546a.f54270a)) {
                return;
            }
            int i = c11546a.f54274e + 1;
            c11546a.f54274e = i;
            if (i > 6) {
                Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + c11546a.f54273d.size() + " tasks to " + c11546a.f54270a + " after " + c11546a.f54274e + " retries");
                c11546a.f54273d.clear();
                return;
            }
            int i2 = (1 << (i - 1)) * 1000;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i2 + " ms");
            }
            this.f54267d.sendMessageDelayed(this.f54267d.obtainMessage(3, c11546a.f54270a), i2);
        }

        /* renamed from: j */
        public final void m67721j() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f54265b);
            if (enabledListenerPackages.equals(this.f54269f)) {
                return;
            }
            this.f54269f = enabledListenerPackages;
            List<ResolveInfo> queryIntentServices = this.f54265b.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f54268e.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                    }
                    this.f54268e.put(componentName2, new C11546a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, C11546a>> it = this.f54268e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, C11546a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + next.getKey());
                    }
                    m67729b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.f54267d.obtainMessage(1, new C11544b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.f54267d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11547d {
        /* renamed from: a */
        void mo67720a(VO1 vo1) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(InterfaceC11547d interfaceC11547d) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new ServiceConnectionC11545c(this.mContext.getApplicationContext());
            }
            sSideChannelManager.m67723h(interfaceC11547d);
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle m71096a = C38054ac3.m71096a(notification);
        if (m71096a != null && m71096a.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return true;
        }
        return false;
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<C37475Zb3> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C37475Zb3 c37475Zb3 : list) {
                arrayList.add(c37475Zb3.m72903b());
            }
            this.mNotificationManager.createNotificationChannelGroups(arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void createNotificationChannelsCompat(List<C35135Pb3> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C35135Pb3 c35135Pb3 : list) {
                arrayList.add(c35135Pb3.m90077a());
            }
            this.mNotificationManager.createNotificationChannels(arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        List<Object> notificationChannels;
        String id;
        String id2;
        String parentChannelId;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = this.mNotificationManager.getNotificationChannels();
            for (Object obj : notificationChannels) {
                NotificationChannel m74829a = C37241Yb3.m74829a(obj);
                id = m74829a.getId();
                if (!collection.contains(id)) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        parentChannelId = m74829a.getParentChannelId();
                        if (collection.contains(parentChannelId)) {
                        }
                    }
                    NotificationManager notificationManager = this.mNotificationManager;
                    id2 = m74829a.getId();
                    notificationManager.deleteNotificationChannel(id2);
                }
            }
        }
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = this.mNotificationManager.getNotificationChannel(str);
            return notificationChannel;
        }
        return null;
    }

    public C35135Pb3 getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new C35135Pb3(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        String id;
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            notificationChannelGroup = this.mNotificationManager.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup2 : getNotificationChannelGroups()) {
                NotificationChannelGroup m81263a = C36314Uc3.m81263a(notificationChannelGroup2);
                id = m81263a.getId();
                if (id.equals(str)) {
                    return m81263a;
                }
            }
        }
        return null;
    }

    public C37475Zb3 getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new C37475Zb3(notificationChannelGroup2);
            }
            return null;
        } else if (i >= 26 && (notificationChannelGroup = getNotificationChannelGroup(str)) != null) {
            return new C37475Zb3(notificationChannelGroup, getNotificationChannels());
        } else {
            return null;
        }
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        List<NotificationChannelGroup> notificationChannelGroups;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannelGroups = this.mNotificationManager.getNotificationChannelGroups();
            return notificationChannelGroups;
        }
        return Collections.emptyList();
    }

    public List<C37475Zb3> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i >= 28) {
                    notificationChannels = Collections.emptyList();
                } else {
                    notificationChannels = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    NotificationChannelGroup m81263a = C36314Uc3.m81263a(notificationChannelGroup);
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C37475Zb3(m81263a));
                    } else {
                        arrayList.add(new C37475Zb3(m81263a, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        List<NotificationChannel> notificationChannels;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = this.mNotificationManager.getNotificationChannels();
            return notificationChannels;
        }
        return Collections.emptyList();
    }

    public List<C35135Pb3> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel notificationChannel : notificationChannels) {
                    arrayList.add(new C35135Pb3(C37241Yb3.m74829a(notificationChannel)));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new C11543a(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }

    public void createNotificationChannel(C35135Pb3 c35135Pb3) {
        createNotificationChannel(c35135Pb3.m90077a());
    }

    public void createNotificationChannelGroup(C37475Zb3 c37475Zb3) {
        createNotificationChannelGroup(c37475Zb3.m72903b());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 30) {
            notificationChannel = this.mNotificationManager.getNotificationChannel(str, str2);
            return notificationChannel;
        }
        return getNotificationChannel(str);
    }

    public C35135Pb3 getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new C35135Pb3(notificationChannel);
    }
}
