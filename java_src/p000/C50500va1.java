package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lva1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "email", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "e", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: va1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50500va1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f114298d;

    /* renamed from: e */
    public final Integer f114299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50500va1(String email) {
        super(null);
        Intrinsics.checkNotNullParameter(email, "email");
        this.f114298d = email;
    }

    public static /* synthetic */ C50500va1 copy$default(C50500va1 c50500va1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50500va1.f114298d;
        }
        return c50500va1.m8437b(str);
    }

    /* renamed from: b */
    public final C50500va1 m8437b(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new C50500va1(email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50500va1) && Intrinsics.areEqual(this.f114298d, ((C50500va1) obj).f114298d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f114299e;
    }

    public int hashCode() {
        return this.f114298d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.settings_verify_email_dialog_content, this.f114298d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…il_dialog_content, email)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.settings_verify_email_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…erify_email_dialog_title)");
        return string;
    }

    public String toString() {
        String str = this.f114298d;
        return "EmailVerificationSent(email=" + str + ")";
    }
}
