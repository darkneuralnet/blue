package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43024ix2;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00050\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"Lix2;", "Lct4;", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "currentPositionSubject", "Lio/reactivex/Observable;", "h", "Lio/reactivex/Observable;", "E", "()Lio/reactivex/Observable;", "currentPositionClicks", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ix2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43024ix2 extends AbstractC39429ct4<WirePhysicalLockReplacementType> {

    /* renamed from: g */
    public final C24558d<Integer> f91756g;

    /* renamed from: h */
    public final Observable<Integer> f91757h;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lix2$a;", "Lw1;", "Landroid/view/View;", "view", "", "position", "", "e", "bind", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lix2;", "c", "Lix2;", "()Lix2;", "adapter", "Ler6;", DateTokenConverter.CONVERTER_KEY, "Ler6;", "binding", "<init>", "(Lix2;Landroid/view/View;Lix2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ix2$a */
    /* loaded from: classes2.dex */
    public final class C24648a extends C29735w1 {

        /* renamed from: b */
        public final View f91758b;

        /* renamed from: c */
        public final C43024ix2 f91759c;

        /* renamed from: d */
        public final C40596er6 f91760d;

        /* renamed from: e */
        public final /* synthetic */ C43024ix2 f91761e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ix2$a$a */
        /* loaded from: classes2.dex */
        public static final class C24649a extends Lambda implements Function1<View, Unit> {
            public C24649a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C24648a.this.m31562b().f91756g.onNext(Integer.valueOf(C24648a.this.getAdapterPosition()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ix2$a$b */
        /* loaded from: classes2.dex */
        public static final class C24650b extends Lambda implements Function1<Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ int f91763g;

            /* renamed from: h */
            public final /* synthetic */ View f91764h;

            /* renamed from: i */
            public final /* synthetic */ C24648a f91765i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24650b(int i, View view, C24648a c24648a) {
                super(1);
                this.f91763g = i;
                this.f91764h = view;
                this.f91765i = c24648a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                int i = this.f91763g;
                if (num != null && i == num.intValue()) {
                    Drawable m94299e = NA0.m94299e(this.f91764h.getContext(), C48193rg4.ic_check_black);
                    if (m94299e == null) {
                        return;
                    }
                    m94299e.setBounds(0, 0, m94299e.getIntrinsicWidth(), m94299e.getIntrinsicHeight());
                    this.f91765i.f91760d.f79029b.setCompoundDrawablesRelative(null, null, m94299e, null);
                    return;
                }
                this.f91765i.f91760d.f79029b.setCompoundDrawablesRelative(null, null, null, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24648a(C43024ix2 c43024ix2, View view, C43024ix2 adapter) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f91761e = c43024ix2;
            this.f91758b = view;
            this.f91759c = adapter;
            C40596er6 m42481a = C40596er6.m42481a(view);
            Intrinsics.checkNotNullExpressionValue(m42481a, "bind(view)");
            this.f91760d = m42481a;
            C34585Ms2.m94661j(view, new C24649a());
        }

        /* renamed from: i */
        public static final void m31560i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: b */
        public final C43024ix2 m31562b() {
            return this.f91759c;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f91760d.f79029b.setText(this.f91759c.m44895q(i).getName());
        }

        @SuppressLint({"CheckResult"})
        /* renamed from: e */
        public final void m31561e(View view, int i) {
            Intrinsics.checkNotNullParameter(view, "view");
            C24558d c24558d = this.f91761e.f91756g;
            final C24650b c24650b = new C24650b(i, view, this);
            c24558d.subscribe(new InterfaceC23484g() { // from class: hx2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C43024ix2.C24648a.m31560i(Function1.this, obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43024ix2(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f91756g = m31902e;
        this.f91757h = m31902e;
    }

    /* renamed from: E */
    public final Observable<Integer> m31564E() {
        return this.f91757h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C24648a c24648a = (C24648a) holder;
        c24648a.bind(i);
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        c24648a.m31561e(view, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C24648a(this, C40788fB0.m41761u(m44892u(), C39311cj4.view_generic_recyclerview_item, parent, false), this);
    }
}
