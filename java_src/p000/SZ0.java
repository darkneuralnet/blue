package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018¨\u0006 "}, m28432d2 = {"LSZ0;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "negativeBalance", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getNegativeBalance", "()Ljava/lang/String;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SZ0 */
/* loaded from: classes2.dex */
public final class SZ0 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f33887d;

    /* renamed from: e */
    public final int f33888e;

    /* renamed from: f */
    public final Integer f33889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZ0(String negativeBalance) {
        super(null);
        Intrinsics.checkNotNullParameter(negativeBalance, "negativeBalance");
        this.f33887d = negativeBalance;
        this.f33888e = C45871nl4.ok_uppercased;
    }

    public static /* synthetic */ SZ0 copy$default(SZ0 sz0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sz0.f33887d;
        }
        return sz0.m85289b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f33888e);
    }

    /* renamed from: b */
    public final SZ0 m85289b(String negativeBalance) {
        Intrinsics.checkNotNullParameter(negativeBalance, "negativeBalance");
        return new SZ0(negativeBalance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SZ0) && Intrinsics.areEqual(this.f33887d, ((SZ0) obj).f33887d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f33889f;
    }

    public int hashCode() {
        return this.f33887d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.delete_account_negative_balance, this.f33887d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…balance, negativeBalance)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.error);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.error)");
        return string;
    }

    public String toString() {
        String str = this.f33887d;
        return "DeleteAccountNegativeBalanceErrorDialog(negativeBalance=" + str + ")";
    }
}
