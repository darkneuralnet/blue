.class public final Lr31$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr31;->a(Lx31;LEt0;I)V
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
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LAY2;

.field public final synthetic h:LEi5;

.field public final synthetic i:Lx31;

.field public final synthetic j:Lx31$b;


# direct methods
.method public constructor <init>(LAY2;LEi5;Lx31;Lx31$b;)V
    .locals 0

    iput-object p1, p0, Lr31$b;->g:LAY2;

    iput-object p2, p0, Lr31$b;->h:LEi5;

    iput-object p3, p0, Lr31$b;->i:Lx31;

    iput-object p4, p0, Lr31$b;->j:Lx31$b;

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

    invoke-virtual {p0, p1, p2}, Lr31$b;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 4

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p2, p0, Lr31$b;->g:LAY2;

    new-instance v0, Lr31$b$a;

    iget-object v1, p0, Lr31$b;->i:Lx31;

    invoke-direct {v0, v1, p2}, Lr31$b$a;-><init>(Lx31;LAY2;)V

    const/16 v1, 0x8

    invoke-static {p2, v0, p1, v1}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    iget-object p2, p0, Lr31$b;->g:LAY2;

    iget-object v0, p0, Lr31$b;->h:LEi5;

    new-instance v1, Lr31$b$b;

    iget-object v2, p0, Lr31$b;->j:Lx31$b;

    invoke-direct {v1, v2, p2}, Lr31$b$b;-><init>(Lx31$b;LAY2;)V

    const v2, -0x1da93fb4

    const/4 v3, 0x1

    invoke-static {p1, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/16 v2, 0x1c8

    invoke-static {p2, v0, v1, p1, v2}, LBY2;->a(LAY2;LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :goto_1
    return-void
.end method
