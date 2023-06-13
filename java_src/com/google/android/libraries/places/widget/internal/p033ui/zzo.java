package com.google.android.libraries.places.widget.internal.p033ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.C17646R;
import com.google.android.libraries.places.internal.zzev;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.libraries.places.widget.internal.ui.zzo */
/* loaded from: classes6.dex */
public final class zzo extends C11894g {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(C17646R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        this.zzc.add(abstractC11834D);
        long moveDuration = getMoveDuration();
        int layoutPosition = abstractC11834D.getLayoutPosition();
        view.setTranslationY(-this.zzd);
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new C34269Lj1()).setStartDelay(moveDuration + (layoutPosition * 67));
        animate.setListener(new zzn(this, view, abstractC11834D, animate)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.C11894g, androidx.recyclerview.widget.AbstractC11952u
    public final boolean animateAdd(RecyclerView.AbstractC11834D abstractC11834D) {
        try {
            endAnimation(abstractC11834D);
            abstractC11834D.itemView.setAlpha(0.0f);
            if (((zzs) abstractC11834D).zzb()) {
                this.zza.add(abstractC11834D);
                return true;
            }
            this.zzb.add(abstractC11834D);
            return true;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C11894g, androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public final void endAnimation(RecyclerView.AbstractC11834D abstractC11834D) {
        try {
            super.endAnimation(abstractC11834D);
            if (this.zza.remove(abstractC11834D)) {
                zzf(abstractC11834D.itemView);
                dispatchAddFinished(abstractC11834D);
            }
            zze();
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C11894g, androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public final void endAnimations() {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.AbstractC11834D abstractC11834D = (RecyclerView.AbstractC11834D) this.zza.get(size);
                zzf(abstractC11834D.itemView);
                dispatchAddFinished(abstractC11834D);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((RecyclerView.AbstractC11834D) list.get(size2)).itemView.animate().cancel();
                } else {
                    super.endAnimations();
                    return;
                }
            }
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C11894g, androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public final boolean isRunning() {
        try {
            if (!super.isRunning() && this.zzb.isEmpty() && this.zza.isEmpty()) {
                if (this.zzc.isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.C11894g, androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public final void runPendingAnimations() {
        try {
            for (RecyclerView.AbstractC11834D abstractC11834D : this.zzb) {
                super.animateAdd(abstractC11834D);
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (!this.zza.isEmpty()) {
                ArrayList<RecyclerView.AbstractC11834D> arrayList = new ArrayList(this.zza);
                this.zza.clear();
                for (RecyclerView.AbstractC11834D abstractC11834D2 : arrayList) {
                    View view = abstractC11834D2.itemView;
                    this.zzc.add(abstractC11834D2);
                    long moveDuration = getMoveDuration() + (abstractC11834D2.getLayoutPosition() * 67);
                    view.setTranslationY(-this.zzd);
                    view.setAlpha(0.0f);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new C34269Lj1()).setStartDelay(moveDuration);
                    animate.setListener(new zzn(this, view, abstractC11834D2, animate)).start();
                }
            }
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }
}
