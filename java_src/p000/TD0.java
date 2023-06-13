package p000;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p000.C46068o52;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R8\u0010\u000f\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00010\u0001 \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LTD0;", "", "", C17296a.f69688o, "", "e", "o", "b", "", DateTokenConverter.CONVERTER_KEY, "c", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "crashingObjects", "Z", "enabled", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: TD0 */
/* loaded from: classes5.dex */
public final class TD0 {

    /* renamed from: b */
    public static boolean f34918b;

    /* renamed from: c */
    public static final TD0 f34919c = new TD0();

    /* renamed from: a */
    public static final Set<Object> f34917a = Collections.newSetFromMap(new WeakHashMap());

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u0004"}, m28432d2 = {"TD0$a", "Ljava/lang/Runnable;", "", "run", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: TD0$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC7682a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Throwable f34920b;

        public RunnableC7682a(Throwable th) {
            this.f34920b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                throw new RuntimeException(this.f34920b);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    private TD0() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m84206a() {
        f34918b = true;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m84205b(Throwable th, Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        if (!f34918b) {
            return;
        }
        f34917a.add(o);
        if (C17216a.m52736j()) {
            C37050Xg1.m76706b(th);
            C46068o52.C26813a.m21819b(th, C46068o52.EnumC26815c.CrashShield).m21821g();
        }
        m84202e(th);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m84204c() {
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m84203d(Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return f34917a.contains(o);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m84202e(Throwable th) {
        if (m84204c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC7682a(th));
        }
    }
}
