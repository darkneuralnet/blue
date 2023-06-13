package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11939n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31098b;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;
import zendesk.support.request.ViewMessageComposer;
import zendesk.support.suas.CombinedSubscription;
import zendesk.support.suas.Store;
import zendesk.support.suas.Subscription;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public class RequestViewConversationsEnabled extends FrameLayout implements RequestView {
    private AppCompatActivity activity;

    /* renamed from: af */
    ActionFactory f122000af;
    CellFactory cellFactory;
    private ImagePickerDragAnimation imagePickerDragAnimation;
    private C31098b imageStream;
    private ComponentMessageComposer messageComposerComponent;
    private ViewMessageComposer messageComposerView;
    C42732iT3 picasso;
    private RecyclerView recyclerView;
    Store store;
    private Subscription subscription;
    private View toolbar;
    private View toolbarContainer;

    /* loaded from: classes8.dex */
    public static class ImagePickerDragAnimation implements C31098b.InterfaceC31101c {
        private final Interpolator cubicBezierInterpolator = C43828kJ3.m29072a(0.19f, 0.0f, 0.2f, 1.0f);
        private final View messageComposer;
        private final View recycler;
        private final View toolbar;
        private final View toolbarContainer;

        public ImagePickerDragAnimation(View view, View view2, View view3, View view4) {
            this.toolbarContainer = view;
            this.messageComposer = view2;
            this.recycler = view3;
            this.toolbar = view4;
        }

        private void animateBackground(int i, float f) {
            float interpolation = (int) (this.cubicBezierInterpolator.getInterpolation(f * 0.3f) * (-1.0f) * i);
            this.messageComposer.setTranslationY(interpolation);
            this.recycler.setTranslationY(interpolation);
        }

        private void animateToolbar(int i, float f) {
            float f2 = i;
            float f3 = f * f2;
            int m62546E = C38790bq6.m62546E(this.toolbar);
            if (i > 0) {
                float f4 = f2 - f3;
                float f5 = m62546E;
                if (f4 < f5) {
                    this.toolbarContainer.setTranslationY(f4 - f5);
                    return;
                }
            }
            this.toolbarContainer.setTranslationY(0.0f);
        }

        @Override // zendesk.belvedere.C31098b.InterfaceC31101c
        public void onScroll(int i, int i2, float f) {
            animateToolbar(i2, f);
            animateBackground(i2, f);
        }
    }

    /* loaded from: classes8.dex */
    public static class RecyclerListener implements ViewMessageComposer.OnHeightChangeListener, View.OnFocusChangeListener, View.OnLayoutChangeListener, InterfaceC32011Bs2 {
        private static final int FIXED_SCROLL_TIME = 50;
        private static final int SCROLL_INSTANT = 1;
        private static final int SCROLL_SMOOTH_FIXED_TIME = 3;
        private static final int SCROLL_SMOOTH_FIXED_VELOCITY = 2;
        private final LinearLayoutManager linearLayoutManager;
        private final int recyclerDefaultBottomPadding;
        private final RecyclerView recyclerView;

        public RecyclerListener(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.recyclerView = recyclerView;
            this.linearLayoutManager = linearLayoutManager;
            this.recyclerDefaultBottomPadding = recyclerView.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_recycler_padding_bottom);
        }

        private void postScrollToBottom(final int i) {
            this.recyclerView.post(new Runnable() { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.3
                @Override // java.lang.Runnable
                public void run() {
                    RecyclerListener.this.scrollToBottom(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void scrollToBottom(int i) {
            int i2;
            View view;
            int itemCount = this.recyclerView.getAdapter().getItemCount() - 1;
            if (itemCount >= 0) {
                if (i == 1) {
                    RecyclerView.AbstractC11834D findViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(itemCount);
                    if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                        i2 = view.getHeight();
                    } else {
                        i2 = 0;
                    }
                    this.linearLayoutManager.m66731S2(itemCount, (this.recyclerView.getPaddingBottom() + i2) * (-1));
                } else if (i == 3) {
                    C11939n c11939n = new C11939n(this.recyclerView.getContext()) { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.2
                        @Override // androidx.recyclerview.widget.C11939n
                        public int calculateTimeForScrolling(int i3) {
                            return 50;
                        }
                    };
                    c11939n.setTargetPosition(itemCount);
                    this.recyclerView.getLayoutManager().m66598b2(c11939n);
                } else if (i == 2) {
                    C11939n c11939n2 = new C11939n(this.recyclerView.getContext());
                    c11939n2.setTargetPosition(itemCount);
                    this.recyclerView.getLayoutManager().m66598b2(c11939n2);
                }
            }
        }

        @Override // p000.InterfaceC32011Bs2
        public void onChanged(int i, int i2, Object obj) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2, obj);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                postScrollToBottom(2);
            }
        }

        @Override // zendesk.support.request.ViewMessageComposer.OnHeightChangeListener
        public void onHeightChange(final int i) {
            this.recyclerView.post(new Runnable() { // from class: zendesk.support.request.RequestViewConversationsEnabled.RecyclerListener.1
                @Override // java.lang.Runnable
                public void run() {
                    int paddingLeft = RecyclerListener.this.recyclerView.getPaddingLeft();
                    int paddingRight = RecyclerListener.this.recyclerView.getPaddingRight();
                    int paddingTop = RecyclerListener.this.recyclerView.getPaddingTop();
                    int i2 = RecyclerListener.this.recyclerDefaultBottomPadding;
                    int i3 = i;
                    if (i3 > 0) {
                        i2 += i3;
                    }
                    if (i2 != RecyclerListener.this.recyclerView.getPaddingBottom()) {
                        RecyclerListener.this.recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, i2);
                        RecyclerListener.this.scrollToBottom(1);
                    }
                }
            });
        }

        @Override // p000.InterfaceC32011Bs2
        public void onInserted(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeChanged(i, i2);
            postScrollToBottom(3);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 < i8) {
                postScrollToBottom(1);
            }
        }

        @Override // p000.InterfaceC32011Bs2
        public void onMoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemMoved(i, i2);
        }

        @Override // p000.InterfaceC32011Bs2
        public void onRemoved(int i, int i2) {
            this.recyclerView.getAdapter().notifyItemRangeRemoved(i, i2);
        }
    }

    /* loaded from: classes8.dex */
    public static class RequestItemAnimator extends C11894g {
        private final ComponentRequestAdapter component;

        public RequestItemAnimator(ComponentRequestAdapter componentRequestAdapter) {
            this.component = componentRequestAdapter;
            setSupportsChangeAnimations(false);
        }

        @Override // androidx.recyclerview.widget.AbstractC11952u, androidx.recyclerview.widget.RecyclerView.AbstractC11849m
        public boolean canReuseUpdatedViewHolder(RecyclerView.AbstractC11834D abstractC11834D) {
            if (this.component.getMessageForPos(abstractC11834D.getAdapterPosition()) instanceof CellType.Attachment) {
                return true;
            }
            return super.canReuseUpdatedViewHolder(abstractC11834D);
        }
    }

    public RequestViewConversationsEnabled(Context context) {
        super(context);
        viewInit(context);
    }

    private Subscription bindComponents(Store store) {
        return CombinedSubscription.from(bindMessageComposer(store), bindRecycler(store), bindDialogComponent(store));
    }

    private Subscription bindDialogComponent(Store store) {
        return store.addListener(StateUi.class, new ComponentDialog(this.activity, this.f122000af, store));
    }

    private Subscription bindMessageComposer(Store store) {
        ComponentMessageComposer componentMessageComposer = new ComponentMessageComposer(this.activity, this.imageStream, this.messageComposerView, store, this.f122000af);
        this.messageComposerComponent = componentMessageComposer;
        return store.addListener(componentMessageComposer.getSelector(), this.messageComposerComponent);
    }

    private Subscription bindRecycler(Store store) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.activity);
        RecyclerListener recyclerListener = new RecyclerListener(this.recyclerView, linearLayoutManager);
        ComponentRequestAdapter componentRequestAdapter = new ComponentRequestAdapter(recyclerListener, this.cellFactory, this.recyclerView);
        CellMarginDecorator cellMarginDecorator = new CellMarginDecorator(componentRequestAdapter, this.activity);
        RequestItemAnimator requestItemAnimator = new RequestItemAnimator(componentRequestAdapter);
        ComponentRequestAdapter.RequestAdapter requestAdapter = new ComponentRequestAdapter.RequestAdapter(componentRequestAdapter);
        this.recyclerView.setItemAnimator(requestItemAnimator);
        this.recyclerView.setLayoutManager(linearLayoutManager);
        this.recyclerView.addItemDecoration(cellMarginDecorator);
        this.recyclerView.setAdapter(requestAdapter);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.messageComposerView.setOnHeightChangeListener(recyclerListener);
        this.messageComposerView.addOnFocusChangeListener(recyclerListener);
        this.recyclerView.addOnLayoutChangeListener(recyclerListener);
        return store.addListener(componentRequestAdapter.getSelector(), componentRequestAdapter);
    }

    private void bindViews() {
        this.imageStream = BelvedereUi.m865b(this.activity);
        this.recyclerView = (RecyclerView) findViewById(C35181Pg4.activity_request_recycler_view);
        this.messageComposerView = (ViewMessageComposer) findViewById(C35181Pg4.activity_request_message_composer);
        this.toolbarContainer = this.activity.findViewById(C35181Pg4.activity_request_appbar);
        this.toolbar = this.activity.findViewById(C35181Pg4.activity_request_toolbar);
        this.messageComposerView.init(this.imageStream);
        installDragAnimation();
    }

    private void installDragAnimation() {
        ImagePickerDragAnimation imagePickerDragAnimation = new ImagePickerDragAnimation(this.toolbarContainer, this.messageComposerView, this.recyclerView, this.toolbar);
        this.imagePickerDragAnimation = imagePickerDragAnimation;
        this.imageStream.m743t8(imagePickerDragAnimation);
    }

    private void viewInit(Context context) {
        View.inflate(context, C52975zk4.zs_view_request_conversations_enabled, this);
        this.activity = (AppCompatActivity) context;
    }

    @Override // zendesk.support.request.RequestView
    public boolean hasUnsavedInput() {
        ComponentMessageComposer componentMessageComposer = this.messageComposerComponent;
        return componentMessageComposer != null && componentMessageComposer.hasUnsavedInput();
    }

    @Override // zendesk.support.request.RequestView
    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    public void init(RequestComponent requestComponent, boolean z) {
        requestComponent.inject(this);
        bindViews();
        Subscription bindComponents = bindComponents(this.store);
        this.subscription = bindComponents;
        bindComponents.informWithCurrentState();
        if (z) {
            this.store.dispatch(this.f122000af.loadCommentsFromCacheAsync());
            this.store.dispatch(this.f122000af.loadRequestAsync());
            this.store.dispatch(this.f122000af.initialLoadCommentsAsync());
            this.messageComposerView.requestFocusForInput();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription = this.subscription;
        if (subscription != null) {
            subscription.removeListener();
        }
    }

    @Override // zendesk.support.request.RequestView
    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        viewInit(context);
    }

    public RequestViewConversationsEnabled(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        viewInit(context);
    }
}
