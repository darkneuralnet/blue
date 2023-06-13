package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LDt5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "warehouse", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getWarehouse", "()Ljava/lang/String;", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dt5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32491Dt5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f6465d;

    /* renamed from: e */
    public final Integer f6466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32491Dt5(String warehouse) {
        super(null);
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        this.f6465d = warehouse;
        this.f6466e = Integer.valueOf(C45871nl4.confirm_action);
    }

    public static /* synthetic */ C32491Dt5 copy$default(C32491Dt5 c32491Dt5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32491Dt5.f6465d;
        }
        return c32491Dt5.m109803b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f6466e;
    }

    /* renamed from: b */
    public final C32491Dt5 m109803b(String warehouse) {
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        return new C32491Dt5(warehouse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32491Dt5) && Intrinsics.areEqual(this.f6465d, ((C32491Dt5) obj).f6465d);
    }

    public int hashCode() {
        return this.f6465d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_check_in_override_body, this.f6465d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…override_body, warehouse)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_check_in_override_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_check_in_override_title)");
        return string;
    }

    public String toString() {
        String str = this.f6465d;
        return "ServiceCenterInboundOverrideConfirmation(warehouse=" + str + ")";
    }
}
