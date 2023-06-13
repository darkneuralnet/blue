.class public final Lio/github/sceneview/SceneView$b$a;
.super Lio/github/sceneview/SceneView$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/SceneView$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lio/github/sceneview/SceneView$b$a;",
        "Lio/github/sceneview/SceneView$b;",
        "<init>",
        "()V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final b:Lio/github/sceneview/SceneView$b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/sceneview/SceneView$b$a;

    invoke-direct {v0}, Lio/github/sceneview/SceneView$b$a;-><init>()V

    sput-object v0, Lio/github/sceneview/SceneView$b$a;->b:Lio/github/sceneview/SceneView$b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lio/github/sceneview/SceneView$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
