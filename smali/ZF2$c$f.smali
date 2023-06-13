.class public final LZF2$c$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZF2$c;->i(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LCe3;",
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
.field public final synthetic g:Lg01;

.field public final synthetic h:LsP5;
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

.field public final synthetic i:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg01;LsP5;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg01;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "LCe3;",
            ">;>;",
            "LEX2<",
            "LCe3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LZF2$c$f;->g:Lg01;

    iput-object p2, p0, LZF2$c$f;->h:LsP5;

    iput-object p3, p0, LZF2$c$f;->i:LEX2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 4

    iget-object v0, p0, LZF2$c$f;->h:LsP5;

    invoke-static {v0}, LZF2$c;->d(LsP5;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, LZF2$c$f;->g:Lg01;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCe3;

    invoke-virtual {v0}, LCe3;->x()J

    move-result-wide v0

    iget-object v2, p0, LZF2$c$f;->i:LEX2;

    invoke-static {v2}, LZF2$c;->a(LEX2;)J

    move-result-wide v2

    invoke-static {v2, v3}, LGe3;->c(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, LGe3;->c(J)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LZF2$c$f;->i:LEX2;

    invoke-static {v2}, LZF2$c;->a(LEX2;)J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, LCe3;->t(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LCe3;->b:LCe3$a;

    invoke-virtual {v0}, LCe3$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LZF2$c$f;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, LCe3;->d(J)LCe3;

    move-result-object v0

    return-object v0
.end method
