package co.bird.android.model.exception;

import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.exception.BluetoothExceptionKt;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28432d2 = {"onBluetoothErrorResume", "Lio/reactivex/Observable;", "T", "reason", "Lco/bird/android/model/exception/BluetoothException$Reason;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BluetoothExceptionKt {
    public static final <T> Observable<T> onBluetoothErrorResume(Observable<T> observable, BluetoothException.Reason reason) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(reason, "reason");
        final BluetoothExceptionKt$onBluetoothErrorResume$1 bluetoothExceptionKt$onBluetoothErrorResume$1 = new BluetoothExceptionKt$onBluetoothErrorResume$1(reason);
        Observable<T> onErrorResumeNext = observable.onErrorResumeNext(new InterfaceC23492o() { // from class: iX
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B onBluetoothErrorResume$lambda$0;
                onBluetoothErrorResume$lambda$0 = BluetoothExceptionKt.onBluetoothErrorResume$lambda$0(Function1.this, obj);
                return onBluetoothErrorResume$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "reason: BluetoothExcepti…ion(t, reason))\n    }\n  }");
        return onErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23434B onBluetoothErrorResume$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }
}
