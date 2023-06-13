package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23483f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C48927su6;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u000e\u0010\u000b\u001a\u00020\n*\u00060\u0005j\u0002`\t\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004*\n\u0010\u000e\"\u00020\u00052\u00020\u0005¨\u0006\u000f"}, m28432d2 = {"Landroid/widget/ScrollView;", "Lio/reactivex/F;", "", "e", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "Lio/reactivex/Observable;", "", "g", "Lco/bird/android/widget/extension/DialogContentView;", "", DateTokenConverter.CONVERTER_KEY, "LOZ;", "c", "DialogContentView", "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: su6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48927su6 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/y;", "LOZ;", "emitter", "", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: su6$a */
    /* loaded from: classes4.dex */
    public static final class C28472a extends Lambda implements Function1<InterfaceC24578y<AbstractC6031OZ>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ BottomSheetBehavior<? extends View> f109557g;

        @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, m28432d2 = {"su6$a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "", "onSlide", "", "newState", "onStateChanged", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: su6$a$a */
        /* loaded from: classes4.dex */
        public static final class C28473a extends BottomSheetBehavior.AbstractC17702f {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC24578y<AbstractC6031OZ> f109558a;

            public C28473a(InterfaceC24578y<AbstractC6031OZ> interfaceC24578y) {
                this.f109558a = interfaceC24578y;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
            public void onSlide(View bottomSheet, float f) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                this.f109558a.onNext(new C42458i00(bottomSheet, f));
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
            public void onStateChanged(View bottomSheet, int i) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                this.f109558a.onNext(new C43051j00(bottomSheet, i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28472a(BottomSheetBehavior<? extends View> bottomSheetBehavior) {
            super(1);
            this.f109557g = bottomSheetBehavior;
        }

        /* renamed from: c */
        public static final void m13404c(BottomSheetBehavior this_bottomSheetEvents, C28473a callback) {
            Intrinsics.checkNotNullParameter(this_bottomSheetEvents, "$this_bottomSheetEvents");
            Intrinsics.checkNotNullParameter(callback, "$callback");
            this_bottomSheetEvents.m50118V(callback);
        }

        /* renamed from: b */
        public final void m13405b(InterfaceC24578y<AbstractC6031OZ> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final C28473a c28473a = new C28473a(emitter);
            this.f109557g.m50073u(c28473a);
            final BottomSheetBehavior<? extends View> bottomSheetBehavior = this.f109557g;
            emitter.mo11916a(new InterfaceC23483f() { // from class: ru6
                @Override // io.reactivex.functions.InterfaceC23483f
                public final void cancel() {
                    C48927su6.C28472a.m13404c(BottomSheetBehavior.this, c28473a);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<AbstractC6031OZ> interfaceC24578y) {
            m13405b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"su6$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nView+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View+.kt\nco/bird/android/widget/extension/View_Kt$forceDialogHeightToMatchParentOnLayout$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n1#2:127\n315#3:128\n329#3,4:129\n316#3:133\n*S KotlinDebug\n*F\n+ 1 View+.kt\nco/bird/android/widget/extension/View_Kt$forceDialogHeightToMatchParentOnLayout$1\n*L\n88#1:128\n88#1:129,4\n88#1:133\n*E\n"})
    /* renamed from: su6$b */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC28474b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final /* synthetic */ View f109559b;

        public ViewTreeObserver$OnGlobalLayoutListenerC28474b(View view) {
            this.f109559b = view;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[LOOP:0: B:6:0x0018->B:24:0x0053, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0017 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0017 -> B:6:0x0018). Please submit an issue!!! */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onGlobalLayout() {
            View view;
            boolean z;
            View view2;
            ViewParent parent;
            this.f109559b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent2 = this.f109559b.getParent();
            if (parent2 instanceof View) {
                view = (View) parent2;
                while (view != null && view.getId() != 16908331) {
                    if (view.getLayoutParams().height != -2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        view2 = view;
                    } else {
                        view2 = null;
                    }
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -1;
                            view2.setLayoutParams(layoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    parent = view.getParent();
                    if (!(parent instanceof View)) {
                        view = (View) parent;
                    }
                }
                return;
            }
            view = null;
            while (view != null) {
                if (view.getLayoutParams().height != -2) {
                }
                if (!z) {
                }
                if (view2 != null) {
                }
                parent = view.getParent();
                if (!(parent instanceof View)) {
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"su6$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: su6$c */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC28475c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23444H<Boolean> f109560b;

        /* renamed from: c */
        public final /* synthetic */ ScrollView f109561c;

        public ViewTreeObserver$OnGlobalLayoutListenerC28475c(InterfaceC23444H<Boolean> interfaceC23444H, ScrollView scrollView) {
            this.f109560b = interfaceC23444H;
            this.f109561c = scrollView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f109560b.mo1769e()) {
                return;
            }
            if (this.f109561c.getChildCount() == 0) {
                this.f109560b.onError(new Exception("ScrollView missing child"));
            } else {
                boolean z = false;
                View childAt = this.f109561c.getChildAt(0);
                InterfaceC23444H<Boolean> interfaceC23444H = this.f109560b;
                if (childAt.getHeight() > this.f109561c.getHeight()) {
                    z = true;
                }
                interfaceC23444H.onSuccess(Boolean.valueOf(z));
            }
            this.f109561c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\n"}, m28432d2 = {"su6$d", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "", "onSlide", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: su6$d */
    /* loaded from: classes4.dex */
    public static final class C28476d extends BottomSheetBehavior.AbstractC17702f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC24578y<Integer> f109562a;

        public C28476d(InterfaceC24578y<Integer> interfaceC24578y) {
            this.f109562a = interfaceC24578y;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View p0, float f) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View p0, int i) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            if (!this.f109562a.mo1769e()) {
                this.f109562a.onNext(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    public static final Observable<AbstractC6031OZ> m13412c(BottomSheetBehavior<? extends View> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        return C45832nh5.m23307i(new C28472a(bottomSheetBehavior));
    }

    /* renamed from: d */
    public static final void m13411d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC28474b(view));
    }

    /* renamed from: e */
    public static final AbstractC23442F<Boolean> m13410e(final ScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "<this>");
        AbstractC23442F<Boolean> m33126j = AbstractC23442F.m33126j(new InterfaceC23446J() { // from class: pu6
            @Override // io.reactivex.InterfaceC23446J
            public final void subscribe(InterfaceC23444H interfaceC23444H) {
                C48927su6.m13409f(scrollView, interfaceC23444H);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33126j, "create { emitter ->\n    …(this)\n      }\n    })\n  }");
        return m33126j;
    }

    /* renamed from: f */
    public static final void m13409f(ScrollView this_scrollable, InterfaceC23444H emitter) {
        Intrinsics.checkNotNullParameter(this_scrollable, "$this_scrollable");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this_scrollable.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC28475c(emitter, this_scrollable));
    }

    /* renamed from: g */
    public static final Observable<Integer> m13408g(final BottomSheetBehavior<View> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        Observable<Integer> create = Observable.create(new InterfaceC24579z() { // from class: qu6
            @Override // io.reactivex.InterfaceC24579z
            public final void subscribe(InterfaceC24578y interfaceC24578y) {
                C48927su6.m13407h(BottomSheetBehavior.this, interfaceC24578y);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create { emitter ->\n    … p1: Float) {}\n    })\n  }");
        return create;
    }

    /* renamed from: h */
    public static final void m13407h(BottomSheetBehavior this_stateChanged, InterfaceC24578y emitter) {
        Intrinsics.checkNotNullParameter(this_stateChanged, "$this_stateChanged");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this_stateChanged.m50110b0(new C28476d(emitter));
    }
}
