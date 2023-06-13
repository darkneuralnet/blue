package co.bird.android.coreinterface.manager;

import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/RideRequirementTimeoutException;", "Ljava/util/concurrent/TimeoutException;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RideRequirementTimeoutException extends TimeoutException {

    /* renamed from: b */
    public final String f63140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideRequirementTimeoutException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f63140b = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f63140b;
    }
}
