package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LEt5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "warehouse", "fleet", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getWarehouse", "()Ljava/lang/String;", "e", "getFleet", "f", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Et5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32725Et5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f8269d;

    /* renamed from: e */
    public final String f8270e;

    /* renamed from: f */
    public final Integer f8271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32725Et5(String warehouse, String fleet) {
        super(null);
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        Intrinsics.checkNotNullParameter(fleet, "fleet");
        this.f8269d = warehouse;
        this.f8270e = fleet;
        this.f8271f = Integer.valueOf(C45871nl4.transfer_orders_confirm_check_in_button);
    }

    public static /* synthetic */ C32725Et5 copy$default(C32725Et5 c32725Et5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32725Et5.f8269d;
        }
        if ((i & 2) != 0) {
            str2 = c32725Et5.f8270e;
        }
        return c32725Et5.m108252b(str, str2);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f8271f;
    }

    /* renamed from: b */
    public final C32725Et5 m108252b(String warehouse, String fleet) {
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        Intrinsics.checkNotNullParameter(fleet, "fleet");
        return new C32725Et5(warehouse, fleet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32725Et5) {
            C32725Et5 c32725Et5 = (C32725Et5) obj;
            return Intrinsics.areEqual(this.f8269d, c32725Et5.f8269d) && Intrinsics.areEqual(this.f8270e, c32725Et5.f8270e);
        }
        return false;
    }

    public int hashCode() {
        return (this.f8269d.hashCode() * 31) + this.f8270e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C40788fB0.m41771k(context, C45871nl4.transfer_orders_confirm_check_in_body, this.f8269d, this.f8270e);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_orders_confirm_check_in_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…s_confirm_check_in_title)");
        return string;
    }

    public String toString() {
        String str = this.f8269d;
        String str2 = this.f8270e;
        return "ServiceCenterInboundScanConfirmation(warehouse=" + str + ", fleet=" + str2 + ")";
    }
}
