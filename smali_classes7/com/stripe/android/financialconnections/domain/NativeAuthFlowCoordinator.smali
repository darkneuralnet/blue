.class public final Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\tB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;",
        "",
        "LBX2;",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;",
        "invoke",
        "flow",
        "LBX2;",
        "<init>",
        "()V",
        "Message",
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
.field private final flow:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1, v0}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->flow:LBX2;

    return-void
.end method


# virtual methods
.method public final invoke()LBX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LBX2<",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;->flow:LBX2;

    return-object v0
.end method
