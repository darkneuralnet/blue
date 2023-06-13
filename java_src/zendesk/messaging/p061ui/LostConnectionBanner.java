package zendesk.messaging.p061ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C12054b;
import androidx.transition.C12055c;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.messaging.ConnectionState;
import zendesk.messaging.R$id;
import zendesk.messaging.R$string;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zendesk.messaging.ui.LostConnectionBanner */
/* loaded from: classes8.dex */
public class LostConnectionBanner {
    private final AnimatorSet hideAnimation;
    private final View lostConnectionBanner;
    private final Button lostConnectionButton;
    private final TextView lostConnectionTextView;
    private View.OnClickListener onRetryConnectionClickListener;
    private final ViewGroup rootView;
    private final TransitionSet showAnimation;
    private State state = State.EXITED;
    private final AtomicReference<ConnectionState> currentConnectionState = new AtomicReference<>(ConnectionState.DISCONNECTED);

    /* renamed from: zendesk.messaging.ui.LostConnectionBanner$5 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C312155 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$ConnectionState;
        static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State = iArr;
            try {
                iArr[State.ENTERING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[State.ENTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[State.EXITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[State.EXITING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConnectionState.values().length];
            $SwitchMap$zendesk$messaging$ConnectionState = iArr2;
            try {
                iArr2[ConnectionState.RECONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$zendesk$messaging$ConnectionState[ConnectionState.UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$zendesk$messaging$ConnectionState[ConnectionState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$zendesk$messaging$ConnectionState[ConnectionState.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$zendesk$messaging$ConnectionState[ConnectionState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$zendesk$messaging$ConnectionState[ConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: zendesk.messaging.ui.LostConnectionBanner$State */
    /* loaded from: classes8.dex */
    public enum State {
        ENTERING,
        ENTERED,
        EXITING,
        EXITED
    }

    private LostConnectionBanner(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox, View view) {
        this.rootView = viewGroup;
        this.lostConnectionBanner = view;
        this.lostConnectionTextView = (TextView) view.findViewById(R$id.zui_lost_connection_label);
        int i = R$id.zui_lost_connection_button;
        this.lostConnectionButton = (Button) view.findViewById(i);
        view.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: zendesk.messaging.ui.LostConnectionBanner.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (LostConnectionBanner.this.onRetryConnectionClickListener != null) {
                    LostConnectionBanner.this.onRetryConnectionClickListener.onClick(view2);
                }
            }
        });
        TransitionSet mo65845s0 = new TransitionSet().m65861M0(0).m65869C0(new Slide(48)).mo65845s0(new DecelerateInterpolator());
        long j = MessagingView.DEFAULT_ANIMATION_DURATION;
        this.showAnimation = mo65845s0.mo65847q0(j).mo65857d(new C12054b(recyclerView, view, inputBox) { // from class: zendesk.messaging.ui.LostConnectionBanner.2
            final int originalPaddingTop;
            final /* synthetic */ InputBox val$inputBox;
            final /* synthetic */ View val$lostConnectionBanner;
            final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$recyclerView = recyclerView;
                this.val$lostConnectionBanner = view;
                this.val$inputBox = inputBox;
                this.originalPaddingTop = recyclerView.getPaddingTop();
            }

            @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
            public void onTransitionEnd(Transition transition) {
                RecyclerView recyclerView2 = this.val$recyclerView;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.val$recyclerView.getPaddingTop() + this.val$lostConnectionBanner.getHeight(), this.val$recyclerView.getPaddingRight(), Math.max(this.val$inputBox.getHeight(), (this.val$recyclerView.getHeight() - this.val$recyclerView.computeVerticalScrollRange()) - this.originalPaddingTop));
                LostConnectionBanner.this.state = State.ENTERED;
            }

            @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
            public void onTransitionStart(Transition transition) {
                LostConnectionBanner.this.state = State.ENTERING;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideAnimation = animatorSet;
        int i2 = marginLayoutParams.topMargin;
        animatorSet.playTogether(ValueAnimators.topPaddingAnimator(recyclerView, recyclerView.getPaddingTop(), recyclerView.getPaddingTop() - view.getHeight(), j), ValueAnimators.topMarginAnimator(view, i2, i2 - view.getHeight(), j));
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter(marginLayoutParams, recyclerView, view, inputBox) { // from class: zendesk.messaging.ui.LostConnectionBanner.3
            private final int originalMargin;
            private final int originalPaddingBottom;
            final /* synthetic */ InputBox val$inputBox;
            final /* synthetic */ View val$lostConnectionBanner;
            final /* synthetic */ ViewGroup.MarginLayoutParams val$params;
            final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$params = marginLayoutParams;
                this.val$recyclerView = recyclerView;
                this.val$lostConnectionBanner = view;
                this.val$inputBox = inputBox;
                this.originalMargin = marginLayoutParams.topMargin;
                this.originalPaddingBottom = recyclerView.getPaddingBottom();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = this.val$params;
                marginLayoutParams2.topMargin = this.originalMargin;
                this.val$lostConnectionBanner.setLayoutParams(marginLayoutParams2);
                this.val$lostConnectionBanner.setVisibility(8);
                RecyclerView recyclerView2 = this.val$recyclerView;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.val$recyclerView.getPaddingTop(), this.val$recyclerView.getPaddingRight(), this.originalPaddingBottom + this.val$inputBox.getHeight());
                LostConnectionBanner.this.state = State.EXITED;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LostConnectionBanner.this.state = State.EXITING;
            }
        });
    }

    public static LostConnectionBanner create(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox) {
        return new LostConnectionBanner(viewGroup, recyclerView, inputBox, viewGroup.findViewById(R$id.zui_lost_connection_view));
    }

    public void hide() {
        int i = C312155.$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i != 1) {
            if (i != 3 && i != 4) {
                this.hideAnimation.start();
                return;
            }
            return;
        }
        this.showAnimation.mo65857d(new C12054b() { // from class: zendesk.messaging.ui.LostConnectionBanner.4
            @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
            public void onTransitionEnd(Transition transition) {
                LostConnectionBanner.this.hide();
                LostConnectionBanner.this.showAnimation.mo65854h0(this);
            }
        });
    }

    public void setOnRetryConnectionClickListener(View.OnClickListener onClickListener) {
        this.onRetryConnectionClickListener = onClickListener;
    }

    public void show() {
        int i = C312155.$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i != 1 && i != 2) {
            C12055c.m65804b(this.rootView, this.showAnimation);
            this.lostConnectionBanner.setVisibility(0);
        }
    }

    public void update(ConnectionState connectionState) {
        if (this.currentConnectionState.getAndSet(connectionState) == connectionState) {
            return;
        }
        switch (C312155.$SwitchMap$zendesk$messaging$ConnectionState[connectionState.ordinal()]) {
            case 1:
                this.lostConnectionTextView.setText(R$string.zui_label_reconnecting);
                this.lostConnectionButton.setVisibility(8);
                show();
                return;
            case 2:
                this.lostConnectionTextView.setText(R$string.zui_label_reconnecting_failed);
                this.lostConnectionButton.setVisibility(8);
                show();
                return;
            case 3:
                this.lostConnectionTextView.setText(R$string.zui_label_reconnecting_failed);
                this.lostConnectionButton.setVisibility(0);
                show();
                return;
            case 4:
            case 5:
            case 6:
                hide();
                return;
            default:
                return;
        }
    }
}
