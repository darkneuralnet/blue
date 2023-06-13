package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0014\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\f\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\f\u0010\u0010\u001a\u00020\u000e*\u00020\tH\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LP91;", "", "LF16;", "value", "La26;", "textInputSession", "", DateTokenConverter.CONVERTER_KEY, "", "LN91;", "editCommands", "b", "f", "failedCommand", "", "c", "e", "<set-?>", C17296a.f69688o, "LF16;", "getMBufferState$ui_text_release", "()LF16;", "mBufferState", "LS91;", "LS91;", "getMBuffer$ui_text_release", "()LS91;", "mBuffer", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
/* renamed from: P91 */
/* loaded from: classes.dex */
public final class P91 {

    /* renamed from: a */
    public F16 f28024a = new F16(C1921Ef.m108606g(), C48413s26.f108170b.m14827a(), (C48413s26) null, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public S91 f28025b = new S91(this.f28024a.m108105e(), this.f28024a.m108103g(), null);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LN91;", "it", "", C17296a.f69688o, "(LN91;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: P91$a */
    /* loaded from: classes.dex */
    public static final class C6288a extends Lambda implements Function1<N91, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ N91 f28026g;

        /* renamed from: h */
        public final /* synthetic */ P91 f28027h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6288a(N91 n91, P91 p91) {
            super(1);
            this.f28026g = n91;
            this.f28027h = p91;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(N91 it) {
            String str;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f28026g == it) {
                str = " > ";
            } else {
                str = "   ";
            }
            return str + this.f28027h.m90633e(it);
        }
    }

    /* renamed from: b */
    public final F16 m90636b(List<? extends N91> editCommands) {
        N91 n91;
        Exception e;
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        N91 n912 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            while (i < size) {
                n91 = editCommands.get(i);
                try {
                    n91.mo18721a(this.f28025b);
                    i++;
                    n912 = n91;
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(m90635c(editCommands, n91), e);
                }
            }
            F16 f16 = new F16(this.f28025b.m85879s(), this.f28025b.m85889i(), this.f28025b.m85894d(), (DefaultConstructorMarker) null);
            this.f28024a = f16;
            return f16;
        } catch (Exception e3) {
            n91 = n912;
            e = e3;
        }
    }

    /* renamed from: c */
    public final String m90635c(List<? extends N91> list, N91 n91) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f28025b.m85890h() + ", composition=" + this.f28025b.m85894d() + ", selection=" + ((Object) C48413s26.m14829q(this.f28025b.m85889i())) + "):");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        CollectionsKt___CollectionsKt.joinTo$default(list, sb, "\n", null, null, 0, null, new C6288a(n91, this), 60, null);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    public final void m90634d(F16 value, C37723a26 c37723a26) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual(value.m108104f(), this.f28025b.m85894d());
        boolean z3 = false;
        if (!Intrinsics.areEqual(this.f28024a.m108105e(), value.m108105e())) {
            this.f28025b = new S91(value.m108105e(), value.m108103g(), null);
        } else if (!C48413s26.m14839g(this.f28024a.m108103g(), value.m108103g())) {
            this.f28025b.m85882p(C48413s26.m14834l(value.m108103g()), C48413s26.m14835k(value.m108103g()));
            z3 = true;
            z = false;
        } else {
            z = false;
        }
        if (value.m108104f() == null) {
            this.f28025b.m85897a();
        } else if (!C48413s26.m14838h(value.m108104f().m14828r())) {
            this.f28025b.m85884n(C48413s26.m14834l(value.m108104f().m14828r()), C48413s26.m14835k(value.m108104f().m14828r()));
        }
        if (z || (!z3 && z2)) {
            this.f28025b.m85897a();
            value = F16.m108107c(value, null, 0L, null, 3, null);
        }
        F16 f16 = this.f28024a;
        this.f28024a = value;
        if (c37723a26 != null) {
            c37723a26.m71958f(f16, value);
        }
    }

    /* renamed from: e */
    public final String m90633e(N91 n91) {
        if (n91 instanceof C46500op0) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            C46500op0 c46500op0 = (C46500op0) n91;
            sb.append(c46500op0.m20471c().length());
            sb.append(", newCursorPosition=");
            sb.append(c46500op0.m20472b());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        } else if (n91 instanceof C35317Pv5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            C35317Pv5 c35317Pv5 = (C35317Pv5) n91;
            sb2.append(c35317Pv5.m89422c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(c35317Pv5.m89423b());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        } else if (n91 instanceof C35083Ov5) {
            return n91.toString();
        } else {
            if (n91 instanceof YZ0) {
                return n91.toString();
            }
            if (n91 instanceof ZZ0) {
                return n91.toString();
            }
            if (n91 instanceof C38256aw5) {
                return n91.toString();
            }
            if (n91 instanceof C47064pm1) {
                return n91.toString();
            }
            if (n91 instanceof C22844hw) {
                return n91.toString();
            }
            if (n91 instanceof UZ0) {
                return n91.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String simpleName = Reflection.getOrCreateKotlinClass(n91.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            sb3.append(simpleName);
            return sb3.toString();
        }
    }

    /* renamed from: f */
    public final F16 m90632f() {
        return this.f28024a;
    }
}
