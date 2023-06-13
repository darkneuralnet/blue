.class public final Lh30;
.super Lcom/github/kittinunf/fuel/core/FuelError;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lh30;",
        "Lcom/github/kittinunf/fuel/core/FuelError;",
        "d",
        "Lcom/github/kittinunf/fuel/core/FuelError;",
        "e",
        "()Lcom/github/kittinunf/fuel/core/FuelError;",
        "inner",
        "<init>",
        "(Lcom/github/kittinunf/fuel/core/FuelError;)V",
        "fuel"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final d:Lcom/github/kittinunf/fuel/core/FuelError;


# direct methods
.method public constructor <init>(Lcom/github/kittinunf/fuel/core/FuelError;)V
    .locals 1

    const-string v0, "inner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/github/kittinunf/fuel/core/FuelError;->d()LFM4;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/github/kittinunf/fuel/core/FuelError;-><init>(Ljava/lang/Throwable;LFM4;)V

    iput-object p1, p0, Lh30;->d:Lcom/github/kittinunf/fuel/core/FuelError;

    return-void
.end method


# virtual methods
.method public final e()Lcom/github/kittinunf/fuel/core/FuelError;
    .locals 1

    iget-object v0, p0, Lh30;->d:Lcom/github/kittinunf/fuel/core/FuelError;

    return-object v0
.end method
