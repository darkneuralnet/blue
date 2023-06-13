package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.AbstractC36226Ts5;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m28432d2 = {"T", "Lbi2;", "value", "Let5;", "serializer", "Lxi2;", "c", "(Lbi2;Ljava/lang/Object;Let5;)Lxi2;", "LMs5;", "", "b", "(LMs5;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: na6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45763na6 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "Lxi2;", "it", "", C17296a.f69688o, "(Lxi2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: na6$a */
    /* loaded from: classes8.dex */
    public static final class C26545a extends Lambda implements Function1<AbstractC51767xi2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<AbstractC51767xi2> f100159g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26545a(Ref.ObjectRef<AbstractC51767xi2> objectRef) {
            super(1);
            this.f100159g = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m23493a(AbstractC51767xi2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f100159g.element = it;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AbstractC51767xi2 abstractC51767xi2) {
            m23493a(abstractC51767xi2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public static final boolean m23495b(InterfaceC34588Ms5 interfaceC34588Ms5) {
        return (interfaceC34588Ms5.getKind() instanceof E24) || interfaceC34588Ms5.getKind() == AbstractC36226Ts5.C8136b.f36382a;
    }

    /* renamed from: c */
    public static final <T> AbstractC51767xi2 m23494c(AbstractC38706bi2 abstractC38706bi2, T t, InterfaceC40615et5<? super T> serializer) {
        Intrinsics.checkNotNullParameter(abstractC38706bi2, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new C47628qj2(abstractC38706bi2, new C26545a(objectRef)).mo1176B(serializer, t);
        T t2 = objectRef.element;
        if (t2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT);
            return null;
        }
        return (AbstractC51767xi2) t2;
    }
}
