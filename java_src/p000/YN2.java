package p000;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C11759u;
import androidx.savedstate.C11966a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJy\u0010\u0011\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0001\u0010\u0005*\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00062\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u0017\u001a\u00020\u0016\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0001\u0010\u0005*\u00020\u0004*\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0001\u0010\u0005*\u00020\u0004*\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u001d"}, m28432d2 = {"LYN2;", "", "LRN2;", "VM", "LAN2;", "S", "Ljava/lang/Class;", "viewModelClass", "stateClass", "LPr6;", "viewModelContext", "", "key", "", "forExistingViewModel", "LBN2;", "initialStateFactory", "b", "(Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;)LRN2;", "initialArgs", "originalDeclarationViewModelClass", "originalDeclarationStateClass", "Landroid/os/Bundle;", "e", "(LRN2;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;)Landroid/os/Bundle;", "LIP5;", "f", "<init>", "()V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: YN2 */
/* loaded from: classes2.dex */
public final class YN2 {

    /* renamed from: a */
    public static final YN2 f45797a = new YN2();

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", TransferTable.COLUMN_STATE, "Landroid/os/Bundle;", C17296a.f69688o, "(LAN2;)Landroid/os/Bundle;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: YN2$a */
    /* loaded from: classes2.dex */
    public static final class C9763a extends Lambda implements Function1<S, Bundle> {

        /* renamed from: g */
        public final /* synthetic */ Class<? extends VM> f45798g;

        /* renamed from: h */
        public final /* synthetic */ Class<? extends S> f45799h;

        /* renamed from: i */
        public final /* synthetic */ Object f45800i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9763a(Class<? extends VM> cls, Class<? extends S> cls2, Object obj) {
            super(1);
            this.f45798g = cls;
            this.f45799h = cls2;
            this.f45800i = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Bundle invoke(AN2 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Bundle bundle = new Bundle();
            Serializable serializable = this.f45798g;
            Serializable serializable2 = this.f45799h;
            Object obj = this.f45800i;
            bundle.putBundle("mvrx:saved_instance_state", C43307jR3.m30616f(state, false, 2, null));
            bundle.putSerializable("mvrx:saved_viewmodel_class", serializable);
            bundle.putSerializable("mvrx:saved_state_class", serializable2);
            if (obj != null) {
                if (obj instanceof Parcelable) {
                    bundle.putParcelable("mvrx:saved_args", (Parcelable) obj);
                } else if (obj instanceof Serializable) {
                    bundle.putSerializable("mvrx:saved_args", (Serializable) obj);
                } else {
                    throw new IllegalStateException("Args must be parcelable or serializable".toString());
                }
            }
            return bundle;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: YN2$b */
    /* loaded from: classes2.dex */
    public static final class C9764b extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Bundle f45801g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9764b(Bundle bundle) {
            super(1);
            this.f45801g = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AN2 invoke(AN2 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return C43307jR3.m30612j(this.f45801g, state, false, 4, null);
        }
    }

    private YN2() {
    }

    /* renamed from: c */
    public static /* synthetic */ RN2 m75139c(YN2 yn2, Class cls, Class cls2, AbstractC35282Pr6 abstractC35282Pr6, String str, boolean z, BN2 bn2, int i, Object obj) {
        if ((i & 8) != 0) {
            str = cls.getName();
            Intrinsics.checkNotNullExpressionValue(str, "viewModelClass.name");
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            bn2 = new C39419cs4();
        }
        return yn2.m75140b(cls, cls2, abstractC35282Pr6, str2, z2, bn2);
    }

    /* renamed from: d */
    public static final Bundle m75138d(C37925aO2 viewModel, AbstractC35282Pr6 restoredContext, IP5 ip5, Class viewModelClass, Class stateClass) {
        Class m102415a;
        Class m102413c;
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(restoredContext, "$restoredContext");
        Intrinsics.checkNotNullParameter(viewModelClass, "$viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "$stateClass");
        YN2 yn2 = f45797a;
        RN2 m71506e = viewModel.m71506e();
        Object mo16489e = restoredContext.mo16489e();
        if (ip5 != null && (m102413c = ip5.m102413c()) != null) {
            viewModelClass = m102413c;
        }
        if (ip5 != null && (m102415a = ip5.m102415a()) != null) {
            stateClass = m102415a;
        }
        return yn2.m75137e(m71506e, mo16489e, viewModelClass, stateClass);
    }

    /* renamed from: b */
    public final <VM extends RN2<S>, S extends AN2> VM m75140b(final Class<? extends VM> viewModelClass, final Class<? extends S> stateClass, AbstractC35282Pr6 viewModelContext, String key, boolean z, BN2<VM, S> initialStateFactory) {
        IP5<VM, S> ip5;
        AbstractC35282Pr6 abstractC35282Pr6;
        AbstractC35282Pr6 m102412d;
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(initialStateFactory, "initialStateFactory");
        C11966a mo16487g = viewModelContext.mo16487g();
        if (mo16487g.m66074d()) {
            Bundle m66076b = mo16487g.m66076b(key);
            if (m66076b != null) {
                ip5 = m75136f(m66076b, viewModelContext);
            } else {
                ip5 = null;
            }
            final IP5<VM, S> ip52 = ip5;
            if (ip52 != null && (m102412d = ip52.m102412d()) != null) {
                abstractC35282Pr6 = m102412d;
            } else {
                abstractC35282Pr6 = viewModelContext;
            }
            AbstractC35048Or6 m66921b = new C11759u(viewModelContext.mo16488f(), new C49792uN2(viewModelClass, stateClass, abstractC35282Pr6, key, ip52, z, initialStateFactory)).m66921b(key, C37925aO2.class);
            Intrinsics.checkNotNull(m66921b, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksViewModelWrapper<VM of com.airbnb.mvrx.MavericksViewModelProvider.get, S of com.airbnb.mvrx.MavericksViewModelProvider.get>");
            final C37925aO2 c37925aO2 = (C37925aO2) m66921b;
            try {
                final AbstractC35282Pr6 abstractC35282Pr62 = abstractC35282Pr6;
                viewModelContext.mo16487g().m66069i(key, new C11966a.InterfaceC11969c() { // from class: XN2
                    @Override // androidx.savedstate.C11966a.InterfaceC11969c
                    /* renamed from: a */
                    public final Bundle mo18217a() {
                        Bundle m75138d;
                        m75138d = YN2.m75138d(C37925aO2.this, abstractC35282Pr62, ip52, viewModelClass, stateClass);
                        return m75138d;
                    }
                });
            } catch (IllegalArgumentException unused) {
            }
            return (VM) c37925aO2.m71506e();
        }
        throw new IllegalStateException("You can only access a view model after super.onCreate of your activity/fragment has been called.".toString());
    }

    /* renamed from: e */
    public final <VM extends RN2<S>, S extends AN2> Bundle m75137e(VM vm, Object obj, Class<? extends VM> cls, Class<? extends S> cls2) {
        return (Bundle) C36686Vr6.m79329a(vm, new C9763a(cls, cls2, obj));
    }

    /* renamed from: f */
    public final <VM extends RN2<S>, S extends AN2> IP5<VM, S> m75136f(Bundle bundle, AbstractC35282Pr6 abstractC35282Pr6) {
        Class cls;
        AbstractC35282Pr6 m106128i;
        Object obj = bundle.get("mvrx:saved_args");
        Bundle bundle2 = bundle.getBundle("mvrx:saved_instance_state");
        Serializable serializable = bundle.getSerializable("mvrx:saved_viewmodel_class");
        Class cls2 = null;
        if (serializable instanceof Class) {
            cls = (Class) serializable;
        } else {
            cls = null;
        }
        Serializable serializable2 = bundle.getSerializable("mvrx:saved_state_class");
        if (serializable2 instanceof Class) {
            cls2 = (Class) serializable2;
        }
        Class cls3 = cls2;
        if (bundle2 != null) {
            if (cls != null) {
                if (cls3 != null) {
                    if (abstractC35282Pr6 instanceof C27850r6) {
                        m106128i = C27850r6.m16485i((C27850r6) abstractC35282Pr6, null, obj, null, null, 13, null);
                    } else if (abstractC35282Pr6 instanceof C33000Fy1) {
                        m106128i = C33000Fy1.m106128i((C33000Fy1) abstractC35282Pr6, null, obj, null, null, null, 29, null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new IP5<>(m106128i, cls, cls3, new C9764b(bundle2));
                }
                throw new IllegalArgumentException("State class was not properly saved prior to restoring!".toString());
            }
            throw new IllegalArgumentException("ViewModel class was not properly saved prior to restoring!".toString());
        }
        throw new IllegalArgumentException("State was not saved prior to restoring!".toString());
    }
}
