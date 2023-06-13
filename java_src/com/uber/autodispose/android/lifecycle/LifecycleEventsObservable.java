package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import com.uber.autodispose.android.internal.AutoDisposeAndroidUtil;
import com.uber.autodispose.android.internal.MainThreadDisposable;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
/* loaded from: classes7.dex */
class LifecycleEventsObservable extends Observable<AbstractC11719f.EnumC11720a> {

    /* renamed from: b */
    public final AbstractC11719f f75570b;

    /* renamed from: c */
    public final C24552a<AbstractC11719f.EnumC11720a> f75571c = C24552a.m31922e();

    /* renamed from: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C195361 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75572a;

        static {
            int[] iArr = new int[AbstractC11719f.EnumC11724b.values().length];
            f75572a = iArr;
            try {
                iArr[AbstractC11719f.EnumC11724b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75572a[AbstractC11719f.EnumC11724b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75572a[AbstractC11719f.EnumC11724b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75572a[AbstractC11719f.EnumC11724b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75572a[AbstractC11719f.EnumC11724b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class ArchLifecycleObserver extends MainThreadDisposable implements InterfaceC32929Fq2 {

        /* renamed from: c */
        public final AbstractC11719f f75573c;

        /* renamed from: d */
        public final InterfaceC23436D<? super AbstractC11719f.EnumC11720a> f75574d;

        /* renamed from: e */
        public final C24552a<AbstractC11719f.EnumC11720a> f75575e;

        public ArchLifecycleObserver(AbstractC11719f abstractC11719f, InterfaceC23436D<? super AbstractC11719f.EnumC11720a> interfaceC23436D, C24552a<AbstractC11719f.EnumC11720a> c24552a) {
            this.f75573c = abstractC11719f;
            this.f75574d = interfaceC23436D;
            this.f75575e = c24552a;
        }

        @Override // com.uber.autodispose.android.internal.MainThreadDisposable
        /* renamed from: a */
        public void mo45186a() {
            this.f75573c.mo67006d(this);
        }

        @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_ANY)
        public void onStateChange(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
            if (!mo1769e()) {
                if (enumC11720a != AbstractC11719f.EnumC11720a.ON_CREATE || this.f75575e.getValue() != enumC11720a) {
                    this.f75575e.onNext(enumC11720a);
                }
                this.f75574d.onNext(enumC11720a);
            }
        }
    }

    public LifecycleEventsObservable(AbstractC11719f abstractC11719f) {
        this.f75570b = abstractC11719f;
    }

    /* renamed from: a */
    public void m45188a() {
        AbstractC11719f.EnumC11720a enumC11720a;
        int i = C195361.f75572a[this.f75570b.mo67007b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    enumC11720a = AbstractC11719f.EnumC11720a.ON_DESTROY;
                } else {
                    enumC11720a = AbstractC11719f.EnumC11720a.ON_RESUME;
                }
            } else {
                enumC11720a = AbstractC11719f.EnumC11720a.ON_START;
            }
        } else {
            enumC11720a = AbstractC11719f.EnumC11720a.ON_CREATE;
        }
        this.f75571c.onNext(enumC11720a);
    }

    /* renamed from: c */
    public AbstractC11719f.EnumC11720a m45187c() {
        return this.f75571c.getValue();
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super AbstractC11719f.EnumC11720a> interfaceC23436D) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f75570b, interfaceC23436D, this.f75571c);
        interfaceC23436D.onSubscribe(archLifecycleObserver);
        if (!AutoDisposeAndroidUtil.m45200b()) {
            interfaceC23436D.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f75570b.mo67008a(archLifecycleObserver);
        if (archLifecycleObserver.mo1769e()) {
            this.f75570b.mo67006d(archLifecycleObserver);
        }
    }
}
