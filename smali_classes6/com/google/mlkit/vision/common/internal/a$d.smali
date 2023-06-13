.class public Lcom/google/mlkit/vision/common/internal/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/common/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:LX94;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;LX94;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DetectorT::",
            "Lcom/google/mlkit/vision/common/internal/a$c;",
            "OptionsT::",
            "Lcom/google/mlkit/vision/common/internal/a$b<",
            "TDetectorT;>;>(",
            "Ljava/lang/Class<",
            "+TOptionsT;>;",
            "LX94<",
            "+",
            "Lcom/google/mlkit/vision/common/internal/a$a<",
            "TDetectorT;TOptionsT;>;>;)V"
        }
    .end annotation

    const/16 v0, 0x64

    invoke-direct {p0, p1, p2, v0}, Lcom/google/mlkit/vision/common/internal/a$d;-><init>(Ljava/lang/Class;LX94;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;LX94;I)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DetectorT::",
            "Lcom/google/mlkit/vision/common/internal/a$c;",
            "OptionsT::",
            "Lcom/google/mlkit/vision/common/internal/a$b<",
            "TDetectorT;>;>(",
            "Ljava/lang/Class<",
            "+TOptionsT;>;",
            "LX94<",
            "+",
            "Lcom/google/mlkit/vision/common/internal/a$a<",
            "TDetectorT;TOptionsT;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/common/internal/a$d;->a:Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/mlkit/vision/common/internal/a$d;->b:LX94;

    iput p3, p0, Lcom/google/mlkit/vision/common/internal/a$d;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/common/internal/a$d;->c:I

    return v0
.end method

.method public final b()LX94;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/a$d;->b:LX94;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/a$d;->a:Ljava/lang/Class;

    return-object v0
.end method
