package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 32\u00020\u0001:\u0002\u000b\u001bB\u0019\b\u0002\u0012\u0006\u00106\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b7\u00108B\u0011\b\u0016\u0012\u0006\u00106\u001a\u00020\u0012¢\u0006\u0004\b7\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0003R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0016\u0010)\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010*\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR&\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00020+j\b\u0012\u0004\u0012\u00020\u0002`,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-R$\u00102\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006:"}, m28432d2 = {"Landroidx/lifecycle/j;", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/f$b;", TransferTable.COLUMN_STATE, "", "k", "Landroidx/lifecycle/f$a;", "event", "i", "LFq2;", "observer", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "next", "l", "f", "m", "n", "LLifecycleOwner;", "lifecycleOwner", "h", "e", "p", "", "methodName", "g", "", "b", "Z", "enforceMainThread", "LMj1;", "Landroidx/lifecycle/j$b;", "c", "LMj1;", "observerMap", "Landroidx/lifecycle/f$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "()Landroidx/lifecycle/f$b;", "o", "(Landroidx/lifecycle/f$b;)V", "currentState", "j", "()Z", "isSynced", "provider", "<init>", "(LLifecycleOwner;Z)V", "(LLifecycleOwner;)V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public class C11729j extends AbstractC11719f {

    /* renamed from: j */
    public static final C11730a f54924j = new C11730a(null);

    /* renamed from: b */
    public final boolean f54925b;

    /* renamed from: c */
    public C34503Mj1<InterfaceC32929Fq2, C11731b> f54926c;

    /* renamed from: d */
    public AbstractC11719f.EnumC11724b f54927d;

    /* renamed from: e */
    public final WeakReference<LifecycleOwner> f54928e;

    /* renamed from: f */
    public int f54929f;

    /* renamed from: g */
    public boolean f54930g;

    /* renamed from: h */
    public boolean f54931h;

    /* renamed from: i */
    public ArrayList<AbstractC11719f.EnumC11724b> f54932i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Landroidx/lifecycle/j$a;", "", "Landroidx/lifecycle/f$b;", "state1", "state2", C17296a.f69688o, "(Landroidx/lifecycle/f$b;Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$b;", "<init>", "()V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: classes.dex */
    public static final class C11730a {
        public /* synthetic */ C11730a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final AbstractC11719f.EnumC11724b m66993a(AbstractC11719f.EnumC11724b state1, AbstractC11719f.EnumC11724b enumC11724b) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            if (enumC11724b != null && enumC11724b.compareTo(state1) < 0) {
                return enumC11724b;
            }
            return state1;
        }

        private C11730a() {
        }
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"Landroidx/lifecycle/j$b;", "", "LLifecycleOwner;", "owner", "Landroidx/lifecycle/f$a;", "event", "", C17296a.f69688o, "Landroidx/lifecycle/f$b;", "Landroidx/lifecycle/f$b;", "b", "()Landroidx/lifecycle/f$b;", "setState", "(Landroidx/lifecycle/f$b;)V", TransferTable.COLUMN_STATE, "Landroidx/lifecycle/i;", "Landroidx/lifecycle/i;", "getLifecycleObserver", "()Landroidx/lifecycle/i;", "setLifecycleObserver", "(Landroidx/lifecycle/i;)V", "lifecycleObserver", "LFq2;", "observer", "initialState", "<init>", "(LFq2;Landroidx/lifecycle/f$b;)V", "lifecycle-runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.j$b */
    /* loaded from: classes.dex */
    public static final class C11731b {

        /* renamed from: a */
        public AbstractC11719f.EnumC11724b f54933a;

        /* renamed from: b */
        public InterfaceC11728i f54934b;

        public C11731b(InterfaceC32929Fq2 interfaceC32929Fq2, AbstractC11719f.EnumC11724b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(interfaceC32929Fq2);
            this.f54934b = C11732k.m66985f(interfaceC32929Fq2);
            this.f54933a = initialState;
        }

        /* renamed from: a */
        public final void m66992a(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC11719f.EnumC11724b m67019c = event.m67019c();
            this.f54933a = C11729j.f54924j.m66993a(this.f54933a, m67019c);
            InterfaceC11728i interfaceC11728i = this.f54934b;
            Intrinsics.checkNotNull(lifecycleOwner);
            interfaceC11728i.onStateChanged(lifecycleOwner, event);
            this.f54933a = m67019c;
        }

        /* renamed from: b */
        public final AbstractC11719f.EnumC11724b m66991b() {
            return this.f54933a;
        }
    }

    public C11729j(LifecycleOwner lifecycleOwner, boolean z) {
        this.f54925b = z;
        this.f54926c = new C34503Mj1<>();
        this.f54927d = AbstractC11719f.EnumC11724b.INITIALIZED;
        this.f54932i = new ArrayList<>();
        this.f54928e = new WeakReference<>(lifecycleOwner);
    }

    @Override // androidx.lifecycle.AbstractC11719f
    /* renamed from: a */
    public void mo67008a(InterfaceC32929Fq2 observer) {
        LifecycleOwner lifecycleOwner;
        boolean z;
        Intrinsics.checkNotNullParameter(observer, "observer");
        m67003g("addObserver");
        AbstractC11719f.EnumC11724b enumC11724b = this.f54927d;
        AbstractC11719f.EnumC11724b enumC11724b2 = AbstractC11719f.EnumC11724b.DESTROYED;
        if (enumC11724b != enumC11724b2) {
            enumC11724b2 = AbstractC11719f.EnumC11724b.INITIALIZED;
        }
        C11731b c11731b = new C11731b(observer, enumC11724b2);
        if (this.f54926c.mo18966h(observer, c11731b) != null || (lifecycleOwner = this.f54928e.get()) == null) {
            return;
        }
        if (this.f54929f == 0 && !this.f54930g) {
            z = false;
        } else {
            z = true;
        }
        AbstractC11719f.EnumC11724b m67004f = m67004f(observer);
        this.f54929f++;
        while (c11731b.m66991b().compareTo(m67004f) < 0 && this.f54926c.contains(observer)) {
            m66996n(c11731b.m66991b());
            AbstractC11719f.EnumC11720a m67016b = AbstractC11719f.EnumC11720a.Companion.m67016b(c11731b.m66991b());
            if (m67016b != null) {
                c11731b.m66992a(lifecycleOwner, m67016b);
                m66997m();
                m67004f = m67004f(observer);
            } else {
                throw new IllegalStateException("no event up from " + c11731b.m66991b());
            }
        }
        if (!z) {
            m66994p();
        }
        this.f54929f--;
    }

    @Override // androidx.lifecycle.AbstractC11719f
    /* renamed from: b */
    public AbstractC11719f.EnumC11724b mo67007b() {
        return this.f54927d;
    }

    @Override // androidx.lifecycle.AbstractC11719f
    /* renamed from: d */
    public void mo67006d(InterfaceC32929Fq2 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        m67003g("removeObserver");
        this.f54926c.mo18965j(observer);
    }

    /* renamed from: e */
    public final void m67005e(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC32929Fq2, C11731b>> descendingIterator = this.f54926c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f54931h) {
            Map.Entry<InterfaceC32929Fq2, C11731b> next = descendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            InterfaceC32929Fq2 key = next.getKey();
            C11731b value = next.getValue();
            while (value.m66991b().compareTo(this.f54927d) > 0 && !this.f54931h && this.f54926c.contains(key)) {
                AbstractC11719f.EnumC11720a m67017a = AbstractC11719f.EnumC11720a.Companion.m67017a(value.m66991b());
                if (m67017a != null) {
                    m66996n(m67017a.m67019c());
                    value.m66992a(lifecycleOwner, m67017a);
                    m66997m();
                } else {
                    throw new IllegalStateException("no event down from " + value.m66991b());
                }
            }
        }
    }

    /* renamed from: f */
    public final AbstractC11719f.EnumC11724b m67004f(InterfaceC32929Fq2 interfaceC32929Fq2) {
        AbstractC11719f.EnumC11724b enumC11724b;
        ArrayList<AbstractC11719f.EnumC11724b> arrayList;
        C11731b value;
        Map.Entry<InterfaceC32929Fq2, C11731b> m94997o = this.f54926c.m94997o(interfaceC32929Fq2);
        AbstractC11719f.EnumC11724b enumC11724b2 = null;
        if (m94997o != null && (value = m94997o.getValue()) != null) {
            enumC11724b = value.m66991b();
        } else {
            enumC11724b = null;
        }
        if (!this.f54932i.isEmpty()) {
            enumC11724b2 = this.f54932i.get(arrayList.size() - 1);
        }
        C11730a c11730a = f54924j;
        return c11730a.m66993a(c11730a.m66993a(this.f54927d, enumC11724b), enumC11724b2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public final void m67003g(String str) {
        if (this.f54925b && !C1988Em.m108396h().mo23534c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* renamed from: h */
    public final void m67002h(LifecycleOwner lifecycleOwner) {
        C47018ph5<InterfaceC32929Fq2, C11731b>.C27337d m18969c = this.f54926c.m18969c();
        Intrinsics.checkNotNullExpressionValue(m18969c, "observerMap.iteratorWithAdditions()");
        while (m18969c.hasNext() && !this.f54931h) {
            Map.Entry next = m18969c.next();
            InterfaceC32929Fq2 interfaceC32929Fq2 = (InterfaceC32929Fq2) next.getKey();
            C11731b c11731b = (C11731b) next.getValue();
            while (c11731b.m66991b().compareTo(this.f54927d) < 0 && !this.f54931h && this.f54926c.contains(interfaceC32929Fq2)) {
                m66996n(c11731b.m66991b());
                AbstractC11719f.EnumC11720a m67016b = AbstractC11719f.EnumC11720a.Companion.m67016b(c11731b.m66991b());
                if (m67016b != null) {
                    c11731b.m66992a(lifecycleOwner, m67016b);
                    m66997m();
                } else {
                    throw new IllegalStateException("no event up from " + c11731b.m66991b());
                }
            }
        }
    }

    /* renamed from: i */
    public void m67001i(AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m67003g("handleLifecycleEvent");
        m66998l(event.m67019c());
    }

    /* renamed from: j */
    public final boolean m67000j() {
        if (this.f54926c.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC32929Fq2, C11731b> m18971a = this.f54926c.m18971a();
        Intrinsics.checkNotNull(m18971a);
        AbstractC11719f.EnumC11724b m66991b = m18971a.getValue().m66991b();
        Map.Entry<InterfaceC32929Fq2, C11731b> m18968e = this.f54926c.m18968e();
        Intrinsics.checkNotNull(m18968e);
        AbstractC11719f.EnumC11724b m66991b2 = m18968e.getValue().m66991b();
        if (m66991b == m66991b2 && this.f54927d == m66991b2) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Override [currentState].")
    /* renamed from: k */
    public void m66999k(AbstractC11719f.EnumC11724b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        m67003g("markState");
        m66995o(state);
    }

    /* renamed from: l */
    public final void m66998l(AbstractC11719f.EnumC11724b enumC11724b) {
        boolean z;
        AbstractC11719f.EnumC11724b enumC11724b2 = this.f54927d;
        if (enumC11724b2 == enumC11724b) {
            return;
        }
        if (enumC11724b2 == AbstractC11719f.EnumC11724b.INITIALIZED && enumC11724b == AbstractC11719f.EnumC11724b.DESTROYED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f54927d = enumC11724b;
            if (!this.f54930g && this.f54929f == 0) {
                this.f54930g = true;
                m66994p();
                this.f54930g = false;
                if (this.f54927d == AbstractC11719f.EnumC11724b.DESTROYED) {
                    this.f54926c = new C34503Mj1<>();
                    return;
                }
                return;
            }
            this.f54931h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f54927d + " in component " + this.f54928e.get()).toString());
    }

    /* renamed from: m */
    public final void m66997m() {
        ArrayList<AbstractC11719f.EnumC11724b> arrayList = this.f54932i;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    public final void m66996n(AbstractC11719f.EnumC11724b enumC11724b) {
        this.f54932i.add(enumC11724b);
    }

    /* renamed from: o */
    public void m66995o(AbstractC11719f.EnumC11724b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        m67003g("setCurrentState");
        m66998l(state);
    }

    /* renamed from: p */
    public final void m66994p() {
        LifecycleOwner lifecycleOwner = this.f54928e.get();
        if (lifecycleOwner != null) {
            while (!m67000j()) {
                this.f54931h = false;
                AbstractC11719f.EnumC11724b enumC11724b = this.f54927d;
                Map.Entry<InterfaceC32929Fq2, C11731b> m18971a = this.f54926c.m18971a();
                Intrinsics.checkNotNull(m18971a);
                if (enumC11724b.compareTo(m18971a.getValue().m66991b()) < 0) {
                    m67005e(lifecycleOwner);
                }
                Map.Entry<InterfaceC32929Fq2, C11731b> m18968e = this.f54926c.m18968e();
                if (!this.f54931h && m18968e != null && this.f54927d.compareTo(m18968e.getValue().m66991b()) > 0) {
                    m67002h(lifecycleOwner);
                }
            }
            this.f54931h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11729j(LifecycleOwner provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
