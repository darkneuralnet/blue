.class public final LiC1$a$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiC1$a$e;->a(LP83;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LP83;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LP83;",
        "ne2",
        "",
        "a",
        "(LP83;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic g:LP83;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:LiC1$b;


# direct methods
.method public constructor <init>(LP83;FFLiC1$b;)V
    .locals 0

    iput-object p1, p0, LiC1$a$e$a;->g:LP83;

    iput p2, p0, LiC1$a$e$a;->h:F

    iput p3, p0, LiC1$a$e$a;->i:F

    iput-object p4, p0, LiC1$a$e$a;->j:LiC1$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LP83;)V
    .locals 4

    const-string v0, "ne2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LiC1$a$e$a;->g:LP83;

    invoke-virtual {v0}, LP83;->b()Lio/github/sceneview/node/Node;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LiC1$a$e$a;->g:LP83;

    iget v2, p0, LiC1$a$e$a;->h:F

    iget v3, p0, LiC1$a$e$a;->i:F

    invoke-virtual {v0, v1, p1, v2, v3}, Lio/github/sceneview/node/Node;->e(LP83;LP83;FF)V

    :cond_0
    iget-object v0, p0, LiC1$a$e$a;->j:LiC1$b;

    iget-object v1, p0, LiC1$a$e$a;->g:LP83;

    iget v2, p0, LiC1$a$e$a;->h:F

    iget v3, p0, LiC1$a$e$a;->i:F

    invoke-interface {v0, v1, p1, v2, v3}, LiC1$b;->e(LP83;LP83;FF)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP83;

    invoke-virtual {p0, p1}, LiC1$a$e$a;->a(LP83;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
