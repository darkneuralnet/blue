package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$LinkAppBarKt$lambda4$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$LinkAppBarKt$lambda4$1 INSTANCE = new ComposableSingletons$LinkAppBarKt$lambda4$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-4$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189911 extends Lambda implements Function0<Unit> {
        public static final C189911 INSTANCE = new C189911();

        public C189911() {
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
    /* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-4$1$2 */
    /* loaded from: classes7.dex */
    public static final class C189922 extends Lambda implements Function0<Unit> {
        public static final C189922 INSTANCE = new C189922();

        public C189922() {
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
    /* renamed from: com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt$lambda-4$1$3 */
    /* loaded from: classes7.dex */
    public static final class C189933 extends Lambda implements Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, ? extends Unit>, Unit> {
        public static final C189933 INSTANCE = new C189933();

        public C189933() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, ? extends Unit> function3) {
            invoke2((Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>) function3);
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$LinkAppBarKt$lambda4$1() {
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
            C35528Qt0.m87816Z(-1759284729, i, -1, "com.stripe.android.link.ui.ComposableSingletons$LinkAppBarKt.lambda-4.<anonymous> (LinkAppBar.kt:149)");
        }
        LinkAppBarKt.LinkAppBar(new LinkAppBarState(C18975R.C18976drawable.ic_link_close, true, true, null, AccountStatus.SignedOut), C189911.INSTANCE, C189922.INSTANCE, C189933.INSTANCE, interfaceC32720Et0, 3504);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
