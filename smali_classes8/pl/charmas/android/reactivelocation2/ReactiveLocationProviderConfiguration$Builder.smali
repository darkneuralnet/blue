.class public Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private customCallbackHandler:Landroid/os/Handler;

.field private retryOnConnectionSuspended:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->customCallbackHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->retryOnConnectionSuspended:Z

    return-void
.end method

.method public static synthetic access$000(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->customCallbackHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic access$100(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->retryOnConnectionSuspended:Z

    return p0
.end method


# virtual methods
.method public build()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;
    .locals 2

    new-instance v0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;-><init>(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$1;)V

    return-object v0
.end method

.method public setCustomCallbackHandler(Landroid/os/Handler;)Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;
    .locals 0

    iput-object p1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->customCallbackHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public setRetryOnConnectionSuspended(Z)Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;
    .locals 0

    iput-boolean p1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->retryOnConnectionSuspended:Z

    return-object p0
.end method
