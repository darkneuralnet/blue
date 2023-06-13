.class public final Lg16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg16;->a(ZZLe62;Ld16;Lhy5;FFLEt0;II)V
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
.field public final synthetic g:Lg16;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Le62;

.field public final synthetic k:Ld16;

.field public final synthetic l:Lhy5;

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(Lg16;ZZLe62;Ld16;Lhy5;FFII)V
    .locals 0

    iput-object p1, p0, Lg16$a;->g:Lg16;

    iput-boolean p2, p0, Lg16$a;->h:Z

    iput-boolean p3, p0, Lg16$a;->i:Z

    iput-object p4, p0, Lg16$a;->j:Le62;

    iput-object p5, p0, Lg16$a;->k:Ld16;

    iput-object p6, p0, Lg16$a;->l:Lhy5;

    iput p7, p0, Lg16$a;->m:F

    iput p8, p0, Lg16$a;->n:F

    iput p9, p0, Lg16$a;->o:I

    iput p10, p0, Lg16$a;->p:I

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

    invoke-virtual {p0, p1, p2}, Lg16$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    iget-object v0, p0, Lg16$a;->g:Lg16;

    iget-boolean v1, p0, Lg16$a;->h:Z

    iget-boolean v2, p0, Lg16$a;->i:Z

    iget-object v3, p0, Lg16$a;->j:Le62;

    iget-object v4, p0, Lg16$a;->k:Ld16;

    iget-object v5, p0, Lg16$a;->l:Lhy5;

    iget v6, p0, Lg16$a;->m:F

    iget v7, p0, Lg16$a;->n:F

    iget p2, p0, Lg16$a;->o:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v9

    iget v10, p0, Lg16$a;->p:I

    move-object v8, p1

    invoke-virtual/range {v0 .. v10}, Lg16;->a(ZZLe62;Ld16;Lhy5;FFLEt0;II)V

    return-void
.end method
