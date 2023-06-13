.class public final LqP1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V
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
.field public final synthetic g:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LgV2;

.field public final synthetic i:Z

.field public final synthetic j:LrX2;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Z",
            "LrX2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LqP1$a;->g:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, LqP1$a;->h:LgV2;

    iput-boolean p3, p0, LqP1$a;->i:Z

    iput-object p4, p0, LqP1$a;->j:LrX2;

    iput-object p5, p0, LqP1$a;->k:Lkotlin/jvm/functions/Function2;

    iput p6, p0, LqP1$a;->l:I

    iput p7, p0, LqP1$a;->m:I

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

    invoke-virtual {p0, p1, p2}, LqP1$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget-object v0, p0, LqP1$a;->g:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, LqP1$a;->h:LgV2;

    iget-boolean v2, p0, LqP1$a;->i:Z

    iget-object v3, p0, LqP1$a;->j:LrX2;

    iget-object v4, p0, LqP1$a;->k:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LqP1$a;->l:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v6

    iget v7, p0, LqP1$a;->m:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LqP1;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method
