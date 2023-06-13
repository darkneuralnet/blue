package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5(with = ConfirmResponseStatusSpecsSerializer.class)
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "", "()V", "CanceledSpec", "Companion", "FinishedSpec", "RedirectNextActionSpec", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$FinishedSpec;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs */
/* loaded from: classes7.dex */
public abstract class ConfirmResponseStatusSpecs {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @InterfaceC36694Vs5("canceled")
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$CanceledSpec;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "LKj2;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs$CanceledSpec */
    /* loaded from: classes7.dex */
    public static final class CanceledSpec extends ConfirmResponseStatusSpecs {
        private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final int $stable = 0;
        public static final CanceledSpec INSTANCE = new CanceledSpec();

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C19394xbea4eeaf.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        private CanceledSpec() {
            super(null);
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return $cachedSerializer$delegate;
        }

        public final InterfaceC34036Kj2<CanceledSpec> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<ConfirmResponseStatusSpecs> serializer() {
            return ConfirmResponseStatusSpecsSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC36694Vs5("finished")
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$FinishedSpec;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "LKj2;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs$FinishedSpec */
    /* loaded from: classes7.dex */
    public static final class FinishedSpec extends ConfirmResponseStatusSpecs {
        private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final int $stable = 0;
        public static final FinishedSpec INSTANCE = new FinishedSpec();

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C19395xa79551f6.INSTANCE);
            $cachedSerializer$delegate = lazy;
        }

        private FinishedSpec() {
            super(null);
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return $cachedSerializer$delegate;
        }

        public final InterfaceC34036Kj2<FinishedSpec> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }
    }

    @InterfaceC36694Vs5("redirect_to_url")
    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "component2", "urlPath", "returnUrlPath", "copy", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getUrlPath", "()Ljava/lang/String;", "getUrlPath$annotations", "()V", "getReturnUrlPath", "getReturnUrlPath$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs$RedirectNextActionSpec */
    /* loaded from: classes7.dex */
    public static final class RedirectNextActionSpec extends ConfirmResponseStatusSpecs {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String returnUrlPath;
        private final String urlPath;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion */
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC34036Kj2<RedirectNextActionSpec> serializer() {
                return ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RedirectNextActionSpec() {
            this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ RedirectNextActionSpec copy$default(RedirectNextActionSpec redirectNextActionSpec, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirectNextActionSpec.urlPath;
            }
            if ((i & 2) != 0) {
                str2 = redirectNextActionSpec.returnUrlPath;
            }
            return redirectNextActionSpec.copy(str, str2);
        }

        @InterfaceC36694Vs5("return_url_path")
        public static /* synthetic */ void getReturnUrlPath$annotations() {
        }

        @InterfaceC36694Vs5("url_path")
        public static /* synthetic */ void getUrlPath$annotations() {
        }

        @JvmStatic
        public static final void write$Self(RedirectNextActionSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
            boolean z;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            boolean z2 = false;
            if (output.mo1132s(serialDesc, 0) || !Intrinsics.areEqual(self.urlPath, "next_action[redirect_to_url][url]")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                output.mo1128w(serialDesc, 0, self.urlPath);
            }
            if (output.mo1132s(serialDesc, 1) || !Intrinsics.areEqual(self.returnUrlPath, "next_action[redirect_to_url][return_url]")) {
                z2 = true;
            }
            if (z2) {
                output.mo1128w(serialDesc, 1, self.returnUrlPath);
            }
        }

        public final String component1() {
            return this.urlPath;
        }

        public final String component2() {
            return this.returnUrlPath;
        }

        public final RedirectNextActionSpec copy(String urlPath, String returnUrlPath) {
            Intrinsics.checkNotNullParameter(urlPath, "urlPath");
            Intrinsics.checkNotNullParameter(returnUrlPath, "returnUrlPath");
            return new RedirectNextActionSpec(urlPath, returnUrlPath);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RedirectNextActionSpec) {
                RedirectNextActionSpec redirectNextActionSpec = (RedirectNextActionSpec) obj;
                return Intrinsics.areEqual(this.urlPath, redirectNextActionSpec.urlPath) && Intrinsics.areEqual(this.returnUrlPath, redirectNextActionSpec.returnUrlPath);
            }
            return false;
        }

        public final String getReturnUrlPath() {
            return this.returnUrlPath;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            return (this.urlPath.hashCode() * 31) + this.returnUrlPath.hashCode();
        }

        public String toString() {
            String str = this.urlPath;
            String str2 = this.returnUrlPath;
            return "RedirectNextActionSpec(urlPath=" + str + ", returnUrlPath=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ RedirectNextActionSpec(int i, @InterfaceC36694Vs5("url_path") String str, @InterfaceC36694Vs5("return_url_path") String str2, C38819bt5 c38819bt5) {
            super(null);
            if ((i & 0) != 0) {
                C52838zW3.m1275b(i, 0, ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer.INSTANCE.getDescriptor());
            }
            this.urlPath = (i & 1) == 0 ? "next_action[redirect_to_url][url]" : str;
            if ((i & 2) == 0) {
                this.returnUrlPath = "next_action[redirect_to_url][return_url]";
            } else {
                this.returnUrlPath = str2;
            }
        }

        public /* synthetic */ RedirectNextActionSpec(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "next_action[redirect_to_url][url]" : str, (i & 2) != 0 ? "next_action[redirect_to_url][return_url]" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectNextActionSpec(String urlPath, String returnUrlPath) {
            super(null);
            Intrinsics.checkNotNullParameter(urlPath, "urlPath");
            Intrinsics.checkNotNullParameter(returnUrlPath, "returnUrlPath");
            this.urlPath = urlPath;
            this.returnUrlPath = returnUrlPath;
        }
    }

    public /* synthetic */ ConfirmResponseStatusSpecs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConfirmResponseStatusSpecs() {
    }
}
