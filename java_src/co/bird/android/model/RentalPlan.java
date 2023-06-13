package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.RentalKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÓ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010K\u001a\u000203HÖ\u0001J\u0013\u0010L\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u000203HÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\u000e\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\bJ\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u000203HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0019\u00102\u001a\u0004\u0018\u0001038F¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&¨\u0006X"}, m28432d2 = {"Lco/bird/android/model/RentalPlan;", "Landroid/os/Parcelable;", "id", "", "baseCost", "", "baseTaxCost", "birdCare", "", "birdCareCost", "birdCareTaxCost", "currency", "descriptionLabel", "incentiveLabel", "includedItems", "", "recurring", "deliveryWindows", "Lco/bird/android/model/DeliveryWindow;", "notes", "Lco/bird/android/model/RentalNote;", "kind", "Lco/bird/android/model/constant/RentalKind;", "birdModel", "Lco/bird/android/model/constant/BirdModel;", "birdModelDisplayName", "specsLink", "(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCost", "()J", "getBaseTaxCost", "getBirdCare", "()Z", "getBirdCareCost", "getBirdCareTaxCost", "getBirdModel", "()Lco/bird/android/model/constant/BirdModel;", "getBirdModelDisplayName", "()Ljava/lang/String;", "getCurrency", "getDeliveryWindows", "()Ljava/util/List;", "getDescriptionLabel", "getId", "getIncentiveLabel", "getIncludedItems", "getKind", "()Lco/bird/android/model/constant/RentalKind;", "getNotes", "getRecurring", "shortestOnDemandEstimate", "", "getShortestOnDemandEstimate$annotations", "()V", "getShortestOnDemandEstimate", "()Ljava/lang/Integer;", "getSpecsLink", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "totalCost", "includeBirdCare", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRentals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rentals.kt\nco/bird/android/model/RentalPlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1789#2,3:267\n*S KotlinDebug\n*F\n+ 1 Rentals.kt\nco/bird/android/model/RentalPlan\n*L\n138#1:267,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RentalPlan implements Parcelable {
    public static final Parcelable.Creator<RentalPlan> CREATOR = new Creator();
    @JsonProperty("base_cost")
    @InterfaceC41208ft5("base_cost")
    private final long baseCost;
    @JsonProperty("base_tax_cost")
    @InterfaceC41208ft5("base_tax_cost")
    private final long baseTaxCost;
    @JsonProperty("bird_care")
    @InterfaceC41208ft5("bird_care")
    private final boolean birdCare;
    @JsonProperty("bird_care_cost")
    @InterfaceC41208ft5("bird_care_cost")
    private final long birdCareCost;
    @JsonProperty("bird_care_tax_cost")
    @InterfaceC41208ft5("bird_care_tax_cost")
    private final long birdCareTaxCost;
    @JsonProperty("bird_model")
    @InterfaceC41208ft5("bird_model")
    private final BirdModel birdModel;
    @JsonProperty("bird_model_description")
    @InterfaceC41208ft5("bird_model_description")
    private final String birdModelDisplayName;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("delivery_windows")
    @InterfaceC41208ft5("delivery_windows")
    private final List<DeliveryWindow> deliveryWindows;
    @JsonProperty("description_label")
    @InterfaceC41208ft5("description_label")
    private final String descriptionLabel;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66620id;
    @JsonProperty("incentive_label")
    @InterfaceC41208ft5("incentive_label")
    private final String incentiveLabel;
    @JsonProperty("included_items")
    @InterfaceC41208ft5("included_items")
    private final List<String> includedItems;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final RentalKind kind;
    @JsonProperty("plan_notes")
    @InterfaceC41208ft5("plan_notes")
    private final List<RentalNote> notes;
    @JsonProperty("recurring")
    @InterfaceC41208ft5("recurring")
    private final boolean recurring;
    @JsonProperty("specs_link")
    @InterfaceC41208ft5("specs_link")
    private final String specsLink;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RentalPlan> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RentalPlan createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList3.add(DeliveryWindow.CREATOR.createFromParcel(parcel));
                i++;
                readInt = readInt;
            }
            if (parcel.readInt() == 0) {
                arrayList = arrayList3;
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                arrayList = arrayList3;
                int i2 = 0;
                while (i2 != readInt2) {
                    arrayList4.add(RentalNote.CREATOR.createFromParcel(parcel));
                    i2++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList4;
            }
            return new RentalPlan(readString, readLong, readLong2, z, readLong3, readLong4, readString2, readString3, readString4, createStringArrayList, z2, arrayList, arrayList2, parcel.readInt() == 0 ? null : RentalKind.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BirdModel.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RentalPlan[] newArray(int i) {
            return new RentalPlan[i];
        }
    }

    public RentalPlan() {
        this(null, 0L, 0L, false, 0L, 0L, null, null, null, null, false, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ void getShortestOnDemandEstimate$annotations() {
    }

    public final String component1() {
        return this.f66620id;
    }

    public final List<String> component10() {
        return this.includedItems;
    }

    public final boolean component11() {
        return this.recurring;
    }

    public final List<DeliveryWindow> component12() {
        return this.deliveryWindows;
    }

    public final List<RentalNote> component13() {
        return this.notes;
    }

    public final RentalKind component14() {
        return this.kind;
    }

    public final BirdModel component15() {
        return this.birdModel;
    }

    public final String component16() {
        return this.birdModelDisplayName;
    }

    public final String component17() {
        return this.specsLink;
    }

    public final long component2() {
        return this.baseCost;
    }

    public final long component3() {
        return this.baseTaxCost;
    }

    public final boolean component4() {
        return this.birdCare;
    }

    public final long component5() {
        return this.birdCareCost;
    }

    public final long component6() {
        return this.birdCareTaxCost;
    }

    public final String component7() {
        return this.currency;
    }

    public final String component8() {
        return this.descriptionLabel;
    }

    public final String component9() {
        return this.incentiveLabel;
    }

    public final RentalPlan copy(String id, long j, long j2, boolean z, long j3, long j4, String currency, String str, String str2, List<String> includedItems, boolean z2, List<DeliveryWindow> deliveryWindows, List<RentalNote> list, RentalKind rentalKind, BirdModel birdModel, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(includedItems, "includedItems");
        Intrinsics.checkNotNullParameter(deliveryWindows, "deliveryWindows");
        return new RentalPlan(id, j, j2, z, j3, j4, currency, str, str2, includedItems, z2, deliveryWindows, list, rentalKind, birdModel, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RentalPlan) {
            RentalPlan rentalPlan = (RentalPlan) obj;
            return Intrinsics.areEqual(this.f66620id, rentalPlan.f66620id) && this.baseCost == rentalPlan.baseCost && this.baseTaxCost == rentalPlan.baseTaxCost && this.birdCare == rentalPlan.birdCare && this.birdCareCost == rentalPlan.birdCareCost && this.birdCareTaxCost == rentalPlan.birdCareTaxCost && Intrinsics.areEqual(this.currency, rentalPlan.currency) && Intrinsics.areEqual(this.descriptionLabel, rentalPlan.descriptionLabel) && Intrinsics.areEqual(this.incentiveLabel, rentalPlan.incentiveLabel) && Intrinsics.areEqual(this.includedItems, rentalPlan.includedItems) && this.recurring == rentalPlan.recurring && Intrinsics.areEqual(this.deliveryWindows, rentalPlan.deliveryWindows) && Intrinsics.areEqual(this.notes, rentalPlan.notes) && this.kind == rentalPlan.kind && this.birdModel == rentalPlan.birdModel && Intrinsics.areEqual(this.birdModelDisplayName, rentalPlan.birdModelDisplayName) && Intrinsics.areEqual(this.specsLink, rentalPlan.specsLink);
        }
        return false;
    }

    public final long getBaseCost() {
        return this.baseCost;
    }

    public final long getBaseTaxCost() {
        return this.baseTaxCost;
    }

    public final boolean getBirdCare() {
        return this.birdCare;
    }

    public final long getBirdCareCost() {
        return this.birdCareCost;
    }

    public final long getBirdCareTaxCost() {
        return this.birdCareTaxCost;
    }

    public final BirdModel getBirdModel() {
        return this.birdModel;
    }

    public final String getBirdModelDisplayName() {
        return this.birdModelDisplayName;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<DeliveryWindow> getDeliveryWindows() {
        return this.deliveryWindows;
    }

    public final String getDescriptionLabel() {
        return this.descriptionLabel;
    }

    public final String getId() {
        return this.f66620id;
    }

    public final String getIncentiveLabel() {
        return this.incentiveLabel;
    }

    public final List<String> getIncludedItems() {
        return this.includedItems;
    }

    public final RentalKind getKind() {
        return this.kind;
    }

    public final List<RentalNote> getNotes() {
        return this.notes;
    }

    public final boolean getRecurring() {
        return this.recurring;
    }

    public final Integer getShortestOnDemandEstimate() {
        Integer num = null;
        for (DeliveryWindow deliveryWindow : this.deliveryWindows) {
            if (num == null) {
                num = deliveryWindow.getOnDemandEstimatedTime();
            } else if (deliveryWindow.getOnDemandEstimatedTime() != null && num.intValue() > deliveryWindow.getOnDemandEstimatedTime().intValue()) {
                num = deliveryWindow.getOnDemandEstimatedTime();
            }
        }
        return num;
    }

    public final String getSpecsLink() {
        return this.specsLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66620id.hashCode() * 31) + Long.hashCode(this.baseCost)) * 31) + Long.hashCode(this.baseTaxCost)) * 31;
        boolean z = this.birdCare;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((((hashCode + i) * 31) + Long.hashCode(this.birdCareCost)) * 31) + Long.hashCode(this.birdCareTaxCost)) * 31) + this.currency.hashCode()) * 31;
        String str = this.descriptionLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.incentiveLabel;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.includedItems.hashCode()) * 31;
        boolean z2 = this.recurring;
        int hashCode5 = (((hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.deliveryWindows.hashCode()) * 31;
        List<RentalNote> list = this.notes;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        RentalKind rentalKind = this.kind;
        int hashCode7 = (hashCode6 + (rentalKind == null ? 0 : rentalKind.hashCode())) * 31;
        BirdModel birdModel = this.birdModel;
        int hashCode8 = (hashCode7 + (birdModel == null ? 0 : birdModel.hashCode())) * 31;
        String str3 = this.birdModelDisplayName;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.specsLink;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66620id;
        long j = this.baseCost;
        long j2 = this.baseTaxCost;
        boolean z = this.birdCare;
        long j3 = this.birdCareCost;
        long j4 = this.birdCareTaxCost;
        String str2 = this.currency;
        String str3 = this.descriptionLabel;
        String str4 = this.incentiveLabel;
        List<String> list = this.includedItems;
        boolean z2 = this.recurring;
        List<DeliveryWindow> list2 = this.deliveryWindows;
        List<RentalNote> list3 = this.notes;
        RentalKind rentalKind = this.kind;
        BirdModel birdModel = this.birdModel;
        String str5 = this.birdModelDisplayName;
        String str6 = this.specsLink;
        return "RentalPlan(id=" + str + ", baseCost=" + j + ", baseTaxCost=" + j2 + ", birdCare=" + z + ", birdCareCost=" + j3 + ", birdCareTaxCost=" + j4 + ", currency=" + str2 + ", descriptionLabel=" + str3 + ", incentiveLabel=" + str4 + ", includedItems=" + list + ", recurring=" + z2 + ", deliveryWindows=" + list2 + ", notes=" + list3 + ", kind=" + rentalKind + ", birdModel=" + birdModel + ", birdModelDisplayName=" + str5 + ", specsLink=" + str6 + ")";
    }

    public final long totalCost(boolean z) {
        long j;
        long j2 = this.baseCost + this.baseTaxCost;
        if (z && this.birdCare) {
            j = this.birdCareCost + this.birdCareTaxCost;
        } else {
            j = 0;
        }
        return j2 + j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66620id);
        out.writeLong(this.baseCost);
        out.writeLong(this.baseTaxCost);
        out.writeInt(this.birdCare ? 1 : 0);
        out.writeLong(this.birdCareCost);
        out.writeLong(this.birdCareTaxCost);
        out.writeString(this.currency);
        out.writeString(this.descriptionLabel);
        out.writeString(this.incentiveLabel);
        out.writeStringList(this.includedItems);
        out.writeInt(this.recurring ? 1 : 0);
        List<DeliveryWindow> list = this.deliveryWindows;
        out.writeInt(list.size());
        for (DeliveryWindow deliveryWindow : list) {
            deliveryWindow.writeToParcel(out, i);
        }
        List<RentalNote> list2 = this.notes;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (RentalNote rentalNote : list2) {
                rentalNote.writeToParcel(out, i);
            }
        }
        RentalKind rentalKind = this.kind;
        if (rentalKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(rentalKind.name());
        }
        BirdModel birdModel = this.birdModel;
        if (birdModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(birdModel.name());
        }
        out.writeString(this.birdModelDisplayName);
        out.writeString(this.specsLink);
    }

    public RentalPlan(String id, long j, long j2, boolean z, long j3, long j4, String currency, String str, String str2, List<String> includedItems, boolean z2, List<DeliveryWindow> deliveryWindows, List<RentalNote> list, RentalKind rentalKind, BirdModel birdModel, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(includedItems, "includedItems");
        Intrinsics.checkNotNullParameter(deliveryWindows, "deliveryWindows");
        this.f66620id = id;
        this.baseCost = j;
        this.baseTaxCost = j2;
        this.birdCare = z;
        this.birdCareCost = j3;
        this.birdCareTaxCost = j4;
        this.currency = currency;
        this.descriptionLabel = str;
        this.incentiveLabel = str2;
        this.includedItems = includedItems;
        this.recurring = z2;
        this.deliveryWindows = deliveryWindows;
        this.notes = list;
        this.kind = rentalKind;
        this.birdModel = birdModel;
        this.birdModelDisplayName = str3;
        this.specsLink = str4;
    }

    public /* synthetic */ RentalPlan(String str, long j, long j2, boolean z, long j3, long j4, String str2, String str3, String str4, List list, boolean z2, List list2, List list3, RentalKind rentalKind, BirdModel birdModel, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j3, (i & 32) == 0 ? j4 : 0L, (i & 64) == 0 ? str2 : "", (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4096) != 0 ? null : list3, (i & 8192) != 0 ? null : rentalKind, (i & 16384) != 0 ? null : birdModel, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str5, (i & 65536) != 0 ? null : str6);
    }
}
