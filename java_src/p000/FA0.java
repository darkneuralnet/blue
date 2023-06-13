package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.DA0;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"LFA0;", "Landroidx/recyclerview/widget/RecyclerView$D;", "LDA0;", "contentState", "", "e", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "retryClickListener", "LDb2;", "c", "LDb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FA0 */
/* loaded from: classes4.dex */
public final class FA0 extends RecyclerView.AbstractC11834D {

    /* renamed from: d */
    public static final C2198a f8971d = new C2198a(null);

    /* renamed from: b */
    public final Function0<Unit> f8972b;

    /* renamed from: c */
    public final C32326Db2 f8973c;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, m28432d2 = {"LFA0$a;", "", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function0;", "", "retryCallback", "LFA0;", C17296a.f69688o, "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FA0$a */
    /* loaded from: classes4.dex */
    public static final class C2198a {
        public /* synthetic */ C2198a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FA0 m107479a(ViewGroup parent, Function0<Unit> retryCallback) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(retryCallback, "retryCallback");
            View view = LayoutInflater.from(parent.getContext()).inflate(C45268mk4.item_content_state, parent, false);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            return new FA0(view, retryCallback, null);
        }

        private C2198a() {
        }
    }

    public /* synthetic */ FA0(View view, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function0);
    }

    /* renamed from: b */
    public static final void m107481b(FA0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f8972b.invoke();
    }

    /* renamed from: e */
    public final void m107480e(DA0 contentState) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        ProgressBar progressBar = this.f8973c.f6005c;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        DA0.C1412b c1412b = null;
        C49520tu6.show$default(progressBar, contentState instanceof DA0.C1413c, 0, 2, null);
        Button button = this.f8973c.f6006d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.retryButton");
        boolean z = contentState instanceof DA0.C1412b;
        C49520tu6.show$default(button, z, 0, 2, null);
        TextView textView = this.f8973c.f6004b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.message");
        C49520tu6.show$default(textView, z, 0, 2, null);
        if (z) {
            c1412b = (DA0.C1412b) contentState;
        }
        if (c1412b != null) {
            this.f8973c.f6004b.setText(c1412b.m110821b());
        }
    }

    public FA0(View view, Function0<Unit> function0) {
        super(view);
        this.f8972b = function0;
        C32326Db2 m110131a = C32326Db2.m110131a(view);
        Intrinsics.checkNotNullExpressionValue(m110131a, "bind(view)");
        this.f8973c = m110131a;
        m110131a.f6006d.setOnClickListener(new View.OnClickListener() { // from class: EA0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FA0.m107481b(FA0.this, view2);
            }
        });
    }
}
