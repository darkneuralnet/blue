package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.C11966a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, m28432d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/f;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "b", "LOr6;", "viewModel", "", C17296a.f69688o, "c", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final LegacySavedStateHandleController f54835a = new LegacySavedStateHandleController();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$a;", "Landroidx/savedstate/a$a;", "LPi5;", "owner", "", C17296a.f69688o, "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C11700a implements C11966a.InterfaceC11967a {
        @Override // androidx.savedstate.C11966a.InterfaceC11967a
        /* renamed from: a */
        public void mo66066a(InterfaceC35200Pi5 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (owner instanceof InterfaceC37154Xr6) {
                C36920Wr6 viewModelStore = ((InterfaceC37154Xr6) owner).getViewModelStore();
                C11966a savedStateRegistry = owner.getSavedStateRegistry();
                for (String str : viewModelStore.m77777c()) {
                    AbstractC35048Or6 m77778b = viewModelStore.m77778b(str);
                    Intrinsics.checkNotNull(m77778b);
                    LegacySavedStateHandleController.m67048a(m77778b, savedStateRegistry, owner.getLifecycle());
                }
                if (!viewModelStore.m77777c().isEmpty()) {
                    savedStateRegistry.m66068j(C11700a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m67048a(AbstractC35048Or6 viewModel, C11966a registry, AbstractC11719f lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.m67035d()) {
            savedStateHandleController.m67037a(registry, lifecycle);
            f54835a.m67046c(registry, lifecycle);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final SavedStateHandleController m67047b(C11966a registry, AbstractC11719f lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C11747p.f54957f.m66939a(registry.m66076b(str), bundle));
        savedStateHandleController.m67037a(registry, lifecycle);
        f54835a.m67046c(registry, lifecycle);
        return savedStateHandleController;
    }

    /* renamed from: c */
    public final void m67046c(final C11966a c11966a, final AbstractC11719f abstractC11719f) {
        AbstractC11719f.EnumC11724b mo67007b = abstractC11719f.mo67007b();
        if (mo67007b != AbstractC11719f.EnumC11724b.INITIALIZED && !mo67007b.m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            abstractC11719f.mo67008a(new InterfaceC11728i() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC11719f.EnumC11720a.ON_START) {
                        AbstractC11719f.this.mo67006d(this);
                        c11966a.m66068j(LegacySavedStateHandleController.C11700a.class);
                    }
                }
            });
        } else {
            c11966a.m66068j(C11700a.class);
        }
    }
}
