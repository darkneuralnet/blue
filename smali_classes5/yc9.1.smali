.class public final Lyc9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcb9;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(Lcb9;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc9;->a:Lcb9;

    iput-object p2, p0, Lyc9;->b:Ljava/lang/String;

    iput-object p3, p0, Lyc9;->c:Ljava/lang/String;

    iput-wide p4, p0, Lyc9;->d:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lyc9;->d:J

    return-wide v0
.end method

.method public final b()Lcb9;
    .locals 1

    iget-object v0, p0, Lyc9;->a:Lcb9;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc9;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc9;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lyc9;->d:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
