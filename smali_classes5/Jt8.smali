.class public final LJt8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPH7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LPH7<",
        "Lyq7;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LLA8;


# direct methods
.method public constructor <init>(LLA8;)V
    .locals 0

    iput-object p1, p0, LJt8;->a:LLA8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lyq7;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/DeadObjectException;
        }
    .end annotation

    iget-object v0, p0, LJt8;->a:LLA8;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/BaseGmsClient;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lyq7;

    return-object v0
.end method
