package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import io.reactivex.android.AbstractC23451a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0003H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"LY26;", "Lu22;", "LX26;", "Lio/reactivex/D;", "observer", "", "e", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "view", "g", "()LX26;", "initialValue", "<init>", "(Landroid/widget/TextView;)V", C17296a.f69688o, "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Y26 */
/* loaded from: classes6.dex */
public final class Y26 extends AbstractC49595u22<X26> {

    /* renamed from: b */
    public final TextView f44474b;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J(\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0014R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LY26$a;", "Lio/reactivex/android/a;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "view", "Lio/reactivex/D;", "LX26;", "Lio/reactivex/D;", "observer", "<init>", "(Landroid/widget/TextView;Lio/reactivex/D;)V", "rxbinding_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Y26$a */
    /* loaded from: classes6.dex */
    public static final class C9605a extends AbstractC23451a implements TextWatcher {

        /* renamed from: c */
        public final TextView f44475c;

        /* renamed from: d */
        public final InterfaceC23436D<? super X26> f44476d;

        public C9605a(TextView textView, InterfaceC23436D<? super X26> interfaceC23436D) {
            this.f44475c = textView;
            this.f44476d = interfaceC23436D;
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
            this.f44475c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!mo1769e()) {
                this.f44476d.onNext(new X26(this.f44475c, charSequence, i, i2, i3));
            }
        }
    }

    public Y26(TextView textView) {
        this.f44474b = textView;
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: e */
    public void mo11037e(InterfaceC23436D<? super X26> interfaceC23436D) {
        C9605a c9605a = new C9605a(this.f44474b, interfaceC23436D);
        interfaceC23436D.onSubscribe(c9605a);
        this.f44474b.addTextChangedListener(c9605a);
    }

    @Override // p000.AbstractC49595u22
    /* renamed from: g */
    public X26 mo11039a() {
        TextView textView = this.f44474b;
        CharSequence text = textView.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "view.text");
        return new X26(textView, text, 0, 0, 0);
    }
}
