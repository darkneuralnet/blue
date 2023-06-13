.class public Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;
    }
.end annotation


# instance fields
.field private final customCallbackHandler:Landroid/os/Handler;

.field private final retryOnConnectionSuspended:Z


# direct methods
.method private constructor <init>(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->access$000(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->customCallbackHandler:Landroid/os/Handler;

    invoke-static {p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;->access$100(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->retryOnConnectionSuspended:Z

    return-void
.end method

.method public synthetic constructor <init>(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;-><init>(Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;)V

    return-void
.end method

.method public static builder()Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;
    .locals 1

    new-instance v0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;

    invoke-direct {v0}, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getCustomCallbackHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->customCallbackHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public isRetryOnConnectionSuspended()Z
    .locals 1

    iget-boolean v0, p0, Lpl/charmas/android/reactivelocation2/ReactiveLocationProviderConfiguration;->retryOnConnectionSuspended:Z

    return v0
.end method
