package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Ldr6;", "Lu22;", "", "Lio/reactivex/D;", "observer", "", "e", "Landroid/view/View;", "b", "Landroid/view/View;", "view", "g", "()Ljava/lang/Boolean;", "initialValue", "<init>", "(Landroid/view/View;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: dr6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40003dr6 extends AbstractC49595u22<Boolean> {

    /* renamed from: b */
    public final View f77313b;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Ldr6$a;", "Lio/reactivex/android/a;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/view/View;", "v", "", "hasFocus", "", "onFocusChange", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/view/View;", "view", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/view/View;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: dr6$a */
    /* loaded from: classes6.dex */
    public static final class View$OnFocusChangeListenerC19875a extends AbstractC23451a implements View.OnFocusChangeListener {

        /* renamed from: c */
        public final View f77314c;

        /* renamed from: d */
        public final InterfaceC23436D<? super Boolean> f77315d;

        public View$OnFocusChangeListenerC19875a(View view, InterfaceC23436D<? super Boolean> interfaceC23436D) {
            this.f77314c = view;
            this.f77315d = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f77314c.setOnFocusChangeListener(null);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (!mo1769e()) {
                this.f77315d.onNext(Boolean.valueOf(z));
            }
        }
    }

    public C40003dr6(View view) {
        this.f77313b = view;
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: e */
    public void mo11037e(InterfaceC23436D<? super Boolean> interfaceC23436D) {
        View$OnFocusChangeListenerC19875a view$OnFocusChangeListenerC19875a = new View$OnFocusChangeListenerC19875a(this.f77313b, interfaceC23436D);
        interfaceC23436D.onSubscribe(view$OnFocusChangeListenerC19875a);
        this.f77313b.setOnFocusChangeListener(view$OnFocusChangeListenerC19875a);
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: g */
    public Boolean mo11039a() {
        return Boolean.valueOf(this.f77313b.hasFocus());
    }
}
