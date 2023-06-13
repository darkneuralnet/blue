package co.bird.android.app.feature.ride.presenter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/ride/presenter/PaymentIntentException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "b", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PaymentIntentException extends RuntimeException {

    /* renamed from: b */
    public final String f62684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentException(String error) {
        super(error);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f62684b = error;
    }
}
