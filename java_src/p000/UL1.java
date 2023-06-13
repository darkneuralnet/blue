package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006%"}, m28432d2 = {"LUL1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "", "showLearnMore", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getMessage", "f", "Z", "getShowLearnMore", "()Z", "g", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "h", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UL1 */
/* loaded from: classes2.dex */
public final class UL1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f37266d;

    /* renamed from: e */
    public final String f37267e;

    /* renamed from: f */
    public final boolean f37268f;

    /* renamed from: g */
    public final Integer f37269g;

    /* renamed from: h */
    public final Integer f37270h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UL1(String title, String message, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f37266d = title;
        this.f37267e = message;
        this.f37268f = z;
        this.f37269g = Integer.valueOf(C45871nl4.general_got_it);
        this.f37270h = z ? Integer.valueOf(C45871nl4.learn_more) : null;
    }

    public static /* synthetic */ UL1 copy$default(UL1 ul1, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ul1.f37266d;
        }
        if ((i & 2) != 0) {
            str2 = ul1.f37267e;
        }
        if ((i & 4) != 0) {
            z = ul1.f37268f;
        }
        return ul1.m81619b(str, str2, z);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f37269g;
    }

    /* renamed from: b */
    public final UL1 m81619b(String title, String message, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new UL1(title, message, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UL1) {
            UL1 ul1 = (UL1) obj;
            return Intrinsics.areEqual(this.f37266d, ul1.f37266d) && Intrinsics.areEqual(this.f37267e, ul1.f37267e) && this.f37268f == ul1.f37268f;
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f37270h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f37266d.hashCode() * 31) + this.f37267e.hashCode()) * 31;
        boolean z = this.f37268f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f37267e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f37266d;
    }

    public String toString() {
        String str = this.f37266d;
        String str2 = this.f37267e;
        boolean z = this.f37268f;
        return "HibernationInfoMessage(title=" + str + ", message=" + str2 + ", showLearnMore=" + z + ")";
    }
}
