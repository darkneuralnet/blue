package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"Ljk5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "min", "max", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getMin", "()I", "e", "getMax", "<init>", "(II)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jk5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43490jk5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f93261d;

    /* renamed from: e */
    public final int f93262e;

    public C43490jk5(int i, int i2) {
        super(null);
        this.f93261d = i;
        this.f93262e = i2;
    }

    public static /* synthetic */ C43490jk5 copy$default(C43490jk5 c43490jk5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c43490jk5.f93261d;
        }
        if ((i3 & 2) != 0) {
            i2 = c43490jk5.f93262e;
        }
        return c43490jk5.m30007b(i, i2);
    }

    /* renamed from: b */
    public final C43490jk5 m30007b(int i, int i2) {
        return new C43490jk5(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43490jk5) {
            C43490jk5 c43490jk5 = (C43490jk5) obj;
            return this.f93261d == c43490jk5.f93261d && this.f93262e == c43490jk5.f93262e;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f93261d) * 31) + Integer.hashCode(this.f93262e);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_invalid_code_content_new, Integer.valueOf(this.f93261d), Integer.valueOf(this.f93262e));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…de_content_new, min, max)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_invalid_code_title_new);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…d_invalid_code_title_new)");
        return string;
    }

    public String toString() {
        int i = this.f93261d;
        int i2 = this.f93262e;
        return "ScanInvalidCode(min=" + i + ", max=" + i2 + ")";
    }
}
