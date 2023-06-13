.class public Lwf1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0014\n\u0002\u0008\u0007\u0008\u0017\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lwf1;",
        "Ljava/io/Closeable;",
        "",
        "a",
        "close",
        "Lcom/google/android/filament/IndirectLight;",
        "b",
        "Lcom/google/android/filament/IndirectLight;",
        "()Lcom/google/android/filament/IndirectLight;",
        "indirectLight",
        "Lcom/google/android/filament/Skybox;",
        "c",
        "Lcom/google/android/filament/Skybox;",
        "()Lcom/google/android/filament/Skybox;",
        "skybox",
        "",
        "d",
        "[F",
        "()[F",
        "sphericalHarmonics",
        "<init>",
        "(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/filament/IndirectLight;

.field public final c:Lcom/google/android/filament/Skybox;

.field public final d:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lwf1;-><init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf1;->b:Lcom/google/android/filament/IndirectLight;

    iput-object p2, p0, Lwf1;->c:Lcom/google/android/filament/Skybox;

    iput-object p3, p0, Lwf1;->d:[F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lwf1;-><init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lwf1;->b:Lcom/google/android/filament/IndirectLight;

    if-eqz v0, :cond_0

    invoke-static {v0}, LD12;->b(Lcom/google/android/filament/IndirectLight;)V

    :cond_0
    iget-object v0, p0, Lwf1;->c:Lcom/google/android/filament/Skybox;

    if-eqz v0, :cond_1

    invoke-static {v0}, LWD5;->b(Lcom/google/android/filament/Skybox;)V

    :cond_1
    return-void
.end method

.method public final b()Lcom/google/android/filament/IndirectLight;
    .locals 1

    iget-object v0, p0, Lwf1;->b:Lcom/google/android/filament/IndirectLight;

    return-object v0
.end method

.method public final c()Lcom/google/android/filament/Skybox;
    .locals 1

    iget-object v0, p0, Lwf1;->c:Lcom/google/android/filament/Skybox;

    return-object v0
.end method

.method public close()V
    .locals 0

    invoke-virtual {p0}, Lwf1;->a()V

    return-void
.end method

.method public final d()[F
    .locals 1

    iget-object v0, p0, Lwf1;->d:[F

    return-object v0
.end method
