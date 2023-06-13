package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lgo5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "count", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getCount", "()I", "e", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(I)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: go5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41751go5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f84290d;

    /* renamed from: e */
    public final int f84291e;

    public C41751go5(int i) {
        super(null);
        this.f84290d = i;
        this.f84291e = C45871nl4.confirm_action;
    }

    public static /* synthetic */ C41751go5 copy$default(C41751go5 c41751go5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c41751go5.f84290d;
        }
        return c41751go5.m37463b(i);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f84291e);
    }

    /* renamed from: b */
    public final C41751go5 m37463b(int i) {
        return new C41751go5(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41751go5) && this.f84290d == ((C41751go5) obj).f84290d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f84290d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scrap_order_confirmation_body, Integer.valueOf(this.f84290d));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…confirmation_body, count)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scrap_order_confirmation_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…order_confirmation_title)");
        return string;
    }

    public String toString() {
        int i = this.f84290d;
        return "ScrapOrderConfirmation(count=" + i + ")";
    }
}
