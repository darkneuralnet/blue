package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"LJa6;", "", "", "imageUrl", "Landroid/graphics/drawable/Drawable;", "imageDrawable", "", "title", "body", "confirmationButton", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "()Landroid/graphics/drawable/Drawable;", "c", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ja6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33725Ja6 {

    /* renamed from: a */
    public final String f17878a;

    /* renamed from: b */
    public final Drawable f17879b;

    /* renamed from: c */
    public final CharSequence f17880c;

    /* renamed from: d */
    public final CharSequence f17881d;

    /* renamed from: e */
    public final String f17882e;

    public C33725Ja6(String str, Drawable drawable, CharSequence title, CharSequence body, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f17878a = str;
        this.f17879b = drawable;
        this.f17880c = title;
        this.f17881d = body;
        this.f17882e = str2;
        if (!((str == null && drawable == null) ? false : true)) {
            throw new IllegalArgumentException("Tutorial Page does not have an associated image".toString());
        }
    }

    public static /* synthetic */ C33725Ja6 copy$default(C33725Ja6 c33725Ja6, String str, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c33725Ja6.f17878a;
        }
        if ((i & 2) != 0) {
            drawable = c33725Ja6.f17879b;
        }
        Drawable drawable2 = drawable;
        if ((i & 4) != 0) {
            charSequence = c33725Ja6.f17880c;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 8) != 0) {
            charSequence2 = c33725Ja6.f17881d;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 16) != 0) {
            str2 = c33725Ja6.f17882e;
        }
        return c33725Ja6.m100177a(str, drawable2, charSequence3, charSequence4, str2);
    }

    /* renamed from: a */
    public final C33725Ja6 m100177a(String str, Drawable drawable, CharSequence title, CharSequence body, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new C33725Ja6(str, drawable, title, body, str2);
    }

    /* renamed from: b */
    public final CharSequence m100176b() {
        return this.f17881d;
    }

    /* renamed from: c */
    public final String m100175c() {
        return this.f17882e;
    }

    /* renamed from: d */
    public final Drawable m100174d() {
        return this.f17879b;
    }

    /* renamed from: e */
    public final String m100173e() {
        return this.f17878a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33725Ja6) {
            C33725Ja6 c33725Ja6 = (C33725Ja6) obj;
            return Intrinsics.areEqual(this.f17878a, c33725Ja6.f17878a) && Intrinsics.areEqual(this.f17879b, c33725Ja6.f17879b) && Intrinsics.areEqual(this.f17880c, c33725Ja6.f17880c) && Intrinsics.areEqual(this.f17881d, c33725Ja6.f17881d) && Intrinsics.areEqual(this.f17882e, c33725Ja6.f17882e);
        }
        return false;
    }

    /* renamed from: f */
    public final CharSequence m100172f() {
        return this.f17880c;
    }

    public int hashCode() {
        String str = this.f17878a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Drawable drawable = this.f17879b;
        int hashCode2 = (((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f17880c.hashCode()) * 31) + this.f17881d.hashCode()) * 31;
        String str2 = this.f17882e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f17878a;
        Drawable drawable = this.f17879b;
        CharSequence charSequence = this.f17880c;
        CharSequence charSequence2 = this.f17881d;
        String str2 = this.f17882e;
        return "TutorialPage(imageUrl=" + str + ", imageDrawable=" + drawable + ", title=" + ((Object) charSequence) + ", body=" + ((Object) charSequence2) + ", confirmationButton=" + str2 + ")";
    }

    public /* synthetic */ C33725Ja6(String str, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : drawable, charSequence, charSequence2, (i & 16) != 0 ? null : str2);
    }
}
