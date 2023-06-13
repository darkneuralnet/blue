package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.UpdateRequiredException;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C41848gy2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, m28432d2 = {"T", "Lio/reactivex/F;", "Ldy2;", "handler", "b", "login-exception-handler_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: gy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41848gy2 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "e", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: gy2$a */
    /* loaded from: classes3.dex */
    public static final class C22521a extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ C40069dy2 f84551g;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: gy2$a$a */
        /* loaded from: classes3.dex */
        public static final class C22522a extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends T>> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f84552g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22522a(Throwable th) {
                super(1);
                this.f84552g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23447K<? extends T> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23442F.m33100x(this.f84552g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22521a(C40069dy2 c40069dy2) {
            super(1);
            this.f84551g = c40069dy2;
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends T> invoke(Throwable e) {
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof CompositeException) {
                List<Throwable> m33015b = ((CompositeException) e).m33015b();
                Intrinsics.checkNotNullExpressionValue(m33015b, "e.exceptions");
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m33015b);
                e = (Throwable) firstOrNull;
            }
            if (e instanceof UpdateRequiredException) {
                AbstractC23442F<DialogResponse> m33142Y = this.f84551g.m43462c().m33142Y(C23454a.m33087a());
                final C22522a c22522a = new C22522a(e);
                return m33142Y.m33165A(new InterfaceC23492o() { // from class: fy2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = C41848gy2.C22521a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
            return AbstractC23442F.m33100x(e);
        }
    }

    /* renamed from: b */
    public static final <T> AbstractC23442F<T> m37271b(AbstractC23442F<T> abstractC23442F, C40069dy2 handler) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        final C22521a c22521a = new C22521a(handler);
        AbstractC23442F<T> m33150P = abstractC23442F.m33150P(new InterfaceC23492o() { // from class: ey2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m37270c;
                m37270c = C41848gy2.m37270c(Function1.this, obj);
                return m37270c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "T>Single<T>.attachLoginE…le.error(cause)\n    }\n  }");
        return m33150P;
    }

    /* renamed from: c */
    public static final InterfaceC23447K m37270c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }
}
