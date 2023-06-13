package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.braze.push.NotificationTrampolineActivity;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0016\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"LT10;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityStarted", "onActivityStopped", "onActivityResumed", "onActivityPaused", "Landroid/os/Bundle;", "bundle", "onActivityCreated", "onActivitySaveInstanceState", "onActivityDestroyed", "", "forSessionHandling", "c", "b", "Z", "sessionHandlingEnabled", "registerInAppMessageManager", "", "Ljava/lang/Class;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "inAppMessagingRegistrationBlocklist", "e", "sessionHandlingBlocklist", "<init>", "(ZZLjava/util/Set;Ljava/util/Set;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: T10 */
/* loaded from: classes2.dex */
public class T10 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final boolean f34625b;

    /* renamed from: c */
    public final boolean f34626c;

    /* renamed from: d */
    public Set<? extends Class<?>> f34627d;

    /* renamed from: e */
    public Set<? extends Class<?>> f34628e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$a */
    /* loaded from: classes2.dex */
    public static final class C7633a extends Lambda implements Function0<String> {
        public C7633a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: ", T10.this.f34627d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$b */
    /* loaded from: classes2.dex */
    public static final class C7634b extends Lambda implements Function0<String> {
        public C7634b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("BrazeActivityLifecycleCallbackListener using session handling blocklist: ", T10.this.f34628e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$c */
    /* loaded from: classes2.dex */
    public static final class C7635c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Activity f34631g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7635c(Activity activity) {
            super(0);
            this.f34631g = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ", this.f34631g.getClass());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$d */
    /* loaded from: classes2.dex */
    public static final class C7636d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Activity f34632g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7636d(Activity activity) {
            super(0);
            this.f34632g = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically calling lifecycle method: unregisterInAppMessageManager for class: ", this.f34632g.getClass());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$e */
    /* loaded from: classes2.dex */
    public static final class C7637e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Activity f34633g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7637e(Activity activity) {
            super(0);
            this.f34633g = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically calling lifecycle method: registerInAppMessageManager for class: ", this.f34633g.getClass());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$f */
    /* loaded from: classes2.dex */
    public static final class C7638f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Activity f34634g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7638f(Activity activity) {
            super(0);
            this.f34634g = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically calling lifecycle method: openSession for class: ", this.f34634g.getClass());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$g */
    /* loaded from: classes2.dex */
    public static final class C7639g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Activity f34635g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7639g(Activity activity) {
            super(0);
            this.f34635g = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically calling lifecycle method: closeSession for class: ", this.f34635g.getClass());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: T10$h */
    /* loaded from: classes2.dex */
    public static final class C7640h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C7640h f34636g = new C7640h();

        public C7640h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Skipping automatic registration for notification trampoline activity class.";
        }
    }

    @JvmOverloads
    public T10() {
        this(false, false, null, null, 15, null);
    }

    /* renamed from: c */
    public final boolean m84425c(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Class<?> cls = activity.getClass();
        if (Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C7640h.f34636g, 6, null);
            return false;
        }
        if (z) {
            if (this.f34628e.contains(cls)) {
                return false;
            }
        } else if (this.f34627d.contains(cls)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34626c && m84425c(activity, false)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C7635c(activity), 6, null);
            C42478i20.m35358s().m35359r(activity.getApplicationContext());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34626c && m84425c(activity, false)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C7636d(activity), 6, null);
            C42478i20.m35358s().m35367A(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34626c && m84425c(activity, false)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C7637e(activity), 6, null);
            C42478i20.m35358s().m35353x(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34625b && m84425c(activity, true)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C7638f(activity), 6, null);
            P10.getInstance(activity.getApplicationContext()).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f34625b && m84425c(activity, true)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C7639g(activity), 6, null);
            P10.getInstance(activity.getApplicationContext()).closeSession(activity);
        }
    }

    @JvmOverloads
    public T10(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.f34625b = z;
        this.f34626c = z2;
        this.f34627d = set == null ? SetsKt__SetsKt.emptySet() : set;
        this.f34628e = set2 == null ? SetsKt__SetsKt.emptySet() : set2;
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.V;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C7633a(), 6, null);
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C7634b(), 6, null);
    }

    public /* synthetic */ T10(boolean z, boolean z2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 8) != 0 ? SetsKt__SetsKt.emptySet() : set2);
    }
}
