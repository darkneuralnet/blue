package p000;

import co.bird.android.model.exception.BluetoothException;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePrivateBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/exception/BluetoothException;", "Lco/bird/android/model/wire/WireBird;", "bird", "LNy;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: jX */
/* loaded from: classes2.dex */
public final class C24920jX {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jX$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C24921a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BluetoothException.Reason.values().length];
            try {
                iArr[BluetoothException.Reason.SCAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothException.Reason.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothException.Reason.CONNECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothException.Reason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BluetoothException.Reason.DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final AbstractC5751Ny m30374a(BluetoothException bluetoothException, WireBird wireBird) {
        WirePrivateBird wirePrivateBird;
        Intrinsics.checkNotNullParameter(bluetoothException, "<this>");
        int i = C24921a.$EnumSwitchMapping$0[bluetoothException.getReason().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return C13589cX.f60835d;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C2885GY.f12053d;
                }
                return C9797YW.f45956d;
            }
            return C20922gY.f82393d;
        }
        if (wireBird != null) {
            wirePrivateBird = wireBird.getPrivateBird();
        } else {
            wirePrivateBird = null;
        }
        if (wirePrivateBird != null) {
            return C10285ZW.f48700d;
        }
        return C9422XX.f43357d;
    }

    public static /* synthetic */ AbstractC5751Ny alertDialog$default(BluetoothException bluetoothException, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = null;
        }
        return m30374a(bluetoothException, wireBird);
    }
}
