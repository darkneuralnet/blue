.class public LSw2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNw2;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1f
.end annotation


# instance fields
.field public final a:Lxi0;

.field public final b:LBi0;

.field public final c:Z

.field public final d:Z


# direct methods
.method public constructor <init>(Lxi0;LBi0;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSw2;->a:Lxi0;

    iput-object p2, p0, LSw2;->b:LBi0;

    iput-boolean p3, p0, LSw2;->c:Z

    iput-boolean p4, p0, LSw2;->d:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LSw2;->b:LBi0;

    invoke-virtual {v0}, LBi0;->a()Z

    move-result v0

    return v0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, LSw2;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LSw2;->a:Lxi0;

    invoke-virtual {v0}, Lxi0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LSw2;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, LSw2;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
