package com.braze.p028ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.cards.Card;
import com.braze.p028ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, m28432d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "LfA0;", "event", "", "Lcom/appboy/models/cards/Card;", "m3", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "<init>", "()V", "b", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler */
/* loaded from: classes5.dex */
public final class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {

    /* renamed from: b */
    public static final C17087b f69052b = new C17087b(null);
    @JvmField
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new C17086a();

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"com/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "Landroid/os/Parcel;", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "", "size", "", "b", "(I)[Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$a */
    /* loaded from: classes5.dex */
    public static final class C17086a implements Parcelable.Creator<DefaultContentCardsUpdateHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DefaultContentCardsUpdateHandler();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public DefaultContentCardsUpdateHandler[] newArray(int i) {
            return new DefaultContentCardsUpdateHandler[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler$b;", "", "Landroid/os/Parcelable$Creator;", "Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$b */
    /* loaded from: classes5.dex */
    public static final class C17087b {
        public /* synthetic */ C17087b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17087b() {
        }
    }

    /* renamed from: b */
    public static final int m53214b(Card cardA, Card cardB) {
        Intrinsics.checkNotNullParameter(cardA, "cardA");
        Intrinsics.checkNotNullParameter(cardB, "cardB");
        if (cardA.isPinned() && !cardB.isPinned()) {
            return -1;
        }
        if (cardA.isPinned() || !cardB.isPinned()) {
            if (cardA.getUpdated() > cardB.getUpdated()) {
                return -1;
            }
            if (cardA.getUpdated() >= cardB.getUpdated()) {
                return 0;
            }
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.p028ui.contentcards.handlers.IContentCardsUpdateHandler
    /* renamed from: m3 */
    public List<Card> mo53208m3(C40779fA0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List<Card> m41793a = event.m41793a();
        Collections.sort(m41793a, new Comparator() { // from class: OW0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m53214b;
                m53214b = DefaultContentCardsUpdateHandler.m53214b((Card) obj, (Card) obj2);
                return m53214b;
            }
        });
        return m41793a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }
}
