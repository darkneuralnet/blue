.class public final LK74$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK74;->b(LgV2;JFLEt0;II)V
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
.field public final synthetic g:LgV2;

.field public final synthetic h:J

.field public final synthetic i:F

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public constructor <init>(LgV2;JFII)V
    .locals 0

    iput-object p1, p0, LK74$c;->g:LgV2;

    iput-wide p2, p0, LK74$c;->h:J

    iput p4, p0, LK74$c;->i:F

    iput p5, p0, LK74$c;->j:I

    iput p6, p0, LK74$c;->k:I

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

    invoke-virtual {p0, p1, p2}, LK74$c;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    iget-object v0, p0, LK74$c;->g:LgV2;

    iget-wide v1, p0, LK74$c;->h:J

    iget v3, p0, LK74$c;->i:F

    iget p2, p0, LK74$c;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v5

    iget v6, p0, LK74$c;->k:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LK74;->b(LgV2;JFLEt0;II)V

    return-void
.end method
