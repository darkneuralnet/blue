.class public final LBC6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "LBC6;",
        "",
        "",
        "offset",
        "b",
        "a",
        "LCC6;",
        "LCC6;",
        "wordIterator",
        "Ljava/util/Locale;",
        "locale",
        "",
        "text",
        "<init>",
        "(Ljava/util/Locale;Ljava/lang/CharSequence;)V",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LCC6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;Ljava/lang/CharSequence;)V
    .locals 3

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LCC6;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2, v1, p1}, LCC6;-><init>(Ljava/lang/CharSequence;IILjava/util/Locale;)V

    iput-object v0, p0, LBC6;->a:LCC6;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->n(I)I

    move-result v0

    iget-object v1, p0, LBC6;->a:LCC6;

    invoke-virtual {v1, v0}, LCC6;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->g(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->d(I)I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    return p1
.end method

.method public final b(I)I
    .locals 2

    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->o(I)I

    move-result v0

    iget-object v1, p0, LBC6;->a:LCC6;

    invoke-virtual {v1, v0}, LCC6;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->f(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LBC6;->a:LCC6;

    invoke-virtual {v0, p1}, LCC6;->e(I)I

    move-result v0

    :goto_0
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    return p1
.end method
