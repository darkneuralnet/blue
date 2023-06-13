package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p000.C38500bM2;
/* renamed from: EQ7 */
/* loaded from: classes6.dex */
public final class EQ7 {

    /* renamed from: a */
    public static final String f7446a = "EQ7";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    public static Context f7447b;

    /* renamed from: c */
    public static InterfaceC49955ue8 f7448c;

    /* renamed from: a */
    public static InterfaceC49955ue8 m109024a(Context context, C38500bM2.EnumC12375a enumC12375a) throws GooglePlayServicesNotAvailableException {
        InterfaceC49955ue8 c46084o68;
        Preconditions.checkNotNull(context);
        String str = f7446a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(enumC12375a)));
        InterfaceC49955ue8 interfaceC49955ue8 = f7448c;
        if (interfaceC49955ue8 == null) {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (isGooglePlayServicesAvailable == 0) {
                Log.i(str, "Making Creator dynamically");
                try {
                    IBinder iBinder = (IBinder) m109021d(((ClassLoader) Preconditions.checkNotNull(m109022c(context, enumC12375a).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        c46084o68 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (queryLocalInterface instanceof InterfaceC49955ue8) {
                            c46084o68 = (InterfaceC49955ue8) queryLocalInterface;
                        } else {
                            c46084o68 = new C46084o68(iBinder);
                        }
                    }
                    f7448c = c46084o68;
                    try {
                        Context m109022c = m109022c(context, enumC12375a);
                        m109022c.getClass();
                        c46084o68.mo9916O0(BinderC36557Vd3.m79636e5(m109022c.getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        return f7448c;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        return interfaceC49955ue8;
    }

    /* renamed from: b */
    public static Context m109023b(Exception exc, Context context) {
        Log.e(f7446a, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        android.util.Log.d(p000.EQ7.f7446a, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.m51591e(r2, com.google.android.gms.dynamite.DynamiteModule.f70338b, "com.google.android.gms.maps_dynamite").m51594b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2 = m109023b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = m109023b(r1, r2);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Context m109022c(Context context, C38500bM2.EnumC12375a enumC12375a) {
        String str;
        Context context2 = f7447b;
        if (context2 == null) {
            context.getApplicationContext();
            if (enumC12375a != null) {
                int ordinal = enumC12375a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str = "com.google.android.gms.maps_core_dynamite";
                    }
                } else {
                    str = "com.google.android.gms.maps_legacy_dynamite";
                }
                Context m109023b = DynamiteModule.m51591e(context, DynamiteModule.f70338b, str).m51594b();
                f7447b = m109023b;
                return m109023b;
            }
            str = "com.google.android.gms.maps_dynamite";
            Context m109023b2 = DynamiteModule.m51591e(context, DynamiteModule.f70338b, str).m51594b();
            f7447b = m109023b2;
            return m109023b2;
        }
        return context2;
    }

    /* renamed from: d */
    public static <T> T m109021d(Class cls) {
        String str;
        String str2;
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            if (name.length() != 0) {
                str2 = "Unable to call the default constructor of ".concat(name);
            } else {
                str2 = new String("Unable to call the default constructor of ");
            }
            throw new IllegalStateException(str2);
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            if (name2.length() != 0) {
                str = "Unable to instantiate the dynamic class ".concat(name2);
            } else {
                str = new String("Unable to instantiate the dynamic class ");
            }
            throw new IllegalStateException(str);
        }
    }
}
