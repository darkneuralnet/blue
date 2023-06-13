package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00040\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LhX5;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "newState", "onScrollStateChanged", "Lio/reactivex/Observable;", "b", "parentCenterX", "childCenterX", "", C17296a.f69688o, "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "stateSubject", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlScrollListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlScrollListener.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlScrollListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1855#2,2:70\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlScrollListener.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlScrollListener\n*L\n31#1:70,2\n*E\n"})
/* renamed from: hX5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42177hX5 extends RecyclerView.AbstractC11863t {

    /* renamed from: b */
    public static final C22676a f85365b = new C22676a(null);

    /* renamed from: a */
    public final C24558d<Integer> f85366a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LhX5$a;", "", "", "MIN_SCALE_OFFSET", "F", "SCALE_FACTOR", "", "SPREAD_FACTOR", "D", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: hX5$a */
    /* loaded from: classes4.dex */
    public static final class C22676a {
        public /* synthetic */ C22676a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22676a() {
        }
    }

    public C42177hX5() {
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f85366a = m31902e;
    }

    /* renamed from: a */
    public final float m36226a(int i, int i2) {
        double d = 2;
        return (float) ((0.1f * Math.pow(2.718281828459045d, (-Math.pow(i2 - i, d)) / (d * Math.pow(350.0d, 2.0d)))) + 0.9f);
    }

    /* renamed from: b */
    public final Observable<Integer> m36225b() {
        Observable<Integer> startWith = this.f85366a.hide().startWith((Observable<Integer>) 0);
        Intrinsics.checkNotNullExpressionValue(startWith, "stateSubject.hide().star…erView.SCROLL_STATE_IDLE)");
        return startWith;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f85366a.onNext(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            View childAt = recyclerView.getChildAt(((IntIterator) it).nextInt());
            float m36226a = m36226a((recyclerView.getLeft() + recyclerView.getRight()) / 2, (childAt.getLeft() + childAt.getRight()) / 2);
            childAt.setScaleX(m36226a);
            childAt.setScaleY(m36226a);
            childAt.requestLayout();
        }
    }
}
