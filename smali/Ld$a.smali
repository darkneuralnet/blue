.class public final LLd$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd;->a(LgV2;ZLUL4;ZLEt0;I)V
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

.field public final synthetic h:Z

.field public final synthetic i:LUL4;

.field public final synthetic j:Z

.field public final synthetic k:I


# direct methods
.method public constructor <init>(LgV2;ZLUL4;ZI)V
    .locals 0

    iput-object p1, p0, LLd$a;->g:LgV2;

    iput-boolean p2, p0, LLd$a;->h:Z

    iput-object p3, p0, LLd$a;->i:LUL4;

    iput-boolean p4, p0, LLd$a;->j:Z

    iput p5, p0, LLd$a;->k:I

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

    invoke-virtual {p0, p1, p2}, LLd$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 6

    iget-object v0, p0, LLd$a;->g:LgV2;

    iget-boolean v1, p0, LLd$a;->h:Z

    iget-object v2, p0, LLd$a;->i:LUL4;

    iget-boolean v3, p0, LLd$a;->j:Z

    iget p2, p0, LLd$a;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LLd;->a(LgV2;ZLUL4;ZLEt0;I)V

    return-void
.end method
