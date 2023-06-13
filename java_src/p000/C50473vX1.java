package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.lightbox.LightboxImage;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m28432d2 = {"LvX1;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lco/bird/android/library/lightbox/LightboxImage;", "item", "", C17296a.f69688o, "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "attribution", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", DateTokenConverter.CONVERTER_KEY, "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLightboxImageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightboxImageAdapter.kt\nco/bird/android/library/lightbox/ImageHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* renamed from: vX1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50473vX1 extends RecyclerView.AbstractC11834D {

    /* renamed from: d */
    public static final C29578a f114219d = new C29578a(null);

    /* renamed from: b */
    public final ImageView f114220b;

    /* renamed from: c */
    public final TextView f114221c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LvX1$a;", "", "Landroid/view/ViewGroup;", "parent", "LvX1;", C17296a.f69688o, "<init>", "()V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vX1$a */
    /* loaded from: classes3.dex */
    public static final class C29578a {
        public /* synthetic */ C29578a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C50473vX1 m8529a(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(C39321ck4.item_lightbox_image, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…nt,\n        false\n      )");
            return new C50473vX1(inflate);
        }

        private C29578a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50473vX1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f114220b = (ImageView) C49520tu6.m11243h(itemView, C47027pi4.image);
        this.f114221c = (TextView) C49520tu6.m11243h(itemView, C47027pi4.attribution);
    }

    /* renamed from: a */
    public final void m8530a(LightboxImage item) {
        int i;
        Spanned spanned;
        Intrinsics.checkNotNullParameter(item, "item");
        ComponentCallbacks2C17096a.m53137u(this.f114220b).m81662b().m16089a1(item.m56030c()).m16082g1(C24847jU.m30574l()).m16096R0(this.f114220b);
        TextView textView = this.f114221c;
        if (item.m56031b() != null) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f114221c.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f114221c;
        String m56031b = item.m56031b();
        if (m56031b != null) {
            spanned = Html.fromHtml(m56031b);
        } else {
            spanned = null;
        }
        textView2.setText(spanned);
    }
}
