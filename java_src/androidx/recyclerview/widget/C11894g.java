package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C11894g extends AbstractC11952u {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.AbstractC11834D> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.AbstractC11834D> mPendingAdditions = new ArrayList<>();
    private ArrayList<C11904j> mPendingMoves = new ArrayList<>();
    private ArrayList<C11903i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.AbstractC11834D>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<C11904j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<C11903i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC11834D> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC11834D> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC11834D> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC11834D> mChangeAnimations = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes.dex */
    public class RunnableC11895a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f55393b;

        public RunnableC11895a(ArrayList arrayList) {
            this.f55393b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f55393b.iterator();
            while (it.hasNext()) {
                C11904j c11904j = (C11904j) it.next();
                C11894g.this.animateMoveImpl(c11904j.f55427a, c11904j.f55428b, c11904j.f55429c, c11904j.f55430d, c11904j.f55431e);
            }
            this.f55393b.clear();
            C11894g.this.mMovesList.remove(this.f55393b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* loaded from: classes.dex */
    public class RunnableC11896b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f55395b;

        public RunnableC11896b(ArrayList arrayList) {
            this.f55395b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f55395b.iterator();
            while (it.hasNext()) {
                C11894g.this.animateChangeImpl((C11903i) it.next());
            }
            this.f55395b.clear();
            C11894g.this.mChangesList.remove(this.f55395b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* loaded from: classes.dex */
    public class RunnableC11897c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f55397b;

        public RunnableC11897c(ArrayList arrayList) {
            this.f55397b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f55397b.iterator();
            while (it.hasNext()) {
                C11894g.this.animateAddImpl((RecyclerView.AbstractC11834D) it.next());
            }
            this.f55397b.clear();
            C11894g.this.mAdditionsList.remove(this.f55397b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* loaded from: classes.dex */
    public class C11898d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f55399a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f55400b;

        /* renamed from: c */
        public final /* synthetic */ View f55401c;

        public C11898d(RecyclerView.AbstractC11834D abstractC11834D, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f55399a = abstractC11834D;
            this.f55400b = viewPropertyAnimator;
            this.f55401c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55400b.setListener(null);
            this.f55401c.setAlpha(1.0f);
            C11894g.this.dispatchRemoveFinished(this.f55399a);
            C11894g.this.mRemoveAnimations.remove(this.f55399a);
            C11894g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11894g.this.dispatchRemoveStarting(this.f55399a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    /* loaded from: classes.dex */
    public class C11899e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f55403a;

        /* renamed from: b */
        public final /* synthetic */ View f55404b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f55405c;

        public C11899e(RecyclerView.AbstractC11834D abstractC11834D, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f55403a = abstractC11834D;
            this.f55404b = view;
            this.f55405c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f55404b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55405c.setListener(null);
            C11894g.this.dispatchAddFinished(this.f55403a);
            C11894g.this.mAddAnimations.remove(this.f55403a);
            C11894g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11894g.this.dispatchAddStarting(this.f55403a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    /* loaded from: classes.dex */
    public class C11900f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f55407a;

        /* renamed from: b */
        public final /* synthetic */ int f55408b;

        /* renamed from: c */
        public final /* synthetic */ View f55409c;

        /* renamed from: d */
        public final /* synthetic */ int f55410d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f55411e;

        public C11900f(RecyclerView.AbstractC11834D abstractC11834D, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f55407a = abstractC11834D;
            this.f55408b = i;
            this.f55409c = view;
            this.f55410d = i2;
            this.f55411e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f55408b != 0) {
                this.f55409c.setTranslationX(0.0f);
            }
            if (this.f55410d != 0) {
                this.f55409c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55411e.setListener(null);
            C11894g.this.dispatchMoveFinished(this.f55407a);
            C11894g.this.mMoveAnimations.remove(this.f55407a);
            C11894g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11894g.this.dispatchMoveStarting(this.f55407a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    /* loaded from: classes.dex */
    public class C11901g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C11903i f55413a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f55414b;

        /* renamed from: c */
        public final /* synthetic */ View f55415c;

        public C11901g(C11903i c11903i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f55413a = c11903i;
            this.f55414b = viewPropertyAnimator;
            this.f55415c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55414b.setListener(null);
            this.f55415c.setAlpha(1.0f);
            this.f55415c.setTranslationX(0.0f);
            this.f55415c.setTranslationY(0.0f);
            C11894g.this.dispatchChangeFinished(this.f55413a.f55421a, true);
            C11894g.this.mChangeAnimations.remove(this.f55413a.f55421a);
            C11894g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11894g.this.dispatchChangeStarting(this.f55413a.f55421a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    /* loaded from: classes.dex */
    public class C11902h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C11903i f55417a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f55418b;

        /* renamed from: c */
        public final /* synthetic */ View f55419c;

        public C11902h(C11903i c11903i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f55417a = c11903i;
            this.f55418b = viewPropertyAnimator;
            this.f55419c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55418b.setListener(null);
            this.f55419c.setAlpha(1.0f);
            this.f55419c.setTranslationX(0.0f);
            this.f55419c.setTranslationY(0.0f);
            C11894g.this.dispatchChangeFinished(this.f55417a.f55422b, false);
            C11894g.this.mChangeAnimations.remove(this.f55417a.f55422b);
            C11894g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C11894g.this.dispatchChangeStarting(this.f55417a.f55422b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$j */
    /* loaded from: classes.dex */
    public static class C11904j {

        /* renamed from: a */
        public RecyclerView.AbstractC11834D f55427a;

        /* renamed from: b */
        public int f55428b;

        /* renamed from: c */
        public int f55429c;

        /* renamed from: d */
        public int f55430d;

        /* renamed from: e */
        public int f55431e;

        public C11904j(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
            this.f55427a = abstractC11834D;
            this.f55428b = i;
            this.f55429c = i2;
            this.f55430d = i3;
            this.f55431e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(abstractC11834D);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C11898d(abstractC11834D, animate, view)).start();
    }

    private void endChangeAnimation(List<C11903i> list, RecyclerView.AbstractC11834D abstractC11834D) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C11903i c11903i = list.get(size);
            if (endChangeAnimationIfNecessary(c11903i, abstractC11834D) && c11903i.f55421a == null && c11903i.f55422b == null) {
                list.remove(c11903i);
            }
        }
    }

    private void endChangeAnimationIfNecessary(C11903i c11903i) {
        RecyclerView.AbstractC11834D abstractC11834D = c11903i.f55421a;
        if (abstractC11834D != null) {
            endChangeAnimationIfNecessary(c11903i, abstractC11834D);
        }
        RecyclerView.AbstractC11834D abstractC11834D2 = c11903i.f55422b;
        if (abstractC11834D2 != null) {
            endChangeAnimationIfNecessary(c11903i, abstractC11834D2);
        }
    }

    private void resetAnimation(RecyclerView.AbstractC11834D abstractC11834D) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        abstractC11834D.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(abstractC11834D);
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.AbstractC11834D abstractC11834D) {
        resetAnimation(abstractC11834D);
        abstractC11834D.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(abstractC11834D);
        return true;
    }

    public void animateAddImpl(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(abstractC11834D);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C11899e(abstractC11834D, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, int i, int i2, int i3, int i4) {
        if (abstractC11834D == abstractC11834D2) {
            return animateMove(abstractC11834D, i, i2, i3, i4);
        }
        float translationX = abstractC11834D.itemView.getTranslationX();
        float translationY = abstractC11834D.itemView.getTranslationY();
        float alpha = abstractC11834D.itemView.getAlpha();
        resetAnimation(abstractC11834D);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC11834D.itemView.setTranslationX(translationX);
        abstractC11834D.itemView.setTranslationY(translationY);
        abstractC11834D.itemView.setAlpha(alpha);
        if (abstractC11834D2 != null) {
            resetAnimation(abstractC11834D2);
            abstractC11834D2.itemView.setTranslationX(-i5);
            abstractC11834D2.itemView.setTranslationY(-i6);
            abstractC11834D2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new C11903i(abstractC11834D, abstractC11834D2, i, i2, i3, i4));
        return true;
    }

    public void animateChangeImpl(C11903i c11903i) {
        View view;
        RecyclerView.AbstractC11834D abstractC11834D = c11903i.f55421a;
        View view2 = null;
        if (abstractC11834D == null) {
            view = null;
        } else {
            view = abstractC11834D.itemView;
        }
        RecyclerView.AbstractC11834D abstractC11834D2 = c11903i.f55422b;
        if (abstractC11834D2 != null) {
            view2 = abstractC11834D2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(c11903i.f55421a);
            duration.translationX(c11903i.f55425e - c11903i.f55423c);
            duration.translationY(c11903i.f55426f - c11903i.f55424d);
            duration.alpha(0.0f).setListener(new C11901g(c11903i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(c11903i.f55422b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C11902h(c11903i, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
        View view = abstractC11834D.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC11834D.itemView.getTranslationY());
        resetAnimation(abstractC11834D);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(abstractC11834D);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.mPendingMoves.add(new C11904j(abstractC11834D, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
        View view = abstractC11834D.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(abstractC11834D);
        animate.setDuration(getMoveDuration()).setListener(new C11900f(abstractC11834D, i5, view, i6, animate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.AbstractC11834D abstractC11834D) {
        resetAnimation(abstractC11834D);
        this.mPendingRemovals.add(abstractC11834D);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean canReuseUpdatedViewHolder(RecyclerView.AbstractC11834D abstractC11834D, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(abstractC11834D, list);
    }

    public void cancelAll(List<RecyclerView.AbstractC11834D> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f55427a == abstractC11834D) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(abstractC11834D);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, abstractC11834D);
        if (this.mPendingRemovals.remove(abstractC11834D)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(abstractC11834D);
        }
        if (this.mPendingAdditions.remove(abstractC11834D)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(abstractC11834D);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<C11903i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, abstractC11834D);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<C11904j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f55427a == abstractC11834D) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(abstractC11834D);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(abstractC11834D)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(abstractC11834D);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(abstractC11834D);
        this.mAddAnimations.remove(abstractC11834D);
        this.mChangeAnimations.remove(abstractC11834D);
        this.mMoveAnimations.remove(abstractC11834D);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C11904j c11904j = this.mPendingMoves.get(size);
            View view = c11904j.f55427a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c11904j.f55427a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC11834D abstractC11834D = this.mPendingAdditions.get(size3);
            abstractC11834D.itemView.setAlpha(1.0f);
            dispatchAddFinished(abstractC11834D);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
            ArrayList<C11904j> arrayList = this.mMovesList.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C11904j c11904j2 = arrayList.get(size6);
                View view2 = c11904j2.f55427a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(c11904j2.f55427a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.mMovesList.remove(arrayList);
                }
            }
        }
        for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList2 = this.mAdditionsList.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.AbstractC11834D abstractC11834D2 = arrayList2.get(size8);
                abstractC11834D2.itemView.setAlpha(1.0f);
                dispatchAddFinished(abstractC11834D2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.mAdditionsList.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
            ArrayList<C11903i> arrayList3 = this.mChangesList.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                endChangeAnimationIfNecessary(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.mChangesList.remove(arrayList3);
                }
            }
        }
        cancelAll(this.mRemoveAnimations);
        cancelAll(this.mMoveAnimations);
        cancelAll(this.mAddAnimations);
        cancelAll(this.mChangeAnimations);
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean isRunning() {
        if (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.AbstractC11834D> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (z2) {
            ArrayList<C11904j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            RunnableC11895a runnableC11895a = new RunnableC11895a(arrayList);
            if (z) {
                C38790bq6.m62466o0(arrayList.get(0).f55427a.itemView, runnableC11895a, getRemoveDuration());
            } else {
                runnableC11895a.run();
            }
        }
        if (z3) {
            ArrayList<C11903i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            RunnableC11896b runnableC11896b = new RunnableC11896b(arrayList2);
            if (z) {
                C38790bq6.m62466o0(arrayList2.get(0).f55421a.itemView, runnableC11896b, getRemoveDuration());
            } else {
                runnableC11896b.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.mPendingAdditions);
            this.mAdditionsList.add(arrayList3);
            this.mPendingAdditions.clear();
            RunnableC11897c runnableC11897c = new RunnableC11897c(arrayList3);
            if (!z && !z2 && !z3) {
                runnableC11897c.run();
                return;
            }
            long j3 = 0;
            if (z) {
                j = getRemoveDuration();
            } else {
                j = 0;
            }
            if (z2) {
                j2 = getMoveDuration();
            } else {
                j2 = 0;
            }
            if (z3) {
                j3 = getChangeDuration();
            }
            C38790bq6.m62466o0(arrayList3.get(0).itemView, runnableC11897c, j + Math.max(j2, j3));
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    /* loaded from: classes.dex */
    public static class C11903i {

        /* renamed from: a */
        public RecyclerView.AbstractC11834D f55421a;

        /* renamed from: b */
        public RecyclerView.AbstractC11834D f55422b;

        /* renamed from: c */
        public int f55423c;

        /* renamed from: d */
        public int f55424d;

        /* renamed from: e */
        public int f55425e;

        /* renamed from: f */
        public int f55426f;

        public C11903i(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2) {
            this.f55421a = abstractC11834D;
            this.f55422b = abstractC11834D2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f55421a + ", newHolder=" + this.f55422b + ", fromX=" + this.f55423c + ", fromY=" + this.f55424d + ", toX=" + this.f55425e + ", toY=" + this.f55426f + CoreConstants.CURLY_RIGHT;
        }

        public C11903i(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, int i, int i2, int i3, int i4) {
            this(abstractC11834D, abstractC11834D2);
            this.f55423c = i;
            this.f55424d = i2;
            this.f55425e = i3;
            this.f55426f = i4;
        }
    }

    private boolean endChangeAnimationIfNecessary(C11903i c11903i, RecyclerView.AbstractC11834D abstractC11834D) {
        boolean z = false;
        if (c11903i.f55422b == abstractC11834D) {
            c11903i.f55422b = null;
        } else if (c11903i.f55421a != abstractC11834D) {
            return false;
        } else {
            c11903i.f55421a = null;
            z = true;
        }
        abstractC11834D.itemView.setAlpha(1.0f);
        abstractC11834D.itemView.setTranslationX(0.0f);
        abstractC11834D.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(abstractC11834D, z);
        return true;
    }
}
