.class public final LO85$W;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO85;->K0(LNy;Ljava/lang/String;)V
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
.field public final synthetic g:LNy;

.field public final synthetic h:LO85;


# direct methods
.method public constructor <init>(LNy;LO85;)V
    .locals 0

    iput-object p1, p0, LO85$W;->g:LNy;

    iput-object p2, p0, LO85$W;->h:LO85;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO85$W;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    iget-object v0, p0, LO85$W;->g:LNy;

    instance-of v0, v0, LMw2;

    if-eqz v0, :cond_0

    iget-object v0, p0, LO85$W;->h:LO85;

    invoke-static {v0}, LO85;->access$getNavigator$p(LO85;)Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->C()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LO85$W;->h:LO85;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LO85;->access$enableScanner(LO85;Z)V

    :goto_0
    return-void
.end method
