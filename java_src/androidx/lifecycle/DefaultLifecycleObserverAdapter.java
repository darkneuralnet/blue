package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/i;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "LVX0;", "b", "LVX0;", "defaultLifecycleObserver", "c", "Landroidx/lifecycle/i;", "lifecycleEventObserver", "<init>", "(LVX0;Landroidx/lifecycle/i;)V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC11728i {

    /* renamed from: b */
    public final VX0 f54833b;

    /* renamed from: c */
    public final InterfaceC11728i f54834c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.lifecycle.DefaultLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C11699a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC11719f.EnumC11720a.values().length];
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(VX0 defaultLifecycleObserver, InterfaceC11728i interfaceC11728i) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f54833b = defaultLifecycleObserver;
        this.f54834c = interfaceC11728i;
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (C11699a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                this.f54833b.onCreate(source);
                break;
            case 2:
                this.f54833b.onStart(source);
                break;
            case 3:
                this.f54833b.onResume(source);
                break;
            case 4:
                this.f54833b.onPause(source);
                break;
            case 5:
                this.f54833b.onStop(source);
                break;
            case 6:
                this.f54833b.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC11728i interfaceC11728i = this.f54834c;
        if (interfaceC11728i != null) {
            interfaceC11728i.onStateChanged(source, event);
        }
    }
}
