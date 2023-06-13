.class public final LH83$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH83;->p2(LvZ0;LH83$f;JLRM1;ZZF)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u0002\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LvZ0;",
        "T",
        "",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1354:1\n69#2:1355\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n*L\n642#1:1355\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LH83;

.field public final synthetic h:LvZ0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic i:LH83$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LH83$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic j:J

.field public final synthetic k:LRM1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LRM1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:F


# direct methods
.method public constructor <init>(LH83;LvZ0;LH83$f;JLRM1;ZZF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LH83;",
            "TT;",
            "LH83$f<",
            "TT;>;J",
            "LRM1<",
            "TT;>;ZZF)V"
        }
    .end annotation

    iput-object p1, p0, LH83$h;->g:LH83;

    iput-object p2, p0, LH83$h;->h:LvZ0;

    iput-object p3, p0, LH83$h;->i:LH83$f;

    iput-wide p4, p0, LH83$h;->j:J

    iput-object p6, p0, LH83$h;->k:LRM1;

    iput-boolean p7, p0, LH83$h;->l:Z

    iput-boolean p8, p0, LH83$h;->m:Z

    iput p9, p0, LH83$h;->n:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH83$h;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    iget-object v0, p0, LH83$h;->g:LH83;

    iget-object v1, p0, LH83$h;->h:LvZ0;

    iget-object v2, p0, LH83$h;->i:LH83$f;

    invoke-interface {v2}, LH83$f;->a()I

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, LK83;->a(I)I

    move-result v3

    invoke-static {v1, v2, v3}, LI83;->a(LvZ0;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LvZ0;

    iget-object v2, p0, LH83$h;->i:LH83$f;

    iget-wide v3, p0, LH83$h;->j:J

    iget-object v5, p0, LH83$h;->k:LRM1;

    iget-boolean v6, p0, LH83$h;->l:Z

    iget-boolean v7, p0, LH83$h;->m:Z

    iget v8, p0, LH83$h;->n:F

    invoke-static/range {v0 .. v8}, LH83;->K1(LH83;LvZ0;LH83$f;JLRM1;ZZF)V

    return-void
.end method
