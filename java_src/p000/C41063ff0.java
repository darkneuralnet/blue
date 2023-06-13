package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lff0;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "count", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getCount", "()I", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(I)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ff0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41063ff0 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f80406d;

    /* renamed from: e */
    public final Integer f80407e;

    public C41063ff0(int i) {
        super(null);
        this.f80406d = i;
        this.f80407e = Integer.valueOf(C45871nl4.transfer_order_confirm_checkout_button);
    }

    public static /* synthetic */ C41063ff0 copy$default(C41063ff0 c41063ff0, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c41063ff0.f80406d;
        }
        return c41063ff0.m41066b(i);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f80407e;
    }

    /* renamed from: b */
    public final C41063ff0 m41066b(int i) {
        return new C41063ff0(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41063ff0) && this.f80406d == ((C41063ff0) obj).f80406d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f80406d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.operator_bulk_update_capture_start_task_message, Integer.valueOf(this.f80406d));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…tart_task_message, count)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.operator_bulk_update_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ulk_update_confirm_title)");
        return string;
    }

    public String toString() {
        int i = this.f80406d;
        return "CaptureConfirmation(count=" + i + ")";
    }
}
