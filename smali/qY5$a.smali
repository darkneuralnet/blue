.class public final LqY5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqY5;->a(LgV2;FJLEt0;II)V
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
.field public final synthetic g:LqY5;

.field public final synthetic h:LgV2;

.field public final synthetic i:F

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(LqY5;LgV2;FJII)V
    .locals 0

    iput-object p1, p0, LqY5$a;->g:LqY5;

    iput-object p2, p0, LqY5$a;->h:LgV2;

    iput p3, p0, LqY5$a;->i:F

    iput-wide p4, p0, LqY5$a;->j:J

    iput p6, p0, LqY5$a;->k:I

    iput p7, p0, LqY5$a;->l:I

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

    invoke-virtual {p0, p1, p2}, LqY5$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget-object v0, p0, LqY5$a;->g:LqY5;

    iget-object v1, p0, LqY5$a;->h:LgV2;

    iget v2, p0, LqY5$a;->i:F

    iget-wide v3, p0, LqY5$a;->j:J

    iget p2, p0, LqY5$a;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v6

    iget v7, p0, LqY5$a;->l:I

    move-object v5, p1

    invoke-virtual/range {v0 .. v7}, LqY5;->a(LgV2;FJLEt0;II)V

    return-void
.end method
