package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003\n'\fB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006("}, m28432d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "g", "h", "()V", "LVe3;", "onBackPressedCallback", "c", "LVc0;", DateTokenConverter.CONVERTER_KEY, "(LVe3;)LVc0;", "LLifecycleOwner;", "owner", "b", "", "e", "f", "Ljava/lang/Runnable;", C17296a.f69688o, "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "onBackPressedCallbacks", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "enabledChangedCallback", "Landroid/window/OnBackInvokedCallback;", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "Z", "backInvokedCallbackRegistered", "<init>", "(Ljava/lang/Runnable;)V", "LifecycleOnBackPressedCancellable", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f51430a;

    /* renamed from: b */
    public final ArrayDeque<AbstractC36566Ve3> f51431b;

    /* renamed from: c */
    public Function0<Unit> f51432c;

    /* renamed from: d */
    public OnBackInvokedCallback f51433d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f51434e;

    /* renamed from: f */
    public boolean f51435f;

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/i;", "LVc0;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "cancel", "Landroidx/lifecycle/f;", "b", "Landroidx/lifecycle/f;", "lifecycle", "LVe3;", "c", "LVe3;", "onBackPressedCallback", DateTokenConverter.CONVERTER_KEY, "LVc0;", "currentCancellable", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/f;LVe3;)V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements InterfaceC11728i, InterfaceC36545Vc0 {

        /* renamed from: b */
        public final AbstractC11719f f51436b;

        /* renamed from: c */
        public final AbstractC36566Ve3 f51437c;

        /* renamed from: d */
        public InterfaceC36545Vc0 f51438d;

        /* renamed from: e */
        public final /* synthetic */ OnBackPressedDispatcher f51439e;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC11719f lifecycle, AbstractC36566Ve3 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f51439e = onBackPressedDispatcher;
            this.f51436b = lifecycle;
            this.f51437c = onBackPressedCallback;
            lifecycle.mo67008a(this);
        }

        @Override // p000.InterfaceC36545Vc0
        public void cancel() {
            this.f51436b.mo67006d(this);
            this.f51437c.removeCancellable(this);
            InterfaceC36545Vc0 interfaceC36545Vc0 = this.f51438d;
            if (interfaceC36545Vc0 != null) {
                interfaceC36545Vc0.cancel();
            }
            this.f51438d = null;
        }

        @Override // androidx.lifecycle.InterfaceC11728i
        public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC11719f.EnumC11720a.ON_START) {
                this.f51438d = this.f51439e.m70496d(this.f51437c);
            } else if (event == AbstractC11719f.EnumC11720a.ON_STOP) {
                InterfaceC36545Vc0 interfaceC36545Vc0 = this.f51438d;
                if (interfaceC36545Vc0 != null) {
                    interfaceC36545Vc0.cancel();
                }
            } else if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                cancel();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public static final class C10939a extends Lambda implements Function0<Unit> {
        public C10939a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.m70492h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    /* loaded from: classes.dex */
    public static final class C10940b extends Lambda implements Function0<Unit> {
        public C10940b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.m70494f();
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¨\u0006\u000f"}, m28432d2 = {"Landroidx/activity/OnBackPressedDispatcher$c;", "", "dispatcher", "", "priority", "callback", "", DateTokenConverter.CONVERTER_KEY, "e", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$c */
    /* loaded from: classes.dex */
    public static final class C10941c {

        /* renamed from: a */
        public static final C10941c f51442a = new C10941c();

        private C10941c() {
        }

        /* renamed from: c */
        public static final void m70489c(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        /* renamed from: b */
        public final OnBackInvokedCallback m70490b(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: af3
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.C10941c.m70489c(Function0.this);
                }
            };
        }

        /* renamed from: d */
        public final void m70488d(Object dispatcher, int i, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            C36800We3.m78054a(dispatcher).registerOnBackInvokedCallback(i, C37034Xe3.m76742a(callback));
        }

        /* renamed from: e */
        public final void m70487e(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            C36800We3.m78054a(dispatcher).unregisterOnBackInvokedCallback(C37034Xe3.m76742a(callback));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Landroidx/activity/OnBackPressedDispatcher$d;", "LVc0;", "", "cancel", "LVe3;", "b", "LVe3;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;LVe3;)V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$d */
    /* loaded from: classes.dex */
    public final class C10942d implements InterfaceC36545Vc0 {

        /* renamed from: b */
        public final AbstractC36566Ve3 f51443b;

        /* renamed from: c */
        public final /* synthetic */ OnBackPressedDispatcher f51444c;

        public C10942d(OnBackPressedDispatcher onBackPressedDispatcher, AbstractC36566Ve3 onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f51444c = onBackPressedDispatcher;
            this.f51443b = onBackPressedCallback;
        }

        @Override // p000.InterfaceC36545Vc0
        public void cancel() {
            this.f51444c.f51431b.remove(this.f51443b);
            this.f51443b.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f51443b.setEnabledChangedCallback$activity_release(null);
                this.f51444c.m70492h();
            }
        }
    }

    @JvmOverloads
    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    /* renamed from: b */
    public final void m70498b(LifecycleOwner owner, AbstractC36566Ve3 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC11719f lifecycle = owner.getLifecycle();
        if (lifecycle.mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            m70492h();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f51432c);
        }
    }

    /* renamed from: c */
    public final void m70497c(AbstractC36566Ve3 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        m70496d(onBackPressedCallback);
    }

    /* renamed from: d */
    public final InterfaceC36545Vc0 m70496d(AbstractC36566Ve3 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f51431b.add(onBackPressedCallback);
        C10942d c10942d = new C10942d(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(c10942d);
        if (Build.VERSION.SDK_INT >= 33) {
            m70492h();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f51432c);
        }
        return c10942d;
    }

    /* renamed from: e */
    public final boolean m70495e() {
        ArrayDeque<AbstractC36566Ve3> arrayDeque = this.f51431b;
        if ((arrayDeque instanceof Collection) && arrayDeque.isEmpty()) {
            return false;
        }
        for (AbstractC36566Ve3 abstractC36566Ve3 : arrayDeque) {
            if (abstractC36566Ve3.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m70494f() {
        AbstractC36566Ve3 abstractC36566Ve3;
        ArrayDeque<AbstractC36566Ve3> arrayDeque = this.f51431b;
        ListIterator<AbstractC36566Ve3> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                abstractC36566Ve3 = listIterator.previous();
                if (abstractC36566Ve3.isEnabled()) {
                    break;
                }
            } else {
                abstractC36566Ve3 = null;
                break;
            }
        }
        AbstractC36566Ve3 abstractC36566Ve32 = abstractC36566Ve3;
        if (abstractC36566Ve32 != null) {
            abstractC36566Ve32.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f51430a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public final void m70493g(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f51434e = invoker;
        m70492h();
    }

    /* renamed from: h */
    public final void m70492h() {
        boolean m70495e = m70495e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f51434e;
        OnBackInvokedCallback onBackInvokedCallback = this.f51433d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (m70495e && !this.f51435f) {
                C10941c.f51442a.m70488d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f51435f = true;
            } else if (!m70495e && this.f51435f) {
                C10941c.f51442a.m70487e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f51435f = false;
            }
        }
    }

    @JvmOverloads
    public OnBackPressedDispatcher(Runnable runnable) {
        this.f51430a = runnable;
        this.f51431b = new ArrayDeque<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f51432c = new C10939a();
            this.f51433d = C10941c.f51442a.m70490b(new C10940b());
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}
