.class public final LpV7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDV7;


# instance fields
.field public final a:Lh38;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh38;

    invoke-direct {v0}, Lh38;-><init>()V

    iput-object v0, p0, LpV7;->a:Lh38;

    return-void
.end method


# virtual methods
.method public final zza()LKr9;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lgt9;->c(J)LKr9;

    move-result-object v0

    return-object v0
.end method
