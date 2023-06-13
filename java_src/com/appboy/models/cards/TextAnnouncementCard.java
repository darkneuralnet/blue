package com.appboy.models.cards;

import bo.app.InterfaceC12518a2;
import bo.app.InterfaceC13231y1;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lcom/appboy/models/cards/TextAnnouncementCard;", "Lcom/appboy/models/cards/Card;", "", "toString", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "title", "getTitle", "url", "getUrl", "domain", "getDomain", "Lcom/appboy/enums/CardType;", "cardType", "Lcom/appboy/enums/CardType;", "getCardType", "()Lcom/appboy/enums/CardType;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/appboy/enums/CardKey$Provider;", "cardKeyProvider", "Lbo/app/y1;", "manager", "LkO1;", "cardStorageProvider", "Lbo/app/a2;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TextAnnouncementCard extends Card {
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jsonObject, CardKey.Provider cardKeyProvider, InterfaceC13231y1 interfaceC13231y1, InterfaceC43871kO1<?> interfaceC43871kO1, InterfaceC12518a2 interfaceC12518a2) {
        super(jsonObject, cardKeyProvider, interfaceC13231y1, interfaceC43871kO1, interfaceC12518a2);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        String string = jsonObject.getString(cardKeyProvider.getKey(CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION));
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(car…NNOUNCEMENT_DESCRIPTION))");
        this.description = string;
        this.title = C31696Aj2.m115351h(jsonObject, cardKeyProvider.getKey(CardKey.TEXT_ANNOUNCEMENT_TITLE));
        this.url = C31696Aj2.m115351h(jsonObject, cardKeyProvider.getKey(CardKey.TEXT_ANNOUNCEMENT_URL));
        this.domain = C31696Aj2.m115351h(jsonObject, cardKeyProvider.getKey(CardKey.TEXT_ANNOUNCEMENT_DOMAIN));
        this.cardType = CardType.TEXT_ANNOUNCEMENT;
    }

    @Override // com.appboy.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.appboy.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.appboy.models.cards.Card
    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            TextAnnouncementCard{description='" + this.description + "'\n            title='" + ((Object) this.title) + "'\n            url='" + ((Object) getUrl()) + "'\n            domain='" + ((Object) this.domain) + "'\n            " + super.toString() + "}\n\n        ");
        return trimIndent;
    }
}
