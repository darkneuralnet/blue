package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LHu4;", "", "", "count", "releaseTitle", "", "releaseEnabled", "Landroid/graphics/drawable/Drawable;", "icon", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroid/graphics/drawable/Drawable;)V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33435Hu4 {

    /* renamed from: a */
    public final String f14165a;

    /* renamed from: b */
    public final String f14166b;

    /* renamed from: c */
    public final boolean f14167c;

    /* renamed from: d */
    public final Drawable f14168d;

    public C33435Hu4(String count, String releaseTitle, boolean z, Drawable drawable) {
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(releaseTitle, "releaseTitle");
        this.f14165a = count;
        this.f14166b = releaseTitle;
        this.f14167c = z;
        this.f14168d = drawable;
    }

    public static /* synthetic */ C33435Hu4 copy$default(C33435Hu4 c33435Hu4, String str, String str2, boolean z, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33435Hu4.f14165a;
        }
        if ((i & 2) != 0) {
            str2 = c33435Hu4.f14166b;
        }
        if ((i & 4) != 0) {
            z = c33435Hu4.f14167c;
        }
        if ((i & 8) != 0) {
            drawable = c33435Hu4.f14168d;
        }
        return c33435Hu4.m103233a(str, str2, z, drawable);
    }

    /* renamed from: a */
    public final C33435Hu4 m103233a(String count, String releaseTitle, boolean z, Drawable drawable) {
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(releaseTitle, "releaseTitle");
        return new C33435Hu4(count, releaseTitle, z, drawable);
    }

    /* renamed from: b */
    public final String m103232b() {
        return this.f14165a;
    }

    /* renamed from: c */
    public final Drawable m103231c() {
        return this.f14168d;
    }

    /* renamed from: d */
    public final boolean m103230d() {
        return this.f14167c;
    }

    /* renamed from: e */
    public final String m103229e() {
        return this.f14166b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33435Hu4) {
            C33435Hu4 c33435Hu4 = (C33435Hu4) obj;
            return Intrinsics.areEqual(this.f14165a, c33435Hu4.f14165a) && Intrinsics.areEqual(this.f14166b, c33435Hu4.f14166b) && this.f14167c == c33435Hu4.f14167c && Intrinsics.areEqual(this.f14168d, c33435Hu4.f14168d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f14165a.hashCode() * 31) + this.f14166b.hashCode()) * 31;
        boolean z = this.f14167c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Drawable drawable = this.f14168d;
        return i2 + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        String str = this.f14165a;
        String str2 = this.f14166b;
        boolean z = this.f14167c;
        Drawable drawable = this.f14168d;
        return "ReleaseHeaderViewModel(count=" + str + ", releaseTitle=" + str2 + ", releaseEnabled=" + z + ", icon=" + drawable + ")";
    }
}
