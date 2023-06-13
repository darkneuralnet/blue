.class public final LCX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u000c\u001a\u00020\u000bH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LCX1;",
        "LBX1;",
        "",
        "url",
        "Landroid/widget/ImageView;",
        "into",
        "",
        "b",
        "Landroid/net/Uri;",
        "uri",
        "a",
        "LYI4;",
        "c",
        "LUI4;",
        "LUI4;",
        "glide",
        "<init>",
        "(LUI4;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LUI4;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LUI4;)V
    .locals 1

    const-string v0, "glide"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCX1;->a:LUI4;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Landroid/widget/ImageView;)V
    .locals 1

    const-string v0, "into"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCX1;->a:LUI4;

    invoke-virtual {v0, p1}, LUI4;->h(Landroid/net/Uri;)LrI4;

    move-result-object p1

    invoke-virtual {p0}, LCX1;->c()LYI4;

    move-result-object v0

    invoke-virtual {p1, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {p1, v0}, LrI4;->f1(F)LrI4;

    move-result-object p1

    invoke-virtual {p1, p2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method

.method public b(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 1

    const-string v0, "into"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCX1;->a:LUI4;

    invoke-virtual {v0, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    invoke-virtual {p0}, LCX1;->c()LYI4;

    move-result-object v0

    invoke-virtual {p1, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object p1

    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {p1, v0}, LrI4;->f1(F)LrI4;

    move-result-object p1

    invoke-virtual {p1, p2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method

.method public final c()LYI4;
    .locals 2

    new-instance v0, LYI4;

    invoke-direct {v0}, LYI4;-><init>()V

    invoke-virtual {v0}, LLD;->f()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sget-object v1, LB41;->a:LB41;

    invoke-virtual {v0, v1}, LLD;->k(LB41;)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    invoke-virtual {v0}, LLD;->l()LLD;

    move-result-object v0

    check-cast v0, LYI4;

    sget v1, Lrg4;->ic_circle_avatar:I

    invoke-virtual {v0, v1}, LLD;->l0(I)LLD;

    move-result-object v0

    check-cast v0, LYI4;

    invoke-virtual {v0, v1}, LLD;->n(I)LLD;

    move-result-object v0

    const-string v1, "RequestOptions()\n      .\u2026rawable.ic_circle_avatar)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LYI4;

    return-object v0
.end method
