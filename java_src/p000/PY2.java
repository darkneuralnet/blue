package p000;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u001a\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u0011"}, m28432d2 = {"LDY2;", "LsP5;", "LAY2;", DateTokenConverter.CONVERTER_KEY, "(LDY2;LEt0;I)LsP5;", "", "Ld13;", "LHY2;", "navigators", "LOY2;", "e", "([Ld13;LEt0;I)LOY2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "LRi5;", C17296a.f69688o, "navigation-compose_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: PY2 */
/* loaded from: classes.dex */
public final class PY2 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTi5;", "LOY2;", "it", "Landroid/os/Bundle;", C17296a.f69688o, "(LTi5;LOY2;)Landroid/os/Bundle;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: PY2$a */
    /* loaded from: classes.dex */
    public static final class C6405a extends Lambda implements Function2<InterfaceC36136Ti5, OY2, Bundle> {

        /* renamed from: g */
        public static final C6405a f28680g = new C6405a();

        public C6405a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Bundle invoke(InterfaceC36136Ti5 Saver, OY2 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m110226e0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/os/Bundle;", "it", "LOY2;", C17296a.f69688o, "(Landroid/os/Bundle;)LOY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: PY2$b */
    /* loaded from: classes.dex */
    public static final class C6406b extends Lambda implements Function1<Bundle, OY2> {

        /* renamed from: g */
        public final /* synthetic */ Context f28681g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6406b(Context context) {
            super(1);
            this.f28681g = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final OY2 invoke(Bundle it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OY2 m90124c = PY2.m90124c(this.f28681g);
            m90124c.m110230c0(it);
            return m90124c;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: PY2$c */
    /* loaded from: classes.dex */
    public static final class C6407c extends Lambda implements Function0<OY2> {

        /* renamed from: g */
        public final /* synthetic */ Context f28682g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6407c(Context context) {
            super(0);
            this.f28682g = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OY2 invoke() {
            return PY2.m90124c(this.f28682g);
        }
    }

    /* renamed from: a */
    public static final InterfaceC35668Ri5<OY2, ?> m90126a(Context context) {
        return C35902Si5.m85006a(C6405a.f28680g, new C6406b(context));
    }

    /* renamed from: c */
    public static final OY2 m90124c(Context context) {
        OY2 oy2 = new OY2(context);
        oy2.m110257E().m35384b(new C53061zt0());
        oy2.m110257E().m35384b(new C51382x31());
        return oy2;
    }

    /* renamed from: d */
    public static final InterfaceC48627sP5<AY2> m90123d(DY2 dy2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(dy2, "<this>");
        interfaceC32720Et0.mo89638F(-120375203);
        InterfaceC48627sP5<AY2> m105206a = GM5.m105206a(dy2.m110201z(), null, null, interfaceC32720Et0, 56, 2);
        interfaceC32720Et0.mo89605Q();
        return m105206a;
    }

    /* renamed from: e */
    public static final OY2 m90122e(AbstractC39507d13<? extends HY2>[] navigators, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(navigators, "navigators");
        interfaceC32720Et0.mo89638F(-312215566);
        Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
        OY2 oy2 = (OY2) C35550Qv4.m87571b(Arrays.copyOf(navigators, navigators.length), m90126a(context), null, new C6407c(context), interfaceC32720Et0, 72, 4);
        for (AbstractC39507d13<? extends HY2> abstractC39507d13 : navigators) {
            oy2.m110257E().m35384b(abstractC39507d13);
        }
        interfaceC32720Et0.mo89605Q();
        return oy2;
    }
}
