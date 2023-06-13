package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/i;", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/f;", "lifecycle", "", C17296a.f69688o, "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "onStateChanged", "", "b", "Ljava/lang/String;", "key", "Landroidx/lifecycle/p;", "c", "Landroidx/lifecycle/p;", "()Landroidx/lifecycle/p;", "handle", "", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "isAttached", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/p;)V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC11728i {

    /* renamed from: b */
    public final String f54886b;

    /* renamed from: c */
    public final C11747p f54887c;

    /* renamed from: d */
    public boolean f54888d;

    public SavedStateHandleController(String key, C11747p handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f54886b = key;
        this.f54887c = handle;
    }

    /* renamed from: a */
    public final void m67037a(C11966a registry, AbstractC11719f lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f54888d) {
            this.f54888d = true;
            lifecycle.mo67008a(this);
            registry.m66069i(this.f54886b, this.f54887c.m66942k());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    /* renamed from: b */
    public final C11747p m67036b() {
        return this.f54887c;
    }

    /* renamed from: d */
    public final boolean m67035d() {
        return this.f54888d;
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
            this.f54888d = false;
            source.getLifecycle().mo67006d(this);
        }
    }
}
