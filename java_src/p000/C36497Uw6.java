package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001d¨\u0006%"}, m28432d2 = {"LUw6;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "birdsWoken", "birdsFailedToWake", "totalBirds", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getBirdsWoken", "()I", "e", "getBirdsFailedToWake", "f", "getTotalBirds", "g", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "h", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(III)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Uw6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36497Uw6 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f38304d;

    /* renamed from: e */
    public final int f38305e;

    /* renamed from: f */
    public final int f38306f;

    /* renamed from: g */
    public final int f38307g;

    /* renamed from: h */
    public final Integer f38308h;

    public C36497Uw6(int i, int i2, int i3) {
        super(null);
        this.f38304d = i;
        this.f38305e = i2;
        this.f38306f = i3;
        this.f38307g = 17039370;
    }

    public static /* synthetic */ C36497Uw6 copy$default(C36497Uw6 c36497Uw6, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = c36497Uw6.f38304d;
        }
        if ((i4 & 2) != 0) {
            i2 = c36497Uw6.f38305e;
        }
        if ((i4 & 4) != 0) {
            i3 = c36497Uw6.f38306f;
        }
        return c36497Uw6.m80589b(i, i2, i3);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f38307g);
    }

    /* renamed from: b */
    public final C36497Uw6 m80589b(int i, int i2, int i3) {
        return new C36497Uw6(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36497Uw6) {
            C36497Uw6 c36497Uw6 = (C36497Uw6) obj;
            return this.f38304d == c36497Uw6.f38304d && this.f38305e == c36497Uw6.f38305e && this.f38306f == c36497Uw6.f38306f;
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f38308h;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f38304d) * 31) + Integer.hashCode(this.f38305e)) * 31) + Integer.hashCode(this.f38306f);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C46464ol4.empty);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(LF.string.empty)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.birds_woken_stats_formatted, Integer.valueOf(this.f38304d), Integer.valueOf(this.f38305e), Integer.valueOf(this.f38306f));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…FailedToWake, totalBirds)");
        return string;
    }

    public String toString() {
        int i = this.f38304d;
        int i2 = this.f38305e;
        int i3 = this.f38306f;
        return "WakeFlockSuccess(birdsWoken=" + i + ", birdsFailedToWake=" + i2 + ", totalBirds=" + i3 + ")";
    }
}
