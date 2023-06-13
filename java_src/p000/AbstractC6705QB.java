package p000;

import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001kB/\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0016\u0010\u001f\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0003H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010E\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00106R\u001a\u0010Q\u001a\u00020L8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010Y\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u00010\u00140\u00140U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR(\u0010_\u001a\u0010\u0012\f\u0012\n V*\u0004\u0018\u00010\u00050\u00050Z8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R0\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006l"}, m28432d2 = {"LQB;", "LxE;", "LZ03;", "", "show", "", "Xl", "Ql", "ml", "Kh", "Lco/bird/android/model/User;", "user", "q1", "", "resId", "setIcon", "title", "Le", "", "Te", "Lco/bird/android/model/UserRoleItem;", "roleItem", "cc", "qd", "collapse", "b7", "Lio/reactivex/Observable;", "Uf", "Ge", "", "userRolesAndTitles", "gi", "g4", "setPadding", "Mj", "G8", "Landroidx/drawerlayout/widget/DrawerLayout;", "b", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Lcom/google/android/material/navigation/NavigationView;", "c", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "preference", "LTq4;", "e", "LTq4;", "reactiveConfig", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getRoleIcon", "()Landroid/widget/ImageView;", "roleIcon", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "Ul", "()Landroid/widget/TextView;", "roleTitle", "Landroidx/appcompat/widget/SwitchCompat;", "h", "Landroidx/appcompat/widget/SwitchCompat;", "Tl", "()Landroidx/appcompat/widget/SwitchCompat;", "roleSwitch", "Landroid/view/View;", "i", "Landroid/view/View;", "roleContainer", "j", "roleDropdownIndicator", "Landroid/view/ViewGroup;", "k", "Landroid/view/ViewGroup;", "Sl", "()Landroid/view/ViewGroup;", "roleDropdownContainer", "l", "Z", "roleSelectorCollapsed", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/a;", "roleItemClicksSubject", "Lma4;", "n", "Lma4;", "Wl", "()Lma4;", "toolbarNavigationClicks", "<set-?>", "o", "Ljava/util/List;", "Vl", "()Ljava/util/List;", "roles", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/google/android/material/navigation/NavigationView;Lgl;LTq4;)V", "p", C17296a.f69688o, "nav-drawer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseNavigationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNavigationUi.kt\nco/bird/android/library/navigation/drawer/BaseNavigationUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1855#2,2:245\n*S KotlinDebug\n*F\n+ 1 BaseNavigationUi.kt\nco/bird/android/library/navigation/drawer/BaseNavigationUi\n*L\n195#1:245,2\n*E\n"})
/* renamed from: QB */
/* loaded from: classes3.dex */
public abstract class AbstractC6705QB extends AbstractC30071xE implements Z03 {

    /* renamed from: p */
    public static final C6706a f29978p = new C6706a(null);

    /* renamed from: b */
    public final DrawerLayout f29979b;

    /* renamed from: c */
    public final NavigationView f29980c;

    /* renamed from: d */
    public final C22454gl f29981d;

    /* renamed from: e */
    public final C36207Tq4 f29982e;

    /* renamed from: f */
    public final ImageView f29983f;

    /* renamed from: g */
    public final TextView f29984g;

    /* renamed from: h */
    public final SwitchCompat f29985h;

    /* renamed from: i */
    public final View f29986i;

    /* renamed from: j */
    public final ImageView f29987j;

    /* renamed from: k */
    public final ViewGroup f29988k;

    /* renamed from: l */
    public boolean f29989l;

    /* renamed from: m */
    public final C24552a<UserRoleItem> f29990m;

    /* renamed from: n */
    public final C45168ma4<Unit> f29991n;

    /* renamed from: o */
    public List<UserRoleItem> f29992o;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LQB$a;", "", "", "DROPDOWN_ANIMATION_DURATION_IN_MILLIS", "J", "<init>", "()V", "nav-drawer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: QB$a */
    /* loaded from: classes3.dex */
    public static final class C6706a {
        public /* synthetic */ C6706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6706a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QB$b */
    /* loaded from: classes3.dex */
    public static final class C6707b extends Lambda implements Function1<View, Unit> {

        /* renamed from: h */
        public final /* synthetic */ UserRoleItem f29994h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6707b(UserRoleItem userRoleItem) {
            super(1);
            this.f29994h = userRoleItem;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            AbstractC6705QB.this.f29990m.onNext(this.f29994h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6705QB(BaseActivity activity, DrawerLayout drawer, NavigationView navigationView, C22454gl preference, C36207Tq4 reactiveConfig) {
        super(activity);
        List<UserRoleItem> emptyList;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(drawer, "drawer");
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f29979b = drawer;
        this.f29980c = navigationView;
        this.f29981d = preference;
        this.f29982e = reactiveConfig;
        this.f29989l = true;
        C24552a<UserRoleItem> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<UserRoleItem>()");
        this.f29990m = m31922e;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f29991n = m25409g;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f29992o = emptyList;
        View header = navigationView.mo45937g(0);
        Intrinsics.checkNotNullExpressionValue(header, "header");
        this.f29983f = (ImageView) C49520tu6.m11243h(header, C50583vi4.roleIcon);
        this.f29984g = (TextView) C49520tu6.m11243h(header, C50583vi4.roleTitle);
        this.f29985h = (SwitchCompat) C49520tu6.m11243h(header, C50583vi4.roleSwitch);
        this.f29986i = C49520tu6.m11243h(header, C50583vi4.roleContainer);
        this.f29987j = (ImageView) C49520tu6.m11243h(header, C50583vi4.roleDropdownIndicator);
        this.f29988k = (ViewGroup) C49520tu6.m11243h(header, C50583vi4.userRoleDropdownContainer);
    }

    /* renamed from: Rl */
    public static final void m88801Rl(AbstractC6705QB this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f29980c.requestLayout();
    }

    @Override // p000.Z03
    /* renamed from: G8 */
    public Observable<Unit> mo73883G8() {
        Observable<Unit> hide = this.f29991n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "toolbarNavigationClicks.hide()");
        return hide;
    }

    @Override // p000.Z03
    /* renamed from: Ge */
    public boolean mo73882Ge() {
        return this.f29989l;
    }

    @Override // p000.Z03
    /* renamed from: Kh */
    public void mo73881Kh() {
        if (this.f29979b.m67611C(8388611)) {
            this.f29979b.m67588d(8388611);
        }
    }

    @Override // p000.Z03
    /* renamed from: Le */
    public void mo73880Le(int i) {
        this.f29984g.setText(i);
    }

    @Override // p000.Z03
    /* renamed from: Mj */
    public void mo73879Mj(boolean z) {
        int i;
        if (z) {
            i = this.f29983f.getResources().getDimensionPixelSize(C37044Xf4.nav_view_role_icon_padding);
        } else {
            i = 0;
        }
        this.f29983f.setPadding(i, i, i, i);
    }

    /* renamed from: Ql */
    public final void m88802Ql() {
        boolean z;
        ViewPropertyAnimator animate = this.f29987j.animate();
        animate.setDuration(200L);
        ViewPropertyAnimator withEndAction = animate.withEndAction(new Runnable() { // from class: PB
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC6705QB.m88801Rl(AbstractC6705QB.this);
            }
        });
        float f = 0.0f;
        if (this.f29987j.getRotation() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 180.0f;
        }
        withEndAction.rotation(f).start();
    }

    /* renamed from: Sl */
    public final ViewGroup m88800Sl() {
        return this.f29988k;
    }

    @Override // p000.Z03
    /* renamed from: Te */
    public void mo73878Te(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f29984g.setText(title);
    }

    /* renamed from: Tl */
    public final SwitchCompat m88799Tl() {
        return this.f29985h;
    }

    @Override // p000.Z03
    /* renamed from: Uf */
    public Observable<Unit> mo73877Uf() {
        Observable<Unit> merge = Observable.merge(C44626lf5.clicksThrottle$default(this.f29986i, 0L, 1, null), C44626lf5.clicksThrottle$default(this.f29987j, 0L, 1, null));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      roleContain…or.clicksThrottle()\n    )");
        return merge;
    }

    /* renamed from: Ul */
    public final TextView m88798Ul() {
        return this.f29984g;
    }

    /* renamed from: Vl */
    public final List<UserRoleItem> m88797Vl() {
        return this.f29992o;
    }

    /* renamed from: Wl */
    public final C45168ma4<Unit> m88796Wl() {
        return this.f29991n;
    }

    /* renamed from: Xl */
    public final void m88795Xl(boolean z) {
        C49520tu6.show$default(this.f29988k, z, 0, 2, null);
    }

    @Override // p000.Z03
    /* renamed from: b7 */
    public void mo73876b7(boolean z) {
        this.f29989l = z;
        m88795Xl(!z);
        m88802Ql();
    }

    @Override // p000.Z03
    @SuppressLint({"ResourceType"})
    /* renamed from: cc */
    public void mo73875cc(UserRoleItem roleItem) {
        Intrinsics.checkNotNullParameter(roleItem, "roleItem");
        String userRoleTitle = roleItem.getUserRoleTitle();
        if (userRoleTitle != null) {
            mo73878Te(userRoleTitle);
            return;
        }
        Integer userRoleTitleStringRes = roleItem.getUserRoleTitleStringRes();
        if (userRoleTitleStringRes != null) {
            mo73880Le(userRoleTitleStringRes.intValue());
        }
    }

    @Override // p000.Z03
    /* renamed from: g4 */
    public Observable<UserRoleItem> mo73874g4() {
        Observable<UserRoleItem> hide = this.f29990m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "roleItemClicksSubject.hide()");
        return hide;
    }

    @Override // p000.Z03
    /* renamed from: gi */
    public void mo73873gi(List<UserRoleItem> userRolesAndTitles) {
        Intrinsics.checkNotNullParameter(userRolesAndTitles, "userRolesAndTitles");
        if (!this.f29992o.isEmpty()) {
            this.f29988k.removeViews(0, this.f29992o.size());
        }
        this.f29992o = userRolesAndTitles;
        for (UserRoleItem userRoleItem : userRolesAndTitles) {
            C39890dg2 m43903c = C39890dg2.m43903c(getActivity().getLayoutInflater(), this.f29988k, false);
            Intrinsics.checkNotNullExpressionValue(m43903c, "inflate(activity.layoutI…DropdownContainer, false)");
            String userRoleTitle = userRoleItem.getUserRoleTitle();
            if (userRoleTitle != null) {
                m43903c.f77026b.setText(userRoleTitle);
            } else {
                Integer userRoleTitleStringRes = userRoleItem.getUserRoleTitleStringRes();
                if (userRoleTitleStringRes != null) {
                    m43903c.f77026b.setText(userRoleTitleStringRes.intValue());
                }
            }
            this.f29988k.addView(m43903c.getRoot(), 0);
            RelativeLayout root = m43903c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C6707b(userRoleItem));
        }
    }

    @Override // p000.Z03
    /* renamed from: ml */
    public void mo73872ml(boolean z) {
        C49520tu6.show$default(this.f29985h, z, 0, 2, null);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f29984g.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(16);
            layoutParams2.addRule(16, C50583vi4.roleSwitch);
            this.f29984g.setLayoutParams(layoutParams2);
        }
    }

    @Override // p000.Z03
    /* renamed from: q1 */
    public void mo73871q1(User user) {
        TextView textView;
        View actionView;
        Intrinsics.checkNotNullParameter(user, "user");
        MenuItem findItem = this.f29980c.m49298h().findItem(C50583vi4.nav_settings);
        if (findItem != null && (actionView = findItem.getActionView()) != null) {
            textView = (TextView) C49520tu6.m11243h(actionView, C50583vi4.countText);
        } else {
            textView = null;
        }
        if (textView != null) {
            int missingInfoCount = UserKt.missingInfoCount(user);
            if (missingInfoCount == 0) {
                C49520tu6.m11239l(textView);
                return;
            }
            C49520tu6.m11233r(textView);
            textView.setText(String.valueOf(missingInfoCount));
        }
    }

    @Override // p000.Z03
    /* renamed from: qd */
    public void mo73870qd(boolean z) {
        C49520tu6.show$default(this.f29987j, z, 0, 2, null);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f29984g.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(16);
            layoutParams2.addRule(16, C50583vi4.roleDropdownIndicator);
            this.f29984g.setLayoutParams(layoutParams2);
        }
    }

    @Override // p000.Z03
    public void setIcon(int i) {
        this.f29983f.setImageDrawable(C29611vi.m8248b(getActivity(), i));
    }
}
