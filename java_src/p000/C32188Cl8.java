package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
/* renamed from: Cl8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32188Cl8 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f4635a;

    /* renamed from: b */
    public final /* synthetic */ C39965dn8 f4636b;

    public C32188Cl8(C39965dn8 c39965dn8, String str) {
        this.f4636b = c39965dn8;
        Preconditions.checkNotNull(str);
        this.f4635a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f4636b.f100966a.mo22258a().m106893o().m42707b(this.f4635a, th);
    }
}
