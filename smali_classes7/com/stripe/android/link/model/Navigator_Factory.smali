.class public final Lcom/stripe/android/link/model/Navigator_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/model/Navigator_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/model/Navigator;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/model/Navigator_Factory;
    .locals 1

    invoke-static {}, Lcom/stripe/android/link/model/Navigator_Factory$InstanceHolder;->a()Lcom/stripe/android/link/model/Navigator_Factory;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance()Lcom/stripe/android/link/model/Navigator;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/model/Navigator;

    invoke-direct {v0}, Lcom/stripe/android/link/model/Navigator;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/model/Navigator;
    .locals 1

    invoke-static {}, Lcom/stripe/android/link/model/Navigator_Factory;->newInstance()Lcom/stripe/android/link/model/Navigator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/model/Navigator_Factory;->get()Lcom/stripe/android/link/model/Navigator;

    move-result-object v0

    return-object v0
.end method
