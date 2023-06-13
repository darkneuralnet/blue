package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"LDo;", "", "<init>", "(Ljava/lang/String;I)V", "b", C17296a.f69688o, "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Do */
/* loaded from: classes6.dex */
public enum EnumC1606Do {
    BOTTOM,
    TOP,
    START,
    END;
    

    /* renamed from: b */
    public static final C1607a f6338b = new C1607a(null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LDo$a;", "", "LDo;", "", "isRtlLayout", C17296a.f69688o, "(LDo;Z)LDo;", "<init>", "()V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Do$a */
    /* loaded from: classes6.dex */
    public static final class C1607a {

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* renamed from: Do$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1608a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC1606Do.values().length];
                iArr[EnumC1606Do.START.ordinal()] = 1;
                iArr[EnumC1606Do.END.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C1607a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC1606Do m109921a(EnumC1606Do enumC1606Do, boolean z) {
            Intrinsics.checkNotNullParameter(enumC1606Do, "<this>");
            if (z) {
                int i = C1608a.$EnumSwitchMapping$0[enumC1606Do.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return EnumC1606Do.START;
                    }
                    return enumC1606Do;
                }
                return EnumC1606Do.END;
            }
            return enumC1606Do;
        }

        private C1607a() {
        }
    }
}
