package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetCommand;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\tHÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m28432d2 = {"Lco/bird/android/model/UnlockBatteryCommand;", "Lco/bird/android/model/VehicleCommand;", "flightSheetCommand", "Lco/bird/android/model/constant/FlightSheetCommand;", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "title", "", "icon", "", "command", "", "method", "Lco/bird/android/model/CommandMethod;", "(Lco/bird/android/model/constant/FlightSheetCommand;Lco/bird/android/model/constant/BirdModel;Ljava/lang/CharSequence;ILjava/lang/String;Lco/bird/android/model/CommandMethod;)V", "getCommand", "()Ljava/lang/String;", "getFlightSheetCommand", "()Lco/bird/android/model/constant/FlightSheetCommand;", "getIcon", "()I", "getMethod", "()Lco/bird/android/model/CommandMethod;", "setMethod", "(Lco/bird/android/model/CommandMethod;)V", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getTitle", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UnlockBatteryCommand extends VehicleCommand {
    public static final Parcelable.Creator<UnlockBatteryCommand> CREATOR = new Creator();
    private final String command;
    private final FlightSheetCommand flightSheetCommand;
    private final int icon;
    private CommandMethod method;
    private final BirdModel model;
    private final CharSequence title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<UnlockBatteryCommand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnlockBatteryCommand createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnlockBatteryCommand(FlightSheetCommand.valueOf(parcel.readString()), BirdModel.valueOf(parcel.readString()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : CommandMethod.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnlockBatteryCommand[] newArray(int i) {
            return new UnlockBatteryCommand[i];
        }
    }

    public /* synthetic */ UnlockBatteryCommand(FlightSheetCommand flightSheetCommand, BirdModel birdModel, CharSequence charSequence, int i, String str, CommandMethod commandMethod, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flightSheetCommand, birdModel, charSequence, i, str, (i2 & 32) != 0 ? null : commandMethod);
    }

    public static /* synthetic */ UnlockBatteryCommand copy$default(UnlockBatteryCommand unlockBatteryCommand, FlightSheetCommand flightSheetCommand, BirdModel birdModel, CharSequence charSequence, int i, String str, CommandMethod commandMethod, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flightSheetCommand = unlockBatteryCommand.flightSheetCommand;
        }
        if ((i2 & 2) != 0) {
            birdModel = unlockBatteryCommand.model;
        }
        BirdModel birdModel2 = birdModel;
        if ((i2 & 4) != 0) {
            charSequence = unlockBatteryCommand.title;
        }
        CharSequence charSequence2 = charSequence;
        if ((i2 & 8) != 0) {
            i = unlockBatteryCommand.icon;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = unlockBatteryCommand.command;
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            commandMethod = unlockBatteryCommand.method;
        }
        return unlockBatteryCommand.copy(flightSheetCommand, birdModel2, charSequence2, i3, str2, commandMethod);
    }

    public final FlightSheetCommand component1() {
        return this.flightSheetCommand;
    }

    public final BirdModel component2() {
        return this.model;
    }

    public final CharSequence component3() {
        return this.title;
    }

    public final int component4() {
        return this.icon;
    }

    public final String component5() {
        return this.command;
    }

    public final CommandMethod component6() {
        return this.method;
    }

    public final UnlockBatteryCommand copy(FlightSheetCommand flightSheetCommand, BirdModel model, CharSequence title, int i, String command, CommandMethod commandMethod) {
        Intrinsics.checkNotNullParameter(flightSheetCommand, "flightSheetCommand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        return new UnlockBatteryCommand(flightSheetCommand, model, title, i, command, commandMethod);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnlockBatteryCommand) {
            UnlockBatteryCommand unlockBatteryCommand = (UnlockBatteryCommand) obj;
            return this.flightSheetCommand == unlockBatteryCommand.flightSheetCommand && this.model == unlockBatteryCommand.model && Intrinsics.areEqual(this.title, unlockBatteryCommand.title) && this.icon == unlockBatteryCommand.icon && Intrinsics.areEqual(this.command, unlockBatteryCommand.command) && this.method == unlockBatteryCommand.method;
        }
        return false;
    }

    @Override // co.bird.android.model.VehicleCommand
    public String getCommand() {
        return this.command;
    }

    @Override // co.bird.android.model.VehicleCommand
    public FlightSheetCommand getFlightSheetCommand() {
        return this.flightSheetCommand;
    }

    @Override // co.bird.android.model.VehicleCommand
    public int getIcon() {
        return this.icon;
    }

    @Override // co.bird.android.model.VehicleCommand
    public CommandMethod getMethod() {
        return this.method;
    }

    @Override // co.bird.android.model.VehicleCommand
    public BirdModel getModel() {
        return this.model;
    }

    @Override // co.bird.android.model.VehicleCommand
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((((this.flightSheetCommand.hashCode() * 31) + this.model.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.command.hashCode()) * 31;
        CommandMethod commandMethod = this.method;
        return hashCode + (commandMethod == null ? 0 : commandMethod.hashCode());
    }

    @Override // co.bird.android.model.VehicleCommand
    public void setMethod(CommandMethod commandMethod) {
        this.method = commandMethod;
    }

    public String toString() {
        FlightSheetCommand flightSheetCommand = this.flightSheetCommand;
        BirdModel birdModel = this.model;
        CharSequence charSequence = this.title;
        int i = this.icon;
        String str = this.command;
        CommandMethod commandMethod = this.method;
        return "UnlockBatteryCommand(flightSheetCommand=" + flightSheetCommand + ", model=" + birdModel + ", title=" + ((Object) charSequence) + ", icon=" + i + ", command=" + str + ", method=" + commandMethod + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.flightSheetCommand.name());
        out.writeString(this.model.name());
        TextUtils.writeToParcel(this.title, out, i);
        out.writeInt(this.icon);
        out.writeString(this.command);
        CommandMethod commandMethod = this.method;
        if (commandMethod == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        commandMethod.writeToParcel(out, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockBatteryCommand(FlightSheetCommand flightSheetCommand, BirdModel model, CharSequence title, int i, String command, CommandMethod commandMethod) {
        super(true, true, null);
        Intrinsics.checkNotNullParameter(flightSheetCommand, "flightSheetCommand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        this.flightSheetCommand = flightSheetCommand;
        this.model = model;
        this.title = title;
        this.icon = i;
        this.command = command;
        this.method = commandMethod;
    }
}
