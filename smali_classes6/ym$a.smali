.class public final Lym$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lym;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lym;)Lio/github/sceneview/ar/arcore/ArSession;
    .locals 0

    invoke-interface {p0}, Lym;->F3()Lio/github/sceneview/ar/ARCore;

    move-result-object p0

    invoke-virtual {p0}, Lio/github/sceneview/ar/ARCore;->l()Lio/github/sceneview/ar/arcore/ArSession;

    move-result-object p0

    return-object p0
.end method
