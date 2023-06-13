package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/PropertyReportActionOption;", "Landroid/os/Parcelable;", "action", "Lco/bird/android/model/PropertyReportAction;", "(Lco/bird/android/model/PropertyReportAction;)V", "getAction", "()Lco/bird/android/model/PropertyReportAction;", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PropertyReportActionOption implements Parcelable {
    public static final Parcelable.Creator<PropertyReportActionOption> CREATOR = new Creator();
    private final PropertyReportAction action;
    private boolean checked;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<PropertyReportActionOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyReportActionOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PropertyReportActionOption(PropertyReportAction.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PropertyReportActionOption[] newArray(int i) {
            return new PropertyReportActionOption[i];
        }
    }

    public PropertyReportActionOption(PropertyReportAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }

    public static /* synthetic */ PropertyReportActionOption copy$default(PropertyReportActionOption propertyReportActionOption, PropertyReportAction propertyReportAction, int i, Object obj) {
        if ((i & 1) != 0) {
            propertyReportAction = propertyReportActionOption.action;
        }
        return propertyReportActionOption.copy(propertyReportAction);
    }

    public final PropertyReportAction component1() {
        return this.action;
    }

    public final PropertyReportActionOption copy(PropertyReportAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new PropertyReportActionOption(action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PropertyReportActionOption) && this.action == ((PropertyReportActionOption) obj).action;
    }

    public final PropertyReportAction getAction() {
        return this.action;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public String toString() {
        PropertyReportAction propertyReportAction = this.action;
        return "PropertyReportActionOption(action=" + propertyReportAction + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.action.name());
    }
}