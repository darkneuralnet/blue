package p000;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LGg1;", "LEg1;", "Lg70;", "event", "", "c", "", "subscriber", "", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Landroid/os/Handler;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler", "<init>", "()V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gg1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33072Gg1 implements InterfaceC32604Eg1 {

    /* renamed from: a */
    public final Handler f12233a = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public static final void m104912f(C31902Bg1 c31902Bg1, AbstractC41342g70 event) {
        Intrinsics.checkNotNullParameter(event, "$event");
        c31902Bg1.m113699l(event);
    }

    @Override // p000.InterfaceC32604Eg1
    /* renamed from: a */
    public void mo104917a(Object subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        C31902Bg1.m113708c().m113695p(subscriber);
    }

    @Override // p000.InterfaceC32604Eg1
    /* renamed from: b */
    public boolean mo104916b(Object subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return C31902Bg1.m113708c().m113701j(subscriber);
    }

    @Override // p000.InterfaceC32604Eg1
    /* renamed from: c */
    public void mo104915c(final AbstractC41342g70 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        final C31902Bg1 m113708c = C31902Bg1.m113708c();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            m113708c.m113699l(event);
        } else {
            this.f12233a.post(new Runnable() { // from class: Fg1
                @Override // java.lang.Runnable
                public final void run() {
                    C33072Gg1.m104912f(C31902Bg1.this, event);
                }
            });
        }
    }

    @Override // p000.InterfaceC32604Eg1
    /* renamed from: d */
    public void mo104914d(Object subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (mo104916b(subscriber)) {
            C31902Bg1.m113708c().m113693r(subscriber);
        }
    }
}
