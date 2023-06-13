package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LdY;", "LaY;", "Lkotlin/Function0;", "", "runnable", "", "delaySeconds", "c", "b", "Lio/reactivex/E;", C17296a.f69688o, "Lio/reactivex/E;", "()Lio/reactivex/E;", "main", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dY */
/* loaded from: classes4.dex */
public final class C19782dY implements InterfaceC10732aY {

    /* renamed from: a */
    public final AbstractC23437E f76757a;

    public C19782dY() {
        AbstractC23437E m31933b = C24542a.m31933b(new ThreadPoolExecutor(10, 10, 3L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC20463fY("ble-")));
        Intrinsics.checkNotNullExpressionValue(m31933b, "from(\n    ThreadPoolExec…Factory(\"ble-\")\n    )\n  )");
        this.f76757a = m31933b;
    }

    /* renamed from: f */
    public static final void m44182f(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* renamed from: g */
    public static final void m44181g(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // p000.InterfaceC10732aY
    /* renamed from: a */
    public AbstractC23437E mo44187a() {
        return this.f76757a;
    }

    @Override // p000.InterfaceC10732aY
    /* renamed from: b */
    public void mo44186b(final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        mo44187a().mo8041b().mo32320b(new Runnable() { // from class: bY
            @Override // java.lang.Runnable
            public final void run() {
                C19782dY.m44181g(Function0.this);
            }
        });
    }

    @Override // p000.InterfaceC10732aY
    /* renamed from: c */
    public void mo44185c(final Function0<Unit> runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        mo44187a().mo8041b().mo32319c(new Runnable() { // from class: cY
            @Override // java.lang.Runnable
            public final void run() {
                C19782dY.m44182f(Function0.this);
            }
        }, j, TimeUnit.SECONDS);
    }
}
