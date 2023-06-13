package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.VehicleInventoryAction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LQB0;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Lco/bird/android/model/constant/VehicleInventoryAction;", "action", "", "warehouse", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/VehicleInventoryAction;", "getAction", "()Lco/bird/android/model/constant/VehicleInventoryAction;", "e", "Ljava/lang/String;", "getWarehouse", "()Ljava/lang/String;", "f", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QB0 */
/* loaded from: classes2.dex */
public final class QB0 extends AbstractC5751Ny {

    /* renamed from: d */
    public final VehicleInventoryAction f29995d;

    /* renamed from: e */
    public final String f29996e;

    /* renamed from: f */
    public final int f29997f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QB0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6708a {
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

    public /* synthetic */ QB0(VehicleInventoryAction vehicleInventoryAction, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vehicleInventoryAction, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ QB0 copy$default(QB0 qb0, VehicleInventoryAction vehicleInventoryAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            vehicleInventoryAction = qb0.f29995d;
        }
        if ((i & 2) != 0) {
            str = qb0.f29996e;
        }
        return qb0.m88794b(vehicleInventoryAction, str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f29997f);
    }

    /* renamed from: b */
    public final QB0 m88794b(VehicleInventoryAction action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new QB0(action, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QB0) {
            QB0 qb0 = (QB0) obj;
            return this.f29995d == qb0.f29995d && Intrinsics.areEqual(this.f29996e, qb0.f29996e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f29995d.hashCode() * 31;
        String str = this.f29996e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C6708a.$EnumSwitchMapping$0[this.f29995d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    String string = context.getString(C45871nl4.core_inventory_confirm_checkout_body);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ry_confirm_checkout_body)");
                    return string;
                }
                String string2 = context.getString(C45871nl4.core_inventory_confirm_check_in_body, this.f29996e);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…check_in_body, warehouse)");
                return C45097mS5.span$default(string2, this.f29996e, null, 2, null);
            }
            String string3 = context.getString(C45871nl4.core_inventory_confirm_dropoff_body);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ory_confirm_dropoff_body)");
            return string3;
        }
        String string4 = context.getString(C45871nl4.core_inventory_confirm_pickup_body);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…tory_confirm_pickup_body)");
        return string4;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C6708a.$EnumSwitchMapping$0[this.f29995d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    String string = context.getString(C45871nl4.core_inventory_confirm_checkout_title);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…y_confirm_checkout_title)");
                    return string;
                }
                String string2 = context.getString(C45871nl4.core_inventory_confirm_check_in_title);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…y_confirm_check_in_title)");
                return string2;
            }
            String string3 = context.getString(C45871nl4.core_inventory_confirm_dropoff_title);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ry_confirm_dropoff_title)");
            return string3;
        }
        String string4 = context.getString(C45871nl4.core_inventory_confirm_pickup_title);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ory_confirm_pickup_title)");
        return string4;
    }

    public String toString() {
        VehicleInventoryAction vehicleInventoryAction = this.f29995d;
        String str = this.f29996e;
        return "CoreInventoryConfirmation(action=" + vehicleInventoryAction + ", warehouse=" + str + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QB0(VehicleInventoryAction action, String str) {
        super(null);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f29995d = action;
        this.f29996e = str;
        this.f29997f = C45871nl4.confirm_action;
    }
}
