.class public final LhM5$d$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhM5$d$a;->invoke(LEt0;I)V
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
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;IZ)V"
        }
    .end annotation

    iput-object p1, p0, LhM5$d$a$a;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LhM5$d$a$a;->h:Lkotlin/jvm/functions/Function2;

    iput p3, p0, LhM5$d$a$a;->i:I

    iput-boolean p4, p0, LhM5$d$a$a;->j:Z

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

    invoke-virtual {p0, p1, p2}, LhM5$d$a$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 3

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)"

    const v2, 0xd6af9ad

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LhM5$d$a$a;->g:Lkotlin/jvm/functions/Function2;

    if-nez p2, :cond_3

    const p2, 0x38f13ba

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, LhM5$d$a$a;->h:Lkotlin/jvm/functions/Function2;

    iget v0, p0, LhM5$d$a$a;->i:I

    shr-int/lit8 v0, v0, 0x15

    and-int/lit8 v0, v0, 0xe

    invoke-static {p2, p1, v0}, LhM5;->h(Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {p1}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    iget-boolean p2, p0, LhM5$d$a$a;->j:Z

    if-eqz p2, :cond_4

    const p2, 0x38f13fb

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, LhM5$d$a$a;->h:Lkotlin/jvm/functions/Function2;

    iget-object v0, p0, LhM5$d$a$a;->g:Lkotlin/jvm/functions/Function2;

    iget v1, p0, LhM5$d$a$a;->i:I

    shr-int/lit8 v2, v1, 0x15

    and-int/lit8 v2, v2, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {p2, v0, p1, v1}, LhM5;->f(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {p1}, LEt0;->Q()V

    goto :goto_1

    :cond_4
    const p2, 0x38f143e

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, LhM5$d$a$a;->h:Lkotlin/jvm/functions/Function2;

    iget-object v0, p0, LhM5$d$a$a;->g:Lkotlin/jvm/functions/Function2;

    iget v1, p0, LhM5$d$a$a;->i:I

    shr-int/lit8 v2, v1, 0x15

    and-int/lit8 v2, v2, 0xe

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    invoke-static {p2, v0, p1, v1}, LhM5;->g(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {p1}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
