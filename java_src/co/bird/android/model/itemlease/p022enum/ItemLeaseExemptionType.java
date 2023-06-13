package co.bird.android.model.itemlease.p022enum;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005HÖ\u0001j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "PERSONAL_HELMET", "DECLINED_SUGGESTION", "MISSING_HELMET", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.model.itemlease.enum.ItemLeaseExemptionType */
/* loaded from: classes4.dex */
public enum ItemLeaseExemptionType implements Parcelable {
    PERSONAL_HELMET,
    DECLINED_SUGGESTION,
    MISSING_HELMET,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ItemLeaseExemptionType> CREATOR = new Parcelable.Creator<ItemLeaseExemptionType>() { // from class: co.bird.android.model.itemlease.enum.ItemLeaseExemptionType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseExemptionType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ItemLeaseExemptionType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemLeaseExemptionType[] newArray(int i) {
            return new ItemLeaseExemptionType[i];
        }
    };

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/itemlease/enum/ItemLeaseExemptionType;", "value", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.model.itemlease.enum.ItemLeaseExemptionType$Companion */
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ItemLeaseExemptionType fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return ItemLeaseExemptionType.valueOf(upperCase);
            } catch (Exception unused) {
                return ItemLeaseExemptionType.UNKNOWN;
            }
        }

        private Companion() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        String name = name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
