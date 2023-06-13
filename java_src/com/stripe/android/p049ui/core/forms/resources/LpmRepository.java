package com.stripe.android.p049ui.core.forms.resources;

import android.content.res.AssetManager;
import android.content.res.Resources;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.LuxePostConfirmActionRepository;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.C19369R;
import com.stripe.android.p049ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.p049ui.core.elements.CardBillingSpec;
import com.stripe.android.p049ui.core.elements.CardDetailsSectionSpec;
import com.stripe.android.p049ui.core.elements.EmptyFormSpec;
import com.stripe.android.p049ui.core.elements.FormItemSpec;
import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.elements.LpmSerializer;
import com.stripe.android.p049ui.core.elements.MandateTextSpec;
import com.stripe.android.p049ui.core.elements.NextActionSpecKt;
import com.stripe.android.p049ui.core.elements.SaveForFutureUseSpec;
import com.stripe.android.p049ui.core.elements.SelectorIcon;
import com.stripe.android.p049ui.core.elements.SharedDataSpec;
import com.stripe.android.payments.financialconnections.DefaultIsFinancialConnectionsAvailable;
import com.stripe.android.payments.financialconnections.IsFinancialConnectionsAvailable;
import com.stripe.android.paymentsheet.forms.PaymentMethodRequirements;
import com.stripe.android.paymentsheet.forms.PaymentMethodRequirementsKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.TextStreamsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u000501234B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001f\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001` J\u0014\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0013H\u0002J\u001a\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0007J \u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00065"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "", "arguments", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;", "lpmInitialFormData", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;", "lpmPostConfirmData", "Lcom/stripe/android/model/LuxePostConfirmActionRepository;", "(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V", "lpmSerializer", "Lcom/stripe/android/ui/core/elements/LpmSerializer;", "serverSpecLoadingState", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "getServerSpecLoadingState", "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "setServerSpecLoadingState", "(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;)V", "supportedPaymentMethods", "", "", "getSupportedPaymentMethods", "()Ljava/util/List;", "supportedPaymentMethods$delegate", "Lkotlin/Lazy;", "convertToSupportedPaymentMethod", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "fromCode", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lcom/stripe/android/model/PaymentMethodCode;", "getJsonStringFromInputStream", "inputStream", "Ljava/io/InputStream;", "parseLpms", "readFromDisk", "supportsPaymentMethod", "", "paymentMethodCode", "update", "", "serverLpmSpecs", "lpms", "updateFromDisk", "values", "", "Companion", "LpmInitialFormData", "LpmRepositoryArguments", "ServerSpecState", "SupportedPaymentMethod", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLpmRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,561:1\n766#2:562\n857#2,2:563\n766#2:565\n857#2,2:566\n1194#2,2:568\n1222#2,4:570\n1603#2,9:581\n1855#2:590\n1856#2:592\n1612#2:593\n1603#2,9:594\n1855#2:603\n1856#2:605\n1612#2:606\n1194#2,2:607\n1222#2,4:609\n1238#2,4:615\n766#2:619\n857#2,2:620\n819#2:622\n847#2,2:623\n1603#2,9:625\n1855#2:634\n1856#2:636\n1612#2:637\n1194#2,2:638\n1222#2,4:640\n1179#2,2:644\n1253#2,4:646\n467#3,7:574\n442#3:613\n392#3:614\n1#4:591\n1#4:604\n1#4:635\n1#4:650\n*S KotlinDebug\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository\n*L\n131#1:562\n131#1:563,2\n132#1:565\n132#1:566,2\n137#1:568,2\n137#1:570,4\n141#1:581,9\n141#1:590\n141#1:592\n141#1:593\n142#1:594,9\n142#1:603\n142#1:605\n142#1:606\n143#1:607,2\n143#1:609,4\n146#1:615,4\n164#1:619\n164#1:620,2\n165#1:622\n165#1:623,2\n172#1:625,9\n172#1:634\n172#1:636\n172#1:637\n176#1:638,2\n176#1:640,4\n182#1:644,2\n182#1:646,4\n138#1:574,7\n146#1:613\n146#1:614\n141#1:591\n142#1:604\n172#1:635\n*E\n"})
/* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository */
/* loaded from: classes7.dex */
public final class LpmRepository {
    private static final SupportedPaymentMethod HardcodedCard;
    private static volatile LpmRepository INSTANCE;
    private final LpmRepositoryArguments arguments;
    private final LpmInitialFormData lpmInitialFormData;
    private final LuxePostConfirmActionRepository lpmPostConfirmData;
    private final LpmSerializer lpmSerializer;
    private ServerSpecState serverSpecLoadingState;
    private final Lazy supportedPaymentMethods$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;", "", "()V", "HardcodedCard", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "getHardcodedCard", "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "INSTANCE", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "getInstance", "args", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLpmRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,561:1\n1#2:562\n*E\n"})
    /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SupportedPaymentMethod getHardcodedCard() {
            return LpmRepository.HardcodedCard;
        }

        public final LpmRepository getInstance(LpmRepositoryArguments args) {
            Intrinsics.checkNotNullParameter(args, "args");
            LpmRepository lpmRepository = LpmRepository.INSTANCE;
            if (lpmRepository == null) {
                synchronized (this) {
                    lpmRepository = LpmRepository.INSTANCE;
                    if (lpmRepository == null) {
                        lpmRepository = new LpmRepository(args, null, null, 6, null);
                        LpmRepository.INSTANCE = lpmRepository;
                    }
                }
            }
            return lpmRepository;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0010\u0012\u0004\u0012\u00020\u00060\u000fJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;", "", "()V", "codeToSupportedPaymentMethod", "", "", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "containsKey", "", "it", "fromCode", PaymentMethodOptionsParams.Blik.PARAM_CODE, "putAll", "", "map", "", "Lcom/stripe/android/model/PaymentMethodCode;", "values", "", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$LpmInitialFormData */
    /* loaded from: classes7.dex */
    public static final class LpmInitialFormData {
        private Map<String, SupportedPaymentMethod> codeToSupportedPaymentMethod = new LinkedHashMap();
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final LpmInitialFormData Instance = new LpmInitialFormData();

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;", "", "()V", "Instance", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;", "getInstance", "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$LpmInitialFormData$Companion */
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LpmInitialFormData getInstance() {
                return LpmInitialFormData.Instance;
            }

            private Companion() {
            }
        }

        public final boolean containsKey(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.codeToSupportedPaymentMethod.containsKey(it);
        }

        public final SupportedPaymentMethod fromCode(String str) {
            if (str != null) {
                return this.codeToSupportedPaymentMethod.get(str);
            }
            return null;
        }

        public final void putAll(Map<String, SupportedPaymentMethod> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.codeToSupportedPaymentMethod.putAll(map);
        }

        public final Collection<SupportedPaymentMethod> values() {
            return this.codeToSupportedPaymentMethod.values();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0011\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "", "serverLpmSpecs", "", "(Ljava/lang/String;)V", "getServerLpmSpecs", "()Ljava/lang/String;", "NoServerSpec", "ServerNotParsed", "ServerParsed", "Uninitialized", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$ServerSpecState */
    /* loaded from: classes7.dex */
    public static abstract class ServerSpecState {
        public static final int $stable = 0;
        private final String serverLpmSpecs;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "serverLpmSpecs", "", "(Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$ServerSpecState$NoServerSpec */
        /* loaded from: classes7.dex */
        public static final class NoServerSpec extends ServerSpecState {
            public static final int $stable = 0;

            public NoServerSpec(String str) {
                super(str, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "serverLpmSpecs", "", "(Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$ServerSpecState$ServerNotParsed */
        /* loaded from: classes7.dex */
        public static final class ServerNotParsed extends ServerSpecState {
            public static final int $stable = 0;

            public ServerNotParsed(String str) {
                super(str, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "serverLpmSpecs", "", "(Ljava/lang/String;)V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$ServerSpecState$ServerParsed */
        /* loaded from: classes7.dex */
        public static final class ServerParsed extends ServerSpecState {
            public static final int $stable = 0;

            public ServerParsed(String str) {
                super(str, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$ServerSpecState$Uninitialized */
        /* loaded from: classes7.dex */
        public static final class Uninitialized extends ServerSpecState {
            public static final int $stable = 0;
            public static final Uninitialized INSTANCE = new Uninitialized();

            private Uninitialized() {
                super(null, null);
            }
        }

        public /* synthetic */ ServerSpecState(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getServerLpmSpecs() {
            return this.serverLpmSpecs;
        }

        private ServerSpecState(String str) {
            this.serverLpmSpecs = str;
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\r\u0010 \u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003Jk\u0010)\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\u0006\u0010-\u001a\u00020\u0006J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "Lcom/stripe/android/model/PaymentMethodCode;", "requiresMandate", "", "displayNameResource", "", "iconResource", "lightThemeIconUrl", "darkThemeIconUrl", "tintIconOnSelection", "requirement", "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "formSpec", "Lcom/stripe/android/ui/core/elements/LayoutSpec;", "(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V", "getCode", "()Ljava/lang/String;", "getDarkThemeIconUrl", "getDisplayNameResource", "()I", "getFormSpec", "()Lcom/stripe/android/ui/core/elements/LayoutSpec;", "getIconResource", "getLightThemeIconUrl", "getRequirement", "()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "getRequiresMandate", "()Z", "getTintIconOnSelection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "supportsCustomerSavedPM", "toString", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$SupportedPaymentMethod */
    /* loaded from: classes7.dex */
    public static final class SupportedPaymentMethod {
        public static final int $stable = 8;
        private final String code;
        private final String darkThemeIconUrl;
        private final int displayNameResource;
        private final LayoutSpec formSpec;
        private final int iconResource;
        private final String lightThemeIconUrl;
        private final PaymentMethodRequirements requirement;
        private final boolean requiresMandate;
        private final boolean tintIconOnSelection;

        public SupportedPaymentMethod(String code, boolean z, int i, int i2, String str, String str2, boolean z2, PaymentMethodRequirements requirement, LayoutSpec formSpec) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(formSpec, "formSpec");
            this.code = code;
            this.requiresMandate = z;
            this.displayNameResource = i;
            this.iconResource = i2;
            this.lightThemeIconUrl = str;
            this.darkThemeIconUrl = str2;
            this.tintIconOnSelection = z2;
            this.requirement = requirement;
            this.formSpec = formSpec;
        }

        public final String component1() {
            return this.code;
        }

        public final boolean component2() {
            return this.requiresMandate;
        }

        public final int component3() {
            return this.displayNameResource;
        }

        public final int component4() {
            return this.iconResource;
        }

        public final String component5() {
            return this.lightThemeIconUrl;
        }

        public final String component6() {
            return this.darkThemeIconUrl;
        }

        public final boolean component7() {
            return this.tintIconOnSelection;
        }

        public final PaymentMethodRequirements component8() {
            return this.requirement;
        }

        public final LayoutSpec component9() {
            return this.formSpec;
        }

        public final SupportedPaymentMethod copy(String code, boolean z, int i, int i2, String str, String str2, boolean z2, PaymentMethodRequirements requirement, LayoutSpec formSpec) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(formSpec, "formSpec");
            return new SupportedPaymentMethod(code, z, i, i2, str, str2, z2, requirement, formSpec);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SupportedPaymentMethod) {
                SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) obj;
                return Intrinsics.areEqual(this.code, supportedPaymentMethod.code) && this.requiresMandate == supportedPaymentMethod.requiresMandate && this.displayNameResource == supportedPaymentMethod.displayNameResource && this.iconResource == supportedPaymentMethod.iconResource && Intrinsics.areEqual(this.lightThemeIconUrl, supportedPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, supportedPaymentMethod.darkThemeIconUrl) && this.tintIconOnSelection == supportedPaymentMethod.tintIconOnSelection && Intrinsics.areEqual(this.requirement, supportedPaymentMethod.requirement) && Intrinsics.areEqual(this.formSpec, supportedPaymentMethod.formSpec);
            }
            return false;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        public final int getDisplayNameResource() {
            return this.displayNameResource;
        }

        public final LayoutSpec getFormSpec() {
            return this.formSpec;
        }

        public final int getIconResource() {
            return this.iconResource;
        }

        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        public final PaymentMethodRequirements getRequirement() {
            return this.requirement;
        }

        public final boolean getRequiresMandate() {
            return this.requiresMandate;
        }

        public final boolean getTintIconOnSelection() {
            return this.tintIconOnSelection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.code.hashCode() * 31;
            boolean z = this.requiresMandate;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode2 = (((((hashCode + i) * 31) + Integer.hashCode(this.displayNameResource)) * 31) + Integer.hashCode(this.iconResource)) * 31;
            String str = this.lightThemeIconUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkThemeIconUrl;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z2 = this.tintIconOnSelection;
            return ((((hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.requirement.hashCode()) * 31) + this.formSpec.hashCode();
        }

        public final boolean supportsCustomerSavedPM() {
            return this.requirement.getConfirmPMFromCustomer(this.code);
        }

        public String toString() {
            String str = this.code;
            boolean z = this.requiresMandate;
            int i = this.displayNameResource;
            int i2 = this.iconResource;
            String str2 = this.lightThemeIconUrl;
            String str3 = this.darkThemeIconUrl;
            boolean z2 = this.tintIconOnSelection;
            PaymentMethodRequirements paymentMethodRequirements = this.requirement;
            LayoutSpec layoutSpec = this.formSpec;
            return "SupportedPaymentMethod(code=" + str + ", requiresMandate=" + z + ", displayNameResource=" + i + ", iconResource=" + i2 + ", lightThemeIconUrl=" + str2 + ", darkThemeIconUrl=" + str3 + ", tintIconOnSelection=" + z2 + ", requirement=" + paymentMethodRequirements + ", formSpec=" + layoutSpec + ")";
        }
    }

    static {
        List listOf;
        int i = C19369R.string.stripe_paymentsheet_payment_method_card;
        int i2 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_card;
        PaymentMethodRequirements cardRequirement = PaymentMethodRequirementsKt.getCardRequirement();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FormItemSpec[]{new CardDetailsSectionSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new CardBillingSpec((IdentifierSpec) null, (Set) null, 3, (DefaultConstructorMarker) null), new SaveForFutureUseSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null)});
        HardcodedCard = new SupportedPaymentMethod("card", false, i, i2, null, null, true, cardRequirement, new LayoutSpec(listOf));
    }

    public LpmRepository(LpmRepositoryArguments arguments, LpmInitialFormData lpmInitialFormData, LuxePostConfirmActionRepository lpmPostConfirmData) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(lpmInitialFormData, "lpmInitialFormData");
        Intrinsics.checkNotNullParameter(lpmPostConfirmData, "lpmPostConfirmData");
        this.arguments = arguments;
        this.lpmInitialFormData = lpmInitialFormData;
        this.lpmPostConfirmData = lpmPostConfirmData;
        this.lpmSerializer = new LpmSerializer();
        this.serverSpecLoadingState = ServerSpecState.Uninitialized.INSTANCE;
        lazy = LazyKt__LazyJVMKt.lazy(LpmRepository$supportedPaymentMethods$2.INSTANCE);
        this.supportedPaymentMethods$delegate = lazy;
    }

    private final SupportedPaymentMethod convertToSupportedPaymentMethod(StripeIntent stripeIntent, SharedDataSpec sharedDataSpec) {
        SupportedPaymentMethod supportedPaymentMethod;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List emptyList;
        String str9;
        List plus;
        String str10;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        LayoutSpec formSpec;
        List listOf;
        String type = sharedDataSpec.getType();
        String str20 = null;
        if (Intrinsics.areEqual(type, PaymentMethod.Type.Card.code)) {
            int i2 = C19369R.string.stripe_paymentsheet_payment_method_card;
            int i3 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_card;
            SelectorIcon selectorIcon = sharedDataSpec.getSelectorIcon();
            if (selectorIcon != null) {
                str19 = selectorIcon.getLightThemePng();
            } else {
                str19 = null;
            }
            SelectorIcon selectorIcon2 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon2 != null) {
                str20 = selectorIcon2.getDarkThemePng();
            }
            String str21 = str20;
            PaymentMethodRequirements cardRequirement = PaymentMethodRequirementsKt.getCardRequirement();
            if (!sharedDataSpec.getFields().isEmpty()) {
                ArrayList<FormItemSpec> fields = sharedDataSpec.getFields();
                listOf = CollectionsKt__CollectionsJVMKt.listOf(EmptyFormSpec.INSTANCE);
                if (!Intrinsics.areEqual(fields, listOf)) {
                    formSpec = new LayoutSpec(sharedDataSpec.getFields());
                    supportedPaymentMethod = new SupportedPaymentMethod("card", false, i2, i3, str19, str21, true, cardRequirement, formSpec);
                }
            }
            formSpec = HardcodedCard.getFormSpec();
            supportedPaymentMethod = new SupportedPaymentMethod("card", false, i2, i3, str19, str21, true, cardRequirement, formSpec);
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Bancontact.code)) {
            int i4 = C19369R.string.stripe_paymentsheet_payment_method_bancontact;
            int i5 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_bancontact;
            SelectorIcon selectorIcon3 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon3 != null) {
                str18 = selectorIcon3.getLightThemePng();
            } else {
                str18 = null;
            }
            SelectorIcon selectorIcon4 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon4 != null) {
                str20 = selectorIcon4.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("bancontact", true, i4, i5, str18, str20, false, PaymentMethodRequirementsKt.getBancontactRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Sofort.code)) {
            int i6 = C19369R.string.stripe_paymentsheet_payment_method_sofort;
            int i7 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_klarna;
            SelectorIcon selectorIcon5 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon5 != null) {
                str17 = selectorIcon5.getLightThemePng();
            } else {
                str17 = null;
            }
            SelectorIcon selectorIcon6 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon6 != null) {
                str20 = selectorIcon6.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("sofort", true, i6, i7, str17, str20, false, PaymentMethodRequirementsKt.getSofortRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Ideal.code)) {
            int i8 = C19369R.string.stripe_paymentsheet_payment_method_ideal;
            int i9 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_ideal;
            SelectorIcon selectorIcon7 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon7 != null) {
                str16 = selectorIcon7.getLightThemePng();
            } else {
                str16 = null;
            }
            SelectorIcon selectorIcon8 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon8 != null) {
                str20 = selectorIcon8.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("ideal", true, i8, i9, str16, str20, false, PaymentMethodRequirementsKt.getIdealRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.SepaDebit.code)) {
            int i10 = C19369R.string.stripe_paymentsheet_payment_method_sepa_debit;
            int i11 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_sepa_debit;
            SelectorIcon selectorIcon9 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon9 != null) {
                str15 = selectorIcon9.getLightThemePng();
            } else {
                str15 = null;
            }
            SelectorIcon selectorIcon10 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon10 != null) {
                str20 = selectorIcon10.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("sepa_debit", true, i10, i11, str15, str20, false, PaymentMethodRequirementsKt.getSepaDebitRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Eps.code)) {
            int i12 = C19369R.string.stripe_paymentsheet_payment_method_eps;
            int i13 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_eps;
            SelectorIcon selectorIcon11 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon11 != null) {
                str14 = selectorIcon11.getLightThemePng();
            } else {
                str14 = null;
            }
            SelectorIcon selectorIcon12 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon12 != null) {
                str20 = selectorIcon12.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("eps", true, i12, i13, str14, str20, false, PaymentMethodRequirementsKt.getEpsRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.P24.code)) {
            int i14 = C19369R.string.stripe_paymentsheet_payment_method_p24;
            int i15 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_p24;
            SelectorIcon selectorIcon13 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon13 != null) {
                str13 = selectorIcon13.getLightThemePng();
            } else {
                str13 = null;
            }
            SelectorIcon selectorIcon14 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon14 != null) {
                str20 = selectorIcon14.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("p24", false, i14, i15, str13, str20, false, PaymentMethodRequirementsKt.getP24Requirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Giropay.code)) {
            int i16 = C19369R.string.stripe_paymentsheet_payment_method_giropay;
            int i17 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_giropay;
            SelectorIcon selectorIcon15 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon15 != null) {
                str12 = selectorIcon15.getLightThemePng();
            } else {
                str12 = null;
            }
            SelectorIcon selectorIcon16 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon16 != null) {
                str20 = selectorIcon16.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("giropay", false, i16, i17, str12, str20, false, PaymentMethodRequirementsKt.getGiropayRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.AfterpayClearpay.code)) {
            if (AfterpayClearpayHeaderElement.Companion.isClearpay$payments_ui_core_release()) {
                i = C19369R.string.stripe_paymentsheet_payment_method_clearpay;
            } else {
                i = C19369R.string.stripe_paymentsheet_payment_method_afterpay;
            }
            int i18 = i;
            int i19 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_afterpay_clearpay;
            SelectorIcon selectorIcon17 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon17 != null) {
                str11 = selectorIcon17.getLightThemePng();
            } else {
                str11 = null;
            }
            SelectorIcon selectorIcon18 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon18 != null) {
                str20 = selectorIcon18.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("afterpay_clearpay", false, i18, i19, str11, str20, false, PaymentMethodRequirementsKt.getAfterpayClearpayRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Klarna.code)) {
            int i20 = C19369R.string.stripe_paymentsheet_payment_method_klarna;
            int i21 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_klarna;
            SelectorIcon selectorIcon19 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon19 != null) {
                str10 = selectorIcon19.getLightThemePng();
            } else {
                str10 = null;
            }
            SelectorIcon selectorIcon20 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon20 != null) {
                str20 = selectorIcon20.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("klarna", false, i20, i21, str10, str20, false, PaymentMethodRequirementsKt.getKlarnaRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.PayPal.code)) {
            if (LpmRepositoryKt.access$payPalRequiresMandate(stripeIntent)) {
                emptyList = CollectionsKt__CollectionsJVMKt.listOf(new MandateTextSpec((IdentifierSpec) null, C19369R.string.paypal_mandate, 1, (DefaultConstructorMarker) null));
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            boolean access$payPalRequiresMandate = LpmRepositoryKt.access$payPalRequiresMandate(stripeIntent);
            int i22 = C19369R.string.stripe_paymentsheet_payment_method_paypal;
            int i23 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_paypal;
            SelectorIcon selectorIcon21 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon21 != null) {
                str9 = selectorIcon21.getLightThemePng();
            } else {
                str9 = null;
            }
            SelectorIcon selectorIcon22 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon22 != null) {
                str20 = selectorIcon22.getDarkThemePng();
            }
            PaymentMethodRequirements paypalRequirement = PaymentMethodRequirementsKt.getPaypalRequirement();
            plus = CollectionsKt___CollectionsKt.plus((Collection) sharedDataSpec.getFields(), (Iterable) emptyList);
            return new SupportedPaymentMethod("paypal", access$payPalRequiresMandate, i22, i23, str9, str20, false, paypalRequirement, new LayoutSpec(plus));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Affirm.code)) {
            int i24 = C19369R.string.stripe_paymentsheet_payment_method_affirm;
            int i25 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_affirm;
            SelectorIcon selectorIcon23 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon23 != null) {
                str8 = selectorIcon23.getLightThemePng();
            } else {
                str8 = null;
            }
            SelectorIcon selectorIcon24 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon24 != null) {
                str20 = selectorIcon24.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("affirm", false, i24, i25, str8, str20, false, PaymentMethodRequirementsKt.getAffirmRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.RevolutPay.code)) {
            int i26 = C19369R.string.stripe_paymentsheet_payment_method_revolut_pay;
            int i27 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_revolut_pay;
            SelectorIcon selectorIcon25 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon25 != null) {
                str7 = selectorIcon25.getLightThemePng();
            } else {
                str7 = null;
            }
            SelectorIcon selectorIcon26 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon26 != null) {
                str20 = selectorIcon26.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("revolut_pay", false, i26, i27, str7, str20, false, PaymentMethodRequirementsKt.getRevolutPayRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.MobilePay.code)) {
            int i28 = C19369R.string.stripe_paymentsheet_payment_method_mobile_pay;
            int i29 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_mobile_pay;
            SelectorIcon selectorIcon27 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon27 != null) {
                str6 = selectorIcon27.getLightThemePng();
            } else {
                str6 = null;
            }
            SelectorIcon selectorIcon28 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon28 != null) {
                str20 = selectorIcon28.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("mobilepay", false, i28, i29, str6, str20, false, PaymentMethodRequirementsKt.getMobilePayRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Zip.code)) {
            int i30 = C19369R.string.stripe_paymentsheet_payment_method_zip;
            int i31 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_zip;
            SelectorIcon selectorIcon29 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon29 != null) {
                str5 = selectorIcon29.getLightThemePng();
            } else {
                str5 = null;
            }
            SelectorIcon selectorIcon30 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon30 != null) {
                str20 = selectorIcon30.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("zip", false, i30, i31, str5, str20, false, PaymentMethodRequirementsKt.getZipRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.AuBecsDebit.code)) {
            int i32 = C19369R.string.stripe_paymentsheet_payment_method_au_becs_debit;
            int i33 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_bank;
            SelectorIcon selectorIcon31 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon31 != null) {
                str4 = selectorIcon31.getLightThemePng();
            } else {
                str4 = null;
            }
            SelectorIcon selectorIcon32 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon32 != null) {
                str20 = selectorIcon32.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("au_becs_debit", true, i32, i33, str4, str20, true, PaymentMethodRequirementsKt.getAuBecsDebitRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.USBankAccount.code)) {
            if (stripeIntent.getClientSecret() == null) {
                return null;
            }
            int i34 = C19369R.string.stripe_paymentsheet_payment_method_us_bank_account;
            int i35 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_bank;
            SelectorIcon selectorIcon33 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon33 != null) {
                str3 = selectorIcon33.getLightThemePng();
            } else {
                str3 = null;
            }
            SelectorIcon selectorIcon34 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon34 != null) {
                str20 = selectorIcon34.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("us_bank_account", true, i34, i35, str3, str20, true, PaymentMethodRequirementsKt.getUSBankAccountRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (Intrinsics.areEqual(type, PaymentMethod.Type.Upi.code)) {
            int i36 = C19369R.string.stripe_paymentsheet_payment_method_upi;
            int i37 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_upi;
            SelectorIcon selectorIcon35 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon35 != null) {
                str2 = selectorIcon35.getLightThemePng();
            } else {
                str2 = null;
            }
            SelectorIcon selectorIcon36 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon36 != null) {
                str20 = selectorIcon36.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("upi", false, i36, i37, str2, str20, false, PaymentMethodRequirementsKt.getUpiRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        } else if (!Intrinsics.areEqual(type, PaymentMethod.Type.CashAppPay.code)) {
            return null;
        } else {
            int i38 = C19369R.string.stripe_paymentsheet_payment_method_cashapp;
            int i39 = C19369R.C19370drawable.stripe_ic_paymentsheet_pm_cash_app_pay;
            SelectorIcon selectorIcon37 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon37 != null) {
                str = selectorIcon37.getLightThemePng();
            } else {
                str = null;
            }
            SelectorIcon selectorIcon38 = sharedDataSpec.getSelectorIcon();
            if (selectorIcon38 != null) {
                str20 = selectorIcon38.getDarkThemePng();
            }
            supportedPaymentMethod = new SupportedPaymentMethod("cashapp", false, i38, i39, str, str20, false, PaymentMethodRequirementsKt.getCashAppPayRequirement(), new LayoutSpec(sharedDataSpec.getFields()));
        }
        return supportedPaymentMethod;
    }

    private final String getJsonStringFromInputStream(InputStream inputStream) {
        BufferedReader bufferedReader;
        String readText;
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            try {
                readText = TextStreamsKt.readText(bufferedReader);
            } finally {
            }
        } else {
            readText = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        return readText;
    }

    private final List<SharedDataSpec> parseLpms(InputStream inputStream) {
        String jsonStringFromInputStream = getJsonStringFromInputStream(inputStream);
        if (jsonStringFromInputStream != null) {
            return this.lpmSerializer.deserializeList(jsonStringFromInputStream);
        }
        return null;
    }

    private final List<SharedDataSpec> readFromDisk() {
        AssetManager assets;
        Resources resources = this.arguments.getResources();
        return parseLpms((resources == null || (assets = resources.getAssets()) == null) ? null : assets.open("lpms.json"));
    }

    private final boolean supportsPaymentMethod(String str) {
        return getSupportedPaymentMethods().contains(str);
    }

    public final SupportedPaymentMethod fromCode(String str) {
        return this.lpmInitialFormData.fromCode(str);
    }

    public final ServerSpecState getServerSpecLoadingState() {
        return this.serverSpecLoadingState;
    }

    public final List<String> getSupportedPaymentMethods() {
        return (List) this.supportedPaymentMethods$delegate.getValue();
    }

    public final void setServerSpecLoadingState(ServerSpecState serverSpecState) {
        Intrinsics.checkNotNullParameter(serverSpecState, "<set-?>");
        this.serverSpecLoadingState = serverSpecState;
    }

    public final void update(StripeIntent stripeIntent, String str) {
        LinkedHashMap linkedHashMap;
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        int mapCapacity2;
        int collectionSizeOrDefault2;
        int mapCapacity3;
        int coerceAtLeast2;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        List<String> paymentMethodTypes = stripeIntent.getPaymentMethodTypes();
        this.serverSpecLoadingState = new ServerSpecState.NoServerSpec(str);
        if (!(str == null || str.length() == 0)) {
            this.serverSpecLoadingState = new ServerSpecState.ServerNotParsed(str);
            List<SharedDataSpec> deserializeList = this.lpmSerializer.deserializeList(str);
            if (!deserializeList.isEmpty()) {
                this.serverSpecLoadingState = new ServerSpecState.ServerParsed(str);
            }
            update(stripeIntent, deserializeList);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : paymentMethodTypes) {
            if (!this.lpmInitialFormData.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (supportsPaymentMethod((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (true ^ arrayList2.isEmpty()) {
            List<SharedDataSpec> readFromDisk = readFromDisk();
            if (readFromDisk != null) {
                List<SharedDataSpec> list = readFromDisk;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                mapCapacity3 = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault2);
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(mapCapacity3, 16);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(coerceAtLeast2);
                for (Object obj3 : list) {
                    linkedHashMap2.put(((SharedDataSpec) obj3).getType(), obj3);
                }
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (paymentMethodTypes.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            LpmInitialFormData lpmInitialFormData = this.lpmInitialFormData;
            ArrayList<SharedDataSpec> arrayList3 = new ArrayList();
            for (String str2 : arrayList2) {
                SharedDataSpec sharedDataSpec = linkedHashMap != null ? (SharedDataSpec) linkedHashMap.get(str2) : null;
                if (sharedDataSpec != null) {
                    arrayList3.add(sharedDataSpec);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (SharedDataSpec sharedDataSpec2 : arrayList3) {
                SupportedPaymentMethod convertToSupportedPaymentMethod = convertToSupportedPaymentMethod(stripeIntent, sharedDataSpec2);
                if (convertToSupportedPaymentMethod != null) {
                    arrayList4.add(convertToSupportedPaymentMethod);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(coerceAtLeast);
            for (Object obj4 : arrayList4) {
                linkedHashMap3.put(((SupportedPaymentMethod) obj4).getCode(), obj4);
            }
            lpmInitialFormData.putAll(linkedHashMap3);
            if (linkedHashMap != null) {
                mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size());
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapCapacity2);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap4.put(entry2.getKey(), NextActionSpecKt.transform(((SharedDataSpec) entry2.getValue()).getNextActionSpec()));
                }
                this.lpmPostConfirmData.update(linkedHashMap4);
            }
        }
    }

    public final void updateFromDisk(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        update(stripeIntent, readFromDisk());
    }

    public final Collection<SupportedPaymentMethod> values() {
        return this.lpmInitialFormData.values();
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;", "", "resources", "Landroid/content/res/Resources;", "isFinancialConnectionsAvailable", "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "(Landroid/content/res/Resources;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;)V", "()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;", "getResources", "()Landroid/content/res/Resources;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$LpmRepositoryArguments */
    /* loaded from: classes7.dex */
    public static final class LpmRepositoryArguments {
        public static final int $stable = 8;
        private final IsFinancialConnectionsAvailable isFinancialConnectionsAvailable;
        private final Resources resources;

        public LpmRepositoryArguments(Resources resources, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            this.resources = resources;
            this.isFinancialConnectionsAvailable = isFinancialConnectionsAvailable;
        }

        public static /* synthetic */ LpmRepositoryArguments copy$default(LpmRepositoryArguments lpmRepositoryArguments, Resources resources, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, Object obj) {
            if ((i & 1) != 0) {
                resources = lpmRepositoryArguments.resources;
            }
            if ((i & 2) != 0) {
                isFinancialConnectionsAvailable = lpmRepositoryArguments.isFinancialConnectionsAvailable;
            }
            return lpmRepositoryArguments.copy(resources, isFinancialConnectionsAvailable);
        }

        public final Resources component1() {
            return this.resources;
        }

        public final IsFinancialConnectionsAvailable component2() {
            return this.isFinancialConnectionsAvailable;
        }

        public final LpmRepositoryArguments copy(Resources resources, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            Intrinsics.checkNotNullParameter(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            return new LpmRepositoryArguments(resources, isFinancialConnectionsAvailable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LpmRepositoryArguments) {
                LpmRepositoryArguments lpmRepositoryArguments = (LpmRepositoryArguments) obj;
                return Intrinsics.areEqual(this.resources, lpmRepositoryArguments.resources) && Intrinsics.areEqual(this.isFinancialConnectionsAvailable, lpmRepositoryArguments.isFinancialConnectionsAvailable);
            }
            return false;
        }

        public final Resources getResources() {
            return this.resources;
        }

        public int hashCode() {
            Resources resources = this.resources;
            return ((resources == null ? 0 : resources.hashCode()) * 31) + this.isFinancialConnectionsAvailable.hashCode();
        }

        public final IsFinancialConnectionsAvailable isFinancialConnectionsAvailable() {
            return this.isFinancialConnectionsAvailable;
        }

        public String toString() {
            Resources resources = this.resources;
            IsFinancialConnectionsAvailable isFinancialConnectionsAvailable = this.isFinancialConnectionsAvailable;
            return "LpmRepositoryArguments(resources=" + resources + ", isFinancialConnectionsAvailable=" + isFinancialConnectionsAvailable + ")";
        }

        public /* synthetic */ LpmRepositoryArguments(Resources resources, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(resources, (i & 2) != 0 ? new DefaultIsFinancialConnectionsAvailable() : isFinancialConnectionsAvailable);
        }
    }

    public /* synthetic */ LpmRepository(LpmRepositoryArguments lpmRepositoryArguments, LpmInitialFormData lpmInitialFormData, LuxePostConfirmActionRepository luxePostConfirmActionRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lpmRepositoryArguments, (i & 2) != 0 ? LpmInitialFormData.Companion.getInstance() : lpmInitialFormData, (i & 4) != 0 ? LuxePostConfirmActionRepository.Companion.getInstance() : luxePostConfirmActionRepository);
    }

    private final void update(StripeIntent stripeIntent, List<SharedDataSpec> list) {
        ArrayList<SharedDataSpec> arrayList;
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        List mutableList;
        int collectionSizeOrDefault2;
        int mapCapacity2;
        int coerceAtLeast2;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (supportsPaymentMethod(((SharedDataSpec) obj).getType())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!(!this.arguments.isFinancialConnectionsAvailable().invoke() && Intrinsics.areEqual(((SharedDataSpec) obj2).getType(), PaymentMethod.Type.USBankAccount.code))) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            for (SharedDataSpec sharedDataSpec : arrayList) {
                SupportedPaymentMethod convertToSupportedPaymentMethod = convertToSupportedPaymentMethod(stripeIntent, sharedDataSpec);
                if (convertToSupportedPaymentMethod != null) {
                    arrayList3.add(convertToSupportedPaymentMethod);
                }
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
            if (mutableList != null) {
                LpmInitialFormData lpmInitialFormData = this.lpmInitialFormData;
                List list2 = mutableList;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault2);
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(mapCapacity2, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast2);
                for (Object obj3 : list2) {
                    linkedHashMap.put(((SupportedPaymentMethod) obj3).getCode(), obj3);
                }
                lpmInitialFormData.putAll(linkedHashMap);
            }
        }
        if (arrayList != null) {
            ArrayList<SharedDataSpec> arrayList4 = arrayList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(coerceAtLeast);
            for (SharedDataSpec sharedDataSpec2 : arrayList4) {
                Pair m28425to = TuplesKt.m28425to(sharedDataSpec2.getType(), NextActionSpecKt.transform(sharedDataSpec2.getNextActionSpec()));
                linkedHashMap2.put(m28425to.getFirst(), m28425to.getSecond());
            }
            this.lpmPostConfirmData.update(linkedHashMap2);
        }
    }
}
