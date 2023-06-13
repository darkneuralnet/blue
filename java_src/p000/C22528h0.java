package p000;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lh0;", "LQq;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/content/Context;", "e", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "getSafePosition", "()Ljava/lang/Integer;", "safePosition", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecyclerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewAdapter.kt\nco/bird/android/widget/adapter/AbstractAutoDisposeViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/* renamed from: h0 */
/* loaded from: classes4.dex */
public class C22528h0 extends AbstractC6913Qq {

    /* renamed from: e */
    public final Context f84578e;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"h0$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewDetachedFromWindow", "onViewAttachedToWindow", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: h0$a */
    /* loaded from: classes4.dex */
    public static final class View$OnAttachStateChangeListenerC22529a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC22529a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C22528h0.this.onAttachedToWindow();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            C22528h0.this.onDetachedFromWindow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22528h0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.f84578e = context;
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC22529a());
    }

    public void bind(int i) {
    }

    public final Context getContext() {
        return this.f84578e;
    }

    public final Integer getSafePosition() {
        Integer valueOf = Integer.valueOf(getBindingAdapterPosition());
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public void onAttachedToWindow() {
    }

    public void onDetachedFromWindow() {
    }
}
