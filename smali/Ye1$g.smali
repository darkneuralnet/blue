.class public final LYe1$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe1;->g(LF96;LZe1;Lgi1;Ljava/lang/String;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LF96$b<",
        "LXe1;",
        ">;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Ltm1<",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LZe1;

.field public final synthetic h:Lgi1;


# direct methods
.method public constructor <init>(LZe1;Lgi1;)V
    .locals 0

    iput-object p1, p0, LYe1$g;->g:LZe1;

    iput-object p2, p0, LYe1$g;->h:Lgi1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF96$b;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LYe1$g;->invoke(LF96$b;LEt0;I)Ltm1;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(LF96$b;LEt0;I)Ltm1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96$b<",
            "LXe1;",
            ">;",
            "LEt0;",
            "I)",
            "Ltm1<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$animateFloat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3681844

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:861)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, LXe1;->b:LXe1;

    sget-object v0, LXe1;->c:LXe1;

    invoke-interface {p1, p3, v0}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p1, p0, LYe1$g;->g:LZe1;

    invoke-virtual {p1}, LZe1;->b()LH96;

    move-result-object p1

    invoke-virtual {p1}, LH96;->b()Lvj1;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lvj1;->b()Ltm1;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_1
    invoke-static {}, LYe1;->d()LjO5;

    move-result-object p1

    goto :goto_0

    :cond_2
    sget-object p3, LXe1;->d:LXe1;

    invoke-interface {p1, v0, p3}, LF96$b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LYe1$g;->h:Lgi1;

    invoke-virtual {p1}, Lgi1;->b()LH96;

    move-result-object p1

    invoke-virtual {p1}, LH96;->b()Lvj1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lvj1;->b()Ltm1;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_3
    invoke-static {}, LYe1;->d()LjO5;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, LYe1;->d()LjO5;

    move-result-object p1

    :cond_5
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method
