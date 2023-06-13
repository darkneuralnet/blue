.class public final LVm4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVm4;->a(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LgV2;

.field public final synthetic j:Z

.field public final synthetic k:LrX2;

.field public final synthetic l:LTm4;

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Z",
            "LrX2;",
            "LTm4;",
            "II)V"
        }
    .end annotation

    iput-boolean p1, p0, LVm4$b;->g:Z

    iput-object p2, p0, LVm4$b;->h:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, LVm4$b;->i:LgV2;

    iput-boolean p4, p0, LVm4$b;->j:Z

    iput-object p5, p0, LVm4$b;->k:LrX2;

    iput-object p6, p0, LVm4$b;->l:LTm4;

    iput p7, p0, LVm4$b;->m:I

    iput p8, p0, LVm4$b;->n:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LVm4$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    iget-boolean v0, p0, LVm4$b;->g:Z

    iget-object v1, p0, LVm4$b;->h:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, LVm4$b;->i:LgV2;

    iget-boolean v3, p0, LVm4$b;->j:Z

    iget-object v4, p0, LVm4$b;->k:LrX2;

    iget-object v5, p0, LVm4$b;->l:LTm4;

    iget p2, p0, LVm4$b;->m:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v7

    iget v8, p0, LVm4$b;->n:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LVm4;->a(ZLkotlin/jvm/functions/Function0;LgV2;ZLrX2;LTm4;LEt0;II)V

    return-void
.end method
