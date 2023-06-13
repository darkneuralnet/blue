package co.bird.android.core.base.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.VehicleInventoryAction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\nHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nHÖ\u0001R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010)R\u001a\u00101\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/CoreInventorySuccess;", "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Landroid/graphics/drawable/Drawable;", "g", "j", "", "l", "(Landroid/content/Context;)Ljava/lang/Integer;", "k", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "warehouse", "m", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "h", "Lco/bird/android/model/constant/VehicleInventoryAction;", "getAction", "()Lco/bird/android/model/constant/VehicleInventoryAction;", "i", "Ljava/lang/String;", "getWarehouse", "()Ljava/lang/String;", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "Z", "e", "()Z", "icon2Padding", "<init>", "(Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CoreInventorySuccess extends BottomSheetAlertDialog {
    public static final Parcelable.Creator<CoreInventorySuccess> CREATOR = new C14446a();

    /* renamed from: h */
    public final VehicleInventoryAction f63053h;

    /* renamed from: i */
    public final String f63054i;

    /* renamed from: j */
    public final int f63055j;

    /* renamed from: k */
    public final Integer f63056k;

    /* renamed from: l */
    public final boolean f63057l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.core.base.viewmodel.CoreInventorySuccess$a */
    /* loaded from: classes2.dex */
    public static final class C14446a implements Parcelable.Creator<CoreInventorySuccess> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CoreInventorySuccess createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoreInventorySuccess(VehicleInventoryAction.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CoreInventorySuccess[] newArray(int i) {
            return new CoreInventorySuccess[i];
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.core.base.viewmodel.CoreInventorySuccess$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14447b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VehicleInventoryAction.values().length];
            try {
                iArr[VehicleInventoryAction.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleInventoryAction.DROP_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleInventoryAction.CHECK_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VehicleInventoryAction.CHECK_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventorySuccess(VehicleInventoryAction action, String str) {
        super(null);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f63053h = action;
        this.f63054i = str;
        this.f63055j = C45871nl4.general_got_it;
    }

    public static /* synthetic */ CoreInventorySuccess copy$default(CoreInventorySuccess coreInventorySuccess, VehicleInventoryAction vehicleInventoryAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            vehicleInventoryAction = coreInventorySuccess.f63053h;
        }
        if ((i & 2) != 0) {
            str = coreInventorySuccess.f63054i;
        }
        return coreInventorySuccess.m59017m(vehicleInventoryAction, str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f63055j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: e */
    public boolean mo59011e() {
        return this.f63057l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoreInventorySuccess) {
            CoreInventorySuccess coreInventorySuccess = (CoreInventorySuccess) obj;
            return this.f63053h == coreInventorySuccess.f63053h && Intrinsics.areEqual(this.f63054i, coreInventorySuccess.f63054i);
        }
        return false;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: g */
    public Drawable mo59005g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C33309Hg4.illustration_bird_zero);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f63056k;
    }

    public int hashCode() {
        int hashCode = this.f63053h.hashCode() * 31;
        String str = this.f63054i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: j */
    public Drawable mo59004j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C48193rg4.ic_check_circle);
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: k */
    public Integer mo59010k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(NA0.m94301c(context, C32364Df4.birdWhite));
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: l */
    public Integer mo59009l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(NA0.m94301c(context, C32364Df4.birdGreen));
    }

    /* renamed from: m */
    public final CoreInventorySuccess m59017m(VehicleInventoryAction action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new CoreInventorySuccess(action, str);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C14447b.$EnumSwitchMapping$0[this.f63053h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    String string = context.getString(C45871nl4.core_inventory_checkout_complete_body);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…y_checkout_complete_body)");
                    return string;
                }
                String string2 = context.getString(C45871nl4.core_inventory_check_in_complete_body, this.f63054i);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…complete_body, warehouse)");
                return string2;
            }
            String string3 = context.getString(C45871nl4.core_inventory_dropoff_complete_body);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ry_dropoff_complete_body)");
            return string3;
        }
        String string4 = context.getString(C45871nl4.core_inventory_pickup_complete_body);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ory_pickup_complete_body)");
        return string4;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C14447b.$EnumSwitchMapping$0[this.f63053h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    String string = context.getString(C45871nl4.core_inventory_checkout_complete_title);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_checkout_complete_title)");
                    return string;
                }
                String string2 = context.getString(C45871nl4.core_inventory_check_in_complete_title);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…_check_in_complete_title)");
                return string2;
            }
            String string3 = context.getString(C45871nl4.core_inventory_dropoff_complete_title);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…y_dropoff_complete_title)");
            return string3;
        }
        String string4 = context.getString(C45871nl4.core_inventory_pickup_complete_title);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ry_pickup_complete_title)");
        return string4;
    }

    public String toString() {
        VehicleInventoryAction vehicleInventoryAction = this.f63053h;
        String str = this.f63054i;
        return "CoreInventorySuccess(action=" + vehicleInventoryAction + ", warehouse=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f63053h.name());
        out.writeString(this.f63054i);
    }
}
