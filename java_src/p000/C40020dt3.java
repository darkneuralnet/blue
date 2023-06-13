package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Ldt3;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "birdCode", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getBirdCode", "()Ljava/lang/String;", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dt3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40020dt3 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f77344d;

    /* renamed from: e */
    public final Integer f77345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40020dt3(String birdCode) {
        super(null);
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f77344d = birdCode;
        this.f77345e = Integer.valueOf(C45871nl4.transfer_orders_reject_vehicle_button);
    }

    public static /* synthetic */ C40020dt3 copy$default(C40020dt3 c40020dt3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40020dt3.f77344d;
        }
        return c40020dt3.m43550b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f77345e;
    }

    /* renamed from: b */
    public final C40020dt3 m43550b(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        return new C40020dt3(birdCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40020dt3) && Intrinsics.areEqual(this.f77344d, ((C40020dt3) obj).f77344d);
    }

    public int hashCode() {
        return this.f77344d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_orders_reject_vehicle_instruction_body, this.f77344d);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…struction_body, birdCode)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.transfer_orders_reject_vehicle_instruction_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ehicle_instruction_title)");
        return string;
    }

    public String toString() {
        String str = this.f77344d;
        return "OperatorScanRejectConfirmation(birdCode=" + str + ")";
    }
}
