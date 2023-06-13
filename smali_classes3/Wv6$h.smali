.class public final LWv6$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/Earth;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/ar/core/Earth;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/google/ar/core/Earth;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;

.field public final synthetic h:LYv6;


# direct methods
.method public constructor <init>(LWv6;LYv6;)V
    .locals 0

    iput-object p1, p0, LWv6$h;->g:LWv6;

    iput-object p2, p0, LWv6$h;->h:LYv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Earth;)V
    .locals 7

    iget-object v0, p0, LWv6$h;->g:LWv6;

    invoke-static {v0}, LWv6;->access$getDebugging$p(LWv6;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LWv6$h;->g:LWv6;

    iget-object v0, p0, LWv6$h;->h:LYv6;

    invoke-interface {v0}, LYv6;->C4()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/ar/core/Session;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, LWv6;->u0(LWv6;Lcom/google/ar/core/Earth;Lcom/google/ar/core/Session;Lco/bird/android/buava/Optional;ILjava/lang/Object;)V

    :cond_0
    iget-object p1, p0, LWv6$h;->g:LWv6;

    new-instance v0, LKt4;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LKt4;-><init>(Z)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/Earth;

    invoke-virtual {p0, p1}, LWv6$h;->a(Lcom/google/ar/core/Earth;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
