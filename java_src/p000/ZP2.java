package p000;

import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B#\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LZP2;", "Lio/reactivex/Observable;", "", "Lio/reactivex/D;", "observer", "subscribeActual", "Landroid/view/MenuItem;", "b", "Landroid/view/MenuItem;", "menuItem", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "handled", "<init>", "(Landroid/view/MenuItem;Lkotlin/jvm/functions/Function1;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: ZP2 */
/* loaded from: classes6.dex */
public final class ZP2 extends Observable<Unit> {

    /* renamed from: b */
    public final MenuItem f48503b;

    /* renamed from: c */
    public final Function1<MenuItem, Boolean> f48504c;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LZP2$a;", "Lio/reactivex/android/a;", "Landroid/view/MenuItem$OnMenuItemClickListener;", "Landroid/view/MenuItem;", "item", "", "onMenuItemClick", "", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/view/MenuItem;", "menuItem", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "handled", "Lio/reactivex/D;", "e", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/view/MenuItem;Lkotlin/jvm/functions/Function1;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: ZP2$a */
    /* loaded from: classes6.dex */
    public static final class MenuItem$OnMenuItemClickListenerC10248a extends AbstractC23451a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public final MenuItem f48505c;

        /* renamed from: d */
        public final Function1<MenuItem, Boolean> f48506d;

        /* renamed from: e */
        public final InterfaceC23436D<? super Unit> f48507e;

        /* JADX WARN: Multi-variable type inference failed */
        public MenuItem$OnMenuItemClickListenerC10248a(MenuItem menuItem, Function1<? super MenuItem, Boolean> function1, InterfaceC23436D<? super Unit> interfaceC23436D) {
            this.f48505c = menuItem;
            this.f48506d = function1;
            this.f48507e = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f48505c.setOnMenuItemClickListener(null);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!mo1769e()) {
                try {
                    if (this.f48506d.invoke(this.f48505c).booleanValue()) {
                        this.f48507e.onNext(Unit.INSTANCE);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    this.f48507e.onError(e);
                    dispose();
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZP2(MenuItem menuItem, Function1<? super MenuItem, Boolean> function1) {
        this.f48503b = menuItem;
        this.f48504c = function1;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Unit> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        MenuItem$OnMenuItemClickListenerC10248a menuItem$OnMenuItemClickListenerC10248a = new MenuItem$OnMenuItemClickListenerC10248a(this.f48503b, this.f48504c, interfaceC23436D);
        interfaceC23436D.onSubscribe(menuItem$OnMenuItemClickListenerC10248a);
        this.f48503b.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC10248a);
    }
}
