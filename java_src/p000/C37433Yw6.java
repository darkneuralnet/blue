package p000;

import android.content.Context;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0006\u0010\b\u001a\u00020\u0007\"\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "", C17296a.f69688o, "Ljava/lang/String;", "TAG", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "WakeLocks")
/* renamed from: Yw6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37433Yw6 {

    /* renamed from: a */
    public static final String f47651a;

    static {
        String m113270i = AbstractC32056Bx2.m113270i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"WakeLocks\")");
        f47651a = m113270i;
    }

    /* renamed from: a */
    public static final void m73958a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C37667Zw6 c37667Zw6 = C37667Zw6.f49503a;
        synchronized (c37667Zw6) {
            linkedHashMap.putAll(c37667Zw6.m72288a());
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z = false;
            if (wakeLock != null && wakeLock.isHeld()) {
                z = true;
            }
            if (z) {
                AbstractC32056Bx2.m113272e().mo113262k(f47651a, "WakeLock held for " + str);
            }
        }
    }

    /* renamed from: b */
    public static final PowerManager.WakeLock m73957b(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        C37667Zw6 c37667Zw6 = C37667Zw6.f49503a;
        synchronized (c37667Zw6) {
            c37667Zw6.m72288a().put(wakeLock, str);
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
