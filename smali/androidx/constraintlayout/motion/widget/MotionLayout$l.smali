.class public final enum Landroidx/constraintlayout/motion/widget/MotionLayout$l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/constraintlayout/motion/widget/MotionLayout$l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

.field public static final enum c:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

.field public static final enum d:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

.field public static final enum e:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

.field public static final synthetic f:[Landroidx/constraintlayout/motion/widget/MotionLayout$l;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->b:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    const-string v1, "SETUP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->c:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    const-string v1, "MOVING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->d:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    new-instance v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->e:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    invoke-static {}, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->a()[Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    move-result-object v0

    sput-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->f:[Landroidx/constraintlayout/motion/widget/MotionLayout$l;

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

.method public static synthetic a()[Landroidx/constraintlayout/motion/widget/MotionLayout$l;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    const/4 v1, 0x0

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->b:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->c:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->d:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->e:Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/constraintlayout/motion/widget/MotionLayout$l;
    .locals 1

    const-class v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    return-object p0
.end method

.method public static values()[Landroidx/constraintlayout/motion/widget/MotionLayout$l;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/motion/widget/MotionLayout$l;->f:[Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    invoke-virtual {v0}, [Landroidx/constraintlayout/motion/widget/MotionLayout$l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/constraintlayout/motion/widget/MotionLayout$l;

    return-object v0
.end method
