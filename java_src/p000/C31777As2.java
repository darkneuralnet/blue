package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a}\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000122\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0002¢\u0006\u0002\b\b2)\u0010\f\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¨\u0006\u0010"}, m28432d2 = {"Original", "Saveable", "Lkotlin/Function2;", "LTi5;", "Lkotlin/ParameterName;", "name", "value", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "list", "restore", "LRi5;", "", C17296a.f69688o, "runtime-saveable_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: As2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31777As2 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Original", "Saveable", "LTi5;", "it", "", C17296a.f69688o, "(LTi5;Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: As2$a */
    /* loaded from: classes.dex */
    public static final class C0294a extends Lambda implements Function2<InterfaceC36136Ti5, Original, Object> {

        /* renamed from: g */
        public final /* synthetic */ Function2<InterfaceC36136Ti5, Original, List<Saveable>> f1288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0294a(Function2<? super InterfaceC36136Ti5, ? super Original, ? extends List<? extends Saveable>> function2) {
            super(2);
            this.f1288g = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(InterfaceC36136Ti5 Saver, Original original) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            List list = (List) this.f1288g.invoke(Saver, original);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj != null && !Saver.mo83133a(obj)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                return new ArrayList(list2);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final <Original, Saveable> InterfaceC35668Ri5<Original, Object> m115002a(Function2<? super InterfaceC36136Ti5, ? super Original, ? extends List<? extends Saveable>> save, Function1<? super List<? extends Saveable>, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return C35902Si5.m85006a(new C0294a(save), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(restore, 1));
    }
}
