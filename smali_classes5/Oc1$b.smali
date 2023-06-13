.class public final LOc1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOc1;-><init>(LWT2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LpI4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LpI4;",
        "b",
        "()LpI4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOc1;


# direct methods
.method public constructor <init>(LOc1;)V
    .locals 0

    iput-object p1, p0, LOc1$b;->g:LOc1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LpI4;
    .locals 4

    iget-object v0, p0, LOc1$b;->g:LOc1;

    invoke-static {v0}, LOc1;->r(LOc1;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    iget-object v1, p0, LOc1$b;->g:LOc1;

    invoke-virtual {v1}, LOc1;->t()LWT2;

    move-result-object v1

    iget-object v2, p0, LOc1$b;->g:LOc1;

    invoke-virtual {v2}, LOc1;->u()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LOc1$b;->g:LOc1;

    invoke-virtual {v3}, LOc1;->getParameters()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpI4;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOc1$b;->b()LpI4;

    move-result-object v0

    return-object v0
.end method
