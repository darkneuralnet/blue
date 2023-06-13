package p000;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, m28432d2 = {"LKu;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "", "g", C17296a.f69688o, "type", "h", "", "", "hints", "f", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", DateTokenConverter.CONVERTER_KEY, "b", "c", "e", "", "i", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ku */
/* loaded from: classes.dex */
public final class C4612Ku {

    /* renamed from: a */
    public static final C4612Ku f20330a = new C4612Ku();

    private C4612Ku() {
    }

    /* renamed from: a */
    public final AutofillId m98194a(ViewStructure structure) {
        AutofillId autofillId;
        Intrinsics.checkNotNullParameter(structure, "structure");
        autofillId = structure.getAutofillId();
        return autofillId;
    }

    /* renamed from: b */
    public final boolean m98193b(AutofillValue value) {
        boolean isDate;
        Intrinsics.checkNotNullParameter(value, "value");
        isDate = value.isDate();
        return isDate;
    }

    /* renamed from: c */
    public final boolean m98192c(AutofillValue value) {
        boolean isList;
        Intrinsics.checkNotNullParameter(value, "value");
        isList = value.isList();
        return isList;
    }

    /* renamed from: d */
    public final boolean m98191d(AutofillValue value) {
        boolean isText;
        Intrinsics.checkNotNullParameter(value, "value");
        isText = value.isText();
        return isText;
    }

    /* renamed from: e */
    public final boolean m98190e(AutofillValue value) {
        boolean isToggle;
        Intrinsics.checkNotNullParameter(value, "value");
        isToggle = value.isToggle();
        return isToggle;
    }

    /* renamed from: f */
    public final void m98189f(ViewStructure structure, String[] hints) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(hints, "hints");
        structure.setAutofillHints(hints);
    }

    /* renamed from: g */
    public final void m98188g(ViewStructure structure, AutofillId parent, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        Intrinsics.checkNotNullParameter(parent, "parent");
        structure.setAutofillId(parent, i);
    }

    /* renamed from: h */
    public final void m98187h(ViewStructure structure, int i) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence m98186i(AutofillValue value) {
        CharSequence textValue;
        Intrinsics.checkNotNullParameter(value, "value");
        textValue = value.getTextValue();
        Intrinsics.checkNotNullExpressionValue(textValue, "value.textValue");
        return textValue;
    }
}
