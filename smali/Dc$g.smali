.class public final LDc$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc;->c(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V
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

.field public final synthetic h:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public constructor <init>(LgV2;Lkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LDc$g;->g:LgV2;

    iput-object p2, p0, LDc$g;->h:Lkotlin/jvm/functions/Function2;

    iput p3, p0, LDc$g;->i:I

    iput p4, p0, LDc$g;->j:I

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

    invoke-virtual {p0, p1, p2}, LDc$g;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-object p2, p0, LDc$g;->g:LgV2;

    iget-object v0, p0, LDc$g;->h:Lkotlin/jvm/functions/Function2;

    iget v1, p0, LDc$g;->i:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lps4;->a(I)I

    move-result v1

    iget v2, p0, LDc$g;->j:I

    invoke-static {p2, v0, p1, v1, v2}, LDc;->e(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method
