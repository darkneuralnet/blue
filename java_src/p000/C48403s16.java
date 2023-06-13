package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J)\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0002\b\u0004J\u0006\u0010\b\u001a\u00020\u0000J\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\r\u001a\u00020\u000b*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006!"}, m28432d2 = {"Ls16;", "LuE;", "Lkotlin/Function1;", "LN91;", "Lkotlin/ExtensionFunctionType;", "or", "", "a0", "e0", "d0", "Lj26;", "", "pagesAmount", "c0", "LF16;", "i", "LF16;", "getCurrentValue", "()LF16;", "currentValue", "j", "Lj26;", "getLayoutResultProxy", "()Lj26;", "layoutResultProxy", "b0", "value", "LHe3;", "offsetMapping", "Lr26;", TransferTable.COLUMN_STATE, "<init>", "(LF16;LHe3;Lj26;Lr26;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n74#2,5:433\n80#2:439\n74#2,7:440\n1#3:438\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n408#1:433,5\n408#1:439\n412#1:440,7\n*E\n"})
/* renamed from: s16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48403s16 extends AbstractC29120uE<C48403s16> {

    /* renamed from: i */
    public final F16 f108142i;

    /* renamed from: j */
    public final C43077j26 f108143j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C48403s16(F16 currentValue, InterfaceC33290He3 offsetMapping, C43077j26 c43077j26, C47821r26 state) {
        super(r2, r3, r0, offsetMapping, state, null);
        C42484i26 c42484i26;
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(state, "state");
        C1577Df m108105e = currentValue.m108105e();
        long m108103g = currentValue.m108103g();
        if (c43077j26 != null) {
            c42484i26 = c43077j26.m31225i();
        } else {
            c42484i26 = null;
        }
        this.f108142i = currentValue;
        this.f108143j = c43077j26;
    }

    /* renamed from: a0 */
    public final List<N91> m14875a0(Function1<? super C48403s16, ? extends N91> or) {
        List<N91> listOf;
        List<N91> listOf2;
        Intrinsics.checkNotNullParameter(or, "or");
        if (!C48413s26.m14838h(m10542w())) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new N91[]{new C46500op0("", 0), new C38256aw5(C48413s26.m14834l(m10542w()), C48413s26.m14834l(m10542w()))});
            return listOf;
        }
        N91 invoke = or.invoke(this);
        if (invoke != null) {
            listOf2 = CollectionsKt__CollectionsJVMKt.listOf(invoke);
            return listOf2;
        }
        return null;
    }

    /* renamed from: b0 */
    public final F16 m14874b0() {
        return F16.m108107c(this.f108142i, m10560e(), m10542w(), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r2 == null) goto L10;
     */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m14873c0(C43077j26 c43077j26, int i) {
        C35055Os4 m91247a;
        InterfaceC45879nm2 m31231c = c43077j26.m31231c();
        if (m31231c != null) {
            InterfaceC45879nm2 m31232b = c43077j26.m31232b();
            m91247a = null;
            if (m31232b != null) {
                m91247a = InterfaceC45879nm2.m23184f(m31232b, m31231c, false, 2, null);
            }
        }
        m91247a = C35055Os4.f27481e.m91247a();
        C35055Os4 m34604d = c43077j26.m31225i().m34604d(m10549p().originalToTransformed(C48413s26.m14837i(this.f108142i.m108103g())));
        return m10549p().transformedToOriginal(c43077j26.m31225i().m34585w(C33056Ge3.m104938a(m34604d.m91258i(), m34604d.m91255l() + (C51465xB5.m5732g(m91247a.m91256k()) * i))));
    }

    /* renamed from: d0 */
    public final C48403s16 m14872d0() {
        boolean z;
        C43077j26 c43077j26;
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c43077j26 = this.f108143j) != null) {
            m10569V(m14873c0(c43077j26, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: e0 */
    public final C48403s16 m14871e0() {
        boolean z;
        C43077j26 c43077j26;
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c43077j26 = this.f108143j) != null) {
            m10569V(m14873c0(c43077j26, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
