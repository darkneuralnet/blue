package p000;

import android.app.ActivityManager;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, m28432d2 = {"", C17296a.f69688o, "co.bird.android.api"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ti6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36137Ti6 {
    /* renamed from: a */
    public static final boolean m83132a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            if (i != 100 && i != 200) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C41318g46.m40158f(e, "Exception while checking app foregrounded state, ignoring and returning false", new Object[0]);
            return false;
        }
    }
}
