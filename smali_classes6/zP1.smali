.class public final LzP1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LzP1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\u0008\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0016\u00a8\u0006!"
    }
    d2 = {
        "LzP1;",
        "",
        "Landroid/graphics/drawable/Drawable;",
        "a",
        "Landroid/graphics/drawable/Drawable;",
        "()Landroid/graphics/drawable/Drawable;",
        "drawable",
        "",
        "b",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "setDrawableRes",
        "(Ljava/lang/Integer;)V",
        "drawableRes",
        "LBP1;",
        "c",
        "LBP1;",
        "d",
        "()LBP1;",
        "iconGravity",
        "I",
        "g",
        "()I",
        "iconWidth",
        "e",
        "iconHeight",
        "f",
        "iconSpace",
        "iconColor",
        "LzP1$a;",
        "builder",
        "<init>",
        "(LzP1$a;)V",
        "balloon_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public b:Ljava/lang/Integer;

.field public final c:LBP1;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(LzP1$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LzP1$a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LzP1;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, LzP1$a;->c()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LzP1;->b:Ljava/lang/Integer;

    invoke-virtual {p1}, LzP1$a;->e()LBP1;

    move-result-object v0

    iput-object v0, p0, LzP1;->c:LBP1;

    invoke-virtual {p1}, LzP1$a;->h()I

    move-result v0

    iput v0, p0, LzP1;->d:I

    invoke-virtual {p1}, LzP1$a;->f()I

    move-result v0

    iput v0, p0, LzP1;->e:I

    invoke-virtual {p1}, LzP1$a;->g()I

    move-result v0

    iput v0, p0, LzP1;->f:I

    invoke-virtual {p1}, LzP1$a;->d()I

    move-result p1

    iput p1, p0, LzP1;->g:I

    return-void
.end method

.method public synthetic constructor <init>(LzP1$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, LzP1;-><init>(LzP1$a;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LzP1;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LzP1;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LzP1;->g:I

    return v0
.end method

.method public final d()LBP1;
    .locals 1

    iget-object v0, p0, LzP1;->c:LBP1;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LzP1;->e:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LzP1;->f:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LzP1;->d:I

    return v0
.end method
