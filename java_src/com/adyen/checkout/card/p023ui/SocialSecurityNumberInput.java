package com.adyen.checkout.card.p023ui;

import android.content.Context;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0011"}, m28432d2 = {"Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;", "Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;", "Landroid/text/Editable;", "editable", "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: com.adyen.checkout.card.ui.SocialSecurityNumberInput */
/* loaded from: classes.dex */
public final class SocialSecurityNumberInput extends AdyenTextInputEditText {

    /* renamed from: c */
    public static final C16804a f68387c = new C16804a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput$a;", "", "", "SUPPORTED_CHARS", "Ljava/lang/String;", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.ui.SocialSecurityNumberInput$a */
    /* loaded from: classes.dex */
    public static final class C16804a {
        public /* synthetic */ C16804a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16804a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m53579b(C43273jN5.f92614a.m30746b().size() + 14);
        setInputType(2);
        setKeyListener(DigitsKeyListener.getInstance("0123456789./-"));
    }

    @Override // com.adyen.checkout.components.p024ui.view.AdyenTextInputEditText
    /* renamed from: a */
    public void mo53580a(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        String obj = editable.toString();
        String m30747a = C43273jN5.f92614a.m30747a(obj);
        if (!Intrinsics.areEqual(m30747a, obj)) {
            editable.replace(0, obj.length(), m30747a);
        }
        super.mo53580a(editable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialSecurityNumberInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
