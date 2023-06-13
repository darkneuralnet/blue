.class public abstract Lbu7;
.super Leu7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# instance fields
.field protected zzb:LEt7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Leu7;-><init>()V

    invoke-static {}, LEt7;->f()LEt7;

    move-result-object v0

    iput-object v0, p0, Lbu7;->zzb:LEt7;

    return-void
.end method


# virtual methods
.method public final D()LEt7;
    .locals 1

    iget-object v0, p0, Lbu7;->zzb:LEt7;

    invoke-virtual {v0}, LEt7;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbu7;->zzb:LEt7;

    invoke-virtual {v0}, LEt7;->e()LEt7;

    move-result-object v0

    iput-object v0, p0, Lbu7;->zzb:LEt7;

    :cond_0
    iget-object v0, p0, Lbu7;->zzb:LEt7;

    return-object v0
.end method
