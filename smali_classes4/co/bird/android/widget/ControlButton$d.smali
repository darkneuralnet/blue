.class public final enum Lco/bird/android/widget/ControlButton$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/ControlButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/ControlButton$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/widget/ControlButton$d;",
        "",
        "",
        "b",
        "I",
        "()I",
        "resId",
        "<init>",
        "(Ljava/lang/String;II)V",
        "c",
        "d",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lco/bird/android/widget/ControlButton$d;

.field public static final enum d:Lco/bird/android/widget/ControlButton$d;

.field public static final synthetic e:[Lco/bird/android/widget/ControlButton$d;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/widget/ControlButton$d;

    const/4 v1, 0x0

    sget v2, LHg4;->control_background_circle:I

    const-string v3, "CIRCLE"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/widget/ControlButton$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/widget/ControlButton$d;->c:Lco/bird/android/widget/ControlButton$d;

    new-instance v0, Lco/bird/android/widget/ControlButton$d;

    const/4 v1, 0x1

    sget v2, LHg4;->control_background_pill:I

    const-string v3, "PILL"

    invoke-direct {v0, v3, v1, v2}, Lco/bird/android/widget/ControlButton$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lco/bird/android/widget/ControlButton$d;->d:Lco/bird/android/widget/ControlButton$d;

    invoke-static {}, Lco/bird/android/widget/ControlButton$d;->a()[Lco/bird/android/widget/ControlButton$d;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/ControlButton$d;->e:[Lco/bird/android/widget/ControlButton$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/widget/ControlButton$d;->b:I

    return-void
.end method

.method public static final synthetic a()[Lco/bird/android/widget/ControlButton$d;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/widget/ControlButton$d;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/ControlButton$d;->c:Lco/bird/android/widget/ControlButton$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/ControlButton$d;->d:Lco/bird/android/widget/ControlButton$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/ControlButton$d;
    .locals 1

    const-class v0, Lco/bird/android/widget/ControlButton$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/ControlButton$d;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/ControlButton$d;
    .locals 1

    sget-object v0, Lco/bird/android/widget/ControlButton$d;->e:[Lco/bird/android/widget/ControlButton$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/ControlButton$d;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lco/bird/android/widget/ControlButton$d;->b:I

    return v0
.end method
