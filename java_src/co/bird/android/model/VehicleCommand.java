package co.bird.android.model;

import android.os.Parcelable;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetCommand;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0001\n#$%&'()*+,¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/VehicleCommand;", "Landroid/os/Parcelable;", "bluetooth", "", "cellular", "(ZZ)V", "getBluetooth", "()Z", "getCellular", "command", "", "getCommand", "()Ljava/lang/String;", "flightSheetCommand", "Lco/bird/android/model/constant/FlightSheetCommand;", "getFlightSheetCommand", "()Lco/bird/android/model/constant/FlightSheetCommand;", "icon", "", "getIcon", "()I", "method", "Lco/bird/android/model/CommandMethod;", "getMethod", "()Lco/bird/android/model/CommandMethod;", "setMethod", "(Lco/bird/android/model/CommandMethod;)V", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "title", "", "getTitle", "()Ljava/lang/CharSequence;", "Lco/bird/android/model/AlarmCommand;", "Lco/bird/android/model/LightsCommand;", "Lco/bird/android/model/LockCommand;", "Lco/bird/android/model/SleepCommand;", "Lco/bird/android/model/SoftResetCommand;", "Lco/bird/android/model/UnlockBatteryCommand;", "Lco/bird/android/model/UnlockCableCommand;", "Lco/bird/android/model/UnlockCommand;", "Lco/bird/android/model/UnlockHelmetCommand;", "Lco/bird/android/model/WakeCommand;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class VehicleCommand implements Parcelable {
    private final boolean bluetooth;
    private final boolean cellular;

    public /* synthetic */ VehicleCommand(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public boolean getBluetooth() {
        return this.bluetooth;
    }

    public boolean getCellular() {
        return this.cellular;
    }

    public abstract String getCommand();

    public abstract FlightSheetCommand getFlightSheetCommand();

    public abstract int getIcon();

    public abstract CommandMethod getMethod();

    public abstract BirdModel getModel();

    public abstract CharSequence getTitle();

    public abstract void setMethod(CommandMethod commandMethod);

    private VehicleCommand(boolean z, boolean z2) {
        this.bluetooth = z;
        this.cellular = z2;
    }

    public /* synthetic */ VehicleCommand(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, null);
    }
}
