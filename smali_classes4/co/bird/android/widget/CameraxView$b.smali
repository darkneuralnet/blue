.class public final enum Lco/bird/android/widget/CameraxView$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/widget/CameraxView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/CameraxView$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/widget/CameraxView$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\u0008\u0003j\u0002\u0008\u0005j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/widget/CameraxView$b;",
        "",
        "",
        "b",
        "",
        "c",
        "<init>",
        "(Ljava/lang/String;I)V",
        "d",
        "e",
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
.field public static final enum b:Lco/bird/android/widget/CameraxView$b;

.field public static final enum c:Lco/bird/android/widget/CameraxView$b;

.field public static final enum d:Lco/bird/android/widget/CameraxView$b;

.field public static final enum e:Lco/bird/android/widget/CameraxView$b;

.field public static final synthetic f:[Lco/bird/android/widget/CameraxView$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/widget/CameraxView$b;

    const-string v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lco/bird/android/widget/CameraxView$b;

    const-string v1, "ON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$b;->c:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lco/bird/android/widget/CameraxView$b;

    const-string v1, "AUTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$b;->d:Lco/bird/android/widget/CameraxView$b;

    new-instance v0, Lco/bird/android/widget/CameraxView$b;

    const-string v1, "TORCH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/widget/CameraxView$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/widget/CameraxView$b;->e:Lco/bird/android/widget/CameraxView$b;

    invoke-static {}, Lco/bird/android/widget/CameraxView$b;->a()[Lco/bird/android/widget/CameraxView$b;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/CameraxView$b;->f:[Lco/bird/android/widget/CameraxView$b;

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

.method public static final synthetic a()[Lco/bird/android/widget/CameraxView$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/widget/CameraxView$b;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/widget/CameraxView$b;->b:Lco/bird/android/widget/CameraxView$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/widget/CameraxView$b;->c:Lco/bird/android/widget/CameraxView$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/widget/CameraxView$b;->d:Lco/bird/android/widget/CameraxView$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/widget/CameraxView$b;->e:Lco/bird/android/widget/CameraxView$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/widget/CameraxView$b;
    .locals 1

    const-class v0, Lco/bird/android/widget/CameraxView$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/widget/CameraxView$b;

    return-object p0
.end method

.method public static values()[Lco/bird/android/widget/CameraxView$b;
    .locals 1

    sget-object v0, Lco/bird/android/widget/CameraxView$b;->f:[Lco/bird/android/widget/CameraxView$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/widget/CameraxView$b;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 3

    sget-object v0, Lco/bird/android/widget/CameraxView$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v2

    :cond_3
    :goto_1
    return v1
.end method

.method public final c()Z
    .locals 2

    sget-object v0, Lco/bird/android/widget/CameraxView$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
