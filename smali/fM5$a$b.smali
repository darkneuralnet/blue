.class public final LfM5$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LfM5$a;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LcM5;

.field public final synthetic h:Lxj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxj1<",
            "LcM5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LcM5;Lxj1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcM5;",
            "Lxj1<",
            "LcM5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LfM5$a$b;->g:LcM5;

    iput-object p2, p0, LfM5$a$b;->h:Lxj1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LfM5$a$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, LfM5$a$b;->g:LcM5;

    iget-object v1, p0, LfM5$a$b;->h:Lxj1;

    invoke-virtual {v1}, Lxj1;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LfM5$a$b;->h:Lxj1;

    invoke-virtual {v0}, Lxj1;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, LfM5$a$b$a;

    iget-object v2, p0, LfM5$a$b;->g:LcM5;

    invoke-direct {v1, v2}, LfM5$a$b$a;-><init>(LcM5;)V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object v0, p0, LfM5$a$b;->h:Lxj1;

    invoke-virtual {v0}, Lxj1;->c()Lns4;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lns4;->invalidate()V

    :cond_0
    return-void
.end method
