.class public final Lvj6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "LEu6;",
        "LDf;",
        "text",
        "LA96;",
        "a",
        "LHe3;",
        "LHe3;",
        "b",
        "()LHe3;",
        "ValidatingEmptyOffsetMappingIdentity",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LHe3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Luj6;

    sget-object v1, LHe3;->a:LHe3$a;

    invoke-virtual {v1}, LHe3$a;->a()LHe3;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Luj6;-><init>(LHe3;II)V

    sput-object v0, Lvj6;->a:LHe3;

    return-void
.end method

.method public static final a(LEu6;LDf;)LA96;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LEu6;->filter(LDf;)LA96;

    move-result-object p0

    new-instance v0, LA96;

    invoke-virtual {p0}, LA96;->b()LDf;

    move-result-object v1

    new-instance v2, Luj6;

    invoke-virtual {p0}, LA96;->a()LHe3;

    move-result-object v3

    invoke-virtual {p1}, LDf;->length()I

    move-result p1

    invoke-virtual {p0}, LA96;->b()LDf;

    move-result-object p0

    invoke-virtual {p0}, LDf;->length()I

    move-result p0

    invoke-direct {v2, v3, p1, p0}, Luj6;-><init>(LHe3;II)V

    invoke-direct {v0, v1, v2}, LA96;-><init>(LDf;LHe3;)V

    return-object v0
.end method

.method public static final b()LHe3;
    .locals 1

    sget-object v0, Lvj6;->a:LHe3;

    return-object v0
.end method
