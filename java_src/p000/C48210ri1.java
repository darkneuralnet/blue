package p000;

import co.bird.api.request.ExperimentStartedBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23461c;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lri1;", "Lqi1;", "", "name", "Lio/reactivex/c;", C17296a.f69688o, "Lpi1;", "Lpi1;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Lpi1;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ri1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48210ri1 implements InterfaceC47617qi1 {

    /* renamed from: a */
    public final InterfaceC47024pi1 f107508a;

    public C48210ri1(InterfaceC47024pi1 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f107508a = client;
    }

    @Override // p000.InterfaceC47617qi1
    /* renamed from: a */
    public AbstractC23461c mo15556a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AbstractC23461c m33070P = this.f107508a.m18931a(new ExperimentStartedBody(name)).m33159G().m33063X(C24542a.m31932c()).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "client\n    .markStarted(…dSchedulers.mainThread())");
        return m33070P;
    }
}
