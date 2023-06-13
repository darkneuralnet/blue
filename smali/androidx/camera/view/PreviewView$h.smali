.class public final enum Landroidx/camera/view/PreviewView$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/PreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/view/PreviewView$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/camera/view/PreviewView$h;

.field public static final enum c:Landroidx/camera/view/PreviewView$h;

.field public static final synthetic d:[Landroidx/camera/view/PreviewView$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/view/PreviewView$h;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/view/PreviewView$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    new-instance v0, Landroidx/camera/view/PreviewView$h;

    const-string v1, "STREAMING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/view/PreviewView$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/view/PreviewView$h;->c:Landroidx/camera/view/PreviewView$h;

    invoke-static {}, Landroidx/camera/view/PreviewView$h;->a()[Landroidx/camera/view/PreviewView$h;

    move-result-object v0

    sput-object v0, Landroidx/camera/view/PreviewView$h;->d:[Landroidx/camera/view/PreviewView$h;

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

    return-void
.end method

.method public static synthetic a()[Landroidx/camera/view/PreviewView$h;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/camera/view/PreviewView$h;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/view/PreviewView$h;->c:Landroidx/camera/view/PreviewView$h;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/view/PreviewView$h;
    .locals 1

    const-class v0, Landroidx/camera/view/PreviewView$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/view/PreviewView$h;

    return-object p0
.end method

.method public static values()[Landroidx/camera/view/PreviewView$h;
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$h;->d:[Landroidx/camera/view/PreviewView$h;

    invoke-virtual {v0}, [Landroidx/camera/view/PreviewView$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/view/PreviewView$h;

    return-object v0
.end method
