.class public final LK74$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(LgV2;JFJIII)V
    .locals 0

    iput-object p1, p0, LK74$b;->g:LgV2;

    iput-wide p2, p0, LK74$b;->h:J

    iput p4, p0, LK74$b;->i:F

    iput-wide p5, p0, LK74$b;->j:J

    iput p7, p0, LK74$b;->k:I

    iput p8, p0, LK74$b;->l:I

    iput p9, p0, LK74$b;->m:I

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

    invoke-virtual {p0, p1, p2}, LK74$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    iget-object v0, p0, LK74$b;->g:LgV2;

    iget-wide v1, p0, LK74$b;->h:J

    iget v3, p0, LK74$b;->i:F

    iget-wide v4, p0, LK74$b;->j:J

    iget v6, p0, LK74$b;->k:I

    iget p2, p0, LK74$b;->l:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v8

    iget v9, p0, LK74$b;->m:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LK74;->a(LgV2;JFJILEt0;II)V

    return-void
.end method
