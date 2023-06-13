package p000;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import java.lang.reflect.Field;
import p000.WO1;
@RetainForClient
@KeepForSdk
/* renamed from: Vd3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC36557Vd3<T> extends WO1.AbstractBinderC9015a {

    /* renamed from: a */
    public final Object f39358a;

    public BinderC36557Vd3(Object obj) {
        this.f39358a = obj;
    }

    @KeepForSdk
    /* renamed from: d5 */
    public static <T> T m79637d5(WO1 wo1) {
        if (wo1 instanceof BinderC36557Vd3) {
            return (T) ((BinderC36557Vd3) wo1).f39358a;
        }
        IBinder asBinder = wo1.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Preconditions.checkNotNull(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }

    @KeepForSdk
    /* renamed from: e5 */
    public static <T> WO1 m79636e5(T t) {
        return new BinderC36557Vd3(t);
    }
}
