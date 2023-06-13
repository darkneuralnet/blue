package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a\u001a\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002\"\u001a\u0010\r\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000b\u0010\f\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\f\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u0012\u0004\b\u0014\u0010\f\"\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0017\u0010\f\"\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u0012\u0004\b\u001a\u0010\f\"\u001a\u0010\u001e\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u001d\u0010\f¨\u0006\u001f"}, m28432d2 = {"", "permits", "acquiredPermits", "Lts5;", C17296a.f69688o, "", "id", "Lws5;", "prev", "j", "I", "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "LuX5;", "b", "LuX5;", "getPERMIT$annotations", "PERMIT", "c", "getTAKEN$annotations", "TAKEN", DateTokenConverter.CONVERTER_KEY, "getBROKEN$annotations", "BROKEN", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: vs5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50684vs5 {

    /* renamed from: a */
    public static final int f114829a;

    /* renamed from: b */
    public static final C49885uX5 f114830b;

    /* renamed from: c */
    public static final C49885uX5 f114831c;

    /* renamed from: d */
    public static final C49885uX5 f114832d;

    /* renamed from: e */
    public static final C49885uX5 f114833e;

    /* renamed from: f */
    public static final int f114834f;

    static {
        int m28846d;
        int m28846d2;
        m28846d = C43965kY5.m28846d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f114829a = m28846d;
        f114830b = new C49885uX5("PERMIT");
        f114831c = new C49885uX5("TAKEN");
        f114832d = new C49885uX5("BROKEN");
        f114833e = new C49885uX5("CANCELLED");
        m28846d2 = C43965kY5.m28846d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f114834f = m28846d2;
    }

    /* renamed from: a */
    public static final InterfaceC49499ts5 m7888a(int i, int i2) {
        return new C50092us5(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC49499ts5 m7887b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7888a(i, i2);
    }

    /* renamed from: j */
    public static final C51277ws5 m7879j(long j, C51277ws5 c51277ws5) {
        return new C51277ws5(j, c51277ws5, 0);
    }
}
