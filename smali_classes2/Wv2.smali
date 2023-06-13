.class public final LWv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LuQ3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LuQ3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWv2;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LWv2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LuQ3;",
            ">;)",
            "LWv2;"
        }
    .end annotation

    new-instance v0, LWv2;

    invoke-direct {v0, p0}, LWv2;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LuQ3;)Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;-><init>(LuQ3;)V

    return-object v0
.end method


# virtual methods
.method public b()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;
    .locals 1

    iget-object v0, p0, LWv2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LuQ3;

    invoke-static {v0}, LWv2;->c(LuQ3;)Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWv2;->b()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    move-result-object v0

    return-object v0
.end method
