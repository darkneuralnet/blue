package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.C19369R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/TranslationId;", "", "resourceId", "", "(Ljava/lang/String;II)V", "getResourceId", "()I", "IdealBank", "P24Bank", "EpsBank", "AddressName", "AuBecsAccountName", "Companion", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.TranslationId */
/* loaded from: classes7.dex */
public enum TranslationId {
    IdealBank(C19369R.string.ideal_bank),
    P24Bank(C19369R.string.p24_bank),
    EpsBank(C19369R.string.eps_bank),
    AddressName(C19369R.string.address_label_full_name),
    AuBecsAccountName(C19369R.string.au_becs_account_name);
    
    private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int resourceId;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/TranslationId$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/TranslationId;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.TranslationId$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return TranslationId.$cachedSerializer$delegate;
        }

        public final InterfaceC34036Kj2<TranslationId> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) TranslationId$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    TranslationId(int i) {
        this.resourceId = i;
    }

    public final int getResourceId() {
        return this.resourceId;
    }
}
