package p000;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\f\u001a\u001e\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000b0\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0015"}, m28432d2 = {"LuX1;", "Landroidx/recyclerview/widget/RecyclerView$D;", "LXT3;", "item", "", C17296a.f69688o, "", "url", "LIt6;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/Bitmap;", "b", "LCe2;", "LCe2;", "binding", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "c", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uX1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49881uX1 extends RecyclerView.AbstractC11834D {

    /* renamed from: c */
    public static final C29244a f112577c = new C29244a(null);

    /* renamed from: b */
    public final C32119Ce2 f112578b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LuX1$a;", "", "Landroid/view/ViewGroup;", "parent", "LuX1;", C17296a.f69688o, "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uX1$a */
    /* loaded from: classes3.dex */
    public static final class C29244a {
        public /* synthetic */ C29244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C49881uX1 m10112a(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(C33336Hj4.item_place_image, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…nt,\n        false\n      )");
            return new C49881uX1(inflate);
        }

        private C29244a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49881uX1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C32119Ce2 m111960a = C32119Ce2.m111960a(itemView);
        Intrinsics.checkNotNullExpressionValue(m111960a, "bind(itemView)");
        this.f112578b = m111960a;
    }

    /* renamed from: a */
    public final void m10114a(XT3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        m10113b(item.m76969c());
    }

    /* renamed from: b */
    public final AbstractC33662It6<ImageView, Bitmap> m10113b(String str) {
        AbstractC33662It6<ImageView, Bitmap> m16096R0 = ComponentCallbacks2C17096a.m53137u(this.f112578b.f4426b).m81662b().m16089a1(str).mo16086d(YI4.m75265F0()).m16082g1(C24847jU.m30574l()).m16096R0(this.f112578b.f4426b);
        Intrinsics.checkNotNullExpressionValue(m16096R0, "with(binding.place)\n    …\n    .into(binding.place)");
        return m16096R0;
    }
}
