package zendesk.commonui;

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
public class AlmostRealProgressBar extends ProgressBar {

    /* renamed from: h */
    public static final List<Step> f121892h = Arrays.asList(new Step(60, 4000), new Step(90, 15000));

    /* renamed from: b */
    public C31141c f121893b;

    /* renamed from: c */
    public C31141c f121894c;

    /* renamed from: d */
    public List<Step> f121895d;

    /* renamed from: e */
    public Handler f121896e;

    /* renamed from: f */
    public Runnable f121897f;

    /* renamed from: g */
    public Runnable f121898g;

    /* loaded from: classes8.dex */
    public static class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new C31137a();

        /* renamed from: b */
        public final int f121899b;

        /* renamed from: c */
        public final List<Step> f121900c;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$State$a */
        /* loaded from: classes8.dex */
        public class C31137a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public State[] newArray(int i) {
                return new State[i];
            }
        }

        public /* synthetic */ State(Parcel parcel, RunnableC31139a runnableC31139a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f121899b);
            parcel.writeTypedList(this.f121900c);
        }

        public State(Parcelable parcelable, int i, List<Step> list) {
            super(parcelable);
            this.f121899b = i;
            this.f121900c = list;
        }

        public State(Parcel parcel) {
            super(parcel);
            this.f121899b = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            this.f121900c = arrayList;
            parcel.readTypedList(arrayList, Step.CREATOR);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$a */
    /* loaded from: classes8.dex */
    public class RunnableC31139a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f121903b;

        public RunnableC31139a(List list) {
            this.f121903b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlmostRealProgressBar.this.f121898g = null;
            List m29954c = C43505jm0.m29954c(this.f121903b);
            Collections.sort(m29954c);
            AlmostRealProgressBar.this.f121895d = m29954c;
            AlmostRealProgressBar almostRealProgressBar = AlmostRealProgressBar.this;
            almostRealProgressBar.m637j(almostRealProgressBar.f121895d, 0);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$b */
    /* loaded from: classes8.dex */
    public class RunnableC31140b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f121905b;

        public RunnableC31140b(long j) {
            this.f121905b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlmostRealProgressBar.this.f121897f = null;
            AlmostRealProgressBar.this.m638i(this.f121905b);
        }
    }

    /* renamed from: zendesk.commonui.AlmostRealProgressBar$c */
    /* loaded from: classes8.dex */
    public static class C31141c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final Animator f121907a;

        /* renamed from: b */
        public boolean f121908b = false;

        /* renamed from: c */
        public boolean f121909c = false;

        public C31141c(Animator animator) {
            this.f121907a = animator;
            animator.addListener(this);
        }

        /* renamed from: a */
        public Animator m621a() {
            return this.f121907a;
        }

        /* renamed from: b */
        public boolean m620b() {
            return this.f121909c;
        }

        /* renamed from: c */
        public boolean m619c() {
            return this.f121908b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f121908b = false;
            this.f121909c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f121908b = false;
            this.f121909c = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f121908b = true;
            this.f121909c = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f121908b = true;
            this.f121909c = false;
        }
    }

    public AlmostRealProgressBar(Context context) {
        super(context);
        this.f121896e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: g */
    public final Step m640g(int i, int i2, Step step) {
        float f = i - i2;
        return new Step(step.f121901b, ((float) step.f121902c) * (1.0f - (f / (step.f121901b - i2))));
    }

    /* renamed from: h */
    public final C31141c m639h(long j) {
        Animator m636k = m636k(getProgress(), 100, j);
        Animator m635l = m635l(1.0f, 0.0f, 100L);
        Animator m636k2 = m636k(100, 0, 0L);
        Animator m635l2 = m635l(0.0f, 1.0f, 0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m636k).before(m635l);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(m636k2).before(m635l2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(j);
        animatorSet3.play(animatorSet).before(animatorSet2);
        return new C31141c(animatorSet3);
    }

    /* renamed from: i */
    public final void m638i(long j) {
        C31141c c31141c = this.f121893b;
        if (c31141c != null) {
            c31141c.m621a().cancel();
            this.f121893b = null;
            C31141c m639h = m639h(j);
            this.f121894c = m639h;
            m639h.m621a().start();
        }
    }

    /* renamed from: j */
    public final void m637j(List<Step> list, int i) {
        long j;
        if (this.f121893b == null) {
            C31141c c31141c = this.f121894c;
            if (c31141c != null && c31141c.m619c() && !this.f121894c.m620b()) {
                j = this.f121894c.m621a().getDuration();
            } else {
                j = 0;
            }
            this.f121894c = null;
            C31141c m632o = m632o(list, i, j);
            this.f121893b = m632o;
            m632o.m621a().start();
        }
    }

    /* renamed from: k */
    public final Animator m636k(int i, int i2, long j) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }

    /* renamed from: l */
    public final Animator m635l(float f, float f2, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", f, f2);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    /* renamed from: m */
    public final void m634m(State state) {
        if (state.f121899b > 0) {
            ArrayList arrayList = new ArrayList(state.f121900c);
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Step step : state.f121900c) {
                if (state.f121899b < step.f121901b) {
                    arrayList2.add(step);
                } else {
                    i = step.f121901b;
                }
            }
            if (C43505jm0.m29948i(arrayList2)) {
                arrayList2.add(0, m640g(state.f121899b, i, arrayList2.remove(0)));
            }
            m637j(arrayList2, state.f121899b);
            this.f121895d = arrayList;
            return;
        }
        setProgress(0);
    }

    /* renamed from: n */
    public void m633n(List<Step> list) {
        Runnable runnable = this.f121897f;
        if (runnable != null) {
            this.f121896e.removeCallbacks(runnable);
            this.f121897f = null;
        } else if (this.f121898g == null) {
            RunnableC31139a runnableC31139a = new RunnableC31139a(list);
            this.f121898g = runnableC31139a;
            this.f121896e.postDelayed(runnableC31139a, 100L);
        }
    }

    /* renamed from: o */
    public final C31141c m632o(List<Step> list, int i, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step step : list) {
            Animator m636k = m636k(i, step.f121901b, step.f121902c);
            int i2 = step.f121901b;
            arrayList.add(m636k);
            i = i2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j);
        return new C31141c(animatorSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            m634m(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        if (this.f121893b != null && this.f121897f == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.f121895d);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    /* renamed from: p */
    public void m631p(long j) {
        Runnable runnable = this.f121898g;
        if (runnable != null) {
            this.f121896e.removeCallbacks(runnable);
            this.f121898g = null;
        } else if (this.f121897f == null) {
            RunnableC31140b runnableC31140b = new RunnableC31140b(j);
            this.f121897f = runnableC31140b;
            this.f121896e.postDelayed(runnableC31140b, 200L);
        }
    }

    /* loaded from: classes8.dex */
    public static class Step implements Parcelable, Comparable<Step> {
        public static final Parcelable.Creator<Step> CREATOR = new C31138a();

        /* renamed from: b */
        public final int f121901b;

        /* renamed from: c */
        public final long f121902c;

        /* renamed from: zendesk.commonui.AlmostRealProgressBar$Step$a */
        /* loaded from: classes8.dex */
        public class C31138a implements Parcelable.Creator<Step> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Step[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(int i, long j) {
            this.f121901b = i;
            this.f121902c = j;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(Step step) {
            return this.f121901b - step.f121901b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f121901b);
            parcel.writeLong(this.f121902c);
        }

        public Step(Parcel parcel) {
            this.f121901b = parcel.readInt();
            this.f121902c = parcel.readLong();
        }
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121896e = new Handler(Looper.getMainLooper());
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121896e = new Handler(Looper.getMainLooper());
    }
}
