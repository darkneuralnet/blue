package p000;

import android.content.res.Resources;
import android.icu.text.PluralRules;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"LDW3;", "", "<init>", "(Ljava/lang/String;I)V", "b", C17296a.f69688o, "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: DW3 */
/* loaded from: classes7.dex */
public enum DW3 {
    ZERO,
    ONE,
    TWO,
    FEW,
    MANY,
    OTHER;
    

    /* renamed from: b */
    public static final C1506a f5814b = new C1506a(null);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, m28432d2 = {"LDW3$a;", "", "Landroid/content/res/Resources;", "resources", "Ljava/util/Locale;", "locale", "", "quantity", "LDW3;", C17296a.f69688o, "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: DW3$a */
    /* loaded from: classes7.dex */
    public static final class C1506a {
        public /* synthetic */ C1506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DW3 m110307a(Resources resources, Locale locale, int i) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(locale, "locale");
            String fromQuantity$lambda$0 = PluralRules.forLocale(locale).select(i);
            Intrinsics.checkNotNullExpressionValue(fromQuantity$lambda$0, "fromQuantity$lambda$0");
            String upperCase = fromQuantity$lambda$0.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return DW3.valueOf(upperCase);
        }

        private C1506a() {
        }
    }
}
