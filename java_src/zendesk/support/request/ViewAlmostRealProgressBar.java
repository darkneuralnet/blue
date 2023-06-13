package zendesk.support.request;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public class ViewAlmostRealProgressBar extends ProgressBar {
    public static final long ALPHA_FADE_DURATION = 100;
    public static final long START_DEBOUNCE_TIME = 100;
    public static final long STOP_ANIMATION_DURATION = 300;
    public static final long STOP_DEBOUNCE_TIME = 200;
    private StateAwareAnimator finishAnimator;
    private Handler handler;
    private StateAwareAnimator progressAnimator;
    private Runnable startDebounceRunnable;
    private List<Step> steps;
    private Runnable stopDebounceRunnable;
    public static final List<Step> SIMPLE_PROGRESSBAR = Collections.singletonList(new Step(60, 4000));
    public static final List<Step> DONT_STOP_MOVING = Arrays.asList(new Step(60, 4000), new Step(90, 15000));

    /* loaded from: classes8.dex */
    public static class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: zendesk.support.request.ViewAlmostRealProgressBar.State.1
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        private final int progress;
        private final List<Step> steps;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.progress);
            parcel.writeTypedList(this.steps);
        }

        public State(Parcelable parcelable, int i, List<Step> list) {
            super(parcelable);
            this.progress = i;
            this.steps = list;
        }

        private State(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            this.steps = arrayList;
            parcel.readTypedList(arrayList, Step.CREATOR);
        }
    }

    /* loaded from: classes8.dex */
    public static class StateAwareAnimator extends AnimatorListenerAdapter {
        private final Animator animatorSet;
        private boolean started = false;
        private boolean ended = false;

        public StateAwareAnimator(Animator animator) {
            this.animatorSet = animator;
            animator.addListener(this);
        }

        public Animator get() {
            return this.animatorSet;
        }

        public boolean isEnded() {
            return this.ended;
        }

        public boolean isStarted() {
            return this.started;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.started = true;
            this.ended = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.started = true;
            this.ended = false;
        }
    }

    /* loaded from: classes8.dex */
    public static class Step implements Parcelable, Comparable<Step> {
        public static final Parcelable.Creator<Step> CREATOR = new Parcelable.Creator<Step>() { // from class: zendesk.support.request.ViewAlmostRealProgressBar.Step.1
            @Override // android.os.Parcelable.Creator
            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Step[] newArray(int i) {
                return new Step[i];
            }
        };
        private final int target;
        private final long time;

        public Step(int i, long j) {
            this.target = i;
            this.time = j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.target);
            parcel.writeLong(this.time);
        }

        @Override // java.lang.Comparable
        public int compareTo(Step step) {
            return this.target - step.target;
        }

        public Step(Parcel parcel) {
            this.target = parcel.readInt();
            this.time = parcel.readLong();
        }
    }

    public ViewAlmostRealProgressBar(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private Step adjustTime(int i, int i2, Step step) {
        float f = i - i2;
        return new Step(step.target, ((float) step.time) * (1.0f - (f / (step.target - i2))));
    }

    private StateAwareAnimator endAnimation(long j) {
        Animator progressAnimator = progressAnimator(getProgress(), 100, j);
        Animator progressBarAlphaAnimator = progressBarAlphaAnimator(1.0f, 0.0f, 100L);
        Animator progressAnimator2 = progressAnimator(100, 0, 0L);
        Animator progressBarAlphaAnimator2 = progressBarAlphaAnimator(0.0f, 1.0f, 0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(progressAnimator).before(progressBarAlphaAnimator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(progressAnimator2).before(progressBarAlphaAnimator2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(j);
        animatorSet3.play(animatorSet).before(animatorSet2);
        return new StateAwareAnimator(animatorSet3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishAnimation(long j) {
        StateAwareAnimator stateAwareAnimator = this.progressAnimator;
        if (stateAwareAnimator != null) {
            stateAwareAnimator.get().cancel();
            this.progressAnimator = null;
            StateAwareAnimator endAnimation = endAnimation(j);
            this.finishAnimator = endAnimation;
            endAnimation.get().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kickOffAnimation(List<Step> list, int i) {
        long j;
        if (this.progressAnimator == null) {
            StateAwareAnimator stateAwareAnimator = this.finishAnimator;
            if (stateAwareAnimator != null && stateAwareAnimator.isStarted() && !this.finishAnimator.isEnded()) {
                j = this.finishAnimator.get().getDuration();
            } else {
                j = 0;
            }
            this.finishAnimator = null;
            StateAwareAnimator startAnimation = startAnimation(list, i, j);
            this.progressAnimator = startAnimation;
            startAnimation.get().start();
        }
    }

    private Animator progressAnimator(int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }

    private Animator progressBarAlphaAnimator(float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", f, f2);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    private void restoreProgress(State state) {
        if (state.progress > 0) {
            ArrayList arrayList = new ArrayList(state.steps);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Step step : state.steps) {
                if (state.progress < step.target) {
                    arrayList2.add(step);
                } else {
                    i = step.target;
                }
            }
            if (C43505jm0.m29948i(arrayList2)) {
                arrayList2.add(0, adjustTime(state.progress, i, arrayList2.remove(0)));
            }
            kickOffAnimation(arrayList2, state.progress);
            this.steps = arrayList;
            return;
        }
        setProgress(0);
    }

    private StateAwareAnimator startAnimation(List<Step> list, int i, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step step : list) {
            Animator progressAnimator = progressAnimator(i, step.target, step.time);
            int i2 = step.target;
            arrayList.add(progressAnimator);
            i = i2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j);
        return new StateAwareAnimator(animatorSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            restoreProgress(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        if (this.progressAnimator != null && this.stopDebounceRunnable == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.steps);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    public void start(final List<Step> list) {
        Runnable runnable = this.stopDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.stopDebounceRunnable = null;
        } else if (this.startDebounceRunnable == null) {
            Runnable runnable2 = new Runnable() { // from class: zendesk.support.request.ViewAlmostRealProgressBar.1
                @Override // java.lang.Runnable
                public void run() {
                    ViewAlmostRealProgressBar.this.startDebounceRunnable = null;
                    List m29954c = C43505jm0.m29954c(list);
                    Collections.sort(m29954c);
                    ViewAlmostRealProgressBar.this.steps = m29954c;
                    ViewAlmostRealProgressBar viewAlmostRealProgressBar = ViewAlmostRealProgressBar.this;
                    viewAlmostRealProgressBar.kickOffAnimation(viewAlmostRealProgressBar.steps, 0);
                }
            };
            this.startDebounceRunnable = runnable2;
            this.handler.postDelayed(runnable2, 100L);
        }
    }

    public void stop(final long j) {
        Runnable runnable = this.startDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.startDebounceRunnable = null;
        } else if (this.stopDebounceRunnable == null) {
            Runnable runnable2 = new Runnable() { // from class: zendesk.support.request.ViewAlmostRealProgressBar.2
                @Override // java.lang.Runnable
                public void run() {
                    ViewAlmostRealProgressBar.this.stopDebounceRunnable = null;
                    ViewAlmostRealProgressBar.this.finishAnimation(j);
                }
            };
            this.stopDebounceRunnable = runnable2;
            this.handler.postDelayed(runnable2, 200L);
        }
    }

    public ViewAlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public ViewAlmostRealProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handler = new Handler(Looper.getMainLooper());
    }
}
