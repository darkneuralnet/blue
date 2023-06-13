package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005HÖ\u0001j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "toWire", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "LEGACY", "ID_CARD", "DRIVER_LICENSE", "PROVISIONAL_DRIVER_LICENSE", "PASSPORT", "VISA", "RESIDENCE_CARD", "EMIRATES_ID", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nIdentificationEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationEntry.kt\nco/bird/android/model/identification/IdentificationDocumentType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* loaded from: classes4.dex */
public enum IdentificationDocumentType implements Parcelable {
    LEGACY,
    ID_CARD,
    DRIVER_LICENSE,
    PROVISIONAL_DRIVER_LICENSE,
    PASSPORT,
    VISA,
    RESIDENCE_CARD,
    EMIRATES_ID,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IdentificationDocumentType> CREATOR = new Parcelable.Creator<IdentificationDocumentType>() { // from class: co.bird.android.model.identification.IdentificationDocumentType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationDocumentType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IdentificationDocumentType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationDocumentType[] newArray(int i) {
            return new IdentificationDocumentType[i];
        }
    };

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType$Companion;", "", "()V", "fromWire", "Lco/bird/android/model/identification/IdentificationDocumentType;", "value", "", "nullableFromWire", "selectableValues", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationDocumentType fromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationDocumentType.valueOf(upperCase);
            } catch (Exception unused) {
                return IdentificationDocumentType.UNKNOWN;
            }
        }

        public final IdentificationDocumentType nullableFromWire(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = value.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return IdentificationDocumentType.valueOf(upperCase);
            } catch (Exception unused) {
                return null;
            }
        }

        public final List<IdentificationDocumentType> selectableValues() {
            List mutableList;
            List<IdentificationDocumentType> list;
            mutableList = ArraysKt___ArraysKt.toMutableList(IdentificationDocumentType.values());
            mutableList.remove(IdentificationDocumentType.UNKNOWN);
            mutableList.remove(IdentificationDocumentType.LEGACY);
            list = CollectionsKt___CollectionsKt.toList(mutableList);
            return list;
        }

        private Companion() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String toWire() {
        String name = name();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (this != UNKNOWN) {
            return lowerCase;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
