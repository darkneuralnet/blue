package co.bird.android.smartlock.impl;

import android.bluetooth.BluetoothDevice;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.callback.profile.ProfileReadResponse;
import no.nordicsemi.android.ble.data.Data;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/smartlock/impl/SmartlockNokeDataCallback;", "Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;", "LBJ5;", "Landroid/bluetooth/BluetoothDevice;", "device", "Lno/nordicsemi/android/ble/data/Data;", MessageExtension.FIELD_DATA, "", "b", "<init>", "()V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class SmartlockNokeDataCallback extends ProfileReadResponse implements BJ5 {
    @Override // no.nordicsemi.android.ble.response.ReadResponse, p000.QS0
    /* renamed from: b */
    public void mo3746b(BluetoothDevice device, Data data) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo3746b(device, data);
        if (data.m22620d() > 0) {
            byte[] m22621c = data.m22621c();
            Intrinsics.checkNotNull(m22621c);
            mo54830a(device, m22621c);
            return;
        }
        m22626d(device, data);
    }
}
