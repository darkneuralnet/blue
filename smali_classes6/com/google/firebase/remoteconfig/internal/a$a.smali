.class public Lcom/google/firebase/remoteconfig/internal/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/remoteconfig/internal/a;->b(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Lcom/google/firebase/remoteconfig/internal/a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/remoteconfig/internal/a;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->d:Lcom/google/firebase/remoteconfig/internal/a;

    iput p2, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->b:I

    iput-wide p3, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->d:Lcom/google/firebase/remoteconfig/internal/a;

    iget v1, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->b:I

    iget-wide v2, p0, Lcom/google/firebase/remoteconfig/internal/a$a;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/firebase/remoteconfig/internal/a;->d(IJ)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
