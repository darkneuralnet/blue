package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lbo/app/x5;", "", "", "cpuAvailableCount", "I", "b", "()I", "getCpuAvailableCount$annotations", "()V", "corePoolSize", C17296a.f69688o, "getCorePoolSize$annotations", "maximumPoolSize", DateTokenConverter.CONVERTER_KEY, "getMaximumPoolSize$annotations", "", "keepAliveSeconds", "J", "c", "()J", "getKeepAliveSeconds$annotations", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "e", "()Ljava/util/concurrent/BlockingQueue;", "getWorkQueue$annotations", "workQueue", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.x5 */
/* loaded from: classes.dex */
public final class C13204x5 {

    /* renamed from: a */
    public static final C13204x5 f59411a = new C13204x5();

    /* renamed from: b */
    private static final int f59412b;

    /* renamed from: c */
    private static final int f59413c;

    /* renamed from: d */
    private static final int f59414d;

    /* renamed from: e */
    private static final long f59415e;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f59412b = availableProcessors;
        f59413c = 2;
        f59414d = Math.max(2, availableProcessors - 1);
        f59415e = 1L;
    }

    private C13204x5() {
    }

    /* renamed from: a */
    public static final int m62822a() {
        return f59413c;
    }

    /* renamed from: b */
    public static final int m62821b() {
        return f59412b;
    }

    /* renamed from: c */
    public static final long m62820c() {
        return f59415e;
    }

    /* renamed from: d */
    public static final int m62819d() {
        return f59414d;
    }

    /* renamed from: e */
    public static final BlockingQueue<Runnable> m62818e() {
        return new LinkedBlockingQueue(64);
    }
}
