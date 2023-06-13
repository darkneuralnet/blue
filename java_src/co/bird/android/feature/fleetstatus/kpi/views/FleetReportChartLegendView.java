package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u0003\u000e\u0011\u0012B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/B!\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b+\u00101J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R*\u0010\u0010\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R*\u0010(\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 ¨\u00063"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;", "Landroid/view/View;", "", "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;", "entries", "", "setEntries", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", C17296a.f69688o, "entry", "verticalOffset", "b", "c", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "textPaint", "legendPaint", "", "Ljava/util/List;", "value", "e", "I", "getVerticalOffset", "()I", "setVerticalOffset", "(I)V", "f", "getTextLineHeight", "setTextLineHeight", "textLineHeight", "g", "getLegendLineLength", "setLegendLineLength", "legendLineLength", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "h", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportChartLegendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportChartLegendView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1864#3,3:178\n1963#3,14:181\n*S KotlinDebug\n*F\n+ 1 FleetReportChartLegendView.kt\nco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView\n*L\n112#1:178,3\n152#1:181,14\n*E\n"})
/* loaded from: classes3.dex */
public final class FleetReportChartLegendView extends View {

    /* renamed from: h */
    public static final C14802a f63939h = new C14802a(null);

    /* renamed from: b */
    public final Paint f63940b;

    /* renamed from: c */
    public final Paint f63941c;

    /* renamed from: d */
    public final List<C14803b> f63942d;

    /* renamed from: e */
    public int f63943e;

    /* renamed from: f */
    public int f63944f;

    /* renamed from: g */
    public int f63945g;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$a;", "", "", "DEFAULT_LINE_LENGTH_DP", "I", "DEFAULT_TEXT_HORIZONTAL_MARGIN_DP", "DEFAULT_TEXT_LINE_HEIGHT_DP", "DEFAULT_TEXT_SIZE_SP", "DEFAULT_VERTICAL_OFFSET_DP", "", "DOT_WIDTH_DP", "D", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportChartLegendView$a */
    /* loaded from: classes3.dex */
    public static final class C14802a {
        public /* synthetic */ C14802a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14802a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;", "", "", "color", "", "label", "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;", "stroke", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;", "<init>", "(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportChartLegendView$b */
    /* loaded from: classes3.dex */
    public static final class C14803b {

        /* renamed from: a */
        public final int f63946a;

        /* renamed from: b */
        public final String f63947b;

        /* renamed from: c */
        public final EnumC14804c f63948c;

        public C14803b(int i, String label, EnumC14804c stroke) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(stroke, "stroke");
            this.f63946a = i;
            this.f63947b = label;
            this.f63948c = stroke;
        }

        public static /* synthetic */ C14803b copy$default(C14803b c14803b, int i, String str, EnumC14804c enumC14804c, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c14803b.f63946a;
            }
            if ((i2 & 2) != 0) {
                str = c14803b.f63947b;
            }
            if ((i2 & 4) != 0) {
                enumC14804c = c14803b.f63948c;
            }
            return c14803b.m58206a(i, str, enumC14804c);
        }

        /* renamed from: a */
        public final C14803b m58206a(int i, String label, EnumC14804c stroke) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(stroke, "stroke");
            return new C14803b(i, label, stroke);
        }

        /* renamed from: b */
        public final int m58205b() {
            return this.f63946a;
        }

        /* renamed from: c */
        public final String m58204c() {
            return this.f63947b;
        }

        /* renamed from: d */
        public final EnumC14804c m58203d() {
            return this.f63948c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14803b) {
                C14803b c14803b = (C14803b) obj;
                return this.f63946a == c14803b.f63946a && Intrinsics.areEqual(this.f63947b, c14803b.f63947b) && this.f63948c == c14803b.f63948c;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f63946a) * 31) + this.f63947b.hashCode()) * 31) + this.f63948c.hashCode();
        }

        public String toString() {
            int i = this.f63946a;
            String str = this.f63947b;
            EnumC14804c enumC14804c = this.f63948c;
            return "LegendEntry(color=" + i + ", label=" + str + ", stroke=" + enumC14804c + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.FleetReportChartLegendView$c */
    /* loaded from: classes3.dex */
    public enum EnumC14804c {
        SOLID,
        DOTTED
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportChartLegendView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.primaryText));
        paint.setTextSize(C49347td3.m12000c(16));
        this.f63940b = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(C49347td3.m12001b(2));
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f63941c = paint2;
        this.f63942d = new ArrayList();
        this.f63943e = (int) C49347td3.m12001b(0);
        this.f63944f = (int) C49347td3.m12001b(22);
        this.f63945g = (int) C49347td3.m12001b(30);
    }

    /* renamed from: e */
    public static final int m58208e(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: f */
    public static final int m58207f(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: a */
    public final void m58212a(Canvas canvas) {
        int i = 0;
        for (Object obj : this.f63942d) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            m58211b((C14803b) obj, i * (this.f63944f + this.f63943e), canvas);
            i = i2;
        }
    }

    /* renamed from: b */
    public final void m58211b(C14803b c14803b, int i, Canvas canvas) {
        this.f63941c.setColor(c14803b.m58205b());
        float f = i + ((float) (this.f63944f * 0.5d));
        float f2 = 2;
        float strokeWidth = this.f63941c.getStrokeWidth() / f2;
        int paddingStart = getPaddingStart() + this.f63945g;
        if (c14803b.m58203d() == EnumC14804c.SOLID) {
            canvas.drawLine(getPaddingStart() + strokeWidth, f, paddingStart - strokeWidth, f, this.f63941c);
        } else {
            float m12001b = C49347td3.m12001b(Double.valueOf(3.75d)) - this.f63941c.getStrokeWidth();
            float paddingStart2 = getPaddingStart() + strokeWidth + ((float) (C49347td3.m12001b(Double.valueOf(3.75d)) * 1.5d));
            canvas.drawLine(getPaddingStart() + strokeWidth, f, getPaddingStart() + strokeWidth + (m12001b / f2), f, this.f63941c);
            while (true) {
                float f3 = paddingStart;
                if (paddingStart2 >= f3) {
                    break;
                }
                canvas.drawLine(paddingStart2, f, Math.min(paddingStart2 + m12001b, f3 - strokeWidth), f, this.f63941c);
                paddingStart2 += C49347td3.m12001b(Double.valueOf(3.75d)) * f2;
            }
        }
        Rect rect = new Rect();
        this.f63940b.getTextBounds(c14803b.m58204c(), 0, c14803b.m58204c().length(), rect);
        canvas.drawText(c14803b.m58204c(), paddingStart + C49347td3.m12001b(16), i + ((this.f63944f + rect.height()) / 2), this.f63940b);
    }

    /* renamed from: c */
    public final int m58210c() {
        Object obj;
        Iterator<T> it = this.f63942d.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                int length = ((C14803b) next).m58204c().length();
                do {
                    Object next2 = it.next();
                    int length2 = ((C14803b) next2).m58204c().length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        C14803b c14803b = (C14803b) obj;
        String str = (c14803b == null || (str = c14803b.m58204c()) == null) ? "" : "";
        Rect rect = new Rect();
        this.f63940b.getTextBounds(str, 0, str.length(), rect);
        return (int) (getPaddingStart() + getPaddingEnd() + (this.f63941c.getStrokeWidth() / 2) + rect.width());
    }

    /* renamed from: d */
    public final int m58209d() {
        return (this.f63944f * 2) + ((this.f63942d.size() - 1) * this.f63943e);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            m58212a(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (m58208e(i) == 1073741824 && m58208e(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m58208e(i) == 0 && m58208e(i2) == 0) {
            setMeasuredDimension(m58210c(), m58209d());
        } else if (m58208e(i) == 1073741824) {
            setMeasuredDimension(m58207f(i), m58209d());
        } else if (m58208e(i2) == 1073741824) {
            setMeasuredDimension(m58210c(), m58207f(i2));
        } else if (m58207f(i) < m58207f(i2)) {
            setMeasuredDimension(m58207f(i), m58209d());
        } else {
            setMeasuredDimension(m58210c(), m58207f(i2));
        }
    }

    public final void setEntries(List<C14803b> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f63942d.clear();
        this.f63942d.addAll(entries);
        invalidate();
    }

    public final void setLegendLineLength(int i) {
        this.f63945g = i;
        invalidate();
    }

    public final void setTextLineHeight(int i) {
        this.f63944f = i;
        invalidate();
    }

    public final void setVerticalOffset(int i) {
        this.f63943e = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportChartLegendView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.primaryText));
        paint.setTextSize(C49347td3.m12000c(16));
        this.f63940b = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(C49347td3.m12001b(2));
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f63941c = paint2;
        this.f63942d = new ArrayList();
        this.f63943e = (int) C49347td3.m12001b(0);
        this.f63944f = (int) C49347td3.m12001b(22);
        this.f63945g = (int) C49347td3.m12001b(30);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FleetReportChartLegendView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Paint paint = new Paint();
        paint.setColor(NA0.m94301c(getContext(), C32364Df4.primaryText));
        paint.setTextSize(C49347td3.m12000c(16));
        this.f63940b = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(C49347td3.m12001b(2));
        paint2.setStrokeCap(Paint.Cap.SQUARE);
        this.f63941c = paint2;
        this.f63942d = new ArrayList();
        this.f63943e = (int) C49347td3.m12001b(0);
        this.f63944f = (int) C49347td3.m12001b(22);
        this.f63945g = (int) C49347td3.m12001b(30);
    }
}
