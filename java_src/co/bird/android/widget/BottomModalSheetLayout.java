package co.bird.android.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u001b\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b4\u00108B#\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u00020\u000f¢\u0006\u0004\b4\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u000fJ\u001b\u0010\u0017\u001a\u00020\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0004H\u0002R\u0014\u0010\u001c\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\n \u001e*\u0004\u0018\u00010!0!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 R\u001c\u0010)\u001a\n \u001e*\u0004\u0018\u00010&0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010+\u001a\n \u001e*\u0004\u0018\u00010&0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u001c\u0010-\u001a\n \u001e*\u0004\u0018\u00010&0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u001c\u00101\u001a\n \u001e*\u0004\u0018\u00010.0.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006;"}, m28432d2 = {"Lco/bird/android/widget/BottomModalSheetLayout;", "Landroid/widget/LinearLayout;", "", "title", "", "setTitle", "subtitle", "setSubtitle", "Lco/bird/android/widget/BottomModalSheetLayout$a;", "buttonMode", "setButtonMode", "primaryButtonText", "setPrimaryButtonText", "secondaryButtonText", "setSecondaryButtonText", "", "drawableRes", "setPrimaryButtonBackgroundDrawable", "color", "setPrimaryButtonTextColor", "setSecondaryButtonBackgroundDrawable", "setSecondaryButtonTextColor", "drawable", "setIcon", "(Ljava/lang/Integer;)V", "i", "b", "()I", "layoutRes", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "g", "()Landroid/widget/TextView;", "Landroid/widget/Space;", "h", "()Landroid/widget/Space;", "titleSpace", "f", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "()Landroid/widget/Button;", "primaryButtonSingle", "c", "primaryButtonDouble", "e", "secondaryButton", "Landroid/widget/ImageView;", C17296a.f69688o, "()Landroid/widget/ImageView;", "icon", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class BottomModalSheetLayout extends LinearLayout {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/BottomModalSheetLayout$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.BottomModalSheetLayout$a */
    /* loaded from: classes4.dex */
    public enum EnumC16464a {
        NONE,
        SINGLE,
        DOUBLE
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.BottomModalSheetLayout$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16465b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16464a.values().length];
            try {
                iArr[EnumC16464a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16464a.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16464a.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomModalSheetLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m54743i();
    }

    /* renamed from: a */
    public final ImageView m54750a() {
        return (ImageView) findViewById(C52955zi4.icon);
    }

    /* renamed from: b */
    public int mo54741b() {
        return C45268mk4.bottom_modal_sheet;
    }

    /* renamed from: c */
    public final Button m54749c() {
        return (Button) findViewById(C52955zi4.primaryButtonDouble);
    }

    /* renamed from: d */
    public final Button m54748d() {
        return (Button) findViewById(C52955zi4.primaryButtonSingle);
    }

    /* renamed from: e */
    public final Button m54747e() {
        return (Button) findViewById(C52955zi4.secondaryButton);
    }

    /* renamed from: f */
    public final TextView m54746f() {
        return (TextView) findViewById(C52955zi4.subtitle);
    }

    /* renamed from: g */
    public final TextView m54745g() {
        return (TextView) findViewById(C52955zi4.title);
    }

    /* renamed from: h */
    public final Space m54744h() {
        return (Space) findViewById(C52955zi4.titleSpace);
    }

    /* renamed from: i */
    public final void m54743i() {
        LayoutInflater.from(getContext()).inflate(mo54741b(), (ViewGroup) this, true);
        setOrientation(1);
    }

    public final void setButtonMode(EnumC16464a buttonMode) {
        Intrinsics.checkNotNullParameter(buttonMode, "buttonMode");
        int i = C16465b.$EnumSwitchMapping$0[buttonMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Button primaryButtonSingle = m54748d();
                    Intrinsics.checkNotNullExpressionValue(primaryButtonSingle, "primaryButtonSingle");
                    C49520tu6.m11239l(primaryButtonSingle);
                    Button primaryButtonDouble = m54749c();
                    Intrinsics.checkNotNullExpressionValue(primaryButtonDouble, "primaryButtonDouble");
                    C49520tu6.m11233r(primaryButtonDouble);
                    Button secondaryButton = m54747e();
                    Intrinsics.checkNotNullExpressionValue(secondaryButton, "secondaryButton");
                    C49520tu6.m11233r(secondaryButton);
                    return;
                }
                return;
            }
            Button primaryButtonSingle2 = m54748d();
            Intrinsics.checkNotNullExpressionValue(primaryButtonSingle2, "primaryButtonSingle");
            C49520tu6.m11233r(primaryButtonSingle2);
            Button primaryButtonDouble2 = m54749c();
            Intrinsics.checkNotNullExpressionValue(primaryButtonDouble2, "primaryButtonDouble");
            C49520tu6.m11239l(primaryButtonDouble2);
            Button secondaryButton2 = m54747e();
            Intrinsics.checkNotNullExpressionValue(secondaryButton2, "secondaryButton");
            C49520tu6.m11239l(secondaryButton2);
            return;
        }
        Button primaryButtonSingle3 = m54748d();
        Intrinsics.checkNotNullExpressionValue(primaryButtonSingle3, "primaryButtonSingle");
        C49520tu6.m11239l(primaryButtonSingle3);
        Button primaryButtonDouble3 = m54749c();
        Intrinsics.checkNotNullExpressionValue(primaryButtonDouble3, "primaryButtonDouble");
        C49520tu6.m11239l(primaryButtonDouble3);
        Button secondaryButton3 = m54747e();
        Intrinsics.checkNotNullExpressionValue(secondaryButton3, "secondaryButton");
        C49520tu6.m11239l(secondaryButton3);
    }

    @SuppressLint({"ResourceType"})
    public final void setIcon(Integer num) {
        Unit unit;
        if (num != null) {
            m54750a().setImageDrawable(C29611vi.m8248b(getContext(), num.intValue()));
            ImageView icon = m54750a();
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C49520tu6.m11233r(icon);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ImageView icon2 = m54750a();
            Intrinsics.checkNotNullExpressionValue(icon2, "icon");
            C49520tu6.m11239l(icon2);
        }
    }

    public final void setPrimaryButtonBackgroundDrawable(int i) {
        m54748d().setBackground(NA0.m94299e(getContext(), i));
        m54749c().setBackground(NA0.m94299e(getContext(), i));
    }

    public final void setPrimaryButtonText(CharSequence charSequence) {
        boolean isBlank;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54749c().setText(charSequence);
                m54748d().setText(charSequence);
            }
        }
    }

    public final void setPrimaryButtonTextColor(int i) {
        m54749c().setTextColor(NA0.m94301c(getContext(), i));
        m54748d().setTextColor(NA0.m94301c(getContext(), i));
    }

    public final void setSecondaryButtonBackgroundDrawable(int i) {
        m54747e().setBackground(NA0.m94299e(getContext(), i));
    }

    public final void setSecondaryButtonText(CharSequence charSequence) {
        boolean isBlank;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54747e().setText(charSequence);
            }
        }
    }

    public final void setSecondaryButtonTextColor(int i) {
        m54747e().setTextColor(NA0.m94301c(getContext(), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSubtitle(CharSequence charSequence) {
        TextView m54745g;
        boolean isBlank;
        boolean z = true;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54746f().setText(charSequence);
                TextView m54746f = m54746f();
                Intrinsics.checkNotNullExpressionValue(m54746f, "this.subtitle");
                C49520tu6.show$default(m54746f, true, 0, 2, null);
                Space m54744h = m54744h();
                Intrinsics.checkNotNullExpressionValue(m54744h, "this.titleSpace");
                m54745g = m54745g();
                Intrinsics.checkNotNullExpressionValue(m54745g, "this.title");
                if (!C49520tu6.m11230u(m54745g)) {
                    TextView m54746f2 = m54746f();
                    Intrinsics.checkNotNullExpressionValue(m54746f2, "this.subtitle");
                    if (!C49520tu6.m11230u(m54746f2)) {
                        z = false;
                    }
                }
                C49520tu6.show$default(m54744h, z, 0, 2, null);
            }
        }
        TextView m54746f3 = m54746f();
        Intrinsics.checkNotNullExpressionValue(m54746f3, "this.subtitle");
        C49520tu6.show$default(m54746f3, false, 0, 2, null);
        Space m54744h2 = m54744h();
        Intrinsics.checkNotNullExpressionValue(m54744h2, "this.titleSpace");
        m54745g = m54745g();
        Intrinsics.checkNotNullExpressionValue(m54745g, "this.title");
        if (!C49520tu6.m11230u(m54745g)) {
        }
        C49520tu6.show$default(m54744h2, z, 0, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitle(CharSequence charSequence) {
        TextView m54745g;
        boolean isBlank;
        boolean z = true;
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                m54745g().setText(charSequence);
                TextView m54745g2 = m54745g();
                Intrinsics.checkNotNullExpressionValue(m54745g2, "this.title");
                C49520tu6.show$default(m54745g2, true, 0, 2, null);
                Space m54744h = m54744h();
                Intrinsics.checkNotNullExpressionValue(m54744h, "this.titleSpace");
                m54745g = m54745g();
                Intrinsics.checkNotNullExpressionValue(m54745g, "this.title");
                if (!C49520tu6.m11230u(m54745g)) {
                    TextView m54746f = m54746f();
                    Intrinsics.checkNotNullExpressionValue(m54746f, "this.subtitle");
                    if (!C49520tu6.m11230u(m54746f)) {
                        z = false;
                    }
                }
                C49520tu6.show$default(m54744h, z, 0, 2, null);
            }
        }
        TextView m54745g3 = m54745g();
        Intrinsics.checkNotNullExpressionValue(m54745g3, "this.title");
        C49520tu6.show$default(m54745g3, false, 0, 2, null);
        Space m54744h2 = m54744h();
        Intrinsics.checkNotNullExpressionValue(m54744h2, "this.titleSpace");
        m54745g = m54745g();
        Intrinsics.checkNotNullExpressionValue(m54745g, "this.title");
        if (!C49520tu6.m11230u(m54745g)) {
        }
        C49520tu6.show$default(m54744h2, z, 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomModalSheetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m54743i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomModalSheetLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m54743i();
    }
}
