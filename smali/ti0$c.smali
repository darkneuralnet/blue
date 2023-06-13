.class public final Lti0$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti0;->b(ZLn56;LgV2;Lri0;LEt0;I)V
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
.field public final synthetic g:Lmi0;

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
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


# direct methods
.method public constructor <init>(Lmi0;LsP5;LsP5;LsP5;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmi0;",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lti0$c;->g:Lmi0;

    iput-object p2, p0, Lti0$c;->h:LsP5;

    iput-object p3, p0, Lti0$c;->i:LsP5;

    iput-object p4, p0, Lti0$c;->j:LsP5;

    iput-object p5, p0, Lti0$c;->k:LsP5;

    iput-object p6, p0, Lti0$c;->l:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI61;

    invoke-virtual {p0, p1}, Lti0$c;->invoke(LI61;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LI61;)V
    .locals 9

    const-string v0, "$this$Canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lti0;->r()F

    move-result v0

    invoke-interface {p1, v0}, Lg01;->T0(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lti0$c;->h:LsP5;

    invoke-static {v1}, Lti0;->n(LsP5;)J

    move-result-wide v3

    iget-object v1, p0, Lti0$c;->i:LsP5;

    invoke-static {v1}, Lti0;->j(LsP5;)J

    move-result-wide v5

    invoke-static {}, Lti0;->q()F

    move-result v1

    invoke-interface {p1, v1}, Lg01;->T0(F)F

    move-result v7

    move-object v2, p1

    move v8, v0

    invoke-static/range {v2 .. v8}, Lti0;->o(LI61;JJFF)V

    iget-object v1, p0, Lti0$c;->j:LsP5;

    invoke-static {v1}, Lti0;->m(LsP5;)J

    move-result-wide v3

    iget-object v1, p0, Lti0$c;->k:LsP5;

    invoke-static {v1}, Lti0;->k(LsP5;)F

    move-result v5

    iget-object v1, p0, Lti0$c;->l:LsP5;

    invoke-static {v1}, Lti0;->l(LsP5;)F

    move-result v6

    iget-object v8, p0, Lti0$c;->g:Lmi0;

    move v7, v0

    invoke-static/range {v2 .. v8}, Lti0;->p(LI61;JFFFLmi0;)V

    return-void
.end method
