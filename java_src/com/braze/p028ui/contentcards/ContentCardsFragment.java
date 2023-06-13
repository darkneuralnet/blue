package com.braze.p028ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AbstractC11952u;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appboy.events.IEventSubscriber;
import com.appboy.models.cards.Card;
import com.appboy.p027ui.R$color;
import com.appboy.p027ui.R$id;
import com.appboy.p027ui.R$layout;
import com.appboy.p027ui.R$string;
import com.braze.p028ui.contentcards.ContentCardsFragment;
import com.braze.p028ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.p028ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.p028ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.p028ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0016\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001fB\u0007¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\bJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0004J\b\u0010\u001a\u001a\u00020\u0006H\u0004J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0004J\u001b\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0084@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0006H\u0084@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0014\u0010$\u001a\u00020\u00062\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0004R$\u0010&\u001a\u0004\u0018\u00010%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\u001a\u0010P\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010T\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\"\u0004\b^\u0010_R\u0018\u0010b\u001a\u0006\u0012\u0002\b\u00030\"8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, m28432d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getContentCardUpdateHandler", "value", "", "setContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getContentCardsViewBindingHandler", "setContentCardsViewBindingHandler", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onRefresh", "onResume", "onPause", "outState", "onSaveInstanceState", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "LfA0;", "event", "handleContentCardsUpdatedEvent", "contentCardsUpdate", "(LfA0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkUnavailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/RecyclerView$h;", "newAdapter", "swapRecyclerViewAdapter", "Lzh2;", "networkUnavailableJob", "Lzh2;", "getNetworkUnavailableJob", "()Lzh2;", "setNetworkUnavailableJob", "(Lzh2;)V", "Landroidx/recyclerview/widget/RecyclerView;", "<set-?>", "contentCardsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "LaA0;", "cardAdapter", "LaA0;", "LQa1;", "defaultEmptyContentCardsAdapter", "LQa1;", "getDefaultEmptyContentCardsAdapter", "()LQa1;", "setDefaultEmptyContentCardsAdapter", "(LQa1;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/appboy/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/appboy/events/IEventSubscriber;", "getContentCardsUpdatedSubscriber", "()Lcom/appboy/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/appboy/events/IEventSubscriber;)V", "Leq5;", "sdkDataWipeEventSubscriber", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/RecyclerView$h;", "emptyCardsAdapter", "<init>", "()V", "Companion", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: com.braze.ui.contentcards.ContentCardsFragment */
/* loaded from: classes5.dex */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.InterfaceC11985j {
    public static final C17077a Companion = new C17077a(null);
    @JvmField
    public C37797aA0 cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<C40779fA0> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private InterfaceC52943zh2 networkUnavailableJob;
    private IEventSubscriber<C40585eq5> sdkDataWipeEventSubscriber;
    private C35358Qa1 defaultEmptyContentCardsAdapter = new C35358Qa1();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u0011"}, m28432d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment$a;", "", "", "AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS", "J", "", "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", "Ljava/lang/String;", "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", "", "MAX_CONTENT_CARDS_TTL_SECONDS", "I", "NETWORK_PROBLEM_WARNING_MS", "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$a */
    /* loaded from: classes5.dex */
    public static final class C17077a {
        public /* synthetic */ C17077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17077a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$b */
    /* loaded from: classes5.dex */
    public static final class C17078b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ C40779fA0 f69038g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17078b(C40779fA0 c40779fA0) {
            super(0);
            this.f69038g = c40779fA0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Updating Content Cards views in response to ContentCardsUpdatedEvent: ", this.f69038g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$c */
    /* loaded from: classes5.dex */
    public static final class C17079c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17079c f69039g = new C17079c();

        public C17079c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$d */
    /* loaded from: classes5.dex */
    public static final class C17080d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17080d f69040g = new C17080d();

        public C17080d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5", m28418f = "ContentCardsFragment.kt", m28417i = {}, m28416l = {304}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$e */
    /* loaded from: classes5.dex */
    public static final class C17081e extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69041h;

        public C17081e(Continuation<? super C17081e> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C17081e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69041h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                this.f69041h = 1;
                if (contentCardsFragment.networkUnavailable(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C17081e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", m28418f = "ContentCardsFragment.kt", m28417i = {}, m28416l = {264}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$f */
    /* loaded from: classes5.dex */
    public static final class C17082f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69043h;

        /* renamed from: j */
        public final /* synthetic */ C40779fA0 f69045j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17082f(C40779fA0 c40779fA0, Continuation<? super C17082f> continuation) {
            super(2, continuation);
            this.f69045j = c40779fA0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17082f(this.f69045j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17082f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f69043h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                C40779fA0 c40779fA0 = this.f69045j;
                this.f69043h = 1;
                if (contentCardsFragment.contentCardsUpdate(c40779fA0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$g */
    /* loaded from: classes5.dex */
    public static final class C17083g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17083g f69046g = new C17083g();

        public C17083g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Displaying network unavailable toast.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", m28418f = "ContentCardsFragment.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$h */
    /* loaded from: classes5.dex */
    public static final class C17084h extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69047h;

        public C17084h(Continuation<? super C17084h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C17084h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69047h == 0) {
                ResultKt.throwOnFailure(obj);
                SwipeRefreshLayout contentCardsSwipeLayout = ContentCardsFragment.this.getContentCardsSwipeLayout();
                if (contentCardsSwipeLayout != null) {
                    contentCardsSwipeLayout.setRefreshing(false);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C17084h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", m28418f = "ContentCardsFragment.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.ui.contentcards.ContentCardsFragment$i */
    /* loaded from: classes5.dex */
    public static final class C17085i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69049h;

        /* renamed from: i */
        public final /* synthetic */ Bundle f69050i;

        /* renamed from: j */
        public final /* synthetic */ ContentCardsFragment f69051j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17085i(Bundle bundle, ContentCardsFragment contentCardsFragment, Continuation<? super C17085i> continuation) {
            super(2, continuation);
            this.f69050i = bundle;
            this.f69051j = contentCardsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17085i(this.f69050i, this.f69051j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17085i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Parcelable parcelable;
            ArrayList<String> stringArrayList;
            Object parcelable2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69049h == 0) {
                ResultKt.throwOnFailure(obj);
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = this.f69050i.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = this.f69050i.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
                }
                RecyclerView contentCardsRecyclerView = this.f69051j.getContentCardsRecyclerView();
                if (contentCardsRecyclerView != null) {
                    RecyclerView.AbstractC11855p layoutManager = contentCardsRecyclerView.getLayoutManager();
                    if (parcelable != null && layoutManager != null) {
                        layoutManager.mo51787t1(parcelable);
                    }
                }
                C37797aA0 c37797aA0 = this.f69051j.cardAdapter;
                if (c37797aA0 != null && (stringArrayList = this.f69050i.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) != null) {
                    c37797aA0.m71822H(stringArrayList);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-0  reason: not valid java name */
    public static final void m116303onResume$lambda0(ContentCardsFragment this$0, C40779fA0 event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.handleContentCardsUpdatedEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-1  reason: not valid java name */
    public static final void m116304onResume$lambda1(ContentCardsFragment this$0, C40585eq5 c40585eq5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleContentCardsUpdatedEvent(C40779fA0.f79626e.m41789a());
    }

    public final void attachSwipeHelperCallback() {
        C37797aA0 c37797aA0 = this.cardAdapter;
        if (c37797aA0 != null) {
            new C11925l(new PA5(c37797aA0)).m66204g(getContentCardsRecyclerView());
        }
    }

    public final Object contentCardsUpdate(C40779fA0 c40779fA0, Continuation<? super Unit> continuation) {
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C17078b(c40779fA0), 6, null);
        List<Card> mo53208m3 = getContentCardUpdateHandler().mo53208m3(c40779fA0);
        C37797aA0 c37797aA0 = this.cardAdapter;
        if (c37797aA0 != null) {
            c37797aA0.m71823F(mo53208m3);
        }
        InterfaceC52943zh2 networkUnavailableJob = getNetworkUnavailableJob();
        if (networkUnavailableJob != null) {
            InterfaceC52943zh2.C31478a.m550a(networkUnavailableJob, null, 1, null);
        }
        setNetworkUnavailableJob(null);
        if (c40779fA0.m41791c() && c40779fA0.m41790d(60L)) {
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, C17079c.f69039g, 6, null);
            P10.getInstance(getContext()).requestContentCardsRefresh(false);
            if (mo53208m3.isEmpty()) {
                SwipeRefreshLayout contentCardsSwipeLayout = getContentCardsSwipeLayout();
                if (contentCardsSwipeLayout != null) {
                    contentCardsSwipeLayout.setRefreshing(true);
                }
                C43664k20.m29442e(c43664k20, this, null, null, false, C17080d.f69040g, 7, null);
                InterfaceC52943zh2 networkUnavailableJob2 = getNetworkUnavailableJob();
                if (networkUnavailableJob2 != null) {
                    InterfaceC52943zh2.C31478a.m550a(networkUnavailableJob2, null, 1, null);
                }
                setNetworkUnavailableJob(Z10.f47750b.m73847a(Boxing.boxLong(5000L), T41.m84376c(), new C17081e(null)));
                return Unit.INSTANCE;
            }
        }
        if (!mo53208m3.isEmpty()) {
            C37797aA0 c37797aA02 = this.cardAdapter;
            if (c37797aA02 != null) {
                swapRecyclerViewAdapter(c37797aA02);
            }
        } else {
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        }
        SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout2 != null) {
            contentCardsSwipeLayout2.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    public final RecyclerView.AbstractC11843h<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final InterfaceC52943zh2 getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    public final void handleContentCardsUpdatedEvent(C40779fA0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Z30.m73800d(Z10.f47750b, T41.m84376c(), null, new C17082f(event, null), 2, null);
    }

    public final void initializeRecyclerView() {
        RecyclerView.AbstractC11849m itemAnimator;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        C37797aA0 c37797aA0 = new C37797aA0(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = c37797aA0;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(c37797aA0);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        if (recyclerView3 == null) {
            itemAnimator = null;
        } else {
            itemAnimator = recyclerView3.getItemAnimator();
        }
        if (itemAnimator instanceof AbstractC11952u) {
            ((AbstractC11952u) itemAnimator).setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            recyclerView4.addItemDecoration(new C38983cA0(requireContext2));
        }
    }

    public final Object networkUnavailable(Continuation<? super Unit> continuation) {
        Context applicationContext;
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C17083g.f69046g, 6, null);
        Context context = getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            Toast.makeText(applicationContext, applicationContext.getString(R$string.com_appboy_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout contentCardsSwipeLayout = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout != null) {
            contentCardsSwipeLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.appboy_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R$color.com_braze_content_cards_swipe_refresh_color_1, R$color.com_braze_content_cards_swipe_refresh_color_2, R$color.com_braze_content_cards_swipe_refresh_color_3, R$color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        P10.getInstance(getContext()).removeSingleSubscription(this.contentCardsUpdatedSubscriber, C40779fA0.class);
        P10.getInstance(getContext()).removeSingleSubscription(this.sdkDataWipeEventSubscriber, C40585eq5.class);
        InterfaceC52943zh2 interfaceC52943zh2 = this.networkUnavailableJob;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.networkUnavailableJob = null;
        C37797aA0 c37797aA0 = this.cardAdapter;
        if (c37797aA0 != null) {
            c37797aA0.m71811x();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
    public void onRefresh() {
        P10.getInstance(getContext()).requestContentCardsRefresh(false);
        Z10.m73846b(Z10.f47750b, 2500L, null, new C17084h(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P10.getInstance(getContext()).removeSingleSubscription(this.contentCardsUpdatedSubscriber, C40779fA0.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new IEventSubscriber() { // from class: dA0
                @Override // com.appboy.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.m116303onResume$lambda0(ContentCardsFragment.this, (C40779fA0) obj);
                }
            };
        }
        P10.getInstance(getContext()).subscribeToContentCardsUpdates(this.contentCardsUpdatedSubscriber);
        P10.getInstance(getContext()).requestContentCardsRefresh(true);
        P10.getInstance(getContext()).removeSingleSubscription(this.sdkDataWipeEventSubscriber, C40585eq5.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new IEventSubscriber() { // from class: eA0
                @Override // com.appboy.events.IEventSubscriber
                public final void trigger(Object obj) {
                    ContentCardsFragment.m116304onResume$lambda1(ContentCardsFragment.this, (C40585eq5) obj);
                }
            };
        }
        P10.getInstance(getContext()).addSingleSynchronousSubscription(this.sdkDataWipeEventSubscriber, C40585eq5.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        RecyclerView.AbstractC11855p layoutManager;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            outState.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", layoutManager.mo51784u1());
        }
        C37797aA0 c37797aA0 = this.cardAdapter;
        if (c37797aA0 != null) {
            outState.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", new ArrayList<>(c37797aA0.m71815t()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        IContentCardsUpdateHandler iContentCardsUpdateHandler;
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler;
        Object parcelable;
        Object parcelable2;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                parcelable2 = bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class);
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) parcelable2;
            } else {
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            if (i >= 33) {
                parcelable = bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsViewBindingHandler.class);
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) parcelable;
            } else {
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            Z30.m73800d(Z10.f47750b, T41.m84376c(), null, new C17085i(bundle, this, null), 2, null);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setNetworkUnavailableJob(InterfaceC52943zh2 interfaceC52943zh2) {
        this.networkUnavailableJob = interfaceC52943zh2;
    }

    public final void swapRecyclerViewAdapter(RecyclerView.AbstractC11843h<?> newAdapter) {
        Intrinsics.checkNotNullParameter(newAdapter, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != newAdapter) {
            recyclerView.setAdapter(newAdapter);
        }
    }
}
