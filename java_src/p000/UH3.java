package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001a¨\u0006$"}, m28432d2 = {"LUH3;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "resultRequired", "", "messageResId", "b", "(ZLjava/lang/Integer;)LUH3;", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", DateTokenConverter.CONVERTER_KEY, "Z", "getResultRequired", "()Z", "e", "Ljava/lang/Integer;", "getMessageResId", "()Ljava/lang/Integer;", "f", "I", C17296a.f69688o, "positiveText", "g", "getNegativeText", "negativeText", "<init>", "(ZLjava/lang/Integer;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAlertDialog.kt\nco/bird/android/core/base/viewmodel/ParkingVerificationTimeoutDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2131:1\n1#2:2132\n*E\n"})
/* renamed from: UH3 */
/* loaded from: classes2.dex */
public final class UH3 extends AbstractC5751Ny {

    /* renamed from: d */
    public final boolean f37177d;

    /* renamed from: e */
    public final Integer f37178e;

    /* renamed from: f */
    public final int f37179f;

    /* renamed from: g */
    public final int f37180g;

    public /* synthetic */ UH3(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? Integer.valueOf(C45871nl4.scan_surroundings_timeout_description) : num);
    }

    public static /* synthetic */ UH3 copy$default(UH3 uh3, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uh3.f37177d;
        }
        if ((i & 2) != 0) {
            num = uh3.f37178e;
        }
        return uh3.m81688b(z, num);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f37179f);
    }

    /* renamed from: b */
    public final UH3 m81688b(boolean z, Integer num) {
        return new UH3(z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UH3) {
            UH3 uh3 = (UH3) obj;
            return this.f37177d == uh3.f37177d && Intrinsics.areEqual(this.f37178e, uh3.f37178e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f37180g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f37177d;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.f37178e;
        return i + (num == null ? 0 : num.hashCode());
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = this.f37178e;
        if (num != null) {
            str = context.getString(num.intValue());
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_surroundings_timeout_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rroundings_timeout_title)");
        return string;
    }

    public String toString() {
        boolean z = this.f37177d;
        Integer num = this.f37178e;
        return "ParkingVerificationTimeoutDialog(resultRequired=" + z + ", messageResId=" + num + ")";
    }

    public UH3(boolean z, Integer num) {
        super(null);
        int i;
        this.f37177d = z;
        this.f37178e = num;
        this.f37179f = C45871nl4.id_tools_status_try_again;
        if (z) {
            i = C45871nl4.ride_continue_dialog_yes;
        } else {
            i = C45871nl4.ar_location_finish_without_result;
        }
        this.f37180g = i;
    }
}
