package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.DA0;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005:\u0001,B\u001b\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b)\u0010*J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0002R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00018\u00008\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010(\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\r0\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, m28432d2 = {"LvO4;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "VH", "LaE3;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemViewType", "getItemCount", "LDA0;", "contentState", "w", "Lio/reactivex/Observable;", "t", "u", "", "x", "LwO4;", DateTokenConverter.CONVERTER_KEY, "LwO4;", "adapterDelegate", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "itemClicks", "f", "LDA0;", "afterContentState", "Lma4;", "g", "Lma4;", "afterRetryClicks", "<init>", "(LwO4;)V", "h", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50395vO4<T, VH extends RecyclerView.AbstractC11834D> extends AbstractC37836aE3<T, RecyclerView.AbstractC11834D> {

    /* renamed from: h */
    public static final C29524a f113986h = new C29524a(null);

    /* renamed from: d */
    public final AbstractC50988wO4<T, VH> f113987d;

    /* renamed from: e */
    public final C24558d<T> f113988e;

    /* renamed from: f */
    public DA0 f113989f;

    /* renamed from: g */
    public final C45168ma4<Unit> f113990g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LvO4$a;", "", "", "ITEM_VIEW_TYPE_CONTENT_STATE", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vO4$a */
    /* loaded from: classes4.dex */
    public static final class C29524a {
        public /* synthetic */ C29524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29524a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "VH", "", "invoke", "()V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vO4$b */
    /* loaded from: classes4.dex */
    public static final class C29525b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ C50395vO4<T, VH> f113991g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29525b(C50395vO4<T, VH> c50395vO4) {
            super(0);
            this.f113991g = c50395vO4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f113991g.f113990g.accept(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50395vO4(AbstractC50988wO4<T, VH> adapterDelegate) {
        super(adapterDelegate.mo6901a());
        Intrinsics.checkNotNullParameter(adapterDelegate, "adapterDelegate");
        this.f113987d = adapterDelegate;
        C24558d<T> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<T>()");
        this.f113988e = m31902e;
        this.f113989f = DA0.C1411a.f5314a;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f113990g = m25409g;
    }

    /* renamed from: v */
    public static final void m8758v(C50395vO4 this$0, Object item, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.f113988e.onNext(item);
    }

    @Override // p000.AbstractC37836aE3, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return super.getItemCount() + (m8756x() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (m8756x() && i == getItemCount() - 1) {
            return Integer.MIN_VALUE;
        }
        return this.f113987d.m6900b(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(RecyclerView.AbstractC11834D holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            ((FA0) holder).m107480e(this.f113989f);
            return;
        }
        final T item = getItem(i);
        Intrinsics.checkNotNull(item);
        this.f113987d.onBindViewHolder(holder, item, i);
        if (this.f113987d.isClickable(item)) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: uO4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C50395vO4.m8758v(C50395vO4.this, item, view);
                }
            });
        } else {
            holder.itemView.setClickable(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i == Integer.MIN_VALUE) {
            return FA0.f8971d.m107479a(parent, new C29525b(this));
        }
        return this.f113987d.onCreateViewHolder(parent, i);
    }

    /* renamed from: t */
    public final Observable<Unit> m8760t() {
        Observable<Unit> hide = this.f113990g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "afterRetryClicks.hide()");
        return hide;
    }

    /* renamed from: u */
    public final Observable<T> m8759u() {
        Observable<T> hide = this.f113988e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemClicks.hide()");
        return hide;
    }

    /* renamed from: w */
    public final void m8757w(DA0 contentState) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        int itemCount = getItemCount();
        DA0 da0 = this.f113989f;
        this.f113989f = contentState;
        if (itemCount > getItemCount()) {
            notifyItemRemoved(itemCount - 1);
        } else if (itemCount < getItemCount()) {
            notifyItemInserted(getItemCount() - 1);
        } else if (!Intrinsics.areEqual(da0, contentState)) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    /* renamed from: x */
    public final boolean m8756x() {
        return !Intrinsics.areEqual(this.f113989f, DA0.C1411a.f5314a) && super.getItemCount() > 0;
    }
}
