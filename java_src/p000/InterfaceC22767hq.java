package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.TokenPairState;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J/\u0010\f\u001a\u00020\n2%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H&J/\u0010\u0010\u001a\u00020\n2%\u0010\u000f\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H&J8\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H'J\b\u0010\u0019\u001a\u00020\u0016H'J\b\u0010\u001a\u001a\u00020\u0016H'R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, m28432d2 = {"Lhq;", "", "", "c", "", "j", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lastAuthHeader", "", "action", "k", "Lco/bird/android/model/TokenPairState;", "tokenPair", "update", "h", "T", "LNp;", "authHeaderResult", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lio/reactivex/c;", "i", "b", "e", "f", "LZ84;", "Lco/bird/android/buava/Optional;", DateTokenConverter.CONVERTER_KEY, "()LZ84;", "tokenPairState", C17296a.f69688o, "legacyAuthToken", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hq */
/* loaded from: classes2.dex */
public interface InterfaceC22767hq {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: hq$a */
    /* loaded from: classes2.dex */
    public static final class C22768a {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hq$a$a */
        /* loaded from: classes2.dex */
        public static final class C22769a extends Lambda implements Function1<String, Unit> {

            /* renamed from: g */
            public static final C22769a f85972g = new C22769a();

            public C22769a() {
                super(1);
            }

            /* renamed from: invoke */
            public final void invoke2(String str) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void reset$default(InterfaceC22767hq interfaceC22767hq, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
            }
            if ((i & 1) != 0) {
                function1 = C22769a.f85972g;
            }
            interfaceC22767hq.mo15256k(function1);
        }
    }

    /* renamed from: a */
    Z84<Optional<String>> mo15266a();

    @Deprecated(message = "For debugging/QA purposes only!")
    /* renamed from: b */
    AbstractC23461c mo15265b();

    /* renamed from: c */
    String mo15264c();

    /* renamed from: d */
    Z84<Optional<TokenPairState>> mo15263d();

    @Deprecated(message = "For debugging/QA purposes only!")
    /* renamed from: e */
    AbstractC23461c mo15262e();

    @Deprecated(message = "For debugging/QA purposes only!")
    /* renamed from: f */
    AbstractC23461c mo15261f();

    /* renamed from: g */
    <T> T mo15260g(Function1<? super AbstractC5699Np, ? extends T> function1);

    /* renamed from: h */
    void mo15259h(Function1<? super TokenPairState, TokenPairState> function1);

    /* renamed from: i */
    AbstractC23461c mo15258i();

    /* renamed from: j */
    boolean mo15257j();

    /* renamed from: k */
    void mo15256k(Function1<? super String, Unit> function1);
}
