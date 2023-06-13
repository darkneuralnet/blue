.class public final Lcom/stripe/android/financialconnections/navigation/NavigationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
        "",
        "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
        "directions",
        "",
        "navigate",
        "LZC0;",
        "externalScope",
        "LZC0;",
        "LBX2;",
        "commands",
        "LBX2;",
        "getCommands",
        "()LBX2;",
        "setCommands",
        "(LBX2;)V",
        "<init>",
        "(LZC0;)V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private commands:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
            ">;"
        }
    .end annotation
.end field

.field private final externalScope:LZC0;


# direct methods
.method public constructor <init>(LZC0;)V
    .locals 2

    const-string v0, "externalScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->externalScope:LZC0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0, p1}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->commands:LBX2;

    return-void
.end method


# virtual methods
.method public final getCommands()LBX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LBX2<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->commands:LBX2;

    return-object v0
.end method

.method public final navigate(Lcom/stripe/android/financialconnections/navigation/NavigationCommand;)V
    .locals 8

    const-string v0, "directions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->externalScope:LZC0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/financialconnections/navigation/NavigationManager$navigate$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/stripe/android/financialconnections/navigation/NavigationManager$navigate$1;-><init>(Lcom/stripe/android/financialconnections/navigation/NavigationManager;Lcom/stripe/android/financialconnections/navigation/NavigationCommand;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final setCommands(LBX2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBX2<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;->commands:LBX2;

    return-void
.end method
