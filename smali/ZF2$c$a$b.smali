.class public final LZF2$c$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZF2$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic g:LEV3;

.field public final synthetic h:Lg01;

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "Lg01;",
            "LCe3;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic l:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic n:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic o:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEV3;Lg01;LsP5;LsP5;LsP5;LEX2;LsP5;Lkotlin/jvm/internal/Ref$LongRef;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEV3;",
            "Lg01;",
            "LsP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LsP5<",
            "LCe3;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;>;",
            "LEX2<",
            "LCe3;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/internal/Ref$LongRef;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lo61;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LZF2$c$a$b;->g:LEV3;

    iput-object p2, p0, LZF2$c$a$b;->h:Lg01;

    iput-object p3, p0, LZF2$c$a$b;->i:LsP5;

    iput-object p4, p0, LZF2$c$a$b;->j:LsP5;

    iput-object p5, p0, LZF2$c$a$b;->k:LsP5;

    iput-object p6, p0, LZF2$c$a$b;->l:LEX2;

    iput-object p7, p0, LZF2$c$a$b;->m:LsP5;

    iput-object p8, p0, LZF2$c$a$b;->n:Lkotlin/jvm/internal/Ref$LongRef;

    iput-object p9, p0, LZF2$c$a$b;->o:LsP5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZF2$c$a$b;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    iget-object v0, p0, LZF2$c$a$b;->i:LsP5;

    invoke-static {v0}, LZF2$c;->b(LsP5;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LZF2$c$a$b;->g:LEV3;

    iget-object v0, p0, LZF2$c$a$b;->j:LsP5;

    invoke-static {v0}, LZF2$c;->h(LsP5;)J

    move-result-wide v2

    iget-object v0, p0, LZF2$c$a$b;->k:LsP5;

    invoke-static {v0}, LZF2$c;->e(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v4, p0, LZF2$c$a$b;->h:Lg01;

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v4, p0, LZF2$c$a$b;->l:LEX2;

    check-cast v0, LCe3;

    invoke-virtual {v0}, LCe3;->x()J

    move-result-wide v5

    invoke-static {v5, v6}, LGe3;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v4}, LZF2$c;->a(LEX2;)J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, LCe3;->t(JJ)J

    move-result-wide v4

    goto :goto_0

    :cond_0
    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->b()J

    move-result-wide v4

    :goto_0
    iget-object v0, p0, LZF2$c$a$b;->m:LsP5;

    invoke-static {v0}, LZF2$c;->f(LsP5;)F

    move-result v6

    invoke-interface/range {v1 .. v6}, LEV3;->b(JJF)V

    iget-object v0, p0, LZF2$c$a$b;->g:LEV3;

    invoke-interface {v0}, LEV3;->a()J

    move-result-wide v0

    iget-object v2, p0, LZF2$c$a$b;->n:Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v3, p0, LZF2$c$a$b;->h:Lg01;

    iget-object v4, p0, LZF2$c$a$b;->o:LsP5;

    iget-wide v5, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v0, v1, v5, v6}, LG52;->e(JJ)Z

    move-result v5

    if-nez v5, :cond_2

    iput-wide v0, v2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v4}, LZF2$c;->g(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v0, v1}, LH52;->c(J)J

    move-result-wide v0

    invoke-interface {v3, v0, v1}, Lg01;->j(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo61;->c(J)Lo61;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object v0, p0, LZF2$c$a$b;->g:LEV3;

    invoke-interface {v0}, LEV3;->dismiss()V

    :cond_2
    :goto_1
    return-void
.end method
