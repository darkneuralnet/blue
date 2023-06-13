.class public final LPY2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001b\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\t2\"\u0010\u0008\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u001a\u001a\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\t\u0012\u0002\u0008\u00030\u000f2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "LDY2;",
        "LsP5;",
        "LAY2;",
        "d",
        "(LDY2;LEt0;I)LsP5;",
        "",
        "Ld13;",
        "LHY2;",
        "navigators",
        "LOY2;",
        "e",
        "([Ld13;LEt0;I)LOY2;",
        "Landroid/content/Context;",
        "context",
        "c",
        "LRi5;",
        "a",
        "navigation-compose_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;)LRi5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "LRi5<",
            "LOY2;",
            "*>;"
        }
    .end annotation

    sget-object v0, LPY2$a;->g:LPY2$a;

    new-instance v1, LPY2$b;

    invoke-direct {v1, p0}, LPY2$b;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, LSi5;->a(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)LRi5;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Landroid/content/Context;)LOY2;
    .locals 0

    invoke-static {p0}, LPY2;->c(Landroid/content/Context;)LOY2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;)LOY2;
    .locals 2

    new-instance v0, LOY2;

    invoke-direct {v0, p0}, LOY2;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, LDY2;->E()Li13;

    move-result-object p0

    new-instance v1, Lzt0;

    invoke-direct {v1}, Lzt0;-><init>()V

    invoke-virtual {p0, v1}, Li13;->b(Ld13;)Ld13;

    invoke-virtual {v0}, LDY2;->E()Li13;

    move-result-object p0

    new-instance v1, Lx31;

    invoke-direct {v1}, Lx31;-><init>()V

    invoke-virtual {p0, v1}, Li13;->b(Ld13;)Ld13;

    return-object v0
.end method

.method public static final d(LDY2;LEt0;I)LsP5;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDY2;",
            "LEt0;",
            "I)",
            "LsP5<",
            "LAY2;",
            ">;"
        }
    .end annotation

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, -0x72cc7a3

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-virtual {p0}, LDY2;->z()LEu1;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v4, 0x38

    const/4 v5, 0x2

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object p0

    invoke-interface {p1}, LEt0;->Q()V

    return-object p0
.end method

.method public static final e([Ld13;LEt0;I)LOY2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ld13<",
            "+",
            "LHY2;",
            ">;",
            "LEt0;",
            "I)",
            "LOY2;"
        }
    .end annotation

    const-string p2, "navigators"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, -0x129c080e

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, LPY2;->a(Landroid/content/Context;)LRi5;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, LPY2$c;

    invoke-direct {v4, p2}, LPY2$c;-><init>(Landroid/content/Context;)V

    const/16 v6, 0x48

    const/4 v7, 0x4

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOY2;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-virtual {p2}, LDY2;->E()Li13;

    move-result-object v3

    invoke-virtual {v3, v2}, Li13;->b(Ld13;)Ld13;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
