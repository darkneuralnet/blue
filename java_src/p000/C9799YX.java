package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC5225MD;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, m28432d2 = {"LYX;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "c", "LMD$b;", TransferTable.COLUMN_STATE, "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "LMD$b;", "getState", "()LMD$b;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(LMD$b;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YX */
/* loaded from: classes2.dex */
public final class C9799YX extends AbstractC5751Ny {

    /* renamed from: d */
    public final InterfaceC5225MD.EnumC5227b f45975d;

    /* renamed from: e */
    public final int f45976e;

    /* renamed from: f */
    public final Integer f45977f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: YX$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9800a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC5225MD.EnumC5227b.values().length];
            try {
                iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC5225MD.EnumC5227b.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC5225MD.EnumC5227b.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC5225MD.EnumC5227b.BLUETOOTH_NOT_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9799YX(InterfaceC5225MD.EnumC5227b state) {
        super(null);
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f45975d = state;
        if (m74935c()) {
            i = C45871nl4.settings_activity_title;
        } else {
            i = C45871nl4.ok_uppercased;
        }
        this.f45976e = i;
        this.f45977f = m74935c() ? Integer.valueOf(C45871nl4.ok_uppercased) : null;
    }

    public static /* synthetic */ C9799YX copy$default(C9799YX c9799yx, InterfaceC5225MD.EnumC5227b enumC5227b, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC5227b = c9799yx.f45975d;
        }
        return c9799yx.m74936b(enumC5227b);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f45976e);
    }

    /* renamed from: b */
    public final C9799YX m74936b(InterfaceC5225MD.EnumC5227b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new C9799YX(state);
    }

    /* renamed from: c */
    public final boolean m74935c() {
        int i = C9800a.$EnumSwitchMapping$0[this.f45975d.ordinal()];
        return i == 2 || i == 3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9799YX) && this.f45975d == ((C9799YX) obj).f45975d;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f45977f;
    }

    public int hashCode() {
        return this.f45975d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = C9800a.$EnumSwitchMapping$0[this.f45975d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    i = C45871nl4.bluetooth_required_enable_description;
                } else {
                    i = C45871nl4.bluetooth_required_enable_description;
                }
            } else {
                i = C45871nl4.bluetooth_required_auth_description;
            }
        } else {
            i = C45871nl4.bluetooth_required_unavailable_description;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …description\n      }\n    )");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.bluetooth_required_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…bluetooth_required_title)");
        return string;
    }

    public String toString() {
        InterfaceC5225MD.EnumC5227b enumC5227b = this.f45975d;
        return "BluetoothRequiredForScanDialog(state=" + enumC5227b + ")";
    }
}
