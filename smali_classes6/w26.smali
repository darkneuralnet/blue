.class public Lw26;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx26;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw26$a;
    }
.end annotation


# static fields
.field public static final c:Lw26;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw26$a;

    invoke-direct {v0}, Lw26$a;-><init>()V

    invoke-virtual {v0}, Lw26$a;->a()Lw26;

    move-result-object v0

    sput-object v0, Lw26;->c:Lw26;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lpf7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lw26;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lw26;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lw26;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lw26;->d()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "play-services-mlkit-text-recognition"

    return-object v0

    :cond_0
    const-string v0, "text-recognition"

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile"

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lw26;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "com.google.mlkit.dynamite.text.latin"

    invoke-static {v0, v1}, Ly26;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    const-string v0, "en"

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lw26;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lw26;

    iget-object v0, p0, Lw26;->b:Ljava/util/concurrent/Executor;

    iget-object p1, p1, Lw26;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    const-string v0, "optional-module-text-latin"

    return-object v0
.end method

.method public final h()I
    .locals 1

    invoke-virtual {p0}, Lw26;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x5efd

    return v0

    :cond_0
    const/16 v0, 0x5ef2

    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lw26;->b:Ljava/util/concurrent/Executor;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lw26;->d()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "com.google.android.gms.vision.ocr"

    return-object v0

    :cond_0
    const-string v0, "com.google.mlkit.dynamite.text.latin"

    return-object v0
.end method
