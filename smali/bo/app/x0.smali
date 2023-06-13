.class public Lbo/app/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Lbo/app/g2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lbo/app/x0;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbo/app/x0;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbo/app/g2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/x0;->a:Lbo/app/g2;

    return-void
.end method


# virtual methods
.method public a(Lbo/app/g2;)V
    .locals 0

    iput-object p1, p0, Lbo/app/x0;->a:Lbo/app/g2;

    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lbo/app/x0;->a:Lbo/app/g2;

    if-eqz p1, :cond_0

    sget-object p1, Lbo/app/x0;->b:Ljava/lang/String;

    const-string v0, "Uncaught exception from thread. Publishing as Throwable event."

    invoke-static {p1, v0, p2}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lbo/app/x0;->a:Lbo/app/g2;

    const-class v0, Ljava/lang/Throwable;

    invoke-interface {p1, p2, v0}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lbo/app/x0;->b:Ljava/lang/String;

    const-string v0, "Failed to log throwable."

    invoke-static {p2, v0, p1}, Lk20;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
