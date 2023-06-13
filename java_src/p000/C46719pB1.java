package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c¨\u0006'"}, m28432d2 = {"LpB1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "", "positiveResId", "negativeRedId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)LpB1;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getMessage", "f", "Ljava/lang/Integer;", "getPositiveResId", "()Ljava/lang/Integer;", "g", "getNegativeRedId", "h", C17296a.f69688o, "positiveText", "i", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pB1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46719pB1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f103233d;

    /* renamed from: e */
    public final String f103234e;

    /* renamed from: f */
    public final Integer f103235f;

    /* renamed from: g */
    public final Integer f103236g;

    /* renamed from: h */
    public final Integer f103237h;

    /* renamed from: i */
    public final Integer f103238i;

    public /* synthetic */ C46719pB1(String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }

    public static /* synthetic */ C46719pB1 copy$default(C46719pB1 c46719pB1, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c46719pB1.f103233d;
        }
        if ((i & 2) != 0) {
            str2 = c46719pB1.f103234e;
        }
        if ((i & 4) != 0) {
            num = c46719pB1.f103235f;
        }
        if ((i & 8) != 0) {
            num2 = c46719pB1.f103236g;
        }
        return c46719pB1.m19845b(str, str2, num, num2);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f103237h;
    }

    /* renamed from: b */
    public final C46719pB1 m19845b(String title, String message, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new C46719pB1(title, message, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46719pB1) {
            C46719pB1 c46719pB1 = (C46719pB1) obj;
            return Intrinsics.areEqual(this.f103233d, c46719pB1.f103233d) && Intrinsics.areEqual(this.f103234e, c46719pB1.f103234e) && Intrinsics.areEqual(this.f103235f, c46719pB1.f103235f) && Intrinsics.areEqual(this.f103236g, c46719pB1.f103236g);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f103238i;
    }

    public int hashCode() {
        int hashCode = ((this.f103233d.hashCode() * 31) + this.f103234e.hashCode()) * 31;
        Integer num = this.f103235f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f103236g;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f103234e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f103233d;
    }

    public String toString() {
        String str = this.f103233d;
        String str2 = this.f103234e;
        Integer num = this.f103235f;
        Integer num2 = this.f103236g;
        return "GenericDialog(title=" + str + ", message=" + str2 + ", positiveResId=" + num + ", negativeRedId=" + num2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46719pB1(String title, String message, Integer num, Integer num2) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f103233d = title;
        this.f103234e = message;
        this.f103235f = num;
        this.f103236g = num2;
        this.f103237h = num;
        this.f103238i = num2;
    }
}
