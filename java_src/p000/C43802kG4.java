package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006!"}, m28432d2 = {"LkG4;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Lco/bird/android/model/IdToolOption;", "option", "", "key", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/IdToolOption;", "e", "Ljava/lang/String;", "f", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "getNegativeText", "negativeText", "<init>", "(Lco/bird/android/model/IdToolOption;Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kG4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43802kG4 extends AbstractC5751Ny {

    /* renamed from: d */
    public final IdToolOption f94179d;

    /* renamed from: e */
    public final String f94180e;

    /* renamed from: f */
    public final int f94181f;

    /* renamed from: g */
    public final int f94182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43802kG4(IdToolOption option, String key) {
        super(null);
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f94179d = option;
        this.f94180e = key;
        this.f94181f = C45871nl4.dialog_id_tools_confirm_confirm;
        this.f94182g = C45871nl4.dialog_id_tools_confirm_cancel;
    }

    public static /* synthetic */ C43802kG4 copy$default(C43802kG4 c43802kG4, IdToolOption idToolOption, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            idToolOption = c43802kG4.f94179d;
        }
        if ((i & 2) != 0) {
            str = c43802kG4.f94180e;
        }
        return c43802kG4.m29110b(idToolOption, str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f94181f);
    }

    /* renamed from: b */
    public final C43802kG4 m29110b(IdToolOption option, String key) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(key, "key");
        return new C43802kG4(option, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43802kG4) {
            C43802kG4 c43802kG4 = (C43802kG4) obj;
            return this.f94179d == c43802kG4.f94179d && Intrinsics.areEqual(this.f94180e, c43802kG4.f94180e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f94182g);
    }

    public int hashCode() {
        return (this.f94179d.hashCode() * 31) + this.f94180e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        String m91143d;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C45871nl4.dialog_id_tools_confirm_replace_message;
        m91143d = C6212Oy.m91143d(this.f94179d, context);
        String string = context.getString(i, m91143d, this.f94180e);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …context),\n      key\n    )");
        return C45097mS5.span$default(string, this.f94180e, null, 2, null);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        String m91143d;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C45871nl4.dialog_id_tools_confirm_replace_title;
        m91143d = C6212Oy.m91143d(this.f94179d, context);
        String string = context.getString(i, m91143d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …tion.label(context)\n    )");
        return string;
    }

    public String toString() {
        IdToolOption idToolOption = this.f94179d;
        String str = this.f94180e;
        return "ReplaceConfirmationDialog(option=" + idToolOption + ", key=" + str + ")";
    }
}
