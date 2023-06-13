package co.bird.android.widget.standardcomponents;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+B\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b*\u0010.B!\b\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b*\u00101R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000bR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010'\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u00062"}, m28432d2 = {"Lco/bird/android/widget/standardcomponents/InspectionCard;", "Landroidx/cardview/widget/CardView;", "Landroid/widget/ImageView;", "k", "Lkotlin/Lazy;", "s", "()Landroid/widget/ImageView;", "imageView", "Landroid/widget/TextView;", "l", "t", "()Landroid/widget/TextView;", "titleView", "m", "r", "descriptionView", "", "n", "Ljava/lang/Boolean;", "getAccepted", "()Ljava/lang/Boolean;", "setAccepted", "(Ljava/lang/Boolean;)V", "accepted", "Landroid/graphics/drawable/Drawable;", "value", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getDescription", "setDescription", "description", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class InspectionCard extends CardView {

    /* renamed from: k */
    public final Lazy f68130k;

    /* renamed from: l */
    public final Lazy f68131l;

    /* renamed from: m */
    public final Lazy f68132m;

    /* renamed from: n */
    public Boolean f68133n;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.standardcomponents.InspectionCard$a */
    /* loaded from: classes4.dex */
    public static final class C16702a extends Lambda implements Function0<TextView> {
        public C16702a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) InspectionCard.this.findViewById(C52955zi4.description);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.standardcomponents.InspectionCard$b */
    /* loaded from: classes4.dex */
    public static final class C16703b extends Lambda implements Function0<ImageView> {
        public C16703b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            return (ImageView) InspectionCard.this.findViewById(C52955zi4.image);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.standardcomponents.InspectionCard$c */
    /* loaded from: classes4.dex */
    public static final class C16704c extends Lambda implements Function0<TextView> {
        public C16704c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) InspectionCard.this.findViewById(C52955zi4.title);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCard(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16703b());
        this.f68130k = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16704c());
        this.f68131l = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16702a());
        this.f68132m = lazy3;
    }

    /* renamed from: r */
    public final TextView m53962r() {
        Object value = this.f68132m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-descriptionView>(...)");
        return (TextView) value;
    }

    /* renamed from: s */
    public final ImageView m53961s() {
        Object value = this.f68130k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imageView>(...)");
        return (ImageView) value;
    }

    public void setAccepted(Boolean bool) {
        this.f68133n = bool;
    }

    public final void setDescription(CharSequence charSequence) {
        m53962r().setText(charSequence);
    }

    public final void setDrawable(Drawable drawable) {
        m53961s().setImageDrawable(drawable);
    }

    public final void setTitle(CharSequence charSequence) {
        m53960t().setText(charSequence);
    }

    /* renamed from: t */
    public final TextView m53960t() {
        Object value = this.f68131l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-titleView>(...)");
        return (TextView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        lazy = LazyKt__LazyJVMKt.lazy(new C16703b());
        this.f68130k = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16704c());
        this.f68131l = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16702a());
        this.f68132m = lazy3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspectionCard(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        lazy = LazyKt__LazyJVMKt.lazy(new C16703b());
        this.f68130k = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16704c());
        this.f68131l = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16702a());
        this.f68132m = lazy3;
    }
}
