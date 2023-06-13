package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0007HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LDk6;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "warningMessage", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "f", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dk6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32411Dk6 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f6260d;

    /* renamed from: e */
    public final int f6261e;

    /* renamed from: f */
    public final int f6262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32411Dk6(String warningMessage) {
        super(null);
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
        this.f6260d = warningMessage;
        this.f6261e = C45871nl4.yes_uppercased;
        this.f6262f = C45871nl4.no_uppercased;
    }

    public static /* synthetic */ C32411Dk6 copy$default(C32411Dk6 c32411Dk6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c32411Dk6.f6260d;
        }
        return c32411Dk6.m109986b(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f6261e);
    }

    /* renamed from: b */
    public final C32411Dk6 m109986b(String warningMessage) {
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
        return new C32411Dk6(warningMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32411Dk6) && Intrinsics.areEqual(this.f6260d, ((C32411Dk6) obj).f6260d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(this.f6262f);
    }

    public int hashCode() {
        return this.f6260d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f6260d;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.vehicle_campaigns_display_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_campaigns_display_title)");
        return string;
    }

    public String toString() {
        String str = this.f6260d;
        return "VehicleCampaignDisputeConfirmation(warningMessage=" + str + ")";
    }
}
