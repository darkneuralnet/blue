.class public abstract LNd3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNd3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "LNd3$a<",
        "TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public c:Z

.field public d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LNd3$a;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LNd3$a;->b:Z

    iput-boolean v0, p0, LNd3$a;->c:Z

    return-void
.end method

.method public static bridge synthetic b(LNd3$a;)I
    .locals 0

    iget p0, p0, LNd3$a;->a:I

    return p0
.end method

.method public static bridge synthetic c(LNd3$a;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, LNd3$a;->d:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic d(LNd3$a;)Z
    .locals 0

    iget-boolean p0, p0, LNd3$a;->c:Z

    return p0
.end method

.method public static bridge synthetic e(LNd3$a;)Z
    .locals 0

    iget-boolean p0, p0, LNd3$a;->b:Z

    return p0
.end method


# virtual methods
.method public a(I)LNd3$a;
    .locals 0
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    iput p1, p0, LNd3$a;->a:I

    return-object p0
.end method
