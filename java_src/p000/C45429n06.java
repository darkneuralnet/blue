package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\t\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Ln06;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getMessage", "f", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: n06  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45429n06 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f99208d;

    /* renamed from: e */
    public final String f99209e;

    /* renamed from: f */
    public final Integer f99210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45429n06(String title, String message) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f99208d = title;
        this.f99209e = message;
    }

    public static /* synthetic */ C45429n06 copy$default(C45429n06 c45429n06, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45429n06.f99208d;
        }
        if ((i & 2) != 0) {
            str2 = c45429n06.f99209e;
        }
        return c45429n06.m24589b(str, str2);
    }

    /* renamed from: b */
    public final C45429n06 m24589b(String title, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        return new C45429n06(title, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45429n06) {
            C45429n06 c45429n06 = (C45429n06) obj;
            return Intrinsics.areEqual(this.f99208d, c45429n06.f99208d) && Intrinsics.areEqual(this.f99209e, c45429n06.f99209e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f99210f;
    }

    public int hashCode() {
        return (this.f99208d.hashCode() * 31) + this.f99209e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f99209e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f99208d;
    }

    public String toString() {
        String str = this.f99208d;
        String str2 = this.f99209e;
        return "TestRideStarted(title=" + str + ", message=" + str2 + ")";
    }
}
