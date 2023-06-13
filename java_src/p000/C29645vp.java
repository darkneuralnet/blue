package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0003\u0007\u000bB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001d"}, m28432d2 = {"Lvp;", "", "", C17296a.f69688o, "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "l", "()Ljava/lang/String;", "attributionId", DateTokenConverter.CONVERTER_KEY, "k", "androidInstallerPackage", "", "e", "Z", "n", "()Z", "isTrackingLimited", "j", "androidAdvertiserId", "<init>", "()V", "h", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: vp */
/* loaded from: classes5.dex */
public final class C29645vp {

    /* renamed from: g */
    public static C29645vp f114725g;

    /* renamed from: a */
    public String f114727a;

    /* renamed from: b */
    public long f114728b;

    /* renamed from: c */
    public String f114729c;

    /* renamed from: d */
    public String f114730d;

    /* renamed from: e */
    public boolean f114731e;

    /* renamed from: h */
    public static final C29646a f114726h = new C29646a(null);

    /* renamed from: f */
    public static final String f114724f = C29645vp.class.getCanonicalName();

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R.\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006&"}, m28432d2 = {"Lvp$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "i", "Lvp;", "e", "b", "c", "h", DateTokenConverter.CONVERTER_KEY, "identifiers", C17296a.f69688o, "", "g", "<set-?>", "cachedIdentifiers", "Lvp;", "f", "()Lvp;", "j", "(Lvp;)V", "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vp$a */
    /* loaded from: classes5.dex */
    public static final class C29646a {
        private C29646a() {
        }

        /* renamed from: a */
        public final C29645vp m7988a(C29645vp c29645vp) {
            c29645vp.f114728b = System.currentTimeMillis();
            m7979j(c29645vp);
            return c29645vp;
        }

        /* renamed from: b */
        public final C29645vp m7987b(Context context) {
            C29645vp m7986c = m7986c(context);
            if (m7986c == null) {
                C29645vp m7985d = m7985d(context);
                if (m7985d == null) {
                    return new C29645vp();
                }
                return m7985d;
            }
            return m7986c;
        }

        /* renamed from: c */
        public final C29645vp m7986c(Context context) {
            Object m2868J;
            try {
                if (!m7981h(context)) {
                    return null;
                }
                boolean z = false;
                Method m2876B = C52364yi6.m2876B("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (m2876B != null && (m2868J = C52364yi6.m2868J(null, m2876B, context)) != null) {
                    Method m2877A = C52364yi6.m2877A(m2868J.getClass(), "getId", new Class[0]);
                    Method m2877A2 = C52364yi6.m2877A(m2868J.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (m2877A != null && m2877A2 != null) {
                        C29645vp c29645vp = new C29645vp();
                        c29645vp.f114727a = (String) C52364yi6.m2868J(m2868J, m2877A, new Object[0]);
                        Boolean bool = (Boolean) C52364yi6.m2868J(m2868J, m2877A2, new Object[0]);
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        c29645vp.f114731e = z;
                        return c29645vp;
                    }
                }
                return null;
            } catch (Exception e) {
                C52364yi6.m2854X("android_id", e);
                return null;
            }
        }

        /* renamed from: d */
        public final C29645vp m7985d(Context context) {
            ServiceConnectionC29649c serviceConnectionC29649c = new ServiceConnectionC29649c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, serviceConnectionC29649c, 1)) {
                try {
                    C29647b c29647b = new C29647b(serviceConnectionC29649c.m7976a());
                    C29645vp c29645vp = new C29645vp();
                    c29645vp.f114727a = c29647b.m7978c5();
                    c29645vp.f114731e = c29647b.m7977d5();
                    return c29645vp;
                } catch (Exception e) {
                    C52364yi6.m2854X("android_id", e);
                    return null;
                } finally {
                    context.unbindService(serviceConnectionC29649c);
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x00f2, Exception -> 0x00f4, TryCatch #5 {Exception -> 0x00f4, all -> 0x00f2, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0024, B:10:0x0035, B:12:0x0050, B:14:0x005d, B:21:0x007c, B:23:0x0082, B:25:0x0087, B:27:0x008c, B:17:0x0067, B:19:0x0074, B:48:0x00ea, B:49:0x00f1), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[Catch: all -> 0x00f2, Exception -> 0x00f4, TryCatch #5 {Exception -> 0x00f4, all -> 0x00f2, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0024, B:10:0x0035, B:12:0x0050, B:14:0x005d, B:21:0x007c, B:23:0x0082, B:25:0x0087, B:27:0x008c, B:17:0x0067, B:19:0x0074, B:48:0x00ea, B:49:0x00f1), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x00f2, Exception -> 0x00f4, TRY_LEAVE, TryCatch #5 {Exception -> 0x00f4, all -> 0x00f2, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0024, B:10:0x0035, B:12:0x0050, B:14:0x005d, B:21:0x007c, B:23:0x0082, B:25:0x0087, B:27:0x008c, B:17:0x0067, B:19:0x0074, B:48:0x00ea, B:49:0x00f1), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
        @JvmStatic
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C29645vp m7984e(Context context) {
            Cursor cursor;
            Uri uri;
            Uri parse;
            String m7982g;
            Intrinsics.checkNotNullParameter(context, "context");
            C29645vp m7987b = m7987b(context);
            Cursor cursor2 = null;
            try {
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    C29645vp m7983f = m7983f();
                    if (m7983f != null && System.currentTimeMillis() - m7983f.f114728b < CoreConstants.MILLIS_IN_ONE_HOUR) {
                        return m7983f;
                    }
                    String[] strArr = {"aid", "androidid", "limit_tracking"};
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                    ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                    if (resolveContentProvider != null) {
                        String str = resolveContentProvider.packageName;
                        Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                        if (C47034pj1.m18895a(context, str)) {
                            parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                            uri = parse;
                            m7982g = m7982g(context);
                            if (m7982g != null) {
                                m7987b.f114730d = m7982g;
                            }
                            if (uri == null) {
                                return m7988a(m7987b);
                            }
                            Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        int columnIndex = query.getColumnIndex("aid");
                                        int columnIndex2 = query.getColumnIndex("androidid");
                                        int columnIndex3 = query.getColumnIndex("limit_tracking");
                                        m7987b.f114729c = query.getString(columnIndex);
                                        if (columnIndex2 > 0 && columnIndex3 > 0 && m7987b.m7994j() == null) {
                                            m7987b.f114727a = query.getString(columnIndex2);
                                            m7987b.f114731e = Boolean.parseBoolean(query.getString(columnIndex3));
                                        }
                                        query.close();
                                        return m7988a(m7987b);
                                    }
                                } catch (Exception e) {
                                    cursor = query;
                                    e = e;
                                    try {
                                        C52364yi6.m2853Y(C29645vp.f114724f, "Caught unexpected exception in getAttributionId(): " + e);
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return null;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    cursor2 = query;
                                    th = th2;
                                    if (cursor2 != null) {
                                    }
                                    throw th;
                                }
                            }
                            C29645vp m7988a = m7988a(m7987b);
                            if (query != null) {
                                query.close();
                            }
                            return m7988a;
                        }
                    }
                    if (resolveContentProvider2 != null) {
                        String str2 = resolveContentProvider2.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                        if (C47034pj1.m18895a(context, str2)) {
                            parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = parse;
                            m7982g = m7982g(context);
                            if (m7982g != null) {
                            }
                            if (uri == null) {
                            }
                        }
                    }
                    uri = null;
                    m7982g = m7982g(context);
                    if (m7982g != null) {
                    }
                    if (uri == null) {
                    }
                } else {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: f */
        public final C29645vp m7983f() {
            return C29645vp.f114725g;
        }

        /* renamed from: g */
        public final String m7982g(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        /* renamed from: h */
        public final boolean m7981h(Context context) {
            Method m2876B = C52364yi6.m2876B("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (m2876B == null) {
                return false;
            }
            Object m2868J = C52364yi6.m2868J(null, m2876B, context);
            if ((m2868J instanceof Integer) && !(!Intrinsics.areEqual(m2868J, (Object) 0))) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: i */
        public final boolean m7980i(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C29645vp m7984e = m7984e(context);
            if (m7984e != null && m7984e.m7990n()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m7979j(C29645vp c29645vp) {
            C29645vp.f114725g = c29645vp;
        }

        public /* synthetic */ C29646a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lvp$b;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", C17296a.f69688o, "Landroid/os/IBinder;", "binder", "", "c5", "()Ljava/lang/String;", "advertiserId", "", "d5", "()Z", "isTrackingLimited", "<init>", "(Landroid/os/IBinder;)V", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vp$b */
    /* loaded from: classes5.dex */
    public static final class C29647b implements IInterface {

        /* renamed from: b */
        public static final C29648a f114732b = new C29648a(null);

        /* renamed from: a */
        public final IBinder f114733a;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lvp$b$a;", "", "", "FIRST_TRANSACTION_CODE", "I", "SECOND_TRANSACTION_CODE", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: vp$b$a */
        /* loaded from: classes5.dex */
        public static final class C29648a {
            private C29648a() {
            }

            public /* synthetic */ C29648a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C29647b(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f114733a = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f114733a;
        }

        /* renamed from: c5 */
        public final String m7978c5() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f114733a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: d5 */
        public final boolean m7977d5() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f114733a.transact(2, obtain, obtain2, 0);
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
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lvp$c;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "c", "Ljava/util/concurrent/BlockingQueue;", "queue", C17296a.f69688o, "()Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: vp$c */
    /* loaded from: classes5.dex */
    public static final class ServiceConnectionC29649c implements ServiceConnection {

        /* renamed from: b */
        public final AtomicBoolean f114734b = new AtomicBoolean(false);

        /* renamed from: c */
        public final BlockingQueue<IBinder> f114735c = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m7976a() throws InterruptedException {
            if (!this.f114734b.compareAndSet(true, true)) {
                IBinder take = this.f114735c.take();
                Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f114735c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final C29645vp m7991m(Context context) {
        return f114726h.m7984e(context);
    }

    @JvmStatic
    /* renamed from: o */
    public static final boolean m7989o(Context context) {
        return f114726h.m7980i(context);
    }

    /* renamed from: j */
    public final String m7994j() {
        if (C17216a.m52722x() && C17216a.m52742d()) {
            return this.f114727a;
        }
        return null;
    }

    /* renamed from: k */
    public final String m7993k() {
        return this.f114730d;
    }

    /* renamed from: l */
    public final String m7992l() {
        return this.f114729c;
    }

    /* renamed from: n */
    public final boolean m7990n() {
        return this.f114731e;
    }
}
