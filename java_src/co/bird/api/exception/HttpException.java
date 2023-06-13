package co.bird.api.exception;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/exception/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LHM4;", "b", "LHM4;", "getResponse", "()LHM4;", "response", "Ltg1;", "c", "Ltg1;", "errorResponse", "", "getMessage", "()Ljava/lang/String;", "message", "", C17296a.f69688o, "()I", PaymentMethodOptionsParams.Blik.PARAM_CODE, "<init>", "(LHM4;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: b */
    public final HM4<?> f68192b;

    /* renamed from: c */
    public final C49375tg1 f68193c;

    public HttpException(HM4<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f68192b = response;
        this.f68193c = NM4.m94017d(response);
    }

    /* renamed from: a */
    public final int m53921a() {
        C49375tg1 c49375tg1 = this.f68193c;
        return c49375tg1 != null ? c49375tg1.m11933b() : this.f68192b.m103943b();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        C49375tg1 c49375tg1 = this.f68193c;
        if (c49375tg1 != null) {
            return c49375tg1.m11932c();
        }
        return null;
    }
}
