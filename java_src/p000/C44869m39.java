package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import p000.AbstractC50204v39;
import sun.misc.Unsafe;
/* renamed from: m39  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44869m39 extends AbstractC38922c39 {

    /* renamed from: a */
    public static final Unsafe f97252a;

    /* renamed from: b */
    public static final long f97253b;

    /* renamed from: c */
    public static final long f97254c;

    /* renamed from: d */
    public static final long f97255d;

    /* renamed from: e */
    public static final long f97256e;

    /* renamed from: f */
    public static final long f97257f;

    /* renamed from: m39$a */
    /* loaded from: classes6.dex */
    public class C25901a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static final Unsafe m26401a() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return m26401a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C25901a());
        }
        try {
            f97254c = unsafe.objectFieldOffset(AbstractC50204v39.class.getDeclaredField(DateTokenConverter.CONVERTER_KEY));
            f97253b = unsafe.objectFieldOffset(AbstractC50204v39.class.getDeclaredField("c"));
            f97255d = unsafe.objectFieldOffset(AbstractC50204v39.class.getDeclaredField("b"));
            f97256e = unsafe.objectFieldOffset(C45462n39.class.getDeclaredField(C17296a.f69688o));
            f97257f = unsafe.objectFieldOffset(C45462n39.class.getDeclaredField("b"));
            f97252a = unsafe;
        } catch (Exception e2) {
            CM8.m112290a(e2);
            throw new RuntimeException(e2);
        }
    }

    public /* synthetic */ C44869m39(AbstractC50204v39.C29405a c29405a) {
        super(null);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: a */
    public final void mo26406a(C45462n39 c45462n39, C45462n39 c45462n392) {
        f97252a.putObject(c45462n39, f97257f, c45462n392);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: b */
    public final void mo26405b(C45462n39 c45462n39, Thread thread) {
        f97252a.putObject(c45462n39, f97256e, thread);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: c */
    public final boolean mo26404c(AbstractC50204v39<?> abstractC50204v39, C40718f39 c40718f39, C40718f39 c40718f392) {
        return C44276l39.m27979a(f97252a, abstractC50204v39, f97253b, c40718f39, c40718f392);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: d */
    public final boolean mo26403d(AbstractC50204v39<?> abstractC50204v39, Object obj, Object obj2) {
        return C44276l39.m27979a(f97252a, abstractC50204v39, f97255d, obj, obj2);
    }

    @Override // p000.AbstractC38922c39
    /* renamed from: e */
    public final boolean mo26402e(AbstractC50204v39<?> abstractC50204v39, C45462n39 c45462n39, C45462n39 c45462n392) {
        return C44276l39.m27979a(f97252a, abstractC50204v39, f97254c, c45462n39, c45462n392);
    }

    private C44869m39() {
        super(null);
    }
}
