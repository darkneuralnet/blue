.class public final Lfo2$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfo2;->a(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Float;",
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
.field public final synthetic g:Ldo2;

.field public final synthetic h:LRn2;


# direct methods
.method public constructor <init>(Ldo2;LRn2;)V
    .locals 0

    iput-object p1, p0, Lfo2$c;->g:Ldo2;

    iput-object p2, p0, Lfo2$c;->h:LRn2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, Lfo2$c;->g:Ldo2;

    invoke-interface {v0}, Ldo2;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfo2$c;->h:LRn2;

    invoke-interface {v0}, LRn2;->getItemCount()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfo2$c;->g:Ldo2;

    invoke-interface {v0}, Ldo2;->c()F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfo2$c;->b()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
