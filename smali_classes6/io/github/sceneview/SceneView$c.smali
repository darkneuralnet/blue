.class public final enum Lio/github/sceneview/SceneView$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/sceneview/SceneView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/sceneview/SceneView$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\"\u0010\u0008\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/github/sceneview/SceneView$c;",
        "",
        "",
        "b",
        "Z",
        "()Z",
        "setAllowDeselection",
        "(Z)V",
        "allowDeselection",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
        "d",
        "e",
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
.field public static final enum c:Lio/github/sceneview/SceneView$c;

.field public static final enum d:Lio/github/sceneview/SceneView$c;

.field public static final enum e:Lio/github/sceneview/SceneView$c;

.field public static final synthetic f:[Lio/github/sceneview/SceneView$c;


# instance fields
.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/github/sceneview/SceneView$c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/github/sceneview/SceneView$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/sceneview/SceneView$c;->c:Lio/github/sceneview/SceneView$c;

    new-instance v0, Lio/github/sceneview/SceneView$c;

    const-string v1, "SINGLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/github/sceneview/SceneView$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/sceneview/SceneView$c;->d:Lio/github/sceneview/SceneView$c;

    new-instance v0, Lio/github/sceneview/SceneView$c;

    const-string v1, "MULTIPLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/github/sceneview/SceneView$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/sceneview/SceneView$c;->e:Lio/github/sceneview/SceneView$c;

    invoke-static {}, Lio/github/sceneview/SceneView$c;->a()[Lio/github/sceneview/SceneView$c;

    move-result-object v0

    sput-object v0, Lio/github/sceneview/SceneView$c;->f:[Lio/github/sceneview/SceneView$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/github/sceneview/SceneView$c;->b:Z

    return-void
.end method

.method public static final synthetic a()[Lio/github/sceneview/SceneView$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lio/github/sceneview/SceneView$c;

    const/4 v1, 0x0

    sget-object v2, Lio/github/sceneview/SceneView$c;->c:Lio/github/sceneview/SceneView$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lio/github/sceneview/SceneView$c;->d:Lio/github/sceneview/SceneView$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lio/github/sceneview/SceneView$c;->e:Lio/github/sceneview/SceneView$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/github/sceneview/SceneView$c;
    .locals 1

    const-class v0, Lio/github/sceneview/SceneView$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/github/sceneview/SceneView$c;

    return-object p0
.end method

.method public static values()[Lio/github/sceneview/SceneView$c;
    .locals 1

    sget-object v0, Lio/github/sceneview/SceneView$c;->f:[Lio/github/sceneview/SceneView$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/github/sceneview/SceneView$c;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/sceneview/SceneView$c;->b:Z

    return v0
.end method
