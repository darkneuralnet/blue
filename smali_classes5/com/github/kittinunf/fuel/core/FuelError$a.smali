.class public final Lcom/github/kittinunf/fuel/core/FuelError$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/kittinunf/fuel/core/FuelError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/github/kittinunf/fuel/core/FuelError$a;",
        "",
        "",
        "it",
        "LFM4;",
        "response",
        "Lcom/github/kittinunf/fuel/core/FuelError;",
        "a",
        "<init>",
        "()V",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/github/kittinunf/fuel/core/FuelError$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/github/kittinunf/fuel/core/FuelError$a;Ljava/lang/Throwable;LFM4;ILjava/lang/Object;)Lcom/github/kittinunf/fuel/core/FuelError;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LFM4;->g:LFM4$b;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p2, p4, p3, p4}, LFM4$b;->b(LFM4$b;Ljava/net/URL;ILjava/lang/Object;)LFM4;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/github/kittinunf/fuel/core/FuelError$a;->a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;LFM4;)Lcom/github/kittinunf/fuel/core/FuelError;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lh30;

    if-eqz v0, :cond_0

    new-instance p2, Lh30;

    check-cast p1, Lh30;

    invoke-virtual {p1}, Lh30;->e()Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object p1

    invoke-direct {p2, p1}, Lh30;-><init>(Lcom/github/kittinunf/fuel/core/FuelError;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/github/kittinunf/fuel/core/FuelError;

    if-eqz v0, :cond_1

    new-instance p2, Lh30;

    check-cast p1, Lcom/github/kittinunf/fuel/core/FuelError;

    invoke-direct {p2, p1}, Lh30;-><init>(Lcom/github/kittinunf/fuel/core/FuelError;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/github/kittinunf/fuel/core/FuelError;

    invoke-direct {v0, p1, p2}, Lcom/github/kittinunf/fuel/core/FuelError;-><init>(Ljava/lang/Throwable;LFM4;)V

    move-object p2, v0

    :goto_0
    return-object p2
.end method
