package io.card.payment;
/* loaded from: classes7.dex */
public class CardIONativeLibsConfig {
    private static String alternativeLibsPath;

    public static String getAlternativeLibsPath() {
        return alternativeLibsPath;
    }

    public static void init(String str) {
        alternativeLibsPath = str;
    }
}
