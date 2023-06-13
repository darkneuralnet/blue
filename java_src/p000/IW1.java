package p000;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000f0\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001c"}, m28432d2 = {"LIW1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Landroid/view/View;", "g", "Landroid/net/Uri;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "addPhotoClickSubject", DateTokenConverter.CONVERTER_KEY, "removePhotoSubject", "<init>", "()V", C17296a.f69688o, "b", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IW1 */
/* loaded from: classes3.dex */
public final class IW1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<View> f15831c;

    /* renamed from: d */
    public final C24558d<Uri> f15832d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"LIW1$a;", "Lw1;", "Landroid/view/View;", "view", "<init>", "(LIW1;Landroid/view/View;)V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IW1$a */
    /* loaded from: classes3.dex */
    public final class C3694a extends C29735w1 {

        /* renamed from: b */
        public final /* synthetic */ IW1 f15833b;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IW1$a$a */
        /* loaded from: classes3.dex */
        public static final class C3695a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IW1 f15834g;

            /* renamed from: h */
            public final /* synthetic */ View f15835h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3695a(IW1 iw1, View view) {
                super(1);
                this.f15834g = iw1;
                this.f15835h = view;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f15834g.f15831c.onNext(this.f15835h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3694a(IW1 iw1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f15833b = iw1;
            C34585Ms2.m94661j(view, new C3695a(iw1, view));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0010"}, m28432d2 = {"LIW1$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "imageView", "c", "xButton", "Landroid/view/View;", "view", "<init>", "(LIW1;Landroid/view/View;)V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nImageBarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBarAdapter.kt\nco/bird/android/imageupload/adapters/ImageBarAdapter$ImageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 ImageBarAdapter.kt\nco/bird/android/imageupload/adapters/ImageBarAdapter$ImageViewHolder\n*L\n52#1:68\n52#1:69,4\n*E\n"})
    /* renamed from: IW1$b */
    /* loaded from: classes3.dex */
    public final class C3696b extends C29735w1 {

        /* renamed from: b */
        public final ImageView f15836b;

        /* renamed from: c */
        public final ImageView f15837c;

        /* renamed from: d */
        public final /* synthetic */ IW1 f15838d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nImageBarAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBarAdapter.kt\nco/bird/android/imageupload/adapters/ImageBarAdapter$ImageViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n1#4:73\n*S KotlinDebug\n*F\n+ 1 ImageBarAdapter.kt\nco/bird/android/imageupload/adapters/ImageBarAdapter$ImageViewHolder$1\n*L\n47#1:68\n47#1:69,4\n*E\n"})
        /* renamed from: IW1$b$a */
        /* loaded from: classes3.dex */
        public static final class C3697a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ IW1 f15839g;

            /* renamed from: h */
            public final /* synthetic */ C3696b f15840h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3697a(IW1 iw1, C3696b c3696b) {
                super(1);
                this.f15839g = iw1;
                this.f15840h = c3696b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f15839g.m94545o().m109397e(this.f15840h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Uri)) {
                    m105816c = null;
                }
                Uri uri = (Uri) m105816c;
                if (uri != null) {
                    this.f15839g.f15832d.onNext(uri);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3696b(IW1 iw1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f15838d = iw1;
            View findViewById = view.findViewById(C31689Ai4.imageView);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.imageView)");
            this.f15836b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C31689Ai4.xButton);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.xButton)");
            ImageView imageView = (ImageView) findViewById2;
            this.f15837c = imageView;
            C34585Ms2.m94661j(imageView, new C3697a(iw1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f15838d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Uri)) {
                m105816c = null;
            }
            Uri uri = (Uri) m105816c;
            if (uri != null) {
                ComponentCallbacks2C17096a.m53138t(this.itemView.getContext()).m81656h(uri).mo16086d(new YI4().m97561f()).m16096R0(this.f15836b);
            }
        }
    }

    public IW1() {
        C24558d<View> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<View>()");
        this.f15831c = m31902e;
        C24558d<Uri> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Uri>()");
        this.f15832d = m31902e2;
    }

    /* renamed from: g */
    public final Observable<View> m101966g() {
        Observable<View> hide = this.f15831c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addPhotoClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new LW1());
        }
    }

    /* renamed from: v */
    public final Observable<Uri> m101965v() {
        Observable<Uri> hide = this.f15832d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "removePhotoSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45861nk4.item_image_bar_photo ? new C3696b(this, m41761u) : i == C45861nk4.item_image_bar_add_photo ? new C3694a(this, m41761u) : new C29735w1(m41761u);
    }
}
