package co.bird.android.smartlock.impl;

import android.bluetooth.BluetoothDevice;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;", "Lco/bird/android/smartlock/impl/SmartlockNokeDataCallback;", "Landroid/os/Parcelable;", "Landroid/bluetooth/BluetoothDevice;", "device", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "e", "[B", "()[B", "setUnparsedNotificationByteArray", "([B)V", "unparsedNotificationByteArray", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SmartlockNokeNotificationResponse extends SmartlockNokeDataCallback {

    /* renamed from: e */
    public byte[] f67072e;

    @Override // p000.BJ5
    /* renamed from: a */
    public void mo54830a(BluetoothDevice device, byte[] data) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f67072e = data;
    }

    /* renamed from: e */
    public final byte[] m54829e() {
        return this.f67072e;
    }
}
