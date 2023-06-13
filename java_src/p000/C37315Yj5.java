package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.IdCardTerminology;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LYj5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "useIdCard", "Lco/bird/android/model/constant/IdCardTerminology;", "idCardTerminologyType", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Z", "getUseIdCard", "()Z", "e", "Lco/bird/android/model/constant/IdCardTerminology;", "getIdCardTerminologyType", "()Lco/bird/android/model/constant/IdCardTerminology;", "<init>", "(ZLco/bird/android/model/constant/IdCardTerminology;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yj5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37315Yj5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final boolean f46512d;

    /* renamed from: e */
    public final IdCardTerminology f46513e;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yj5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9953a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdCardTerminology.values().length];
            try {
                iArr[IdCardTerminology.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE_OR_PROVISIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdCardTerminology.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37315Yj5(boolean z, IdCardTerminology idCardTerminologyType) {
        super(null);
        Intrinsics.checkNotNullParameter(idCardTerminologyType, "idCardTerminologyType");
        this.f46512d = z;
        this.f46513e = idCardTerminologyType;
    }

    public static /* synthetic */ C37315Yj5 copy$default(C37315Yj5 c37315Yj5, boolean z, IdCardTerminology idCardTerminology, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c37315Yj5.f46512d;
        }
        if ((i & 2) != 0) {
            idCardTerminology = c37315Yj5.f46513e;
        }
        return c37315Yj5.m74346b(z, idCardTerminology);
    }

    /* renamed from: b */
    public final C37315Yj5 m74346b(boolean z, IdCardTerminology idCardTerminologyType) {
        Intrinsics.checkNotNullParameter(idCardTerminologyType, "idCardTerminologyType");
        return new C37315Yj5(z, idCardTerminologyType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37315Yj5) {
            C37315Yj5 c37315Yj5 = (C37315Yj5) obj;
            return this.f46512d == c37315Yj5.f46512d && this.f46513e == c37315Yj5.f46513e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f46512d;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.f46513e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = C9953a.$EnumSwitchMapping$0[this.f46513e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (this.f46512d) {
                            i = C45871nl4.id_card_error_expired_content;
                        } else {
                            i = C45871nl4.driver_license_error_generic_content;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = C45871nl4.driver_license_or_provisional_error_generic_content;
                }
            } else {
                i = C45871nl4.driver_license_error_generic_content;
            }
        } else {
            i = C45871nl4.id_card_error_expired_content;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(when(i…eneric_content\n    }\n  })");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.driver_license_error_generic_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ense_error_generic_title)");
        return string;
    }

    public String toString() {
        boolean z = this.f46512d;
        IdCardTerminology idCardTerminology = this.f46513e;
        return "ScanDlGeneric(useIdCard=" + z + ", idCardTerminologyType=" + idCardTerminology + ")";
    }
}
