package p000;

import android.text.Spannable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LHH1;", "", "", "ctaLabel", "headerLabel", "Landroid/text/Spannable;", "statusSpannable", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Landroid/text/Spannable;", DateTokenConverter.CONVERTER_KEY, "()Landroid/text/Spannable;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/text/Spannable;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HH1 */
/* loaded from: classes3.dex */
public final class HH1 {

    /* renamed from: a */
    public final String f13225a;

    /* renamed from: b */
    public final String f13226b;

    /* renamed from: c */
    public final Spannable f13227c;

    public HH1(String str, String headerLabel, Spannable statusSpannable) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(statusSpannable, "statusSpannable");
        this.f13225a = str;
        this.f13226b = headerLabel;
        this.f13227c = statusSpannable;
    }

    public static /* synthetic */ HH1 copy$default(HH1 hh1, String str, String str2, Spannable spannable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hh1.f13225a;
        }
        if ((i & 2) != 0) {
            str2 = hh1.f13226b;
        }
        if ((i & 4) != 0) {
            spannable = hh1.f13227c;
        }
        return hh1.m104065a(str, str2, spannable);
    }

    /* renamed from: a */
    public final HH1 m104065a(String str, String headerLabel, Spannable statusSpannable) {
        Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
        Intrinsics.checkNotNullParameter(statusSpannable, "statusSpannable");
        return new HH1(str, headerLabel, statusSpannable);
    }

    /* renamed from: b */
    public final String m104064b() {
        return this.f13225a;
    }

    /* renamed from: c */
    public final String m104063c() {
        return this.f13226b;
    }

    /* renamed from: d */
    public final Spannable m104062d() {
        return this.f13227c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HH1) {
            HH1 hh1 = (HH1) obj;
            return Intrinsics.areEqual(this.f13225a, hh1.f13225a) && Intrinsics.areEqual(this.f13226b, hh1.f13226b) && Intrinsics.areEqual(this.f13227c, hh1.f13227c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f13225a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f13226b.hashCode()) * 31) + this.f13227c.hashCode();
    }

    public String toString() {
        String str = this.f13225a;
        String str2 = this.f13226b;
        Spannable spannable = this.f13227c;
        return "HeaderSpannableStatusCTAViewModel(ctaLabel=" + str + ", headerLabel=" + str2 + ", statusSpannable=" + ((Object) spannable) + ")";
    }

    public /* synthetic */ HH1(String str, String str2, Spannable spannable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, spannable);
    }
}
