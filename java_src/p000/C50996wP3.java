package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0082\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0003B)\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m28432d2 = {"LwP3;", "", "LaJ4;", C17296a.f69688o, "Lco/bird/android/model/User;", "b", "Lcom/stripe/android/model/Card;", "c", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "LaJ4;", "getEvent", "()LaJ4;", "event", "Lco/bird/android/model/User;", "getUser", "()Lco/bird/android/model/User;", "user", "Lcom/stripe/android/model/Card;", "getDefaultCard", "()Lcom/stripe/android/model/Card;", "defaultCard", "Z", "getGooglePayReady", "()Z", "googlePayReady", "<init>", "(LaJ4;Lco/bird/android/model/User;Lcom/stripe/android/model/Card;Z)V", "e", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wP3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50996wP3 {

    /* renamed from: e */
    public static final C29873a f115916e = new C29873a(null);

    /* renamed from: a */
    public final C37882aJ4 f115917a;

    /* renamed from: b */
    public final User f115918b;

    /* renamed from: c */
    public final Card f115919c;

    /* renamed from: d */
    public final boolean f115920d;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¨\u0006\u000f"}, m28432d2 = {"LwP3$a;", "", "Lkotlin/Pair;", "LaJ4;", "Lco/bird/android/model/User;", "eventAndUser", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "defaultCard", "", "googlePayReady", "LwP3;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wP3$a */
    /* loaded from: classes2.dex */
    public static final class C29873a {
        public /* synthetic */ C29873a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C50996wP3 m6873a(Pair<C37882aJ4, User> eventAndUser, Optional<Card> defaultCard, boolean z) {
            Intrinsics.checkNotNullParameter(eventAndUser, "eventAndUser");
            Intrinsics.checkNotNullParameter(defaultCard, "defaultCard");
            return new C50996wP3(eventAndUser.component1(), eventAndUser.component2(), defaultCard.m59035e(), z);
        }

        private C29873a() {
        }
    }

    public C50996wP3(C37882aJ4 event, User user, Card card, boolean z) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f115917a = event;
        this.f115918b = user;
        this.f115919c = card;
        this.f115920d = z;
    }

    /* renamed from: a */
    public final C37882aJ4 m6877a() {
        return this.f115917a;
    }

    /* renamed from: b */
    public final User m6876b() {
        return this.f115918b;
    }

    /* renamed from: c */
    public final Card m6875c() {
        return this.f115919c;
    }

    /* renamed from: d */
    public final boolean m6874d() {
        return this.f115920d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50996wP3) {
            C50996wP3 c50996wP3 = (C50996wP3) obj;
            return Intrinsics.areEqual(this.f115917a, c50996wP3.f115917a) && Intrinsics.areEqual(this.f115918b, c50996wP3.f115918b) && Intrinsics.areEqual(this.f115919c, c50996wP3.f115919c) && this.f115920d == c50996wP3.f115920d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f115917a.hashCode() * 31) + this.f115918b.hashCode()) * 31;
        Card card = this.f115919c;
        int hashCode2 = (hashCode + (card == null ? 0 : card.hashCode())) * 31;
        boolean z = this.f115920d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        C37882aJ4 c37882aJ4 = this.f115917a;
        User user = this.f115918b;
        Card card = this.f115919c;
        boolean z = this.f115920d;
        return "PaymentRequest(event=" + c37882aJ4 + ", user=" + user + ", defaultCard=" + card + ", googlePayReady=" + z + ")";
    }
}
