package p000;

import android.app.ActivityManager;
import android.content.Context;
/* renamed from: fB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40789fB1 {

    /* renamed from: e */
    public static final C10776ad f79640e = C10776ad.m71007e();

    /* renamed from: a */
    public final Runtime f79641a;

    /* renamed from: b */
    public final ActivityManager f79642b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f79643c;

    /* renamed from: d */
    public final Context f79644d;

    public C40789fB1(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int m41756a() {
        return C35435Qi6.m88156c(EnumC42123hR5.f85238g.m36396a(this.f79643c.totalMem));
    }

    /* renamed from: b */
    public int m41755b() {
        return C35435Qi6.m88156c(EnumC42123hR5.f85238g.m36396a(this.f79641a.maxMemory()));
    }

    /* renamed from: c */
    public int m41754c() {
        return C35435Qi6.m88156c(EnumC42123hR5.f85236e.m36396a(this.f79642b.getMemoryClass()));
    }

    public C40789fB1(Runtime runtime, Context context) {
        this.f79641a = runtime;
        this.f79644d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f79642b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f79643c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
