.class public final Lg16$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg16;->g(LgV2;ZZLe62;Ld16;FF)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "a",
        "(LgV2;LEt0;I)LgV2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Le62;

.field public final synthetic j:Ld16;

.field public final synthetic k:F

.field public final synthetic l:F


# direct methods
.method public constructor <init>(ZZLe62;Ld16;FF)V
    .locals 0

    iput-boolean p1, p0, Lg16$e;->g:Z

    iput-boolean p2, p0, Lg16$e;->h:Z

    iput-object p3, p0, Lg16$e;->i:Le62;

    iput-object p4, p0, Lg16$e;->j:Ld16;

    iput p5, p0, Lg16$e;->k:F

    iput p6, p0, Lg16$e;->l:F

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 10

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x5361fd9d

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-boolean v2, p0, Lg16$e;->g:Z

    iget-boolean v3, p0, Lg16$e;->h:Z

    iget-object v4, p0, Lg16$e;->i:Le62;

    iget-object v5, p0, Lg16$e;->j:Ld16;

    iget v6, p0, Lg16$e;->k:F

    iget v7, p0, Lg16$e;->l:F

    const/4 v9, 0x0

    move-object v8, p2

    invoke-static/range {v2 .. v9}, Lh16;->a(ZZLe62;Ld16;FFLEt0;I)LsP5;

    move-result-object p1

    sget-object p3, LgV2;->b0:LgV2$a;

    invoke-interface {p1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LeZ;

    invoke-static {p3, p1}, Lq16;->j(LgV2;LeZ;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lg16$e;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
