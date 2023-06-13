package co.bird.android.core.base.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\"¨\u0006("}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/UnmarkDamaged;", "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Landroid/graphics/drawable/Drawable;", "g", "j", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "m", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "h", "Lco/bird/android/model/constant/BirdModel;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "i", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "getNegativeText", "negativeText", "<init>", "(Lco/bird/android/model/constant/BirdModel;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UnmarkDamaged extends BottomSheetAlertDialog {
    public static final Parcelable.Creator<UnmarkDamaged> CREATOR = new C14450a();

    /* renamed from: h */
    public final BirdModel f63065h;

    /* renamed from: i */
    public final Integer f63066i;

    /* renamed from: j */
    public final Integer f63067j;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.core.base.viewmodel.UnmarkDamaged$a */
    /* loaded from: classes2.dex */
    public static final class C14450a implements Parcelable.Creator<UnmarkDamaged> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final UnmarkDamaged createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnmarkDamaged(BirdModel.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final UnmarkDamaged[] newArray(int i) {
            return new UnmarkDamaged[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmarkDamaged(BirdModel model) {
        super(null);
        Intrinsics.checkNotNullParameter(model, "model");
        this.f63065h = model;
        this.f63066i = Integer.valueOf(C45871nl4.flight_sheet_unmark_damaged_confirm);
        this.f63067j = Integer.valueOf(C45871nl4.general_cancel_button);
    }

    public static /* synthetic */ UnmarkDamaged copy$default(UnmarkDamaged unmarkDamaged, BirdModel birdModel, int i, Object obj) {
        if ((i & 1) != 0) {
            birdModel = unmarkDamaged.f63065h;
        }
        return unmarkDamaged.m59003m(birdModel);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f63066i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnmarkDamaged) && this.f63065h == ((UnmarkDamaged) obj).f63065h;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: g */
    public Drawable mo59005g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C6327PM.m90445a(this.f63065h, context);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f63067j;
    }

    public int hashCode() {
        return this.f63065h.hashCode();
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: j */
    public Drawable mo59004j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* renamed from: m */
    public final UnmarkDamaged m59003m(BirdModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new UnmarkDamaged(model);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.flight_sheet_unmark_damaged_message);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…t_unmark_damaged_message)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.flight_sheet_unmark_damaged_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…eet_unmark_damaged_title)");
        return string;
    }

    public String toString() {
        BirdModel birdModel = this.f63065h;
        return "UnmarkDamaged(model=" + birdModel + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f63065h.name());
    }
}
