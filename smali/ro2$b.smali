.class public final Lro2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lro2;->a(LCo2;Lkotlin/jvm/functions/Function1;LEt0;I)Lpo2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lqo2;",
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
.field public final synthetic g:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "Lyo2;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/ranges/IntRange;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LMn2;

.field public final synthetic j:LCo2;


# direct methods
.method public constructor <init>(LsP5;LsP5;LMn2;LCo2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lyo2;",
            "Lkotlin/Unit;",
            ">;>;",
            "LsP5<",
            "Lkotlin/ranges/IntRange;",
            ">;",
            "LMn2;",
            "LCo2;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lro2$b;->g:LsP5;

    iput-object p2, p0, Lro2$b;->h:LsP5;

    iput-object p3, p0, Lro2$b;->i:LMn2;

    iput-object p4, p0, Lro2$b;->j:LCo2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lqo2;
    .locals 8

    new-instance v0, Lzo2;

    invoke-direct {v0}, Lzo2;-><init>()V

    iget-object v1, p0, Lro2$b;->g:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lqo2;

    invoke-virtual {v0}, Lzo2;->e()LR62;

    move-result-object v3

    iget-object v2, p0, Lro2$b;->h:LsP5;

    invoke-interface {v2}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lkotlin/ranges/IntRange;

    invoke-virtual {v0}, Lzo2;->d()Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lro2$b;->i:LMn2;

    iget-object v7, p0, Lro2$b;->j:LCo2;

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lqo2;-><init>(LR62;Lkotlin/ranges/IntRange;Ljava/util/List;LMn2;LCo2;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lro2$b;->b()Lqo2;

    move-result-object v0

    return-object v0
.end method
