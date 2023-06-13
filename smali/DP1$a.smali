.class public final LDP1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V
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
.field public final synthetic g:LnE3;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:LgV2;

.field public final synthetic j:J

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public constructor <init>(LnE3;Ljava/lang/String;LgV2;JII)V
    .locals 0

    iput-object p1, p0, LDP1$a;->g:LnE3;

    iput-object p2, p0, LDP1$a;->h:Ljava/lang/String;

    iput-object p3, p0, LDP1$a;->i:LgV2;

    iput-wide p4, p0, LDP1$a;->j:J

    iput p6, p0, LDP1$a;->k:I

    iput p7, p0, LDP1$a;->l:I

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

    invoke-virtual {p0, p1, p2}, LDP1$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget-object v0, p0, LDP1$a;->g:LnE3;

    iget-object v1, p0, LDP1$a;->h:Ljava/lang/String;

    iget-object v2, p0, LDP1$a;->i:LgV2;

    iget-wide v3, p0, LDP1$a;->j:J

    iget p2, p0, LDP1$a;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v6

    iget v7, p0, LDP1$a;->l:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    return-void
.end method
