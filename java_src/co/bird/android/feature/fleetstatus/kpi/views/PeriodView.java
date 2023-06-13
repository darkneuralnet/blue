package co.bird.android.feature.fleetstatus.kpi.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.FleetReportPeriod;
import com.facebook.share.internal.C17296a;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/PeriodView;", "Landroidx/cardview/widget/CardView;", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "", "r", "Lmt6;", "k", "Lmt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "l", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PeriodView extends CardView {

    /* renamed from: l */
    public static final C14806a f63954l = new C14806a(null);

    /* renamed from: m */
    public static final SimpleDateFormat f63955m = new SimpleDateFormat("MMM dd", Locale.getDefault());

    /* renamed from: k */
    public final C45360mt6 f63956k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/fleetstatus/kpi/views/PeriodView$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.fleetstatus.kpi.views.PeriodView$a */
    /* loaded from: classes3.dex */
    public static final class C14806a {
        public /* synthetic */ C14806a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14806a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C45360mt6 m24753b = C45360mt6.m24753b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m24753b, "inflate(context.layoutInflater, this)");
        this.f63956k = m24753b;
    }

    /* renamed from: r */
    public final void m58195r(FleetReportPeriod period) {
        Intrinsics.checkNotNullParameter(period, "period");
        TextView textView = this.f63956k.f98995e;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        SimpleDateFormat simpleDateFormat = f63955m;
        String format = String.format("%s - %s", Arrays.copyOf(new Object[]{simpleDateFormat.format(period.getStartDate().toDate()), simpleDateFormat.format(period.getEndDate().toDate())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        this.f63956k.f98994d.setText(period.getGranularity());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C45360mt6 m24753b = C45360mt6.m24753b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m24753b, "inflate(context.layoutInflater, this)");
        this.f63956k = m24753b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C45360mt6 m24753b = C45360mt6.m24753b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m24753b, "inflate(context.layoutInflater, this)");
        this.f63956k = m24753b;
    }
}
