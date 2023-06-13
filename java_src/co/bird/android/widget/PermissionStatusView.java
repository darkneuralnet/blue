package co.bird.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, m28432d2 = {"Lco/bird/android/widget/PermissionStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "", "setTitle", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "icon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "statusIcon", "", "enabled", "e", "Z", "getPermissionEnabled", "()Z", "setPermissionEnabled", "(Z)V", "permissionEnabled", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPermissionStatusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionStatusView.kt\nco/bird/android/widget/PermissionStatusView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,53:1\n233#2,3:54\n*S KotlinDebug\n*F\n+ 1 PermissionStatusView.kt\nco/bird/android/widget/PermissionStatusView\n*L\n46#1:54,3\n*E\n"})
/* loaded from: classes4.dex */
public final class PermissionStatusView extends ConstraintLayout {

    /* renamed from: b */
    public final ImageView f67456b;

    /* renamed from: c */
    public final TextView f67457c;

    /* renamed from: d */
    public final ImageView f67458d;

    /* renamed from: e */
    public boolean f67459e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PermissionStatusView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setPermissionEnabled(boolean z) {
        int i;
        if (this.f67459e == z) {
            return;
        }
        this.f67459e = z;
        ImageView imageView = this.f67458d;
        if (z) {
            i = C48193rg4.ic_filled_check_circle_green;
        } else {
            i = C48193rg4.ic_filled_x_circle_red;
        }
        imageView.setImageResource(i);
    }

    public final void setTitle(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f67457c.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PermissionStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PermissionStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PermissionStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(context, C45268mk4.view_permission_status, this);
        View findViewById = findViewById(C52955zi4.permissionIcon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.permissionIcon)");
        ImageView imageView = (ImageView) findViewById;
        this.f67456b = imageView;
        View findViewById2 = findViewById(C52955zi4.permissionTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.permissionTitle)");
        TextView textView = (TextView) findViewById2;
        this.f67457c = textView;
        View findViewById3 = findViewById(C52955zi4.permissionStatus);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.permissionStatus)");
        this.f67458d = (ImageView) findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34290Ll4.PermissionStatusView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ble.PermissionStatusView)");
        imageView.setImageDrawable(C33032Gb6.m104981c(obtainStyledAttributes, C34290Ll4.PermissionStatusView_bird_icon));
        textView.setText(obtainStyledAttributes.getText(C34290Ll4.PermissionStatusView_bird_title));
        setPermissionEnabled(obtainStyledAttributes.getBoolean(C34290Ll4.PermissionStatusView_bird_granted, false));
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
    }
}
