package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LRE;", "", "<init>", "(Ljava/lang/String;I)V", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RE */
/* loaded from: classes3.dex */
public enum EnumC7097RE {
    ATTACH,
    DETACH;
    

    /* renamed from: b */
    public static final C7098a f31752b = new C7098a(null);

    /* renamed from: c */
    public static final CorrespondingEventsFunction<EnumC7097RE> f31753c = new CorrespondingEventsFunction() { // from class: QE
        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.InterfaceC23492o
        public final Object apply(Object obj) {
            EnumC7097RE m87017c;
            m87017c = EnumC7097RE.m87017c((EnumC7097RE) obj);
            return m87017c;
        }
    };

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LRE$a;", "", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "LRE;", "CORRESPONDING_EVENTS", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", C17296a.f69688o, "()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: RE$a */
    /* loaded from: classes3.dex */
    public static final class C7098a {
        public /* synthetic */ C7098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CorrespondingEventsFunction<EnumC7097RE> m87016a() {
            return EnumC7097RE.f31753c;
        }

        private C7098a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RE$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7099b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC7097RE.values().length];
            try {
                iArr[EnumC7097RE.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: c */
    public static final EnumC7097RE m87017c(EnumC7097RE event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (C7099b.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            return DETACH;
        }
        throw new RuntimeException("Cannot bind to Activity lifecycle after destroy.");
    }
}
