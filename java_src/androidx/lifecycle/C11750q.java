package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11759u;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0007\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m28432d2 = {"LPi5;", "LXr6;", "T", "", "c", "(LPi5;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/p;", "b", "LFE0;", C17296a.f69688o, "LFE0$b;", "LFE0$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "LMi5;", "e", "(LXr6;)LMi5;", "savedStateHandlesVM", "LLi5;", DateTokenConverter.CONVERTER_KEY, "(LPi5;)LLi5;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "SavedStateHandleSupport")
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public final class C11750q {
    @JvmField

    /* renamed from: a */
    public static final FE0.InterfaceC2210b<InterfaceC35200Pi5> f54966a = new C11752b();
    @JvmField

    /* renamed from: b */
    public static final FE0.InterfaceC2210b<InterfaceC37154Xr6> f54967b = new C11753c();
    @JvmField

    /* renamed from: c */
    public static final FE0.InterfaceC2210b<Bundle> f54968c = new C11751a();

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m28432d2 = {"androidx/lifecycle/q$a", "LFE0$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public static final class C11751a implements FE0.InterfaceC2210b<Bundle> {
    }

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m28432d2 = {"androidx/lifecycle/q$b", "LFE0$b;", "LPi5;", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$b */
    /* loaded from: classes.dex */
    public static final class C11752b implements FE0.InterfaceC2210b<InterfaceC35200Pi5> {
    }

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m28432d2 = {"androidx/lifecycle/q$c", "LFE0$b;", "LXr6;", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$c */
    /* loaded from: classes.dex */
    public static final class C11753c implements FE0.InterfaceC2210b<InterfaceC37154Xr6> {
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LFE0;", "LMi5;", C17296a.f69688o, "(LFE0;)LMi5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$d */
    /* loaded from: classes.dex */
    public static final class C11754d extends Lambda implements Function1<FE0, C34498Mi5> {

        /* renamed from: g */
        public static final C11754d f54969g = new C11754d();

        public C11754d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C34498Mi5 invoke(FE0 initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new C34498Mi5();
        }
    }

    /* renamed from: a */
    public static final C11747p m66936a(FE0 fe0) {
        Intrinsics.checkNotNullParameter(fe0, "<this>");
        InterfaceC35200Pi5 interfaceC35200Pi5 = (InterfaceC35200Pi5) fe0.mo17471a(f54966a);
        if (interfaceC35200Pi5 != null) {
            InterfaceC37154Xr6 interfaceC37154Xr6 = (InterfaceC37154Xr6) fe0.mo17471a(f54967b);
            if (interfaceC37154Xr6 != null) {
                Bundle bundle = (Bundle) fe0.mo17471a(f54968c);
                String str = (String) fe0.mo17471a(C11759u.C11765c.f54998d);
                if (str != null) {
                    return m66935b(interfaceC35200Pi5, interfaceC37154Xr6, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    public static final C11747p m66935b(InterfaceC35200Pi5 interfaceC35200Pi5, InterfaceC37154Xr6 interfaceC37154Xr6, String str, Bundle bundle) {
        C34264Li5 m66933d = m66933d(interfaceC35200Pi5);
        C34498Mi5 m66932e = m66932e(interfaceC37154Xr6);
        C11747p c11747p = m66932e.m95007e().get(str);
        if (c11747p == null) {
            C11747p m66939a = C11747p.f54957f.m66939a(m66933d.m96424b(str), bundle);
            m66932e.m95007e().put(str, m66939a);
            return m66939a;
        }
        return c11747p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T extends InterfaceC35200Pi5 & InterfaceC37154Xr6> void m66934c(T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(t, "<this>");
        AbstractC11719f.EnumC11724b mo67007b = t.getLifecycle().mo67007b();
        if (mo67007b != AbstractC11719f.EnumC11724b.INITIALIZED && mo67007b != AbstractC11719f.EnumC11724b.CREATED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (t.getSavedStateRegistry().m66075c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                C34264Li5 c34264Li5 = new C34264Li5(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().m66069i("androidx.lifecycle.internal.SavedStateHandlesProvider", c34264Li5);
                t.getLifecycle().mo67008a(new SavedStateHandleAttacher(c34264Li5));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public static final C34264Li5 m66933d(InterfaceC35200Pi5 interfaceC35200Pi5) {
        C34264Li5 c34264Li5;
        Intrinsics.checkNotNullParameter(interfaceC35200Pi5, "<this>");
        C11966a.InterfaceC11969c m66075c = interfaceC35200Pi5.getSavedStateRegistry().m66075c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (m66075c instanceof C34264Li5) {
            c34264Li5 = (C34264Li5) m66075c;
        } else {
            c34264Li5 = null;
        }
        if (c34264Li5 != null) {
            return c34264Li5;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C34498Mi5 m66932e(InterfaceC37154Xr6 interfaceC37154Xr6) {
        Intrinsics.checkNotNullParameter(interfaceC37154Xr6, "<this>");
        G22 g22 = new G22();
        g22.m105940a(Reflection.getOrCreateKotlinClass(C34498Mi5.class), C11754d.f54969g);
        return (C34498Mi5) new C11759u(interfaceC37154Xr6, g22.m105939b()).m66921b("androidx.lifecycle.internal.SavedStateHandlesVM", C34498Mi5.class);
    }
}
