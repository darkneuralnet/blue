.class public final LSW;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LzV0;

.field public final b:Z


# direct methods
.method public constructor <init>(LzV0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LSW;->b:Z

    iput-object p1, p0, LSW;->a:LzV0;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, LSW;-><init>(LzV0;Z)V

    return-void
.end method


# virtual methods
.method public a()LzV0;
    .locals 1

    iget-object v0, p0, LSW;->a:LzV0;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LSW;->b:Z

    return v0
.end method
