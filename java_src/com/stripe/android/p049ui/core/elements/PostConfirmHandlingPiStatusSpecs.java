package com.stripe.android.p049ui.core.elements;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
@InterfaceC36928Ws5(with = PostConfirmHandlingPiStatusSpecsSerializer.class)
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "", "()V", "CanceledSpec", "Companion", "FinishedSpec", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.PostConfirmHandlingPiStatusSpecs */
/* loaded from: classes7.dex */
public abstract class PostConfirmHandlingPiStatusSpecs {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @InterfaceC36694Vs5("canceled")
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$CanceledSpec;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "LKj2;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* renamed from: com.stripe.android.ui.core.elements.PostConfirmHandlingPiStatusSpecs$CanceledSpec */
    /* loaded from: classes7.dex */
    public static final class CanceledSpec extends PostConfirmHandlingPiStatusSpecs {
        private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final int $stable = 0;
        public static final CanceledSpec INSTANCE = new CanceledSpec();

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C19407x1f8d9e12.INSTANCE);
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.PostConfirmHandlingPiStatusSpecs$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PostConfirmHandlingPiStatusSpecs> serializer() {
            return PostConfirmHandlingPiStatusSpecsSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC36694Vs5("finished")
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs$FinishedSpec;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "LKj2;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @InterfaceC36928Ws5
    /* renamed from: com.stripe.android.ui.core.elements.PostConfirmHandlingPiStatusSpecs$FinishedSpec */
    /* loaded from: classes7.dex */
    public static final class FinishedSpec extends PostConfirmHandlingPiStatusSpecs {
        private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
        public static final int $stable = 0;
        public static final FinishedSpec INSTANCE = new FinishedSpec();

        static {
            Lazy<InterfaceC34036Kj2<Object>> lazy;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C19408x87e0159.INSTANCE);
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

    public /* synthetic */ PostConfirmHandlingPiStatusSpecs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PostConfirmHandlingPiStatusSpecs() {
    }
}
