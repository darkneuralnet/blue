package p000;

import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.RangeSeekBar;
import com.google.firebase.crashlytics.internal.common.IdManager;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e0\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R:\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \u001a*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e0\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\b0\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006*"}, m28432d2 = {"LP13;", "LxE;", "LM13;", "", "visible", "", "T7", "f7", "", "min", "D2", "max", "ib", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "r7", "le", "frequencyInMillis", "nd", "gg", "Fl", "Ly31;", "b", "Ly31;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "signalRangeSubject", DateTokenConverter.CONVERTER_KEY, "updateFrequencySubject", "Lco/bird/android/widget/RangeSeekBar;", "e", "Lco/bird/android/widget/RangeSeekBar;", "signalRangeSeekbar", "f", "updateFrequencyRangeSeekbar", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ly31;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsFilterUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsFilterUi.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1855#2,2:113\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsFilterUi.kt\nco/bird/android/app/feature/nearbybirds/filterdialog/NearbyBirdsFilterUiImpl\n*L\n66#1:113,2\n77#1:115,2\n*E\n"})
/* renamed from: P13 */
/* loaded from: classes2.dex */
public final class P13 extends AbstractC30071xE implements M13 {

    /* renamed from: b */
    public final C51975y31 f27757b;

    /* renamed from: c */
    public final C24558d<Pair<Integer, Integer>> f27758c;

    /* renamed from: d */
    public final C24558d<Integer> f27759d;

    /* renamed from: e */
    public final RangeSeekBar<Integer> f27760e;

    /* renamed from: f */
    public final RangeSeekBar<Integer> f27761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P13(BaseActivity activity, C51975y31 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f27757b = binding;
        C24558d<Pair<Integer, Integer>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Int, Int>>()");
        this.f27758c = m31902e;
        C24558d<Integer> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Int>()");
        this.f27759d = m31902e2;
        RangeSeekBar<Integer> rangeSeekBar = binding.f118656e;
        Intrinsics.checkNotNull(rangeSeekBar, "null cannot be cast to non-null type co.bird.android.widget.RangeSeekBar<kotlin.Int>");
        this.f27760e = rangeSeekBar;
        RangeSeekBar<Integer> rangeSeekBar2 = binding.f118662k;
        Intrinsics.checkNotNull(rangeSeekBar2, "null cannot be cast to non-null type co.bird.android.widget.RangeSeekBar<kotlin.Int>");
        this.f27761f = rangeSeekBar2;
        rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: N13
            @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
            /* renamed from: a */
            public final void mo33485a(RangeSeekBar rangeSeekBar3, Number number, Number number2) {
                P13.m91060Rl(P13.this, rangeSeekBar3, (Integer) number, (Integer) number2);
            }
        });
        rangeSeekBar2.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: O13
            @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
            /* renamed from: a */
            public final void mo33485a(RangeSeekBar rangeSeekBar3, Number number, Number number2) {
                P13.m91059Sl(P13.this, rangeSeekBar3, (Integer) number, (Integer) number2);
            }
        });
    }

    /* renamed from: Rl */
    public static final void m91060Rl(P13 this$0, RangeSeekBar rangeSeekBar, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f27758c.onNext(TuplesKt.m28425to(num, num2));
    }

    /* renamed from: Sl */
    public static final void m91059Sl(P13 this$0, RangeSeekBar rangeSeekBar, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f27759d.onNext(num2);
    }

    @Override // p000.M13
    /* renamed from: D2 */
    public void mo91064D2(int i) {
        this.f27760e.setSelectedMinValue(Integer.valueOf(i));
    }

    @Override // p000.M13
    /* renamed from: Fl */
    public void mo91063Fl(int i) {
        this.f27757b.f118659h.setText(getActivity().getString(C45871nl4.nearby_birds_filters_frequency_format, new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(Float.valueOf(i / ((float) TimeUnit.SECONDS.toMillis(1L))))));
    }

    @Override // p000.M13
    /* renamed from: T7 */
    public void mo91058T7(boolean z) {
        Set<View> of;
        C51975y31 c51975y31 = this.f27757b;
        of = SetsKt__SetsKt.setOf((Object[]) new View[]{c51975y31.f118657f, this.f27760e, c51975y31.f118654c, c51975y31.f118653b, c51975y31.f118655d});
        for (View view : of) {
            Intrinsics.checkNotNullExpressionValue(view, "view");
            C49520tu6.show$default(view, z, 0, 2, null);
        }
    }

    @Override // p000.M13
    /* renamed from: f7 */
    public void mo91057f7(boolean z) {
        Set<View> of;
        C51975y31 c51975y31 = this.f27757b;
        of = SetsKt__SetsKt.setOf((Object[]) new View[]{c51975y31.f118661j, this.f27761f, c51975y31.f118659h, c51975y31.f118660i});
        for (View view : of) {
            Intrinsics.checkNotNullExpressionValue(view, "view");
            C49520tu6.show$default(view, z, 0, 2, null);
        }
    }

    @Override // p000.M13
    /* renamed from: gg */
    public Observable<Integer> mo91056gg() {
        Observable<Integer> hide = this.f27759d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "updateFrequencySubject.hide()");
        return hide;
    }

    @Override // p000.M13
    /* renamed from: ib */
    public void mo91055ib(int i) {
        this.f27760e.setSelectedMaxValue(Integer.valueOf(i));
    }

    @Override // p000.M13
    /* renamed from: le */
    public void mo91054le(int i, int i2) {
        TextView textView = this.f27757b.f118654c;
        BaseActivity activity = getActivity();
        int i3 = C45871nl4.nearby_birds_filters_signal_strength_format;
        textView.setText(activity.getString(i3, Integer.valueOf(i)));
        this.f27757b.f118653b.setText(getActivity().getString(i3, Integer.valueOf(i2)));
    }

    @Override // p000.M13
    /* renamed from: nd */
    public void mo91053nd(int i) {
        this.f27761f.setSelectedMaxValue(Integer.valueOf(i));
    }

    @Override // p000.M13
    /* renamed from: r7 */
    public Observable<Pair<Integer, Integer>> mo91052r7() {
        Observable<Pair<Integer, Integer>> hide = this.f27758c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "signalRangeSubject.hide()");
        return hide;
    }
}
