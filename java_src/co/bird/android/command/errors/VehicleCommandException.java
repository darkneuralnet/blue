package co.bird.android.command.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/command/errors/VehicleCommandException;", "", "e", "(Ljava/lang/Throwable;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class VehicleCommandException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleCommandException(Throwable e) {
        super(e);
        Intrinsics.checkNotNullParameter(e, "e");
    }
}
