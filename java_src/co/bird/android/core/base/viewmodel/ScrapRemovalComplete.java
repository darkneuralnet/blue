package co.bird.android.core.base.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\t\u0010\u0011\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nHÖ\u0001R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010$R\u001a\u0010,\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/ScrapRemovalComplete;", "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Landroid/graphics/drawable/Drawable;", "g", "j", "", "l", "(Landroid/content/Context;)Ljava/lang/Integer;", "k", "", "warehouse", "m", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "h", "Ljava/lang/String;", "getWarehouse", "()Ljava/lang/String;", "i", "I", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "Z", "e", "()Z", "icon2Padding", "<init>", "(Ljava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScrapRemovalComplete extends BottomSheetAlertDialog {
    public static final Parcelable.Creator<ScrapRemovalComplete> CREATOR = new C14449a();

    /* renamed from: h */
    public final String f63061h;

    /* renamed from: i */
    public final int f63062i;

    /* renamed from: j */
    public final Integer f63063j;

    /* renamed from: k */
    public final boolean f63064k;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.core.base.viewmodel.ScrapRemovalComplete$a */
    /* loaded from: classes2.dex */
    public static final class C14449a implements Parcelable.Creator<ScrapRemovalComplete> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ScrapRemovalComplete createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScrapRemovalComplete(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ScrapRemovalComplete[] newArray(int i) {
            return new ScrapRemovalComplete[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrapRemovalComplete(String warehouse) {
        super(null);
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        this.f63061h = warehouse;
        this.f63062i = C45871nl4.general_got_it;
    }

    public static /* synthetic */ ScrapRemovalComplete copy$default(ScrapRemovalComplete scrapRemovalComplete, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scrapRemovalComplete.f63061h;
        }
        return scrapRemovalComplete.m59008m(str);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f63062i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: e */
    public boolean mo59011e() {
        return this.f63064k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScrapRemovalComplete) && Intrinsics.areEqual(this.f63061h, ((ScrapRemovalComplete) obj).f63061h);
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: g */
    public Drawable mo59005g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C33309Hg4.illustration_bird_zero);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f63063j;
    }

    public int hashCode() {
        return this.f63061h.hashCode();
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: j */
    public Drawable mo59004j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return NA0.m94299e(context, C48193rg4.ic_check_circle);
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: k */
    public Integer mo59010k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(NA0.m94301c(context, C32364Df4.birdWhite));
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: l */
    public Integer mo59009l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(NA0.m94301c(context, C32364Df4.birdGreen));
    }

    /* renamed from: m */
    public final ScrapRemovalComplete m59008m(String warehouse) {
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        return new ScrapRemovalComplete(warehouse);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scrap_removal_complete_body, this.f63061h);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…complete_body, warehouse)");
        return C45097mS5.span$default(string, this.f63061h, null, 2, null);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scrap_removal_complete_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…p_removal_complete_title)");
        return string;
    }

    public String toString() {
        String str = this.f63061h;
        return "ScrapRemovalComplete(warehouse=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f63061h);
    }
}
