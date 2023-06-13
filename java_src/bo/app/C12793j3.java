package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB-\b\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lbo/app/j3;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "backgroundColor", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "textColor", "c", "borderColor", "b", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lorg/json/JSONObject;", "buttonThemeJson", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.j3 */
/* loaded from: classes.dex */
public final class C12793j3 {

    /* renamed from: d */
    public static final C12794a f58723d = new C12794a(null);

    /* renamed from: a */
    private final Integer f58724a;

    /* renamed from: b */
    private final Integer f58725b;

    /* renamed from: c */
    private final Integer f58726c;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/j3$a;", "", "", "BACKGROUND_COLOR_KEY", "Ljava/lang/String;", "BORDER_COLOR_KEY", "TEXT_COLOR_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.j3$a */
    /* loaded from: classes.dex */
    public static final class C12794a {
        public /* synthetic */ C12794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12794a() {
        }
    }

    private C12793j3(Integer num, Integer num2, Integer num3) {
        this.f58724a = num;
        this.f58725b = num2;
        this.f58726c = num3;
    }

    /* renamed from: a */
    public final Integer m63486a() {
        return this.f58724a;
    }

    /* renamed from: b */
    public final Integer m63485b() {
        return this.f58726c;
    }

    /* renamed from: c */
    public final Integer m63484c() {
        return this.f58725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12793j3) {
            C12793j3 c12793j3 = (C12793j3) obj;
            return Intrinsics.areEqual(this.f58724a, c12793j3.f58724a) && Intrinsics.areEqual(this.f58725b, c12793j3.f58725b) && Intrinsics.areEqual(this.f58726c, c12793j3.f58726c);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f58724a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f58725b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f58726c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.f58724a + ", textColor=" + this.f58725b + ", borderColor=" + this.f58726c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12793j3(JSONObject buttonThemeJson) {
        this(C31696Aj2.m115353f(buttonThemeJson, "bg_color"), C31696Aj2.m115353f(buttonThemeJson, "text_color"), C31696Aj2.m115353f(buttonThemeJson, "border_color"));
        Intrinsics.checkNotNullParameter(buttonThemeJson, "buttonThemeJson");
    }
}
