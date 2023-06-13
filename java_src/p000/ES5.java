package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.TokenizationMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\b\u0012\u0004\u0012\u00020\u00000\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/Card;", "", DateTokenConverter.CONVERTER_KEY, "", "b", "c", "", "defaultCard", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripe+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stripe+.kt\nco/bird/android/library/extension/Stripe_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1#2:24\n533#3,6:25\n766#3:31\n857#3,2:32\n*S KotlinDebug\n*F\n+ 1 Stripe+.kt\nco/bird/android/library/extension/Stripe_Kt\n*L\n20#1:25,6\n21#1:31\n21#1:32,2\n*E\n"})
/* renamed from: ES5 */
/* loaded from: classes3.dex */
public final class ES5 {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<Card> m108974a(List<Card> list, Card card) {
        Card card2;
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (card != null) {
            if (!m108973b(card)) {
                card = null;
            }
        }
        ListIterator<Card> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                card2 = listIterator.previous();
                if (m108973b(card2)) {
                    break;
                }
            } else {
                card2 = null;
                break;
            }
        }
        card = card2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Card card3 = (Card) obj;
            if (!m108972c(card3)) {
                if (card != null) {
                    str = card.getId();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(str, card3.getId())) {
                    z = false;
                    if (!z) {
                        arrayList.add(obj);
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m108973b(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        if (card.getTokenizationMethod() == TokenizationMethod.GooglePay) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m108972c(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        if (card.getTokenizationMethod() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final String m108971d(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        TokenizationMethod tokenizationMethod = card.getTokenizationMethod();
        if (tokenizationMethod != null) {
            return tokenizationMethod.name();
        }
        return null;
    }

    public static /* synthetic */ List deduplicateGooglePay$default(List list, Card card, int i, Object obj) {
        if ((i & 1) != 0) {
            card = null;
        }
        return m108974a(list, card);
    }
}
