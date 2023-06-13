package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/util/AttributeSet;", "attrs", "", "g", "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;", "value", "b", "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;", "getArrowDirection", "()Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;", "setArrowDirection", "(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V", "arrowDirection", "", "c", "Z", "f", "()Z", "setCollapsable", "(Z)V", "collapsable", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CollapsableHeaderView extends AppCompatTextView {

    /* renamed from: b */
    public EnumC16700a f68124b;

    /* renamed from: c */
    public boolean f68125c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.standardcomponents.CollapsableHeaderView$a */
    /* loaded from: classes4.dex */
    public enum EnumC16700a {
        NONE,
        DOWN,
        UP
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.standardcomponents.CollapsableHeaderView$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16701b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16700a.values().length];
            try {
                iArr[EnumC16700a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16700a.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16700a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsableHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68124b = EnumC16700a.NONE;
    }

    /* renamed from: f */
    public final boolean m53965f() {
        return this.f68125c;
    }

    /* renamed from: g */
    public final void m53964g(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.CollapsableHeaderView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…le.CollapsableHeaderView)");
        setCollapsable(obtainStyledAttributes.getBoolean(C34290Ll4.CollapsableHeaderView_collapsable, false));
        obtainStyledAttributes.recycle();
    }

    public final void setArrowDirection(EnumC16700a value) {
        Drawable m94299e;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68124b = value;
        int i = C16701b.$EnumSwitchMapping$0[value.ordinal()];
        if (i != 1) {
            if (i != 2) {
                m94299e = null;
            } else {
                m94299e = NA0.m94299e(getContext(), C48193rg4.ic_filled_carrot_up);
            }
        } else {
            m94299e = NA0.m94299e(getContext(), C48193rg4.ic_filled_carrot_down);
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, m94299e, (Drawable) null);
    }

    public final void setCollapsable(boolean z) {
        this.f68125c = z;
        if (z && this.f68124b == EnumC16700a.NONE) {
            setArrowDirection(EnumC16700a.DOWN);
        } else if (!z) {
            setArrowDirection(EnumC16700a.NONE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsableHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f68124b = EnumC16700a.NONE;
        m53964g(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsableHeaderView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f68124b = EnumC16700a.NONE;
        m53964g(attrs);
    }
}
