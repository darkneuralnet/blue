.class public final Lti0$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti0;->b(ZLn56;LgV2;Lri0;LEt0;I)V
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

.field public final synthetic h:Ln56;

.field public final synthetic i:LgV2;

.field public final synthetic j:Lri0;

.field public final synthetic k:I


# direct methods
.method public constructor <init>(ZLn56;LgV2;Lri0;I)V
    .locals 0

    iput-boolean p1, p0, Lti0$d;->g:Z

    iput-object p2, p0, Lti0$d;->h:Ln56;

    iput-object p3, p0, Lti0$d;->i:LgV2;

    iput-object p4, p0, Lti0$d;->j:Lri0;

    iput p5, p0, Lti0$d;->k:I

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

    invoke-virtual {p0, p1, p2}, Lti0$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 6

    iget-boolean v0, p0, Lti0$d;->g:Z

    iget-object v1, p0, Lti0$d;->h:Ln56;

    iget-object v2, p0, Lti0$d;->i:LgV2;

    iget-object v3, p0, Lti0$d;->j:Lri0;

    iget p2, p0, Lti0$d;->k:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lti0;->i(ZLn56;LgV2;Lri0;LEt0;I)V

    return-void
.end method
