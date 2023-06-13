package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import androidx.savedstate.C11966a;
import androidx.savedstate.Recreator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010%\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010-\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b*\u0010$\"\u0004\b+\u0010,¨\u00060"}, m28432d2 = {"Landroidx/savedstate/a;", "", "", "key", "Landroid/os/Bundle;", "b", "Landroidx/savedstate/a$c;", "provider", "", "i", "c", "k", "Ljava/lang/Class;", "Landroidx/savedstate/a$a;", "clazz", "j", "Landroidx/lifecycle/f;", "lifecycle", "f", "(Landroidx/lifecycle/f;)V", "savedState", "g", "(Landroid/os/Bundle;)V", "outBundle", "h", "Lph5;", C17296a.f69688o, "Lph5;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", DateTokenConverter.CONVERTER_KEY, "()Z", "isRestored", "Landroidx/savedstate/Recreator$b;", "e", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* renamed from: androidx.savedstate.a */
/* loaded from: classes.dex */
public final class C11966a {

    /* renamed from: g */
    public static final C11968b f55616g = new C11968b(null);

    /* renamed from: b */
    public boolean f55618b;

    /* renamed from: c */
    public Bundle f55619c;

    /* renamed from: d */
    public boolean f55620d;

    /* renamed from: e */
    public Recreator.C11965b f55621e;

    /* renamed from: a */
    public final C47018ph5<String, InterfaceC11969c> f55617a = new C47018ph5<>();

    /* renamed from: f */
    public boolean f55622f = true;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"Landroidx/savedstate/a$a;", "", "LPi5;", "owner", "", C17296a.f69688o, "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11967a {
        /* renamed from: a */
        void mo66066a(InterfaceC35200Pi5 interfaceC35200Pi5);
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Landroidx/savedstate/a$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.a$b */
    /* loaded from: classes.dex */
    public static final class C11968b {
        public /* synthetic */ C11968b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11968b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m28432d2 = {"Landroidx/savedstate/a$c;", "", "Landroid/os/Bundle;", C17296a.f69688o, "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11969c {
        /* renamed from: a */
        Bundle mo18217a();
    }

    /* renamed from: e */
    public static final void m66073e(C11966a this$0, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC11719f.EnumC11720a.ON_START) {
            this$0.f55622f = true;
        } else if (event == AbstractC11719f.EnumC11720a.ON_STOP) {
            this$0.f55622f = false;
        }
    }

    /* renamed from: b */
    public final Bundle m66076b(String key) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f55620d) {
            Bundle bundle2 = this.f55619c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(key);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f55619c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.f55619c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f55619c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final InterfaceC11969c m66075c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<Map.Entry<String, InterfaceC11969c>> it = this.f55617a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC11969c> components = it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            InterfaceC11969c value = components.getValue();
            if (Intrinsics.areEqual(components.getKey(), key)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m66074d() {
        return this.f55620d;
    }

    /* renamed from: f */
    public final void m66072f(AbstractC11719f lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f55618b) {
            lifecycle.mo67008a(new InterfaceC11728i() { // from class: Ni5
                @Override // androidx.lifecycle.InterfaceC11728i
                public final void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    C11966a.m66073e(C11966a.this, lifecycleOwner, enumC11720a);
                }
            });
            this.f55618b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: g */
    public final void m66071g(Bundle bundle) {
        Bundle bundle2;
        if (this.f55618b) {
            if (!this.f55620d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                this.f55619c = bundle2;
                this.f55620d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    /* renamed from: h */
    public final void m66070h(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f55619c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C47018ph5<String, InterfaceC11969c>.C27337d m18969c = this.f55617a.m18969c();
        Intrinsics.checkNotNullExpressionValue(m18969c, "this.components.iteratorWithAdditions()");
        while (m18969c.hasNext()) {
            Map.Entry next = m18969c.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC11969c) next.getValue()).mo18217a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }

    /* renamed from: i */
    public final void m66069i(String key, InterfaceC11969c provider) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.f55617a.mo18966h(key, provider) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    /* renamed from: j */
    public final void m66068j(Class<? extends InterfaceC11967a> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this.f55622f) {
            Recreator.C11965b c11965b = this.f55621e;
            if (c11965b == null) {
                c11965b = new Recreator.C11965b(this);
            }
            this.f55621e = c11965b;
            try {
                clazz.getDeclaredConstructor(new Class[0]);
                Recreator.C11965b c11965b2 = this.f55621e;
                if (c11965b2 != null) {
                    String name = clazz.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                    c11965b2.m66078b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    /* renamed from: k */
    public final void m66067k(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f55617a.mo18965j(key);
    }
}
