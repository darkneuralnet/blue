.class public final LXR5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lqv2;",
        "locale",
        "a",
        "LeW3;",
        "LeW3;",
        "stringDelegate",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LeW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LOd;->a()LeW3;

    move-result-object v0

    sput-object v0, LXR5;->a:LeW3;

    return-void
.end method

.method public static final a(Ljava/lang/String;Lqv2;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXR5;->a:LeW3;

    invoke-virtual {p1}, Lqv2;->b()LBV3;

    move-result-object p1

    invoke-interface {v0, p0, p1}, LeW3;->a(Ljava/lang/String;LBV3;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
