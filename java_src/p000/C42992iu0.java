package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Liu0;", "LPv4;", "", "onRemembered", "onForgotten", "onAbandoned", "LZC0;", "b", "LZC0;", C17296a.f69688o, "()LZC0;", "coroutineScope", "<init>", "(LZC0;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: iu0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42992iu0 implements InterfaceC35316Pv4 {

    /* renamed from: b */
    public final ZC0 f91664b;

    public C42992iu0(ZC0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f91664b = coroutineScope;
    }

    /* renamed from: a */
    public final ZC0 m31665a() {
        return this.f91664b;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        C37824aD0.m71787d(this.f91664b, null, 1, null);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        C37824aD0.m71787d(this.f91664b, null, 1, null);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
    }
}
