package com.appboy.enums;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"Lcom/appboy/enums/CardType;", "", "", "getValue", "()I", "value", "<init>", "(Ljava/lang/String;I)V", "Companion", C17296a.f69688o, "BANNER", "CAPTIONED_IMAGE", "DEFAULT", "SHORT_NEWS", "TEXT_ANNOUNCEMENT", "CONTROL", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum CardType {
    BANNER,
    CAPTIONED_IMAGE,
    DEFAULT,
    SHORT_NEWS,
    TEXT_ANNOUNCEMENT,
    CONTROL;
    
    public static final C16939a Companion = new C16939a(null);

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lcom/appboy/enums/CardType$a;", "", "", "value", "Lcom/appboy/enums/CardType;", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.enums.CardType$a */
    /* loaded from: classes.dex */
    public static final class C16939a {
        public /* synthetic */ C16939a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CardType m53472a(int i) {
            return CardType.values()[i];
        }

        private C16939a() {
        }
    }

    @JvmStatic
    public static final CardType fromValue(int i) {
        return Companion.m53472a(i);
    }

    public final int getValue() {
        return ordinal();
    }
}
