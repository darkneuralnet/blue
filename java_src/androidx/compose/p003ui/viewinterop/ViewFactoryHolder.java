package androidx.compose.p003ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC33328Hi5;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B?\b\u0002\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b3\u00104BK\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u00000\u001f\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b3\u00106J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\r\u0010\u001dRB\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%RB\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%RB\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%¨\u00067"}, m28432d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "", "w", "y", "Landroid/view/View;", "u", "()Landroid/view/View;", "typedView", "LC43;", "x", "LC43;", "getDispatcher", "()LC43;", "dispatcher", "LHi5;", "LHi5;", "saveStateRegistry", "", "z", "Ljava/lang/String;", "saveStateKey", "LHi5$a;", "value", "A", "LHi5$a;", "(LHi5$a;)V", "saveableRegistryEntry", "Lkotlin/Function1;", "B", "Lkotlin/jvm/functions/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "t", "setResetBlock", "resetBlock", "D", "s", "setReleaseBlock", "releaseBlock", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LYt0;", "parentContext", "<init>", "(Landroid/content/Context;LYt0;Landroid/view/View;LC43;LHi5;Ljava/lang/String;)V", "factory", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LYt0;LC43;LHi5;Ljava/lang/String;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {

    /* renamed from: A */
    public InterfaceC33328Hi5.InterfaceC3212a f53457A;

    /* renamed from: B */
    public Function1<? super T, Unit> f53458B;

    /* renamed from: C */
    public Function1<? super T, Unit> f53459C;

    /* renamed from: D */
    public Function1<? super T, Unit> f53460D;

    /* renamed from: w */
    public final T f53461w;

    /* renamed from: x */
    public final C43 f53462x;

    /* renamed from: y */
    public final InterfaceC33328Hi5 f53463y;

    /* renamed from: z */
    public final String f53464z;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$a */
    /* loaded from: classes.dex */
    public static final class C11466a extends Lambda implements Function0<Object> {

        /* renamed from: g */
        public final /* synthetic */ ViewFactoryHolder<T> f53465g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11466a(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f53465g = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f53465g.m68248u().saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$b */
    /* loaded from: classes.dex */
    public static final class C11467b extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ ViewFactoryHolder<T> f53466g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11467b(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f53466g = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f53466g.m68250s().invoke(this.f53466g.m68248u());
            this.f53466g.m68244y();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$c */
    /* loaded from: classes.dex */
    public static final class C11468c extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ ViewFactoryHolder<T> f53467g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11468c(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f53467g = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f53467g.m68249t().invoke(this.f53467g.m68248u());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$d */
    /* loaded from: classes.dex */
    public static final class C11469d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ ViewFactoryHolder<T> f53468g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11469d(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f53468g = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f53468g.m68247v().invoke(this.f53468g.m68248u());
        }
    }

    public ViewFactoryHolder(Context context, AbstractC37400Yt0 abstractC37400Yt0, T t, C43 c43, InterfaceC33328Hi5 interfaceC33328Hi5, String str) {
        super(context, abstractC37400Yt0, c43);
        this.f53461w = t;
        this.f53462x = c43;
        this.f53463y = interfaceC33328Hi5;
        this.f53464z = str;
        setClipChildren(false);
        setView$ui_release(t);
        Object mo19978f = interfaceC33328Hi5 != null ? interfaceC33328Hi5.mo19978f(str) : null;
        SparseArray<Parcelable> sparseArray = mo19978f instanceof SparseArray ? (SparseArray) mo19978f : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        m68246w();
        this.f53458B = C24963je.m30172d();
        this.f53459C = C24963je.m30172d();
        this.f53460D = C24963je.m30172d();
    }

    /* renamed from: s */
    public final Function1<T, Unit> m68250s() {
        return (Function1<? super T, Unit>) this.f53460D;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53460D = value;
        m68268o(new C11467b(this));
    }

    public final void setResetBlock(Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53459C = value;
        m68267p(new C11468c(this));
    }

    public final void setUpdateBlock(Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53458B = value;
        m68266q(new C11469d(this));
    }

    /* renamed from: t */
    public final Function1<T, Unit> m68249t() {
        return (Function1<? super T, Unit>) this.f53459C;
    }

    /* renamed from: u */
    public final T m68248u() {
        return this.f53461w;
    }

    /* renamed from: v */
    public final Function1<T, Unit> m68247v() {
        return (Function1<? super T, Unit>) this.f53458B;
    }

    /* renamed from: w */
    public final void m68246w() {
        InterfaceC33328Hi5 interfaceC33328Hi5 = this.f53463y;
        if (interfaceC33328Hi5 != null) {
            m68245x(interfaceC33328Hi5.mo19981b(this.f53464z, new C11466a(this)));
        }
    }

    /* renamed from: x */
    public final void m68245x(InterfaceC33328Hi5.InterfaceC3212a interfaceC3212a) {
        InterfaceC33328Hi5.InterfaceC3212a interfaceC3212a2 = this.f53457A;
        if (interfaceC3212a2 != null) {
            interfaceC3212a2.unregister();
        }
        this.f53457A = interfaceC3212a;
    }

    /* renamed from: y */
    public final void m68244y() {
        m68245x(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> factory, AbstractC37400Yt0 abstractC37400Yt0, C43 dispatcher, InterfaceC33328Hi5 interfaceC33328Hi5, String saveStateKey) {
        this(context, abstractC37400Yt0, factory.invoke(context), dispatcher, interfaceC33328Hi5, saveStateKey);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(saveStateKey, "saveStateKey");
    }
}
