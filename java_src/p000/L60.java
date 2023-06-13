package p000;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.response.OpsBatchJobActionKind;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001e¨\u0006&"}, m28432d2 = {"LL60;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "totalBirds", "Lco/bird/api/response/OpsBatchJobActionKind;", "actionKind", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "c", DateTokenConverter.CONVERTER_KEY, "I", "getTotalBirds", "()I", "e", "Lco/bird/api/response/OpsBatchJobActionKind;", "getActionKind", "()Lco/bird/api/response/OpsBatchJobActionKind;", "f", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(ILco/bird/api/response/OpsBatchJobActionKind;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L60 */
/* loaded from: classes2.dex */
public final class L60 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f20751d;

    /* renamed from: e */
    public final OpsBatchJobActionKind f20752e;

    /* renamed from: f */
    public final int f20753f;

    /* renamed from: g */
    public final Integer f20754g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L60$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C4735a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpsBatchJobActionKind.values().length];
            try {
                iArr[OpsBatchJobActionKind.WAKE_BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpsBatchJobActionKind.CHIRP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpsBatchJobActionKind.MARK_DAMAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpsBatchJobActionKind.MARK_FIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L60(int i, OpsBatchJobActionKind actionKind) {
        super(null);
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        this.f20751d = i;
        this.f20752e = actionKind;
        this.f20753f = C45871nl4.operator_bulk_scanner_update_button;
        this.f20754g = 17039360;
    }

    public static /* synthetic */ L60 copy$default(L60 l60, int i, OpsBatchJobActionKind opsBatchJobActionKind, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = l60.f20751d;
        }
        if ((i2 & 2) != 0) {
            opsBatchJobActionKind = l60.f20752e;
        }
        return l60.m97777b(i, opsBatchJobActionKind);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f20753f);
    }

    /* renamed from: b */
    public final L60 m97777b(int i, OpsBatchJobActionKind actionKind) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        return new L60(i, actionKind);
    }

    /* renamed from: c */
    public final int m97776c(OpsBatchJobActionKind opsBatchJobActionKind) {
        int i = C4735a.$EnumSwitchMapping$0[opsBatchJobActionKind.ordinal()];
        if (i != 3) {
            if (i != 4) {
                return C45871nl4.bird_action_unknown;
            }
            return C45871nl4.operator_bulk_update_mark_fixed_verb;
        }
        return C45871nl4.operator_bulk_update_mark_damaged_verb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L60) {
            L60 l60 = (L60) obj;
            return this.f20751d == l60.f20751d && this.f20752e == l60.f20752e;
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f20754g;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f20751d) * 31) + this.f20752e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C4735a.$EnumSwitchMapping$0[this.f20752e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                String string = context.getString(C45871nl4.operator_bulk_update_confirm_generic_message_formatted, Integer.valueOf(this.f20751d), context.getString(m97776c(this.f20752e)));
                Intrinsics.checkNotNullExpressionValue(string, "{\n        val actionStri…(actionStringId))\n      }");
                return string;
            }
            Resources resources = context.getResources();
            int i2 = C37089Xk4.operator_bulk_update_chirp_message;
            int i3 = this.f20751d;
            String quantityString = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
            Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…, totalBirds, totalBirds)");
            return quantityString;
        }
        String string2 = context.getString(C45871nl4.operator_bulk_update_wake_bluetooth_message, Integer.valueOf(this.f20751d));
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ooth_message, totalBirds)");
        return string2;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.operator_bulk_update_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ulk_update_confirm_title)");
        return string;
    }

    public String toString() {
        int i = this.f20751d;
        OpsBatchJobActionKind opsBatchJobActionKind = this.f20752e;
        return "BulkUpdateConfirmDialog(totalBirds=" + i + ", actionKind=" + opsBatchJobActionKind + ")";
    }
}
