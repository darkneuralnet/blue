package co.bird.android.library.p021rx.scopeproviders;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import co.bird.android.library.p021rx.scopeproviders.MapActivityScopeProvider;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LtK2;", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "i", "event", "", "j", "b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/f;", "lifecycle", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "lifecycleEventSubject", "<init>", "(Landroidx/lifecycle/f;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.library.rx.scopeproviders.MapActivityScopeProvider */
/* loaded from: classes3.dex */
public final class MapActivityScopeProvider implements LifecycleScopeProvider<EnumC49172tK2> {

    /* renamed from: b */
    public final AbstractC11719f f66147b;

    /* renamed from: c */
    public final C24552a<EnumC49172tK2> f66148c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.library.rx.scopeproviders.MapActivityScopeProvider$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C16065a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC49172tK2.values().length];
            try {
                iArr[EnumC49172tK2.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC49172tK2.ON_MAP_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC49172tK2.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC49172tK2.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC49172tK2.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC49172tK2.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC49172tK2.ON_DESTROY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AbstractC11719f.EnumC11724b.values().length];
            try {
                iArr2[AbstractC11719f.EnumC11724b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AbstractC11719f.EnumC11724b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AbstractC11719f.EnumC11724b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AbstractC11719f.EnumC11724b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AbstractC11719f.EnumC11724b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MapActivityScopeProvider(AbstractC11719f lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f66147b = lifecycle;
        lifecycle.mo67008a(new InterfaceC32929Fq2() { // from class: co.bird.android.library.rx.scopeproviders.MapActivityScopeProvider.1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
                r2 = p000.WJ2.m78598a(r3);
             */
            @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_ANY)
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onStateChanged(LifecycleOwner owner, AbstractC11719f.EnumC11720a enumC11720a) {
                EnumC49172tK2 m78598a;
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (enumC11720a != AbstractC11719f.EnumC11720a.ON_RESUME && enumC11720a != null && m78598a != null) {
                    MapActivityScopeProvider.this.m55974j(m78598a);
                }
            }
        });
        C24552a<EnumC49172tK2> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<MapLifecycleEvent>()");
        this.f66148c = m31922e;
    }

    /* renamed from: e */
    public static final EnumC49172tK2 m55976e(EnumC49172tK2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (C16065a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 2:
                return EnumC49172tK2.ON_DESTROY;
            case 3:
                return EnumC49172tK2.ON_STOP;
            case 4:
                return EnumC49172tK2.ON_PAUSE;
            case 5:
                return EnumC49172tK2.ON_STOP;
            case 6:
            case 7:
                throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
            default:
                throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
        }
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<EnumC49172tK2> mo37326O8() {
        return new CorrespondingEventsFunction() { // from class: VJ2
            @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                EnumC49172tK2 m55976e;
                m55976e = MapActivityScopeProvider.m55976e((EnumC49172tK2) obj);
                return m55976e;
            }
        };
    }

    /* renamed from: b */
    public final void m55977b() {
        EnumC49172tK2 enumC49172tK2;
        int i = C16065a.$EnumSwitchMapping$1[this.f66147b.mo67007b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        enumC49172tK2 = EnumC49172tK2.ON_DESTROY;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    EnumC49172tK2 value = this.f66148c.getValue();
                    EnumC49172tK2 enumC49172tK22 = EnumC49172tK2.ON_MAP_READY;
                    if (value == enumC49172tK22) {
                        enumC49172tK2 = enumC49172tK22;
                    } else {
                        enumC49172tK2 = EnumC49172tK2.ON_RESUME;
                    }
                }
            } else {
                enumC49172tK2 = EnumC49172tK2.ON_START;
            }
        } else {
            enumC49172tK2 = EnumC49172tK2.ON_CREATE;
        }
        if (enumC49172tK2 != this.f66148c.getValue()) {
            m55974j(enumC49172tK2);
        }
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<EnumC49172tK2> mo37323c2() {
        Observable<EnumC49172tK2> hide = this.f66148c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lifecycleEventSubject.hide()");
        return hide;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: i */
    public EnumC49172tK2 peekLifecycle() {
        m55977b();
        return this.f66148c.getValue();
    }

    /* renamed from: j */
    public final void m55974j(EnumC49172tK2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f66148c.onNext(event);
    }
}
