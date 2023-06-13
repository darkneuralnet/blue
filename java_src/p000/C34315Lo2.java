package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"LGn2;", TransferTable.COLUMN_STATE, "", "reverseScrolling", "Ldo2;", C17296a.f69688o, "(LGn2;ZLEt0;I)Ldo2;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n50#2:53\n49#2:54\n1114#3,6:55\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:53\n32#1:54\n32#1:55,6\n*E\n"})
/* renamed from: Lo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34315Lo2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Lo2$a */
    /* loaded from: classes.dex */
    public static final class C5090a implements InterfaceC39969do2 {

        /* renamed from: a */
        public final /* synthetic */ C33136Gn2 f22083a;

        public C5090a(C33136Gn2 c33136Gn2) {
            this.f22083a = c33136Gn2;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: a */
        public boolean mo42540a() {
            return this.f22083a.mo11049a();
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: b */
        public Object mo42539b(int i, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object m104755C = C33136Gn2.m104755C(this.f22083a, i, 0, continuation, 2, null);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return m104755C == coroutine_suspended ? m104755C : Unit.INSTANCE;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: c */
        public float mo42538c() {
            return this.f22083a.m104738m() + (this.f22083a.m104737n() / 100000.0f);
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: d */
        public Object mo42537d(float f, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object m82952b = C36199Tp5.m82952b(this.f22083a, f, null, continuation, 2, null);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return m82952b == coroutine_suspended ? m82952b : Unit.INSTANCE;
        }

        @Override // p000.InterfaceC39969do2
        /* renamed from: e */
        public C40540em0 mo42536e() {
            return new C40540em0(-1, -1);
        }
    }

    /* renamed from: a */
    public static final InterfaceC39969do2 m96331a(C33136Gn2 state, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        interfaceC32720Et0.mo89638F(-1247008005);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:27)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(state);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C5090a(state);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C5090a c5090a = (C5090a) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c5090a;
    }
}
