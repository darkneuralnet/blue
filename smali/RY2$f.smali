.class public final LRY2$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRY2;->a(LOY2;LJY2;LgV2;LEt0;II)V
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
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LOY2;

.field public final synthetic h:LJY2;

.field public final synthetic i:LgV2;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public constructor <init>(LOY2;LJY2;LgV2;II)V
    .locals 0

    iput-object p1, p0, LRY2$f;->g:LOY2;

    iput-object p2, p0, LRY2$f;->h:LJY2;

    iput-object p3, p0, LRY2$f;->i:LgV2;

    iput p4, p0, LRY2$f;->j:I

    iput p5, p0, LRY2$f;->k:I

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

    invoke-virtual {p0, p1, p2}, LRY2$f;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 6

    iget-object v0, p0, LRY2$f;->g:LOY2;

    iget-object v1, p0, LRY2$f;->h:LJY2;

    iget-object v2, p0, LRY2$f;->i:LgV2;

    iget p2, p0, LRY2$f;->j:I

    or-int/lit8 v4, p2, 0x1

    iget v5, p0, LRY2$f;->k:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LRY2;->a(LOY2;LJY2;LgV2;LEt0;II)V

    return-void
.end method
