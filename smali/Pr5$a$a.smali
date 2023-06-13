.class public final LPr5$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPr5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPr5$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "Pr5$a$a",
        "LPr5;",
        "Li26;",
        "textLayoutResult",
        "Ls26;",
        "newRawSelectionRange",
        "",
        "previousHandleOffset",
        "",
        "isStartHandle",
        "previousSelectionRange",
        "a",
        "(Li26;JIZLs26;)J",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li26;JIZLs26;)J
    .locals 2

    const-string p4, "textLayoutResult"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ls26;->h(J)Z

    move-result p4

    if-eqz p4, :cond_1

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Ls26;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ls26;->m(J)Z

    move-result p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p1}, Li26;->k()Lg26;

    move-result-object p6

    invoke-virtual {p6}, Lg26;->j()LDf;

    move-result-object p6

    invoke-virtual {p6}, LDf;->j()Ljava/lang/String;

    move-result-object p6

    invoke-static {p2, p3}, Ls26;->n(J)I

    move-result p2

    invoke-virtual {p1}, Li26;->k()Lg26;

    move-result-object p1

    invoke-virtual {p1}, Lg26;->j()LDf;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt;->getLastIndex(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p6, p2, p1, p5, p4}, LQr5;->a(Ljava/lang/String;IIZZ)J

    move-result-wide p2

    :cond_1
    return-wide p2
.end method
