.class public final Lgx8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lcom/google/android/gms/internal/vision/E;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/vision/E;->b()Lcom/google/android/gms/internal/vision/E;

    move-result-object v0

    iput-object v0, p0, Lgx8;->d:Lcom/google/android/gms/internal/vision/E;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/vision/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lgx8;->d:Lcom/google/android/gms/internal/vision/E;

    return-void
.end method
