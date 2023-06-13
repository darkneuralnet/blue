.class public LpM2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpM2$a;
    }
.end annotation


# instance fields
.field public final a:LpM2$a;

.field public final b:Lze;

.field public final c:Lse;

.field public final d:Z


# direct methods
.method public constructor <init>(LpM2$a;Lze;Lse;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpM2;->a:LpM2$a;

    iput-object p2, p0, LpM2;->b:Lze;

    iput-object p3, p0, LpM2;->c:Lse;

    iput-boolean p4, p0, LpM2;->d:Z

    return-void
.end method


# virtual methods
.method public a()LpM2$a;
    .locals 1

    iget-object v0, p0, LpM2;->a:LpM2$a;

    return-object v0
.end method

.method public b()Lze;
    .locals 1

    iget-object v0, p0, LpM2;->b:Lze;

    return-object v0
.end method

.method public c()Lse;
    .locals 1

    iget-object v0, p0, LpM2;->c:Lse;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LpM2;->d:Z

    return v0
.end method
