package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import co.bird.android.model.GattUuid;
import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.EnergyMode;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0000¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "Lco/bird/android/model/GattUuid;", "uuid", "", "bytes", "", "c", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "b", "", C17296a.f69688o, "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicle+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vehicle+.kt\nco/bird/android/manager/bluetooth/internal/Vehicle_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,128:1\n11345#2:129\n11680#2,3:130\n*S KotlinDebug\n*F\n+ 1 Vehicle+.kt\nco/bird/android/manager/bluetooth/internal/Vehicle_Kt\n*L\n23#1:129\n23#1:130,3\n*E\n"})
/* renamed from: Nn6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34778Nn6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nn6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C5696a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GattUuid.values().length];
            try {
                iArr[GattUuid.LOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GattUuid.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GattUuid.BATTERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GattUuid.ENERGY_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GattUuid.AUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GattUuid.IMEI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GattUuid.ICCID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GattUuid.STM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GattUuid.FAULT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(C)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nn6$b */
    /* loaded from: classes4.dex */
    public static final class C5697b extends Lambda implements Function1<Character, CharSequence> {

        /* renamed from: g */
        public static final C5697b f25197g = new C5697b();

        public C5697b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m93403a(char c) {
            return String.valueOf(c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Character ch2) {
            return m93403a(ch2.charValue());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* renamed from: a */
    public static final String m93406a(byte[] bArr) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m116854constructorimpl = UByteArray.m116854constructorimpl(copyOf);
        if (!UByteArray.m116862isEmptyimpl(m116854constructorimpl)) {
            byte m116859getw2LRezQ = UByteArray.m116859getw2LRezQ(m116854constructorimpl, 0);
            lastIndex = ArraysKt___ArraysKt.getLastIndex(m116854constructorimpl);
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int nextInt = it.nextInt();
                m116859getw2LRezQ = UByte.m116801constructorimpl((byte) (m116859getw2LRezQ | UByte.m116801constructorimpl((byte) ((UByteArray.m116859getw2LRezQ(m116854constructorimpl, nextInt) & UByte.MAX_VALUE) << (nextInt * 8)))));
            }
            return UByte.m116845toStringimpl(m116859getw2LRezQ);
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* renamed from: b */
    public static final synchronized boolean m93405b(Vehicle vehicle, BluetoothGattCharacteristic characteristic) {
        synchronized (C34778Nn6.class) {
            Intrinsics.checkNotNullParameter(vehicle, "<this>");
            Intrinsics.checkNotNullParameter(characteristic, "characteristic");
            GattUuid from = GattUuid.Companion.from(characteristic);
            if (from != null) {
                byte[] value = characteristic.getValue();
                if (value != null) {
                    return m93404c(vehicle, from, value);
                }
                C41318g46.m40151m("No value to read for " + from, new Object[0]);
                return false;
            }
            C41318g46.m40151m("UUID " + from + " is not a GattUuid", new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r80.getImei()) == false) goto L21;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized boolean m93404c(Vehicle vehicle, GattUuid uuid, byte[] bytes) {
        boolean z;
        String joinToString$default;
        WireBird copy;
        synchronized (C34778Nn6.class) {
            Intrinsics.checkNotNullParameter(vehicle, "<this>");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            z = false;
            try {
                ByteBuffer order = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN);
                ArrayList arrayList = new ArrayList(bytes.length);
                for (byte b : bytes) {
                    arrayList.add(Character.valueOf((char) b));
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, C5697b.f25197g, 30, null);
                switch (C5696a.$EnumSwitchMapping$0[uuid.ordinal()]) {
                    case 1:
                        boolean locked = vehicle.getLocked();
                        vehicle.setLocked(order.get() != 0);
                        copy = r9.copy((r91 & 1) != 0 ? r9.f66717id : null, (r91 & 2) != 0 ? r9.model : null, (r91 & 4) != 0 ? r9.taskId : null, (r91 & 8) != 0 ? r9.batteryLevel : 0, (r91 & 16) != 0 ? r9.estimatedRange : null, (r91 & 32) != 0 ? r9.distance : 0, (r91 & 64) != 0 ? r9.location : null, (r91 & 128) != 0 ? r9.code : null, (r91 & 256) != 0 ? r9.stickerId : null, (r91 & 512) != 0 ? r9.serialNumber : null, (r91 & 1024) != 0 ? r9.disconnected : false, (r91 & 2048) != 0 ? r9.collect : false, (r91 & 4096) != 0 ? r9.submerged : false, (r91 & 8192) != 0 ? r9.lost : false, (r91 & 16384) != 0 ? r9.locked : vehicle.getLocked(), (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r9.ackLocked : false, (r91 & 65536) != 0 ? r9.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r9.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r9.broken : false, (r91 & 524288) != 0 ? r9.label : null, (r91 & 1048576) != 0 ? r9.actions : null, (r91 & 2097152) != 0 ? r9.bountyId : null, (r91 & 4194304) != 0 ? r9.bountyPrice : null, (r91 & 8388608) != 0 ? r9.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r9.bountyLost : false, (r91 & 33554432) != 0 ? r9.bountyOverdue : false, (r91 & 67108864) != 0 ? r9.bountyKind : null, (r91 & 134217728) != 0 ? r9.brandName : null, (r91 & 268435456) != 0 ? r9.taskKind : null, (r91 & 536870912) != 0 ? r9.gpsAt : null, (r91 & 1073741824) != 0 ? r9.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? r9.token : null, (r92 & 1) != 0 ? r9.bluetooth : false, (r92 & 2) != 0 ? r9.cellular : false, (r92 & 4) != 0 ? r9.startedAt : null, (r92 & 8) != 0 ? r9.dueAt : null, (r92 & 16) != 0 ? r9.asleep : false, (r92 & 32) != 0 ? r9.imei : null, (r92 & 64) != 0 ? r9.boardProtocol : null, (r92 & 128) != 0 ? r9.physicalLock : null, (r92 & 256) != 0 ? r9.priorityCollect : false, (r92 & 512) != 0 ? r9.down : false, (r92 & 1024) != 0 ? r9.needsInspection : false, (r92 & 2048) != 0 ? r9.partnerId : null, (r92 & 4096) != 0 ? r9.nestId : null, (r92 & 8192) != 0 ? r9.lastRideEndedAt : null, (r92 & 16384) != 0 ? r9.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r9.peril : false, (r92 & 65536) != 0 ? r9.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r9.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r9.offline : false, (r92 & 524288) != 0 ? r9.license : null, (r92 & 1048576) != 0 ? r9.areaKey : null, (r92 & 2097152) != 0 ? r9.fleetId : null, (r92 & 4194304) != 0 ? r9.nestPurpose : null, (r92 & 8388608) != 0 ? r9.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r9.scannedAt : null, (r92 & 33554432) != 0 ? r9.badgeType : null, (r92 & 67108864) != 0 ? r9.bountyReasons : null, (r92 & 134217728) != 0 ? r9.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? r9.ephemeralId : null, (r92 & 536870912) != 0 ? r9.hasHelmet : false, (r92 & 1073741824) != 0 ? r9.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? r9.bleMacAddress : null, (r93 & 1) != 0 ? r9.cellId : null, (r93 & 2) != 0 ? vehicle.getBird().externalFeedType : null);
                        vehicle.setBird(copy);
                        if (locked != vehicle.getLocked()) {
                            z = true;
                            break;
                        }
                        break;
                    case 2:
                        int distance = vehicle.getDistance();
                        int m103787c = C3157HY.m103787c(order.getInt());
                        if (m103787c != 0) {
                            vehicle.setDistance(m103787c);
                            if (distance != vehicle.getDistance()) {
                                z = true;
                                break;
                            }
                        }
                        break;
                    case 3:
                        int battery = vehicle.getBattery();
                        byte b2 = order.get();
                        if (b2 != 0) {
                            vehicle.setBattery(b2);
                            if (battery != vehicle.getBattery()) {
                                z = true;
                                break;
                            }
                        }
                        break;
                    case 4:
                        EnergyMode energyMode = vehicle.getEnergyMode();
                        vehicle.setEnergyMode(C31875Bd1.m113749b(vehicle.getBird(), order.get()));
                        if (energyMode != vehicle.getEnergyMode()) {
                            z = true;
                            break;
                        }
                        break;
                    case 5:
                        boolean authenticated = vehicle.getAuthenticated();
                        vehicle.setAuthenticated(order.get() != 0);
                        if (authenticated != vehicle.getAuthenticated()) {
                            z = true;
                            break;
                        }
                        break;
                    case 6:
                        String imei = vehicle.getImei();
                        vehicle.setImei(joinToString$default);
                        break;
                    case 7:
                        String iccid = vehicle.getIccid();
                        vehicle.setIccid(joinToString$default);
                        if (!Intrinsics.areEqual(iccid, vehicle.getIccid())) {
                            z = true;
                            break;
                        }
                        break;
                    case 8:
                        String stmVersion = vehicle.getVehicleVersion().getStmVersion();
                        VehicleVersion.copy$default(vehicle.getVehicleVersion(), null, null, null, 0, null, m93406a(bytes), 31, null);
                        if (!Intrinsics.areEqual(stmVersion, vehicle.getVehicleVersion().getStmVersion())) {
                            z = true;
                            break;
                        }
                        break;
                    case 9:
                        String fault = vehicle.getFault();
                        vehicle.setFault(C48457s70.m14771a(bytes, 8));
                        if (!Intrinsics.areEqual(fault, vehicle.getFault())) {
                            z = true;
                            break;
                        }
                        break;
                    default:
                        C41318g46.m40151m("Update from unrecognized: " + uuid, new Object[0]);
                        break;
                }
            } catch (BufferUnderflowException e) {
                C41318g46.m40158f(e, "Vehicle data is corrupted: " + uuid, new Object[0]);
                return false;
            }
        }
        return z;
    }
}
