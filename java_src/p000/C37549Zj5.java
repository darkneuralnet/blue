package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"LZj5;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "min", "max", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getMin", "()I", "e", "getMax", "<init>", "(II)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zj5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37549Zj5 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f49006d;

    /* renamed from: e */
    public final int f49007e;

    public C37549Zj5(int i, int i2) {
        super(null);
        this.f49006d = i;
        this.f49007e = i2;
    }

    public static /* synthetic */ C37549Zj5 copy$default(C37549Zj5 c37549Zj5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c37549Zj5.f49006d;
        }
        if ((i3 & 2) != 0) {
            i2 = c37549Zj5.f49007e;
        }
        return c37549Zj5.m72644b(i, i2);
    }

    /* renamed from: b */
    public final C37549Zj5 m72644b(int i, int i2) {
        return new C37549Zj5(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37549Zj5) {
            C37549Zj5 c37549Zj5 = (C37549Zj5) obj;
            return this.f49006d == c37549Zj5.f49006d && this.f49007e == c37549Zj5.f49007e;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f49006d) * 31) + Integer.hashCode(this.f49007e);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_enter_code_content_updated, Integer.valueOf(this.f49006d), Integer.valueOf(this.f49007e));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ontent_updated, min, max)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_enter_code_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…an_bird_enter_code_title)");
        return string;
    }

    public String toString() {
        int i = this.f49006d;
        int i2 = this.f49007e;
        return "ScanEnterCode(min=" + i + ", max=" + i2 + ")";
    }
}
