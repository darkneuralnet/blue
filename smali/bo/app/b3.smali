.class public final Lbo/app/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/b3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lorg/json/JSONObject;",
        "inAppMessageJson",
        "Lbo/app/y1;",
        "brazeManager",
        "LwO1;",
        "a",
        "Lbo/app/d3;",
        "Lorg/json/JSONArray;",
        "b",
        "",
        "",
        "c",
        "android-sdk-base_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lk20;->a:Lk20;

    const-string v1, "InAppMessageModelUtils"

    invoke-virtual {v0, v1}, Lk20;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbo/app/b3;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(Lorg/json/JSONObject;)Lbo/app/d3;
    .locals 2

    const-string v0, "inAppMessageJson"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    goto :goto_0

    :cond_0
    const-string v1, "dark"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lbo/app/d3;

    invoke-direct {v0, p0}, Lbo/app/d3;-><init>(Lorg/json/JSONObject;)V

    :goto_1
    return-object v0
.end method

.method public static final a(Lorg/json/JSONObject;Lbo/app/y1;)LwO1;
    .locals 14

    const-string v0, "inAppMessageJson"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lbo/app/b3;->c(Lorg/json/JSONObject;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v2, Lk20;->a:Lk20;

    sget-object v3, Lbo/app/b3;->a:Ljava/lang/String;

    sget-object v4, Lk20$a;->c:Lk20$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lbo/app/b3$b;->b:Lbo/app/b3$b;

    const/16 v8, 0xc

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, LkZ1;

    invoke-direct {v1, p0, p1}, LkZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    return-object v1

    :cond_0
    const-string v1, "type"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v2, Lbo/app/s0;->a:Lbo/app/s0;

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "jsonObject.getString(key)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "US"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toUpperCase(locale)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LzT2;->values()[LzT2;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :cond_1
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Array contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-object v5, v0

    :goto_0
    if-nez v5, :cond_3

    :try_start_2
    sget-object v6, Lk20;->a:Lk20;

    sget-object v7, Lbo/app/b3;->a:Ljava/lang/String;

    sget-object v8, Lk20$a;->d:Lk20$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lbo/app/b3$c;

    invoke-direct {v11, p0}, Lbo/app/b3$c;-><init>(Lorg/json/JSONObject;)V

    const/16 v12, 0xc

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {p0, p1}, Lbo/app/b3;->b(Lorg/json/JSONObject;Lbo/app/y1;)V

    return-object v0

    :cond_3
    sget-object v1, Lbo/app/b3$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_8

    const/4 v2, 0x2

    if-eq v1, v2, :cond_7

    const/4 v2, 0x3

    if-eq v1, v2, :cond_6

    const/4 v2, 0x4

    if-eq v1, v2, :cond_5

    const/4 v2, 0x5

    if-eq v1, v2, :cond_4

    sget-object v3, Lk20;->a:Lk20;

    sget-object v4, Lbo/app/b3;->a:Ljava/lang/String;

    sget-object v5, Lk20$a;->g:Lk20$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lbo/app/b3$d;

    invoke-direct {v8, p0}, Lbo/app/b3$d;-><init>(Lorg/json/JSONObject;)V

    const/16 v9, 0xc

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {p0, p1}, Lbo/app/b3;->b(Lorg/json/JSONObject;Lbo/app/y1;)V

    goto :goto_2

    :cond_4
    new-instance v1, LpZ1;

    invoke-direct {v1, p0, p1}, LpZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    goto :goto_1

    :cond_5
    new-instance v1, LrZ1;

    invoke-direct {v1, p0, p1}, LrZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    goto :goto_1

    :cond_6
    new-instance v1, LBZ1;

    invoke-direct {v1, p0, p1}, LBZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    goto :goto_1

    :cond_7
    new-instance v1, LxZ1;

    invoke-direct {v1, p0, p1}, LxZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V

    goto :goto_1

    :cond_8
    new-instance v1, LnZ1;

    invoke-direct {v1, p0, p1}, LnZ1;-><init>(Lorg/json/JSONObject;Lbo/app/y1;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    move-object v0, v1

    :goto_2
    return-object v0

    :catch_1
    move-exception p1

    move-object v4, p1

    sget-object v1, Lk20;->a:Lk20;

    sget-object v2, Lbo/app/b3;->a:Ljava/lang/String;

    sget-object v3, Lk20$a;->e:Lk20$a;

    new-instance v6, Lbo/app/b3$e;

    invoke-direct {v6, p0}, Lbo/app/b3$e;-><init>(Lorg/json/JSONObject;)V

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v0
.end method

.method public static final b(Lorg/json/JSONObject;)Lorg/json/JSONArray;
    .locals 1

    const-string v0, "inAppMessageJson"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themes"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "dark"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    const-string v0, "btns"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    :goto_1
    if-nez p0, :cond_2

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    :cond_2
    return-object p0
.end method

.method private static final b(Lorg/json/JSONObject;Lbo/app/y1;)V
    .locals 2

    const-string v0, "trigger_id"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_3

    sget-object v0, Lbo/app/j;->h:Lbo/app/j$a;

    const-string v1, "triggerId"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LmZ1;->g:LmZ1;

    invoke-virtual {v0, p0, v1}, Lbo/app/j$a;->a(Ljava/lang/String;LmZ1;)Lbo/app/u1;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1, p0}, Lbo/app/y1;->a(Lbo/app/u1;)Z

    :cond_3
    :goto_2
    return-void
.end method

.method public static final c(Lorg/json/JSONObject;)Z
    .locals 2

    const-string v0, "inAppMessageJson"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "is_control"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
