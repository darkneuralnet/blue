.class public final synthetic Lr21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lz21;

.field public final synthetic c:Lco/bird/android/model/constant/DeviceVerification;


# direct methods
.method public synthetic constructor <init>(ZLz21;Lco/bird/android/model/constant/DeviceVerification;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr21;->a:Z

    iput-object p2, p0, Lr21;->b:Lz21;

    iput-object p3, p0, Lr21;->c:Lco/bird/android/model/constant/DeviceVerification;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-boolean v0, p0, Lr21;->a:Z

    iget-object v1, p0, Lr21;->b:Lz21;

    iget-object v2, p0, Lr21;->c:Lco/bird/android/model/constant/DeviceVerification;

    invoke-static {v0, v1, v2, p1}, Lz21;->i(ZLz21;Lco/bird/android/model/constant/DeviceVerification;Ljava/lang/Exception;)V

    return-void
.end method
