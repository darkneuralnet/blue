package com.braze.p028ui.contentcards.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.Card;
import com.appboy.p027ui.R$drawable;
import com.appboy.p027ui.widget.BaseCardView;
import com.braze.p028ui.contentcards.view.BaseContentCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0013\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0001J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0005J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0004¨\u0006 "}, m28432d2 = {"Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/appboy/models/cards/Card;", "T", "Lcom/appboy/ui/widget/BaseCardView;", "Landroid/view/ViewGroup;", "viewGroup", "LbA0;", DateTokenConverter.CONVERTER_KEY, "viewHolder", "card", "", "b", "(LbA0;Lcom/appboy/models/cards/Card;)V", "Landroid/widget/ImageView;", "imageView", "", "cardAspectRatio", "", "cardImageUrl", "setOptionalCardImage", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LVN1;", "cardAction", "", "isClickHandled", "e", "Landroid/view/View;", "view", "f", "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.view.BaseContentCardView */
/* loaded from: classes5.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: c */
    public static final void m53201c(BaseContentCardView this$0, Card card, C32132Cf6 c32132Cf6, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(card, "$card");
        this$0.handleCardClick(this$0.applicationContext, card, c32132Cf6);
    }

    /* renamed from: b */
    public void mo53190b(C38390bA0 viewHolder, final T card) {
        boolean z;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        viewHolder.m64911e(card.isPinned());
        boolean z2 = true;
        if (this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted()) {
            z = true;
        } else {
            z = false;
        }
        viewHolder.m64910i(z);
        final C32132Cf6 uriActionForCard = BaseCardView.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: vA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseContentCardView.m53201c(BaseContentCardView.this, card, uriActionForCard, view);
            }
        });
        if (uriActionForCard == null) {
            z2 = false;
        }
        viewHolder.m64912b(z2);
    }

    /* renamed from: d */
    public abstract C38390bA0 mo53189d(ViewGroup viewGroup);

    @TargetApi(21)
    /* renamed from: e */
    public final void m53200e(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setClipToOutline(true);
    }

    /* renamed from: f */
    public final void m53199f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(getResources().getDrawable(R$drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(R$drawable.com_braze_content_card_scrim));
    }

    @Override // com.appboy.p027ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, VN1 vn1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        InterfaceC44464lO1 m75850b = Y10.f44439b.m75848a().m75850b();
        if (m75850b == null || !m75850b.m27347b(context, card, vn1)) {
            return false;
        }
        return true;
    }

    public final void setOptionalCardImage(ImageView imageView, float f, String str, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageView != null && str != null) {
            setImageViewToUrl(imageView, str, f, card);
        }
    }
}
