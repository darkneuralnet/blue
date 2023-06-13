package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LNI4;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "feature", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NI4 */
/* loaded from: classes2.dex */
public final class NI4 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f24417d;

    /* renamed from: e */
    public final Integer f24418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NI4(String feature) {
        super(null);
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f24417d = feature;
    }

    public static /* synthetic */ NI4 copy$default(NI4 ni4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ni4.f24417d;
        }
        return ni4.m94072b(str);
    }

    /* renamed from: b */
    public final NI4 m94072b(String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return new NI4(feature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NI4) && Intrinsics.areEqual(this.f24417d, ((NI4) obj).f24417d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f24418e;
    }

    public int hashCode() {
        return this.f24417d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.flight_sheet_missing_permission_alert_message, this.f24417d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…n_alert_message, feature)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.flight_sheet_missing_permission_alert_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…g_permission_alert_title)");
        return string;
    }

    public String toString() {
        String str = this.f24417d;
        return "RequestFeaturePermission(feature=" + str + ")";
    }
}
