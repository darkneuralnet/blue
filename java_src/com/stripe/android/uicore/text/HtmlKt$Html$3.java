package com.stripe.android.uicore.text;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p000.C1577Df;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$Html$3 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ C1577Df $annotatedText;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$Html$3(boolean z, Function0<Unit> function0, C1577Df c1577Df, Context context) {
        super(1);
        this.$enabled = z;
        this.$onClick = function0;
        this.$annotatedText = c1577Df;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        Object firstOrNull;
        if (this.$enabled) {
            this.$onClick.invoke();
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.$annotatedText.m110053i("URL", i, i));
            C1577Df.C1580b c1580b = (C1577Df.C1580b) firstOrNull;
            if (c1580b != null) {
                Context context = this.$context;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse((String) c1580b.m110028e()));
                context.startActivity(intent);
            }
        }
    }
}
