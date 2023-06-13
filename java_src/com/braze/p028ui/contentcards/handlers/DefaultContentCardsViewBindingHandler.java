package com.braze.p028ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import com.braze.p028ui.contentcards.view.BannerImageContentCardView;
import com.braze.p028ui.contentcards.view.BaseContentCardView;
import com.braze.p028ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.p028ui.contentcards.view.DefaultContentCardView;
import com.braze.p028ui.contentcards.view.ShortNewsContentCardView;
import com.braze.p028ui.contentcards.view.TextAnnouncementContentCardView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler */
/* loaded from: classes5.dex */
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new C17088a();

    /* renamed from: b */
    public final Map<CardType, BaseContentCardView> f69053b = new HashMap();

    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$a */
    /* loaded from: classes5.dex */
    public class C17088a implements Parcelable.Creator<DefaultContentCardsViewBindingHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DefaultContentCardsViewBindingHandler createFromParcel(Parcel parcel) {
            return new DefaultContentCardsViewBindingHandler();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DefaultContentCardsViewBindingHandler[] newArray(int i) {
            return new DefaultContentCardsViewBindingHandler[i];
        }
    }

    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$b */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17089b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69054a;

        static {
            int[] iArr = new int[CardType.values().length];
            f69054a = iArr;
            try {
                iArr[CardType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69054a[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69054a[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69054a[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.braze.p028ui.contentcards.handlers.IContentCardsViewBindingHandler
    /* renamed from: K0 */
    public C38390bA0 mo53207K0(Context context, List<Card> list, ViewGroup viewGroup, int i) {
        return m53211a(context, CardType.fromValue(i)).mo53189d(viewGroup);
    }

    /* renamed from: a */
    public BaseContentCardView m53211a(Context context, CardType cardType) {
        BaseContentCardView bannerImageContentCardView;
        if (!this.f69053b.containsKey(cardType)) {
            int i = C17089b.f69054a[cardType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            bannerImageContentCardView = new DefaultContentCardView(context);
                        } else {
                            bannerImageContentCardView = new TextAnnouncementContentCardView(context);
                        }
                    } else {
                        bannerImageContentCardView = new ShortNewsContentCardView(context);
                    }
                } else {
                    bannerImageContentCardView = new CaptionedImageContentCardView(context);
                }
            } else {
                bannerImageContentCardView = new BannerImageContentCardView(context);
            }
            this.f69053b.put(cardType, bannerImageContentCardView);
        }
        return this.f69053b.get(cardType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.p028ui.contentcards.handlers.IContentCardsViewBindingHandler
    /* renamed from: h0 */
    public void mo53206h0(Context context, List<Card> list, C38390bA0 c38390bA0, int i) {
        if (i >= 0 && i < list.size()) {
            Card card = list.get(i);
            m53211a(context, card.getCardType()).mo53190b(c38390bA0, card);
        }
    }

    @Override // com.braze.p028ui.contentcards.handlers.IContentCardsViewBindingHandler
    /* renamed from: u2 */
    public int mo53205u2(Context context, List<Card> list, int i) {
        if (i >= 0 && i < list.size()) {
            return list.get(i).getCardType().getValue();
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
