package p000;

import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11759u;
import com.airbnb.mvrx.FlowExtensionsKt;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&JT\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0005*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LNN2;", "LLifecycleOwner;", "", "invalidate", "LAN2;", "S", "LRN2;", "La01;", "deliveryMode", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "action", "Lzh2;", "onEach", "(LRN2;La01;Lkotlin/jvm/functions/Function2;)Lzh2;", "", "getMvrxViewId", "()Ljava/lang/String;", "mvrxViewId", "LON2;", "getMavericksViewInternalViewModel", "()LON2;", "mavericksViewInternalViewModel", "getSubscriptionLifecycleOwner", "()LLifecycleOwner;", "subscriptionLifecycleOwner", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: NN2 */
/* loaded from: classes2.dex */
public interface NN2 extends LifecycleOwner {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: NN2$a */
    /* loaded from: classes2.dex */
    public static final class C5563a {
        /* renamed from: a */
        public static <T> InterfaceC52943zh2 m94001a(NN2 nn2, InterfaceC32730Eu1<? extends T> receiver, AbstractC37698a01 deliveryMode, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            ON2 mavericksViewInternalViewModel = nn2.getMavericksViewInternalViewModel();
            return FlowExtensionsKt.m53531c(receiver, nn2.getSubscriptionLifecycleOwner(), mavericksViewInternalViewModel.m92365g(), mavericksViewInternalViewModel.m92366f(), deliveryMode, action);
        }

        /* renamed from: b */
        public static ON2 m94000b(NN2 nn2) {
            if (nn2 instanceof InterfaceC37154Xr6) {
                return (ON2) new C11759u((InterfaceC37154Xr6) nn2).m66922a(ON2.class);
            }
            throw new IllegalStateException("If your MavericksView is not a ViewModelStoreOwner, you must implement mavericksViewInternalViewModel and return a MavericksViewInternalViewModel that is unique to this view and persistent across its entire lifecycle.".toString());
        }

        /* renamed from: c */
        public static String m93999c(NN2 nn2) {
            return nn2.getMavericksViewInternalViewModel().m92364h();
        }

        /* renamed from: d */
        public static LifecycleOwner m93998d(NN2 nn2) {
            LifecycleOwner lifecycleOwner;
            try {
                Fragment fragment = nn2 instanceof Fragment ? (Fragment) nn2 : null;
                if (fragment == null || (lifecycleOwner = fragment.getViewLifecycleOwner()) == null) {
                    lifecycleOwner = nn2;
                }
                Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "{\n            (this as? …leOwner ?: this\n        }");
                return lifecycleOwner;
            } catch (IllegalStateException unused) {
                return nn2;
            }
        }

        /* renamed from: e */
        public static <S extends AN2, T> InterfaceC52943zh2 m93997e(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends AbstractC19862dp<? extends T>> asyncProp, AbstractC37698a01 deliveryMode, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(asyncProp, "asyncProp");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            return VN2.m79918i(receiver, nn2.getSubscriptionLifecycleOwner(), asyncProp, deliveryMode, function2, function22);
        }

        /* renamed from: f */
        public static <S extends AN2> InterfaceC52943zh2 m93996f(NN2 nn2, RN2<S> receiver, AbstractC37698a01 deliveryMode, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79926a(receiver, nn2.getSubscriptionLifecycleOwner(), deliveryMode, action);
        }

        /* renamed from: g */
        public static <S extends AN2, A> InterfaceC52943zh2 m93995g(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, AbstractC37698a01 deliveryMode, Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79925b(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, deliveryMode, action);
        }

        /* renamed from: h */
        public static <S extends AN2, A, B> InterfaceC52943zh2 m93994h(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, AbstractC37698a01 deliveryMode, Function3<? super A, ? super B, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79924c(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, deliveryMode, action);
        }

        /* renamed from: i */
        public static <S extends AN2, A, B, C> InterfaceC52943zh2 m93993i(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, AbstractC37698a01 deliveryMode, Function4<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(prop3, "prop3");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79923d(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, prop3, deliveryMode, action);
        }

        /* renamed from: j */
        public static <S extends AN2, A, B, C, D> InterfaceC52943zh2 m93992j(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, AbstractC37698a01 deliveryMode, Function5<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(prop3, "prop3");
            Intrinsics.checkNotNullParameter(prop4, "prop4");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79922e(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, prop3, prop4, deliveryMode, action);
        }

        /* renamed from: k */
        public static <S extends AN2, A, B, C, D, E> InterfaceC52943zh2 m93991k(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, AbstractC37698a01 deliveryMode, Function6<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(prop3, "prop3");
            Intrinsics.checkNotNullParameter(prop4, "prop4");
            Intrinsics.checkNotNullParameter(prop5, "prop5");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79921f(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, prop3, prop4, prop5, deliveryMode, action);
        }

        /* renamed from: l */
        public static <S extends AN2, A, B, C, D, E, F> InterfaceC52943zh2 m93990l(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, AbstractC37698a01 deliveryMode, Function7<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(prop3, "prop3");
            Intrinsics.checkNotNullParameter(prop4, "prop4");
            Intrinsics.checkNotNullParameter(prop5, "prop5");
            Intrinsics.checkNotNullParameter(prop6, "prop6");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79920g(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, prop3, prop4, prop5, prop6, deliveryMode, action);
        }

        /* renamed from: m */
        public static <S extends AN2, A, B, C, D, E, F, G> InterfaceC52943zh2 m93989m(NN2 nn2, RN2<S> receiver, KProperty1<S, ? extends A> prop1, KProperty1<S, ? extends B> prop2, KProperty1<S, ? extends C> prop3, KProperty1<S, ? extends D> prop4, KProperty1<S, ? extends E> prop5, KProperty1<S, ? extends F> prop6, KProperty1<S, ? extends G> prop7, AbstractC37698a01 deliveryMode, Function8<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super Continuation<? super Unit>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(prop1, "prop1");
            Intrinsics.checkNotNullParameter(prop2, "prop2");
            Intrinsics.checkNotNullParameter(prop3, "prop3");
            Intrinsics.checkNotNullParameter(prop4, "prop4");
            Intrinsics.checkNotNullParameter(prop5, "prop5");
            Intrinsics.checkNotNullParameter(prop6, "prop6");
            Intrinsics.checkNotNullParameter(prop7, "prop7");
            Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
            Intrinsics.checkNotNullParameter(action, "action");
            return VN2.m79919h(receiver, nn2.getSubscriptionLifecycleOwner(), prop1, prop2, prop3, prop4, prop5, prop6, prop7, deliveryMode, action);
        }

        /* renamed from: n */
        public static /* synthetic */ InterfaceC52943zh2 m93988n(NN2 nn2, RN2 rn2, AbstractC37698a01 abstractC37698a01, Function2 function2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    abstractC37698a01 = C41800gt4.f84406a;
                }
                return nn2.onEach(rn2, abstractC37698a01, function2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
        }

        /* renamed from: o */
        public static void m93987o(NN2 nn2) {
            HashSet hashSet;
            Handler handler;
            Handler handler2;
            hashSet = QN2.f30291a;
            if (hashSet.add(Integer.valueOf(System.identityHashCode(nn2)))) {
                handler = QN2.f30292b;
                handler2 = QN2.f30292b;
                handler.sendMessage(Message.obtain(handler2, System.identityHashCode(nn2), nn2));
            }
        }

        /* renamed from: p */
        public static C35624Rd6 m93986p(NN2 nn2, String str) {
            List listOfNotNull;
            String joinToString$default;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{nn2.getMvrxViewId(), Reflection.getOrCreateKotlinClass(C35624Rd6.class).getSimpleName(), str});
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, "_", null, null, 0, null, null, 62, null);
            return new C35624Rd6(joinToString$default);
        }
    }

    ON2 getMavericksViewInternalViewModel();

    String getMvrxViewId();

    LifecycleOwner getSubscriptionLifecycleOwner();

    void invalidate();

    <S extends AN2> InterfaceC52943zh2 onEach(RN2<S> rn2, AbstractC37698a01 abstractC37698a01, Function2<? super S, ? super Continuation<? super Unit>, ? extends Object> function2);
}
