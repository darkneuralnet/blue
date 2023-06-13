package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.RangeFilterView;
import co.bird.android.widget.RangeSeekBar;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010$B!\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b \u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\t0\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\t0\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c¨\u0006'"}, m28432d2 = {"Lco/bird/android/widget/RangeFilterView;", "Landroid/widget/LinearLayout;", "", "title", "", "setTitle", "label", "setMinLabel", "setMaxLabel", "", "num", "setNumSteps", "minIndex", "maxIndex", "setSelectedIndices", "Lio/reactivex/Observable;", "e", DateTokenConverter.CONVERTER_KEY, "minValue", "maxValue", "c", "LAG;", "kotlin.jvm.PlatformType", "b", "LAG;", "min", "max", "Ljn4;", "Ljn4;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RangeFilterView extends LinearLayout {

    /* renamed from: b */
    public final C0058AG<Integer> f67541b;

    /* renamed from: c */
    public final C0058AG<Integer> f67542c;

    /* renamed from: d */
    public final C43519jn4 f67543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f67541b = m115951g;
        C0058AG<Integer> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<Int>()");
        this.f67542c = m115951g2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C43519jn4 m29923b = C43519jn4.m29923b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m29923b, "inflate(context.layoutInflater, this)");
        this.f67543d = m29923b;
        setOrientation(1);
        m29923b.f93340b.setNotifyWhileDragging(true);
        m29923b.f93340b.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: in4
            @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
            /* renamed from: a */
            public final void mo33485a(RangeSeekBar rangeSeekBar, Number number, Number number2) {
                RangeFilterView.m54449b(RangeFilterView.this, rangeSeekBar, (Integer) number, (Integer) number2);
            }
        });
    }

    /* renamed from: b */
    public static final void m54449b(RangeFilterView this$0, RangeSeekBar rangeSeekBar, Integer minValue, Integer maxValue) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(minValue, "minValue");
        int intValue = minValue.intValue();
        Intrinsics.checkNotNullExpressionValue(maxValue, "maxValue");
        this$0.m54448c(intValue, maxValue.intValue());
    }

    /* renamed from: c */
    public final void m54448c(int i, int i2) {
        this.f67541b.accept(Integer.valueOf(i));
        this.f67542c.accept(Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final Observable<Integer> m54447d() {
        Observable<Integer> distinctUntilChanged = this.f67542c.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "max.distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: e */
    public final Observable<Integer> m54446e() {
        Observable<Integer> distinctUntilChanged = this.f67541b.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "min.distinctUntilChanged()");
        return distinctUntilChanged;
    }

    public final void setMaxLabel(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f67543d.f93341c.setText(label);
    }

    public final void setMinLabel(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f67543d.f93342d.setText(label);
    }

    public final void setNumSteps(int i) {
        this.f67543d.f93340b.setRangeValues(0, Integer.valueOf(i - 1));
    }

    public final void setSelectedIndices(int i, int i2) {
        this.f67543d.f93340b.setSelectedMinValue(Integer.valueOf(i));
        this.f67543d.f93340b.setSelectedMaxValue(Integer.valueOf(i2));
        m54448c(i, i2);
    }

    public final void setTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f67543d.f93343e.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f67541b = m115951g;
        C0058AG<Integer> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<Int>()");
        this.f67542c = m115951g2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C43519jn4 m29923b = C43519jn4.m29923b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m29923b, "inflate(context.layoutInflater, this)");
        this.f67543d = m29923b;
        setOrientation(1);
        m29923b.f93340b.setNotifyWhileDragging(true);
        m29923b.f93340b.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: in4
            @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
            /* renamed from: a */
            public final void mo33485a(RangeSeekBar rangeSeekBar, Number number, Number number2) {
                RangeFilterView.m54449b(RangeFilterView.this, rangeSeekBar, (Integer) number, (Integer) number2);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f67541b = m115951g;
        C0058AG<Integer> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<Int>()");
        this.f67542c = m115951g2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C43519jn4 m29923b = C43519jn4.m29923b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m29923b, "inflate(context.layoutInflater, this)");
        this.f67543d = m29923b;
        setOrientation(1);
        m29923b.f93340b.setNotifyWhileDragging(true);
        m29923b.f93340b.setOnRangeSeekBarChangeListener(new RangeSeekBar.InterfaceC16570c() { // from class: in4
            @Override // co.bird.android.widget.RangeSeekBar.InterfaceC16570c
            /* renamed from: a */
            public final void mo33485a(RangeSeekBar rangeSeekBar, Number number, Number number2) {
                RangeFilterView.m54449b(RangeFilterView.this, rangeSeekBar, (Integer) number, (Integer) number2);
            }
        });
    }
}
