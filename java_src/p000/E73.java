package p000;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.error.RetrofitException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Deprecated(message = "You should handle errors inline rather than deferring to this class.")
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LE73;", "Lio/reactivex/functions/g;", "", "e", "", "b", "Lco/bird/api/error/RetrofitException;", "exception", "f", "Ltg1;", "error", "g", "", "message", "h", "retrofit", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/content/Context;Landroid/os/Handler;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E73 */
/* loaded from: classes2.dex */
public final class E73 implements InterfaceC23484g<Throwable> {

    /* renamed from: b */
    public final Context f6980b;

    /* renamed from: c */
    public final Handler f6981c;

    public E73(Context context, Handler handler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6980b = context;
        this.f6981c = handler;
    }

    /* renamed from: c */
    public static final void m109373c(Throwable e, E73 this$0) {
        Intrinsics.checkNotNullParameter(e, "$e");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40158f(e, "Exception in NetworkErrorRxHandler", new Object[0]);
        Throwable cause = e.getCause();
        if (cause != null) {
            boolean z = cause instanceof RetrofitException;
            if (z) {
                ((RetrofitException) cause).m53928b();
                RetrofitException.EnumC16708a enumC16708a = RetrofitException.EnumC16708a.NETWORK;
            }
            if (z) {
                RetrofitException retrofitException = (RetrofitException) cause;
                if (retrofitException.m53928b() == RetrofitException.EnumC16708a.HTTP) {
                    this$0.m109371e(retrofitException);
                    return;
                }
            }
            if (cause instanceof UndeliverableException) {
                C41318g46.m40159e(cause.getCause());
            }
        }
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    /* renamed from: b */
    public void accept(final Throwable e) throws Exception {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f6981c.post(new Runnable() { // from class: D73
            @Override // java.lang.Runnable
            public final void run() {
                E73.m109373c(e, this);
            }
        });
    }

    /* renamed from: d */
    public final C49375tg1 m109372d(RetrofitException retrofitException) {
        try {
            Object m53929a = retrofitException.m53929a(C49375tg1.class);
            Intrinsics.checkNotNullExpressionValue(m53929a, "{\n      retrofit.errorBo…sponse::class.java)\n    }");
            return (C49375tg1) m53929a;
        } catch (Exception unused) {
            String string = this.f6980b.getString(C45871nl4.error_network);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.error_network)");
            return new C49375tg1(500, string, null, null, 12, null);
        }
    }

    /* renamed from: e */
    public final void m109371e(RetrofitException retrofitException) {
        boolean z;
        try {
            C49375tg1 m109372d = m109372d(retrofitException);
            int m11933b = m109372d.m11933b();
            if (500 <= m11933b && m11933b < 511) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m109370f(retrofitException);
            } else {
                m109369g(m109372d);
            }
        } catch (Exception e) {
            C41318g46.m40158f(e, "exception caught in handleHttpError", new Object[0]);
        }
    }

    /* renamed from: f */
    public final void m109370f(RetrofitException retrofitException) {
        C41318g46.m40160d("Silent HTTP error: " + retrofitException, new Object[0]);
    }

    /* renamed from: g */
    public final void m109369g(C49375tg1 c49375tg1) {
        m109368h(c49375tg1.m11932c());
    }

    /* renamed from: h */
    public final void m109368h(String str) {
        C43107j56.m31138b(this.f6980b, str, 1).show();
    }
}
