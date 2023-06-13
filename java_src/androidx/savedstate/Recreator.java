package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import androidx.savedstate.C11966a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\n\fB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/i;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "", "className", C17296a.f69688o, "LPi5;", "b", "LPi5;", "owner", "<init>", "(LPi5;)V", "c", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC11728i {

    /* renamed from: c */
    public static final C11964a f55613c = new C11964a(null);

    /* renamed from: b */
    public final InterfaceC35200Pi5 f55614b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Landroidx/savedstate/Recreator$a;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "<init>", "()V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C11964a {
        public /* synthetic */ C11964a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11964a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, m28432d2 = {"Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/a$c;", "Landroid/os/Bundle;", C17296a.f69688o, "", "className", "", "b", "", "Ljava/util/Set;", "classes", "Landroidx/savedstate/a;", "registry", "<init>", "(Landroidx/savedstate/a;)V", "savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.Recreator$b */
    /* loaded from: classes.dex */
    public static final class C11965b implements C11966a.InterfaceC11969c {

        /* renamed from: a */
        public final Set<String> f55615a;

        public C11965b(C11966a registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f55615a = new LinkedHashSet();
            registry.m66069i("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.C11966a.InterfaceC11969c
        /* renamed from: a */
        public Bundle mo18217a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f55615a));
            return bundle;
        }

        /* renamed from: b */
        public final void m66078b(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f55615a.add(className);
        }
    }

    public Recreator(InterfaceC35200Pi5 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f55614b = owner;
    }

    /* renamed from: a */
    public final void m66079a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C11966a.InterfaceC11967a.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C11966a.InterfaceC11967a) newInstance).mo66066a(this.f55614b);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC11719f.EnumC11720a.ON_CREATE) {
            source.getLifecycle().mo67006d(this);
            Bundle m66076b = this.f55614b.getSavedStateRegistry().m66076b("androidx.savedstate.Restarter");
            if (m66076b == null) {
                return;
            }
            ArrayList<String> stringArrayList = m66076b.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    m66079a(str);
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
