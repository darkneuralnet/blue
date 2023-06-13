package co.bird.android.app.feature.operator.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.SelectableButton;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001MB'\b\u0007\u0012\u0006\u0010F\u001a\u00020E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010!0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010%R.\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010%RA\u00102\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010! -*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010,0,0+8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R1\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 -*\n\u0012\u0004\u0012\u00020\u0007\u0018\u000103030+8\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R=\u00109\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007 -*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010,0,0+8\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006N"}, m28432d2 = {"Lco/bird/android/app/feature/operator/widget/ReportOptionView;", "Landroid/widget/FrameLayout;", "Lco/bird/android/app/feature/operator/widget/ReportOptionView$a;", "mode", "", "setMode", "", "", "Lco/bird/android/widget/SelectableButton;", "b", "Ljava/util/Map;", "getButtonsMap", "()Ljava/util/Map;", "buttonsMap", "Landroid/widget/EditText;", "c", "getTextFieldsMap", "textFieldsMap", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "values", "e", "Ljava/lang/String;", "getSingleValue", "()Ljava/lang/String;", "setSingleValue", "(Ljava/lang/String;)V", "singleValue", "", "f", "getAllValues", "setAllValues", "(Ljava/util/Map;)V", "allValues", "g", "getMessages", "setMessages", "messages", "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/d;", "getValuesSubject", "()Lio/reactivex/subjects/d;", "valuesSubject", "", "i", "getRepairsSubject", "repairsSubject", "j", "getMessageSubject", "messageSubject", "k", "Lco/bird/android/app/feature/operator/widget/ReportOptionView$a;", "getSelectMode", "()Lco/bird/android/app/feature/operator/widget/ReportOptionView$a;", "setSelectMode", "(Lco/bird/android/app/feature/operator/widget/ReportOptionView$a;)V", "selectMode", "Lts6;", "l", "Lts6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportOptionView extends FrameLayout {

    /* renamed from: b */
    public final Map<String, SelectableButton> f61930b;

    /* renamed from: c */
    public final Map<EditText, String> f61931c;

    /* renamed from: d */
    public List<String> f61932d;

    /* renamed from: e */
    public String f61933e;

    /* renamed from: f */
    public Map<String, Object> f61934f;

    /* renamed from: g */
    public Map<String, String> f61935g;

    /* renamed from: h */
    public final C24558d<Map<String, Object>> f61936h;

    /* renamed from: i */
    public final C24558d<List<String>> f61937i;

    /* renamed from: j */
    public final C24558d<Map<String, String>> f61938j;

    /* renamed from: k */
    public EnumC13996a f61939k;

    /* renamed from: l */
    public final C49500ts6 f61940l;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/operator/widget/ReportOptionView$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.operator.widget.ReportOptionView$a */
    /* loaded from: classes2.dex */
    public enum EnumC13996a {
        SINGLE_SELECT,
        MULTIPLE_SELECT
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReportOptionView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAllValues(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f61934f = map;
    }

    public final void setMessages(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f61935g = map;
    }

    public final void setMode(EnumC13996a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f61939k = mode;
    }

    public final void setSelectMode(EnumC13996a enumC13996a) {
        this.f61939k = enumC13996a;
    }

    public final void setSingleValue(String str) {
        this.f61933e = str;
    }

    public final void setValues(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f61932d = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReportOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ReportOptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReportOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61930b = new LinkedHashMap();
        this.f61931c = new LinkedHashMap();
        this.f61932d = new ArrayList();
        this.f61934f = new LinkedHashMap();
        this.f61935g = new LinkedHashMap();
        C24558d<Map<String, Object>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Map<String, Any?>>()");
        this.f61936h = m31902e;
        C24558d<List<String>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<List<String>>()");
        this.f61937i = m31902e2;
        C24558d<Map<String, String>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Map<String, String>>()");
        this.f61938j = m31902e3;
        C49500ts6 m11263c = C49500ts6.m11263c(C40788fB0.m41772j(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m11263c, "inflate(context.layoutInflater, this, true)");
        this.f61940l = m11263c;
    }
}
