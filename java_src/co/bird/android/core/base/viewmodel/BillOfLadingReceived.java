package co.bird.android.core.base.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/BillOfLadingReceived;", "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Landroid/graphics/drawable/Drawable;", "g", "j", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "i", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "", "Z", "c", "()Z", "icon1Padding", "k", "b", "icon1Background", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BillOfLadingReceived extends BottomSheetAlertDialog {

    /* renamed from: i */
    public static final Integer f63046i = null;

    /* renamed from: j */
    public static final boolean f63047j = false;

    /* renamed from: k */
    public static final boolean f63048k = false;

    /* renamed from: h */
    public static final BillOfLadingReceived f63045h = new BillOfLadingReceived();
    public static final Parcelable.Creator<BillOfLadingReceived> CREATOR = new C14445a();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.core.base.viewmodel.BillOfLadingReceived$a */
    /* loaded from: classes2.dex */
    public static final class C14445a implements Parcelable.Creator<BillOfLadingReceived> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BillOfLadingReceived createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return BillOfLadingReceived.f63045h;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final BillOfLadingReceived[] newArray(int i) {
            return new BillOfLadingReceived[i];
        }
    }

    private BillOfLadingReceived() {
        super(null);
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: b */
    public boolean mo59022b() {
        return f63048k;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: c */
    public boolean mo59021c() {
        return f63047j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: g */
    public Drawable mo59005g(Context context) {
        Drawable mutate;
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable m94299e = NA0.m94299e(context, C48193rg4.ic_check_circle);
        if (m94299e != null && (mutate = m94299e.mutate()) != null) {
            mutate.setTint(NA0.m94301c(context, C32364Df4.birdGreen));
            return mutate;
        }
        return null;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return f63046i;
    }

    @Override // co.bird.android.core.base.viewmodel.BottomSheetAlertDialog
    /* renamed from: j */
    public Drawable mo59004j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.process_container_outbound_body);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_container_outbound_body)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.process_container_outbound_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…container_outbound_title)");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }
}
