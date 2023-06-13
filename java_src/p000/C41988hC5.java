package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LhC5;", "", "Landroid/graphics/drawable/Drawable;", "skuDrawable", "", "skuIdentifier", "itemId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41988hC5 {

    /* renamed from: a */
    public final Drawable f84852a;

    /* renamed from: b */
    public final String f84853b;

    /* renamed from: c */
    public final String f84854c;

    public C41988hC5(Drawable drawable, String skuIdentifier, String itemId) {
        Intrinsics.checkNotNullParameter(skuIdentifier, "skuIdentifier");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f84852a = drawable;
        this.f84853b = skuIdentifier;
        this.f84854c = itemId;
    }

    public static /* synthetic */ C41988hC5 copy$default(C41988hC5 c41988hC5, Drawable drawable, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = c41988hC5.f84852a;
        }
        if ((i & 2) != 0) {
            str = c41988hC5.f84853b;
        }
        if ((i & 4) != 0) {
            str2 = c41988hC5.f84854c;
        }
        return c41988hC5.m36628a(drawable, str, str2);
    }

    /* renamed from: a */
    public final C41988hC5 m36628a(Drawable drawable, String skuIdentifier, String itemId) {
        Intrinsics.checkNotNullParameter(skuIdentifier, "skuIdentifier");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return new C41988hC5(drawable, skuIdentifier, itemId);
    }

    /* renamed from: b */
    public final String m36627b() {
        return this.f84854c;
    }

    /* renamed from: c */
    public final Drawable m36626c() {
        return this.f84852a;
    }

    /* renamed from: d */
    public final String m36625d() {
        return this.f84853b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41988hC5) {
            C41988hC5 c41988hC5 = (C41988hC5) obj;
            return Intrinsics.areEqual(this.f84852a, c41988hC5.f84852a) && Intrinsics.areEqual(this.f84853b, c41988hC5.f84853b) && Intrinsics.areEqual(this.f84854c, c41988hC5.f84854c);
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = this.f84852a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f84853b.hashCode()) * 31) + this.f84854c.hashCode();
    }

    public String toString() {
        Drawable drawable = this.f84852a;
        String str = this.f84853b;
        String str2 = this.f84854c;
        return "SkuMissingViewModel(skuDrawable=" + drawable + ", skuIdentifier=" + str + ", itemId=" + str2 + ")";
    }

    public /* synthetic */ C41988hC5(Drawable drawable, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : drawable, str, str2);
    }
}
