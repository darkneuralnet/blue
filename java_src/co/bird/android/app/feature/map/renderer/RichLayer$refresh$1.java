package co.bird.android.app.feature.map.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import co.bird.android.app.feature.map.renderer.RichLayer;
import com.google.android.gms.maps.model.CameraPosition;
import io.reactivex.InterfaceC24516r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/r;", "Lco/bird/android/app/feature/map/renderer/RichLayer$BitmapDrawData;", "emitter", "", "invoke", "(Lio/reactivex/r;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RichLayer$refresh$1 extends Lambda implements Function1<InterfaceC24516r<RichLayer.BitmapDrawData>, Unit> {
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ U74 $projection;
    final /* synthetic */ RichLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichLayer$refresh$1(RichLayer richLayer, U74 u74, CameraPosition cameraPosition) {
        super(1);
        this.this$0 = richLayer;
        this.$projection = u74;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24516r<RichLayer.BitmapDrawData> interfaceC24516r) {
        invoke2(interfaceC24516r);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC24516r<RichLayer.BitmapDrawData> emitter) {
        Bitmap bitmap;
        Unit unit;
        List draw;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.this$0.prepareBitmap();
        bitmap = this.this$0.bitmap;
        if (bitmap != null) {
            U74 u74 = this.$projection;
            CameraPosition cameraPosition = this.$cameraPosition;
            draw = this.this$0.draw(new Canvas(bitmap), u74);
            emitter.onSuccess(new RichLayer.BitmapDrawData(u74, bitmap, cameraPosition, draw));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            emitter.onComplete();
        }
    }
}
