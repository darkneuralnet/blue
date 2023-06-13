.class public final LK74$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK74;->a(LgV2;JFJILEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LI61;",
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
.field public final synthetic g:J

.field public final synthetic h:LKS5;

.field public final synthetic i:F

.field public final synthetic j:J

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
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

.field public final synthetic n:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLKS5;FJLsP5;LsP5;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LKS5;",
            "FJ",
            "LsP5<",
            "Ljava/lang/Integer;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, LK74$a;->g:J

    iput-object p3, p0, LK74$a;->h:LKS5;

    iput p4, p0, LK74$a;->i:F

    iput-wide p5, p0, LK74$a;->j:J

    iput-object p7, p0, LK74$a;->k:LsP5;

    iput-object p8, p0, LK74$a;->l:LsP5;

    iput-object p9, p0, LK74$a;->m:LsP5;

    iput-object p10, p0, LK74$a;->n:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI61;

    invoke-virtual {p0, p1}, LK74$a;->invoke(LI61;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LI61;)V
    .locals 9

    const-string v0, "$this$Canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LK74$a;->g:J

    iget-object v2, p0, LK74$a;->h:LKS5;

    invoke-static {p1, v0, v1, v2}, LK74;->k(LI61;JLKS5;)V

    iget-object v0, p0, LK74$a;->k:LsP5;

    invoke-static {v0}, LK74;->i(LsP5;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x43580000    # 216.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    iget-object v1, p0, LK74$a;->l:LsP5;

    invoke-static {v1}, LK74;->g(LsP5;)F

    move-result v1

    iget-object v2, p0, LK74$a;->m:LsP5;

    invoke-static {v2}, LK74;->h(LsP5;)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v1, -0x3d4c0000    # -90.0f

    add-float/2addr v0, v1

    iget-object v1, p0, LK74$a;->n:LsP5;

    invoke-static {v1}, LK74;->j(LsP5;)F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, LK74$a;->m:LsP5;

    invoke-static {v1}, LK74;->h(LsP5;)F

    move-result v1

    add-float v3, v1, v0

    iget v4, p0, LK74$a;->i:F

    iget-wide v6, p0, LK74$a;->j:J

    iget-object v8, p0, LK74$a;->h:LKS5;

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LK74;->l(LI61;FFFJLKS5;)V

    return-void
.end method
