.class public final LpE3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "id",
        "LnE3;",
        "d",
        "(ILEt0;I)LnE3;",
        "Landroid/content/res/Resources$Theme;",
        "Landroid/content/res/Resources;",
        "theme",
        "res",
        "changingConfigurations",
        "LtY1;",
        "c",
        "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILEt0;I)LtY1;",
        "LMW1;",
        "b",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Landroid/content/res/Resources;I)LMW1;
    .locals 0

    invoke-static {p0, p1}, LpE3;->b(Landroid/content/res/Resources;I)LMW1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/content/res/Resources;I)LMW1;
    .locals 1

    :try_start_0
    sget-object v0, LMW1;->a:LMW1$a;

    invoke-static {v0, p0, p1}, LPX1;->a(LMW1$a;Landroid/content/res/Resources;I)LMW1;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILEt0;I)LtY1;
    .locals 3

    const v0, 0x14d7d89

    invoke-interface {p4, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->h()LU94;

    move-result-object p5

    invoke-interface {p4, p5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LuY1;

    new-instance v0, LuY1$b;

    invoke-direct {v0, p0, p2}, LuY1$b;-><init>(Landroid/content/res/Resources$Theme;I)V

    invoke-virtual {p5, v0}, LuY1;->b(LuY1$b;)LuY1$a;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    const-string v1, "res.getXml(id)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LXH6;->j(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "vector"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0, p1, p2, p3}, Ljk6;->a(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)LuY1$a;

    move-result-object v1

    invoke-virtual {p5, v0, v1}, LuY1;->d(LuY1$b;LuY1$a;)V

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    invoke-virtual {v1}, LuY1$a;->b()LtY1;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p4}, LEt0;->Q()V

    return-object p0
.end method

.method public static final d(ILEt0;I)LnE3;
    .locals 10

    const v0, 0x1c403a8f

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LDM4;->a(LEt0;I)Landroid/content/res/Resources;

    move-result-object v3

    const v2, -0x1d58f75c

    invoke-interface {p1, v2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_1

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-interface {p1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v2, Landroid/util/TypedValue;

    const/4 v5, 0x1

    invoke-virtual {v3, p0, v2, v5}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v6, v2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v6, :cond_2

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v9, ".xml"

    invoke-static {v6, v9, v1, v7, v8}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v7

    if-ne v7, v5, :cond_2

    goto :goto_0

    :cond_2
    move v5, v1

    :goto_0
    if-eqz v5, :cond_3

    const v4, -0x2c0108ef

    invoke-interface {p1, v4}, LEt0;->F(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const-string v4, "context.theme"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, v2, Landroid/util/TypedValue;->changingConfigurations:I

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 v7, p2, 0x48

    move-object v2, v0

    move v4, p0

    move-object v6, p1

    invoke-static/range {v2 .. v7}, LpE3;->c(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILEt0;I)LtY1;

    move-result-object p0

    invoke-static {p0, p1, v1}, Lgk6;->b(LtY1;LEt0;I)Lfk6;

    move-result-object p0

    invoke-interface {p1}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    const p2, -0x2c010854

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x607fb4c4

    invoke-interface {p1, v1}, LEt0;->F(I)V

    invoke-interface {p1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p2, v1

    invoke-interface {p1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_5

    :cond_4
    invoke-static {v3, p0}, LpE3;->a(Landroid/content/res/Resources;I)LMW1;

    move-result-object v0

    invoke-interface {p1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p1}, LEt0;->Q()V

    move-object v2, v0

    check-cast v2, LMW1;

    new-instance p0, LcU;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, LcU;-><init>(LMW1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method
