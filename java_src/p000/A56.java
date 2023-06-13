package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"LA56;", "Lio/reactivex/Observable;", "", "Lio/reactivex/D;", "observer", "subscribeActual", "Landroidx/appcompat/widget/Toolbar;", "b", "Landroidx/appcompat/widget/Toolbar;", "view", "<init>", "(Landroidx/appcompat/widget/Toolbar;)V", C17296a.f69688o, "rxbinding-appcompat_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: A56 */
/* loaded from: classes6.dex */
public final class A56 extends Observable<Unit> {

    /* renamed from: b */
    public final Toolbar f140b;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0014R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, m28432d2 = {"LA56$a;", "Lio/reactivex/android/a;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", DateTokenConverter.CONVERTER_KEY, "Landroidx/appcompat/widget/Toolbar;", "c", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroidx/appcompat/widget/Toolbar;Lio/reactivex/D;)V", "rxbinding-appcompat_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: A56$a */
    /* loaded from: classes6.dex */
    public static final class View$OnClickListenerC0029a extends AbstractC23451a implements View.OnClickListener {

        /* renamed from: c */
        public final Toolbar f141c;

        /* renamed from: d */
        public final InterfaceC23436D<? super Unit> f142d;

        public View$OnClickListenerC0029a(Toolbar toolbar, InterfaceC23436D<? super Unit> interfaceC23436D) {
            this.f141c = toolbar;
            this.f142d = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f141c.setNavigationOnClickListener(null);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!mo1769e()) {
                this.f142d.onNext(Unit.INSTANCE);
            }
        }
    }

    public A56(Toolbar toolbar) {
        this.f140b = toolbar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Unit> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        View$OnClickListenerC0029a view$OnClickListenerC0029a = new View$OnClickListenerC0029a(this.f140b, interfaceC23436D);
        interfaceC23436D.onSubscribe(view$OnClickListenerC0029a);
        this.f140b.setNavigationOnClickListener(view$OnClickListenerC0029a);
    }
}
