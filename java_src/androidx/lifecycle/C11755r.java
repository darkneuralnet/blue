package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C11759u;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b%\u0010&B%\b\u0017\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010)J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0017R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, m28432d2 = {"Landroidx/lifecycle/r;", "Landroidx/lifecycle/u$d;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)LOr6;", "(Ljava/lang/Class;)LOr6;", "viewModel", "", C17296a.f69688o, "Landroid/app/Application;", "Landroid/app/Application;", "application", "c", "Landroidx/lifecycle/u$b;", "factory", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/f;", "e", "Landroidx/lifecycle/f;", "lifecycle", "Landroidx/savedstate/a;", "f", "Landroidx/savedstate/a;", "savedStateRegistry", "<init>", "()V", "LPi5;", "owner", "(Landroid/app/Application;LPi5;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public final class C11755r extends C11759u.C11768d implements C11759u.InterfaceC11763b {

    /* renamed from: b */
    public Application f54970b;

    /* renamed from: c */
    public final C11759u.InterfaceC11763b f54971c;

    /* renamed from: d */
    public Bundle f54972d;

    /* renamed from: e */
    public AbstractC11719f f54973e;

    /* renamed from: f */
    public C11966a f54974f;

    public C11755r() {
        this.f54971c = new C11759u.C11760a();
    }

    @Override // androidx.lifecycle.C11759u.C11768d
    /* renamed from: a */
    public void mo66912a(AbstractC35048Or6 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f54973e != null) {
            C11966a c11966a = this.f54974f;
            Intrinsics.checkNotNull(c11966a);
            AbstractC11719f abstractC11719f = this.f54973e;
            Intrinsics.checkNotNull(abstractC11719f);
            LegacySavedStateHandleController.m67048a(viewModel, c11966a, abstractC11719f);
        }
    }

    /* renamed from: b */
    public final <T extends AbstractC35048Or6> T m66930b(String key, Class<T> modelClass) {
        List list;
        Constructor m88160c;
        T t;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC11719f abstractC11719f = this.f54973e;
        if (abstractC11719f != null) {
            boolean isAssignableFrom = C23294ie.class.isAssignableFrom(modelClass);
            if (isAssignableFrom && this.f54970b != null) {
                list2 = C35434Qi5.f30781a;
                m88160c = C35434Qi5.m88160c(modelClass, list2);
            } else {
                list = C35434Qi5.f30782b;
                m88160c = C35434Qi5.m88160c(modelClass, list);
            }
            if (m88160c == null) {
                if (this.f54970b != null) {
                    return (T) this.f54971c.create(modelClass);
                }
                return (T) C11759u.C11765c.f54996b.m66913a().create(modelClass);
            }
            C11966a c11966a = this.f54974f;
            Intrinsics.checkNotNull(c11966a);
            SavedStateHandleController m67047b = LegacySavedStateHandleController.m67047b(c11966a, abstractC11719f, key, this.f54972d);
            if (isAssignableFrom && (application = this.f54970b) != null) {
                Intrinsics.checkNotNull(application);
                t = (T) C35434Qi5.m88159d(modelClass, m88160c, application, m67047b.m67036b());
            } else {
                t = (T) C35434Qi5.m88159d(modelClass, m88160c, m67047b.m67036b());
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", m67047b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
        List list;
        Constructor m88160c;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.mo17471a(C11759u.C11765c.f54998d);
        if (str != null) {
            if (extras.mo17471a(C11750q.f54966a) != null && extras.mo17471a(C11750q.f54967b) != null) {
                Application application = (Application) extras.mo17471a(C11759u.C11760a.f54991h);
                boolean isAssignableFrom = C23294ie.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    list2 = C35434Qi5.f30781a;
                    m88160c = C35434Qi5.m88160c(modelClass, list2);
                } else {
                    list = C35434Qi5.f30782b;
                    m88160c = C35434Qi5.m88160c(modelClass, list);
                }
                if (m88160c == null) {
                    return (T) this.f54971c.create(modelClass, extras);
                }
                return (!isAssignableFrom || application == null) ? (T) C35434Qi5.m88159d(modelClass, m88160c, C11750q.m66936a(extras)) : (T) C35434Qi5.m88159d(modelClass, m88160c, application, C11750q.m66936a(extras));
            } else if (this.f54973e != null) {
                return (T) m66930b(str, modelClass);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @SuppressLint({"LambdaLast"})
    public C11755r(Application application, InterfaceC35200Pi5 owner, Bundle bundle) {
        C11759u.C11760a c11760a;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f54974f = owner.getSavedStateRegistry();
        this.f54973e = owner.getLifecycle();
        this.f54972d = bundle;
        this.f54970b = application;
        if (application != null) {
            c11760a = C11759u.C11760a.f54989f.m66916b(application);
        } else {
            c11760a = new C11759u.C11760a();
        }
        this.f54971c = c11760a;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m66930b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
