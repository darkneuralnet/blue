.class public final LI16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI16$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0011\u0008\u0002\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0019\u001a\u0004\u0008\u0003\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000f\u001a\u0004\u0008\u001c\u0010\u0010R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010#\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0010\u00a8\u0006("
    }
    d2 = {
        "LI16;",
        "",
        "",
        "a",
        "Ljava/lang/CharSequence;",
        "b",
        "()Ljava/lang/CharSequence;",
        "text",
        "",
        "F",
        "f",
        "()F",
        "textSize",
        "",
        "c",
        "I",
        "()I",
        "textColor",
        "",
        "d",
        "Z",
        "e",
        "()Z",
        "textIsHtml",
        "Landroid/text/method/MovementMethod;",
        "Landroid/text/method/MovementMethod;",
        "()Landroid/text/method/MovementMethod;",
        "movementMethod",
        "g",
        "textStyle",
        "Landroid/graphics/Typeface;",
        "Landroid/graphics/Typeface;",
        "h",
        "()Landroid/graphics/Typeface;",
        "textTypeface",
        "textGravity",
        "LI16$a;",
        "builder",
        "<init>",
        "(LI16$a;)V",
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
.field public final a:Ljava/lang/CharSequence;

.field public final b:F

.field public final c:I

.field public final d:Z

.field public final e:Landroid/text/method/MovementMethod;

.field public final f:I

.field public final g:Landroid/graphics/Typeface;

.field public final h:I


# direct methods
.method public constructor <init>(LI16$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LI16$a;->c()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LI16;->a:Ljava/lang/CharSequence;

    invoke-virtual {p1}, LI16$a;->g()F

    move-result v0

    iput v0, p0, LI16;->b:F

    invoke-virtual {p1}, LI16$a;->d()I

    move-result v0

    iput v0, p0, LI16;->c:I

    invoke-virtual {p1}, LI16$a;->f()Z

    move-result v0

    iput-boolean v0, p0, LI16;->d:Z

    invoke-virtual {p1}, LI16$a;->b()Landroid/text/method/MovementMethod;

    move-result-object v0

    iput-object v0, p0, LI16;->e:Landroid/text/method/MovementMethod;

    invoke-virtual {p1}, LI16$a;->h()I

    move-result v0

    iput v0, p0, LI16;->f:I

    invoke-virtual {p1}, LI16$a;->i()Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, LI16;->g:Landroid/graphics/Typeface;

    invoke-virtual {p1}, LI16$a;->e()I

    move-result p1

    iput p1, p0, LI16;->h:I

    return-void
.end method

.method public synthetic constructor <init>(LI16$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, LI16;-><init>(LI16$a;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/text/method/MovementMethod;
    .locals 1

    iget-object v0, p0, LI16;->e:Landroid/text/method/MovementMethod;

    return-object v0
.end method

.method public final b()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LI16;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LI16;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LI16;->h:I

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LI16;->d:Z

    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, LI16;->b:F

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LI16;->f:I

    return v0
.end method

.method public final h()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, LI16;->g:Landroid/graphics/Typeface;

    return-object v0
.end method
