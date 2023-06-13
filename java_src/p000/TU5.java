package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.FlightSheetBadge;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b-\u0010.Jw\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006/"}, m28432d2 = {"LTU5;", "", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "batteryLevel", "", "battery", "ratingAverage", "lastLocatedAt", "Lco/bird/android/model/constant/BirdLocationSource;", "lastLocatedSource", "markerLabel", "", "Lco/bird/android/model/constant/FlightSheetBadge;", "badges", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/constant/BirdModel;", "i", "()Lco/bird/android/model/constant/BirdModel;", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "j", "f", "g", "Lco/bird/android/model/constant/BirdLocationSource;", "()Lco/bird/android/model/constant/BirdLocationSource;", "h", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;ILjava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Lco/bird/android/model/constant/BirdLocationSource;Ljava/lang/String;Ljava/util/List;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TU5 */
/* loaded from: classes3.dex */
public final class TU5 {

    /* renamed from: a */
    public final BirdModel f35544a;

    /* renamed from: b */
    public final String f35545b;

    /* renamed from: c */
    public final int f35546c;

    /* renamed from: d */
    public final CharSequence f35547d;

    /* renamed from: e */
    public final String f35548e;

    /* renamed from: f */
    public final CharSequence f35549f;

    /* renamed from: g */
    public final BirdLocationSource f35550g;

    /* renamed from: h */
    public final String f35551h;

    /* renamed from: i */
    public final List<FlightSheetBadge> f35552i;

    /* JADX WARN: Multi-variable type inference failed */
    public TU5(BirdModel birdModel, String str, int i, CharSequence charSequence, String str2, CharSequence charSequence2, BirdLocationSource birdLocationSource, String str3, List<? extends FlightSheetBadge> badges) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f35544a = birdModel;
        this.f35545b = str;
        this.f35546c = i;
        this.f35547d = charSequence;
        this.f35548e = str2;
        this.f35549f = charSequence2;
        this.f35550g = birdLocationSource;
        this.f35551h = str3;
        this.f35552i = badges;
    }

    /* renamed from: a */
    public final TU5 m83571a(BirdModel birdModel, String str, int i, CharSequence charSequence, String str2, CharSequence charSequence2, BirdLocationSource birdLocationSource, String str3, List<? extends FlightSheetBadge> badges) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new TU5(birdModel, str, i, charSequence, str2, charSequence2, birdLocationSource, str3, badges);
    }

    /* renamed from: b */
    public final List<FlightSheetBadge> m83570b() {
        return this.f35552i;
    }

    /* renamed from: c */
    public final CharSequence m83569c() {
        return this.f35547d;
    }

    /* renamed from: d */
    public final int m83568d() {
        return this.f35546c;
    }

    /* renamed from: e */
    public final String m83567e() {
        return this.f35545b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TU5) {
            TU5 tu5 = (TU5) obj;
            return this.f35544a == tu5.f35544a && Intrinsics.areEqual(this.f35545b, tu5.f35545b) && this.f35546c == tu5.f35546c && Intrinsics.areEqual(this.f35547d, tu5.f35547d) && Intrinsics.areEqual(this.f35548e, tu5.f35548e) && Intrinsics.areEqual(this.f35549f, tu5.f35549f) && this.f35550g == tu5.f35550g && Intrinsics.areEqual(this.f35551h, tu5.f35551h) && Intrinsics.areEqual(this.f35552i, tu5.f35552i);
        }
        return false;
    }

    /* renamed from: f */
    public final CharSequence m83566f() {
        return this.f35549f;
    }

    /* renamed from: g */
    public final BirdLocationSource m83565g() {
        return this.f35550g;
    }

    /* renamed from: h */
    public final String m83564h() {
        return this.f35551h;
    }

    public int hashCode() {
        BirdModel birdModel = this.f35544a;
        int hashCode = (birdModel == null ? 0 : birdModel.hashCode()) * 31;
        String str = this.f35545b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f35546c)) * 31;
        CharSequence charSequence = this.f35547d;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f35548e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence2 = this.f35549f;
        int hashCode5 = (hashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        BirdLocationSource birdLocationSource = this.f35550g;
        int hashCode6 = (hashCode5 + (birdLocationSource == null ? 0 : birdLocationSource.hashCode())) * 31;
        String str3 = this.f35551h;
        return ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f35552i.hashCode();
    }

    /* renamed from: i */
    public final BirdModel m83563i() {
        return this.f35544a;
    }

    /* renamed from: j */
    public final String m83562j() {
        return this.f35548e;
    }

    public String toString() {
        BirdModel birdModel = this.f35544a;
        String str = this.f35545b;
        int i = this.f35546c;
        CharSequence charSequence = this.f35547d;
        String str2 = this.f35548e;
        CharSequence charSequence2 = this.f35549f;
        BirdLocationSource birdLocationSource = this.f35550g;
        String str3 = this.f35551h;
        List<FlightSheetBadge> list = this.f35552i;
        return "SummaryViewModel(model=" + birdModel + ", code=" + str + ", batteryLevel=" + i + ", battery=" + ((Object) charSequence) + ", ratingAverage=" + str2 + ", lastLocatedAt=" + ((Object) charSequence2) + ", lastLocatedSource=" + birdLocationSource + ", markerLabel=" + str3 + ", badges=" + list + ")";
    }
}
