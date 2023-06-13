package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.DB6;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\f\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f\u001a\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0000\"\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006!"}, m28432d2 = {"Landroid/view/View;", "", "j", "l", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "valueInDp", C17296a.f69688o, "Landroid/app/Activity;", "", "i", "", "requestedOrientation", "k", "view", "height", "m", "g", "currentScreenOrientation", "LCy3;", "preferredOrientation", "f", "LDB6;", "windowInsets", "c", DateTokenConverter.CONVERTER_KEY, "e", "b", "h", "", "Ljava/lang/String;", "TAG", "android-sdk-ui_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "ViewUtils")
/* renamed from: Wt6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36938Wt6 {

    /* renamed from: a */
    public static final String f42265a = C43664k20.f93782a.m29432o("ViewUtils");

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$a */
    /* loaded from: classes5.dex */
    public static final class C9197a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9197a f42266g = new C9197a();

        public C9197a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current and preferred orientation are landscape.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$b */
    /* loaded from: classes5.dex */
    public static final class C9198b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9198b f42267g = new C9198b();

        public C9198b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current and preferred orientation are portrait.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$c */
    /* loaded from: classes5.dex */
    public static final class C9199c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f42268g;

        /* renamed from: h */
        public final /* synthetic */ EnumC32300Cy3 f42269h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9199c(int i, EnumC32300Cy3 enumC32300Cy3) {
            super(0);
            this.f42268g = i;
            this.f42269h = enumC32300Cy3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Current orientation " + this.f42268g + " and preferred orientation " + this.f42269h + " don't match";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$d */
    /* loaded from: classes5.dex */
    public static final class C9200d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9200d f42270g = new C9200d();

        public C9200d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "View passed in is null. Not removing from parent.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$e */
    /* loaded from: classes5.dex */
    public static final class C9201e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ View f42271g;

        /* renamed from: h */
        public final /* synthetic */ ViewGroup f42272h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9201e(View view, ViewGroup viewGroup) {
            super(0);
            this.f42271g = view;
            this.f42272h = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Removed view: " + this.f42271g + "\nfrom parent: " + this.f42272h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$f */
    /* loaded from: classes5.dex */
    public static final class C9202f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f42273g;

        /* renamed from: h */
        public final /* synthetic */ Activity f42274h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9202f(int i, Activity activity) {
            super(0);
            this.f42273g = i;
            this.f42274h = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to set requested orientation " + this.f42273g + " for activity class: " + this.f42274h.getLocalClassName();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wt6$g */
    /* loaded from: classes5.dex */
    public static final class C9203g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C9203g f42275g = new C9203g();

        public C9203g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while setting view to focusable in touch mode and requesting focus.";
        }
    }

    /* renamed from: a */
    public static final double m77743a(Context context, double d) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static final int m77742b(DB6 windowInsets) {
        int m42119a;
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C40730f51 m110785e = windowInsets.m110785e();
        if (m110785e == null) {
            m42119a = 0;
        } else {
            m42119a = m110785e.m42119a();
        }
        return Math.max(m42119a, windowInsets.m110784f(DB6.C1428m.m110715h()).f5129d);
    }

    /* renamed from: c */
    public static final int m77741c(DB6 windowInsets) {
        int m42118b;
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C40730f51 m110785e = windowInsets.m110785e();
        if (m110785e == null) {
            m42118b = 0;
        } else {
            m42118b = m110785e.m42118b();
        }
        return Math.max(m42118b, windowInsets.m110784f(DB6.C1428m.m110715h()).f5126a);
    }

    /* renamed from: d */
    public static final int m77740d(DB6 windowInsets) {
        int m42117c;
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C40730f51 m110785e = windowInsets.m110785e();
        if (m110785e == null) {
            m42117c = 0;
        } else {
            m42117c = m110785e.m42117c();
        }
        return Math.max(m42117c, windowInsets.m110784f(DB6.C1428m.m110715h()).f5128c);
    }

    /* renamed from: e */
    public static final int m77739e(DB6 windowInsets) {
        int m42116d;
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        C40730f51 m110785e = windowInsets.m110785e();
        if (m110785e == null) {
            m42116d = 0;
        } else {
            m42116d = m110785e.m42116d();
        }
        return Math.max(m42116d, windowInsets.m110784f(DB6.C1428m.m110715h()).f5127b);
    }

    /* renamed from: f */
    public static final boolean m77738f(int i, EnumC32300Cy3 preferredOrientation) {
        Intrinsics.checkNotNullParameter(preferredOrientation, "preferredOrientation");
        if (i == 2 && preferredOrientation == EnumC32300Cy3.LANDSCAPE) {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.D, null, false, C9197a.f42266g, 12, null);
            return true;
        } else if (i == 1 && preferredOrientation == EnumC32300Cy3.PORTRAIT) {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.D, null, false, C9198b.f42267g, 12, null);
            return true;
        } else {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.D, null, false, new C9199c(i, preferredOrientation), 12, null);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m77737g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m77736h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return !view.isInTouchMode();
    }

    /* renamed from: i */
    public static final boolean m77735i(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final void m77734j(View view) {
        ViewParent parent;
        if (view == null) {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.D, null, false, C9200d.f42270g, 12, null);
        }
        if (view == null) {
            parent = null;
        } else {
            parent = view.getParent();
        }
        if (parent instanceof ViewGroup) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                ViewGroup viewGroup = (ViewGroup) parent2;
                viewGroup.removeView(view);
                C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.D, null, false, new C9201e(view, viewGroup), 12, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: k */
    public static final void m77733k(Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.E, e, false, new C9202f(i, activity), 8, null);
        }
    }

    /* renamed from: l */
    public static final void m77732l(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            C43664k20.m29441f(C43664k20.f93782a, f42265a, C43664k20.EnumC25082a.E, e, false, C9203g.f42275g, 8, null);
        }
    }

    /* renamed from: m */
    public static final void m77731m(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
