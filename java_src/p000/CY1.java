package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Landroid/widget/ImageView;", "", "radius", "", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: CY1 */
/* loaded from: classes4.dex */
public final class CY1 {

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"CY1$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: CY1$a */
    /* loaded from: classes4.dex */
    public static final class C1037a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ float f4197a;

        public C1037a(float f) {
            this.f4197a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i;
            int i2;
            if (outline != null) {
                if (view != null) {
                    i = view.getWidth();
                } else {
                    i = 0;
                }
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                outline.setRoundRect(0, 0, i, i2, this.f4197a);
            }
        }
    }

    /* renamed from: a */
    public static final void m112150a(ImageView imageView, float f) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setOutlineProvider(new C1037a(f));
        imageView.setClipToOutline(true);
    }
}
