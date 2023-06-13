.class public Lhw4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhw4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:LX94;


# direct methods
.method public constructor <init>(Ljava/lang/Class;LX94;)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RemoteT:",
            "Lgw4;",
            ">(",
            "Ljava/lang/Class<",
            "TRemoteT;>;",
            "LX94<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw4$a;->a:Ljava/lang/Class;

    iput-object p2, p0, Lhw4$a;->b:LX94;

    return-void
.end method


# virtual methods
.method public final a()LX94;
    .locals 1

    iget-object v0, p0, Lhw4$a;->b:LX94;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lhw4$a;->a:Ljava/lang/Class;

    return-object v0
.end method
