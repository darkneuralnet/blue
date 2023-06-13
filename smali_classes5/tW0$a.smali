.class public final LtW0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LtW0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0001\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "b",
        "()Ljava/lang/Void;"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final g:LtW0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LtW0$a;

    invoke-direct {v0}, LtW0$a;-><init>()V

    sput-object v0, LtW0$a;->g:LtW0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Void;
    .locals 4

    sget-object v0, Lcom/github/kittinunf/fuel/core/FuelError;->c:Lcom/github/kittinunf/fuel/core/FuelError$a;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The input has already been written to an output stream and can not be consumed again."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/github/kittinunf/fuel/core/FuelError$a;->b(Lcom/github/kittinunf/fuel/core/FuelError$a;Ljava/lang/Throwable;LFM4;ILjava/lang/Object;)Lcom/github/kittinunf/fuel/core/FuelError;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LtW0$a;->b()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
