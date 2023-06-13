package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11759u;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.G76;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001QB\u0007¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0011H\u0017J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u0012\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\"\u001a\u00020\u0005H\u0002J1\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0012\u00100\u001a\b\u0012\u0004\u0012\u00020.0/*\u00020.H\u0002R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00109R\"\u0010?\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010\u00160\u00160;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, m28432d2 = {"LF76;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$m;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "", "query", "", "onQueryTextSubmit", "newText", "onQueryTextChange", "va", "ya", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "oa", "sa", "S9", "LxL3;", "type", "formatRequestBody", "", "LG76;", "ia", "(LxL3;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "la", "(LxL3;Landroid/net/Uri;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "ea", "La86;", "b", "Lkotlin/Lazy;", "da", "()La86;", "viewModel", "c", "T9", "()LxL3;", "payloadType", "LB5;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "LB5;", "saveToFile", "Loj0;", "e", "Loj0;", "payloadBinding", "Lv66;", "f", "Lv66;", "payloadAdapter", "", "g", "I", "backgroundSpanColor", "h", "foregroundSpanColor", "<init>", "()V", "i", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionPayloadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,340:1\n172#2,9:341\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment\n*L\n38#1:341,9\n*E\n"})
/* renamed from: F76 */
/* loaded from: classes5.dex */
public final class F76 extends Fragment implements SearchView.InterfaceC11119m {

    /* renamed from: i */
    public static final C2156a f8775i = new C2156a(null);

    /* renamed from: b */
    public final Lazy f8776b;

    /* renamed from: c */
    public final Lazy f8777c;

    /* renamed from: d */
    public final AbstractC0407B5<String> f8778d;

    /* renamed from: e */
    public C46440oj0 f8779e;

    /* renamed from: f */
    public final C50231v66 f8780f;

    /* renamed from: g */
    public int f8781g;

    /* renamed from: h */
    public int f8782h;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\b¨\u0006\u0010"}, m28432d2 = {"LF76$a;", "", "LxL3;", "type", "LF76;", C17296a.f69688o, "", "ARG_TYPE", "Ljava/lang/String;", "DEFAULT_FILE_PREFIX", "", "NUMBER_OF_IGNORED_SYMBOLS", "I", "TRANSACTION_EXCEPTION", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: F76$a */
    /* loaded from: classes5.dex */
    public static final class C2156a {
        public /* synthetic */ C2156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final F76 m107704a(EnumC51553xL3 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            F76 f76 = new F76();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", type);
            f76.setArguments(bundle);
            return f76;
        }

        private C2156a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F76$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C2157b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC51553xL3.values().length];
            try {
                iArr[EnumC51553xL3.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC51553xL3.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F76$c */
    /* loaded from: classes5.dex */
    public static final class C2158c extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Menu f8783g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2158c(Menu menu) {
            super(1);
            this.f8783g = menu;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean it) {
            MenuItem findItem = this.f8783g.findItem(C33093Gi4.encode_url);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            findItem.setVisible(it.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onViewCreated$2$1", m28418f = "TransactionPayloadFragment.kt", m28417i = {}, m28416l = {106}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: F76$d */
    /* loaded from: classes5.dex */
    public static final class C2159d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f8784h;

        /* renamed from: j */
        public final /* synthetic */ HttpTransaction f8786j;

        /* renamed from: k */
        public final /* synthetic */ boolean f8787k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2159d(HttpTransaction httpTransaction, boolean z, Continuation<? super C2159d> continuation) {
            super(2, continuation);
            this.f8786j = httpTransaction;
            this.f8787k = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2159d(this.f8786j, this.f8787k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C2159d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8784h;
            C46440oj0 c46440oj0 = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C46440oj0 c46440oj02 = F76.this.f8779e;
                if (c46440oj02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
                    c46440oj02 = null;
                }
                c46440oj02.f102407e.setVisibility(0);
                F76 f76 = F76.this;
                EnumC51553xL3 m107718T9 = f76.m107718T9();
                HttpTransaction httpTransaction = this.f8786j;
                boolean z = this.f8787k;
                this.f8784h = 1;
                obj = f76.m107712ia(m107718T9, httpTransaction, z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<? extends G76> list = (List) obj;
            if (list.isEmpty()) {
                F76.this.m107706va();
            } else {
                F76.this.f8780f.m9170u(list);
                F76.this.m107705ya();
            }
            F76.this.requireActivity().invalidateOptionsMenu();
            C46440oj0 c46440oj03 = F76.this.f8779e;
            if (c46440oj03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            } else {
                c46440oj0 = c46440oj03;
            }
            c46440oj0.f102407e.setVisibility(8);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LxL3;", "b", "()LxL3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F76$e */
    /* loaded from: classes5.dex */
    public static final class C2160e extends Lambda implements Function0<EnumC51553xL3> {
        public C2160e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final EnumC51553xL3 invoke() {
            Bundle arguments = F76.this.getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("type") : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.chuckerteam.chucker.internal.ui.transaction.PayloadType");
            return (EnumC51553xL3) serializable;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "LG76;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$processPayload$2", m28418f = "TransactionPayloadFragment.kt", m28417i = {0, 0}, m28416l = {KotlinVersion.MAX_COMPONENT_VALUE}, m28415m = "invokeSuspend", m28414n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "responseBitmap"}, m28413s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nTransactionPayloadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n*L\n269#1:341,2\n*E\n"})
    /* renamed from: F76$f */
    /* loaded from: classes5.dex */
    public static final class C2161f extends SuspendLambda implements Function2<ZC0, Continuation<? super List<G76>>, Object> {

        /* renamed from: h */
        public Object f8789h;

        /* renamed from: i */
        public Object f8790i;

        /* renamed from: j */
        public int f8791j;

        /* renamed from: k */
        public final /* synthetic */ EnumC51553xL3 f8792k;

        /* renamed from: l */
        public final /* synthetic */ HttpTransaction f8793l;

        /* renamed from: m */
        public final /* synthetic */ boolean f8794m;

        /* renamed from: n */
        public final /* synthetic */ F76 f8795n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2161f(EnumC51553xL3 enumC51553xL3, HttpTransaction httpTransaction, boolean z, F76 f76, Continuation<? super C2161f> continuation) {
            super(2, continuation);
            this.f8792k = enumC51553xL3;
            this.f8793l = httpTransaction;
            this.f8794m = z;
            this.f8795n = f76;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2161f(this.f8792k, this.f8793l, this.f8794m, this.f8795n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super List<G76>> continuation) {
            return ((C2161f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            List arrayList;
            String responseHeadersString;
            boolean isResponseBodyEncoded;
            CharSequence spannedResponseBody;
            boolean isBlank;
            boolean isBlank2;
            SpannableStringBuilder valueOf;
            Bitmap bitmap;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8791j;
            if (i != 0) {
                if (i == 1) {
                    bitmap = (Bitmap) this.f8790i;
                    arrayList = (List) this.f8789h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList();
                if (this.f8792k == EnumC51553xL3.REQUEST) {
                    responseHeadersString = this.f8793l.getRequestHeadersString(true);
                    isResponseBodyEncoded = this.f8793l.isRequestBodyEncoded();
                    if (this.f8794m) {
                        spannedResponseBody = this.f8793l.getSpannedRequestBody(this.f8795n.getContext());
                    } else {
                        spannedResponseBody = this.f8793l.getRequestBody();
                        if (spannedResponseBody == null) {
                            spannedResponseBody = "";
                        }
                    }
                } else {
                    responseHeadersString = this.f8793l.getResponseHeadersString(true);
                    isResponseBodyEncoded = this.f8793l.isResponseBodyEncoded();
                    spannedResponseBody = this.f8793l.getSpannedResponseBody(this.f8795n.getContext());
                }
                isBlank = StringsKt__StringsJVMKt.isBlank(responseHeadersString);
                if (!isBlank) {
                    Spanned m6966a = C50976wN1.m6966a(responseHeadersString, 0);
                    Intrinsics.checkNotNullExpressionValue(m6966a, "fromHtml(\n              …                        )");
                    arrayList.add(new G76.C2668b(m6966a));
                }
                Bitmap responseImageBitmap = this.f8793l.getResponseImageBitmap();
                if (this.f8792k == EnumC51553xL3.RESPONSE && responseImageBitmap != null) {
                    this.f8789h = arrayList;
                    this.f8790i = responseImageBitmap;
                    this.f8791j = 1;
                    Object m19219d = C27308pU.m19219d(responseImageBitmap, this);
                    if (m19219d == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = responseImageBitmap;
                    obj = m19219d;
                } else {
                    if (isResponseBodyEncoded) {
                        String string = this.f8795n.requireContext().getString(C38145al4.chucker_body_omitted);
                        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ing.chucker_body_omitted)");
                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(text)");
                        arrayList.add(new G76.C2667a(valueOf2));
                    } else {
                        isBlank2 = StringsKt__StringsJVMKt.isBlank(spannedResponseBody);
                        if (isBlank2) {
                            String string2 = this.f8795n.requireContext().getString(C38145al4.chucker_body_empty);
                            Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getStri…tring.chucker_body_empty)");
                            SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(string2);
                            Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(text)");
                            arrayList.add(new G76.C2667a(valueOf3));
                        } else {
                            for (CharSequence charSequence : this.f8795n.m107715ea(spannedResponseBody)) {
                                if (charSequence instanceof SpannableStringBuilder) {
                                    valueOf = (SpannableStringBuilder) charSequence;
                                } else {
                                    valueOf = SpannableStringBuilder.valueOf(charSequence);
                                }
                                Intrinsics.checkNotNullExpressionValue(valueOf, "if (it is SpannableStrin…                        }");
                                arrayList.add(new G76.C2667a(valueOf));
                            }
                        }
                    }
                    return arrayList;
                }
            }
            arrayList.add(new G76.C2669c(bitmap, (Double) obj));
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: F76$g */
    /* loaded from: classes5.dex */
    public static final class C2162g implements InterfaceC41056fe3, FunctionAdapter {

        /* renamed from: b */
        public final /* synthetic */ Function1 f8796b;

        public C2162g(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f8796b = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC41056fe3) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f8796b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.InterfaceC41056fe3
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8796b.invoke(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$1$1", m28418f = "TransactionPayloadFragment.kt", m28417i = {}, m28416l = {50}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: F76$h */
    /* loaded from: classes5.dex */
    public static final class C2163h extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f8797h;

        /* renamed from: j */
        public final /* synthetic */ Uri f8799j;

        /* renamed from: k */
        public final /* synthetic */ HttpTransaction f8800k;

        /* renamed from: l */
        public final /* synthetic */ Context f8801l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2163h(Uri uri, HttpTransaction httpTransaction, Context context, Continuation<? super C2163h> continuation) {
            super(2, continuation);
            this.f8799j = uri;
            this.f8800k = httpTransaction;
            this.f8801l = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2163h(this.f8799j, this.f8800k, this.f8801l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C2163h) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int i;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8797h;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                F76 f76 = F76.this;
                EnumC51553xL3 m107718T9 = f76.m107718T9();
                Uri uri = this.f8799j;
                HttpTransaction httpTransaction = this.f8800k;
                this.f8797h = 1;
                obj = f76.m107711la(m107718T9, uri, httpTransaction, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                i = C38145al4.chucker_file_saved;
            } else {
                i = C38145al4.chucker_file_not_saved;
            }
            Toast.makeText(this.f8801l, i, 0).show();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$3", m28418f = "TransactionPayloadFragment.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: F76$i */
    /* loaded from: classes5.dex */
    public static final class C2164i extends SuspendLambda implements Function2<ZC0, Continuation<? super Boolean>, Object> {

        /* renamed from: h */
        public int f8802h;

        /* renamed from: j */
        public final /* synthetic */ Uri f8804j;

        /* renamed from: k */
        public final /* synthetic */ EnumC51553xL3 f8805k;

        /* renamed from: l */
        public final /* synthetic */ HttpTransaction f8806l;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: F76$i$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C2165a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC51553xL3.values().length];
                try {
                    iArr[EnumC51553xL3.REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC51553xL3.RESPONSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2164i(Uri uri, EnumC51553xL3 enumC51553xL3, HttpTransaction httpTransaction, Continuation<? super C2164i> continuation) {
            super(2, continuation);
            this.f8804j = uri;
            this.f8805k = enumC51553xL3;
            this.f8806l = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2164i(this.f8804j, this.f8805k, this.f8806l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Boolean> continuation) {
            return ((C2164i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long copyTo$default;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8802h == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    ParcelFileDescriptor openFileDescriptor = F76.this.requireContext().getContentResolver().openFileDescriptor(this.f8804j, "w");
                    if (openFileDescriptor != null) {
                        EnumC51553xL3 enumC51553xL3 = this.f8805k;
                        HttpTransaction httpTransaction = this.f8806l;
                        FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                        int i = C2165a.$EnumSwitchMapping$0[enumC51553xL3.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                String responseBody = httpTransaction.getResponseBody();
                                if (responseBody != null) {
                                    byte[] bytes = responseBody.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                    copyTo$default = ByteStreamsKt.copyTo$default(new ByteArrayInputStream(bytes), fileOutputStream, 0, 2, null);
                                } else {
                                    throw new IOException("Transaction not ready");
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String requestBody = httpTransaction.getRequestBody();
                            if (requestBody != null) {
                                byte[] bytes2 = requestBody.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                                copyTo$default = ByteStreamsKt.copyTo$default(new ByteArrayInputStream(bytes2), fileOutputStream, 0, 2, null);
                            } else {
                                throw new IOException("Transaction not ready");
                            }
                        }
                        CloseableKt.closeFinally(fileOutputStream, null);
                        Boxing.boxLong(copyTo$default);
                        CloseableKt.closeFinally(openFileDescriptor, null);
                    }
                    return Boxing.boxBoolean(true);
                } catch (IOException e) {
                    InterfaceC32758Ex2.f8338a.error("Failed to save transaction to a file", e);
                    return Boxing.boxBoolean(false);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LWr6;", "invoke", "()LWr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: F76$j */
    /* loaded from: classes5.dex */
    public static final class C2166j extends Lambda implements Function0<C36920Wr6> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f8807g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2166j(Fragment fragment) {
            super(0);
            this.f8807g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C36920Wr6 invoke() {
            C36920Wr6 viewModelStore = this.f8807g.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LFE0;", "invoke", "()LFE0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: F76$k */
    /* loaded from: classes5.dex */
    public static final class C2167k extends Lambda implements Function0<FE0> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f8808g;

        /* renamed from: h */
        public final /* synthetic */ Fragment f8809h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2167k(Function0 function0, Fragment fragment) {
            super(0);
            this.f8808g = function0;
            this.f8809h = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FE0 invoke() {
            FE0 fe0;
            Function0 function0 = this.f8808g;
            if (function0 == null || (fe0 = (FE0) function0.invoke()) == null) {
                FE0 defaultViewModelCreationExtras = this.f8809h.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return fe0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: F76$l */
    /* loaded from: classes5.dex */
    public static final class C2168l extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f8810g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2168l(Fragment fragment) {
            super(0);
            this.f8810g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b defaultViewModelProviderFactory = this.f8810g.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F76$m */
    /* loaded from: classes5.dex */
    public static final class C2169m extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public static final C2169m f8811g = new C2169m();

        public C2169m() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            return new C38376b86(0L, 1, null);
        }
    }

    public F76() {
        Lazy lazy;
        Function0 function0 = C2169m.f8811g;
        this.f8776b = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(C37783a86.class), new C2166j(this), new C2167k(null, this), function0 == null ? new C2168l(this) : function0);
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C2160e());
        this.f8777c = lazy;
        AbstractC0407B5<String> registerForActivityResult = registerForActivityResult(new C29758w5(), new InterfaceC28515t5() { // from class: C76
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                F76.m107710ma(F76.this, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f8778d = registerForActivityResult;
        this.f8780f = new C50231v66();
        this.f8781g = -256;
        this.f8782h = -65536;
    }

    /* renamed from: fa */
    public static final boolean m107714fa(F76 this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.m107719S9();
        return true;
    }

    /* renamed from: ha */
    public static final void m107713ha(F76 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction) pair.component1();
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        if (httpTransaction == null) {
            return;
        }
        Z30.m73800d(C33163Gq2.m104689a(this$0), null, null, new C2159d(httpTransaction, booleanValue, null), 3, null);
    }

    /* renamed from: ma */
    public static final void m107710ma(F76 this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HttpTransaction value = this$0.m107716da().m71855j().getValue();
        Context applicationContext = this$0.requireContext().getApplicationContext();
        if (uri != null && value != null) {
            Z30.m73800d(C33163Gq2.m104689a(this$0), null, null, new C2163h(uri, value, applicationContext, null), 3, null);
        } else {
            Toast.makeText(applicationContext, C38145al4.chucker_save_failed_to_open_document, 0).show();
        }
    }

    /* renamed from: S9 */
    public final void m107719S9() {
        AbstractC0407B5<String> abstractC0407B5 = this.f8778d;
        long currentTimeMillis = System.currentTimeMillis();
        abstractC0407B5.m114705a("chucker-export-" + currentTimeMillis);
    }

    /* renamed from: T9 */
    public final EnumC51553xL3 m107718T9() {
        return (EnumC51553xL3) this.f8777c.getValue();
    }

    /* renamed from: da */
    public final C37783a86 m107716da() {
        return (C37783a86) this.f8776b.getValue();
    }

    /* renamed from: ea */
    public final List<CharSequence> m107715ea(CharSequence charSequence) {
        Sequence lineSequence;
        List list;
        lineSequence = StringsKt__StringsKt.lineSequence(charSequence);
        list = SequencesKt___SequencesKt.toList(lineSequence);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(charSequence.subSequence(i, ((String) list.get(i2)).length() + i));
            i += ((String) list.get(i2)).length() + 1;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(charSequence.subSequence(0, charSequence.length()));
        }
        return arrayList;
    }

    /* renamed from: ia */
    public final Object m107712ia(EnumC51553xL3 enumC51553xL3, HttpTransaction httpTransaction, boolean z, Continuation<? super List<G76>> continuation) {
        return X30.m77504g(T41.m84378a(), new C2161f(enumC51553xL3, httpTransaction, z, this, null), continuation);
    }

    /* renamed from: la */
    public final Object m107711la(EnumC51553xL3 enumC51553xL3, Uri uri, HttpTransaction httpTransaction, Continuation<? super Boolean> continuation) {
        return X30.m77504g(T41.m84377b(), new C2164i(uri, enumC51553xL3, httpTransaction, null), continuation);
    }

    /* renamed from: oa */
    public final boolean m107709oa(HttpTransaction httpTransaction) {
        boolean z;
        Long responsePayloadSize;
        boolean z2;
        Long requestPayloadSize;
        if (m107718T9() == EnumC51553xL3.REQUEST) {
            if (httpTransaction != null && (requestPayloadSize = httpTransaction.getRequestPayloadSize()) != null && 0 == requestPayloadSize.longValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
        } else if (m107718T9() != EnumC51553xL3.RESPONSE) {
            return true;
        } else {
            if (httpTransaction != null && (responsePayloadSize = httpTransaction.getResponsePayloadSize()) != null && 0 == responsePayloadSize.longValue()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f8781g = NA0.m94301c(context, C33066Gf4.chucker_background_span_color);
        this.f8782h = NA0.m94301c(context, C33066Gf4.chucker_foreground_span_color);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        HttpTransaction value = m107716da().m71855j().getValue();
        if (m107708sa(value)) {
            MenuItem findItem = menu.findItem(C33093Gi4.search);
            findItem.setVisible(true);
            View actionView = findItem.getActionView();
            Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            SearchView searchView = (SearchView) actionView;
            searchView.setOnQueryTextListener(this);
            searchView.setIconifiedByDefault(true);
        }
        if (m107709oa(value)) {
            MenuItem findItem2 = menu.findItem(C33093Gi4.save_body);
            findItem2.setVisible(true);
            findItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: E76
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean m107714fa;
                    m107714fa = F76.m107714fa(F76.this, menuItem);
                    return m107714fa;
                }
            });
        }
        if (m107718T9() == EnumC51553xL3.REQUEST) {
            m107716da().m71859f().observe(getViewLifecycleOwner(), new C2162g(new C2158c(menu)));
        } else {
            menu.findItem(C33093Gi4.encode_url).setVisible(false);
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C46440oj0 m20561c = C46440oj0.m20561c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(m20561c, "inflate(\n            inf…          false\n        )");
        this.f8779e = m20561c;
        if (m20561c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            m20561c = null;
        }
        ConstraintLayout root = m20561c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "payloadBinding.root");
        return root;
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
    public boolean onQueryTextChange(String newText) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(newText, "newText");
        isBlank = StringsKt__StringsJVMKt.isBlank(newText);
        if ((!isBlank) && newText.length() > 1) {
            this.f8780f.m9174p(newText, this.f8781g, this.f8782h);
        } else {
            this.f8780f.m9171t();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.InterfaceC11119m
    public boolean onQueryTextSubmit(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C46440oj0 c46440oj0 = this.f8779e;
        if (c46440oj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            c46440oj0 = null;
        }
        RecyclerView recyclerView = c46440oj0.f102408f;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f8780f);
        C37159Xs2.m76191b(m107716da().m71855j(), m107716da().m71856i()).observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: D76
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                F76.m107713ha(F76.this, (Pair) obj);
            }
        });
    }

    /* renamed from: sa */
    public final boolean m107708sa(HttpTransaction httpTransaction) {
        boolean z;
        Long requestPayloadSize;
        boolean z2;
        Long responsePayloadSize;
        int i = C2157b.$EnumSwitchMapping$0[m107718T9().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (httpTransaction != null && !httpTransaction.isResponseBodyEncoded()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && ((responsePayloadSize = httpTransaction.getResponsePayloadSize()) == null || 0 != responsePayloadSize.longValue())) {
                    return true;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (httpTransaction != null && !httpTransaction.isRequestBodyEncoded()) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((requestPayloadSize = httpTransaction.getRequestPayloadSize()) == null || 0 != requestPayloadSize.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: va */
    public final void m107706va() {
        String string;
        C46440oj0 c46440oj0 = this.f8779e;
        if (c46440oj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            c46440oj0 = null;
        }
        TextView textView = c46440oj0.f102405c;
        if (m107718T9() == EnumC51553xL3.RESPONSE) {
            string = getString(C38145al4.chucker_response_is_empty);
        } else {
            string = getString(C38145al4.chucker_request_is_empty);
        }
        textView.setText(string);
        c46440oj0.f102406d.setVisibility(0);
        c46440oj0.f102408f.setVisibility(8);
    }

    /* renamed from: ya */
    public final void m107705ya() {
        C46440oj0 c46440oj0 = this.f8779e;
        if (c46440oj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payloadBinding");
            c46440oj0 = null;
        }
        c46440oj0.f102406d.setVisibility(8);
        c46440oj0.f102408f.setVisibility(0);
    }
}
