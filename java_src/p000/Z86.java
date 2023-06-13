package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"LZ86;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "scannedCount", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getScannedCount", "()I", "e", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(I)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z86 */
/* loaded from: classes2.dex */
public final class Z86 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f47891d;

    /* renamed from: e */
    public final int f47892e;

    /* renamed from: f */
    public final int f47893f;

    public Z86(int i) {
        super(null);
        this.f47891d = i;
        this.f47892e = C45871nl4.confirm_action;
        this.f47893f = 17039369;
    }

    public static /* synthetic */ Z86 copy$default(Z86 z86, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = z86.f47891d;
        }
        return z86.m73659b(i);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f47892e);
    }

    /* renamed from: b */
    public final Z86 m73659b(int i) {
        return new Z86(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z86) && this.f47891d == ((Z86) obj).f47891d;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f47893f);
    }

    public int hashCode() {
        return Integer.hashCode(this.f47891d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_close_confirmation_body, Integer.valueOf(this.f47891d));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ation_body, scannedCount)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_close_confirmation_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…close_confirmation_title)");
        return string;
    }

    public String toString() {
        int i = this.f47891d;
        return "TransferOrderScanCloseConfirmation(scannedCount=" + i + ")";
    }
}
