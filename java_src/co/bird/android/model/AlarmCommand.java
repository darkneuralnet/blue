package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetCommand;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tHÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, m28432d2 = {"Lco/bird/android/model/AlarmCommand;", "Lco/bird/android/model/VehicleCommand;", "flightSheetCommand", "Lco/bird/android/model/constant/FlightSheetCommand;", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "title", "", "icon", "", "command", "", "method", "Lco/bird/android/model/CommandMethod;", "options", "", "Lco/bird/android/model/AlarmOption;", "(Lco/bird/android/model/constant/FlightSheetCommand;Lco/bird/android/model/constant/BirdModel;Ljava/lang/CharSequence;ILjava/lang/String;Lco/bird/android/model/CommandMethod;Ljava/util/List;)V", "getCommand", "()Ljava/lang/String;", "getFlightSheetCommand", "()Lco/bird/android/model/constant/FlightSheetCommand;", "getIcon", "()I", "getMethod", "()Lco/bird/android/model/CommandMethod;", "setMethod", "(Lco/bird/android/model/CommandMethod;)V", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getOptions", "()Ljava/util/List;", "getTitle", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AlarmCommand extends VehicleCommand {
    public static final Parcelable.Creator<AlarmCommand> CREATOR = new Creator();
    private final String command;
    private final FlightSheetCommand flightSheetCommand;
    private final int icon;
    private CommandMethod method;
    private final BirdModel model;
    private final List<AlarmOption> options;
    private final CharSequence title;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AlarmCommand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlarmCommand createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FlightSheetCommand valueOf = FlightSheetCommand.valueOf(parcel.readString());
            BirdModel valueOf2 = BirdModel.valueOf(parcel.readString());
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            ArrayList arrayList = null;
            CommandMethod createFromParcel = parcel.readInt() == 0 ? null : CommandMethod.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(AlarmOption.CREATOR.createFromParcel(parcel));
                }
            }
            return new AlarmCommand(valueOf, valueOf2, charSequence, readInt, readString, createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlarmCommand[] newArray(int i) {
            return new AlarmCommand[i];
        }
    }

    public /* synthetic */ AlarmCommand(FlightSheetCommand flightSheetCommand, BirdModel birdModel, CharSequence charSequence, int i, String str, CommandMethod commandMethod, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flightSheetCommand, birdModel, charSequence, i, str, (i2 & 32) != 0 ? null : commandMethod, (i2 & 64) != 0 ? null : list);
    }

    public static /* synthetic */ AlarmCommand copy$default(AlarmCommand alarmCommand, FlightSheetCommand flightSheetCommand, BirdModel birdModel, CharSequence charSequence, int i, String str, CommandMethod commandMethod, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flightSheetCommand = alarmCommand.flightSheetCommand;
        }
        if ((i2 & 2) != 0) {
            birdModel = alarmCommand.model;
        }
        BirdModel birdModel2 = birdModel;
        if ((i2 & 4) != 0) {
            charSequence = alarmCommand.title;
        }
        CharSequence charSequence2 = charSequence;
        if ((i2 & 8) != 0) {
            i = alarmCommand.icon;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = alarmCommand.command;
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            commandMethod = alarmCommand.method;
        }
        CommandMethod commandMethod2 = commandMethod;
        List<AlarmOption> list2 = list;
        if ((i2 & 64) != 0) {
            list2 = alarmCommand.options;
        }
        return alarmCommand.copy(flightSheetCommand, birdModel2, charSequence2, i3, str2, commandMethod2, list2);
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

    public final List<AlarmOption> component7() {
        return this.options;
    }

    public final AlarmCommand copy(FlightSheetCommand flightSheetCommand, BirdModel model, CharSequence title, int i, String command, CommandMethod commandMethod, List<AlarmOption> list) {
        Intrinsics.checkNotNullParameter(flightSheetCommand, "flightSheetCommand");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(command, "command");
        return new AlarmCommand(flightSheetCommand, model, title, i, command, commandMethod, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlarmCommand) {
            AlarmCommand alarmCommand = (AlarmCommand) obj;
            return this.flightSheetCommand == alarmCommand.flightSheetCommand && this.model == alarmCommand.model && Intrinsics.areEqual(this.title, alarmCommand.title) && this.icon == alarmCommand.icon && Intrinsics.areEqual(this.command, alarmCommand.command) && this.method == alarmCommand.method && Intrinsics.areEqual(this.options, alarmCommand.options);
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

    public final List<AlarmOption> getOptions() {
        return this.options;
    }

    @Override // co.bird.android.model.VehicleCommand
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((((this.flightSheetCommand.hashCode() * 31) + this.model.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.command.hashCode()) * 31;
        CommandMethod commandMethod = this.method;
        int hashCode2 = (hashCode + (commandMethod == null ? 0 : commandMethod.hashCode())) * 31;
        List<AlarmOption> list = this.options;
        return hashCode2 + (list != null ? list.hashCode() : 0);
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
        List<AlarmOption> list = this.options;
        return "AlarmCommand(flightSheetCommand=" + flightSheetCommand + ", model=" + birdModel + ", title=" + ((Object) charSequence) + ", icon=" + i + ", command=" + str + ", method=" + commandMethod + ", options=" + list + ")";
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
        } else {
            out.writeInt(1);
            commandMethod.writeToParcel(out, i);
        }
        List<AlarmOption> list = this.options;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (AlarmOption alarmOption : list) {
            alarmOption.writeToParcel(out, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmCommand(FlightSheetCommand flightSheetCommand, BirdModel model, CharSequence title, int i, String command, CommandMethod commandMethod, List<AlarmOption> list) {
        super(model != BirdModel.BD, false, null);
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
        this.options = list;
    }
}
