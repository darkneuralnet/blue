.class public final LYe1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYe1;->g(LF96;LZe1;Lgi1;Ljava/lang/String;LEt0;I)LgV2;
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
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Landroidx/compose/ui/graphics/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Landroidx/compose/ui/graphics/f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYe1$e;->g:LsP5;

    iput-object p2, p0, LYe1$e;->h:LsP5;

    iput-object p3, p0, LYe1$e;->i:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LYe1$e;->invoke(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYe1$e;->g:LsP5;

    invoke-static {v0}, LYe1;->c(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->g(F)V

    iget-object v0, p0, LYe1$e;->h:LsP5;

    invoke-static {v0}, LYe1;->a(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->D(F)V

    iget-object v0, p0, LYe1$e;->h:LsP5;

    invoke-static {v0}, LYe1;->a(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->E(F)V

    iget-object v0, p0, LYe1$e;->i:LsP5;

    invoke-static {v0}, LYe1;->b(LsP5;)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->P(J)V

    return-void
.end method
