.class public final synthetic LRe3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LAN5;",
        "Lo30;",
        "c",
        "LwB5;",
        "Ln30;",
        "b",
        "a",
        "()LwB5;",
        "okio"
    }
    k = 0x5
    mv = {
        0x1,
        0x6,
        0x0
    }
    xs = "okio/Okio"
.end annotation


# direct methods
.method public static final a()LwB5;
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "blackhole"
    .end annotation

    new-instance v0, LsU;

    invoke-direct {v0}, LsU;-><init>()V

    return-object v0
.end method

.method public static final b(LwB5;)Ln30;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Las4;

    invoke-direct {v0, p0}, Las4;-><init>(LwB5;)V

    return-object v0
.end method

.method public static final c(LAN5;)Lo30;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbs4;

    invoke-direct {v0, p0}, Lbs4;-><init>(LAN5;)V

    return-object v0
.end method
