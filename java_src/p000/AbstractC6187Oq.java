package p000;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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
import p000.AbstractC6187Oq;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016R)\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00040\u00040\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"LOq;", "LMy;", "Lh0;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LOq$a;", "holder", "", "position", "", "y", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "Lio/reactivex/Observable;", "c2", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "O8", "A", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "x", "()Lio/reactivex/subjects/a;", "lifecycleEvents", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oq */
/* loaded from: classes4.dex */
public abstract class AbstractC6187Oq extends AbstractC5440My<C22528h0> implements LifecycleScopeProvider<EnumC6188a> {

    /* renamed from: d */
    public static final C6189b f27420d = new C6189b(null);

    /* renamed from: e */
    public static final CorrespondingEventsFunction<EnumC6188a> f27421e = new CorrespondingEventsFunction() { // from class: Nq
        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
        public final Object apply(Object obj) {
            AbstractC6187Oq.EnumC6188a m91307w;
            m91307w = AbstractC6187Oq.m91307w((AbstractC6187Oq.EnumC6188a) obj);
            return m91307w;
        }
    };

    /* renamed from: c */
    public final Lazy f27422c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LOq$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oq$a */
    /* loaded from: classes4.dex */
    public enum EnumC6188a {
        ATTACH,
        DETACH
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LOq$b;", "", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "LOq$a;", "CORRESPONDING_EVENTS", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Oq$b */
    /* loaded from: classes4.dex */
    public static final class C6189b {
        public /* synthetic */ C6189b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6189b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Oq$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C6190c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6188a.values().length];
            try {
                iArr[EnumC6188a.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/subjects/a;", "LOq$a;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/subjects/a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Oq$d */
    /* loaded from: classes4.dex */
    public static final class C6191d extends Lambda implements Function0<C24552a<EnumC6188a>> {

        /* renamed from: g */
        public static final C6191d f27426g = new C6191d();

        public C6191d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24552a<EnumC6188a> invoke() {
            return C24552a.m31922e();
        }
    }

    public AbstractC6187Oq() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C6191d.f27426g);
        this.f27422c = lazy;
    }

    /* renamed from: w */
    public static final EnumC6188a m91307w(EnumC6188a viewHolderEvent) {
        Intrinsics.checkNotNullParameter(viewHolderEvent, "viewHolderEvent");
        if (C6190c.$EnumSwitchMapping$0[viewHolderEvent.ordinal()] == 1) {
            return EnumC6188a.DETACH;
        }
        throw new LifecycleEndedException("Cannot use Adapter lifecycle after unbind.");
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: A */
    public EnumC6188a peekLifecycle() {
        return m91306x().getValue();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: O8 */
    public CorrespondingEventsFunction<EnumC6188a> mo37326O8() {
        return f27421e;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: c2 */
    public Observable<EnumC6188a> mo37323c2() {
        Observable<EnumC6188a> hide = m91306x().hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lifecycleEvents.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        m91306x().onNext(EnumC6188a.ATTACH);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        m91306x().onNext(EnumC6188a.DETACH);
    }

    /* renamed from: x */
    public final C24552a<EnumC6188a> m91306x() {
        return (C24552a) this.f27422c.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: y */
    public void onBindViewHolder(C22528h0 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }
}
