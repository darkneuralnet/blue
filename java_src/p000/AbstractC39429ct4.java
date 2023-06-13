package p000;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001HB!\b\u0007\u0012\u0006\u0010-\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0014\u0010\u0013\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0004H\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010\u0019\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004JS\u0010!\u001a\u00020\n2K\u0010 \u001aG\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u001bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010-\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R:\u00105\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010<\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00018\u00008\u0000068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010@R\u0011\u0010E\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006I"}, m28432d2 = {"Lct4;", "T", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "i", "q", "(I)Ljava/lang/Object;", "position", "item", "", "w", "(ILjava/lang/Object;)V", "o", "(Ljava/lang/Object;)V", "", "items", "p", "A", "B", "getItemCount", "getItem", "", "getItemId", "getItems", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "f", "y", "", "b", "Ljava/util/List;", "Landroid/content/Context;", "<set-?>", "c", "Landroid/content/Context;", "u", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Lct4$a;", DateTokenConverter.CONVERTER_KEY, "Lct4$a;", "v", "()Lct4$a;", "setItemClickListener", "(Lct4$a;)V", "itemClickListener", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "r", "()Lio/reactivex/subjects/d;", "clickSubject", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "t", "()Lio/reactivex/Observable;", "clicks", "", "x", "()Z", "isEmpty", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ct4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC39429ct4<T> extends RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> {

    /* renamed from: b */
    public List<T> f75786b;

    /* renamed from: c */
    public Context f75787c;

    /* renamed from: d */
    public InterfaceC19633a<T> f75788d;

    /* renamed from: e */
    public final C24558d<T> f75789e;

    /* renamed from: f */
    public final Observable<T> f75790f;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lct4$a;", "T", "", "Landroid/view/View;", "view", "", "position", "item", "", C17296a.f69688o, "(Landroid/view/View;ILjava/lang/Object;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ct4$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC19633a<T> {
        /* renamed from: a */
        void mo44887a(View view, int i, T t);
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"ct4$b", "Lct4$a;", "Landroid/view/View;", "view", "", "position", "item", "", C17296a.f69688o, "(Landroid/view/View;ILjava/lang/Object;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ct4$b */
    /* loaded from: classes4.dex */
    public static final class C19634b implements InterfaceC19633a<T> {

        /* renamed from: a */
        public final /* synthetic */ Function3<View, Integer, T, Unit> f75791a;

        /* JADX WARN: Multi-variable type inference failed */
        public C19634b(Function3<? super View, ? super Integer, ? super T, Unit> function3) {
            this.f75791a = function3;
        }

        @Override // p000.AbstractC39429ct4.InterfaceC19633a
        /* renamed from: a */
        public void mo44887a(View view, int i, T t) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f75791a.invoke(view, Integer.valueOf(i), t);
        }
    }

    @JvmOverloads
    public AbstractC39429ct4(Context context, List<T> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f75786b = items;
        this.f75787c = context;
        C24558d<T> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<T>()");
        this.f75789e = m31902e;
        this.f75790f = m31902e;
    }

    /* renamed from: A */
    public final void m44901A(T t) {
        if (!this.f75786b.isEmpty()) {
            int indexOf = this.f75786b.indexOf(t);
            this.f75786b.remove(t);
            notifyItemRemoved(indexOf);
        }
    }

    /* renamed from: B */
    public final void m44900B(List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f75786b.clear();
        this.f75786b.addAll(items);
        notifyDataSetChanged();
    }

    /* renamed from: C */
    public final void m44899C(List<? extends T> items) {
        List<T> mutableList;
        Intrinsics.checkNotNullParameter(items, "items");
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) items);
        this.f75786b = mutableList;
        notifyDataSetChanged();
    }

    /* renamed from: D */
    public final void m44898D(int i) {
        if (i >= 0 && i < this.f75786b.size()) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("position=%d , where range[0, %d]", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(this.f75786b.size() - 1)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        throw new ArrayIndexOutOfBoundsException(format);
    }

    public final T getItem(int i) {
        return this.f75786b.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f75786b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return 0L;
    }

    public final List<T> getItems() {
        return this.f75786b;
    }

    /* renamed from: o */
    public final void m44897o(T t) {
        this.f75786b.add(t);
        notifyItemInserted(this.f75786b.size());
    }

    /* renamed from: p */
    public final void m44896p(List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = this.f75786b.size();
        this.f75786b.addAll(items);
        notifyItemRangeInserted(size, items.size());
    }

    /* renamed from: q */
    public final T m44895q(int i) {
        return this.f75786b.get(i);
    }

    /* renamed from: r */
    public final C24558d<T> m44894r() {
        return this.f75789e;
    }

    /* renamed from: t */
    public final Observable<T> m44893t() {
        return this.f75790f;
    }

    /* renamed from: u */
    public final Context m44892u() {
        return this.f75787c;
    }

    /* renamed from: v */
    public final InterfaceC19633a<T> m44891v() {
        return this.f75788d;
    }

    /* renamed from: w */
    public final void m44890w(int i, T t) {
        if (m44889x()) {
            m44897o(t);
        } else if (i >= getItemCount()) {
            m44897o(t);
        } else {
            m44898D(i);
            this.f75786b.add(i, t);
            notifyItemInserted(i);
        }
    }

    /* renamed from: x */
    public final boolean m44889x() {
        return this.f75786b.isEmpty();
    }

    /* renamed from: y */
    public final void m44888y(Function3<? super View, ? super Integer, ? super T, Unit> f) {
        Intrinsics.checkNotNullParameter(f, "f");
        this.f75788d = new C19634b(f);
    }

    public /* synthetic */ AbstractC39429ct4(Context context, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : list);
    }
}
