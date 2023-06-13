package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LR32;", "", "Landroid/graphics/drawable/Drawable;", "icon", "", "message", "modelIcon", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: R32 */
/* loaded from: classes3.dex */
public final class R32 {

    /* renamed from: a */
    public final Drawable f31451a;

    /* renamed from: b */
    public final String f31452b;

    /* renamed from: c */
    public final Drawable f31453c;

    public R32(Drawable drawable, String str, Drawable drawable2) {
        this.f31451a = drawable;
        this.f31452b = str;
        this.f31453c = drawable2;
    }

    public static /* synthetic */ R32 copy$default(R32 r32, Drawable drawable, String str, Drawable drawable2, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = r32.f31451a;
        }
        if ((i & 2) != 0) {
            str = r32.f31452b;
        }
        if ((i & 4) != 0) {
            drawable2 = r32.f31453c;
        }
        return r32.m87371a(drawable, str, drawable2);
    }

    /* renamed from: a */
    public final R32 m87371a(Drawable drawable, String str, Drawable drawable2) {
        return new R32(drawable, str, drawable2);
    }

    /* renamed from: b */
    public final Drawable m87370b() {
        return this.f31451a;
    }

    /* renamed from: c */
    public final String m87369c() {
        return this.f31452b;
    }

    /* renamed from: d */
    public final Drawable m87368d() {
        return this.f31453c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R32) {
            R32 r32 = (R32) obj;
            return Intrinsics.areEqual(this.f31451a, r32.f31451a) && Intrinsics.areEqual(this.f31452b, r32.f31452b) && Intrinsics.areEqual(this.f31453c, r32.f31453c);
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = this.f31451a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        String str = this.f31452b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable2 = this.f31453c;
        return hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public String toString() {
        Drawable drawable = this.f31451a;
        String str = this.f31452b;
        Drawable drawable2 = this.f31453c;
        return "InspectionCompleteViewModel(icon=" + drawable + ", message=" + str + ", modelIcon=" + drawable2 + ")";
    }
}
