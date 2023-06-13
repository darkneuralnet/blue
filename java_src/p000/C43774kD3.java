package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LkD3;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "birdCode", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kD3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43774kD3 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f94089d;

    /* renamed from: e */
    public final int f94090e;

    /* renamed from: f */
    public final int f94091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43774kD3(String birdCode) {
        super(null);
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f94089d = birdCode;
        this.f94090e = C45871nl4.yes_uppercased;
        this.f94091f = C45871nl4.general_not_now;
    }

    public static /* synthetic */ C43774kD3 copy$default(C43774kD3 c43774kD3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43774kD3.f94089d;
        }
        return c43774kD3.m29187b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f94090e);
    }

    /* renamed from: b */
    public final C43774kD3 m29187b(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        return new C43774kD3(birdCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43774kD3) && Intrinsics.areEqual(this.f94089d, ((C43774kD3) obj).f94089d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f94091f);
    }

    public int hashCode() {
        return this.f94089d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.accept_task_confirmation_body_owner, this.f94089d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ion_body_owner, birdCode)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.accept_task_confirmation_title_owner, this.f94089d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…on_title_owner, birdCode)");
        return string;
    }

    public String toString() {
        String str = this.f94089d;
        return "OwnerAcceptTaskConfirmation(birdCode=" + str + ")";
    }
}
