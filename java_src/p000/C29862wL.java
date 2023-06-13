package p000;

import co.bird.android.model.wire.WireBirdEvent;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC29169uL;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LwL;", "LuL;", "Lco/bird/android/model/wire/WireBirdEvent;", "event", "", C17296a.f69688o, "Lma4;", "Lma4;", "_eventStream", "Lio/reactivex/Observable;", "b", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "eventStream", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wL */
/* loaded from: classes2.dex */
public final class C29862wL implements InterfaceC29169uL {

    /* renamed from: a */
    public final C45168ma4<WireBirdEvent> f115844a;

    /* renamed from: b */
    public final Observable<WireBirdEvent> f115845b;

    public C29862wL() {
        C45168ma4<WireBirdEvent> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f115844a = m25409g;
        this.f115845b = m25409g;
    }

    /* renamed from: e */
    public static final void m6978e(WireBirdEvent event, C29862wL this$0) {
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40157g("Received event: " + event, new Object[0]);
        this$0.f115844a.accept(event);
    }

    @Override // p000.InterfaceC29169uL
    /* renamed from: a */
    public void mo6982a(final WireBirdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C24542a.m31931d().mo32324d(new Runnable() { // from class: vL
            @Override // java.lang.Runnable
            public final void run() {
                C29862wL.m6978e(WireBirdEvent.this, this);
            }
        });
    }

    @Override // p000.InterfaceC29169uL
    /* renamed from: b */
    public Observable<WireBirdEvent> mo6981b() {
        return this.f115845b;
    }

    @Override // p000.InterfaceC29169uL
    /* renamed from: c */
    public Observable<WireBirdEvent> mo6980c() {
        return InterfaceC29169uL.C29170a.m10423c(this);
    }
}
