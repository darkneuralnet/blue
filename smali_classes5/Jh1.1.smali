.class public final LJh1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh1$a;

    invoke-direct {v0}, LJh1$a;-><init>()V

    sput-object v0, LJh1;->a:Ljava/util/concurrent/Executor;

    new-instance v0, LJh1$b;

    invoke-direct {v0}, LJh1$b;-><init>()V

    sput-object v0, LJh1;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LJh1;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LJh1;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method
