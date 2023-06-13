package p000;

import android.content.Context;
import android.os.Build;
import androidx.compose.p003ui.layout.C11336b;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"LDA3;", "b", "(LEt0;I)LDA3;", "LgV2;", C17296a.f69688o, "LgV2;", "StretchOverscrollNonClippingLayer", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1114#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"})
/* renamed from: fd */
/* loaded from: classes.dex */
public final class C20475fd {

    /* renamed from: a */
    public static final InterfaceC41563gV2 f80367a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;LvO2;J)LyO2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n*L\n563#1:590\n*E\n"})
    /* renamed from: fd$a */
    /* loaded from: classes.dex */
    public static final class C20476a extends Lambda implements Function3<InterfaceC52765zO2, InterfaceC50393vO2, C44228kz0, InterfaceC52172yO2> {

        /* renamed from: g */
        public static final C20476a f80368g = new C20476a();

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fd$a$a */
        /* loaded from: classes.dex */
        public static final class C20477a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OU3 f80369g;

            /* renamed from: h */
            public final /* synthetic */ int f80370h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20477a(OU3 ou3, int i) {
                super(1);
                this.f80369g = ou3;
                this.f80370h = i;
            }

            /* renamed from: a */
            public final void m41100a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                OU3 ou3 = this.f80369g;
                OU3.AbstractC6015a.m92197z(layout, ou3, ((-this.f80370h) / 2) - ((ou3.m92226i1() - this.f80369g.mo91479g1()) / 2), ((-this.f80370h) / 2) - ((this.f80369g.m92229d1() - this.f80369g.mo91480e1()) / 2), 0.0f, null, 12, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m41100a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C20476a() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC52172yO2 m41101a(InterfaceC52765zO2 layout, InterfaceC50393vO2 measurable, long j) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            OU3 mo8763P0 = measurable.mo8763P0(j);
            int mo3416F0 = layout.mo3416F0(C43705k61.m29303g(C35915Sk0.m84931b() * 2));
            return InterfaceC52765zO2.m1430Y(layout, mo8763P0.mo91479g1() - mo3416F0, mo8763P0.mo91480e1() - mo3416F0, null, new C20477a(mo8763P0, mo3416F0), 4, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC52765zO2 interfaceC52765zO2, InterfaceC50393vO2 interfaceC50393vO2, C44228kz0 c44228kz0) {
            return m41101a(interfaceC52765zO2, interfaceC50393vO2, c44228kz0.m28058s());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;LvO2;J)LyO2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2\n*L\n579#1:590\n*E\n"})
    /* renamed from: fd$b */
    /* loaded from: classes.dex */
    public static final class C20478b extends Lambda implements Function3<InterfaceC52765zO2, InterfaceC50393vO2, C44228kz0, InterfaceC52172yO2> {

        /* renamed from: g */
        public static final C20478b f80371g = new C20478b();

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: fd$b$a */
        /* loaded from: classes.dex */
        public static final class C20479a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OU3 f80372g;

            /* renamed from: h */
            public final /* synthetic */ int f80373h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20479a(OU3 ou3, int i) {
                super(1);
                this.f80372g = ou3;
                this.f80373h = i;
            }

            /* renamed from: a */
            public final void m41098a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                OU3 ou3 = this.f80372g;
                int i = this.f80373h;
                OU3.AbstractC6015a.m92209n(layout, ou3, i / 2, i / 2, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m41098a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C20478b() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC52172yO2 m41099a(InterfaceC52765zO2 layout, InterfaceC50393vO2 measurable, long j) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            OU3 mo8763P0 = measurable.mo8763P0(j);
            int mo3416F0 = layout.mo3416F0(C43705k61.m29303g(C35915Sk0.m84931b() * 2));
            return InterfaceC52765zO2.m1430Y(layout, mo8763P0.m92226i1() + mo3416F0, mo8763P0.m92229d1() + mo3416F0, null, new C20479a(mo8763P0, mo3416F0), 4, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC52172yO2 invoke(InterfaceC52765zO2 interfaceC52765zO2, InterfaceC50393vO2 interfaceC50393vO2, C44228kz0 c44228kz0) {
            return m41099a(interfaceC52765zO2, interfaceC50393vO2, c44228kz0.m28058s());
        }
    }

    static {
        InterfaceC41563gV2 interfaceC41563gV2;
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC41563gV2 = C11336b.m68613a(C11336b.m68613a(InterfaceC41563gV2.f82354b0, C20476a.f80368g), C20478b.f80371g);
        } else {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        f80367a = interfaceC41563gV2;
    }

    /* renamed from: b */
    public static final DA3 m41102b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        DA3 da3;
        interfaceC32720Et0.mo89638F(-81138291);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-81138291, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
        BA3 ba3 = (BA3) interfaceC32720Et0.mo89572c(CA3.m112678a());
        if (ba3 != null) {
            interfaceC32720Et0.mo89638F(511388516);
            boolean mo89539n = interfaceC32720Et0.mo89539n(context) | interfaceC32720Et0.mo89539n(ba3);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C1906Ec(context, ba3);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            da3 = (DA3) mo89635G;
        } else {
            da3 = C50841w83.f115405a;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return da3;
    }
}
