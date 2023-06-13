package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C11759u;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010%J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0017J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006'"}, m28432d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/u$d;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "(Ljava/lang/Class;)LOr6;", "", "key", "Landroidx/lifecycle/p;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/p;)LOr6;", "viewModel", "", C17296a.f69688o, "b", "(Ljava/lang/String;Ljava/lang/Class;)LOr6;", "Landroidx/savedstate/a;", "Landroidx/savedstate/a;", "savedStateRegistry", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/f;", "lifecycle", "Landroid/os/Bundle;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "defaultArgs", "<init>", "()V", "LPi5;", "owner", "(LPi5;Landroid/os/Bundle;)V", "e", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public abstract class AbstractC11709a extends C11759u.C11768d implements C11759u.InterfaceC11763b {

    /* renamed from: e */
    public static final C11710a f54894e = new C11710a(null);

    /* renamed from: b */
    public C11966a f54895b;

    /* renamed from: c */
    public AbstractC11719f f54896c;

    /* renamed from: d */
    public Bundle f54897d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Landroidx/lifecycle/a$a;", "", "", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static final class C11710a {
        public /* synthetic */ C11710a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C11710a() {
        }
    }

    public AbstractC11709a() {
    }

    @Override // androidx.lifecycle.C11759u.C11768d
    /* renamed from: a */
    public void mo66912a(AbstractC35048Or6 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C11966a c11966a = this.f54895b;
        if (c11966a != null) {
            Intrinsics.checkNotNull(c11966a);
            AbstractC11719f abstractC11719f = this.f54896c;
            Intrinsics.checkNotNull(abstractC11719f);
            LegacySavedStateHandleController.m67048a(viewModel, c11966a, abstractC11719f);
        }
    }

    /* renamed from: b */
    public final <T extends AbstractC35048Or6> T m67034b(String str, Class<T> cls) {
        C11966a c11966a = this.f54895b;
        Intrinsics.checkNotNull(c11966a);
        AbstractC11719f abstractC11719f = this.f54896c;
        Intrinsics.checkNotNull(abstractC11719f);
        SavedStateHandleController m67047b = LegacySavedStateHandleController.m67047b(c11966a, abstractC11719f, str, this.f54897d);
        T t = (T) mo67033c(str, cls, m67047b.m67036b());
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", m67047b);
        return t;
    }

    /* renamed from: c */
    public abstract <T extends AbstractC35048Or6> T mo67033c(String str, Class<T> cls, C11747p c11747p);

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.mo17471a(C11759u.C11765c.f54998d);
        if (str != null) {
            if (this.f54895b != null) {
                return (T) m67034b(str, modelClass);
            }
            return (T) mo67033c(str, modelClass, C11750q.m66936a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public AbstractC11709a(InterfaceC35200Pi5 owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f54895b = owner.getSavedStateRegistry();
        this.f54896c = owner.getLifecycle();
        this.f54897d = bundle;
    }

    @Override // androidx.lifecycle.C11759u.InterfaceC11763b
    public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f54896c != null) {
                return (T) m67034b(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
