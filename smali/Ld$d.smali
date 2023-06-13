.class public final LLd$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd;->c(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V
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
.field public final synthetic g:J

.field public final synthetic h:Z

.field public final synthetic i:LUL4;

.field public final synthetic j:Z

.field public final synthetic k:LgV2;

.field public final synthetic l:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic m:I


# direct methods
.method public constructor <init>(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "LUL4;",
            "Z",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-wide p1, p0, LLd$d;->g:J

    iput-boolean p3, p0, LLd$d;->h:Z

    iput-object p4, p0, LLd$d;->i:LUL4;

    iput-boolean p5, p0, LLd$d;->j:Z

    iput-object p6, p0, LLd$d;->k:LgV2;

    iput-object p7, p0, LLd$d;->l:Lkotlin/jvm/functions/Function2;

    iput p8, p0, LLd$d;->m:I

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

    invoke-virtual {p0, p1, p2}, LLd$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    iget-wide v0, p0, LLd$d;->g:J

    iget-boolean v2, p0, LLd$d;->h:Z

    iget-object v3, p0, LLd$d;->i:LUL4;

    iget-boolean v4, p0, LLd$d;->j:Z

    iget-object v5, p0, LLd$d;->k:LgV2;

    iget-object v6, p0, LLd$d;->l:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LLd$d;->m:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, LLd;->c(JZLUL4;ZLgV2;Lkotlin/jvm/functions/Function2;LEt0;I)V

    return-void
.end method
