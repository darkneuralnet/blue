.class public final LQx5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQx5;->a(LgV2;FLhy5;ZJJ)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/ui/graphics/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/c;",
        "",
        "invoke",
        "(Landroidx/compose/ui/graphics/c;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:Lhy5;

.field public final synthetic i:Z

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public constructor <init>(FLhy5;ZJJ)V
    .locals 0

    iput p1, p0, LQx5$a;->g:F

    iput-object p2, p0, LQx5$a;->h:Lhy5;

    iput-boolean p3, p0, LQx5$a;->i:Z

    iput-wide p4, p0, LQx5$a;->j:J

    iput-wide p6, p0, LQx5$a;->k:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LQx5$a;->invoke(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LQx5$a;->g:F

    invoke-interface {p1, v0}, Lg01;->T0(F)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->T(F)V

    iget-object v0, p0, LQx5$a;->h:Lhy5;

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->S0(Lhy5;)V

    iget-boolean v0, p0, LQx5$a;->i:Z

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->O(Z)V

    iget-wide v0, p0, LQx5$a;->j:J

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->A0(J)V

    iget-wide v0, p0, LQx5$a;->k:J

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->G0(J)V

    return-void
.end method
