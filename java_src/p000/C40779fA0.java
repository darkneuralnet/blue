package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.Card;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\nB/\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001e¨\u0006#"}, m28432d2 = {"LfA0;", "", "", "ageSeconds", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "Lcom/appboy/models/cards/Card;", C17296a.f69688o, "Ljava/util/List;", "contentCards", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "userId", "c", "J", "getTimestampSeconds", "()J", "timestampSeconds", "Z", "()Z", "isFromOfflineStorage", "", "()Ljava/util/List;", "allCards", "", "()I", "cardCount", "<init>", "(Ljava/util/List;Ljava/lang/String;JZ)V", "e", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: fA0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40779fA0 {

    /* renamed from: e */
    public static final C20310a f79626e = new C20310a(null);

    /* renamed from: a */
    public final List<Card> f79627a;

    /* renamed from: b */
    public final String f79628b;

    /* renamed from: c */
    public final long f79629c;

    /* renamed from: d */
    public final boolean f79630d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m28432d2 = {"LfA0$a;", "", "LfA0;", C17296a.f69688o, "()LfA0;", "getEmptyUpdate$annotations", "()V", "emptyUpdate", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: fA0$a */
    /* loaded from: classes2.dex */
    public static final class C20310a {
        public /* synthetic */ C20310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40779fA0 m41789a() {
            List emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new C40779fA0(emptyList, null, C46287oT0.m21027i(), true);
        }

        private C20310a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40779fA0(List<? extends Card> contentCards, String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(contentCards, "contentCards");
        this.f79627a = contentCards;
        this.f79628b = str;
        this.f79629c = j;
        this.f79630d = z;
    }

    /* renamed from: a */
    public final List<Card> m41793a() {
        List<Card> mutableList;
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f79627a);
        return mutableList;
    }

    /* renamed from: b */
    public final int m41792b() {
        return this.f79627a.size();
    }

    /* renamed from: c */
    public final boolean m41791c() {
        return this.f79630d;
    }

    /* renamed from: d */
    public final boolean m41790d(long j) {
        return TimeUnit.SECONDS.toMillis(this.f79629c + j) < System.currentTimeMillis();
    }

    public String toString() {
        return "ContentCardsUpdatedEvent{userId='" + ((Object) this.f79628b) + "', timestampSeconds=" + this.f79629c + ", isFromOfflineStorage=" + this.f79630d + ", card count=" + m41792b() + CoreConstants.CURLY_RIGHT;
    }
}
