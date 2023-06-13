.class public final Lf39;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lf39;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Lf39;
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf39;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lf39;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    sput-object v0, Lf39;->d:Lf39;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf39;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lf39;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
