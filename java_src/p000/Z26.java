package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LZ26;", "Lu22;", "", "Lio/reactivex/D;", "observer", "", "e", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "view", "kotlin.jvm.PlatformType", "g", "()Ljava/lang/CharSequence;", "initialValue", "<init>", "(Landroid/widget/TextView;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Z26 */
/* loaded from: classes6.dex */
public final class Z26 extends AbstractC49595u22<CharSequence> {

    /* renamed from: b */
    public final TextView f47773b;

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0014R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LZ26$a;", "Lio/reactivex/android/a;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "view", "Lio/reactivex/D;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/widget/TextView;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Z26$a */
    /* loaded from: classes6.dex */
    public static final class C10106a extends AbstractC23451a implements TextWatcher {

        /* renamed from: c */
        public final TextView f47774c;

        /* renamed from: d */
        public final InterfaceC23436D<? super CharSequence> f47775d;

        public C10106a(TextView textView, InterfaceC23436D<? super CharSequence> interfaceC23436D) {
            this.f47774c = textView;
            this.f47775d = interfaceC23436D;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // io.reactivex.android.AbstractC23451a
        /* renamed from: d */
        public void mo15091d() {
            this.f47774c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!mo1769e()) {
                this.f47775d.onNext(charSequence);
            }
        }
    }

    public Z26(TextView textView) {
        this.f47773b = textView;
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: e */
    public void mo11037e(InterfaceC23436D<? super CharSequence> interfaceC23436D) {
        C10106a c10106a = new C10106a(this.f47773b, interfaceC23436D);
        interfaceC23436D.onSubscribe(c10106a);
        this.f47773b.addTextChangedListener(c10106a);
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: g */
    public CharSequence mo11039a() {
        return this.f47773b.getText();
    }
}
