package p000;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Let4;", "Lio/reactivex/Observable;", "Ldt4;", "Lio/reactivex/D;", "observer", "", "subscribeActual", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "view", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", C17296a.f69688o, "rxbinding-recyclerview_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: et4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40614et4 extends Observable<C40021dt4> {

    /* renamed from: b */
    public final RecyclerView f79069b;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u0012"}, m28432d2 = {"Let4$a;", "Lio/reactivex/android/a;", "", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView$t;", "c", "Landroidx/recyclerview/widget/RecyclerView$t;", "g", "()Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lio/reactivex/D;", "Ldt4;", "observer", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lio/reactivex/D;)V", "rxbinding-recyclerview_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: et4$a */
    /* loaded from: classes6.dex */
    public static final class C20132a extends AbstractC23451a {

        /* renamed from: c */
        public final RecyclerView.AbstractC11863t f79070c;

        /* renamed from: d */
        public final RecyclerView f79071d;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, m28432d2 = {"et4$a$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "rxbinding-recyclerview_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: et4$a$a */
        /* loaded from: classes6.dex */
        public static final class C20133a extends RecyclerView.AbstractC11863t {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23436D f79073b;

            public C20133a(InterfaceC23436D interfaceC23436D) {
                this.f79073b = interfaceC23436D;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (!C20132a.this.mo1769e()) {
                    this.f79073b.onNext(new C40021dt4(recyclerView, i, i2));
                }
            }
        }

        public C20132a(RecyclerView recyclerView, InterfaceC23436D<? super C40021dt4> interfaceC23436D) {
            this.f79071d = recyclerView;
            this.f79070c = new C20133a(interfaceC23436D);
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f79071d.removeOnScrollListener(this.f79070c);
        }

        /* renamed from: g */
        public final RecyclerView.AbstractC11863t m42429g() {
            return this.f79070c;
        }
    }

    public C40614et4(RecyclerView recyclerView) {
        this.f79069b = recyclerView;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super C40021dt4> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        C20132a c20132a = new C20132a(this.f79069b, interfaceC23436D);
        interfaceC23436D.onSubscribe(c20132a);
        this.f79069b.addOnScrollListener(c20132a.m42429g());
    }
}
