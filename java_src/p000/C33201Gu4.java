package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LGu4;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "intoNest", "", "count", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Z", "getIntoNest", "()Z", "e", "I", "getCount", "()I", "f", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(ZI)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gu4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33201Gu4 extends AbstractC5751Ny {

    /* renamed from: d */
    public final boolean f12606d;

    /* renamed from: e */
    public final int f12607e;

    /* renamed from: f */
    public final int f12608f;

    public C33201Gu4(boolean z, int i) {
        super(null);
        this.f12606d = z;
        this.f12607e = i;
        this.f12608f = C45871nl4.confirm_action;
    }

    public static /* synthetic */ C33201Gu4 copy$default(C33201Gu4 c33201Gu4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c33201Gu4.f12606d;
        }
        if ((i2 & 2) != 0) {
            i = c33201Gu4.f12607e;
        }
        return c33201Gu4.m104599b(z, i);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f12608f);
    }

    /* renamed from: b */
    public final C33201Gu4 m104599b(boolean z, int i) {
        return new C33201Gu4(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33201Gu4) {
            C33201Gu4 c33201Gu4 = (C33201Gu4) obj;
            return this.f12606d == c33201Gu4.f12606d && this.f12607e == c33201Gu4.f12607e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f12606d;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.f12607e);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f12606d) {
            i = C45871nl4.confirm_release_body_format;
        } else {
            i = C45871nl4.confirm_release_anywhere_body_format;
        }
        String string = context.getString(i, Integer.valueOf(this.f12607e));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …format,\n      count\n    )");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.confirm_release_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.confirm_release_title)");
        return string;
    }

    public String toString() {
        boolean z = this.f12606d;
        int i = this.f12607e;
        return "ReleaseConfirmation(intoNest=" + z + ", count=" + i + ")";
    }
}
