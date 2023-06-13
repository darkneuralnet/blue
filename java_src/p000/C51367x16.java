package p000;

import androidx.compose.p003ui.focus.C11309h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C32120Ce3;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000104¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J%\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\rH\u0000¢\u0006\u0004\b)\u0010\u001eJ \u0010*\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J \u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020,H\u0000ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\rH\u0000¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\rH\u0000¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\tH\u0000¢\u0006\u0004\b2\u00103R\u0019\u00109\u001a\u0004\u0018\u0001048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010h\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010p\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR.\u0010\u0083\u0001\u001a\u00020\t2\u0006\u0010R\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0004\b%\u0010T\u001a\u0005\b\u0081\u0001\u00103\"\u0005\b\u0082\u0001\u0010&R!\u0010\u0085\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0007\n\u0005\b\u0084\u0001\u00101R\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0086\u0001R \u0010\u0088\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u00101R6\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010R\u001a\u0005\u0018\u00010\u0089\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b(\u0010T\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R<\u0010\u0092\u0001\u001a\u0004\u0018\u00010 2\b\u0010R\u001a\u0004\u0018\u00010 8F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0015\n\u0004\b\"\u0010T\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010#R\u0019\u0010\u0095\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010\u0098\u0001\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010\u001cR\u001f\u0010\u009d\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u001f\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 \u0001"}, m28432d2 = {"Lx16;", "", "LOs4;", "t", "LF16;", "value", "", "transformedStartOffset", "transformedEndOffset", "", "isStartHandle", "LPr5;", "adjustment", "", "b0", "LME1;", "handleState", "S", "LDf;", "annotatedString", "Ls26;", BaseSheetViewModel.SAVE_SELECTION, "m", "(LDf;J)LF16;", "LZ06;", "I", "(Z)LZ06;", "n", "()LZ06;", "r", "()V", "s", "LCe3;", "position", "p", "(LCe3;)V", "cancelSelection", "k", "(Z)V", "L", "o", "M", "z", "(Z)J", "Lg01;", "density", "v", "(Lg01;)J", "a0", "J", "K", "()Z", "LId6;", C17296a.f69688o, "LId6;", "getUndoManager", "()LId6;", "undoManager", "LHe3;", "b", "LHe3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()LHe3;", "U", "(LHe3;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "D", "()Lkotlin/jvm/functions/Function1;", "V", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "LC16;", DateTokenConverter.CONVERTER_KEY, "LC16;", "E", "()LC16;", "W", "(LC16;)V", TransferTable.COLUMN_STATE, "<set-?>", "e", "LEX2;", "H", "()LF16;", "Y", "(LF16;)V", "LEu6;", "f", "LEu6;", "getVisualTransformation$foundation_release", "()LEu6;", "Z", "(LEu6;)V", "visualTransformation", "LUk0;", "g", "LUk0;", "getClipboardManager$foundation_release", "()LUk0;", "N", "(LUk0;)V", "clipboardManager", "LI26;", "h", "LI26;", "F", "()LI26;", "X", "(LI26;)V", "textToolbar", "LWE1;", "i", "LWE1;", "A", "()LWE1;", "T", "(LWE1;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/h;", "j", "Landroidx/compose/ui/focus/h;", "y", "()Landroidx/compose/ui/focus/h;", "R", "(Landroidx/compose/ui/focus/h;)V", "focusRequester", "x", "Q", "editable", "l", "dragBeginPosition", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "LHE1;", "w", "()LHE1;", "P", "(LHE1;)V", "draggingHandle", "u", "()LCe3;", "O", "currentDragPosition", "q", "LF16;", "oldValue", "LZ06;", "G", "touchSelectionObserver", "LgW2;", "LgW2;", "B", "()LgW2;", "mouseSelectionObserver", "<init>", "(LId6;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n76#2:907\n102#2,2:908\n76#2:910\n102#2,2:911\n76#2:913\n102#2,2:914\n76#2:916\n102#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
/* renamed from: x16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51367x16 {

    /* renamed from: a */
    public final C33518Id6 f116982a;

    /* renamed from: b */
    public InterfaceC33290He3 f116983b;

    /* renamed from: c */
    public Function1<? super F16, Unit> f116984c;

    /* renamed from: d */
    public C16 f116985d;

    /* renamed from: e */
    public final EX2 f116986e;

    /* renamed from: f */
    public InterfaceC32735Eu6 f116987f;

    /* renamed from: g */
    public InterfaceC36383Uk0 f116988g;

    /* renamed from: h */
    public I26 f116989h;

    /* renamed from: i */
    public WE1 f116990i;

    /* renamed from: j */
    public C11309h f116991j;

    /* renamed from: k */
    public final EX2 f116992k;

    /* renamed from: l */
    public long f116993l;

    /* renamed from: m */
    public Integer f116994m;

    /* renamed from: n */
    public long f116995n;

    /* renamed from: o */
    public final EX2 f116996o;

    /* renamed from: p */
    public final EX2 f116997p;

    /* renamed from: q */
    public F16 f116998q;

    /* renamed from: r */
    public final Z06 f116999r;

    /* renamed from: s */
    public final InterfaceC41572gW2 f117000s;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"x16$a", "LZ06;", "LCe3;", "point", "", "b", "(J)V", "e", "startPoint", DateTokenConverter.CONVERTER_KEY, "delta", "c", "onStop", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x16$a */
    /* loaded from: classes.dex */
    public static final class C30018a implements Z06 {
        public C30018a() {
        }

        @Override // p000.Z06
        /* renamed from: a */
        public void mo5922a() {
        }

        @Override // p000.Z06
        /* renamed from: b */
        public void mo5921b(long j) {
            C51367x16.this.m5965P(HE1.Cursor);
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.m5966O(C32120Ce3.m111955d(C35983Sr5.m84739a(c51367x16.m5927z(true))));
        }

        @Override // p000.Z06
        /* renamed from: c */
        public void mo5920c(long j) {
            C43077j26 m112989g;
            C42484i26 m31225i;
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.f116995n = C32120Ce3.m111939t(c51367x16.f116995n, j);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null && (m31225i = m112989g.m31225i()) != null) {
                C51367x16 c51367x162 = C51367x16.this;
                c51367x162.m5966O(C32120Ce3.m111955d(C32120Ce3.m111939t(c51367x162.f116993l, c51367x162.f116995n)));
                InterfaceC33290He3 m5978C = c51367x162.m5978C();
                C32120Ce3 m5932u = c51367x162.m5932u();
                Intrinsics.checkNotNull(m5932u);
                int transformedToOriginal = m5978C.transformedToOriginal(m31225i.m34585w(m5932u.m111935x()));
                long m13200b = C49006t26.m13200b(transformedToOriginal, transformedToOriginal);
                if (C48413s26.m14839g(m13200b, c51367x162.m5973H().m108103g())) {
                    return;
                }
                WE1 m5980A = c51367x162.m5980A();
                if (m5980A != null) {
                    m5980A.mo3442a(XE1.f42907a.m77169b());
                }
                c51367x162.m5977D().invoke(c51367x162.m5940m(c51367x162.m5973H().m108105e(), m13200b));
            }
        }

        @Override // p000.Z06
        /* renamed from: d */
        public void mo5919d(long j) {
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.f116993l = C35983Sr5.m84739a(c51367x16.m5927z(true));
            C51367x16 c51367x162 = C51367x16.this;
            c51367x162.m5966O(C32120Ce3.m111955d(c51367x162.f116993l));
            C51367x16.this.f116995n = C32120Ce3.f4427b.m111932c();
            C51367x16.this.m5965P(HE1.Cursor);
        }

        @Override // p000.Z06
        /* renamed from: e */
        public void mo5918e() {
            C51367x16.this.m5965P(null);
            C51367x16.this.m5966O(null);
        }

        @Override // p000.Z06
        public void onStop() {
            C51367x16.this.m5965P(null);
            C51367x16.this.m5966O(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"x16$b", "LZ06;", "LCe3;", "point", "", "b", "(J)V", "e", "startPoint", DateTokenConverter.CONVERTER_KEY, "delta", "c", "onStop", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x16$b */
    /* loaded from: classes.dex */
    public static final class C30019b implements Z06 {

        /* renamed from: b */
        public final /* synthetic */ boolean f117003b;

        public C30019b(boolean z) {
            this.f117003b = z;
        }

        @Override // p000.Z06
        /* renamed from: a */
        public void mo5922a() {
        }

        @Override // p000.Z06
        /* renamed from: b */
        public void mo5921b(long j) {
            HE1 he1;
            C51367x16 c51367x16 = C51367x16.this;
            if (this.f117003b) {
                he1 = HE1.SelectionStart;
            } else {
                he1 = HE1.SelectionEnd;
            }
            c51367x16.m5965P(he1);
            C51367x16 c51367x162 = C51367x16.this;
            c51367x162.m5966O(C32120Ce3.m111955d(C35983Sr5.m84739a(c51367x162.m5927z(this.f117003b))));
        }

        @Override // p000.Z06
        /* renamed from: c */
        public void mo5920c(long j) {
            C43077j26 m112989g;
            C42484i26 m31225i;
            int originalToTransformed;
            int m34585w;
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.f116995n = C32120Ce3.m111939t(c51367x16.f116995n, j);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null && (m31225i = m112989g.m31225i()) != null) {
                C51367x16 c51367x162 = C51367x16.this;
                boolean z = this.f117003b;
                c51367x162.m5966O(C32120Ce3.m111955d(C32120Ce3.m111939t(c51367x162.f116993l, c51367x162.f116995n)));
                if (z) {
                    C32120Ce3 m5932u = c51367x162.m5932u();
                    Intrinsics.checkNotNull(m5932u);
                    originalToTransformed = m31225i.m34585w(m5932u.m111935x());
                } else {
                    originalToTransformed = c51367x162.m5978C().originalToTransformed(C48413s26.m14832n(c51367x162.m5973H().m108103g()));
                }
                int i = originalToTransformed;
                if (z) {
                    m34585w = c51367x162.m5978C().originalToTransformed(C48413s26.m14837i(c51367x162.m5973H().m108103g()));
                } else {
                    C32120Ce3 m5932u2 = c51367x162.m5932u();
                    Intrinsics.checkNotNull(m5932u2);
                    m34585w = m31225i.m34585w(m5932u2.m111935x());
                }
                c51367x162.m5951b0(c51367x162.m5973H(), i, m34585w, z, InterfaceC35281Pr5.f29167a.m89693c());
            }
            C16 m5976E2 = C51367x16.this.m5976E();
            if (m5976E2 != null) {
                m5976E2.m112999B(false);
            }
        }

        @Override // p000.Z06
        /* renamed from: d */
        public void mo5919d(long j) {
            HE1 he1;
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.f116993l = C35983Sr5.m84739a(c51367x16.m5927z(this.f117003b));
            C51367x16 c51367x162 = C51367x16.this;
            c51367x162.m5966O(C32120Ce3.m111955d(c51367x162.f116993l));
            C51367x16.this.f116995n = C32120Ce3.f4427b.m111932c();
            C51367x16 c51367x163 = C51367x16.this;
            if (this.f117003b) {
                he1 = HE1.SelectionStart;
            } else {
                he1 = HE1.SelectionEnd;
            }
            c51367x163.m5965P(he1);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null) {
                m5976E.m112999B(false);
            }
        }

        @Override // p000.Z06
        /* renamed from: e */
        public void mo5918e() {
            C51367x16.this.m5965P(null);
            C51367x16.this.m5966O(null);
        }

        @Override // p000.Z06
        public void onStop() {
            K26 k26 = null;
            C51367x16.this.m5965P(null);
            C51367x16.this.m5966O(null);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null) {
                m5976E.m112999B(true);
            }
            I26 m5975F = C51367x16.this.m5975F();
            if (m5975F != null) {
                k26 = m5975F.getStatus();
            }
            if (k26 == K26.Hidden) {
                C51367x16.this.m5953a0();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"x16$c", "LgW2;", "LCe3;", "downPosition", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "dragPosition", "c", "LPr5;", "adjustment", C17296a.f69688o, "(JLPr5;)Z", "b", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x16$c */
    /* loaded from: classes.dex */
    public static final class C30020c implements InterfaceC41572gW2 {
        public C30020c() {
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: a */
        public boolean mo5926a(long j, InterfaceC35281Pr5 adjustment) {
            C43077j26 m112989g;
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
            C11309h m5928y = C51367x16.this.m5928y();
            if (m5928y != null) {
                m5928y.m68779e();
            }
            C51367x16.this.f116993l = j;
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null) {
                C51367x16 c51367x16 = C51367x16.this;
                c51367x16.f116994m = Integer.valueOf(C43077j26.m31226h(m112989g, j, false, 2, null));
                int m31226h = C43077j26.m31226h(m112989g, c51367x16.f116993l, false, 2, null);
                c51367x16.m5951b0(c51367x16.m5973H(), m31226h, m31226h, false, adjustment);
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: b */
        public boolean mo5925b(long j, InterfaceC35281Pr5 adjustment) {
            boolean z;
            C16 m5976E;
            C43077j26 m112989g;
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
            if (C51367x16.this.m5973H().m108102h().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (m5976E = C51367x16.this.m5976E()) == null || (m112989g = m5976E.m112989g()) == null) {
                return false;
            }
            C51367x16 c51367x16 = C51367x16.this;
            int m31227g = m112989g.m31227g(j, false);
            F16 m5973H = c51367x16.m5973H();
            Integer num = c51367x16.f116994m;
            Intrinsics.checkNotNull(num);
            c51367x16.m5951b0(m5973H, num.intValue(), m31227g, false, adjustment);
            return true;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: c */
        public boolean mo5924c(long j) {
            boolean z;
            C16 m5976E;
            C43077j26 m112989g;
            if (C51367x16.this.m5973H().m108102h().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || (m5976E = C51367x16.this.m5976E()) == null || (m112989g = m5976E.m112989g()) == null) {
                return false;
            }
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.m5951b0(c51367x16.m5973H(), c51367x16.m5978C().originalToTransformed(C48413s26.m14832n(c51367x16.m5973H().m108103g())), m112989g.m31227g(j, false), false, InterfaceC35281Pr5.f29167a.m89691e());
            return true;
        }

        @Override // p000.InterfaceC41572gW2
        /* renamed from: d */
        public boolean mo5923d(long j) {
            C43077j26 m112989g;
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null) {
                C51367x16 c51367x16 = C51367x16.this;
                c51367x16.m5951b0(c51367x16.m5973H(), c51367x16.m5978C().originalToTransformed(C48413s26.m14832n(c51367x16.m5973H().m108103g())), C43077j26.m31226h(m112989g, j, false, 2, null), false, InterfaceC35281Pr5.f29167a.m89691e());
                return true;
            }
            return false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LF16;", "it", "", "invoke", "(LF16;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: x16$d */
    /* loaded from: classes.dex */
    public static final class C30021d extends Lambda implements Function1<F16, Unit> {

        /* renamed from: g */
        public static final C30021d f117005g = new C30021d();

        public C30021d() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(F16 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
            invoke2(f16);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x16$e */
    /* loaded from: classes.dex */
    public static final class C30022e extends Lambda implements Function0<Unit> {
        public C30022e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C51367x16.m5941l(C51367x16.this, false, 1, null);
            C51367x16.this.m5971J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x16$f */
    /* loaded from: classes.dex */
    public static final class C30023f extends Lambda implements Function0<Unit> {
        public C30023f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C51367x16.this.m5938o();
            C51367x16.this.m5971J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x16$g */
    /* loaded from: classes.dex */
    public static final class C30024g extends Lambda implements Function0<Unit> {
        public C30024g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C51367x16.this.m5969L();
            C51367x16.this.m5971J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: x16$h */
    /* loaded from: classes.dex */
    public static final class C30025h extends Lambda implements Function0<Unit> {
        public C30025h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C51367x16.this.m5968M();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"x16$i", "LZ06;", "LCe3;", "point", "", "b", "(J)V", "e", "startPoint", DateTokenConverter.CONVERTER_KEY, "delta", "c", "onStop", C17296a.f69688o, "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x16$i */
    /* loaded from: classes.dex */
    public static final class C30026i implements Z06 {
        public C30026i() {
        }

        @Override // p000.Z06
        /* renamed from: a */
        public void mo5922a() {
        }

        @Override // p000.Z06
        /* renamed from: b */
        public void mo5921b(long j) {
        }

        @Override // p000.Z06
        /* renamed from: c */
        public void mo5920c(long j) {
            boolean z;
            C43077j26 m112989g;
            int m31227g;
            if (C51367x16.this.m5973H().m108102h().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            C51367x16 c51367x16 = C51367x16.this;
            c51367x16.f116995n = C32120Ce3.m111939t(c51367x16.f116995n, j);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null && (m112989g = m5976E.m112989g()) != null) {
                C51367x16 c51367x162 = C51367x16.this;
                c51367x162.m5966O(C32120Ce3.m111955d(C32120Ce3.m111939t(c51367x162.f116993l, c51367x162.f116995n)));
                Integer num = c51367x162.f116994m;
                if (num != null) {
                    m31227g = num.intValue();
                } else {
                    m31227g = m112989g.m31227g(c51367x162.f116993l, false);
                }
                int i = m31227g;
                C32120Ce3 m5932u = c51367x162.m5932u();
                Intrinsics.checkNotNull(m5932u);
                c51367x162.m5951b0(c51367x162.m5973H(), i, m112989g.m31227g(m5932u.m111935x(), false), false, InterfaceC35281Pr5.f29167a.m89689g());
            }
            C16 m5976E2 = C51367x16.this.m5976E();
            if (m5976E2 != null) {
                m5976E2.m112999B(false);
            }
        }

        @Override // p000.Z06
        /* renamed from: d */
        public void mo5919d(long j) {
            boolean z;
            C43077j26 m112989g;
            C16 m5976E;
            C43077j26 m112989g2;
            C43077j26 m112989g3;
            if (C51367x16.this.m5930w() != null) {
                return;
            }
            C51367x16.this.m5965P(HE1.SelectionEnd);
            C51367x16.this.m5971J();
            C16 m5976E2 = C51367x16.this.m5976E();
            boolean z2 = true;
            if (m5976E2 != null && (m112989g3 = m5976E2.m112989g()) != null && m112989g3.m31224j(j)) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (m5976E = C51367x16.this.m5976E()) != null && (m112989g2 = m5976E.m112989g()) != null) {
                C51367x16 c51367x16 = C51367x16.this;
                int transformedToOriginal = c51367x16.m5978C().transformedToOriginal(C43077j26.m31229e(m112989g2, m112989g2.m31228f(C32120Ce3.m111943p(j)), false, 2, null));
                WE1 m5980A = c51367x16.m5980A();
                if (m5980A != null) {
                    m5980A.mo3442a(XE1.f42907a.m77169b());
                }
                F16 m5940m = c51367x16.m5940m(c51367x16.m5973H().m108105e(), C49006t26.m13200b(transformedToOriginal, transformedToOriginal));
                c51367x16.m5935r();
                c51367x16.m5977D().invoke(m5940m);
                return;
            }
            if (C51367x16.this.m5973H().m108102h().length() != 0) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            C51367x16.this.m5935r();
            C16 m5976E3 = C51367x16.this.m5976E();
            if (m5976E3 != null && (m112989g = m5976E3.m112989g()) != null) {
                C51367x16 c51367x162 = C51367x16.this;
                int m31226h = C43077j26.m31226h(m112989g, j, false, 2, null);
                c51367x162.m5951b0(c51367x162.m5973H(), m31226h, m31226h, false, InterfaceC35281Pr5.f29167a.m89689g());
                c51367x162.f116994m = Integer.valueOf(m31226h);
            }
            C51367x16.this.f116993l = j;
            C51367x16 c51367x163 = C51367x16.this;
            c51367x163.m5966O(C32120Ce3.m111955d(c51367x163.f116993l));
            C51367x16.this.f116995n = C32120Ce3.f4427b.m111932c();
        }

        @Override // p000.Z06
        /* renamed from: e */
        public void mo5918e() {
        }

        @Override // p000.Z06
        public void onStop() {
            K26 k26;
            C51367x16.this.m5965P(null);
            C51367x16.this.m5966O(null);
            C16 m5976E = C51367x16.this.m5976E();
            if (m5976E != null) {
                m5976E.m112999B(true);
            }
            I26 m5975F = C51367x16.this.m5975F();
            if (m5975F != null) {
                k26 = m5975F.getStatus();
            } else {
                k26 = null;
            }
            if (k26 == K26.Hidden) {
                C51367x16.this.m5953a0();
            }
            C51367x16.this.f116994m = null;
        }
    }

    public C51367x16() {
        this(null, 1, null);
    }

    /* renamed from: l */
    public static /* synthetic */ void m5941l(C51367x16 c51367x16, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c51367x16.m5942k(z);
    }

    /* renamed from: q */
    public static /* synthetic */ void m5936q(C51367x16 c51367x16, C32120Ce3 c32120Ce3, int i, Object obj) {
        if ((i & 1) != 0) {
            c32120Ce3 = null;
        }
        c51367x16.m5937p(c32120Ce3);
    }

    /* renamed from: A */
    public final WE1 m5980A() {
        return this.f116990i;
    }

    /* renamed from: B */
    public final InterfaceC41572gW2 m5979B() {
        return this.f117000s;
    }

    /* renamed from: C */
    public final InterfaceC33290He3 m5978C() {
        return this.f116983b;
    }

    /* renamed from: D */
    public final Function1<F16, Unit> m5977D() {
        return this.f116984c;
    }

    /* renamed from: E */
    public final C16 m5976E() {
        return this.f116985d;
    }

    /* renamed from: F */
    public final I26 m5975F() {
        return this.f116989h;
    }

    /* renamed from: G */
    public final Z06 m5974G() {
        return this.f116999r;
    }

    /* renamed from: H */
    public final F16 m5973H() {
        return (F16) this.f116986e.getValue();
    }

    /* renamed from: I */
    public final Z06 m5972I(boolean z) {
        return new C30019b(z);
    }

    /* renamed from: J */
    public final void m5971J() {
        K26 k26;
        I26 i26;
        I26 i262 = this.f116989h;
        if (i262 != null) {
            k26 = i262.getStatus();
        } else {
            k26 = null;
        }
        if (k26 == K26.Shown && (i26 = this.f116989h) != null) {
            i26.mo83266b();
        }
    }

    /* renamed from: K */
    public final boolean m5970K() {
        return !Intrinsics.areEqual(this.f116998q.m108102h(), m5973H().m108102h());
    }

    /* renamed from: L */
    public final void m5969L() {
        C1577Df mo44027a;
        InterfaceC36383Uk0 interfaceC36383Uk0 = this.f116988g;
        if (interfaceC36383Uk0 != null && (mo44027a = interfaceC36383Uk0.mo44027a()) != null) {
            C1577Df m110049m = G16.m105949c(m5973H(), m5973H().m108102h().length()).m110049m(mo44027a).m110049m(G16.m105950b(m5973H(), m5973H().m108102h().length()));
            int m14834l = C48413s26.m14834l(m5973H().m108103g()) + mo44027a.length();
            this.f116984c.invoke(m5940m(m110049m, C49006t26.m13200b(m14834l, m14834l)));
            m5962S(ME1.None);
            C33518Id6 c33518Id6 = this.f116982a;
            if (c33518Id6 != null) {
                c33518Id6.m101874a();
            }
        }
    }

    /* renamed from: M */
    public final void m5968M() {
        F16 m5940m = m5940m(m5973H().m108105e(), C49006t26.m13200b(0, m5973H().m108102h().length()));
        this.f116984c.invoke(m5940m);
        this.f116998q = F16.m108107c(this.f116998q, null, m5940m.m108103g(), null, 5, null);
        C16 c16 = this.f116985d;
        if (c16 != null) {
            c16.m112999B(true);
        }
    }

    /* renamed from: N */
    public final void m5967N(InterfaceC36383Uk0 interfaceC36383Uk0) {
        this.f116988g = interfaceC36383Uk0;
    }

    /* renamed from: O */
    public final void m5966O(C32120Ce3 c32120Ce3) {
        this.f116997p.setValue(c32120Ce3);
    }

    /* renamed from: P */
    public final void m5965P(HE1 he1) {
        this.f116996o.setValue(he1);
    }

    /* renamed from: Q */
    public final void m5964Q(boolean z) {
        this.f116992k.setValue(Boolean.valueOf(z));
    }

    /* renamed from: R */
    public final void m5963R(C11309h c11309h) {
        this.f116991j = c11309h;
    }

    /* renamed from: S */
    public final void m5962S(ME1 me1) {
        C16 c16 = this.f116985d;
        if (c16 != null) {
            c16.m112975u(me1);
        }
    }

    /* renamed from: T */
    public final void m5961T(WE1 we1) {
        this.f116990i = we1;
    }

    /* renamed from: U */
    public final void m5960U(InterfaceC33290He3 interfaceC33290He3) {
        Intrinsics.checkNotNullParameter(interfaceC33290He3, "<set-?>");
        this.f116983b = interfaceC33290He3;
    }

    /* renamed from: V */
    public final void m5959V(Function1<? super F16, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f116984c = function1;
    }

    /* renamed from: W */
    public final void m5958W(C16 c16) {
        this.f116985d = c16;
    }

    /* renamed from: X */
    public final void m5957X(I26 i26) {
        this.f116989h = i26;
    }

    /* renamed from: Y */
    public final void m5956Y(F16 f16) {
        Intrinsics.checkNotNullParameter(f16, "<set-?>");
        this.f116986e.setValue(f16);
    }

    /* renamed from: Z */
    public final void m5955Z(InterfaceC32735Eu6 interfaceC32735Eu6) {
        Intrinsics.checkNotNullParameter(interfaceC32735Eu6, "<set-?>");
        this.f116987f = interfaceC32735Eu6;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5953a0() {
        C30022e c30022e;
        C30023f c30023f;
        C30024g c30024g;
        I26 i26;
        boolean z = this.f116987f instanceof OI3;
        C30025h c30025h = null;
        if (!C48413s26.m14838h(m5973H().m108103g()) && !z) {
            c30022e = new C30022e();
        } else {
            c30022e = null;
        }
        if (!C48413s26.m14838h(m5973H().m108103g()) && m5929x() && !z) {
            c30023f = new C30023f();
        } else {
            c30023f = null;
        }
        if (m5929x()) {
            InterfaceC36383Uk0 interfaceC36383Uk0 = this.f116988g;
            boolean z2 = false;
            if (interfaceC36383Uk0 != null && interfaceC36383Uk0.mo44025c()) {
                z2 = true;
            }
            if (z2) {
                c30024g = new C30024g();
                if (C48413s26.m14836j(m5973H().m108103g()) != m5973H().m108102h().length()) {
                    c30025h = new C30025h();
                }
                C30025h c30025h2 = c30025h;
                i26 = this.f116989h;
                if (i26 == null) {
                    i26.mo83267a(m5933t(), c30022e, c30024g, c30023f, c30025h2);
                    return;
                }
                return;
            }
        }
        c30024g = null;
        if (C48413s26.m14836j(m5973H().m108103g()) != m5973H().m108102h().length()) {
        }
        C30025h c30025h22 = c30025h;
        i26 = this.f116989h;
        if (i26 == null) {
        }
    }

    /* renamed from: b0 */
    public final void m5951b0(F16 f16, int i, int i2, boolean z, InterfaceC35281Pr5 interfaceC35281Pr5) {
        C42484i26 c42484i26;
        C43077j26 m112989g;
        long m13200b = C49006t26.m13200b(this.f116983b.originalToTransformed(C48413s26.m14832n(f16.m108103g())), this.f116983b.originalToTransformed(C48413s26.m14837i(f16.m108103g())));
        C16 c16 = this.f116985d;
        C48413s26 c48413s26 = null;
        if (c16 != null && (m112989g = c16.m112989g()) != null) {
            c42484i26 = m112989g.m31225i();
        } else {
            c42484i26 = null;
        }
        if (!C48413s26.m14838h(m13200b)) {
            c48413s26 = C48413s26.m14844b(m13200b);
        }
        long m7552a = C50774w16.m7552a(c42484i26, i, i2, c48413s26, z, interfaceC35281Pr5);
        long m13200b2 = C49006t26.m13200b(this.f116983b.transformedToOriginal(C48413s26.m14832n(m7552a)), this.f116983b.transformedToOriginal(C48413s26.m14837i(m7552a)));
        if (C48413s26.m14839g(m13200b2, f16.m108103g())) {
            return;
        }
        WE1 we1 = this.f116990i;
        if (we1 != null) {
            we1.mo3442a(XE1.f42907a.m77169b());
        }
        this.f116984c.invoke(m5940m(f16.m108105e(), m13200b2));
        C16 c162 = this.f116985d;
        if (c162 != null) {
            c162.m112997D(C51960y16.m4233c(this, true));
        }
        C16 c163 = this.f116985d;
        if (c163 != null) {
            c163.m112998C(C51960y16.m4233c(this, false));
        }
    }

    /* renamed from: k */
    public final void m5942k(boolean z) {
        if (C48413s26.m14838h(m5973H().m108103g())) {
            return;
        }
        InterfaceC36383Uk0 interfaceC36383Uk0 = this.f116988g;
        if (interfaceC36383Uk0 != null) {
            interfaceC36383Uk0.mo44026b(G16.m105951a(m5973H()));
        }
        if (!z) {
            return;
        }
        int m14835k = C48413s26.m14835k(m5973H().m108103g());
        this.f116984c.invoke(m5940m(m5973H().m108105e(), C49006t26.m13200b(m14835k, m14835k)));
        m5962S(ME1.None);
    }

    /* renamed from: m */
    public final F16 m5940m(C1577Df c1577Df, long j) {
        return new F16(c1577Df, j, (C48413s26) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public final Z06 m5939n() {
        return new C30018a();
    }

    /* renamed from: o */
    public final void m5938o() {
        if (C48413s26.m14838h(m5973H().m108103g())) {
            return;
        }
        InterfaceC36383Uk0 interfaceC36383Uk0 = this.f116988g;
        if (interfaceC36383Uk0 != null) {
            interfaceC36383Uk0.mo44026b(G16.m105951a(m5973H()));
        }
        C1577Df m110049m = G16.m105949c(m5973H(), m5973H().m108102h().length()).m110049m(G16.m105950b(m5973H(), m5973H().m108102h().length()));
        int m14834l = C48413s26.m14834l(m5973H().m108103g());
        this.f116984c.invoke(m5940m(m110049m, C49006t26.m13200b(m14834l, m14834l)));
        m5962S(ME1.None);
        C33518Id6 c33518Id6 = this.f116982a;
        if (c33518Id6 != null) {
            c33518Id6.m101874a();
        }
    }

    /* renamed from: p */
    public final void m5937p(C32120Ce3 c32120Ce3) {
        ME1 me1;
        boolean z;
        C43077j26 c43077j26;
        int m14835k;
        if (!C48413s26.m14838h(m5973H().m108103g())) {
            C16 c16 = this.f116985d;
            if (c16 != null) {
                c43077j26 = c16.m112989g();
            } else {
                c43077j26 = null;
            }
            C43077j26 c43077j262 = c43077j26;
            if (c32120Ce3 != null && c43077j262 != null) {
                m14835k = this.f116983b.transformedToOriginal(C43077j26.m31226h(c43077j262, c32120Ce3.m111935x(), false, 2, null));
            } else {
                m14835k = C48413s26.m14835k(m5973H().m108103g());
            }
            this.f116984c.invoke(F16.m108107c(m5973H(), null, C49006t26.m13201a(m14835k), null, 5, null));
        }
        if (c32120Ce3 != null) {
            if (m5973H().m108102h().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                me1 = ME1.Cursor;
                m5962S(me1);
                m5971J();
            }
        }
        me1 = ME1.None;
        m5962S(me1);
        m5971J();
    }

    /* renamed from: r */
    public final void m5935r() {
        C11309h c11309h;
        C16 c16 = this.f116985d;
        boolean z = false;
        if (c16 != null && !c16.m112992d()) {
            z = true;
        }
        if (z && (c11309h = this.f116991j) != null) {
            c11309h.m68779e();
        }
        this.f116998q = m5973H();
        C16 c162 = this.f116985d;
        if (c162 != null) {
            c162.m112999B(true);
        }
        m5962S(ME1.Selection);
    }

    /* renamed from: s */
    public final void m5934s() {
        C16 c16 = this.f116985d;
        if (c16 != null) {
            c16.m112999B(false);
        }
        m5962S(ME1.None);
    }

    /* renamed from: t */
    public final C35055Os4 m5933t() {
        long m111932c;
        long m111932c2;
        float f;
        InterfaceC45879nm2 m112990f;
        float f2;
        C42484i26 m31225i;
        C35055Os4 m34604d;
        InterfaceC45879nm2 m112990f2;
        float f3;
        C42484i26 m31225i2;
        C35055Os4 m34604d2;
        InterfaceC45879nm2 m112990f3;
        InterfaceC45879nm2 m112990f4;
        C16 c16 = this.f116985d;
        if (c16 != null) {
            if (!(!c16.m112976t())) {
                c16 = null;
            }
            if (c16 != null) {
                int originalToTransformed = this.f116983b.originalToTransformed(C48413s26.m14832n(m5973H().m108103g()));
                int originalToTransformed2 = this.f116983b.originalToTransformed(C48413s26.m14837i(m5973H().m108103g()));
                C16 c162 = this.f116985d;
                if (c162 != null && (m112990f4 = c162.m112990f()) != null) {
                    m111932c = m112990f4.mo23181y(m5927z(true));
                } else {
                    m111932c = C32120Ce3.f4427b.m111932c();
                }
                C16 c163 = this.f116985d;
                if (c163 != null && (m112990f3 = c163.m112990f()) != null) {
                    m111932c2 = m112990f3.mo23181y(m5927z(false));
                } else {
                    m111932c2 = C32120Ce3.f4427b.m111932c();
                }
                C16 c164 = this.f116985d;
                float f4 = 0.0f;
                if (c164 != null && (m112990f2 = c164.m112990f()) != null) {
                    C43077j26 m112989g = c16.m112989g();
                    if (m112989g != null && (m31225i2 = m112989g.m31225i()) != null && (m34604d2 = m31225i2.m34604d(originalToTransformed)) != null) {
                        f3 = m34604d2.m91255l();
                    } else {
                        f3 = 0.0f;
                    }
                    f = C32120Ce3.m111943p(m112990f2.mo23181y(C33056Ge3.m104938a(0.0f, f3)));
                } else {
                    f = 0.0f;
                }
                C16 c165 = this.f116985d;
                if (c165 != null && (m112990f = c165.m112990f()) != null) {
                    C43077j26 m112989g2 = c16.m112989g();
                    if (m112989g2 != null && (m31225i = m112989g2.m31225i()) != null && (m34604d = m31225i.m34604d(originalToTransformed2)) != null) {
                        f2 = m34604d.m91255l();
                    } else {
                        f2 = 0.0f;
                    }
                    f4 = C32120Ce3.m111943p(m112990f.mo23181y(C33056Ge3.m104938a(0.0f, f2)));
                }
                return new C35055Os4(Math.min(C32120Ce3.m111944o(m111932c), C32120Ce3.m111944o(m111932c2)), Math.min(f, f4), Math.max(C32120Ce3.m111944o(m111932c), C32120Ce3.m111944o(m111932c2)), Math.max(C32120Ce3.m111943p(m111932c), C32120Ce3.m111943p(m111932c2)) + (C43705k61.m29303g(25) * c16.m112978r().m84445a().mo3408b()));
            }
        }
        return C35055Os4.f27481e.m91247a();
    }

    /* renamed from: u */
    public final C32120Ce3 m5932u() {
        return (C32120Ce3) this.f116997p.getValue();
    }

    /* renamed from: v */
    public final long m5931v(InterfaceC41273g01 density) {
        C43077j26 c43077j26;
        int coerceIn;
        Intrinsics.checkNotNullParameter(density, "density");
        int originalToTransformed = this.f116983b.originalToTransformed(C48413s26.m14832n(m5973H().m108103g()));
        C16 c16 = this.f116985d;
        if (c16 != null) {
            c43077j26 = c16.m112989g();
        } else {
            c43077j26 = null;
        }
        Intrinsics.checkNotNull(c43077j26);
        C42484i26 m31225i = c43077j26.m31225i();
        coerceIn = RangesKt___RangesKt.coerceIn(originalToTransformed, 0, m31225i.m34597k().m40259j().length());
        C35055Os4 m34604d = m31225i.m34604d(coerceIn);
        return C33056Ge3.m104938a(m34604d.m91258i() + (density.mo3411T0(C40695f16.m42265c()) / 2), m34604d.m91262e());
    }

    /* renamed from: w */
    public final HE1 m5930w() {
        return (HE1) this.f116996o.getValue();
    }

    /* renamed from: x */
    public final boolean m5929x() {
        return ((Boolean) this.f116992k.getValue()).booleanValue();
    }

    /* renamed from: y */
    public final C11309h m5928y() {
        return this.f116991j;
    }

    /* renamed from: z */
    public final long m5927z(boolean z) {
        int m14837i;
        C43077j26 c43077j26;
        long m108103g = m5973H().m108103g();
        if (z) {
            m14837i = C48413s26.m14832n(m108103g);
        } else {
            m14837i = C48413s26.m14837i(m108103g);
        }
        C16 c16 = this.f116985d;
        if (c16 != null) {
            c43077j26 = c16.m112989g();
        } else {
            c43077j26 = null;
        }
        Intrinsics.checkNotNull(c43077j26);
        return D26.m111020b(c43077j26.m31225i(), this.f116983b.originalToTransformed(m14837i), z, C48413s26.m14833m(m5973H().m108103g()));
    }

    public C51367x16(C33518Id6 c33518Id6) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        this.f116982a = c33518Id6;
        this.f116983b = C50595vj6.m8228b();
        this.f116984c = C30021d.f117005g;
        m97025e = LM5.m97025e(new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.f116986e = m97025e;
        this.f116987f = InterfaceC32735Eu6.f8291a.m108216a();
        m97025e2 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f116992k = m97025e2;
        C32120Ce3.C1110a c1110a = C32120Ce3.f4427b;
        this.f116993l = c1110a.m111932c();
        this.f116995n = c1110a.m111932c();
        m97025e3 = LM5.m97025e(null, null, 2, null);
        this.f116996o = m97025e3;
        m97025e4 = LM5.m97025e(null, null, 2, null);
        this.f116997p = m97025e4;
        this.f116998q = new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null);
        this.f116999r = new C30026i();
        this.f117000s = new C30020c();
    }

    public /* synthetic */ C51367x16(C33518Id6 c33518Id6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c33518Id6);
    }
}
