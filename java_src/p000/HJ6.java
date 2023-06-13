package p000;

import android.text.Editable;
import android.text.TextWatcher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J.\u0010\u000e\u001a\u00020\b2&\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\fJ\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u0011R8\u0010\u0014\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R8\u0010\u0016\u001a$\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R&\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LHJ6;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Lkotlin/Function4;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "b", "Landroid/text/Editable;", "afterTextChanged", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function4;", "_beforeTextChanged", "c", "_onTextChanged", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "_afterTextChanged", "<init>", "()V", "extension_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HJ6 */
/* loaded from: classes3.dex */
public final class HJ6 implements TextWatcher {

    /* renamed from: b */
    public Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> f13267b;

    /* renamed from: c */
    public Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> f13268c;

    /* renamed from: d */
    public Function1<? super Editable, Unit> f13269d;

    /* renamed from: a */
    public final void m104031a(Function1<? super Editable, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13269d = listener;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Function1<? super Editable, Unit> function1 = this.f13269d;
        if (function1 != null) {
            function1.invoke(editable);
        }
    }

    /* renamed from: b */
    public final void m104030b(Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13268c = listener;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4 = this.f13267b;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> function4 = this.f13268c;
        if (function4 != null) {
            function4.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
