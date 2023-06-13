package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.widget.Button;
import android.widget.ImageView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.CameraxView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J0\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LnP2;", "LxE;", "LlP2;", "Lio/reactivex/Observable;", "", "Cd", "Landroid/graphics/Bitmap;", "Vk", "i7", "Lio/reactivex/F;", "Z", "h0", "Rh", "M1", "E6", "q4", "Lco/bird/android/model/MechanicPhotoMode;", "mode", "Lco/bird/android/model/BirdInspectionPoint;", "inspectionPoint", "", "photoCount", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "a3", "i", Entry.TYPE_IMAGE, "cg", "pc", "LT3;", "b", "LT3;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LT3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nP2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45660nP2 extends AbstractC30071xE implements InterfaceC44474lP2 {

    /* renamed from: b */
    public final C7643T3 f99900b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nP2$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26493a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MechanicPhotoMode.values().length];
            try {
                iArr[MechanicPhotoMode.INSPECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MechanicPhotoMode.REPAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Landroid/graphics/Bitmap;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nP2$b */
    /* loaded from: classes2.dex */
    public static final class C26494b extends Lambda implements Function1<Unit, Bitmap> {
        public C26494b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Bitmap invoke(Unit it) {
            BitmapDrawable bitmapDrawable;
            Intrinsics.checkNotNullParameter(it, "it");
            Drawable drawable = C45660nP2.this.f99900b.f34694e.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable == null) {
                return null;
            }
            return bitmapDrawable.getBitmap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45660nP2(BaseActivity activity, C7643T3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f99900b = binding;
    }

    /* renamed from: Ql */
    public static final Bitmap m23842Ql(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bitmap) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: Cd */
    public Observable<Unit> mo23846Cd() {
        Button button = this.f99900b.f34698i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: E6 */
    public void mo23845E6() {
        this.f99900b.f34698i.setVisibility(4);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: M1 */
    public void mo23844M1() {
        this.f99900b.f34692c.m54655z();
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: Rh */
    public void mo23841Rh() {
        this.f99900b.f34692c.m54656y();
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: Vk */
    public Observable<Bitmap> mo23840Vk() {
        Button button = this.f99900b.f34699j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.usePhotoButton");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C26494b c26494b = new C26494b();
        Observable<Bitmap> map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: mP2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Bitmap m23842Ql;
                m23842Ql = C45660nP2.m23842Ql(Function1.this, obj);
                return m23842Ql;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun usePhotoCli…tmapDrawable)?.bitmap\n  }");
        return map;
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: Z */
    public AbstractC23442F<Bitmap> mo23839Z() {
        return this.f99900b.f34692c.m54682A();
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: a3 */
    public void mo23838a3(MechanicPhotoMode mode, BirdInspectionPoint inspectionPoint, int i, WireBird bird, Location location) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(inspectionPoint, "inspectionPoint");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(location, "location");
        int i2 = C26493a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.f99900b.f34695f.setText(getActivity().getResources().getString(C45871nl4.repair_photo_info, Integer.valueOf(i), inspectionPoint.getItem()));
            }
        } else {
            this.f99900b.f34695f.setText(getActivity().getResources().getString(C45871nl4.inspection_photo_info, Integer.valueOf(i), inspectionPoint.getItem()));
        }
        BirdActionView birdActionView = this.f99900b.f34691b;
        Intrinsics.checkNotNullExpressionValue(birdActionView, "binding.birdStatus");
        BirdActionView.setBird$default(birdActionView, location, bird, true, false, 8, null);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: cg */
    public void mo23837cg(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        CameraxView cameraxView = this.f99900b.f34692c;
        Intrinsics.checkNotNullExpressionValue(cameraxView, "binding.camera");
        C49520tu6.m11239l(cameraxView);
        this.f99900b.f34694e.setImageBitmap(image);
        ImageView imageView = this.f99900b.f34694e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imagePreview");
        C49520tu6.m11233r(imageView);
        Button button = this.f99900b.f34693d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.flashLightButton");
        C49520tu6.m11239l(button);
        Button button2 = this.f99900b.f34698i;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.takePhotoButton");
        C49520tu6.m11239l(button2);
        Button button3 = this.f99900b.f34697h;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.retakeButton");
        C49520tu6.m11233r(button3);
        Button button4 = this.f99900b.f34699j;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.usePhotoButton");
        C49520tu6.m11233r(button4);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: h0 */
    public Observable<Unit> mo23836h0() {
        Button button = this.f99900b.f34693d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.flashLightButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: i */
    public void mo23835i() {
        this.f99900b.f34692c.m54681B();
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: i7 */
    public Observable<Unit> mo23834i7() {
        Button button = this.f99900b.f34697h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.retakeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: pc */
    public void mo23833pc() {
        CameraxView cameraxView = this.f99900b.f34692c;
        Intrinsics.checkNotNullExpressionValue(cameraxView, "binding.camera");
        C49520tu6.m11233r(cameraxView);
        this.f99900b.f34694e.setImageBitmap(null);
        ImageView imageView = this.f99900b.f34694e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.imagePreview");
        C49520tu6.m11239l(imageView);
        Button button = this.f99900b.f34693d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.flashLightButton");
        C49520tu6.m11233r(button);
        Button button2 = this.f99900b.f34698i;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.takePhotoButton");
        C49520tu6.m11233r(button2);
        Button button3 = this.f99900b.f34697h;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.retakeButton");
        C49520tu6.m11239l(button3);
        Button button4 = this.f99900b.f34699j;
        Intrinsics.checkNotNullExpressionValue(button4, "binding.usePhotoButton");
        C49520tu6.m11239l(button4);
    }

    @Override // p000.InterfaceC44474lP2
    /* renamed from: q4 */
    public void mo23832q4() {
        this.f99900b.f34698i.setVisibility(0);
    }
}
