package p000;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003.\u0019\"B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J0\u0010!\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001eH\u0002J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002R\"\u0010+\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, m28432d2 = {"Lzy1;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "", "f", "Landroid/view/ViewGroup;", "container", "g", "k", "h", "", "isVisibleToUser", "m", "violatingFragment", "targetFragment", "", "requestCode", "l", "j", "i", "n", "Lzy1$c;", "b", "Landroidx/fragment/app/strictmode/Violation;", "violation", "e", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "p", "c", "Ljava/lang/Runnable;", "runnable", "o", "Lzy1$c;", "getDefaultPolicy", "()Lzy1$c;", "setDefaultPolicy", "(Lzy1$c;)V", "defaultPolicy", "<init>", "()V", C17296a.f69688o, "fragment_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: zy1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53112zy1 {

    /* renamed from: a */
    public static final C53112zy1 f122523a = new C53112zy1();

    /* renamed from: b */
    public static C31600c f122524b = C31600c.f122535d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lzy1$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "fragment_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: zy1$a */
    /* loaded from: classes.dex */
    public enum EnumC31598a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Lzy1$b;", "", "fragment_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: zy1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC31599b {
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0004BC\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00150\b¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R4\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0019"}, m28432d2 = {"Lzy1$c;", "", "", "Lzy1$a;", C17296a.f69688o, "Ljava/util/Set;", "()Ljava/util/Set;", "flags", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "Lzy1$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lzy1$b;", "()Lzy1$b;", "", "allowedViolations", "<init>", "(Ljava/util/Set;Lzy1$b;Ljava/util/Map;)V", "fragment_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: zy1$c */
    /* loaded from: classes.dex */
    public static final class C31600c {

        /* renamed from: c */
        public static final C31601a f122534c = new C31601a(null);
        @JvmField

        /* renamed from: d */
        public static final C31600c f122535d;

        /* renamed from: a */
        public final Set<EnumC31598a> f122536a;

        /* renamed from: b */
        public final Map<String, Set<Class<? extends Violation>>> f122537b;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lzy1$c$a;", "", "Lzy1$c;", "LAX", "Lzy1$c;", "<init>", "()V", "fragment_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: zy1$c$a */
        /* loaded from: classes.dex */
        public static final class C31601a {
            public /* synthetic */ C31601a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C31601a() {
            }
        }

        static {
            Set emptySet;
            Map emptyMap;
            emptySet = SetsKt__SetsKt.emptySet();
            emptyMap = MapsKt__MapsKt.emptyMap();
            f122535d = new C31600c(emptySet, null, emptyMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C31600c(Set<? extends EnumC31598a> flags, InterfaceC31599b interfaceC31599b, Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f122536a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f122537b = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<EnumC31598a> m63a() {
            return this.f122536a;
        }

        /* renamed from: b */
        public final InterfaceC31599b m62b() {
            return null;
        }

        /* renamed from: c */
        public final Map<String, Set<Class<? extends Violation>>> m61c() {
            return this.f122537b;
        }
    }

    private C53112zy1() {
    }

    /* renamed from: d */
    public static final void m77d(String str, Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: f */
    public static final void m75f(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(fragmentReuseViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_FRAGMENT_REUSE) && c53112zy1.m65p(m79b, fragment.getClass(), fragmentReuseViolation.getClass())) {
            c53112zy1.m78c(m79b, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: g */
    public static final void m74g(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(fragmentTagUsageViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_FRAGMENT_TAG_USAGE) && c53112zy1.m65p(m79b, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: h */
    public static final void m73h(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(getRetainInstanceUsageViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_RETAIN_INSTANCE_USAGE) && c53112zy1.m65p(m79b, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: i */
    public static final void m72i(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(getTargetFragmentRequestCodeUsageViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_TARGET_FRAGMENT_USAGE) && c53112zy1.m65p(m79b, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: j */
    public static final void m71j(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(getTargetFragmentUsageViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_TARGET_FRAGMENT_USAGE) && c53112zy1.m65p(m79b, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: k */
    public static final void m70k(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(setRetainInstanceUsageViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_RETAIN_INSTANCE_USAGE) && c53112zy1.m65p(m79b, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: l */
    public static final void m69l(Fragment violatingFragment, Fragment targetFragment, int i) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(setTargetFragmentUsageViolation);
        C31600c m79b = c53112zy1.m79b(violatingFragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_TARGET_FRAGMENT_USAGE) && c53112zy1.m65p(m79b, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            c53112zy1.m78c(m79b, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: m */
    public static final void m68m(Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(setUserVisibleHintViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_SET_USER_VISIBLE_HINT) && c53112zy1.m65p(m79b, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            c53112zy1.m78c(m79b, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /* renamed from: n */
    public static final void m67n(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        C53112zy1 c53112zy1 = f122523a;
        c53112zy1.m76e(wrongFragmentContainerViolation);
        C31600c m79b = c53112zy1.m79b(fragment);
        if (m79b.m63a().contains(EnumC31598a.DETECT_WRONG_FRAGMENT_CONTAINER) && c53112zy1.m65p(m79b, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            c53112zy1.m78c(m79b, wrongFragmentContainerViolation);
        }
    }

    /* renamed from: b */
    public final C31600c m79b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.m67402G0() != null) {
                    C31600c m67402G0 = parentFragmentManager.m67402G0();
                    Intrinsics.checkNotNull(m67402G0);
                    return m67402G0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f122524b;
    }

    /* renamed from: c */
    public final void m78c(C31600c c31600c, final Violation violation) {
        Fragment m67058a = violation.m67058a();
        final String name = m67058a.getClass().getName();
        if (c31600c.m63a().contains(EnumC31598a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        c31600c.m62b();
        if (c31600c.m63a().contains(EnumC31598a.PENALTY_DEATH)) {
            m66o(m67058a, new Runnable() { // from class: yy1
                @Override // java.lang.Runnable
                public final void run() {
                    C53112zy1.m77d(name, violation);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m76e(Violation violation) {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.m67058a().getClass().getName(), violation);
        }
    }

    /* renamed from: o */
    public final void m66o(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler m67213g = fragment.getParentFragmentManager().m67420A0().m67213g();
            Intrinsics.checkNotNullExpressionValue(m67213g, "fragment.parentFragmentManager.host.handler");
            if (Intrinsics.areEqual(m67213g.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                m67213g.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: p */
    public final boolean m65p(C31600c c31600c, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean contains;
        Set<Class<? extends Violation>> set = c31600c.m61c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.areEqual(cls2.getSuperclass(), Violation.class)) {
            contains = CollectionsKt___CollectionsKt.contains(set, cls2.getSuperclass());
            if (contains) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
