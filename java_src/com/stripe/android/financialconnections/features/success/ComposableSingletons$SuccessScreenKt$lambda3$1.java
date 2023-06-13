package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.features.common.AccessibleDataCalloutModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$SuccessScreenKt$lambda3$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$SuccessScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$SuccessScreenKt$lambda3$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1$1 */
    /* loaded from: classes7.dex */
    public static final class C188691 extends Lambda implements Function0<Unit> {
        public static final C188691 INSTANCE = new C188691();

        public C188691() {
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
    /* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1$2 */
    /* loaded from: classes7.dex */
    public static final class C188702 extends Lambda implements Function0<Unit> {
        public static final C188702 INSTANCE = new C188702();

        public C188702() {
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
    /* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1$3 */
    /* loaded from: classes7.dex */
    public static final class C188713 extends Lambda implements Function0<Unit> {
        public static final C188713 INSTANCE = new C188713();

        public C188713() {
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
    /* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1$4 */
    /* loaded from: classes7.dex */
    public static final class C188724 extends Lambda implements Function0<Unit> {
        public static final C188724 INSTANCE = new C188724();

        public C188724() {
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
    /* renamed from: com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt$lambda-3$1$5 */
    /* loaded from: classes7.dex */
    public static final class C188735 extends Lambda implements Function0<Unit> {
        public static final C188735 INSTANCE = new C188735();

        public C188735() {
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

    public ComposableSingletons$SuccessScreenKt$lambda3$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        List listOf;
        List emptyList;
        List emptyList2;
        List emptyList3;
        List listOf2;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1235454527, i, -1, "com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt.lambda-3.<anonymous> (SuccessScreen.kt:270)");
        }
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FinancialConnectionsAccount.Permissions[]{FinancialConnectionsAccount.Permissions.PAYMENT_METHOD, FinancialConnectionsAccount.Permissions.BALANCES, FinancialConnectionsAccount.Permissions.OWNERSHIP, FinancialConnectionsAccount.Permissions.TRANSACTIONS});
        AccessibleDataCalloutModel accessibleDataCalloutModel = new AccessibleDataCalloutModel("My business", listOf, true, false, "");
        FinancialConnectionsAccount.Category category = FinancialConnectionsAccount.Category.CASH;
        FinancialConnectionsAccount.Subcategory subcategory = FinancialConnectionsAccount.Subcategory.SAVINGS;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Boolean bool = Boolean.TRUE;
        FinancialConnectionsAccount.Subcategory subcategory2 = FinancialConnectionsAccount.Subcategory.CREDIT_CARD;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        FinancialConnectionsAccount.Subcategory subcategory3 = FinancialConnectionsAccount.Subcategory.CHECKING;
        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new PartnerAccount[]{new PartnerAccount("Authorization", category, "id2", "Account 2 - no acct numbers", subcategory, emptyList, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124864, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id3", "Account 3", subcategory2, emptyList2, (Integer) null, (String) null, "1234", (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124608, (DefaultConstructorMarker) null), new PartnerAccount("Authorization", category, "id4", "Account 4", subcategory3, emptyList3, (Integer) null, (String) null, "1234", (Integer) null, (String) null, bool, "", (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 124608, (DefaultConstructorMarker) null)});
        SuccessScreenKt.SuccessContent(accessibleDataCalloutModel, "", listOf2, new FinancialConnectionsInstitution(true, "id", false, "name", null, null, null, "url"), "Random business", false, false, C188691.INSTANCE, C188702.INSTANCE, true, C188713.INSTANCE, C188724.INSTANCE, C188735.INSTANCE, interfaceC32720Et0, 920347192, 438);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
