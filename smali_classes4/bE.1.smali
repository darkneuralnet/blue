.class public final LbE;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\u000c\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0008*\u00020\u0007\u00a8\u0006\n"
    }
    d2 = {
        "LTk5;",
        "",
        "b",
        "c",
        "a",
        "LZN1;",
        "d",
        "Lde5$a;",
        "LMD$b;",
        "e",
        "bluetooth_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LTk5;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LbE;->d(LTk5;)LZN1;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(LTk5;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/util/UUID;

    sget-object v1, LoI5;->a:LoI5$a;

    invoke-virtual {v1}, LoI5$a;->a()Ljava/util/UUID;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, LUk5;->w(LTk5;[Ljava/util/UUID;)Z

    move-result p0

    return p0
.end method

.method public static final c(LTk5;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LTk5;->c()LCk5;

    move-result-object p0

    invoke-interface {p0}, LCk5;->a()[B

    move-result-object p0

    const-string v0, "scanRecord.bytes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LUk5;->h([B)Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x301

    if-ne p0, v0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final d(LTk5;)LZN1;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZN1;->g:LZN1$a;

    invoke-virtual {p0}, LTk5;->c()LCk5;

    move-result-object v1

    invoke-interface {v1}, LCk5;->a()[B

    move-result-object v1

    const-string v2, "scanRecord.bytes"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LTk5;->b()I

    move-result v2

    invoke-virtual {p0}, LTk5;->a()Lne5;

    move-result-object p0

    invoke-interface {p0}, Lne5;->d()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-virtual {v0, v1, v2, p0}, LZN1$a;->b([BILandroid/bluetooth/BluetoothDevice;)LZN1;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lde5$a;)LMD$b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LMD$b;->valueOf(Ljava/lang/String;)LMD$b;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lg46;->e(Ljava/lang/Throwable;)V

    sget-object p0, LMD$b;->g:LMD$b;

    :goto_0
    return-object p0
.end method
