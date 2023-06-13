.class public final LZS5$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZS5;-><init>(LbT5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LJm2;",
        "LZS5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LJm2;",
        "LZS5;",
        "it",
        "",
        "a",
        "(LJm2;LZS5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZS5;


# direct methods
.method public constructor <init>(LZS5;)V
    .locals 0

    iput-object p1, p0, LZS5$d;->g:LZS5;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJm2;LZS5;)V
    .locals 2

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LZS5$d;->g:LZS5;

    invoke-virtual {p1}, LJm2;->s0()LQm2;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LQm2;

    iget-object v1, p0, LZS5$d;->g:LZS5;

    invoke-static {v1}, LZS5;->a(LZS5;)LbT5;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LQm2;-><init>(LJm2;LbT5;)V

    invoke-virtual {p1, v0}, LJm2;->B1(LQm2;)V

    :cond_0
    invoke-static {p2, v0}, LZS5;->c(LZS5;LQm2;)V

    iget-object p1, p0, LZS5$d;->g:LZS5;

    invoke-static {p1}, LZS5;->b(LZS5;)LQm2;

    move-result-object p1

    invoke-virtual {p1}, LQm2;->q()V

    iget-object p1, p0, LZS5$d;->g:LZS5;

    invoke-static {p1}, LZS5;->b(LZS5;)LQm2;

    move-result-object p1

    iget-object p2, p0, LZS5$d;->g:LZS5;

    invoke-static {p2}, LZS5;->a(LZS5;)LbT5;

    move-result-object p2

    invoke-virtual {p1, p2}, LQm2;->v(LbT5;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJm2;

    check-cast p2, LZS5;

    invoke-virtual {p0, p1, p2}, LZS5$d;->a(LJm2;LZS5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
