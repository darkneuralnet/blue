.class public abstract LBm1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB62;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBm1$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LBm1;
    .locals 1

    invoke-static {}, LAm1;->k()LAm1;

    move-result-object v0

    invoke-static {v0}, LBm1;->d(LAm1;)LBm1;

    move-result-object v0

    return-object v0
.end method

.method public static d(LAm1;)LBm1;
    .locals 1

    const-class v0, LBm1;

    invoke-virtual {p0, v0}, LAm1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBm1;

    return-object p0
.end method


# virtual methods
.method public abstract a(LBm1$a;)V
.end method

.method public abstract b(Z)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "LVh;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(LUh;)V
.end method

.method public abstract f(Z)V
.end method
