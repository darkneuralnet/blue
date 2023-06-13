.class public final Lco/bird/android/feature/webview/c$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/webview/c;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/webview/c$j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lvz6;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lvz6;",
        "kotlin.jvm.PlatformType",
        "archive",
        "",
        "a",
        "(Lvz6;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/webview/c;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/webview/c;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lvz6;)V
    .locals 11

    invoke-virtual {p1}, Lvz6;->f()LNz6;

    move-result-object v0

    sget-object v1, Lco/bird/android/feature/webview/c$j$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v1, :cond_3

    if-eq v0, v3, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {p1}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object p1

    invoke-static {p1, v1, v4, v3, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {v0}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object v0

    invoke-static {v0, v4, v4, v3, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {v0}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object v0

    invoke-static {v0, v4, v4, v3, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "attempting to load "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lvz6;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvz6;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remotely loading "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {p1}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object p1

    invoke-virtual {p1, v0}, LnA6;->Sl(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lvz6;->d()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-virtual {p1}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v5

    const-string p1, "file.toURI().toString()"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "file:/"

    const-string v7, "file:///"

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "index.html"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resolved local file url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object v0

    invoke-virtual {v0, p1}, LnA6;->Sl(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {p1}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object p1

    invoke-static {p1, v4, v4, v3, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-static {p1}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object v0

    sget-object v1, Lzz6;->d:Lzz6;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lco/bird/android/feature/webview/c$j$a;

    iget-object p1, p0, Lco/bird/android/feature/webview/c$j;->g:Lco/bird/android/feature/webview/c;

    invoke-direct {v4, p1}, Lco/bird/android/feature/webview/c$j$a;-><init>(Lco/bird/android/feature/webview/c;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x74

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvz6;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/webview/c$j;->a(Lvz6;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
