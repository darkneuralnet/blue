package p000;

import android.graphics.drawable.Drawable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lg40;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "message", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: g40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41312g40 {

    /* renamed from: a */
    public final Drawable f81518a;

    /* renamed from: b */
    public final CharSequence f81519b;

    public C41312g40(Drawable drawable, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f81518a = drawable;
        this.f81519b = message;
    }

    public static /* synthetic */ C41312g40 copy$default(C41312g40 c41312g40, Drawable drawable, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = c41312g40.f81518a;
        }
        if ((i & 2) != 0) {
            charSequence = c41312g40.f81519b;
        }
        return c41312g40.m40167a(drawable, charSequence);
    }

    /* renamed from: a */
    public final C41312g40 m40167a(Drawable drawable, CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new C41312g40(drawable, message);
    }

    /* renamed from: b */
    public final Drawable m40166b() {
        return this.f81518a;
    }

    /* renamed from: c */
    public final CharSequence m40165c() {
        return this.f81519b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41312g40) {
            C41312g40 c41312g40 = (C41312g40) obj;
            return Intrinsics.areEqual(this.f81518a, c41312g40.f81518a) && Intrinsics.areEqual(this.f81519b, c41312g40.f81519b);
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = this.f81518a;
        return ((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f81519b.hashCode();
    }

    public String toString() {
        Drawable drawable = this.f81518a;
        CharSequence charSequence = this.f81519b;
        return "BulkOperationStatusViewModel(drawable=" + drawable + ", message=" + ((Object) charSequence) + ")";
    }
}
