.class public LF90$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF90;->h0(Lsf0;Z)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lsf0;

.field public final synthetic b:LF90;


# direct methods
.method public constructor <init>(LF90;Lsf0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LF90$a;->b:LF90;

    iput-object p2, p0, LF90$a;->a:Lsf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, LF90$a;->b:LF90;

    iget-object p1, p1, LF90;->q:Ljava/util/Map;

    iget-object v0, p0, LF90$a;->a:Lsf0;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LF90$c;->a:[I

    iget-object v0, p0, LF90$a;->b:LF90;

    iget-object v0, v0, LF90;->f:LF90$g;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LF90$a;->b:LF90;

    iget p1, p1, LF90;->m:I

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LF90$a;->b:LF90;

    invoke-virtual {p1}, LF90;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LF90$a;->b:LF90;

    iget-object p1, p1, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    if-eqz p1, :cond_2

    invoke-static {p1}, Loh;->a(Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, LF90$a;->b:LF90;

    const/4 v0, 0x0

    iput-object v0, p1, LF90;->l:Landroid/hardware/camera2/CameraDevice;

    :cond_2
    :goto_0
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LF90$a;->a(Ljava/lang/Void;)V

    return-void
.end method
