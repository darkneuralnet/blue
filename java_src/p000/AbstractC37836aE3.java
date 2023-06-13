package p000;

import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u0005B\u0017\b\u0014\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\"\u0010#J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0017J(\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016R&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R<\u0010\u001f\u001a$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0019¨\u0006$"}, m28432d2 = {"LaE3;", "", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "VH", "Landroidx/recyclerview/widget/RecyclerView$h;", "LZD3;", "pagedList", "", "q", "", "position", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "currentList", "o", "previousList", "p", "Lip;", "b", "Lip;", "getDiffer$paging_runtime_release", "()Lip;", "getDiffer$paging_runtime_release$annotations", "()V", "differ", "Lkotlin/Function2;", "c", "Lkotlin/jvm/functions/Function2;", "getListener$annotations", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: aE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37836aE3<T, VH extends RecyclerView.AbstractC11834D> extends RecyclerView.AbstractC11843h<VH> {

    /* renamed from: b */
    public final C24583ip<T> f50138b;

    /* renamed from: c */
    public final Function2<ZD3<T>, ZD3<T>, Unit> f50139c;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "Landroidx/recyclerview/widget/RecyclerView$D;", "VH", "LZD3;", "previousList", "currentList", "", C17296a.f69688o, "(LZD3;LZD3;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: aE3$a */
    /* loaded from: classes.dex */
    public static final class C10604a extends Lambda implements Function2<ZD3<T>, ZD3<T>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC37836aE3<T, VH> f50140g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10604a(AbstractC37836aE3<T, VH> abstractC37836aE3) {
            super(2);
            this.f50140g = abstractC37836aE3;
        }

        /* renamed from: a */
        public final void m71746a(ZD3<T> zd3, ZD3<T> zd32) {
            this.f50140g.m71749o(zd32);
            this.f50140g.m71748p(zd3, zd32);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            m71746a((ZD3) obj, (ZD3) obj2);
            return Unit.INSTANCE;
        }
    }

    public AbstractC37836aE3(C11905h.AbstractC11911f<T> diffCallback) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        C10604a c10604a = new C10604a(this);
        this.f50139c = c10604a;
        C24583ip<T> c24583ip = new C24583ip<>(this, diffCallback);
        this.f50138b = c24583ip;
        c24583ip.m31848c(c10604a);
    }

    public static /* synthetic */ void getCurrentList$annotations() {
    }

    public static /* synthetic */ void getDiffer$paging_runtime_release$annotations() {
    }

    public T getItem(int i) {
        return this.f50138b.m31846e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f50138b.m31845f();
    }

    @Deprecated(message = "Use the two argument variant instead.", replaceWith = @ReplaceWith(expression = "onCurrentListChanged(previousList, currentList)", imports = {}))
    /* renamed from: o */
    public void m71749o(ZD3<T> zd3) {
    }

    /* renamed from: p */
    public void m71748p(ZD3<T> zd3, ZD3<T> zd32) {
    }

    /* renamed from: q */
    public void m71747q(ZD3<T> zd3) {
        this.f50138b.m31839l(zd3);
    }
}
