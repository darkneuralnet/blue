package p000;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.C17156a;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00060\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LfH2;", "LOr6;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchQuery", "", "h", "e", "LuX2;", "kotlin.jvm.PlatformType", C17296a.f69688o, "LuX2;", "currentFilter", "Landroidx/lifecycle/LiveData;", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "b", "Landroidx/lifecycle/LiveData;", "g", "()Landroidx/lifecycle/LiveData;", "transactions", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fH2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40844fH2 extends AbstractC35048Or6 {

    /* renamed from: a */
    public final C49882uX2<String> f79793a;

    /* renamed from: b */
    public final LiveData<List<C17147a>> f79794b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.MainViewModel$clearTransactions$1", m28418f = "MainViewModel.kt", m28417i = {}, m28416l = {43}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: fH2$a */
    /* loaded from: classes5.dex */
    public static final class C20346a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f79795h;

        public C20346a(Continuation<? super C20346a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20346a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C20346a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f79795h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NN1 m36551b = C42041hI4.f84975a.m36551b();
                this.f79795h = 1;
                if (m36551b.mo94003h(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00012\u0018\u0010\u0003\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lkotlin/jvm/JvmSuppressWildcards;", "kotlin.jvm.PlatformType", "searchQuery", "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "b", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fH2$b */
    /* loaded from: classes5.dex */
    public static final class C20347b extends Lambda implements Function1<String, LiveData<List<C17147a>>> {

        /* renamed from: g */
        public static final C20347b f79796g = new C20347b();

        public C20347b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final LiveData<List<C17147a>> invoke(String searchQuery) {
            boolean z;
            boolean isBlank;
            NN1 m36551b = C42041hI4.f84975a.m36551b();
            if (searchQuery != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(searchQuery);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        return m36551b.mo94010a();
                    }
                    if (TextUtils.isDigitsOnly(searchQuery)) {
                        Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
                        return m36551b.mo94006e(searchQuery, "");
                    }
                    Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
                    return m36551b.mo94006e("", searchQuery);
                }
            }
            z = true;
            if (!z) {
            }
        }
    }

    public C40844fH2() {
        C49882uX2<String> c49882uX2 = new C49882uX2<>("");
        this.f79793a = c49882uX2;
        this.f79794b = C49669u96.m10728c(c49882uX2, C20347b.f79796g);
    }

    /* renamed from: e */
    public final void m41623e() {
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new C20346a(null), 3, null);
        C17156a.f69245d.m52962a();
    }

    /* renamed from: f */
    public final Object m41622f(Continuation<? super List<HttpTransaction>> continuation) {
        return C42041hI4.f84975a.m36551b().mo94009b(continuation);
    }

    /* renamed from: g */
    public final LiveData<List<C17147a>> m41621g() {
        return this.f79794b;
    }

    /* renamed from: h */
    public final void m41620h(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f79793a.setValue(searchQuery);
    }
}
