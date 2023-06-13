package p000;

import androidx.lifecycle.AbstractC11719f;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"Ljy1;", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "Landroidx/lifecycle/f$a;", "event", C17296a.f69688o, "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43626jy1 implements CorrespondingEventsFunction<AbstractC11719f.EnumC11720a> {

    /* renamed from: b */
    public static final C43626jy1 f93627b = new C43626jy1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jy1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25058a {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private C43626jy1() {
    }

    @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
    /* renamed from: a */
    public AbstractC11719f.EnumC11720a apply(AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (C25058a.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 2:
                return AbstractC11719f.EnumC11720a.ON_DESTROY;
            case 3:
                return AbstractC11719f.EnumC11720a.ON_PAUSE;
            case 4:
                return AbstractC11719f.EnumC11720a.ON_STOP;
            case 5:
            case 6:
                throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
            default:
                throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
        }
    }
}
