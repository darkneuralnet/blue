package com.braze.p028ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/appboy/models/cards/TextAnnouncementCard;", "Landroid/view/ViewGroup;", "viewGroup", "LbA0;", DateTokenConverter.CONVERTER_KEY, "viewHolder", "card", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.view.TextAnnouncementContentCardView */
/* loaded from: classes5.dex */
public class TextAnnouncementContentCardView extends BaseContentCardView<TextAnnouncementCard> {

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView$a;", "LbA0;", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "k", "()Landroid/widget/TextView;", "title", "f", "j", "description", "Landroid/view/View;", "view", "<init>", "(Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView;Landroid/view/View;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.view.TextAnnouncementContentCardView$a */
    /* loaded from: classes5.dex */
    public final class C17094a extends C38390bA0 {

        /* renamed from: e */
        public final TextView f69066e;

        /* renamed from: f */
        public final TextView f69067f;

        /* renamed from: g */
        public final /* synthetic */ TextAnnouncementContentCardView f69068g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17094a(TextAnnouncementContentCardView this$0, View view) {
            super(view, this$0.isUnreadIndicatorEnabled());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f69068g = this$0;
            this.f69066e = (TextView) view.findViewById(R$id.com_braze_content_cards_text_announcement_card_title);
            this.f69067f = (TextView) view.findViewById(R$id.com_braze_content_cards_text_announcement_card_description);
        }

        /* renamed from: j */
        public final TextView m53187j() {
            return this.f69067f;
        }

        /* renamed from: k */
        public final TextView m53186k() {
            return this.f69066e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnouncementContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: d */
    public C38390bA0 mo53189d(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_text_announcement_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m53199f(view);
        return new C17094a(this, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53190b(C38390bA0 viewHolder, TextAnnouncementCard card) {
        boolean z;
        String domain;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        super.mo53190b(viewHolder, card);
        C17094a c17094a = (C17094a) viewHolder;
        TextView m53186k = c17094a.m53186k();
        if (m53186k != null) {
            setOptionalTextView(m53186k, card.getTitle());
        }
        TextView m53187j = c17094a.m53187j();
        if (m53187j != null) {
            setOptionalTextView(m53187j, card.getDescription());
        }
        String domain2 = card.getDomain();
        if (domain2 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(domain2);
            if (!isBlank) {
                z = false;
                if (!z) {
                    domain = card.getUrl();
                } else {
                    domain = card.getDomain();
                }
                if (domain != null) {
                    c17094a.m64913a(domain);
                }
                View view = viewHolder.itemView;
                view.setContentDescription(((Object) card.getTitle()) + " . " + card.getDescription());
            }
        }
        z = true;
        if (!z) {
        }
        if (domain != null) {
        }
        View view2 = viewHolder.itemView;
        view2.setContentDescription(((Object) card.getTitle()) + " . " + card.getDescription());
    }
}
