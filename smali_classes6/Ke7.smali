.class public final LKe7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:LaY7;


# direct methods
.method public constructor <init>(LaY7;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, LKe7;->d:LaY7;

    iput-object p2, p0, LKe7;->b:Ljava/lang/String;

    iput-wide p3, p0, LKe7;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LKe7;->d:LaY7;

    iget-object v1, p0, LKe7;->b:Ljava/lang/String;

    iget-wide v2, p0, LKe7;->c:J

    invoke-static {v0, v1, v2, v3}, LaY7;->f(LaY7;Ljava/lang/String;J)V

    return-void
.end method
