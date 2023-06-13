.class public final enum Lco/bird/android/widget/CameraxView$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/CameraxView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/CameraxView$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/CameraxView$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\u0008\u0003j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/widget/CameraxView$c;",
        "",
        "Lic0;",
        "b",
        "<init>",
        "(Ljava/lang/String;I)V",
        "c",
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
.field public static final enum b:Lco/bird/android/widget/CameraxView$c;

.field public static final enum c:Lco/bird/android/widget/CameraxView$c;

.field public static final synthetic d:[Lco/bird/android/widget/CameraxView$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/widget/CameraxView$c;

    const-string v1, "FRONT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$c;->b:Lco/bird/android/widget/CameraxView$c;

    new-instance v0, Lco/bird/android/widget/CameraxView$c;

    const-string v1, "BACK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$c;->c:Lco/bird/android/widget/CameraxView$c;

    invoke-static {}, Lco/bird/android/widget/CameraxView$c;->a()[Lco/bird/android/widget/CameraxView$c;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/CameraxView$c;->d:[Lco/bird/android/widget/CameraxView$c;

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

.method public static final synthetic a()[Lco/bird/android/widget/CameraxView$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/widget/CameraxView$c;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/CameraxView$c;->b:Lco/bird/android/widget/CameraxView$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/CameraxView$c;->c:Lco/bird/android/widget/CameraxView$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/CameraxView$c;
    .locals 1

    const-class v0, Lco/bird/android/widget/CameraxView$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/CameraxView$c;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/CameraxView$c;
    .locals 1

    sget-object v0, Lco/bird/android/widget/CameraxView$c;->d:[Lco/bird/android/widget/CameraxView$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/CameraxView$c;

    return-object v0
.end method


# virtual methods
.method public final b()Lic0;
    .locals 2

    sget-object v0, Lco/bird/android/widget/CameraxView$c$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lic0;->c:Lic0;

    const-string v1, "DEFAULT_BACK_CAMERA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lic0;->b:Lic0;

    const-string v1, "DEFAULT_FRONT_CAMERA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method
