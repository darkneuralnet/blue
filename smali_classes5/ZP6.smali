.class public final LZP6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcQ6;


# instance fields
.field public final synthetic a:LjZ0;


# direct methods
.method public constructor <init>(LjZ0;)V
    .locals 0

    iput-object p1, p0, LZP6;->a:LjZ0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LAq2;)V
    .locals 0

    iget-object p1, p0, LZP6;->a:LjZ0;

    invoke-static {p1}, LjZ0;->l(LjZ0;)LAq2;

    move-result-object p1

    invoke-interface {p1}, LAq2;->onResume()V

    return-void
.end method

.method public final zaa()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method
