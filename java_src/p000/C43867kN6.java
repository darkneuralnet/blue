package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.p038vr.dynamite.client.C18567d;
import com.google.p038vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;
/* renamed from: kN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43867kN6 {

    /* renamed from: a */
    public Context f94307a;

    /* renamed from: b */
    public ILoadedInstanceCreator f94308b;

    /* renamed from: c */
    public final JN6 f94309c;

    public C43867kN6(JN6 jn6) {
        this.f94309c = jn6;
    }

    /* renamed from: c */
    public static IBinder m29031c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e5);
        }
    }

    /* renamed from: a */
    public final synchronized Context m29033a(Context context) throws C18567d {
        if (this.f94307a == null) {
            try {
                this.f94307a = context.createPackageContext(this.f94309c.m100564a(), 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C18567d();
            }
        }
        return this.f94307a;
    }

    /* renamed from: b */
    public final synchronized ILoadedInstanceCreator m29032b(Context context) throws C18567d {
        ILoadedInstanceCreator ij6;
        if (this.f94308b == null) {
            IBinder m29031c = m29031c(m29033a(context).getClassLoader());
            if (m29031c == null) {
                ij6 = null;
            } else {
                IInterface queryLocalInterface = m29031c.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    ij6 = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    ij6 = new IJ6(m29031c);
                }
            }
            this.f94308b = ij6;
        }
        return this.f94308b;
    }
}
