package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.uber.autodispose.OutsideScopeException;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopes;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
/* loaded from: classes7.dex */
public final class AndroidLifecycleScopeProvider implements LifecycleScopeProvider<AbstractC11719f.EnumC11720a> {

    /* renamed from: d */
    public static final CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> f75565d = new CorrespondingEventsFunction() { // from class: Xc
        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
        public final Object apply(Object obj) {
            AbstractC11719f.EnumC11720a m45191m;
            m45191m = AndroidLifecycleScopeProvider.m45191m((AbstractC11719f.EnumC11720a) obj);
            return m45191m;
        }
    };

    /* renamed from: b */
    public final CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> f75566b;

    /* renamed from: c */
    public final LifecycleEventsObservable f75567c;

    /* renamed from: com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C195351 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75568a;

        static {
            int[] iArr = new int[AbstractC11719f.EnumC11720a.values().length];
            f75568a = iArr;
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75568a[AbstractC11719f.EnumC11720a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75568a[AbstractC11719f.EnumC11720a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75568a[AbstractC11719f.EnumC11720a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75568a[AbstractC11719f.EnumC11720a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75568a[AbstractC11719f.EnumC11720a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class UntilEventFunction implements CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> {

        /* renamed from: b */
        public final AbstractC11719f.EnumC11720a f75569b;

        public UntilEventFunction(AbstractC11719f.EnumC11720a enumC11720a) {
            this.f75569b = enumC11720a;
        }

        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC11719f.EnumC11720a apply(AbstractC11719f.EnumC11720a enumC11720a) throws OutsideScopeException {
            return this.f75569b;
        }
    }

    public AndroidLifecycleScopeProvider(AbstractC11719f abstractC11719f, CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> correspondingEventsFunction) {
        this.f75567c = new LifecycleEventsObservable(abstractC11719f);
        this.f75566b = correspondingEventsFunction;
    }

    /* renamed from: b */
    public static AndroidLifecycleScopeProvider m45197b(LifecycleOwner lifecycleOwner) {
        return m45194j(lifecycleOwner.getLifecycle());
    }

    /* renamed from: e */
    public static AndroidLifecycleScopeProvider m45196e(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
        return m45193k(lifecycleOwner.getLifecycle(), enumC11720a);
    }

    /* renamed from: i */
    public static AndroidLifecycleScopeProvider m45195i(LifecycleOwner lifecycleOwner, CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> correspondingEventsFunction) {
        return m45192l(lifecycleOwner.getLifecycle(), correspondingEventsFunction);
    }

    /* renamed from: j */
    public static AndroidLifecycleScopeProvider m45194j(AbstractC11719f abstractC11719f) {
        return m45192l(abstractC11719f, f75565d);
    }

    /* renamed from: k */
    public static AndroidLifecycleScopeProvider m45193k(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11720a enumC11720a) {
        return m45192l(abstractC11719f, new UntilEventFunction(enumC11720a));
    }

    /* renamed from: l */
    public static AndroidLifecycleScopeProvider m45192l(AbstractC11719f abstractC11719f, CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> correspondingEventsFunction) {
        return new AndroidLifecycleScopeProvider(abstractC11719f, correspondingEventsFunction);
    }

    /* renamed from: m */
    public static /* synthetic */ AbstractC11719f.EnumC11720a m45191m(AbstractC11719f.EnumC11720a enumC11720a) throws OutsideScopeException {
        int i = C195351.f75568a[enumC11720a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return AbstractC11719f.EnumC11720a.ON_STOP;
                    }
                    throw new LifecycleEndedException("Lifecycle has ended! Last event was " + enumC11720a);
                }
                return AbstractC11719f.EnumC11720a.ON_PAUSE;
            }
            return AbstractC11719f.EnumC11720a.ON_STOP;
        }
        return AbstractC11719f.EnumC11720a.ON_DESTROY;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> mo37326O8() {
        return this.f75566b;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider, com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        return LifecycleScopes.m45180e(this);
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<AbstractC11719f.EnumC11720a> mo37323c2() {
        return this.f75567c;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: n */
    public AbstractC11719f.EnumC11720a peekLifecycle() {
        this.f75567c.m45188a();
        return this.f75567c.m45187c();
    }
}
