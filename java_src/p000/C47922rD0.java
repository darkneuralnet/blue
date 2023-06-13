package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Country;
import com.facebook.share.internal.C17296a;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39429ct4;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, m28432d2 = {"LrD0;", "Lct4;", "Lco/bird/android/model/Country;", "Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView$e;", "", "position", "", "b", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$D;", "onCreateViewHolder", "holder", "", "onBindViewHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rD0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47922rD0 extends AbstractC39429ct4<Country> implements FastScrollRecyclerView.InterfaceC18584e {

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\b\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"LrD0$a;", "Lw1;", "", "position", "", "bind", "e", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "getRoot", "()Landroid/widget/LinearLayout;", "root", "LrD0;", "c", "LrD0;", C17296a.f69688o, "()LrD0;", "adapter", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "i", "(Landroid/widget/TextView;)V", "flag", "getName", "name", "<init>", "(Landroid/widget/LinearLayout;LrD0;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCountryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAdapter.kt\nco/bird/android/widget/adapters/CountryAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    /* renamed from: rD0$a */
    /* loaded from: classes4.dex */
    public static final class C27875a extends C29735w1 {

        /* renamed from: b */
        public final LinearLayout f106689b;

        /* renamed from: c */
        public final C47922rD0 f106690c;

        /* renamed from: d */
        public TextView f106691d;

        /* renamed from: e */
        public final TextView f106692e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: rD0$a$a */
        /* loaded from: classes4.dex */
        public static final class C27876a extends Lambda implements Function1<View, Unit> {
            public C27876a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                AbstractC39429ct4.InterfaceC19633a<Country> m44891v;
                int adapterPosition = C27875a.this.getAdapterPosition();
                if (adapterPosition == -1 || (m44891v = C27875a.this.m16259a().m44891v()) == null) {
                    return;
                }
                Intrinsics.checkNotNull(view);
                m44891v.mo44887a(view, adapterPosition, C27875a.this.m16259a().m44895q(adapterPosition));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27875a(LinearLayout root, C47922rD0 adapter) {
            super(root);
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.f106689b = root;
            this.f106690c = adapter;
            this.f106692e = (TextView) C49520tu6.m11238m(root, C52955zi4.name);
            m16257e();
            C34585Ms2.m94661j(root, new C27876a());
        }

        /* renamed from: a */
        public final C47922rD0 m16259a() {
            return this.f106690c;
        }

        /* renamed from: b */
        public final TextView m16258b() {
            TextView textView = this.f106691d;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("flag");
            return null;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            m16257e();
            Country m44895q = this.f106690c.m44895q(i);
            m16258b().setText(m44895q.getFlagEmoji());
            TextView textView = this.f106692e;
            if (textView != null) {
                textView.setText(m44895q.getName());
            }
        }

        /* renamed from: e */
        public final void m16257e() {
            ViewStub viewStub = (ViewStub) C49520tu6.m11238m(this.f106689b, C52955zi4.emojiFlag);
            if (viewStub != null) {
                View inflate = viewStub.inflate();
                Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                m16256i((TextView) inflate);
                TextView textView = (TextView) C49520tu6.m11238m(this.f106689b, C52955zi4.flagInflated);
                if (textView != null) {
                    this.f106689b.removeView(textView);
                }
            }
        }

        /* renamed from: i */
        public final void m16256i(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.f106691d = textView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47922rD0(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.InterfaceC18584e
    /* renamed from: b */
    public String mo16260b(int i) {
        return String.valueOf(m44895q(i).getName().charAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((C29735w1) holder).bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View m41761u = C40788fB0.m41761u(m44892u(), C45268mk4.item_country, parent, false);
        Intrinsics.checkNotNull(m41761u, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new C27875a((LinearLayout) m41761u, this);
    }
}
