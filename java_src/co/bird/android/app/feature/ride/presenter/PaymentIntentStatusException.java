package co.bird.android.app.feature.ride.presenter;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PaymentIntentStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/ride/presenter/PaymentIntentStatusException;", "Ljava/lang/Exception;", "Lco/bird/android/model/PaymentIntentStatus;", "b", "Lco/bird/android/model/PaymentIntentStatus;", "()Lco/bird/android/model/PaymentIntentStatus;", "status", "", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Throwable;", C17296a.f69688o, "()Ljava/lang/Throwable;", "compositeThrowable", "<init>", "(Lco/bird/android/model/PaymentIntentStatus;Ljava/lang/String;Ljava/lang/Throwable;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PaymentIntentStatusException extends Exception {

    /* renamed from: b */
    public final PaymentIntentStatus f62685b;

    /* renamed from: c */
    public final String f62686c;

    /* renamed from: d */
    public final Throwable f62687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentStatusException(PaymentIntentStatus status, String str, Throwable th) {
        super(str);
        Intrinsics.checkNotNullParameter(status, "status");
        this.f62685b = status;
        this.f62686c = str;
        this.f62687d = th;
    }

    /* renamed from: a */
    public final Throwable m59465a() {
        return this.f62687d;
    }

    /* renamed from: b */
    public final PaymentIntentStatus m59464b() {
        return this.f62685b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f62686c;
    }

    public /* synthetic */ PaymentIntentStatusException(PaymentIntentStatus paymentIntentStatus, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentIntentStatus, str, (i & 4) != 0 ? null : th);
    }
}
