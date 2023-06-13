package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006$"}, m28432d2 = {"La96;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "serviceCenterScan", "", "errorCode", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Z", "getServiceCenterScan", "()Z", "e", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "f", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "getNegativeText", "negativeText", "<init>", "(ZLjava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: a96  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37793a96 extends AbstractC5751Ny {

    /* renamed from: d */
    public final boolean f49919d;

    /* renamed from: e */
    public final String f49920e;

    /* renamed from: f */
    public final Integer f49921f;

    /* renamed from: g */
    public final Integer f49922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37793a96(boolean z, String errorCode) {
        super(null);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f49919d = z;
        this.f49920e = errorCode;
        this.f49921f = Integer.valueOf(C45871nl4.general_got_it);
    }

    public static /* synthetic */ C37793a96 copy$default(C37793a96 c37793a96, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c37793a96.f49919d;
        }
        if ((i & 2) != 0) {
            str = c37793a96.f49920e;
        }
        return c37793a96.m71833b(z, str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f49921f;
    }

    /* renamed from: b */
    public final C37793a96 m71833b(boolean z, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return new C37793a96(z, errorCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37793a96) {
            C37793a96 c37793a96 = (C37793a96) obj;
            return this.f49919d == c37793a96.f49919d && Intrinsics.areEqual(this.f49920e, c37793a96.f49920e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f49922g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f49919d;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.f49920e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f49919d) {
            String string = context.getString(C45871nl4.transfer_orders_scan_error_service_center, this.f49920e);
            Intrinsics.checkNotNullExpressionValue(string, "{\n      context.getStrin…_center, errorCode)\n    }");
            return string;
        }
        String string2 = context.getString(C45871nl4.transfer_orders_scan_error_operator, this.f49920e);
        Intrinsics.checkNotNullExpressionValue(string2, "{\n      context.getStrin…perator, errorCode)\n    }");
        return string2;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.something_went_wrong_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_went_wrong_dialog_title)");
        return string;
    }

    public String toString() {
        boolean z = this.f49919d;
        String str = this.f49920e;
        return "TransferOrderScanError(serviceCenterScan=" + z + ", errorCode=" + str + ")";
    }
}
