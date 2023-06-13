package p000;

import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTime;
import p000.C48990t10;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lt10;", "Lq10;", "Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/c;", "l0", "Lio/reactivex/Observable;", "", "V", "", "birdId", "E0", "h0", "imei", "", "status", "U", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;", "B0", "clear", "Lj10;", C17296a.f69688o, "Lj10;", "brainClient", "Ll10;", "b", "Ll10;", "brainSwapDao", "<init>", "(Lj10;Ll10;)V", "co.bird.android.repository.brain-swap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48990t10 implements InterfaceC47212q10 {

    /* renamed from: a */
    public final InterfaceC43061j10 f109688a;

    /* renamed from: b */
    public final AbstractC44247l10 f109689b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "lastTrackedAt", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lorg/joda/time/DateTime;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: t10$a */
    /* loaded from: classes4.dex */
    public static final class C28499a extends Lambda implements Function1<DateTime, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f109691h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: t10$a$a */
        /* loaded from: classes4.dex */
        public static final class C28500a extends Lambda implements Function1<BrainSwapRecord, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ DateTime f109692g;

            /* renamed from: h */
            public final /* synthetic */ C48990t10 f109693h;

            /* renamed from: i */
            public final /* synthetic */ String f109694i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28500a(DateTime dateTime, C48990t10 c48990t10, String str) {
                super(1);
                this.f109692g = dateTime;
                this.f109693h = c48990t10;
                this.f109694i = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(BrainSwapRecord record) {
                Intrinsics.checkNotNullParameter(record, "record");
                if (record.getCreatedAt().isBefore(this.f109692g)) {
                    return this.f109693h.f109689b.mo26533g(this.f109694i, Boolean.TRUE);
                }
                return AbstractC23461c.m33039p();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28499a(String str) {
            super(1);
            this.f109691h = str;
        }

        /* renamed from: c */
        public static final InterfaceC23496h m13238c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(DateTime lastTrackedAt) {
            Intrinsics.checkNotNullParameter(lastTrackedAt, "lastTrackedAt");
            AbstractC23442F<BrainSwapRecord> firstOrError = C48990t10.this.f109689b.mo26535e(this.f109691h).firstOrError();
            final C28500a c28500a = new C28500a(lastTrackedAt, C48990t10.this, this.f109691h);
            return firstOrError.m33164B(new InterfaceC23492o() { // from class: s10
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m13238c;
                    m13238c = C48990t10.C28499a.m13238c(Function1.this, obj);
                    return m13238c;
                }
            });
        }
    }

    public C48990t10(InterfaceC43061j10 brainClient, AbstractC44247l10 brainSwapDao) {
        Intrinsics.checkNotNullParameter(brainClient, "brainClient");
        Intrinsics.checkNotNullParameter(brainSwapDao, "brainSwapDao");
        this.f109688a = brainClient;
        this.f109689b = brainSwapDao;
    }

    /* renamed from: K1 */
    public static final InterfaceC23496h m13245K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: B0 */
    public AbstractC23461c mo13248B0(String imei) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        AbstractC23442F<DateTime> m31252a = this.f109688a.m31252a(imei);
        final C28499a c28499a = new C28499a(imei);
        AbstractC23461c m33164B = m31252a.m33164B(new InterfaceC23492o() { // from class: r10
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m13245K1;
                m13245K1 = C48990t10.m13245K1(Function1.this, obj);
                return m13245K1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun queryBrainS…}\n          }\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: E0 */
    public Observable<BrainSwapRecord> mo13247E0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f109689b.mo26536d(birdId);
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: U */
    public AbstractC23461c mo13244U(String imei, Boolean bool) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        return this.f109689b.mo26533g(imei, bool);
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: V */
    public Observable<List<BrainSwapRecord>> mo13243V() {
        return this.f109689b.mo26534f();
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f109689b.mo26539a();
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: h0 */
    public AbstractC23461c mo13242h0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f109689b.mo26537c(birdId);
    }

    @Override // p000.InterfaceC47212q10
    /* renamed from: l0 */
    public AbstractC23461c mo13241l0(BrainSwapRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return this.f109689b.mo26538b(record);
    }
}
