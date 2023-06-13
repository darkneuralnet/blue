package com.stripe.android.link.theme;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/link/theme/LinkColors;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ThemeKt$LocalColors$1 extends Lambda implements Function0<LinkColors> {
    public static final ThemeKt$LocalColors$1 INSTANCE = new ThemeKt$LocalColors$1();

    public ThemeKt$LocalColors$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinkColors invoke() {
        return LinkThemeConfig.INSTANCE.colors(false);
    }
}
