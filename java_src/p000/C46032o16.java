package p000;

import android.view.KeyEvent;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¨\u0006\u0012"}, m28432d2 = {"LgV2;", "LC16;", TransferTable.COLUMN_STATE, "Lx16;", "manager", "LF16;", "value", "Lkotlin/Function1;", "", "onValueChange", "", "editable", "singleLine", "LHe3;", "offsetMapping", "LId6;", "undoManager", C17296a.f69688o, "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: o16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46032o16 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LgV2;", C17296a.f69688o, "(LgV2;LEt0;I)LgV2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,260:1\n25#2:261\n25#2:268\n1114#3,6:262\n1114#3,6:269\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n244#1:261\n245#1:268\n244#1:262,6\n245#1:269,6\n*E\n"})
    /* renamed from: o16$a */
    /* loaded from: classes.dex */
    public static final class C26787a extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, InterfaceC41563gV2> {

        /* renamed from: g */
        public final /* synthetic */ C16 f101224g;

        /* renamed from: h */
        public final /* synthetic */ C51367x16 f101225h;

        /* renamed from: i */
        public final /* synthetic */ F16 f101226i;

        /* renamed from: j */
        public final /* synthetic */ boolean f101227j;

        /* renamed from: k */
        public final /* synthetic */ boolean f101228k;

        /* renamed from: l */
        public final /* synthetic */ InterfaceC33290He3 f101229l;

        /* renamed from: m */
        public final /* synthetic */ C33518Id6 f101230m;

        /* renamed from: n */
        public final /* synthetic */ Function1<F16, Unit> f101231n;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: o16$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C26788a extends FunctionReferenceImpl implements Function1<C42894ik2, Boolean> {
            public C26788a(Object obj) {
                super(1, obj, C45439n16.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            /* renamed from: a */
            public final Boolean m21976a(KeyEvent p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((C45439n16) this.receiver).m24561j(p0));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(C42894ik2 c42894ik2) {
                return m21976a(c42894ik2.m33518f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C26787a(C16 c16, C51367x16 c51367x16, F16 f16, boolean z, boolean z2, InterfaceC33290He3 interfaceC33290He3, C33518Id6 c33518Id6, Function1<? super F16, Unit> function1) {
            super(3);
            this.f101224g = c16;
            this.f101225h = c51367x16;
            this.f101226i = f16;
            this.f101227j = z;
            this.f101228k = z2;
            this.f101229l = interfaceC33290He3;
            this.f101230m = c33518Id6;
            this.f101231n = function1;
        }

        /* renamed from: a */
        public final InterfaceC41563gV2 m21977a(InterfaceC41563gV2 composed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            interfaceC32720Et0.mo89638F(58482146);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(58482146, i, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)");
            }
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = new C47821r26();
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            C47821r26 c47821r26 = (C47821r26) mo89635G;
            interfaceC32720Et0.mo89638F(-492369756);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new C49844uT0();
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            InterfaceC41563gV2 m17173a = C47638qk2.m17173a(InterfaceC41563gV2.f82354b0, new C26788a(new C45439n16(this.f101224g, this.f101225h, this.f101226i, this.f101227j, this.f101228k, c47821r26, this.f101229l, this.f101230m, (C49844uT0) mo89635G2, null, this.f101231n, 512, null)));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return m17173a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ InterfaceC41563gV2 invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            return m21977a(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m21978a(InterfaceC41563gV2 interfaceC41563gV2, C16 state, C51367x16 manager, F16 value, Function1<? super F16, Unit> onValueChange, boolean z, boolean z2, InterfaceC33290He3 offsetMapping, C33518Id6 undoManager) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(undoManager, "undoManager");
        return C32486Dt0.m109807b(interfaceC41563gV2, null, new C26787a(state, manager, value, z, z2, offsetMapping, undoManager, onValueChange), 1, null);
    }
}
