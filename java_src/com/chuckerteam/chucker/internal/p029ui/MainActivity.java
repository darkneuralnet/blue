package com.chuckerteam.chucker.internal.p029ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.C11758t;
import androidx.lifecycle.C11759u;
import androidx.recyclerview.widget.C11915i;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.C17147a;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p029ui.MainActivity;
import com.chuckerteam.chucker.internal.p029ui.transaction.TransactionActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32758Ex2;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\b\u0000\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002JD\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000e2(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\b\u0001\u0010\"\u001a\u00020!H\u0002R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u000e0\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity;", "Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;", "Landroidx/appcompat/widget/SearchView$m;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "query", "onQueryTextSubmit", "newText", "onQueryTextChange", "P", "S", "fileName", "Lkotlin/Function2;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lkotlin/coroutines/Continuation;", "LFy5;", "", "block", "F", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lo31;", "J", "", "dialogMessage", "K", "LfH2;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "M", "()LfH2;", "viewModel", "Lkj0;", "e", "Lkj0;", "mainBinding", "Lt66;", "f", "Lt66;", "transactionsAdapter", "LB5;", "kotlin.jvm.PlatformType", "g", "LB5;", "permissionRequest", "", "H", "()Ljava/lang/CharSequence;", "applicationName", "<init>", "()V", "h", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,249:1\n75#2,13:250\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity\n*L\n45#1:250,13\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity */
/* loaded from: classes5.dex */
public final class MainActivity extends BaseChuckerActivity implements SearchView.InterfaceC11119m {

    /* renamed from: h */
    public static final C17160a f69254h = new C17160a(null);

    /* renamed from: d */
    public final Lazy f69255d = new C11758t(Reflection.getOrCreateKotlinClass(C40844fH2.class), new C17172j(this), new C17171i(this), new C17173k(null, this));

    /* renamed from: e */
    public C44068kj0 f69256e;

    /* renamed from: f */
    public C49046t66 f69257f;

    /* renamed from: g */
    public final AbstractC0407B5<String> f69258g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainActivity$a;", "", "", "EXPORT_HAR_FILE_NAME", "Ljava/lang/String;", "EXPORT_TXT_FILE_NAME", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$a */
    /* loaded from: classes5.dex */
    public static final class C17160a {
        public /* synthetic */ C17160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17160a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1", m28418f = "MainActivity.kt", m28417i = {}, m28416l = {206, 212, 213}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$b */
    /* loaded from: classes5.dex */
    public static final class C17161b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69259h;

        /* renamed from: j */
        public final /* synthetic */ Context f69261j;

        /* renamed from: k */
        public final /* synthetic */ Function2<List<HttpTransaction>, Continuation<? super InterfaceC33004Fy5>, Object> f69262k;

        /* renamed from: l */
        public final /* synthetic */ String f69263l;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Landroid/content/Intent;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1", m28418f = "MainActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$b$a */
        /* loaded from: classes5.dex */
        public static final class C17162a extends SuspendLambda implements Function2<ZC0, Continuation<? super Intent>, Object> {

            /* renamed from: h */
            public int f69264h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC33004Fy5 f69265i;

            /* renamed from: j */
            public final /* synthetic */ MainActivity f69266j;

            /* renamed from: k */
            public final /* synthetic */ String f69267k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17162a(InterfaceC33004Fy5 interfaceC33004Fy5, MainActivity mainActivity, String str, Continuation<? super C17162a> continuation) {
                super(2, continuation);
                this.f69265i = interfaceC33004Fy5;
                this.f69266j = mainActivity;
                this.f69267k = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C17162a(this.f69265i, this.f69266j, this.f69267k, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Intent> continuation) {
                return ((C17162a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f69264h == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC33004Fy5 interfaceC33004Fy5 = this.f69265i;
                    MainActivity mainActivity = this.f69266j;
                    String str = this.f69267k;
                    String string = mainActivity.getString(C38145al4.chucker_share_all_transactions_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chuck…e_all_transactions_title)");
                    String string2 = this.f69266j.getString(C38145al4.chucker_share_all_transactions_subject);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…all_transactions_subject)");
                    return C33238Gy5.m104541a(interfaceC33004Fy5, mainActivity, str, string, string2, "transactions");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17161b(Context context, Function2<? super List<HttpTransaction>, ? super Continuation<? super InterfaceC33004Fy5>, ? extends Object> function2, String str, Continuation<? super C17161b> continuation) {
            super(2, continuation);
            this.f69261j = context;
            this.f69262k = function2;
            this.f69263l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17161b(this.f69261j, this.f69262k, this.f69263l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17161b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            Intent intent;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69259h;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            intent = (Intent) obj;
                            if (intent != null) {
                                MainActivity.this.startActivity(intent);
                            } else {
                                MainActivity mainActivity = MainActivity.this;
                                String string = this.f69261j.getString(C38145al4.chucker_export_no_file);
                                Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getSt…g.chucker_export_no_file)");
                                BaseChuckerActivity.m52958x(mainActivity, string, 0, 2, null);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SC0 m84377b = T41.m84377b();
                    C17162a c17162a = new C17162a((InterfaceC33004Fy5) obj, MainActivity.this, this.f69263l, null);
                    this.f69259h = 3;
                    obj = X30.m77504g(m84377b, c17162a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intent = (Intent) obj;
                    if (intent != null) {
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                C40844fH2 m52947M = MainActivity.this.m52947M();
                this.f69259h = 1;
                obj = m52947M.m41622f(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<HttpTransaction> list = (List) obj;
            if (list.isEmpty()) {
                MainActivity mainActivity2 = MainActivity.this;
                String string2 = this.f69261j.getString(C38145al4.chucker_export_empty_text);
                Intrinsics.checkNotNullExpressionValue(string2, "applicationContext.getSt…hucker_export_empty_text)");
                BaseChuckerActivity.m52958x(mainActivity2, string2, 0, 2, null);
                return Unit.INSTANCE;
            }
            Function2<List<HttpTransaction>, Continuation<? super InterfaceC33004Fy5>, Object> function2 = this.f69262k;
            this.f69259h = 2;
            obj = function2.invoke(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            SC0 m84377b2 = T41.m84377b();
            C17162a c17162a2 = new C17162a((InterfaceC33004Fy5) obj, MainActivity.this, this.f69263l, null);
            this.f69259h = 3;
            obj = X30.m77504g(m84377b2, c17162a2, this);
            if (obj == coroutine_suspended) {
            }
            intent = (Intent) obj;
            if (intent != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "transactionId", "", C17296a.f69688o, "(J)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$c */
    /* loaded from: classes5.dex */
    public static final class C17163c extends Lambda implements Function1<Long, Unit> {
        public C17163c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52941a(long j) {
            TransactionActivity.f69283f.m52927a(MainActivity.this, j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m52941a(l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lcom/chuckerteam/chucker/internal/data/entity/a;", "kotlin.jvm.PlatformType", "transactionTuples", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,249:1\n254#2,2:250\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/chuckerteam/chucker/internal/ui/MainActivity$onCreate$3\n*L\n95#1:250,2\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$d */
    /* loaded from: classes5.dex */
    public static final class C17164d extends Lambda implements Function1<List<? extends C17147a>, Unit> {
        public C17164d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C17147a> list) {
            invoke2((List<C17147a>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C17147a> list) {
            C49046t66 c49046t66 = MainActivity.this.f69257f;
            C44068kj0 c44068kj0 = null;
            if (c49046t66 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
                c49046t66 = null;
            }
            c49046t66.submitList(list);
            C44068kj0 c44068kj02 = MainActivity.this.f69256e;
            if (c44068kj02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
            } else {
                c44068kj0 = c44068kj02;
            }
            Group group = c44068kj0.f94822f;
            Intrinsics.checkNotNullExpressionValue(group, "mainBinding.tutorialGroup");
            group.setVisibility(list.isEmpty() ? 0 : 8);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$e */
    /* loaded from: classes5.dex */
    public static final class C17165e extends Lambda implements Function0<Unit> {
        public C17165e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MainActivity.this.m52947M().m41623e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$f */
    /* loaded from: classes5.dex */
    public static final class C17166f extends Lambda implements Function0<Unit> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "LFy5;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$2$1", m28418f = "MainActivity.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$f$a */
        /* loaded from: classes5.dex */
        public static final class C17167a extends SuspendLambda implements Function2<List<? extends HttpTransaction>, Continuation<? super InterfaceC33004Fy5>, Object> {

            /* renamed from: h */
            public int f69272h;

            /* renamed from: i */
            public /* synthetic */ Object f69273i;

            public C17167a(Continuation<? super C17167a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C17167a c17167a = new C17167a(continuation);
                c17167a.f69273i = obj;
                return c17167a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends HttpTransaction> list, Continuation<? super InterfaceC33004Fy5> continuation) {
                return invoke2((List<HttpTransaction>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f69272h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return new C51427x76((List) this.f69273i, false);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(List<HttpTransaction> list, Continuation<? super InterfaceC33004Fy5> continuation) {
                return ((C17167a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C17166f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MainActivity.this.m52951F("transactions.txt", new C17167a(null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$g */
    /* loaded from: classes5.dex */
    public static final class C17168g extends Lambda implements Function0<Unit> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "LFy5;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$3$1", m28418f = "MainActivity.kt", m28417i = {}, m28416l = {175}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$g$a */
        /* loaded from: classes5.dex */
        public static final class C17169a extends SuspendLambda implements Function2<List<? extends HttpTransaction>, Continuation<? super InterfaceC33004Fy5>, Object> {

            /* renamed from: h */
            public int f69275h;

            /* renamed from: i */
            public /* synthetic */ Object f69276i;

            /* renamed from: j */
            public final /* synthetic */ MainActivity f69277j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17169a(MainActivity mainActivity, Continuation<? super C17169a> continuation) {
                super(2, continuation);
                this.f69277j = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C17169a c17169a = new C17169a(this.f69277j, continuation);
                c17169a.f69276i = obj;
                return c17169a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends HttpTransaction> list, Continuation<? super InterfaceC33004Fy5> continuation) {
                return invoke2((List<HttpTransaction>) list, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f69275h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ZE1 ze1 = ZE1.f48010a;
                    String string = this.f69277j.getString(C38145al4.chucker_name);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_name)");
                    String string2 = this.f69277j.getString(C38145al4.chucker_version);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_version)");
                    this.f69275h = 1;
                    obj = ze1.m73524b((List) this.f69276i, string, string2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new A66((String) obj);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(List<HttpTransaction> list, Continuation<? super InterfaceC33004Fy5> continuation) {
                return ((C17169a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C17168g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m52951F("transactions.har", new C17169a(mainActivity, null));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$h */
    /* loaded from: classes5.dex */
    public static final class C17170h implements InterfaceC41056fe3, FunctionAdapter {

        /* renamed from: b */
        public final /* synthetic */ Function1 f69278b;

        public C17170h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f69278b = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC41056fe3) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f69278b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.InterfaceC41056fe3
        public final /* synthetic */ void onChanged(Object obj) {
            this.f69278b.invoke(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$i */
    /* loaded from: classes5.dex */
    public static final class C17171i extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public final /* synthetic */ ComponentActivity f69279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17171i(ComponentActivity componentActivity) {
            super(0);
            this.f69279g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b defaultViewModelProviderFactory = this.f69279g.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LWr6;", "invoke", "()LWr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$j */
    /* loaded from: classes5.dex */
    public static final class C17172j extends Lambda implements Function0<C36920Wr6> {

        /* renamed from: g */
        public final /* synthetic */ ComponentActivity f69280g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17172j(ComponentActivity componentActivity) {
            super(0);
            this.f69280g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C36920Wr6 invoke() {
            C36920Wr6 viewModelStore = this.f69280g.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LFE0;", "invoke", "()LFE0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$k */
    /* loaded from: classes5.dex */
    public static final class C17173k extends Lambda implements Function0<FE0> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f69281g;

        /* renamed from: h */
        public final /* synthetic */ ComponentActivity f69282h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17173k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f69281g = function0;
            this.f69282h = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FE0 invoke() {
            FE0 fe0;
            Function0 function0 = this.f69281g;
            if (function0 == null || (fe0 = (FE0) function0.invoke()) == null) {
                FE0 defaultViewModelCreationExtras = this.f69282h.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return fe0;
        }
    }

    public MainActivity() {
        AbstractC0407B5<String> registerForActivityResult = registerForActivityResult(new C30416y5(), new InterfaceC28515t5() { // from class: bG2
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                MainActivity.m52944R(MainActivity.this, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ns info\")\n        }\n    }");
        this.f69258g = registerForActivityResult;
    }

    /* renamed from: Q */
    public static final void m52945Q(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this$0.getPackageName(), null));
        this$0.startActivity(intent);
    }

    /* renamed from: R */
    public static final void m52944R(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            String string = this$0.getApplicationContext().getString(C38145al4.chucker_notifications_permission_not_granted);
            Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getSt…s_permission_not_granted)");
            this$0.m52959w(string, 1);
            InterfaceC32758Ex2.C2028b.m108185a(InterfaceC32758Ex2.f8338a, "Notification permission denied. Can't show transactions info", null, 2, null);
        }
    }

    /* renamed from: F */
    public final void m52951F(String str, Function2<? super List<HttpTransaction>, ? super Continuation<? super InterfaceC33004Fy5>, ? extends Object> function2) {
        Z30.m73800d(C33163Gq2.m104689a(this), null, null, new C17161b(getApplicationContext(), function2, str, null), 3, null);
    }

    /* renamed from: H */
    public final CharSequence m52950H() {
        CharSequence loadLabel = getApplicationInfo().loadLabel(getPackageManager());
        Intrinsics.checkNotNullExpressionValue(loadLabel, "applicationInfo.loadLabel(packageManager)");
        return loadLabel;
    }

    /* renamed from: J */
    public final C46047o31 m52949J() {
        int i = C38145al4.chucker_clear;
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_clear)");
        String string2 = getString(C38145al4.chucker_clear_http_confirmation);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chuck…_clear_http_confirmation)");
        return new C46047o31(string, string2, getString(i), getString(C38145al4.chucker_cancel));
    }

    /* renamed from: K */
    public final C46047o31 m52948K(int i) {
        int i2 = C38145al4.chucker_export;
        String string = getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_export)");
        String string2 = getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(dialogMessage)");
        return new C46047o31(string, string2, getString(i2), getString(C38145al4.chucker_cancel));
    }

    /* renamed from: M */
    public final C40844fH2 m52947M() {
        return (C40844fH2) this.f69255d.getValue();
    }

    /* renamed from: P */
    public final void m52946P() {
        if (NA0.m94303a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
            if (shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                C44068kj0 c44068kj0 = this.f69256e;
                if (c44068kj0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
                    c44068kj0 = null;
                }
                Snackbar.m48855o0(c44068kj0.getRoot(), getApplicationContext().getString(C38145al4.chucker_notifications_permission_not_granted), 0).m48852r0(getApplicationContext().getString(C38145al4.chucker_change), new View.OnClickListener() { // from class: cG2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.m52945Q(MainActivity.this, view);
                    }
                }).mo48864Y();
                return;
            }
            this.f69258g.m114705a("android.permission.POST_NOTIFICATIONS");
        }
    }

    /* renamed from: S */
    public final void m52943S(Menu menu) {
        View actionView = menu.findItem(C33093Gi4.search).getActionView();
        Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setOnQueryTextListener(this);
        searchView.setIconifiedByDefault(true);
    }

    @Override // com.chuckerteam.chucker.internal.p029ui.BaseChuckerActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C44068kj0 m28572c = C44068kj0.m28572c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m28572c, "inflate(layoutInflater)");
        this.f69256e = m28572c;
        this.f69257f = new C49046t66(this, new C17163c());
        C44068kj0 c44068kj0 = this.f69256e;
        C49046t66 c49046t66 = null;
        if (c44068kj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainBinding");
            c44068kj0 = null;
        }
        setContentView(c44068kj0.getRoot());
        setSupportActionBar(c44068kj0.f94819c);
        c44068kj0.f94819c.setSubtitle(m52950H());
        c44068kj0.f94823g.setMovementMethod(LinkMovementMethod.getInstance());
        RecyclerView recyclerView = c44068kj0.f94820d;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C11915i(this, 1));
        C49046t66 c49046t662 = this.f69257f;
        if (c49046t662 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
        } else {
            c49046t66 = c49046t662;
        }
        recyclerView.setAdapter(c49046t66);
        m52947M().m41621g().observe(this, new C17170h(new C17164d()));
        if (Build.VERSION.SDK_INT >= 33) {
            m52946P();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C33579Ik4.chucker_transactions_list, menu);
        m52943S(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C33093Gi4.clear) {
            UA0.m81899c(this, m52949J(), new C17165e(), null);
            return true;
        } else if (itemId == C33093Gi4.share_text) {
            UA0.m81899c(this, m52948K(C38145al4.chucker_export_text_http_confirmation), new C17166f(), null);
            return true;
        } else if (itemId == C33093Gi4.share_har) {
            UA0.m81899c(this, m52948K(C38145al4.chucker_export_har_http_confirmation), new C17168g(), null);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
    public boolean onQueryTextChange(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        m52947M().m41620h(newText);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
    public boolean onQueryTextSubmit(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return true;
    }
}
