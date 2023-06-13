package co.bird.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001b\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b\u001b\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006#"}, m28432d2 = {"Lco/bird/android/widget/CallToActionBanner;", "Landroidx/cardview/widget/CardView;", "", "subtitle", "", "setSubtitle", "r", "title", "setTitle", "", Entry.TYPE_IMAGE, "setImage", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "", "show", "s", "Lco/bird/android/widget/CallToActionBanner$a;", TransferTable.COLUMN_STATE, "setCallToActionState", "LSp6;", "k", "LSp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CallToActionBanner extends CardView {

    /* renamed from: k */
    public final C35966Sp6 f67209k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionBanner(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35966Sp6 m84804c = C35966Sp6.m84804c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m84804c, "inflate(context.layoutInflater, this, true)");
        this.f67209k = m84804c;
    }

    /* renamed from: r */
    public final void m54703r() {
        TextView textView = this.f67209k.f34300c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.bannerSubtitle");
        C49520tu6.show$default(textView, false, 0, 2, null);
    }

    /* renamed from: s */
    public final void m54702s(boolean z) {
        TextView textView = this.f67209k.f34303f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.callToActionBottom");
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    public final void setCallToActionState(EnumC16470a state) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f67209k.f34299b.setImageResource(state.m54697e());
        Integer m54695g = state.m54695g();
        if (m54695g != null) {
            this.f67209k.f34301d.setText(m54695g.intValue());
        }
        Integer m54696f = state.m54696f();
        if (m54696f != null) {
            this.f67209k.f34300c.setText(m54696f.intValue());
        }
        Integer m54699c = state.m54699c();
        if (m54699c != null) {
            this.f67209k.f34302e.setText(m54699c.intValue());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            TextView textView = this.f67209k.f34302e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.callToAction");
            C49520tu6.m11239l(textView);
        }
        Integer m54700b = state.m54700b();
        if (m54700b != null) {
            this.f67209k.f34303f.setText(m54700b.intValue());
            TextView textView2 = this.f67209k.f34303f;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.callToActionBottom");
            C49520tu6.m11233r(textView2);
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            TextView textView3 = this.f67209k.f34303f;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.callToActionBottom");
            C49520tu6.m11239l(textView3);
        }
        AppCompatImageView appCompatImageView = this.f67209k.f34304g;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.xButton");
        C49520tu6.show$default(appCompatImageView, state.m54698d(), 0, 2, null);
    }

    public final void setDrawable(Drawable drawable) {
        this.f67209k.f34299b.setImageDrawable(drawable);
    }

    public final void setImage(int i) {
        this.f67209k.f34299b.setImageResource(i);
    }

    public final void setSubtitle(String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        TextView textView = this.f67209k.f34300c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.bannerSubtitle");
        C49520tu6.m11233r(textView);
        this.f67209k.f34300c.setText(subtitle);
    }

    public final void setTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f67209k.f34301d.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35966Sp6 m84804c = C35966Sp6.m84804c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m84804c, "inflate(context.layoutInflater, this, true)");
        this.f67209k = m84804c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35966Sp6 m84804c = C35966Sp6.m84804c(C40788fB0.m41772j(context2), this, true);
        Intrinsics.checkNotNullExpressionValue(m84804c, "inflate(context.layoutInflater, this, true)");
        this.f67209k = m84804c;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum h uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BM\b\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m28432d2 = {"Lco/bird/android/widget/CallToActionBanner$a;", "", "", "b", "I", "e", "()I", Entry.TYPE_IMAGE, "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "title", DateTokenConverter.CONVERTER_KEY, "f", "subtitle", "callToActionText", "bottomCallToActionText", "", "Z", "()Z", "cancelable", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "h", "i", "j", "k", "l", "m", "n", "o", "p", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.CallToActionBanner$a */
    /* loaded from: classes4.dex */
    public static final class EnumC16470a {

        /* renamed from: h */
        public static final EnumC16470a f67210h;

        /* renamed from: i */
        public static final EnumC16470a f67211i;

        /* renamed from: j */
        public static final EnumC16470a f67212j;

        /* renamed from: k */
        public static final EnumC16470a f67213k;

        /* renamed from: l */
        public static final EnumC16470a f67214l;

        /* renamed from: m */
        public static final EnumC16470a f67215m;

        /* renamed from: n */
        public static final EnumC16470a f67216n;

        /* renamed from: o */
        public static final EnumC16470a f67217o;

        /* renamed from: p */
        public static final EnumC16470a f67218p;

        /* renamed from: q */
        public static final /* synthetic */ EnumC16470a[] f67219q;

        /* renamed from: b */
        public final int f67220b;

        /* renamed from: c */
        public final Integer f67221c;

        /* renamed from: d */
        public final Integer f67222d;

        /* renamed from: e */
        public final Integer f67223e;

        /* renamed from: f */
        public final Integer f67224f;

        /* renamed from: g */
        public final boolean f67225g;

        static {
            int i = C48193rg4.ic_one_leg_rider;
            f67210h = new EnumC16470a("ONBOARDING_START", 0, i, Integer.valueOf(C45871nl4.onboarding_banner_start_title), Integer.valueOf(C45871nl4.onboarding_banner_start_subtitle), Integer.valueOf(C45871nl4.onboarding_banner_start), null, false, 48, null);
            f67211i = new EnumC16470a("ONBOARDING_IN_PROGRESS", 1, i, Integer.valueOf(C45871nl4.onboarding_banner_in_progress_title), Integer.valueOf(C45871nl4.onboarding_banner_in_progress_subtitle), Integer.valueOf(C45871nl4.onboarding_banner_finish), null, false, 48, null);
            f67212j = new EnumC16470a("PREFERRED_PARKING_SUCCESS", 2, C48193rg4.ic_checkmark_green, Integer.valueOf(C45871nl4.parking_nest_success_title), null, null, null, false, 60, null);
            f67213k = new EnumC16470a("PARKING_INSTRUCTIONS", 3, C48193rg4.ic_parking_icon, Integer.valueOf(C45871nl4.parking_nest_introduction_title), null, null, null, true, 28, null);
            f67214l = new EnumC16470a("SUPERCHARGER_ONBOARDING", 4, C48193rg4.ic_supercharger_toast_badge, Integer.valueOf(C45871nl4.supercharger_flight_view_title), Integer.valueOf(C45871nl4.supercharger_flight_view_subtitle), null, null, true, 24, null);
            int i2 = C48193rg4.ic_parking_radius_icon;
            f67215m = new EnumC16470a("END_RIDE_IN_PARKING_SPOT", 5, i2, Integer.valueOf(C45871nl4.parking_nest_required_title), Integer.valueOf(C45871nl4.parking_nest_required_subtitle), null, null, false, 56, null);
            f67216n = new EnumC16470a("ALMOST_IN_PARKING_SPOT", 6, i2, null, null, null, Integer.valueOf(C45871nl4.parking_nest_almost_wrong_location), false, 46, null);
            int i3 = C48193rg4.ic_arrow_down_purple;
            int i4 = C45871nl4.required_release_alert;
            f67217o = new EnumC16470a("REQUIRED_RELEASE_DUE_SOON", 7, i3, Integer.valueOf(i4), null, null, null, false, 28, null);
            f67218p = new EnumC16470a("REQUIRED_RELEASE_PAST_DUE", 8, i3, Integer.valueOf(i4), null, null, null, false, 28, null);
            f67219q = m54701a();
        }

        public EnumC16470a(String str, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
            this.f67220b = i2;
            this.f67221c = num;
            this.f67222d = num2;
            this.f67223e = num3;
            this.f67224f = num4;
            this.f67225g = z;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC16470a[] m54701a() {
            return new EnumC16470a[]{f67210h, f67211i, f67212j, f67213k, f67214l, f67215m, f67216n, f67217o, f67218p};
        }

        public static EnumC16470a valueOf(String str) {
            return (EnumC16470a) Enum.valueOf(EnumC16470a.class, str);
        }

        public static EnumC16470a[] values() {
            return (EnumC16470a[]) f67219q.clone();
        }

        /* renamed from: b */
        public final Integer m54700b() {
            return this.f67224f;
        }

        /* renamed from: c */
        public final Integer m54699c() {
            return this.f67223e;
        }

        /* renamed from: d */
        public final boolean m54698d() {
            return this.f67225g;
        }

        /* renamed from: e */
        public final int m54697e() {
            return this.f67220b;
        }

        /* renamed from: f */
        public final Integer m54696f() {
            return this.f67222d;
        }

        /* renamed from: g */
        public final Integer m54695g() {
            return this.f67221c;
        }

        public /* synthetic */ EnumC16470a(String str, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, (i3 & 8) != 0 ? null : num3, (i3 & 16) != 0 ? null : num4, (i3 & 32) != 0 ? false : z);
        }
    }
}
