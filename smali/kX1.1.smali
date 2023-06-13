.class public LkX1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILja0$a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-class v0, LlX1;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, LlX1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, LjX1;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    goto :goto_0

    :cond_2
    invoke-static {}, LjX1;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    :goto_0
    return-void
.end method
