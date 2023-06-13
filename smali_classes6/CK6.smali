.class public final LCK6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LUM6;

.field public final synthetic d:LEK6;


# direct methods
.method public constructor <init>(LEK6;Ljava/util/List;LUM6;)V
    .locals 0

    iput-object p1, p0, LCK6;->d:LEK6;

    iput-object p2, p0, LCK6;->b:Ljava/util/List;

    iput-object p3, p0, LCK6;->c:LUM6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, LCK6;->d:LEK6;

    invoke-static {v0}, LEK6;->b(LEK6;)LIK6;

    move-result-object v0

    iget-object v1, p0, LCK6;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, LIK6;->c(Ljava/util/List;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    iget-object v0, p0, LCK6;->d:LEK6;

    iget-object v1, p0, LCK6;->c:LUM6;

    invoke-static {v0, v1}, LEK6;->c(LEK6;LUM6;)V

    return-void

    :cond_0
    iget-object v0, p0, LCK6;->d:LEK6;

    iget-object v1, p0, LCK6;->b:Ljava/util/List;

    iget-object v2, p0, LCK6;->c:LUM6;

    invoke-static {v0, v1, v2}, LEK6;->d(LEK6;Ljava/util/List;LUM6;)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "SplitCompat"

    const-string v2, "Error checking verified files."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, LCK6;->c:LUM6;

    const/16 v1, -0xb

    invoke-interface {v0, v1}, LUM6;->a(I)V

    return-void
.end method
