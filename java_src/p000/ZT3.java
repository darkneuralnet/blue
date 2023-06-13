package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11940o;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00060\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LZT3;", "Landroidx/recyclerview/widget/o;", "LXT3;", "LuX1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "t", "holder", "position", "", "q", "Lio/reactivex/Observable;", "p", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/d;", "itemClicksSubject", "<init>", "()V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZT3 */
/* loaded from: classes3.dex */
public final class ZT3 extends AbstractC11940o<XT3, C49881uX1> {

    /* renamed from: b */
    public final C24558d<Integer> f48677b;

    public ZT3() {
        super(C37980aU3.f50543a);
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f48677b = m31902e;
    }

    /* renamed from: r */
    public static final void m73019r(ZT3 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f48677b.onNext(Integer.valueOf(i));
    }

    /* renamed from: p */
    public final Observable<Integer> m73021p() {
        Observable<Integer> hide = this.f48677b.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: q */
    public void onBindViewHolder(C49881uX1 holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        XT3 item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.m10114a(item);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: YT3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZT3.m73019r(ZT3.this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: t */
    public C49881uX1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return C49881uX1.f112577c.m10112a(parent);
    }
}
