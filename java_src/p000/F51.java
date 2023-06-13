package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, m28432d2 = {"LF51;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Lco/bird/android/model/IdToolOption;", "option", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/IdToolOption;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(Lco/bird/android/model/IdToolOption;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F51 */
/* loaded from: classes2.dex */
public final class F51 extends AbstractC5751Ny {

    /* renamed from: d */
    public final IdToolOption f8702d;

    /* renamed from: e */
    public final int f8703e;

    /* renamed from: f */
    public final int f8704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F51(IdToolOption option) {
        super(null);
        Intrinsics.checkNotNullParameter(option, "option");
        this.f8702d = option;
        this.f8703e = C45871nl4.dialog_id_tools_confirm_confirm;
        this.f8704f = C45871nl4.dialog_id_tools_confirm_cancel;
    }

    public static /* synthetic */ F51 copy$default(F51 f51, IdToolOption idToolOption, int i, Object obj) {
        if ((i & 1) != 0) {
            idToolOption = f51.f8702d;
        }
        return f51.m107804b(idToolOption);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f8703e);
    }

    /* renamed from: b */
    public final F51 m107804b(IdToolOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return new F51(option);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F51) && this.f8702d == ((F51) obj).f8702d;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f8704f);
    }

    public int hashCode() {
        return this.f8702d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        String m91143d;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C45871nl4.dialog_id_tools_confirm_dissociation_message;
        m91143d = C6212Oy.m91143d(this.f8702d, context);
        String string = context.getString(i, m91143d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …tion.label(context)\n    )");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        String m91143d;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C45871nl4.dialog_id_tools_confirm_dissociation_title;
        m91143d = C6212Oy.m91143d(this.f8702d, context);
        String string = context.getString(i, m91143d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …tion.label(context)\n    )");
        return string;
    }

    public String toString() {
        IdToolOption idToolOption = this.f8702d;
        return "DissociationConfirmationDialog(option=" + idToolOption + ")";
    }
}
