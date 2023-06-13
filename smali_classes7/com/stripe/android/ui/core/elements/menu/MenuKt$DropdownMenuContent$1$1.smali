.class final Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/menu/MenuKt;->DropdownMenuContent(LKX2;LEX2;ILgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V
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
.field final synthetic $alpha$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scale$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $transformOriginState:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Landroidx/compose/ui/graphics/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEX2;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Landroidx/compose/ui/graphics/f;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;",
            "LsP5<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$transformOriginState:LEX2;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$scale$delegate:LsP5;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$alpha$delegate:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->invoke(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$scale$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/menu/MenuKt;->access$DropdownMenuContent$lambda$1(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->D(F)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$scale$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/menu/MenuKt;->access$DropdownMenuContent$lambda$1(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->E(F)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$alpha$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/menu/MenuKt;->access$DropdownMenuContent$lambda$3(LsP5;)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->g(F)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/menu/MenuKt$DropdownMenuContent$1$1;->$transformOriginState:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/graphics/f;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f;->j()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->P(J)V

    return-void
.end method
