.class public final Lco2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco2;->a(Lao2;LQn2;LZS5;LEt0;I)V
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
.field public final synthetic g:Lao2;

.field public final synthetic h:LQn2;

.field public final synthetic i:LZS5;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Lao2;LQn2;LZS5;I)V
    .locals 0

    iput-object p1, p0, Lco2$a;->g:Lao2;

    iput-object p2, p0, Lco2$a;->h:LQn2;

    iput-object p3, p0, Lco2$a;->i:LZS5;

    iput p4, p0, Lco2$a;->j:I

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

    invoke-virtual {p0, p1, p2}, Lco2$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    iget-object p2, p0, Lco2$a;->g:Lao2;

    iget-object v0, p0, Lco2$a;->h:LQn2;

    iget-object v1, p0, Lco2$a;->i:LZS5;

    iget v2, p0, Lco2$a;->j:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lps4;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lco2;->a(Lao2;LQn2;LZS5;LEt0;I)V

    return-void
.end method
