package p000;

import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.library.lightbox.LightboxImage;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LUq2;", "LTq2;", "Lio/reactivex/Observable;", "", "q1", "", "Lco/bird/android/library/lightbox/LightboxImage;", "images", "", "index", "s1", "Landroid/widget/ImageView;", C17296a.f69688o, "Landroid/widget/ImageView;", "closeButton", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "imagePager", "LPq2;", "c", "LPq2;", "lightBoxAdapter", "La94;", DateTokenConverter.CONVERTER_KEY, "La94;", "indexSubject", "LZ84;", "e", "Lkotlin/Lazy;", "r1", "()LZ84;", "currentIndex", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Uq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36439Uq2 implements InterfaceC36205Tq2 {

    /* renamed from: a */
    public final ImageView f38098a;

    /* renamed from: b */
    public final ViewPager2 f38099b;

    /* renamed from: c */
    public final C35269Pq2 f38100c;

    /* renamed from: d */
    public final C37791a94<Integer> f38101d;

    /* renamed from: e */
    public final Lazy f38102e;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Uq2$a", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "c", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Uq2$a */
    /* loaded from: classes3.dex */
    public static final class C8463a extends ViewPager2.AbstractC12103i {
        public C8463a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            super.mo224c(i);
            C36439Uq2.this.f38101d.accept(Integer.valueOf(i));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LZ84;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Uq2$b */
    /* loaded from: classes3.dex */
    public static final class C8464b extends Lambda implements Function0<Z84<Integer>> {
        public C8464b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Integer> invoke() {
            return Z84.f47888d.m73663b(C36439Uq2.this.f38101d);
        }
    }

    public C36439Uq2(BaseActivity activity) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f38098a = (ImageView) C40788fB0.m41779c(activity, C47027pi4.closeButton);
        ViewPager2 viewPager2 = (ViewPager2) C40788fB0.m41779c(activity, C47027pi4.imageViewPager);
        this.f38099b = viewPager2;
        this.f38100c = new C35269Pq2();
        this.f38101d = C37791a94.C10586a.create$default(C37791a94.f49908h, 0, null, 2, null);
        viewPager2.m65690n(new C8463a());
        lazy = LazyKt__LazyJVMKt.lazy(new C8464b());
        this.f38102e = lazy;
    }

    @Override // p000.InterfaceC36205Tq2
    /* renamed from: q1 */
    public Observable<Unit> mo80774q1() {
        return C44626lf5.clicksThrottle$default(this.f38098a, 0L, 1, null);
    }

    @Override // p000.InterfaceC36205Tq2
    /* renamed from: r1 */
    public Z84<Integer> mo80773r1() {
        return (Z84) this.f38102e.getValue();
    }

    @Override // p000.InterfaceC36205Tq2
    /* renamed from: s1 */
    public void mo80772s1(List<LightboxImage> images, int i) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f38100c.submitList(images);
        this.f38099b.setAdapter(this.f38100c);
        this.f38099b.setCurrentItem(i, false);
    }
}
