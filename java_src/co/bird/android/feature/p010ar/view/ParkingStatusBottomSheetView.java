package co.bird.android.feature.p010ar.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\""}, m28432d2 = {"Lco/bird/android/feature/ar/view/ParkingStatusBottomSheetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "", "setColor", "LQf2;", "b", "LQf2;", "binding", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "g", "()Landroid/widget/TextView;", "titleTextView", DateTokenConverter.CONVERTER_KEY, "e", "descriptionTextView", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "f", "()Landroid/widget/ImageView;", "iconImageView", "Landroid/view/View;", "Landroid/view/View;", "titleBackground", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.view.ParkingStatusBottomSheetView */
/* loaded from: classes3.dex */
public final class ParkingStatusBottomSheetView extends ConstraintLayout {

    /* renamed from: b */
    public final C35404Qf2 f63229b;

    /* renamed from: c */
    public final TextView f63230c;

    /* renamed from: d */
    public final TextView f63231d;

    /* renamed from: e */
    public final ImageView f63232e;

    /* renamed from: f */
    public final View f63233f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusBottomSheetView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: e */
    public final TextView m58888e() {
        return this.f63231d;
    }

    /* renamed from: f */
    public final ImageView m58887f() {
        return this.f63232e;
    }

    /* renamed from: g */
    public final TextView m58886g() {
        return this.f63230c;
    }

    public final void setColor(int i) {
        this.f63232e.setImageTintList(ColorStateList.valueOf(i));
        this.f63233f.setBackgroundColor(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ParkingStatusBottomSheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParkingStatusBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C35404Qf2 m88271c = C35404Qf2.m88271c(C40788fB0.m41772j(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m88271c, "inflate(context.layoutInflater, this, true)");
        this.f63229b = m88271c;
        TextView textView = m88271c.f30706g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        this.f63230c = textView;
        TextView textView2 = m88271c.f30701b;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.description");
        this.f63231d = textView2;
        ImageView imageView = m88271c.f30702c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
        this.f63232e = imageView;
        View view = m88271c.f30707h;
        Intrinsics.checkNotNullExpressionValue(view, "binding.titleBackground");
        this.f63233f = view;
    }
}
