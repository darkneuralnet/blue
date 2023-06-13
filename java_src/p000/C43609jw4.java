package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC39119cP1;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0003\u000bB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Ljw4;", "", "", "b", "", NamedConstantsKt.APPLICATION_ID, "Ljw4$c;", "e", "", "LSi;", "appEvents", "c", "Ljw4$a;", "eventType", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "Ljava/lang/String;", "TAG", "Ljava/lang/Boolean;", "isServiceAvailable", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: jw4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43609jw4 {

    /* renamed from: a */
    public static final String f93556a;

    /* renamed from: b */
    public static Boolean f93557b;

    /* renamed from: c */
    public static final C43609jw4 f93558c = new C43609jw4();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Ljw4$a;", "", "", "toString", "b", "Ljava/lang/String;", "eventType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: jw4$a */
    /* loaded from: classes5.dex */
    public enum EnumC25045a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: b */
        public final String f93562b;

        EnumC25045a(String str) {
            this.f93562b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f93562b;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Ljw4$b;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "serviceBinder", "", "onServiceConnected", "onNullBinding", "onServiceDisconnected", C17296a.f69688o, "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "latch", "c", "Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: jw4$b */
    /* loaded from: classes5.dex */
    public static final class ServiceConnectionC25046b implements ServiceConnection {

        /* renamed from: b */
        public final CountDownLatch f93563b = new CountDownLatch(1);

        /* renamed from: c */
        public IBinder f93564c;

        /* renamed from: a */
        public final IBinder m29716a() throws InterruptedException {
            this.f93563b.await(5L, TimeUnit.SECONDS);
            return this.f93564c;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f93563b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f93564c = serviceBinder;
            this.f93563b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Ljw4$c;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: jw4$c */
    /* loaded from: classes5.dex */
    public enum EnumC25047c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        String simpleName = C43609jw4.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f93556a = simpleName;
    }

    private C43609jw4() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m29720b() {
        boolean z;
        if (TD0.m84203d(C43609jw4.class)) {
            return false;
        }
        try {
            if (f93557b == null) {
                Context context = C17216a.m52741e();
                C43609jw4 c43609jw4 = f93558c;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                if (c43609jw4.m29721a(context) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f93557b = Boolean.valueOf(z);
            }
            Boolean bool = f93557b;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            TD0.m84205b(th, C43609jw4.class);
            return false;
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final EnumC25047c m29719c(String applicationId, List<C7508Si> appEvents) {
        if (TD0.m84203d(C43609jw4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f93558c.m29718d(EnumC25045a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            TD0.m84205b(th, C43609jw4.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final EnumC25047c m29717e(String applicationId) {
        List<C7508Si> emptyList;
        if (TD0.m84203d(C43609jw4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            C43609jw4 c43609jw4 = f93558c;
            EnumC25045a enumC25045a = EnumC25045a.MOBILE_APP_INSTALL;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return c43609jw4.m29718d(enumC25045a, applicationId, emptyList);
        } catch (Throwable th) {
            TD0.m84205b(th, C43609jw4.class);
            return null;
        }
    }

    /* renamed from: a */
    public final Intent m29721a(Context context) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C47034pj1.m18895a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C47034pj1.m18895a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final EnumC25047c m29718d(EnumC25045a enumC25045a, String str, List<C7508Si> list) {
        EnumC25047c enumC25047c;
        String str2;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            EnumC25047c enumC25047c2 = EnumC25047c.SERVICE_NOT_AVAILABLE;
            C9155Wi.m77978b();
            Context context = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Intent m29721a = m29721a(context);
            if (m29721a != null) {
                ServiceConnectionC25046b serviceConnectionC25046b = new ServiceConnectionC25046b();
                if (context.bindService(m29721a, serviceConnectionC25046b, 1)) {
                    try {
                        IBinder m29716a = serviceConnectionC25046b.m29716a();
                        if (m29716a != null) {
                            InterfaceC39119cP1 m61431c5 = InterfaceC39119cP1.AbstractBinderC13540a.m61431c5(m29716a);
                            Bundle m31594a = C43016iw4.m31594a(enumC25045a, str, list);
                            if (m31594a != null) {
                                m61431c5.mo61429g2(m31594a);
                                String str3 = f93556a;
                                C52364yi6.m2853Y(str3, "Successfully sent events to the remote service: " + m31594a);
                            }
                            enumC25047c2 = EnumC25047c.OPERATION_SUCCESS;
                        }
                        context.unbindService(serviceConnectionC25046b);
                        C52364yi6.m2853Y(f93556a, "Unbound from the remote service");
                        return enumC25047c2;
                    } catch (RemoteException e) {
                        enumC25047c = EnumC25047c.SERVICE_ERROR;
                        str2 = f93556a;
                        C52364yi6.m2854X(str2, e);
                        context.unbindService(serviceConnectionC25046b);
                        C52364yi6.m2853Y(str2, "Unbound from the remote service");
                        return enumC25047c;
                    } catch (InterruptedException e2) {
                        enumC25047c = EnumC25047c.SERVICE_ERROR;
                        str2 = f93556a;
                        C52364yi6.m2854X(str2, e2);
                        context.unbindService(serviceConnectionC25046b);
                        C52364yi6.m2853Y(str2, "Unbound from the remote service");
                        return enumC25047c;
                    }
                }
                return EnumC25047c.SERVICE_ERROR;
            }
            return enumC25047c2;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }
}
