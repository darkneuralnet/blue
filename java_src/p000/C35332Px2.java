package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
/* renamed from: Px2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35332Px2 {

    /* renamed from: a */
    public final C40500ei0 f29459a;

    public C35332Px2(C40500ei0 c40500ei0) {
        this.f29459a = c40500ei0;
    }

    /* renamed from: a */
    public static void m89256a(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append("* ");
        sb.append(m89248i(bluetoothGattCharacteristic));
        sb.append(" (");
        sb.append(C35098Ox2.m91169g(bluetoothGattCharacteristic.getUuid()));
        sb.append(")");
    }

    /* renamed from: c */
    public static void m89254c(StringBuilder sb, BluetoothGattDescriptor bluetoothGattDescriptor) {
        sb.append('\n');
        sb.append('\t');
        sb.append('\t');
        sb.append("* ");
        sb.append(m89247j(bluetoothGattDescriptor));
        sb.append(" (");
        sb.append(C35098Ox2.m91169g(bluetoothGattDescriptor.getUuid()));
        sb.append(")");
    }

    /* renamed from: d */
    public static void m89253d(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (!bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            m89252e(sb);
            for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                m89254c(sb, bluetoothGattDescriptor);
            }
        }
    }

    /* renamed from: e */
    public static void m89252e(StringBuilder sb) {
        sb.append('\n');
        sb.append('\t');
        sb.append("  ");
        sb.append("-> Descriptors: ");
    }

    /* renamed from: f */
    public static void m89251f(BluetoothDevice bluetoothDevice, StringBuilder sb) {
        sb.append("--------------- ====== Printing peripheral content ====== ---------------\n");
        sb.append(C35098Ox2.m91172d(bluetoothDevice.getAddress()));
        sb.append('\n');
        sb.append("PERIPHERAL NAME: ");
        sb.append(bluetoothDevice.getName());
        sb.append('\n');
        sb.append("-------------------------------------------------------------------------");
    }

    /* renamed from: h */
    public static void m89249h(StringBuilder sb, BluetoothGattService bluetoothGattService) {
        sb.append("\n");
        sb.append(m89245l(bluetoothGattService));
        sb.append(" - ");
        sb.append(m89246k(bluetoothGattService));
        sb.append(" (");
        sb.append(C35098Ox2.m91169g(bluetoothGattService.getUuid()));
        sb.append(")\n");
        sb.append("Instance ID: ");
        sb.append(bluetoothGattService.getInstanceId());
        sb.append('\n');
    }

    /* renamed from: i */
    public static String m89248i(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String m8755a = C50396vO5.m8755a(bluetoothGattCharacteristic.getUuid());
        return m8755a == null ? "Unknown characteristic" : m8755a;
    }

    /* renamed from: j */
    public static String m89247j(BluetoothGattDescriptor bluetoothGattDescriptor) {
        String m8754b = C50396vO5.m8754b(bluetoothGattDescriptor.getUuid());
        return m8754b == null ? "Unknown descriptor" : m8754b;
    }

    /* renamed from: k */
    public static String m89246k(BluetoothGattService bluetoothGattService) {
        String m8753c = C50396vO5.m8753c(bluetoothGattService.getUuid());
        return m8753c == null ? "Unknown service" : m8753c;
    }

    /* renamed from: l */
    public static String m89245l(BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getType() == 0 ? "Primary Service" : "Secondary Service";
    }

    /* renamed from: b */
    public final void m89255b(StringBuilder sb, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append("  ");
        sb.append("Properties: ");
        sb.append(this.f29459a.m42613c(bluetoothGattCharacteristic.getProperties()));
    }

    /* renamed from: g */
    public final void m89250g(StringBuilder sb, BluetoothGattService bluetoothGattService) {
        m89249h(sb, bluetoothGattService);
        sb.append("-> Characteristics:");
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            m89256a(sb, bluetoothGattCharacteristic);
            m89255b(sb, bluetoothGattCharacteristic);
            m89253d(sb, bluetoothGattCharacteristic);
        }
    }

    /* renamed from: m */
    public void m89244m(C49952ue5 c49952ue5, BluetoothDevice bluetoothDevice) {
        if (C52323ye5.m3117l(2)) {
            C52323ye5.m3112q("Preparing services description", new Object[0]);
            C52323ye5.m3112q(m89243n(c49952ue5, bluetoothDevice), new Object[0]);
        }
    }

    /* renamed from: n */
    public final String m89243n(C49952ue5 c49952ue5, BluetoothDevice bluetoothDevice) {
        StringBuilder sb = new StringBuilder();
        m89251f(bluetoothDevice, sb);
        for (BluetoothGattService bluetoothGattService : c49952ue5.m9923a()) {
            sb.append('\n');
            m89250g(sb, bluetoothGattService);
        }
        sb.append("\n--------------- ====== Finished peripheral content ====== ---------------");
        return sb.toString();
    }
}
