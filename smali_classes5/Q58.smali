.class public abstract LQ58;
.super LV78;
.source "SourceFile"

# interfaces
.implements Lrj8;


# instance fields
.field protected zza:Ld48;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LV78;-><init>()V

    invoke-static {}, Ld48;->d()Ld48;

    move-result-object v0

    iput-object v0, p0, LQ58;->zza:Ld48;

    return-void
.end method


# virtual methods
.method public final H()Ld48;
    .locals 1

    iget-object v0, p0, LQ58;->zza:Ld48;

    invoke-virtual {v0}, Ld48;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQ58;->zza:Ld48;

    invoke-virtual {v0}, Ld48;->c()Ld48;

    move-result-object v0

    iput-object v0, p0, LQ58;->zza:Ld48;

    :cond_0
    iget-object v0, p0, LQ58;->zza:Ld48;

    return-object v0
.end method
