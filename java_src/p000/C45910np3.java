package p000;

import android.graphics.drawable.Drawable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lnp3;", "", "Landroid/graphics/drawable/Drawable;", "icon", "", "title", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: np3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45910np3 {

    /* renamed from: a */
    public final Drawable f100884a;

    /* renamed from: b */
    public final String f100885b;

    public C45910np3(Drawable drawable, String str) {
        this.f100884a = drawable;
        this.f100885b = str;
    }

    public static /* synthetic */ C45910np3 copy$default(C45910np3 c45910np3, Drawable drawable, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = c45910np3.f100884a;
        }
        if ((i & 2) != 0) {
            str = c45910np3.f100885b;
        }
        return c45910np3.m22336a(drawable, str);
    }

    /* renamed from: a */
    public final C45910np3 m22336a(Drawable drawable, String str) {
        return new C45910np3(drawable, str);
    }

    /* renamed from: b */
    public final Drawable m22335b() {
        return this.f100884a;
    }

    /* renamed from: c */
    public final String m22334c() {
        return this.f100885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45910np3) {
            C45910np3 c45910np3 = (C45910np3) obj;
            return Intrinsics.areEqual(this.f100884a, c45910np3.f100884a) && Intrinsics.areEqual(this.f100885b, c45910np3.f100885b);
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = this.f100884a;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        String str = this.f100885b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Drawable drawable = this.f100884a;
        String str = this.f100885b;
        return "OperatorOrderHeaderViewModel(icon=" + drawable + ", title=" + str + ")";
    }
}
