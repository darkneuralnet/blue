.class public final LiJ4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj72;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiJ4;->d(Lno/nordicsemi/android/ble/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "b",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LWc0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWc0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lno/nordicsemi/android/ble/u0;


# direct methods
.method public constructor <init>(LWc0;Lno/nordicsemi/android/ble/u0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWc0<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Lno/nordicsemi/android/ble/u0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LiJ4$b;->a:LWc0;

    iput-object p2, p0, LiJ4$b;->b:Lno/nordicsemi/android/ble/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, LiJ4$b;->a:LWc0;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance v1, Lno/nordicsemi/android/ble/exception/InvalidRequestException;

    iget-object v2, p0, LiJ4$b;->b:Lno/nordicsemi/android/ble/u0;

    invoke-direct {v1, v2}, Lno/nordicsemi/android/ble/exception/InvalidRequestException;-><init>(Lno/nordicsemi/android/ble/u0;)V

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
