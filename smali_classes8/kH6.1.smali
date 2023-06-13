.class public final LkH6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lbi2;",
        "LMs5;",
        "desc",
        "LjH6;",
        "b",
        "Lkt5;",
        "module",
        "a",
        "kotlinx-serialization-json"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWriteMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,53:1\n36#1,9:54\n*S KotlinDebug\n*F\n+ 1 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n26#1:54,9\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LMs5;Lkt5;)LMs5;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LMs5;->getKind()LTs5;

    move-result-object v0

    sget-object v1, LTs5$a;->a:LTs5$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p0}, LMA0;->b(Lkt5;LMs5;)LMs5;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p1}, LkH6;->a(LMs5;Lkt5;)LMs5;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LMs5;->isInline()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LMs5;->d(I)LMs5;

    move-result-object p0

    invoke-static {p0, p1}, LkH6;->a(LMs5;Lkt5;)LMs5;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final b(Lbi2;LMs5;)LjH6;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LMs5;->getKind()LTs5;

    move-result-object v0

    instance-of v1, v0, LOX3;

    if-eqz v1, :cond_0

    sget-object p0, LjH6;->g:LjH6;

    goto :goto_1

    :cond_0
    sget-object v1, LRS5$b;->a:LRS5$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, LjH6;->e:LjH6;

    goto :goto_1

    :cond_1
    sget-object v1, LRS5$c;->a:LRS5$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LMs5;->d(I)LMs5;

    move-result-object p1

    invoke-virtual {p0}, Lbi2;->f()Lkt5;

    move-result-object v0

    invoke-static {p1, v0}, LkH6;->a(LMs5;Lkt5;)LMs5;

    move-result-object p1

    invoke-interface {p1}, LMs5;->getKind()LTs5;

    move-result-object v0

    instance-of v1, v0, LE24;

    if-nez v1, :cond_4

    sget-object v1, LTs5$b;->a:LTs5$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lbi2;->e()Lji2;

    move-result-object p0

    invoke-virtual {p0}, Lji2;->b()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, LjH6;->e:LjH6;

    goto :goto_1

    :cond_3
    invoke-static {p1}, LFi2;->d(LMs5;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_0
    sget-object p0, LjH6;->f:LjH6;

    goto :goto_1

    :cond_5
    sget-object p0, LjH6;->d:LjH6;

    :goto_1
    return-object p0
.end method
