package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B-\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\nH\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\nH\u0002J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\n*\u00020\bH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\"\u0010#\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\n0\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006&"}, m28432d2 = {"LJu1;", "", "Landroid/os/Bundle;", "savedInstanceState", "", "j", "bundle", "m", "", "nodeId", "LDi0;", "e", "g", "h", DateTokenConverter.CONVERTER_KEY, "f", "i", "c", "", C17296a.f69688o, "Ljava/util/List;", "nodes", "LLu1;", "b", "LLu1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "currentNode", "<init>", "(Ljava/util/List;LLu1;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowCoordinatingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoordinatingPresenter.kt\nco/bird/android/library/flow/FlowCoordinatingPresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n223#2,2:101\n288#2,2:105\n350#2,7:107\n1603#2,9:115\n1855#2:124\n1856#2:126\n1612#2:127\n350#2,7:128\n288#2,2:135\n288#2,2:137\n180#3:103\n180#3:104\n1#4:114\n1#4:125\n*S KotlinDebug\n*F\n+ 1 FlowCoordinatingPresenter.kt\nco/bird/android/library/flow/FlowCoordinatingPresenter\n*L\n33#1:101,2\n54#1:105,2\n72#1:107,7\n82#1:115,9\n82#1:124\n82#1:126\n82#1:127\n83#1:128,7\n93#1:135,2\n97#1:137,2\n37#1:103\n43#1:104\n82#1:125\n*E\n"})
/* renamed from: Ju1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33900Ju1 {

    /* renamed from: f */
    public static final C4275a f18419f = new C4275a(null);

    /* renamed from: a */
    public final List<C32387Di0> f18420a;

    /* renamed from: b */
    public final C34368Lu1 f18421b;

    /* renamed from: c */
    public final ScopeProvider f18422c;

    /* renamed from: d */
    public final InterfaceC40099e13 f18423d;

    /* renamed from: e */
    public final C24552a<C32387Di0> f18424e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LJu1$a;", "", "", "CURRENT_NODE_KEY", "Ljava/lang/String;", "<init>", "()V", "flow_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ju1$a */
    /* loaded from: classes3.dex */
    public static final class C4275a {
        public /* synthetic */ C4275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4275a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "id", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ju1$b */
    /* loaded from: classes3.dex */
    public static final class C4276b extends Lambda implements Function1<String, Unit> {
        public C4276b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String id) {
            Object first;
            C24552a c24552a = C33900Ju1.this.f18424e;
            C33900Ju1 c33900Ju1 = C33900Ju1.this;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            C32387Di0 m99570i = c33900Ju1.m99570i(id);
            if (m99570i == null) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) C33900Ju1.this.f18420a);
                m99570i = (C32387Di0) first;
            }
            c24552a.onNext(m99570i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LDi0;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LDi0;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ju1$c */
    /* loaded from: classes3.dex */
    public static final class C4277c extends Lambda implements Function1<C32387Di0, Unit> {
        public C4277c() {
            super(1);
        }

        /* renamed from: a */
        public final void m99565a(C32387Di0 c32387Di0) {
            C33900Ju1.this.f18421b.m96214Sl(c32387Di0.m109998d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32387Di0 c32387Di0) {
            m99565a(c32387Di0);
            return Unit.INSTANCE;
        }
    }

    public C33900Ju1(List<C32387Di0> nodes, C34368Lu1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f18420a = nodes;
        this.f18421b = ui;
        this.f18422c = scopeProvider;
        this.f18423d = navigator;
        C24552a<C32387Di0> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<CheckoutNode>()");
        this.f18424e = m31922e;
    }

    /* renamed from: k */
    public static final void m99568k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m99567l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final C32387Di0 m99576c() {
        Object obj;
        Iterator<T> it = this.f18420a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C32387Di0) obj).m109996f().invoke().booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C32387Di0) obj;
    }

    /* renamed from: d */
    public final C32387Di0 m99575d(C32387Di0 c32387Di0) {
        boolean z;
        Iterator<C32387Di0> it = this.f18420a.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().m110000b(), c32387Di0.m110000b())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0 && i < this.f18420a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        do {
            i++;
            if (i >= this.f18420a.size()) {
                break;
            }
        } while (!this.f18420a.get(i).m109996f().invoke().booleanValue());
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < this.f18420a.size()) {
            z2 = true;
        }
        if (!z2) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return this.f18420a.get(valueOf.intValue());
    }

    /* renamed from: e */
    public final C32387Di0 m99574e(String nodeId) {
        Object obj;
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Iterator<T> it = this.f18420a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((C32387Di0) obj).m110000b(), nodeId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C32387Di0) obj;
    }

    /* renamed from: f */
    public final C32387Di0 m99573f(C32387Di0 c32387Di0) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f18421b.m96217Pl()) {
            C32387Di0 m99570i = m99570i(str);
            if (m99570i != null) {
                arrayList.add(m99570i);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((C32387Di0) it.next()).m110000b(), c32387Di0.m110000b())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (1 <= i && i < arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (!((C32387Di0) arrayList.get(i)).m109996f().invoke().booleanValue());
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            z2 = true;
        }
        if (!z2) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return (C32387Di0) arrayList.get(valueOf.intValue());
    }

    /* renamed from: g */
    public final void m99572g() {
        C32387Di0 m99575d;
        C32387Di0 value = this.f18424e.getValue();
        Unit unit = null;
        if (value != null && (m99575d = m99575d(value)) != null) {
            C34368Lu1.pushNode$default(this.f18421b, m99575d, false, 2, null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f18423d.close();
        }
    }

    /* renamed from: h */
    public final void m99571h() {
        Unit unit;
        C32387Di0 m99573f;
        C32387Di0 value = this.f18424e.getValue();
        if (value != null && (m99573f = m99573f(value)) != null) {
            if (!this.f18421b.m96216Ql(m99573f)) {
                this.f18423d.close();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f18423d.close();
        }
    }

    /* renamed from: i */
    public final C32387Di0 m99570i(String str) {
        Object obj;
        Iterator<T> it = this.f18420a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((C32387Di0) obj).m110000b(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C32387Di0) obj;
    }

    /* renamed from: j */
    public final void m99569j(Bundle bundle) {
        Unit unit;
        if (bundle == null) {
            C32387Di0 m99576c = m99576c();
            if (m99576c != null) {
                this.f18424e.onNext(m99576c);
                this.f18421b.m96215Rl(m99576c, true);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f18423d.close();
            }
        } else {
            String string = bundle.getString("checkoutCoordinatingPresenter.currentNode");
            InterfaceC23436D interfaceC23436D = this.f18424e;
            for (Object obj : this.f18420a) {
                if (Intrinsics.areEqual(((C32387Di0) obj).m110000b(), string)) {
                    interfaceC23436D.onNext(obj);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Object m33094as = this.f18421b.m96213Tl().m33094as(AutoDispose.m45239a(this.f18422c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4276b c4276b = new C4276b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Hu1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C33900Ju1.m99568k(Function1.this, obj2);
            }
        });
        Object m33094as2 = this.f18424e.m33094as(AutoDispose.m45239a(this.f18422c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C4277c c4277c = new C4277c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Iu1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C33900Ju1.m99567l(Function1.this, obj2);
            }
        });
    }

    /* renamed from: m */
    public final void m99566m(Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        C32387Di0 value = this.f18424e.getValue();
        if (value != null) {
            str = value.m110000b();
        } else {
            str = null;
        }
        bundle.putString("checkoutCoordinatingPresenter.currentNode", str);
    }
}
