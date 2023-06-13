package com.braze.p028ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/appboy/models/cards/ShortNewsCard;", "Landroid/view/ViewGroup;", "viewGroup", "LbA0;", DateTokenConverter.CONVERTER_KEY, "viewHolder", "card", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView */
/* loaded from: classes5.dex */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {

    /* renamed from: b */
    public static final C17092a f69061b = new C17092a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$a;", "", "", "ASPECT_RATIO", "F", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView$a */
    /* loaded from: classes5.dex */
    public static final class C17092a {
        public /* synthetic */ C17092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17092a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$b;", "LbA0;", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "l", "()Landroid/widget/TextView;", "title", "f", "j", "description", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "k", "()Landroid/widget/ImageView;", "imageView", "Landroid/view/View;", "view", "<init>", "(Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;Landroid/view/View;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.view.ShortNewsContentCardView$b */
    /* loaded from: classes5.dex */
    public final class C17093b extends C38390bA0 {

        /* renamed from: e */
        public final TextView f69062e;

        /* renamed from: f */
        public final TextView f69063f;

        /* renamed from: g */
        public final ImageView f69064g;

        /* renamed from: h */
        public final /* synthetic */ ShortNewsContentCardView f69065h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17093b(ShortNewsContentCardView this$0, View view) {
            super(view, this$0.isUnreadIndicatorEnabled());
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f69065h = this$0;
            this.f69062e = (TextView) view.findViewById(R$id.com_braze_content_cards_short_news_card_title);
            this.f69063f = (TextView) view.findViewById(R$id.com_braze_content_cards_short_news_card_description);
            this.f69064g = (ImageView) view.findViewById(R$id.com_braze_content_cards_short_news_card_image);
        }

        /* renamed from: j */
        public final TextView m53193j() {
            return this.f69063f;
        }

        /* renamed from: k */
        public final ImageView m53192k() {
            return this.f69064g;
        }

        /* renamed from: l */
        public final TextView m53191l() {
            return this.f69062e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortNewsContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: d */
    public C38390bA0 mo53189d(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_short_news_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m53199f(view);
        return new C17093b(this, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // com.braze.p028ui.contentcards.view.BaseContentCardView
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53190b(C38390bA0 viewHolder, ShortNewsCard card) {
        boolean z;
        String domain;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        super.mo53190b(viewHolder, card);
        C17093b c17093b = (C17093b) viewHolder;
        TextView m53191l = c17093b.m53191l();
        if (m53191l != null) {
            setOptionalTextView(m53191l, card.getTitle());
        }
        TextView m53193j = c17093b.m53193j();
        if (m53193j != null) {
            setOptionalTextView(m53193j, card.getDescription());
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
                    c17093b.m64913a(domain);
                }
                setOptionalCardImage(c17093b.m53192k(), 1.0f, card.getImageUrl(), card);
                m53200e(c17093b.m53192k());
                View view = viewHolder.itemView;
                view.setContentDescription(((Object) card.getTitle()) + " . " + card.getDescription());
            }
        }
        z = true;
        if (!z) {
        }
        if (domain != null) {
        }
        setOptionalCardImage(c17093b.m53192k(), 1.0f, card.getImageUrl(), card);
        m53200e(c17093b.m53192k());
        View view2 = viewHolder.itemView;
        view2.setContentDescription(((Object) card.getTitle()) + " . " + card.getDescription());
    }
}
