package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireQuickLink;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lpd4;", "", "Lco/bird/android/model/wire/WireQuickLink;", C17296a.f69688o, "quickLink", "Landroid/graphics/drawable/Drawable;", "icon", "b", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireQuickLink;", "getQuickLink", "()Lco/bird/android/model/wire/WireQuickLink;", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "()Landroid/graphics/drawable/Drawable;", "c", "()Ljava/lang/String;", "display", "<init>", "(Lco/bird/android/model/wire/WireQuickLink;Landroid/graphics/drawable/Drawable;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46977pd4 {

    /* renamed from: a */
    public final WireQuickLink f103866a;

    /* renamed from: b */
    public final Drawable f103867b;

    public C46977pd4(WireQuickLink quickLink, Drawable drawable) {
        Intrinsics.checkNotNullParameter(quickLink, "quickLink");
        this.f103866a = quickLink;
        this.f103867b = drawable;
    }

    public static /* synthetic */ C46977pd4 copy$default(C46977pd4 c46977pd4, WireQuickLink wireQuickLink, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            wireQuickLink = c46977pd4.f103866a;
        }
        if ((i & 2) != 0) {
            drawable = c46977pd4.f103867b;
        }
        return c46977pd4.m19053b(wireQuickLink, drawable);
    }

    /* renamed from: a */
    public final WireQuickLink m19054a() {
        return this.f103866a;
    }

    /* renamed from: b */
    public final C46977pd4 m19053b(WireQuickLink quickLink, Drawable drawable) {
        Intrinsics.checkNotNullParameter(quickLink, "quickLink");
        return new C46977pd4(quickLink, drawable);
    }

    /* renamed from: c */
    public final String m19052c() {
        return this.f103866a.getDisplay();
    }

    /* renamed from: d */
    public final Drawable m19051d() {
        return this.f103867b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46977pd4) {
            C46977pd4 c46977pd4 = (C46977pd4) obj;
            return Intrinsics.areEqual(this.f103866a, c46977pd4.f103866a) && Intrinsics.areEqual(this.f103867b, c46977pd4.f103867b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f103866a.hashCode() * 31;
        Drawable drawable = this.f103867b;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        WireQuickLink wireQuickLink = this.f103866a;
        Drawable drawable = this.f103867b;
        return "QuickLinkViewModel(quickLink=" + wireQuickLink + ", icon=" + drawable + ")";
    }
}
