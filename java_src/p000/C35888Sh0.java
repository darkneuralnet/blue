package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.PublishedApi;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lks4;", "", "cause", "", C17296a.f69688o, "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: Sh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C35888Sh0 {
    @PublishedApi
    /* renamed from: a */
    public static final void m85124a(InterfaceC44162ks4<?> interfaceC44162ks4, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C42270hh1.m36097a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC44162ks4.mo552f(cancellationException);
    }
}
