.class public abstract LqZ1;
.super LhZ1;
.source "SourceFile"

# interfaces
.implements LyO1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u0019\u0008\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0004H\u0016J\u0008\u0010\u000b\u001a\u00020\u0006H\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "LqZ1;",
        "LhZ1;",
        "LyO1;",
        "",
        "",
        "remotePathToLocalAssetMap",
        "",
        "c0",
        "buttonId",
        "",
        "d0",
        "q0",
        "A",
        "Ljava/lang/String;",
        "U",
        "()Ljava/lang/String;",
        "W",
        "(Ljava/lang/String;)V",
        "localAssetsDirectoryUrl",
        "B",
        "Z",
        "wasButtonClickLogged",
        "C",
        "buttonIdClicked",
        "<init>",
        "()V",
        "Lorg/json/JSONObject;",
        "jsonObject",
        "Lbo/app/y1;",
        "brazeManager",
        "(Lorg/json/JSONObject;Lbo/app/y1;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public A:Ljava/lang/String;

.field public B:Z

.field public C:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LhZ1;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LhZ1;->s0(Z)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 8

    const-string v0, "jsonObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, LhZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string p2, "use_webview"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, p1}, LhZ1;->s0(Z)V

    return-void
.end method


# virtual methods
.method public U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LqZ1;->A:Ljava/lang/String;

    return-object v0
.end method

.method public W(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LqZ1;->A:Ljava/lang/String;

    return-void
.end method

.method public c0(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "remotePathToLocalAssetMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, [Ljava/lang/String;

    aget-object p1, p1, v0

    invoke-virtual {p0, p1}, LqZ1;->W(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public d0(Ljava/lang/String;)Z
    .locals 10

    const-string v1, "buttonId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LhZ1;->G()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LhZ1;->A()Lbo/app/y1;

    move-result-object v2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v9

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v8

    :goto_1
    if-eqz v3, :cond_2

    sget-object v1, Lk20;->a:Lk20;

    new-instance v5, LqZ1$a;

    invoke-direct {v5, p1}, LqZ1$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, v1

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_2
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    sget-object v5, LqZ1$b;->g:LqZ1$b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_3
    iget-boolean v3, p0, LqZ1;->B:Z

    if-eqz v3, :cond_4

    invoke-interface {p0}, LwO1;->h0()LzT2;

    move-result-object v3

    sget-object v4, LzT2;->f:LzT2;

    if-eq v3, v4, :cond_4

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    sget-object v5, LqZ1$c;->g:LqZ1$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_4
    if-nez v2, :cond_5

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->g:Lk20$a;

    sget-object v5, LqZ1$d;->g:LqZ1$d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v9

    :cond_5
    sget-object v3, Lbo/app/j;->h:Lbo/app/j$a;

    invoke-virtual {v3, v1, p1}, Lbo/app/j$a;->d(Ljava/lang/String;Ljava/lang/String;)Lbo/app/u1;

    move-result-object v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {v2, v3}, Lbo/app/y1;->a(Lbo/app/u1;)Z

    :goto_2
    iput-object p1, p0, LqZ1;->C:Ljava/lang/String;

    iput-boolean v8, p0, LqZ1;->B:Z

    sget-object v2, Lk20;->a:Lk20;

    new-instance v5, LqZ1$e;

    invoke-direct {v5, p1, v1}, LqZ1$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v9, 0x0

    move-object v0, v2

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move v4, v6

    move v6, v7

    move-object v7, v9

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v8
.end method

.method public q0()V
    .locals 4

    invoke-super {p0}, LhZ1;->q0()V

    iget-boolean v0, p0, LqZ1;->B:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, LhZ1;->G()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-nez v0, :cond_5

    iget-object v0, p0, LqZ1;->C:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    if-nez v1, :cond_5

    invoke-virtual {p0}, LhZ1;->A()Lbo/app/y1;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, Lbo/app/a3;

    invoke-virtual {p0}, LhZ1;->G()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LqZ1;->C:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lbo/app/a3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lbo/app/y1;->a(Lbo/app/t2;)V

    :cond_5
    :goto_2
    return-void
.end method
