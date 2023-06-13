package p000;

import android.bluetooth.BluetoothGattDescriptor;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.UUID;
/* renamed from: u70  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49643u70 {

    /* renamed from: u70$a */
    /* loaded from: classes6.dex */
    public class C29059a implements InterfaceC23494q<C49050t70<UUID>> {

        /* renamed from: b */
        public final /* synthetic */ UUID f111762b;

        public C29059a(UUID uuid) {
            this.f111762b = uuid;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(C49050t70<UUID> c49050t70) {
            return c49050t70.f109886a.equals(this.f111762b);
        }
    }

    /* renamed from: u70$b */
    /* loaded from: classes6.dex */
    public class C29060b implements InterfaceC23492o<C49050t70<?>, byte[]> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public byte[] apply(C49050t70<?> c49050t70) {
            return c49050t70.f109887b;
        }
    }

    /* renamed from: u70$c */
    /* loaded from: classes6.dex */
    public class C29061c implements InterfaceC23494q<C49050t70<BluetoothGattDescriptor>> {

        /* renamed from: b */
        public final /* synthetic */ BluetoothGattDescriptor f111763b;

        public C29061c(BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.f111763b = bluetoothGattDescriptor;
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(C49050t70<BluetoothGattDescriptor> c49050t70) {
            return c49050t70.f109886a.equals(this.f111763b);
        }
    }

    private C49643u70() {
    }

    /* renamed from: a */
    public static InterfaceC23494q<? super C49050t70<UUID>> m10852a(UUID uuid) {
        return new C29059a(uuid);
    }

    /* renamed from: b */
    public static InterfaceC23494q<? super C49050t70<BluetoothGattDescriptor>> m10851b(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new C29061c(bluetoothGattDescriptor);
    }

    /* renamed from: c */
    public static InterfaceC23492o<C49050t70<?>, byte[]> m10850c() {
        return new C29060b();
    }
}
