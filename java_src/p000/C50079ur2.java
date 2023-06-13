package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lur2;", "", "", "b", "headerLabel", "", "description", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ur2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50079ur2 {

    /* renamed from: a */
    public final String f113077a;

    /* renamed from: b */
    public final CharSequence f113078b;

    public C50079ur2(String headerLabel, CharSequence description) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f113077a = headerLabel;
        this.f113078b = description;
    }

    public static /* synthetic */ C50079ur2 copy$default(C50079ur2 c50079ur2, String str, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50079ur2.f113077a;
        }
        if ((i & 2) != 0) {
            charSequence = c50079ur2.f113078b;
        }
        return c50079ur2.m9655a(str, charSequence);
    }

    /* renamed from: a */
    public final C50079ur2 m9655a(String headerLabel, CharSequence description) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(description, "description");
        return new C50079ur2(headerLabel, description);
    }

    /* renamed from: b */
    public final String m9654b() {
        String str = this.f113077a;
        CharSequence charSequence = this.f113078b;
        return str + ((Object) charSequence);
    }

    /* renamed from: c */
    public final CharSequence m9653c() {
        return this.f113078b;
    }

    /* renamed from: d */
    public final String m9652d() {
        return this.f113077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50079ur2) {
            C50079ur2 c50079ur2 = (C50079ur2) obj;
            return Intrinsics.areEqual(this.f113077a, c50079ur2.f113077a) && Intrinsics.areEqual(this.f113078b, c50079ur2.f113078b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f113077a.hashCode() * 31) + this.f113078b.hashCode();
    }

    public String toString() {
        String str = this.f113077a;
        CharSequence charSequence = this.f113078b;
        return "LineItemViewModel(headerLabel=" + str + ", description=" + ((Object) charSequence) + ")";
    }
}
