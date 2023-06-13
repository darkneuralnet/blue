package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lih1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "excessInventoryQuantity", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "e", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(I)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ih1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42863ih1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f87737d;

    /* renamed from: e */
    public final Integer f87738e;

    public C42863ih1(int i) {
        super(null);
        this.f87737d = i;
    }

    public static /* synthetic */ C42863ih1 copy$default(C42863ih1 c42863ih1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c42863ih1.f87737d;
        }
        return c42863ih1.m33585b(i);
    }

    /* renamed from: b */
    public final C42863ih1 m33585b(int i) {
        return new C42863ih1(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42863ih1) && this.f87737d == ((C42863ih1) obj).f87737d;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f87738e;
    }

    public int hashCode() {
        return Integer.hashCode(this.f87737d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.inventory_excess_inventory_message, Integer.valueOf(this.f87737d));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri… excessInventoryQuantity)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.inventory_excess_inventory_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…y_excess_inventory_title)");
        return string;
    }

    public String toString() {
        int i = this.f87737d;
        return "ExcessInventory(excessInventoryQuantity=" + i + ")";
    }
}
