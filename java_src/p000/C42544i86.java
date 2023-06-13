package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"Li86;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i86  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42544i86 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f86801d;

    /* renamed from: e */
    public final Integer f86802e;

    /* renamed from: f */
    public final Integer f86803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42544i86(String code) {
        super(null);
        Intrinsics.checkNotNullParameter(code, "code");
        this.f86801d = code;
        this.f86802e = Integer.valueOf(C45871nl4.general_got_it);
    }

    public static /* synthetic */ C42544i86 copy$default(C42544i86 c42544i86, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c42544i86.f86801d;
        }
        return c42544i86.m34401b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f86802e;
    }

    /* renamed from: b */
    public final C42544i86 m34401b(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new C42544i86(code);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42544i86) && Intrinsics.areEqual(this.f86801d, ((C42544i86) obj).f86801d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f86803f;
    }

    public int hashCode() {
        return this.f86801d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_duplicate_scan_message, this.f86801d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…icate_scan_message, code)");
        return C45097mS5.span$default(string, this.f86801d, null, 2, null);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_order_duplicate_scan_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…der_duplicate_scan_title)");
        return string;
    }

    public String toString() {
        String str = this.f86801d;
        return "TransferOrderDuplicateScanError(code=" + str + ")";
    }
}