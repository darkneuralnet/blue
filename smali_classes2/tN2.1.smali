.class public final LtN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a3\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000c\"\u000e\u0008\u0000\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00010\u0008\"\u0008\u0008\u0001\u0010\u000b*\u00020\n*\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001aY\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u000c\"\u000e\u0008\u0000\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00010\u0008\"\u0008\u0008\u0001\u0010\u000b*\u00020\n\"\u0004\u0008\u0002\u0010\u000f*\u00028\u00002\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001aM\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u000c\"\u000e\u0008\u0000\u0010\t*\u0008\u0012\u0004\u0012\u00028\u00010\u0008\"\u0008\u0008\u0001\u0010\u000b*\u00020\n\"\u0004\u0008\u0002\u0010\u0016*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Landroidx/activity/ComponentActivity;",
        "f",
        "Landroid/view/View;",
        "view",
        "Landroidx/fragment/app/Fragment;",
        "g",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "LsP5;",
        "b",
        "(LRN2;LEt0;I)LsP5;",
        "O",
        "",
        "key",
        "Lkotlin/Function1;",
        "mapper",
        "c",
        "(LRN2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;",
        "A",
        "Lkotlin/reflect/KProperty1;",
        "prop1",
        "d",
        "(LRN2;Lkotlin/reflect/KProperty1;LEt0;I)LsP5;",
        "mvrx-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final synthetic a(LsP5;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-static {p0}, LtN2;->e(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LRN2;LEt0;I)LsP5;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            ">(TVM;",
            "LEt0;",
            "I)",
            "LsP5<",
            "TS;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2c4bc14a

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:137)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LRN2;->getStateFlow()LEu1;

    move-result-object v3

    sget-object p2, LtN2$a;->g:LtN2$a;

    invoke-static {p0, p2}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x2

    move-object v6, p1

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method

.method public static final c(LRN2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            "O:",
            "Ljava/lang/Object;",
            ">(TVM;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-TS;+TO;>;",
            "LEt0;",
            "II)",
            "LsP5<",
            "TO;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6fe0d91

    invoke-interface {p3, v0}, LEt0;->F(I)V

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    invoke-static {}, LQt0;->O()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v1, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:151)"

    invoke-static {v0, p4, p5, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    shr-int/lit8 p4, p4, 0x6

    and-int/lit8 p4, p4, 0xe

    invoke-static {p2, p3, p4}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p2

    const p4, 0x44faf204

    invoke-interface {p3, p4}, LEt0;->F(I)V

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object p5

    if-nez p1, :cond_2

    sget-object p1, LEt0;->a:LEt0$a;

    invoke-virtual {p1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p5, p1, :cond_3

    :cond_2
    invoke-virtual {p0}, LRN2;->getStateFlow()LEu1;

    move-result-object p1

    new-instance p5, LtN2$d;

    invoke-direct {p5, p1, p2}, LtN2$d;-><init>(LEu1;LsP5;)V

    invoke-static {p5}, LVu1;->p(LEu1;)LEu1;

    move-result-object p5

    invoke-interface {p3, p5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p3}, LEt0;->Q()V

    move-object v0, p5

    check-cast v0, LEu1;

    invoke-interface {p3, p4}, LEt0;->F(I)V

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object p4

    if-nez p1, :cond_4

    sget-object p1, LEt0;->a:LEt0$a;

    invoke-virtual {p1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p4, p1, :cond_5

    :cond_4
    new-instance p4, LtN2$b;

    invoke-direct {p4, p2}, LtN2$b;-><init>(LsP5;)V

    invoke-interface {p3, p4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p3}, LEt0;->Q()V

    check-cast p4, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p4}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v4, 0x8

    const/4 v5, 0x2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p3}, LEt0;->Q()V

    return-object p0
.end method

.method public static final d(LRN2;Lkotlin/reflect/KProperty1;LEt0;I)LsP5;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VM:",
            "LRN2<",
            "TS;>;S::",
            "LAN2;",
            "A:",
            "Ljava/lang/Object;",
            ">(TVM;",
            "Lkotlin/reflect/KProperty1<",
            "TS;+TA;>;",
            "LEt0;",
            "I)",
            "LsP5<",
            "TA;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prop1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3f602f1b

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.airbnb.mvrx.compose.collectAsState (MavericksComposeExtensions.kt:163)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    invoke-virtual {p0}, LRN2;->getStateFlow()LEu1;

    move-result-object p3

    new-instance v0, LtN2$e;

    invoke-direct {v0, p3, p1}, LtN2$e;-><init>(LEu1;Lkotlin/reflect/KProperty1;)V

    invoke-static {v0}, LVu1;->p(LEu1;)LEu1;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    move-object v1, v0

    check-cast v1, LEu1;

    new-instance p3, LtN2$c;

    invoke-direct {p3, p1}, LtN2$c;-><init>(Lkotlin/reflect/KProperty1;)V

    invoke-static {p0, p3}, LVr6;->a(LRN2;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x2

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object p0
.end method

.method public static final e(LsP5;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-TS;+TO;>;>;)",
            "Lkotlin/jvm/functions/Function1<",
            "TS;TO;>;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/activity/ComponentActivity;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/activity/ComponentActivity;

    return-object p0

    :cond_0
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    instance-of v0, p0, Landroidx/activity/ComponentActivity;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/activity/ComponentActivity;

    return-object p0

    :cond_1
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "currentContext.baseContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g(Landroid/view/View;)Landroidx/fragment/app/Fragment;
    .locals 1

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->k0(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
