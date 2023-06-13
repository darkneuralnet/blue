.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUv;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(LCE0;)LS96;
    .locals 3

    new-instance v0, LPg0;

    invoke-virtual {p1}, LCE0;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, LCE0;->e()Lbl0;

    move-result-object v2

    invoke-virtual {p1}, LCE0;->d()Lbl0;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, LPg0;-><init>(Landroid/content/Context;Lbl0;Lbl0;)V

    return-object v0
.end method
