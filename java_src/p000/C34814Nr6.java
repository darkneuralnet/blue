package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LNr6;", "Lio/reactivex/Observable;", "", "Lio/reactivex/D;", "observer", "subscribeActual", "Landroid/view/View;", "b", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "c", "Lkotlin/jvm/functions/Function0;", "handled", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Nr6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34814Nr6 extends Observable<Unit> {

    /* renamed from: b */
    public final View f25303b;

    /* renamed from: c */
    public final Function0<Boolean> f25304c;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LNr6$a;", "Lio/reactivex/android/a;", "Landroid/view/View$OnLongClickListener;", "Landroid/view/View;", "v", "", "onLongClick", "", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "handled", "Lio/reactivex/D;", "e", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Nr6$a */
    /* loaded from: classes6.dex */
    public static final class View$OnLongClickListenerC5725a extends AbstractC23451a implements View.OnLongClickListener {

        /* renamed from: c */
        public final View f25305c;

        /* renamed from: d */
        public final Function0<Boolean> f25306d;

        /* renamed from: e */
        public final InterfaceC23436D<? super Unit> f25307e;

        public View$OnLongClickListenerC5725a(View view, Function0<Boolean> function0, InterfaceC23436D<? super Unit> interfaceC23436D) {
            this.f25305c = view;
            this.f25306d = function0;
            this.f25307e = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f25305c.setOnLongClickListener(null);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!mo1769e()) {
                try {
                    if (this.f25306d.invoke().booleanValue()) {
                        this.f25307e.onNext(Unit.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f25307e.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    public C34814Nr6(View view, Function0<Boolean> function0) {
        this.f25303b = view;
        this.f25304c = function0;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Unit> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        View$OnLongClickListenerC5725a view$OnLongClickListenerC5725a = new View$OnLongClickListenerC5725a(this.f25303b, this.f25304c, interfaceC23436D);
        interfaceC23436D.onSubscribe(view$OnLongClickListenerC5725a);
        this.f25303b.setOnLongClickListener(view$OnLongClickListenerC5725a);
    }
}
