package co.bird.android.model.exception;

import co.bird.android.model.exception.BluetoothException;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "t", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BluetoothExceptionKt$onBluetoothErrorResume$1 extends Lambda implements Function1<Throwable, InterfaceC23434B<? extends T>> {
    final /* synthetic */ BluetoothException.Reason $reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothExceptionKt$onBluetoothErrorResume$1(BluetoothException.Reason reason) {
        super(1);
        this.$reason = reason;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23434B<? extends T> invoke(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (t instanceof BluetoothException) {
            return Observable.error(t);
        }
        return Observable.error(new BluetoothException(t, this.$reason));
    }
}
