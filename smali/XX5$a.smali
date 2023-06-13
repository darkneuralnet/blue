.class public final LXX5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXX5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(LXX5;LTC6;)LWX5;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LTC6;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LTC6;->a()I

    move-result p1

    invoke-interface {p0, v0, p1}, LXX5;->b(Ljava/lang/String;I)LWX5;

    move-result-object p0

    return-object p0
.end method

.method public static b(LXX5;LTC6;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LTC6;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LTC6;->a()I

    move-result p1

    invoke-interface {p0, v0, p1}, LXX5;->f(Ljava/lang/String;I)V

    return-void
.end method
