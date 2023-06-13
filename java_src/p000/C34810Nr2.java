package p000;

import android.bluetooth.BluetoothDevice;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LNr2;", "T", "LG21;", "", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", MessageExtension.FIELD_DATA, "Landroid/bluetooth/BluetoothDevice;", "device", "<init>", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Object;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34810Nr2<T> extends G21 {

    /* renamed from: b */
    public final T f25299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34810Nr2(BluetoothDevice device, T t) {
        super(device, null);
        Intrinsics.checkNotNullParameter(device, "device");
        this.f25299b = t;
    }
}
