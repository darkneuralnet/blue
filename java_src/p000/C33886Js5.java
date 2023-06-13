package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJs5;", "", "", C17296a.f69688o, "()J", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Js5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C33886Js5 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f18389a = AtomicLongFieldUpdater.newUpdater(C33886Js5.class, "number");
    private volatile /* synthetic */ long number = 1;

    /* renamed from: a */
    public final long m99612a() {
        return f18389a.incrementAndGet(this);
    }
}
