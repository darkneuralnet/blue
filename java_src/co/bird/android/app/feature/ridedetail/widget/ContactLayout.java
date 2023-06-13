package co.bird.android.app.feature.ridedetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;", "Landroid/widget/LinearLayout;", "", "nameAndNumber", "", C17296a.f69688o, "name", "number", "b", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ContactLayout extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m59453c();
    }

    /* renamed from: a */
    public final void m59455a(String nameAndNumber) {
        Intrinsics.checkNotNullParameter(nameAndNumber, "nameAndNumber");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ContactLineItemView contactLineItemView = new ContactLineItemView(context);
        contactLineItemView.setBirdContactItem(nameAndNumber);
        addView(contactLineItemView, new LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: b */
    public final void m59454b(String name, String number) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ContactLineItemView contactLineItemView = new ContactLineItemView(context);
        contactLineItemView.setContactItem(name, number);
        addView(contactLineItemView, new LinearLayout.LayoutParams(-1, -2));
    }

    /* renamed from: c */
    public final void m59453c() {
        LayoutInflater.from(getContext()).inflate(C39311cj4.view_contact, this);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m59453c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m59453c();
    }
}
