package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC11890e;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC6913Qq;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0018\u000eB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R)\u0010\u0012\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00030\u00030\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"LQq;", "Landroidx/recyclerview/widget/e;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LQq$b;", "", "i", "j", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "p", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "o", "()Lio/reactivex/subjects/a;", "lifecycleEvents", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qq */
/* loaded from: classes4.dex */
public abstract class AbstractC6913Qq extends AbstractC11890e implements LifecycleScopeProvider<EnumC6915b> {

    /* renamed from: c */
    public static final C6914a f31001c = new C6914a(null);

    /* renamed from: d */
    public static final CorrespondingEventsFunction<EnumC6915b> f31002d = new CorrespondingEventsFunction() { // from class: Pq
        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
        public final Object apply(Object obj) {
            AbstractC6913Qq.EnumC6915b m87892n;
            m87892n = AbstractC6913Qq.m87892n((AbstractC6913Qq.EnumC6915b) obj);
            return m87892n;
        }
    };

    /* renamed from: b */
    public final Lazy f31003b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LQq$a;", "", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "LQq$b;", "CORRESPONDING_EVENTS", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qq$a */
    /* loaded from: classes4.dex */
    public static final class C6914a {
        public /* synthetic */ C6914a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6914a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LQq$b;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qq$b */
    /* loaded from: classes4.dex */
    public enum EnumC6915b {
        BIND,
        UNBIND
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qq$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C6916c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6915b.values().length];
            try {
                iArr[EnumC6915b.BIND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/subjects/a;", "LQq$b;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/subjects/a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qq$d */
    /* loaded from: classes4.dex */
    public static final class C6917d extends Lambda implements Function0<C24552a<EnumC6915b>> {

        /* renamed from: g */
        public static final C6917d f31007g = new C6917d();

        public C6917d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24552a<EnumC6915b> invoke() {
            return C24552a.m31922e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6913Qq(View itemView) {
        super(itemView);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        lazy = LazyKt__LazyJVMKt.lazy(C6917d.f31007g);
        this.f31003b = lazy;
    }

    /* renamed from: n */
    public static final EnumC6915b m87892n(EnumC6915b viewHolderEvent) {
        Intrinsics.checkNotNullParameter(viewHolderEvent, "viewHolderEvent");
        if (C6916c.$EnumSwitchMapping$0[viewHolderEvent.ordinal()] == 1) {
            return EnumC6915b.UNBIND;
        }
        throw new LifecycleEndedException("Cannot use ViewHolder lifecycle after unbind.");
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<EnumC6915b> mo37326O8() {
        return f31002d;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<EnumC6915b> mo37323c2() {
        Observable<EnumC6915b> hide = m87891o().hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lifecycleEvents.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.AbstractC11890e
    /* renamed from: i */
    public void mo66318i() {
        m87891o().onNext(EnumC6915b.BIND);
    }

    @Override // androidx.recyclerview.widget.AbstractC11890e
    /* renamed from: j */
    public void mo66317j() {
        m87891o().onNext(EnumC6915b.UNBIND);
    }

    /* renamed from: o */
    public final C24552a<EnumC6915b> m87891o() {
        return (C24552a) this.f31003b.getValue();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: p */
    public EnumC6915b peekLifecycle() {
        return m87891o().getValue();
    }
}
