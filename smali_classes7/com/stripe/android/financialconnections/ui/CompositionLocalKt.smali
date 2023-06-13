.class public final Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "reducedBrandingOverride",
        "Lkotlin/Function0;",
        "",
        "content",
        "FinancialConnectionsPreview",
        "(ZLkotlin/jvm/functions/Function2;LEt0;II)V",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x39a47414

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LEt0;->o(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v3, 0x0

    if-eqz v1, :cond_8

    move p0, v3

    :cond_8
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v4, "com.stripe.android.financialconnections.ui.FinancialConnectionsPreview (CompositionLocal.kt:18)"

    invoke-static {v0, v2, v1, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    new-array v0, v3, [Ld13;

    const/16 v1, 0x8

    invoke-static {v0, p2, v1}, LPY2;->e([Ld13;LEt0;I)LOY2;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;

    invoke-direct {v1, v0, p0, p1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$1;-><init>(LOY2;ZLkotlin/jvm/functions/Function2;I)V

    const v0, -0x793d421e

    const/4 v2, 0x1

    invoke-static {p2, v0, v2, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p2, v1}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->FinancialConnectionsTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_b

    goto :goto_6

    :cond_b
    new-instance v0, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$2;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt$FinancialConnectionsPreview$2;-><init>(ZLkotlin/jvm/functions/Function2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method
