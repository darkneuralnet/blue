package com.guness.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.internal.NavigationMenuView;
import com.guness.widget.NavigationView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;B\u001b\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b:\u0010>B#\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010?\u001a\u00020\u0002¢\u0006\u0004\b:\u0010@J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0017J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\bH\u0007J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\b\u0010 \u001a\u00020\bH\u0002J\u0012\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010#R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006A"}, m28432d2 = {"Lcom/guness/widget/NavigationView;", "Lcom/google/android/material/navigation/NavigationView;", "", "res", "Landroid/view/View;", "k", "Landroid/net/Uri;", "uri", "", "setVideoBackground", "view", "setHeaderView", "LDB6;", "insets", C17296a.f69688o, "y", "index", "g", "v", "w", "setFooterView", "x", "u", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListener", "changedView", "visibility", "onVisibilityChanged", "widthSpec", "heightSpec", "onMeasure", "z", "footerView", "B", "Landroid/view/View;", "mHeader", "mFooter", "Landroid/widget/VideoView;", "A", "Landroid/widget/VideoView;", "mVideoView", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "mVideoWrapper", "Lcom/google/android/material/internal/NavigationMenuView;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lcom/google/android/material/internal/NavigationMenuView;", "mMenuView", "D", "I", "mPaddingTopDefault", "Landroid/view/View$OnLayoutChangeListener;", "E", "Landroid/view/View$OnLayoutChangeListener;", "footerListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationView.kt\ncom/guness/widget/NavigationView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,262:1\n1549#2:263\n1620#2,3:264\n766#2:267\n857#2,2:268\n1855#2,2:270\n1#3:272\n350#4:273\n368#4:274\n*S KotlinDebug\n*F\n+ 1 NavigationView.kt\ncom/guness/widget/NavigationView\n*L\n91#1:263\n91#1:264,3\n92#1:267\n92#1:268,2\n93#1:270,2\n255#1:273\n255#1:274\n*E\n"})
/* loaded from: classes6.dex */
public final class NavigationView extends com.google.android.material.navigation.NavigationView {

    /* renamed from: A */
    public VideoView f74946A;

    /* renamed from: B */
    public RelativeLayout f74947B;

    /* renamed from: C */
    public NavigationMenuView f74948C;

    /* renamed from: D */
    public int f74949D;

    /* renamed from: E */
    public final View.OnLayoutChangeListener f74950E;

    /* renamed from: y */
    public View f74951y;

    /* renamed from: z */
    public View f74952z;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"com/guness/widget/NavigationView$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewDetachedFromWindow", "onViewAttachedToWindow", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.guness.widget.NavigationView$a */
    /* loaded from: classes6.dex */
    public static final class View$OnAttachStateChangeListenerC18568a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC18568a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            NavigationView.this.f74946A.resume();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            NavigationView.this.f74946A.stopPlayback();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: A */
    public static final void m45940A(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        mp.setVideoScalingMode(1);
        mp.setLooping(true);
        mp.setScreenOnWhilePlaying(false);
    }

    /* renamed from: t */
    public static final void m45932t(NavigationView this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m45939B(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r3 != false) goto L11;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m45939B(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        boolean z;
        NavigationMenuView navigationMenuView = this.f74948C;
        if (navigationMenuView == null) {
            return;
        }
        int i2 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (view != null) {
            if (view.getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
        }
        view = null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams2 != null) {
                i2 = marginLayoutParams2.bottomMargin;
            }
            i2 = ((i + i2) + view.getBottom()) - view.getTop();
        }
        navigationMenuView.setPadding(navigationMenuView.getPaddingLeft(), navigationMenuView.getPaddingTop(), navigationMenuView.getPaddingRight(), i2);
    }

    @Override // com.google.android.material.navigation.NavigationView, com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: a */
    public void mo45938a(DB6 insets) {
        NavigationMenuView navigationMenuView;
        int i;
        Intrinsics.checkNotNullParameter(insets, "insets");
        int m110777m = insets.m110777m();
        if (this.f74949D != m110777m) {
            this.f74949D = m110777m;
            if (this.f74951y == null && (navigationMenuView = this.f74948C) != null) {
                if (navigationMenuView != null) {
                    i = navigationMenuView.getPaddingBottom();
                } else {
                    i = 0;
                }
                navigationMenuView.setPadding(0, m110777m, 0, i);
            }
        }
    }

    @Override // com.google.android.material.navigation.NavigationView
    @Deprecated(message = "No need to use params", replaceWith = @ReplaceWith(expression = "#getHeaderView()", imports = {}))
    /* renamed from: g */
    public View mo45937g(int i) {
        return m45930v();
    }

    @Override // com.google.android.material.navigation.NavigationView
    /* renamed from: k */
    public View mo45936k(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false);
        this.f74951y = inflate;
        Intrinsics.checkNotNull(inflate);
        setHeaderView(inflate);
        View view = this.f74951y;
        Intrinsics.checkNotNull(view);
        return view;
    }

    @Override // com.google.android.material.navigation.NavigationView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        super.onMeasure(i, i2);
        View view = this.f74951y;
        boolean z2 = false;
        if (view != null) {
            i3 = view.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        NavigationMenuView navigationMenuView = this.f74948C;
        if (navigationMenuView != null) {
            layoutParams = navigationMenuView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null && marginLayoutParams.topMargin == i3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i3;
            }
            z2 = true;
        }
        if (z2) {
            NavigationMenuView navigationMenuView2 = this.f74948C;
            Intrinsics.checkNotNull(navigationMenuView2);
            navigationMenuView2.measure(i, i2);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i != 0) {
            if (i == 4 || i == 8) {
                this.f74946A.pause();
                return;
            }
            return;
        }
        this.f74946A.start();
    }

    public final void setFooterView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m45928x();
        this.f74952z = view;
        Intrinsics.checkNotNull(view);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        addView(this.f74952z);
        View view2 = this.f74952z;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(this.f74950E);
        }
    }

    public final void setHeaderView(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        m45927y();
        this.f74951y = view;
        addView(view);
        NavigationMenuView navigationMenuView = this.f74948C;
        if (navigationMenuView != null) {
            if (navigationMenuView != null) {
                i = navigationMenuView.getPaddingBottom();
            } else {
                i = 0;
            }
            navigationMenuView.setPadding(0, 0, 0, i);
        }
    }

    public final void setOnClickListener(int i, View.OnClickListener listener) {
        View findViewById;
        View findViewById2;
        Intrinsics.checkNotNullParameter(listener, "listener");
        View view = this.f74951y;
        if (view != null && (findViewById2 = view.findViewById(i)) != null) {
            findViewById2.setOnClickListener(listener);
        }
        View view2 = this.f74952z;
        if (view2 != null && (findViewById = view2.findViewById(i)) != null) {
            findViewById.setOnClickListener(listener);
        }
    }

    public final void setVideoBackground(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f74946A.setVideoURI(uri);
        this.f74946A.setVisibility(0);
        this.f74946A.start();
    }

    /* renamed from: u */
    public final View m45931u() {
        return this.f74952z;
    }

    /* renamed from: v */
    public final View m45930v() {
        return this.f74951y;
    }

    /* renamed from: w */
    public final View m45929w(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false);
        this.f74952z = inflate;
        Intrinsics.checkNotNull(inflate);
        setFooterView(inflate);
        View view = this.f74952z;
        Intrinsics.checkNotNull(view);
        return view;
    }

    /* renamed from: x */
    public final void m45928x() {
        View view = this.f74952z;
        if (view != null) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this.f74950E);
            }
            removeView(this.f74952z);
            this.f74952z = null;
            m45939B(null);
        }
    }

    /* renamed from: y */
    public final void m45927y() {
        int i;
        View view = this.f74951y;
        if (view != null) {
            removeView(view);
            this.f74951y = null;
            NavigationMenuView navigationMenuView = this.f74948C;
            if (navigationMenuView != null) {
                if (navigationMenuView != null) {
                    i = navigationMenuView.getPaddingBottom();
                } else {
                    i = 0;
                }
                navigationMenuView.setPadding(0, 0, 0, i);
            }
        }
    }

    /* renamed from: z */
    public final void m45926z() {
        this.f74946A.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: b13
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                NavigationView.m45940A(mediaPlayer);
            }
        });
        this.f74947B.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f74946A.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.addRule(11);
        this.f74947B.addView(this.f74946A, layoutParams);
        addView(this.f74947B, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f74950E = new View.OnLayoutChangeListener() { // from class: a13
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                NavigationView.m45932t(NavigationView.this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        until = RangesKt___RangesKt.until(0, getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((View) obj) instanceof NavigationMenuView) {
                arrayList2.add(obj);
            }
        }
        for (View view : arrayList2) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.internal.NavigationMenuView");
            this.f74948C = (NavigationMenuView) view;
            setOverScrollMode(2);
            setVerticalScrollBarEnabled(false);
        }
        this.f74947B = new RelativeLayout(getContext());
        this.f74946A = new VideoView(getContext());
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC18568a());
        m45926z();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C34290Ll4.NavigationView, i, C50021ul4.Widget_Design_NavigationView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…et_Design_NavigationView)");
        int i2 = C34290Ll4.NavigationView_footerLayout;
        if (obtainStyledAttributes.hasValue(i2)) {
            m45929w(obtainStyledAttributes.getResourceId(i2, 0));
        }
        int i3 = C34290Ll4.NavigationView_backgroundVideo;
        if (obtainStyledAttributes.hasValue(i3)) {
            String packageName = context.getPackageName();
            int resourceId = obtainStyledAttributes.getResourceId(i3, 0);
            this.f74946A.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + resourceId));
            this.f74946A.setVisibility(0);
            this.f74946A.start();
        }
        obtainStyledAttributes.recycle();
        View view2 = this.f74952z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (view2 != null ? view2.getLayoutParams() : null);
        if (layoutParams == null) {
            return;
        }
        layoutParams.gravity = 80;
    }
}
