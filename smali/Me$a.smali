.class public final LMe$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe;->a(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;LEt0;II)V
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
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LgV2;

.field public final synthetic i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LOe<",
            "TS;>;",
            "LHA0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LK9;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TS;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "LTe;",
            "TS;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public constructor <init>(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TS;>;",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LOe<",
            "TS;>;",
            "LHA0;",
            ">;",
            "LK9;",
            "Lkotlin/jvm/functions/Function1<",
            "-TS;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "LTe;",
            "-TS;-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LMe$a;->g:LF96;

    iput-object p2, p0, LMe$a;->h:LgV2;

    iput-object p3, p0, LMe$a;->i:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, LMe$a;->j:LK9;

    iput-object p5, p0, LMe$a;->k:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, LMe$a;->l:Lkotlin/jvm/functions/Function4;

    iput p7, p0, LMe$a;->m:I

    iput p8, p0, LMe$a;->n:I

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

    invoke-virtual {p0, p1, p2}, LMe$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    iget-object v0, p0, LMe$a;->g:LF96;

    iget-object v1, p0, LMe$a;->h:LgV2;

    iget-object v2, p0, LMe$a;->i:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, LMe$a;->j:LK9;

    iget-object v4, p0, LMe$a;->k:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, LMe$a;->l:Lkotlin/jvm/functions/Function4;

    iget p2, p0, LMe$a;->m:I

    or-int/lit8 v7, p2, 0x1

    iget v8, p0, LMe$a;->n:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LMe;->a(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;LEt0;II)V

    return-void
.end method
