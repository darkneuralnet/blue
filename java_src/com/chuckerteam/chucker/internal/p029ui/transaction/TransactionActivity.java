package com.chuckerteam.chucker.internal.p029ui.transaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p029ui.BaseChuckerActivity;
import com.chuckerteam.chucker.internal.p029ui.transaction.TransactionActivity;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J>\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity;", "Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "H", "Lkotlin/Function1;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "LFy5;", "block", "Q", "", "fileName", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "P", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Z", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "M", "La86;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "E", "()La86;", "viewModel", "Llj0;", "e", "Llj0;", "transactionBinding", "<init>", "()V", "f", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionActivity.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,174:1\n75#2,13:175\n*S KotlinDebug\n*F\n+ 1 TransactionActivity.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity\n*L\n30#1:175,13\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity */
/* loaded from: classes5.dex */
public final class TransactionActivity extends BaseChuckerActivity {

    /* renamed from: f */
    public static final C17174a f69283f = new C17174a(null);

    /* renamed from: g */
    public static int f69284g;

    /* renamed from: d */
    public final Lazy f69285d = new C11758t(Reflection.getOrCreateKotlinClass(C37783a86.class), new C17183i(this), new C17185k(), new C17184j(null, this));

    /* renamed from: e */
    public C44661lj0 f69286e;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "transactionId", "", C17296a.f69688o, "", "EXPORT_HAR_FILE_NAME", "Ljava/lang/String;", "EXPORT_TXT_FILE_NAME", "EXTRA_TRANSACTION_ID", "", "selectedTabPosition", "I", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$a */
    /* loaded from: classes5.dex */
    public static final class C17174a {
        public /* synthetic */ C17174a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m52927a(Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, TransactionActivity.class);
            intent.putExtra("transaction_id", j);
            context.startActivity(intent);
        }

        private C17174a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LFy5;", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)LFy5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$b */
    /* loaded from: classes5.dex */
    public static final class C17175b extends Lambda implements Function1<HttpTransaction, InterfaceC33004Fy5> {
        public C17175b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC33004Fy5 invoke(HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Boolean value = TransactionActivity.this.m52936E().m71857h().getValue();
            Intrinsics.checkNotNull(value);
            return new K66(transaction, value.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LFy5;", C17296a.f69688o, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)LFy5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$c */
    /* loaded from: classes5.dex */
    public static final class C17176c extends Lambda implements Function1<HttpTransaction, InterfaceC33004Fy5> {

        /* renamed from: g */
        public static final C17176c f69288g = new C17176c();

        public C17176c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC33004Fy5 invoke(HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            return new C50824w66(transaction);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LFy5;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$3", m28418f = "TransactionActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$d */
    /* loaded from: classes5.dex */
    public static final class C17177d extends SuspendLambda implements Function2<HttpTransaction, Continuation<? super InterfaceC33004Fy5>, Object> {

        /* renamed from: h */
        public int f69289h;

        /* renamed from: i */
        public /* synthetic */ Object f69290i;

        public C17177d(Continuation<? super C17177d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17177d c17177d = new C17177d(continuation);
            c17177d.f69290i = obj;
            return c17177d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(HttpTransaction httpTransaction, Continuation<? super InterfaceC33004Fy5> continuation) {
            return ((C17177d) create(httpTransaction, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69289h == 0) {
                ResultKt.throwOnFailure(obj);
                Boolean value = TransactionActivity.this.m52936E().m71857h().getValue();
                Intrinsics.checkNotNull(value);
                return new K66((HttpTransaction) this.f69290i, value.booleanValue());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "LFy5;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$onOptionsItemSelected$4", m28418f = "TransactionActivity.kt", m28417i = {}, m28416l = {94}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$e */
    /* loaded from: classes5.dex */
    public static final class C17178e extends SuspendLambda implements Function2<HttpTransaction, Continuation<? super InterfaceC33004Fy5>, Object> {

        /* renamed from: h */
        public int f69292h;

        /* renamed from: i */
        public /* synthetic */ Object f69293i;

        public C17178e(Continuation<? super C17178e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17178e c17178e = new C17178e(continuation);
            c17178e.f69293i = obj;
            return c17178e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(HttpTransaction httpTransaction, Continuation<? super InterfaceC33004Fy5> continuation) {
            return ((C17178e) create(httpTransaction, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List<HttpTransaction> listOf;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69292h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ZE1 ze1 = ZE1.f48010a;
                listOf = CollectionsKt__CollectionsJVMKt.listOf((HttpTransaction) this.f69293i);
                String string = TransactionActivity.this.getString(C38145al4.chucker_name);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_name)");
                String string2 = TransactionActivity.this.getString(C38145al4.chucker_version);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_version)");
                this.f69292h = 1;
                obj = ze1.m73524b(listOf, string, string2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new A66((String) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"com/chuckerteam/chucker/internal/ui/transaction/TransactionActivity$f", "Landroidx/viewpager/widget/ViewPager$l;", "", "position", "", "onPageSelected", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$f */
    /* loaded from: classes5.dex */
    public static final class C17179f extends ViewPager.C12079l {
        @Override // androidx.viewpager.widget.ViewPager.C12079l, androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            TransactionActivity.f69284g = i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1", m28418f = "TransactionActivity.kt", m28417i = {}, m28416l = {130, 131}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$g */
    /* loaded from: classes5.dex */
    public static final class C17180g extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69295h;

        /* renamed from: j */
        public final /* synthetic */ Function2<HttpTransaction, Continuation<? super InterfaceC33004Fy5>, Object> f69297j;

        /* renamed from: k */
        public final /* synthetic */ String f69298k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Landroid/content/Intent;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsFile$1$shareIntent$1", m28418f = "TransactionActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$g$a */
        /* loaded from: classes5.dex */
        public static final class C17181a extends SuspendLambda implements Function2<ZC0, Continuation<? super Intent>, Object> {

            /* renamed from: h */
            public int f69299h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC33004Fy5 f69300i;

            /* renamed from: j */
            public final /* synthetic */ TransactionActivity f69301j;

            /* renamed from: k */
            public final /* synthetic */ String f69302k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17181a(InterfaceC33004Fy5 interfaceC33004Fy5, TransactionActivity transactionActivity, String str, Continuation<? super C17181a> continuation) {
                super(2, continuation);
                this.f69300i = interfaceC33004Fy5;
                this.f69301j = transactionActivity;
                this.f69302k = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C17181a(this.f69300i, this.f69301j, this.f69302k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Intent> continuation) {
                return ((C17181a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f69299h == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC33004Fy5 interfaceC33004Fy5 = this.f69300i;
                    TransactionActivity transactionActivity = this.f69301j;
                    String str = this.f69302k;
                    String string = transactionActivity.getString(C38145al4.chucker_share_transaction_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chuck…_share_transaction_title)");
                    String string2 = this.f69301j.getString(C38145al4.chucker_share_transaction_subject);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…hare_transaction_subject)");
                    return C33238Gy5.m104541a(interfaceC33004Fy5, transactionActivity, str, string, string2, "transaction");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17180g(Function2<? super HttpTransaction, ? super Continuation<? super InterfaceC33004Fy5>, ? extends Object> function2, String str, Continuation<? super C17180g> continuation) {
            super(2, continuation);
            this.f69297j = function2;
            this.f69298k = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17180g(this.f69297j, this.f69298k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17180g) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Intent intent;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69295h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        intent = (Intent) obj;
                        if (intent == null) {
                            TransactionActivity.this.startActivity(intent);
                        } else {
                            Toast.makeText(TransactionActivity.this.getApplicationContext(), C38145al4.chucker_export_no_file, 0).show();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HttpTransaction value = TransactionActivity.this.m52936E().m71855j().getValue();
                if (value == null) {
                    TransactionActivity transactionActivity = TransactionActivity.this;
                    String string = transactionActivity.getString(C38145al4.chucker_request_not_ready);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_request_not_ready)");
                    BaseChuckerActivity.m52958x(transactionActivity, string, 0, 2, null);
                    return Unit.INSTANCE;
                }
                Function2<HttpTransaction, Continuation<? super InterfaceC33004Fy5>, Object> function2 = this.f69297j;
                this.f69295h = 1;
                obj = function2.invoke(value, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SC0 m84377b = T41.m84377b();
            C17181a c17181a = new C17181a((InterfaceC33004Fy5) obj, TransactionActivity.this, this.f69298k, null);
            this.f69295h = 2;
            obj = X30.m77504g(m84377b, c17181a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            intent = (Intent) obj;
            if (intent == null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$shareTransactionAsText$1", m28418f = "TransactionActivity.kt", m28417i = {}, m28416l = {112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$h */
    /* loaded from: classes5.dex */
    public static final class C17182h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69303h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC33004Fy5 f69304i;

        /* renamed from: j */
        public final /* synthetic */ TransactionActivity f69305j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17182h(InterfaceC33004Fy5 interfaceC33004Fy5, TransactionActivity transactionActivity, Continuation<? super C17182h> continuation) {
            super(2, continuation);
            this.f69304i = interfaceC33004Fy5;
            this.f69305j = transactionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17182h(this.f69304i, this.f69305j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17182h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69303h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC33004Fy5 interfaceC33004Fy5 = this.f69304i;
                TransactionActivity transactionActivity = this.f69305j;
                String string = transactionActivity.getString(C38145al4.chucker_share_transaction_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chuck…_share_transaction_title)");
                String string2 = this.f69305j.getString(C38145al4.chucker_share_transaction_subject);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…hare_transaction_subject)");
                this.f69303h = 1;
                obj = C33238Gy5.m104540b(interfaceC33004Fy5, transactionActivity, string, string2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f69305j.startActivity((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LWr6;", "invoke", "()LWr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$i */
    /* loaded from: classes5.dex */
    public static final class C17183i extends Lambda implements Function0<C36920Wr6> {

        /* renamed from: g */
        public final /* synthetic */ ComponentActivity f69306g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17183i(ComponentActivity componentActivity) {
            super(0);
            this.f69306g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C36920Wr6 invoke() {
            C36920Wr6 viewModelStore = this.f69306g.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LFE0;", "invoke", "()LFE0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$j */
    /* loaded from: classes5.dex */
    public static final class C17184j extends Lambda implements Function0<FE0> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f69307g;

        /* renamed from: h */
        public final /* synthetic */ ComponentActivity f69308h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17184j(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f69307g = function0;
            this.f69308h = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FE0 invoke() {
            FE0 fe0;
            Function0 function0 = this.f69307g;
            if (function0 == null || (fe0 = (FE0) function0.invoke()) == null) {
                FE0 defaultViewModelCreationExtras = this.f69308h.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return fe0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionActivity$k */
    /* loaded from: classes5.dex */
    public static final class C17185k extends Lambda implements Function0<C11759u.InterfaceC11763b> {
        public C17185k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            return new C38376b86(TransactionActivity.this.getIntent().getLongExtra("transaction_id", 0L));
        }
    }

    /* renamed from: F */
    public static final void m52935F(TransactionActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C44661lj0 c44661lj0 = this$0.f69286e;
        if (c44661lj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
            c44661lj0 = null;
        }
        c44661lj0.f96639d.setText(str);
    }

    /* renamed from: J */
    public static final boolean m52933J(TransactionActivity this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m52936E().m71853l();
        return true;
    }

    /* renamed from: K */
    public static final void m52932K(MenuItem menuItem, Boolean encode) {
        int i;
        Intrinsics.checkNotNullExpressionValue(encode, "encode");
        if (encode.booleanValue()) {
            i = C49971ug4.chucker_ic_encoded_url_white;
        } else {
            i = C49971ug4.chucker_ic_decoded_url_white;
        }
        menuItem.setIcon(i);
    }

    /* renamed from: E */
    public final C37783a86 m52936E() {
        return (C37783a86) this.f69285d.getValue();
    }

    /* renamed from: H */
    public final void m52934H(Menu menu) {
        final MenuItem findItem = menu.findItem(C33093Gi4.encode_url);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p66
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m52933J;
                m52933J = TransactionActivity.m52933J(TransactionActivity.this, menuItem);
                return m52933J;
            }
        });
        m52936E().m71857h().observe(this, new InterfaceC41056fe3() { // from class: q66
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                TransactionActivity.m52932K(findItem, (Boolean) obj);
            }
        });
    }

    /* renamed from: M */
    public final void m52931M(ViewPager viewPager) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new B76(this, supportFragmentManager));
        viewPager.addOnPageChangeListener(new C17179f());
        viewPager.setCurrentItem(f69284g);
    }

    /* renamed from: P */
    public final boolean m52930P(String str, Function2<? super HttpTransaction, ? super Continuation<? super InterfaceC33004Fy5>, ? extends Object> function2) {
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new C17180g(function2, str, null), 3, null);
        return true;
    }

    /* renamed from: Q */
    public final boolean m52929Q(Function1<? super HttpTransaction, ? extends InterfaceC33004Fy5> function1) {
        HttpTransaction value = m52936E().m71855j().getValue();
        if (value == null) {
            String string = getString(C38145al4.chucker_request_not_ready);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_request_not_ready)");
            BaseChuckerActivity.m52958x(this, string, 0, 2, null);
            return true;
        }
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new C17182h(function1.invoke(value), this, null), 3, null);
        return true;
    }

    @Override // com.chuckerteam.chucker.internal.p029ui.BaseChuckerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C44661lj0 m26907c = C44661lj0.m26907c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m26907c, "inflate(layoutInflater)");
        this.f69286e = m26907c;
        if (m26907c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionBinding");
            m26907c = null;
        }
        setContentView(m26907c.getRoot());
        setSupportActionBar(m26907c.f96638c);
        ViewPager viewPager = m26907c.f96640e;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        m52931M(viewPager);
        m26907c.f96637b.setupWithViewPager(m26907c.f96640e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(true);
        }
        m52936E().m71854k().observe(this, new InterfaceC41056fe3() { // from class: r66
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                TransactionActivity.m52935F(TransactionActivity.this, (String) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C33579Ik4.chucker_transaction, menu);
        m52934H(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C33093Gi4.share_text) {
            return m52929Q(new C17175b());
        }
        if (itemId == C33093Gi4.share_curl) {
            return m52929Q(C17176c.f69288g);
        }
        if (itemId == C33093Gi4.share_file) {
            return m52930P("transaction.txt", new C17177d(null));
        }
        if (itemId == C33093Gi4.share_har) {
            return m52930P("transaction.har", new C17178e(null));
        }
        return super.onOptionsItemSelected(item);
    }
}
