package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007\"\u001a\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0007\"\u001a\u0010\u0016\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0007\"\u001a\u0010\u0019\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, m28432d2 = {"", "locked", "LSX2;", C17296a.f69688o, "LuX5;", "LuX5;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", DateTokenConverter.CONVERTER_KEY, "getUNLOCKED$annotations", "UNLOCKED", "LLa1;", "e", "LLa1;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: UX2 */
/* loaded from: classes8.dex */
public final class UX2 {

    /* renamed from: a */
    public static final C49885uX5 f37510a = new C49885uX5("LOCK_FAIL");

    /* renamed from: b */
    public static final C49885uX5 f37511b = new C49885uX5("UNLOCK_FAIL");

    /* renamed from: c */
    public static final C49885uX5 f37512c;

    /* renamed from: d */
    public static final C49885uX5 f37513d;

    /* renamed from: e */
    public static final C34188La1 f37514e;

    /* renamed from: f */
    public static final C34188La1 f37515f;

    static {
        C49885uX5 c49885uX5 = new C49885uX5("LOCKED");
        f37512c = c49885uX5;
        C49885uX5 c49885uX52 = new C49885uX5("UNLOCKED");
        f37513d = c49885uX52;
        f37514e = new C34188La1(c49885uX5);
        f37515f = new C34188La1(c49885uX52);
    }

    /* renamed from: a */
    public static final SX2 m81381a(boolean z) {
        return new TX2(z);
    }

    /* renamed from: b */
    public static /* synthetic */ SX2 m81380b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m81381a(z);
    }
}
