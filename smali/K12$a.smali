.class public final LK12$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK12;->d(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;LI12;Ljava/lang/String;LEt0;II)LsP5;
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
.field public final synthetic g:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic h:LJ12$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJ12$a<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic j:LI12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI12<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LJ12$a;Ljava/lang/Object;LI12;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LJ12$a<",
            "TT;TV;>;TT;",
            "LI12<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LK12$a;->g:Ljava/lang/Object;

    iput-object p2, p0, LK12$a;->h:LJ12$a;

    iput-object p3, p0, LK12$a;->i:Ljava/lang/Object;

    iput-object p4, p0, LK12$a;->j:LI12;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK12$a;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, LK12$a;->g:Ljava/lang/Object;

    iget-object v1, p0, LK12$a;->h:LJ12$a;

    invoke-virtual {v1}, LJ12$a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK12$a;->i:Ljava/lang/Object;

    iget-object v1, p0, LK12$a;->h:LJ12$a;

    invoke-virtual {v1}, LJ12$a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LK12$a;->h:LJ12$a;

    iget-object v1, p0, LK12$a;->g:Ljava/lang/Object;

    iget-object v2, p0, LK12$a;->i:Ljava/lang/Object;

    iget-object v3, p0, LK12$a;->j:LI12;

    invoke-virtual {v0, v1, v2, v3}, LJ12$a;->l(Ljava/lang/Object;Ljava/lang/Object;Llf;)V

    :cond_1
    return-void
.end method
