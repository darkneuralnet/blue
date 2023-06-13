package com.stripe.android.financialconnections.model;

import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
@InterfaceC36928Ws5(with = Serializer.class)
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUTOMATIC", "CUSTOM", "UNKNOWN", "Companion", "Serializer", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum ManualEntryMode {
    AUTOMATIC("automatic"),
    CUSTOM("custom"),
    UNKNOWN("unknown");
    
    private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final String value;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return ManualEntryMode.$cachedSerializer$delegate;
        }

        public final InterfaceC34036Kj2<ManualEntryMode> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Serializer extends EnumIgnoreUnknownSerializer<ManualEntryMode> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(ManualEntryMode.values(), ManualEntryMode.UNKNOWN);
        }
    }

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) ManualEntryMode$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    ManualEntryMode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
