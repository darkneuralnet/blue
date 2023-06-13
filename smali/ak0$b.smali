.class public final Lak0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0;->a(LrX2;LEX2;Ljava/util/Map;LEt0;I)V
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
.field public final synthetic g:LrX2;

.field public final synthetic h:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LWj2;",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:I


# direct methods
.method public constructor <init>(LrX2;LEX2;Ljava/util/Map;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrX2;",
            "LEX2<",
            "LQ14;",
            ">;",
            "Ljava/util/Map<",
            "LWj2;",
            "LQ14;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lak0$b;->g:LrX2;

    iput-object p2, p0, Lak0$b;->h:LEX2;

    iput-object p3, p0, Lak0$b;->i:Ljava/util/Map;

    iput p4, p0, Lak0$b;->j:I

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

    invoke-virtual {p0, p1, p2}, Lak0$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-object p2, p0, Lak0$b;->g:LrX2;

    iget-object v0, p0, Lak0$b;->h:LEX2;

    iget-object v1, p0, Lak0$b;->i:Ljava/util/Map;

    iget v2, p0, Lak0$b;->j:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lps4;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lak0;->a(LrX2;LEX2;Ljava/util/Map;LEt0;I)V

    return-void
.end method
