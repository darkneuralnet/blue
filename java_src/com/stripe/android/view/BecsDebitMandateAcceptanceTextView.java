package com.stripe.android.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "companyName", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyName$delegate", "Lkotlin/properties/ReadWriteProperty;", "factory", "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "isValid", "", "isValid$payments_core_release", "()Z", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nBecsDebitMandateAcceptanceTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BecsDebitMandateAcceptanceTextView.kt\ncom/stripe/android/view/BecsDebitMandateAcceptanceTextView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,36:1\n33#2,3:37\n*S KotlinDebug\n*F\n+ 1 BecsDebitMandateAcceptanceTextView.kt\ncom/stripe/android/view/BecsDebitMandateAcceptanceTextView\n*L\n21#1:37,3\n*E\n"})
/* loaded from: classes7.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};
    public static final int $stable = 8;
    private final ReadWriteProperty companyName$delegate;
    private final BecsDebitMandateAcceptanceTextFactory factory;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitMandateAcceptanceTextView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String getCompanyName() {
        return (String) this.companyName$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean isValid$payments_core_release() {
        boolean z;
        boolean isBlank;
        CharSequence text = getText();
        if (text != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(text);
            if (!isBlank) {
                z = false;
                return !z;
            }
        }
        z = true;
        return !z;
    }

    public final void setCompanyName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.companyName$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842884 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.factory = new BecsDebitMandateAcceptanceTextFactory(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        Delegates delegates = Delegates.INSTANCE;
        this.companyName$delegate = new ObservableProperty<String>("") { // from class: com.stripe.android.view.BecsDebitMandateAcceptanceTextView$special$$inlined$observable$1
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
                if (r3 != null) goto L7;
             */
            @Override // kotlin.properties.ObservableProperty
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void afterChange(KProperty<?> property, String str, String str2) {
                boolean isBlank;
                CharSequence charSequence;
                BecsDebitMandateAcceptanceTextFactory becsDebitMandateAcceptanceTextFactory;
                Intrinsics.checkNotNullParameter(property, "property");
                String str3 = str2;
                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this;
                isBlank = StringsKt__StringsJVMKt.isBlank(str3);
                if (!Boolean.valueOf(!isBlank).booleanValue()) {
                    str3 = null;
                }
                if (str3 != null) {
                    becsDebitMandateAcceptanceTextFactory = this.factory;
                    charSequence = becsDebitMandateAcceptanceTextFactory.create(str3);
                }
                charSequence = "";
                becsDebitMandateAcceptanceTextView.setText(charSequence);
            }
        };
    }
}
