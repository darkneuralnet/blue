.class public final LOm2$b$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOm2$b;->u1(JFLkotlin/jvm/functions/Function1;)V
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
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/graphics/c;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LOm2;

.field public final synthetic i:J

.field public final synthetic j:F


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;LOm2;JF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/graphics/c;",
            "Lkotlin/Unit;",
            ">;",
            "LOm2;",
            "JF)V"
        }
    .end annotation

    iput-object p1, p0, LOm2$b$d;->g:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, LOm2$b$d;->h:LOm2;

    iput-wide p3, p0, LOm2$b$d;->i:J

    iput p5, p0, LOm2$b$d;->j:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOm2$b$d;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    sget-object v0, LOU3$a;->a:LOU3$a$a;

    iget-object v5, p0, LOm2$b$d;->g:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, LOm2$b$d;->h:LOm2;

    iget-wide v2, p0, LOm2$b$d;->i:J

    iget v4, p0, LOm2$b$d;->j:F

    if-nez v5, :cond_0

    invoke-virtual {v1}, LOm2;->z()LH83;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3, v4}, LOU3$a;->o(LOU3;JF)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LOm2;->z()LH83;

    move-result-object v1

    invoke-virtual/range {v0 .. v5}, LOU3$a;->A(LOU3;JFLkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void
.end method
