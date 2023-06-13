.class public final synthetic Ly21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lz21;

.field public final synthetic b:Lco/bird/android/model/constant/DeviceVerification;


# direct methods
.method public synthetic constructor <init>(Lz21;Lco/bird/android/model/constant/DeviceVerification;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly21;->a:Lz21;

    iput-object p2, p0, Ly21;->b:Lco/bird/android/model/constant/DeviceVerification;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Ly21;->a:Lz21;

    iget-object v1, p0, Ly21;->b:Lco/bird/android/model/constant/DeviceVerification;

    invoke-static {v0, v1, p1}, Lz21;->j(Lz21;Lco/bird/android/model/constant/DeviceVerification;Ljava/lang/Exception;)V

    return-void
.end method
