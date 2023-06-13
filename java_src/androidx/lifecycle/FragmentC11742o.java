package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0003\u0014\u000f\u0011B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"Landroidx/lifecycle/o;", "Landroid/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/o$a;", "processListener", "f", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", DateTokenConverter.CONVERTER_KEY, "c", "Landroidx/lifecycle/f$a;", "event", C17296a.f69688o, "Landroidx/lifecycle/o$a;", "<init>", "()V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public class FragmentC11742o extends Fragment {

    /* renamed from: c */
    public static final C11744b f54955c = new C11744b(null);

    /* renamed from: b */
    public InterfaceC11743a f54956b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"Landroidx/lifecycle/o$a;", "", "", C17296a.f69688o, "onStart", "onResume", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11743a {
        /* renamed from: a */
        void mo66957a();

        void onResume();

        void onStart();
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Landroidx/lifecycle/o$b;", "", "Landroid/app/Activity;", "activity", "", "c", "Landroidx/lifecycle/f$a;", "event", C17296a.f69688o, "(Landroid/app/Activity;Landroidx/lifecycle/f$a;)V", "Landroidx/lifecycle/o;", "b", "(Landroid/app/Activity;)Landroidx/lifecycle/o;", "get$annotations", "(Landroid/app/Activity;)V", "reportFragment", "", "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "<init>", "()V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$b */
    /* loaded from: classes.dex */
    public static final class C11744b {
        public /* synthetic */ C11744b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m66956a(Activity activity, AbstractC11719f.EnumC11720a event) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof InterfaceC33397Hq2) {
                ((InterfaceC33397Hq2) activity).getLifecycle().m67001i(event);
            } else if (activity instanceof LifecycleOwner) {
                AbstractC11719f lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof C11729j) {
                    ((C11729j) lifecycle).m67001i(event);
                }
            }
        }

        @JvmName(name = "get")
        /* renamed from: b */
        public final FragmentC11742o m66955b(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC11742o) findFragmentByTag;
        }

        @JvmStatic
        /* renamed from: c */
        public final void m66954c(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                C11745c.Companion.m66953a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC11742o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private C11744b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0019"}, m28432d2 = {"Landroidx/lifecycle/o$c;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "savedInstanceState", "onActivityPostCreated", "onActivityStarted", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "<init>", "()V", "Companion", C17296a.f69688o, "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.o$c */
    /* loaded from: classes.dex */
    public static final class C11745c implements Application.ActivityLifecycleCallbacks {
        public static final C11746a Companion = new C11746a(null);

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Landroidx/lifecycle/o$c$a;", "", "Landroid/app/Activity;", "activity", "", C17296a.f69688o, "<init>", "()V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.o$c$a */
        /* loaded from: classes.dex */
        public static final class C11746a {
            public /* synthetic */ C11746a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final void m66953a(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new C11745c());
            }

            private C11746a() {
            }
        }

        @JvmStatic
        public static final void registerIn(Activity activity) {
            Companion.m66953a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            FragmentC11742o.f54955c.m66956a(activity, AbstractC11719f.EnumC11720a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m66959e(Activity activity) {
        f54955c.m66954c(activity);
    }

    /* renamed from: a */
    public final void m66963a(AbstractC11719f.EnumC11720a enumC11720a) {
        if (Build.VERSION.SDK_INT < 29) {
            C11744b c11744b = f54955c;
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            c11744b.m66956a(activity, enumC11720a);
        }
    }

    /* renamed from: b */
    public final void m66962b(InterfaceC11743a interfaceC11743a) {
        if (interfaceC11743a != null) {
            interfaceC11743a.mo66957a();
        }
    }

    /* renamed from: c */
    public final void m66961c(InterfaceC11743a interfaceC11743a) {
        if (interfaceC11743a != null) {
            interfaceC11743a.onResume();
        }
    }

    /* renamed from: d */
    public final void m66960d(InterfaceC11743a interfaceC11743a) {
        if (interfaceC11743a != null) {
            interfaceC11743a.onStart();
        }
    }

    /* renamed from: f */
    public final void m66958f(InterfaceC11743a interfaceC11743a) {
        this.f54956b = interfaceC11743a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m66962b(this.f54956b);
        m66963a(AbstractC11719f.EnumC11720a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m66963a(AbstractC11719f.EnumC11720a.ON_DESTROY);
        this.f54956b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m66963a(AbstractC11719f.EnumC11720a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m66961c(this.f54956b);
        m66963a(AbstractC11719f.EnumC11720a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m66960d(this.f54956b);
        m66963a(AbstractC11719f.EnumC11720a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m66963a(AbstractC11719f.EnumC11720a.ON_STOP);
    }
}
