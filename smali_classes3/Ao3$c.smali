.class public final LAo3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAo3;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "[I>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0015\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "b",
        "()[I"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAo3;


# direct methods
.method public constructor <init>(LAo3;)V
    .locals 0

    iput-object p1, p0, LAo3$c;->g:LAo3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()[I
    .locals 4

    iget-object v0, p0, LAo3$c;->g:LAo3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [I

    return-object v0

    :cond_0
    const/4 v2, 0x6

    new-array v2, v2, [I

    sget v3, LDf4;->birdBlue:I

    invoke-static {v0, v3}, LfB0;->f(Landroid/content/Context;I)I

    move-result v3

    aput v3, v2, v1

    sget v1, LDf4;->birdGold:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    const/4 v3, 0x1

    aput v1, v2, v3

    sget v1, LDf4;->birdMint:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    const/4 v3, 0x2

    aput v1, v2, v3

    sget v1, LDf4;->birdRed:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    const/4 v3, 0x3

    aput v1, v2, v3

    sget v1, LDf4;->birdTeal:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    const/4 v3, 0x4

    aput v1, v2, v3

    sget v1, LDf4;->birdViolet:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v0

    const/4 v1, 0x5

    aput v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAo3$c;->b()[I

    move-result-object v0

    return-object v0
.end method
