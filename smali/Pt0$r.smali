.class public final LPt0$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->J0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LPt0;

.field public final synthetic h:LjW2;


# direct methods
.method public constructor <init>(LPt0;LjW2;)V
    .locals 0

    iput-object p1, p0, LPt0$r;->g:LPt0;

    iput-object p2, p0, LPt0$r;->h:LjW2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPt0$r;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    iget-object v0, p0, LPt0$r;->g:LPt0;

    iget-object v1, p0, LPt0$r;->h:LjW2;

    invoke-virtual {v1}, LjW2;->c()LhW2;

    move-result-object v1

    iget-object v2, p0, LPt0$r;->h:LjW2;

    invoke-virtual {v2}, LjW2;->e()LFR3;

    move-result-object v2

    iget-object v3, p0, LPt0$r;->h:LjW2;

    invoke-virtual {v3}, LjW2;->f()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, LPt0;->d0(LPt0;LhW2;LFR3;Ljava/lang/Object;Z)V

    return-void
.end method
