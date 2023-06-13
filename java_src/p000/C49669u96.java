package p000;

import androidx.lifecycle.LiveData;
import com.facebook.share.internal.C17296a;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aB\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u00040\u0003H\u0007\u001aJ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\u0010\u0005\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002¢\u0006\u0002\b\u00040\u0003H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¨\u0006\t"}, m28432d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "transform", "b", "c", C17296a.f69688o, "lifecycle-livedata_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "Transformations")
/* renamed from: u96  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49669u96 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "X", "value", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u96$a */
    /* loaded from: classes.dex */
    public static final class C29098a extends Lambda implements Function1<X, Unit> {

        /* renamed from: g */
        public final /* synthetic */ MP2<X> f111854g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f111855h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29098a(MP2<X> mp2, Ref.BooleanRef booleanRef) {
            super(1);
            this.f111854g = mp2;
            this.f111855h = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C29098a) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            Object value = this.f111854g.getValue();
            if (this.f111855h.element || ((value == null && x != 0) || !(value == null || Intrinsics.areEqual(value, x)))) {
                this.f111855h.element = false;
                this.f111854g.setValue(x);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "X", "Y", "x", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u96$b */
    /* loaded from: classes.dex */
    public static final class C29099b extends Lambda implements Function1<X, Unit> {

        /* renamed from: g */
        public final /* synthetic */ MP2<Y> f111856g;

        /* renamed from: h */
        public final /* synthetic */ Function1<X, Y> f111857h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29099b(MP2<Y> mp2, Function1<X, Y> function1) {
            super(1);
            this.f111856g = mp2;
            this.f111857h = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C29099b) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(X x) {
            this.f111856g.setValue(this.f111857h.invoke(x));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: u96$c */
    /* loaded from: classes.dex */
    public static final class C29100c implements InterfaceC41056fe3, FunctionAdapter {

        /* renamed from: b */
        public final /* synthetic */ Function1 f111858b;

        public C29100c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f111858b = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC41056fe3) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f111858b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.InterfaceC41056fe3
        public final /* synthetic */ void onChanged(Object obj) {
            this.f111858b.invoke(obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"u96$d", "Lfe3;", "value", "", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "liveData", "lifecycle-livedata_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: u96$d */
    /* loaded from: classes.dex */
    public static final class C29101d implements InterfaceC41056fe3<X> {

        /* renamed from: b */
        public LiveData<Y> f111859b;

        /* renamed from: c */
        public final /* synthetic */ Function1<X, LiveData<Y>> f111860c;

        /* renamed from: d */
        public final /* synthetic */ MP2<Y> f111861d;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "X", "Y", "y", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: u96$d$a */
        /* loaded from: classes.dex */
        public static final class C29102a extends Lambda implements Function1<Y, Unit> {

            /* renamed from: g */
            public final /* synthetic */ MP2<Y> f111862g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29102a(MP2<Y> mp2) {
                super(1);
                this.f111862g = mp2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C29102a) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Y y) {
                this.f111862g.setValue(y);
            }
        }

        public C29101d(Function1<X, LiveData<Y>> function1, MP2<Y> mp2) {
            this.f111860c = function1;
            this.f111861d = mp2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC41056fe3
        public void onChanged(X x) {
            LiveData<Y> liveData = (LiveData) this.f111860c.invoke(x);
            Object obj = this.f111859b;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                MP2<Y> mp2 = this.f111861d;
                Intrinsics.checkNotNull(obj);
                mp2.m95314c(obj);
            }
            this.f111859b = liveData;
            if (liveData != 0) {
                MP2<Y> mp22 = this.f111861d;
                Intrinsics.checkNotNull(liveData);
                mp22.mo95315b(liveData, new C29100c(new C29102a(this.f111861d)));
            }
        }
    }

    @JvmName(name = "distinctUntilChanged")
    /* renamed from: a */
    public static final <X> LiveData<X> m10730a(LiveData<X> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        MP2 mp2 = new MP2();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            mp2.setValue(liveData.getValue());
            booleanRef.element = false;
        }
        mp2.mo95315b(liveData, new C29100c(new C29098a(mp2, booleanRef)));
        return mp2;
    }

    @JvmName(name = "map")
    /* renamed from: b */
    public static final <X, Y> LiveData<Y> m10729b(LiveData<X> liveData, Function1<X, Y> transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MP2 mp2 = new MP2();
        mp2.mo95315b(liveData, new C29100c(new C29099b(mp2, transform)));
        return mp2;
    }

    @JvmName(name = "switchMap")
    /* renamed from: c */
    public static final <X, Y> LiveData<Y> m10728c(LiveData<X> liveData, Function1<X, LiveData<Y>> transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MP2 mp2 = new MP2();
        mp2.mo95315b(liveData, new C29101d(transform, mp2));
        return mp2;
    }
}
