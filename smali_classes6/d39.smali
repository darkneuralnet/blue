.class public final Ld39;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ld39;

.field public static final d:Ld39;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/Throwable;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lv39;->v()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Ld39;->d:Ld39;

    sput-object v1, Ld39;->c:Ld39;

    return-void

    :cond_0
    new-instance v0, Ld39;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ld39;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Ld39;->d:Ld39;

    new-instance v0, Ld39;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ld39;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Ld39;->c:Ld39;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/Throwable;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld39;->a:Z

    iput-object p2, p0, Ld39;->b:Ljava/lang/Throwable;

    return-void
.end method
