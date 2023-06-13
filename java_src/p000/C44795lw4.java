package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"Llw4;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "birdCode", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getBirdCode", "()Ljava/lang/String;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lw4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44795lw4 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f96991d;

    /* renamed from: e */
    public final int f96992e;

    /* renamed from: f */
    public final int f96993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44795lw4(String birdCode) {
        super(null);
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f96991d = birdCode;
        this.f96992e = C45871nl4.remove;
        this.f96993f = C45871nl4.option_sheet_cancel;
    }

    public static /* synthetic */ C44795lw4 copy$default(C44795lw4 c44795lw4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44795lw4.f96991d;
        }
        return c44795lw4.m26618b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f96992e);
    }

    /* renamed from: b */
    public final C44795lw4 m26618b(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        return new C44795lw4(birdCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44795lw4) && Intrinsics.areEqual(this.f96991d, ((C44795lw4) obj).f96991d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f96993f);
    }

    public int hashCode() {
        return this.f96991d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.bird_action_remove_from_list_dialog_message, this.f96991d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…dialog_message, birdCode)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.bird_action_remove_from_list_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…e_from_list_dialog_title)");
        return string;
    }

    public String toString() {
        String str = this.f96991d;
        return "RemoveItemFromBulkScannerListDialog(birdCode=" + str + ")";
    }
}
