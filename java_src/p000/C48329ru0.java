package p000;

import android.widget.CompoundButton;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lru0;", "Lu22;", "", "Lio/reactivex/D;", "observer", "", "e", "Landroid/widget/CompoundButton;", "b", "Landroid/widget/CompoundButton;", "view", "g", "()Ljava/lang/Boolean;", "initialValue", "<init>", "(Landroid/widget/CompoundButton;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: ru0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48329ru0 extends AbstractC49595u22<Boolean> {

    /* renamed from: b */
    public final CompoundButton f107873b;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lru0$a;", "Lio/reactivex/android/a;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/widget/CompoundButton;", "compoundButton", "", "isChecked", "", "onCheckedChanged", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/widget/CompoundButton;", "view", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/widget/CompoundButton;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: ru0$a */
    /* loaded from: classes6.dex */
    public static final class C28056a extends AbstractC23451a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: c */
        public final CompoundButton f107874c;

        /* renamed from: d */
        public final InterfaceC23436D<? super Boolean> f107875d;

        public C28056a(CompoundButton compoundButton, InterfaceC23436D<? super Boolean> interfaceC23436D) {
            this.f107874c = compoundButton;
            this.f107875d = interfaceC23436D;
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f107874c.setOnCheckedChangeListener(null);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!mo1769e()) {
                this.f107875d.onNext(Boolean.valueOf(z));
            }
        }
    }

    public C48329ru0(CompoundButton compoundButton) {
        this.f107873b = compoundButton;
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: e */
    public void mo11037e(InterfaceC23436D<? super Boolean> interfaceC23436D) {
        if (!GZ3.m105004a(interfaceC23436D)) {
            return;
        }
        C28056a c28056a = new C28056a(this.f107873b, interfaceC23436D);
        interfaceC23436D.onSubscribe(c28056a);
        this.f107873b.setOnCheckedChangeListener(c28056a);
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: g */
    public Boolean mo11039a() {
        return Boolean.valueOf(this.f107873b.isChecked());
    }
}
