package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum UNKNOWN uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/AgreementRole;", "", "Landroid/os/Parcelable;", "title", "", "(Ljava/lang/String;II)V", "getTitle", "()I", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "RIDER", "MULTI_RIDE_HOST", "MULTI_RIDE_GUEST", "MECHANIC", "CHARGER", "PRELOAD", "MERCHANT", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AgreementRole implements Parcelable {
    private static final /* synthetic */ AgreementRole[] $VALUES;
    @JsonProperty("CHARGER")
    @InterfaceC41208ft5("CHARGER")
    public static final AgreementRole CHARGER;
    public static final Parcelable.Creator<AgreementRole> CREATOR;
    @JsonProperty("MECHANIC")
    @InterfaceC41208ft5("MECHANIC")
    public static final AgreementRole MECHANIC;
    @JsonProperty("MERCHANT")
    @InterfaceC41208ft5("MERCHANT")
    public static final AgreementRole MERCHANT;
    @JsonProperty("MULTI_RIDE_GUEST")
    @InterfaceC41208ft5("MULTI_RIDE_GUEST")
    public static final AgreementRole MULTI_RIDE_GUEST;
    @JsonProperty("MULTI_RIDE_HOST")
    @InterfaceC41208ft5("MULTI_RIDE_HOST")
    public static final AgreementRole MULTI_RIDE_HOST;
    @JsonProperty("PRELOAD")
    @InterfaceC41208ft5("PRELOAD")
    public static final AgreementRole PRELOAD;
    @JsonProperty("RIDER")
    @InterfaceC41208ft5("RIDER")
    public static final AgreementRole RIDER;
    @JsonProperty("UNKNOWN")
    @InterfaceC41208ft5("UNKNOWN")
    public static final AgreementRole UNKNOWN;
    private final int title;

    private static final /* synthetic */ AgreementRole[] $values() {
        return new AgreementRole[]{UNKNOWN, RIDER, MULTI_RIDE_HOST, MULTI_RIDE_GUEST, MECHANIC, CHARGER, PRELOAD, MERCHANT};
    }

    static {
        int i = C45871nl4.generic_agreement_title;
        UNKNOWN = new AgreementRole("UNKNOWN", 0, i);
        RIDER = new AgreementRole("RIDER", 1, C45871nl4.rental_agreement_title);
        MULTI_RIDE_HOST = new AgreementRole("MULTI_RIDE_HOST", 2, C45871nl4.host_agreement_title);
        MULTI_RIDE_GUEST = new AgreementRole("MULTI_RIDE_GUEST", 3, i);
        MECHANIC = new AgreementRole("MECHANIC", 4, C45871nl4.mechanic_agreement_title);
        CHARGER = new AgreementRole("CHARGER", 5, C45871nl4.charger_agreement_title);
        PRELOAD = new AgreementRole("PRELOAD", 6, C45871nl4.preload_agreement_title);
        MERCHANT = new AgreementRole("MERCHANT", 7, C45871nl4.merchant_agreement_title);
        $VALUES = $values();
        CREATOR = new Parcelable.Creator<AgreementRole>() { // from class: co.bird.android.model.AgreementRole.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AgreementRole createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AgreementRole.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AgreementRole[] newArray(int i2) {
                return new AgreementRole[i2];
            }
        };
    }

    private AgreementRole(String str, int i, int i2) {
        this.title = i2;
    }

    public static AgreementRole valueOf(String str) {
        return (AgreementRole) Enum.valueOf(AgreementRole.class, str);
    }

    public static AgreementRole[] values() {
        return (AgreementRole[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
