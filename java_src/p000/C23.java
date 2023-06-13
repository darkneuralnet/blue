package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LC23;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "spaces", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getSpaces", "()I", "<init>", "(I)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C23 */
/* loaded from: classes2.dex */
public final class C23 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f3319d;

    public C23(int i) {
        super(null);
        this.f3319d = i;
    }

    public static /* synthetic */ C23 copy$default(C23 c23, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c23.f3319d;
        }
        return c23.m112956b(i);
    }

    /* renamed from: b */
    public final C23 m112956b(int i) {
        return new C23(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23) && this.f3319d == ((C23) obj).f3319d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f3319d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.nest_claim_confirm_body, Integer.valueOf(this.f3319d));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…aim_confirm_body, spaces)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.nest_claim_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…nest_claim_confirm_title)");
        return string;
    }

    public String toString() {
        int i = this.f3319d;
        return "NestClaimConfirmation(spaces=" + i + ")";
    }
}
