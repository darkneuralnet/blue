package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"LYp6;", "Lio/reactivex/Observable;", "", "Lio/reactivex/D;", "observer", "subscribeActual", "Landroid/view/View;", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Yp6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37370Yp6 extends Observable<Unit> {

    /* renamed from: b */
    public final View f47423b;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m28432d2 = {"LYp6$a;", "Lio/reactivex/android/a;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/view/View;", "view", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/view/View;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Yp6$a */
    /* loaded from: classes6.dex */
    public static final class View$OnClickListenerC10012a extends AbstractC23451a implements View.OnClickListener {

        /* renamed from: c */
        public final View f47424c;

        /* renamed from: d */
        public final InterfaceC23436D<? super Unit> f47425d;

        public View$OnClickListenerC10012a(View view, InterfaceC23436D<? super Unit> interfaceC23436D) {
            this.f47424c = view;
            this.f47425d = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f47424c.setOnClickListener(null);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!mo1769e()) {
                this.f47425d.onNext(Unit.INSTANCE);
            }
        }
    }

    public C37370Yp6(View view) {
        this.f47423b = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Unit> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        View$OnClickListenerC10012a view$OnClickListenerC10012a = new View$OnClickListenerC10012a(this.f47423b, interfaceC23436D);
        interfaceC23436D.onSubscribe(view$OnClickListenerC10012a);
        this.f47423b.setOnClickListener(view$OnClickListenerC10012a);
    }
}
