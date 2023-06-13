package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"LRt6;", "Lio/reactivex/Observable;", "", "Lio/reactivex/D;", "observer", "subscribeActual", "Landroid/view/View;", "b", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Rt6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35768Rt6 extends Observable<Unit> {

    /* renamed from: b */
    public final View f32804b;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LRt6$a;", "Lio/reactivex/android/a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "c", "Landroid/view/View;", "view", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/view/View;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Rt6$a */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC7282a extends AbstractC23451a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        public final View f32805c;

        /* renamed from: d */
        public final InterfaceC23436D<? super Unit> f32806d;

        public ViewTreeObserver$OnGlobalLayoutListenerC7282a(View view, InterfaceC23436D<? super Unit> interfaceC23436D) {
            this.f32805c = view;
            this.f32806d = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f32805c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!mo1769e()) {
                this.f32806d.onNext(Unit.INSTANCE);
            }
        }
    }

    public C35768Rt6(View view) {
        this.f32804b = view;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Unit> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        ViewTreeObserver$OnGlobalLayoutListenerC7282a viewTreeObserver$OnGlobalLayoutListenerC7282a = new ViewTreeObserver$OnGlobalLayoutListenerC7282a(this.f32804b, interfaceC23436D);
        interfaceC23436D.onSubscribe(viewTreeObserver$OnGlobalLayoutListenerC7282a);
        this.f32804b.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC7282a);
    }
}
