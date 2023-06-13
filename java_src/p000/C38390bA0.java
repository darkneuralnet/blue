package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.R$id;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LbA0;", "Landroidx/recyclerview/widget/RecyclerView$D;", "", "isVisible", "", "e", "i", "b", "", Entry.TYPE_TEXT, C17296a.f69688o, "Landroid/view/View;", "Landroid/view/View;", "unreadBar", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "pinnedIcon", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "actionHint", "view", "showUnreadIndicator", "<init>", "(Landroid/view/View;Z)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bA0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38390bA0 extends RecyclerView.AbstractC11834D {

    /* renamed from: b */
    public final View f56996b;

    /* renamed from: c */
    public final ImageView f56997c;

    /* renamed from: d */
    public final TextView f56998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38390bA0(View view, boolean z) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R$id.com_braze_content_cards_unread_bar);
        this.f56996b = findViewById;
        this.f56997c = (ImageView) view.findViewById(R$id.com_braze_content_cards_pinned_icon);
        this.f56998d = (TextView) view.findViewById(R$id.com_braze_content_cards_action_hint);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(R$drawable.com_braze_content_cards_unread_bar_background));
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void m64913a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.f56998d;
        if (textView != null) {
            textView.setText(text);
        }
    }

    /* renamed from: b */
    public final void m64912b(boolean z) {
        TextView textView = this.f56998d;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }

    /* renamed from: e */
    public final void m64911e(boolean z) {
        ImageView imageView = this.f56997c;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    /* renamed from: i */
    public final void m64910i(boolean z) {
        View view = this.f56996b;
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }
}
