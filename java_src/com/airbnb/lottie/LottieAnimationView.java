package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: p */
    public static final String f68460p = "LottieAnimationView";

    /* renamed from: q */
    public static final VD2<Throwable> f68461q = new VD2() { // from class: oD2
        @Override // p000.VD2
        public final void onResult(Object obj) {
            LottieAnimationView.m53541w((Throwable) obj);
        }
    };

    /* renamed from: b */
    public final VD2<C47924rD2> f68462b;

    /* renamed from: c */
    public final VD2<Throwable> f68463c;

    /* renamed from: d */
    public VD2<Throwable> f68464d;

    /* renamed from: e */
    public int f68465e;

    /* renamed from: f */
    public final RD2 f68466f;

    /* renamed from: g */
    public String f68467g;

    /* renamed from: h */
    public int f68468h;

    /* renamed from: i */
    public boolean f68469i;

    /* renamed from: j */
    public boolean f68470j;

    /* renamed from: k */
    public boolean f68471k;

    /* renamed from: l */
    public final Set<EnumC16858b> f68472l;

    /* renamed from: m */
    public final Set<ZD2> f68473m;

    /* renamed from: n */
    public C39632dE2<C47924rD2> f68474n;

    /* renamed from: o */
    public C47924rD2 f68475o;

    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16856a();

        /* renamed from: b */
        public String f68476b;

        /* renamed from: c */
        public int f68477c;

        /* renamed from: d */
        public float f68478d;

        /* renamed from: e */
        public boolean f68479e;

        /* renamed from: f */
        public String f68480f;

        /* renamed from: g */
        public int f68481g;

        /* renamed from: h */
        public int f68482h;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        /* loaded from: classes2.dex */
        public class C16856a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C16857a c16857a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f68476b);
            parcel.writeFloat(this.f68478d);
            parcel.writeInt(this.f68479e ? 1 : 0);
            parcel.writeString(this.f68480f);
            parcel.writeInt(this.f68481g);
            parcel.writeInt(this.f68482h);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f68476b = parcel.readString();
            this.f68478d = parcel.readFloat();
            this.f68479e = parcel.readInt() == 1;
            this.f68480f = parcel.readString();
            this.f68481g = parcel.readInt();
            this.f68482h = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    /* loaded from: classes2.dex */
    public class C16857a implements VD2<Throwable> {
        public C16857a() {
        }

        @Override // p000.VD2
        /* renamed from: a */
        public void onResult(Throwable th) {
            VD2 vd2;
            if (LottieAnimationView.this.f68465e != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f68465e);
            }
            if (LottieAnimationView.this.f68464d == null) {
                vd2 = LottieAnimationView.f68461q;
            } else {
                vd2 = LottieAnimationView.this.f68464d;
            }
            vd2.onResult(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    /* loaded from: classes2.dex */
    public enum EnumC16858b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f68462b = new VD2() { // from class: nD2
            @Override // p000.VD2
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((C47924rD2) obj);
            }
        };
        this.f68463c = new C16857a();
        this.f68465e = 0;
        this.f68466f = new RD2();
        this.f68469i = false;
        this.f68470j = false;
        this.f68471k = true;
        this.f68472l = new HashSet();
        this.f68473m = new HashSet();
        m53545s(null, C49368tf4.lottieAnimationViewStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C38428bE2 m53543u(String str) throws Exception {
        if (this.f68471k) {
            return AD2.m115975l(getContext(), str);
        }
        return AD2.m115974m(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ C38428bE2 m53542v(int i) throws Exception {
        if (this.f68471k) {
            return AD2.m115966u(getContext(), i);
        }
        return AD2.m115965v(getContext(), i, null);
    }

    /* renamed from: w */
    public static /* synthetic */ void m53541w(Throwable th) {
        if (C33095Gi6.m104861k(th)) {
            C32524Dx2.m109585d("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    /* renamed from: A */
    public final void m53563A() {
        boolean m53544t = m53544t();
        setImageDrawable(null);
        setImageDrawable(this.f68466f);
        if (m53544t) {
            this.f68466f.m87040w0();
        }
    }

    /* renamed from: B */
    public final void m53562B(float f, boolean z) {
        if (z) {
            this.f68472l.add(EnumC16858b.SET_PROGRESS);
        }
        this.f68466f.m87099V0(f);
    }

    /* renamed from: i */
    public void m53555i(Animator.AnimatorListener animatorListener) {
        this.f68466f.m87051r(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof RD2) && ((RD2) drawable).m87104T() == EnumC47760qw4.SOFTWARE) {
            this.f68466f.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        RD2 rd2 = this.f68466f;
        if (drawable2 == rd2) {
            super.invalidateDrawable(rd2);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public void m53554j(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f68466f.m87049s(animatorUpdateListener);
    }

    /* renamed from: k */
    public <T> void m53553k(C31939Bk2 c31939Bk2, T t, C41410gE2<T> c41410gE2) {
        this.f68466f.m87047t(c31939Bk2, t, c41410gE2);
    }

    /* renamed from: l */
    public void m53552l() {
        this.f68472l.add(EnumC16858b.PLAY_OPTION);
        this.f68466f.m87041w();
    }

    /* renamed from: m */
    public final void m53551m() {
        C39632dE2<C47924rD2> c39632dE2 = this.f68474n;
        if (c39632dE2 != null) {
            c39632dE2.m44502j(this.f68462b);
            this.f68474n.m44503i(this.f68463c);
        }
    }

    /* renamed from: n */
    public final void m53550n() {
        this.f68475o = null;
        this.f68466f.m87039x();
    }

    /* renamed from: o */
    public void m53549o(boolean z) {
        this.f68466f.m87138C(z);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f68470j) {
            this.f68466f.m87046t0();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f68467g = savedState.f68476b;
        Set<EnumC16858b> set = this.f68472l;
        EnumC16858b enumC16858b = EnumC16858b.SET_ANIMATION;
        if (!set.contains(enumC16858b) && !TextUtils.isEmpty(this.f68467g)) {
            setAnimation(this.f68467g);
        }
        this.f68468h = savedState.f68477c;
        if (!this.f68472l.contains(enumC16858b) && (i = this.f68468h) != 0) {
            setAnimation(i);
        }
        if (!this.f68472l.contains(EnumC16858b.SET_PROGRESS)) {
            m53562B(savedState.f68478d, false);
        }
        if (!this.f68472l.contains(EnumC16858b.PLAY_OPTION) && savedState.f68479e) {
            m53539y();
        }
        if (!this.f68472l.contains(EnumC16858b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f68480f);
        }
        if (!this.f68472l.contains(EnumC16858b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f68481g);
        }
        if (!this.f68472l.contains(EnumC16858b.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.f68482h);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f68476b = this.f68467g;
        savedState.f68477c = this.f68468h;
        savedState.f68478d = this.f68466f.m87106S();
        savedState.f68479e = this.f68466f.m87086b0();
        savedState.f68480f = this.f68466f.m87116N();
        savedState.f68481g = this.f68466f.m87100V();
        savedState.f68482h = this.f68466f.m87102U();
        return savedState;
    }

    /* renamed from: p */
    public final C39632dE2<C47924rD2> m53548p(final String str) {
        if (isInEditMode()) {
            return new C39632dE2<>(new Callable() { // from class: pD2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C38428bE2 m53543u;
                    m53543u = LottieAnimationView.this.m53543u(str);
                    return m53543u;
                }
            }, true);
        }
        if (this.f68471k) {
            return AD2.m115977j(getContext(), str);
        }
        return AD2.m115976k(getContext(), str, null);
    }

    /* renamed from: q */
    public final C39632dE2<C47924rD2> m53547q(final int i) {
        if (isInEditMode()) {
            return new C39632dE2<>(new Callable() { // from class: mD2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C38428bE2 m53542v;
                    m53542v = LottieAnimationView.this.m53542v(i);
                    return m53542v;
                }
            }, true);
        }
        if (this.f68471k) {
            return AD2.m115968s(getContext(), i);
        }
        return AD2.m115967t(getContext(), i, null);
    }

    /* renamed from: r */
    public int m53546r() {
        return this.f68466f.m87120L();
    }

    /* renamed from: s */
    public final void m53545s(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C35226Pl4.LottieAnimationView, i, 0);
        this.f68471k = obtainStyledAttributes.getBoolean(C35226Pl4.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = C35226Pl4.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C35226Pl4.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C35226Pl4.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(C35226Pl4.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(C35226Pl4.LottieAnimationView_lottie_autoPlay, false)) {
            this.f68470j = true;
        }
        if (obtainStyledAttributes.getBoolean(C35226Pl4.LottieAnimationView_lottie_loop, false)) {
            this.f68466f.m87095X0(-1);
        }
        int i5 = C35226Pl4.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = C35226Pl4.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = C35226Pl4.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = C35226Pl4.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        int i9 = C35226Pl4.LottieAnimationView_lottie_defaultFontFileExtension;
        if (obtainStyledAttributes.hasValue(i9)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(i9));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C35226Pl4.LottieAnimationView_lottie_imageAssetsFolder));
        int i10 = C35226Pl4.LottieAnimationView_lottie_progress;
        m53562B(obtainStyledAttributes.getFloat(i10, 0.0f), obtainStyledAttributes.hasValue(i10));
        m53549o(obtainStyledAttributes.getBoolean(C35226Pl4.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i11 = C35226Pl4.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i11)) {
            m53553k(new C31939Bk2("**"), InterfaceC37835aE2.f50107K, new C41410gE2(new OA5(C29611vi.m8249a(getContext(), obtainStyledAttributes.getResourceId(i11, -1)).getDefaultColor())));
        }
        int i12 = C35226Pl4.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i12)) {
            EnumC47760qw4 enumC47760qw4 = EnumC47760qw4.AUTOMATIC;
            int i13 = obtainStyledAttributes.getInt(i12, enumC47760qw4.ordinal());
            if (i13 >= EnumC47760qw4.values().length) {
                i13 = enumC47760qw4.ordinal();
            }
            setRenderMode(EnumC47760qw4.values()[i13]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C35226Pl4.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        int i14 = C35226Pl4.LottieAnimationView_lottie_useCompositionFrameRate;
        if (obtainStyledAttributes.hasValue(i14)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i14, false));
        }
        obtainStyledAttributes.recycle();
        RD2 rd2 = this.f68466f;
        if (C33095Gi6.m104866f(getContext()) != 0.0f) {
            z = true;
        }
        rd2.m87085b1(Boolean.valueOf(z));
    }

    public void setAnimation(int i) {
        this.f68468h = i;
        this.f68467g = null;
        m53538z(m53547q(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        m53538z(this.f68471k ? AD2.m115964w(getContext(), str) : AD2.m115963x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f68466f.m87036y0(z);
    }

    public void setCacheComposition(boolean z) {
        this.f68471k = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f68466f.m87034z0(z);
    }

    public void setComposition(C47924rD2 c47924rD2) {
        if (C32416Dl2.f6279a) {
            String str = f68460p;
            Log.v(str, "Set Composition \n" + c47924rD2);
        }
        this.f68466f.setCallback(this);
        this.f68475o = c47924rD2;
        this.f68469i = true;
        boolean m87141A0 = this.f68466f.m87141A0(c47924rD2);
        this.f68469i = false;
        if (getDrawable() == this.f68466f && !m87141A0) {
            return;
        }
        if (!m87141A0) {
            m53563A();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (ZD2 zd2 : this.f68473m) {
            zd2.m73570a(c47924rD2);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f68466f.m87139B0(str);
    }

    public void setFailureListener(VD2<Throwable> vd2) {
        this.f68464d = vd2;
    }

    public void setFallbackResource(int i) {
        this.f68465e = i;
    }

    public void setFontAssetDelegate(C41827gw1 c41827gw1) {
        this.f68466f.m87137C0(c41827gw1);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f68466f.m87135D0(map);
    }

    public void setFrame(int i) {
        this.f68466f.m87133E0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f68466f.m87131F0(z);
    }

    public void setImageAssetDelegate(GW1 gw1) {
        this.f68466f.m87129G0(gw1);
    }

    public void setImageAssetsFolder(String str) {
        this.f68466f.m87127H0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m53551m();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m53551m();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m53551m();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f68466f.m87125I0(z);
    }

    public void setMaxFrame(int i) {
        this.f68466f.m87123J0(i);
    }

    public void setMaxProgress(float f) {
        this.f68466f.m87119L0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f68466f.m87115N0(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.f68466f.m87111P0(f, f2);
    }

    public void setMinFrame(int i) {
        this.f68466f.m87109Q0(i);
    }

    public void setMinProgress(float f) {
        this.f68466f.m87105S0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f68466f.m87103T0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f68466f.m87101U0(z);
    }

    public void setProgress(float f) {
        m53562B(f, true);
    }

    public void setRenderMode(EnumC47760qw4 enumC47760qw4) {
        this.f68466f.m87097W0(enumC47760qw4);
    }

    public void setRepeatCount(int i) {
        this.f68472l.add(EnumC16858b.SET_REPEAT_COUNT);
        this.f68466f.m87095X0(i);
    }

    public void setRepeatMode(int i) {
        this.f68472l.add(EnumC16858b.SET_REPEAT_MODE);
        this.f68466f.m87093Y0(i);
    }

    public void setSafeMode(boolean z) {
        this.f68466f.m87091Z0(z);
    }

    public void setSpeed(float f) {
        this.f68466f.m87088a1(f);
    }

    public void setTextDelegate(U06 u06) {
        this.f68466f.m87082c1(u06);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f68466f.m87079d1(z);
    }

    /* renamed from: t */
    public boolean m53544t() {
        return this.f68466f.m87089a0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        RD2 rd2;
        if (!this.f68469i && drawable == (rd2 = this.f68466f) && rd2.m87089a0()) {
            m53540x();
        } else if (!this.f68469i && (drawable instanceof RD2)) {
            RD2 rd22 = (RD2) drawable;
            if (rd22.m87089a0()) {
                rd22.m87048s0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: x */
    public void m53540x() {
        this.f68470j = false;
        this.f68466f.m87048s0();
    }

    /* renamed from: y */
    public void m53539y() {
        this.f68472l.add(EnumC16858b.PLAY_OPTION);
        this.f68466f.m87046t0();
    }

    /* renamed from: z */
    public final void m53538z(C39632dE2<C47924rD2> c39632dE2) {
        this.f68472l.add(EnumC16858b.SET_ANIMATION);
        m53550n();
        m53551m();
        this.f68474n = c39632dE2.m44508d(this.f68462b).m44509c(this.f68463c);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f68466f.m87121K0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f68466f.m87113O0(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f68466f.m87107R0(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f68466f.m87117M0(i, i2);
    }

    public void setAnimation(String str) {
        this.f68467g = str;
        this.f68468h = 0;
        m53538z(m53548p(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        m53538z(AD2.m115963x(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        m53538z(AD2.m115973n(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68462b = new VD2() { // from class: nD2
            @Override // p000.VD2
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((C47924rD2) obj);
            }
        };
        this.f68463c = new C16857a();
        this.f68465e = 0;
        this.f68466f = new RD2();
        this.f68469i = false;
        this.f68470j = false;
        this.f68471k = true;
        this.f68472l = new HashSet();
        this.f68473m = new HashSet();
        m53545s(attributeSet, C49368tf4.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68462b = new VD2() { // from class: nD2
            @Override // p000.VD2
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((C47924rD2) obj);
            }
        };
        this.f68463c = new C16857a();
        this.f68465e = 0;
        this.f68466f = new RD2();
        this.f68469i = false;
        this.f68470j = false;
        this.f68471k = true;
        this.f68472l = new HashSet();
        this.f68473m = new HashSet();
        m53545s(attributeSet, i);
    }
}
