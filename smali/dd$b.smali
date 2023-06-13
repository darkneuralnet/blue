.class public final Ldd$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldd;->a(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;LEt0;II)V
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
.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:LgV2;

.field public final synthetic j:J

.field public final synthetic k:LAY3;

.field public final synthetic l:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
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
.method public constructor <init>(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "J",
            "LAY3;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-boolean p1, p0, Ldd$b;->g:Z

    iput-object p2, p0, Ldd$b;->h:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Ldd$b;->i:LgV2;

    iput-wide p4, p0, Ldd$b;->j:J

    iput-object p6, p0, Ldd$b;->k:LAY3;

    iput-object p7, p0, Ldd$b;->l:Lkotlin/jvm/functions/Function3;

    iput p8, p0, Ldd$b;->m:I

    iput p9, p0, Ldd$b;->n:I

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

    invoke-virtual {p0, p1, p2}, Ldd$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    iget-boolean v0, p0, Ldd$b;->g:Z

    iget-object v1, p0, Ldd$b;->h:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Ldd$b;->i:LgV2;

    iget-wide v3, p0, Ldd$b;->j:J

    iget-object v5, p0, Ldd$b;->k:LAY3;

    iget-object v6, p0, Ldd$b;->l:Lkotlin/jvm/functions/Function3;

    iget p2, p0, Ldd$b;->m:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v8

    iget v9, p0, Ldd$b;->n:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Ldd;->a(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    return-void
.end method
