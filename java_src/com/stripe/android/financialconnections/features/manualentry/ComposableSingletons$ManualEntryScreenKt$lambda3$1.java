package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$ManualEntryScreenKt$lambda3$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$ManualEntryScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$ManualEntryScreenKt$lambda3$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188251 extends Lambda implements Function1<String, Unit> {
        public static final C188251 INSTANCE = new C188251();

        public C188251() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1$2 */
    /* loaded from: classes7.dex */
    public static final class C188262 extends Lambda implements Function1<String, Unit> {
        public static final C188262 INSTANCE = new C188262();

        public C188262() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1$3 */
    /* loaded from: classes7.dex */
    public static final class C188273 extends Lambda implements Function1<String, Unit> {
        public static final C188273 INSTANCE = new C188273();

        public C188273() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1$4 */
    /* loaded from: classes7.dex */
    public static final class C188284 extends Lambda implements Function0<Unit> {
        public static final C188284 INSTANCE = new C188284();

        public C188284() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt$lambda-3$1$5 */
    /* loaded from: classes7.dex */
    public static final class C188295 extends Lambda implements Function0<Unit> {
        public static final C188295 INSTANCE = new C188295();

        public C188295() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$ManualEntryScreenKt$lambda3$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(765230716, i, -1, "com.stripe.android.financialconnections.features.manualentry.ComposableSingletons$ManualEntryScreenKt.lambda-3.<anonymous> (ManualEntryScreen.kt:334)");
        }
        ManualEntryScreenKt.ManualEntryContent(TuplesKt.m28425to("", null), TuplesKt.m28425to("", null), TuplesKt.m28425to("", null), true, new C51034wT5(new ManualEntryState.Payload(true, false)), new C32163Cj1(new APIException(null, null, 0, "Error linking accounts", null, 23, null), null, 2, null), C188251.INSTANCE, C188262.INSTANCE, C188273.INSTANCE, C188284.INSTANCE, C188295.INSTANCE, interfaceC32720Et0, 920424008, 6);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
