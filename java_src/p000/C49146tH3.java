package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001c\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LtH3;", "LsH3;", "LxE;", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "evaluation", "", "nc", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "parkingPhoto", "c", "thumbImage", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "reason", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tH3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49146tH3 extends AbstractC30071xE implements InterfaceC48553sH3 {

    /* renamed from: b */
    public final ImageView f110247b;

    /* renamed from: c */
    public final ImageView f110248c;

    /* renamed from: d */
    public final TextView f110249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49146tH3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f110247b = (ImageView) activity.findViewById(C36585Vg4.parkingPhoto);
        this.f110248c = (ImageView) activity.findViewById(C36585Vg4.thumbImage);
        this.f110249d = (TextView) activity.findViewById(C36585Vg4.reason);
    }

    @Override // p000.InterfaceC48553sH3
    /* renamed from: nc */
    public void mo12532nc(WireEndRidePhotoParkingEvaluation evaluation) {
        AbstractC33662It6<ImageView, Drawable> abstractC33662It6;
        int i;
        Intrinsics.checkNotNullParameter(evaluation, "evaluation");
        String photoUrl = evaluation.getPhotoUrl();
        if (photoUrl != null) {
            YI4 m97545p = new YI4().m97545p();
            Intrinsics.checkNotNullExpressionValue(m97545p, "RequestOptions().fitCenter()");
            abstractC33662It6 = ComponentCallbacks2C17096a.m53136v(getActivity()).m81653k(photoUrl).mo16086d(m97545p).m16096R0(this.f110247b);
        } else {
            abstractC33662It6 = null;
        }
        if (abstractC33662It6 == null) {
            this.f110247b.setImageResource(C48193rg4.ic_where_to_park);
        }
        if (evaluation.getProperParking()) {
            i = C48193rg4.ic_thumbs_up_filled;
        } else {
            i = C48193rg4.ic_thumbs_down_filled;
        }
        this.f110248c.setImageResource(i);
        this.f110249d.setText(evaluation.getReason());
    }
}
