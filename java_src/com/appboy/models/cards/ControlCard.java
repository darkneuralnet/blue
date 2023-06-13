package com.appboy.models.cards;

import bo.app.InterfaceC12518a2;
import bo.app.InterfaceC13231y1;
import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lcom/appboy/models/cards/ControlCard;", "Lcom/appboy/models/cards/Card;", "", "toString", "Lcom/appboy/enums/CardType;", "cardType", "Lcom/appboy/enums/CardType;", "getCardType", "()Lcom/appboy/enums/CardType;", "Lorg/json/JSONObject;", "jsonObject", "Lcom/appboy/enums/CardKey$Provider;", "cardKeysProvider", "Lbo/app/y1;", "manager", "LkO1;", "cardStorageProvider", "Lbo/app/a2;", "cardAnalyticsProvider", "<init>", "(Lorg/json/JSONObject;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ControlCard extends Card {
    private final CardType cardType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jsonObject, CardKey.Provider cardKeysProvider, InterfaceC13231y1 interfaceC13231y1, InterfaceC43871kO1<?> interfaceC43871kO1, InterfaceC12518a2 interfaceC12518a2) {
        super(jsonObject, cardKeysProvider, interfaceC13231y1, interfaceC43871kO1, interfaceC12518a2);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.cardType = CardType.CONTROL;
    }

    @Override // com.appboy.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    @Override // com.appboy.models.cards.Card
    public String toString() {
        return "ControlCard{" + super.toString() + CoreConstants.CURLY_RIGHT;
    }
}
