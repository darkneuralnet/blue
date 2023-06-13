.class public final LUn2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUn2;->a(LRn2;LgV2;Lao2;Lkotlin/jvm/functions/Function2;LEt0;II)V
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
.field public final synthetic g:LRn2;

.field public final synthetic h:LgV2;

.field public final synthetic i:Lao2;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LVn2;",
            "Lkz0;",
            "LyO2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(LRn2;LgV2;Lao2;Lkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRn2;",
            "LgV2;",
            "Lao2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LVn2;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LUn2$b;->g:LRn2;

    iput-object p2, p0, LUn2$b;->h:LgV2;

    iput-object p3, p0, LUn2$b;->i:Lao2;

    iput-object p4, p0, LUn2$b;->j:Lkotlin/jvm/functions/Function2;

    iput p5, p0, LUn2$b;->k:I

    iput p6, p0, LUn2$b;->l:I

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

    invoke-virtual {p0, p1, p2}, LUn2$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    iget-object v0, p0, LUn2$b;->g:LRn2;

    iget-object v1, p0, LUn2$b;->h:LgV2;

    iget-object v2, p0, LUn2$b;->i:Lao2;

    iget-object v3, p0, LUn2$b;->j:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LUn2$b;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v5

    iget v6, p0, LUn2$b;->l:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LUn2;->a(LRn2;LgV2;Lao2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method
