.class public final Lqn2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqn2;->a(LGn2;Lkotlin/jvm/functions/Function1;LEt0;I)Lon2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lpn2;",
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
            "LBn2;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LGn2;

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/ranges/IntRange;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;LGn2;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LBn2;",
            "Lkotlin/Unit;",
            ">;>;",
            "LGn2;",
            "LsP5<",
            "Lkotlin/ranges/IntRange;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqn2$b;->g:LsP5;

    iput-object p2, p0, Lqn2$b;->h:LGn2;

    iput-object p3, p0, Lqn2$b;->i:LsP5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lpn2;
    .locals 5

    new-instance v0, LCn2;

    invoke-direct {v0}, LCn2;-><init>()V

    iget-object v1, p0, Lqn2$b;->g:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lpn2;

    invoke-virtual {v0}, LCn2;->e()LtX2;

    move-result-object v2

    invoke-virtual {v0}, LCn2;->d()Z

    move-result v0

    iget-object v3, p0, Lqn2$b;->h:LGn2;

    iget-object v4, p0, Lqn2$b;->i:LsP5;

    invoke-interface {v4}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/ranges/IntRange;

    invoke-direct {v1, v2, v0, v3, v4}, Lpn2;-><init>(LR62;ZLGn2;Lkotlin/ranges/IntRange;)V

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqn2$b;->b()Lpn2;

    move-result-object v0

    return-object v0
.end method
