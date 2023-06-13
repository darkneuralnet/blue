package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23436D;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0015Bk\b\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\u0012B\b\u0002\u0010'\u001a<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`$\u0012\u0006\u0010)\u001a\u00020\u0014¢\u0006\u0004\b0\u00101J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005H\u0014J3\u0010\u000f\u001a\u00020\u00072+\u0010\u000e\u001a'\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\rJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0016J5\u0010\u0016\u001a\u00020\u00072+\u0010\u000e\u001a'\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\rH\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J9\u0010\u0019\u001a\u00020\u0007*/\u0012)\u0012'\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\r\u0018\u00010\u0018H\u0002R\u0014\u0010\u001c\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fRN\u0010'\u001a<\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00000!j\b\u0012\u0004\u0012\u00028\u0000`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(RC\u0010-\u001a/\u0012)\u0012'\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\r\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, m28432d2 = {"La94;", "", "T", "LZt4;", "LX84;", "Lio/reactivex/D;", "observer", "", "subscribeActual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "currentValue", "Lco/bird/android/library/rx/property/Modifier;", "modifier", "i", "j", "value", "accept", "(Ljava/lang/Object;)V", "", C17296a.f69688o, "g", "h", "Ljava/util/LinkedList;", "e", "b", "Ljava/lang/Object;", "defaultValue", "LAG;", "c", "LAG;", "actual", "Lkotlin/Function2;", "oldValue", "newValue", "Lco/bird/android/library/rx/property/Merger;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "merger", "Z", "nonRedundant", "f", "emitting", "Ljava/util/LinkedList;", "queue", "getValue", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;LAG;Lkotlin/jvm/functions/Function2;Z)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPropertyRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyRelay.kt\nco/bird/android/library/rx/property/PropertyRelay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 PropertyRelay.kt\nco/bird/android/library/rx/property/PropertyRelay\n*L\n134#1:166,2\n*E\n"})
/* renamed from: a94  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37791a94<T> extends AbstractC37638Zt4<T> implements X84<T> {

    /* renamed from: h */
    public static final C10586a f49908h = new C10586a(null);

    /* renamed from: b */
    public final T f49909b;

    /* renamed from: c */
    public final C0058AG<T> f49910c;

    /* renamed from: d */
    public final Function2<T, T, T> f49911d;

    /* renamed from: e */
    public final boolean f49912e;

    /* renamed from: f */
    public boolean f49913f;

    /* renamed from: g */
    public LinkedList<Function1<T, T>> f49914g;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010Ji\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00012B\b\u0002\u0010\n\u001a<\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00010\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\f\u0010\rJi\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00012B\b\u0002\u0010\n\u001a<\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00010\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0011"}, m28432d2 = {"La94$a;", "", "T", "defaultValue", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "oldValue", "newValue", "Lco/bird/android/library/rx/property/Merger;", "merger", "La94;", C17296a.f69688o, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)La94;", "b", "<init>", "()V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a94$a */
    /* loaded from: classes3.dex */
    public static final class C10586a {
        public /* synthetic */ C10586a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C37791a94 create$default(C10586a c10586a, Object obj, Function2 function2, int i, Object obj2) {
            if ((i & 2) != 0) {
                function2 = new C37085Xk0();
            }
            return c10586a.m71835a(obj, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C37791a94 createNonRedundant$default(C10586a c10586a, Object obj, Function2 function2, int i, Object obj2) {
            if ((i & 2) != 0) {
                function2 = new C37085Xk0();
            }
            return c10586a.m71834b(obj, function2);
        }

        /* renamed from: a */
        public final <T> C37791a94<T> m71835a(T defaultValue, Function2<? super T, ? super T, ? extends T> merger) {
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(merger, "merger");
            C0058AG m115950h = C0058AG.m115950h(defaultValue);
            Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(defaultValue)");
            return new C37791a94<>(defaultValue, m115950h, merger, false, null);
        }

        /* renamed from: b */
        public final <T> C37791a94<T> m71834b(T defaultValue, Function2<? super T, ? super T, ? extends T> merger) {
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(merger, "merger");
            C0058AG m115950h = C0058AG.m115950h(defaultValue);
            Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(defaultValue)");
            return new C37791a94<>(defaultValue, m115950h, merger, true, null);
        }

        private C10586a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "", "currentValue", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a94$b */
    /* loaded from: classes3.dex */
    public static final class C10587b extends Lambda implements Function1<T, T> {

        /* renamed from: g */
        public final /* synthetic */ C37791a94<T> f49915g;

        /* renamed from: h */
        public final /* synthetic */ T f49916h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10587b(C37791a94<T> c37791a94, T t) {
            super(1);
            this.f49915g = c37791a94;
            this.f49916h = t;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T currentValue) {
            Intrinsics.checkNotNullParameter(currentValue, "currentValue");
            return (T) this.f49915g.f49911d.invoke(currentValue, this.f49916h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a94$c */
    /* loaded from: classes3.dex */
    public static final class C10588c extends Lambda implements Function1<T, T> {

        /* renamed from: g */
        public final /* synthetic */ C37791a94<T> f49917g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10588c(C37791a94<T> c37791a94) {
            super(1);
            this.f49917g = c37791a94;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (T) this.f49917g.f49909b;
        }
    }

    static {
    }

    public /* synthetic */ C37791a94(Object obj, C0058AG c0058ag, Function2 function2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, c0058ag, function2, z);
    }

    @Override // p000.AbstractC37638Zt4
    /* renamed from: a */
    public boolean mo25411a() {
        return this.f49910c.mo25411a();
    }

    @Override // p000.AbstractC37638Zt4, io.reactivex.functions.InterfaceC23484g
    public void accept(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m71837i(new C10587b(this, value));
    }

    /* renamed from: e */
    public final void m71840e(LinkedList<Function1<T, T>> linkedList) {
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (it.hasNext()) {
                m71839g((Function1) it.next());
            }
        }
    }

    /* renamed from: g */
    public final void m71839g(Function1<? super T, ? extends T> function1) {
        T invoke = function1.invoke(getValue());
        if (!this.f49912e || !Intrinsics.areEqual(invoke, getValue())) {
            this.f49910c.accept(invoke);
        }
    }

    @Override // p000.X84
    public T getValue() {
        T value = this.f49910c.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    /* renamed from: h */
    public final void m71838h() {
        LinkedList<Function1<T, T>> linkedList;
        while (true) {
            synchronized (this) {
                linkedList = this.f49914g;
                if (linkedList == null) {
                    this.f49913f = false;
                    return;
                } else {
                    this.f49914g = null;
                    Unit unit = Unit.INSTANCE;
                }
            }
            m71840e(linkedList);
        }
    }

    /* renamed from: i */
    public final void m71837i(Function1<? super T, ? extends T> modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        synchronized (this) {
            if (this.f49913f) {
                LinkedList<Function1<T, T>> linkedList = this.f49914g;
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    this.f49914g = linkedList;
                }
                linkedList.add(modifier);
                return;
            }
            this.f49913f = true;
            Unit unit = Unit.INSTANCE;
            m71839g(modifier);
            m71838h();
        }
    }

    /* renamed from: j */
    public final void m71836j() {
        m71837i(new C10588c(this));
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f49910c.subscribe(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37791a94(T t, C0058AG<T> c0058ag, Function2<? super T, ? super T, ? extends T> function2, boolean z) {
        this.f49909b = t;
        this.f49910c = c0058ag;
        this.f49911d = function2;
        this.f49912e = z;
    }
}
