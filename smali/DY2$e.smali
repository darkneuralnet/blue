.class public final LDY2$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDY2;->H(Landroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LUY2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LUY2;",
        "",
        "invoke",
        "(LUY2;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHY2;

.field public final synthetic h:LDY2;


# direct methods
.method public constructor <init>(LHY2;LDY2;)V
    .locals 0

    iput-object p1, p0, LDY2$e;->g:LHY2;

    iput-object p2, p0, LDY2$e;->h:LDY2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUY2;

    invoke-virtual {p0, p1}, LDY2$e;->invoke(LUY2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LUY2;)V
    .locals 6

    const-string v0, "$this$navOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LDY2$e$a;->g:LDY2$e$a;

    invoke-virtual {p1, v0}, LUY2;->a(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LDY2$e;->g:LHY2;

    instance-of v1, v0, LJY2;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    sget-object v1, LHY2;->k:LHY2$a;

    invoke-virtual {v1, v0}, LHY2$a;->c(LHY2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iget-object v1, p0, LDY2$e;->h:LDY2;

    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LHY2;

    invoke-virtual {v1}, LDY2;->A()LHY2;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LHY2;->v()LJY2;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v4

    :goto_1
    if-eqz v0, :cond_3

    move v2, v4

    :cond_3
    if-eqz v2, :cond_4

    invoke-static {}, LDY2;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LJY2;->q:LJY2$a;

    iget-object v1, p0, LDY2$e;->h:LDY2;

    invoke-virtual {v1}, LDY2;->C()LJY2;

    move-result-object v1

    invoke-virtual {v0, v1}, LJY2$a;->a(LJY2;)LHY2;

    move-result-object v0

    invoke-virtual {v0}, LHY2;->s()I

    move-result v0

    sget-object v1, LDY2$e$b;->g:LDY2$e$b;

    invoke-virtual {p1, v0, v1}, LUY2;->c(ILkotlin/jvm/functions/Function1;)V

    :cond_4
    return-void
.end method
